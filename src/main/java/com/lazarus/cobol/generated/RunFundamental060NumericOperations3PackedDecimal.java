package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental060NumericOperations3PackedDecimal extends CobolProgram {
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
    private BigDecimal field = BigDecimal.ZERO;
    private BigDecimal feld2 = BigDecimal.ZERO;
    private BigDecimal feld3 = BigDecimal.ZERO;
    private BigDecimal feld4 = BigDecimal.ZERO;
    private BigDecimal feld4b = BigDecimal.ZERO;
    private BigDecimal feld5 = BigDecimal.ZERO;
    private BigDecimal feld5b = BigDecimal.ZERO;
    private BigDecimal feld6 = BigDecimal.ZERO;
    private BigDecimal feld6b = BigDecimal.ZERO;
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
        for (int _i0 = 0; _i0 < 20000; _i0++) {
        }
        return;
    }

    private void do_check() {
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  1 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test  2 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test  3 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.add(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test  4 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test  5 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  6 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test  7 " + String.valueOf(field));
        }
        field = new BigDecimal(String.valueOf(-0.2).trim());
        field = field.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test  8 " + String.valueOf(field));
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test  9 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test 10 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 11 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test 12 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-0.8).trim())) != 0) {
            CobolDisplay.display("Test 13 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test 14 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(-1.2).trim())) != 0) {
            CobolDisplay.display("Test 15 " + String.valueOf(feld2));
        }
        feld2 = new BigDecimal(String.valueOf(-0.2).trim());
        feld2 = feld2.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld2.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 16 " + String.valueOf(feld2));
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim());
        feld3 = feld3.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld3.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test 17 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim());
        feld3 = feld3.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld3.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 18 " + String.valueOf(feld3));
        }
        /* RAW: * unsigned , so ends as */
        feld3 = new BigDecimal(String.valueOf(-0.2).trim());
        feld3 = feld3.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld3.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test 19 " + String.valueOf(feld3));
        }
        /* RAW: * unsigned , so ends as */
        feld3 = new BigDecimal(String.valueOf(-0.2).trim());
        feld3 = feld3.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld3.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 20 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim());
        feld3 = feld3.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld3.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 21 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(0.2).trim());
        feld3 = feld3.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld3.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test 22 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim());
        feld3 = feld3.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld3.compareTo(new BigDecimal(String.valueOf(0.8).trim())) != 0) {
            CobolDisplay.display("Test 23 " + String.valueOf(feld3));
        }
        feld3 = new BigDecimal(String.valueOf(-0.2).trim());
        feld3 = feld3.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld3.compareTo(new BigDecimal(String.valueOf(1.2).trim())) != 0) {
            CobolDisplay.display("Test 24 " + String.valueOf(feld3));
        }
        feld4 = new BigDecimal(String.valueOf(2).trim());
        feld4 = feld4.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("Test 25 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(2).trim());
        feld4 = feld4.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("Test 26 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim());
        feld4 = feld4.add(new BigDecimal(String.valueOf(1).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(-1).trim())) != 0) {
            CobolDisplay.display("Test 27 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim());
        feld4 = feld4.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(-3).trim())) != 0) {
            CobolDisplay.display("Test 28 " + String.valueOf(feld4));
        }
        feld4b = new BigDecimal(String.valueOf(-2).trim());
        feld4b = feld4b.add(new BigDecimal(String.valueOf(-1).trim()));
        if (feld4b.compareTo(new BigDecimal(String.valueOf(-3).trim())) != 0) {
            CobolDisplay.display("Test 28b " + String.valueOf(feld4b));
        }
        feld4 = new BigDecimal(String.valueOf(2).trim());
        feld4 = feld4.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("Test 29 " + String.valueOf(feld4));
        }
        feld4b = new BigDecimal(String.valueOf(2).trim());
        feld4b = feld4b.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld4b.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("Test 29b " + String.valueOf(feld4b));
        }
        feld4 = new BigDecimal(String.valueOf(2).trim());
        feld4 = feld4.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("Test 30 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim());
        feld4 = feld4.subtract(new BigDecimal(String.valueOf(1).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(-3).trim())) != 0) {
            CobolDisplay.display("Test 31 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-2).trim());
        feld4 = feld4.subtract(new BigDecimal(String.valueOf(-1).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(-1).trim())) != 0) {
            CobolDisplay.display("Test 32 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(1).trim());
        feld4 = feld4.add(new BigDecimal(String.valueOf(2).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("Test 33 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(1).trim());
        feld4 = feld4.add(new BigDecimal(String.valueOf(-2).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(-1).trim())) != 0) {
            CobolDisplay.display("Test 34 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim());
        feld4 = feld4.add(new BigDecimal(String.valueOf(2).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("Test 35 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim());
        feld4 = feld4.add(new BigDecimal(String.valueOf(-2).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(-3).trim())) != 0) {
            CobolDisplay.display("Test 36 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(1).trim());
        feld4 = feld4.subtract(new BigDecimal(String.valueOf(2).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(-1).trim())) != 0) {
            CobolDisplay.display("Test 37 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(1).trim());
        feld4 = feld4.subtract(new BigDecimal(String.valueOf(-2).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("Test 38 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim());
        feld4 = feld4.subtract(new BigDecimal(String.valueOf(2).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(-3).trim())) != 0) {
            CobolDisplay.display("Test 39 " + String.valueOf(feld4));
        }
        feld4 = new BigDecimal(String.valueOf(-1).trim());
        feld4 = feld4.subtract(new BigDecimal(String.valueOf(-2).trim()));
        if (feld4.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("Test 40 " + String.valueOf(feld4));
        }
        feld5 = new BigDecimal(String.valueOf(123456789.01234567).trim());
        feld5 = feld5.add(new BigDecimal(String.valueOf(2).trim()));
        if (feld5.compareTo(new BigDecimal(String.valueOf(123456791.01234567).trim())) != 0) {
            CobolDisplay.display("Test 41 ADD " + String.valueOf(feld5));
        }
        feld5 = new BigDecimal(String.valueOf(123456789.01234567).trim());
        feld5 = feld5.subtract(new BigDecimal(String.valueOf(-2).trim()));
        if (feld5.compareTo(new BigDecimal(String.valueOf(123456791.01234567).trim())) != 0) {
            CobolDisplay.display("Test 41 SUBTRACT " + String.valueOf(feld5));
        }
        feld5b = new BigDecimal(String.valueOf(new BigDecimal("12345678901234568")).trim());
        feld5b = feld5b.add(new BigDecimal(String.valueOf(new BigDecimal("18518518351851850")).trim()));
        if (feld5b.compareTo(new BigDecimal(String.valueOf(new BigDecimal("30864197253086416")).trim())) != 0) {
            CobolDisplay.display("Test 41b ADD " + String.valueOf(feld5b));
        }
        feld5b = new BigDecimal(String.valueOf(new BigDecimal("30864197253086416")).trim());
        feld5b = feld5b.subtract(new BigDecimal(String.valueOf(new BigDecimal("18518518351851850")).trim()));
        if (feld5b.compareTo(new BigDecimal(String.valueOf(new BigDecimal("12345678901234568")).trim())) != 0) {
            CobolDisplay.display("Test 41b SUBTRACT " + String.valueOf(feld5b));
        }
        feld6 = new BigDecimal(String.valueOf(12345678.123456901).trim());
        feld6 = feld6.add(new BigDecimal(String.valueOf(-2.1).trim()));
        if (feld6.compareTo(new BigDecimal(String.valueOf(12345676.023456901).trim())) != 0) {
            CobolDisplay.display("Test 42 ADD " + String.valueOf(feld6));
        }
        feld6 = new BigDecimal(String.valueOf(12345678.123456901).trim());
        feld6 = feld6.subtract(new BigDecimal(String.valueOf(2.1).trim()));
        if (feld6.compareTo(new BigDecimal(String.valueOf(12345676.023456901).trim())) != 0) {
            CobolDisplay.display("Test 42 SUBTRACT " + String.valueOf(feld6));
        }
        feld6 = new BigDecimal(String.valueOf(0.12345678901234568).trim());
        feld6 = feld6.add(new BigDecimal(String.valueOf(1.8).trim()));
        if (feld6.compareTo(new BigDecimal(String.valueOf(1.9234567890123457).trim())) != 0) {
            CobolDisplay.display("Test 43 " + String.valueOf(feld6));
        }
        feld6b = new BigDecimal(String.valueOf(new BigDecimal("7123456789012346000")).trim());
        feld6b = feld6b.add(new BigDecimal(String.valueOf(new BigDecimal("1800000000000000000")).trim()));
        if (feld6b.compareTo(new BigDecimal(String.valueOf(new BigDecimal("8923456789012346000")).trim())) != 0) {
            CobolDisplay.display("Test 43b ADD " + String.valueOf(feld6b));
        }
        if (feld6b.compareTo(new BigDecimal(String.valueOf(new BigDecimal("-8923456789012346000")).trim())) == 0) {
            CobolDisplay.display("Test 43b2 ADD " + String.valueOf(feld6b));
        }
        feld6b = new BigDecimal(String.valueOf(feld6b.multiply(new BigDecimal(String.valueOf(-1).trim()))).trim());
        if (feld6b.compareTo(new BigDecimal(String.valueOf(new BigDecimal("-8923456789012346000")).trim())) != 0) {
            CobolDisplay.display("Test 43c NEGATIVE " + String.valueOf(feld6b));
        }
        if (feld6b.compareTo(new BigDecimal(String.valueOf(new BigDecimal("8923456789012346000")).trim())) == 0) {
            CobolDisplay.display("Test 43c2 NEGATIVE " + String.valueOf(feld6b));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental060NumericOperations3PackedDecimal().run();
    }
}
