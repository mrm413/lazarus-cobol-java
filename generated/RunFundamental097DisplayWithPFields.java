package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental097DisplayWithPFields extends CobolProgram {
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
    private int p1 = 1;
    private BigDecimal p2 = new BigDecimal("0");
    private BigDecimal p3 = new BigDecimal(".123");
    private BigDecimal p4 = new BigDecimal("0");
    private BigDecimal p5 = new BigDecimal("0");
    private BigDecimal p6 = new BigDecimal("10");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P1").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P2").picDigits(1).picScale(-1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P3").picDigits(3).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P4").picDigits(1).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P5").picDigits(1).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P6").picDigits(1).picScale(-1).build();

    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private void para_main() {
        CobolDisplay.display("00=" + CobolDisplay.formatPicScaled(p2, 1, 1, false, false) + "; 001=" + CobolDisplay.formatPic(p1, 3, 0, false) + "; 00=" + CobolDisplay.formatPicScaled(p2, 1, 1, false, false) + ";");
        CobolDisplay.display(".00=" + CobolDisplay.formatPicScaled(p4, 1, 1, true, false) + "; .000=" + CobolDisplay.formatPicScaled(p5, 1, 2, true, false) + "; .123=" + CobolDisplay.formatPic(p3, 3, 3, false) + "; " + ".00=" + CobolDisplay.formatPicScaled(p4, 1, 1, true, false) + "; .000=" + CobolDisplay.formatPicScaled(p5, 1, 2, true, false) + ";");
        p2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p1), 1, 1, false).abs();
        p4 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p3), 1, 1, true).abs();
        _filler_003.set(CobolDisplay.moveNumericToAlpha(p3, 3, 3));
        p5 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p3), 1, 2, true).abs();
        CobolDisplay.display("00=" + CobolDisplay.formatPicScaled(p2, 1, 1, false, false) + "; .02=" + CobolDisplay.formatPicScaled(p4, 1, 1, true, false) + "; .003=" + CobolDisplay.formatPicScaled(p5, 1, 2, true, false) + ";");
        CobolDisplay.display("10=" + CobolDisplay.formatPicScaled(p6, 1, 1, false, false) + ";");
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental097DisplayWithPFields");
            CobolProgram.registerCallAlias("prog", "RunFundamental097DisplayWithPFields");
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
        new RunFundamental097DisplayWithPFields().run();
    }
}
