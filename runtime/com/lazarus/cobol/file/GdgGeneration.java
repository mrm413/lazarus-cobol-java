package com.lazarus.cobol.file;

import java.util.*;

/**
 * GDG Generation — a single generation in a GDG base.
 *
 * Absolute name format: BASE.NAME.G0001V00
 *   G = generation, V = version (always 00 for new)
 *
 * Each generation holds its own data (lines) and can be
 * independently read/written like a sequential dataset.
 */
public class GdgGeneration {

    public enum Status {
        ACTIVE,      // Current active generation
        ROLLED_OFF,  // Exceeded limit, not yet deleted
        SCRATCHED,   // Physically deleted
        DEFERRED     // Allocated but not yet written
    }

    private final String absoluteName;
    private final int generationNumber;
    private Status status;
    private final List<String> data = new ArrayList<>();
    private long createTime;
    private DatasetAttributes attributes;

    public GdgGeneration(String absoluteName, int genNumber) {
        this.absoluteName = absoluteName.toUpperCase().trim();
        this.generationNumber = genNumber;
        this.status = Status.ACTIVE;
        this.createTime = System.currentTimeMillis();
        this.attributes = new DatasetAttributes();
    }

    public String getAbsoluteName() { return absoluteName; }
    public int getGenerationNumber() { return generationNumber; }
    public Status getStatus() { return status; }
    public void setStatus(Status s) { this.status = s; }
    public long getCreateTime() { return createTime; }
    public DatasetAttributes getAttributes() { return attributes; }
    public void setAttributes(DatasetAttributes a) { this.attributes = a; }

    // --- Data I/O ---

    /** Write data (replaces existing) */
    public void writeData(List<String> lines) {
        data.clear();
        data.addAll(lines);
    }

    /** Append data */
    public void appendData(List<String> lines) {
        data.addAll(lines);
    }

    /** Append single line */
    public void appendLine(String line) {
        data.add(line);
    }

    /** Read all data */
    public List<String> readData() {
        return Collections.unmodifiableList(data);
    }

    /** Get record count */
    public int getRecordCount() { return data.size(); }

    /** Check if generation has data */
    public boolean hasData() { return !data.isEmpty(); }

    /** Clear data */
    public void clearData() { data.clear(); }

    @Override
    public String toString() {
        return absoluteName + " [" + status + ", " + data.size() + " records]";
    }
}
