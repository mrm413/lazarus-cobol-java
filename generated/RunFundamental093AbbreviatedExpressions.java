package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental093AbbreviatedExpressions extends CobolProgram {
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
    private boolean _switch_1 = false;
    // WORKING-STORAGE SECTION
    private int fld9_0 = 0;
    private int fld9_1 = 1;
    private int fld9_2 = 2;
    private int fld9_5 = 5;
    private int fld9_7 = 7;
    private int fld9_9 = 9;
    private CobolString fldx = new CobolString(1, "X");
    private CobolString fldy = new CobolString(1, "Y");
    private CobolString fldyy = new CobolString(1, "Y");
    private CobolString fldz = new CobolString(1, "Z");
    private int testnum = 1;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(12);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld9_0 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD9-0").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld9_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD9-1").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld9_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD9-2").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld9_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD9-5").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld9_7 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD9-7").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld9_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD9-9").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldy = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldyy = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDYY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldz = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDZ").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_testnum = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TESTNUM").picDigits(2).build();

    private CobolString on_wrk_switch_1 = new CobolString(256); // fallback
    private CobolString off_wrk_switch_2 = new CobolString(256); // fallback
    private CobolString off_wrk_switch_1 = new CobolString(256); // fallback

    private void main_line() {
        if (((fld9_7 > fld9_5 && fld9_7 >= fld9_0) || (fld9_1 != 0))) {
            pass();
        } else {
            fail();
        }
        if ((fld9_7 != fld9_5 || (fld9_1 != 0))) {
            pass();
        } else {
            fail();
        }
        if ((fld9_7 != fld9_5 && (fld9_1 != 0))) {
            pass();
        } else {
            fail();
        }
        if ((!(fld9_7 == fld9_5) || (fld9_1 != 0))) {
            pass();
        } else {
            fail();
        }
        if (!((fld9_5 > fld9_7 || fld9_5 < fld9_1))) {
            pass();
        } else {
            fail();
        }
        if (!(((fld9_7 <= fld9_5 && (fld9_2 != 0)) && !((fld9_1 != 0))))) {
            pass();
        } else {
            fail();
        }
        if (((fld9_9 > fld9_2 && (fld9_7 != 0)) && (fld9_5 != 0))) {
            pass();
        } else {
            fail();
        }
        if (((fld9_9 > fld9_2 && (fld9_7 != 0)) || (fld9_5 != 0))) {
            pass();
        } else {
            fail();
        }
        if (((fld9_1 < fld9_2 && (fld9_5 != 0)) && (fld9_7 != 0))) {
            pass();
        } else {
            fail();
        }
        if ((((9 > 2 && 9 > 7) && 9 > 5) && 9 > 1)) {
            pass();
        } else {
            fail();
        }
        if ((((1 < 2 && 1 < 5) && 1 < 7) && 1 < 9)) {
            pass();
        } else {
            fail();
        }
        if ((((5 < 2 || 5 < 1) || 5 < 9) || 5 < 7)) {
            pass();
        } else {
            fail();
        }
        if (((5 > 1 && 5 < 3) || 5 < 6)) {
            pass();
        } else {
            fail();
        }
        if ((!String.valueOf(on_wrk_switch_1).trim().isEmpty() || (!(!String.valueOf(off_wrk_switch_2).trim().isEmpty()) && !String.valueOf(off_wrk_switch_1).trim().isEmpty()))) {
            fail();
        } else {
            pass();
        }
        CobolDisplay.displayNoAdvancing("***FINE***");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void pass() {
        testnum = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(testnum).add(CobolIntrinsics.toBigDecimal(1))), 2));
    }

    private void fail() {
        CobolDisplay.display("Test " + CobolDisplay.formatPic(testnum, 2, 0, false) + " failed!");
        testnum = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(testnum).add(CobolIntrinsics.toBigDecimal(1))), 2));
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental093AbbreviatedExpressions");
            CobolProgram.registerCallAlias("prog", "RunFundamental093AbbreviatedExpressions");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            _switch_1 = "1".equals(System.getenv("COB_SWITCH_1"));
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
        new RunFundamental093AbbreviatedExpressions().run();
    }
}
