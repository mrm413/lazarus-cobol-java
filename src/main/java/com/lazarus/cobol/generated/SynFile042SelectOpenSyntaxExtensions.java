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
    private int tally = 0;
    private int return_code = 0;
    private int sort_return = 0;
    private int number_of_call_parameters = 0;
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
    // FILE SECTION — TEST-FILE1
    private CobolString test_rec1 = new CobolString(1); // Group: TEST-REC1
    private CobolString testkey_1p1 = new CobolString(4);
    private int testkey_1p2 = 0;
    private CobolString encryption = new CobolString(4);

    // FILE SECTION — TEST-FILE2
    private CobolString test_rec2 = new CobolString(1); // Group: TEST-REC2
    private CobolString testkey_2p1 = new CobolString(4);
    private CobolString allowing = new CobolString(4);
    private int testkey_2p2 = 0;


    // FILE DESCRIPTORS
    private CobolFile test_file1 = new CobolFile("TESTFILE1", "INDEXED", "DYNAMIC");
    private CobolFile test_file2 = new CobolFile("TESTFILE2", "INDEXED", "DYNAMIC");

    // FALLBACK FILE DESCRIPTORS
    private CobolFile updaters = new CobolFile("UPDATERS", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile readers = new CobolFile("READERS", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile writers = new CobolFile("WRITERS", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile all = new CobolFile("ALL", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile no = new CobolFile("NO", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile others = new CobolFile("OTHERS", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile cb_for = new CobolFile("FOR", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile lock = new CobolFile("LOCK", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile bulk_addition = new CobolFile("BULK-ADDITION", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile mass_update = new CobolFile("MASS-UPDATE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile _filler_001 = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");


    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        // Method body requires runtime extensions
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile042SelectOpenSyntaxExtensions().run();
    }
}
