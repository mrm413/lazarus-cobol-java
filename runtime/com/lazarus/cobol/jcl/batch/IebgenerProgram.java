package com.lazarus.cobol.jcl.batch;

import java.util.*;
import java.util.stream.*;

/**
 * IEBGENER — IBM dataset copy/reformat utility.
 *
 * Basic operation: copies SYSUT1 to SYSUT2.
 *
 * Control statements (from SYSIN):
 *   GENERATE MAXFLDS=n,MAXLITS=n       — enable reformatting
 *   RECORD FIELD=(len,inpos,,outpos)    — field selection/reorder
 *   RECORD FIELD=(len,'literal',,outpos) — insert literal
 *   LABELS DATA=NO                      — suppress header/trailer labels
 *   MEMBER NAME=(newname,,oldname)      — rename member (PDS context)
 *
 * DDs:
 *   SYSUT1   — input dataset
 *   SYSUT2   — output dataset
 *   SYSIN    — control statements (DD DUMMY for simple copy)
 *   SYSPRINT — messages
 */
public class IebgenerProgram extends BatchProgram {

    @Override
    public void run() {
        List<String> sysin = readSysin();
        List<String> input = readDD("SYSUT1");

        if (input.isEmpty()) {
            sysprint("IEBGENER: No input records in SYSUT1");
            writeDD("SYSUT2", Collections.emptyList());
            return;
        }

        // Check for GENERATE/RECORD reformatting
        List<RecordField> fields = parseRecordFields(sysin);

        List<String> output;
        if (fields.isEmpty()) {
            // Simple copy
            output = input;
        } else {
            output = reformatRecords(input, fields);
        }

        writeDD("SYSUT2", output);
        sysprint(String.format("IEBGENER: %d records copied from SYSUT1 to SYSUT2", output.size()));
    }

    /** Parse RECORD FIELD= statements from SYSIN */
    private List<RecordField> parseRecordFields(List<String> sysin) {
        List<RecordField> fields = new ArrayList<>();
        for (String line : sysin) {
            String upper = line.trim().toUpperCase();
            if (!upper.startsWith("RECORD")) continue;
            // Can have multiple FIELD= on one line
            String rest = line.trim();
            int idx;
            while ((idx = rest.toUpperCase().indexOf("FIELD=")) >= 0) {
                rest = rest.substring(idx + 6);
                if (rest.startsWith("(")) {
                    int depth = 0;
                    int end = 0;
                    for (int i = 0; i < rest.length(); i++) {
                        if (rest.charAt(i) == '(') depth++;
                        else if (rest.charAt(i) == ')') {
                            depth--;
                            if (depth == 0) { end = i; break; }
                        }
                    }
                    String spec = rest.substring(1, end);
                    parseOneField(spec, fields);
                    rest = rest.substring(end + 1);
                } else {
                    break;
                }
            }
        }
        return fields;
    }

    /** Parse one FIELD=(len,inpos_or_literal,,outpos) */
    private void parseOneField(String spec, List<RecordField> fields) {
        // Split on commas, respecting quoted literals
        List<String> parts = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        boolean inQuote = false;
        for (char c : spec.toCharArray()) {
            if (c == '\'' && !inQuote) { inQuote = true; cur.append(c); }
            else if (c == '\'' && inQuote) { inQuote = false; cur.append(c); }
            else if (c == ',' && !inQuote) { parts.add(cur.toString().trim()); cur = new StringBuilder(); }
            else cur.append(c);
        }
        if (cur.length() > 0) parts.add(cur.toString().trim());

        if (parts.size() < 1) return;

        int len = 0;
        try { len = Integer.parseInt(parts.get(0)); } catch (NumberFormatException e) { return; }

        String source = parts.size() > 1 ? parts.get(1).trim() : "";
        // Skip empty third param (conversion)
        String outPosStr = parts.size() > 3 ? parts.get(3).trim() : (parts.size() > 2 ? parts.get(2).trim() : "");
        if (outPosStr.isEmpty() && parts.size() > 2) outPosStr = parts.get(2).trim();

        int outPos = 1;
        try { if (!outPosStr.isEmpty()) outPos = Integer.parseInt(outPosStr); } catch (NumberFormatException e) {}

        if (source.startsWith("'") && source.endsWith("'")) {
            // Literal
            String lit = source.substring(1, source.length() - 1);
            fields.add(new RecordField(lit, outPos, len));
        } else {
            // Field copy
            int inPos = 1;
            try { inPos = Integer.parseInt(source); } catch (NumberFormatException e) {}
            fields.add(new RecordField(inPos, outPos, len));
        }
    }

    /** Reformat records using FIELD specifications */
    private List<String> reformatRecords(List<String> input, List<RecordField> fields) {
        // Find max output position to size records
        int maxOut = 0;
        for (RecordField f : fields) {
            maxOut = Math.max(maxOut, f.outPos + f.len - 1);
        }
        final int recLen = maxOut;

        return input.stream().map(rec -> {
            char[] out = new char[recLen];
            Arrays.fill(out, ' ');
            for (RecordField f : fields) {
                int oStart = f.outPos - 1;
                if (f.literal != null) {
                    for (int i = 0; i < f.len && oStart + i < out.length; i++) {
                        out[oStart + i] = i < f.literal.length() ? f.literal.charAt(i) : ' ';
                    }
                } else {
                    int iStart = f.inPos - 1;
                    for (int i = 0; i < f.len && oStart + i < out.length; i++) {
                        out[oStart + i] = (iStart + i < rec.length()) ? rec.charAt(iStart + i) : ' ';
                    }
                }
            }
            return new String(out);
        }).collect(Collectors.toList());
    }

    private static class RecordField {
        final int inPos, outPos, len;
        final String literal;
        RecordField(int inPos, int outPos, int len) {
            this.inPos = inPos; this.outPos = outPos; this.len = len; this.literal = null;
        }
        RecordField(String literal, int outPos, int len) {
            this.inPos = 0; this.outPos = outPos; this.len = len; this.literal = literal;
        }
    }
}
