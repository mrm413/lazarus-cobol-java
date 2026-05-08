package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc130LineColumn0Exceptions extends CobolProgram {
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
    private int zero_var = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_zero_var = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("zero-var").picDigits(1).build();

    private CobolString scr = new CobolString(256); // fallback

    private void para_main() {
        { /* DISPLAY screen AT LINE/COL variable — runtime bounds check */
            int _atLine = zero_var;
            int _atCol  = 1;
            if (_atLine == 0) {
                CobolIntrinsics.setException("EC-SCREEN-LINE-NUMBER");
            } else if (_atCol == 0) {
                CobolIntrinsics.setException("EC-SCREEN-STARTING-COLUMN");
            } else {
                { /* DISPLAY scr — SCREEN SECTION */
                    java.util.List<com.lazarus.cobol.CobolDisplay.ScreenItem> _scr = new java.util.ArrayList<>();
                    _scr.add(new com.lazarus.cobol.CobolDisplay.ScreenItem(1, 1, "a"));
                    com.lazarus.cobol.CobolDisplay.displayScreen(_scr);
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolIntrinsics.exception_status()), String.valueOf("EC-SCREEN-LINE-NUMBER"))) {
            return_code = (int)(1);
            return;
        }
        { /* DISPLAY screen AT LINE/COL variable — runtime bounds check */
            int _atLine = 1;
            int _atCol  = zero_var;
            if (_atLine == 0) {
                CobolIntrinsics.setException("EC-SCREEN-LINE-NUMBER");
            } else if (_atCol == 0) {
                CobolIntrinsics.setException("EC-SCREEN-STARTING-COLUMN");
            } else {
                { /* DISPLAY scr — SCREEN SECTION */
                    java.util.List<com.lazarus.cobol.CobolDisplay.ScreenItem> _scr = new java.util.ArrayList<>();
                    _scr.add(new com.lazarus.cobol.CobolDisplay.ScreenItem(1, 1, "a"));
                    com.lazarus.cobol.CobolDisplay.displayScreen(_scr);
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolIntrinsics.exception_status()), String.valueOf("EC-SCREEN-STARTING-COLUMN"))) {
            return_code = (int)(2);
            return;
        }
        return_code = (int)(0);
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc130LineColumn0Exceptions");
            CobolProgram.registerCallAlias("prog", "RunMisc130LineColumn0Exceptions");
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
        new RunMisc130LineColumn0Exceptions().run();
    }
}
