package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile104ScopeOfFdGlobalInNestedPrograms extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "NESTED-FILES";
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
        CobolProgram.callNested("NESTED-PROGRAM-1");
        CobolProgram.callNested("NESTED-PROGRAM-2");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("NESTED-FILES", "", "NESTED-FILES.cob");
        CobolProgram.pushActive("NESTED-FILES");
        try {
            CobolProgram.registerCallAlias("NESTED-FILES", "RunFile104ScopeOfFdGlobalInNestedPrograms");
            CobolProgram.registerCallAlias("nested-program-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1");
            CobolProgram.registerCallAlias("nested-program-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram2");
            CobolProgram.registerCallAlias("nested-files", "RunFile104ScopeOfFdGlobalInNestedPrograms");
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
        new RunFile104ScopeOfFdGlobalInNestedPrograms().run();
    }
}

class RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "NESTED-PROGRAM-1";
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
    private CobolString wsfs = new CobolString(2);
    // FILE SECTION — FILE-EXT
    static CobolString file_ext_rec = new CobolString(5);
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wsfs = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WSFS").build();
    // FILE DESCRIPTORS
    private CobolFile file_ext = new CobolFile("./TEST-FILE", "SEQUENTIAL", "SEQUENTIAL", "FILE-EXT");
    // SECTION: P01
    private void p01() {
        _exitSection = false;
        use_p01();
        if (_exitSection) return;
        p0101();
    }
    private void use_p01() {
        CobolIntrinsics.setCurrentLocation("NESTED-PROGRAM-1; _USE_P01 OF P01");
        /* USE AFTER ERROR PROCEDURE ON FILE-EXT */
    }
    private void p0101() {
        CobolIntrinsics.setCurrentLocation("NESTED-PROGRAM-1; P0101 OF P01");
        CobolDisplay.display("ERROR ON FILE-EXT");
    }
    // SECTION: P02
    private void p02() {
        _exitSection = false;
        use_p02();
        if (_exitSection) return;
        p0201();
    }
    private void use_p02() {
        CobolIntrinsics.setCurrentLocation("NESTED-PROGRAM-1; _USE_P02 OF P02");
        /* USE AFTER ERROR PROCEDURE ON OUTPUT */
    }
    private void p0201() {
        CobolIntrinsics.setCurrentLocation("NESTED-PROGRAM-1; P0201 OF P02");
        CobolDisplay.display("ERROR ON OUTPUT");
    }
    // SECTION: MAIN
    private void para_main() {
        _exitSection = false;
        use_main();
    }
    private void use_main() {
        CobolIntrinsics.setCurrentLocation("NESTED-PROGRAM-1; _USE_MAIN OF MAIN");
        file_ext.open("OUTPUT");
        wsfs.set(file_ext.getFileStatus());
        CobolProgram.callNested("NESTED-PROGRAM-1-1");
        file_ext.close();
        wsfs.set(file_ext.getFileStatus());
        CobolProgram.callNested("NESTED-PROGRAM-1-2");
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("NESTED-PROGRAM-1", "", "NESTED-PROGRAM-1.cob");
        CobolProgram.pushActive("NESTED-PROGRAM-1");
        try {
            CobolProgram.registerCallAlias("NESTED-PROGRAM-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1");
            CobolProgram.registerCallAlias("nested-program-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1");
            CobolProgram.registerCallAlias("nested-program-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram2");
            CobolProgram.registerCallAlias("nested-files", "RunFile104ScopeOfFdGlobalInNestedPrograms");
            CobolProgram.registerCallAlias("nested-program-1-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram11");
            CobolProgram.registerCallAlias("nested-program-1-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram12");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            if (file_ext != null && wsfs != null) file_ext.setStatusField(wsfs);
            // Register own GLOBAL fields for dynamic inherited-GLOBAL resolution
            CobolProgram.registerGlobalField("NESTED-PROGRAM-1", "FILE_EXT_REC", file_ext_rec);
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
        new RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1().run();
    }
}

class RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram11 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "NESTED-PROGRAM-1-1";
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
    private CobolString file_ext_rec = RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1.file_ext_rec; // GLOBAL from RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1
    private void nested_program() {
        /* WRITE FILE-EXT-REC — no file mapping */ // file_ext_rec.write("Hello");
        CobolDisplay.display("1-1 TRIED TO WRITE");
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("NESTED-PROGRAM-1-1", "", "NESTED-PROGRAM-1-1.cob");
        CobolProgram.pushActive("NESTED-PROGRAM-1-1");
        try {
            CobolProgram.registerCallAlias("NESTED-PROGRAM-1-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram11");
            CobolProgram.registerCallAlias("nested-program-1-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram11");
            CobolProgram.registerCallAlias("nested-program-1-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram12");
            CobolProgram.registerCallAlias("nested-program-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1");
            CobolProgram.registerCallAlias("nested-program-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram2");
            CobolProgram.registerCallAlias("nested-files", "RunFile104ScopeOfFdGlobalInNestedPrograms");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Dynamically resolve inherited GLOBAL fields from the active call stack
            file_ext_rec = CobolProgram.resolveInheritedGlobal("FILE_EXT_REC", RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1.file_ext_rec);
            nested_program();
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
        new RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram11().run();
    }
}

class RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram12 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "NESTED-PROGRAM-1-2";
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
    private CobolString file_ext_rec = RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1.file_ext_rec; // GLOBAL from RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1
    private void nested_program() {
        /* WRITE FILE-EXT-REC — no file mapping */ // file_ext_rec.write("Hello");
        CobolDisplay.display("1-2 TRIED TO WRITE");
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("NESTED-PROGRAM-1-2", "", "NESTED-PROGRAM-1-2.cob");
        CobolProgram.pushActive("NESTED-PROGRAM-1-2");
        try {
            CobolProgram.registerCallAlias("NESTED-PROGRAM-1-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram12");
            CobolProgram.registerCallAlias("nested-program-1-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram11");
            CobolProgram.registerCallAlias("nested-program-1-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram12");
            CobolProgram.registerCallAlias("nested-program-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1");
            CobolProgram.registerCallAlias("nested-program-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram2");
            CobolProgram.registerCallAlias("nested-files", "RunFile104ScopeOfFdGlobalInNestedPrograms");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Dynamically resolve inherited GLOBAL fields from the active call stack
            file_ext_rec = CobolProgram.resolveInheritedGlobal("FILE_EXT_REC", RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1.file_ext_rec);
            nested_program();
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
        new RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1_NestedProgram12().run();
    }
}

class RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram2 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "NESTED-PROGRAM-2";
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
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("NESTED-PROGRAM-2", "", "NESTED-PROGRAM-2.cob");
        CobolProgram.pushActive("NESTED-PROGRAM-2");
        try {
            CobolProgram.registerCallAlias("NESTED-PROGRAM-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram2");
            CobolProgram.registerCallAlias("nested-program-1", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram1");
            CobolProgram.registerCallAlias("nested-program-2", "RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram2");
            CobolProgram.registerCallAlias("nested-files", "RunFile104ScopeOfFdGlobalInNestedPrograms");
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
        new RunFile104ScopeOfFdGlobalInNestedPrograms_NestedProgram2().run();
    }
}
