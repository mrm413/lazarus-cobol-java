package com.lazarus.cobol.jcl.batch;

import java.util.*;
import java.util.stream.*;

/**
 * DFSORT — IBM's sort/merge/copy utility.
 *
 * Control statements (from SYSIN):
 *   SORT FIELDS=(pos,len,format,order,...)    — sort specification
 *   MERGE FIELDS=(pos,len,format,order,...)   — merge specification
 *   INCLUDE COND=(pos,len,format,op,value)    — include filter
 *   OMIT COND=(pos,len,format,op,value)       — omit filter
 *   OUTREC FIELDS=(pos,len,...)               — output field reformatting
 *   SUM FIELDS=(pos,len,...)                  — summarize (deduplicate with sum)
 *   OPTION COPY                               — copy without sorting
 *   RECORD TYPE=F,LENGTH=nn                   — record format
 *
 * DDs:
 *   SORTIN  — input dataset
 *   SORTOUT — output dataset
 *   SYSIN   — control statements
 *   SORTINnn — merge inputs (01-16)
 *   SYSPRINT — messages
 */
public class DfsortProgram extends BatchProgram {

    private String[] sortKeySpecs;
    private List<String> inputFiles = new ArrayList<>();
    private String outputFile;
    private boolean duplicatesInOrder;
    private List<String> inputRecords;
    private List<String> outputRecords;

    /** COBOL SORT API: set sort keys as "FIELD:A" or "FIELD:D" */
    public void setSortKeys(String[] keys) { this.sortKeySpecs = keys; }

    /** COBOL SORT API: add input file (SORT USING) */
    public void addInputFile(String name) { inputFiles.add(name); }

    /** COBOL SORT API: set output file (SORT GIVING) */
    public void setOutputFile(String name) { this.outputFile = name; }

    /** COBOL SORT API: preserve duplicate order */
    public void setDuplicatesInOrder(boolean b) { this.duplicatesInOrder = b; }

    /** COBOL SORT API: begin input procedure phase */
    public void beginInputPhase() { inputRecords = new ArrayList<>(); }

    /** COBOL SORT API: RELEASE record to sort */
    public void release(String record) { if (inputRecords != null) inputRecords.add(record); }

    /** COBOL SORT API: end input procedure phase */
    public void endInputPhase() { /* records collected, sort will happen in execute */ }

    /** COBOL SORT API: begin output procedure phase */
    public void beginOutputPhase() {
        if (outputRecords == null) outputRecords = new ArrayList<>();
    }

    /** COBOL SORT API: end output procedure phase (no-op; records already consumed by returnRecord) */
    public void endOutputPhase() { /* output phase ended */ }

    /** COBOL SORT API: RETURN record from sort */
    public String returnRecord() {
        if (outputRecords != null && !outputRecords.isEmpty()) return outputRecords.remove(0);
        return null;
    }

    /** COBOL SORT API: RELEASE record to sort  */
    public void releaseRecord(String record) { release(record); }

    /** COBOL MERGE API: flag this instance as a merge operation (no-op; run() auto-detects) */
    public void setMergeMode(boolean isMerge) { /* merge detected via MERGE FIELDS in control statements */ }

    /** COBOL SORT API: execute sort with USING/GIVING files */
    public void execute() {
        List<String> records;
        if (inputRecords != null) {
            records = inputRecords;
        } else {
            records = new ArrayList<>();
            for (String fname : inputFiles) {
                java.io.File f = new java.io.File(fname);
                if (f.exists()) {
                    try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(f))) {
                        String line;
                        while ((line = br.readLine()) != null) records.add(line);
                    } catch (Exception e) { /* skip */ }
                }
            }
        }

        if (sortKeySpecs != null && sortKeySpecs.length > 0) {
            records.sort((a, b) -> {
                for (String spec : sortKeySpecs) {
                    String[] p = spec.split(":");
                    boolean desc = p.length > 1 && p[1].equalsIgnoreCase("D");
                    int cmp = a.compareTo(b);
                    if (cmp != 0) return desc ? -cmp : cmp;
                }
                return 0;
            });
        }

        if (outputFile != null) {
            try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(outputFile))) {
                for (String rec : records) pw.println(rec);
            } catch (Exception e) { /* skip */ }
        } else {
            outputRecords = records;
        }
    }

    @Override
    public void run() {
        List<String> sysin = readSysin();
        String joined = joinContinuations(sysin);

        boolean isCopy = joined.toUpperCase().contains("OPTION COPY");
        boolean isMerge = joined.toUpperCase().contains("MERGE FIELDS");

        // Read input records
        List<String> records;
        if (isMerge) {
            records = readMergeInputs();
        } else {
            records = readDD("SORTIN");
        }

        if (records.isEmpty() && !isCopy) {
            sysprint("DFSORT: No input records");
            returnCode = 0;
            return;
        }

        // Apply INCLUDE/OMIT filters
        String includeCond = extractStatement(joined, "INCLUDE");
        String omitCond = extractStatement(joined, "OMIT");
        if (!includeCond.isEmpty()) {
            records = applyFilter(records, includeCond, false);
        }
        if (!omitCond.isEmpty()) {
            records = applyFilter(records, omitCond, true);
        }

        // Sort or merge
        if (!isCopy) {
            String sortFields = extractStatement(joined, isMerge ? "MERGE" : "SORT");
            if (!sortFields.isEmpty()) {
                records = sortRecords(records, sortFields);
            }
        }

        // SUM — deduplicate + sum numeric fields
        String sumFields = extractStatement(joined, "SUM");
        if (!sumFields.isEmpty()) {
            records = applySumFields(records, sumFields, extractStatement(joined, isMerge ? "MERGE" : "SORT"));
        }

        // OUTREC — reformat output
        String outrecFields = extractStatement(joined, "OUTREC");
        if (!outrecFields.isEmpty()) {
            records = applyOutrec(records, outrecFields);
        }

        // Write output
        writeDD("SORTOUT", records);
        sysprint(String.format("DFSORT: %d records written to SORTOUT", records.size()));
    }

    /** Join continuation lines (lines starting with spaces are continuations) */
    private String joinContinuations(List<String> lines) {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            String trimmed = line.trim();
            if (trimmed.isEmpty() || trimmed.startsWith("*")) continue;
            if (sb.length() > 0 && (line.startsWith(" ") || line.startsWith("\t"))) {
                sb.append(" ").append(trimmed);
            } else {
                if (sb.length() > 0) sb.append("\n");
                sb.append(trimmed);
            }
        }
        return sb.toString();
    }

    /** Extract a DFSORT statement: KEYWORD FIELDS=(...) or KEYWORD COND=(...) */
    private String extractStatement(String text, String keyword) {
        String upper = text.toUpperCase();
        int idx = upper.indexOf(keyword.toUpperCase());
        if (idx < 0) return "";
        String rest = text.substring(idx + keyword.length()).trim();
        // Look for FIELDS= or COND=
        for (String key : new String[]{"FIELDS", "COND"}) {
            int ki = rest.toUpperCase().indexOf(key + "=");
            if (ki >= 0) {
                String after = rest.substring(ki + key.length() + 1).trim();
                return extractParenContent(after);
            }
        }
        return rest.split("\\s")[0];
    }

    /** Extract parenthesized content, handling nesting */
    private String extractParenContent(String text) {
        if (!text.startsWith("(")) return text.split("[,\\s]")[0];
        int depth = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') depth++;
            else if (text.charAt(i) == ')') {
                depth--;
                if (depth == 0) return text.substring(1, i);
            }
        }
        return text.substring(1);
    }

    /** Sort records by SORT FIELDS specification */
    private List<String> sortRecords(List<String> records, String fieldsSpec) {
        List<SortKey> keys = parseSortKeys(fieldsSpec);
        if (keys.isEmpty()) return records;

        List<String> sorted = new ArrayList<>(records);
        sorted.sort((a, b) -> {
            for (SortKey key : keys) {
                int cmp = compareByKey(a, b, key);
                if (cmp != 0) return cmp;
            }
            return 0;
        });
        return sorted;
    }

    /** Parse sort keys from: pos,len,format,order,pos,len,format,order,... */
    private List<SortKey> parseSortKeys(String spec) {
        List<String> parts = parseParenList("(" + spec + ")");
        List<SortKey> keys = new ArrayList<>();
        for (int i = 0; i + 3 < parts.size(); i += 4) {
            try {
                int pos = Integer.parseInt(parts.get(i).trim());
                int len = Integer.parseInt(parts.get(i + 1).trim());
                String fmt = parts.get(i + 2).trim().toUpperCase();
                String ord = parts.get(i + 3).trim().toUpperCase();
                keys.add(new SortKey(pos, len, fmt, ord.startsWith("D")));
            } catch (NumberFormatException e) {
                // Skip malformed key
            }
        }
        return keys;
    }

    /** Compare two records by a sort key */
    private int compareByKey(String a, String b, SortKey key) {
        String fa = extractField(a, key.pos, key.len);
        String fb = extractField(b, key.pos, key.len);
        int cmp;
        if (key.isNumeric()) {
            try {
                double da = Double.parseDouble(fa.trim());
                double db = Double.parseDouble(fb.trim());
                cmp = Double.compare(da, db);
            } catch (NumberFormatException e) {
                cmp = fa.compareTo(fb);
            }
        } else {
            cmp = fa.compareTo(fb);
        }
        return key.descending ? -cmp : cmp;
    }

    /** Extract a fixed-position field from a record (1-based position) */
    private String extractField(String record, int pos, int len) {
        int start = pos - 1; // Convert to 0-based
        if (start >= record.length()) return padRight("", len);
        int end = Math.min(start + len, record.length());
        return padRight(record.substring(start, end), len);
    }

    /** Apply INCLUDE/OMIT filter */
    private List<String> applyFilter(List<String> records, String condSpec, boolean isOmit) {
        List<FilterCondition> conds = parseFilterConditions(condSpec);
        return records.stream().filter(rec -> {
            boolean match = evaluateConditions(rec, conds);
            return isOmit ? !match : match;
        }).collect(Collectors.toList());
    }

    /** Parse filter conditions: pos,len,format,op,value,AND/OR,pos,len,... */
    private List<FilterCondition> parseFilterConditions(String spec) {
        List<String> parts = parseParenList("(" + spec + ")");
        List<FilterCondition> conds = new ArrayList<>();
        int i = 0;
        while (i + 4 < parts.size()) {
            try {
                int pos = Integer.parseInt(parts.get(i).trim());
                int len = Integer.parseInt(parts.get(i + 1).trim());
                String fmt = parts.get(i + 2).trim().toUpperCase();
                String op = parts.get(i + 3).trim().toUpperCase();
                String val = parts.get(i + 4).trim();
                if (val.startsWith("'") && val.endsWith("'")) val = val.substring(1, val.length() - 1);
                conds.add(new FilterCondition(pos, len, fmt, op, val));
                i += 5;
                // Check for AND/OR
                if (i < parts.size()) {
                    String conj = parts.get(i).trim().toUpperCase();
                    if ("AND".equals(conj) || "OR".equals(conj)) {
                        if (!conds.isEmpty()) conds.get(conds.size() - 1).conjunction = conj;
                        i++;
                    }
                }
            } catch (NumberFormatException e) {
                i++;
            }
        }
        return conds;
    }

    /** Evaluate filter conditions against a record */
    private boolean evaluateConditions(String rec, List<FilterCondition> conds) {
        if (conds.isEmpty()) return true;
        boolean result = evaluateOne(rec, conds.get(0));
        for (int i = 1; i < conds.size(); i++) {
            boolean next = evaluateOne(rec, conds.get(i));
            String conj = conds.get(i - 1).conjunction;
            if ("OR".equals(conj)) {
                result = result || next;
            } else {
                result = result && next;
            }
        }
        return result;
    }

    /** Evaluate one filter condition */
    private boolean evaluateOne(String rec, FilterCondition cond) {
        String field = extractField(rec, cond.pos, cond.len).trim();
        String val = cond.value.trim();
        int cmp;
        if (cond.isNumeric()) {
            try {
                cmp = Double.compare(Double.parseDouble(field), Double.parseDouble(val));
            } catch (NumberFormatException e) {
                cmp = field.compareTo(val);
            }
        } else {
            cmp = field.compareTo(val);
        }
        switch (cond.op) {
            case "EQ": return cmp == 0;
            case "NE": return cmp != 0;
            case "GT": return cmp > 0;
            case "GE": return cmp >= 0;
            case "LT": return cmp < 0;
            case "LE": return cmp <= 0;
            default: return false;
        }
    }

    /** Apply SUM FIELDS — deduplicate on sort keys, sum specified fields */
    private List<String> applySumFields(List<String> records, String sumSpec, String sortSpec) {
        if (records.isEmpty()) return records;
        List<SortKey> sortKeys = parseSortKeys(sortSpec);
        List<SortKey> sumKeys = parseSortKeys(sumSpec);

        // SUM FIELDS=NONE means just deduplicate (remove adjacent dups)
        boolean sumNone = sumSpec.trim().equalsIgnoreCase("NONE");

        List<String> result = new ArrayList<>();
        String prev = null;
        for (String rec : records) {
            if (prev == null) {
                prev = rec;
                continue;
            }
            boolean sameGroup = true;
            for (SortKey key : sortKeys) {
                if (!extractField(prev, key.pos, key.len).equals(extractField(rec, key.pos, key.len))) {
                    sameGroup = false;
                    break;
                }
            }
            if (sameGroup && !sumNone) {
                // Sum the numeric fields
                char[] merged = prev.toCharArray();
                for (SortKey sk : sumKeys) {
                    try {
                        long a = Long.parseLong(extractField(prev, sk.pos, sk.len).trim());
                        long b = Long.parseLong(extractField(rec, sk.pos, sk.len).trim());
                        String sum = padLeft(String.valueOf(a + b), sk.len);
                        int start = sk.pos - 1;
                        for (int i = 0; i < sk.len && start + i < merged.length; i++) {
                            merged[start + i] = i < sum.length() ? sum.charAt(i) : ' ';
                        }
                    } catch (NumberFormatException e) { /* skip */ }
                }
                prev = new String(merged);
            } else if (sameGroup) {
                // NONE: skip duplicate
                continue;
            } else {
                result.add(prev);
                prev = rec;
            }
        }
        if (prev != null) result.add(prev);
        return result;
    }

    /** Apply OUTREC FIELDS — reformat output records */
    private List<String> applyOutrec(List<String> records, String fieldsSpec) {
        List<OutrecField> fields = parseOutrecFields(fieldsSpec);
        if (fields.isEmpty()) return records;

        return records.stream().map(rec -> {
            StringBuilder out = new StringBuilder();
            for (OutrecField f : fields) {
                if (f.literal != null) {
                    out.append(f.literal);
                } else {
                    out.append(extractField(rec, f.pos, f.len));
                }
            }
            return out.toString();
        }).collect(Collectors.toList());
    }

    /** Parse OUTREC fields: pos,len,pos,len,'literal',... */
    private List<OutrecField> parseOutrecFields(String spec) {
        List<String> parts = parseParenList("(" + spec + ")");
        List<OutrecField> fields = new ArrayList<>();
        int i = 0;
        while (i < parts.size()) {
            String p = parts.get(i).trim();
            if (p.startsWith("'") || p.startsWith("C'") || p.startsWith("X'")) {
                // Literal
                String lit = p;
                if (lit.startsWith("C'")) lit = lit.substring(2);
                else if (lit.startsWith("'")) lit = lit.substring(1);
                if (lit.endsWith("'")) lit = lit.substring(0, lit.length() - 1);
                fields.add(new OutrecField(lit));
                i++;
            } else {
                try {
                    int pos = Integer.parseInt(p);
                    int len = (i + 1 < parts.size()) ? Integer.parseInt(parts.get(i + 1).trim()) : 1;
                    fields.add(new OutrecField(pos, len));
                    i += 2;
                } catch (NumberFormatException e) {
                    i++;
                }
            }
        }
        return fields;
    }

    /** Read merge inputs from SORTIN01-SORTIN16 */
    private List<String> readMergeInputs() {
        List<String> all = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            String ddName = String.format("SORTIN%02d", i);
            List<String> recs = readDD(ddName);
            all.addAll(recs);
        }
        if (all.isEmpty()) {
            // Fall back to SORTIN
            all.addAll(readDD("SORTIN"));
        }
        return all;
    }

    private String padRight(String s, int len) {
        if (s.length() >= len) return s.substring(0, len);
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < len) sb.append(' ');
        return sb.toString();
    }

    private String padLeft(String s, int len) {
        if (s.length() >= len) return s.substring(s.length() - len);
        StringBuilder sb = new StringBuilder();
        while (sb.length() + s.length() < len) sb.append(' ');
        sb.append(s);
        return sb.toString();
    }

    // --- Inner data classes ---

    private static class SortKey {
        final int pos, len;
        final String format;
        final boolean descending;
        SortKey(int pos, int len, String format, boolean desc) {
            this.pos = pos; this.len = len; this.format = format; this.descending = desc;
        }
        boolean isNumeric() {
            return "ZD".equals(format) || "PD".equals(format) || "BI".equals(format)
                || "FI".equals(format) || "FL".equals(format);
        }
    }

    private static class FilterCondition {
        final int pos, len;
        final String format, op, value;
        String conjunction = "AND";
        FilterCondition(int pos, int len, String fmt, String op, String val) {
            this.pos = pos; this.len = len; this.format = fmt; this.op = op; this.value = val;
        }
        boolean isNumeric() {
            return "ZD".equals(format) || "PD".equals(format) || "BI".equals(format)
                || "FI".equals(format) || "FL".equals(format);
        }
    }

    private static class OutrecField {
        final int pos, len;
        final String literal;
        OutrecField(int pos, int len) { this.pos = pos; this.len = len; this.literal = null; }
        OutrecField(String literal) { this.pos = 0; this.len = 0; this.literal = literal; }
    }
}
