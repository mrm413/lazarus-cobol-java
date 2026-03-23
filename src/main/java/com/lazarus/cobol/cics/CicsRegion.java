package com.lazarus.cobol.cics;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * CICS Region — the top-level container that manages programs, transactions,
 * resources (TSQs, TDQs, VSAM files), and task lifecycle.
 *
 * In mainframe CICS, the "region" is the address space that hosts online
 * transaction processing. This class is the Java equivalent.
 */
public class CicsRegion {

    // Program registry: program name -> factory that creates a runnable instance
    private final Map<String, Supplier<Runnable>> programRegistry = new ConcurrentHashMap<>();

    // Transaction-to-program mapping: TRANSID -> program name
    private final Map<String, String> transidMap = new ConcurrentHashMap<>();

    // Resource pools
    private final Map<String, CicsTSQueue> tsQueues = new ConcurrentHashMap<>();
    private final Map<String, CicsTDQueue> tdQueues = new ConcurrentHashMap<>();
    private final Map<String, CicsMap> maps = new ConcurrentHashMap<>();

    // Task numbering
    private final AtomicInteger taskCounter = new AtomicInteger(1);

    // Async executor for START command
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

    // Current task (thread-local for concurrent task support)
    private final ThreadLocal<CicsTask> currentTask = new ThreadLocal<>();

    // --- Program Registry ---

    /** Register a program by name with a factory */
    public void registerProgram(String name, Supplier<Runnable> factory) {
        programRegistry.put(name.toUpperCase().trim(), factory);
    }

    /** Register a TRANSID -> program mapping */
    public void registerTransaction(String transid, String programName) {
        transidMap.put(transid.toUpperCase().trim(), programName.toUpperCase().trim());
    }

    /** Look up a program by name, create an instance */
    public Runnable getProgram(String name) {
        Supplier<Runnable> factory = programRegistry.get(name.toUpperCase().trim());
        return (factory != null) ? factory.get() : null;
    }

    /** Look up program name for a transaction ID */
    public String getProgramForTransid(String transid) {
        return transidMap.get(transid.toUpperCase().trim());
    }

    // --- Task Lifecycle ---

    /** Create and start a new task */
    public CicsTask createTask(String transid, String termid, byte[] commarea) {
        int taskNum = taskCounter.getAndIncrement();
        CicsTask task = new CicsTask(this, taskNum, transid, termid, commarea);
        currentTask.set(task);
        return task;
    }

    /** Get the current task for this thread */
    public CicsTask getCurrentTask() {
        return currentTask.get();
    }

    /**
     * Run a program as a CICS task.
     * Handles XCTL chain, RETURN, and ABEND.
     */
    public void runTask(String transid, String termid, byte[] commarea) {
        CicsTask task = createTask(transid, termid, commarea);
        String programName = getProgramForTransid(transid);
        if (programName == null) {
            System.err.println("CICS: No program for TRANSID " + transid);
            return;
        }

        try {
            runProgram(task, programName);
        } catch (ReturnException re) {
            // Normal task end — RETURN with possible TRANSID for next interaction
            if (re.getTransid() != null) {
                // Store for next pseudo-conversational iteration
                task.setCommarea(re.getCommarea());
            }
        } catch (AbendException ae) {
            handleAbend(task, ae);
        } finally {
            task.cleanup();
            currentTask.remove();
        }
    }

    /**
     * Run a program, handling XCTL chains.
     * If the program does XCTL, catch the exception and run the target program.
     */
    private void runProgram(CicsTask task, String programName) {
        while (programName != null) {
            Runnable program = getProgram(programName);
            if (program == null) {
                task.getEib().setResponse(CicsEIB.RESP_PGMIDERR, 0);
                throw new AbendException("APCT", true, false);
            }
            try {
                CicsTask.setCurrentTask(task); // Make task available to generated programs
                program.run();
                return; // Normal completion
            } catch (XctlException xe) {
                // Transfer control — loop to run the target program
                programName = xe.getProgramName();
                if (xe.getCommarea() != null) {
                    task.setCommarea(xe.getCommarea());
                }
            }
        }
    }

    /** Handle an ABEND — invoke handler or produce dump */
    private void handleAbend(CicsTask task, AbendException ae) {
        CicsTask.AbendHandler handler = task.getAbendHandler();
        if (handler != null && !ae.isCancel()) {
            switch (handler.type) {
                case LABEL:
                    // In a full implementation, this would invoke the labeled paragraph
                    System.err.println("CICS ABEND " + ae.getAbcode() +
                        " — handler LABEL(" + handler.target + ") invoked");
                    break;
                case PROGRAM:
                    try {
                        Runnable pgm = getProgram(handler.target);
                        if (pgm != null) pgm.run();
                    } catch (Exception e) {
                        System.err.println("CICS ABEND handler program failed: " + e.getMessage());
                    }
                    break;
                case CANCEL:
                    break;
            }
        }
        if (ae.isDump()) {
            produceDump(task, ae);
        }
    }

    /** Produce a transaction dump (stack trace + CICS context) */
    private void produceDump(CicsTask task, AbendException ae) {
        System.err.println("=== CICS TRANSACTION DUMP ===");
        System.err.println("ABCODE: " + ae.getAbcode());
        System.err.println("TASK:   " + task.getTaskNumber());
        System.err.println("TRANID: " + task.getEib().eibtrnid);
        System.err.println("TERMID: " + task.getEib().eibtrmid);
        System.err.println("RESP:   " + task.getEib().eibresp);
        System.err.println("RESP2:  " + task.getEib().eibresp2);
        System.err.println("--- Stack Trace ---");
        ae.printStackTrace(System.err);
        System.err.println("=== END DUMP ===");
    }

    // --- START command (async) ---

    /** Start a transaction asynchronously */
    public void startTransaction(String transid, byte[] fromData, int delaySeconds,
                                  String termid, String reqid) {
        Runnable task = () -> runTask(transid, termid != null ? termid : "ASYN", fromData);
        if (delaySeconds <= 0) {
            scheduler.execute(task);
        } else {
            scheduler.schedule(task, delaySeconds, TimeUnit.SECONDS);
        }
    }

    // --- TSQ Management ---

    /** Get or create a TSQ */
    public CicsTSQueue getTsQueue(String name, boolean createIfMissing) {
        if (createIfMissing) {
            return tsQueues.computeIfAbsent(name.toUpperCase().trim(),
                k -> new CicsTSQueue(k, false));
        }
        return tsQueues.get(name.toUpperCase().trim());
    }

    /** Delete a TSQ */
    public void deleteTsQueue(String name) {
        CicsTSQueue q = tsQueues.remove(name.toUpperCase().trim());
        if (q != null) q.deleteAll();
    }

    // --- TDQ Management ---

    /** Get or create a TDQ */
    public CicsTDQueue getTdQueue(String name, boolean createIfMissing) {
        if (createIfMissing) {
            return tdQueues.computeIfAbsent(name.toUpperCase().trim(),
                k -> new CicsTDQueue(k, true));
        }
        return tdQueues.get(name.toUpperCase().trim());
    }

    /** Delete a TDQ */
    public void deleteTdQueue(String name) {
        CicsTDQueue q = tdQueues.remove(name.toUpperCase().trim());
        if (q != null) q.deleteAll();
    }

    // --- Map Management ---

    /** Register a BMS map */
    public void registerMap(CicsMap map) {
        String key = (map.getMapsetName() + "." + map.getMapName()).toUpperCase();
        maps.put(key, map);
    }

    /** Get a map by mapset.map name */
    public CicsMap getMap(String mapsetName, String mapName) {
        String key = (mapsetName + "." + mapName).toUpperCase();
        return maps.get(key);
    }

    // --- Shutdown ---

    /** Shut down the region (clean up resources, stop scheduler) */
    public void shutdown() {
        scheduler.shutdown();
        try {
            scheduler.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            scheduler.shutdownNow();
        }
        tsQueues.clear();
        tdQueues.clear();
    }
}
