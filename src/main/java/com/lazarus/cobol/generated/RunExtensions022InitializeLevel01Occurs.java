package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions022InitializeLevel01Occurs extends CobolProgram {
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
    private CobolString[] l1 = new CobolString[1000]; // Group: L1
    private int[] l2 = new int[1000];
    private int[] l3 = new int[1000];
    private CobolString[] init = new CobolString[3];


    private CobolString cb_default = new CobolString(256); // fallback

    private void para_main() {
        if (l2[3 - 1] != 5) {
            CobolDisplay.display("0 VALUE(3) = " + String.valueOf(l2[3 - 1]));
        }
        if (l1[1 - 1] == null) l1[1 - 1] = new CobolString(1);
        l1[1 - 1].set("");
        if (l2[1 - 1] != 0) {
            CobolDisplay.display("1 VALUE(1) = " + String.valueOf(l2[1 - 1]));
        }
        if (l2[3 - 1] != 5) {
            CobolDisplay.display("1 VALUE(3) = " + String.valueOf(l2[3 - 1]));
        }
        if (l1[1 - 1] == null) l1[1 - 1] = new CobolString(1);
        l1[1 - 1].set("");
        cb_default.set("");
        if (l2[1 - 1] != 0) {
            CobolDisplay.display("2 VALUE(1) = " + String.valueOf(l2[1 - 1]));
        }
        if (l2[3 - 1] != 5) {
            CobolDisplay.display("2 VALUE(3) = " + String.valueOf(l2[3 - 1]));
        }
        if (l1[1 - 1] == null) l1[1 - 1] = new CobolString(1);
        l1[1 - 1].set("");
        if (l2[1 - 1] != 5) {
            CobolDisplay.display("3 VALUE(1) = " + String.valueOf(l2[1 - 1]));
        }
        if (l2[3 - 1] != 5) {
            CobolDisplay.display("3 VALUE(3) = " + String.valueOf(l2[3 - 1]));
        }
        if (!String.valueOf(init[1 - 1]).equals(String.valueOf(" "))) {
            CobolDisplay.display("INIT1 NOT = SPACES");
        }
        if (!String.valueOf(init[3 - 1]).equals(String.valueOf(" "))) {
            CobolDisplay.display("INIT3 NOT = SPACES");
        }
        if (init[1 - 1] == null) init[1 - 1] = new CobolString(256);
        init[1 - 1].set(String.valueOf("*"));
        if (init[2 - 1] == null) init[2 - 1] = new CobolString(256);
        init[2 - 1].set(String.valueOf("*"));
        if (init[3 - 1] == null) init[3 - 1] = new CobolString(256);
        init[3 - 1].set(String.valueOf("*"));
        if (!String.valueOf(CobolString.refMod(init[2 - 1], 50, 5)).equals(String.valueOf("*****"))) {
            CobolDisplay.display("INIT2 BADVAL");
        }
        if (init[2 - 1] == null) init[2 - 1] = new CobolString(1);
        init[2 - 1].set("");
        if (!String.valueOf(init[2 - 1]).equals(String.valueOf(" "))) {
            CobolDisplay.display("INIT2 NOT = SPACES");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions022InitializeLevel01Occurs().run();
    }
}
