package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile015VariableRecordLengthDependingItem extends CobolProgram {
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
    private CobolString test_rec = new CobolString(1); // Group: TEST-REC

    // FILE SECTION — TEST-FIL2
    private CobolString test_rec2 = new CobolString(1); // Group: TEST-REC2
    private int recordsize3 = 0;
    private CobolString recordsize4 = new CobolString(4);

    // FILE SECTION — TEST-FIL3
    private CobolString test_rec3 = new CobolString(1); // Group: TEST-REC3

    // FILE SECTION — TEST-FIL4
    private CobolString test_rec4 = new CobolString(1); // Group: TEST-REC4


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("FILE-TEST", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_fil2 = new CobolFile("FILE-TEST-2", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_fil3 = new CobolFile("FILE-TEST-3", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_fil4 = new CobolFile("FILE-TEST-4", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
    }

    private void test_file() {
    }

    private void test_file_2() {
    }

    private void test_fil2() {
    }

    private void test_fil2_2() {
    }

    private void test_fil3() {
    }

    private void test_fil3_2() {
    }

    private void test_fil4() {
    }

    private void test_fil4_2() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile015VariableRecordLengthDependingItem().run();
    }
}
