package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile036DeclarativesProcedureReferencingMultiple extends CobolProgram {
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
    private int z = 0;

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(10);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("Z").build();

    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("./TEST-FILE", "SEQUENTIAL", "SEQUENTIAL", "TEST-FILE");


    // SECTION: P01
    private void p01() {
        _exitSection = false;
        use_p01();
        if (_exitSection) return;
        p0101();
    }

    private void use_p01() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_P01 OF P01");
        /* USE AFTER ERROR PROCEDURE ON TEST-FILE */
    }

    private void p0101() {
        CobolIntrinsics.setCurrentLocation("prog; P0101 OF P01");
        z = (int) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(z).add(CobolIntrinsics.toBigDecimal(1))).intValue();
    }

    // SECTION: P02
    private void p02() {
        _exitSection = false;
        use_p02();
        if (_exitSection) return;
        p0201();
    }

    private void use_p02() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_P02 OF P02");
        /* USE AFTER ERROR PROCEDURE ON OUTPUT */
    }

    private void p0201() {
        CobolIntrinsics.setCurrentLocation("prog; P0201 OF P02");
        z = (int) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(z).add(CobolIntrinsics.toBigDecimal(1))).intValue();
    }

    // SECTION: MP01
    private void mp01() {
        _exitSection = false;
        mp0101();
    }

    private void mp0101() {
        CobolIntrinsics.setCurrentLocation("prog; MP0101 OF MP01");
        test_file.open("INPUT");
        p01(); // THRU P02
        p02();
        if (z != 3) {
            CobolDisplay.display(CobolDisplay.formatPic(z, 10, 0, true, "LEADING"));
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile036DeclarativesProcedureReferencingMultiple");
            CobolProgram.registerCallAlias("prog", "RunFile036DeclarativesProcedureReferencingMultiple");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            mp01();
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
        new RunFile036DeclarativesProcedureReferencingMultiple().run();
    }
}
