package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize006ValueForGroupItemWithValue extends CobolProgram {
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

    private CobolString g = new CobolString(256); // fallback
    private CobolString add = new CobolString(256); // fallback
    private CobolString to = new CobolString(256); // fallback
    private CobolString failed = new CobolString(256); // fallback
    private CobolString display = new CobolString(256); // fallback

    private void para_main() {
        if (!String.valueOf(g).equals(String.valueOf("09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ"))) {
            CobolDisplay.display("Compile failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("     should be: " + String.valueOf((0 /* non-numeric literal: 09Y9Y9Y9Y9YZ09Y9Y9Y9 */ * Integer.parseInt(String.valueOf(add).trim()))) + String.valueOf(1) + String.valueOf(to) + String.valueOf(failed));
        }
        g.set("");
        if (!String.valueOf(g).equals(String.valueOf("00 0 0 0 0  00 0 0 0 0  00 0 0 0 0  "))) {
            CobolDisplay.display("INITIALIZE failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("        should be: " + String.valueOf((0 /* non-numeric literal: 00 0 0 0 0  00 0 0 0 */ * Integer.parseInt(String.valueOf(add).trim()))) + String.valueOf(1) + String.valueOf(to) + String.valueOf(failed));
        }
        g.set("");
        if (!String.valueOf(g).equals(String.valueOf("09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ"))) {
            CobolDisplay.display("INIT VALUE failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("        should be: " + String.valueOf((0 /* non-numeric literal: 09Y9Y9Y9Y9YZ09Y9Y9Y9 */ * Integer.parseInt(String.valueOf(add).trim()))) + String.valueOf(1) + String.valueOf(to) + String.valueOf(failed));
        }
        /* RAW: *  */
        if (String.valueOf(failed).equals(String.valueOf((0 * Integer.parseInt(String.valueOf(display).trim()))))) {
            /* RAW: "All INITIALIZE tests passed." * */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunInitialize006ValueForGroupItemWithValue().run();
    }
}
