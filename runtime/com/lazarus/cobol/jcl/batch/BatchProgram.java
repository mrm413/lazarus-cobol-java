package com.lazarus.cobol.jcl.batch;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * Base class for JCL batch utility programs (DFSORT, IDCAMS, IEBGENER, etc.).
 *
 * Provides common DD resolution, file I/O, and return code handling.
 * DD allocations come from System properties set by JclExecutor:
 *   DD.{name} = file path
 *   DD.{name}.INLINE = inline data
 */
public abstract class BatchProgram implements Runnable {

    protected int returnCode = 0;

    /** Get file path for a DD name */
    protected String getDDPath(String ddName) {
        return System.getProperty("DD." + ddName.toUpperCase(), "");
    }

    /** Get inline data for a DD name (DD * content) */
    protected String getInlineData(String ddName) {
        return System.getProperty("DD." + ddName.toUpperCase() + ".INLINE", "");
    }

    /** Get PARM value */
    protected String getParm() {
        return System.getProperty("PARM", "");
    }

    /** Read control statements from SYSIN (inline or file) */
    protected List<String> readSysin() {
        String inline = getInlineData("SYSIN");
        if (!inline.isEmpty()) {
            return Arrays.asList(inline.split("\\r?\\n"));
        }
        String path = getDDPath("SYSIN");
        if (!path.isEmpty()) {
            return readFileLines(path);
        }
        return Collections.emptyList();
    }

    /** Read all lines from a file */
    protected List<String> readFileLines(String path) {
        if (path == null || path.isEmpty()) return Collections.emptyList();
        try {
            File f = new File(path);
            if (!f.exists()) return Collections.emptyList();
            return Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    /** Write lines to a file */
    protected void writeFileLines(String path, List<String> lines) {
        if (path == null || path.isEmpty()) return;
        try {
            File f = new File(path);
            f.getParentFile().mkdirs();
            Files.write(f.toPath(), lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            returnCode = Math.max(returnCode, 12);
        }
    }

    /** Read all records from a DD */
    protected List<String> readDD(String ddName) {
        return readFileLines(getDDPath(ddName));
    }

    /** Write records to a DD */
    protected void writeDD(String ddName, List<String> records) {
        writeFileLines(getDDPath(ddName), records);
    }

    /** Append to SYSPRINT output */
    protected void sysprint(String msg) {
        String path = getDDPath("SYSPRINT");
        if (!path.isEmpty()) {
            try {
                File f = new File(path);
                f.getParentFile().mkdirs();
                Files.write(f.toPath(), Collections.singletonList(msg),
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException e) { /* ignore */ }
        }
    }

    /** Parse a parenthesized parameter list: (a,b,c) → [a,b,c] */
    protected static List<String> parseParenList(String text) {
        List<String> result = new ArrayList<>();
        if (text == null || text.isEmpty()) return result;
        // Strip outer parens
        text = text.trim();
        if (text.startsWith("(")) text = text.substring(1);
        if (text.endsWith(")")) text = text.substring(0, text.length() - 1);
        // Split respecting nested parens
        int depth = 0;
        StringBuilder current = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == '(') depth++;
            else if (c == ')') depth--;
            if (c == ',' && depth == 0) {
                result.add(current.toString().trim());
                current = new StringBuilder();
            } else {
                current.append(c);
            }
        }
        if (current.length() > 0) result.add(current.toString().trim());
        return result;
    }

    /** Extract value after keyword= from a line */
    protected static String extractKeyword(String line, String keyword) {
        String upper = line.toUpperCase();
        int idx = upper.indexOf(keyword.toUpperCase() + "=");
        if (idx < 0) return "";
        String rest = line.substring(idx + keyword.length() + 1).trim();
        if (rest.startsWith("(")) {
            int depth = 0;
            for (int i = 0; i < rest.length(); i++) {
                if (rest.charAt(i) == '(') depth++;
                else if (rest.charAt(i) == ')') { depth--; if (depth == 0) return rest.substring(0, i + 1); }
            }
            return rest;
        }
        // Simple value up to comma or space
        int end = rest.length();
        for (int i = 0; i < rest.length(); i++) {
            if (rest.charAt(i) == ',' || rest.charAt(i) == ' ') { end = i; break; }
        }
        return rest.substring(0, end);
    }
}
