package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions103FunctionTestFormattedDatetimeWithDates extends CobolProgram {
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
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16010101")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
            CobolDisplay.display("Test 1 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-MM-DD", "1601-01-01")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
            CobolDisplay.display("Test 2 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYDDD", "1601001")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
            CobolDisplay.display("Test 3 failed");
            if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-DDD", "1601-001")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
                CobolDisplay.display("Test 4 failed");
            }
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601W011")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
            CobolDisplay.display("Test 5 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-Www-D", "1601-W01-1")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
            CobolDisplay.display("Test 6 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "1")).trim()).compareTo(CobolIntrinsics.toBigDecimal(2)) == 0)) {
            CobolDisplay.display("Test 7 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "160A0101")).trim()).compareTo(CobolIntrinsics.toBigDecimal(4)) == 0)) {
            CobolDisplay.display("Test 8 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "00000101")).trim()).compareTo(CobolIntrinsics.toBigDecimal(1)) == 0)) {
            CobolDisplay.display("Test 9 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16000101")).trim()).compareTo(CobolIntrinsics.toBigDecimal(4)) == 0)) {
            CobolDisplay.display("Test 10 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16010001")).trim()).compareTo(CobolIntrinsics.toBigDecimal(6)) == 0)) {
            CobolDisplay.display("Test 11 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16011301")).trim()).compareTo(CobolIntrinsics.toBigDecimal(6)) == 0)) {
            CobolDisplay.display("Test 12 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16010190")).trim()).compareTo(CobolIntrinsics.toBigDecimal(7)) == 0)) {
            CobolDisplay.display("Test 13 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "18000229")).trim()).compareTo(CobolIntrinsics.toBigDecimal(8)) == 0)) {
            CobolDisplay.display("Test 14 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-MM-DD", "1601 01 01")).trim()).compareTo(CobolIntrinsics.toBigDecimal(5)) == 0)) {
            CobolDisplay.display("Test 15 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "160101010")).trim()).compareTo(CobolIntrinsics.toBigDecimal(9)) == 0)) {
            CobolDisplay.display("Test 16 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601A011")).trim()).compareTo(CobolIntrinsics.toBigDecimal(5)) == 0)) {
            CobolDisplay.display("Test 17 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601W531")).trim()).compareTo(CobolIntrinsics.toBigDecimal(7)) == 0)) {
            CobolDisplay.display("Test 18 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601W601")).trim()).compareTo(CobolIntrinsics.toBigDecimal(6)) == 0)) {
            CobolDisplay.display("Test 19 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "2009W531")).trim()).compareTo(CobolIntrinsics.toBigDecimal(0)) == 0)) {
            CobolDisplay.display("Test 20 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601W018")).trim()).compareTo(CobolIntrinsics.toBigDecimal(8)) == 0)) {
            CobolDisplay.display("Test 21 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYDDD", "1601366")).trim()).compareTo(CobolIntrinsics.toBigDecimal(7)) == 0)) {
            CobolDisplay.display("Test 22 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYDDD", "1601370")).trim()).compareTo(CobolIntrinsics.toBigDecimal(6)) == 0)) {
            CobolDisplay.display("Test 23 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYDDD", "1601400")).trim()).compareTo(CobolIntrinsics.toBigDecimal(5)) == 0)) {
            CobolDisplay.display("Test 24 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "01")).trim()).compareTo(CobolIntrinsics.toBigDecimal(1)) == 0)) {
            CobolDisplay.display("Test 25 failed");
        }
        if (!(CobolIntrinsics.toBigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "1601010")).trim()).compareTo(CobolIntrinsics.toBigDecimal(8)) == 0)) {
            CobolDisplay.display("Test 26 failed");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions103FunctionTestFormattedDatetimeWithDates");
            CobolProgram.registerCallAlias("prog", "RunFunctions103FunctionTestFormattedDatetimeWithDates");
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
        new RunFunctions103FunctionTestFormattedDatetimeWithDates().run();
    }
}
