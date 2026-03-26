package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked016PppComp3 extends CobolProgram {
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
    private static final String fence = "ABBAAB";
    private CobolString fence_a = new CobolString(3);
    private BigDecimal x_1 = BigDecimal.ZERO;
    private CobolString fence_b = new CobolString(3);
    private BigDecimal x_2 = BigDecimal.ZERO;
    private CobolString fence_c = new CobolString(3);
    private BigDecimal x_4 = BigDecimal.ZERO;
    private CobolString fence_d = new CobolString(3);
    private CobolString fence_1 = new CobolString(3);
    private BigDecimal d_1 = BigDecimal.ZERO;
    private BigDecimal d_2 = BigDecimal.ZERO;
    private CobolString fence_2 = new CobolString(3);
    private long wrk_ds_ls_1p17_1 = 0L;
    private CobolString wrk_ae_3 = new CobolString(24);
    private int move72 = 0;
    private CobolString move73 = new CobolString(18);
    private CobolString grp_ae_0002 = new CobolString(1); // Group: GRP-AE-0002
    private CobolString ae_0002 = new CobolString(9);



    private void para_main() {
        move72 = new BigDecimal(String.valueOf(3344556677L).trim()).intValue();
        move73.set(String.valueOf(move72));
        if (!String.valueOf(move73).equals(String.valueOf("33445 56677     0 "))) {
            CobolDisplay.display("MOVE X-EDIT failed: " + String.valueOf(move73) + ".");
        }
        ae_0002.set(String.valueOf(19823));
        if (!String.valueOf(grp_ae_0002).equals(String.valueOf("01098 23 "))) {
            CobolDisplay.display("MOVE AE-EDIT failed: " + String.valueOf(grp_ae_0002) + ".");
        }
        wrk_ae_3.set(String.valueOf(wrk_ds_ls_1p17_1));
        CobolDisplay.display("MOVE 1P17: " + String.valueOf(wrk_ds_ls_1p17_1) + " : " + String.valueOf(CobolIntrinsics.length(wrk_ds_ls_1p17_1)) + ".");
        CobolDisplay.display("MOVE A-E : " + String.valueOf(wrk_ae_3) + ".");
        if (!String.valueOf(wrk_ae_3).equals(String.valueOf("1 000/000/000/000/000 00"))) {
            CobolDisplay.display("MOVE 1P17 TO A-E failed");
        }
        CobolDisplay.display("INIT X-1 : " + String.valueOf(x_1) + " .");
        CobolDisplay.display("INIT X-2 : " + String.valueOf(x_2) + " .");
        CobolDisplay.display("INIT X-4 : " + String.valueOf(x_4) + " .");
        CobolDisplay.display("INIT D-1 : " + String.valueOf(d_1) + " .");
        x_2 = new BigDecimal(String.valueOf(d_1).trim());
        x_1 = new BigDecimal(String.valueOf(d_1).trim());
        d_1 = new BigDecimal(String.valueOf(x_2).trim());
        CobolDisplay.display("MOVE X-1 : " + String.valueOf(x_1) + " .");
        CobolDisplay.display("MOVE X-2 : " + String.valueOf(x_2) + " .");
        x_4 = new BigDecimal(String.valueOf(0.000256).trim());
        CobolDisplay.display("MOVE X-4 : " + String.valueOf(x_4) + " .");
        CobolDisplay.display("MOVE D-1 : " + String.valueOf(d_1) + " .");
        x_2 = new BigDecimal(String.valueOf(d_2).trim());
        x_1 = new BigDecimal(String.valueOf(d_2).trim());
        CobolDisplay.display("MOVE X-1 : " + String.valueOf(x_1) + ":" + String.valueOf(d_2) + " .");
        CobolDisplay.display("MOVE X-2 : " + String.valueOf(x_2) + ":" + String.valueOf(d_2) + " .");
        x_1 = new BigDecimal(String.valueOf(98000).trim());
        if (x_1.compareTo(new BigDecimal(String.valueOf(98000).trim())) != 0) {
            CobolDisplay.display("MOVE 98000 failed: " + String.valueOf(x_1));
        }
        d_1 = new BigDecimal(String.valueOf(98000).trim());
        if (d_1.compareTo(new BigDecimal(String.valueOf(98000).trim())) != 0) {
            CobolDisplay.display("MOVE 98000 failed: " + String.valueOf(d_1));
        }
        x_1 = x_1.add(new BigDecimal(String.valueOf(1000).trim()));
        if (x_1.compareTo(new BigDecimal(String.valueOf(99000).trim())) != 0) {
            CobolDisplay.display("+ 1000 failed: " + String.valueOf(x_1));
        }
        x_1 = x_1.subtract(new BigDecimal(String.valueOf(4000).trim()));
        if (x_1.compareTo(new BigDecimal(String.valueOf(95000).trim())) != 0) {
            CobolDisplay.display("- 4000 failed: " + String.valueOf(x_1));
        }
        /* DIVIDE without GIVING — needs runtime */
        if (x_1.compareTo(new BigDecimal(String.valueOf(31000).trim())) != 0) {
            CobolDisplay.display("/ 3 failed: " + String.valueOf(x_1));
        }
        x_1 = new BigDecimal(String.valueOf(new BigDecimal(String.valueOf(2).trim()).multiply(x_1)).trim());
        if (x_1.compareTo(new BigDecimal(String.valueOf(62000).trim())) != 0) {
            CobolDisplay.display("* 2 failed: " + String.valueOf(x_1));
        }
        if (!String.valueOf(fence_1).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-1");
        }
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-2");
        }
        if (!String.valueOf(fence_a).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-A");
        }
        if (!String.valueOf(fence_b).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-B");
        }
        if (!String.valueOf(fence_c).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-C");
        }
        if (!String.valueOf(fence_d).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-D");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked016PppComp3().run();
    }
}
