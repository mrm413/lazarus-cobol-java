package com.lazarus.cobol.cics;

import java.util.*;

/**
 * CICS BMS Map — defines the screen layout for a single map within a mapset.
 * Fields have positions (row, col), lengths, types, and default attributes.
 *
 * Maps are typically defined in BMS mapset source files and extracted into
 * JSON/YAML configuration files. This class represents the parsed map definition.
 */
public class CicsMap {
    private final String mapName;
    private final String mapsetName;
    private final int rows;
    private final int cols;
    private final List<Field> fields = new ArrayList<>();
    private final Map<String, Field> fieldsByName = new LinkedHashMap<>();

    public static class Field {
        public final String name;
        public final int row;
        public final int col;
        public final int length;
        public final boolean numeric;
        public final String initialValue;
        public CicsFieldAttr attr;
        public String value;
        public boolean cursorHere;

        public Field(String name, int row, int col, int length, boolean numeric,
                     String initialValue, CicsFieldAttr attr) {
            this.name = name;
            this.row = row;
            this.col = col;
            this.length = length;
            this.numeric = numeric;
            this.initialValue = initialValue != null ? initialValue : "";
            this.attr = attr != null ? attr : new CicsFieldAttr();
            this.value = this.initialValue;
            this.cursorHere = false;
        }

        /** Reset field to initial state */
        public void reset() {
            this.value = this.initialValue;
            this.attr = new CicsFieldAttr();
            this.cursorHere = false;
        }
    }

    public CicsMap(String mapName, String mapsetName, int rows, int cols) {
        this.mapName = mapName;
        this.mapsetName = mapsetName;
        this.rows = rows;
        this.cols = cols;
    }

    public String getMapName() { return mapName; }
    public String getMapsetName() { return mapsetName; }
    public int getRows() { return rows; }
    public int getCols() { return cols; }
    public List<Field> getFields() { return Collections.unmodifiableList(fields); }

    /** Add a field definition */
    public void addField(String name, int row, int col, int length, boolean numeric,
                         String initialValue, CicsFieldAttr attr) {
        Field f = new Field(name, row, col, length, numeric, initialValue, attr);
        fields.add(f);
        if (name != null && !name.isEmpty()) {
            fieldsByName.put(name.toUpperCase(), f);
        }
    }

    /** Get field by name (case-insensitive) */
    public Field getField(String name) {
        return fieldsByName.get(name.toUpperCase());
    }

    /** Set a field's value (used before SEND MAP) */
    public void setFieldValue(String name, String value) {
        Field f = fieldsByName.get(name.toUpperCase());
        if (f != null) {
            f.value = value != null ? value : "";
        }
    }

    /** Set a field's attribute (used for error highlighting, protection, etc.) */
    public void setFieldAttr(String name, CicsFieldAttr attr) {
        Field f = fieldsByName.get(name.toUpperCase());
        if (f != null) {
            f.attr = attr;
        }
    }

    /** Position cursor at a field */
    public void setCursor(String fieldName) {
        // Clear all cursor flags first
        for (Field f : fields) f.cursorHere = false;
        Field f = fieldsByName.get(fieldName.toUpperCase());
        if (f != null) f.cursorHere = true;
    }

    /**
     * Serialize to JSON for frontend rendering.
     * This is the output of SEND MAP — consumed by any UI framework.
     */
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"mapset\": \"").append(mapsetName).append("\",\n");
        sb.append("  \"map\": \"").append(mapName).append("\",\n");
        sb.append("  \"rows\": ").append(rows).append(",\n");
        sb.append("  \"cols\": ").append(cols).append(",\n");
        sb.append("  \"fields\": [\n");
        for (int i = 0; i < fields.size(); i++) {
            Field f = fields.get(i);
            sb.append("    {");
            sb.append("\"name\": \"").append(f.name != null ? f.name : "").append("\", ");
            sb.append("\"row\": ").append(f.row).append(", ");
            sb.append("\"col\": ").append(f.col).append(", ");
            sb.append("\"len\": ").append(f.length).append(", ");
            sb.append("\"type\": \"").append(f.numeric ? "numeric" : "alpha").append("\", ");
            sb.append("\"protected\": ").append(f.attr.isProtected()).append(", ");
            sb.append("\"bright\": ").append(f.attr.isBright()).append(", ");
            sb.append("\"dark\": ").append(f.attr.isDark()).append(", ");
            sb.append("\"value\": \"").append(escapeJson(f.value)).append("\", ");
            sb.append("\"cursor\": ").append(f.cursorHere);
            sb.append("}");
            if (i < fields.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("  ]\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Populate field values from input JSON (from RECEIVE MAP).
     * Expects: {"fields": {"FIELDNAME": "value", ...}, "aid": "ENTER"}
     */
    public void fromInput(Map<String, String> fieldValues) {
        for (Map.Entry<String, String> entry : fieldValues.entrySet()) {
            Field f = fieldsByName.get(entry.getKey().toUpperCase());
            if (f != null && !f.attr.isProtected()) {
                f.value = entry.getValue();
                f.attr.setMdt(); // Mark as modified
            }
        }
    }

    /** Reset all fields to initial values */
    public void resetAll() {
        for (Field f : fields) f.reset();
    }

    private static String escapeJson(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }
}
