package com.lazarus.cobol.ims;

import java.util.*;

/**
 * IMS PSB (Program Specification Block) — collection of PCBs for a program.
 *
 * A PSB defines what databases and message queues a program can access.
 * It contains one or more PCBs:
 *   - IO PCB (always first): for message I/O
 *   - DB PCBs: one per database the program accesses
 *
 * In this library:
 *   ImsPSB psb = new ImsPSB("MYPROG");
 *   psb.addDbPcb("HOSPDB", database);
 *   ImsPCB ioPcb = psb.getIoPcb();
 *   ImsPCB dbPcb = psb.getDbPcb("HOSPDB");
 */
public class ImsPSB {

    private final String psbName;
    private final ImsPCB ioPcb;
    private final List<ImsPCB> dbPcbs = new ArrayList<>();
    private final Map<String, ImsPCB> dbPcbsByName = new LinkedHashMap<>();

    // Message queues for IO PCB
    private final LinkedList<String> inputMessages = new LinkedList<>();
    private final List<String> outputMessages = new ArrayList<>();

    public ImsPSB(String name) {
        this.psbName = name;
        this.ioPcb = new ImsPCB(ImsPCB.PCBType.IO, "IOPCB");
    }

    public String getPsbName() { return psbName; }
    public ImsPCB getIoPcb() { return ioPcb; }

    /** Add a DB PCB linked to a database */
    public ImsPCB addDbPcb(String pcbName, DliDatabase db) {
        ImsPCB pcb = new ImsPCB(ImsPCB.PCBType.DB, pcbName);
        pcb.setDatabase(db);
        dbPcbs.add(pcb);
        dbPcbsByName.put(pcbName.toUpperCase().trim(), pcb);
        return pcb;
    }

    /** Get a DB PCB by name */
    public ImsPCB getDbPcb(String name) {
        return dbPcbsByName.get(name.toUpperCase().trim());
    }

    /** Get DB PCB by index (0-based, among DB PCBs only) */
    public ImsPCB getDbPcb(int index) {
        if (index < 0 || index >= dbPcbs.size()) return null;
        return dbPcbs.get(index);
    }

    /** Get PCB by index (0 = IO PCB, 1+ = DB PCBs) */
    public ImsPCB getPcb(int index) {
        if (index == 0) return ioPcb;
        return getDbPcb(index - 1);
    }

    /** Number of PCBs (including IO PCB) */
    public int getPcbCount() { return 1 + dbPcbs.size(); }

    // --- Message I/O (via IO PCB) ---

    /** Queue an input message (simulates terminal input) */
    public void queueInput(String message) {
        inputMessages.addLast(message);
    }

    /** GU on IO PCB — get first input message */
    public String getInputMessage() {
        if (inputMessages.isEmpty()) {
            ioPcb.setStatusCode("QC"); // No more messages
            return null;
        }
        ioPcb.setStatusCode("  ");
        return inputMessages.removeFirst();
    }

    /** GN on IO PCB — get next segment of multi-segment message */
    public String getNextInputSegment() {
        // For simplicity, treat each message as single segment
        return getInputMessage();
    }

    /** ISRT on IO PCB — send output message */
    public void sendOutputMessage(String message) {
        outputMessages.add(message);
        ioPcb.setStatusCode("  ");
    }

    /** Get all output messages (for testing) */
    public List<String> getOutputMessages() {
        return Collections.unmodifiableList(outputMessages);
    }

    /** Clear output messages */
    public void clearOutput() { outputMessages.clear(); }

    // --- DL/I Call Dispatcher ---

    /**
     * Execute a DL/I call through the appropriate PCB.
     * This is the main entry point for translated COBOL CALL 'CBLTDLI'.
     *
     * @param function DL/I function code (GU, GN, GNP, GHU, GHN, ISRT, REPL, DLET)
     * @param pcb the PCB to use
     * @param ioArea I/O area (segment data for ISRT/REPL, receives data for GU/GN)
     * @param ssas Segment Search Arguments
     * @return the resulting segment (or null)
     */
    public DliSegment dliCall(String function, ImsPCB pcb, Map<String, String> ioArea, String... ssas) {
        if (pcb.getType() == ImsPCB.PCBType.IO) {
            return handleIoCall(function, ioArea);
        }

        DliDatabase db = pcb.getDatabase();
        if (db == null) {
            pcb.setStatusCode("AJ"); // PSB not available
            return null;
        }

        DliSegment result = null;
        String func = function.toUpperCase().trim();

        switch (func) {
            case "GU":
                result = db.getUnique(ssas);
                break;
            case "GHU":
                result = db.getHoldUnique(ssas);
                break;
            case "GN":
                result = db.getNext(ssas);
                break;
            case "GHN":
                result = db.getHoldNext(ssas);
                break;
            case "GNP":
                result = db.getNextWithinParent(ssas);
                break;
            case "GHNP":
                result = db.getHoldNextWithinParent(ssas);
                break;
            case "ISRT": {
                String segName = ssas.length > 0 ? ssas[ssas.length - 1].split("\\(")[0].trim() : "";
                DliSegment newSeg = new DliSegment(segName);
                if (ioArea != null) {
                    if (ioArea.containsKey("KEY")) newSeg.setKey(ioArea.get("KEY"));
                    newSeg.setData(ioArea);
                }
                boolean ok = db.insert(newSeg, ssas);
                result = ok ? newSeg : null;
                break;
            }
            case "REPL":
                if (ioArea != null) {
                    db.replace(ioArea);
                }
                break;
            case "DLET":
                db.delete();
                break;
        }

        pcb.updateAfterCall(result);
        return result;
    }

    /** Handle IO PCB calls (GU = get message, ISRT = send message) */
    private DliSegment handleIoCall(String function, Map<String, String> ioArea) {
        String func = function.toUpperCase().trim();
        switch (func) {
            case "GU": {
                String msg = getInputMessage();
                if (msg != null && ioArea != null) {
                    ioArea.put("MESSAGE", msg);
                }
                return null;
            }
            case "GN": {
                String msg = getNextInputSegment();
                if (msg != null && ioArea != null) {
                    ioArea.put("MESSAGE", msg);
                }
                return null;
            }
            case "ISRT": {
                String msg = ioArea != null ? ioArea.getOrDefault("MESSAGE", "") : "";
                sendOutputMessage(msg);
                return null;
            }
        }
        return null;
    }
}
