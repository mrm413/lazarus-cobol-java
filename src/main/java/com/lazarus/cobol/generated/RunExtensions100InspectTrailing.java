package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions100InspectTrailing extends CobolProgram {
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
    private CobolString w01_string = new CobolString(20);
    private short w01_index = (short) 0;



    private void para_main() {
        w01_index = new BigDecimal(String.valueOf(0).trim()).shortValue();
        /* INSPECT W01-STRING — 2 clause(s) */
        if (w01_index != 10) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 1");
        }
        /* INSPECT W01-STRING — 2 clause(s) */
        if (!String.valueOf(w01_string).equals(String.valueOf("0123456789AAAAAAAAAA"))) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 2");
        }
        w01_index = new BigDecimal(String.valueOf(0).trim()).shortValue();
        /* INSPECT W01-STRING — 4 clause(s) */
        if (!String.valueOf(w01_string).equals(String.valueOf("0123456789BBBBBBBBBB"))) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 3");
        }
        w01_index = new BigDecimal(String.valueOf(0).trim()).shortValue();
        w01_string.set(String.valueOf(" "));
        /* INSPECT W01-STRING — 2 clause(s) */
        if (w01_index != 0) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 4" + String.valueOf(w01_index));
        }
        w01_index = new BigDecimal(String.valueOf(0).trim()).shortValue();
        w01_string.set(String.valueOf(" "));
        /* INSPECT W01-STRING — 2 clause(s) */
        if (w01_index != 20) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 5" + String.valueOf(w01_index));
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions100InspectTrailing().run();
    }
}
