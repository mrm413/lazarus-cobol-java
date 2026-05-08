package com.lazarus.cobol.jcl.batch;

import java.util.*;
import java.util.stream.*;

/**
 * ICETOOL — IBM multi-purpose data processing utility.
 *
 * A wrapper around DFSORT operations that supports multiple operations
 * in a single invocation, with COUNT, SELECT, SORT, STATS, DISPLAY, SPLICE.
 *
 * Control statements (from TOOLIN DD):
 *   SORT FROM(indd) TO(outdd) USING(xxxx)
 *   COPY FROM(indd) TO(outdd)
 *   COUNT FROM(indd) [WRITE(outdd)]
 *   SELECT FROM(indd) TO(outdd) ON(pos,len,type) FIRST|LAST|HIGHER(n)|LOWER(n)|EQUAL(n)
 *   STATS FROM(indd) ON(pos,len,type) [WRITE(outdd)]
 *   DISPLAY FROM(indd) LIST(outdd) ON(pos,len,type) [HEADER('text')]
 *   SPLICE FROM(indd) TO(outdd) ON(pos,len) WITH(pos,len)
 *
 * DDs:
 *   TOOLIN   — control statements (like SYSIN for ICETOOL)
 *   TOOLMSG  — messages (like SYSPRINT)
 *   DFSMSG   — DFSORT messages
 *   user-defined DDs for FROM/TO references
 */
public class IcetoolProgram extends BatchProgram {

    @Override
    public void run() {
        // ICETOOL reads from TOOLIN, not SYSIN
        String inline = getInlineData("TOOLIN");
        List<String> toolin;
        if (!inline.isEmpty()) {
            toolin = Arrays.asList(inline.split("\\r?\\n"));
        } else {
            toolin = readDD("TOOLIN");
            if (toolin.isEmpty()) {
                // Fall back to SYSIN
                toolin = readSysin();
            }
        }

        for (String line : toolin) {
            String trimmed = line.trim();
            if (trimmed.isEmpty() || trimmed.startsWith("*")) continue;
            String upper = trimmed.toUpperCase();

            if (upper.startsWith("SORT")) {
                execSort(trimmed);
            } else if (upper.startsWith("COPY")) {
                execCopy(trimmed);
            } else if (upper.startsWith("COUNT")) {
                execCount(trimmed);
            } else if (upper.startsWith("SELECT")) {
                execSelect(trimmed);
            } else if (upper.startsWith("STATS")) {
                execStats(trimmed);
            } else if (upper.startsWith("DISPLAY")) {
                execDisplay(trimmed);
            } else if (upper.startsWith("SPLICE")) {
                execSplice(trimmed);
            }
        }
    }

    /** SORT FROM(dd) TO(dd) — delegates to DFSORT logic */
    private void execSort(String cmd) {
        String from = extractIcetoolParam(cmd, "FROM");
        String to = extractIcetoolParam(cmd, "TO");
        // Read USING(xxxx) — references DD xxxxCNTL for sort control
        String using = extractIcetoolParam(cmd, "USING");

        List<String> records = readDD(from);
        if (records.isEmpty()) {
            toolmsg("SORT: No records in " + from);
            return;
        }

        // Get sort control from USINGxxCNTL DD
        List<String> sortCtl = Collections.emptyList();
        if (!using.isEmpty()) {
            String ctlDD = using + "CNTL";
            String ctlInline = getInlineData(ctlDD);
            if (!ctlInline.isEmpty()) sortCtl = Arrays.asList(ctlInline.split("\\r?\\n"));
            else sortCtl = readDD(ctlDD);
        }

        // Simple sort if we have control statements
        if (!sortCtl.isEmpty()) {
            DfsortProgram dfsort = new DfsortProgram();
            // Set up DDs for DFSORT
            System.setProperty("DD.SORTIN", getDDPath(from));
            System.setProperty("DD.SORTOUT", getDDPath(to));
            String ctlJoined = String.join("\n", sortCtl);
            System.setProperty("DD.SYSIN.INLINE", ctlJoined);
            try {
                dfsort.run();
            } finally {
                System.clearProperty("DD.SORTIN");
                System.clearProperty("DD.SORTOUT");
                System.clearProperty("DD.SYSIN.INLINE");
            }
        } else {
            // Copy as-is
            writeDD(to, records);
        }
        toolmsg(String.format("SORT: %s → %s", from, to));
    }

    /** COPY FROM(dd) TO(dd) */
    private void execCopy(String cmd) {
        String from = extractIcetoolParam(cmd, "FROM");
        String to = extractIcetoolParam(cmd, "TO");
        List<String> records = readDD(from);
        writeDD(to, records);
        toolmsg(String.format("COPY: %d records from %s to %s", records.size(), from, to));
    }

    /** COUNT FROM(dd) — count records */
    private void execCount(String cmd) {
        String from = extractIcetoolParam(cmd, "FROM");
        String writeTo = extractIcetoolParam(cmd, "WRITE");
        List<String> records = readDD(from);
        int count = records.size();
        toolmsg(String.format("COUNT: %s has %d records", from, count));
        if (!writeTo.isEmpty()) {
            writeDD(writeTo, Collections.singletonList(String.valueOf(count)));
        }
    }

    /** SELECT FROM(dd) TO(dd) ON(pos,len,type) criteria */
    private void execSelect(String cmd) {
        String from = extractIcetoolParam(cmd, "FROM");
        String to = extractIcetoolParam(cmd, "TO");
        String onSpec = extractIcetoolParam(cmd, "ON");

        List<String> records = readDD(from);
        String upper = cmd.toUpperCase();

        if (onSpec.isEmpty() || records.isEmpty()) {
            writeDD(to, records);
            return;
        }

        // Parse ON(pos,len,type)
        List<String> onParts = parseParenList("(" + onSpec + ")");
        if (onParts.size() < 3) { writeDD(to, records); return; }

        int pos = Integer.parseInt(onParts.get(0).trim());
        int len = Integer.parseInt(onParts.get(1).trim());

        // Group records by key
        Map<String, List<String>> groups = new LinkedHashMap<>();
        for (String rec : records) {
            String key = extractField(rec, pos, len);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(rec);
        }

        List<String> result = new ArrayList<>();
        if (upper.contains("FIRST")) {
            groups.values().forEach(g -> result.add(g.get(0)));
        } else if (upper.contains("LAST")) {
            groups.values().forEach(g -> result.add(g.get(g.size() - 1)));
        } else if (upper.contains("HIGHER(")) {
            int threshold = extractIntParam(cmd, "HIGHER");
            groups.values().stream().filter(g -> g.size() > threshold).forEach(result::addAll);
        } else if (upper.contains("LOWER(")) {
            int threshold = extractIntParam(cmd, "LOWER");
            groups.values().stream().filter(g -> g.size() < threshold).forEach(result::addAll);
        } else if (upper.contains("EQUAL(")) {
            int threshold = extractIntParam(cmd, "EQUAL");
            groups.values().stream().filter(g -> g.size() == threshold).forEach(result::addAll);
        } else {
            result.addAll(records);
        }

        writeDD(to, result);
        toolmsg(String.format("SELECT: %d of %d records from %s to %s", result.size(), records.size(), from, to));
    }

    /** STATS FROM(dd) ON(pos,len,type) — compute statistics */
    private void execStats(String cmd) {
        String from = extractIcetoolParam(cmd, "FROM");
        String onSpec = extractIcetoolParam(cmd, "ON");
        String writeTo = extractIcetoolParam(cmd, "WRITE");

        List<String> records = readDD(from);
        if (onSpec.isEmpty() || records.isEmpty()) {
            toolmsg("STATS: No data or ON spec");
            return;
        }

        List<String> onParts = parseParenList("(" + onSpec + ")");
        int pos = Integer.parseInt(onParts.get(0).trim());
        int len = Integer.parseInt(onParts.get(1).trim());

        double min = Double.MAX_VALUE, max = Double.MIN_VALUE, sum = 0;
        int count = 0;
        for (String rec : records) {
            String field = extractField(rec, pos, len).trim();
            try {
                double val = Double.parseDouble(field);
                min = Math.min(min, val);
                max = Math.max(max, val);
                sum += val;
                count++;
            } catch (NumberFormatException e) { /* skip non-numeric */ }
        }

        if (count > 0) {
            double avg = sum / count;
            String stats = String.format("COUNT=%d MIN=%.2f MAX=%.2f SUM=%.2f AVG=%.2f", count, min, max, sum, avg);
            toolmsg("STATS: " + from + " ON(" + onSpec + ") " + stats);
            if (!writeTo.isEmpty()) {
                writeDD(writeTo, Collections.singletonList(stats));
            }
        } else {
            toolmsg("STATS: No numeric values found");
        }
    }

    /** DISPLAY FROM(dd) LIST(outdd) ON(pos,len,type) */
    private void execDisplay(String cmd) {
        String from = extractIcetoolParam(cmd, "FROM");
        String listDD = extractIcetoolParam(cmd, "LIST");
        String onSpec = extractIcetoolParam(cmd, "ON");
        String header = extractIcetoolParam(cmd, "HEADER");

        List<String> records = readDD(from);
        List<String> output = new ArrayList<>();

        if (!header.isEmpty()) {
            if (header.startsWith("'")) header = header.substring(1);
            if (header.endsWith("'")) header = header.substring(0, header.length() - 1);
            output.add(header);
        }

        if (!onSpec.isEmpty() && !records.isEmpty()) {
            List<String> onParts = parseParenList("(" + onSpec + ")");
            if (onParts.size() >= 2) {
                int pos = Integer.parseInt(onParts.get(0).trim());
                int len = Integer.parseInt(onParts.get(1).trim());
                for (String rec : records) {
                    output.add(extractField(rec, pos, len));
                }
            }
        } else {
            output.addAll(records);
        }

        if (!listDD.isEmpty()) {
            writeDD(listDD, output);
        }
        toolmsg(String.format("DISPLAY: %d lines to %s", output.size(), listDD));
    }

    /** SPLICE FROM(dd) TO(dd) ON(pos,len) WITH(pos,len) — join records by key */
    private void execSplice(String cmd) {
        String from = extractIcetoolParam(cmd, "FROM");
        String to = extractIcetoolParam(cmd, "TO");
        String onSpec = extractIcetoolParam(cmd, "ON");
        String withSpec = extractIcetoolParam(cmd, "WITH");

        List<String> records = readDD(from);
        if (onSpec.isEmpty() || withSpec.isEmpty() || records.isEmpty()) {
            writeDD(to, records);
            return;
        }

        List<String> onParts = parseParenList("(" + onSpec + ")");
        List<String> withParts = parseParenList("(" + withSpec + ")");
        int keyPos = Integer.parseInt(onParts.get(0).trim());
        int keyLen = Integer.parseInt(onParts.get(1).trim());
        int withPos = Integer.parseInt(withParts.get(0).trim());
        int withLen = Integer.parseInt(withParts.get(1).trim());

        // Group by key, splice WITH fields from subsequent records into first
        Map<String, List<String>> groups = new LinkedHashMap<>();
        for (String rec : records) {
            String key = extractField(rec, keyPos, keyLen);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(rec);
        }

        List<String> result = new ArrayList<>();
        for (List<String> group : groups.values()) {
            StringBuilder base = new StringBuilder(group.get(0));
            // Extend if needed
            int maxLen = withPos - 1 + withLen * group.size();
            while (base.length() < maxLen) base.append(' ');

            int offset = withPos - 1;
            for (int i = 1; i < group.size(); i++) {
                String withVal = extractField(group.get(i), withPos, withLen);
                offset += withLen;
                for (int j = 0; j < withLen && offset + j < base.length(); j++) {
                    base.setCharAt(offset + j, j < withVal.length() ? withVal.charAt(j) : ' ');
                }
            }
            result.add(base.toString());
        }

        writeDD(to, result);
        toolmsg(String.format("SPLICE: %d records from %s to %s", result.size(), from, to));
    }

    /** Write to TOOLMSG */
    private void toolmsg(String msg) {
        String path = getDDPath("TOOLMSG");
        if (!path.isEmpty()) {
            try {
                java.io.File f = new java.io.File(path);
                if (f.getParentFile() != null) f.getParentFile().mkdirs();
                java.nio.file.Files.write(f.toPath(), Collections.singletonList(msg),
                    java.nio.charset.StandardCharsets.UTF_8,
                    java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
            } catch (java.io.IOException e) { /* ignore */ }
        }
        sysprint(msg);
    }

    /** Extract field from record (1-based position) */
    private String extractField(String record, int pos, int len) {
        int start = pos - 1;
        if (start >= record.length()) return padRight("", len);
        int end = Math.min(start + len, record.length());
        return padRight(record.substring(start, end), len);
    }

    private String padRight(String s, int len) {
        if (s.length() >= len) return s.substring(0, len);
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < len) sb.append(' ');
        return sb.toString();
    }

    /** Extract ICETOOL parameter: KEYWORD(value) */
    private String extractIcetoolParam(String text, String param) {
        String upper = text.toUpperCase();
        int idx = upper.indexOf(param.toUpperCase() + "(");
        if (idx < 0) return "";
        String rest = text.substring(idx + param.length());
        if (!rest.startsWith("(")) return "";
        int depth = 0;
        for (int i = 0; i < rest.length(); i++) {
            if (rest.charAt(i) == '(') depth++;
            else if (rest.charAt(i) == ')') {
                depth--;
                if (depth == 0) return rest.substring(1, i).trim();
            }
        }
        return rest.substring(1).trim();
    }

    /** Extract integer parameter: KEYWORD(n) */
    private int extractIntParam(String text, String param) {
        String val = extractIcetoolParam(text, param);
        try { return Integer.parseInt(val.trim()); } catch (NumberFormatException e) { return 0; }
    }
}
