package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked018ArithmeticTruncationWithUsagePackedDecimal extends CobolProgram {
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
    private static final String fence = "\u00ab\u00ba\u00ab";
    private CobolString fence_a = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal result = BigDecimal.ZERO;
    private CobolString fence_b = new CobolString(3, "\u00ab\u00ba\u00ab");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(8);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_result = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("RESULT").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-B").build();


    private void para_main() {
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 3, 0, false);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result).subtract(CobolIntrinsics.toBigDecimal(2).divide(result, 40, RoundingMode.HALF_UP))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result).subtract(CobolIntrinsics.toBigDecimal(2).divide(result, 40, RoundingMode.HALF_UP))), 3, 0, false);
        if (result.compareTo(CobolIntrinsics.toBigDecimal(14)) != 0) {
            CobolDisplay.display("NOT 14: " + CobolDisplay.formatPic(result, 3, 0, false));
        }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 3, 0, false);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result).subtract(CobolIntrinsics.toBigDecimal(20).divide(result, 40, RoundingMode.HALF_UP))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result).subtract(CobolIntrinsics.toBigDecimal(20).divide(result, 40, RoundingMode.HALF_UP))), 3, 0, false);
        if (result.compareTo(CobolIntrinsics.toBigDecimal(4)) != 0) {
            CobolDisplay.display("NOT [-] 4: " + CobolDisplay.formatPic(result, 3, 0, false));
        }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 3, 0, false);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result.divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result.divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP))), 3, 0, false);
        if (result.compareTo(CobolIntrinsics.toBigDecimal(15)) != 0) {
            CobolDisplay.display("NOT 15: " + CobolDisplay.formatPic(result, 3, 0, false));
        }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 3, 0, false);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result).subtract(CobolIntrinsics.toBigDecimal(2000).divide(result, 40, RoundingMode.HALF_UP))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result).subtract(CobolIntrinsics.toBigDecimal(2000).divide(result, 40, RoundingMode.HALF_UP))), 3, 0, false);
        if (result.compareTo(CobolIntrinsics.toBigDecimal(984)) != 0) {
            CobolDisplay.display("NOT [-1] 984: " + CobolDisplay.formatPic(result, 3, 0, false));
        }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 3, 0, false);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result).add(CobolIntrinsics.toBigDecimal(2000).divide(result, 40, RoundingMode.HALF_UP))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        result = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(15).add(result).add(CobolIntrinsics.toBigDecimal(2000).divide(result, 40, RoundingMode.HALF_UP))), 3, 0, false);
        if (result.compareTo(CobolIntrinsics.toBigDecimal(16)) != 0) {
            CobolDisplay.display("NOT [+20] 16: " + CobolDisplay.formatPic(result, 3, 0, false));
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_a), String.valueOf(fence))) {
            System.err.println("broken FENCE-A");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_b), String.valueOf(fence))) {
            System.err.println("broken FENCE-B");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked018ArithmeticTruncationWithUsagePackedDecimal");
            CobolProgram.registerCallAlias("prog", "DataPacked018ArithmeticTruncationWithUsagePackedDecimal");
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
        new DataPacked018ArithmeticTruncationWithUsagePackedDecimal().run();
    }
}
