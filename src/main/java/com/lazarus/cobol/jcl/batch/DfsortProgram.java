package com.lazarus.cobol.jcl.batch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * DFSORT/SYNCSORT runtime for transpiled COBOL SORT/MERGE verbs.
 * Provides in-memory sort/merge of record collections using the INPUT/OUTPUT PROCEDURE model.
 */
public class DfsortProgram {
    private String[] sortKeys = {};
    private List<String> inputFiles = new ArrayList<>();
    private String outputFile = "";
    private boolean mergeMode = false;
    private List<String> records = new ArrayList<>();
    private int returnIndex = 0;

    public void setSortKeys(String[] keys) {
        this.sortKeys = keys != null ? keys : new String[0];
    }

    public void addInputFile(String file) {
        if (file != null) inputFiles.add(file);
    }

    public void setOutputFile(String file) {
        this.outputFile = file != null ? file : "";
    }

    public void setMergeMode(boolean merge) {
        this.mergeMode = merge;
    }

    /** Called from INPUT PROCEDURE to add a record to the sort work file. */
    public void releaseRecord(String record) {
        if (record != null) records.add(record);
    }

    /** Called from OUTPUT PROCEDURE to retrieve sorted records one at a time. Returns null when exhausted. */
    public String returnRecord() {
        if (returnIndex < records.size()) {
            return records.get(returnIndex++);
        }
        return null;
    }

    /** Execute the sort or merge. After this call, records are in sorted order for returnRecord(). */
    public void execute() {
        if (sortKeys.length == 0) {
            Collections.sort(records);
        } else {
            records.sort(buildComparator());
        }
        returnIndex = 0;
    }

    private Comparator<String> buildComparator() {
        return (a, b) -> {
            for (String key : sortKeys) {
                String[] parts = key.split(":");
                boolean ascending = parts.length < 2 || parts[1].equalsIgnoreCase("A");
                int cmp = a.compareTo(b);
                if (cmp != 0) return ascending ? cmp : -cmp;
            }
            return 0;
        };
    }
}
