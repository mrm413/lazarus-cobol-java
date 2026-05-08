package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile042SelectOpenSyntaxExtensions extends CobolProgram {
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
    // FILE SECTION — TEST-FILE1
    private CobolString test_rec1 = new CobolString(12); // Group: TEST-REC1
    private CobolString testkey_1p1 = new CobolString(4);
    private int testkey_1p2 = 0;
    private CobolString encryption = new CobolString(4);

    // FILE SECTION — TEST-FILE2
    private CobolString test_rec2 = new CobolString(12); // Group: TEST-REC2
    private CobolString testkey_2p1 = new CobolString(4);
    private CobolString allowing = new CobolString(4);
    private int testkey_2p2 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile test_file1 = new CobolFile("TESTFILE1", "INDEXED", "DYNAMIC", "TEST-FILE1");
    {
        test_file1.registerIndexedPrimaryKey("TESTKEY-1P1", 0, 4);
        test_file1.registerIndexedAltKey("TESTKEY-1P2", 4, 4, false);
    }
    private CobolFile test_file2 = new CobolFile("TESTFILE2", "INDEXED", "DYNAMIC", "TEST-FILE2");
    {
        test_file2.registerIndexedPrimaryKey("TESTKEY-2P1", 0, 4);
        test_file2.registerIndexedAltKey("TESTKEY-2P2", 8, 4, true);
    }

    // FALLBACK FILE DESCRIPTORS
    private CobolFile updaters = new CobolFile("UPDATERS", "SEQUENTIAL", "SEQUENTIAL", "UPDATERS");
    private CobolFile readers = new CobolFile("READERS", "SEQUENTIAL", "SEQUENTIAL", "READERS");
    private CobolFile writers = new CobolFile("WRITERS", "SEQUENTIAL", "SEQUENTIAL", "WRITERS");
    private CobolFile all = new CobolFile("ALL", "SEQUENTIAL", "SEQUENTIAL", "ALL");
    private CobolFile no = new CobolFile("NO", "SEQUENTIAL", "SEQUENTIAL", "NO");
    private CobolFile others = new CobolFile("OTHERS", "SEQUENTIAL", "SEQUENTIAL", "OTHERS");
    private CobolFile cb_for = new CobolFile("FOR", "SEQUENTIAL", "SEQUENTIAL", "FOR");
    private CobolFile lock = new CobolFile("LOCK", "SEQUENTIAL", "SEQUENTIAL", "LOCK");
    private CobolFile bulk_addition = new CobolFile("BULK-ADDITION", "SEQUENTIAL", "SEQUENTIAL", "BULK-ADDITION");
    private CobolFile mass_update = new CobolFile("MASS-UPDATE", "SEQUENTIAL", "SEQUENTIAL", "MASS-UPDATE");


    private void para_main() {
        test_file2.open("INPUT");
        test_file2.close();
        test_file1.open("I-O");
        test_file2.open("I-O");
        /* OPEN ALLOWING — skipped, not a file */
        updaters.open("I-O");
        test_file1.close();
        test_file1.open("I-O");
        /* OPEN ALLOWING — skipped, not a file */
        updaters.open("I-O");
        test_file1.close();
        test_file1.close();
        test_file1.open("I-O");
        /* OPEN ALLOWING — skipped, not a file */
        readers.open("I-O");
        test_file1.close();
        test_file1.close();
        test_file1.open("I-O");
        /* OPEN ALLOWING — skipped, not a file */
        writers.open("I-O");
        test_file1.close();
        test_file1.close();
        test_file1.open("I-O");
        /* OPEN ALLOWING — skipped, not a file */
        all.open("I-O");
        test_file1.close();
        test_file1.close();
        test_file1.open("I-O");
        /* OPEN ALLOWING — skipped, not a file */
        no.open("I-O");
        test_file1.close();
        test_file1.open("I-O");
        /* OPEN ALLOWING — skipped, not a file */
        no.open("I-O");
        others.open("I-O");
        test_file1.close();
        test_file1.open("I-O");
        cb_for.open("I-O");
        lock.open("I-O");
        test_file1.close();
        test_file1.open("I-O");
        lock.open("I-O");
        test_file1.close();
        test_file1.open("I-O");
        bulk_addition.open("I-O");
        test_file1.close();
        test_file1.open("I-O");
        mass_update.open("I-O");
        test_file1.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynFile042SelectOpenSyntaxExtensions");
            CobolProgram.registerCallAlias("prog", "SynFile042SelectOpenSyntaxExtensions");
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
        new SynFile042SelectOpenSyntaxExtensions().run();
    }
}
