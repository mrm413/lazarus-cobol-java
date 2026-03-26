package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions037FunctionFormattedTimeWithRefModding extends CobolProgram {
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
    private CobolString str = new CobolString(4);


    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString _3 = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _4 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString to = new CobolString(256); // fallback

    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private void para_main() {
        _filler_004.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        _3.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        _filler_005.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        _4.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        _filler_006.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        to.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        if (!String.valueOf(str).equals(String.valueOf("3456"))) {
            CobolDisplay.display(String.valueOf(str));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions037FunctionFormattedTimeWithRefModding().run();
    }
}
