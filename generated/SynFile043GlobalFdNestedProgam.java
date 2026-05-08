package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile043GlobalFdNestedProgam extends CobolProgram {
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
    // FILE SECTION — f
    static CobolString f_rec = new CobolString(1); // Group: f-rec
    private int f_key = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    static CobolFile f = new CobolFile("foo.dat", "INDEXED", "SEQUENTIAL", "F");
    {
        f.registerIndexedPrimaryKey("F-KEY", 0, 1);
    }


    private void para_main() {
        CobolProgram.callNested("output-statement");
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynFile043GlobalFdNestedProgam");
            CobolProgram.registerCallAlias("output-statement", "SynFile043GlobalFdNestedProgam_OutputStatement");
            CobolProgram.registerCallAlias("prog", "SynFile043GlobalFdNestedProgam");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Register own GLOBAL fields for dynamic inherited-GLOBAL resolution
            CobolProgram.registerGlobalField("prog", "F_REC", f_rec);
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
        new SynFile043GlobalFdNestedProgam().run();
    }
}

class SynFile043GlobalFdNestedProgam_OutputStatement extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "output-statement";
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
    private CobolString f_rec = SynFile043GlobalFdNestedProgam.f_rec; // GLOBAL from SynFile043GlobalFdNestedProgam
    private void para_main() {
        /* WRITE f-rec — no file mapping */ // f_rec.write();
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("output-statement", "", "output-statement.cob");
        CobolProgram.pushActive("output-statement");
        try {
            CobolProgram.registerCallAlias("output-statement", "SynFile043GlobalFdNestedProgam_OutputStatement");
            CobolProgram.registerCallAlias("output-statement", "SynFile043GlobalFdNestedProgam_OutputStatement");
            CobolProgram.registerCallAlias("prog", "SynFile043GlobalFdNestedProgam");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Dynamically resolve inherited GLOBAL fields from the active call stack
            f_rec = CobolProgram.resolveInheritedGlobal("F_REC", SynFile043GlobalFdNestedProgam.f_rec);
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
        new SynFile043GlobalFdNestedProgam_OutputStatement().run();
    }
}
