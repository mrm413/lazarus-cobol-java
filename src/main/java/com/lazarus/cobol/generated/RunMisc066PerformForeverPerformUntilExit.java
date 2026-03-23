package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc066PerformForeverPerformUntilExit extends CobolProgram {
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
    private int indval = 0;



    private void a01() {
        indval = new BigDecimal(String.valueOf(0).trim()).intValue();
        while (true) {
            indval = new BigDecimal(String.valueOf(indval + 1).trim()).intValue();
            if (indval > 2) {
                break;
            }
        }
        if (indval != 3) {
            CobolDisplay.display("1: " + String.valueOf(indval));
        }
        while (true) {
            indval = new BigDecimal(String.valueOf(indval + 1).trim()).intValue();
            if (indval > 4) {
                break;
            }
        }
        if (indval != 5) {
            CobolDisplay.display("2: " + String.valueOf(indval));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        a01();
    }

    public static void main(String[] args) {
        new RunMisc066PerformForeverPerformUntilExit().run();
    }
}
