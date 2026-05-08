package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions028CallByValueNumericLiteralWithSizeIs extends CobolProgram {
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
        CobolProgram.callNested("prog2", 4, 0, 0, 1, 0);
        CobolProgram.callNested("prog2", 1, 2, 0, 0, 0);
        CobolProgram.callNested("prog2", 2, 0, 3, 0, 0);
        CobolProgram.callNested("prog2", 4, 0, 0, 4, 0);
        CobolProgram.callNested("prog2", 8, 0, 0, 0, 5);
        CobolProgram.callNested("prog2", 4, 0, 0, 6, 0);
        CobolProgram.callNested("prog2", 4, 0, 0, 7, 0);
        CobolProgram.callNested("prog2", 1, 2, 0, 0, 0);
        CobolProgram.callNested("prog2", 2, 0, 3, 0, 0);
        CobolProgram.callNested("prog2", 4, 0, 0, 4, 0);
        CobolProgram.callNested("prog2", 8, 0, 0, 0, 5, 0);
        CobolProgram.callNested("prog2", 4, 0, 0, 6, 0);
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions028CallByValueNumericLiteralWithSizeIs");
            CobolProgram.registerCallAlias("prog2", "RunExtensions028CallByValueNumericLiteralWithSizeIs_Prog2");
            CobolProgram.registerCallAlias("prog", "RunExtensions028CallByValueNumericLiteralWithSizeIs");
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
        new RunExtensions028CallByValueNumericLiteralWithSizeIs().run();
    }
}

class RunExtensions028CallByValueNumericLiteralWithSizeIs_Prog2 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "prog2";
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
    private int len = 0;
    private byte var_1 = (byte) 0;
    private short var_2 = (short) 0;
    private int var_4 = 0;
    private long var_8 = 0L;
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    private void para_main() {
        if (len == 1) {
            CobolDisplay.display("1: " + CobolDisplay.formatPic(var_1, 3, 0, true, "LEADING"));
        } else if (len == 2) {
            CobolDisplay.display("2: " + CobolDisplay.formatPic(var_2, 5, 0, true, "LEADING"));
        } else if (len == 4) {
            CobolDisplay.display("4: " + CobolDisplay.formatPic(var_4, 10, 0, true, "LEADING"));
        } else if (len == 8) {
            CobolDisplay.display("8: " + CobolDisplay.formatPic(var_8, 20, 0, true, "LEADING"));
        }
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog2", "", "prog2.cob");
        CobolProgram.pushActive("prog2");
        try {
            CobolProgram.registerCallAlias("prog2", "RunExtensions028CallByValueNumericLiteralWithSizeIs_Prog2");
            CobolProgram.registerCallAlias("prog2", "RunExtensions028CallByValueNumericLiteralWithSizeIs_Prog2");
            CobolProgram.registerCallAlias("prog", "RunExtensions028CallByValueNumericLiteralWithSizeIs");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }
    public void setLinkageArgs(Object[] args) {
        if (args.length > 0 && args[0] != null) {
            len = CobolIntrinsics.toBigDecimal(args[0]).intValue();
        }
        if (args.length > 1 && args[1] != null) {
            var_1 = CobolIntrinsics.toBigDecimal(args[1]).byteValue();
        }
        if (args.length > 2 && args[2] != null) {
            var_2 = CobolIntrinsics.toBigDecimal(args[2]).shortValue();
        }
        if (args.length > 3 && args[3] != null) {
            var_4 = CobolIntrinsics.toBigDecimal(args[3]).intValue();
        }
        if (args.length > 4 && args[4] != null) {
            var_8 = CobolIntrinsics.toBigDecimal(args[4]).longValue();
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
        new RunExtensions028CallByValueNumericLiteralWithSizeIs_Prog2().run();
    }
}
