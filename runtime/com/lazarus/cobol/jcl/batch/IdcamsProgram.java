package com.lazarus.cobol.jcl.batch;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * IDCAMS — IBM Access Method Services utility.
 *
 * Control statements (from SYSIN):
 *   DEFINE CLUSTER (NAME(dsn) -
 *     KEYS(len offset) -
 *     RECORDSIZE(avg max) -
 *     RECORDS(count))
 *   DELETE dsn [CLUSTER|NONVSAM|GDG]
 *   REPRO INFILE(dd)|INDATASET(dsn) OUTFILE(dd)|OUTDATASET(dsn)
 *   LISTCAT [ENTRIES(dsn)] [ALL|NAME]
 *   PRINT INFILE(dd)|INDATASET(dsn) [CHARACTER|HEX|DUMP]
 *   ALTER dsn NEWNAME(newdsn)
 *
 * DDs:
 *   SYSIN    — control statements
 *   SYSPRINT — messages/output
 *   user-defined DDs for INFILE/OUTFILE references
 */
public class IdcamsProgram extends BatchProgram {

    // In-memory catalog: dsn → attributes
    private static final Map<String, Map<String, String>> catalog = new LinkedHashMap<>();

    @Override
    public void run() {
        List<String> sysin = readSysin();
        String joined = joinStatements(sysin);
        String[] commands = joined.split(";");

        for (String cmd : commands) {
            String trimmed = cmd.trim();
            if (trimmed.isEmpty()) continue;
            String upper = trimmed.toUpperCase();

            if (upper.startsWith("DEFINE")) {
                execDefine(trimmed);
            } else if (upper.startsWith("DELETE")) {
                execDelete(trimmed);
            } else if (upper.startsWith("REPRO")) {
                execRepro(trimmed);
            } else if (upper.startsWith("LISTCAT")) {
                execListcat(trimmed);
            } else if (upper.startsWith("PRINT")) {
                execPrint(trimmed);
            } else if (upper.startsWith("ALTER")) {
                execAlter(trimmed);
            } else {
                sysprint("IDCAMS: Unknown command: " + trimmed.split("\\s")[0]);
                returnCode = Math.max(returnCode, 4); // Warning
            }
        }
    }

    /** DEFINE CLUSTER */
    private void execDefine(String cmd) {
        String upper = cmd.toUpperCase();
        boolean isCluster = upper.contains("CLUSTER");
        boolean isAlternateIndex = upper.contains("ALTERNATEINDEX") || upper.contains("AIX");
        boolean isGdg = upper.contains("GDG");

        String name = extractIdcamsParam(cmd, "NAME");
        if (name.isEmpty()) {
            sysprint("IDCAMS DEFINE: NAME parameter required");
            returnCode = Math.max(returnCode, 12);
            return;
        }

        Map<String, String> attrs = new LinkedHashMap<>();
        attrs.put("TYPE", isGdg ? "GDG" : isAlternateIndex ? "AIX" : "CLUSTER");
        attrs.put("NAME", name.toUpperCase());

        String keys = extractIdcamsParam(cmd, "KEYS");
        if (!keys.isEmpty()) attrs.put("KEYS", keys);

        String recsz = extractIdcamsParam(cmd, "RECORDSIZE");
        if (!recsz.isEmpty()) attrs.put("RECORDSIZE", recsz);

        String records = extractIdcamsParam(cmd, "RECORDS");
        if (!records.isEmpty()) attrs.put("RECORDS", records);

        String cylinders = extractIdcamsParam(cmd, "CYLINDERS");
        if (!cylinders.isEmpty()) attrs.put("CYLINDERS", cylinders);

        String tracks = extractIdcamsParam(cmd, "TRACKS");
        if (!tracks.isEmpty()) attrs.put("TRACKS", tracks);

        String shareoptions = extractIdcamsParam(cmd, "SHAREOPTIONS");
        if (!shareoptions.isEmpty()) attrs.put("SHAREOPTIONS", shareoptions);

        String limit = extractIdcamsParam(cmd, "LIMIT");
        if (!limit.isEmpty()) attrs.put("LIMIT", limit);

        catalog.put(name.toUpperCase(), attrs);
        sysprint("IDCAMS: DEFINED " + attrs.get("TYPE") + " " + name.toUpperCase());

        // Create empty file for dataset
        String path = resolveDatasetPath(name);
        try {
            File f = new File(path);
            if (f.getParentFile() != null) f.getParentFile().mkdirs();
            if (!f.exists()) f.createNewFile();
        } catch (IOException e) {
            // File creation is best-effort
        }
    }

    /** DELETE dataset */
    private void execDelete(String cmd) {
        String[] tokens = cmd.trim().split("\\s+");
        if (tokens.length < 2) {
            returnCode = Math.max(returnCode, 12);
            return;
        }
        String dsn = tokens[1].toUpperCase().trim();
        if (catalog.containsKey(dsn)) {
            catalog.remove(dsn);
            sysprint("IDCAMS: DELETED " + dsn);
        } else {
            // Try to delete the file anyway
            String path = resolveDatasetPath(dsn);
            File f = new File(path);
            if (f.exists()) {
                f.delete();
                sysprint("IDCAMS: DELETED FILE " + dsn);
            } else {
                sysprint("IDCAMS: ENTRY " + dsn + " NOT FOUND");
                returnCode = Math.max(returnCode, 8);
            }
        }
    }

    /** REPRO — copy records */
    private void execRepro(String cmd) {
        String infile = extractIdcamsParam(cmd, "INFILE");
        String indataset = extractIdcamsParam(cmd, "INDATASET");
        String outfile = extractIdcamsParam(cmd, "OUTFILE");
        String outdataset = extractIdcamsParam(cmd, "OUTDATASET");

        List<String> records;
        if (!infile.isEmpty()) {
            records = readDD(infile);
        } else if (!indataset.isEmpty()) {
            records = readFileLines(resolveDatasetPath(indataset));
        } else {
            sysprint("IDCAMS REPRO: No input specified");
            returnCode = Math.max(returnCode, 12);
            return;
        }

        if (!outfile.isEmpty()) {
            writeDD(outfile, records);
        } else if (!outdataset.isEmpty()) {
            writeFileLines(resolveDatasetPath(outdataset), records);
        } else {
            sysprint("IDCAMS REPRO: No output specified");
            returnCode = Math.max(returnCode, 12);
            return;
        }

        sysprint(String.format("IDCAMS REPRO: %d records copied", records.size()));
    }

    /** LISTCAT — list catalog entries */
    private void execListcat(String cmd) {
        String entries = extractIdcamsParam(cmd, "ENTRIES");
        boolean all = cmd.toUpperCase().contains("ALL");

        if (!entries.isEmpty()) {
            Map<String, String> attrs = catalog.get(entries.toUpperCase());
            if (attrs != null) {
                sysprint("IDCAMS LISTCAT: " + entries.toUpperCase());
                if (all) {
                    for (Map.Entry<String, String> e : attrs.entrySet()) {
                        sysprint("  " + e.getKey() + ": " + e.getValue());
                    }
                }
            } else {
                sysprint("IDCAMS LISTCAT: " + entries.toUpperCase() + " NOT FOUND");
                returnCode = Math.max(returnCode, 4);
            }
        } else {
            sysprint("IDCAMS LISTCAT: " + catalog.size() + " entries");
            for (String dsn : catalog.keySet()) {
                sysprint("  " + dsn + " (" + catalog.get(dsn).get("TYPE") + ")");
            }
        }
    }

    /** PRINT — print dataset contents */
    private void execPrint(String cmd) {
        String infile = extractIdcamsParam(cmd, "INFILE");
        String indataset = extractIdcamsParam(cmd, "INDATASET");

        List<String> records;
        String dsn;
        if (!infile.isEmpty()) {
            records = readDD(infile);
            dsn = infile;
        } else if (!indataset.isEmpty()) {
            records = readFileLines(resolveDatasetPath(indataset));
            dsn = indataset;
        } else {
            sysprint("IDCAMS PRINT: No input specified");
            returnCode = Math.max(returnCode, 12);
            return;
        }

        sysprint("IDCAMS PRINT: " + dsn + " (" + records.size() + " records)");
        for (int i = 0; i < records.size(); i++) {
            sysprint(String.format("  %06d: %s", i + 1, records.get(i)));
        }
    }

    /** ALTER — modify catalog entry */
    private void execAlter(String cmd) {
        String[] tokens = cmd.trim().split("\\s+");
        if (tokens.length < 2) {
            returnCode = Math.max(returnCode, 12);
            return;
        }
        String dsn = tokens[1].toUpperCase();
        String newname = extractIdcamsParam(cmd, "NEWNAME");

        Map<String, String> attrs = catalog.get(dsn);
        if (attrs == null) {
            sysprint("IDCAMS ALTER: " + dsn + " NOT FOUND");
            returnCode = Math.max(returnCode, 8);
            return;
        }

        if (!newname.isEmpty()) {
            catalog.remove(dsn);
            attrs.put("NAME", newname.toUpperCase());
            catalog.put(newname.toUpperCase(), attrs);
            sysprint("IDCAMS ALTER: " + dsn + " RENAMED TO " + newname.toUpperCase());
        }
    }

    /** Join continuation lines (- at end of line) and ; as separator */
    private String joinStatements(List<String> lines) {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            String trimmed = line.trim();
            if (trimmed.isEmpty() || trimmed.startsWith("/*") || trimmed.startsWith("*")) continue;
            if (trimmed.endsWith("-")) {
                sb.append(trimmed, 0, trimmed.length() - 1).append(" ");
            } else {
                sb.append(trimmed).append(";");
            }
        }
        return sb.toString();
    }

    /** Extract IDCAMS-style parameter: KEYWORD(value) */
    private String extractIdcamsParam(String text, String param) {
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

    /** Resolve dataset name to a local file path */
    private String resolveDatasetPath(String dsn) {
        String path = dsn.toLowerCase().replace(".", File.separator);
        return System.getProperty("java.io.tmpdir") + File.separator + "idcams_" + path.replace(File.separator, "_");
    }

    /** Get catalog (for testing) */
    public static Map<String, Map<String, String>> getCatalog() { return catalog; }

    /** Clear catalog (for testing) */
    public static void clearCatalog() { catalog.clear(); }
}
