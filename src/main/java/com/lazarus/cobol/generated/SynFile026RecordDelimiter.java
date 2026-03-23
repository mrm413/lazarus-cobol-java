package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile026RecordDelimiter extends CobolProgram {
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
    // FILE SECTION — good-1
    private int good_1_rec = 0;
    private int good_1_rec_2 = 0;

    // FILE SECTION — good-2
    private int good_2_rec = 0;

    // FILE SECTION — good-3
    private int good_3_rec = 0;
    private int good_3_rec_2 = 0;

    // FILE SECTION — good-4
    private int good_4_rec = 0;

    // FILE SECTION — ok-i-guess-1
    private int ok_i_guess_1_rec = 0;
    private int ok_i_guess_1_rec_2 = 0;

    // FILE SECTION — ok-i-guess-2
    private int ok_i_guess_2_rec = 0;
    private int ok_i_guess_2_rec_2 = 0;

    // FILE SECTION — bad-1
    private int bad_1_rec = 0;

    // FILE SECTION — bad-2
    private int bad_2_rec = 0;

    // FILE SECTION — bad-3
    private int bad_3_rec = 0;

    // FILE SECTION — bad-4
    private int bad_4_rec = 0;

    // FILE SECTION — bad-5
    private int bad_5_rec = 0;


    // FILE DESCRIPTORS
    private CobolFile good_1 = new CobolFile("a", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile good_2 = new CobolFile("a", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile good_3 = new CobolFile("a", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile good_4 = new CobolFile("a", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile ok_i_guess_1 = new CobolFile("a", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile ok_i_guess_2 = new CobolFile("a", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile bad_1 = new CobolFile("a", "INDEXED", "SEQUENTIAL");
    private CobolFile bad_2 = new CobolFile("a", "INDEXED", "SEQUENTIAL");
    private CobolFile bad_3 = new CobolFile("a", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile bad_4 = new CobolFile("a", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile bad_5 = new CobolFile("a", "SEQUENTIAL", "SEQUENTIAL");


    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new SynFile026RecordDelimiter().run();
    }
}
