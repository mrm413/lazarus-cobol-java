package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked014Comp6Comparison extends CobolProgram {
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
    private BigDecimal u1 = BigDecimal.ZERO;
    private BigDecimal u2 = BigDecimal.ZERO;
    private BigDecimal u3 = BigDecimal.ZERO;
    private BigDecimal u4 = BigDecimal.ZERO;
    private BigDecimal u1_32 = BigDecimal.ZERO;
    private BigDecimal u2_32 = BigDecimal.ZERO;
    private BigDecimal u1_32d = BigDecimal.ZERO;
    private BigDecimal u2_32d = BigDecimal.ZERO;
    private BigDecimal u3_32d = BigDecimal.ZERO;
    private BigDecimal u4_32d = BigDecimal.ZERO;
    private int filler_1 = 0;


    private CobolString on = new CobolString(256); // fallback
    private CobolString error = new CobolString(256); // fallback
    private CobolString no_disp = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString some = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: * Test with */
        CobolDisplay.display(String.valueOf(on) + String.valueOf(error));
        do_check();
        no_disp.set(String.valueOf((Integer.parseInt(String.valueOf(cb_true).trim()) * Integer.parseInt(String.valueOf(some).trim()))));
        /* RAW: performance checks on the way */
        for (int _i0 = 0; _i0 < 30000; _i0++) {
        }
        return;
    }

    private void do_check() {
        if (u1.compareTo(u2) != 0) {
            CobolDisplay.display("U1 <> U2");
        }
        if (u3.compareTo(u4) != 0) {
            CobolDisplay.display("U3 <> U4");
        }
        if (u1.compareTo(u3) >= 0) {
            CobolDisplay.display("U1 >= U3");
        }
        if (u1_32.compareTo(u2_32) != 0) {
            CobolDisplay.display("U1-32 <> U2-32");
        }
        if (u1_32.compareTo(u2_32d) >= 0) {
            CobolDisplay.display("U1-32 >= U1-32D");
        }
        if (u1_32d.compareTo(u2_32d) != 0) {
            CobolDisplay.display("U1-32D <> U2-32D");
        }
        if (u1_32d.compareTo(u3) <= 0) {
            CobolDisplay.display("U1-32 <= U3");
        }
        if (u2_32d.compareTo(u3_32d) != 0) {
            CobolDisplay.display("U2-32D <> U3-32D");
        }
        if (u2_32d.compareTo(u4_32d) <= 0) {
            CobolDisplay.display("U2-32D <= U4-32D");
        }
        if (u4_32d.compareTo(u2_32d) >= 0) {
            CobolDisplay.display("U4-32D >= U2-32D");
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked014Comp6Comparison().run();
    }
}
