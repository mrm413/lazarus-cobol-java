package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked017PppComp6 extends CobolProgram {
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
    private BigDecimal x_1 = new BigDecimal("91000");
    private CobolString fence_b = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal x_2 = new BigDecimal("92000");
    private CobolString fence_c = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal x_4 = new BigDecimal("0.000128");
    private CobolString fence_d = new CobolString(3, "\u00ab\u00ba\u00ab");
    private CobolString fence_1 = new CobolString(3, "\u00ab\u00ba\u00ab");
    private BigDecimal d_1 = new BigDecimal("95000");
    private BigDecimal d_2 = new BigDecimal("193000");
    private CobolString fence_2 = new CobolString(3, "\u00ab\u00ba\u00ab");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(29);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-1").picDigits(3).picScale(-3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-2").picDigits(3).picScale(-3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-C").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-4").picDigits(3).picScale(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-D").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("D-1").picDigits(3).picScale(-3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("D-2").picDigits(4).picScale(-2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fence_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FENCE-2").build();


    private void para_main() {
        CobolDisplay.display("INIT X-1 : " + CobolDisplay.formatPicScaled(x_1, 3, 3, false, false) + " .");
        CobolDisplay.display("INIT X-2 : " + CobolDisplay.formatPicScaled(x_2, 3, 3, false, false) + " .");
        CobolDisplay.display("INIT X-4 : " + CobolDisplay.formatPicScaled(x_4, 3, 3, true, false) + " .");
        CobolDisplay.display("INIT D-1 : " + CobolDisplay.formatPicScaled(d_1, 3, 3, false, false) + " .");
        x_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_1), 3, 3, false).abs();
        x_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_1), 3, 3, false).abs();
        d_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(x_2), 3, 3, false).abs();
        CobolDisplay.display("MOVE X-1 : " + CobolDisplay.formatPicScaled(x_1, 3, 3, false, false) + " .");
        CobolDisplay.display("MOVE X-2 : " + CobolDisplay.formatPicScaled(x_2, 3, 3, false, false) + " .");
        x_4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.000256")), 3, 3, true).abs();
        CobolDisplay.display("MOVE X-4 : " + CobolDisplay.formatPicScaled(x_4, 3, 3, true, false) + " .");
        CobolDisplay.display("MOVE D-1 : " + CobolDisplay.formatPicScaled(d_1, 3, 3, false, false) + " .");
        x_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_2), 3, 3, false).abs();
        x_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_2), 3, 3, false).abs();
        CobolDisplay.display("MOVE X-1 : " + CobolDisplay.formatPicScaled(x_1, 3, 3, false, false) + ":" + CobolDisplay.formatPicScaled(d_2, 4, 2, false, false) + " .");
        CobolDisplay.display("MOVE X-2 : " + CobolDisplay.formatPicScaled(x_2, 3, 3, false, false) + ":" + CobolDisplay.formatPicScaled(d_2, 4, 2, false, false) + " .");
        x_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(98000), 3, 3, false).abs();
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(98000)) != 0) {
            CobolDisplay.display("MOVE 98000 failed: " + CobolDisplay.formatPicScaled(x_1, 3, 3, false, false));
        }
        d_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(98000), 3, 3, false).abs();
        if (d_1.compareTo(CobolIntrinsics.toBigDecimal(98000)) != 0) {
            CobolDisplay.display("MOVE 98000 failed: " + CobolDisplay.formatPicScaled(d_1, 3, 3, false, false));
        }
        x_1 = CobolIntrinsics.truncateToScaledField(x_1.add(CobolIntrinsics.toBigDecimal(1000)), 3, 3, false);
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(99000)) != 0) {
            CobolDisplay.display("+ 1000 failed: " + CobolDisplay.formatPicScaled(x_1, 3, 3, false, false));
        }
        x_1 = CobolIntrinsics.truncateToScaledField(x_1.subtract(CobolIntrinsics.toBigDecimal(4000)), 3, 3, false);
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(95000)) != 0) {
            CobolDisplay.display("- 4000 failed: " + CobolDisplay.formatPicScaled(x_1, 3, 3, false, false));
        }
        x_1 = CobolIntrinsics.truncateToScaledField(x_1.divide(CobolIntrinsics.toBigDecimal(3), 18, RoundingMode.HALF_UP), 3, 3, false);
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(31000)) != 0) {
            CobolDisplay.display("/ 3 failed: " + CobolDisplay.formatPicScaled(x_1, 3, 3, false, false));
        }
        x_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(2).multiply(x_1)), 3, 3, false).abs();
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(62000)) != 0) {
            CobolDisplay.display("* 2 failed: " + CobolDisplay.formatPicScaled(x_1, 3, 3, false, false));
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_1), String.valueOf(fence))) {
            System.err.println("broken FENCE-1");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_2), String.valueOf(fence))) {
            System.err.println("broken FENCE-2");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_a), String.valueOf(fence))) {
            System.err.println("broken FENCE-A");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_b), String.valueOf(fence))) {
            System.err.println("broken FENCE-B");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_c), String.valueOf(fence))) {
            System.err.println("broken FENCE-C");
        }
        if (!CobolString.cobolEquals(String.valueOf(fence_d), String.valueOf(fence))) {
            System.err.println("broken FENCE-D");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked017PppComp6");
            CobolProgram.registerCallAlias("prog", "DataPacked017PppComp6");
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
        new DataPacked017PppComp6().run();
    }
}
