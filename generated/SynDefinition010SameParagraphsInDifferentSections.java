package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition010SameParagraphsInDifferentSections extends CobolProgram {
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
    private int _gotoIdx = -1;
    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);


    // SECTION: S-1
    private void s_1() {
        _exitSection = false;
        l();
    }

    private void l() {
        CobolIntrinsics.setCurrentLocation("prog; L OF S-1");
    }

    // SECTION: S-2
    private void s_2() {
        _exitSection = false;
        l_2();
    }

    private void l_2() {
        CobolIntrinsics.setCurrentLocation("prog; L OF S-2");
    }

    // SECTION: S-3
    private void s_3() {
        _exitSection = false;
        use_s_3();
        if (_exitSection) return;
        l_3();
    }

    private void use_s_3() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_S-3 OF S-3");
        _gotoIdx = 0; return;
    }

    private void l_3() {
        CobolIntrinsics.setCurrentLocation("prog; L OF S-3");
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynDefinition010SameParagraphsInDifferentSections");
            CobolProgram.registerCallAlias("prog", "SynDefinition010SameParagraphsInDifferentSections");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            { int _p = 0;
                while (_p <= 3) {
                    _gotoIdx = -1;
                    switch (_p) {
                        case 0: l(); break;
                        case 1: l_2(); break;
                        case 2: use_s_3(); break;
                        case 3: l_3(); break;
                    }
                    if (_gotoIdx >= 0) _p = _gotoIdx; else _p++;
                }
            }
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
        new SynDefinition010SameParagraphsInDifferentSections().run();
    }
}
