package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc089PerformTypeOsvs extends CobolProgram {
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
    private short myocc = (short) 0;



    // SECTION: ASTART
    private void astart() {
        a01();
    }

    private void a01() {
        btest();
        if (myocc != 2) {
            CobolDisplay.display(String.valueOf(myocc));
        }
        System.exit(0);
    }

    // SECTION: BTEST
    private void btest() {
        b01();
        b02();
        b99();
    }

    private void b01() {
        for (myocc = 1; !(myocc > 5); myocc += 1) {
        }
        b99();
        return;
    }

    private void b02() {
        if (myocc > 1) {
            b99();
            return;
        }
    }

    private void b99() {
        return;
    }

    @Override
    public void run() {
        a01();
    }

    public static void main(String[] args) {
        new RunMisc089PerformTypeOsvs().run();
    }
}
