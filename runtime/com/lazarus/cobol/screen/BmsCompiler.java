package com.lazarus.cobol.screen;

import com.lazarus.cobol.cics.*;
import java.util.*;
import java.util.regex.*;

/**
 * BMS Map Compiler — parses IBM BMS (Basic Mapping Support) macros
 * into CicsMap objects for screen rendering.
 *
 * BMS source format:
 *   MAPSET  DFHMSD TYPE=SYSPARM,LANG=COBOL,MODE=INOUT,CTRL=FREEKB,...
 *   MAP1    DFHMDI SIZE=(24,80),LINE=1,COLUMN=1
 *   TITLE   DFHMDF POS=(1,2),LENGTH=20,ATTRB=(PROT,BRT),INITIAL='WELCOME'
 *   USERID  DFHMDF POS=(3,2),LENGTH=8,ATTRB=(UNPROT,IC)
 *   MSG     DFHMDF POS=(24,1),LENGTH=79,ATTRB=(PROT)
 *           DFHMSD TYPE=FINAL
 *
 * Continuation: non-blank in col 72, next line starts at col 16.
 * Comments: * in col 1.
 */
public class BmsCompiler {

    /**
     * Compile BMS source into a list of CicsMap objects (one per DFHMDI).
     */
    public static List<CicsMap> compile(String bmsSource) {
        List<String> lines = joinContinuations(bmsSource);
        List<CicsMap> maps = new ArrayList<>();

        String mapsetName = "";
        CicsMap currentMap = null;

        for (String line : lines) {
            if (line.trim().isEmpty()) continue;
            if (line.trim().startsWith("*")) continue;

            // Parse: LABEL MACRO OPERANDS
            Matcher m = Pattern.compile("^(\\S*)\\s+(DFHMSD|DFHMDI|DFHMDF)\\s+(.*)", Pattern.CASE_INSENSITIVE)
                               .matcher(line.trim());
            if (!m.find()) continue;

            String label = m.group(1).trim();
            String macro = m.group(2).toUpperCase();
            String operands = m.group(3).trim();

            switch (macro) {
                case "DFHMSD":
                    if (operands.toUpperCase().contains("TYPE=FINAL")) {
                        // End of mapset
                        if (currentMap != null) maps.add(currentMap);
                        currentMap = null;
                    } else {
                        mapsetName = label.isEmpty() ? "MAPSET" : label;
                        if (currentMap != null) maps.add(currentMap);
                        currentMap = null;
                    }
                    break;

                case "DFHMDI":
                    if (currentMap != null) maps.add(currentMap);
                    String mapName = label.isEmpty() ? "MAP" : label;
                    int[] size = parseSize(operands);
                    currentMap = new CicsMap(mapName, mapsetName, size[0], size[1]);
                    break;

                case "DFHMDF":
                    if (currentMap != null) {
                        parseField(label, operands, currentMap);
                    }
                    break;
            }
        }

        if (currentMap != null) maps.add(currentMap);
        return maps;
    }

    /**
     * Compile a single map from BMS source (convenience for single-map mapsets).
     */
    public static CicsMap compileOne(String bmsSource) {
        List<CicsMap> maps = compile(bmsSource);
        return maps.isEmpty() ? new CicsMap("EMPTY", "EMPTY", 24, 80) : maps.get(0);
    }

    /** Parse SIZE=(rows,cols) — defaults to 24x80 */
    private static int[] parseSize(String operands) {
        Pattern p = Pattern.compile("SIZE=\\((\\d+)\\s*,\\s*(\\d+)\\)", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(operands);
        if (m.find()) {
            return new int[]{Integer.parseInt(m.group(1)), Integer.parseInt(m.group(2))};
        }
        return new int[]{24, 80};
    }

    /** Parse a DFHMDF field definition */
    private static void parseField(String label, String operands, CicsMap map) {
        // POS=(row,col)
        int row = 1, col = 1;
        Pattern posP = Pattern.compile("POS=\\((\\d+)\\s*,\\s*(\\d+)\\)", Pattern.CASE_INSENSITIVE);
        Matcher posM = posP.matcher(operands);
        if (posM.find()) {
            row = Integer.parseInt(posM.group(1));
            col = Integer.parseInt(posM.group(2));
        }

        // LENGTH=n
        int length = 1;
        Pattern lenP = Pattern.compile("LENGTH=(\\d+)", Pattern.CASE_INSENSITIVE);
        Matcher lenM = lenP.matcher(operands);
        if (lenM.find()) {
            length = Integer.parseInt(lenM.group(1));
        }

        // ATTRB=(attr1,attr2,...)
        String attrbStr = extractParam(operands, "ATTRB");
        CicsFieldAttr attr = parseAttrb(attrbStr);
        boolean numeric = attrbStr.toUpperCase().contains("NUM");

        // INITIAL='text'
        String initial = "";
        Pattern initP = Pattern.compile("INITIAL='([^']*)'", Pattern.CASE_INSENSITIVE);
        Matcher initM = initP.matcher(operands);
        if (initM.find()) {
            initial = initM.group(1);
        }

        // PICIN / PICOUT — stored but not processed beyond identifying numeric
        String picin = extractSimpleParam(operands, "PICIN");
        String picout = extractSimpleParam(operands, "PICOUT");

        // GRPNAME — group name for composite fields
        String grpname = extractSimpleParam(operands, "GRPNAME");

        // IC (Initial Cursor) — detected from ATTRB
        boolean ic = attrbStr.toUpperCase().contains("IC");

        // Use label as field name, or generate one
        String fieldName = label.isEmpty() ? "" : label;

        map.addField(fieldName, row, col, length, numeric, initial, attr);

        // If IC, set cursor on this field
        if (ic && !fieldName.isEmpty()) {
            map.setCursor(fieldName);
        }
    }

    /** Parse ATTRB=(PROT,BRT,NUM,...) into CicsFieldAttr */
    private static CicsFieldAttr parseAttrb(String attrbStr) {
        CicsFieldAttr attr = new CicsFieldAttr();
        if (attrbStr.isEmpty()) return attr;

        String upper = attrbStr.toUpperCase();
        if (upper.contains("PROT") && !upper.contains("UNPROT")) attr.protect();
        if (upper.contains("UNPROT")) attr.unprotect();
        if (upper.contains("NUM")) attr.numeric();
        if (upper.contains("BRT") || upper.contains("BRIGHT")) attr.bright();
        if (upper.contains("DRK") || upper.contains("DARK")) attr.dark();
        if (upper.contains("ASKIP") || upper.contains("AUTOSKIP")) attr.autoskip();
        if (upper.contains("FSET")) attr.setMdt();
        return attr;
    }

    /** Join continuation lines: if col 72 is non-blank, next line is continuation */
    private static List<String> joinContinuations(String source) {
        String[] raw = source.split("\\r?\\n");
        List<String> result = new ArrayList<>();
        StringBuilder current = null;

        for (String line : raw) {
            // Check if previous line continues (ended with comma or explicit continuation)
            if (current != null && (current.toString().trim().endsWith(",") ||
                    (line.length() > 0 && (line.startsWith("               ") || line.startsWith("\t\t"))))) {
                // Continuation: append trimmed content
                current.append(line.trim());
                continue;
            }

            if (current != null) {
                result.add(current.toString());
            }
            current = new StringBuilder(line);
        }
        if (current != null) result.add(current.toString());
        return result;
    }

    /** Extract a parenthesized or simple parameter value */
    private static String extractParam(String text, String param) {
        // Try parenthesized: PARAM=(...)
        Pattern paren = Pattern.compile("\\b" + param + "=\\(([^)]*)\\)", Pattern.CASE_INSENSITIVE);
        Matcher mp = paren.matcher(text);
        if (mp.find()) return mp.group(1);

        // Try simple: PARAM=value
        Pattern simple = Pattern.compile("\\b" + param + "=([^,\\s)]+)", Pattern.CASE_INSENSITIVE);
        Matcher ms = simple.matcher(text);
        if (ms.find()) return ms.group(1);

        return "";
    }

    /** Extract a simple keyword=value parameter */
    private static String extractSimpleParam(String text, String param) {
        Pattern p = Pattern.compile("\\b" + param + "='?([^',\\s)]+)'?", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        return m.find() ? m.group(1) : "";
    }
}
