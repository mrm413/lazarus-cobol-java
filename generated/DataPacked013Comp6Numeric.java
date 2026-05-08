package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked013Comp6Numeric extends CobolProgram {
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
    private CobolString g = new CobolString(3); // Group: G
    private CobolString x_2 = new CobolString(2);
    private BigDecimal n_3 = BigDecimal.ZERO;
    private BigDecimal n_4 = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(3);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("N-3").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("N-4").picDigits(4).build();


    private void para_main() {
        x_2.set(String.valueOf("\u0000\u0000"));
        if (!CobolIntrinsics.isNumericPacked(x_2, 3, false, true)) {
            CobolDisplay.display("3 0000 NG");
        }
        if (!CobolIntrinsics.isNumericPacked(x_2, 4, false, true)) {
            CobolDisplay.display("4 0000 NG");
        }
        x_2.set(String.valueOf("\u0000\u000c"));
        if (CobolIntrinsics.isNumericPacked(x_2, 3, false, true)) {
            CobolDisplay.display("3 000c NG");
        }
        if (CobolIntrinsics.isNumericPacked(x_2, 4, false, true)) {
            CobolDisplay.display("4 000c NG");
        }
        x_2.set(String.valueOf("\u00124"));
        if (!CobolIntrinsics.isNumericPacked(x_2, 3, false, true)) {
            CobolDisplay.display("3 1234 NG");
        }
        if (!CobolIntrinsics.isNumericPacked(x_2, 4, false, true)) {
            CobolDisplay.display("4 1234 NG");
        }
        x_2.set(String.valueOf("\u00ff\u00ff"));
        if (CobolIntrinsics.isNumericPacked(x_2, 3, false, true)) {
            CobolDisplay.display("3 ffff NG");
        }
        if (CobolIntrinsics.isNumericPacked(x_2, 4, false, true)) {
            CobolDisplay.display("4 ffff NG");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked013Comp6Numeric");
            CobolProgram.registerCallAlias("prog", "DataPacked013Comp6Numeric");
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
        new DataPacked013Comp6Numeric().run();
    }
}
