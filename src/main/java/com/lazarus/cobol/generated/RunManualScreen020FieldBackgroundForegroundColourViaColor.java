package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen020FieldBackgroundForegroundColourViaColor extends CobolProgram {
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
    private short cblack = (short) 0;
    private short cblue = (short) 0;
    private short cgreen = (short) 0;
    private short ccyan = (short) 0;
    private short cred = (short) 0;
    private short cmagenta = (short) 0;
    private short cyellow = (short) 0;
    private short cwhite = (short) 0;
    private short lin = (short) 0;
    private CobolString scr1 = new CobolString(80);
    private CobolString scr2 = new CobolString(80);
    private CobolString scr3 = new CobolString(80);
    private CobolString scr8 = new CobolString(80);
    private CobolString scr9 = new CobolString(80);
    private CobolString scrblack = new CobolString(8);
    private CobolString scrblue = new CobolString(8);
    private CobolString scrgreen = new CobolString(8);
    private CobolString scrcyan = new CobolString(8);
    private CobolString scrred = new CobolString(8);
    private CobolString scrmaggy = new CobolString(8);
    private CobolString scryell = new CobolString(14);
    private CobolString scrwhite = new CobolString(8);


    private CobolString at = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString success = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString col = new CobolString(256); // fallback
    private CobolString color = new CobolString(256); // fallback

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
    private CobolString _filler_031 = new CobolString(256); // fallback
    private CobolString _filler_032 = new CobolString(256); // fallback
    private CobolString _filler_033 = new CobolString(256); // fallback
    private CobolString _filler_034 = new CobolString(256); // fallback
    private CobolString _filler_035 = new CobolString(256); // fallback
    private CobolString _filler_036 = new CobolString(256); // fallback
    private CobolString _filler_037 = new CobolString(256); // fallback
    private CobolString _filler_038 = new CobolString(256); // fallback
    private CobolString _filler_039 = new CobolString(256); // fallback
    private CobolString _filler_040 = new CobolString(256); // fallback
    private CobolString _filler_041 = new CobolString(256); // fallback
    private CobolString _filler_042 = new CobolString(256); // fallback
    private CobolString _filler_043 = new CobolString(256); // fallback
    private CobolString _filler_044 = new CobolString(256); // fallback
    private CobolString _filler_045 = new CobolString(256); // fallback
    private CobolString _filler_046 = new CobolString(256); // fallback
    private CobolString _filler_047 = new CobolString(256); // fallback
    private void testme() {
        cblack = new BigDecimal(String.valueOf(cblack + 256).trim()).shortValue();
        CobolDisplay.display(String.valueOf(scr1) + String.valueOf(at) + String.valueOf(102));
        CobolDisplay.display(String.valueOf(scr2) + String.valueOf(at) + String.valueOf(202));
        CobolDisplay.display(String.valueOf(scr3) + String.valueOf(at) + String.valueOf(303));
        lin = new BigDecimal(String.valueOf(5).trim()).shortValue();
        dspcol();
        cblack = new BigDecimal(String.valueOf(cblack + 1024).trim()).shortValue();
        _filler_003.set(new BigDecimal(String.valueOf(_filler_003).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue + 1024).trim()).shortValue();
        _filler_004.set(new BigDecimal(String.valueOf(_filler_004).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen + 1024).trim()).shortValue();
        _filler_005.set(new BigDecimal(String.valueOf(_filler_005).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan + 1024).trim()).shortValue();
        _filler_006.set(new BigDecimal(String.valueOf(_filler_006).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred + 1024).trim()).shortValue();
        _filler_007.set(new BigDecimal(String.valueOf(_filler_007).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta + 1024).trim()).shortValue();
        _filler_008.set(new BigDecimal(String.valueOf(_filler_008).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow + 1024).trim()).shortValue();
        _filler_009.set(new BigDecimal(String.valueOf(_filler_009).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite + 1024).trim()).shortValue();
        lin = new BigDecimal(String.valueOf(6).trim()).shortValue();
        dspcol();
        cblack = new BigDecimal(String.valueOf(cblack - 1024).trim()).shortValue();
        _filler_010.set(new BigDecimal(String.valueOf(_filler_010).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue - 1024).trim()).shortValue();
        _filler_011.set(new BigDecimal(String.valueOf(_filler_011).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen - 1024).trim()).shortValue();
        _filler_012.set(new BigDecimal(String.valueOf(_filler_012).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan - 1024).trim()).shortValue();
        _filler_013.set(new BigDecimal(String.valueOf(_filler_013).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred - 1024).trim()).shortValue();
        _filler_014.set(new BigDecimal(String.valueOf(_filler_014).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta - 1024).trim()).shortValue();
        _filler_015.set(new BigDecimal(String.valueOf(_filler_015).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow - 1024).trim()).shortValue();
        _filler_016.set(new BigDecimal(String.valueOf(_filler_016).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite - 1024).trim()).shortValue();
        _filler_017.set(new BigDecimal(String.valueOf(_filler_017).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        CobolDisplay.display(String.valueOf(scr8) + String.valueOf(at) + String.valueOf(802));
        CobolDisplay.display(String.valueOf(scr9) + String.valueOf(at) + String.valueOf(903));
        cblack = new BigDecimal(String.valueOf(cblack + 4096).trim()).shortValue();
        _filler_018.set(new BigDecimal(String.valueOf(_filler_018).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue + 4096).trim()).shortValue();
        _filler_019.set(new BigDecimal(String.valueOf(_filler_019).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen + 4096).trim()).shortValue();
        _filler_020.set(new BigDecimal(String.valueOf(_filler_020).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan + 4096).trim()).shortValue();
        _filler_021.set(new BigDecimal(String.valueOf(_filler_021).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred + 4096).trim()).shortValue();
        _filler_022.set(new BigDecimal(String.valueOf(_filler_022).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta + 4096).trim()).shortValue();
        _filler_023.set(new BigDecimal(String.valueOf(_filler_023).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow + 4096).trim()).shortValue();
        _filler_024.set(new BigDecimal(String.valueOf(_filler_024).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite + 4096).trim()).shortValue();
        lin = new BigDecimal(String.valueOf(11).trim()).shortValue();
        dspcol();
        cblack = new BigDecimal(String.valueOf(cblack - 4096).trim()).shortValue();
        _filler_025.set(new BigDecimal(String.valueOf(_filler_025).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue - 4096).trim()).shortValue();
        _filler_026.set(new BigDecimal(String.valueOf(_filler_026).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen - 4096).trim()).shortValue();
        _filler_027.set(new BigDecimal(String.valueOf(_filler_027).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan - 4096).trim()).shortValue();
        _filler_028.set(new BigDecimal(String.valueOf(_filler_028).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred - 4096).trim()).shortValue();
        _filler_029.set(new BigDecimal(String.valueOf(_filler_029).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta - 4096).trim()).shortValue();
        _filler_030.set(new BigDecimal(String.valueOf(_filler_030).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow - 4096).trim()).shortValue();
        _filler_031.set(new BigDecimal(String.valueOf(_filler_031).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite - 4096).trim()).shortValue();
        cblack = new BigDecimal(String.valueOf(cblack + 1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim()).shortValue();
        _filler_033.set(new BigDecimal(String.valueOf(_filler_033).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue + 1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim()).shortValue();
        _filler_034.set(new BigDecimal(String.valueOf(_filler_034).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen + 1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim()).shortValue();
        _filler_035.set(new BigDecimal(String.valueOf(_filler_035).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan + 1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim()).shortValue();
        _filler_036.set(new BigDecimal(String.valueOf(_filler_036).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred + 1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim()).shortValue();
        _filler_037.set(new BigDecimal(String.valueOf(_filler_037).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta + 1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim()).shortValue();
        _filler_038.set(new BigDecimal(String.valueOf(_filler_038).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow + 1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim()).shortValue();
        _filler_039.set(new BigDecimal(String.valueOf(_filler_039).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite + 1024 + Integer.parseInt(String.valueOf(_filler_032).trim()) + 16384).trim()).shortValue();
        lin = new BigDecimal(String.valueOf(12).trim()).shortValue();
        dspcol();
        /* RAW: *  */
        success_flag.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: AT 1401 UPDATE REQUIRED */
        if ((!String.valueOf(success).trim().isEmpty() && cob_crt_status == 0)) {
            return;
        } else {
            return;
        }
    }

    private void dspcol() {
        CobolDisplay.display(String.valueOf(scrblack) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(1) + String.valueOf(_filler_040) + String.valueOf(color) + String.valueOf(cblack));
        CobolDisplay.display(String.valueOf(scrblue) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(11) + String.valueOf(_filler_041) + String.valueOf(color) + String.valueOf(cblue));
        CobolDisplay.display(String.valueOf(scrgreen) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(21) + String.valueOf(_filler_042) + String.valueOf(color) + String.valueOf(cgreen));
        CobolDisplay.display(String.valueOf(scrcyan) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(31) + String.valueOf(_filler_043) + String.valueOf(color) + String.valueOf(ccyan));
        CobolDisplay.display(String.valueOf(scrred) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(41) + String.valueOf(_filler_044) + String.valueOf(color) + String.valueOf(cred));
        CobolDisplay.display(String.valueOf(scrmaggy) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(51) + String.valueOf(_filler_045) + String.valueOf(color) + String.valueOf(cmagenta));
        CobolDisplay.display(String.valueOf(scryell) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(61) + String.valueOf(_filler_046) + String.valueOf(color) + String.valueOf(cyellow));
        CobolDisplay.display(String.valueOf(scrwhite) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(77) + String.valueOf(_filler_047) + String.valueOf(color) + String.valueOf(cwhite));
    }

    @Override
    public void run() {
        testme();
    }

    public static void main(String[] args) {
        new RunManualScreen020FieldBackgroundForegroundColourViaColor().run();
    }
}
