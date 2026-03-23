package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc059PerformVaryingFloat extends CobolProgram {
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
    private double i = 0.0;



    private void para_main() {
        for (i = 1; !(i > 5); i += 1) {
            CobolDisplay.displayNoAdvancing(String.valueOf(i) + " ");
        }
        CobolDisplay.display("Test Part 1 Completed");
        for (i = 1; !(i > 5); i += 1) {
            CobolDisplay.displayNoAdvancing(String.valueOf(i) + " ");
        }
        CobolDisplay.display("Test Part 2 Completed");
        for (i = 5; !(i < 1); i += -1) {
            CobolDisplay.displayNoAdvancing(String.valueOf(i) + " ");
        }
        CobolDisplay.display("Test Part 3 Completed");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc059PerformVaryingFloat().run();
    }
}
