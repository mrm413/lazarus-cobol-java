package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl003XmlGenerateRecordSelection extends CobolProgram {
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
    private CobolString b = new CobolString(1); // Group: b
    private CobolString c1 = new CobolString(3);
    private int c2 = 0;
    private CobolString d = new CobolString(1); // Group: d
    private CobolString e = new CobolString(6);
    private CobolString[] f = new CobolString[3];
    private CobolString out = new CobolString(60);



    private void para_main() {
        /* RAW: XML  */
        /* RAW: GENERATE out FROM d */
        if (!String.valueOf(out).equals(String.valueOf("<d><e>abc000</e></d>"))) {
            CobolDisplay.display("Failed 2: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMl003XmlGenerateRecordSelection().run();
    }
}
