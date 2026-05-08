package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions045FunctionLength extends CobolProgram {
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
    private BigDecimal x = new BigDecimal("-1.5");
    private CobolString n = new CobolString(18);
    private BigDecimal test_fld = BigDecimal.ZERO;
    private CobolString test_tab = new CobolString(12, "10          "); // Group: TEST-TAB
    private int t_entries = 10;
    private CobolString[] test_entry = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            test_entry[_d0] = new CobolString(1);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(44);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X").picDigits(8).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("N").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_fld = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("TEST-FLD").picDigits(6).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_tab = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TEST-TAB").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t_entries = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("T-ENTRIES").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TEST-ENTRY").build();


    private void para_main() {
        test_fld = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(8), 6, 2, true);
        if (test_fld.compareTo(CobolIntrinsics.toBigDecimal(8)) != 0) {
            CobolDisplay.display("LENGTH \"00128\" wrong: " + CobolDisplay.formatPic(test_fld, 6, 2, true, "LEADING"));
        }
        test_fld = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(9), 6, 2, true);
        if (test_fld.compareTo(CobolIntrinsics.toBigDecimal(9)) != 0) {
            CobolDisplay.display("LENGTH N(9) wrong: " + CobolDisplay.formatPic(test_fld, 6, 2, true, "LEADING"));
        }
        test_fld = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(5), 6, 2, true);
        if (test_fld.compareTo(CobolIntrinsics.toBigDecimal(5)) != 0) {
            CobolDisplay.display("LENGTH \"00128\" wrong: " + CobolDisplay.formatPic(test_fld, 6, 2, true, "LEADING"));
        }
        test_fld = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 6, 2, true);
        if (test_fld.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            CobolDisplay.display("LENGTH x\"a0\" wrong: " + CobolDisplay.formatPic(test_fld, 6, 2, true, "LEADING"));
        }
        test_fld = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(3), 6, 2, true);
        if (test_fld.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0) {
            CobolDisplay.display("LENGTH z\"a0\" wrong: " + CobolDisplay.formatPic(test_fld, 6, 2, true, "LEADING"));
        }
        test_fld = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 6, 2, true);
        if (test_fld.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("LENGTH n\"a0\" wrong: " + CobolDisplay.formatPic(test_fld, 6, 2, true, "LEADING"));
        }
        t_entries = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(10), 2));
        test_fld = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal((2 + (1) * t_entries)), 6, 2, true);
        if (test_fld.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            CobolDisplay.display("LENGTH TEST-TAB (10 entries): " + CobolDisplay.formatPic(test_fld, 6, 2, true, "LEADING"));
        }
        t_entries = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        test_fld = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal((2 + (1) * t_entries)), 6, 2, true);
        if (test_fld.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0) {
            CobolDisplay.display("LENGTH TEST-TAB (1 entry): " + CobolDisplay.formatPic(test_fld, 6, 2, true, "LEADING"));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions045FunctionLength");
            CobolProgram.registerCallAlias("prog", "RunFunctions045FunctionLength");
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
        new RunFunctions045FunctionLength().run();
    }
}
