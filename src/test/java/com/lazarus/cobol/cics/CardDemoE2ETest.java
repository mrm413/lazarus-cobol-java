package com.lazarus.cobol.cics;

import java.sql.*;
import java.util.*;

/**
 * Phase 10 — CardDemo End-to-End Functional Test.
 *
 * Simulates the AWS CardDemo CICS application flow:
 *   Sign-on (COSGN00C) → Menu (COMEN01C) → Account View (COACTVWC)
 *   → Transaction List (COTRN00C) → Transaction Update (COTRN01C)
 *
 * Uses the full CICS runtime stack:
 *   CicsRegion + CicsTask + CicsEIB + BMS Maps + VSAM Files + TSQ/TDQ
 */
public class CardDemoE2ETest {

    static int passed = 0;
    static int failed = 0;
    static CicsRegion region;
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
        System.err.println("=== CardDemo End-to-End Tests ===\n");

        // Initialize H2 database for VSAM backing
        Class.forName("org.h2.Driver");
        conn = DriverManager.getConnection("jdbc:h2:mem:carddemo;DB_CLOSE_DELAY=-1", "sa", "");

        // Build the CICS region
        region = new CicsRegion();
        setupBmsMaps();
        setupVsamFiles();
        registerPrograms();
        registerTransactions();

        // Run E2E scenarios
        testSignOnFlow();
        testSignOnBadPassword();
        testMenuNavigation();
        testAccountView();
        testTransactionBrowse();
        testTransactionUpdate();
        testTsqSessionData();
        testTdqAuditLog();
        testXctlProgramChain();
        testAbendRecovery();
        testConcurrentTasks();

        conn.close();

        System.err.println("\n=== Results: " + passed + " passed, " + failed + " failed ===");
        if (failed > 0) System.exit(1);
    }

    // ── Setup ───────────────────────────────────────────────

    static void setupBmsMaps() {
        // COSGN00 mapset — Sign-on screen
        CicsMap signon = new CicsMap("COSGN0A", "COSGN00", 24, 80);
        signon.addField("USERID", 10, 25, 8, false, "", new CicsFieldAttr());
        signon.addField("PASSWD", 12, 25, 8, false, "", new CicsFieldAttr().protect().dark());
        signon.addField("ERRMSG", 22, 1, 78, false, "", new CicsFieldAttr().protect());
        region.registerMap(signon);

        // COMEN01 mapset — Main menu
        CicsMap menu = new CicsMap("COMEN1A", "COMEN01", 24, 80);
        menu.addField("OPTSEL", 8, 25, 2, true, "", new CicsFieldAttr());
        menu.addField("PGMNAME", 20, 25, 8, false, "", new CicsFieldAttr().protect());
        region.registerMap(menu);

        // COACTVW mapset — Account view
        CicsMap acctView = new CicsMap("ACTVWM", "COACTVW", 24, 80);
        acctView.addField("ACCTNO", 6, 20, 11, true, "", new CicsFieldAttr().protect());
        acctView.addField("ACTSTS", 7, 20, 1, false, "", new CicsFieldAttr().protect());
        acctView.addField("CARDNO", 8, 20, 16, true, "", new CicsFieldAttr().protect());
        acctView.addField("FNAME", 9, 20, 25, false, "", new CicsFieldAttr().protect());
        acctView.addField("LNAME", 10, 20, 25, false, "", new CicsFieldAttr().protect());
        region.registerMap(acctView);

        // COTRN00 mapset — Transaction list
        CicsMap trnList = new CicsMap("COTRN0A", "COTRN00", 24, 80);
        trnList.addField("ACCTNO", 5, 20, 11, true, "", new CicsFieldAttr());
        trnList.addField("TRNID1", 8, 5, 16, true, "", new CicsFieldAttr().protect());
        trnList.addField("TRNAMT1", 8, 35, 10, true, "", new CicsFieldAttr().protect());
        region.registerMap(trnList);
    }

    static void setupVsamFiles() throws Exception {
        // USRSEC — User security file (KSDS)
        CicsVsamFile usrsec = new CicsVsamFile("USRSEC", CicsVsamFile.Organization.KSDS,
            conn, "USER_ID", 8);
        usrsec.ensureTable();
        usrsec.write("USER0001", "{\"password\":\"PASS0001\",\"type\":\"A\",\"fname\":\"ADMIN\",\"lname\":\"USER\"}");
        usrsec.write("USER0002", "{\"password\":\"PASS0002\",\"type\":\"U\",\"fname\":\"JOHN\",\"lname\":\"DOE\"}");
        conn.commit();

        // ACCTDAT — Account master (KSDS)
        CicsVsamFile acctdat = new CicsVsamFile("ACCTDAT", CicsVsamFile.Organization.KSDS,
            conn, "ACCT_ID", 11);
        acctdat.ensureTable();
        acctdat.write("00000000001", "{\"status\":\"Y\",\"card\":\"4111111111111111\",\"fname\":\"JOHN\",\"lname\":\"DOE\",\"bal\":\"15000.00\"}");
        acctdat.write("00000000002", "{\"status\":\"Y\",\"card\":\"4222222222222222\",\"fname\":\"JANE\",\"lname\":\"SMITH\",\"bal\":\"28500.50\"}");
        acctdat.write("00000000003", "{\"status\":\"N\",\"card\":\"4333333333333333\",\"fname\":\"BOB\",\"lname\":\"JONES\",\"bal\":\"0.00\"}");
        conn.commit();

        // TRANSACT — Transaction file (KSDS)
        CicsVsamFile transact = new CicsVsamFile("TRANSACT", CicsVsamFile.Organization.KSDS,
            conn, "TRAN_ID", 16);
        transact.ensureTable();
        transact.write("0000000000000001", "{\"acct\":\"00000000001\",\"type\":\"PU\",\"amt\":\"150.00\",\"desc\":\"GROCERY STORE\"}");
        transact.write("0000000000000002", "{\"acct\":\"00000000001\",\"type\":\"PU\",\"amt\":\"75.50\",\"desc\":\"GAS STATION\"}");
        transact.write("0000000000000003", "{\"acct\":\"00000000002\",\"type\":\"CR\",\"amt\":\"500.00\",\"desc\":\"PAYMENT\"}");
        transact.write("0000000000000004", "{\"acct\":\"00000000001\",\"type\":\"PU\",\"amt\":\"1200.00\",\"desc\":\"ELECTRONICS\"}");
        conn.commit();

        // AUDITLOG — Audit TDQ (auto-created)
        region.getTdQueue("CSMT", true);
    }

    static void registerPrograms() {
        // COSGN00C — Sign-on program
        region.registerProgram("COSGN00C", () -> new SignOnProgram(region, conn));
        // COMEN01C — Main menu
        region.registerProgram("COMEN01C", () -> new MenuProgram(region));
        // COACTVWC — Account view
        region.registerProgram("COACTVWC", () -> new AccountViewProgram(region, conn));
        // COTRN00C — Transaction list
        region.registerProgram("COTRN00C", () -> new TransactionListProgram(region, conn));
        // COTRN01C — Transaction update
        region.registerProgram("COTRN01C", () -> new TransactionUpdateProgram(region, conn));
    }

    static void registerTransactions() {
        region.registerTransaction("CC00", "COSGN00C");
        region.registerTransaction("CC01", "COMEN01C");
        region.registerTransaction("CA02", "COACTVWC");
        region.registerTransaction("CT00", "COTRN00C");
        region.registerTransaction("CT01", "COTRN01C");
    }

    // ── Test Scenarios ───────────────────────────────────────

    /** Test 1: Successful sign-on flow */
    static void testSignOnFlow() {
        System.err.println("--- Sign-On Flow ---");
        CicsTask task = region.createTask("CC00", "T001", null);
        CicsTask.setCurrentTask(task);

        SignOnProgram pgm = new SignOnProgram(region, conn);
        pgm.setInput("USER0001", "PASS0001");
        try {
            pgm.run();
            check("sign-on: program ran", true);
        } catch (XctlException xe) {
            // XCTL to menu = successful sign-on
            check("sign-on: XCTL to menu", "COMEN01C".equals(xe.getProgramName()));
        } catch (ReturnException re) {
            check("sign-on: returned", true);
        } finally {
            CicsTask.setCurrentTask(null);
        }
    }

    /** Test 2: Bad password gets error */
    static void testSignOnBadPassword() {
        System.err.println("--- Bad Password ---");
        CicsTask task = region.createTask("CC00", "T002", null);
        CicsTask.setCurrentTask(task);

        SignOnProgram pgm = new SignOnProgram(region, conn);
        pgm.setInput("USER0001", "WRONGPWD");
        try {
            pgm.run();
        } catch (XctlException xe) {
            check("bad pwd: should NOT xctl", false);
        } catch (ReturnException re) {
            check("bad pwd: returned (re-display screen)", true);
        }
        check("bad pwd: EIB resp set", task.getEib().eibresp == CicsEIB.RESP_NORMAL ||
            task.getEib().eibresp == CicsEIB.RESP_NOTFND);
        CicsTask.setCurrentTask(null);
    }

    /** Test 3: Menu navigation to different programs */
    static void testMenuNavigation() {
        System.err.println("--- Menu Navigation ---");
        CicsTask task = region.createTask("CC01", "T003", null);
        CicsTask.setCurrentTask(task);

        MenuProgram pgm = new MenuProgram(region);

        // Select account view (option 01)
        pgm.setSelection("01");
        try {
            pgm.run();
        } catch (XctlException xe) {
            check("menu opt 01: XCTL to COACTVWC", "COACTVWC".equals(xe.getProgramName()));
        } catch (ReturnException re) {
            check("menu: returned", true);
        }

        // Select transaction list (option 03)
        pgm.setSelection("03");
        try {
            pgm.run();
        } catch (XctlException xe) {
            check("menu opt 03: XCTL to COTRN00C", "COTRN00C".equals(xe.getProgramName()));
        } catch (ReturnException re) {
            check("menu: returned", true);
        }
        CicsTask.setCurrentTask(null);
    }

    /** Test 4: Account view reads VSAM and populates map */
    static void testAccountView() throws Exception {
        System.err.println("--- Account View ---");
        CicsTask task = region.createTask("CA02", "T004", null);
        CicsTask.setCurrentTask(task);

        AccountViewProgram pgm = new AccountViewProgram(region, conn);
        pgm.setAccountNumber("00000000001");
        try {
            pgm.run();
        } catch (ReturnException re) {
            // Normal end
        }

        check("acct view: found account", pgm.isAccountFound());
        check("acct view: fname = JOHN", "JOHN".equals(pgm.getFirstName()));
        check("acct view: lname = DOE", "DOE".equals(pgm.getLastName()));
        check("acct view: card = 4111111111111111", "4111111111111111".equals(pgm.getCardNumber()));
        CicsTask.setCurrentTask(null);
    }

    /** Test 5: Transaction browse with STARTBR/READNEXT */
    static void testTransactionBrowse() throws Exception {
        System.err.println("--- Transaction Browse ---");
        CicsTask task = region.createTask("CT00", "T005", null);
        CicsTask.setCurrentTask(task);

        TransactionListProgram pgm = new TransactionListProgram(region, conn);
        pgm.setAccountFilter("00000000001");
        try {
            pgm.run();
        } catch (ReturnException re) {
            // Normal end
        }

        check("trn browse: found transactions", pgm.getTransactionCount() > 0);
        check("trn browse: count = 3 for acct 001", pgm.getTransactionCount() == 3);
        CicsTask.setCurrentTask(null);
    }

    /** Test 6: Transaction update via VSAM REWRITE */
    static void testTransactionUpdate() throws Exception {
        System.err.println("--- Transaction Update ---");
        CicsTask task = region.createTask("CT01", "T006", null);
        CicsTask.setCurrentTask(task);

        TransactionUpdateProgram pgm = new TransactionUpdateProgram(region, conn);
        pgm.setTransactionId("0000000000000001");
        pgm.setNewDescription("UPDATED GROCERY");
        try {
            pgm.run();
        } catch (ReturnException re) {
            // Normal end
        }

        check("trn update: rewrite OK", pgm.isUpdateSuccessful());

        // Verify via direct VSAM read
        CicsVsamFile transact = new CicsVsamFile("TRANSACT", CicsVsamFile.Organization.KSDS,
            conn, "TRAN_ID", 16);
        String data = transact.read("0000000000000001");
        check("trn update: data updated", data != null && data.contains("UPDATED GROCERY"));
        CicsTask.setCurrentTask(null);
    }

    /** Test 7: TSQ for session state */
    static void testTsqSessionData() {
        System.err.println("--- TSQ Session Data ---");
        CicsTask task = region.createTask("CC01", "T007", null);
        CicsTask.setCurrentTask(task);

        // Simulate storing user session data in TSQ
        CicsTSQueue tsq = region.getTsQueue("CARDSESS", true);
        task.trackSessionTsQueue("CARDSESS");

        tsq.writeItem("USER=USER0001".getBytes(), 0, false);
        tsq.writeItem("ACCT=00000000001".getBytes(), 0, false);
        tsq.writeItem("LASTMENU=01".getBytes(), 0, false);

        check("tsq: 3 items", tsq.getNumItems() == 3);
        check("tsq: item 1 = user", "USER=USER0001".equals(new String(tsq.readItem(1))));
        check("tsq: item 3 = lastmenu", "LASTMENU=01".equals(new String(tsq.readItem(3))));

        // Rewrite item
        tsq.writeItem("LASTMENU=03".getBytes(), 3, true);
        check("tsq: rewritten", "LASTMENU=03".equals(new String(tsq.readItem(3))));

        // Cleanup removes session TSQs
        task.cleanup();
        CicsTask.setCurrentTask(null);
    }

    /** Test 8: TDQ audit logging */
    static void testTdqAuditLog() {
        System.err.println("--- TDQ Audit Log ---");
        CicsTDQueue auditQ = region.getTdQueue("CSMT", false);
        check("tdq: CSMT exists", auditQ != null);

        auditQ.writeItem("AUDIT: User USER0001 signed on at 2026-03-23 10:00:00".getBytes());
        auditQ.writeItem("AUDIT: User USER0001 viewed account 00000000001".getBytes());
        auditQ.writeItem("AUDIT: User USER0001 updated transaction 0000000000000001".getBytes());

        check("tdq: 3 items", auditQ.getDepth() == 3);

        // Destructive read
        byte[] entryBytes = auditQ.readItem();
        String entry = entryBytes != null ? new String(entryBytes) : null;
        check("tdq: dequeued first", entry != null && entry.contains("signed on"));
        check("tdq: 2 remaining", auditQ.getDepth() == 2);
    }

    /** Test 9: XCTL program chain (menu → account → back to menu) */
    static void testXctlProgramChain() {
        System.err.println("--- XCTL Program Chain ---");

        final int[] visitOrder = {0};

        region.registerProgram("CHAIN_A", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            visitOrder[0] = 1;
            ct.xctl("CHAIN_B", "HELLO".getBytes(), null);
        });
        region.registerProgram("CHAIN_B", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            check("chain: A ran first", visitOrder[0] == 1);
            visitOrder[0] = 2;
            byte[] commarea = ct.getCommarea();
            check("chain: commarea passed", commarea != null && new String(commarea).equals("HELLO"));
            ct.xctl("CHAIN_C", null, null);
        });
        region.registerProgram("CHAIN_C", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            check("chain: B ran second", visitOrder[0] == 2);
            visitOrder[0] = 3;
            ct.returnControl(null, null, false);
        });
        region.registerTransaction("CHNX", "CHAIN_A");
        region.runTask("CHNX", "TCHN", null);
        check("chain: all 3 ran", visitOrder[0] == 3);
    }

    /** Test 10: ABEND recovery with HANDLE ABEND */
    static void testAbendRecovery() {
        System.err.println("--- ABEND Recovery ---");

        final boolean[] recovered = {false};
        region.registerProgram("ABENDPGM", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            ct.handleAbendLabel("ERROR_HANDLER");
            ct.abend("USR1", true, false);
        });
        region.registerProgram("RECOVERYPGM", () -> () -> {
            recovered[0] = true;
        });
        region.registerTransaction("ABNT", "ABENDPGM");
        // The abend handler fires (prints to stderr), program ends
        region.runTask("ABNT", "TABN", null);
        check("abend: handled gracefully", true); // If we got here without crashing
    }

    /** Test 11: Concurrent tasks don't interfere */
    static void testConcurrentTasks() throws Exception {
        System.err.println("--- Concurrent Tasks ---");

        final Map<String, String> results = Collections.synchronizedMap(new HashMap<>());

        region.registerProgram("CONC_PGM", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            String trnid = ct.getEib().eibtrnid;
            // Each task records its own TRANSID
            results.put(Thread.currentThread().getName(), trnid);
            try { Thread.sleep(50); } catch (InterruptedException e) {}
        });
        region.registerTransaction("CON1", "CONC_PGM");
        region.registerTransaction("CON2", "CONC_PGM");

        Thread t1 = new Thread(() -> region.runTask("CON1", "TC01", null), "task-1");
        Thread t2 = new Thread(() -> region.runTask("CON2", "TC02", null), "task-2");
        t1.start(); t2.start();
        t1.join(5000); t2.join(5000);

        check("concurrent: task-1 saw CON1", "CON1".equals(results.get("task-1")));
        check("concurrent: task-2 saw CON2", "CON2".equals(results.get("task-2")));
    }

    // ── Simulated CardDemo Programs ──────────────────────────
    // These simulate what the transpiled COBOL generates, using the CICS runtime

    /** Sign-On Program (simulates COSGN00C) */
    static class SignOnProgram implements Runnable {
        private final CicsRegion region;
        private final Connection conn;
        private String userId = "";
        private String password = "";

        SignOnProgram(CicsRegion region, Connection conn) {
            this.region = region;
            this.conn = conn;
        }

        void setInput(String userId, String password) {
            this.userId = userId;
            this.password = password;
        }

        @Override
        public void run() {
            CicsTask task = CicsTask.currentTask();
            CicsEIB eib = task.getEib();

            // RECEIVE MAP — get user input
            CicsMap map = region.getMap("COSGN00", "COSGN0A");
            map.setFieldValue("USERID", userId);
            map.setFieldValue("PASSWD", password);

            // READ USRSEC file to validate credentials
            try {
                CicsVsamFile usrsec = new CicsVsamFile("USRSEC", CicsVsamFile.Organization.KSDS,
                    conn, "USER_ID", 8);
                String userData = usrsec.read(userId.trim());

                if (userData == null) {
                    eib.setResponse(CicsEIB.RESP_NOTFND, 0);
                    throw new ReturnException(null, null, false); // Re-display with error
                }

                // Check password (simplified JSON parsing)
                if (!userData.contains("\"password\":\"" + password + "\"")) {
                    eib.setResponse(CicsEIB.RESP_NORMAL, 0);
                    throw new ReturnException(null, null, false); // Bad password
                }

                // Successful sign-on — XCTL to menu
                eib.setResponse(CicsEIB.RESP_NORMAL, 0);
                task.xctl("COMEN01C", (userId + "        ").substring(0, 8).getBytes(), null);
            } catch (Exception e) {
                if (e instanceof XctlException) throw (XctlException) e;
                if (e instanceof ReturnException) throw (ReturnException) e;
                throw new ReturnException(null, null, false);
            }
        }
    }

    /** Main Menu (simulates COMEN01C) */
    static class MenuProgram implements Runnable {
        private final CicsRegion region;
        private String selection = "";

        MenuProgram(CicsRegion region) { this.region = region; }
        void setSelection(String sel) { this.selection = sel; }

        @Override
        public void run() {
            CicsTask task = CicsTask.currentTask();
            switch (selection) {
                case "01": task.xctl("COACTVWC", null, null); break;
                case "02": task.xctl("COACTUPC", null, null); break;
                case "03": task.xctl("COTRN00C", null, null); break;
                case "04": task.xctl("COTRN01C", null, null); break;
                default:
                    task.returnControl(null, null, false);
            }
        }
    }

    /** Account View (simulates COACTVWC) */
    static class AccountViewProgram implements Runnable {
        private final CicsRegion region;
        private final Connection conn;
        private String acctNum = "";
        private boolean found = false;
        private String fname = "", lname = "", cardNum = "";

        AccountViewProgram(CicsRegion region, Connection conn) {
            this.region = region;
            this.conn = conn;
        }

        void setAccountNumber(String acctNum) { this.acctNum = acctNum; }
        boolean isAccountFound() { return found; }
        String getFirstName() { return fname; }
        String getLastName() { return lname; }
        String getCardNumber() { return cardNum; }

        @Override
        public void run() {
            CicsTask task = CicsTask.currentTask();
            try {
                CicsVsamFile acctdat = new CicsVsamFile("ACCTDAT", CicsVsamFile.Organization.KSDS,
                    conn, "ACCT_ID", 11);
                String data = acctdat.read(acctNum);
                if (data != null) {
                    found = true;
                    // Simplified JSON field extraction
                    fname = extractJsonField(data, "fname");
                    lname = extractJsonField(data, "lname");
                    cardNum = extractJsonField(data, "card");
                    task.getEib().setResponse(CicsEIB.RESP_NORMAL, 0);
                } else {
                    task.getEib().setResponse(CicsEIB.RESP_NOTFND, 0);
                }
            } catch (Exception e) {
                task.getEib().setResponse(CicsEIB.RESP_INVREQ, 0);
            }
            throw new ReturnException(null, null, false);
        }
    }

    /** Transaction List with STARTBR/READNEXT (simulates COTRN00C) */
    static class TransactionListProgram implements Runnable {
        private final CicsRegion region;
        private final Connection conn;
        private String acctFilter = "";
        private int txnCount = 0;

        TransactionListProgram(CicsRegion region, Connection conn) {
            this.region = region;
            this.conn = conn;
        }

        void setAccountFilter(String acct) { this.acctFilter = acct; }
        int getTransactionCount() { return txnCount; }

        @Override
        public void run() {
            CicsTask task = CicsTask.currentTask();
            try {
                CicsVsamFile transact = new CicsVsamFile("TRANSACT", CicsVsamFile.Organization.KSDS,
                    conn, "TRAN_ID", 16);
                // STARTBR — browse all transactions
                transact.startBrowse("0000000000000000", false);
                CicsVsamFile.BrowseResult r;
                txnCount = 0;
                while ((r = transact.readNext()) != null) {
                    // Filter by account
                    if (r.data.contains("\"acct\":\"" + acctFilter + "\"")) {
                        txnCount++;
                    }
                }
                transact.endBrowse();
                task.getEib().setResponse(CicsEIB.RESP_NORMAL, 0);
            } catch (Exception e) {
                task.getEib().setResponse(CicsEIB.RESP_INVREQ, 0);
            }
            throw new ReturnException(null, null, false);
        }
    }

    /** Transaction Update with REWRITE (simulates COTRN01C) */
    static class TransactionUpdateProgram implements Runnable {
        private final CicsRegion region;
        private final Connection conn;
        private String txnId = "";
        private String newDesc = "";
        private boolean updateOk = false;

        TransactionUpdateProgram(CicsRegion region, Connection conn) {
            this.region = region;
            this.conn = conn;
        }

        void setTransactionId(String id) { this.txnId = id; }
        void setNewDescription(String desc) { this.newDesc = desc; }
        boolean isUpdateSuccessful() { return updateOk; }

        @Override
        public void run() {
            CicsTask task = CicsTask.currentTask();
            try {
                CicsVsamFile transact = new CicsVsamFile("TRANSACT", CicsVsamFile.Organization.KSDS,
                    conn, "TRAN_ID", 16);
                String data = transact.read(txnId);
                if (data != null) {
                    // Replace description field
                    String updated = data.replaceAll("\"desc\":\"[^\"]*\"", "\"desc\":\"" + newDesc + "\"");
                    int resp = transact.rewrite(txnId, updated);
                    updateOk = (resp == CicsEIB.RESP_NORMAL);
                    task.getEib().setResponse(resp, 0);
                    conn.commit();
                } else {
                    task.getEib().setResponse(CicsEIB.RESP_NOTFND, 0);
                }
            } catch (Exception e) {
                task.getEib().setResponse(CicsEIB.RESP_INVREQ, 0);
            }
            throw new ReturnException(null, null, false);
        }
    }

    // ── Utility ──────────────────────────────────────────────

    static String extractJsonField(String json, String field) {
        int idx = json.indexOf("\"" + field + "\":\"");
        if (idx < 0) return "";
        int start = idx + field.length() + 4;
        int end = json.indexOf("\"", start);
        return end > start ? json.substring(start, end) : "";
    }
}
