package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc168FloatLongWithSizeError extends CobolProgram {
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

    private CobolString doublevalue = new CobolString(256);
    private CobolString lastdoublevalue = new CobolString(256);
    private CobolString counter = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);

    // SECTION: main
    private void para_main() {
        perform();
        end_perform();
    }

    private void perform() {
        /* RAW: varying counter from 1 by 1 */
        doublevalue.set(String.valueOf((Integer.parseInt(String.valueOf(doublevalue).trim()) * 2)));
        /* ON SIZE ERROR handling — needs runtime overflow detection */
    }

    private void end_perform() {
        if (!((Integer.parseInt(String.valueOf(counter).trim()) >= 1023 && !String.valueOf(_unnamed).trim().isEmpty()))) {
            /* RAW: 1025 ) */
            CobolDisplay.display(" ");
            CobolDisplay.display("counter is " + String.valueOf(counter));
        }
        return;
    }

    @Override
    public void run() {
        perform();
    }

    public static void main(String[] args) {
        new RunMisc168FloatLongWithSizeError().run();
    }
}
