package com.lazarus.cobol.cics;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * CICS Task — per-transaction execution context.
 * Each user interaction (pressing ENTER, a PF key, etc.) creates a new task.
 * The task holds the EIB, COMMAREA, condition handler stack, and references
 * to shared resources (TSQs, TDQs, VSAM files) via the owning CicsRegion.
 */
public class CicsTask {
    // ThreadLocal allows generated CICS programs to get their task without constructor injection
    private static final ThreadLocal<CicsTask> CURRENT = new ThreadLocal<>();

    public static CicsTask currentTask() { return CURRENT.get(); }
    public static void setCurrentTask(CicsTask task) { CURRENT.set(task); }

    private final CicsRegion region;
    private final CicsEIB eib;
    private final int taskNumber;
    private byte[] commarea;

    // Condition handler stack: condition name -> handler label (paragraph name)
    private final Deque<Map<String, String>> conditionHandlerStack = new ArrayDeque<>();
    // Abend handler stack: label or program name
    private final Deque<AbendHandler> abendHandlerStack = new ArrayDeque<>();

    // Session-scoped TSQs (MAIN storage — deleted when task/session ends)
    private final Set<String> sessionTsQueues = new HashSet<>();

    // Channels and containers for modern data passing
    private final Map<String, Map<String, byte[]>> channels = new ConcurrentHashMap<>();

    static class AbendHandler {
        enum Type { LABEL, PROGRAM, CANCEL }
        final Type type;
        final String target; // paragraph label or program name
        AbendHandler(Type type, String target) {
            this.type = type;
            this.target = target;
        }
    }

    public CicsTask(CicsRegion region, int taskNumber, String transid, String termid, byte[] commarea) {
        this.region = region;
        this.taskNumber = taskNumber;
        this.eib = new CicsEIB();
        this.commarea = commarea;

        // Initialize EIB
        eib.eibtaskn = taskNumber;
        eib.eibtrnid = padRight(transid, 4);
        eib.eibtrmid = padRight(termid, 4);
        eib.eibcalen = (commarea != null) ? commarea.length : 0;
        eib.refreshDateTime();

        // Push initial empty handler frame
        conditionHandlerStack.push(new HashMap<>());
    }

    // --- Accessors ---
    public CicsEIB getEib() { return eib; }
    public CicsRegion getRegion() { return region; }
    public byte[] getCommarea() { return commarea; }
    public void setCommarea(byte[] commarea) {
        this.commarea = commarea;
        this.eib.eibcalen = (commarea != null) ? commarea.length : 0;
    }
    public int getTaskNumber() { return taskNumber; }

    // --- Program Control ---

    /** EXEC CICS LINK — synchronous call, callee returns to caller */
    public void link(String programName, byte[] linkCommarea, String channel) {
        eib.clearResponse();
        try {
            Runnable program = region.getProgram(programName);
            if (program == null) {
                eib.setResponse(CicsEIB.RESP_PGMIDERR, 0);
                throw new CicsCondition(CicsEIB.RESP_PGMIDERR, 0, "PGMIDERR");
            }
            // Save and set COMMAREA for the linked program
            byte[] savedCommarea = this.commarea;
            int savedCalen = this.eib.eibcalen;
            if (linkCommarea != null) {
                this.commarea = linkCommarea;
                this.eib.eibcalen = linkCommarea.length;
            }
            // Push new handler frames
            conditionHandlerStack.push(new HashMap<>());

            try {
                program.run();
            } catch (ReturnException re) {
                // Normal return from linked program
            } finally {
                // Pop handler frames, restore COMMAREA
                conditionHandlerStack.pop();
                // Copy back modified COMMAREA if same reference
                if (linkCommarea != null && this.commarea != null) {
                    System.arraycopy(this.commarea, 0, linkCommarea, 0,
                        Math.min(this.commarea.length, linkCommarea.length));
                }
                this.commarea = savedCommarea;
                this.eib.eibcalen = savedCalen;
            }
            eib.setResponse(CicsEIB.RESP_NORMAL, 0);
        } catch (CicsCondition cc) {
            throw cc;
        } catch (XctlException xe) {
            // XCTL from a LINKed program — the linked program transferred
            // control elsewhere. From the caller's perspective, this is normal.
            eib.setResponse(CicsEIB.RESP_NORMAL, 0);
        }
    }

    /** EXEC CICS XCTL — transfer control, caller does NOT resume */
    public void xctl(String programName, byte[] xctlCommarea, String channel) {
        throw new XctlException(programName, xctlCommarea, channel);
    }

    /** EXEC CICS START — asynchronous program execution */
    public void start(String transid, byte[] fromData, int delaySeconds, String termid, String reqid) {
        eib.clearResponse();
        region.startTransaction(transid, fromData, delaySeconds, termid, reqid);
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    /** EXEC CICS RETURN — end current program */
    public void returnControl(String transid, byte[] returnCommarea, boolean immediate) {
        throw new ReturnException(transid, returnCommarea, immediate);
    }

    /** EXEC CICS ABEND — abnormally terminate task */
    public void abend(String abcode, boolean dump, boolean cancel) {
        throw new AbendException(abcode != null ? abcode : "????", dump, cancel);
    }

    // --- Condition Handling ---

    /** EXEC CICS HANDLE CONDITION condition(label) */
    public void handleCondition(String condition, String label) {
        conditionHandlerStack.peek().put(condition.toUpperCase(), label);
    }

    /** Remove a condition handler */
    public void ignoreCondition(String condition) {
        conditionHandlerStack.peek().remove(condition.toUpperCase());
    }

    /** EXEC CICS PUSH HANDLE */
    public void pushHandle() {
        conditionHandlerStack.push(new HashMap<>(conditionHandlerStack.peek()));
    }

    /** EXEC CICS POP HANDLE */
    public void popHandle() {
        if (conditionHandlerStack.size() > 1) {
            conditionHandlerStack.pop();
        }
    }

    /** Look up handler for a condition. Returns label or null. */
    public String findConditionHandler(String condition) {
        return conditionHandlerStack.peek().get(condition.toUpperCase());
    }

    // --- Abend Handling ---

    /** EXEC CICS HANDLE ABEND LABEL(para) */
    public void handleAbendLabel(String label) {
        abendHandlerStack.push(new AbendHandler(AbendHandler.Type.LABEL, label));
    }

    /** EXEC CICS HANDLE ABEND PROGRAM(pgm) */
    public void handleAbendProgram(String programName) {
        abendHandlerStack.push(new AbendHandler(AbendHandler.Type.PROGRAM, programName));
    }

    /** EXEC CICS HANDLE ABEND CANCEL */
    public void handleAbendCancel() {
        if (!abendHandlerStack.isEmpty()) {
            abendHandlerStack.pop();
        }
    }

    /** Get the current abend handler, or null if none. */
    public AbendHandler getAbendHandler() {
        return abendHandlerStack.isEmpty() ? null : abendHandlerStack.peek();
    }

    // --- ASKTIME / FORMATTIME ---

    /** EXEC CICS ASKTIME — refresh EIB date/time */
    public void asktime() {
        eib.refreshDateTime();
    }

    /** EXEC CICS FORMATTIME — convert ABSTIME to formatted fields */
    public String formatTime(long abstime, String format) {
        // Simplified: use EIB time
        int hh = eib.eibtime / 10000;
        int mm = (eib.eibtime / 100) % 100;
        int ss = eib.eibtime % 100;
        if ("HHMMSS".equalsIgnoreCase(format)) {
            return String.format("%02d%02d%02d", hh, mm, ss);
        }
        if ("TIME".equalsIgnoreCase(format)) {
            return String.format("%02d:%02d:%02d", hh, mm, ss);
        }
        return String.valueOf(eib.eibtime);
    }

    // --- Channel/Container Support ---

    /** Put data into a container within a channel */
    public void putContainer(String container, String channel, byte[] data) {
        channels.computeIfAbsent(channel, k -> new ConcurrentHashMap<>()).put(container, data);
    }

    /** Get data from a container within a channel */
    public byte[] getContainer(String container, String channel) {
        Map<String, byte[]> ch = channels.get(channel);
        return (ch != null) ? ch.get(container) : null;
    }

    /** Delete a container */
    public void deleteContainer(String container, String channel) {
        Map<String, byte[]> ch = channels.get(channel);
        if (ch != null) ch.remove(container);
    }

    // --- Session TSQ tracking ---

    public void trackSessionTsQueue(String queueName) {
        sessionTsQueues.add(queueName);
    }

    /** Clean up session-scoped resources when task ends */
    public void cleanup() {
        for (String qname : sessionTsQueues) {
            region.deleteTsQueue(qname);
        }
        sessionTsQueues.clear();
    }

    // --- Utility ---
    private static String padRight(String s, int len) {
        if (s == null) s = "";
        if (s.length() >= len) return s.substring(0, len);
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < len) sb.append(' ');
        return sb.toString();
    }
}
