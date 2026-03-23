package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc177CompareNumericDisplaySpaceWithZero extends CobolProgram {
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
    private CobolString tst_vars = new CobolString(1); // Group: TST-VARS
    private int tst_number = 0;
    private int tst_number_signed = 0;
    private int tst_decimal = 0;
    private BigDecimal tst_decimal_signed = BigDecimal.ZERO;
    private int zero_decimal = 0;
    private int zero_number = 0;



    private void para_main() {
        tst_vars.set(String.valueOf(" "));
        if (tst_number > 0) {
            CobolDisplay.display("TST-NUMBER IS > 0");
        }
        if (tst_number != 0) {
            CobolDisplay.display("TST-NUMBER IS NOT 0");
        }
        if (tst_number < 0) {
            CobolDisplay.display("TST-NUMBER IS < 0");
        }
        if (tst_number_signed > 0) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS > 0");
        }
        if (tst_number_signed != 0) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS NOT 0");
        }
        if (tst_number_signed < 0) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS < 0");
        }
        if (tst_decimal > 0) {
            CobolDisplay.display("TST-DECIMAL IS > 0");
        }
        if (tst_decimal != 0) {
            CobolDisplay.display("TST-DECIMAL IS NOT 0");
        }
        if (tst_decimal < 0) {
            CobolDisplay.display("TST-DECIMAL IS < 0");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(0).trim())) > 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS > 0");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS NOT 0");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(0).trim())) < 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS < 0");
        }
        if (tst_number > zero_number) {
            CobolDisplay.display("TST-NUMBER IS > ZERO-NUMBER");
        }
        if (tst_number != zero_number) {
            CobolDisplay.display("TST-NUMBER IS NOT ZERO-NUMBER");
        }
        if (tst_number < zero_number) {
            CobolDisplay.display("TST-NUMBER IS < ZERO-NUMBER");
        }
        if (tst_number_signed > zero_number) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS > ZERO-NUMBER");
        }
        if (tst_number_signed != zero_number) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS NOT ZERO-NUMBER");
        }
        if (tst_number_signed < zero_number) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS < ZERO-NUMBER");
        }
        if (tst_decimal > zero_number) {
            CobolDisplay.display("TST-DECIMAL IS > ZERO-NUMBER");
        }
        if (tst_decimal != zero_number) {
            CobolDisplay.display("TST-DECIMAL IS NOT ZERO-NUMBER");
        }
        if (tst_decimal < zero_number) {
            CobolDisplay.display("TST-DECIMAL IS < ZERO-NUMBER");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(zero_number).trim())) > 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS > ZERO-NUMBER");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(zero_number).trim())) != 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS NOT ZERO-NUMBER");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(zero_number).trim())) < 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS < ZERO-NUMBER");
        }
        if (tst_number > zero_decimal) {
            CobolDisplay.display("TST-NUMBER IS > ZERO-DECIMAL");
        }
        if (tst_number != zero_decimal) {
            CobolDisplay.display("TST-NUMBER IS NOT ZERO-DECIMAL");
        }
        if (tst_number < zero_decimal) {
            CobolDisplay.display("TST-NUMBER IS < ZERO-DECIMAL");
        }
        if (tst_number_signed > zero_decimal) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS > ZERO-DECIMAL");
        }
        if (tst_number_signed != zero_decimal) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS NOT ZERO-DECIMAL");
        }
        if (tst_number_signed < zero_decimal) {
            CobolDisplay.display("TST-NUMBER-SIGNED IS < ZERO-DECIMAL");
        }
        if (tst_decimal > zero_decimal) {
            CobolDisplay.display("TST-DECIMAL IS > ZERO-DECIMAL");
        }
        if (tst_decimal != zero_decimal) {
            CobolDisplay.display("TST-DECIMAL IS NOT ZERO-DECIMAL");
        }
        if (tst_decimal < zero_decimal) {
            CobolDisplay.display("TST-DECIMAL IS < ZERO-DECIMAL");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(zero_decimal).trim())) > 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS > ZERO-DECIMAL");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(zero_decimal).trim())) != 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS NOT ZERO-DECIMAL");
        }
        if (tst_decimal_signed.compareTo(new BigDecimal(String.valueOf(zero_decimal).trim())) < 0) {
            CobolDisplay.display("TST-DECIMAL-SIGNED IS < ZERO-DECIMAL");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc177CompareNumericDisplaySpaceWithZero().run();
    }
}
