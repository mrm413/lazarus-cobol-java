package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions085CobolxFormat extends CobolProgram {
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

    private CobolString ddisplay = new CobolString(256); // fallback
    private CobolString d = new CobolString(256); // fallback
    private CobolString trucated = new CobolString(256); // fallback
    private CobolString alphanumeric = new CobolString(256); // fallback
    private CobolString literals = new CobolString(256); // fallback
    private CobolString are = new CobolString(256); // fallback
    private CobolString not = new CobolString(256); // fallback
    private CobolString padded = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: /  */
        CobolDisplay.display("Hello!");
        CobolDisplay.display("Hi!" + String.valueOf(ddisplay) + "Hey!" + String.valueOf(d));
        CobolDisplay.display(String.valueOf((0 /* non-numeric literal: Bye! */ * Integer.parseInt(String.valueOf(trucated).trim()))) + String.valueOf(alphanumeric) + String.valueOf(literals) + String.valueOf(are) + String.valueOf(not) + String.valueOf(padded) + " ");
        CobolDisplay.display(String.valueOf((0 /* non-numeric literal:         20        30 */ - 0 /* non-numeric literal:        140       150 */)));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions085CobolxFormat().run();
    }
}
