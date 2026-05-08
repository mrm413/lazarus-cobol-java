package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental021GlobalConstant extends CobolProgram {
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
    static final String glob_path = "GLOBP1";
    static final String glob_path2 = "GLOBP2";
    static final String glob_var = "GLOBV1";
    static final String glob_var2 = "GLOBV2";

    // FILE SECTION — TEST-FILE
    static CobolString test_rec = new CobolString(4);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_glob_path2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("GLOB-PATH2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_glob_var2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("GLOB-VAR2").build();

    // FILE DESCRIPTORS
    static CobolFile test_file = new CobolFile("GLOB-PATH", "SEQUENTIAL", "SEQUENTIAL", "TEST-FILE");


    private void para_main() {
        CobolDisplay.display(String.valueOf(glob_path) + String.valueOf(glob_var));
        CobolProgram.callNested("prog2");
        CobolProgram.callNested("prog3");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental021GlobalConstant");
            CobolProgram.registerCallAlias("prog2", "RunFundamental021GlobalConstant_Prog2");
            CobolProgram.registerCallAlias("prog3", "RunFundamental021GlobalConstant_Prog3");
            CobolProgram.registerCallAlias("prog", "RunFundamental021GlobalConstant");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Register own GLOBAL fields for dynamic inherited-GLOBAL resolution
            CobolProgram.registerGlobalField("prog", "TEST_REC", test_rec);
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
        new RunFundamental021GlobalConstant().run();
    }
}

class RunFundamental021GlobalConstant_Prog2 extends CobolProgram {
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
    // FILE SECTION — TEST2-FILE
    private CobolString test2_rec = new CobolString(4);
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    // FILE DESCRIPTORS
    private CobolFile test2_file = new CobolFile("GLOB-PATH2", "SEQUENTIAL", "SEQUENTIAL", "TEST2-FILE");
    private static final String glob_path2 = RunFundamental021GlobalConstant.glob_path2; // GLOBAL from RunFundamental021GlobalConstant
    private static final String glob_var2 = RunFundamental021GlobalConstant.glob_var2; // GLOBAL from RunFundamental021GlobalConstant
    private void para_main() {
        CobolDisplay.display(String.valueOf(glob_path2) + String.valueOf(glob_var2));
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog2", "", "prog2.cob");
        CobolProgram.pushActive("prog2");
        try {
            CobolProgram.registerCallAlias("prog2", "RunFundamental021GlobalConstant_Prog2");
            CobolProgram.registerCallAlias("prog2", "RunFundamental021GlobalConstant_Prog2");
            CobolProgram.registerCallAlias("prog3", "RunFundamental021GlobalConstant_Prog3");
            CobolProgram.registerCallAlias("prog", "RunFundamental021GlobalConstant");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Register own GLOBAL fields for dynamic inherited-GLOBAL resolution
            CobolProgram.registerGlobalField("prog2", "TEST2_REC", test2_rec);
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
        new RunFundamental021GlobalConstant_Prog2().run();
    }
}

class RunFundamental021GlobalConstant_Prog3 extends CobolProgram {
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
    // FILE SECTION — TEST3-FILE
    private CobolString test3_rec = new CobolString(4);
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    // FILE DESCRIPTORS
    private CobolFile test3_file = new CobolFile("GLOB-PATH", "SEQUENTIAL", "SEQUENTIAL", "TEST3-FILE");
    private CobolString glob_path = new CobolString(256, "GLOB-PATH"); // fallback (implicit ASSIGN — initialized to name)
    private void para_main() {
        CobolDisplay.display("in prog3");
        if (!CobolString.cobolEquals(String.valueOf(glob_path), String.valueOf("                                                                                                                                                                                                                                                                "))) {
            CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(glob_path, "TRAILING")));
        }
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog3", "", "prog3.cob");
        CobolProgram.pushActive("prog3");
        try {
            CobolProgram.registerCallAlias("prog3", "RunFundamental021GlobalConstant_Prog3");
            CobolProgram.registerCallAlias("prog2", "RunFundamental021GlobalConstant_Prog2");
            CobolProgram.registerCallAlias("prog3", "RunFundamental021GlobalConstant_Prog3");
            CobolProgram.registerCallAlias("prog", "RunFundamental021GlobalConstant");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Register own GLOBAL fields for dynamic inherited-GLOBAL resolution
            CobolProgram.registerGlobalField("prog3", "TEST3_REC", test3_rec);
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
        new RunFundamental021GlobalConstant_Prog3().run();
    }
}
