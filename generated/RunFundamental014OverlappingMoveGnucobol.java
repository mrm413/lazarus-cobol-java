package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental014OverlappingMoveGnucobol extends CobolProgram {
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
    private CobolString tstmov1 = new CobolString(479);
    private CobolString tstmov2 = new CobolString(10);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(489);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 489).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstmov1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 479).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TSTMOV1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstmov2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(479, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TSTMOV2").build();


    private void para_main() {
        tstmov2.set(String.valueOf("0123456789"));
        tstmov2.setRefMod(1, 9, String.valueOf(CobolString.refMod(tstmov2, 2, 9)));
        if (!CobolString.cobolEquals(String.valueOf(tstmov2), String.valueOf("1234567899"))) {
            CobolDisplay.display("  PROBLEM MOVE: " + String.valueOf(tstmov2));
        } else {
            CobolDisplay.display("  OK with MOVE: " + String.valueOf(tstmov2));
        }
        tstmov2.set(String.valueOf("0123456789"));
        tstmov2.setRefMod(2, 8, String.valueOf(CobolString.refMod(tstmov2, 1, 8)));
        if (CobolString.cobolEquals(String.valueOf(tstmov2), String.valueOf("0000000009"))) {
            CobolDisplay.display("IBM style MOVE: " + String.valueOf(tstmov2));
        } else {
            if (!CobolString.cobolEquals(String.valueOf(tstmov2), String.valueOf("0012345679"))) {
                CobolDisplay.display("  PROBLEM MOVE: " + String.valueOf(tstmov2));
            } else {
                CobolDisplay.display("  OK with MOVE: " + String.valueOf(tstmov2));
            }
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental014OverlappingMoveGnucobol");
            CobolProgram.registerCallAlias("prog", "RunFundamental014OverlappingMoveGnucobol");
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
        new RunFundamental014OverlappingMoveGnucobol().run();
    }
}
