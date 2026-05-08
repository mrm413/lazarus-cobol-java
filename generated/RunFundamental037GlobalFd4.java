package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental037GlobalFd4 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "prog";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
    private int cob_crt_status = 0;
    private int length_an = 0;
    private CobolString when_compiled = new CobolString(21);
    private CobolString debug_item = new CobolString(256);
    private CobolString debug_line = new CobolString(6);
    private CobolString debug_name = new CobolString(30);
    private CobolString debug_sub_1 = new CobolString(4);
    private CobolString debug_sub_2 = new CobolString(4);
    private CobolString debug_sub_3 = new CobolString(4);
    private CobolString debug_contents = new CobolString(256);
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    // WORKING-STORAGE SECTION
    private CobolString globvals = new CobolString(2); // Group: GLOBVALS
    private CobolString teststat = new CobolString(2);

    // FILE SECTION — TEST-FILE
    static CobolString test_rec = new CobolString(4); // Group: TEST-REC
    private CobolString testkey = new CobolString(4);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_globvals = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GLOBVALS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_teststat = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TESTSTAT").build();

    // FILE DESCRIPTORS
    static CobolFile test_file = new CobolFile("TESTFILE", "INDEXED", "DYNAMIC", "TEST-FILE");
    {
        test_file.registerIndexedPrimaryKey("TESTKEY", 0, 4);
    }


    private void para_main() {
        teststat.set(String.valueOf("00"));
        CobolProgram.callNested("prog2");
        if (CobolString.cobolEquals(String.valueOf(teststat), String.valueOf("00"))) {
            CobolDisplay.display("Not OK");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental037GlobalFd4");
            CobolProgram.registerCallAlias("prog2", "RunFundamental037GlobalFd4_Prog2");
            CobolProgram.registerCallAlias("prog", "RunFundamental037GlobalFd4");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            if (test_file != null && teststat != null) test_file.setStatusField(teststat);
            // Register own GLOBAL fields for dynamic inherited-GLOBAL resolution
            CobolProgram.registerGlobalField("prog", "TEST_REC", test_rec);
            para_main();
        } finally { CobolProgram.popActive(); }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunFundamental037GlobalFd4().run();
    }
}

class RunFundamental037GlobalFd4_Prog2 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "prog2";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
    private int cob_crt_status = 0;
    private int length_an = 0;
    private CobolString when_compiled = new CobolString(21);
    private CobolString debug_item = new CobolString(256);
    private CobolString debug_line = new CobolString(6);
    private CobolString debug_name = new CobolString(30);
    private CobolString debug_sub_1 = new CobolString(4);
    private CobolString debug_sub_2 = new CobolString(4);
    private CobolString debug_sub_3 = new CobolString(4);
    private CobolString debug_contents = new CobolString(256);
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    // FALLBACK FILE DESCRIPTORS
    private CobolFile test_file = RunFundamental037GlobalFd4.test_file; // GLOBAL FD from RunFundamental037GlobalFd4
    private void para_main() {
        test_file.open("INPUT");
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog2", "", "prog2.cob");
        CobolProgram.pushActive("prog2");
        try {
            CobolProgram.registerCallAlias("prog2", "RunFundamental037GlobalFd4_Prog2");
            CobolProgram.registerCallAlias("prog2", "RunFundamental037GlobalFd4_Prog2");
            CobolProgram.registerCallAlias("prog", "RunFundamental037GlobalFd4");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }
    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunFundamental037GlobalFd4_Prog2().run();
    }
}
