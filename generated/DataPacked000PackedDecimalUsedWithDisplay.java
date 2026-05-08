package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked000PackedDecimalUsedWithDisplay extends CobolProgram {
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
    private BigDecimal x_99 = BigDecimal.ZERO;
    private BigDecimal x_s99 = BigDecimal.ZERO;
    private BigDecimal x_999 = BigDecimal.ZERO;
    private BigDecimal x_s999 = BigDecimal.ZERO;
    private int b_p1234 = 1234;
    private int b_n1234 = -1234;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("X-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("X-S99").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_999 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("X-999").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_s999 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("X-S999").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b_p1234 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("B-P1234").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b_n1234 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("B-N1234").build();


    private void para_main() {
        x_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 2, 0, false);
        CobolDisplay.display(CobolDisplay.formatPic(x_99, 2, 0, false));
        x_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(99), 2, 0, false);
        CobolDisplay.display(CobolDisplay.formatPic(x_99, 2, 0, false));
        x_s99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 2, 0, true);
        CobolDisplay.display(CobolDisplay.formatPic(x_s99, 2, 0, true, "LEADING"));
        x_s99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-1), 2, 0, true);
        CobolDisplay.display(CobolDisplay.formatPic(x_s99, 2, 0, true, "LEADING"));
        x_999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 3, 0, false);
        CobolDisplay.display(CobolDisplay.formatPic(x_999, 3, 0, false));
        x_999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(123), 3, 0, false);
        CobolDisplay.display(CobolDisplay.formatPic(x_999, 3, 0, false));
        x_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 3, 0, true);
        CobolDisplay.display(CobolDisplay.formatPic(x_s999, 3, 0, true, "LEADING"));
        x_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-123), 3, 0, true);
        CobolDisplay.display(CobolDisplay.formatPic(x_s999, 3, 0, true, "LEADING"));
        x_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_p1234), 3, 0, true);
        CobolDisplay.display(CobolDisplay.formatPic(x_s999, 3, 0, true, "LEADING"));
        x_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_n1234), 3, 0, true);
        CobolDisplay.display(CobolDisplay.formatPic(x_s999, 3, 0, true, "LEADING"));
        x_999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_n1234), 3, 0, false);
        CobolDisplay.display(CobolDisplay.formatPic(x_999, 3, 0, false));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked000PackedDecimalUsedWithDisplay");
            CobolProgram.registerCallAlias("prog", "DataPacked000PackedDecimalUsedWithDisplay");
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
        new DataPacked000PackedDecimalUsedWithDisplay().run();
    }
}
