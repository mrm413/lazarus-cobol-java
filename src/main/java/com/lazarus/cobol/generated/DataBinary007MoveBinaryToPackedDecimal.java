package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataBinary007MoveBinaryToPackedDecimal extends CobolProgram {
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
    private BigDecimal p_s99v99 = BigDecimal.ZERO;
    private BigDecimal p_99v9 = BigDecimal.ZERO;
    private BigDecimal p_s999 = BigDecimal.ZERO;
    private BigDecimal p_99 = BigDecimal.ZERO;
    private BigDecimal p_p9 = BigDecimal.ZERO;
    private BigDecimal p_9p = BigDecimal.ZERO;


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
        p_s99v99 = new BigDecimal(String.valueOf(b_s99v99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(1.23).trim())) != 0) {
            CobolDisplay.display("P-S99V99 1: ");
            /* RAW: P-S99V99  */
        }
        p_s99v99 = new BigDecimal(String.valueOf(b_n99v99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(-1.32).trim())) != 0) {
            CobolDisplay.display("P-S99V99 2: ");
            /* RAW: P-S99V99  */
        }
        p_s99v99 = new BigDecimal(String.valueOf(b_9v99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(1.1).trim())) != 0) {
            CobolDisplay.display("P-S99V99 3: ");
            /* RAW: P-S99V99  */
        }
        p_s99v99 = new BigDecimal(String.valueOf(b_s99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("P-S99V99 4: ");
            /* RAW: P-S99V99  */
        }
        p_s99v99 = new BigDecimal(String.valueOf(b_99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("P-S99V99 5: ");
            /* RAW: P-S99V99  */
        }
        p_s99v99 = new BigDecimal(String.valueOf(b_p99).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("P-S99V99 6: ");
            /* RAW: P-S99V99  */
        }
        p_s99v99 = new BigDecimal(String.valueOf(b_9pp).trim());
        if (p_s99v99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-S99V99 7: ");
            /* RAW: P-S99V99  */
        }
        p_99v9 = new BigDecimal(String.valueOf(b_s99v99).trim());
        if (p_99v9.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("P-99V9   1: ");
            /* RAW: P-99V9  */
        }
        p_99v9 = new BigDecimal(String.valueOf(b_n99v99).trim());
        if (p_99v9.compareTo(new BigDecimal(String.valueOf(1.3).trim())) != 0) {
            CobolDisplay.display("P-99V9   2: ");
            /* RAW: P-99V9  */
        }
        p_99v9 = new BigDecimal(String.valueOf(b_9v99).trim());
        if (p_99v9.compareTo(new BigDecimal(String.valueOf(1.1).trim())) != 0) {
            CobolDisplay.display("P-99V9   3: ");
            /* RAW: P-99V9  */
        }
        p_99v9 = new BigDecimal(String.valueOf(b_s99).trim());
        if (p_99v9.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("P-99V9   4: ");
            /* RAW: P-99V9  */
        }
        p_99v9 = new BigDecimal(String.valueOf(b_99).trim());
        if (p_99v9.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("P-99V9   5: ");
            /* RAW: P-99V9  */
        }
        p_99v9 = new BigDecimal(String.valueOf(b_p99).trim());
        if (p_99v9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-99V9   6: ");
            /* RAW: P-99V9  */
        }
        p_99v9 = new BigDecimal(String.valueOf(b_9pp).trim());
        if (p_99v9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-99V9   7: ");
            /* RAW: P-99V9  */
        }
        p_s999 = new BigDecimal(String.valueOf(b_s99v99).trim());
        if (p_s999.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("P-S999   1: ");
            /* RAW: P-S999  */
        }
        p_s999 = new BigDecimal(String.valueOf(b_n99v99).trim());
        if (p_s999.compareTo(new BigDecimal(String.valueOf(-1).trim())) != 0) {
            CobolDisplay.display("P-S999   2: ");
            /* RAW: P-S999  */
        }
        p_s999 = new BigDecimal(String.valueOf(b_9v99).trim());
        if (p_s999.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("P-S999   3: ");
            /* RAW: P-S999  */
        }
        p_s999 = new BigDecimal(String.valueOf(b_s99).trim());
        if (p_s999.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("P-S999   4: ");
            /* RAW: P-S999  */
        }
        p_s999 = new BigDecimal(String.valueOf(b_99).trim());
        if (p_s999.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("P-S999   5: ");
            /* RAW: P-S999  */
        }
        p_s999 = new BigDecimal(String.valueOf(b_p99).trim());
        if (p_s999.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-S999   6: ");
            /* RAW: P-S999  */
        }
        p_s999 = new BigDecimal(String.valueOf(b_9pp).trim());
        if (p_s999.compareTo(new BigDecimal(String.valueOf(200).trim())) != 0) {
            CobolDisplay.display("P-S999   7: ");
            /* RAW: P-S999  */
        }
        p_99 = new BigDecimal(String.valueOf(b_s99v99).trim());
        if (p_99.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("P-99     1: ");
            /* RAW: P-99  */
        }
        p_99 = new BigDecimal(String.valueOf(b_n99v99).trim());
        if (p_99.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("P-99     2: ");
            /* RAW: P-99  */
        }
        p_99 = new BigDecimal(String.valueOf(b_9v99).trim());
        if (p_99.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("P-99     3: ");
            /* RAW: P-99  */
        }
        p_99 = new BigDecimal(String.valueOf(b_s99).trim());
        if (p_99.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("P-99     4: ");
            /* RAW: P-99  */
        }
        p_99 = new BigDecimal(String.valueOf(b_99).trim());
        if (p_99.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("P-99     5: ");
            /* RAW: P-99  */
        }
        p_99 = new BigDecimal(String.valueOf(b_p99).trim());
        if (p_99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-99     6: ");
            /* RAW: P-99  */
        }
        p_99 = new BigDecimal(String.valueOf(b_9pp).trim());
        if (p_99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-99     7: ");
            /* RAW: P-99  */
        }
        p_p9 = new BigDecimal(String.valueOf(b_s99v99).trim());
        if (p_p9.compareTo(new BigDecimal(String.valueOf(0.03).trim())) != 0) {
            CobolDisplay.display("P-P9     1: ");
            /* RAW: P-P9  */
        }
        p_p9 = new BigDecimal(String.valueOf(b_n99v99).trim());
        if (p_p9.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("P-P9     2: ");
            /* RAW: P-P9  */
        }
        p_p9 = new BigDecimal(String.valueOf(b_9v99).trim());
        if (p_p9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-P9     3: ");
            /* RAW: P-P9  */
        }
        p_p9 = new BigDecimal(String.valueOf(b_s99).trim());
        if (p_p9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-P9     4: ");
            /* RAW: P-P9  */
        }
        p_p9 = new BigDecimal(String.valueOf(b_99).trim());
        if (p_p9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-P9     5: ");
            /* RAW: P-P9  */
        }
        p_p9 = new BigDecimal(String.valueOf(b_p99).trim());
        if (p_p9.compareTo(new BigDecimal(String.valueOf(0.02).trim())) != 0) {
            CobolDisplay.display("P-P9     6: ");
            /* RAW: P-P9  */
        }
        p_p9 = new BigDecimal(String.valueOf(b_9pp).trim());
        if (p_p9.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-P9     7: ");
            /* RAW: P-P9  */
        }
        p_9p = new BigDecimal(String.valueOf(b_s99v99).trim());
        if (p_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-9P     1: ");
            /* RAW: P-9P  */
        }
        p_9p = new BigDecimal(String.valueOf(b_n99v99).trim());
        if (p_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-9P     2: ");
            /* RAW: P-9P  */
        }
        p_9p = new BigDecimal(String.valueOf(b_9v99).trim());
        if (p_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-9P     3: ");
            /* RAW: P-9P  */
        }
        p_9p = new BigDecimal(String.valueOf(b_s99).trim());
        if (p_9p.compareTo(new BigDecimal(String.valueOf(10).trim())) != 0) {
            CobolDisplay.display("P-9P     4: ");
            /* RAW: P-9P  */
        }
        p_9p = new BigDecimal(String.valueOf(b_99).trim());
        if (p_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-9P     5: ");
            /* RAW: P-9P  */
        }
        p_9p = new BigDecimal(String.valueOf(b_p99).trim());
        if (p_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-9P     6: ");
            /* RAW: P-9P  */
        }
        p_9p = new BigDecimal(String.valueOf(b_9pp).trim());
        if (p_9p.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("P-9P     7: ");
            /* RAW: P-9P  */
        }
        /* CONTINUE */
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataBinary007MoveBinaryToPackedDecimal().run();
    }
}
