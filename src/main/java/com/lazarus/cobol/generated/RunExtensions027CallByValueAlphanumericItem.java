package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions027CallByValueAlphanumericItem extends CobolProgram {
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
    private CobolString x = new CobolString(2);



    // SECTION: LINKAGE
    private void linkage() {
        _01();
        y();
        y();
    }

    private void _01() {
        /* RAW: Y PIC XX */
        /* RAW: PROCEDURE DIVISION USING BY VALUE */
    }

    private void y() {
    }

    private void y_2() {
        return;
    }

    private void para_main() {
        CobolProgram.call("prog2", x);
        if (!String.valueOf(x).equals(String.valueOf("OK"))) {
            CobolDisplay.displayNoAdvancing(String.valueOf(x));
        }
        System.exit(0);
    }

    private void program_id() {
    }

    private void prog2() {
        /* RAW: DATA  */
    }

    private void division() {
    }

    @Override
    public void run() {
        _01();
    }

    public static void main(String[] args) {
        new RunExtensions027CallByValueAlphanumericItem().run();
    }
}
