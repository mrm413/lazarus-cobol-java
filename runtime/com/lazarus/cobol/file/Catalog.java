package com.lazarus.cobol.file;

import java.util.*;

/**
 * z/OS Catalog — central registry for datasets, GDGs, PDS, and VSAM clusters.
 *
 * The catalog manages:
 *   - Sequential datasets (PS)
 *   - Partitioned datasets (PO/PDS)
 *   - Generation Data Groups (GDG bases + generations)
 *   - VSAM clusters (KSDS, ESDS, RRDS, LDS)
 *
 * Operations:
 *   DEFINE — create a catalog entry
 *   DELETE — remove a catalog entry
 *   ALTER  — modify attributes or rename
 *   LISTCAT — list entries with optional filter
 *
 * This replaces IdcamsProgram's static catalog with a proper
 * object model that supports GDG management and PDS tracking.
 */
public class Catalog {

    /** Entry type in the catalog */
    public enum EntryType {
        PS,       // Physical Sequential
        PDS,      // Partitioned Data Set
        GDG,      // Generation Data Group base
        KSDS,     // Key-Sequenced Data Set (VSAM)
        ESDS,     // Entry-Sequenced Data Set (VSAM)
        RRDS,     // Relative Record Data Set (VSAM)
        LDS,      // Linear Data Set (VSAM)
        AIX,      // Alternate Index
        ALIAS,    // Alias entry
        PATH      // Path entry
    }

    /** A catalog entry */
    public static class CatalogEntry {
        private final String name;
        private final EntryType type;
        private final DatasetAttributes attributes;
        private final Map<String, String> properties = new LinkedHashMap<>();
        private long createTime;
        private long lastAccessTime;
        private String volume = "VOL001";

        public CatalogEntry(String name, EntryType type) {
            this.name = name.toUpperCase().trim();
            this.type = type;
            this.attributes = new DatasetAttributes();
            this.createTime = System.currentTimeMillis();
            this.lastAccessTime = createTime;
        }

        public String getName() { return name; }
        public EntryType getType() { return type; }
        public DatasetAttributes getAttributes() { return attributes; }
        public long getCreateTime() { return createTime; }
        public long getLastAccessTime() { return lastAccessTime; }
        public void setLastAccessTime(long t) { this.lastAccessTime = t; }
        public String getVolume() { return volume; }
        public void setVolume(String v) { this.volume = v; }

        public void setProperty(String key, String value) {
            properties.put(key.toUpperCase(), value);
        }
        public String getProperty(String key) {
            return properties.getOrDefault(key.toUpperCase(), "");
        }
        public Map<String, String> getProperties() {
            return Collections.unmodifiableMap(properties);
        }
    }

    // The catalog: dataset name → entry
    private final Map<String, CatalogEntry> entries = new LinkedHashMap<>();

    // GDG bases: base name → GdgBase
    private final Map<String, GdgBase> gdgBases = new LinkedHashMap<>();

    // PDS directories: dataset name → PdsDirectory
    private final Map<String, PdsDirectory> pdsDirectories = new LinkedHashMap<>();

    // Sequential data: dataset name → lines
    private final Map<String, List<String>> sequentialData = new LinkedHashMap<>();

    // --- DEFINE ---

    /** Define a sequential dataset */
    public CatalogEntry defineSequential(String name, DatasetAttributes attrs) {
        String n = name.toUpperCase().trim();
        if (entries.containsKey(n)) return null; // Already exists
        CatalogEntry entry = new CatalogEntry(n, EntryType.PS);
        if (attrs != null) {
            entry.getAttributes().setRecfm(attrs.getRecfm());
            entry.getAttributes().setLrecl(attrs.getLrecl());
            entry.getAttributes().setBlksize(attrs.getBlksize());
        }
        entries.put(n, entry);
        sequentialData.put(n, new ArrayList<>());
        return entry;
    }

    /** Define a PDS */
    public CatalogEntry definePds(String name, DatasetAttributes attrs) {
        String n = name.toUpperCase().trim();
        if (entries.containsKey(n)) return null;
        CatalogEntry entry = new CatalogEntry(n, EntryType.PDS);
        entry.getAttributes().setDsorg(DatasetAttributes.Dsorg.PO);
        if (attrs != null) {
            entry.getAttributes().setRecfm(attrs.getRecfm());
            entry.getAttributes().setLrecl(attrs.getLrecl());
            entry.getAttributes().setBlksize(attrs.getBlksize());
        }
        entries.put(n, entry);
        PdsDirectory pds = new PdsDirectory(n, entry.getAttributes());
        pdsDirectories.put(n, pds);
        return entry;
    }

    /** Define a GDG base */
    public CatalogEntry defineGdg(String name, int limit, boolean scratch, boolean empty) {
        String n = name.toUpperCase().trim();
        if (entries.containsKey(n)) return null;
        CatalogEntry entry = new CatalogEntry(n, EntryType.GDG);
        entry.setProperty("LIMIT", String.valueOf(limit));
        entry.setProperty("SCRATCH", scratch ? "YES" : "NO");
        entry.setProperty("EMPTY", empty ? "YES" : "NO");
        entries.put(n, entry);
        GdgBase gdg = new GdgBase(n, limit, scratch, empty);
        gdgBases.put(n, gdg);
        return entry;
    }

    /** Define a VSAM cluster */
    public CatalogEntry defineVsam(String name, EntryType vsamType, DatasetAttributes attrs) {
        String n = name.toUpperCase().trim();
        if (entries.containsKey(n)) return null;
        if (vsamType != EntryType.KSDS && vsamType != EntryType.ESDS &&
            vsamType != EntryType.RRDS && vsamType != EntryType.LDS) {
            return null; // Not a VSAM type
        }
        CatalogEntry entry = new CatalogEntry(n, vsamType);
        if (attrs != null) {
            entry.getAttributes().setRecfm(attrs.getRecfm());
            entry.getAttributes().setLrecl(attrs.getLrecl());
            entry.getAttributes().setBlksize(attrs.getBlksize());
        }
        entries.put(n, entry);
        return entry;
    }

    // --- DELETE ---

    /** Delete a catalog entry */
    public boolean delete(String name) {
        String n = name.toUpperCase().trim();
        CatalogEntry entry = entries.remove(n);
        if (entry == null) return false;
        gdgBases.remove(n);
        pdsDirectories.remove(n);
        sequentialData.remove(n);
        return true;
    }

    // --- ALTER ---

    /** Rename a catalog entry */
    public boolean rename(String oldName, String newName) {
        String o = oldName.toUpperCase().trim();
        String n = newName.toUpperCase().trim();
        CatalogEntry entry = entries.remove(o);
        if (entry == null) return false;
        if (entries.containsKey(n)) {
            entries.put(o, entry); // Put back
            return false;
        }

        // Create new entry with new name (CatalogEntry name is final)
        CatalogEntry newEntry = new CatalogEntry(n, entry.getType());
        for (Map.Entry<String, String> prop : entry.getProperties().entrySet()) {
            newEntry.setProperty(prop.getKey(), prop.getValue());
        }
        newEntry.setVolume(entry.getVolume());
        entries.put(n, newEntry);

        // Move associated objects
        GdgBase gdg = gdgBases.remove(o);
        if (gdg != null) gdgBases.put(n, gdg);
        PdsDirectory pds = pdsDirectories.remove(o);
        if (pds != null) pdsDirectories.put(n, pds);
        List<String> data = sequentialData.remove(o);
        if (data != null) sequentialData.put(n, data);

        return true;
    }

    // --- LISTCAT ---

    /** Get a catalog entry by name */
    public CatalogEntry getEntry(String name) {
        return entries.get(name.toUpperCase().trim());
    }

    /** Check if entry exists */
    public boolean exists(String name) {
        return entries.containsKey(name.toUpperCase().trim());
    }

    /** List all entry names */
    public Set<String> listEntries() {
        return Collections.unmodifiableSet(entries.keySet());
    }

    /** List entries by type */
    public List<String> listByType(EntryType type) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, CatalogEntry> e : entries.entrySet()) {
            if (e.getValue().getType() == type) result.add(e.getKey());
        }
        return result;
    }

    /** List entries matching a pattern (DSN prefix or wildcard) */
    public List<String> listByPattern(String pattern) {
        List<String> result = new ArrayList<>();
        String upper = pattern.toUpperCase().trim();
        for (String name : entries.keySet()) {
            if (upper.endsWith("**")) {
                String prefix = upper.substring(0, upper.length() - 2);
                if (prefix.endsWith(".")) prefix = prefix.substring(0, prefix.length() - 1);
                if (name.startsWith(prefix)) result.add(name);
            } else if (upper.contains("*")) {
                String regex = upper.replace(".", "\\.").replace("*", "[^.]*");
                if (name.matches(regex)) result.add(name);
            } else {
                if (name.equals(upper)) result.add(name);
            }
        }
        return result;
    }

    /** Get total entry count */
    public int getEntryCount() { return entries.size(); }

    // --- GDG Access ---

    /** Get GDG base */
    public GdgBase getGdgBase(String name) {
        return gdgBases.get(name.toUpperCase().trim());
    }

    /**
     * Resolve a GDG relative reference: BASE.NAME(+1), BASE.NAME(0), BASE.NAME(-1)
     * @return the generation, or null
     */
    public GdgGeneration resolveGdg(String baseName, int relative) {
        GdgBase gdg = gdgBases.get(baseName.toUpperCase().trim());
        if (gdg == null) return null;
        return gdg.resolve(relative);
    }

    // --- PDS Access ---

    /** Get PDS directory */
    public PdsDirectory getPds(String name) {
        return pdsDirectories.get(name.toUpperCase().trim());
    }

    // --- Sequential Data Access ---

    /** Write sequential data */
    public void writeSequential(String name, List<String> lines) {
        String n = name.toUpperCase().trim();
        List<String> data = sequentialData.get(n);
        if (data != null) {
            data.clear();
            data.addAll(lines);
        }
    }

    /** Read sequential data */
    public List<String> readSequential(String name) {
        List<String> data = sequentialData.get(name.toUpperCase().trim());
        return data != null ? Collections.unmodifiableList(data) : null;
    }

    /** Append to sequential data */
    public void appendSequential(String name, List<String> lines) {
        List<String> data = sequentialData.get(name.toUpperCase().trim());
        if (data != null) data.addAll(lines);
    }
}
