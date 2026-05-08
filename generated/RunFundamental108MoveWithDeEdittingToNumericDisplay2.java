package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental108MoveWithDeEdittingToNumericDisplay2 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "MoveEditedToDisplay";
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
    private CobolString edited_field = new CobolString(116); // Group: EDITED-FIELD
    private CobolString src_field_100 = new CobolString(14, CobolDisplay.formatEdited(0, "+$ZZ9999900BB9"));
    private CobolString src_field_101 = new CobolString(14, CobolDisplay.formatEdited(0, "-$ZZ9999900BB9"));
    private CobolString src_field_102 = new CobolString(15, CobolDisplay.formatEdited(0, "$ZZ9999900BB9CR"));
    private CobolString src_field_103 = new CobolString(15, CobolDisplay.formatEdited(0, "$ZZ9999900BB9DB"));
    private CobolString src_field_400 = new CobolString(14, CobolDisplay.formatEdited(0, "+$**9999900BB9"));
    private CobolString src_field_401 = new CobolString(14, CobolDisplay.formatEdited(0, "-$**9999900BB9"));
    private CobolString src_field_402 = new CobolString(15, CobolDisplay.formatEdited(0, "$**9999900BB9CR"));
    private CobolString src_field_403 = new CobolString(15, CobolDisplay.formatEdited(0, "$**9999900BB9DB"));
    private CobolString dst_field = new CobolString(28); // Group: DST-FIELD
    private BigDecimal dst_field_1 = BigDecimal.ZERO;
    private BigDecimal dst_field_2 = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(144);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edited_field = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 116).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("EDITED-FIELD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field_100 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD-100").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field_101 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD-101").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field_102 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD-102").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field_103 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(43, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD-103").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field_400 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(58, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD-400").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field_401 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(72, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD-401").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field_402 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(86, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD-402").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field_403 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(101, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD-403").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(116, 28).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DST-FIELD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(116, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DST-FIELD-1").picDigits(14).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(130, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DST-FIELD-2").picDigits(14).picScale(1).signed(true).build();


    private void para_main() {
        src_field_100.set(CobolDisplay.formatEdited(12345, "+$ZZ9999900BB9"));
        dst_field_1 = CobolDisplay.deEditValue(String.valueOf(src_field_100), 0, "+$ZZ9999900BB9").abs();
        if (dst_field_1.compareTo(CobolIntrinsics.toBigDecimal(1234005)) != 0) {
            CobolDisplay.display("1: DST-FIELD-1 <" + CobolDisplay.formatPic(dst_field_1, 14, 4, false) + "> != 1234005");
        }
        src_field_101.set(CobolDisplay.formatEdited(23456, "-$ZZ9999900BB9"));
        dst_field_1 = CobolDisplay.deEditValue(String.valueOf(src_field_101), 0, "-$ZZ9999900BB9").abs();
        if (dst_field_1.compareTo(CobolIntrinsics.toBigDecimal(2345006)) != 0) {
            CobolDisplay.display("2: DST-FIELD-1 <" + CobolDisplay.formatPic(dst_field_1, 14, 4, false) + "> != 2345006");
        }
        src_field_102.set(CobolDisplay.formatEdited(34567, "$ZZ9999900BB9CR"));
        dst_field_1 = CobolDisplay.deEditValue(String.valueOf(src_field_102), 0, "$ZZ9999900BB9CR").abs();
        if (dst_field_1.compareTo(CobolIntrinsics.toBigDecimal(3456007)) != 0) {
            CobolDisplay.display("3: DST-FIELD-1 <" + CobolDisplay.formatPic(dst_field_1, 14, 4, false) + "> != 3456007");
        }
        src_field_103.set(CobolDisplay.formatEdited(45678, "$ZZ9999900BB9DB"));
        dst_field_1 = CobolDisplay.deEditValue(String.valueOf(src_field_103), 0, "$ZZ9999900BB9DB").abs();
        if (dst_field_1.compareTo(CobolIntrinsics.toBigDecimal(4567008)) != 0) {
            CobolDisplay.display("4: DST-FIELD-1 <" + CobolDisplay.formatPic(dst_field_1, 14, 4, false) + "> != 4567008");
        }
        src_field_100.set(CobolDisplay.formatEdited(-12345, "+$ZZ9999900BB9"));
        dst_field_2 = CobolDisplay.deEditValue(String.valueOf(src_field_100), 0, "+$ZZ9999900BB9");
        if (dst_field_2.compareTo(CobolIntrinsics.toBigDecimal(1234005)) != 0) {
            CobolDisplay.display("5: DST-FIELD-2 <" + CobolDisplay.formatPic(dst_field_2, 14, 4, true, "LEADING") + "> != 1234005");
        }
        src_field_101.set(CobolDisplay.formatEdited(-23456, "-$ZZ9999900BB9"));
        dst_field_2 = CobolDisplay.deEditValue(String.valueOf(src_field_101), 0, "-$ZZ9999900BB9");
        if (dst_field_2.compareTo(CobolIntrinsics.toBigDecimal(-2345006)) != 0) {
            CobolDisplay.display("6: DST-FIELD-2 <" + CobolDisplay.formatPic(dst_field_2, 14, 4, true, "LEADING") + "> != -2345006");
        }
        src_field_102.set(CobolDisplay.formatEdited(-34567, "$ZZ9999900BB9CR"));
        dst_field_2 = CobolDisplay.deEditValue(String.valueOf(src_field_102), 0, "$ZZ9999900BB9CR");
        if (dst_field_2.compareTo(CobolIntrinsics.toBigDecimal(-3456007)) != 0) {
            CobolDisplay.display("7: DST-FIELD-2 <" + CobolDisplay.formatPic(dst_field_2, 14, 4, true, "LEADING") + "> != -3456007");
        }
        src_field_103.set(CobolDisplay.formatEdited(-45678, "$ZZ9999900BB9DB"));
        dst_field_2 = CobolDisplay.deEditValue(String.valueOf(src_field_103), 0, "$ZZ9999900BB9DB");
        if (dst_field_2.compareTo(CobolIntrinsics.toBigDecimal(4567008)) != 0) {
            CobolDisplay.display("8: DST-FIELD-2 <" + CobolDisplay.formatPic(dst_field_2, 14, 4, true, "LEADING") + "> != 45676008");
        }
        src_field_400.set(CobolDisplay.formatEdited(12345, "+$**9999900BB9"));
        dst_field_1 = CobolDisplay.deEditValue(String.valueOf(src_field_400), 0, "+$**9999900BB9").abs();
        if (dst_field_1.compareTo(CobolIntrinsics.toBigDecimal(1234005)) != 0) {
            CobolDisplay.display("9: DST-FIELD-1 <" + CobolDisplay.formatPic(dst_field_1, 14, 4, false) + "> != 1234005");
        }
        src_field_401.set(CobolDisplay.formatEdited(23456, "-$**9999900BB9"));
        dst_field_1 = CobolDisplay.deEditValue(String.valueOf(src_field_401), 0, "-$**9999900BB9").abs();
        if (dst_field_1.compareTo(CobolIntrinsics.toBigDecimal(2345006)) != 0) {
            CobolDisplay.display("10: DST-FIELD-1 <" + CobolDisplay.formatPic(dst_field_1, 14, 4, false) + "> != 2345006");
        }
        src_field_402.set(CobolDisplay.formatEdited(34567, "$**9999900BB9CR"));
        dst_field_1 = CobolDisplay.deEditValue(String.valueOf(src_field_402), 0, "$**9999900BB9CR").abs();
        if (dst_field_1.compareTo(CobolIntrinsics.toBigDecimal(3456007)) != 0) {
            CobolDisplay.display("11: DST-FIELD-1 <" + CobolDisplay.formatPic(dst_field_1, 14, 4, false) + "> != 3456007");
        }
        src_field_403.set(CobolDisplay.formatEdited(45678, "$**9999900BB9DB"));
        dst_field_1 = CobolDisplay.deEditValue(String.valueOf(src_field_403), 0, "$**9999900BB9DB").abs();
        if (dst_field_1.compareTo(CobolIntrinsics.toBigDecimal(4567008)) != 0) {
            CobolDisplay.display("12: DST-FIELD-1 <" + CobolDisplay.formatPic(dst_field_1, 14, 4, false) + "1 != 45676008");
        }
        src_field_400.set(CobolDisplay.formatEdited(-12345, "+$**9999900BB9"));
        dst_field_2 = CobolDisplay.deEditValue(String.valueOf(src_field_400), 0, "+$**9999900BB9");
        if (dst_field_2.compareTo(CobolIntrinsics.toBigDecimal(1234005)) != 0) {
            CobolDisplay.display("13: DST-FIELD-2 <" + CobolDisplay.formatPic(dst_field_2, 14, 4, true, "LEADING") + "> != 1234005");
        }
        src_field_401.set(CobolDisplay.formatEdited(-23456, "-$**9999900BB9"));
        dst_field_2 = CobolDisplay.deEditValue(String.valueOf(src_field_401), 0, "-$**9999900BB9");
        if (dst_field_2.compareTo(CobolIntrinsics.toBigDecimal(-2345006)) != 0) {
            CobolDisplay.display("14: DST-FIELD-2 <" + CobolDisplay.formatPic(dst_field_2, 14, 4, true, "LEADING") + "> != -2345006");
        }
        src_field_402.set(CobolDisplay.formatEdited(-34567, "$**9999900BB9CR"));
        dst_field_2 = CobolDisplay.deEditValue(String.valueOf(src_field_402), 0, "$**9999900BB9CR");
        if (dst_field_2.compareTo(CobolIntrinsics.toBigDecimal(-3456007)) != 0) {
            CobolDisplay.display("15: DST-FIELD-2 <" + CobolDisplay.formatPic(dst_field_2, 14, 4, true, "LEADING") + "> != -3456007");
        }
        src_field_403.set(CobolDisplay.formatEdited(-45678, "$**9999900BB9DB"));
        dst_field_2 = CobolDisplay.deEditValue(String.valueOf(src_field_403), 0, "$**9999900BB9DB");
        if (dst_field_2.compareTo(CobolIntrinsics.toBigDecimal(4567008)) != 0) {
            CobolDisplay.display("16: DST-FIELD-2 <" + CobolDisplay.formatPic(dst_field_2, 14, 4, true, "LEADING") + "> != 4567008");
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("MoveEditedToDisplay", "", "MoveEditedToDisplay.cob");
        CobolProgram.pushActive("MoveEditedToDisplay");
        try {
            CobolProgram.registerCallAlias("MoveEditedToDisplay", "RunFundamental108MoveWithDeEdittingToNumericDisplay2");
            CobolProgram.registerCallAlias("moveeditedtodisplay", "RunFundamental108MoveWithDeEdittingToNumericDisplay2");
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
        new RunFundamental108MoveWithDeEdittingToNumericDisplay2().run();
    }
}
