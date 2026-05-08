package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions106FunctionTestFormattedDatetimeDpComma extends CobolProgram {
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
    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);


    private void para_main() {
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("hhmmss,ss", "000000,00")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
            CobolDisplay.display("Test 1 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDDThhmmss,ss", "16010101T000000,00")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
            CobolDisplay.display("Test 2 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("hhmmss,ss", "000000.00")).trim()).compareTo(CobolIntrinsics.toBigDecimal(7)) == 0)) {
            CobolDisplay.display("Test 3 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDDThhmmss,ss", "16010101T000000.00")).trim()).compareTo(CobolIntrinsics.toBigDecimal(16)) == 0)) {
            CobolDisplay.display("Test 4 failed");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions106FunctionTestFormattedDatetimeDpComma");
            CobolProgram.registerCallAlias("prog", "RunFunctions106FunctionTestFormattedDatetimeDpComma");
            CobolDisplay.setDecimalPointIsComma(true);
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
        new RunFunctions106FunctionTestFormattedDatetimeDpComma().run();
    }
}
