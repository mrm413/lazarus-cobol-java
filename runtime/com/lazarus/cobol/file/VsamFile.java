package com.lazarus.cobol.file;

import java.util.*;

/**
 * Standalone VSAM File — batch COBOL access to VSAM without CICS.
 *
 * VSAM organizations:
 *   KSDS — Key-Sequenced Data Set (primary key + optional alt index)
 *   ESDS — Entry-Sequenced Data Set (RBA ordering)
 *   RRDS — Relative Record Data Set (slot-based)
 *
 * File operations map to COBOL file I/O:
 *   OPEN INPUT/OUTPUT/I-O/EXTEND
 *   READ (sequential or keyed)
 *   WRITE
 *   REWRITE
 *   DELETE
 *   START (position for sequential read)
 *   CLOSE
 *
 * File status codes match standard COBOL:
 *   00 = Success, 02 = Duplicate alt key, 10 = End of file
 *   22 = Duplicate primary key, 23 = Key not found
 *   35 = File not found, 39 = Mismatch, 41-49 = Logic errors
 */
public class VsamFile {

    public enum Organization { KSDS, ESDS, RRDS }
    public enum OpenMode { INPUT, OUTPUT, IO, EXTEND, CLOSED }
    public enum StartCondition { EQUAL, NOT_LESS, GREATER }

    private final String fileName;
    private final Organization org;
    private OpenMode openMode = OpenMode.CLOSED;

    // KSDS: key → record
    private final TreeMap<String, Map<String, String>> ksdsData = new TreeMap<>();
    // ESDS: insertion-order list
    private final List<Map<String, String>> esdsData = new ArrayList<>();
    // RRDS: slot → record
    private final TreeMap<Integer, Map<String, String>> rrdsData = new TreeMap<>();

    // Key field name for KSDS
    private String keyField = "KEY";
    // Alternate indexes: index name → (field name → unique flag)
    private final Map<String, AltIndex> altIndexes = new LinkedHashMap<>();

    // Sequential position
    private Iterator<?> seqIterator = null;
    private String currentKey = null;
    private int currentRrn = 0;
    private int esdsPos = -1;

    // File status
    private String fileStatus = "00";

    public VsamFile(String name, Organization org) {
        this.fileName = name;
        this.org = org;
    }

    public VsamFile(String name, Organization org, String keyField) {
        this.fileName = name;
        this.org = org;
        this.keyField = keyField;
    }

    public String getFileName() { return fileName; }
    public Organization getOrganization() { return org; }
    public String getFileStatus() { return fileStatus; }
    public OpenMode getOpenMode() { return openMode; }
    public String getKeyField() { return keyField; }

    // --- Alternate Index ---

    public void defineAltIndex(String name, String field, boolean unique) {
        altIndexes.put(name.toUpperCase(), new AltIndex(field.toUpperCase(), unique));
    }

    // --- OPEN ---

    public boolean open(OpenMode mode) {
        if (openMode != OpenMode.CLOSED) {
            fileStatus = "41"; // Already open
            return false;
        }
        openMode = mode;
        resetPosition();
        fileStatus = "00";
        return true;
    }

    // --- CLOSE ---

    public boolean close() {
        if (openMode == OpenMode.CLOSED) {
            fileStatus = "42"; // Already closed
            return false;
        }
        openMode = OpenMode.CLOSED;
        seqIterator = null;
        fileStatus = "00";
        return true;
    }

    // --- WRITE ---

    public boolean write(Map<String, String> record) {
        if (openMode != OpenMode.OUTPUT && openMode != OpenMode.IO && openMode != OpenMode.EXTEND) {
            fileStatus = "49"; // Incompatible open mode
            return false;
        }

        switch (org) {
            case KSDS: return writeKsds(record);
            case ESDS: return writeEsds(record);
            case RRDS: return writeRrds(record);
        }
        return false;
    }

    private boolean writeKsds(Map<String, String> record) {
        String key = record.get(keyField);
        if (key == null) key = record.get(keyField.toUpperCase());
        if (key == null) {
            fileStatus = "21"; // Invalid key
            return false;
        }
        if (ksdsData.containsKey(key)) {
            fileStatus = "22"; // Duplicate key
            return false;
        }
        // Check unique alternate indexes
        for (AltIndex aix : altIndexes.values()) {
            if (aix.unique) {
                String altVal = getFieldUpper(record, aix.field);
                if (altVal != null && hasAltKeyValue(aix.field, altVal)) {
                    fileStatus = "22";
                    return false;
                }
            }
        }
        ksdsData.put(key, new LinkedHashMap<>(record));
        fileStatus = checkDuplicateAltKey(record) ? "02" : "00";
        return true;
    }

    private boolean writeEsds(Map<String, String> record) {
        esdsData.add(new LinkedHashMap<>(record));
        fileStatus = "00";
        return true;
    }

    private boolean writeRrds(Map<String, String> record) {
        String rrnStr = record.get("RRN");
        if (rrnStr == null) {
            // Auto-assign next slot
            int slot = rrdsData.isEmpty() ? 1 : rrdsData.lastKey() + 1;
            record.put("RRN", String.valueOf(slot));
            rrdsData.put(slot, new LinkedHashMap<>(record));
            currentRrn = slot;
        } else {
            int slot = Integer.parseInt(rrnStr.trim());
            if (rrdsData.containsKey(slot)) {
                fileStatus = "22";
                return false;
            }
            rrdsData.put(slot, new LinkedHashMap<>(record));
            currentRrn = slot;
        }
        fileStatus = "00";
        return true;
    }

    // --- READ (keyed) ---

    public Map<String, String> read(String key) {
        if (openMode != OpenMode.INPUT && openMode != OpenMode.IO) {
            fileStatus = "47";
            return null;
        }
        if (org == Organization.KSDS) {
            Map<String, String> rec = ksdsData.get(key);
            if (rec == null) {
                fileStatus = "23";
                return null;
            }
            currentKey = key;
            fileStatus = "00";
            return Collections.unmodifiableMap(rec);
        }
        fileStatus = "43"; // Not keyed org
        return null;
    }

    /** READ by alternate index */
    public Map<String, String> readByAltKey(String indexName, String value) {
        if (openMode != OpenMode.INPUT && openMode != OpenMode.IO) {
            fileStatus = "47";
            return null;
        }
        AltIndex aix = altIndexes.get(indexName.toUpperCase());
        if (aix == null) {
            fileStatus = "90"; // No such index
            return null;
        }
        for (Map.Entry<String, Map<String, String>> entry : ksdsData.entrySet()) {
            String val = getFieldUpper(entry.getValue(), aix.field);
            if (value.equals(val)) {
                currentKey = entry.getKey();
                fileStatus = "00";
                return Collections.unmodifiableMap(entry.getValue());
            }
        }
        fileStatus = "23";
        return null;
    }

    /** READ by RRN (RRDS) */
    public Map<String, String> readByRrn(int rrn) {
        if (org != Organization.RRDS) { fileStatus = "43"; return null; }
        if (openMode != OpenMode.INPUT && openMode != OpenMode.IO) { fileStatus = "47"; return null; }
        Map<String, String> rec = rrdsData.get(rrn);
        if (rec == null) { fileStatus = "23"; return null; }
        currentRrn = rrn;
        fileStatus = "00";
        return Collections.unmodifiableMap(rec);
    }

    // --- READ NEXT (sequential) ---

    public Map<String, String> readNext() {
        if (openMode != OpenMode.INPUT && openMode != OpenMode.IO) {
            fileStatus = "47";
            return null;
        }

        switch (org) {
            case KSDS: return readNextKsds();
            case ESDS: return readNextEsds();
            case RRDS: return readNextRrds();
        }
        return null;
    }

    private Map<String, String> readNextKsds() {
        if (currentKey == null) {
            // Start from beginning
            if (ksdsData.isEmpty()) { fileStatus = "10"; return null; }
            currentKey = ksdsData.firstKey();
        } else {
            String higher = ksdsData.higherKey(currentKey);
            if (higher == null) { fileStatus = "10"; return null; }
            currentKey = higher;
        }
        fileStatus = "00";
        return Collections.unmodifiableMap(ksdsData.get(currentKey));
    }

    private Map<String, String> readNextEsds() {
        esdsPos++;
        if (esdsPos >= esdsData.size()) { fileStatus = "10"; return null; }
        fileStatus = "00";
        return Collections.unmodifiableMap(esdsData.get(esdsPos));
    }

    private Map<String, String> readNextRrds() {
        Integer higher = rrdsData.higherKey(currentRrn);
        if (higher == null) { fileStatus = "10"; return null; }
        currentRrn = higher;
        fileStatus = "00";
        return Collections.unmodifiableMap(rrdsData.get(currentRrn));
    }

    // --- READ PREVIOUS ---

    public Map<String, String> readPrevious() {
        if (org == Organization.KSDS) {
            if (currentKey == null) { fileStatus = "10"; return null; }
            String lower = ksdsData.lowerKey(currentKey);
            if (lower == null) { fileStatus = "10"; return null; }
            currentKey = lower;
            fileStatus = "00";
            return Collections.unmodifiableMap(ksdsData.get(currentKey));
        }
        fileStatus = "43";
        return null;
    }

    // --- START (position for sequential) ---

    public boolean start(String key, StartCondition cond) {
        if (org != Organization.KSDS) { fileStatus = "43"; return false; }
        if (openMode != OpenMode.INPUT && openMode != OpenMode.IO) { fileStatus = "47"; return false; }

        String found = null;
        switch (cond) {
            case EQUAL:
                if (ksdsData.containsKey(key)) found = key;
                break;
            case NOT_LESS:
                found = ksdsData.ceilingKey(key);
                break;
            case GREATER:
                found = ksdsData.higherKey(key);
                break;
        }
        if (found == null) { fileStatus = "23"; return false; }
        // Position before the found key so readNext will return it
        currentKey = ksdsData.lowerKey(found);
        if (currentKey == null && found.equals(ksdsData.firstKey())) {
            currentKey = null; // readNext will start from first
        }
        fileStatus = "00";
        return true;
    }

    // --- REWRITE ---

    public boolean rewrite(Map<String, String> record) {
        if (openMode != OpenMode.IO) { fileStatus = "49"; return false; }

        switch (org) {
            case KSDS: {
                String key = record.get(keyField);
                if (key == null) key = record.get(keyField.toUpperCase());
                if (key == null || !ksdsData.containsKey(key)) { fileStatus = "23"; return false; }
                ksdsData.put(key, new LinkedHashMap<>(record));
                fileStatus = "00";
                return true;
            }
            case ESDS: {
                if (esdsPos < 0 || esdsPos >= esdsData.size()) { fileStatus = "43"; return false; }
                esdsData.set(esdsPos, new LinkedHashMap<>(record));
                fileStatus = "00";
                return true;
            }
            case RRDS: {
                if (!rrdsData.containsKey(currentRrn)) { fileStatus = "23"; return false; }
                record.put("RRN", String.valueOf(currentRrn));
                rrdsData.put(currentRrn, new LinkedHashMap<>(record));
                fileStatus = "00";
                return true;
            }
        }
        return false;
    }

    // --- DELETE ---

    public boolean delete(String key) {
        if (openMode != OpenMode.IO) { fileStatus = "49"; return false; }
        if (org == Organization.KSDS) {
            if (ksdsData.remove(key) == null) { fileStatus = "23"; return false; }
            fileStatus = "00";
            return true;
        }
        if (org == Organization.RRDS) {
            int rrn = Integer.parseInt(key.trim());
            if (rrdsData.remove(rrn) == null) { fileStatus = "23"; return false; }
            fileStatus = "00";
            return true;
        }
        fileStatus = "43"; // ESDS doesn't support delete
        return false;
    }

    // --- Utility ---

    public int getRecordCount() {
        switch (org) {
            case KSDS: return ksdsData.size();
            case ESDS: return esdsData.size();
            case RRDS: return rrdsData.size();
        }
        return 0;
    }

    public void resetPosition() {
        currentKey = null;
        currentRrn = 0;
        esdsPos = -1;
        seqIterator = null;
    }

    public String getCurrentKey() { return currentKey; }
    public int getCurrentRrn() { return currentRrn; }

    /** Get all keys (KSDS) */
    public Set<String> getAllKeys() {
        return org == Organization.KSDS ? Collections.unmodifiableSet(ksdsData.keySet()) : Collections.emptySet();
    }

    // --- Internal helpers ---

    private String getFieldUpper(Map<String, String> record, String field) {
        String val = record.get(field);
        if (val == null) val = record.get(field.toUpperCase());
        return val;
    }

    private boolean hasAltKeyValue(String field, String value) {
        for (Map<String, String> rec : ksdsData.values()) {
            if (value.equals(getFieldUpper(rec, field))) return true;
        }
        return false;
    }

    private boolean checkDuplicateAltKey(Map<String, String> record) {
        for (AltIndex aix : altIndexes.values()) {
            if (!aix.unique) {
                String val = getFieldUpper(record, aix.field);
                if (val != null) {
                    int count = 0;
                    for (Map<String, String> rec : ksdsData.values()) {
                        if (val.equals(getFieldUpper(rec, aix.field))) count++;
                    }
                    if (count > 1) return true;
                }
            }
        }
        return false;
    }

    private static class AltIndex {
        final String field;
        final boolean unique;
        AltIndex(String f, boolean u) { this.field = f; this.unique = u; }
    }
}
