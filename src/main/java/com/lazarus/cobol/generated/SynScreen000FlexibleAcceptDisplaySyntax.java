package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynScreen000FlexibleAcceptDisplaySyntax extends CobolProgram {
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
    private CobolString a_field = new CobolString(3);


    private CobolString col = new CobolString(256); // fallback
    private CobolString highlight = new CobolString(256); // fallback
    private CobolString at = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString underline = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString scr = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private CobolString _filler_010 = new CobolString(256); // fallback
    private void para_main() {
        CobolDisplay.displayNoAdvancing("123" + "456" + "789");
        CobolDisplay.display("foo" + String.valueOf(col) + String.valueOf(1) + String.valueOf(highlight) + String.valueOf(at) + String.valueOf(line) + String.valueOf(1) + String.valueOf(underline) + String.valueOf(_filler_002) + "bar" + String.valueOf(_filler_003) + "foo");
        CobolDisplay.display("a" + String.valueOf(_filler_004) + "b" + String.valueOf(line) + String.valueOf(3) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_filler_005) + "c");
        CobolDisplay.display(String.valueOf(scr) + String.valueOf(_filler_006) + String.valueOf(scr));
        a_field.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: LINE 5 SIZE 3 AT COL */
        CobolDisplay.displayNoAdvancing(String.valueOf(scr));
        CobolDisplay.display(String.valueOf(scr) + String.valueOf(_filler_007) + String.valueOf(scr) + String.valueOf(line) + String.valueOf(2) + String.valueOf(col) + String.valueOf(2));
        CobolDisplay.display("foo" + String.valueOf(line) + String.valueOf(2) + String.valueOf(col) + String.valueOf(2) + String.valueOf(_filler_008) + String.valueOf(scr));
        CobolDisplay.display("foo" + String.valueOf(line) + String.valueOf(2) + String.valueOf(col) + String.valueOf(2) + String.valueOf(_filler_009) + "bar");
        CobolDisplay.display("foo" + String.valueOf(line) + String.valueOf(1));
        CobolDisplay.display(String.valueOf(scr) + String.valueOf(_filler_010) + "foo");
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynScreen000FlexibleAcceptDisplaySyntax().run();
    }
}
