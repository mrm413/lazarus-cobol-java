package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental098ConditionIsZeroAnd extends CobolProgram {
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
    private int v = 0;
    private int w = 0;



    private void para_main() {
        if (CobolIntrinsics.isZero(v)) {
            CobolDisplay.display("V IS ZERO");
        }
        if ((CobolIntrinsics.isZero(v) && w == 1)) {
            CobolDisplay.display("V IS ZERO AND W EQUAL 1");
        }
        if ((w == 1 && CobolIntrinsics.isZero(v))) {
            CobolDisplay.display("W EQUAL 1 AND V IS ZERO");
        }
        if (CobolIntrinsics.isPositive(w)) {
            CobolDisplay.display("W IS POSITIVE");
        }
        if (CobolIntrinsics.isNegative(w)) {
            CobolDisplay.display("W IS NEGATIVE");
        }
        if ((CobolIntrinsics.isPositive(w) && v == 0)) {
            CobolDisplay.display("W IS POSITIVE AND V EQUAL 0");
        }
        if ((v == 0 && CobolIntrinsics.isPositive(w))) {
            CobolDisplay.display("V EQUAL 0 AND W IS POSITIVE");
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental098ConditionIsZeroAnd().run();
    }
}
