package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile040SystemRoutinesForFilesFilenameMapping extends CobolProgram {
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
    private CobolString fname = new CobolString(256);
    private CobolString ret = new CobolString(1);
    private CobolString fhandle = new CobolString(4);
    private CobolString offset = new CobolString(8);
    private CobolString nbytes = new CobolString(4);
    private CobolString read_buffer = new CobolString(10);


    private CobolString trailing = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: CHAINING FNAME */
        CobolDisplay.display("RUN WITH " + String.valueOf(CobolIntrinsics.trim(fname, trailing)));
        CobolProgram.call("CBL_OPEN_FILE", fname, 1, 0, 0, fhandle);
        if (return_code != 0) {
            CobolDisplay.display("error opening file ...");
            return_code = new BigDecimal(String.valueOf(0).trim()).intValue();
            System.exit(0);
        }
        CobolProgram.call("CBL_CLOSE_FILE", fhandle);
        if (return_code != 0) {
            CobolDisplay.display("error closing file ..." + String.valueOf(return_code));
            return_code = new BigDecimal(String.valueOf(0).trim()).intValue();
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile040SystemRoutinesForFilesFilenameMapping().run();
    }
}
