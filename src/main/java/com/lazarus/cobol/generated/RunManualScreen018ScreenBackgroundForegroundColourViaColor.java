package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen018ScreenBackgroundForegroundColourViaColor extends CobolProgram {
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
    private CobolString dummy = new CobolString(10);
    private CobolString success_flag = new CobolString(1);
    private int cblack = 0;
    private int cblue = 0;
    private int cgreen = 0;
    private int ccyan = 0;
    private int cred = 0;
    private int cmagenta = 0;
    private int cyellow = 0;
    private int cwhite = 0;


    private CobolString scr = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString scr2 = new CobolString(256); // fallback
    private CobolString success = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private void para_main() {
        cblack = new BigDecimal(String.valueOf(cblack + 256).trim()).intValue();
        CobolDisplay.display(String.valueOf(scr));
        cblack = new BigDecimal(String.valueOf(cblack + 1024).trim()).intValue();
        _filler_002.set(new BigDecimal(String.valueOf(_filler_002).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue + 1024).trim()).intValue();
        _filler_003.set(new BigDecimal(String.valueOf(_filler_003).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen + 1024).trim()).intValue();
        _filler_004.set(new BigDecimal(String.valueOf(_filler_004).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan + 1024).trim()).intValue();
        _filler_005.set(new BigDecimal(String.valueOf(_filler_005).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred + 1024).trim()).intValue();
        _filler_006.set(new BigDecimal(String.valueOf(_filler_006).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta + 1024).trim()).intValue();
        _filler_007.set(new BigDecimal(String.valueOf(_filler_007).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow + 1024).trim()).intValue();
        _filler_008.set(new BigDecimal(String.valueOf(_filler_008).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite + 1024).trim()).intValue();
        CobolDisplay.display(String.valueOf(scr2));
        scr.set(String.valueOf(CobolDisplay.accept()));
        if ((!String.valueOf(success).trim().isEmpty() && cob_crt_status == 0)) {
            return;
        } else {
            return;
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunManualScreen018ScreenBackgroundForegroundColourViaColor().run();
    }
}
