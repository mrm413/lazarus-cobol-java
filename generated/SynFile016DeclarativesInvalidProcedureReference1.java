package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile016DeclarativesInvalidProcedureReference1 extends CobolProgram {
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
    // FILE SECTION — GO-FILE
    private CobolString go_rec = new CobolString(4);

    // FILE SECTION — PERF-FILE
    private CobolString perf_rec = new CobolString(4);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile go_file = new CobolFile("./TEST-FILE", "LINE SEQUENTIAL", "SEQUENTIAL", "GO-FILE");
    private CobolFile perf_file = new CobolFile("./TEST-FILE", "LINE SEQUENTIAL", "SEQUENTIAL", "PERF-FILE");


    // SECTION: G01
    private void g01() {
        _exitSection = false;
        use_g01();
        if (_exitSection) return;
        g02();
    }

    private void use_g01() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_G01 OF G01");
        /* USE AFTER ERROR PROCEDURE ON GO-FILE */
    }

    private void g02() {
        CobolIntrinsics.setCurrentLocation("prog; G02 OF G01");
        CobolDisplay.display("OK");
        gg02();
        return;
    }

    // SECTION: P01
    private void p01() {
        _exitSection = false;
        use_p01();
        if (_exitSection) return;
        p02();
    }

    private void use_p01() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_P01 OF P01");
        /* USE AFTER ERROR PROCEDURE ON PERF-FILE */
    }

    private void p02() {
        CobolIntrinsics.setCurrentLocation("prog; P02 OF P01");
        CobolDisplay.display("OK");
        ppok();
        pp02();
    }

    // SECTION: GG01
    private void gg01() {
        _exitSection = false;
        gg02();
    }

    private void gg02() {
        CobolIntrinsics.setCurrentLocation("prog; GG02 OF GG01");
        go_file.open("INPUT");
        go_file.close();
    }

    // SECTION: PP01
    private void pp01() {
        _exitSection = false;
        pp02();
        if (_exitSection) return;
        pp03();
        if (_exitSection) return;
        ppok();
    }

    private void pp02() {
        CobolIntrinsics.setCurrentLocation("prog; PP02 OF PP01");
        perf_file.open("INPUT");
        perf_file.close();
    }

    private void pp03() {
        CobolIntrinsics.setCurrentLocation("prog; PP03 OF PP01");
        CobolDisplay.display("LOG OUTPUT HERE");
    }

    private void ppok() {
        CobolIntrinsics.setCurrentLocation("prog; PPOK OF PP01");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynFile016DeclarativesInvalidProcedureReference1");
            CobolProgram.registerCallAlias("prog", "SynFile016DeclarativesInvalidProcedureReference1");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            gg01();
            pp01();
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
        new SynFile016DeclarativesInvalidProcedureReference1().run();
    }
}
