package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions047SwitchesWithNonStandardNames extends CobolProgram {
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
    private int cb_switch = 0;
    private static final int z = 11;


    private CobolString swit1_on = new CobolString(256); // fallback
    private CobolString swit2_on = new CobolString(256); // fallback
    private CobolString switch_b = new CobolString(256); // fallback
    private CobolString off = new CobolString(256); // fallback
    private CobolString swit25_on = new CobolString(256); // fallback
    private CobolString swit26_on = new CobolString(256); // fallback
    private CobolString swit31_on = new CobolString(256); // fallback
    private CobolString swit32_on = new CobolString(256); // fallback

    private void para_main() {
        cb_switch = new BigDecimal(String.valueOf(cb_switch + 1).trim()).intValue();
        if (cb_switch != 13) {
            CobolDisplay.display("SWITCH (variable) + 1 WRONG: " + String.valueOf(cb_switch));
        }
        cb_switch = new BigDecimal(String.valueOf(cb_switch + z).trim()).intValue();
        if (cb_switch != 24) {
            CobolDisplay.display("SWITCH (variable) + Z WRONG: " + String.valueOf(cb_switch));
        }
        if (!String.valueOf(swit1_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing("ON");
        } else {
            CobolDisplay.displayNoAdvancing("OFF");
        }
        if (!String.valueOf(swit2_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        switch_b.set(String.valueOf(off));
        if (!String.valueOf(swit2_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!String.valueOf(swit25_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!String.valueOf(swit26_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!String.valueOf(swit31_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!String.valueOf(swit32_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions047SwitchesWithNonStandardNames().run();
    }
}
