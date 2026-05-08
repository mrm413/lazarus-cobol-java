package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc125PackedDecimalInPerformVarying extends CobolProgram {
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
    private BigDecimal ws_page_number = BigDecimal.ZERO;
    private int ws_line_number = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(6);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_page_number = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("WS-PAGE-NUMBER").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_line_number = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-LINE-NUMBER").picDigits(3).build();


    private void para_main() {
        for (ws_line_number = 1; !(ws_line_number > 10); ws_line_number += 1) {
            ws_page_number = CobolIntrinsics.truncateToField(ws_page_number.add(CobolIntrinsics.toBigDecimal(1)), 4, 0, false);
            CobolDisplay.display(CobolDisplay.formatPic(ws_page_number, 4, 0, false));
        }
        CobolIntrinsics.programExit(0);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc125PackedDecimalInPerformVarying");
            CobolProgram.registerCallAlias("prog", "RunMisc125PackedDecimalInPerformVarying");
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
        new RunMisc125PackedDecimalInPerformVarying().run();
    }
}
