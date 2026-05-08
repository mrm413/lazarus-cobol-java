package com.lazarus.cobol.cics;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * CICS Transaction — Logical Unit of Work (LUW) management.
 *
 * In CICS, a transaction groups multiple resource updates (VSAM writes,
 * queue operations, DB2 updates) into an atomic unit. SYNCPOINT commits
 * all pending changes; SYNCPOINT ROLLBACK undoes them.
 *
 * This implementation uses JDBC transaction management. All VSAM files
 * share the same Connection, so commit/rollback applies to all of them.
 *
 * On ABEND, the transaction is automatically rolled back unless the
 * program had previously issued a SYNCPOINT.
 */
public class CicsTransaction {
    private final Connection conn;
    private boolean active;

    public CicsTransaction(Connection conn) {
        this.conn = conn;
        this.active = true;
        try {
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("CICS Transaction: failed to disable autocommit: " + e.getMessage());
        }
    }

    /**
     * SYNCPOINT — commit all pending changes.
     * Establishes a new sync point for subsequent work.
     */
    public void syncpoint() throws SQLException {
        conn.commit();
    }

    /**
     * SYNCPOINT ROLLBACK — undo all changes since the last SYNCPOINT.
     */
    public void rollback() throws SQLException {
        conn.rollback();
    }

    /**
     * Get the shared connection for VSAM file operations.
     * All files use this connection so they participate in the same LUW.
     */
    public Connection getConnection() {
        return conn;
    }

    /** Check if the transaction is active */
    public boolean isActive() {
        return active;
    }

    /** End the transaction (called by CicsRegion on task completion) */
    public void end(boolean commit) {
        active = false;
        try {
            if (commit) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (SQLException e) {
            System.err.println("CICS Transaction end failed: " + e.getMessage());
        }
    }

    /** Close the connection */
    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            // Ignore on close
        }
    }
}
