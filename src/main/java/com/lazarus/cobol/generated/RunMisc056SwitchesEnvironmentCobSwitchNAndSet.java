package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc056SwitchesEnvironmentCobSwitchNAndSet extends CobolProgram {
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

    private CobolString swit1_on = new CobolString(256); // fallback
    private CobolString swit2_on = new CobolString(256); // fallback
    private CobolString swit3_on = new CobolString(256); // fallback
    private CobolString swit4_off = new CobolString(256); // fallback
    private CobolString swit1 = new CobolString(256); // fallback
    private CobolString off = new CobolString(256); // fallback
    private CobolString swit2 = new CobolString(256); // fallback
    private CobolString on = new CobolString(256); // fallback
    private CobolString swit31_on = new CobolString(256); // fallback
    private CobolString swit36_off = new CobolString(256); // fallback

    private void para_main() {
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
        if (!String.valueOf(swit3_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!(!String.valueOf(swit4_off).trim().isEmpty())) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        swit1.set(String.valueOf(off));
        swit2.set(String.valueOf(on));
        if (!String.valueOf(swit1_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!String.valueOf(swit2_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!String.valueOf(swit31_on).trim().isEmpty()) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!(!String.valueOf(swit36_off).trim().isEmpty())) {
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
        new RunMisc056SwitchesEnvironmentCobSwitchNAndSet().run();
    }
}
