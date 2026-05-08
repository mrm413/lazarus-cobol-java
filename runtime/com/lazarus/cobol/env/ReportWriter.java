package com.lazarus.cobol.env;

import java.util.*;

/**
 * COBOL Report Writer facility .
 *
 * Maps to COBOL REPORT SECTION:
 *   RD report-name
 *     CONTROL IS field-1, field-2 ...   (or FINAL)
 *     PAGE LIMIT IS nn LINES
 *     HEADING n  FIRST DETAIL n  LAST DETAIL n  FOOTING n
 *
 *   01 type-entry TYPE IS RH/PH/DE/CH/CF/PF/RF
 *     LINE NUMBER ...
 *     COLUMN NUMBER ...
 *     SOURCE IS field
 *     SUM field
 *     GROUP INDICATE
 *
 * Verbs:
 *   INITIATE report-name
 *   GENERATE detail-or-summary
 *   TERMINATE report-name
 *
 * This implementation supports:
 *   - Report definition (RD) with page layout
 *   - Control break hierarchy (FINAL + up to 10 control fields)
 *   - Report groups: RH, PH, CH, DE, CF, PF, RF
 *   - GENERATE with automatic control break detection
 *   - SUM counters for control footing totals
 *   - LINE-COUNTER and PAGE-COUNTER special registers
 *   - Page overflow with automatic heading
 */
public class ReportWriter {

    public enum GroupType {
        RH,  // Report Heading (once at start)
        PH,  // Page Heading (each page)
        CH,  // Control Heading (on control break — new group)
        DE,  // Detail line
        CF,  // Control Footing (on control break — end of group)
        PF,  // Page Footing (each page)
        RF   // Report Footing (once at end)
    }

    // --- Report Definition ---

    private String reportName;
    private int pageLimit = 60;       // PAGE LIMIT
    private int headingLine = 1;      // HEADING
    private int firstDetailLine = 1;  // FIRST DETAIL
    private int lastDetailLine = 60;  // LAST DETAIL
    private int footingLine = 60;     // FOOTING

    // Control fields (first = highest level; "FINAL" is implicit top level)
    private final List<String> controlFields = new ArrayList<>();
    // Previous values for control break detection
    private final Map<String, String> previousValues = new LinkedHashMap<>();

    // Report groups
    private final List<ReportGroup> groups = new ArrayList<>();

    // Page counters
    private int lineCounter = 0;
    private int pageCounter = 0;

    // SUM accumulators: field → accumulated value
    private final Map<String, Double> sumCounters = new LinkedHashMap<>();
    // Per-control-level SUM accumulators: "field:controlField" → value
    private final Map<String, Double> controlSums = new LinkedHashMap<>();

    // Output buffer (all generated lines)
    private final List<String> output = new ArrayList<>();

    // USE BEFORE REPORTING callbacks: group name → callback
    private final Map<String, Runnable> beforeReportingCallbacks = new LinkedHashMap<>();

    // State
    private boolean initiated = false;
    private boolean firstRecord = true;
    private int recordCount = 0;

    // --- Report Group ---

    public static class ReportGroup {
        public final String name;
        public final GroupType type;
        public final String controlField; // for CH/CF only
        public final int lineNumber;
        private final List<ReportField> fields = new ArrayList<>();

        public ReportGroup(String name, GroupType type, String controlField, int line) {
            this.name = name;
            this.type = type;
            this.controlField = controlField;
            this.lineNumber = line;
        }

        public ReportGroup addField(String name, int column, int size, String source) {
            fields.add(new ReportField(name, column, size, source, false));
            return this;
        }

        public ReportGroup addField(String name, int column, int size, String source, boolean isSum) {
            fields.add(new ReportField(name, column, size, source, isSum));
            return this;
        }

        public ReportGroup addLiteral(int column, String text) {
            fields.add(new ReportField(null, column, text.length(), "@LIT:" + text, false));
            return this;
        }

        public List<ReportField> getFields() { return Collections.unmodifiableList(fields); }
    }

    public static class ReportField {
        public final String name;
        public final int column;
        public final int size;
        public final String source; // field name or "@LIT:text"
        public final boolean isSum;

        public ReportField(String name, int column, int size, String source, boolean isSum) {
            this.name = name;
            this.column = column;
            this.size = size;
            this.source = source;
            this.isSum = isSum;
        }
    }

    // --- Construction ---

    public ReportWriter(String name) {
        this.reportName = name;
    }

    public ReportWriter pageLimit(int limit) { this.pageLimit = limit; return this; }
    public ReportWriter heading(int line) { this.headingLine = line; return this; }
    public ReportWriter firstDetail(int line) { this.firstDetailLine = line; return this; }
    public ReportWriter lastDetail(int line) { this.lastDetailLine = line; return this; }
    public ReportWriter footing(int line) { this.footingLine = line; return this; }

    public ReportWriter control(String... fields) {
        for (String f : fields) controlFields.add(f.toUpperCase());
        return this;
    }

    /**
     * Register a USE BEFORE REPORTING callback for a named report group.
     * The callback is invoked just before the group's line is generated.
     */
    public ReportWriter beforeReporting(String groupName, Runnable callback) {
        beforeReportingCallbacks.put(groupName.toUpperCase(), callback);
        return this;
    }

    public ReportGroup addGroup(String name, GroupType type) {
        return addGroup(name, type, null, 0);
    }

    public ReportGroup addGroup(String name, GroupType type, String controlField, int line) {
        ReportGroup group = new ReportGroup(name, type,
            controlField != null ? controlField.toUpperCase() : null, line);
        groups.add(group);
        return group;
    }

    // --- INITIATE ---

    public void initiate() {
        output.clear();
        lineCounter = 0;
        pageCounter = 0;
        sumCounters.clear();
        controlSums.clear();
        previousValues.clear();
        firstRecord = true;
        recordCount = 0;
        initiated = true;

        // Generate Report Heading
        for (ReportGroup g : groups) {
            if (g.type == GroupType.RH) {
                generateGroup(g, Collections.<String, String>emptyMap());
            }
        }

        // Start first page
        newPage(Collections.<String, String>emptyMap());
    }

    // --- GENERATE ---

    /** GENERATE with no record data (uses empty map) */
    public void generate() {
        generate(new java.util.HashMap<>());
    }

    /** GENERATE a specific named group (COBOL: GENERATE group-name).
     *  Fires USE BEFORE REPORTING callback if registered. */
    public void generate(String groupName) {
        if (!initiated) return;
        recordCount++;
        // Fire the before-reporting callback for this group
        Runnable cb = beforeReportingCallbacks.get(groupName.toUpperCase());
        if (cb != null) {
            cb.run();
        }
        // Try to find and generate the named group
        for (ReportGroup g : groups) {
            if (g.name.equalsIgnoreCase(groupName)) {
                generateGroup(g, new java.util.HashMap<>());
                return;
            }
        }
        // Group not found in registered groups — callback already fired above
    }

    public void generate(Map<String, String> record) {
        if (!initiated) return;
        recordCount++;

        // Check for control breaks
        if (!firstRecord) {
            List<String> brokenFields = detectControlBreaks(record);
            if (!brokenFields.isEmpty()) {
                processControlBreaks(brokenFields, record);
            }
        }

        // Check page overflow before detail
        if (lineCounter >= lastDetailLine) {
            pageFooting(record);
            newPage(record);
        }

        // Generate detail lines
        for (ReportGroup g : groups) {
            if (g.type == GroupType.DE) {
                generateGroup(g, record);
            }
        }

        // Accumulate SUM fields
        accumulateSums(record);

        // Save current values for next control break check
        for (String cf : controlFields) {
            previousValues.put(cf, record.get(cf));
        }
        firstRecord = false;
    }

    /** GENERATE summary (no detail, just trigger control processing) */
    public void generateSummary(Map<String, String> record) {
        if (!initiated) return;
        recordCount++;

        if (!firstRecord) {
            List<String> brokenFields = detectControlBreaks(record);
            if (!brokenFields.isEmpty()) {
                processControlBreaks(brokenFields, record);
            }
        }

        accumulateSums(record);
        for (String cf : controlFields) {
            previousValues.put(cf, record.get(cf));
        }
        firstRecord = false;
    }

    // --- TERMINATE ---

    public void terminate() {
        if (!initiated) return;

        // Final control footings (all levels)
        if (!firstRecord) {
            for (int i = controlFields.size() - 1; i >= 0; i--) {
                for (ReportGroup g : groups) {
                    if (g.type == GroupType.CF && controlFields.get(i).equals(g.controlField)) {
                        generateGroup(g, previousValues.isEmpty()
                            ? Collections.<String, String>emptyMap() : previousValues);
                    }
                }
            }
            // FINAL control footing
            for (ReportGroup g : groups) {
                if (g.type == GroupType.CF && "FINAL".equals(g.controlField)) {
                    generateGroup(g, Collections.<String, String>emptyMap());
                }
            }
        }

        // Page Footing
        pageFooting(Collections.<String, String>emptyMap());

        // Report Footing
        for (ReportGroup g : groups) {
            if (g.type == GroupType.RF) {
                generateGroup(g, Collections.<String, String>emptyMap());
            }
        }

        // Fire any registered BEFORE REPORTING callbacks for groups not formally registered
        // (e.g., FINAL-FOOTING declaratives when no addGroup() calls were made)
        Set<String> registeredGroupNames = new HashSet<>();
        for (ReportGroup g : groups) registeredGroupNames.add(g.name.toUpperCase());
        for (Map.Entry<String, Runnable> entry : beforeReportingCallbacks.entrySet()) {
            if (!registeredGroupNames.contains(entry.getKey())) {
                // Only fire footing/final callbacks during terminate (not detail callbacks)
                String name = entry.getKey();
                if (name.contains("FINAL") || name.contains("FOOTING") || name.contains("RF")) {
                    entry.getValue().run();
                }
            }
        }

        initiated = false;
    }

    // --- Output ---

    public List<String> getOutput() { return Collections.unmodifiableList(output); }
    public int getLineCounter() { return lineCounter; }
    public int getPageCounter() { return pageCounter; }
    public int getRecordCount() { return recordCount; }
    public String getReportName() { return reportName; }

    /** Get SUM value for a field */
    public double getSum(String field) {
        Double v = sumCounters.get(field.toUpperCase());
        return v != null ? v : 0.0;
    }

    /** Get SUM value for a control-level field */
    public double getControlSum(String field, String controlField) {
        Double v = controlSums.get(field.toUpperCase() + ":" + controlField.toUpperCase());
        return v != null ? v : 0.0;
    }

    /** Get full report as string */
    public String getReportText() {
        StringBuilder sb = new StringBuilder();
        for (String line : output) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    // --- Internal ---

    private void newPage(Map<String, String> record) {
        pageCounter++;
        lineCounter = headingLine;

        // Page Heading
        for (ReportGroup g : groups) {
            if (g.type == GroupType.PH) {
                generateGroup(g, record);
            }
        }

        // Control Headings (if not first record)
        if (!firstRecord) {
            for (String cf : controlFields) {
                for (ReportGroup g : groups) {
                    if (g.type == GroupType.CH && cf.equals(g.controlField)) {
                        generateGroup(g, record);
                    }
                }
            }
        }

        if (lineCounter < firstDetailLine) {
            lineCounter = firstDetailLine;
        }
    }

    private void pageFooting(Map<String, String> record) {
        // Advance to footing line
        while (lineCounter < footingLine) {
            lineCounter++;
        }
        for (ReportGroup g : groups) {
            if (g.type == GroupType.PF) {
                generateGroup(g, record);
            }
        }
    }

    private List<String> detectControlBreaks(Map<String, String> record) {
        List<String> broken = new ArrayList<>();
        for (String cf : controlFields) {
            String prev = previousValues.get(cf);
            String curr = record.get(cf);
            if (prev == null && curr == null) continue;
            if (prev == null || curr == null || !prev.equals(curr)) {
                broken.add(cf);
            }
        }
        return broken;
    }

    private void processControlBreaks(List<String> brokenFields, Map<String, String> record) {
        // Determine highest break level
        int highestBreak = controlFields.size();
        for (String bf : brokenFields) {
            int idx = controlFields.indexOf(bf);
            if (idx >= 0 && idx < highestBreak) highestBreak = idx;
        }

        // Control footings (lowest level first, up to highest break)
        for (int i = controlFields.size() - 1; i >= highestBreak; i--) {
            String cf = controlFields.get(i);
            for (ReportGroup g : groups) {
                if (g.type == GroupType.CF && cf.equals(g.controlField)) {
                    generateGroup(g, previousValues);
                }
            }
            // Reset control-level sums
            resetControlSums(cf);
        }

        // Control headings (highest level first, down to lowest break)
        for (int i = highestBreak; i < controlFields.size(); i++) {
            String cf = controlFields.get(i);
            for (ReportGroup g : groups) {
                if (g.type == GroupType.CH && cf.equals(g.controlField)) {
                    generateGroup(g, record);
                }
            }
        }
    }

    private void generateGroup(ReportGroup group, Map<String, String> record) {
        // Invoke USE BEFORE REPORTING declarative callback if registered
        Runnable cb = beforeReportingCallbacks.get(group.name.toUpperCase());
        if (cb != null) {
            cb.run();
        }

        // Build the output line
        char[] line = new char[132]; // standard 132-column report
        Arrays.fill(line, ' ');

        for (ReportField field : group.getFields()) {
            String value;
            if (field.source != null && field.source.startsWith("@LIT:")) {
                value = field.source.substring(5);
            } else if (field.isSum && field.source != null) {
                // SUM field: get accumulated value
                String key = field.source.toUpperCase();
                if (group.controlField != null) {
                    Double cv = controlSums.get(key + ":" + group.controlField);
                    value = String.valueOf(cv != null ? cv : 0.0);
                } else {
                    value = String.valueOf(getSum(field.source));
                }
            } else if (field.source != null) {
                value = record.get(field.source);
                if (value == null) value = record.get(field.source.toUpperCase());
                if (value == null) value = "";
            } else {
                value = "";
            }

            // Special substitutions
            if ("PAGE-COUNTER".equals(field.source)) value = String.valueOf(pageCounter);
            if ("LINE-COUNTER".equals(field.source)) value = String.valueOf(lineCounter);
            if ("RECORD-COUNT".equals(field.source)) value = String.valueOf(recordCount);

            // Place value in line at column position
            int col = field.column - 1; // 1-based to 0-based
            if (col < 0) col = 0;
            int len = Math.min(value.length(), field.size);
            if (col + len > line.length) len = line.length - col;
            for (int i = 0; i < len; i++) {
                if (col + i < line.length) {
                    line[col + i] = value.charAt(i);
                }
            }
        }

        output.add(new String(line).replaceAll("\\s+$", "")); // trim trailing spaces
        lineCounter++;
    }

    private void accumulateSums(Map<String, String> record) {
        Set<String> accumulated = new HashSet<>();
        for (ReportGroup g : groups) {
            for (ReportField f : g.getFields()) {
                if (f.isSum && f.source != null) {
                    String key = f.source.toUpperCase();
                    // Only accumulate each field once per record (avoid double-counting
                    // when multiple groups reference the same SUM field)
                    if (accumulated.contains(key)) continue;
                    accumulated.add(key);
                    String valStr = record.get(key);
                    if (valStr == null) valStr = record.get(f.source);
                    if (valStr != null) {
                        try {
                            double val = Double.parseDouble(valStr.trim());
                            // Grand total
                            Double prev = sumCounters.get(key);
                            sumCounters.put(key, (prev != null ? prev : 0.0) + val);
                            // Per-control-level
                            for (String cf : controlFields) {
                                String ck = key + ":" + cf;
                                Double cprev = controlSums.get(ck);
                                controlSums.put(ck, (cprev != null ? cprev : 0.0) + val);
                            }
                        } catch (NumberFormatException e) { /* skip non-numeric */ }
                    }
                }
            }
        }
    }

    private void resetControlSums(String controlField) {
        Iterator<Map.Entry<String, Double>> it = controlSums.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> e = it.next();
            if (e.getKey().endsWith(":" + controlField)) {
                it.remove();
            }
        }
    }
}
