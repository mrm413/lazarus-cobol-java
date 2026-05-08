package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay000DisplaySignAscii extends CobolProgram {
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
    private CobolString g = new CobolString(5); // Group: G
    private CobolString x = new CobolString(5);
    private int x_9 = 0;
    private int x_s9 = 0;
    private int x_s9_l = 0;
    private CobolString x_s9_ls = x;
    private int x_s9_t = 0;
    private CobolString x_s9_ts = x;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(5);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-9").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-S9").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s9_l = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-S9-L").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s9_ls = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.SIGN_TRAILING_SEPARATE).name("X-S9-LS").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s9_t = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-S9-T").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s9_ts = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.SIGN_TRAILING_SEPARATE).name("X-S9-TS").picDigits(4).signed(true).build();


    private void para_main() {
        x.set("00000");
        x_9 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1234), 4));
        x.setRefMod(1, 4, CobolIntrinsics.formatUnsignedDisplay(x_9, 4));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1234), 4);
        x.setRefMod(1, 4, CobolIntrinsics.formatSignEmbedded(x_s9, 4, false, false));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-1234), 4);
        x.setRefMod(1, 4, CobolIntrinsics.formatSignEmbedded(x_s9, 4, false, false));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9_l = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1234), 4);
        x.setRefMod(1, 4, CobolIntrinsics.formatSignEmbedded(x_s9_l, 4, true, false));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9_l = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-1234), 4);
        x.setRefMod(1, 4, CobolIntrinsics.formatSignEmbedded(x_s9_l, 4, true, false));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9_ls.set(CobolIntrinsics.formatSignSeparate(1234, 4, true));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9_ls.set(CobolIntrinsics.formatSignSeparate(-1234, 4, true));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9_t = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1234), 4);
        x.setRefMod(1, 4, CobolIntrinsics.formatSignEmbedded(x_s9_t, 4, false, false));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9_t = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-1234), 4);
        x.setRefMod(1, 4, CobolIntrinsics.formatSignEmbedded(x_s9_t, 4, false, false));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9_ts.set(CobolIntrinsics.formatSignSeparate(1234, 4, false));
        CobolDisplay.display(String.valueOf(x));
        x.set("00000");
        x_s9_ts.set(CobolIntrinsics.formatSignSeparate(-1234, 4, false));
        CobolDisplay.display(String.valueOf(x));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataDisplay000DisplaySignAscii");
            CobolProgram.registerCallAlias("prog", "DataDisplay000DisplaySignAscii");
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
        new DataDisplay000DisplaySignAscii().run();
    }
}
