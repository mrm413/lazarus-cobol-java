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


    private CobolString at = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString success = new CobolString(256);
    private CobolString line = new CobolString(256);
    private CobolString col = new CobolString(256);
    private CobolString color = new CobolString(256);

    private void testme() {
        cblack = new BigDecimal(String.valueOf(cblack + 256).trim()).shortValue();
        CobolDisplay.display(String.valueOf(scr1) + String.valueOf(at) + String.valueOf(102));
        CobolDisplay.display(String.valueOf(scr2) + String.valueOf(at) + String.valueOf(202));
        CobolDisplay.display(String.valueOf(scr3) + String.valueOf(at) + String.valueOf(303));
        lin = new BigDecimal(String.valueOf(5).trim()).shortValue();
        dspcol();
        cblack = new BigDecimal(String.valueOf(cblack + 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue + 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen + 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan + 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred + 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta + 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow + 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite + 1024).trim()).shortValue();
        lin = new BigDecimal(String.valueOf(6).trim()).shortValue();
        dspcol();
        cblack = new BigDecimal(String.valueOf(cblack - 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue - 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen - 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan - 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred - 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta - 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow - 1024).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(1024).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite - 1024).trim()).shortValue();
    // _unnamed.set(String.valueOf(_unnamed - 1024));
        CobolDisplay.display(String.valueOf(scr8) + String.valueOf(at) + String.valueOf(802));
        CobolDisplay.display(String.valueOf(scr9) + String.valueOf(at) + String.valueOf(903));
        cblack = new BigDecimal(String.valueOf(cblack + 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue + 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen + 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan + 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred + 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta + 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow + 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite + 4096).trim()).shortValue();
        lin = new BigDecimal(String.valueOf(11).trim()).shortValue();
        dspcol();
        cblack = new BigDecimal(String.valueOf(cblack - 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue - 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen - 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan - 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred - 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta - 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow - 4096).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).subtract(new BigDecimal(String.valueOf(4096).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite - 4096).trim()).shortValue();
        cblack = new BigDecimal(String.valueOf(cblack + 1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim())).toPlainString());
        cblue = new BigDecimal(String.valueOf(cblue + 1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim())).toPlainString());
        cgreen = new BigDecimal(String.valueOf(cgreen + 1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim())).toPlainString());
        ccyan = new BigDecimal(String.valueOf(ccyan + 1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim())).toPlainString());
        cred = new BigDecimal(String.valueOf(cred + 1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim())).toPlainString());
        cmagenta = new BigDecimal(String.valueOf(cmagenta + 1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim())).toPlainString());
        cyellow = new BigDecimal(String.valueOf(cyellow + 1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim()).shortValue();
        _unnamed.set(new BigDecimal(String.valueOf(_unnamed).trim()).add(new BigDecimal(String.valueOf(1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim())).toPlainString());
        cwhite = new BigDecimal(String.valueOf(cwhite + 1024 + Integer.parseInt(String.valueOf(_unnamed).trim()) + 16384).trim()).shortValue();
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
        CobolDisplay.display(String.valueOf(scrblack) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(1) + String.valueOf(_unnamed) + String.valueOf(color));
    }

    private void cblack() {
        CobolDisplay.display(String.valueOf(scrblue) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(11) + String.valueOf(_unnamed) + String.valueOf(color));
    }

    private void cblue() {
        CobolDisplay.display(String.valueOf(scrgreen) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(21) + String.valueOf(_unnamed) + String.valueOf(color));
    }

    private void cgreen() {
        CobolDisplay.display(String.valueOf(scrcyan) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(31) + String.valueOf(_unnamed) + String.valueOf(color));
    }

    private void ccyan() {
        CobolDisplay.display(String.valueOf(scrred) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(41) + String.valueOf(_unnamed) + String.valueOf(color));
    }

    private void cred() {
        CobolDisplay.display(String.valueOf(scrmaggy) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(51) + String.valueOf(_unnamed) + String.valueOf(color));
    }

    private void cmagenta() {
        CobolDisplay.display(String.valueOf(scryell) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(61) + String.valueOf(_unnamed) + String.valueOf(color));
    }

    private void cyellow() {
        CobolDisplay.display(String.valueOf(scrwhite) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(77) + String.valueOf(_unnamed) + String.valueOf(color));
    }

    private void cwhite() {
    }

    @Override
    public void run() {
        testme();
    }

    public static void main(String[] args) {
        new RunManualScreen020FieldBackgroundForegroundColourViaColor().run();
    }
}
