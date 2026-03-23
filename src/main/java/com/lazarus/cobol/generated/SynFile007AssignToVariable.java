package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile007AssignToVariable extends CobolProgram {
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
    // WORKING-STORAGE SECTION
    private CobolString var_1 = new CobolString(255);
    private CobolString var_2 = new CobolString(255);
    private CobolString var_3 = new CobolString(255);
    private CobolString var_4 = new CobolString(255);
    private CobolString var_5 = new CobolString(255);
    private CobolString var_6 = new CobolString(255);

    // FILE SECTION — test-file-1
    private CobolString test_rec_1 = new CobolString(4);

    // FILE SECTION — test-file-2
    private CobolString test_rec_2 = new CobolString(4);

    // FILE SECTION — test-file-3
    private CobolString test_rec_3 = new CobolString(4);

    // FILE SECTION — test-file-4
    private CobolString test_rec_4 = new CobolString(4);

    // FILE SECTION — test-file-5
    private CobolString test_rec_5 = new CobolString(4);

    // FILE SECTION — test-file-6
    private CobolString test_rec_6 = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile test_file_1 = new CobolFile("var-1", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_file_2 = new CobolFile("USING", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_file_3 = new CobolFile("VARYING", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_file_4 = new CobolFile("USING", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_file_5 = new CobolFile("DISK", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile test_file_6 = new CobolFile("FROM", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        test_file_1.open("INPUT");
        test_file_1.close();
        test_file_2.open("INPUT");
        test_file_2.close();
        test_file_3.open("INPUT");
        test_file_3.close();
        test_file_4.open("INPUT");
        test_file_4.close();
        test_file_5.open("INPUT");
        test_file_5.close();
        test_file_6.open("INPUT");
    }

    private void test_file_6() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile007AssignToVariable().run();
    }
}
