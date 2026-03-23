package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc173RuntimeChecksWithinConditions extends CobolProgram {
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
    private CobolString mytab = new CobolString(1); // Group: mytab
    private int cb_var = 0;
    private int var2 = 0;
    private CobolString[] t15_prgm = new CobolString[2];
    private CobolString[] t16_prgm = new CobolString[2];
    private int[] t15_nrgm = new int[2];
    private int[] t16_nrgm = new int[2];



    private void para_main() {
        /* RAW: *  */
        CobolString.setRefMod(t16_prgm, cb_var - 1, var2, String.valueOf("TESTME"));
        if (t15_prgm[cb_var - 1] == null) t15_prgm[cb_var - 1] = new CobolString(256);
        t15_prgm[cb_var - 1].set(String.valueOf(CobolString.refMod(t16_prgm[cb_var - 1], 1, var2)));
        if (String.valueOf(t16_prgm[cb_var - 1]).equals(String.valueOf(t15_prgm[var2 - 1]))) {
            CobolDisplay.display("WRONG RESULT OCCURS");
        }
        if (String.valueOf(CobolString.refMod(mytab, cb_var, var2)).equals(String.valueOf(CobolString.refMod(mytab, var2, cb_var)))) {
            CobolDisplay.display("WRONG RESULT REFMOD");
        }
        mytab.set("");
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc173RuntimeChecksWithinConditions().run();
    }
}
