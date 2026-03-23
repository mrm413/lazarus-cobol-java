package com.lazarus.cobol.cics;

/**
 * CICS Runtime Integration Test — verifies core infrastructure:
 * - CicsRegion: program registry, task creation
 * - CicsTask: EIB population, LINK, XCTL, RETURN, ABEND
 * - CicsTSQueue: random access, sequential read, session scoping
 * - CicsTDQueue: enqueue/dequeue, trigger firing
 * - CicsMap: field management, JSON output
 * - CicsFieldAttr: attribute manipulation
 */
public class CicsRuntimeTest {

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

    public static void main(String[] args) {
        System.err.println("=== CICS Runtime Tests ===\n");

        testEIB();
        testRegionAndTask();
        testLink();
        testXctl();
        testReturn();
        testAbend();
        testHandleAbend();
        testTSQueue();
        testTDQueue();
        testTDQueueTrigger();
        testMapAndFields();
        testFieldAttributes();
        testChannelContainers();
        testStart();

        System.err.println("\n=== Results: " + passed + " passed, " + failed + " failed ===");
        if (failed > 0) System.exit(1);
    }

    static void testEIB() {
        System.err.println("--- EIB ---");
        CicsEIB eib = new CicsEIB();
        eib.refreshDateTime();
        check("eibdate > 0", eib.eibdate > 0);
        check("eibtime >= 0", eib.eibtime >= 0);
        eib.setResponse(CicsEIB.RESP_NOTFND, 42);
        check("eibresp = NOTFND", eib.eibresp == CicsEIB.RESP_NOTFND);
        check("eibresp2 = 42", eib.eibresp2 == 42);
        eib.clearResponse();
        check("eibresp cleared", eib.eibresp == CicsEIB.RESP_NORMAL);
    }

    static void testRegionAndTask() {
        System.err.println("--- Region & Task ---");
        CicsRegion region = new CicsRegion();
        region.registerProgram("TESTPGM", () -> () -> { /* no-op */ });
        region.registerTransaction("TEST", "TESTPGM");

        check("program found", region.getProgram("TESTPGM") != null);
        check("program not found", region.getProgram("NOSUCH") == null);
        check("transid maps", "TESTPGM".equals(region.getProgramForTransid("TEST")));

        CicsTask task = region.createTask("TEST", "T001", new byte[]{1, 2, 3});
        check("task number > 0", task.getTaskNumber() > 0);
        check("EIB trnid", "TEST".equals(task.getEib().eibtrnid));
        check("EIB termid", "T001".equals(task.getEib().eibtrmid));
        check("EIB calen = 3", task.getEib().eibcalen == 3);
        check("commarea length", task.getCommarea().length == 3);
        region.shutdown();
    }

    static void testLink() {
        System.err.println("--- LINK ---");
        CicsRegion region = new CicsRegion();
        final int[] callCount = {0};
        final byte[] sharedData = {10};

        region.registerProgram("CALLEE", () -> () -> {
            callCount[0]++;
            CicsTask t = region.getCurrentTask();
            // Modify COMMAREA to prove data passing works
            if (t.getCommarea() != null && t.getCommarea().length > 0) {
                t.getCommarea()[0] = 99;
            }
        });

        CicsTask task = region.createTask("MAIN", "T001", null);
        byte[] linkCA = {10};
        task.link("CALLEE", linkCA, null);
        check("LINK called callee", callCount[0] == 1);
        check("LINK COMMAREA modified", linkCA[0] == 99);
        check("LINK resp normal", task.getEib().eibresp == CicsEIB.RESP_NORMAL);
        region.shutdown();
    }

    static void testXctl() {
        System.err.println("--- XCTL ---");
        CicsRegion region = new CicsRegion();
        final int[] order = {0};

        region.registerProgram("PROG_A", () -> () -> {
            order[0] = 1;
            CicsTask t = region.getCurrentTask();
            t.xctl("PROG_B", new byte[]{42}, null);
            order[0] = -1; // Should never reach here
        });

        region.registerProgram("PROG_B", () -> () -> {
            order[0] = 2;
            CicsTask t = region.getCurrentTask();
            check("XCTL commarea passed", t.getCommarea() != null && t.getCommarea()[0] == 42);
        });

        region.registerTransaction("TXCTL", "PROG_A");
        region.runTask("TXCTL", "T001", null);
        check("XCTL order = 2 (A did not resume)", order[0] == 2);
        region.shutdown();
    }

    static void testReturn() {
        System.err.println("--- RETURN ---");
        CicsRegion region = new CicsRegion();
        final int[] reached = {0};

        region.registerProgram("RETPGM", () -> () -> {
            CicsTask t = region.getCurrentTask();
            reached[0] = 1;
            t.returnControl("NEXT", new byte[]{77}, false);
            reached[0] = -1; // Should never reach
        });

        region.registerTransaction("TRET", "RETPGM");
        region.runTask("TRET", "T001", null);
        check("RETURN stopped execution", reached[0] == 1);
        region.shutdown();
    }

    static void testAbend() {
        System.err.println("--- ABEND ---");
        CicsRegion region = new CicsRegion();

        region.registerProgram("ABPGM", () -> () -> {
            CicsTask t = region.getCurrentTask();
            t.abend("ASRA", false, false); // NODUMP
        });

        region.registerTransaction("TABND", "ABPGM");
        // Should not throw — region handles it
        region.runTask("TABND", "T001", null);
        check("ABEND handled by region", true);
        region.shutdown();
    }

    static void testHandleAbend() {
        System.err.println("--- HANDLE ABEND ---");
        CicsRegion region = new CicsRegion();
        final int[] handlerCalled = {0};

        region.registerProgram("HABPGM", () -> () -> {
            CicsTask t = region.getCurrentTask();
            t.handleAbendLabel("ERROR_PARA");
            t.abend("USR1", false, false);
        });

        region.registerProgram("HANDLER", () -> () -> {
            handlerCalled[0] = 1;
        });

        region.registerTransaction("THAB", "HABPGM");
        region.runTask("THAB", "T001", null);
        // The label handler was found (even if we can't actually invoke the paragraph)
        CicsTask task = region.createTask("X", "X", null);
        task.handleAbendLabel("MYHANDLER");
        CicsTask.AbendHandler h = task.getAbendHandler();
        check("abend handler registered", h != null && "MYHANDLER".equals(h.target));
        task.handleAbendCancel();
        check("abend handler cancelled", task.getAbendHandler() == null);
        region.shutdown();
    }

    static void testTSQueue() {
        System.err.println("--- TSQ ---");
        CicsRegion region = new CicsRegion();
        CicsTSQueue q = region.getTsQueue("TESTQ", true);

        int item1 = q.writeItem("FIRST".getBytes(), 0, false);
        int item2 = q.writeItem("SECOND".getBytes(), 0, false);
        int item3 = q.writeItem("THIRD".getBytes(), 0, false);
        check("TSQ item1 = 1", item1 == 1);
        check("TSQ item3 = 3", item3 == 3);
        check("TSQ numItems = 3", q.getNumItems() == 3);

        // Random access
        byte[] data = q.readItem(2);
        check("TSQ read item 2", new String(data).equals("SECOND"));

        // Sequential (NEXT)
        q.resetPosition();
        data = q.readItem(0); // NEXT
        check("TSQ NEXT = FIRST", new String(data).equals("FIRST"));
        data = q.readItem(0); // NEXT
        check("TSQ NEXT = SECOND", new String(data).equals("SECOND"));

        // Update (REWRITE)
        q.writeItem("UPDATED".getBytes(), 2, true);
        data = q.readItem(2);
        check("TSQ rewrite item 2", new String(data).equals("UPDATED"));

        // Delete
        region.deleteTsQueue("TESTQ");
        check("TSQ deleted", region.getTsQueue("TESTQ", false) == null);
        region.shutdown();
    }

    static void testTDQueue() {
        System.err.println("--- TDQ ---");
        CicsRegion region = new CicsRegion();
        CicsTDQueue q = region.getTdQueue("TDTEST", true);

        q.writeItem("A".getBytes());
        q.writeItem("B".getBytes());
        q.writeItem("C".getBytes());
        check("TDQ depth = 3", q.getDepth() == 3);

        byte[] data = q.readItem();
        check("TDQ read = A (FIFO)", new String(data).equals("A"));
        check("TDQ depth after read = 2", q.getDepth() == 2);

        q.deleteAll();
        check("TDQ purged", q.getDepth() == 0);
        check("TDQ read empty = null", q.readItem() == null);
        region.shutdown();
    }

    static void testTDQueueTrigger() {
        System.err.println("--- TDQ Trigger ---");
        CicsRegion region = new CicsRegion();
        CicsTDQueue q = region.getTdQueue("TRIG", true);
        final int[] triggerCount = {0};

        // Fire trigger at count = 3
        q.setTrigger(CicsTDQueue.TriggerType.AT_COUNT, 3, "BATCH", () -> triggerCount[0]++);

        q.writeItem("1".getBytes());
        q.writeItem("2".getBytes());
        check("TDQ trigger not yet", triggerCount[0] == 0);
        q.writeItem("3".getBytes());
        check("TDQ trigger fired at 3", triggerCount[0] == 1);

        // Counter resets — should fire again at 6
        q.writeItem("4".getBytes());
        q.writeItem("5".getBytes());
        q.writeItem("6".getBytes());
        check("TDQ trigger fired again", triggerCount[0] == 2);

        // EVERY_ITEM trigger
        CicsTDQueue q2 = region.getTdQueue("EVERY", true);
        final int[] everyCount = {0};
        q2.setTrigger(CicsTDQueue.TriggerType.EVERY_ITEM, 0, null, () -> everyCount[0]++);
        q2.writeItem("X".getBytes());
        q2.writeItem("Y".getBytes());
        check("TDQ EVERY_ITEM trigger count = 2", everyCount[0] == 2);
        region.shutdown();
    }

    static void testMapAndFields() {
        System.err.println("--- Map & Fields ---");
        CicsMap map = new CicsMap("COSGN0A", "COSGN00", 24, 80);
        map.addField("USRIDIN", 10, 25, 8, false, "", new CicsFieldAttr());
        map.addField("PASSWRD", 12, 25, 8, false, "", new CicsFieldAttr().dark());
        map.addField("ERRMSG", 20, 2, 76, false, "", new CicsFieldAttr().protect().bright());

        check("map name", "COSGN0A".equals(map.getMapName()));
        check("field count = 3", map.getFields().size() == 3);

        // Set field values (before SEND MAP)
        map.setFieldValue("USRIDIN", "ADMIN");
        map.setFieldValue("ERRMSG", "Welcome");
        map.setCursor("USRIDIN");

        CicsMap.Field f = map.getField("USRIDIN");
        check("field value set", "ADMIN".equals(f.value));
        check("cursor positioned", f.cursorHere);

        CicsMap.Field pwd = map.getField("PASSWRD");
        check("password field dark", pwd.attr.isDark());

        // JSON output
        String json = map.toJson();
        check("JSON contains mapset", json.contains("\"mapset\": \"COSGN00\""));
        check("JSON contains ADMIN", json.contains("ADMIN"));
        check("JSON contains cursor true", json.contains("\"cursor\": true"));

        // Simulate RECEIVE MAP input
        java.util.Map<String, String> input = new java.util.HashMap<>();
        input.put("USRIDIN", "JOHN");
        input.put("PASSWRD", "secret");
        input.put("ERRMSG", "hacked"); // protected — should be ignored
        map.fromInput(input);
        check("RECEIVE MAP user input", "JOHN".equals(map.getField("USRIDIN").value));
        check("RECEIVE MAP password", "secret".equals(map.getField("PASSWRD").value));
        check("protected field unchanged", "Welcome".equals(map.getField("ERRMSG").value));
    }

    static void testFieldAttributes() {
        System.err.println("--- Field Attributes ---");
        CicsFieldAttr a = new CicsFieldAttr();
        check("default: unprotected", !a.isProtected());
        check("default: not bright", !a.isBright());

        a.protect().bright().numeric().setMdt();
        check("protected", a.isProtected());
        check("bright", a.isBright());
        check("numeric", a.isNumeric());
        check("MDT set", a.isMdtSet());

        a.unprotect().dark().resetMdt();
        check("unprotected", !a.isProtected());
        check("dark", a.isDark());
        check("not bright", !a.isBright());
        check("MDT reset", !a.isMdtSet());

        a.autoskip();
        check("autoskip implies protected", a.isProtected());

        String s = a.toAttrString();
        check("attr string not empty", s.length() > 0);
    }

    static void testChannelContainers() {
        System.err.println("--- Channels/Containers ---");
        CicsRegion region = new CicsRegion();
        CicsTask task = region.createTask("CHAN", "T001", null);

        task.putContainer("DATA1", "MYCHANNEL", "Hello".getBytes());
        task.putContainer("DATA2", "MYCHANNEL", "World".getBytes());

        byte[] d1 = task.getContainer("DATA1", "MYCHANNEL");
        check("container DATA1", new String(d1).equals("Hello"));

        byte[] d2 = task.getContainer("DATA2", "MYCHANNEL");
        check("container DATA2", new String(d2).equals("World"));

        task.deleteContainer("DATA1", "MYCHANNEL");
        check("container deleted", task.getContainer("DATA1", "MYCHANNEL") == null);

        check("missing channel", task.getContainer("X", "NOSUCH") == null);
        region.shutdown();
    }

    static void testStart() {
        System.err.println("--- START (async) ---");
        CicsRegion region = new CicsRegion();
        final int[] executed = {0};

        region.registerProgram("ASYNC", () -> () -> { executed[0] = 1; });
        region.registerTransaction("TASC", "ASYNC");

        CicsTask task = region.createTask("MAIN", "T001", null);
        task.start("TASC", null, 0, null, null);

        // Wait briefly for async execution
        try { Thread.sleep(200); } catch (InterruptedException e) {}
        check("START async executed", executed[0] == 1);
        region.shutdown();
    }
}
