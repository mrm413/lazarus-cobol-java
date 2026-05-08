package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc019UnreachableStatement extends CobolProgram {
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
    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("f", "LINE SEQUENTIAL", "SEQUENTIAL", "F");


    // SECTION: f-error
    private void f_error() {
        _exitSection = false;
        use_f_error();
    }

    private void use_f_error() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_f-error OF f-error");
        /* USE AFTER ERROR ON f */
        return;
    }

    private void para_main() {
        CobolDisplay.display("VALID");
    }

    private void p01() {
        _gotoIdx = 2; return;
    }

    private void p02() {
        _gotoIdx = 3; return;
    }

    private void p03() {
        _gotoIdx = 4; return;
    }

    private void p04() {
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynMisc019UnreachableStatement");
            CobolProgram.registerCallAlias("prog", "SynMisc019UnreachableStatement");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            { int _p = 0;
                while (_p <= 4) {
                    _gotoIdx = -1;
                    switch (_p) {
                        case 0: para_main(); break;
                        case 1: p01(); break;
                        case 2: p02(); break;
                        case 3: p03(); break;
                        case 4: p04(); break;
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
        new SynMisc019UnreachableStatement().run();
    }
}
