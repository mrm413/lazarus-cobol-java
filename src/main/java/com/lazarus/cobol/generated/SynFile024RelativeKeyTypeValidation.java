package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile024RelativeKeyTypeValidation extends CobolProgram {
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
    private CobolString file1_key = new CobolString(4);
    private CobolString file2_key = new CobolString(1); // Group: FILE2-KEY
    private int f2_key = 0;
    private CobolString f3_key = new CobolString(1); // Group: F3-KEY
    private int[] file3_key = new int[2];
    private int file5_key = 0;

    // FILE SECTION — FILE1
    private CobolString file1_rec = new CobolString(1);

    // FILE SECTION — FILE2
    private CobolString file2_rec = new CobolString(1);

    // FILE SECTION — FILE3
    private CobolString file3_rec = new CobolString(1);

    // FILE SECTION — FILE4
    private CobolString file4_rec = new CobolString(1); // Group: FILE4-REC
    private CobolString fld1 = new CobolString(1);
    private int file4_key = 0;

    // FILE SECTION — FILE5
    private CobolString file5_rec = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("ORGANIZATION", "RELATIVE", "RANDOM");
    private CobolFile file2 = new CobolFile("ORGANIZATION", "RELATIVE", "RANDOM");
    private CobolFile file3 = new CobolFile("ORGANIZATION", "RELATIVE", "RANDOM");
    private CobolFile file4 = new CobolFile("ORGANIZATION", "RELATIVE", "RANDOM");
    private CobolFile file5 = new CobolFile("ORGANIZATION", "RELATIVE", "RANDOM");


    private void para_main() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile024RelativeKeyTypeValidation().run();
    }
}
