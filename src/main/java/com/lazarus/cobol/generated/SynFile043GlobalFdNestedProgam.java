package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile043GlobalFdNestedProgam extends CobolProgram {
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
    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1); // Group: f-rec
    private int f_key = 0;


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("foo.dat", "INDEXED", "SEQUENTIAL");


    private void para_main() {
        CobolProgram.call("output-statement");
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile043GlobalFdNestedProgam().run();
    }
}
