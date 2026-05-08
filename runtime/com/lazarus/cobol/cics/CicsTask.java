package com.lazarus.cobol.cics;

import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import com.lazarus.cobol.env.SlabArenaPool;

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

    // Transaction (Logical Unit of Work)
    private CicsTransaction transaction;

    // Browse state — last key read by READNEXT/READPREV
    private String lastBrowseKey;

    // GETMAIN storage areas
    private final Map<String, byte[]> getmainStorage = new HashMap<>();

    // Track last-read key per dataset (for REWRITE/DELETE without RIDFLD)
    private final Map<String, String> lastReadKeys = new HashMap<>();

    // HANDLE AID — AID key -> paragraph label
    private final Map<Integer, String> aidHandlers = new HashMap<>();

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
        _sap("LINK", programName, channel);
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
        _sap("XCTL", programName, channel);
        throw new XctlException(programName, xctlCommarea, channel);
    }

    /** EXEC CICS START — asynchronous program execution */
    public void start(String transid, byte[] fromData, int delaySeconds, String termid, String reqid) {
        _sap("START", transid, termid);
        eib.clearResponse();
        region.startTransaction(transid, fromData, delaySeconds, termid, reqid);
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    /** EXEC CICS RETURN — end current program */
    public void returnControl(String transid, byte[] returnCommarea, boolean immediate) {
        _sap("RETURN", transid, null);
        throw new ReturnException(transid, returnCommarea, immediate);
    }

    /** EXEC CICS ABEND — abnormally terminate task */
    public void abend(String abcode, boolean dump, boolean cancel) {
        _sap("ABEND", abcode, null);
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

    // --- Transaction ---

    public void setTransaction(CicsTransaction txn) { this.transaction = txn; }
    public CicsTransaction getTransaction() { return transaction; }

    // --- CICS File I/O Convenience (sets EIB RESP automatically) ---

    /** EXEC CICS READ DATASET(name) RIDFLD(key) [GENERIC] */
    public String cicsRead(String dataset, String key, boolean generic) {
        _sap("READ", dataset, key);
        eib.clearResponse();
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf == null) {
            eib.setResponse(CicsEIB.RESP_NOTOPEN, 0);
            return null;
        }
        try {
            String data = generic ? vf.readGeneric(key) : vf.read(key);
            if (data != null) {
                lastReadKeys.put(dataset.toUpperCase(), key);
                eib.setResponse(CicsEIB.RESP_NORMAL, 0);
            } else {
                eib.setResponse(CicsEIB.RESP_NOTFND, 0);
            }
            return data;
        } catch (SQLException e) {
            eib.setResponse(CicsEIB.RESP_IOERR, 0);
            return null;
        }
    }

    /** EXEC CICS WRITE DATASET(name) FROM(data) RIDFLD(key) */
    public void cicsWrite(String dataset, String key, String data) {
        _sap("WRITE", dataset, key);
        eib.clearResponse();
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf == null) {
            eib.setResponse(CicsEIB.RESP_NOTOPEN, 0);
            return;
        }
        try {
            int resp = vf.write(key, data);
            eib.setResponse(resp, 0);
        } catch (SQLException e) {
            eib.setResponse(CicsEIB.RESP_IOERR, 0);
        }
    }

    /** EXEC CICS REWRITE DATASET(name) FROM(data) — key from RIDFLD or last READ */
    public void cicsRewrite(String dataset, String key, String data) {
        _sap("REWRITE", dataset, key);
        eib.clearResponse();
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf == null) {
            eib.setResponse(CicsEIB.RESP_NOTOPEN, 0);
            return;
        }
        if (key == null || key.isEmpty()) {
            key = lastReadKeys.get(dataset.toUpperCase());
        }
        if (key == null) {
            eib.setResponse(CicsEIB.RESP_INVREQ, 0);
            return;
        }
        try {
            int resp = vf.rewrite(key, data);
            eib.setResponse(resp, 0);
        } catch (SQLException e) {
            eib.setResponse(CicsEIB.RESP_IOERR, 0);
        }
    }

    /** EXEC CICS DELETE DATASET(name) RIDFLD(key) — key from RIDFLD or last READ */
    public void cicsDelete(String dataset, String key) {
        _sap("DELETE", dataset, key);
        eib.clearResponse();
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf == null) {
            eib.setResponse(CicsEIB.RESP_NOTOPEN, 0);
            return;
        }
        if (key == null || key.isEmpty()) {
            key = lastReadKeys.get(dataset.toUpperCase());
        }
        if (key == null) {
            eib.setResponse(CicsEIB.RESP_INVREQ, 0);
            return;
        }
        try {
            int resp = vf.delete(key);
            eib.setResponse(resp, 0);
        } catch (SQLException e) {
            eib.setResponse(CicsEIB.RESP_IOERR, 0);
        }
    }

    /** EXEC CICS STARTBR DATASET(name) RIDFLD(key) [GENERIC] */
    public void cicsStartBrowse(String dataset, String key, boolean generic) {
        _sap("STARTBR", dataset, key);
        eib.clearResponse();
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf == null) {
            eib.setResponse(CicsEIB.RESP_NOTOPEN, 0);
            return;
        }
        try {
            int resp = vf.startBrowse(key, generic);
            eib.setResponse(resp, 0);
        } catch (SQLException e) {
            eib.setResponse(CicsEIB.RESP_IOERR, 0);
        }
    }

    /** EXEC CICS READNEXT — returns record data, updates lastBrowseKey */
    public String cicsReadNext(String dataset) {
        _sap("READNEXT", dataset, null);
        eib.clearResponse();
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf == null) {
            eib.setResponse(CicsEIB.RESP_NOTOPEN, 0);
            return null;
        }
        try {
            CicsVsamFile.BrowseResult br = vf.readNext();
            if (br != null) {
                lastBrowseKey = br.key;
                eib.setResponse(CicsEIB.RESP_NORMAL, 0);
                return br.data;
            }
            eib.setResponse(CicsEIB.RESP_ENDFILE, 0);
            return null;
        } catch (SQLException e) {
            eib.setResponse(CicsEIB.RESP_IOERR, 0);
            return null;
        }
    }

    /** EXEC CICS READPREV — returns record data, updates lastBrowseKey */
    public String cicsReadPrev(String dataset) {
        _sap("READPREV", dataset, null);
        eib.clearResponse();
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf == null) {
            eib.setResponse(CicsEIB.RESP_NOTOPEN, 0);
            return null;
        }
        try {
            CicsVsamFile.BrowseResult br = vf.readPrev();
            if (br != null) {
                lastBrowseKey = br.key;
                eib.setResponse(CicsEIB.RESP_NORMAL, 0);
                return br.data;
            }
            eib.setResponse(CicsEIB.RESP_ENDFILE, 0);
            return null;
        } catch (SQLException e) {
            eib.setResponse(CicsEIB.RESP_IOERR, 0);
            return null;
        }
    }

    /** EXEC CICS ENDBR */
    public void cicsEndBrowse(String dataset) {
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf != null) {
            try {
                vf.endBrowse();
            } catch (SQLException e) {
                // Ignore on endbr
            }
        }
    }

    /** EXEC CICS RESETBR */
    public void cicsResetBrowse(String dataset, String key, boolean generic) {
        eib.clearResponse();
        CicsVsamFile vf = region.getVsamFile(dataset);
        if (vf == null) {
            eib.setResponse(CicsEIB.RESP_NOTOPEN, 0);
            return;
        }
        try {
            int resp = vf.resetBrowse(key, generic);
            eib.setResponse(resp, 0);
        } catch (SQLException e) {
            eib.setResponse(CicsEIB.RESP_IOERR, 0);
        }
    }

    /** Get the key from the last READNEXT/READPREV */
    public String getLastBrowseKey() { return lastBrowseKey; }

    // --- CICS TSQ Convenience ---

    /** EXEC CICS WRITEQ TS */
    public int cicsTsWrite(String queue, String data, int item, boolean rewrite) {
        _sap("WRITEQ_TS", queue, String.valueOf(item));
        eib.clearResponse();
        CicsTSQueue tsq = region.getTsQueue(queue, true);
        int itemNum = tsq.writeItem(data.getBytes(), item, rewrite);
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
        return itemNum;
    }

    /** EXEC CICS READQ TS */
    public String cicsTsRead(String queue, int item) {
        _sap("READQ_TS", queue, String.valueOf(item));
        eib.clearResponse();
        CicsTSQueue tsq = region.getTsQueue(queue, false);
        if (tsq == null) {
            eib.setResponse(CicsEIB.RESP_QIDERR, 0);
            return null;
        }
        byte[] data = tsq.readItem(item);
        if (data != null) {
            eib.setResponse(CicsEIB.RESP_NORMAL, 0);
            return new String(data);
        }
        eib.setResponse(CicsEIB.RESP_ITEMERR, 0);
        return null;
    }

    /** EXEC CICS DELETEQ TS */
    public void cicsTsDelete(String queue) {
        _sap("DELETEQ_TS", queue, null);
        eib.clearResponse();
        region.deleteTsQueue(queue);
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    // --- CICS TDQ Convenience ---

    /** EXEC CICS WRITEQ TD */
    public void cicsTdWrite(String queue, String data) {
        _sap("WRITEQ_TD", queue, null);
        eib.clearResponse();
        CicsTDQueue tdq = region.getTdQueue(queue, true);
        tdq.writeItem(data.getBytes());
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    /** EXEC CICS READQ TD */
    public String cicsTdRead(String queue) {
        _sap("READQ_TD", queue, null);
        eib.clearResponse();
        CicsTDQueue tdq = region.getTdQueue(queue, false);
        if (tdq == null) {
            eib.setResponse(CicsEIB.RESP_QIDERR, 0);
            return null;
        }
        byte[] data = tdq.readItem();
        if (data != null) {
            eib.setResponse(CicsEIB.RESP_NORMAL, 0);
            return new String(data);
        }
        eib.setResponse(CicsEIB.RESP_QIDERR, 0);
        return null;
    }

    /** EXEC CICS DELETEQ TD */
    public void cicsTdDelete(String queue) {
        eib.clearResponse();
        region.deleteTdQueue(queue);
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    // --- CICS Transaction Control ---

    /** EXEC CICS SYNCPOINT */
    public void cicsSyncpoint() {
        _sap("SYNCPOINT", null, null);
        eib.clearResponse();
        if (transaction != null) {
            try {
                transaction.syncpoint();
            } catch (SQLException e) {
                eib.setResponse(CicsEIB.RESP_IOERR, 0);
                return;
            }
        }
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    /** EXEC CICS SYNCPOINT ROLLBACK */
    public void cicsRollback() {
        _sap("ROLLBACK", null, null);
        eib.clearResponse();
        if (transaction != null) {
            try {
                transaction.rollback();
            } catch (SQLException e) {
                eib.setResponse(CicsEIB.RESP_IOERR, 0);
                return;
            }
        }
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    // --- GETMAIN / FREEMAIN ---

    /** EXEC CICS GETMAIN SET(ptr) LENGTH(len) */
    public byte[] cicsGetmain(String name, int length) {
        byte[] area = new byte[length];
        getmainStorage.put(name, area);
        eib.clearResponse();
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
        return area;
    }

    /** EXEC CICS FREEMAIN DATA(ptr) */
    public void cicsFreemain(String name) {
        getmainStorage.remove(name);
        eib.clearResponse();
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    // --- ENQ / DEQ ---

    /** EXEC CICS ENQ RESOURCE(name) */
    public void cicsEnqueue(String resource) {
        _sap("ENQ", resource, null);
        eib.clearResponse();
        boolean acquired = region.enqueue(resource);
        eib.setResponse(acquired ? CicsEIB.RESP_NORMAL : CicsEIB.RESP_INVREQ, 0);
    }

    /** EXEC CICS DEQ RESOURCE(name) */
    public void cicsDequeue(String resource) {
        _sap("DEQ", resource, null);
        eib.clearResponse();
        region.dequeue(resource);
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    // --- DELAY ---

    /** EXEC CICS DELAY INTERVAL(hhmmss) or FOR SECONDS(n) */
    public void cicsDelay(int milliseconds) {
        eib.clearResponse();
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
    }

    // --- HANDLE AID ---

    /** EXEC CICS HANDLE AID key(label) */
    public void handleAid(int aidKey, String label) {
        aidHandlers.put(aidKey, label);
    }

    /** Look up AID handler */
    public String findAidHandler(int aidKey) {
        return aidHandlers.get(aidKey);
    }

    // --- ASSIGN ---

    /** EXEC CICS ASSIGN — return system field values */
    public String cicsAssign(String field) {
        eib.clearResponse();
        eib.setResponse(CicsEIB.RESP_NORMAL, 0);
        switch (field.toUpperCase()) {
            case "SYSID":  return "CICS";
            case "USERID": return "CICSUSER";
            case "APPLID": return "CICSAPPL";
            case "FACILITY": return eib.eibtrmid;
            default: return "";
        }
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

    // --- Resource reclamation tracking ---
    private void _sap(String op, String ds, String key) {
        try { SlabArenaPool.record(op, ds, key, eib.eibtrnid + ":" + taskNumber); } catch (Exception e) { /* non-critical */ }
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
