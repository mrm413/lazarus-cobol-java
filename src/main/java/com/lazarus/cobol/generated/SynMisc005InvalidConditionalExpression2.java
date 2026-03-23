package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc005InvalidConditionalExpression2 extends CobolProgram {
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
    private int wrkn = 0;
    private CobolString wrkx = new CobolString(8);


    private CobolString greater = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString wrkn_is_zero = new CobolString(256);

    private void para_main() {
        if (String.valueOf(wrkn).equals(String.valueOf(true))) {
            CobolDisplay.display("WHAT IS IT?");
        }
        if (wrkn == 123) {
            /* RAW: EQUAL 456 */
            CobolDisplay.display("Strange brew! " + String.valueOf(wrkn));
        }
        if (wrkn != 123) {
            /* RAW: NOT = 456 */
            CobolDisplay.display("Strange brew! " + String.valueOf(wrkn));
        }
        if ((wrkn == 123 || true)) {
            CobolDisplay.display("Home brew! " + String.valueOf(wrkn));
        }
        if ((String.valueOf(wrkx).equals(String.valueOf("Red")) || true)) {
            CobolDisplay.display("Home wine! " + String.valueOf(wrkx));
        }
        if (String.valueOf(wrkx).compareTo(String.valueOf("Red")) <= 0) {
            /* RAW: = "White" */
            CobolDisplay.display("Home wine! " + String.valueOf(wrkx));
        }
        if (String.valueOf(wrkx).equals(String.valueOf("Red"))) {
            /* RAW: NOT "White" */
            CobolDisplay.display("Home wine! " + String.valueOf(wrkx));
        }
    // if ((wrkn == ((123 - 12)) || !String.valueOf(_unnamed[(456 + 16) - 1]).trim().isEmpty())) {
    // CobolDisplay.display("And another brew! " + String.valueOf(wrkn));
    // }
        if (true) {
            /* RAW: > 0 */
            CobolDisplay.display("Weird if compiled");
        }
        if (true) {
            /* RAW: > 0 */
            CobolDisplay.display("Weird if compiled");
        }
        if ((!String.valueOf(wrkn_is_zero).trim().isEmpty() && !String.valueOf(wrkn_is_zero).trim().isEmpty())) {
            /* RAW: > 0 */
            CobolDisplay.display("Weird if compiled");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc005InvalidConditionalExpression2().run();
    }
}
