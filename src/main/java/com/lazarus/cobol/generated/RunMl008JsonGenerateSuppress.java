package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl008JsonGenerateSuppress extends CobolProgram {
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
    private CobolString a = new CobolString(1); // Group: a
    private CobolString b = new CobolString(3);
    private CobolString c = new CobolString(3);
    private CobolString x = new CobolString(1); // Group: x
    private CobolString y = new CobolString(1); // Group: y
    private CobolString z = new CobolString(1);
    private CobolString out = new CobolString(100);



    private void para_main() {
        /* UNSUPPORTED: XML/JSON processing — JSON */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("{\"a\":{\"c\":\" \"}}"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(out));
        }
        /* UNSUPPORTED: XML/JSON processing — JSON */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("{\"x\":{}}"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(out));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMl008JsonGenerateSuppress().run();
    }
}
