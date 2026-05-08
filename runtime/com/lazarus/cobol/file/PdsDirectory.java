package com.lazarus.cobol.file;

import java.util.*;

/**
 * PDS (Partitioned Data Set) — directory of named members.
 *
 * A PDS is like a z/OS directory: each member has a name (1-8 chars)
 * and contains lines of text. Members can be added, replaced, renamed,
 * deleted, and listed.
 *
 * In this library, PDS operations map to IEBCOPY, ISPF, and
 * COBOL file I/O with member names.
 */
public class PdsDirectory {

    private final String datasetName;
    private final Map<String, List<String>> members = new LinkedHashMap<>();
    private final DatasetAttributes attributes;
    private final Map<String, Long> memberTimestamps = new LinkedHashMap<>();
    private final Map<String, String> memberStats = new LinkedHashMap<>(); // ISPF stats

    public PdsDirectory(String name) {
        this.datasetName = name.toUpperCase().trim();
        this.attributes = new DatasetAttributes();
        this.attributes.setDsorg(DatasetAttributes.Dsorg.PO);
    }

    public PdsDirectory(String name, DatasetAttributes attrs) {
        this.datasetName = name.toUpperCase().trim();
        this.attributes = attrs;
        attrs.setDsorg(DatasetAttributes.Dsorg.PO);
    }

    public String getDatasetName() { return datasetName; }
    public DatasetAttributes getAttributes() { return attributes; }

    // --- Member Operations ---

    /** Add or replace a member */
    public void addMember(String name, List<String> content) {
        String n = normalizeName(name);
        members.put(n, new ArrayList<>(content));
        memberTimestamps.put(n, System.currentTimeMillis());
    }

    /** Get member content (null if not found) */
    public List<String> getMember(String name) {
        List<String> content = members.get(normalizeName(name));
        return content != null ? Collections.unmodifiableList(content) : null;
    }

    /** Delete a member */
    public boolean deleteMember(String name) {
        String n = normalizeName(name);
        memberTimestamps.remove(n);
        memberStats.remove(n);
        return members.remove(n) != null;
    }

    /** Rename a member */
    public boolean renameMember(String oldName, String newName) {
        String o = normalizeName(oldName);
        String n = normalizeName(newName);
        List<String> content = members.remove(o);
        if (content == null) return false;
        if (members.containsKey(n)) {
            members.put(o, content); // Put back, name conflict
            return false;
        }
        members.put(n, content);
        Long ts = memberTimestamps.remove(o);
        if (ts != null) memberTimestamps.put(n, ts);
        String stats = memberStats.remove(o);
        if (stats != null) memberStats.put(n, stats);
        return true;
    }

    /** Check if member exists */
    public boolean hasMember(String name) {
        return members.containsKey(normalizeName(name));
    }

    /** List all member names (sorted) */
    public List<String> listMembers() {
        List<String> names = new ArrayList<>(members.keySet());
        Collections.sort(names);
        return names;
    }

    /** Number of members */
    public int getMemberCount() { return members.size(); }

    /** Copy a member within the same PDS */
    public boolean copyMember(String sourceName, String targetName) {
        String s = normalizeName(sourceName);
        String t = normalizeName(targetName);
        List<String> content = members.get(s);
        if (content == null) return false;
        members.put(t, new ArrayList<>(content));
        memberTimestamps.put(t, System.currentTimeMillis());
        return true;
    }

    /** Copy selected members from another PDS */
    public int copyFrom(PdsDirectory source, List<String> selectMembers, boolean replace) {
        int count = 0;
        List<String> toCopy = (selectMembers != null) ? selectMembers : source.listMembers();
        for (String name : toCopy) {
            String n = normalizeName(name);
            if (!replace && members.containsKey(n)) continue;
            List<String> content = source.getMember(n);
            if (content != null) {
                members.put(n, new ArrayList<>(content));
                memberTimestamps.put(n, System.currentTimeMillis());
                count++;
            }
        }
        return count;
    }

    /** Copy all members except those in the exclude list */
    public int copyFromExcluding(PdsDirectory source, List<String> excludeMembers, boolean replace) {
        Set<String> excluded = new HashSet<>();
        if (excludeMembers != null) {
            for (String name : excludeMembers) excluded.add(normalizeName(name));
        }
        int count = 0;
        for (String name : source.listMembers()) {
            if (excluded.contains(name)) continue;
            if (!replace && members.containsKey(name)) continue;
            List<String> content = source.getMember(name);
            if (content != null) {
                members.put(name, new ArrayList<>(content));
                memberTimestamps.put(name, System.currentTimeMillis());
                count++;
            }
        }
        return count;
    }

    /** Set ISPF statistics string for a member */
    public void setMemberStats(String name, String stats) {
        memberStats.put(normalizeName(name), stats);
    }

    /** Get ISPF statistics for a member */
    public String getMemberStats(String name) {
        return memberStats.get(normalizeName(name));
    }

    /** Get timestamp for a member */
    public Long getMemberTimestamp(String name) {
        return memberTimestamps.get(normalizeName(name));
    }

    /** Search members by content pattern */
    public List<String> searchMembers(String pattern) {
        List<String> results = new ArrayList<>();
        String upper = pattern.toUpperCase();
        for (Map.Entry<String, List<String>> entry : members.entrySet()) {
            for (String line : entry.getValue()) {
                if (line.toUpperCase().contains(upper)) {
                    results.add(entry.getKey());
                    break;
                }
            }
        }
        Collections.sort(results);
        return results;
    }

    /** Normalize member name: uppercase, trim, max 8 chars */
    private String normalizeName(String name) {
        String n = name.toUpperCase().trim();
        return n.length() > 8 ? n.substring(0, 8) : n;
    }
}
