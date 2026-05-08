package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental111MoveToEdittedZero extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "MoveToEditedZero";
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
    private int disp_1 = 0;
    private CobolString edit_1 = new CobolString(6, CobolDisplay.formatEdited(0, "******"));
    private CobolString edit_1_x = edit_1;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(18);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_disp_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DISP-1").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edit_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EDIT-1").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edit_1_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EDIT-1-X").build();


    private void para_main() {
        edit_1.set(CobolDisplay.formatEdited(111111, "******"));
        disp_1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 6));
        edit_1.set(CobolDisplay.formatEdited(disp_1, "******"));
        if (!CobolString.cobolEquals(String.valueOf(edit_1_x), String.valueOf("******"))) {
            CobolDisplay.display("Error EDIT-1-X <" + String.valueOf(edit_1_x) + "> !=  <******>");
        }
        disp_1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(123), 6));
        edit_1.set(CobolDisplay.formatEdited(disp_1, "******"));
        if (!CobolString.cobolEquals(String.valueOf(edit_1_x), String.valueOf("***123"))) {
            CobolDisplay.display("Error EDIT-1-X <" + String.valueOf(edit_1_x) + "> !=  <***123>");
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("MoveToEditedZero", "", "MoveToEditedZero.cob");
        CobolProgram.pushActive("MoveToEditedZero");
        try {
            CobolProgram.registerCallAlias("MoveToEditedZero", "RunFundamental111MoveToEdittedZero");
            CobolProgram.registerCallAlias("movetoeditedzero", "RunFundamental111MoveToEdittedZero");
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
        new RunFundamental111MoveToEdittedZero().run();
    }
}
