package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked002MovePackedDecimalToPackedDecimal extends CobolProgram {
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
    private BigDecimal p_s99v99 = BigDecimal.ZERO;
    private BigDecimal p_n99v99 = BigDecimal.ZERO;
    private BigDecimal p_9v99 = BigDecimal.ZERO;
    private BigDecimal p_s99 = BigDecimal.ZERO;
    private BigDecimal p_99 = BigDecimal.ZERO;
    private BigDecimal p_p99 = BigDecimal.ZERO;
    private BigDecimal p_9pp = BigDecimal.ZERO;
    private BigDecimal b_s99v99 = BigDecimal.ZERO;
    private BigDecimal b_99v9 = BigDecimal.ZERO;
    private BigDecimal b_s999 = BigDecimal.ZERO;
    private BigDecimal b_99 = BigDecimal.ZERO;
    private BigDecimal b_p9 = BigDecimal.ZERO;
    private BigDecimal b_9p = BigDecimal.ZERO;
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
        b_s99v99 = new BigDecimal(String.valueOf(p_s99v99).trim());
        if (b_s99v99.compareTo(new BigDecimal(String.valueOf(1.23).trim())) != 0) {
            CobolDisplay.display("B-S99V99 1: " + String.valueOf(b_s99v99));
        }
        b_s99v99 = new BigDecimal(String.valueOf(p_n99v99).trim());
        if (b_s99v99.compareTo(new BigDecimal(String.valueOf(-1.32).trim())) != 0) {
            CobolDisplay.display("B-S99V99 2: " + String.valueOf(b_s99v99));
        }
        b_s99v99 = new BigDecimal(String.valueOf(p_9v99).trim());
        if (b_s99v99.compareTo(new BigDecimal(String.valueOf(1.1).trim())) != 0) {
            CobolDisplay.display("B-S99V99 3: " + String.valueOf(b_s99v99));
        }
        b_s99v99 = new BigDecimal(String.valueOf(p_s99).trim());
        if (b_s99v99.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("B-S99V99 4: " + String.valueOf(b_s99v99));
        }
        b_s99v99 = new BigDecimal(String.valueOf(p_99).trim());
        if (b_s99v99.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("B-S99V99 5: " + String.valueOf(b_s99v99));
        }
        b_s99v99 = new BigDecimal(String.valueOf(p_p99).trim());
        if (b_s99v99.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("B-S99V99 6: " + String.valueOf(b_s99v99));
        }
        b_s99v99 = new BigDecimal(String.valueOf(p_9pp).trim());
        if (b_s99v99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-S99V99 7: " + String.valueOf(b_s99v99));
        }
        b_99v9 = new BigDecimal(String.valueOf(p_s99v99).trim());
        if (b_99v9.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("B-99V99  1: " + String.valueOf(b_99v9));
        }
        b_99v9 = new BigDecimal(String.valueOf(p_n99v99).trim());
        if (b_99v9.compareTo(new BigDecimal(String.valueOf(1.3).trim())) != 0) {
            CobolDisplay.display("B-99V99  2: " + String.valueOf(b_99v9));
        }
        b_99v9 = new BigDecimal(String.valueOf(p_9v99).trim());
        if (b_99v9.compareTo(new BigDecimal(String.valueOf(1.1).trim())) != 0) {
            CobolDisplay.display("B-99V99  3: " + String.valueOf(b_99v9));
        }
        b_99v9 = new BigDecimal(String.valueOf(p_s99).trim());
        if (b_99v9.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("B-99V99  4: " + String.valueOf(b_99v9));
        }
        b_99v9 = new BigDecimal(String.valueOf(p_99).trim());
        if (b_99v9.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("B-99V99  5: " + String.valueOf(b_99v9));
        }
        b_99v9 = new BigDecimal(String.valueOf(p_p99).trim());
        if (b_99v9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-99V99  6: " + String.valueOf(b_99v9));
        }
        b_99v9 = new BigDecimal(String.valueOf(p_9pp).trim());
        if (b_99v9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-99V99  7: " + String.valueOf(b_99v9));
        }
        b_s999 = new BigDecimal(String.valueOf(p_s99v99).trim());
        if (b_s999.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("B-S999   1: " + String.valueOf(b_s999));
        }
        b_s999 = new BigDecimal(String.valueOf(p_n99v99).trim());
        if (b_s999.compareTo(new BigDecimal(String.valueOf(-1).trim())) != 0) {
            CobolDisplay.display("B-S999   2: " + String.valueOf(b_s999));
        }
        b_s999 = new BigDecimal(String.valueOf(p_9v99).trim());
        if (b_s999.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("B-S999   3: " + String.valueOf(b_s999));
        }
        b_s999 = new BigDecimal(String.valueOf(p_s99).trim());
        if (b_s999.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("B-S999   4: " + String.valueOf(b_s999));
        }
        b_s999 = new BigDecimal(String.valueOf(p_99).trim());
        if (b_s999.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("B-S999   5: " + String.valueOf(b_s999));
        }
        b_s999 = new BigDecimal(String.valueOf(p_p99).trim());
        if (b_s999.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-S999   6: " + String.valueOf(b_s999));
        }
        b_s999 = new BigDecimal(String.valueOf(p_9pp).trim());
        if (b_s999.compareTo(new BigDecimal(String.valueOf(200).trim())) != 0) {
            CobolDisplay.display("B-S999   7: " + String.valueOf(b_s999));
        }
        b_99 = new BigDecimal(String.valueOf(p_s99v99).trim());
        if (b_99.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("B-99     1: " + String.valueOf(b_99));
        }
        b_99 = new BigDecimal(String.valueOf(p_n99v99).trim());
        if (b_99.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("B-99     2: " + String.valueOf(b_99));
        }
        b_99 = new BigDecimal(String.valueOf(p_9v99).trim());
        if (b_99.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("B-99     3: " + String.valueOf(b_99));
        }
        b_99 = new BigDecimal(String.valueOf(p_s99).trim());
        if (b_99.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("B-99     4: " + String.valueOf(b_99));
        }
        b_99 = new BigDecimal(String.valueOf(p_99).trim());
        if (b_99.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("B-99     5: " + String.valueOf(b_99));
        }
        b_99 = new BigDecimal(String.valueOf(p_p99).trim());
        if (b_99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-99     6: " + String.valueOf(b_99));
        }
        b_99 = new BigDecimal(String.valueOf(p_9pp).trim());
        if (b_99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-99     7: " + String.valueOf(b_99));
        }
        b_p9 = new BigDecimal(String.valueOf(p_s99v99).trim());
        if (b_p9.compareTo(new BigDecimal(String.valueOf(0.03).trim())) != 0) {
            CobolDisplay.display("B-P9     1: " + String.valueOf(b_p9));
        }
        b_p9 = new BigDecimal(String.valueOf(p_n99v99).trim());
        if (b_p9.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("B-P9     2: " + String.valueOf(b_p9));
        }
        b_p9 = new BigDecimal(String.valueOf(p_9v99).trim());
        if (b_p9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-P9     3: " + String.valueOf(b_p9));
        }
        b_p9 = new BigDecimal(String.valueOf(p_s99).trim());
        if (b_p9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-P9     4: " + String.valueOf(b_p9));
        }
        b_p9 = new BigDecimal(String.valueOf(p_99).trim());
        if (b_p9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-P9     5: " + String.valueOf(b_p9));
        }
        b_p9 = new BigDecimal(String.valueOf(p_p99).trim());
        if (b_p9.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("B-P9     6: " + String.valueOf(b_p9));
        }
        b_p9 = new BigDecimal(String.valueOf(p_9pp).trim());
        if (b_p9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-P9     7: " + String.valueOf(b_p9));
        }
        b_9p = new BigDecimal(String.valueOf(p_s99v99).trim());
        if (b_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-9P     1: " + String.valueOf(b_9p));
        }
        b_9p = new BigDecimal(String.valueOf(p_n99v99).trim());
        if (b_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-9P     2: " + String.valueOf(b_9p));
        }
        b_9p = new BigDecimal(String.valueOf(p_9v99).trim());
        if (b_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-9P     3: " + String.valueOf(b_9p));
        }
        b_9p = new BigDecimal(String.valueOf(p_s99).trim());
        if (b_9p.compareTo(new BigDecimal(String.valueOf(10).trim())) != 0) {
            CobolDisplay.display("B-9P     4: " + String.valueOf(b_9p));
        }
        b_9p = new BigDecimal(String.valueOf(p_99).trim());
        if (b_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-9P     5: " + String.valueOf(b_9p));
        }
        b_9p = new BigDecimal(String.valueOf(p_p99).trim());
        if (b_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-9P     6: " + String.valueOf(b_9p));
        }
        b_9p = new BigDecimal(String.valueOf(p_9pp).trim());
        if (b_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("B-9P     7: " + String.valueOf(b_9p));
        }
        /* CONTINUE */
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked002MovePackedDecimalToPackedDecimal().run();
    }
}
