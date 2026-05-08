package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked006PackedDecimalArithmetic extends CobolProgram {
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
    private BigDecimal x = new BigDecimal("0");
    private CobolString fence_b = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal y = new BigDecimal("9");
    private BigDecimal z = new BigDecimal("-55");
    private CobolString fence_1 = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal x_9 = BigDecimal.ZERO;
    private CobolString fence_2 = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal x_99 = BigDecimal.ZERO;
    private CobolString fence_3 = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal x_920 = BigDecimal.ZERO;
    private CobolString fence_4 = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal x_921 = BigDecimal.ZERO;
    private CobolString fence_5 = new CobolString(3, "\u00ab\u00ba\u00ab");
    private long b_99 = 99L;
    private long b_999 = 123L;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(63);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 21).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("X").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("Y").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 11).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("Z").picDigits(20).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 40).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(24, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-9").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_920 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(33, 11).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-920").picDigits(20).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(44, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_921 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(47, 11).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-921").picDigits(21).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(58, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(61, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("B-99").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b_999 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(62, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("B-999").build();


    private void para_main() {
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(1).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        x = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 2, 0, false);
        if (x.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            CobolDisplay.display("01 <" + CobolDisplay.formatPic(x, 2, 0, false) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_a), String.valueOf(fence))) {
            fence_a.set(String.valueOf(fence));
            System.err.println("broken FENCE-A");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_b), String.valueOf(fence))) {
            fence_b.set(String.valueOf(fence));
            System.err.println("broken FENCE-B");
        }
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(y).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        x = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(y), 2, 0, false);
        if (x.compareTo(CobolIntrinsics.toBigDecimal(9)) != 0) {
            CobolDisplay.display("09 <" + CobolDisplay.formatPic(x, 2, 0, false) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_a), String.valueOf(fence))) {
            fence_a.set(String.valueOf(fence));
            System.err.println("broken FENCE-A");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_b), String.valueOf(fence))) {
            fence_b.set(String.valueOf(fence));
            System.err.println("broken FENCE-B");
        }
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(x.add(y)).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        x = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(x.add(y)), 2, 0, false);
        if (z.compareTo(CobolIntrinsics.toBigDecimal(-56)) < 0) {
            CobolDisplay.display("-55 >= " + CobolDisplay.formatPic(z, 20, 0, true, "LEADING"));
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_a), String.valueOf(fence))) {
            fence_a.set(String.valueOf(fence));
            System.err.println("broken FENCE-A");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_b), String.valueOf(fence))) {
            fence_b.set(String.valueOf(fence));
            System.err.println("broken FENCE-B");
        }
        x_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_999), 2, 0, false);
        if (x_99.compareTo(CobolIntrinsics.toBigDecimal(23)) != 0) {
            CobolDisplay.display("trunk 123 -> 99: " + CobolDisplay.formatPic(x_99, 2, 0, false));
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_2), String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            System.err.println("broken FENCE-2");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_3), String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            System.err.println("broken FENCE-3");
        }
        x_9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_999), 1, 0, false);
        if (x_9.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0) {
            CobolDisplay.display("trunk 123 -> 9: " + CobolDisplay.formatPic(x_9, 1, 0, false));
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_1), String.valueOf(fence))) {
            fence_1.set(String.valueOf(fence));
            System.err.println("broken FENCE-1");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_2), String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            System.err.println("broken FENCE-2");
        }
        x_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_99), 2, 0, false);
        if (!CobolString.cobolEquals(String.valueOf(fence_2), String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            System.err.println("broken FENCE-2");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_3), String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            System.err.println("broken FENCE-3");
        }
        x_920 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_999), 20, 0, false);
        if (!CobolString.cobolEquals(String.valueOf(fence_3), String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            System.err.println("broken FENCE-3");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_4), String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            System.err.println("broken FENCE-4");
        }
        x_921 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(x_99), 21, 0, false);
        if (!CobolString.cobolEquals(String.valueOf(fence_4), String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            System.err.println("broken FENCE-4");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_5), String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            System.err.println("broken FENCE-5");
        }
        b_99 = CobolIntrinsics.toBigDecimal(x_99.add(x_920)).longValue();
        if (b_99 != 222) {
            CobolDisplay.display("!222: " + CobolDisplay.formatPic(b_99, 10, 0, false));
        }
        if (x_920.compareTo(CobolIntrinsics.toBigDecimal(124)) > 0) {
            CobolDisplay.display("> 124 " + CobolDisplay.formatPic(x_920, 20, 0, false));
        }
        if (x_921.compareTo(CobolIntrinsics.toBigDecimal(98)) < 0) {
            CobolDisplay.display("< 98 " + CobolDisplay.formatPic(x_921, 21, 0, false));
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_1), String.valueOf(fence))) {
            System.err.println("broken FENCE-1");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_2), String.valueOf(fence))) {
            System.err.println("broken FENCE-2");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_3), String.valueOf(fence))) {
            System.err.println("broken FENCE-3");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_4), String.valueOf(fence))) {
            System.err.println("broken FENCE-4");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_5), String.valueOf(fence))) {
            System.err.println("broken FENCE-5");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked006PackedDecimalArithmetic");
            CobolProgram.registerCallAlias("prog", "DataPacked006PackedDecimalArithmetic");
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
        new DataPacked006PackedDecimalArithmetic().run();
    }
}
