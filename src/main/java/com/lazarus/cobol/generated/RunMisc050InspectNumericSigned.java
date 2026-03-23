package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc050InspectNumericSigned extends CobolProgram {
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
    private int separate1 = 0;
    private int separate2 = 0;
    private int tseparate1 = 0;
    private int tseparate2 = 0;
    private int nseparate1 = 0;
    private int nseparate2 = 0;
    private int trailing1 = 0;
    private int trailing2 = 0;
    private int cnt = 0;



    private void para_main() {
        cnt = new BigDecimal(String.valueOf(0).trim()).intValue();
        /* INSPECT SEPARATE1 — 2 clause(s) */
        if (cnt != 2) {
            CobolDisplay.display("T1 - ");
            /* RAW: CNT  */
        }
        cnt = new BigDecimal(String.valueOf(0).trim()).intValue();
        /* INSPECT SEPARATE2 — 2 clause(s) */
        if (cnt != 2) {
            CobolDisplay.display("T2 - ");
            /* RAW: CNT  */
        }
        cnt = new BigDecimal(String.valueOf(0).trim()).intValue();
        /* INSPECT TSEPARATE1 — 2 clause(s) */
        if (cnt != 2) {
            CobolDisplay.display("T3 - ");
            /* RAW: CNT  */
        }
        cnt = new BigDecimal(String.valueOf(0).trim()).intValue();
        /* INSPECT TSEPARATE2 — 2 clause(s) */
        if (cnt != 2) {
            CobolDisplay.display("T4 - ");
            /* RAW: CNT  */
        }
        cnt = new BigDecimal(String.valueOf(0).trim()).intValue();
        /* INSPECT NSEPARATE1 — 2 clause(s) */
        if (cnt != 2) {
            CobolDisplay.display("T5 - ");
            /* RAW: CNT  */
        }
        cnt = new BigDecimal(String.valueOf(0).trim()).intValue();
        /* INSPECT NSEPARATE2 — 2 clause(s) */
        if (cnt != 2) {
            CobolDisplay.display("T6 - ");
            /* RAW: CNT  */
        }
        cnt = new BigDecimal(String.valueOf(0).trim()).intValue();
        /* INSPECT TRAILING1 — 2 clause(s) */
        if (cnt != 2) {
            CobolDisplay.display("T7 - ");
            /* RAW: CNT  */
        }
        cnt = new BigDecimal(String.valueOf(0).trim()).intValue();
        /* INSPECT TRAILING2 — 2 clause(s) */
        if (cnt != 2) {
            CobolDisplay.display("T8 - ");
            /* RAW: CNT  */
        }
        /* INSPECT SEPARATE1 — 2 clause(s) */
        if (separate1 != -22) {
            CobolDisplay.display("C1 - " + String.valueOf(separate1));
            /* RAW: SEPARATE1  */
        }
        /* INSPECT SEPARATE2 — 2 clause(s) */
        if (separate2 != 22) {
            CobolDisplay.display("C2 - " + String.valueOf(separate2));
            /* RAW: SEPARATE2  */
        }
        /* INSPECT TSEPARATE1 — 2 clause(s) */
        if (tseparate1 != -22) {
            CobolDisplay.display("C3 - " + String.valueOf(tseparate1));
            /* RAW: TSEPARATE1  */
        }
        /* INSPECT TSEPARATE2 — 2 clause(s) */
        if (tseparate2 != 22) {
            CobolDisplay.display("C4 - " + String.valueOf(tseparate2));
            /* RAW: TSEPARATE2  */
        }
        /* INSPECT NSEPARATE1 — 2 clause(s) */
        if (nseparate1 != -22) {
            CobolDisplay.display("C5 - " + String.valueOf(nseparate1));
            /* RAW: NSEPARATE1  */
        }
        /* INSPECT NSEPARATE2 — 2 clause(s) */
        if (nseparate2 != 22) {
            CobolDisplay.display("C6 - " + String.valueOf(nseparate2));
            /* RAW: NSEPARATE2  */
        }
        /* INSPECT TRAILING1 — 2 clause(s) */
        if (trailing1 != -22) {
            CobolDisplay.display("C7 - " + String.valueOf(trailing1));
            /* RAW: TRAILING1  */
        }
        /* INSPECT TRAILING2 — 2 clause(s) */
        if (trailing2 != 22) {
            CobolDisplay.display("C8 - " + String.valueOf(trailing2));
            /* RAW: TRAILING2  */
        }
        /* INSPECT SEPARATE1 — 2 clause(s) */
        if (separate1 != -33) {
            CobolDisplay.display("R1 - " + String.valueOf(separate1));
            /* RAW: SEPARATE1  */
        }
        /* INSPECT SEPARATE2 — 2 clause(s) */
        if (separate2 != 33) {
            CobolDisplay.display("R2 - " + String.valueOf(separate2));
            /* RAW: SEPARATE2  */
        }
        /* INSPECT TSEPARATE1 — 2 clause(s) */
        if (tseparate1 != -33) {
            CobolDisplay.display("R3 - " + String.valueOf(tseparate1));
            /* RAW: TSEPARATE1  */
        }
        /* INSPECT TSEPARATE2 — 2 clause(s) */
        if (tseparate2 != 33) {
            CobolDisplay.display("R4 - " + String.valueOf(tseparate2));
            /* RAW: TSEPARATE2  */
        }
        /* INSPECT NSEPARATE1 — 2 clause(s) */
        if (nseparate1 != -33) {
            CobolDisplay.display("R5 - " + String.valueOf(nseparate1));
            /* RAW: NSEPARATE1  */
        }
        /* INSPECT NSEPARATE2 — 2 clause(s) */
        if (nseparate2 != 33) {
            CobolDisplay.display("R6 - " + String.valueOf(nseparate2));
            /* RAW: NSEPARATE2  */
        }
        /* INSPECT TRAILING1 — 2 clause(s) */
        if (trailing1 != -33) {
            CobolDisplay.display("R7 - " + String.valueOf(trailing1));
            /* RAW: TRAILING1  */
        }
        /* INSPECT TRAILING2 — 2 clause(s) */
        if (trailing2 != 33) {
            CobolDisplay.display("R8 - " + String.valueOf(trailing2));
            /* RAW: TRAILING2  */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc050InspectNumericSigned().run();
    }
}
