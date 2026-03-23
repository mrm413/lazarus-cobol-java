package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions042SortAssignKeyboardToAssignDisplay extends CobolProgram {
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
    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(80);

    // FILE SECTION — TEST-OUT
    private CobolString test_rec_out = new CobolString(80);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("ORGANIZATION", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_out = new CobolFile("ORGANIZATION", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile sort_file = new CobolFile("SORT-FILE", "SEQUENTIAL", "SEQUENTIAL");


    private void a00() {
        /* SORT SORT-FILE */
        /* RAW: ON ASCENDING SORT-REC USING TEST-FILE GIVING */
    }

    private void test_out() {
        System.exit(0);
    }

    @Override
    public void run() {
        a00();
    }

    public static void main(String[] args) {
        new RunExtensions042SortAssignKeyboardToAssignDisplay().run();
    }
}
