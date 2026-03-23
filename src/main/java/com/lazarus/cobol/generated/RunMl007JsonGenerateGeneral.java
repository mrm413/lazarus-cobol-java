package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl007JsonGenerateGeneral extends CobolProgram {
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
    private CobolString out = new CobolString(200);
    private CobolString rec = new CobolString(1); // Group: rec
    private CobolString a = new CobolString(3);
    private CobolString b = new CobolString(3);
    private CobolString c = new CobolString(1); // Group: c
    private CobolString d = new CobolString(3);


    private CobolString json = new CobolString(256);

    private void para_main() {
        /* RAW: JSON  */
        /* RAW: GENERATE out FROM rec NAME OF */
        if (!String.valueOf(out).equals(String.valueOf("{\"rec\":{\"alpha\":\"A\",\"b\":\"BBB\"}}"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: JSON  */
        /* RAW: GENERATE out FROM rec NAME OF */
        if (!String.valueOf(out).equals(String.valueOf("{\"alpha\":\"A\",\"b\":\"BBB\"}"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: JSON  */
        /* RAW: GENERATE out FROM d */
        if (!String.valueOf(out).equals(String.valueOf("{\"d\":\" \"}"))) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: JSON  */
        /* RAW: GENERATE out FROM c */
        if (!String.valueOf(out).equals(String.valueOf("{\"c\":{\"d\":\" \"}}"))) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        d.set(String.valueOf("QUOTES"));
        json.set(String.valueOf("QUOTES"));
        /* RAW: GENERATE out FROM d */
        if (!String.valueOf(out).equals(String.valueOf("{\"d\":\"\\\"\\\"\\\"\"}"))) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMl007JsonGenerateGeneral().run();
    }
}
