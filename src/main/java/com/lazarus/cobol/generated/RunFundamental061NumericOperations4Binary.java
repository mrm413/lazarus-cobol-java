package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental061NumericOperations4Binary extends CobolProgram {
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
    private short feld3 = (short) 0;
    private short feld4 = (short) 0;


    private CobolString on = new CobolString(256);
    private CobolString error = new CobolString(256);
    private CobolString no_disp = new CobolString(256);
    private CobolString cb_true = new CobolString(256);
    private CobolString some = new CobolString(256);

    private void para_main() {
        /* RAW: * Test with */
        CobolDisplay.display(String.valueOf(on) + String.valueOf(error));
        do_check();
        no_disp.set(String.valueOf((Integer.parseInt(String.valueOf(cb_true).trim()) * Integer.parseInt(String.valueOf(some).trim()))));
        /* RAW: performance checks on the */
    }

    private void way() {
        for (int _i0 = 0; _i0 < 20000; _i0++) {
        }
        return;
    }

    private void do_check() {
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  1 ");
            /* RAW: FIELD  */
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test  2 ");
            /* RAW: FIELD  */
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test  3 ");
            /* RAW: FIELD  */
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test  4 ");
            /* RAW: FIELD  */
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test  5 ");
            /* RAW: FIELD  */
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  6 ");
            /* RAW: FIELD  */
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test  7 ");
            /* RAW: FIELD  */
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test  8 ");
            /* RAW: FIELD  */
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  9 ");
            /* RAW: FELD2  */
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test 10 ");
            /* RAW: FELD2  */
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 11 ");
            /* RAW: FELD2  */
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test 12 ");
            /* RAW: FELD2  */
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test 13 ");
            /* RAW: FELD2  */
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test 14 ");
            /* RAW: FELD2  */
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test 15 ");
            /* RAW: FELD2  */
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 16 ");
            /* RAW: FELD2  */
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim()).shortValue();
        feld3 = new BigDecimal(String.valueOf(feld3 + 1).trim()).shortValue();
        if (feld3 != 1.2) {
            CobolDisplay.display("Test 17 ");
            /* RAW: FELD3  */
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim()).shortValue();
        feld3 = new BigDecimal(String.valueOf(feld3 + -1).trim()).shortValue();
        if (feld3 != 0.8) {
            CobolDisplay.display("Test 18 ");
            /* RAW: FELD3  */
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim()).shortValue();
        feld3 = new BigDecimal(String.valueOf(feld3 + 1).trim()).shortValue();
        if (feld3 != 1.2) {
            CobolDisplay.display("Test 19 ");
            /* RAW: FELD3  */
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim()).shortValue();
        feld3 = new BigDecimal(String.valueOf(feld3 + -1).trim()).shortValue();
        if (feld3 != 0.8) {
            CobolDisplay.display("Test 20 ");
            /* RAW: FELD3  */
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim()).shortValue();
        feld3 = new BigDecimal(String.valueOf(feld3 - 1).trim()).shortValue();
        if (feld3 != 0.8) {
            CobolDisplay.display("Test 21 ");
            /* RAW: FELD3  */
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim()).shortValue();
        feld3 = new BigDecimal(String.valueOf(feld3 - -1).trim()).shortValue();
        if (feld3 != 1.2) {
            CobolDisplay.display("Test 22 ");
            /* RAW: FELD3  */
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim()).shortValue();
        feld3 = new BigDecimal(String.valueOf(feld3 - 1).trim()).shortValue();
        if (feld3 != 0.8) {
            CobolDisplay.display("Test 23 ");
            /* RAW: FELD3  */
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim()).shortValue();
        feld3 = new BigDecimal(String.valueOf(feld3 - -1).trim()).shortValue();
        if (feld3 != 1.2) {
            CobolDisplay.display("Test 24 ");
            /* RAW: FELD3  */
        }
        feld4 = new BigDecimal(String.valueOf(2).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + 1).trim()).shortValue();
        if (feld4 != 3) {
            CobolDisplay.display("Test 25 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(2).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + -1).trim()).shortValue();
        if (feld4 != 1) {
            CobolDisplay.display("Test 26 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + 1).trim()).shortValue();
        if (feld4 != -1) {
            CobolDisplay.display("Test 27 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + -1).trim()).shortValue();
        if (feld4 != -3) {
            CobolDisplay.display("Test 28 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(2).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - 1).trim()).shortValue();
        if (feld4 != 1) {
            CobolDisplay.display("Test 29 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(2).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - -1).trim()).shortValue();
        if (feld4 != 3) {
            CobolDisplay.display("Test 30 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - 1).trim()).shortValue();
        if (feld4 != -3) {
            CobolDisplay.display("Test 31 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - -1).trim()).shortValue();
        if (feld4 != -1) {
            CobolDisplay.display("Test 32 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(1).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + 2).trim()).shortValue();
        if (feld4 != 3) {
            CobolDisplay.display("Test 33 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(1).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + -2).trim()).shortValue();
        if (feld4 != -1) {
            CobolDisplay.display("Test 34 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + 2).trim()).shortValue();
        if (feld4 != 1) {
            CobolDisplay.display("Test 35 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 + -2).trim()).shortValue();
        if (feld4 != -3) {
            CobolDisplay.display("Test 36 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(1).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - 2).trim()).shortValue();
        if (feld4 != -1) {
            CobolDisplay.display("Test 37 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(1).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - -2).trim()).shortValue();
        if (feld4 != 3) {
            CobolDisplay.display("Test 38 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - 2).trim()).shortValue();
        if (feld4 != -3) {
            CobolDisplay.display("Test 39 ");
            /* RAW: FELD4  */
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim()).shortValue();
        feld4 = new BigDecimal(String.valueOf(feld4 - -2).trim()).shortValue();
        if (feld4 != 1) {
            CobolDisplay.display("Test 40 ");
            /* RAW: FELD4  */
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental061NumericOperations4Binary().run();
    }
}
