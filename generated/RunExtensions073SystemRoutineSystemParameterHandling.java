package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions073SystemRoutineSystemParameterHandling extends CobolProgram {
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
    private int test_no = 0;
    private CobolString chaining_param = new CobolString(20);
    private CobolString chaining_param_2 = new CobolString(20);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(41);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_no = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("test-no").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_chaining_param = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("chaining-param").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_chaining_param_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("chaining-param-2").build();


    private void para_main() {
        if (CobolString.cobolEquals(String.valueOf(chaining_param), String.valueOf(" ")) && CobolString.cobolEquals(String.valueOf(chaining_param_2), String.valueOf(" "))) {
            CobolDisplay.display("started without options - closing");
        } else if ((CobolString.cobolEquals(String.valueOf(chaining_param), String.valueOf("1")) && CobolString.cobolEquals(String.valueOf(chaining_param_2), String.valueOf(" "))) || (CobolString.cobolEquals(String.valueOf(chaining_param), String.valueOf("\"1\"")) && CobolString.cobolEquals(String.valueOf(chaining_param_2), String.valueOf(" "))) || (CobolString.cobolEquals(String.valueOf(chaining_param), String.valueOf("a v")) && CobolString.cobolEquals(String.valueOf(chaining_param_2), String.valueOf(" "))) || (CobolString.cobolEquals(String.valueOf(chaining_param), String.valueOf("\"a v\"")) && CobolString.cobolEquals(String.valueOf(chaining_param_2), String.valueOf(" ")))) {
            CobolDisplay.display("  called with -" + String.valueOf(CobolIntrinsics.trim(chaining_param)) + "-");
        } else if (CobolString.cobolEquals(String.valueOf(chaining_param), String.valueOf("a")) && CobolString.cobolEquals(String.valueOf(chaining_param_2), String.valueOf("v"))) {
            CobolDisplay.display("  called with -" + String.valueOf(CobolIntrinsics.trim(chaining_param)) + "-" + " and with -" + String.valueOf(CobolIntrinsics.trim(chaining_param_2)) + "-");
        } else if (CobolString.cobolEquals(String.valueOf(chaining_param), String.valueOf("start")) && CobolString.cobolEquals(String.valueOf(chaining_param_2), String.valueOf(" "))) {
            chaining_param.set(String.valueOf("prog 1"));
            callme();
            chaining_param.set(String.valueOf("prog \"1\""));
            callme();
            chaining_param.set(String.valueOf("\"prog\" 1"));
            callme();
            chaining_param.set(String.valueOf("\"prog\" \"1\""));
            callme();
            chaining_param.set(String.valueOf("prog a v"));
            callme();
            chaining_param.set(String.valueOf("prog \"a v\""));
            callme();
            chaining_param.set(String.valueOf("\"prog\" a v"));
            callme();
            chaining_param.set(String.valueOf("\"prog\" \"a v\""));
            callme();
            chaining_param.set(String.valueOf("\"prog\" \"a\" \"v\""));
            callme();
            CobolDisplay.display("tests finished");
        } else {
            CobolDisplay.display("called with unexpected -" + String.valueOf(CobolIntrinsics.trim(chaining_param)) + "-");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void callme() {
        test_no = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(test_no).add(CobolIntrinsics.toBigDecimal(1))), 1));
        CobolDisplay.display("Test #" + CobolDisplay.formatPic(test_no, 1, 0, false) + ":");
        CobolDisplay.display("  CALL 'SYSTEM' with " + String.valueOf(CobolIntrinsics.trim(chaining_param)) + ":");
        CobolProgram.call("SYSTEM", CobolIntrinsics.trim(chaining_param));
        CobolDisplay.display("  --> return of the given CALL 'SYSTEM': " + CobolDisplay.formatPic(return_code, 9, 0, true, "LEADING"));
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions073SystemRoutineSystemParameterHandling");
            CobolProgram.registerCallAlias("prog", "RunExtensions073SystemRoutineSystemParameterHandling");
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
        RunExtensions073SystemRoutineSystemParameterHandling _pgm = new RunExtensions073SystemRoutineSystemParameterHandling();
        if (args.length > 0) _pgm.chaining_param.set(args[0]);
        if (args.length > 1) _pgm.chaining_param_2.set(args[1]);
        _pgm.run();
    }
}
