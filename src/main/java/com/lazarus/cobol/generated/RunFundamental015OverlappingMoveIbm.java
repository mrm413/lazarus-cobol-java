package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental015OverlappingMoveIbm extends CobolProgram {
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
    private CobolString tstmov1 = new CobolString(479);
    private CobolString tstmov2 = new CobolString(10);



    private void para_main() {
    }

    private void tstmov2() {
        tstmov2.setRefMod(1, 9, String.valueOf(CobolString.refMod(tstmov2, 2, 9)));
        if (!String.valueOf(tstmov2).equals(String.valueOf("1234567899"))) {
            CobolDisplay.display("  PROBLEM MOVE: " + String.valueOf(tstmov2));
        } else {
            CobolDisplay.display("  OK with MOVE: ");
            /* RAW: TSTMOV2  */
        }
    }

    private void tstmov2_2() {
        tstmov2.setRefMod(2, 8, String.valueOf(CobolString.refMod(tstmov2, 1, 8)));
        if (String.valueOf(tstmov2).equals(String.valueOf("0000000009"))) {
            CobolDisplay.display("IBM style MOVE: " + String.valueOf(tstmov2));
        } else {
            if (!String.valueOf(tstmov2).equals(String.valueOf("0012345679"))) {
                CobolDisplay.display("  PROBLEM MOVE: " + String.valueOf(tstmov2));
            } else {
                CobolDisplay.display("  OK with MOVE: ");
                /* RAW: TSTMOV2  */
            }
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental015OverlappingMoveIbm().run();
    }
}
