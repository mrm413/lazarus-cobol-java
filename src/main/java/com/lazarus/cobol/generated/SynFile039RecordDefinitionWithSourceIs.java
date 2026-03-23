package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile039RecordDefinitionWithSourceIs extends CobolProgram {
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
    private CobolString testkey_p1 = new CobolString(4);
    private int testkey_p2 = 0;
    private CobolString testdata = new CobolString(4);
    private CobolString testkey_p3 = new CobolString(4);

    // FILE SECTION — TEST-FILE2
    private CobolString test_rec2 = new CobolString(1); // Group: TEST-REC2


    // FILE DESCRIPTORS
    private CobolFile test_file1 = new CobolFile("TESTFILE", "INDEXED", "DYNAMIC");
    private CobolFile test_file2 = new CobolFile("TESTFILE", "INDEXED", "DYNAMIC");


    private void para_main() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile039RecordDefinitionWithSourceIs().run();
    }
}
