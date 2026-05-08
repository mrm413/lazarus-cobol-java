package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions035FunctionFormattedTime extends CobolProgram {
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
    private CobolString str = new CobolString(20);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(20);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_str = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("str").build();


    private void para_main() {
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("123456"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hh:mm:ss", 45296)));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("12:34:56"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmssZ", 86399, -1)));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("000059Z"))) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hh:mm:ssZ", 45296)));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("12:34:56Z"))) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss.ss", new BigDecimal("45296.78"))));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("123456.78"))) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hh:mm:ss.ssZ", 0, 120)));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("22:00:00.00Z"))) {
            CobolDisplay.display("Test 6 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss+hhmm", 45296)));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("123456+0000"))) {
            CobolDisplay.display("Test 7 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hh:mm:ss+hh:mm", 45296, 0)));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("12:34:56+00:00"))) {
            CobolDisplay.display("Test 8 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss+hhmm", 45296, -754)));
        if (!CobolString.cobolEquals(String.valueOf(str), String.valueOf("123456-1234"))) {
            CobolDisplay.display("Test 9 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss+hhmm", 1, 3000)));
        if (((!CobolString.cobolEquals(String.valueOf(str), String.valueOf("                    ")) || !CobolString.cobolEquals(String.valueOf(CobolIntrinsics.exception_status()), String.valueOf("EC-ARGUMENT-FUNCTION"))) || !CobolString.cobolEquals(String.valueOf(CobolIntrinsics.exception_location()), String.valueOf("prog; ; 60")))) {
            CobolDisplay.display("Test 10 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss+hhmm", 1, -3000)));
        if (((!CobolString.cobolEquals(String.valueOf(str), String.valueOf("                    ")) || !CobolString.cobolEquals(String.valueOf(CobolIntrinsics.exception_status()), String.valueOf("EC-ARGUMENT-FUNCTION"))) || !CobolString.cobolEquals(String.valueOf(CobolIntrinsics.exception_location()), String.valueOf("prog; ; 68")))) {
            CobolDisplay.display("Test 11 failed: " + String.valueOf(str));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions035FunctionFormattedTime");
            CobolProgram.registerCallAlias("prog", "RunFunctions035FunctionFormattedTime");
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
        new RunFunctions035FunctionFormattedTime().run();
    }
}
