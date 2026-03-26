package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunAccept001AcceptFromTimeDateDayDayOfWeek1 extends CobolProgram {
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
    private CobolString x = new CobolString(9);


    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        x.set(String.valueOf(CobolIntrinsics.acceptFrom("TIME")));
        if ((String.valueOf(CobolString.refMod(x, 1, 2)).compareTo(String.valueOf("00")) >= 0 && !String.valueOf(_filler_002).trim().isEmpty())) {
            /* RAW: "23" AND X ( 3 : */
            /* CONTINUE */
        } else {
            CobolDisplay.display("TIME " + String.valueOf(x) + "!");
        }
        x.set(String.valueOf(CobolIntrinsics.acceptFrom("DATE")));
        /* INSPECT X — 2 clause(s) */
        if (!String.valueOf(x).equals(String.valueOf("999999"))) {
            CobolDisplay.display("DATE " + String.valueOf(x) + "!");
        }
        x.set(String.valueOf(CobolIntrinsics.acceptFrom("DATE YYYYMMDD")));
        /* INSPECT X — 2 clause(s) */
        if (!String.valueOf(x).equals(String.valueOf("99999999"))) {
            CobolDisplay.display("YYYYMMDD " + String.valueOf(x) + "!");
        }
        x.set(String.valueOf(CobolIntrinsics.acceptFrom("DAY")));
        /* INSPECT X — 2 clause(s) */
        if (!String.valueOf(x).equals(String.valueOf("99999"))) {
            CobolDisplay.display("DAY " + String.valueOf(x) + "!");
        }
        x.set(String.valueOf(CobolIntrinsics.acceptFrom("DAY YYYYDDD")));
        /* INSPECT X — 2 clause(s) */
        if (!String.valueOf(x).equals(String.valueOf("9999999"))) {
            CobolDisplay.display("YYYYDDD " + String.valueOf(x) + "!");
        }
        x.set(String.valueOf(CobolIntrinsics.acceptFrom("DAY-OF-WEEK")));
        /* INSPECT X — 2 clause(s) */
        if (!String.valueOf(x).equals(String.valueOf("9"))) {
            CobolDisplay.display("DAY-OF-WEEK " + String.valueOf(x) + "!");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunAccept001AcceptFromTimeDateDayDayOfWeek1().run();
    }
}
