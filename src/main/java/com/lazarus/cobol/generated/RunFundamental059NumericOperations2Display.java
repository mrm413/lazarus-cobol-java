package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental059NumericOperations2Display extends CobolProgram {
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
    private BigDecimal field = BigDecimal.ZERO;
    private BigDecimal feld2 = BigDecimal.ZERO;
    private int feld3 = 0;
    private int feld4 = 0;
    private int filler_1 = 0;


    private CobolString on = new CobolString(256); // fallback
    private CobolString error = new CobolString(256); // fallback
    private CobolString no_disp = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString some = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: * Test with */
        CobolDisplay.display(String.valueOf(on) + String.valueOf(error));
        do_check();
        no_disp.set(String.valueOf((Integer.parseInt(String.valueOf(cb_true).trim()) * Integer.parseInt(String.valueOf(some).trim()))));
        /* RAW: performance checks on the way */
        for (int _i0 = 0; _i0 < 20000; _i0++) {
        }
        return;
    }

    private void do_check() {
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  1 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test  2 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test  3 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test  4 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test  5 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  6 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test  7 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test  8 " + String.valueOf(field));
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  9 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test 10 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 11 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test 12 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test 13 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test 14 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test 15 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 16 " + String.valueOf(feld2));
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim()).intValue();
        feld3 = new BigDecimal(String.valueOf(feld3 + 1).trim()).intValue();
        if (feld3 != 1.2) {
            CobolDisplay.display("Test 17 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim()).intValue();
        feld3 = new BigDecimal(String.valueOf(feld3 + -1).trim()).intValue();
        if (feld3 != 0.8) {
            CobolDisplay.display("Test 18 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim()).intValue();
        feld3 = new BigDecimal(String.valueOf(feld3 + 1).trim()).intValue();
        if (feld3 != 1.2) {
            CobolDisplay.display("Test 19 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim()).intValue();
        feld3 = new BigDecimal(String.valueOf(feld3 + -1).trim()).intValue();
        if (feld3 != 0.8) {
            CobolDisplay.display("Test 20 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim()).intValue();
        feld3 = new BigDecimal(String.valueOf(feld3 - 1).trim()).intValue();
        if (feld3 != 0.8) {
            CobolDisplay.display("Test 21 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim()).intValue();
        feld3 = new BigDecimal(String.valueOf(feld3 - -1).trim()).intValue();
        if (feld3 != 1.2) {
            CobolDisplay.display("Test 22 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim()).intValue();
        feld3 = new BigDecimal(String.valueOf(feld3 - 1).trim()).intValue();
        if (feld3 != 0.8) {
            CobolDisplay.display("Test 23 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim()).intValue();
        feld3 = new BigDecimal(String.valueOf(feld3 - -1).trim()).intValue();
        if (feld3 != 1.2) {
            CobolDisplay.display("Test 24 " + String.valueOf(feld3));
        }
        feld4 = new BigDecimal(String.valueOf(2).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + 1).trim()).intValue();
        if (feld4 != 3) {
            CobolDisplay.display("Test 25 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(2).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + -1).trim()).intValue();
        if (feld4 != 1) {
            CobolDisplay.display("Test 26 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + 1).trim()).intValue();
        if (feld4 != -1) {
            CobolDisplay.display("Test 27 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + -1).trim()).intValue();
        if (feld4 != -3) {
            CobolDisplay.display("Test 28 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(2).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - 1).trim()).intValue();
        if (feld4 != 1) {
            CobolDisplay.display("Test 29 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(2).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - -1).trim()).intValue();
        if (feld4 != 3) {
            CobolDisplay.display("Test 30 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - 1).trim()).intValue();
        if (feld4 != -3) {
            CobolDisplay.display("Test 31 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - -1).trim()).intValue();
        if (feld4 != -1) {
            CobolDisplay.display("Test 32 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(1).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + 2).trim()).intValue();
        if (feld4 != 3) {
            CobolDisplay.display("Test 33 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(1).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + -2).trim()).intValue();
        if (feld4 != -1) {
            CobolDisplay.display("Test 34 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + 2).trim()).intValue();
        if (feld4 != 1) {
            CobolDisplay.display("Test 35 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + -2).trim()).intValue();
        if (feld4 != -3) {
            CobolDisplay.display("Test 36 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(1).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - 2).trim()).intValue();
        if (feld4 != -1) {
            CobolDisplay.display("Test 37 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(1).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - -2).trim()).intValue();
        if (feld4 != 3) {
            CobolDisplay.display("Test 38 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - 2).trim()).intValue();
        if (feld4 != -3) {
            CobolDisplay.display("Test 39 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim()).intValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - -2).trim()).intValue();
        if (feld4 != 1) {
            CobolDisplay.display("Test 40 " + String.valueOf(feld4));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental059NumericOperations2Display().run();
    }
}
