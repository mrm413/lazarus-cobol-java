package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental029ContainedProgramVisibility3 extends CobolProgram {
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
    public static CobolString x = new CobolString(5, "prog1");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(5);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();


    private void para_main() {
        if (!CobolString.cobolEquals(String.valueOf(x), String.valueOf("prog1"))) {
            CobolDisplay.display(String.valueOf(x));
        }
        CobolProgram.callNested("prog2");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental029ContainedProgramVisibility3");
            CobolProgram.registerCallAlias("prog2", "RunFundamental029ContainedProgramVisibility3_Prog2");
            CobolProgram.registerCallAlias("prog3", "RunFundamental029ContainedProgramVisibility3_Prog3");
            CobolProgram.registerCallAlias("prog", "RunFundamental029ContainedProgramVisibility3");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Register own GLOBAL fields for dynamic inherited-GLOBAL resolution
            CobolProgram.registerGlobalField("prog", "X", x);
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
        new RunFundamental029ContainedProgramVisibility3().run();
    }
}

class RunFundamental029ContainedProgramVisibility3_Prog2 extends CobolProgram {
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
    // WORKING-STORAGE SECTION
    public static CobolString x = new CobolString(5, "prog2");
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(5);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    private void para_main() {
        if (!CobolString.cobolEquals(String.valueOf(x), String.valueOf("prog2"))) {
            CobolDisplay.display(String.valueOf(x));
        }
        CobolProgram.callNested("prog3");
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog2", "", "prog2.cob");
        CobolProgram.pushActive("prog2");
        try {
            CobolProgram.registerCallAlias("prog2", "RunFundamental029ContainedProgramVisibility3_Prog2");
            CobolProgram.registerCallAlias("prog2", "RunFundamental029ContainedProgramVisibility3_Prog2");
            CobolProgram.registerCallAlias("prog3", "RunFundamental029ContainedProgramVisibility3_Prog3");
            CobolProgram.registerCallAlias("prog", "RunFundamental029ContainedProgramVisibility3");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Register own GLOBAL fields for dynamic inherited-GLOBAL resolution
            CobolProgram.registerGlobalField("prog2", "X", x);
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
        new RunFundamental029ContainedProgramVisibility3_Prog2().run();
    }
}

class RunFundamental029ContainedProgramVisibility3_Prog3 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "prog3";
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
    private CobolString x = RunFundamental029ContainedProgramVisibility3.x; // GLOBAL from RunFundamental029ContainedProgramVisibility3
    private void para_main() {
        if (!CobolString.cobolEquals(String.valueOf(x), String.valueOf("prog1"))) {
            CobolDisplay.display(String.valueOf(x));
        }
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog3", "", "prog3.cob");
        CobolProgram.pushActive("prog3");
        try {
            CobolProgram.registerCallAlias("prog3", "RunFundamental029ContainedProgramVisibility3_Prog3");
            CobolProgram.registerCallAlias("prog2", "RunFundamental029ContainedProgramVisibility3_Prog2");
            CobolProgram.registerCallAlias("prog3", "RunFundamental029ContainedProgramVisibility3_Prog3");
            CobolProgram.registerCallAlias("prog", "RunFundamental029ContainedProgramVisibility3");
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
        new RunFundamental029ContainedProgramVisibility3_Prog3().run();
    }
}
