package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataBinary008MoveBinaryToBinary extends CobolProgram {
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
    private BigDecimal b_s99v99 = BigDecimal.ZERO;
    private BigDecimal b_n99v99 = BigDecimal.ZERO;
    private short b_9v99 = (short) 0;
    private short b_s99 = (short) 0;
    private short b_99 = (short) 0;
    private short b_p99 = (short) 0;
    private short b_9pp = (short) 0;
    private BigDecimal c_s99v99 = BigDecimal.ZERO;
    private short c_99v9 = (short) 0;
    private short c_s999 = (short) 0;
    private short c_99 = (short) 0;
    private short c_p9 = (short) 0;
    private short c_9p = (short) 0;
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
        c_s99v99 = new BigDecimal(String.valueOf(b_s99v99).trim());
        if (c_s99v99.compareTo(new BigDecimal(String.valueOf(1.23).trim())) != 0) {
            CobolDisplay.display("C-S99V99 1: " + String.valueOf(c_s99v99));
        }
        c_s99v99 = new BigDecimal(String.valueOf(b_n99v99).trim());
        if (c_s99v99.compareTo(new BigDecimal(String.valueOf(-1.32).trim())) != 0) {
            CobolDisplay.display("C-S99V99 2: " + String.valueOf(c_s99v99));
        }
        c_s99v99 = new BigDecimal(String.valueOf(b_9v99).trim());
        if (c_s99v99.compareTo(new BigDecimal(String.valueOf(1.1).trim())) != 0) {
            CobolDisplay.display("C-S99V99 3: " + String.valueOf(c_s99v99));
        }
        c_s99v99 = new BigDecimal(String.valueOf(b_s99).trim());
        if (c_s99v99.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("C-S99V99 4: " + String.valueOf(c_s99v99));
        }
        c_s99v99 = new BigDecimal(String.valueOf(b_99).trim());
        if (c_s99v99.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("C-S99V99 5: " + String.valueOf(c_s99v99));
        }
        c_s99v99 = new BigDecimal(String.valueOf(b_p99).trim());
        if (c_s99v99.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("C-S99V99 6: " + String.valueOf(c_s99v99));
        }
        c_s99v99 = new BigDecimal(String.valueOf(b_9pp).trim());
        if (c_s99v99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("C-S99V99 7: " + String.valueOf(c_s99v99));
        }
        c_99v9 = new BigDecimal(String.valueOf(b_s99v99).trim()).shortValue();
        if (c_99v9 != 1.2) {
            CobolDisplay.display("C-99V9   1: " + String.valueOf(c_99v9));
        }
        c_99v9 = new BigDecimal(String.valueOf(b_n99v99).trim()).shortValue();
        if (c_99v9 != 1.3) {
            CobolDisplay.display("C-99V9   2: " + String.valueOf(c_99v9));
        }
        c_99v9 = new BigDecimal(String.valueOf(b_9v99).trim()).shortValue();
        if (c_99v9 != 1.1) {
            CobolDisplay.display("C-99V9   3: " + String.valueOf(c_99v9));
        }
        c_99v9 = new BigDecimal(String.valueOf(b_s99).trim()).shortValue();
        if (c_99v9 != 12) {
            CobolDisplay.display("C-99V9   4: " + String.valueOf(c_99v9));
        }
        c_99v9 = new BigDecimal(String.valueOf(b_99).trim()).shortValue();
        if (c_99v9 != 2) {
            CobolDisplay.display("C-99V9   5: " + String.valueOf(c_99v9));
        }
        c_99v9 = new BigDecimal(String.valueOf(b_p99).trim()).shortValue();
        if (c_99v9 != 0) {
            CobolDisplay.display("C-99V9   6: " + String.valueOf(c_99v9));
        }
        c_99v9 = new BigDecimal(String.valueOf(b_9pp).trim()).shortValue();
        if (c_99v9 != 0) {
            CobolDisplay.display("C-99V9   7: " + String.valueOf(c_99v9));
        }
        c_s999 = new BigDecimal(String.valueOf(b_s99v99).trim()).shortValue();
        if (c_s999 != 1) {
            CobolDisplay.display("C-S999   1: " + String.valueOf(c_s999));
        }
        c_s999 = new BigDecimal(String.valueOf(b_n99v99).trim()).shortValue();
        if (c_s999 != -1) {
            CobolDisplay.display("C-S999   2: " + String.valueOf(c_s999));
        }
        c_s999 = new BigDecimal(String.valueOf(b_9v99).trim()).shortValue();
        if (c_s999 != 1) {
            CobolDisplay.display("C-S999   3: " + String.valueOf(c_s999));
        }
        c_s999 = new BigDecimal(String.valueOf(b_s99).trim()).shortValue();
        if (c_s999 != 12) {
            CobolDisplay.display("C-S999   4: " + String.valueOf(c_s999));
        }
        c_s999 = new BigDecimal(String.valueOf(b_99).trim()).shortValue();
        if (c_s999 != 2) {
            CobolDisplay.display("C-S999   5: " + String.valueOf(c_s999));
        }
        c_s999 = new BigDecimal(String.valueOf(b_p99).trim()).shortValue();
        if (c_s999 != 0) {
            CobolDisplay.display("C-S999   6: " + String.valueOf(c_s999));
        }
        c_s999 = new BigDecimal(String.valueOf(b_9pp).trim()).shortValue();
        if (c_s999 != 200) {
            CobolDisplay.display("C-S999   7: " + String.valueOf(c_s999));
        }
        c_99 = new BigDecimal(String.valueOf(b_s99v99).trim()).shortValue();
        if (c_99 != 1) {
            CobolDisplay.display("C-99     1: " + String.valueOf(c_99));
        }
        c_99 = new BigDecimal(String.valueOf(b_n99v99).trim()).shortValue();
        if (c_99 != 1) {
            CobolDisplay.display("C-99     2: " + String.valueOf(c_99));
        }
        c_99 = new BigDecimal(String.valueOf(b_9v99).trim()).shortValue();
        if (c_99 != 1) {
            CobolDisplay.display("C-99     3: " + String.valueOf(c_99));
        }
        c_99 = new BigDecimal(String.valueOf(b_s99).trim()).shortValue();
        if (c_99 != 12) {
            CobolDisplay.display("C-99     4: " + String.valueOf(c_99));
        }
        c_99 = new BigDecimal(String.valueOf(b_99).trim()).shortValue();
        if (c_99 != 2) {
            CobolDisplay.display("C-99     5: " + String.valueOf(c_99));
        }
        c_99 = new BigDecimal(String.valueOf(b_p99).trim()).shortValue();
        if (c_99 != 0) {
            CobolDisplay.display("C-99     6: " + String.valueOf(c_99));
        }
        c_99 = new BigDecimal(String.valueOf(b_9pp).trim()).shortValue();
        if (c_99 != 0) {
            CobolDisplay.display("C-99     7: " + String.valueOf(c_99));
        }
        c_p9 = new BigDecimal(String.valueOf(b_s99v99).trim()).shortValue();
        if (c_p9 != 0.03) {
            CobolDisplay.display("C-P9     1: " + String.valueOf(c_p9));
        }
        c_p9 = new BigDecimal(String.valueOf(b_n99v99).trim()).shortValue();
        if (c_p9 != 0.02) {
            CobolDisplay.display("C-P9     2: " + String.valueOf(c_p9));
        }
        c_p9 = new BigDecimal(String.valueOf(b_9v99).trim()).shortValue();
        if (c_p9 != 0) {
            CobolDisplay.display("C-P9     3: " + String.valueOf(c_p9));
        }
        c_p9 = new BigDecimal(String.valueOf(b_s99).trim()).shortValue();
        if (c_p9 != 0) {
            CobolDisplay.display("C-P9     4: " + String.valueOf(c_p9));
        }
        c_p9 = new BigDecimal(String.valueOf(b_99).trim()).shortValue();
        if (c_p9 != 0) {
            CobolDisplay.display("C-P9     5: " + String.valueOf(c_p9));
        }
        c_p9 = new BigDecimal(String.valueOf(b_p99).trim()).shortValue();
        if (c_p9 != 0.02) {
            CobolDisplay.display("C-P9     6: " + String.valueOf(c_p9));
        }
        c_p9 = new BigDecimal(String.valueOf(b_9pp).trim()).shortValue();
        if (c_p9 != 0) {
            CobolDisplay.display("C-P9     7: " + String.valueOf(c_p9));
        }
        c_9p = new BigDecimal(String.valueOf(b_s99v99).trim()).shortValue();
        if (c_9p != 0) {
            CobolDisplay.display("C-9P     1: " + String.valueOf(c_9p));
        }
        c_9p = new BigDecimal(String.valueOf(b_n99v99).trim()).shortValue();
        if (c_9p != 0) {
            CobolDisplay.display("C-9P     2: " + String.valueOf(c_9p));
        }
        c_9p = new BigDecimal(String.valueOf(b_9v99).trim()).shortValue();
        if (c_9p != 0) {
            CobolDisplay.display("C-9P     3: " + String.valueOf(c_9p));
        }
        c_9p = new BigDecimal(String.valueOf(b_s99).trim()).shortValue();
        if (c_9p != 10) {
            CobolDisplay.display("C-9P     4: " + String.valueOf(c_9p));
        }
        c_9p = new BigDecimal(String.valueOf(b_99).trim()).shortValue();
        if (c_9p != 0) {
            CobolDisplay.display("C-9P     5: " + String.valueOf(c_9p));
        }
        c_9p = new BigDecimal(String.valueOf(b_p99).trim()).shortValue();
        if (c_9p != 0) {
            CobolDisplay.display("C-9P     6: " + String.valueOf(c_9p));
        }
        c_9p = new BigDecimal(String.valueOf(b_9pp).trim()).shortValue();
        if (c_9p != 0) {
            CobolDisplay.display("C-9P     7: " + String.valueOf(c_9p));
        }
        /* CONTINUE */
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataBinary008MoveBinaryToBinary().run();
    }
}
