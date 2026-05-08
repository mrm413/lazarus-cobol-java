package com.lazarus.cobol.sql;

import java.sql.*;
import java.util.*;

/**
 * DB2 Cursor — manages DECLARE CURSOR / OPEN / FETCH / CLOSE lifecycle.
 *
 * In COBOL:
 *   EXEC SQL DECLARE C1 CURSOR FOR
 *     SELECT EMP_ID, NAME, SALARY FROM EMPLOYEES
 *     WHERE DEPT = :WS-DEPT
 *   END-EXEC
 *
 *   EXEC SQL OPEN C1 END-EXEC
 *   EXEC SQL FETCH C1 INTO :WS-EMP-ID, :WS-NAME, :WS-SALARY END-EXEC
 *   EXEC SQL CLOSE C1 END-EXEC
 *
 * Translated:
 *   CobolCursor c1 = db.declareCursor("C1", "SELECT ...", dept);
 *   db.openCursor(c1, sqlca);
 *   db.fetchCursor(c1, sqlca);  // results in c1.getColumn(...)
 *   db.closeCursor(c1, sqlca);
 *
 * Cursor types:
 *   - Forward-only (default)
 *   - Scrollable (WITH SCROLL)
 *   - WITH HOLD (survives COMMIT)
 *   - FOR UPDATE OF col1, col2 (positioned UPDATE/DELETE)
 *   - FOR READ ONLY
 */
public class CobolCursor {

    public enum CursorType {
        FORWARD_ONLY,
        SCROLLABLE
    }

    public enum Sensitivity {
        INSENSITIVE,
        SENSITIVE,
        ASENSITIVE
    }

    private final String cursorName;
    private final String sql;
    private final Object[] parameters;
    private CursorType type = CursorType.FORWARD_ONLY;
    private Sensitivity sensitivity = Sensitivity.ASENSITIVE;
    private boolean withHold = false;
    private boolean forUpdate = false;
    private List<String> updateColumns = new ArrayList<>();
    private boolean forReadOnly = false;

    // Runtime state
    private PreparedStatement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private boolean open = false;
    private int fetchCount = 0;
    private Map<String, Object> currentRow = new LinkedHashMap<>();
    private int columnCount = 0;

    public CobolCursor(String name, String sql, Object... params) {
        this.cursorName = name.toUpperCase().trim();
        this.sql = sql;
        this.parameters = params != null ? params : new Object[0];
    }

    // --- Configuration (before OPEN) ---

    public CobolCursor withHold() { this.withHold = true; return this; }
    public CobolCursor scrollable() { this.type = CursorType.SCROLLABLE; return this; }
    public CobolCursor insensitive() { this.sensitivity = Sensitivity.INSENSITIVE; return this; }
    public CobolCursor sensitive() { this.sensitivity = Sensitivity.SENSITIVE; return this; }
    public CobolCursor forUpdate(String... columns) {
        this.forUpdate = true;
        this.forReadOnly = false;
        if (columns != null) {
            for (String c : columns) updateColumns.add(c.toUpperCase().trim());
        }
        return this;
    }
    public CobolCursor forReadOnly() { this.forReadOnly = true; this.forUpdate = false; return this; }

    // --- Accessors ---

    public String getCursorName() { return cursorName; }
    public String getSql() { return sql; }
    public Object[] getParameters() { return parameters; }
    public CursorType getType() { return type; }
    public Sensitivity getSensitivity() { return sensitivity; }
    public boolean isWithHold() { return withHold; }
    public boolean isForUpdate() { return forUpdate; }
    public List<String> getUpdateColumns() { return Collections.unmodifiableList(updateColumns); }
    public boolean isForReadOnly() { return forReadOnly; }
    public boolean isOpen() { return open; }
    public int getFetchCount() { return fetchCount; }
    public int getColumnCount() { return columnCount; }

    // --- OPEN ---

    public void open(Connection conn, CobolSqlCA sqlca) throws SQLException {
        if (open) {
            sqlca.sqlcode = -502; // Cursor already open
            sqlca.sqlstate = "24501";
            sqlca.sqlerrmc = "Cursor " + cursorName + " already open";
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
            return;
        }

        int rsType = (type == CursorType.SCROLLABLE)
            ? ResultSet.TYPE_SCROLL_INSENSITIVE
            : ResultSet.TYPE_FORWARD_ONLY;
        int rsConcur = forUpdate
            ? ResultSet.CONCUR_UPDATABLE
            : ResultSet.CONCUR_READ_ONLY;

        statement = conn.prepareStatement(sql, rsType, rsConcur);

        if (withHold) {
            // Connection-level holdability, best-effort
        }

        // Bind parameters
        for (int i = 0; i < parameters.length; i++) {
            statement.setObject(i + 1, parameters[i]);
        }

        resultSet = statement.executeQuery();
        metaData = resultSet.getMetaData();
        columnCount = metaData.getColumnCount();
        open = true;
        fetchCount = 0;
        currentRow.clear();

        sqlca.reset();
    }

    // --- FETCH ---

    public boolean fetch(CobolSqlCA sqlca) throws SQLException {
        if (!open) {
            sqlca.sqlcode = -501; // Cursor not open
            sqlca.sqlstate = "24501";
            sqlca.sqlerrmc = "Cursor " + cursorName + " not open";
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
            return false;
        }

        if (resultSet.next()) {
            currentRow.clear();
            for (int i = 1; i <= columnCount; i++) {
                String colName = metaData.getColumnLabel(i).toUpperCase();
                currentRow.put(colName, resultSet.getObject(i));
                // Also store by index
                currentRow.put(String.valueOf(i), resultSet.getObject(i));
            }
            fetchCount++;
            sqlca.reset();
            return true;
        } else {
            sqlca.sqlcode = 100; // NOT FOUND
            sqlca.sqlstate = "02000";
            return false;
        }
    }

    // --- FETCH SCROLL variants ---

    public boolean fetchFirst(CobolSqlCA sqlca) throws SQLException {
        if (!open || type != CursorType.SCROLLABLE) {
            sqlca.sqlcode = -501;
            sqlca.sqlstate = "24501";
            return false;
        }
        if (resultSet.first()) {
            populateCurrentRow();
            fetchCount++;
            sqlca.reset();
            return true;
        }
        sqlca.sqlcode = 100;
        sqlca.sqlstate = "02000";
        return false;
    }

    public boolean fetchLast(CobolSqlCA sqlca) throws SQLException {
        if (!open || type != CursorType.SCROLLABLE) {
            sqlca.sqlcode = -501;
            sqlca.sqlstate = "24501";
            return false;
        }
        if (resultSet.last()) {
            populateCurrentRow();
            fetchCount++;
            sqlca.reset();
            return true;
        }
        sqlca.sqlcode = 100;
        sqlca.sqlstate = "02000";
        return false;
    }

    public boolean fetchPrior(CobolSqlCA sqlca) throws SQLException {
        if (!open || type != CursorType.SCROLLABLE) {
            sqlca.sqlcode = -501;
            sqlca.sqlstate = "24501";
            return false;
        }
        if (resultSet.previous()) {
            populateCurrentRow();
            fetchCount++;
            sqlca.reset();
            return true;
        }
        sqlca.sqlcode = 100;
        sqlca.sqlstate = "02000";
        return false;
    }

    public boolean fetchAbsolute(int row, CobolSqlCA sqlca) throws SQLException {
        if (!open || type != CursorType.SCROLLABLE) {
            sqlca.sqlcode = -501;
            sqlca.sqlstate = "24501";
            return false;
        }
        if (resultSet.absolute(row)) {
            populateCurrentRow();
            fetchCount++;
            sqlca.reset();
            return true;
        }
        sqlca.sqlcode = 100;
        sqlca.sqlstate = "02000";
        return false;
    }

    public boolean fetchRelative(int offset, CobolSqlCA sqlca) throws SQLException {
        if (!open || type != CursorType.SCROLLABLE) {
            sqlca.sqlcode = -501;
            sqlca.sqlstate = "24501";
            return false;
        }
        if (resultSet.relative(offset)) {
            populateCurrentRow();
            fetchCount++;
            sqlca.reset();
            return true;
        }
        sqlca.sqlcode = 100;
        sqlca.sqlstate = "02000";
        return false;
    }

    private void populateCurrentRow() throws SQLException {
        currentRow.clear();
        for (int i = 1; i <= columnCount; i++) {
            String colName = metaData.getColumnLabel(i).toUpperCase();
            currentRow.put(colName, resultSet.getObject(i));
            currentRow.put(String.valueOf(i), resultSet.getObject(i));
        }
    }

    // --- Column Access ---

    /** Get column by name */
    public Object getColumn(String name) {
        return currentRow.get(name.toUpperCase().trim());
    }

    /** Get column by 1-based index */
    public Object getColumn(int index) {
        return currentRow.get(String.valueOf(index));
    }

    /** Get column as String */
    public String getString(String name) {
        Object val = getColumn(name);
        return val != null ? val.toString() : "";
    }

    public String getString(int index) {
        Object val = getColumn(index);
        return val != null ? val.toString() : "";
    }

    /** Get column as int */
    public int getInt(String name) {
        Object val = getColumn(name);
        if (val instanceof Number) return ((Number) val).intValue();
        try { return Integer.parseInt(val.toString().trim()); } catch (Exception e) { return 0; }
    }

    public int getInt(int index) {
        Object val = getColumn(index);
        if (val instanceof Number) return ((Number) val).intValue();
        try { return Integer.parseInt(val.toString().trim()); } catch (Exception e) { return 0; }
    }

    /** Get column as long */
    public long getLong(String name) {
        Object val = getColumn(name);
        if (val instanceof Number) return ((Number) val).longValue();
        try { return Long.parseLong(val.toString().trim()); } catch (Exception e) { return 0; }
    }

    /** Get column as double */
    public double getDouble(String name) {
        Object val = getColumn(name);
        if (val instanceof Number) return ((Number) val).doubleValue();
        try { return Double.parseDouble(val.toString().trim()); } catch (Exception e) { return 0; }
    }

    /** Get column as BigDecimal (for COMP-3/packed decimal) */
    public java.math.BigDecimal getDecimal(String name) {
        Object val = getColumn(name);
        if (val instanceof java.math.BigDecimal) return (java.math.BigDecimal) val;
        if (val instanceof Number) return java.math.BigDecimal.valueOf(((Number) val).doubleValue());
        try { return new java.math.BigDecimal(val.toString().trim()); } catch (Exception e) { return java.math.BigDecimal.ZERO; }
    }

    /** Get all column names from current row */
    public List<String> getColumnNames() {
        List<String> names = new ArrayList<>();
        try {
            if (metaData != null) {
                for (int i = 1; i <= columnCount; i++) {
                    names.add(metaData.getColumnLabel(i).toUpperCase());
                }
            }
        } catch (SQLException e) { /* ignore */ }
        return names;
    }

    /** Get current row as map */
    public Map<String, Object> getCurrentRow() {
        Map<String, Object> named = new LinkedHashMap<>();
        for (Map.Entry<String, Object> e : currentRow.entrySet()) {
            // Skip numeric index keys
            try { Integer.parseInt(e.getKey()); } catch (NumberFormatException ex) {
                named.put(e.getKey(), e.getValue());
            }
        }
        return Collections.unmodifiableMap(named);
    }

    // --- Positioned UPDATE/DELETE ---

    /** Get the ResultSet for positioned operations (UPDATE WHERE CURRENT OF) */
    public ResultSet getResultSet() { return resultSet; }

    /** Positioned update on current row */
    public void updateCurrentRow(Map<String, Object> values, CobolSqlCA sqlca) throws SQLException {
        if (!open || !forUpdate) {
            sqlca.sqlcode = -510;
            sqlca.sqlstate = "24510";
            sqlca.sqlerrmc = "Cursor not open for update";
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
            return;
        }
        for (Map.Entry<String, Object> e : values.entrySet()) {
            resultSet.updateObject(e.getKey(), e.getValue());
        }
        resultSet.updateRow();
        sqlca.reset();
        sqlca.sqlerrd[2] = 1; // 1 row updated
    }

    /** Positioned delete on current row */
    public void deleteCurrentRow(CobolSqlCA sqlca) throws SQLException {
        if (!open || !forUpdate) {
            sqlca.sqlcode = -510;
            sqlca.sqlstate = "24510";
            sqlca.sqlerrmc = "Cursor not open for update";
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
            return;
        }
        resultSet.deleteRow();
        sqlca.reset();
        sqlca.sqlerrd[2] = 1; // 1 row deleted
    }

    // --- CLOSE ---

    public void close(CobolSqlCA sqlca) {
        if (!open) {
            sqlca.sqlcode = -501;
            sqlca.sqlstate = "24501";
            sqlca.sqlerrmc = "Cursor " + cursorName + " not open";
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
            return;
        }
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
        } catch (SQLException e) {
            sqlca.sqlcode = -1;
            sqlca.sqlerrmc = e.getMessage();
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
            return;
        }
        resultSet = null;
        statement = null;
        metaData = null;
        open = false;
        currentRow.clear();
        sqlca.reset();
    }
}
