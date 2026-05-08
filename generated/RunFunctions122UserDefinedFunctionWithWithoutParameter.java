package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions122UserDefinedFunctionWithWithoutParameter extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "WITHPAR";
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
    // LINKAGE SECTION
    private int par_in = 0;
    private int par_out = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);


    private void para_main() {
        par_out = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1 + par_in), 1));
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("WITHPAR", "", "WITHPAR.cob");
        CobolProgram.pushActive("WITHPAR");
        try {
            CobolProgram.registerCallAlias("WITHPAR", "RunFunctions122UserDefinedFunctionWithWithoutParameter");
            CobolProgram.registerCallAlias("withoutpar", "RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar");
            CobolProgram.registerCallAlias("prog", "RunFunctions122UserDefinedFunctionWithWithoutParameter_Prog");
            CobolProgram.registerCallAlias("withpar", "RunFunctions122UserDefinedFunctionWithWithoutParameter");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }

    public void setLinkageArgs(Object[] args) {
        if (args.length > 0 && args[0] != null) {
            par_in = CobolIntrinsics.toBigDecimal(args[0]).intValue();
        }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunFunctions122UserDefinedFunctionWithWithoutParameter_Prog().run();
    }

    public static int invoke(Object... _args) {
        RunFunctions122UserDefinedFunctionWithWithoutParameter _f = new RunFunctions122UserDefinedFunctionWithWithoutParameter();
        if (_args.length > 0) {
            _f.par_in = ((Number)_args[0]).intValue();
        }
        _f.run();
        return _f.par_out;
    }
}

class RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "WITHOUTPAR";
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
    // LINKAGE SECTION
    private int par = 0;
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    private void para_main() {
        par = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1));
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("WITHOUTPAR", "", "WITHOUTPAR.cob");
        CobolProgram.pushActive("WITHOUTPAR");
        try {
            CobolProgram.registerCallAlias("WITHOUTPAR", "RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar");
            CobolProgram.registerCallAlias("withoutpar", "RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar");
            CobolProgram.registerCallAlias("prog", "RunFunctions122UserDefinedFunctionWithWithoutParameter_Prog");
            CobolProgram.registerCallAlias("withpar", "RunFunctions122UserDefinedFunctionWithWithoutParameter");
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
        new RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar().run();
    }
    public static int invoke(Object... _args) {
        RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar _f = new RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar();
        _f.run();
        return _f.par;
    }
}

class RunFunctions122UserDefinedFunctionWithWithoutParameter_Prog extends CobolProgram {
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
        if (RunFunctions122UserDefinedFunctionWithWithoutParameter.invoke(1) != 2) {
            CobolDisplay.display(String.valueOf(RunFunctions122UserDefinedFunctionWithWithoutParameter.invoke(1)));
        }
        if (RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar.invoke() != 1) {
            CobolDisplay.display(String.valueOf(RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar.invoke()));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions122UserDefinedFunctionWithWithoutParameter_Prog");
            CobolProgram.registerCallAlias("withoutpar", "RunFunctions122UserDefinedFunctionWithWithoutParameter_Withoutpar");
            CobolProgram.registerCallAlias("prog", "RunFunctions122UserDefinedFunctionWithWithoutParameter_Prog");
            CobolProgram.registerCallAlias("withpar", "RunFunctions122UserDefinedFunctionWithWithoutParameter");
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
        new RunFunctions122UserDefinedFunctionWithWithoutParameter_Prog().run();
    }
}
