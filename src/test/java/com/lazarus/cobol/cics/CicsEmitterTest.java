package com.lazarus.cobol.cics;

/**
 * Phase 9 Integration Test — Verifies that transpiled CICS programs
 * can interact with the CICS runtime (CicsRegion → CicsTask → EIB).
 */
public class CicsEmitterTest {

    static int passed = 0;
    static int failed = 0;

    static void check(String name, boolean condition) {
        if (condition) {
            passed++;
        } else {
            failed++;
            System.err.println("  FAIL: " + name);
        }
    }

    public static void main(String[] args) throws Exception {
        System.err.println("=== CICS Emitter Integration Tests ===\n");

        testCurrentTaskThreadLocal();
        testGeneratedProgramLinkage();
        testXctlChain();
        testEibAccessFromProgram();
        testSendReceiveMapStubs();
        testRespCapture();

        System.err.println("\n=== Results: " + passed + " passed, " + failed + " failed ===");
        if (failed > 0) System.exit(1);
    }

    /** Test 1: CicsTask.currentTask() ThreadLocal */
    static void testCurrentTaskThreadLocal() {
        System.err.println("--- ThreadLocal Task ---");
        check("currentTask initially null", CicsTask.currentTask() == null);

        CicsRegion region = new CicsRegion();
        region.registerTransaction("TST1", "DUMMY");
        region.registerProgram("DUMMY", () -> () -> {});

        CicsTask task = region.createTask("TST1", "T001", null);
        CicsTask.setCurrentTask(task);
        check("currentTask set", CicsTask.currentTask() == task);
        check("currentTask EIB accessible", CicsTask.currentTask().getEib() != null);
        check("EIB transid", "TST1".equals(CicsTask.currentTask().getEib().eibtrnid));

        CicsTask.setCurrentTask(null);
        check("currentTask cleared", CicsTask.currentTask() == null);
    }

    /** Test 2: Generated program runs within CICS region */
    static void testGeneratedProgramLinkage() {
        System.err.println("--- Generated Program Linkage ---");
        CicsRegion region = new CicsRegion();
        final boolean[] ran = {false};

        // Simulate a generated program that uses CicsTask.currentTask()
        region.registerProgram("TESTPGM", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            if (ct != null) {
                ran[0] = true;
                ct.getEib().setResponse(CicsEIB.RESP_NORMAL, 0);
            }
        });
        region.registerTransaction("TSTP", "TESTPGM");
        region.runTask("TSTP", "T002", null);
        check("generated program ran", ran[0]);
    }

    /** Test 3: XCTL chain between generated programs */
    static void testXctlChain() {
        System.err.println("--- XCTL Chain ---");
        CicsRegion region = new CicsRegion();
        final int[] order = {0};

        region.registerProgram("FIRST", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            order[0] = 1;
            ct.xctl("SECOND", null, null);
        });

        region.registerProgram("SECOND", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            check("XCTL: first ran", order[0] == 1);
            order[0] = 2;
            ct.returnControl(null, null, false);
        });

        region.registerTransaction("XCHAIN", "FIRST");
        region.runTask("XCHAIN", "T003", null);
        check("XCTL: second ran", order[0] == 2);
    }

    /** Test 4: EIB fields accessible from program context */
    static void testEibAccessFromProgram() {
        System.err.println("--- EIB Access ---");
        CicsRegion region = new CicsRegion();

        region.registerProgram("EIBPGM", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            CicsEIB eib = ct.getEib();
            check("EIB date > 0", eib.eibdate > 0);
            check("EIB time > 0", eib.eibtime > 0);
            check("EIB taskn > 0", eib.eibtaskn > 0);
            check("EIB trnid = EIBT", "EIBT".equals(eib.eibtrnid));
            check("EIB trmid = T004", "T004".equals(eib.eibtrmid));
        });
        region.registerTransaction("EIBT", "EIBPGM");
        region.runTask("EIBT", "T004", null);
    }

    /** Test 5: SEND/RECEIVE MAP stubs don't crash */
    static void testSendReceiveMapStubs() {
        System.err.println("--- Send/Receive Map Stubs ---");
        CicsRegion region = new CicsRegion();

        // Register a BMS map
        CicsMap map = new CicsMap("COSGN0A", "COSGN00", 24, 80);
        map.addField("USERID", 10, 20, 8, false, "", new CicsFieldAttr());
        map.addField("PASSWD", 12, 20, 8, false, "", new CicsFieldAttr().protect().dark());
        region.registerMap(map);

        region.registerProgram("MAPPGM", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            // Simulate what emitted code does: get map reference
            CicsMap m = ct.getRegion().getMap("COSGN00", "COSGN0A");
            check("map found", m != null);
            check("map has fields", m != null && m.getFields().size() == 2);
        });
        region.registerTransaction("MAPT", "MAPPGM");
        region.runTask("MAPT", "T005", null);
    }

    /** Test 6: RESP/RESP2 capture pattern */
    static void testRespCapture() {
        System.err.println("--- RESP Capture ---");
        CicsRegion region = new CicsRegion();

        region.registerProgram("RESPPGM", () -> () -> {
            CicsTask ct = CicsTask.currentTask();
            CicsEIB eib = ct.getEib();

            // Simulate what emitted code does after a CICS call
            eib.setResponse(CicsEIB.RESP_NORMAL, 0);
            int respVar = eib.eibresp;
            int resp2Var = eib.eibresp2;
            check("RESP normal", respVar == CicsEIB.RESP_NORMAL);
            check("RESP2 zero", resp2Var == 0);

            // Simulate a NOTFND
            eib.setResponse(CicsEIB.RESP_NOTFND, 1);
            check("RESP notfnd", eib.eibresp == CicsEIB.RESP_NOTFND);
            check("RESP2 = 1", eib.eibresp2 == 1);
        });
        region.registerTransaction("RSPT", "RESPPGM");
        region.runTask("RSPT", "T006", null);
    }
}
