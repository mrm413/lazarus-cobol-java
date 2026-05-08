package com.lazarus.cobol.ims;

import java.util.*;

/**
 * DL/I Segment — a node in an IMS hierarchical database.
 *
 * IMS databases are hierarchical trees of segments:
 *   HOSPITAL (root)
 *     ├── WARD
 *     │   ├── PATIENT
 *     │   │   └── TREATMENT
 *     │   └── NURSE
 *     └── DOCTOR
 *
 * Each segment has:
 *   - Segment name (type)
 *   - Key field (unique within siblings)
 *   - Data fields (key-value pairs)
 *   - Parent/children relationships
 */
public class DliSegment {

    private final String segmentName;
    private String key = "";
    private final Map<String, String> fields = new LinkedHashMap<>();
    private DliSegment parent;
    private final List<DliSegment> children = new ArrayList<>();

    public DliSegment(String segmentName) {
        this.segmentName = segmentName.toUpperCase().trim();
    }

    public DliSegment(String segmentName, String key) {
        this(segmentName);
        this.key = key;
    }

    // --- Accessors ---
    public String getSegmentName() { return segmentName; }
    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
    public DliSegment getParent() { return parent; }
    public List<DliSegment> getChildren() { return children; }
    public Map<String, String> getFields() { return fields; }

    /** Get a field value */
    public String getField(String name) {
        return fields.getOrDefault(name.toUpperCase().trim(), "");
    }

    /** Set a field value */
    public void setField(String name, String value) {
        fields.put(name.toUpperCase().trim(), value);
        // If field name matches a known key field, update key
    }

    /** Set all data from a map */
    public void setData(Map<String, String> data) {
        for (Map.Entry<String, String> e : data.entrySet()) {
            fields.put(e.getKey().toUpperCase().trim(), e.getValue());
        }
    }

    /** Get all data as concatenated string (like COBOL I/O area) */
    public String getData() {
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        for (String v : fields.values()) {
            if (sb.length() > 0) sb.append("|");
            sb.append(v);
        }
        return sb.toString();
    }

    /** Add a child segment */
    public void addChild(DliSegment child) {
        child.parent = this;
        children.add(child);
    }

    /** Remove a child segment */
    public boolean removeChild(DliSegment child) {
        if (children.remove(child)) {
            child.parent = null;
            return true;
        }
        return false;
    }

    /** Find a child by segment name and key */
    public DliSegment findChild(String segName, String key) {
        for (DliSegment child : children) {
            if (child.segmentName.equalsIgnoreCase(segName) &&
                (key == null || key.isEmpty() || child.key.equals(key))) {
                return child;
            }
        }
        return null;
    }

    /** Find all children of a given segment type */
    public List<DliSegment> findChildren(String segName) {
        List<DliSegment> result = new ArrayList<>();
        for (DliSegment child : children) {
            if (child.segmentName.equalsIgnoreCase(segName)) {
                result.add(child);
            }
        }
        return result;
    }

    /** Deep copy */
    public DliSegment copy() {
        DliSegment copy = new DliSegment(segmentName, key);
        copy.fields.putAll(fields);
        for (DliSegment child : children) {
            copy.addChild(child.copy());
        }
        return copy;
    }

    /** Get hierarchical path (e.g., "HOSPITAL/WARD(W01)/PATIENT(P001)") */
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        DliSegment seg = this;
        while (seg != null) {
            if (sb.length() > 0) sb.insert(0, "/");
            sb.insert(0, seg.segmentName + (seg.key.isEmpty() ? "" : "(" + seg.key + ")"));
            seg = seg.parent;
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return segmentName + "(" + key + ")";
    }
}
