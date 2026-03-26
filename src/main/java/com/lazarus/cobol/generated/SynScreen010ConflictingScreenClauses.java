package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynScreen010ConflictingScreenClauses extends CobolProgram {
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
    private int x = 0;


    private CobolString highlight = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString lowlight = new CobolString(256); // fallback
    private CobolString erase = new CobolString(256); // fallback
    private CobolString eol = new CobolString(256); // fallback
    private CobolString eos = new CobolString(256); // fallback
    private CobolString blank = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString screen = new CobolString(256); // fallback
    private CobolString scroll = new CobolString(256); // fallback
    private CobolString up = new CobolString(256); // fallback
    private CobolString down = new CobolString(256); // fallback
    private CobolString scr = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString attribute = new CobolString(256); // fallback
    private CobolString on = new CobolString(256); // fallback
    private CobolString off = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private CobolString _filler_010 = new CobolString(256); // fallback
    private CobolString _filler_011 = new CobolString(256); // fallback
    private CobolString _filler_012 = new CobolString(256); // fallback
    private CobolString _filler_013 = new CobolString(256); // fallback
    private CobolString _filler_014 = new CobolString(256); // fallback
    private void para_main() {
        CobolDisplay.display("blah" + String.valueOf(highlight) + String.valueOf(_filler_003) + String.valueOf(lowlight) + String.valueOf(erase) + String.valueOf(eol) + String.valueOf(_filler_004) + String.valueOf(erase) + String.valueOf(eos) + String.valueOf(blank) + String.valueOf(line) + String.valueOf(_filler_005) + String.valueOf(blank) + String.valueOf(screen) + String.valueOf(scroll) + String.valueOf(up) + String.valueOf(_filler_006) + String.valueOf(scroll) + String.valueOf(down));
        x = new BigDecimal(String.valueOf(CobolDisplay.accept()).trim()).intValue();
        /* RAW: WITH AUTO , TAB SCROLL UP */
        scr.set(String.valueOf(_filler_007));
        attribute.set(String.valueOf(_filler_008));
        highlight.set(String.valueOf(_filler_009));
        on.set(String.valueOf(_filler_010));
        _filler_012.set(String.valueOf(_filler_011));
        lowlight.set(String.valueOf(_filler_013));
        off.set(String.valueOf(_filler_014));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynScreen010ConflictingScreenClauses().run();
    }
}
