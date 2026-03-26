package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc096ConstantExpressions2 extends CobolProgram {
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
    private static final int const1 = 115;
    private CobolString const2 = new CobolString(1);
    private static final String const3 = "const2";
    private static final String const4 = "const2";


    private CobolString othervar = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString cb_var = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback

    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private void para_main() {
        if ((((String.valueOf(const1).equals(String.valueOf(const2)) || String.valueOf(const2).equals(String.valueOf(const1))) || String.valueOf(const3).equals(String.valueOf(const4))) || String.valueOf(const4).equals(String.valueOf(const3)))) {
            CobolDisplay.display("no way");
        }
        if (const1 == 15) {
        } else if (const1 == 115) {
            CobolDisplay.display("1");
        } else if (String.valueOf(const1).equals(String.valueOf(_filler_004))) {
            /* RAW: 16  */
            cb_var.setRefMod(17, 8, String.valueOf(CobolString.refMod(othervar, 1, 8)));
        } else if (String.valueOf(const1).equals(String.valueOf(_filler_006))) {
            /* RAW: 16  */
            CobolDisplay.display(String.valueOf(othervar));
        } else {
            CobolDisplay.display(String.valueOf(othervar));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc096ConstantExpressions2().run();
    }
}
