package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile039RecordDefinitionWithSourceIs extends CobolProgram {
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
    // FILE SECTION — TEST-FILE1
    private CobolString test_rec1 = new CobolString(16); // Group: TEST-REC1
    private CobolString test_rec1_testkey_p1 = new CobolString(4);
    private int test_rec1_testkey_p2 = 0;
    private CobolString test_rec1_testdata = new CobolString(4);
    private CobolString test_rec1_testkey_p3 = new CobolString(4);

    // FILE SECTION — TEST-FILE2
    private CobolString test_rec2 = new CobolString(16); // Group: TEST-REC2
    private CobolString test_rec2_testkey_p1 = new CobolString(4);
    private int test_rec2_testkey_p2 = 0;
    private CobolString test_rec2_testdata = new CobolString(4);
    private CobolString test_rec2_testkey_p3 = new CobolString(4);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile test_file1 = new CobolFile("TESTFILE", "INDEXED", "DYNAMIC", "TEST-FILE1");
    {
        test_file1.registerIndexedPrimaryKey("TESTKEY-P1", 0, 4);
    }
    private CobolFile test_file2 = new CobolFile("TESTFILE", "INDEXED", "DYNAMIC", "TEST-FILE2");
    {
        test_file2.registerIndexedPrimaryKey("TESTKEY-P1", 0, 4);
    }


    private void para_main() {
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynFile039RecordDefinitionWithSourceIs");
            CobolProgram.registerCallAlias("prog", "SynFile039RecordDefinitionWithSourceIs");
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
        new SynFile039RecordDefinitionWithSourceIs().run();
    }
}
