package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental092ExpressionNumericVsDisplay extends CobolProgram {
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
    private CobolString fldx50 = new CobolString(50, "X50");
    private CobolString fldx10j = new CobolString(10, "0123");
    private int fldnumd = -123;
    private int fldnumd4 = -123;
    private BigDecimal fldnumb = new BigDecimal("-1.23");
    private int filler_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(70);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldx50 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDX50").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldx10j = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(50, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDX10J").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldnumd = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(60, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLDNUMD").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldnumd4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(63, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLDNUMD4").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldnumb = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(67, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FLDNUMB").picDigits(3).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(69, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString do_disp = new CobolString(256); // fallback

    private void main_line() {
        do_check();
        return;
    }

    private void do_check() {
        fldx50.set(String.valueOf("123"));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(fldx50).trim()).compareTo(CobolIntrinsics.toBigDecimal(123)) == 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! 123  <> \"123\"");
            }
        }
        if (fldnumd == fldnumd4) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! 123  <> 0123");
            }
        }
        if (CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(fldnumd4, 4, 0), String.valueOf(fldx50))) {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"123\" = 0123");
            } else {
                /* CONTINUE */
            }
        }
        if (CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(fldnumd, 3, 0), String.valueOf(fldx50))) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("!-123 DISP <> \"123\"");
            }
        }
        if (CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(fldnumb, 3, 2), String.valueOf(fldx50))) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("!-1.23 BIN  <> \"123\"");
            }
        }
        if (CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(fldnumd4, 4, 0), String.valueOf(fldx10j))) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"0123\" J  <> \"0123\"");
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental092ExpressionNumericVsDisplay");
            CobolProgram.registerCallAlias("prog", "RunFundamental092ExpressionNumericVsDisplay");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            main_line();
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
        new RunFundamental092ExpressionNumericVsDisplay().run();
    }
}
