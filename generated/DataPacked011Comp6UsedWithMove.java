package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked011Comp6UsedWithMove extends CobolProgram {
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
    private BigDecimal x_999 = BigDecimal.ZERO;
    private int b_99 = 0;
    private int b_999 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(6);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_999 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("X-999").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("B-99").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b_999 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("B-999").build();


    private void para_main() {
        b_99 = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        x_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_99), 2, 0, false);
        if (x_99.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            CobolDisplay.display("00 <" + CobolDisplay.formatPic(x_99, 2, 0, false) + ">");
        }
        b_99 = (int) CobolIntrinsics.toBigDecimal(99).intValue();
        x_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_99), 2, 0, false);
        if (x_99.compareTo(CobolIntrinsics.toBigDecimal(99)) != 0) {
            CobolDisplay.display("99 <" + CobolDisplay.formatPic(x_99, 2, 0, false) + ">");
        }
        b_999 = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        x_999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_999), 3, 0, false);
        if (x_999.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            CobolDisplay.display("000 <" + CobolDisplay.formatPic(x_999, 3, 0, false) + ">");
        }
        b_999 = (int) CobolIntrinsics.toBigDecimal(123).intValue();
        x_999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_999), 3, 0, false);
        if (x_999.compareTo(CobolIntrinsics.toBigDecimal(123)) != 0) {
            CobolDisplay.display("123 <" + CobolDisplay.formatPic(x_999, 3, 0, false) + ">");
        }
        x_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(b_999), 2, 0, false);
        if (x_99.compareTo(CobolIntrinsics.toBigDecimal(23)) != 0) {
            CobolDisplay.display("23 <" + CobolDisplay.formatPic(x_99, 2, 0, false) + ">");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked011Comp6UsedWithMove");
            CobolProgram.registerCallAlias("prog", "DataPacked011Comp6UsedWithMove");
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
        new DataPacked011Comp6UsedWithMove().run();
    }
}
