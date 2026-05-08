package com.lazarus.cobol;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * In-memory B-tree-style INDEXED file backend.
 *
 * COBOL INDEXED files have a primary record key and zero or more alternate record keys.
 * Reads can target any registered key (key-of-reference); START positions the cursor;
 * READ NEXT / READ PREVIOUS step in key order.
 *
 * Persistence: on close(), records are serialized to disk in a simple length-prefixed
 * format. On open(), records are loaded back and the indexes are rebuilt.
 *
 * File format (binary):
 *   magic: 4 bytes "BIDX"
 *   numKeys: 1 byte (number of registered keys, 0..255)
 *   for each key: keyName length (1 byte) + keyName bytes + keyOffset (4 bytes BE) + keyLen (4 bytes BE) + dups (1 byte)
 *   numRecords: 4 bytes BE
 *   for each record: recLen (4 bytes BE) + recBytes
 */
public class IndexedBackend {

    public static final class KeyDef {
        public final String name;       // logical name used by COBOL code
        public final int offset;        // 0-based byte offset within record
        public final int length;        // key byte count
        public final boolean duplicates;
        public KeyDef(String name, int offset, int length, boolean duplicates) {
            this.name = name; this.offset = offset; this.length = length; this.duplicates = duplicates;
        }
    }

    private final File file;
    private KeyDef primaryKey;
    private final Map<String, KeyDef> altKeys = new LinkedHashMap<>();
    /** All records, indexed by their primary key bytes (as String for ordering). */
    private final TreeMap<String, byte[]> primary = new TreeMap<>();
    /** Per-alt-key index: altKeyName -> (altKeyValue -> list of primary keys, in insertion order). */
    private final Map<String, TreeMap<String, List<String>>> altIndex = new HashMap<>();
    /** Insertion-order list of primary keys — used to persist records in write order so
     *  alt-key duplicate iteration preserves write order across CLOSE/REOPEN. */
    private final List<String> insertionOrder = new ArrayList<>();

    /** Cursor state: which key are we positioned on, and what's the current value? */
    private String activeKey;          // "primary" or alt key name
    private String currentValue;       // current key value at the cursor (in TreeMap key order)
    private int currentDupIdx;         // index within the duplicate list for alternate keys
    private boolean atEnd = false;
    private boolean atBeforeFirst = true;

    private boolean dirty = false;
    private boolean isOpen = false;

    public IndexedBackend(String filePath) {
        this.file = new File(filePath);
    }

    public void registerPrimaryKey(KeyDef key) { this.primaryKey = key; }
    public void registerAltKey(KeyDef key) {
        altKeys.put(key.name, key);
        altIndex.put(key.name, new TreeMap<>());
    }

    /** Public accessor for the primary key definition (offset, length). */
    public KeyDef primaryKeyDef() { return primaryKey; }
    /** Public accessor for the alternate key definition by name (case-insensitive). */
    public KeyDef altKeyDef(String name) {
        if (name == null) return null;
        KeyDef k = altKeys.get(name);
        if (k != null) return k;
        for (Map.Entry<String, KeyDef> e : altKeys.entrySet()) {
            if (e.getKey().equalsIgnoreCase(name)) return e.getValue();
        }
        return null;
    }

    public boolean exists() { return file.exists() && file.length() > 1; }
    public boolean isEmpty() { return primary.isEmpty(); }
    public int size() { return primary.size(); }

    /** Load records from disk. Called on OPEN INPUT/I-O. */
    public void load() throws IOException {
        primary.clear();
        insertionOrder.clear();
        for (TreeMap<String, List<String>> ai : altIndex.values()) ai.clear();
        // Mark open and ready BEFORE any early-return so that close()/write()/persist()
        // still work correctly when the file is missing, empty, or has a foreign/legacy
        // magic. Without this, a non-BIDX file (e.g. left over from another runtime)
        // would leave isOpen=false, and the subsequent close() would silently skip
        // persist(), losing all writes performed in this session.
        isOpen = true;
        atBeforeFirst = true;
        atEnd = false;
        dirty = false;
        if (!file.exists() || file.length() < 5) return; // empty/uninitialized
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            // Check magic. If not "BIDX", treat as legacy line-sequential and bail.
            byte[] magic = new byte[4];
            int got = in.read(magic);
            if (got < 4 || magic[0] != 'B' || magic[1] != 'I' || magic[2] != 'D' || magic[3] != 'X') {
                return; // legacy format — leave empty so caller falls back
            }
            int numKeys = in.readUnsignedByte();
            for (int i = 0; i < numKeys; i++) {
                int nameLen = in.readUnsignedByte();
                byte[] nameBytes = new byte[nameLen];
                in.readFully(nameBytes);
                int off = in.readInt();
                int len = in.readInt();
                int dups = in.readUnsignedByte();
                // We trust the registration done before load() — skip silently
                String _name = new String(nameBytes, StandardCharsets.US_ASCII);
            }
            int numRecords = in.readInt();
            for (int i = 0; i < numRecords; i++) {
                int recLen = in.readInt();
                byte[] recBytes = new byte[recLen];
                in.readFully(recBytes);
                String pk = extractKey(recBytes, primaryKey);
                primary.put(pk, recBytes);
                insertionOrder.add(pk);
                indexAltKeys(pk, recBytes);
            }
        }
    }

    /** Open without loading — used for OPEN OUTPUT (start fresh). */
    public void openFresh() {
        primary.clear();
        insertionOrder.clear();
        for (TreeMap<String, List<String>> ai : altIndex.values()) ai.clear();
        isOpen = true;
        atBeforeFirst = true;
        atEnd = false;
        dirty = true; // empty file still gets persisted on close
    }

    /** Persist all records to disk. */
    public void persist() throws IOException {
        if (!dirty) return;
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeBytes("BIDX");
            // Build keys list in deterministic order: primary then alts
            List<KeyDef> keys = new ArrayList<>();
            if (primaryKey != null) keys.add(primaryKey);
            keys.addAll(altKeys.values());
            out.writeByte(keys.size());
            for (KeyDef k : keys) {
                byte[] nb = k.name.getBytes(StandardCharsets.US_ASCII);
                out.writeByte(nb.length);
                out.write(nb);
                out.writeInt(k.offset);
                out.writeInt(k.length);
                out.writeByte(k.duplicates ? 1 : 0);
            }
            out.writeInt(primary.size());
            // Persist records in INSERTION order so alt-key duplicate iteration
            // preserves write order across CLOSE/REOPEN. Falls back to primary-key
            // order if insertionOrder somehow drifts.
            for (String pk : insertionOrder) {
                byte[] rec = primary.get(pk);
                if (rec == null) continue;
                out.writeInt(rec.length);
                out.write(rec);
            }
            // Defensive: any record not in insertionOrder (shouldn't happen)
            if (insertionOrder.size() != primary.size()) {
                Set<String> seen = new HashSet<>(insertionOrder);
                for (Map.Entry<String, byte[]> e : primary.entrySet()) {
                    if (seen.contains(e.getKey())) continue;
                    out.writeInt(e.getValue().length);
                    out.write(e.getValue());
                }
            }
        }
        dirty = false;
    }

    public void close() throws IOException {
        if (!isOpen) return;
        persist();
        isOpen = false;
    }

    private String extractKey(byte[] record, KeyDef key) {
        if (key == null || key.offset < 0 || key.length <= 0) return "";
        int end = Math.min(record.length, key.offset + key.length);
        if (end <= key.offset) return "";
        return new String(record, key.offset, end - key.offset, StandardCharsets.ISO_8859_1);
    }

    private void indexAltKeys(String pk, byte[] rec) {
        for (KeyDef k : altKeys.values()) {
            String akv = extractKey(rec, k);
            altIndex.get(k.name).computeIfAbsent(akv, _x -> new ArrayList<>()).add(pk);
        }
    }

    private void unindexAltKeys(String pk, byte[] rec) {
        for (KeyDef k : altKeys.values()) {
            String akv = extractKey(rec, k);
            List<String> list = altIndex.get(k.name).get(akv);
            if (list != null) {
                list.remove(pk);
                if (list.isEmpty()) altIndex.get(k.name).remove(akv);
            }
        }
    }

    /** WRITE: insert. Returns "00" on success, "22" on duplicate primary key,
     *  "02" on success but alternate key has duplicates (warning). */
    public String write(byte[] record) {
        String pk = extractKey(record, primaryKey);
        if (primary.containsKey(pk)) return "22"; // duplicate key
        // Check alt-key duplicates that don't allow them
        for (KeyDef k : altKeys.values()) {
            if (!k.duplicates) {
                String akv = extractKey(record, k);
                List<String> existing = altIndex.get(k.name).get(akv);
                if (existing != null && !existing.isEmpty()) return "22";
            }
        }
        primary.put(pk, record.clone());
        insertionOrder.add(pk);
        indexAltKeys(pk, record);
        // Status 02 if any alt-key value already had duplicates
        boolean dup = false;
        for (KeyDef k : altKeys.values()) {
            if (k.duplicates) {
                String akv = extractKey(record, k);
                if (altIndex.get(k.name).getOrDefault(akv, Collections.emptyList()).size() > 1) {
                    dup = true; break;
                }
            }
        }
        dirty = true;
        return dup ? "02" : "00";
    }

    /** READ KEY=: random read by primary or alternate key. Updates cursor. */
    public byte[] readByKey(String keyName, byte[] keyValue) {
        String kv = new String(keyValue, StandardCharsets.ISO_8859_1);
        if (keyName == null || keyName.equals("primary") || (primaryKey != null && keyName.equalsIgnoreCase(primaryKey.name))) {
            byte[] rec = primary.get(kv);
            if (rec != null) {
                activeKey = "primary";
                currentValue = kv;
                currentDupIdx = 0;
                atEnd = false;
                atBeforeFirst = false;
                return rec;
            }
            return null;
        }
        TreeMap<String, List<String>> idx = altIndex.get(keyName);
        if (idx == null) {
            // Try uppercase / case-insensitive lookup
            for (Map.Entry<String, TreeMap<String, List<String>>> e : altIndex.entrySet()) {
                if (e.getKey().equalsIgnoreCase(keyName)) { idx = e.getValue(); keyName = e.getKey(); break; }
            }
        }
        if (idx == null) return null;
        List<String> pks = idx.get(kv);
        if (pks == null || pks.isEmpty()) return null;
        activeKey = keyName;
        currentValue = kv;
        currentDupIdx = 0;
        atEnd = false;
        atBeforeFirst = false;
        return primary.get(pks.get(0));
    }

    /** START key=value with comparison. ops: "EQ", "GT", "GE", "LT", "LE".
     *  Returns true if a record was found (status 00), false otherwise (23). */
    public boolean start(String keyName, byte[] keyValue, String op) {
        String kv = new String(keyValue, StandardCharsets.ISO_8859_1);
        boolean isPrimary = keyName == null || keyName.equals("primary")
                || (primaryKey != null && keyName.equalsIgnoreCase(primaryKey.name));
        TreeMap<String, ?> tree;
        String resolvedKeyName;
        if (isPrimary) {
            tree = primary;
            resolvedKeyName = "primary";
        } else {
            tree = altIndex.get(keyName);
            if (tree == null) {
                for (Map.Entry<String, TreeMap<String, List<String>>> e : altIndex.entrySet()) {
                    if (e.getKey().equalsIgnoreCase(keyName)) { tree = e.getValue(); keyName = e.getKey(); break; }
                }
            }
            if (tree == null) return false;
            resolvedKeyName = keyName;
        }
        String found;
        switch (op == null ? "EQ" : op.toUpperCase()) {
            case "EQ": found = tree.containsKey(kv) ? kv : null; break;
            case "GT": {
                Object e = ((TreeMap) tree).higherKey(kv);
                found = e == null ? null : (String) e; break;
            }
            case "GE": {
                Object e = ((TreeMap) tree).ceilingKey(kv);
                found = e == null ? null : (String) e; break;
            }
            case "LT": {
                Object e = ((TreeMap) tree).lowerKey(kv);
                found = e == null ? null : (String) e; break;
            }
            case "LE": {
                Object e = ((TreeMap) tree).floorKey(kv);
                found = e == null ? null : (String) e; break;
            }
            case "FIRST": {
                // GnuCOBOL extension: position at first record on the primary key
                found = tree.isEmpty() ? null : (String) ((TreeMap) tree).firstKey(); break;
            }
            case "LAST": {
                // GnuCOBOL extension: position at last record on the primary key
                found = tree.isEmpty() ? null : (String) ((TreeMap) tree).lastKey(); break;
            }
            default: found = null;
        }
        if (found == null) {
            atEnd = true;
            return false;
        }
        activeKey = resolvedKeyName;
        currentValue = found;
        currentDupIdx = 0;
        atEnd = false;
        // Leave atBeforeFirst=true so the FIRST subsequent READ NEXT/PREVIOUS returns
        // the record AT the start position (not the next/previous one). COBOL semantics:
        // START positions the cursor; the first READ then reads at-cursor; later READs advance.
        atBeforeFirst = true;
        return true;
    }

    /** Return the record at the current cursor position without advancing. */
    public byte[] readCurrent() {
        if (atEnd || atBeforeFirst || currentValue == null) return null;
        if ("primary".equals(activeKey)) return primary.get(currentValue);
        TreeMap<String, List<String>> idx = altIndex.get(activeKey);
        if (idx == null) return null;
        List<String> pks = idx.get(currentValue);
        if (pks == null || currentDupIdx >= pks.size()) return null;
        return primary.get(pks.get(currentDupIdx));
    }

    /** READ NEXT: advance cursor and return next record, null at end. */
    public byte[] readNext() {
        if (primary.isEmpty()) { atEnd = true; return null; }
        if (atBeforeFirst) {
            // Two sub-cases:
            //   1. First read after OPEN with no START — currentValue is null,
            //      so start at first primary key.
            //   2. First read after a successful START — currentValue is set to the
            //      matched key; return the record AT the cursor (don't advance).
            if (activeKey == null) activeKey = "primary";
            atBeforeFirst = false;
            if ("primary".equals(activeKey)) {
                if (currentValue == null) {
                    currentValue = primary.firstKey();
                    currentDupIdx = 0;
                }
                return primary.get(currentValue);
            } else {
                TreeMap<String, List<String>> idx = altIndex.get(activeKey);
                if (idx == null || idx.isEmpty()) { atEnd = true; return null; }
                if (currentValue == null) {
                    currentValue = idx.firstKey();
                    currentDupIdx = 0;
                }
                List<String> pks = idx.get(currentValue);
                if (pks == null || currentDupIdx >= pks.size()) { atEnd = true; return null; }
                return primary.get(pks.get(currentDupIdx));
            }
        }
        if (atEnd) return null;
        if ("primary".equals(activeKey)) {
            String next = primary.higherKey(currentValue);
            if (next == null) { atEnd = true; return null; }
            currentValue = next;
            currentDupIdx = 0;
            return primary.get(currentValue);
        }
        TreeMap<String, List<String>> idx = altIndex.get(activeKey);
        if (idx == null) { atEnd = true; return null; }
        List<String> pks = idx.get(currentValue);
        if (pks != null && currentDupIdx + 1 < pks.size()) {
            currentDupIdx++;
            return primary.get(pks.get(currentDupIdx));
        }
        // Move to next alt key value
        String next = idx.higherKey(currentValue);
        if (next == null) { atEnd = true; return null; }
        currentValue = next;
        currentDupIdx = 0;
        return primary.get(idx.get(next).get(0));
    }

    /** READ PREVIOUS: step backwards. */
    public byte[] readPrevious() {
        if (primary.isEmpty()) { atEnd = true; return null; }
        if (atBeforeFirst) {
            // Two sub-cases:
            //   1. First read after OPEN with no START — position at last record.
            //   2. First read after a successful START — return record AT the cursor.
            if (activeKey == null) activeKey = "primary";
            atBeforeFirst = false;
            if ("primary".equals(activeKey)) {
                if (currentValue == null) {
                    currentValue = primary.lastKey();
                    currentDupIdx = 0;
                }
                return primary.get(currentValue);
            } else {
                TreeMap<String, List<String>> idx = altIndex.get(activeKey);
                if (idx == null || idx.isEmpty()) { atEnd = true; return null; }
                if (currentValue == null) {
                    currentValue = idx.lastKey();
                    List<String> _pks = idx.get(currentValue);
                    currentDupIdx = _pks.size() - 1;
                }
                List<String> pks = idx.get(currentValue);
                if (pks == null || currentDupIdx >= pks.size()) { atEnd = true; return null; }
                return primary.get(pks.get(currentDupIdx));
            }
        }
        if (atEnd) return null;
        if ("primary".equals(activeKey)) {
            String prev = primary.lowerKey(currentValue);
            if (prev == null) { atEnd = true; return null; }
            currentValue = prev;
            currentDupIdx = 0;
            return primary.get(currentValue);
        }
        TreeMap<String, List<String>> idx = altIndex.get(activeKey);
        if (idx == null) { atEnd = true; return null; }
        if (currentDupIdx > 0) {
            currentDupIdx--;
            return primary.get(idx.get(currentValue).get(currentDupIdx));
        }
        String prev = idx.lowerKey(currentValue);
        if (prev == null) { atEnd = true; return null; }
        currentValue = prev;
        List<String> pks = idx.get(prev);
        currentDupIdx = pks.size() - 1;
        return primary.get(pks.get(currentDupIdx));
    }

    /** REWRITE: update the record at the current cursor position. Status 23 if no record. */
    public String rewrite(byte[] record) {
        String pk = extractKey(record, primaryKey);
        byte[] existing = primary.get(pk);
        if (existing == null) return "23"; // record not found
        unindexAltKeys(pk, existing);
        // Check alt-key uniqueness against the new value (excluding the rewritten record)
        for (KeyDef k : altKeys.values()) {
            if (!k.duplicates) {
                String akv = extractKey(record, k);
                List<String> dups = altIndex.get(k.name).get(akv);
                if (dups != null && !dups.isEmpty()) {
                    // Re-add the old indexes and fail
                    indexAltKeys(pk, existing);
                    return "22";
                }
            }
        }
        primary.put(pk, record.clone());
        indexAltKeys(pk, record);
        dirty = true;
        return "00";
    }

    /** DELETE: remove the record at the current cursor position. Status 23 if not found. */
    public String delete() {
        if (currentValue == null) return "23";
        if ("primary".equals(activeKey)) {
            byte[] rec = primary.remove(currentValue);
            if (rec == null) return "23";
            unindexAltKeys(currentValue, rec);
            dirty = true;
            return "00";
        }
        TreeMap<String, List<String>> idx = altIndex.get(activeKey);
        if (idx == null) return "23";
        List<String> pks = idx.get(currentValue);
        if (pks == null || currentDupIdx >= pks.size()) return "23";
        String pk = pks.get(currentDupIdx);
        byte[] rec = primary.remove(pk);
        if (rec == null) return "23";
        unindexAltKeys(pk, rec);
        dirty = true;
        return "00";
    }

    /** DELETE BY PRIMARY KEY (random delete). */
    public String deleteByKey(byte[] keyValue) {
        String pk = new String(keyValue, StandardCharsets.ISO_8859_1);
        byte[] rec = primary.remove(pk);
        if (rec == null) return "23";
        unindexAltKeys(pk, rec);
        dirty = true;
        return "00";
    }
}
