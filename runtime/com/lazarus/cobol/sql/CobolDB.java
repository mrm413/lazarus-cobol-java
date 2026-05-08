package com.lazarus.cobol.sql;

import java.sql.*;
import java.util.*;

/**
 * CobolDB — high-level DB2 interface for COBOL programs.
 *
 * Manages connections, cursors, and SQL execution with SQLCA integration.
 *
 * Maps to:
 *   EXEC SQL CONNECT END-EXEC
 *   EXEC SQL SELECT ... INTO ... END-EXEC
 *   EXEC SQL INSERT/UPDATE/DELETE ... END-EXEC
 *   EXEC SQL DECLARE/OPEN/FETCH/CLOSE cursor END-EXEC
 *   EXEC SQL PREPARE/EXECUTE ... END-EXEC
 *   EXEC SQL COMMIT/ROLLBACK END-EXEC
 */
public class CobolDB {

    private Connection connection;
    private final Map<String, CobolCursor> cursors = new LinkedHashMap<>();
    private final Map<String, PreparedStatement> preparedStatements = new LinkedHashMap<>();
    private boolean autoCommit = false;

    public CobolDB() {}

    // --- Connection Management ---

    /** CONNECT with JDBC URL */
    public void connect(String url, CobolSqlCA sqlca) {
        connect(url, null, null, sqlca);
    }

    public void connect(String url, String user, String password, CobolSqlCA sqlca) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            if (user != null) {
                connection = DriverManager.getConnection(url, user, password);
            } else {
                connection = DriverManager.getConnection(url);
            }
            connection.setAutoCommit(autoCommit);
            sqlca.reset();
        } catch (SQLException e) {
            sqlca.sqlcode = -e.getErrorCode();
            sqlca.sqlstate = e.getSQLState() != null ? e.getSQLState() : "08001";
            sqlca.sqlerrmc = e.getMessage();
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
        }
    }

    /** Set connection directly (for testing or shared connections) */
    public void setConnection(Connection conn) {
        this.connection = conn;
    }

    public Connection getConnection() { return connection; }

    /** DISCONNECT */
    public void disconnect(CobolSqlCA sqlca) {
        try {
            closeAllCursors();
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            sqlca.reset();
        } catch (SQLException e) {
            sqlca.sqlcode = -e.getErrorCode();
            sqlca.sqlerrmc = e.getMessage();
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
        }
    }

    public boolean isConnected() {
        try { return connection != null && !connection.isClosed(); }
        catch (SQLException e) { return false; }
    }

    // --- Direct SQL Execution ---

    /** EXEC SQL SELECT ... INTO :host-var END-EXEC (single row) */
    public Map<String, Object> selectInto(String sql, CobolSqlCA sqlca, Object... params) {
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            bindParams(stmt, params);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Map<String, Object> row = extractRow(rs);
                if (rs.next()) {
                    sqlca.sqlcode = -811; // Multiple rows
                    sqlca.sqlstate = "21000";
                    sqlca.sqlerrmc = "SELECT INTO returned multiple rows";
                    sqlca.sqlerrml = sqlca.sqlerrmc.length();
                } else {
                    sqlca.reset();
                }
                rs.close();
                stmt.close();
                return row;
            } else {
                sqlca.sqlcode = 100;
                sqlca.sqlstate = "02000";
                rs.close();
                stmt.close();
                return null;
            }
        } catch (SQLException e) {
            populateError(sqlca, e);
            return null;
        }
    }

    /** EXEC SQL INSERT/UPDATE/DELETE END-EXEC */
    public int execute(String sql, CobolSqlCA sqlca, Object... params) {
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            bindParams(stmt, params);
            int rows = stmt.executeUpdate();
            sqlca.reset();
            sqlca.sqlerrd[2] = rows;
            stmt.close();
            return rows;
        } catch (SQLException e) {
            populateError(sqlca, e);
            return 0;
        }
    }

    /** Execute DDL (CREATE TABLE, etc.) */
    public void executeDDL(String sql, CobolSqlCA sqlca) {
        try {
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
            sqlca.reset();
        } catch (SQLException e) {
            populateError(sqlca, e);
        }
    }

    // --- Cursor Management ---

    /** DECLARE CURSOR */
    public CobolCursor declareCursor(String name, String sql, Object... params) {
        CobolCursor cursor = new CobolCursor(name, sql, params);
        cursors.put(name.toUpperCase().trim(), cursor);
        return cursor;
    }

    /** Get a declared cursor by name */
    public CobolCursor getCursor(String name) {
        return cursors.get(name.toUpperCase().trim());
    }

    /** OPEN cursor */
    public void openCursor(String name, CobolSqlCA sqlca) {
        CobolCursor cursor = cursors.get(name.toUpperCase().trim());
        if (cursor == null) {
            sqlca.sqlcode = -504; // Cursor not declared
            sqlca.sqlstate = "34000";
            sqlca.sqlerrmc = "Cursor " + name + " not declared";
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
            return;
        }
        try {
            cursor.open(connection, sqlca);
        } catch (SQLException e) {
            populateError(sqlca, e);
        }
    }

    public void openCursor(CobolCursor cursor, CobolSqlCA sqlca) {
        try {
            cursor.open(connection, sqlca);
        } catch (SQLException e) {
            populateError(sqlca, e);
        }
    }

    /** FETCH cursor */
    public boolean fetchCursor(String name, CobolSqlCA sqlca) {
        CobolCursor cursor = cursors.get(name.toUpperCase().trim());
        if (cursor == null) {
            sqlca.sqlcode = -504;
            sqlca.sqlstate = "34000";
            return false;
        }
        try {
            return cursor.fetch(sqlca);
        } catch (SQLException e) {
            populateError(sqlca, e);
            return false;
        }
    }

    public boolean fetchCursor(CobolCursor cursor, CobolSqlCA sqlca) {
        try {
            return cursor.fetch(sqlca);
        } catch (SQLException e) {
            populateError(sqlca, e);
            return false;
        }
    }

    /** CLOSE cursor */
    public void closeCursor(String name, CobolSqlCA sqlca) {
        CobolCursor cursor = cursors.get(name.toUpperCase().trim());
        if (cursor == null) {
            sqlca.sqlcode = -504;
            sqlca.sqlstate = "34000";
            return;
        }
        cursor.close(sqlca);
    }

    public void closeCursor(CobolCursor cursor, CobolSqlCA sqlca) {
        cursor.close(sqlca);
    }

    /** Close all open cursors */
    public void closeAllCursors() {
        CobolSqlCA dummy = new CobolSqlCA();
        for (CobolCursor c : cursors.values()) {
            if (c.isOpen()) c.close(dummy);
        }
    }

    // --- Prepared Statements (Dynamic SQL) ---

    /** PREPARE stmt-name FROM :host-var */
    public void prepare(String stmtName, String sql, CobolSqlCA sqlca) {
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            preparedStatements.put(stmtName.toUpperCase().trim(), stmt);
            sqlca.reset();
        } catch (SQLException e) {
            populateError(sqlca, e);
        }
    }

    /** EXECUTE stmt-name USING :host-var1, :host-var2 */
    public int executePrepared(String stmtName, CobolSqlCA sqlca, Object... params) {
        PreparedStatement stmt = preparedStatements.get(stmtName.toUpperCase().trim());
        if (stmt == null) {
            sqlca.sqlcode = -518;
            sqlca.sqlstate = "07003";
            sqlca.sqlerrmc = "Statement " + stmtName + " not prepared";
            sqlca.sqlerrml = sqlca.sqlerrmc.length();
            return 0;
        }
        try {
            bindParams(stmt, params);
            int rows = stmt.executeUpdate();
            sqlca.reset();
            sqlca.sqlerrd[2] = rows;
            return rows;
        } catch (SQLException e) {
            populateError(sqlca, e);
            return 0;
        }
    }

    /** EXECUTE IMMEDIATE :host-var */
    public int executeImmediate(String sql, CobolSqlCA sqlca) {
        try {
            Statement stmt = connection.createStatement();
            int rows = stmt.executeUpdate(sql);
            sqlca.reset();
            sqlca.sqlerrd[2] = rows;
            stmt.close();
            return rows;
        } catch (SQLException e) {
            populateError(sqlca, e);
            return 0;
        }
    }

    // --- Transaction Control ---

    /** COMMIT */
    public void commit(CobolSqlCA sqlca) {
        try {
            connection.commit();
            sqlca.reset();
        } catch (SQLException e) {
            populateError(sqlca, e);
        }
    }

    /** ROLLBACK */
    public void rollback(CobolSqlCA sqlca) {
        try {
            connection.rollback();
            sqlca.reset();
        } catch (SQLException e) {
            populateError(sqlca, e);
        }
    }

    /** SAVEPOINT */
    public Savepoint setSavepoint(String name, CobolSqlCA sqlca) {
        try {
            Savepoint sp = connection.setSavepoint(name);
            sqlca.reset();
            return sp;
        } catch (SQLException e) {
            populateError(sqlca, e);
            return null;
        }
    }

    /** ROLLBACK TO SAVEPOINT */
    public void rollbackToSavepoint(Savepoint sp, CobolSqlCA sqlca) {
        try {
            connection.rollback(sp);
            sqlca.reset();
        } catch (SQLException e) {
            populateError(sqlca, e);
        }
    }

    public void setAutoCommit(boolean ac) {
        this.autoCommit = ac;
        try {
            if (connection != null) connection.setAutoCommit(ac);
        } catch (SQLException e) { /* ignore */ }
    }

    // --- Helpers ---

    private void bindParams(PreparedStatement stmt, Object[] params) throws SQLException {
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
        }
    }

    private Map<String, Object> extractRow(ResultSet rs) throws SQLException {
        Map<String, Object> row = new LinkedHashMap<>();
        ResultSetMetaData md = rs.getMetaData();
        for (int i = 1; i <= md.getColumnCount(); i++) {
            row.put(md.getColumnLabel(i).toUpperCase(), rs.getObject(i));
        }
        return row;
    }

    private void populateError(CobolSqlCA sqlca, SQLException e) {
        sqlca.sqlcode = -Math.abs(e.getErrorCode());
        if (sqlca.sqlcode == 0) sqlca.sqlcode = -1;
        sqlca.sqlstate = e.getSQLState() != null ? e.getSQLState() : "58004";
        sqlca.sqlerrmc = e.getMessage() != null ? e.getMessage() : "";
        sqlca.sqlerrml = sqlca.sqlerrmc.length();
    }
}
