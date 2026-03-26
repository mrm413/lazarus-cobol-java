package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl009JsonGenerateExceptions extends CobolProgram {
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
    private CobolString normal_str = new CobolString(200);
    private CobolString valid_rec = new CobolString(1); // Group: valid-rec
    private CobolString a = new CobolString(2);
    private CobolString b = new CobolString(2);
    private CobolString short_str = new CobolString(5);
    private int json_len = 0;


    private CobolString json_code = new CobolString(256); // fallback

    private void para_main() {
        /* UNSUPPORTED: XML/JSON processing — JSON */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (((!String.valueOf(short_str).equals(String.valueOf("{\"val")) || json_len != 33) || !String.valueOf(json_code).equals(String.valueOf(1)))) {
            CobolDisplay.display("Failed 1: " + String.valueOf(short_str) + " " + String.valueOf(json_len) + " " + String.valueOf(json_code));
        }
        /* UNSUPPORTED: XML/JSON processing — JSON */
        /* UNSUPPORTED: Report Writer — GENERATE */
        CobolDisplay.display("Failed 2: EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(json_code));
        /* RAW: ON EXCEPTION */
        if (!String.valueOf(json_code).equals(String.valueOf(0))) {
            CobolDisplay.display("Failed 2: NOT EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(json_code));
        }
        /* RAW: END-JSON JSON */
        /* UNSUPPORTED: Report Writer — GENERATE */
        CobolDisplay.display("Failed 3: NOT EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(json_code));
        /* RAW: EXCEPTION  */
        if (!String.valueOf(json_code).equals(String.valueOf(1))) {
            CobolDisplay.display("Failed 3: ON EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(json_code));
        }
    }

    private void end_json() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMl009JsonGenerateExceptions().run();
    }
}
