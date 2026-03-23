package com.lazarus.cobol.cics;

import java.sql.*;
import java.util.*;

/**
 * CICS VSAM File I/O backed by an embedded SQL database.
 *
 * Supports three VSAM organizations:
 * - KSDS (Key-Sequenced): primary key + alternate indexes, full CRUD + browse
 * - RRDS (Relative Record): array-index access by record number (RRN)
 * - ESDS (Entry-Sequenced): append-only, sequential access by RBA
 *
 * Each VSAM file maps to a database table. Browse operations (STARTBR/READNEXT/
 * READPREV/ENDBR) use SQL cursors. GENERIC key searches use LIKE with prefix.
 *
 * All operations participate in the current transaction (LUW) via the shared
 * JDBC Connection's transaction management.
 */
public class CicsVsamFile {

    public enum Organization { KSDS, RRDS, ESDS }

    private final String datasetName;
    private final Organization org;
    private final String tableName;
    private final Connection conn;

    // Column definitions
    private final String primaryKeyCol;
    private final int keyLength;
    private final List<String> altIndexCols = new ArrayList<String>();

    // Browse cursor state
    private PreparedStatement browseStmt = null;
    private ResultSet browseRs = null;
    private boolean browseForward = true;
    private boolean browseActive = false;

    // RRDS auto-increment tracking
    private int nextRrn = 1;

    // ESDS RBA tracking
    private long nextRba = 0;

    /**
     * Create a VSAM file backed by database.
     *
     * @param datasetName CICS DATASET/FILE name
     * @param org KSDS, RRDS, or ESDS
     * @param conn shared JDBC connection (for transaction participation)
     * @param primaryKeyCol name of the primary key column
     * @param keyLength key length in bytes (for GENERIC searches)
     */
    public CicsVsamFile(String datasetName, Organization org, Connection conn,
                        String primaryKeyCol, int keyLength) {
        this.datasetName = datasetName;
        this.org = org;
        this.conn = conn;
        this.tableName = "VSAM_" + datasetName.toUpperCase().replaceAll("[^A-Z0-9]", "_");
        this.primaryKeyCol = primaryKeyCol;
        this.keyLength = keyLength;
    }

    public String getDatasetName() { return datasetName; }
    public Organization getOrganization() { return org; }

    /** Add an alternate index column */
    public void addAlternateIndex(String colName) {
        altIndexCols.add(colName);
    }

    // --- Table Management ---

    /** Create the backing table if it doesn't exist */
    public void ensureTable() throws SQLException {
        DatabaseMetaData meta = conn.getMetaData();
        ResultSet rs = meta.getTables(null, null, tableName.toUpperCase(), null);
        if (rs.next()) {
            rs.close();
            return; // Already exists
        }
        rs.close();

        StringBuilder ddl = new StringBuilder();
        switch (org) {
            case KSDS:
                ddl.append("CREATE TABLE ").append(tableName).append(" (");
                ddl.append(primaryKeyCol).append(" VARCHAR(").append(Math.max(keyLength, 256)).append(") PRIMARY KEY, ");
                ddl.append("RECORD_DATA CLOB");
                for (String alt : altIndexCols) {
                    ddl.append(", ").append(alt).append(" VARCHAR(256)");
                }
                ddl.append(")");
                break;
            case RRDS:
                ddl.append("CREATE TABLE ").append(tableName).append(" (");
                ddl.append("RRN INT PRIMARY KEY, ");
                ddl.append("RECORD_DATA CLOB)");
                break;
            case ESDS:
                ddl.append("CREATE TABLE ").append(tableName).append(" (");
                ddl.append("RBA BIGINT PRIMARY KEY, ");
                ddl.append("RECORD_DATA CLOB)");
                break;
        }

        Statement stmt = conn.createStatement();
        stmt.execute(ddl.toString());
        stmt.close();

        // Create alternate index indexes
        for (String alt : altIndexCols) {
            Statement idxStmt = conn.createStatement();
            idxStmt.execute("CREATE INDEX IDX_" + tableName + "_" + alt +
                " ON " + tableName + "(" + alt + ")");
            idxStmt.close();
        }
    }

    // --- KSDS Operations ---

    /**
     * READ — read a record by primary key.
     * @return record data, or null if not found
     */
    public String read(String key) throws SQLException {
        String sql = "SELECT RECORD_DATA FROM " + tableName +
            " WHERE " + primaryKeyCol + " = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, key);
        ResultSet rs = ps.executeQuery();
        String data = null;
        if (rs.next()) {
            data = rs.getString(1);
        }
        rs.close();
        ps.close();
        return data;
    }

    /**
     * READ by alternate index.
     * @return record data, or null if not found
     */
    public String readByAltIndex(String altCol, String altKey) throws SQLException {
        String sql = "SELECT RECORD_DATA FROM " + tableName +
            " WHERE " + altCol + " = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, altKey);
        ResultSet rs = ps.executeQuery();
        String data = null;
        if (rs.next()) {
            data = rs.getString(1);
        }
        rs.close();
        ps.close();
        return data;
    }

    /**
     * WRITE — insert a new record.
     * @return RESP code (0=NORMAL, 14=DUPREC)
     */
    public int write(String key, String data) throws SQLException {
        return write(key, data, null);
    }

    /**
     * WRITE with alternate index values.
     */
    public int write(String key, String data, Map<String, String> altValues) throws SQLException {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO ").append(tableName).append(" (");
            sql.append(primaryKeyCol).append(", RECORD_DATA");
            List<String> altCols = new ArrayList<String>();
            if (altValues != null) {
                for (String col : altValues.keySet()) {
                    sql.append(", ").append(col);
                    altCols.add(col);
                }
            }
            sql.append(") VALUES (?");
            sql.append(", ?");
            for (int i = 0; i < altCols.size(); i++) sql.append(", ?");
            sql.append(")");

            PreparedStatement ps = conn.prepareStatement(sql.toString());
            ps.setString(1, key);
            ps.setString(2, data);
            int idx = 3;
            for (String col : altCols) {
                ps.setString(idx++, altValues.get(col));
            }
            ps.executeUpdate();
            ps.close();
            return CicsEIB.RESP_NORMAL;
        } catch (SQLException e) {
            if (e.getErrorCode() == 23505 || e.getMessage().contains("Unique") ||
                e.getMessage().contains("duplicate") || e.getMessage().contains("PRIMARY")) {
                return CicsEIB.RESP_DUPREC;
            }
            throw e;
        }
    }

    /**
     * REWRITE — update an existing record (must have been previously READ).
     * @return RESP code
     */
    public int rewrite(String key, String data) throws SQLException {
        return rewrite(key, data, null);
    }

    public int rewrite(String key, String data, Map<String, String> altValues) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE ").append(tableName).append(" SET RECORD_DATA = ?");
        List<String> altCols = new ArrayList<String>();
        if (altValues != null) {
            for (String col : altValues.keySet()) {
                sql.append(", ").append(col).append(" = ?");
                altCols.add(col);
            }
        }
        sql.append(" WHERE ").append(primaryKeyCol).append(" = ?");

        PreparedStatement ps = conn.prepareStatement(sql.toString());
        ps.setString(1, data);
        int idx = 2;
        for (String col : altCols) {
            ps.setString(idx++, altValues.get(col));
        }
        ps.setString(idx, key);
        int rows = ps.executeUpdate();
        ps.close();
        return (rows > 0) ? CicsEIB.RESP_NORMAL : CicsEIB.RESP_NOTFND;
    }

    /**
     * DELETE — delete a record by key.
     * @return RESP code
     */
    public int delete(String key) throws SQLException {
        String sql = "DELETE FROM " + tableName + " WHERE " + primaryKeyCol + " = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, key);
        int rows = ps.executeUpdate();
        ps.close();
        return (rows > 0) ? CicsEIB.RESP_NORMAL : CicsEIB.RESP_NOTFND;
    }

    // --- RRDS Operations ---

    /** READ by Relative Record Number (1-based) */
    public String readByRrn(int rrn) throws SQLException {
        String sql = "SELECT RECORD_DATA FROM " + tableName + " WHERE RRN = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, rrn);
        ResultSet rs = ps.executeQuery();
        String data = null;
        if (rs.next()) data = rs.getString(1);
        rs.close();
        ps.close();
        return data;
    }

    /** WRITE to RRDS — auto-assigns next RRN */
    public int writeRrds(String data) throws SQLException {
        String sql = "INSERT INTO " + tableName + " (RRN, RECORD_DATA) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, nextRrn);
        ps.setString(2, data);
        ps.executeUpdate();
        ps.close();
        int rrn = nextRrn;
        nextRrn++;
        return rrn;
    }

    /** WRITE to RRDS at specific RRN */
    public int writeRrdsAt(int rrn, String data) throws SQLException {
        try {
            String sql = "INSERT INTO " + tableName + " (RRN, RECORD_DATA) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, rrn);
            ps.setString(2, data);
            ps.executeUpdate();
            ps.close();
            if (rrn >= nextRrn) nextRrn = rrn + 1;
            return CicsEIB.RESP_NORMAL;
        } catch (SQLException e) {
            return CicsEIB.RESP_DUPREC;
        }
    }

    // --- ESDS Operations ---

    /** WRITE to ESDS — append-only, auto-assigns RBA */
    public long writeEsds(String data) throws SQLException {
        String sql = "INSERT INTO " + tableName + " (RBA, RECORD_DATA) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setLong(1, nextRba);
        ps.setString(2, data);
        ps.executeUpdate();
        ps.close();
        long rba = nextRba;
        nextRba += data.length() + 4; // Simulate RBA advancement
        return rba;
    }

    /** READ ESDS by RBA */
    public String readByRba(long rba) throws SQLException {
        String sql = "SELECT RECORD_DATA FROM " + tableName + " WHERE RBA = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setLong(1, rba);
        ResultSet rs = ps.executeQuery();
        String data = null;
        if (rs.next()) data = rs.getString(1);
        rs.close();
        ps.close();
        return data;
    }

    // --- Browse Operations (STARTBR / READNEXT / READPREV / ENDBR) ---

    /**
     * STARTBR — start a browse at or after the specified key.
     * @param key the starting key (or prefix for GENERIC)
     * @param generic true for prefix search (GENERIC option)
     */
    public int startBrowse(String key, boolean generic) throws SQLException {
        endBrowse(); // Close any existing browse

        String orderCol;
        switch (org) {
            case RRDS: orderCol = "RRN"; break;
            case ESDS: orderCol = "RBA"; break;
            default: orderCol = primaryKeyCol; break;
        }

        String sql;
        if (generic && org == Organization.KSDS) {
            sql = "SELECT " + primaryKeyCol + ", RECORD_DATA FROM " + tableName +
                " WHERE " + primaryKeyCol + " LIKE ? ORDER BY " + primaryKeyCol;
        } else if (org == Organization.KSDS) {
            sql = "SELECT " + primaryKeyCol + ", RECORD_DATA FROM " + tableName +
                " WHERE " + primaryKeyCol + " >= ? ORDER BY " + primaryKeyCol;
        } else {
            sql = "SELECT " + orderCol + ", RECORD_DATA FROM " + tableName +
                " ORDER BY " + orderCol;
        }

        browseStmt = conn.prepareStatement(sql,
            ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        if (org == Organization.KSDS) {
            if (generic) {
                browseStmt.setString(1, key + "%");
            } else {
                browseStmt.setString(1, key);
            }
        }
        browseRs = browseStmt.executeQuery();
        browseActive = true;
        browseForward = true;
        return CicsEIB.RESP_NORMAL;
    }

    /** Browse result holder */
    public static class BrowseResult {
        public final String key;
        public final String data;
        public BrowseResult(String key, String data) {
            this.key = key;
            this.data = data;
        }
    }

    /**
     * READNEXT — read the next record in browse sequence.
     * @return BrowseResult or null if at end
     */
    public BrowseResult readNext() throws SQLException {
        if (!browseActive || browseRs == null) return null;
        if (browseRs.next()) {
            return new BrowseResult(browseRs.getString(1), browseRs.getString(2));
        }
        return null; // ENDFILE
    }

    /**
     * READPREV — read the previous record in browse sequence.
     * @return BrowseResult or null if at beginning
     */
    public BrowseResult readPrev() throws SQLException {
        if (!browseActive || browseRs == null) return null;
        if (browseRs.previous()) {
            return new BrowseResult(browseRs.getString(1), browseRs.getString(2));
        }
        return null; // Beginning of file
    }

    /** ENDBR — end the browse */
    public void endBrowse() throws SQLException {
        if (browseRs != null) {
            browseRs.close();
            browseRs = null;
        }
        if (browseStmt != null) {
            browseStmt.close();
            browseStmt = null;
        }
        browseActive = false;
    }

    /** RESETBR — reset browse to a new position */
    public int resetBrowse(String key, boolean generic) throws SQLException {
        endBrowse();
        return startBrowse(key, generic);
    }

    // --- GENERIC key search ---

    /**
     * Read with GENERIC option — prefix match on primary key.
     * Returns the first matching record.
     */
    public String readGeneric(String keyPrefix) throws SQLException {
        String sql = "SELECT RECORD_DATA FROM " + tableName +
            " WHERE " + primaryKeyCol + " LIKE ? ORDER BY " + primaryKeyCol +
            " FETCH FIRST 1 ROWS ONLY";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, keyPrefix + "%");
        ResultSet rs = ps.executeQuery();
        String data = null;
        if (rs.next()) data = rs.getString(1);
        rs.close();
        ps.close();
        return data;
    }

    // --- Utility ---

    /** Get record count */
    public int getRecordCount() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM " + tableName);
        rs.next();
        int count = rs.getInt(1);
        rs.close();
        stmt.close();
        return count;
    }

    /** Drop the backing table */
    public void dropTable() throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.execute("DROP TABLE IF EXISTS " + tableName);
        stmt.close();
    }
}
