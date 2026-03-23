package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc166FloatShortFloatLongWOSizeError extends CobolProgram {
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
    private float cmp1 = 0.0f;
    private float sv1 = 0.0f;
    private double cmp2 = 0.0;
    private double sv2 = 0.0;


    private CobolString _unnamed = new CobolString(256);

    private void cnd_000() {
        CobolDisplay.display("--- COMP-1 ---");
        cmp1 = (float) Double.parseDouble(String.valueOf((((((((10000000 / 2.1)) / 3.1)) - 0.5)) * 6)).trim());
        CobolDisplay.display("A: " + String.valueOf(cmp1));
        cmp1 = (float) Double.parseDouble(String.valueOf((((((((10000000 / 2.9)) / 3.9)) - 0.5)) * 6)).trim());
        CobolDisplay.display("B: " + String.valueOf(cmp1));
    }

    private void cmp1() {
        cmp1 = (float) Double.parseDouble(String.valueOf((1000 / 2.1)).trim());
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- COMP-2 ---");
        cmp2 = Double.parseDouble(String.valueOf((((((((10000000 / 2.1)) / 3.1)) - 0.5)) * 6)).trim());
        if ((cmp2 >= 9216586.86175114 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 9216586.86175116  */
            CobolDisplay.display("A ~ 9216586.86175115");
        } else {
            CobolDisplay.display("A: " + String.valueOf(cmp2));
        }
        cmp2 = Double.parseDouble(String.valueOf((((((((10000000 / 2.9)) / 3.9)) - 0.5)) * 6)).trim());
        if ((cmp2 >= 5305036.7877983 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 5305036.7877985  */
            CobolDisplay.display("B ~ 5305036.787798408");
        } else {
            CobolDisplay.display("B: " + String.valueOf(cmp2));
        }
    }

    private void cmp2() {
        cmp2 = Double.parseDouble(String.valueOf((1000 / 2.1)).trim());
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- 99 + 1 / 3 ---");
        cmp1 = (float) Double.parseDouble(String.valueOf(-1).trim());
        _unnamed.set(String.valueOf(-1));
    }

    private void cmp2_2() {
        cmp1 = (float) Double.parseDouble(String.valueOf((99 + (1 / 3))).trim());
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        cmp2 = Double.parseDouble(String.valueOf((99 + (1 / 3))).trim());
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- 99 ---");
        cmp1 = (float) Double.parseDouble(String.valueOf(-1).trim());
        _unnamed.set(String.valueOf(-1));
    }

    private void cmp2_3() {
        cmp1 = (float) Double.parseDouble(String.valueOf(99).trim());
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        cmp2 = Double.parseDouble(String.valueOf(99).trim());
        /* ON SIZE ERROR handling — needs runtime overflow detection */
    }

    private void cnd_100_ok() {
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- Test overflow ---");
    }

    private void cmp1_2() {
        for (int _i0 = 0; _i0 < 6500; _i0++) {
            sv1 = (float) Double.parseDouble(String.valueOf(cmp1).trim());
            cmp1 = (float) Double.parseDouble(String.valueOf((cmp1 * 10)).trim());
            /* ON SIZE ERROR handling — needs runtime overflow detection */
            if (cmp1 < 9) {
                cnd_350_err();
                return;
            }
        }
        CobolDisplay.display("CMP1: " + String.valueOf(cmp1) + " IS OK");
        cnd_350_ok();
        return;
    }

    private void cnd_350_err() {
        CobolDisplay.display("CMP1: after " + String.valueOf(sv1) + " SIZE ERROR");
    }

    private void cnd_350_ok() {
    }

    private void cmp2_4() {
        for (int _i0 = 0; _i0 < 6500; _i0++) {
            sv2 = Double.parseDouble(String.valueOf(cmp2).trim());
            cmp2 = Double.parseDouble(String.valueOf((cmp2 * 10)).trim());
            /* ON SIZE ERROR handling — needs runtime overflow detection */
            if (cmp2 < 9) {
                cnd_380_err();
                return;
            }
        }
        CobolDisplay.display("CMP2: " + String.valueOf(cmp2) + " IS OK");
        cnd_500_ok();
        return;
    }

    private void cnd_380_err() {
    // if ((Integer.parseInt(String.valueOf(sv2).trim()) >= Integer.parseInt(String.valueOf(new).trim()) BigDecimal("9.899999999999e+307") && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 9.900000000001E+307  */
    // CobolDisplay.display("CMP2: after ~ 9.899999999999781E+307 SIZE ERROR");
    // } else {
    // CobolDisplay.display("CMP2: after " + String.valueOf(sv2) + " SIZE ERROR");
    // }
    }

    private void cnd_500_ok() {
    }

    private void cmp1_3() {
        for (int _i0 = 0; _i0 < 350; _i0++) {
            sv1 = (float) Double.parseDouble(String.valueOf(cmp1).trim());
            cmp1 = (float) Double.parseDouble(String.valueOf((cmp1 / 10)).trim());
            /* ON SIZE ERROR handling — needs runtime overflow detection */
            if (cmp1 == 0) {
                cnd_500_err();
                return;
            }
        }
        CobolDisplay.display("CMP1: " + String.valueOf(cmp1) + " IS OK");
        cnd_600_ok();
        return;
    }

    private void cnd_500_err() {
        CobolDisplay.display("CMP1: after " + String.valueOf(sv1) + " SIZE ERROR");
    }

    private void cnd_600_ok() {
    }

    private void cmp2_5() {
        for (int _i0 = 0; _i0 < 350; _i0++) {
            sv2 = Double.parseDouble(String.valueOf(cmp2).trim());
            cmp2 = Double.parseDouble(String.valueOf((cmp2 / 10)).trim());
            /* ON SIZE ERROR handling — needs runtime overflow detection */
            if (cmp2 == 0) {
                cnd_600_err();
                return;
            }
        }
        CobolDisplay.display("CMP2: " + String.valueOf(cmp2) + " IS OK");
        cnd_600_xit();
        return;
    }

    private void cnd_600_err() {
        if ((sv2 >= 1e-323 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 9.881312916825E-324  */
            CobolDisplay.display("CMP2: after ~ 9.881312916824931E-324 SIZE ERROR");
        } else {
            CobolDisplay.display("CMP2: after " + String.valueOf(sv2) + " SIZE ERROR");
        }
    }

    private void cnd_600_xit() {
    }

    private void cnd_999() {
        System.exit(0);
    }

    @Override
    public void run() {
        cnd_000();
    }

    public static void main(String[] args) {
        new RunMisc166FloatShortFloatLongWOSizeError().run();
    }
}
