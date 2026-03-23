package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc060MissingPeriods extends CobolProgram {
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
    private float done = 0.0f;



    // SECTION: MAIN
    private void para_main() {
        perform();
        sec_1();
    }

    private void perform() {
    }

    private void sec_1() {
        if (!(done == 1)) {
            CobolDisplay.display("SEC-1 NOT EXECUTED");
        }
        System.exit(0);
    }

    // SECTION: SEC-1
    private void sec_1_2() {
        move();
    }

    private void move() {
        /* RAW: 1 TO DONE */
        return;
    }

    @Override
    public void run() {
        perform();
    }

    public static void main(String[] args) {
        new SynMisc060MissingPeriods().run();
    }
}
