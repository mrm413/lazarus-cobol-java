package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc158OsvsArithmeticTest2 extends CobolProgram {
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
    private BigDecimal val = new BigDecimal("20500");
    private BigDecimal div1 = new BigDecimal("0.9");
    private BigDecimal div2 = new BigDecimal("33.45");
    private BigDecimal div3 = new BigDecimal("9");
    private BigDecimal mul1 = new BigDecimal("10");
    private BigDecimal mul2 = new BigDecimal("5");
    private BigDecimal mul3 = new BigDecimal("2");
    private BigDecimal res = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(40);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_val = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("VAL").picDigits(9).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_div1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("DIV1").picDigits(9).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_div2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("DIV2").picDigits(9).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_div3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("DIV3").picDigits(9).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_mul1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("MUL1").picDigits(9).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_mul2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("MUL2").picDigits(9).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_mul3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("MUL3").picDigits(9).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(35, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("RES").picDigits(9).picScale(2).signed(true).build();


    private void para_main() {
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(val.divide(div1, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(val.divide(div1, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)), 9, 2, true);
        CobolDisplay.display("RES = " + CobolDisplay.formatPic(res, 9, 2, true, "LEADING"));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(val.divide(div1, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(val.divide(div1, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)), 9, 2, true, RoundingMode.HALF_UP);
        CobolDisplay.display("RES ROUNDED = " + CobolDisplay.formatPic(res, 9, 2, true, "LEADING"));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(val.multiply(mul1).divide(div3, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(val.multiply(mul1).divide(div3, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)), 9, 2, true);
        CobolDisplay.display("RES MULT1 = " + CobolDisplay.formatPic(res, 9, 2, true, "LEADING"));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(val.multiply(mul2).multiply(mul3).divide(div3, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(val.multiply(mul2).multiply(mul3).divide(div3, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)), 9, 2, true);
        CobolDisplay.display("RES MULT2 = " + CobolDisplay.formatPic(res, 9, 2, true, "LEADING"));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(val.divide(div1, 40, RoundingMode.HALF_UP)).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(val.divide(div1, 40, RoundingMode.HALF_UP)), 9, 2, true);
        CobolDisplay.display("RES 1 = " + CobolDisplay.formatPic(res, 9, 2, true, "LEADING"));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(res.divide(div2, 40, RoundingMode.HALF_UP)).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(res.divide(div2, 40, RoundingMode.HALF_UP)), 9, 2, true);
        CobolDisplay.display("RES F = " + CobolDisplay.formatPic(res, 9, 2, true, "LEADING"));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(val.divide(div1, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(val.divide(div1, 40, RoundingMode.HALF_UP).divide(div2, 40, RoundingMode.HALF_UP)), 9, 2, true, RoundingMode.UP);
        CobolDisplay.display("RES ROUNDED AWAY = " + CobolDisplay.formatPic(res, 9, 2, true, "LEADING"));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc158OsvsArithmeticTest2");
            CobolProgram.registerCallAlias("prog", "RunMisc158OsvsArithmeticTest2");
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
        new RunMisc158OsvsArithmeticTest2().run();
    }
}
