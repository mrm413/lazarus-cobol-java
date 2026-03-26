package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen021FieldBackgroundForegroundColourViaControl extends CobolProgram {
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
    private CobolString success_flag = new CobolString(1);
    private CobolString cblack = new CobolString(99);
    private CobolString cblue = new CobolString(99);
    private CobolString cgreen = new CobolString(99);
    private CobolString ccyan = new CobolString(99);
    private CobolString cred = new CobolString(99);
    private CobolString cmagenta = new CobolString(99);
    private CobolString cyellow = new CobolString(99);
    private CobolString cwhite = new CobolString(99);
    private short lin = (short) 0;
    private CobolString scr1 = new CobolString(75);
    private CobolString scr2 = new CobolString(75);
    private CobolString scr3 = new CobolString(75);
    private CobolString scr8 = new CobolString(75);
    private CobolString scr9 = new CobolString(75);
    private CobolString scrblack = new CobolString(8);
    private CobolString scrblue = new CobolString(8);
    private CobolString scrgreen = new CobolString(8);
    private CobolString scrcyan = new CobolString(8);
    private CobolString scrred = new CobolString(8);
    private CobolString scrmaggy = new CobolString(8);
    private CobolString scryell = new CobolString(14);
    private CobolString scrwhite = new CobolString(8);


    private CobolString at = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString col = new CobolString(256); // fallback
    private CobolString control = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString success = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
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
    private CobolString _filler_015 = new CobolString(256); // fallback
    private CobolString _filler_016 = new CobolString(256); // fallback
    private CobolString _filler_017 = new CobolString(256); // fallback
    private CobolString _filler_018 = new CobolString(256); // fallback
    private CobolString _filler_019 = new CobolString(256); // fallback
    private CobolString _filler_020 = new CobolString(256); // fallback
    private CobolString _filler_021 = new CobolString(256); // fallback
    private CobolString _filler_022 = new CobolString(256); // fallback
    private CobolString _filler_023 = new CobolString(256); // fallback
    private CobolString _filler_024 = new CobolString(256); // fallback
    private CobolString _filler_025 = new CobolString(256); // fallback
    private CobolString _filler_026 = new CobolString(256); // fallback
    private CobolString _filler_027 = new CobolString(256); // fallback
    private CobolString _filler_028 = new CobolString(256); // fallback
    private CobolString _filler_029 = new CobolString(256); // fallback
    private CobolString _filler_030 = new CobolString(256); // fallback
    private void testme() {
        lin = new BigDecimal(String.valueOf(2).trim()).shortValue();
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr1, 1, 1)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(2) + String.valueOf(control) + "LEFTLINE OVERLINE");
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr1, 2)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf((2 + 1)) + String.valueOf(control) + "OVERLINE");
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr1, 75)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf((2 + 75)) + String.valueOf(control) + "OVERLINE  RIGHTLINE");
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr2, 1, 1)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(2) + String.valueOf(control) + "LEFTLINE");
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr2, 2)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf((2 + 1)));
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr2, 75)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf((2 + 75)) + String.valueOf(control) + "RIGHTLINE");
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr3, 1, 1)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(2) + String.valueOf(control) + "LEFTLINE UNDERLINE");
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr3, 2)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf((2 + 1)) + String.valueOf(control) + "UNDERLINE");
        CobolDisplay.display(String.valueOf(CobolString.refMod(scr3, 75)) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf((2 + 75)) + String.valueOf(control) + "UNDERLINE  RIGHTLINE");
        lin = new BigDecimal(String.valueOf(lin + 2).trim()).shortValue();
        dspcol();
        cblack.setRefMod(40, String.valueOf("REVERSE,"));
        _filler_002.set(String.valueOf("REVERSE,"));
        cblue.setRefMod(40, String.valueOf("REVERSE,"));
        _filler_003.set(String.valueOf("REVERSE,"));
        cgreen.setRefMod(40, String.valueOf("REVERSE,"));
        _filler_004.set(String.valueOf("REVERSE,"));
        ccyan.setRefMod(40, String.valueOf("REVERSE,"));
        _filler_005.set(String.valueOf("REVERSE,"));
        cred.setRefMod(40, String.valueOf("REVERSE,"));
        _filler_006.set(String.valueOf("REVERSE,"));
        cmagenta.setRefMod(40, String.valueOf("REVERSE,"));
        _filler_007.set(String.valueOf("REVERSE,"));
        cyellow.setRefMod(40, String.valueOf("REVERSE,"));
        _filler_008.set(String.valueOf("REVERSE,"));
        cwhite.setRefMod(40, String.valueOf("REVERSE,"));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        dspcol();
        /* INSPECT CRED — 2 clause(s) */
        lin = new BigDecimal(String.valueOf(lin + 2).trim()).shortValue();
        CobolDisplay.display(String.valueOf(scr8) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(2));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display(String.valueOf(scr9) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(2));
        cblack.setRefMod(50, String.valueOf("HIGHLIGHT,NO REVERSE"));
        _filler_009.set(String.valueOf("HIGHLIGHT,NO REVERSE"));
        cblue.setRefMod(50, String.valueOf("HIGHLIGHT,NO REVERSE"));
        _filler_010.set(String.valueOf("HIGHLIGHT,NO REVERSE"));
        cgreen.setRefMod(50, String.valueOf("HIGHLIGHT,NO REVERSE"));
        _filler_011.set(String.valueOf("HIGHLIGHT,NO REVERSE"));
        ccyan.setRefMod(50, String.valueOf("HIGHLIGHT,NO REVERSE"));
        _filler_012.set(String.valueOf("HIGHLIGHT,NO REVERSE"));
        cred.setRefMod(50, String.valueOf("HIGHLIGHT,NO REVERSE"));
        _filler_013.set(String.valueOf("HIGHLIGHT,NO REVERSE"));
        cmagenta.setRefMod(50, String.valueOf("HIGHLIGHT,NO REVERSE"));
        _filler_014.set(String.valueOf("HIGHLIGHT,NO REVERSE"));
        cyellow.setRefMod(50, String.valueOf("HIGHLIGHT,NO REVERSE"));
        _filler_015.set(String.valueOf("HIGHLIGHT,NO REVERSE"));
        cwhite.setRefMod(50, String.valueOf("HIGHLIGHT,NO REVERSE"));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        dspcol();
        cblack.setRefMod(60, String.valueOf("NO HIGH, BLINK"));
        _filler_016.set(String.valueOf("NO HIGH, BLINK"));
        cblue.setRefMod(60, String.valueOf("NO HIGH, BLINK"));
        _filler_017.set(String.valueOf("NO HIGH, BLINK"));
        cgreen.setRefMod(60, String.valueOf("NO HIGH, BLINK"));
        _filler_018.set(String.valueOf("NO HIGH, BLINK"));
        ccyan.setRefMod(60, String.valueOf("NO HIGH, BLINK"));
        _filler_019.set(String.valueOf("NO HIGH, BLINK"));
        cred.setRefMod(60, String.valueOf("NO HIGH, BLINK"));
        _filler_020.set(String.valueOf("NO HIGH, BLINK"));
        cmagenta.setRefMod(60, String.valueOf("NO HIGH, BLINK"));
        _filler_021.set(String.valueOf("NO HIGH, BLINK"));
        cyellow.setRefMod(60, String.valueOf("NO HIGH, BLINK"));
        _filler_022.set(String.valueOf("NO HIGH, BLINK"));
        cwhite.setRefMod(60, String.valueOf("NO HIGH, BLINK"));
        lin = new BigDecimal(String.valueOf(12).trim()).shortValue();
        dspcol();
        success_flag.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: AT 1801 UPDATE REQUIRED */
        if ((!String.valueOf(success).trim().isEmpty() && cob_crt_status == 0)) {
            return;
        } else {
            return;
        }
    }

    private void dspcol() {
        CobolDisplay.display(String.valueOf(scrblack) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(1) + String.valueOf(_filler_023) + String.valueOf(control) + String.valueOf(cblack));
        CobolDisplay.display(String.valueOf(scrblue) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(10) + String.valueOf(_filler_024) + String.valueOf(control) + String.valueOf(cblue));
        CobolDisplay.display(String.valueOf(scrgreen) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(19) + String.valueOf(_filler_025) + String.valueOf(control) + String.valueOf(cgreen));
        CobolDisplay.display(String.valueOf(scrcyan) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(28) + String.valueOf(_filler_026) + String.valueOf(control) + String.valueOf(ccyan));
        CobolDisplay.display(String.valueOf(scrred) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(37) + String.valueOf(_filler_027) + String.valueOf(control) + String.valueOf(cred));
        CobolDisplay.display(String.valueOf(scrmaggy) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(46) + String.valueOf(_filler_028) + String.valueOf(control) + String.valueOf(cmagenta));
        CobolDisplay.display(String.valueOf(scryell) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(55) + String.valueOf(_filler_029) + String.valueOf(control) + String.valueOf(cyellow));
        CobolDisplay.display(String.valueOf(scrwhite) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(70) + String.valueOf(_filler_030) + String.valueOf(control) + String.valueOf(cwhite));
    }

    @Override
    public void run() {
        testme();
    }

    public static void main(String[] args) {
        new RunManualScreen021FieldBackgroundForegroundColourViaControl().run();
    }
}
