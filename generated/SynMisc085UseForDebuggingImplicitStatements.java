package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc085UseForDebuggingImplicitStatements extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "TESTING";
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
    private CobolString oodb_result = new CobolString(7);

    // FILE SECTION — TSTFIL1
    private CobolString tstrec1 = new CobolString(256);

    // FILE SECTION — TSTFIL2
    private CobolString tstrec2 = new CobolString(256);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(7);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_oodb_result = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("OODB-RESULT").build();

    // FILE DESCRIPTORS
    private CobolFile tstfil1 = new CobolFile("TSTFIL1", "LINE SEQUENTIAL", "SEQUENTIAL", "TSTFIL1");
    private CobolFile tstfil2 = new CobolFile("TSTFIL2", "LINE SEQUENTIAL", "SEQUENTIAL", "TSTFIL2");


    // SECTION: MY-TEST
    private void my_test() {
        _exitSection = false;
        use_my_test();
        if (_exitSection) return;
        i_o_test_oodb_result();
    }

    private void use_my_test() {
        CobolIntrinsics.setCurrentLocation("TESTING; _USE_MY-TEST OF MY-TEST");
        /* USE FOR DEBUGGING ON ALL REFERENCES OF OODB-RESULT */
    }

    private void i_o_test_oodb_result() {
        CobolIntrinsics.setCurrentLocation("TESTING; I-O-TEST-OODB-RESULT OF MY-TEST");
        if (CobolString.cobolEquals(String.valueOf(oodb_result), String.valueOf(" "))) {
            CobolDisplay.display("LINE 1");
        } else {
            CobolDisplay.display("LINE 2");
        }
        tstfil1.close();
        tstfil2.close();
    }

    // SECTION: MAIN
    private void para_main() {
        _exitSection = false;
        _000_begin();
    }

    private void _000_begin() {
        CobolIntrinsics.setCurrentLocation("TESTING; 000-BEGIN OF MAIN");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("TESTING", "", "TESTING.cob");
        CobolProgram.pushActive("TESTING");
        try {
            CobolProgram.registerCallAlias("TESTING", "SynMisc085UseForDebuggingImplicitStatements");
            CobolProgram.registerCallAlias("testing", "SynMisc085UseForDebuggingImplicitStatements");
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
        new SynMisc085UseForDebuggingImplicitStatements().run();
    }
}
