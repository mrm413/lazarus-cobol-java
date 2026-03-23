package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynScreen003AcceptDisplayExtensionsDetection extends CobolProgram {
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
    private CobolString zero_const = new CobolString(1);
    private int x = 0;


    private CobolString at = new CobolString(256);
    private CobolString line = new CobolString(256);
    private CobolString column = new CobolString(256);
    private CobolString scr = new CobolString(256);
    private CobolString underline = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        CobolDisplay.display("hello" + String.valueOf(at) + String.valueOf(0));
        CobolDisplay.display("world" + String.valueOf(line) + 0 + String.valueOf(column) + String.valueOf(zero_const));
        x = new BigDecimal(String.valueOf(CobolDisplay.accept()).trim()).intValue();
        /* RAW: WITH TIME-OUT 5 */
        CobolDisplay.display(String.valueOf(scr) + String.valueOf(underline));
        scr.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: WITH HIGHLIGHT */
        CobolDisplay.display(String.valueOf(scr) + String.valueOf(_unnamed) + String.valueOf(scr));
        CobolDisplay.display(String.valueOf(scr));
        scr.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: AT LINE 4 COLUMN 4 */
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynScreen003AcceptDisplayExtensionsDetection().run();
    }
}
