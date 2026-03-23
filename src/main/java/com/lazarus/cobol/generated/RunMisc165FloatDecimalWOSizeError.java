package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc165FloatDecimalWOSizeError extends CobolProgram {
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
    private int fd16 = 0;
    private int sv16 = 0;
    private int fd34 = 0;
    private int sv34 = 0;


    private CobolString _unnamed = new CobolString(256);

    private void cnd_000() {
        CobolDisplay.display("--- FLOAT-DECIMAL-34 ---");
        fd34 = new BigDecimal(String.valueOf((((((((10000000 / 2.1)) / 3.1)) - 0.5)) * 6)).trim()).intValue();
        CobolDisplay.display("A: " + String.valueOf(fd34));
        fd34 = new BigDecimal(String.valueOf((((((((10000000 / 2.9)) / 3.9)) - 0.5)) * 6)).trim()).intValue();
        CobolDisplay.display("B: " + String.valueOf(fd34));
    }

    private void fd34() {
        fd34 = new BigDecimal(String.valueOf((1000 / 2.1)).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- FLOAT-DECIMAL-16 ---");
        fd16 = new BigDecimal(String.valueOf((((((((10000000 / 2.1)) / 3.1)) - 0.5)) * 6)).trim()).intValue();
        CobolDisplay.display("A: " + String.valueOf(fd16));
        fd16 = new BigDecimal(String.valueOf((((((((10000000 / 2.9)) / 3.9)) - 0.5)) * 6)).trim()).intValue();
        CobolDisplay.display("B: " + String.valueOf(fd16));
    }

    private void fd16() {
        fd16 = new BigDecimal(String.valueOf((1000 / 2.1)).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- 99 + 1 / 3 ---");
        fd16 = new BigDecimal(String.valueOf(-1).trim()).intValue();
        _unnamed.set(String.valueOf(-1));
    }

    private void fd34_2() {
        fd34 = new BigDecimal(String.valueOf((99 + (1 / 3))).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        fd16 = new BigDecimal(String.valueOf((99 + (1 / 3))).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- 99 ---");
        fd16 = new BigDecimal(String.valueOf(-1).trim()).intValue();
        _unnamed.set(String.valueOf(-1));
    }

    private void fd34_3() {
        fd34 = new BigDecimal(String.valueOf(99).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        fd16 = new BigDecimal(String.valueOf(99).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
    }

    private void cnd_100_ok() {
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- Test overflow ---");
        fd16 = new BigDecimal(String.valueOf(9900000000000L).trim()).intValue();
        _unnamed.set(String.valueOf(9900000000000L));
    }

    private void fd34_4() {
        for (int _i0 = 0; _i0 < 390; _i0++) {
            sv16 = new BigDecimal(String.valueOf(fd16).trim()).intValue();
            fd16 = new BigDecimal(String.valueOf((fd16 * 10)).trim()).intValue();
            /* ON SIZE ERROR handling — needs runtime overflow detection */
            if (fd16 < 9) {
                CobolDisplay.display("FD16: " + String.valueOf(fd16) + " IS Wrong");
                cnd_100_err();
                return;
            }
        }
        CobolDisplay.display("FD16: " + String.valueOf(fd16) + " IS OK");
        cnd_200_ok();
        return;
    }

    private void cnd_100_err() {
        CobolDisplay.display("FD16: after " + String.valueOf(sv16) + " SIZE ERROR");
    }

    private void cnd_200_ok() {
        fd16 = new BigDecimal(String.valueOf(9900000000000L).trim()).intValue();
        _unnamed.set(String.valueOf(9900000000000L));
    }

    private void fd34_5() {
        for (int _i0 = 0; _i0 < 6500; _i0++) {
            sv34 = new BigDecimal(String.valueOf(fd34).trim()).intValue();
            fd34 = new BigDecimal(String.valueOf((fd34 * 10)).trim()).intValue();
            /* ON SIZE ERROR handling — needs runtime overflow detection */
            if (fd34 < 9) {
                cnd_200_err();
                return;
            }
        }
        CobolDisplay.display("FD34: " + String.valueOf(fd34) + " IS OK");
        cnd_380_ok();
        return;
    }

    private void cnd_200_err() {
        CobolDisplay.display("FD34: after " + String.valueOf(sv34) + " SIZE ERROR");
    }

    private void cnd_380_ok() {
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- Test underflow ---");
        fd16 = new BigDecimal(String.valueOf(9.9e-8).trim()).intValue();
        _unnamed.set(String.valueOf(9.9e-8));
    }

    private void fd34_6() {
        for (int _i0 = 0; _i0 < 400; _i0++) {
            sv16 = new BigDecimal(String.valueOf(fd16).trim()).intValue();
            fd16 = new BigDecimal(String.valueOf((fd16 / 10)).trim()).intValue();
            /* ON SIZE ERROR handling — needs runtime overflow detection */
            if (fd16 == 0) {
                cnd_300_err();
                return;
            }
        }
        CobolDisplay.display("FD16: " + String.valueOf(fd16) + " IS OK");
        cnd_400_ok();
        return;
    }

    private void cnd_300_err() {
        CobolDisplay.display("FD16: after " + String.valueOf(sv16) + " SIZE ERROR");
    }

    private void cnd_400_ok() {
        fd16 = new BigDecimal(String.valueOf(9.9e-8).trim()).intValue();
        _unnamed.set(String.valueOf(9.9e-8));
    }

    private void fd34_7() {
        for (int _i0 = 0; _i0 < 6600; _i0++) {
            sv34 = new BigDecimal(String.valueOf(fd34).trim()).intValue();
            fd34 = new BigDecimal(String.valueOf((fd34 / 10)).trim()).intValue();
            /* ON SIZE ERROR handling — needs runtime overflow detection */
            if (fd34 == 0) {
                cnd_400_err();
                return;
            }
        }
        CobolDisplay.display("FD34: " + String.valueOf(fd34) + " IS OK");
        cnd_999();
        return;
    }

    private void cnd_400_err() {
        CobolDisplay.display("FD34: after " + String.valueOf(sv34) + " SIZE ERROR");
    }

    private void cnd_999() {
        System.exit(0);
    }

    @Override
    public void run() {
        cnd_000();
    }

    public static void main(String[] args) {
        new RunMisc165FloatDecimalWOSizeError().run();
    }
}
