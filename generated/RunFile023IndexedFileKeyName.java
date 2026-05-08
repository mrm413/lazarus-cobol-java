package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile023IndexedFileKeyName extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "test";
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
    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(91); // Group: TEST-REC
    private CobolString qqdata = new CobolString(80);
    private CobolString qqindex = new CobolString(7);
    private int qqsequence = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("FILE", "INDEXED", "DYNAMIC", "TEST-FILE");


    private void para_main() {
        test_file.open("OUTPUT");
        qqdata.set(String.valueOf("TEST DATA 1"));
        qqindex.set(String.valueOf("ABC0001"));
        test_rec.setRefMod(1, 80, String.valueOf(qqdata));
        test_rec.setRefMod(81, 7, String.valueOf(qqindex));
        test_rec.setRefMod(88, 4, CobolDisplay.formatPic(qqsequence, 4, 0, false));
        test_file.write(test_rec);
        qqdata.set(String.valueOf("TEST DATA 2"));
        qqindex.set(String.valueOf("ABC0002"));
        test_rec.setRefMod(1, 80, String.valueOf(qqdata));
        test_rec.setRefMod(81, 7, String.valueOf(qqindex));
        test_rec.setRefMod(88, 4, CobolDisplay.formatPic(qqsequence, 4, 0, false));
        test_file.write(test_rec);
        test_file.close();
        CobolDisplay.displayNoAdvancing("FINE");
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("test", "", "test.cob");
        CobolProgram.pushActive("test");
        try {
            CobolProgram.registerCallAlias("test", "RunFile023IndexedFileKeyName");
            CobolProgram.registerCallAlias("test", "RunFile023IndexedFileKeyName");
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
        new RunFile023IndexedFileKeyName().run();
    }
}
