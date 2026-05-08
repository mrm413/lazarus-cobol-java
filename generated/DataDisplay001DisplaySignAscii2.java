package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay001DisplaySignAscii2 extends CobolProgram {
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
    private CobolString g = new CobolString(10); // Group: G
    private CobolString x = new CobolString(10);
    private int x_s99 = 0;
    private int[] x_s9 = new int[10];

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-S99").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-S9").picDigits(1).signed(true).build();


    private void para_main() {
        x_s9[1 - 1] = CobolIntrinsics.toBigDecimal(0).intValue();
        x.setRefMod((1 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[1 - 1], 1, false, false));
        x_s9[2 - 1] = CobolIntrinsics.toBigDecimal(1).intValue();
        x.setRefMod((2 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[2 - 1], 1, false, false));
        x_s9[3 - 1] = CobolIntrinsics.toBigDecimal(2).intValue();
        x.setRefMod((3 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[3 - 1], 1, false, false));
        x_s9[4 - 1] = CobolIntrinsics.toBigDecimal(3).intValue();
        x.setRefMod((4 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[4 - 1], 1, false, false));
        x_s9[5 - 1] = CobolIntrinsics.toBigDecimal(4).intValue();
        x.setRefMod((5 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[5 - 1], 1, false, false));
        x_s9[6 - 1] = CobolIntrinsics.toBigDecimal(5).intValue();
        x.setRefMod((6 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[6 - 1], 1, false, false));
        x_s9[7 - 1] = CobolIntrinsics.toBigDecimal(6).intValue();
        x.setRefMod((7 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[7 - 1], 1, false, false));
        x_s9[8 - 1] = CobolIntrinsics.toBigDecimal(7).intValue();
        x.setRefMod((8 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[8 - 1], 1, false, false));
        x_s9[9 - 1] = CobolIntrinsics.toBigDecimal(8).intValue();
        x.setRefMod((9 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[9 - 1], 1, false, false));
        x_s9[10 - 1] = CobolIntrinsics.toBigDecimal(9).intValue();
        x.setRefMod((10 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[10 - 1], 1, false, false));
        CobolDisplay.displayNoAdvancing(String.valueOf(x));
        x_s99 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-10), 2);
        x.setRefMod(1, 2, CobolIntrinsics.formatSignEmbedded(x_s99, 2, false, false));
        x.setRefMod(1, 1, String.valueOf(CobolString.refMod(x, 2, 1, g, 0)));
        x_s9[2 - 1] = CobolIntrinsics.toBigDecimal(-1).intValue();
        x.setRefMod((2 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[2 - 1], 1, false, false));
        x_s9[3 - 1] = CobolIntrinsics.toBigDecimal(-2).intValue();
        x.setRefMod((3 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[3 - 1], 1, false, false));
        x_s9[4 - 1] = CobolIntrinsics.toBigDecimal(-3).intValue();
        x.setRefMod((4 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[4 - 1], 1, false, false));
        x_s9[5 - 1] = CobolIntrinsics.toBigDecimal(-4).intValue();
        x.setRefMod((5 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[5 - 1], 1, false, false));
        x_s9[6 - 1] = CobolIntrinsics.toBigDecimal(-5).intValue();
        x.setRefMod((6 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[6 - 1], 1, false, false));
        x_s9[7 - 1] = CobolIntrinsics.toBigDecimal(-6).intValue();
        x.setRefMod((7 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[7 - 1], 1, false, false));
        x_s9[8 - 1] = CobolIntrinsics.toBigDecimal(-7).intValue();
        x.setRefMod((8 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[8 - 1], 1, false, false));
        x_s9[9 - 1] = CobolIntrinsics.toBigDecimal(-8).intValue();
        x.setRefMod((9 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[9 - 1], 1, false, false));
        x_s9[10 - 1] = CobolIntrinsics.toBigDecimal(-9).intValue();
        x.setRefMod((10 - 1) * 1 + 1, 1, CobolIntrinsics.formatSignEmbedded(x_s9[10 - 1], 1, false, false));
        CobolDisplay.displayNoAdvancing(String.valueOf(x));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataDisplay001DisplaySignAscii2");
            CobolProgram.registerCallAlias("prog", "DataDisplay001DisplaySignAscii2");
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
        new DataDisplay001DisplaySignAscii2().run();
    }
}
