package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions103ExamineTallying extends CobolProgram {
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
    private CobolString x = new CobolString(8);
    private BigDecimal n = BigDecimal.ZERO;
    private CobolString t = new CobolString(10);


    private CobolString display = new CobolString(256);

    private void para_main() {
        /* RAW: EXAMINE X TALLYING ALL "A" */
        if (tally != 4) {
            CobolDisplay.display("Should be 4 but is ");
            /* RAW: TALLY  */
        }
        /* RAW: EXAMINE X TALLYING LEADING "A" */
        if (tally != 2) {
            CobolDisplay.display("Should be 2 but is ");
            /* RAW: TALLY  */
        }
        /* RAW: EXAMINE X TALLYING UNTIL FIRST "C" */
        if (tally != 5) {
            CobolDisplay.display("Should be 5 but is ");
            /* RAW: TALLY  */
        }
        /* RAW: EXAMINE X TALLYING ALL "A" REPLACING */
        if (tally != 4) {
            CobolDisplay.display("Should be 4 but is ");
            /* RAW: TALLY  */
        }
        if (!String.valueOf(x).equals(String.valueOf("ZZBZBCZB"))) {
            CobolDisplay.display("Should be ZZBZBCZB but is ");
            /* RAW: X  */
        }
        /* RAW: EXAMINE X TALLYING LEADING "Z" REPLACING */
        if (tally != 2) {
            CobolDisplay.display("Should be 2 but is ");
            /* RAW: TALLY  */
        }
        if (!String.valueOf(x).equals(String.valueOf("AABZBCZB"))) {
            CobolDisplay.display("Should be AABZBCZB but is ");
            /* RAW: X  */
        }
        /* RAW: EXAMINE X TALLYING UNTIL FIRST "C" */
        if (tally != 5) {
            CobolDisplay.display("Should be 5 but is ");
            /* RAW: TALLY  */
        }
        if (!String.valueOf(x).equals(String.valueOf("XXXXXCZB"))) {
            CobolDisplay.display("Should be XXXXXCZB but is ");
            /* RAW: X  */
        }
        /* RAW: EXAMINE X TALLYING UNTIL FIRST "Y" */
        if (tally != 8) {
            CobolDisplay.display("Should be 8 but is ");
            /* RAW: TALLY  */
        }
        if (!String.valueOf(x).equals(String.valueOf("YYYYYYYY"))) {
            CobolDisplay.display("Should be YYYYYYYY but is ");
            /* RAW: X  */
        }
        /* RAW: EXAMINE N TALLYING UNTIL FIRST 5 */
        if (n.compareTo(new BigDecimal(String.valueOf(-88888.55).trim())) != 0) {
            CobolDisplay.display("Should be -88888.55 but is ");
            /* RAW: N  */
        }
        /* RAW: * Re-mod is forbidden here ( */
        if (tally != (5 * Integer.parseInt(String.valueOf(display).trim()))) {
            /* RAW: "Should be 5 but is "  */
            /* RAW: TALLY  */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions103ExamineTallying().run();
    }
}
