package com.lazarus.cobol.cics;

import java.sql.*;

/**
 * VSAM File I/O + Transaction Control Tests.
 * Uses H2 in-memory database.
 */
public class CicsVsamTest {

    static int passed = 0;
    static int failed = 0;
    static Connection conn;

    static void check(String name, boolean condition) {
        if (condition) {
            passed++;
        } else {
            failed++;
            System.err.println("  FAIL: " + name);
        }
    }

    public static void main(String[] args) throws Exception {
        System.err.println("=== CICS VSAM + Transaction Tests ===\n");

        // Initialize H2 in-memory database
        Class.forName("org.h2.Driver");
        conn = DriverManager.getConnection("jdbc:h2:mem:cicstest;DB_CLOSE_DELAY=-1", "sa", "");

        testKsdsBasicCrud();
        testKsdsBrowse();
        testKsdsGenericSearch();
        testKsdsAlternateIndex();
        testRrds();
        testEsds();
        testTransaction();
        testTransactionRollback();

        conn.close();

        System.err.println("\n=== Results: " + passed + " passed, " + failed + " failed ===");
        if (failed > 0) System.exit(1);
    }

    static void testKsdsBasicCrud() throws Exception {
        System.err.println("--- KSDS Basic CRUD ---");
        CicsVsamFile f = new CicsVsamFile("ACCTFILE", CicsVsamFile.Organization.KSDS,
            conn, "ACCT_KEY", 10);
        f.ensureTable();

        // WRITE
        int resp = f.write("ACCT001", "{\"name\":\"John\",\"balance\":1000}");
        check("WRITE ACCT001 OK", resp == CicsEIB.RESP_NORMAL);

        resp = f.write("ACCT002", "{\"name\":\"Jane\",\"balance\":2000}");
        check("WRITE ACCT002 OK", resp == CicsEIB.RESP_NORMAL);

        resp = f.write("ACCT003", "{\"name\":\"Bob\",\"balance\":500}");
        check("WRITE ACCT003 OK", resp == CicsEIB.RESP_NORMAL);

        // DUPREC
        resp = f.write("ACCT001", "{\"name\":\"Duplicate\"}");
        check("WRITE duplicate = DUPREC", resp == CicsEIB.RESP_DUPREC);

        // READ
        String data = f.read("ACCT002");
        check("READ ACCT002", data != null && data.contains("Jane"));

        // NOTFND
        data = f.read("ACCT999");
        check("READ missing = null", data == null);

        // REWRITE
        resp = f.rewrite("ACCT001", "{\"name\":\"John\",\"balance\":1500}");
        check("REWRITE OK", resp == CicsEIB.RESP_NORMAL);
        data = f.read("ACCT001");
        check("REWRITE data updated", data != null && data.contains("1500"));

        // DELETE
        resp = f.delete("ACCT003");
        check("DELETE OK", resp == CicsEIB.RESP_NORMAL);
        data = f.read("ACCT003");
        check("DELETE confirmed", data == null);

        check("record count = 2", f.getRecordCount() == 2);
        conn.commit();
        f.dropTable();
        conn.commit();
    }

    static void testKsdsBrowse() throws Exception {
        System.err.println("--- KSDS Browse ---");
        CicsVsamFile f = new CicsVsamFile("BROWSE", CicsVsamFile.Organization.KSDS,
            conn, "REC_KEY", 5);
        f.ensureTable();

        f.write("A001", "First");
        f.write("A002", "Second");
        f.write("A003", "Third");
        f.write("B001", "Fourth");
        f.write("B002", "Fifth");
        conn.commit();

        // STARTBR at A002
        f.startBrowse("A002", false);

        // READNEXT
        CicsVsamFile.BrowseResult r = f.readNext();
        check("READNEXT #1 key", r != null && "A002".equals(r.key));
        check("READNEXT #1 data", r != null && "Second".equals(r.data));

        r = f.readNext();
        check("READNEXT #2 key = A003", r != null && "A003".equals(r.key));

        r = f.readNext();
        check("READNEXT #3 key = B001", r != null && "B001".equals(r.key));

        // READPREV
        r = f.readPrev();
        check("READPREV back to A003", r != null && "A003".equals(r.key));

        // Read to end
        f.readNext(); // B001
        f.readNext(); // B002
        r = f.readNext();
        check("READNEXT past end = null (ENDFILE)", r == null);

        f.endBrowse();

        // GENERIC browse — prefix "A"
        f.startBrowse("A", true);
        int count = 0;
        while (f.readNext() != null) count++;
        check("GENERIC browse 'A' count = 3", count == 3);
        f.endBrowse();

        f.dropTable();
        conn.commit();
    }

    static void testKsdsGenericSearch() throws Exception {
        System.err.println("--- KSDS GENERIC Search ---");
        CicsVsamFile f = new CicsVsamFile("GENSRCH", CicsVsamFile.Organization.KSDS,
            conn, "ITEM_KEY", 10);
        f.ensureTable();

        f.write("PROD-001", "Widget A");
        f.write("PROD-002", "Widget B");
        f.write("SERV-001", "Service X");
        conn.commit();

        String data = f.readGeneric("PROD");
        check("GENERIC PROD finds first", data != null && data.contains("Widget"));

        data = f.readGeneric("SERV");
        check("GENERIC SERV finds service", data != null && data.contains("Service"));

        data = f.readGeneric("ZZZZ");
        check("GENERIC no match = null", data == null);

        f.dropTable();
        conn.commit();
    }

    static void testKsdsAlternateIndex() throws Exception {
        System.err.println("--- KSDS Alternate Index ---");
        CicsVsamFile f = new CicsVsamFile("ALTIDX", CicsVsamFile.Organization.KSDS,
            conn, "EMP_ID", 6);
        f.addAlternateIndex("EMP_NAME");
        f.addAlternateIndex("EMP_DEPT");
        f.ensureTable();

        java.util.Map<String, String> alts = new java.util.HashMap<String, String>();
        alts.put("EMP_NAME", "SMITH");
        alts.put("EMP_DEPT", "ACCT");
        f.write("E00001", "{\"salary\":50000}", alts);

        alts.put("EMP_NAME", "JONES");
        alts.put("EMP_DEPT", "ACCT");
        f.write("E00002", "{\"salary\":60000}", alts);

        alts.put("EMP_NAME", "BROWN");
        alts.put("EMP_DEPT", "IT");
        f.write("E00003", "{\"salary\":70000}", alts);
        conn.commit();

        // Read by primary key
        String data = f.read("E00002");
        check("read by primary key", data != null && data.contains("60000"));

        // Read by alternate index
        data = f.readByAltIndex("EMP_NAME", "BROWN");
        check("read by alt index NAME", data != null && data.contains("70000"));

        data = f.readByAltIndex("EMP_DEPT", "ACCT");
        check("read by alt index DEPT", data != null);

        f.dropTable();
        conn.commit();
    }

    static void testRrds() throws Exception {
        System.err.println("--- RRDS ---");
        CicsVsamFile f = new CicsVsamFile("RRDFILE", CicsVsamFile.Organization.RRDS,
            conn, "RRN", 0);
        f.ensureTable();

        // Write records (auto RRN)
        int rrn1 = f.writeRrds("Record One");
        int rrn2 = f.writeRrds("Record Two");
        int rrn3 = f.writeRrds("Record Three");
        check("RRDS rrn1 = 1", rrn1 == 1);
        check("RRDS rrn3 = 3", rrn3 == 3);

        // Read by RRN
        String data = f.readByRrn(2);
        check("RRDS read RRN 2", data != null && data.contains("Two"));

        data = f.readByRrn(99);
        check("RRDS read missing RRN", data == null);

        // Write at specific RRN
        int resp = f.writeRrdsAt(10, "Record Ten");
        check("RRDS write at RRN 10", resp == CicsEIB.RESP_NORMAL);
        data = f.readByRrn(10);
        check("RRDS read RRN 10", data != null && data.contains("Ten"));

        f.dropTable();
        conn.commit();
    }

    static void testEsds() throws Exception {
        System.err.println("--- ESDS ---");
        CicsVsamFile f = new CicsVsamFile("ESDFILE", CicsVsamFile.Organization.ESDS,
            conn, "RBA", 0);
        f.ensureTable();

        long rba1 = f.writeEsds("Log entry 1");
        long rba2 = f.writeEsds("Log entry 2");
        long rba3 = f.writeEsds("Log entry 3");
        check("ESDS rba1 = 0", rba1 == 0);
        check("ESDS rba2 > rba1", rba2 > rba1);
        check("ESDS rba3 > rba2", rba3 > rba2);

        String data = f.readByRba(rba1);
        check("ESDS read rba1", data != null && data.contains("entry 1"));

        data = f.readByRba(rba2);
        check("ESDS read rba2", data != null && data.contains("entry 2"));

        check("ESDS record count = 3", f.getRecordCount() == 3);

        f.dropTable();
        conn.commit();
    }

    static void testTransaction() throws Exception {
        System.err.println("--- Transaction (SYNCPOINT) ---");
        Connection txConn = DriverManager.getConnection(
            "jdbc:h2:mem:cicstest;DB_CLOSE_DELAY=-1", "sa", "");
        CicsTransaction tx = new CicsTransaction(txConn);

        CicsVsamFile f1 = new CicsVsamFile("TXF1", CicsVsamFile.Organization.KSDS,
            txConn, "K1", 5);
        CicsVsamFile f2 = new CicsVsamFile("TXF2", CicsVsamFile.Organization.KSDS,
            txConn, "K2", 5);
        f1.ensureTable();
        f2.ensureTable();

        // Write to both files
        f1.write("KEY1", "Data in file 1");
        f2.write("KEY2", "Data in file 2");

        // SYNCPOINT — commit both
        tx.syncpoint();

        // Verify both committed
        check("TX file1 committed", f1.read("KEY1") != null);
        check("TX file2 committed", f2.read("KEY2") != null);

        f1.dropTable();
        f2.dropTable();
        tx.end(true);
        tx.close();
    }

    static void testTransactionRollback() throws Exception {
        System.err.println("--- Transaction (ROLLBACK) ---");
        Connection txConn = DriverManager.getConnection(
            "jdbc:h2:mem:cicstest;DB_CLOSE_DELAY=-1", "sa", "");
        CicsTransaction tx = new CicsTransaction(txConn);

        CicsVsamFile f = new CicsVsamFile("TXRB", CicsVsamFile.Organization.KSDS,
            txConn, "RK", 5);
        f.ensureTable();
        txConn.commit(); // Commit the CREATE TABLE

        // Write a record and commit
        f.write("KEEP", "This stays");
        tx.syncpoint();

        // Write another and rollback
        f.write("GONE", "This goes away");
        check("before rollback: GONE exists", f.read("GONE") != null);
        tx.rollback();

        // GONE should be rolled back
        check("after rollback: GONE is null", f.read("GONE") == null);
        check("after rollback: KEEP still exists", f.read("KEEP") != null);

        f.dropTable();
        tx.end(true);
        tx.close();
    }
}
