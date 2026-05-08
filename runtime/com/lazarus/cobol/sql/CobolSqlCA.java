package com.lazarus.cobol.sql;

/**
 * COBOL SQL Communication Area (SQLCA).
 *
 * Maps to the standard DB2/SQL SQLCA structure used in COBOL programs:
 *   EXEC SQL INCLUDE SQLCA END-EXEC
 *
 * SQLCODE values:
 *   0    = Success
 *   100  = NOT FOUND (no more rows / empty result)
 *   < 0  = Error (value contains vendor-specific error code)
 *
 * SQLERRD(3) (sqlerrd[2] in 0-based) = rows affected by INSERT/UPDATE/DELETE
 */
public class CobolSqlCA {
    /** SQL return code: 0=OK, 100=NOT FOUND, <0=error */
    public int sqlcode = 0;

    /** SQL state (5-char SQLSTATE) */
    public String sqlstate = "00000";

    /** Error message text */
    public String sqlerrmc = "";

    /** Error message length */
    public int sqlerrml = 0;

    /** Diagnostic area (6 ints) — sqlerrd[2] = rows affected */
    public int[] sqlerrd = new int[6];

    /** Warning flags (8 chars) */
    public String sqlwarn = "        ";

    /** Reset to initial state */
    public void reset() {
        sqlcode = 0;
        sqlstate = "00000";
        sqlerrmc = "";
        sqlerrml = 0;
        sqlerrd = new int[6];
        sqlwarn = "        ";
    }

    /** Check if last SQL succeeded */
    public boolean isOk() {
        return sqlcode == 0;
    }

    /** Check if last SQL returned NOT FOUND */
    public boolean isNotFound() {
        return sqlcode == 100;
    }

    /** Check if last SQL had an error */
    public boolean isError() {
        return sqlcode < 0;
    }
}
