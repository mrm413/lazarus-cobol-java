package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataBinary005MoveDisplayToBinary extends CobolProgram {
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
    private BigDecimal d_s99v99 = BigDecimal.ZERO;
    private BigDecimal d_n99v99 = BigDecimal.ZERO;
    private int d_9v99 = 0;
    private int d_s99 = 0;
    private int d_99 = 0;
    private int d_p99 = 0;
    private int d_9pp = 0;
    private int d_938 = 0;
    private BigDecimal p_s99v99 = BigDecimal.ZERO;
    private short p_99v9 = (short) 0;
    private short p_s999 = (short) 0;
    private short p_99 = (short) 0;
    private short p_p9 = (short) 0;
    private short p_9p = (short) 0;
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
        p_99 = new BigDecimal(String.valueOf(d_938).trim()).shortValue();
        if (p_99 != 78) {
            CobolDisplay.display("P-99: " + String.valueOf(p_99));
        }
        p_s99v99 = new BigDecimal(String.valueOf(d_s99v99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(1.23).trim())) != 0) {
            CobolDisplay.display("P-S99V99 1: " + String.valueOf(p_s99v99));
        }
        p_s99v99 = new BigDecimal(String.valueOf(d_n99v99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(-1.32).trim())) != 0) {
            CobolDisplay.display("P-S99V99 2: " + String.valueOf(p_s99v99));
        }
        p_s99v99 = new BigDecimal(String.valueOf(d_9v99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(1.1).trim())) != 0) {
            CobolDisplay.display("P-S99V99 3: " + String.valueOf(p_s99v99));
        }
        p_s99v99 = new BigDecimal(String.valueOf(d_s99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("P-S99V99 4: " + String.valueOf(p_s99v99));
        }
        p_s99v99 = new BigDecimal(String.valueOf(d_99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("P-S99V99 5: " + String.valueOf(p_s99v99));
        }
        p_s99v99 = new BigDecimal(String.valueOf(d_p99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("P-S99V99 6: " + String.valueOf(p_s99v99));
        }
        p_s99v99 = new BigDecimal(String.valueOf(d_9pp).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-S99V99 7: " + String.valueOf(p_s99v99));
        }
        p_99v9 = new BigDecimal(String.valueOf(d_s99v99).trim()).shortValue();
        if (p_99v9 != 1.2) {
            CobolDisplay.display("P-99V99  1: " + String.valueOf(p_99v9));
        }
        p_99v9 = new BigDecimal(String.valueOf(d_n99v99).trim()).shortValue();
        if (p_99v9 != 1.3) {
            CobolDisplay.display("P-99V99  2: " + String.valueOf(p_99v9));
        }
        p_99v9 = new BigDecimal(String.valueOf(d_9v99).trim()).shortValue();
        if (p_99v9 != 1.1) {
            CobolDisplay.display("P-99V99  3: " + String.valueOf(p_99v9));
        }
        p_99v9 = new BigDecimal(String.valueOf(d_s99).trim()).shortValue();
        if (p_99v9 != 12) {
            CobolDisplay.display("P-99V99  4: " + String.valueOf(p_99v9));
        }
        p_99v9 = new BigDecimal(String.valueOf(d_99).trim()).shortValue();
        if (p_99v9 != 2) {
            CobolDisplay.display("P-99V99  5: " + String.valueOf(p_99v9));
        }
        p_99v9 = new BigDecimal(String.valueOf(d_p99).trim()).shortValue();
        if (p_99v9 != 0) {
            CobolDisplay.display("P-99V99  6: " + String.valueOf(p_99v9));
        }
        p_99v9 = new BigDecimal(String.valueOf(d_9pp).trim()).shortValue();
        if (p_99v9 != 0) {
            CobolDisplay.display("P-99V99  7: " + String.valueOf(p_99v9));
        }
        p_s999 = new BigDecimal(String.valueOf(d_s99v99).trim()).shortValue();
        if (p_s999 != 1) {
            CobolDisplay.display("P-S999   1: " + String.valueOf(p_s999));
        }
        p_s999 = new BigDecimal(String.valueOf(d_n99v99).trim()).shortValue();
        if (p_s999 != -1) {
            CobolDisplay.display("P-S999   2: " + String.valueOf(p_s999));
        }
        p_s999 = new BigDecimal(String.valueOf(d_9v99).trim()).shortValue();
        if (p_s999 != 1) {
            CobolDisplay.display("P-S999   3: " + String.valueOf(p_s999));
        }
        p_s999 = new BigDecimal(String.valueOf(d_s99).trim()).shortValue();
        if (p_s999 != 12) {
            CobolDisplay.display("P-S999   4: " + String.valueOf(p_s999));
        }
        p_s999 = new BigDecimal(String.valueOf(d_99).trim()).shortValue();
        if (p_s999 != 2) {
            CobolDisplay.display("P-S999   5: " + String.valueOf(p_s999));
        }
        p_s999 = new BigDecimal(String.valueOf(d_p99).trim()).shortValue();
        if (p_s999 != 0) {
            CobolDisplay.display("P-S999   6: " + String.valueOf(p_s999));
        }
        p_s999 = new BigDecimal(String.valueOf(d_9pp).trim()).shortValue();
        if (p_s999 != 200) {
            CobolDisplay.display("P-S999   7: " + String.valueOf(p_s999));
        }
        p_99 = new BigDecimal(String.valueOf(d_s99v99).trim()).shortValue();
        if (p_99 != 1) {
            CobolDisplay.display("P-99     1: " + String.valueOf(p_99));
        }
        p_99 = new BigDecimal(String.valueOf(d_n99v99).trim()).shortValue();
        if (p_99 != 1) {
            CobolDisplay.display("P-99     2: " + String.valueOf(p_99));
        }
        p_99 = new BigDecimal(String.valueOf(d_9v99).trim()).shortValue();
        if (p_99 != 1) {
            CobolDisplay.display("P-99     3: " + String.valueOf(p_99));
        }
        p_99 = new BigDecimal(String.valueOf(d_s99).trim()).shortValue();
        if (p_99 != 12) {
            CobolDisplay.display("P-99     4: " + String.valueOf(p_99));
        }
        p_99 = new BigDecimal(String.valueOf(d_99).trim()).shortValue();
        if (p_99 != 2) {
            CobolDisplay.display("P-99     5: " + String.valueOf(p_99));
        }
        p_99 = new BigDecimal(String.valueOf(d_p99).trim()).shortValue();
        if (p_99 != 0) {
            CobolDisplay.display("P-99     6: " + String.valueOf(p_99));
        }
        p_99 = new BigDecimal(String.valueOf(d_9pp).trim()).shortValue();
        if (p_99 != 0) {
            CobolDisplay.display("P-99     7: " + String.valueOf(p_99));
        }
        p_p9 = new BigDecimal(String.valueOf(d_s99v99).trim()).shortValue();
        if (p_p9 != 0.03) {
            CobolDisplay.display("P-P9     1: " + String.valueOf(p_p9));
        }
        p_p9 = new BigDecimal(String.valueOf(d_n99v99).trim()).shortValue();
        if (p_p9 != 0.02) {
            CobolDisplay.display("P-P9     2: " + String.valueOf(p_p9));
        }
        p_p9 = new BigDecimal(String.valueOf(d_9v99).trim()).shortValue();
        if (p_p9 != 0) {
            CobolDisplay.display("P-P9     3: " + String.valueOf(p_p9));
        }
        p_p9 = new BigDecimal(String.valueOf(d_s99).trim()).shortValue();
        if (p_p9 != 0) {
            CobolDisplay.display("P-P9     4: " + String.valueOf(p_p9));
        }
        p_p9 = new BigDecimal(String.valueOf(d_99).trim()).shortValue();
        if (p_p9 != 0) {
            CobolDisplay.display("P-P9     5: " + String.valueOf(p_p9));
        }
        p_p9 = new BigDecimal(String.valueOf(d_p99).trim()).shortValue();
        if (p_p9 != 0.02) {
            CobolDisplay.display("P-P9     6: " + String.valueOf(p_p9));
        }
        p_p9 = new BigDecimal(String.valueOf(d_9pp).trim()).shortValue();
        if (p_p9 != 0) {
            CobolDisplay.display("P-P9     7: " + String.valueOf(p_p9));
        }
        p_9p = new BigDecimal(String.valueOf(d_s99v99).trim()).shortValue();
        if (p_9p != 0) {
            CobolDisplay.display("P-9P     1: " + String.valueOf(p_9p));
        }
        p_9p = new BigDecimal(String.valueOf(d_n99v99).trim()).shortValue();
        if (p_9p != 0) {
            CobolDisplay.display("P-9P     2: " + String.valueOf(p_9p));
        }
        p_9p = new BigDecimal(String.valueOf(d_9v99).trim()).shortValue();
        if (p_9p != 0) {
            CobolDisplay.display("P-9P     3: " + String.valueOf(p_9p));
        }
        p_9p = new BigDecimal(String.valueOf(d_s99).trim()).shortValue();
        if (p_9p != 10) {
            CobolDisplay.display("P-9P     4: " + String.valueOf(p_9p));
        }
        p_9p = new BigDecimal(String.valueOf(d_99).trim()).shortValue();
        if (p_9p != 0) {
            CobolDisplay.display("P-9P     5: " + String.valueOf(p_9p));
        }
        p_9p = new BigDecimal(String.valueOf(d_p99).trim()).shortValue();
        if (p_9p != 0) {
            CobolDisplay.display("P-9P     6: " + String.valueOf(p_9p));
        }
        p_9p = new BigDecimal(String.valueOf(d_9pp).trim()).shortValue();
        if (p_9p != 0) {
            CobolDisplay.display("P-9P     7: " + String.valueOf(p_9p));
        }
        /* CONTINUE */
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataBinary005MoveDisplayToBinary().run();
    }
}
