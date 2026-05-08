package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataBinary009PppComp5 extends CobolProgram {
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
    private CobolString xs = new CobolString(7, "910920$0.0"); // Group: XS
    private BigDecimal x_1 = new BigDecimal("91000");
    private BigDecimal x_2 = new BigDecimal("92000");
    private CobolString x_3 = new CobolString(1, "$");
    private BigDecimal x_4 = new BigDecimal("0.000128");
    private BigDecimal d_1 = new BigDecimal("95000");
    private BigDecimal d_2 = new BigDecimal("193000");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(11);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xs = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("XS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-1").picDigits(3).picScale(-3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-2").picDigits(3).picScale(-3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-4").picDigits(3).picScale(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("D-1").picDigits(3).picScale(-3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("D-2").picDigits(4).picScale(-2).build();


    private void para_main() {
        CobolDisplay.display("INIT X-1 : " + CobolDisplay.formatPicScaledComp5(x_1, 3, 3, false, false) + " .");
        CobolDisplay.display("INIT X-2 : " + CobolDisplay.formatPicScaledComp5(x_2, 3, 3, false, false) + " .");
        CobolDisplay.display("INIT X-4 : " + CobolDisplay.formatPicScaledComp5(x_4, 3, 3, true, false) + " .");
        CobolDisplay.display("INIT D-1 : " + CobolDisplay.formatPicScaledComp5(d_1, 3, 3, false, false) + " .");
        x_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_1), 3, 3, false).abs();
        x_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_1), 3, 3, false).abs();
        d_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(x_2), 3, 3, false).abs();
        CobolDisplay.display("MOVE X-1 : " + CobolDisplay.formatPicScaledComp5(x_1, 3, 3, false, false) + " .");
        CobolDisplay.display("MOVE X-2 : " + CobolDisplay.formatPicScaledComp5(x_2, 3, 3, false, false) + " .");
        x_4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.000256")), 3, 3, true).abs();
        CobolDisplay.display("MOVE X-4 : " + CobolDisplay.formatPicScaledComp5(x_4, 3, 3, true, false) + " .");
        CobolDisplay.display("MOVE D-1 : " + CobolDisplay.formatPicScaledComp5(d_1, 3, 3, false, false) + " .");
        x_2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_2), 3, 3, false).abs();
        x_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_2), 3, 3, false).abs();
        CobolDisplay.display("MOVE X-1 : " + CobolDisplay.formatPicScaledComp5(x_1, 3, 3, false, false) + ":" + CobolDisplay.formatPicScaledComp5(d_2, 4, 2, false, false) + " .");
        CobolDisplay.display("MOVE X-2 : " + CobolDisplay.formatPicScaledComp5(x_2, 3, 3, false, false) + ":" + CobolDisplay.formatPicScaledComp5(d_2, 4, 2, false, false) + " .");
        x_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(98000), 3, 3, false).abs();
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(98000)) != 0) {
            CobolDisplay.display("MOVE 98000 failed: " + CobolDisplay.formatPicScaledComp5(x_1, 3, 3, false, false));
        }
        d_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(98000), 3, 3, false).abs();
        if (d_1.compareTo(CobolIntrinsics.toBigDecimal(98000)) != 0) {
            CobolDisplay.display("MOVE 98000 failed: " + CobolDisplay.formatPicScaledComp5(d_1, 3, 3, false, false));
        }
        x_1 = CobolIntrinsics.truncateToScaledField(x_1.add(CobolIntrinsics.toBigDecimal(1000)), 3, 3, false);
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(99000)) != 0) {
            CobolDisplay.display("+ 1000 failed: " + CobolDisplay.formatPicScaledComp5(x_1, 3, 3, false, false));
        }
        x_1 = CobolIntrinsics.truncateToScaledField(x_1.subtract(CobolIntrinsics.toBigDecimal(4000)), 3, 3, false);
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(95000)) != 0) {
            CobolDisplay.display("- 4000 failed: " + CobolDisplay.formatPicScaledComp5(x_1, 3, 3, false, false));
        }
        x_1 = CobolIntrinsics.truncateToScaledField(x_1.divide(CobolIntrinsics.toBigDecimal(3), 18, RoundingMode.HALF_UP), 3, 3, false);
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(31000)) != 0) {
            CobolDisplay.display("/ 3 failed: " + CobolDisplay.formatPicScaledComp5(x_1, 3, 3, false, false));
        }
        x_1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(2).multiply(x_1)), 3, 3, false).abs();
        if (x_1.compareTo(CobolIntrinsics.toBigDecimal(62000)) != 0) {
            CobolDisplay.display("* 2 failed: " + CobolDisplay.formatPicScaledComp5(x_1, 3, 3, false, false));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataBinary009PppComp5");
            CobolProgram.registerCallAlias("prog", "DataBinary009PppComp5");
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
        new DataBinary009PppComp5().run();
    }
}
