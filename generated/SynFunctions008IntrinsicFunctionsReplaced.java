package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFunctions008IntrinsicFunctionsReplaced extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "SUBSTITUTE";
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
    private CobolString func_in = new CobolString(15);
    private CobolString func_sub = new CobolString(1);
    private CobolString func_out = new CobolString(15);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);


    private void para_main() {
        func_out.set(String.valueOf(func_in));
        func_out.set(CobolIntrinsics.inspectReplaceAll(String.valueOf(func_out), "%", String.valueOf(func_sub)));
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("SUBSTITUTE", "", "SUBSTITUTE.cob");
        CobolProgram.pushActive("SUBSTITUTE");
        try {
            CobolProgram.registerCallAlias("SUBSTITUTE", "SynFunctions008IntrinsicFunctionsReplaced");
            CobolProgram.registerCallAlias("prog", "SynFunctions008IntrinsicFunctionsReplaced_Prog");
            CobolProgram.registerCallAlias("substitute", "SynFunctions008IntrinsicFunctionsReplaced");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }

    public void setLinkageArgs(Object[] args) {
        if (args.length > 0 && args[0] != null) {
            if (args[0] instanceof CobolString) func_in = (CobolString) args[0]; else func_in.set(String.valueOf(args[0]));
        }
        if (args.length > 1 && args[1] != null) {
            if (args[1] instanceof CobolString) func_sub = (CobolString) args[1]; else func_sub.set(String.valueOf(args[1]));
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
        new SynFunctions008IntrinsicFunctionsReplaced_Prog().run();
    }

    public static CobolString invoke(Object... _args) {
        SynFunctions008IntrinsicFunctionsReplaced _f = new SynFunctions008IntrinsicFunctionsReplaced();
        if (_args.length > 0) {
            _f.func_in.set(String.valueOf(_args[0]));
        }
        if (_args.length > 1) {
            _f.func_sub.set(String.valueOf(_args[1]));
        }
        _f.run();
        return _f.func_out;
    }
}

class SynFunctions008IntrinsicFunctionsReplaced_Prog extends CobolProgram {
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
        CobolDisplay.display(String.valueOf(SynFunctions008IntrinsicFunctionsReplaced.invoke(" % C%O%B%O%L % ", "_")));
        CobolDisplay.display(String.valueOf(SynFunctions008IntrinsicFunctionsReplaced.invoke(" % C%O%B%O%L % ", "-")));
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynFunctions008IntrinsicFunctionsReplaced_Prog");
            CobolProgram.registerCallAlias("prog", "SynFunctions008IntrinsicFunctionsReplaced_Prog");
            CobolProgram.registerCallAlias("substitute", "SynFunctions008IntrinsicFunctionsReplaced");
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
        new SynFunctions008IntrinsicFunctionsReplaced_Prog().run();
    }
}
