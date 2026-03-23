package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile006AssignToLsqDeviceName extends CobolProgram {
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
    // FILE SECTION — TST-FILE1
    private CobolString tst1_rec = new CobolString(4);

    // FILE SECTION — TST-FILE2
    private CobolString tst2_rec = new CobolString(4);

    // FILE SECTION — TST-FILE3
    private CobolString tst3_rec = new CobolString(4);

    // FILE SECTION — TST-FILE4
    private CobolString tst4_rec = new CobolString(4);

    // FILE SECTION — TST-FILE5
    private CobolString tst5_rec = new CobolString(4);

    // FILE SECTION — TST-FILE6
    private CobolString tst6_rec = new CobolString(4);

    // FILE SECTION — TST-FILE7
    private CobolString tst7_rec = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile tst_file1 = new CobolFile("CARD-PUNCH", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile tst_file2 = new CobolFile("CARD-READER", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile tst_file3 = new CobolFile("CASSETTE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile tst_file4 = new CobolFile("F4", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile tst_file5 = new CobolFile("INPUT-OUTPUT", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile tst_file6 = new CobolFile("MAGNETIC-TAPE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile tst_file7 = new CobolFile("F7", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
    }

    private void tst_file1() {
    }

    private void tst_file1_2() {
    }

    private void tst_file2() {
    }

    private void tst_file2_2() {
    }

    private void tst_file3() {
    }

    private void tst_file3_2() {
    }

    private void tst_file4() {
    }

    private void tst_file4_2() {
    }

    private void tst_file5() {
    }

    private void tst_file5_2() {
    }

    private void tst_file6() {
    }

    private void tst_file6_2() {
    }

    private void tst_file7() {
    }

    private void tst_file7_2() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile006AssignToLsqDeviceName().run();
    }
}
