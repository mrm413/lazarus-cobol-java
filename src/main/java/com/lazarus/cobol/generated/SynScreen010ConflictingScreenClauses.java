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


    private CobolString highlight = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString lowlight = new CobolString(256);
    private CobolString erase = new CobolString(256);
    private CobolString eol = new CobolString(256);
    private CobolString eos = new CobolString(256);
    private CobolString blank = new CobolString(256);
    private CobolString line = new CobolString(256);
    private CobolString screen = new CobolString(256);
    private CobolString scroll = new CobolString(256);
    private CobolString up = new CobolString(256);
    private CobolString down = new CobolString(256);
    private CobolString scr = new CobolString(256);
    private CobolString off = new CobolString(256);
    private CobolString attribute = new CobolString(256);
    private CobolString on = new CobolString(256);

    private void para_main() {
        CobolDisplay.display("blah" + String.valueOf(highlight) + String.valueOf(_unnamed) + String.valueOf(lowlight) + String.valueOf(erase) + String.valueOf(eol) + String.valueOf(_unnamed) + String.valueOf(erase) + String.valueOf(eos) + String.valueOf(blank) + String.valueOf(line) + String.valueOf(_unnamed) + String.valueOf(blank) + String.valueOf(screen) + String.valueOf(scroll) + String.valueOf(up) + String.valueOf(_unnamed) + String.valueOf(scroll) + String.valueOf(down));
        x = new BigDecimal(String.valueOf(CobolDisplay.accept()).trim()).intValue();
        /* RAW: WITH AUTO , TAB SCROLL UP */
        scr.set(String.valueOf(off));
        attribute.set(String.valueOf(off));
        highlight.set(String.valueOf(off));
        on.set(String.valueOf(off));
        _unnamed.set(String.valueOf(off));
        lowlight.set(String.valueOf(off));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynScreen010ConflictingScreenClauses().run();
    }
}
