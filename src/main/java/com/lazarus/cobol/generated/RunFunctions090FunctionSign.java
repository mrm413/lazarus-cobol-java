package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions090FunctionSign extends CobolProgram {
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
    private int z = 0;
    private double f = 0.0;



    private void para_main() {
    }

    private void z() {
        if (z != 1) {
            CobolDisplay.display("Sign 1 ");
            /* RAW: Z  */
        }
    }

    private void z_2() {
        if (z != 0) {
            CobolDisplay.display("Sign 2 ");
            /* RAW: Z  */
        }
    }

    private void z_3() {
        if (z != 0) {
            CobolDisplay.display("Sign 3 ");
            /* RAW: Z  */
        }
    }

    private void z_4() {
        if (z != -1) {
            CobolDisplay.display("Sign 4 ");
            /* RAW: Z  */
        }
        f = Double.parseDouble(String.valueOf(3.12345).trim());
    }

    private void z_5() {
        if (z != 1) {
            CobolDisplay.display("Sign 5 ");
            /* RAW: Z  */
        }
        f = Double.parseDouble(String.valueOf(0).trim());
    }

    private void z_6() {
        if (z != 0) {
            CobolDisplay.display("Sign 6 ");
            /* RAW: Z  */
        }
        f = Double.parseDouble(String.valueOf(-3.12345).trim());
    }

    private void z_7() {
        if (z != -1) {
            CobolDisplay.display("Sign 7 ");
            /* RAW: Z  */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions090FunctionSign().run();
    }
}
