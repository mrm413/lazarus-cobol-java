package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc145NumericMoveWithWithoutFbinaryTruncate extends CobolProgram {
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
    private short x = (short) 0;



    // SECTION: check-x-val
    private void check_x_val() {
        evaluate();
        when();
        when();
        when();
        when();
        end_evaluate();
    }

    private void evaluate() {
        /* RAW: x  */
    }

    private void when() {
        /* RAW: 30000  */
        CobolDisplay.display("x IS 30000");
    }

    private void when_2() {
        /* RAW: >= 10000 */
        CobolDisplay.display("x >= 10000");
    }

    private void when_3() {
        /* RAW: ZERO  */
        CobolDisplay.display("x IS ZERO");
    }

    private void when_4() {
        /* RAW: OTHER  */
        /* CONTINUE */
    }

    private void end_evaluate() {
    }

    private void para_main() {
        x = new BigDecimal(String.valueOf(30000).trim()).shortValue();
        check_x_val();
        x = new BigDecimal(String.valueOf(30000).trim()).shortValue();
        check_x_val();
        x = new BigDecimal(String.valueOf(0).trim()).shortValue();
        x = new BigDecimal(String.valueOf(x + 30000).trim()).shortValue();
        check_x_val();
        return;
    }

    @Override
    public void run() {
        evaluate();
    }

    public static void main(String[] args) {
        new RunMisc145NumericMoveWithWithoutFbinaryTruncate().run();
    }
}
