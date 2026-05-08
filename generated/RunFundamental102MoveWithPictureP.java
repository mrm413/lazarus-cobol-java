package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental102MoveWithPictureP extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "Move_Basic_P_Pic";
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
    private BigDecimal p_pic_1 = BigDecimal.ZERO;
    private int p_pic_1_9 = 0;
    private int fld_1 = 0;
    private int fld_1_res = 0;
    private BigDecimal p_pic_2 = BigDecimal.ZERO;
    private int p_pic_2_9 = 0;
    private int fld_2 = 0;
    private int fld_2_res = 0;
    private BigDecimal p_pic_3 = BigDecimal.ZERO;
    private int p_pic_3_9 = 0;
    private BigDecimal fld_3 = BigDecimal.ZERO;
    private BigDecimal fld_3_res = BigDecimal.ZERO;
    private BigDecimal p_pic_4 = BigDecimal.ZERO;
    private int p_pic_4_9 = 0;
    private BigDecimal fld_4 = BigDecimal.ZERO;
    private BigDecimal fld_4_res = BigDecimal.ZERO;
    private int w01_i = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(58);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_pic_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P-PIC-1").picDigits(2).picScale(-1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_pic_1_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("P-PIC-1-9").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FLD-1").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_1_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FLD-1-RES").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_pic_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P-PIC-2").picDigits(2).picScale(-1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_pic_2_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("P-PIC-2-9").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FLD-2").picDigits(6).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_2_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FLD-2-RES").picDigits(6).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_pic_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P-PIC-3").picDigits(1).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_pic_3_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(33, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("P-PIC-3-9").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FLD-3").picDigits(5).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(39, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FLD-3-RES").picDigits(5).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_pic_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(44, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P-PIC-4").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_pic_4_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(45, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("P-PIC-4-9").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(46, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FLD-4").picDigits(5).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_4_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(51, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FLD-4-RES").picDigits(5).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_w01_i = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(56, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("W01-I").picDigits(2).build();


    private void para_main() {
        check_length();
        check_content();
        check_move();
        return;
    }

    private void check_content() {
        p_pic_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(123456), 2, 4, false).abs();
        p_pic_1_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_1).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).abs().intValue();
        if (p_pic_1_9 != 12) {
            CobolDisplay.display("Error C1 VALUE <" + CobolDisplay.formatPic(p_pic_1_9, 2, 0, false) + "> != 12");
        }
        p_pic_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(345678), 2, 4, false);
        p_pic_2_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_2).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).intValue();
        if (p_pic_2_9 != 34) {
            CobolDisplay.display("Error C2 VALUE <" + CobolDisplay.formatPic(p_pic_2_9, 2, 0, true, "LEADING") + "> != 34");
        }
        p_pic_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(-456789), 2, 4, false);
        p_pic_2_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_2).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).intValue();
        if (p_pic_2_9 != -45) {
            CobolDisplay.display("Error C3 VALUE <" + CobolDisplay.formatPic(p_pic_2_9, 2, 0, true, "LEADING") + "> != -45");
        }
        p_pic_3 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.12345")), 1, 4, true).abs();
        p_pic_3_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_3).scaleByPowerOfTen(5).abs().intValue();
        if (p_pic_3_9 != 5) {
            CobolDisplay.display("Error C4 VALUE <" + CobolDisplay.formatPic(p_pic_3_9, 1, 0, false) + "> != 5");
        }
        p_pic_4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.56789")), 1, 4, true);
        p_pic_4_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_4).scaleByPowerOfTen(5).intValue();
        if (p_pic_4_9 != 9) {
            CobolDisplay.display("Error C5 VALUE <" + CobolDisplay.formatPic(p_pic_4_9, 1, 0, true, "LEADING") + "> != 9");
        }
        p_pic_4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.34567")), 1, 4, true);
        p_pic_4_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_4).scaleByPowerOfTen(5).intValue();
        if (p_pic_4_9 != -7) {
            CobolDisplay.display("Error C6 VALUE <" + CobolDisplay.formatPic(p_pic_4_9, 1, 0, true, "LEADING") + "> != -7");
        }
    }

    private void check_move() {
        p_pic_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(123456), 2, 4, false).abs();
        p_pic_1_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_1).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).abs().intValue();
        fld_1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_pic_1), 6));
        fld_1_res = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(120000), 6));
        if (fld_1 != fld_1_res) {
            CobolDisplay.display("M1 <" + CobolDisplay.formatPic(fld_1_res, 6, 0, false) + "> != " + CobolDisplay.formatPic(fld_1, 6, 0, false));
        }
        p_pic_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(1234), 2, 4, false).abs();
        p_pic_1_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_1).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).abs().intValue();
        fld_1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_pic_1), 6));
        fld_1_res = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 6));
        if (fld_1 != fld_1_res) {
            CobolDisplay.display("M2 <" + CobolDisplay.formatPic(fld_1_res, 6, 0, false) + "> != " + CobolDisplay.formatPic(fld_1, 6, 0, false));
        }
        p_pic_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(1234), 2, 4, false);
        p_pic_2_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_2).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).intValue();
        fld_2 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_pic_2), 6);
        fld_2_res = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 6);
        if (fld_2 != fld_2_res) {
            CobolDisplay.display("M3 <" + CobolDisplay.formatPic(fld_2_res, 6, 0, true, "LEADING") + "> != " + CobolDisplay.formatPic(fld_2, 6, 0, true, "LEADING"));
        }
        p_pic_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(-5678), 2, 4, false);
        p_pic_2_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_2).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).intValue();
        fld_2 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_pic_2), 6);
        fld_2_res = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 6);
        if (fld_2 != fld_2_res) {
            CobolDisplay.display("M4 <" + CobolDisplay.formatPic(fld_2_res, 6, 0, true, "LEADING") + "> != " + CobolDisplay.formatPic(fld_2, 6, 0, true, "LEADING"));
        }
        p_pic_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(456789), 2, 4, false);
        p_pic_2_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_2).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).intValue();
        fld_2 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_pic_2), 6);
        fld_2_res = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(450000), 6);
        if (fld_2 != fld_2_res) {
            CobolDisplay.display("M5 <" + CobolDisplay.formatPic(fld_2_res, 6, 0, true, "LEADING") + "> != " + CobolDisplay.formatPic(fld_2, 6, 0, true, "LEADING"));
        }
        p_pic_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(-456789), 2, 4, false);
        p_pic_2_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_2).divide(BigDecimal.TEN.pow(4), 0, RoundingMode.DOWN).intValue();
        fld_2 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_pic_2), 6);
        fld_2_res = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-450000), 6);
        if (fld_2 != fld_2_res) {
            CobolDisplay.display("M6 <" + CobolDisplay.formatPic(fld_2_res, 6, 0, true, "LEADING") + "> != " + CobolDisplay.formatPic(fld_2, 6, 0, true, "LEADING"));
        }
        p_pic_3 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.12345")), 1, 4, true).abs();
        p_pic_3_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_3).scaleByPowerOfTen(5).abs().intValue();
        fld_3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_pic_3), 5, 5, false);
        fld_3_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.00005")), 5, 5, false);
        if (fld_3.compareTo(fld_3_res) != 0) {
            CobolDisplay.display("M7 <" + CobolDisplay.formatPic(fld_3_res, 5, 5, false) + "> != " + CobolDisplay.formatPic(fld_3, 5, 5, false));
        }
        p_pic_3 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.00010")), 1, 4, true).abs();
        p_pic_3_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_3).scaleByPowerOfTen(5).abs().intValue();
        fld_3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_pic_3), 5, 5, false);
        fld_3_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 5, 5, false);
        if (fld_3.compareTo(fld_3_res) != 0) {
            CobolDisplay.display("M8 <" + CobolDisplay.formatPic(fld_3_res, 5, 5, false) + "> != " + CobolDisplay.formatPic(fld_3, 5, 5, false));
        }
        p_pic_4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.23456")), 1, 4, true);
        p_pic_4_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_4).scaleByPowerOfTen(5).intValue();
        fld_4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_pic_4), 5, 5, true);
        fld_4_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.00006")), 5, 5, true);
        if (fld_4.compareTo(fld_4_res) != 0) {
            CobolDisplay.display("M9 <" + CobolDisplay.formatPic(fld_4_res, 5, 5, true, "LEADING") + "> != " + CobolDisplay.formatPic(fld_4, 5, 5, true, "LEADING"));
        }
        p_pic_4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.02340")), 1, 4, true);
        p_pic_4_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_4).scaleByPowerOfTen(5).intValue();
        fld_4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_pic_4), 5, 5, true);
        fld_4_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 5, 5, true);
        if (fld_4.compareTo(fld_4_res) != 0) {
            CobolDisplay.display("M10 <" + CobolDisplay.formatPic(fld_4_res, 5, 5, true, "LEADING") + "> != " + CobolDisplay.formatPic(fld_4, 5, 5, true, "LEADING"));
        }
        p_pic_4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.12345")), 1, 4, true);
        p_pic_4_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_4).scaleByPowerOfTen(5).intValue();
        fld_4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_pic_4), 5, 5, true);
        fld_4_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.00005")), 5, 5, true);
        if (fld_4.compareTo(fld_4_res) != 0) {
            CobolDisplay.display("M11 <" + CobolDisplay.formatPic(fld_4_res, 5, 5, true, "LEADING") + "> != " + CobolDisplay.formatPic(fld_4, 5, 5, true, "LEADING"));
        }
        p_pic_4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.34560")), 1, 4, true);
        p_pic_4_9 = (int) CobolIntrinsics.toBigDecimal(p_pic_4).scaleByPowerOfTen(5).intValue();
        fld_4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_pic_4), 5, 5, true);
        fld_4_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 5, 5, true);
        if (fld_4.compareTo(fld_4_res) != 0) {
            CobolDisplay.display("M11 <" + CobolDisplay.formatPic(fld_4_res, 5, 5, true, "LEADING") + "> != " + CobolDisplay.formatPic(fld_4, 5, 5, true, "LEADING"));
        }
    }

    private void check_length() {
        w01_i = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 2));
        if (w01_i != 2) {
            CobolDisplay.display("Error 1 size <" + CobolDisplay.formatPic(w01_i, 2, 0, false) + "> !=2");
        }
        w01_i = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 2));
        if (w01_i != 2) {
            CobolDisplay.display("Error 2 size <" + CobolDisplay.formatPic(w01_i, 2, 0, false) + "> !=2");
        }
        w01_i = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        if (w01_i != 1) {
            CobolDisplay.display("Error 3 size <" + CobolDisplay.formatPic(w01_i, 2, 0, false) + "> !=1");
        }
        w01_i = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        if (w01_i != 1) {
            CobolDisplay.display("Error 4 size <" + CobolDisplay.formatPic(w01_i, 2, 0, false) + "> !=1");
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("Move_Basic_P_Pic", "", "Move_Basic_P_Pic.cob");
        CobolProgram.pushActive("Move_Basic_P_Pic");
        try {
            CobolProgram.registerCallAlias("Move_Basic_P_Pic", "RunFundamental102MoveWithPictureP");
            CobolProgram.registerCallAlias("move_basic_p_pic", "RunFundamental102MoveWithPictureP");
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
        new RunFundamental102MoveWithPictureP().run();
    }
}
