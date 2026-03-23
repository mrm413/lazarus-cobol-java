package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynRefmod000ValidReferenceModification extends CobolProgram {
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
    private CobolString x = new CobolString(4);
    private int cb_var = 0;



    private void para_main() {
        CobolDisplay.display(String.valueOf(CobolString.refMod(x, 1, 1)) + ":" + String.valueOf(CobolString.refMod(x, 1, 2)) + ":" + String.valueOf(CobolString.refMod(x, 1, 3)) + ":" + String.valueOf(CobolString.refMod(x, 1, 4)) + ":" + String.valueOf(CobolString.refMod(x, 1)));
        CobolDisplay.display(String.valueOf(CobolString.refMod(x, 2, 1)) + ":" + String.valueOf(CobolString.refMod(x, 2, 2)) + ":" + String.valueOf(CobolString.refMod(x, 2, 3)) + ":" + String.valueOf(CobolString.refMod(x, 2)));
        CobolDisplay.display(String.valueOf(CobolString.refMod(x, 3, 1)) + ":" + String.valueOf(CobolString.refMod(x, 3, 2)) + ":" + String.valueOf(CobolString.refMod(x, 3)));
        CobolDisplay.display(String.valueOf(CobolString.refMod(x, 4, 1)) + ":" + String.valueOf(CobolString.refMod(x, 4)));
        CobolDisplay.display(String.valueOf(CobolString.refMod(x, 1, 4)));
        CobolDisplay.display(String.valueOf(CobolString.refMod(x, cb_var, 4)));
        CobolDisplay.display(String.valueOf(CobolString.refMod(x, 4)));
        CobolDisplay.display(String.valueOf(CobolString.refMod(x, 4, cb_var)));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynRefmod000ValidReferenceModification().run();
    }
}
