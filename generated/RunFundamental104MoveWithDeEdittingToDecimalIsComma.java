package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental104MoveWithDeEdittingToDecimalIsComma extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "MoveDeEditing_2";
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
    private CobolString edit_1 = new CobolString(10, CobolDisplay.formatEdited(0, "$(4)9,99CR"));
    private BigDecimal disp_1 = BigDecimal.ZERO;
    private CobolString edit_2 = new CobolString(13, CobolDisplay.formatEdited(0, "--9B,99B99/99"));
    private BigDecimal disp_2 = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(37);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edit_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("EDIT-1").picDigits(7).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_disp_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DISP-1").picDigits(6).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edit_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 13).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("EDIT-2").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_disp_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DISP-2").picDigits(8).picScale(1).signed(true).build();


    private void para_main() {
        edit_1.set(CobolDisplay.formatEdited(new BigDecimal("-123.45"), "$(4)9,99CR"));
        disp_1 = CobolDisplay.deEditValue(String.valueOf(edit_1), 0, "$(4)9,99CR");
        if (disp_1.compareTo(new BigDecimal("-123.45")) != 0) {
            CobolDisplay.display("Error 1: DISP-1 <" + CobolDisplay.formatPic(disp_1, 6, 2, true, "LEADING") + "> != -0123,45");
        }
        if (!CobolString.cobolEquals(String.valueOf(edit_1), String.valueOf(" $123,45CR"))) {
            CobolDisplay.display("Error 2: EDIT-1 <" + String.valueOf(edit_1) + "> != < $123,45CR>");
        }
        edit_2.set(CobolDisplay.formatEdited(new BigDecimal("-42.9876"), "--9B,99B99/99"));
        disp_2 = CobolDisplay.deEditValue(String.valueOf(edit_2), 0, "--9B,99B99/99");
        if (disp_2.compareTo(new BigDecimal("-42.987600")) != 0) {
            CobolDisplay.display("Error 3: DISP-2 <" + CobolDisplay.formatPic(disp_2, 8, 6, true, "LEADING") + "> != <-42,987600>");
        }
        if (!CobolString.cobolEquals(String.valueOf(edit_2), String.valueOf("-42 ,98 76/00"))) {
            CobolDisplay.display("Error 4: EDIT-2 <" + String.valueOf(edit_2) + "> != <-42 ,98 76/00>");
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("MoveDeEditing_2", "", "MoveDeEditing_2.cob");
        CobolProgram.pushActive("MoveDeEditing_2");
        try {
            CobolProgram.registerCallAlias("MoveDeEditing_2", "RunFundamental104MoveWithDeEdittingToDecimalIsComma");
            CobolProgram.registerCallAlias("movedeediting_2", "RunFundamental104MoveWithDeEdittingToDecimalIsComma");
            CobolDisplay.setDecimalPointIsComma(true);
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
        new RunFundamental104MoveWithDeEdittingToDecimalIsComma().run();
    }
}
