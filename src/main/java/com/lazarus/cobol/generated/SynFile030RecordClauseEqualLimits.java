package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile030RecordClauseEqualLimits extends CobolProgram {
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
    // FILE SECTION — f1
    private CobolString f1_rec_1 = new CobolString(1);
    private int f1_rec_2 = 0;

    // FILE SECTION — f2
    private CobolString f2_rec = new CobolString(1);

    // FILE SECTION — f3
    private CobolString f3_rec = new CobolString(1);

    // FILE SECTION — f4
    private CobolString f4_rec_1 = new CobolString(1);
    private int f4_rec_2 = 0;


    // FILE DESCRIPTORS
    private CobolFile f1 = new CobolFile("f1", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile f2 = new CobolFile("f2", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile f3 = new CobolFile("f3", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile f4 = new CobolFile("f4", "SEQUENTIAL", "SEQUENTIAL");


    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new SynFile030RecordClauseEqualLimits().run();
    }
}
