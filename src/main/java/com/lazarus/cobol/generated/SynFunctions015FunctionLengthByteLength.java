package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFunctions015FunctionLengthByteLength extends CobolProgram {
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
    private CobolString physical = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private void para_main() {
        // KNOWN_ISSUE: CobolDisplay.display(String.valueOf(CobolIntrinsics.length("abcd", _filler_002, "xyz")));
        // KNOWN_ISSUE: CobolDisplay.display(String.valueOf(CobolIntrinsics.byte_length("abcd", _filler_003, "xyz")));
        // KNOWN_ISSUE: CobolDisplay.display(String.valueOf(CobolIntrinsics.length("abcd", "xyz")));
        CobolDisplay.display(String.valueOf(CobolIntrinsics.byte_length(1234)));
        CobolDisplay.display(String.valueOf(CobolIntrinsics.length(567)));
        // KNOWN_ISSUE: CobolDisplay.display(String.valueOf(CobolIntrinsics.length("abcd", _filler_004, "xyz", physical)));
        // KNOWN_ISSUE: CobolDisplay.display(String.valueOf(CobolIntrinsics.byte_length("abcd", _filler_005, "xyz", physical)));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFunctions015FunctionLengthByteLength().run();
    }
}
