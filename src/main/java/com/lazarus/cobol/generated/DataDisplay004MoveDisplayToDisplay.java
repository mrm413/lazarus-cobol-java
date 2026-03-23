package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay004MoveDisplayToDisplay extends CobolProgram {
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
    private BigDecimal t_s99v99 = BigDecimal.ZERO;
    private int t_99v9 = 0;
    private int t_s999 = 0;
    private int t_99 = 0;
    private int t_p9 = 0;
    private int t_9p = 0;


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
        t_s99v99 = new BigDecimal(String.valueOf(d_s99v99).trim());
        if (t_s99v99.compareTo(new BigDecimal(String.valueOf(1.23).trim())) != 0) {
            CobolDisplay.display("T-S99V99 1: ");
            /* RAW: T-S99V99  */
        }
        t_s99v99 = new BigDecimal(String.valueOf(d_n99v99).trim());
        if (t_s99v99.compareTo(new BigDecimal(String.valueOf(-1.32).trim())) != 0) {
            CobolDisplay.display("T-S99V99 2: ");
            /* RAW: T-S99V99  */
        }
        t_s99v99 = new BigDecimal(String.valueOf(d_9v99).trim());
        if (t_s99v99.compareTo(new BigDecimal(String.valueOf(1.1).trim())) != 0) {
            CobolDisplay.display("T-S99V99 3: ");
            /* RAW: T-S99V99  */
        }
        t_s99v99 = new BigDecimal(String.valueOf(d_s99).trim());
        if (t_s99v99.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("T-S99V99 4: ");
            /* RAW: T-S99V99  */
        }
        t_s99v99 = new BigDecimal(String.valueOf(d_99).trim());
        if (t_s99v99.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("T-S99V99 5: ");
            /* RAW: T-S99V99  */
        }
        t_s99v99 = new BigDecimal(String.valueOf(d_p99).trim());
        if (t_s99v99.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("T-S99V99 6: ");
            /* RAW: T-S99V99  */
        }
        t_s99v99 = new BigDecimal(String.valueOf(d_9pp).trim());
        if (t_s99v99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("T-S99V99 7: ");
            /* RAW: T-S99V99  */
        }
        t_99v9 = new BigDecimal(String.valueOf(d_s99v99).trim()).intValue();
        if (t_99v9 != 1.2) {
            CobolDisplay.display("T-99V9   1: ");
            /* RAW: T-99V9  */
        }
        t_99v9 = new BigDecimal(String.valueOf(d_n99v99).trim()).intValue();
        if (t_99v9 != 1.3) {
            CobolDisplay.display("T-99V9   2: ");
            /* RAW: T-99V9  */
        }
        t_99v9 = new BigDecimal(String.valueOf(d_9v99).trim()).intValue();
        if (t_99v9 != 1.1) {
            CobolDisplay.display("T-99V9   3: ");
            /* RAW: T-99V9  */
        }
        t_99v9 = new BigDecimal(String.valueOf(d_s99).trim()).intValue();
        if (t_99v9 != 12) {
            CobolDisplay.display("T-99V9   4: ");
            /* RAW: T-99V9  */
        }
        t_99v9 = new BigDecimal(String.valueOf(d_99).trim()).intValue();
        if (t_99v9 != 2) {
            CobolDisplay.display("T-99V9   5: ");
            /* RAW: T-99V9  */
        }
        t_99v9 = new BigDecimal(String.valueOf(d_p99).trim()).intValue();
        if (t_99v9 != 0) {
            CobolDisplay.display("T-99V9   6: ");
            /* RAW: T-99V9  */
        }
        t_99v9 = new BigDecimal(String.valueOf(d_9pp).trim()).intValue();
        if (t_99v9 != 0) {
            CobolDisplay.display("T-99V9   7: ");
            /* RAW: T-99V9  */
        }
        t_s999 = new BigDecimal(String.valueOf(d_s99v99).trim()).intValue();
        if (t_s999 != 1) {
            CobolDisplay.display("T-S999   1: ");
            /* RAW: T-S999  */
        }
        t_s999 = new BigDecimal(String.valueOf(d_n99v99).trim()).intValue();
        if (t_s999 != -1) {
            CobolDisplay.display("T-S999   2: ");
            /* RAW: T-S999  */
        }
        t_s999 = new BigDecimal(String.valueOf(d_9v99).trim()).intValue();
        if (t_s999 != 1) {
            CobolDisplay.display("T-S999   3: ");
            /* RAW: T-S999  */
        }
        t_s999 = new BigDecimal(String.valueOf(d_s99).trim()).intValue();
        if (t_s999 != 12) {
            CobolDisplay.display("T-S999   4: ");
            /* RAW: T-S999  */
        }
        t_s999 = new BigDecimal(String.valueOf(d_99).trim()).intValue();
        if (t_s999 != 2) {
            CobolDisplay.display("T-S999   5: ");
            /* RAW: T-S999  */
        }
        t_s999 = new BigDecimal(String.valueOf(d_p99).trim()).intValue();
        if (t_s999 != 0) {
            CobolDisplay.display("T-S999   6: ");
            /* RAW: T-S999  */
        }
        t_s999 = new BigDecimal(String.valueOf(d_9pp).trim()).intValue();
        if (t_s999 != 200) {
            CobolDisplay.display("T-S999   7: ");
            /* RAW: T-S999  */
        }
        t_99 = new BigDecimal(String.valueOf(d_s99v99).trim()).intValue();
        if (t_99 != 1) {
            CobolDisplay.display("T-99     1: ");
            /* RAW: T-99  */
        }
        t_99 = new BigDecimal(String.valueOf(d_n99v99).trim()).intValue();
        if (t_99 != 1) {
            CobolDisplay.display("T-99     2: ");
            /* RAW: T-99  */
        }
        t_99 = new BigDecimal(String.valueOf(d_9v99).trim()).intValue();
        if (t_99 != 1) {
            CobolDisplay.display("T-99     3: ");
            /* RAW: T-99  */
        }
        t_99 = new BigDecimal(String.valueOf(d_s99).trim()).intValue();
        if (t_99 != 12) {
            CobolDisplay.display("T-99     4: ");
            /* RAW: T-99  */
        }
        t_99 = new BigDecimal(String.valueOf(d_99).trim()).intValue();
        if (t_99 != 2) {
            CobolDisplay.display("T-99     5: ");
            /* RAW: T-99  */
        }
        t_99 = new BigDecimal(String.valueOf(d_p99).trim()).intValue();
        if (t_99 != 0) {
            CobolDisplay.display("T-99     6: ");
            /* RAW: T-99  */
        }
        t_99 = new BigDecimal(String.valueOf(d_9pp).trim()).intValue();
        if (t_99 != 0) {
            CobolDisplay.display("T-99     7: ");
            /* RAW: T-99  */
        }
        t_p9 = new BigDecimal(String.valueOf(d_s99v99).trim()).intValue();
        if (t_p9 != 0.03) {
            CobolDisplay.display("T-P9     1: ");
            /* RAW: T-P9  */
        }
        t_p9 = new BigDecimal(String.valueOf(d_n99v99).trim()).intValue();
        if (t_p9 != 0.02) {
            CobolDisplay.display("T-P9     2: ");
            /* RAW: T-P9  */
        }
        t_p9 = new BigDecimal(String.valueOf(d_9v99).trim()).intValue();
        if (t_p9 != 0) {
            CobolDisplay.display("T-P9     3: ");
            /* RAW: T-P9  */
        }
        t_p9 = new BigDecimal(String.valueOf(d_s99).trim()).intValue();
        if (t_p9 != 0) {
            CobolDisplay.display("T-P9     4: ");
            /* RAW: T-P9  */
        }
        t_p9 = new BigDecimal(String.valueOf(d_99).trim()).intValue();
        if (t_p9 != 0) {
            CobolDisplay.display("T-P9     5: ");
            /* RAW: T-P9  */
        }
        t_p9 = new BigDecimal(String.valueOf(d_p99).trim()).intValue();
        if (t_p9 != 0.02) {
            CobolDisplay.display("T-P9     6: ");
            /* RAW: T-P9  */
        }
        t_p9 = new BigDecimal(String.valueOf(d_9pp).trim()).intValue();
        if (t_p9 != 0) {
            CobolDisplay.display("T-P9     7: ");
            /* RAW: T-P9  */
        }
        t_9p = new BigDecimal(String.valueOf(d_s99v99).trim()).intValue();
        if (t_9p != 0) {
            CobolDisplay.display("T-9P     1: ");
            /* RAW: T-9P  */
        }
        t_9p = new BigDecimal(String.valueOf(d_n99v99).trim()).intValue();
        if (t_9p != 0) {
            CobolDisplay.display("T-9P     2: ");
            /* RAW: T-9P  */
        }
        t_9p = new BigDecimal(String.valueOf(d_9v99).trim()).intValue();
        if (t_9p != 0) {
            CobolDisplay.display("T-9P     3: ");
            /* RAW: T-9P  */
        }
        t_9p = new BigDecimal(String.valueOf(d_s99).trim()).intValue();
        if (t_9p != 10) {
            CobolDisplay.display("T-9P     4: ");
            /* RAW: T-9P  */
        }
        t_9p = new BigDecimal(String.valueOf(d_99).trim()).intValue();
        if (t_9p != 0) {
            CobolDisplay.display("T-9P     5: ");
            /* RAW: T-9P  */
        }
        t_9p = new BigDecimal(String.valueOf(d_p99).trim()).intValue();
        if (t_9p != 0) {
            CobolDisplay.display("T-9P     6: ");
            /* RAW: T-9P  */
        }
        t_9p = new BigDecimal(String.valueOf(d_9pp).trim()).intValue();
        if (t_9p != 0) {
            CobolDisplay.display("T-9P     7: ");
            /* RAW: T-9P  */
        }
        /* CONTINUE */
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataDisplay004MoveDisplayToDisplay().run();
    }
}
