package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental109MoveMiscEdited extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "MoveOtherCases";
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
    private int src_bin = 0;
    private int dst_bin = 0;
    private CobolString src_edit = new CobolString(11, CobolDisplay.formatEdited(0, "$$$$,$$9V99-"));
    private int dst_disp = 0;
    private CobolString dst_field_1 = new CobolString(9);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(34);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_bin = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("SRC-BIN").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_bin = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("DST-BIN").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_edit = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 11).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-EDIT").picDigits(9).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_disp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DST-DISP").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DST-FIELD-1").picDigits(2).build();


    private void para_main() {
        src_bin = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-12345678), 9);
        dst_bin = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(src_bin), 9));
        if (dst_bin != 12345678) {
            CobolDisplay.display("1: DST-BIN <" + CobolDisplay.formatPic(dst_bin, 9, 0, false) + ">!= <12345678>");
        }
        src_edit.set(CobolDisplay.formatEdited(-3, "$$$$,$$9V99-"));
        dst_disp = CobolDisplay.deEditValue(String.valueOf(src_edit), 2, "$$$$,$$9V99-").abs().intValue();
        if (!CobolString.cobolEquals(String.valueOf(src_edit), String.valueOf("      $300-"))) {
            CobolDisplay.display("2: SRC-EDIT <" + String.valueOf(src_edit) + "> != <      $300->");
        }
        if (dst_disp != 3) {
            CobolDisplay.display("2.1: DST-DISP <" + CobolDisplay.formatPic(dst_disp, 6, 0, false) + "> != <3>");
        }
        src_edit.set(CobolDisplay.formatEdited(3, "$$$$,$$9V99-"));
        dst_field_1.set(CobolDisplay.formatEdited(src_edit, "XB0XB099/"));
        if (!CobolString.cobolEquals(String.valueOf(dst_field_1), String.valueOf("  0  0  /"))) {
            CobolDisplay.display("3: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != <  0  0  />");
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("MoveOtherCases", "", "MoveOtherCases.cob");
        CobolProgram.pushActive("MoveOtherCases");
        try {
            CobolProgram.registerCallAlias("MoveOtherCases", "RunFundamental109MoveMiscEdited");
            CobolProgram.registerCallAlias("moveothercases", "RunFundamental109MoveMiscEdited");
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
        new RunFundamental109MoveMiscEdited().run();
    }
}
