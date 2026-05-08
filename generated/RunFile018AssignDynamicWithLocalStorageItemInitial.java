package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile018AssignDynamicWithLocalStorageItemInitial extends CobolProgram {
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
    // LOCAL-STORAGE SECTION
    private CobolString path = new CobolString(10, "test.txt");

    // FILE SECTION — test-file
    private CobolString test_rec = new CobolString(5);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("path", "LINE SEQUENTIAL", "SEQUENTIAL", "TEST-FILE");


    private void para_main() {
        test_file.setFileName(String.valueOf(path).trim());
        test_file.open("INPUT");
        test_file.read(test_rec);
        if (!CobolString.cobolEquals(String.valueOf(test_rec), String.valueOf("hello"))) {
            CobolDisplay.display(String.valueOf(test_rec));
        }
        test_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile018AssignDynamicWithLocalStorageItemInitial");
            CobolProgram.registerCallAlias("prog", "RunFile018AssignDynamicWithLocalStorageItemInitial");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // LOCAL-STORAGE: re-initialize to VALUE clauses on each entry
            path.set("test.txt");
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
        new RunFile018AssignDynamicWithLocalStorageItemInitial().run();
    }
}
