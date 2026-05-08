package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental065NumericOperations8 extends CobolProgram {
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
    private CobolString compute_data = new CobolString(3, "000"); // Group: COMPUTE-DATA
    private int compute_8 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(3);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_compute_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("COMPUTE-DATA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_compute_8 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("COMPUTE-8").picDigits(3).build();


    private void para_main() {
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(Math.pow((CobolIntrinsics.toBigDecimal(((((24 + 1)) * ((60 - 10))))).divide(CobolIntrinsics.toBigDecimal(125), 40, RoundingMode.HALF_UP)).doubleValue(), 2)).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        compute_8 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(Math.pow((CobolIntrinsics.toBigDecimal(((((24 + 1)) * ((60 - 10))))).divide(CobolIntrinsics.toBigDecimal(125), 40, RoundingMode.HALF_UP)).doubleValue(), 2)), 3));
        if (compute_8 != 100) {
            CobolDisplay.display("COMPUTE with wrong result: " + CobolDisplay.formatPic(compute_8, 3, 0, false));
        }
        CobolIntrinsics.clearException();
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(55).divide(CobolIntrinsics.toBigDecimal((((1 - 2) + 1))), 40, RoundingMode.HALF_UP)).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) {
            compute_8 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(55).divide(CobolIntrinsics.toBigDecimal((((1 - 2) + 1))), 40, RoundingMode.HALF_UP)), 3));
        }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
        } else {
            CobolDisplay.display("SIZE ERROR not set from divide by zero!");
        }
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(Math.pow(0, 1)).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        compute_8 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(Math.pow(0, 1)), 3));
        if (compute_8 != 0) {
            CobolDisplay.display("0 ** 1 <> 0: " + CobolDisplay.formatPic(compute_8, 3, 0, false));
        }
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(Math.pow(55, 0)).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        compute_8 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(Math.pow(55, 0)), 3));
        if (compute_8 != 1) {
            CobolDisplay.display("55 ** 0 <> 1: " + CobolDisplay.formatPic(compute_8, 3, 0, false));
        }
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(Math.pow(1, 55)).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        compute_8 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(Math.pow(1, 55)), 3));
        if (compute_8 != 1) {
            CobolDisplay.display("11 ** 55 <> 1: " + CobolDisplay.formatPic(compute_8, 3, 0, false));
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental065NumericOperations8");
            CobolProgram.registerCallAlias("prog", "RunFundamental065NumericOperations8");
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
        new RunFundamental065NumericOperations8().run();
    }
}
