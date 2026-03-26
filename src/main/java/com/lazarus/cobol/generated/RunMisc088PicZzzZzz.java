package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc088PicZzzZzz extends CobolProgram {
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
    private CobolString x_zzzn = new CobolString(4);
    private CobolString xzn_red = new CobolString(4);
    private CobolString x_zzzp = new CobolString(4);
    private CobolString xzp_red = new CobolString(4);



    private void para_main() {
        x_zzzn.set(String.valueOf(-1));
        if (!String.valueOf(xzn_red).equals(String.valueOf("  1-"))) {
            CobolDisplay.display("(" + String.valueOf(x_zzzn) + ")");
        }
        x_zzzn.set(String.valueOf(0));
        if (!String.valueOf(xzn_red).equals(String.valueOf("    "))) {
            CobolDisplay.display("(" + String.valueOf(x_zzzn) + ")");
        }
        x_zzzn.set(String.valueOf(1));
        if (!String.valueOf(xzn_red).equals(String.valueOf("  1 "))) {
            CobolDisplay.display("(" + String.valueOf(x_zzzn) + ")");
        }
        x_zzzp.set(String.valueOf(-1));
        if (!String.valueOf(xzp_red).equals(String.valueOf("  1-"))) {
            CobolDisplay.display("(" + String.valueOf(x_zzzp) + ")");
        }
        x_zzzp.set(String.valueOf(0));
        if (!String.valueOf(xzp_red).equals(String.valueOf("    "))) {
            CobolDisplay.display("(" + String.valueOf(x_zzzp) + ")");
        }
        x_zzzp.set(String.valueOf(1));
        if (!String.valueOf(xzp_red).equals(String.valueOf("  1+"))) {
            CobolDisplay.display("(" + String.valueOf(x_zzzp) + ")");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc088PicZzzZzz().run();
    }
}
