package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl001XmlGenerateSuppress extends CobolProgram {
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
    private CobolString p = new CobolString(1); // Group: p
    private int q = 0;
    private CobolString r = new CobolString(3);
    private CobolString x = new CobolString(1); // Group: x
    private CobolString y = new CobolString(1); // Group: y
    private CobolString z = new CobolString(1);
    private CobolString out = new CobolString(100);


    private CobolString xml = new CobolString(256); // fallback

    private void para_main() {
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* RAW: SPACES  */
        if (!String.valueOf(out).equals(String.valueOf("<a/>"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(out));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* RAW: SPACES  */
        if (!String.valueOf(out).equals(String.valueOf("<a><c> </c></a>"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(out));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* RAW: SPACES  */
        if (!String.valueOf(out).equals(String.valueOf("<a/>"))) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(out));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* RAW: ZERO  */
        if (!String.valueOf(out).equals(String.valueOf("<p r=\"abc\"/>"))) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(out));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* RAW: LOW-VALUES , c */
        /* RAW: SPACES , c */
        /* RAW: LOW-VALUES , EVERY ELEMENT */
        /* RAW: SPACES  */
        if (!String.valueOf(out).equals(String.valueOf("<a><c> </c></a>"))) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(out));
        }
        b.set(String.valueOf("\uFFFF"));
        c.set(String.valueOf("\u0000"));
        xml.set(String.valueOf("\u0000"));
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* RAW: HIGH-VALUES OR LOW-VALUES OR ZEROES OR */
        if (!String.valueOf(out).equals(String.valueOf("<a/>"))) {
            CobolDisplay.display("Test 6 failed: " + String.valueOf(out));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* RAW: SPACE  */
        if (!String.valueOf(out).equals(String.valueOf("<x/>"))) {
            CobolDisplay.display("Test 7 failed: " + String.valueOf(out));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMl001XmlGenerateSuppress().run();
    }
}
