package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc135PerformThruSyntaxChecks extends CobolProgram {
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
    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);


    // SECTION: MAIN
    private void para_main() {
        _exitSection = false;
        main_00();
        if (_exitSection) return;
        main_ex();
    }

    private void main_00() {
        CobolIntrinsics.setCurrentLocation("prog; MAIN-00 OF MAIN");
        sub1();
        sub1(); // THRU SUB1-EX
        sub1_00(); // THRU SUB1-EX
        sub1_01();
        sub1_02();
        sub1_ex();
        sub1(); // THRU SUB1
        sub1(); // THRU SUB2
        sub2();
        return;
    }

    private void main_ex() {
        CobolIntrinsics.setCurrentLocation("prog; MAIN-EX OF MAIN");
        return;
    }

    // SECTION: SUB1
    private void sub1() {
        _exitSection = false;
        sub1_00();
        if (_exitSection) return;
        sub1_01();
        if (_exitSection) return;
        sub1_02();
        if (_exitSection) return;
        sub1_ex();
    }

    private void sub1_00() {
        CobolIntrinsics.setCurrentLocation("prog; SUB1-00 OF SUB1");
        sub1_01(); // THRU SUB1-02
        sub1_02();
    }

    private void sub1_01() {
        CobolIntrinsics.setCurrentLocation("prog; SUB1-01 OF SUB1");
        /* CONTINUE */
    }

    private void sub1_02() {
        CobolIntrinsics.setCurrentLocation("prog; SUB1-02 OF SUB1");
        /* CONTINUE */
    }

    private void sub1_ex() {
        CobolIntrinsics.setCurrentLocation("prog; SUB1-EX OF SUB1");
        return;
    }

    // SECTION: SUB2
    private void sub2() {
        _exitSection = false;
        sub2_00();
        if (_exitSection) return;
        sub2_01();
        if (_exitSection) return;
        sub2_02();
        if (_exitSection) return;
        sub2_ex();
    }

    private void sub2_00() {
        CobolIntrinsics.setCurrentLocation("prog; SUB2-00 OF SUB2");
        sub1_02(); // THRU SUB1-01
    }

    private void sub2_01() {
        CobolIntrinsics.setCurrentLocation("prog; SUB2-01 OF SUB2");
        /* CONTINUE */
    }

    private void sub2_02() {
        CobolIntrinsics.setCurrentLocation("prog; SUB2-02 OF SUB2");
        /* CONTINUE */
    }

    private void sub2_ex() {
        CobolIntrinsics.setCurrentLocation("prog; SUB2-EX OF SUB2");
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynMisc135PerformThruSyntaxChecks");
            CobolProgram.registerCallAlias("prog", "SynMisc135PerformThruSyntaxChecks");
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
        new SynMisc135PerformThruSyntaxChecks().run();
    }
}
