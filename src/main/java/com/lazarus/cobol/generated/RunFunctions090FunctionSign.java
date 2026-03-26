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
        z = new BigDecimal(String.valueOf(CobolIntrinsics.sign(3.12345)).trim()).intValue();
        if (z != 1) {
            CobolDisplay.display("Sign 1 " + String.valueOf(z));
        }
        z = new BigDecimal(String.valueOf(CobolIntrinsics.sign(0)).trim()).intValue();
        if (z != 0) {
            CobolDisplay.display("Sign 2 " + String.valueOf(z));
        }
        z = new BigDecimal(String.valueOf(CobolIntrinsics.sign(0)).trim()).intValue();
        if (z != 0) {
            CobolDisplay.display("Sign 3 " + String.valueOf(z));
        }
        z = new BigDecimal(String.valueOf(CobolIntrinsics.sign(-3.12345)).trim()).intValue();
        if (z != -1) {
            CobolDisplay.display("Sign 4 " + String.valueOf(z));
        }
        f = Double.parseDouble(String.valueOf(3.12345).trim());
        z = new BigDecimal(String.valueOf(CobolIntrinsics.sign(f)).trim()).intValue();
        if (z != 1) {
            CobolDisplay.display("Sign 5 " + String.valueOf(z));
        }
        f = Double.parseDouble(String.valueOf(0).trim());
        z = new BigDecimal(String.valueOf(CobolIntrinsics.sign(f)).trim()).intValue();
        if (z != 0) {
            CobolDisplay.display("Sign 6 " + String.valueOf(z));
        }
        f = Double.parseDouble(String.valueOf(-3.12345).trim());
        z = new BigDecimal(String.valueOf(CobolIntrinsics.sign(f)).trim()).intValue();
        if (z != -1) {
            CobolDisplay.display("Sign 7 " + String.valueOf(z));
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
