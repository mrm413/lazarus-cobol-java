package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynLiterals003FloatingPointLiterals extends CobolProgram {
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

    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString d3 = new CobolString(256); // fallback
    private CobolString blah = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private void para_main() {
        // KNOWN_ISSUE: CobolDisplay.display(String.valueOf(Infinity) + String.valueOf(_filler_002) + String.valueOf(1000) + String.valueOf(_filler_003) + String.valueOf(0) + String.valueOf(_filler_004) + String.valueOf(123));
        /* RAW: E1 , +.123456789012345678901234567890123456E+0000 */
        CobolDisplay.display(String.valueOf(1) + String.valueOf(d3));
        CobolDisplay.display(String.valueOf(1000));
        CobolDisplay.display("1.0E3" + String.valueOf(blah));
        CobolDisplay.display(String.valueOf(1000) + String.valueOf(0));
        CobolDisplay.display(String.valueOf(0));
        CobolDisplay.display(String.valueOf(1000));
        CobolDisplay.display(String.valueOf(0.12345678901234568));
        CobolDisplay.display(String.valueOf(0));
        // KNOWN_ISSUE: CobolDisplay.display(String.valueOf(Infinity));
        CobolDisplay.display(String.valueOf(0));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynLiterals003FloatingPointLiterals().run();
    }
}
