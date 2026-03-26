package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize009InitializeWithFiller extends CobolProgram {
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
    private CobolString g1 = new CobolString(1); // Group: G1
    private int x = 0;
    private int filler_1 = 0;
    private int z = 0;
    private CobolString my_filler = new CobolString(1); // Group: MY-FILLER
    private int filler_2 = 0;



    private void para_main() {
        g1.set(String.valueOf("A"));
        g1.set("");
        if (!String.valueOf(g1).equals(String.valueOf("00A00"))) {
            CobolDisplay.display("G1 (INIT): " + String.valueOf(g1));
        }
        g1.set(String.valueOf("A"));
        g1.set("");
        if (!String.valueOf(g1).equals(String.valueOf("00 00"))) {
            CobolDisplay.display("G1 (INIT FILLER):" + String.valueOf(g1));
        }
        my_filler.set("");
        if (!String.valueOf(my_filler).equals(String.valueOf("012345"))) {
            CobolDisplay.display("MY-FILLER (INIT): " + String.valueOf(my_filler));
        }
        my_filler.set("");
        if (!String.valueOf(my_filler).equals(String.valueOf("000000"))) {
            CobolDisplay.display("MY-FILLER (INIT FILLER): " + String.valueOf(my_filler));
        }
        my_filler.set("");
        if (!String.valueOf(my_filler).equals(String.valueOf("000000"))) {
            CobolDisplay.display("MY-FILLER (INIT TO VAL): " + String.valueOf(my_filler));
        }
        my_filler.set("");
        if (!String.valueOf(my_filler).equals(String.valueOf("012345"))) {
            CobolDisplay.display("MY-FILLER (INIT FILLER TO VAL): " + String.valueOf(my_filler));
        }
        my_filler.setRefMod(2, 3, "");
        if (!String.valueOf(my_filler).equals(String.valueOf("0   45"))) {
            CobolDisplay.display("MY-FILLER (REF-MOD): " + String.valueOf(my_filler));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunInitialize009InitializeWithFiller().run();
    }
}
