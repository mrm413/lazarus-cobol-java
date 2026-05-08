package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc157OsvsArithmetic1 extends CobolProgram {
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
    private int num_a = 399;
    private int num_b = 211;
    private BigDecimal num_c = new BigDecimal("212.34");
    private BigDecimal numv1 = BigDecimal.ZERO;
    private CobolString picx = new CobolString(1, "A");
    private int rslt = 0;
    private CobolString rsltv1 = new CobolString(5, CobolDisplay.formatEdited(0, "9(3).9"));
    private CobolString rsltv2 = new CobolString(6, CobolDisplay.formatEdited(0, "9(3).99"));

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(30);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_num_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("NUM-A").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_num_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("NUM-B").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_num_c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("NUM-C").picDigits(5).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_numv1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(11, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("NUMV1").picDigits(4).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_picx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("PICX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rslt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("RSLT").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rsltv1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("RSLTV1").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rsltv2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(24, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("RSLTV2").picDigits(5).build();

    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private void para_main() {
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(num_a).add(new BigDecimal("1.1"))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(num_a).add(new BigDecimal("1.1"))), 3));
        CobolDisplay.display("Simple Compute  RSLT IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))), 3));
        CobolDisplay.display("Single Variable RSLT IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        rsltv2.set(CobolDisplay.formatEdited(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100)), "9(3).99"));
        _filler_002.set(String.valueOf(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))), 3));
        CobolDisplay.display("Compute  RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        CobolDisplay.display("Compute  RSLTv99 IS " + String.valueOf(rsltv2));
        rsltv1.set(CobolDisplay.formatEdited(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100)), "9(3).9"));
        _filler_003.set(String.valueOf(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))), 3));
        CobolDisplay.display("Compute  RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        CobolDisplay.display("Compute  RSLTv9  IS " + String.valueOf(rsltv1));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 3));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(rslt).add(CobolIntrinsics.toBigDecimal(num_c))), 3));
        CobolDisplay.display("Add      RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 3));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(rslt).add(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(num_a).add(num_c).add(CobolIntrinsics.toBigDecimal(10))))), 3));
        CobolDisplay.display("Add      RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(rslt).subtract(CobolIntrinsics.toBigDecimal(num_c))), 3));
        CobolDisplay.display("Subtract RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(rslt).subtract(CobolIntrinsics.toBigDecimal((num_a - 10)))), 3));
        CobolDisplay.display("Subtract RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 3));
        rsltv1.set(CobolDisplay.formatEdited(CobolIntrinsics.toBigDecimal(num_a).add(num_c).add(CobolIntrinsics.toBigDecimal(rslt)), "9(3).9"));
        CobolDisplay.display("Add      RSLTv9  IS " + String.valueOf(rsltv1));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(num_a).multiply(num_c)), 3));
        CobolDisplay.display("Multiply RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        num_c = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(rslt).multiply(num_c)), 5, 2, false);
        CobolDisplay.display("Multiply RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(10), 18, RoundingMode.HALF_UP)), 3));
        CobolDisplay.display("Divide   RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        rsltv1.set(CobolDisplay.formatEdited(CobolIntrinsics.toBigDecimal(rslt).divide(CobolIntrinsics.toBigDecimal(4), 18, RoundingMode.HALF_UP), "9(3).9"));
        CobolDisplay.display("Divide   RSLTv9  IS " + String.valueOf(rsltv1));
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(rslt).divide(CobolIntrinsics.toBigDecimal(4), 18, RoundingMode.HALF_UP)), 3));
        CobolDisplay.display("Divide   RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false));
        rsltv1.set(CobolDisplay.formatEdited(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100)), "9(3).9"));
        _filler_004.set(String.valueOf(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(100), 40, RoundingMode.HALF_UP)))).multiply(CobolIntrinsics.toBigDecimal(100))), 3));
        CobolDisplay.display("Simple   RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false) + " RSLTv9  IS " + String.valueOf(rsltv1));
        rsltv1.set(CobolDisplay.formatEdited(((CobolIntrinsics.toBigDecimal(num_a).divide((new BigDecimal("100.55").add(new BigDecimal("-0.550"))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide((new BigDecimal("10.11").multiply(CobolIntrinsics.toBigDecimal(10)).subtract(new BigDecimal("1.1"))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(220).divide(new BigDecimal("2.2"), 40, RoundingMode.HALF_UP))), "9(3).9"));
        _filler_005.set(String.valueOf(((CobolIntrinsics.toBigDecimal(num_a).divide((new BigDecimal("100.55").add(new BigDecimal("-0.550"))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide((new BigDecimal("10.11").multiply(CobolIntrinsics.toBigDecimal(10)).subtract(new BigDecimal("1.1"))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(220).divide(new BigDecimal("2.2"), 40, RoundingMode.HALF_UP)))));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide((new BigDecimal("100.55").add(new BigDecimal("-0.550"))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide((new BigDecimal("10.11").multiply(CobolIntrinsics.toBigDecimal(10)).subtract(new BigDecimal("1.1"))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(220).divide(new BigDecimal("2.2"), 40, RoundingMode.HALF_UP)))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide((new BigDecimal("100.55").add(new BigDecimal("-0.550"))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide((new BigDecimal("10.11").multiply(CobolIntrinsics.toBigDecimal(10)).subtract(new BigDecimal("1.1"))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(220).divide(new BigDecimal("2.2"), 40, RoundingMode.HALF_UP)))), 3));
        CobolDisplay.display("Complex  RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false) + " RSLTv9  IS " + String.valueOf(rsltv1));
        rsltv1.set(CobolDisplay.formatEdited(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(((101 - 1))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(((10 * 10))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(200).divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP))), "9(3).9"));
        _filler_006.set(String.valueOf(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(((101 - 1))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(((10 * 10))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(200).divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP)))));
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(((101 - 1))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(((10 * 10))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(200).divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP)))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        rslt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(((CobolIntrinsics.toBigDecimal(num_a).divide(CobolIntrinsics.toBigDecimal(((101 - 1))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(((10 * 10))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(200).divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP)))), 3));
        CobolDisplay.display("Reduced  RSLT    IS " + CobolDisplay.formatPic(rslt, 3, 0, false) + " RSLTv9  IS " + String.valueOf(rsltv1));
        numv1 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(num_a), 4, 1, false);
        if (((numv1.divide(CobolIntrinsics.toBigDecimal(((101 - 1))), 40, RoundingMode.HALF_UP)).subtract((CobolIntrinsics.toBigDecimal(num_b).divide(CobolIntrinsics.toBigDecimal(((10 * 10))), 40, RoundingMode.HALF_UP)))).multiply((CobolIntrinsics.toBigDecimal(200).divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP))).compareTo(CobolIntrinsics.toBigDecimal(188)) == 0) {
            CobolDisplay.display("Not Using ARITHMETIC-OSVS");
        } else {
            CobolDisplay.display("Using ARITHMETIC-OSVS");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc157OsvsArithmetic1");
            CobolProgram.registerCallAlias("prog", "RunMisc157OsvsArithmetic1");
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
        new RunMisc157OsvsArithmetic1().run();
    }
}
