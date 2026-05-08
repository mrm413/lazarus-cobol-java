package com.lazarus.cobol.env;

/**
 * COBOL JSON GENERATE / JSON PARSE runtime support.
 * Maps COBOL JSON statements to Java JSON operations.
 */
public class CobolJson {

    /**
     * JSON GENERATE — convert a data structure to JSON string.
     * In COBOL, this walks the group item and produces JSON for each field.
     * Here we produce a simple JSON wrapper around the string value.
     */
    public static String generate(Object data) {
        return generate(data, "data");
    }

    public static String generate(Object data, String fieldName) {
        if (data == null) return "{}";
        String content = String.valueOf(data).stripTrailing();
        if (content.isEmpty()) content = " ";
        boolean dpic = com.lazarus.cobol.CobolDisplay.dpicAppliesToJson();
        // Check if the value is numeric (BigDecimal, Integer, etc.)
        if (data instanceof Number) {
            if (dpic) content = content.replace('.', ',');
            return "{\"" + fieldName + "\":" + content + "}";
        }
        // Try parsing as number for string representations of numbers
        try {
            new java.math.BigDecimal(content);
            String numContent = dpic ? content.replace('.', ',') : content;
            return "{\"" + fieldName + "\":" + numContent + "}";
        } catch (NumberFormatException e) {
            // Not numeric — output as quoted string
        }
        // Escape JSON special characters
        String escaped = content.replace("\\", "\\\\")
                                .replace("\"", "\\\"")
                                .replace("\n", "\\n")
                                .replace("\r", "\\r")
                                .replace("\t", "\\t");
        return "{\"" + fieldName + "\":\"" + escaped + "\"}";
    }

    /**
     * Always returns a quoted JSON string value (used for numeric-edited, alpha-edited fields).
     */
    public static String valueLiteralStr(Object data) {
        if (data == null) return "null";
        String content = String.valueOf(data).stripTrailing();
        if (content.isEmpty()) content = " ";
        String escaped = content.replace("\\", "\\\\")
                                .replace("\"", "\\\"")
                                .replace("\n", "\\n")
                                .replace("\r", "\\r")
                                .replace("\t", "\\t");
        return "\"" + escaped + "\"";
    }

    /**
     * Returns a quoted JSON string for JUSTIFIED RIGHT fields — strips leading spaces.
     */
    public static String valueLiteralJust(Object data) {
        if (data == null) return "null";
        String content = String.valueOf(data).stripLeading();
        if (content.isEmpty()) content = " ";
        String escaped = content.replace("\\", "\\\\")
                                .replace("\"", "\\\"")
                                .replace("\n", "\\n")
                                .replace("\r", "\\r")
                                .replace("\t", "\\t");
        return "\"" + escaped + "\"";
    }

    /**
     * Returns a JSON numeric value with exactly `scale` decimal digits (trailing zeros preserved).
     * Used for PIC 9(n)V9(m) PACKED-DECIMAL and similar fields.
     */
    public static String valueLiteralScaled(Object data, int scale) {
        if (data == null) return "null";
        String content = String.valueOf(data).strip();
        boolean negative = false;
        if (content.startsWith("-")) { negative = true; content = content.substring(1); }
        try {
            java.math.BigDecimal bd = new java.math.BigDecimal(content)
                    .setScale(scale, java.math.RoundingMode.HALF_UP);
            boolean dpic = com.lazarus.cobol.CobolDisplay.dpicAppliesToJson();
            String result = bd.toPlainString();
            if (dpic) result = result.replace('.', ',');
            return negative ? "-" + result : result;
        } catch (Exception e) {
            return content;
        }
    }

    /**
     * Returns the JSON-encoded value(number or quoted string) for a COBOL field value.
     * Does NOT include a surrounding {key:...} wrapper — just the raw value portion.
     */
    public static String valueLiteral(Object data) {
        if (data == null) return "null";
        String content = String.valueOf(data).stripTrailing();
        if (content.isEmpty()) content = " ";
        boolean dpic = com.lazarus.cobol.CobolDisplay.dpicAppliesToJson();
        if (data instanceof Number) {
            if (dpic) content = content.replace('.', ',');
            return content;
        }
        try {
            new java.math.BigDecimal(content);
            return dpic ? content.replace('.', ',') : content;
        } catch (NumberFormatException e) {
            // Not numeric — quote it
        }
        String escaped = content.replace("\\", "\\\\")
                                .replace("\"", "\\\"")
                                .replace("\n", "\\n")
                                .replace("\r", "\\r")
                                .replace("\t", "\\t");
        return "\"" + escaped + "\"";
    }

    /**
     * JSON PARSE — parse JSON string into a target data structure.
     * In COBOL, this populates group item fields from JSON keys.
     * Here we extract the value and set it on the target.
     */
    public static void parse(String json, Object target) {
        if (json == null || json.isEmpty() || target == null) return;
        // Simple extraction: find first string value in JSON
        try {
            int valueStart = json.indexOf(':');
            if (valueStart < 0) return;
            String rest = json.substring(valueStart + 1).trim();
            if (rest.startsWith("\"")) {
                int end = rest.indexOf('"', 1);
                if (end > 0) {
                    String value = rest.substring(1, end)
                            .replace("\\\"", "\"")
                            .replace("\\\\", "\\")
                            .replace("\\n", "\n")
                            .replace("\\r", "\r")
                            .replace("\\t", "\t");
                    // Try to set value via reflection or .set() method
                    try {
                        target.getClass().getMethod("set", String.class).invoke(target, value);
                    } catch (Exception e) {
                        // Target may not have a .set() method
                    }
                }
            }
        } catch (Exception e) {
            // JSON parse error — COBOL would set JSON-CODE special register
        }
    }
}
