package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataBinary009PppComp5 extends CobolProgram {
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
    private CobolString xs = new CobolString(1); // Group: XS
    private short x_1 = (short) 0;
    private short x_2 = (short) 0;
    private CobolString x_3 = new CobolString(1);
    private BigDecimal x_4 = BigDecimal.ZERO;
    private short d_1 = (short) 0;
    private short d_2 = (short) 0;



    private void para_main() {
        CobolDisplay.display("INIT X-1 : " + String.valueOf(x_1) + " .");
        CobolDisplay.display("INIT X-2 : " + String.valueOf(x_2) + " .");
        CobolDisplay.display("INIT X-4 : " + String.valueOf(x_4) + " .");
        CobolDisplay.display("INIT D-1 : " + String.valueOf(d_1) + " .");
        x_2 = new BigDecimal(String.valueOf(d_1).trim()).shortValue();
        x_1 = new BigDecimal(String.valueOf(d_1).trim()).shortValue();
    }

    private void d_1() {
        CobolDisplay.display("MOVE X-1 : " + String.valueOf(x_1) + " .");
        CobolDisplay.display("MOVE X-2 : " + String.valueOf(x_2) + " .");
        x_4 = new BigDecimal(String.valueOf(0.000256).trim());
        CobolDisplay.display("MOVE X-4 : " + String.valueOf(x_4) + " .");
        CobolDisplay.display("MOVE D-1 : " + String.valueOf(d_1) + " .");
        x_2 = new BigDecimal(String.valueOf(d_2).trim()).shortValue();
        x_1 = new BigDecimal(String.valueOf(d_2).trim()).shortValue();
        CobolDisplay.display("MOVE X-1 : " + String.valueOf(x_1) + ":" + String.valueOf(d_2) + " .");
        CobolDisplay.display("MOVE X-2 : " + String.valueOf(x_2) + ":" + String.valueOf(d_2) + " .");
    }

    private void x_1() {
        if (x_1 != 98000) {
            CobolDisplay.display("MOVE 98000 failed: ");
            /* RAW: X-1  */
        }
        d_1 = new BigDecimal(String.valueOf(98000).trim()).shortValue();
        if (d_1 != 98000) {
            CobolDisplay.display("MOVE 98000 failed: ");
            /* RAW: D-1  */
        }
        x_1 = new BigDecimal(String.valueOf(x_1 + 1000).trim()).shortValue();
        if (x_1 != 99000) {
            CobolDisplay.display("+ 1000 failed: ");
            /* RAW: X-1  */
        }
        x_1 = new BigDecimal(String.valueOf(x_1 - 4000).trim()).shortValue();
        if (x_1 != 95000) {
            CobolDisplay.display("- 4000 failed: ");
            /* RAW: X-1  */
        }
        /* DIVIDE without GIVING — needs runtime */
        if (x_1 != 31000) {
            CobolDisplay.display("/ 3 failed: ");
            /* RAW: X-1  */
        }
        x_1 = new BigDecimal(String.valueOf(2 * x_1).trim()).shortValue();
        if (x_1 != 62000) {
            CobolDisplay.display("* 2 failed: ");
            /* RAW: X-1  */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataBinary009PppComp5().run();
    }
}
