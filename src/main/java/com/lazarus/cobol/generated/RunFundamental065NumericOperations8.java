package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental065NumericOperations8 extends CobolProgram {
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
    private CobolString compute_data = new CobolString(1); // Group: COMPUTE-DATA
    private int compute_8 = 0;



    private void para_main() {
        compute_8 = new BigDecimal(String.valueOf(Math.pow(((((((24 + 1)) * ((60 - 10)))) / 125)), 2)).trim()).intValue();
        if (compute_8 != 100) {
            CobolDisplay.display("COMPUTE with wrong result: " + String.valueOf(compute_8));
        }
        compute_8 = new BigDecimal(String.valueOf((55 / (((1 - 2) + 1)))).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        compute_8 = new BigDecimal(String.valueOf(Math.pow(0, 1)).trim()).intValue();
        if (compute_8 != 0) {
            CobolDisplay.display("0 ** 1 <> 0: " + String.valueOf(compute_8));
        }
        compute_8 = new BigDecimal(String.valueOf(Math.pow(55, 0)).trim()).intValue();
        if (compute_8 != 1) {
            CobolDisplay.display("55 ** 0 <> 1: " + String.valueOf(compute_8));
        }
        compute_8 = new BigDecimal(String.valueOf(Math.pow(1, 55)).trim()).intValue();
        if (compute_8 != 1) {
            CobolDisplay.display("11 ** 55 <> 1: " + String.valueOf(compute_8));
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental065NumericOperations8().run();
    }
}
