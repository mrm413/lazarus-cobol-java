package com.lazarus.cobol.ims;

/**
 * IMS PCB (Program Communication Block) — interface between program and IMS.
 *
 * Two types:
 *   - DB PCB: for database access (DL/I calls)
 *   - IO PCB: for message processing (GU/ISRT on message queues)
 *
 * PCB fields:
 *   - dbdName: Database Description name
 *   - segLevel: level of last accessed segment (1-15)
 *   - statusCode: 2-char status ("  ", "GE", "GB", "II", etc.)
 *   - procOptions: processing options (G=get, I=insert, R=replace, D=delete, A=all)
 *   - segName: name of last accessed segment
 *   - keyFeedback: concatenated key of current position
 */
public class ImsPCB {

    public enum PCBType { DB, IO }

    private final PCBType type;
    private final String pcbName;
    private String dbdName = "";
    private int segLevel = 0;
    private String statusCode = "  ";
    private String procOptions = "A";  // Default: all operations
    private String segName = "";
    private String keyFeedback = "";

    // For IO PCB
    private String lterm = "";         // Logical terminal name
    private String transactionName = "";
    private String userId = "";
    private long timestamp = 0;

    // Linked database
    private DliDatabase database;

    public ImsPCB(PCBType type, String name) {
        this.type = type;
        this.pcbName = name;
    }

    // --- Accessors ---
    public PCBType getType() { return type; }
    public String getPcbName() { return pcbName; }
    public String getDbdName() { return dbdName; }
    public void setDbdName(String name) { this.dbdName = name; }
    public int getSegLevel() { return segLevel; }
    public void setSegLevel(int level) { this.segLevel = level; }
    public String getStatusCode() { return statusCode; }
    public void setStatusCode(String code) { this.statusCode = code; }
    public String getProcOptions() { return procOptions; }
    public void setProcOptions(String opts) { this.procOptions = opts; }
    public String getSegName() { return segName; }
    public void setSegName(String name) { this.segName = name; }
    public String getKeyFeedback() { return keyFeedback; }
    public void setKeyFeedback(String key) { this.keyFeedback = key; }
    public String getLterm() { return lterm; }
    public void setLterm(String lt) { this.lterm = lt; }
    public String getTransactionName() { return transactionName; }
    public void setTransactionName(String tn) { this.transactionName = tn; }
    public String getUserId() { return userId; }
    public void setUserId(String uid) { this.userId = uid; }
    public DliDatabase getDatabase() { return database; }
    public void setDatabase(DliDatabase db) { this.database = db; this.dbdName = db.getDbdName(); }

    /** Check if operation is allowed */
    public boolean canGet() { return procOptions.contains("G") || procOptions.contains("A"); }
    public boolean canInsert() { return procOptions.contains("I") || procOptions.contains("A"); }
    public boolean canReplace() { return procOptions.contains("R") || procOptions.contains("A"); }
    public boolean canDelete() { return procOptions.contains("D") || procOptions.contains("A"); }

    /** Check status is OK */
    public boolean isOk() { return "  ".equals(statusCode); }
    public boolean isNotFound() { return "GE".equals(statusCode); }
    public boolean isEndOfDb() { return "GB".equals(statusCode); }

    /** Update PCB after a DL/I call */
    public void updateAfterCall(DliSegment seg) {
        if (database != null) {
            statusCode = database.getStatusCode();
        }
        if (seg != null) {
            segName = seg.getSegmentName();
            keyFeedback = seg.getKey();
            // Calculate segment level
            segLevel = 0;
            DliSegment s = seg;
            while (s.getParent() != null) {
                segLevel++;
                s = s.getParent();
            }
        }
    }
}
