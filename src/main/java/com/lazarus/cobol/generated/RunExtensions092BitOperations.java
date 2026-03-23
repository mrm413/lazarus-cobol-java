package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions092BitOperations extends CobolProgram {
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
    private CobolString x1 = new CobolString(1);
    private CobolString x2 = new CobolString(1);
    private CobolString x3 = new CobolString(1);
    private CobolString xx1 = new CobolString(2);
    private CobolString xx2 = new CobolString(2);
    private CobolString xx3 = new CobolString(2);


    private CobolString x = new CobolString(256);
    private CobolString _09 = new CobolString(256);
    private CobolString to = new CobolString(256);
    private CobolString _0 = new CobolString(256);
    private CobolString e = new CobolString(256);
    private CobolString b_not = new CobolString(256);

    private void para_main() {
        xx2.set(String.valueOf(2));
        x2.set(String.valueOf(2));
        xx3.set(String.valueOf(4));
    }

    private void x3() {
        CobolDisplay.display("Test using PIC XX COMP-X");
        xx1.set(String.valueOf((xx2)));
        /* RAW: B-OR XX3 ) */
        CobolDisplay.display(String.valueOf(xx2) + " B-OR  " + String.valueOf(xx3) + " is ");
    }

    private void xx1() {
    }

    private void xx3() {
        xx1.set(String.valueOf((xx2)));
        /* RAW: B-XOR XX3 ) */
        CobolDisplay.display(String.valueOf(xx2) + " B-XOR " + String.valueOf(xx3) + " is ");
    }

    private void xx1_2() {
        xx2.set(String.valueOf(3));
    }

    private void xx1_3() {
        if (!String.valueOf(xx2).trim().isEmpty()) {
            /* RAW: B-AND XX1 ) = XX1 */
            CobolDisplay.display(String.valueOf(xx2) + " B-AND " + String.valueOf(xx1) + " = " + String.valueOf(xx1) + " TRUE");
        } else {
            CobolDisplay.display(String.valueOf(xx2) + " B-AND " + String.valueOf(xx1) + " = " + String.valueOf(xx1) + " FALSE");
        }
        xx1.set(String.valueOf((xx2)));
        /* RAW: B-XOR XX3 ) + 1 */
        CobolDisplay.display("(" + String.valueOf(xx2) + " B-XOR " + String.valueOf(xx3) + ") + 1 is ");
    }

    private void xx1_4() {
        xx1.set(String.valueOf(xx2));
        /* RAW: B-XOR ( XX3 + 1 ) */
        CobolDisplay.display(String.valueOf(xx2) + " B-XOR (" + String.valueOf(xx3) + " + 1) is ");
    }

    private void xx1_5() {
        _09.set(String.valueOf(x));
        to.set(String.valueOf(x));
    }

    private void xx3_2() {
        _0.set(String.valueOf(x));
        e.set(String.valueOf(x));
        to.set(String.valueOf(x));
    }

    private void xx2() {
        xx1.set(String.valueOf(xx2));
        /* RAW: B-AND  */
    }

    private void xx3_3() {
        CobolDisplay.display(String.valueOf(xx2) + " B-AND " + String.valueOf(xx3) + " is ");
    }

    private void xx1_6() {
        xx1.set(String.valueOf((x)));
        /* RAW: 05 B-OR x 22 ) */
        CobolDisplay.display("x#05 B-OR x#22 is ");
    }

    private void xx1_7() {
        xx1.set(String.valueOf(b_not));
    }

    private void xx2_2() {
        CobolDisplay.display("B-NOT " + String.valueOf(xx2) + " is ");
    }

    private void xx1_8() {
        xx1.set(String.valueOf(b_not));
        /* RAW: x 22 */
        CobolDisplay.display("B-NOT x#22 is ");
    }

    private void xx1_9() {
        CobolDisplay.display("  -----");
        CobolDisplay.display("Test using PIC X COMP-X");
        x1.set(String.valueOf((x2)));
        /* RAW: B-OR X3 ) */
        CobolDisplay.display(String.valueOf(x2) + " B-OR  " + String.valueOf(x3) + " is ");
    }

    private void x1() {
    }

    private void x3_2() {
        x1.set(String.valueOf((x2)));
        /* RAW: B-XOR X3 ) */
        CobolDisplay.display(String.valueOf(x2) + " B-XOR " + String.valueOf(x3) + " is ");
    }

    private void x1_2() {
        x2.set(String.valueOf(3));
    }

    private void x1_3() {
        if (!String.valueOf(x2).trim().isEmpty()) {
            /* RAW: B-AND X1 ) = X1 */
            CobolDisplay.display(String.valueOf(x2) + " B-AND " + String.valueOf(x1) + " = " + String.valueOf(x1) + " TRUE");
        } else {
            CobolDisplay.display(String.valueOf(x2) + " B-AND " + String.valueOf(x1) + " = " + String.valueOf(x1) + " FALSE");
        }
        x1.set(String.valueOf((x2)));
        /* RAW: B-XOR X3 ) + 1 */
        CobolDisplay.display("(" + String.valueOf(x2) + " B-XOR " + String.valueOf(x3) + ") + 1 is ");
    }

    private void x1_4() {
        x1.set(String.valueOf(x2));
        /* RAW: B-XOR ( X3 + 1 ) */
        CobolDisplay.display(String.valueOf(x2) + " B-XOR (" + String.valueOf(x3) + " + 1) is ");
    }

    private void x1_5() {
        _09.set(String.valueOf(x));
        to.set(String.valueOf(x));
    }

    private void x3_3() {
        _0.set(String.valueOf(x));
        e.set(String.valueOf(x));
        to.set(String.valueOf(x));
    }

    private void x2() {
        x1.set(String.valueOf(x2));
        /* RAW: B-AND  */
    }

    private void x3_4() {
        CobolDisplay.display(String.valueOf(x2) + " B-AND " + String.valueOf(x3) + " is ");
    }

    private void x1_6() {
        x1.set(String.valueOf(b_not));
    }

    private void x2_2() {
        CobolDisplay.display("B-NOT " + String.valueOf(x2) + " is ");
    }

    private void x1_7() {
        x1.set(String.valueOf(b_not));
        /* RAW: x 22 */
        CobolDisplay.display("B-NOT x#22 is ");
    }

    private void x1_8() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions092BitOperations().run();
    }
}
