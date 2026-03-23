package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental081UseForDebuggingNoDebuggingMode extends CobolProgram {
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


    // SECTION: TEST-DEBUG
    private void test_debug() {
        use();
        procedures();
    }

    private void use() {
        /* RAW: FOR DEBUGGING ON ALL */
    }

    private void procedures() {
        CobolDisplay.display(String.valueOf(debug_item));
    }

    private void first_par() {
        CobolDisplay.display("OK1");
        second_par();
        return;
    }

    private void second_par() {
        CobolDisplay.display("OK2");
    }

    private void third_par() {
        CobolDisplay.display("OK3");
        first_par(); // THRU SECOND-PAR
        second_par();
        CobolDisplay.display("OK4");
        second_par();
        CobolDisplay.display("OK5");
        System.exit(0);
    }

    @Override
    public void run() {
        first_par();
    }

    public static void main(String[] args) {
        new RunFundamental081UseForDebuggingNoDebuggingMode().run();
    }
}
