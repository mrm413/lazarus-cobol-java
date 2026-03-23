package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions023MoveOfNonIntegerToAlphanumeric extends CobolProgram {
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
    private int integer = 0;
    private int signed_integer = 0;
    private CobolString alpha_field = new CobolString(4);
    private int non_integer = 0;
    private short non_integer_2 = (short) 0;
    private BigDecimal non_integer_3 = BigDecimal.ZERO;
    private BigDecimal signed_non_integer = BigDecimal.ZERO;
    private BigDecimal signed_non_integer_2 = BigDecimal.ZERO;
    private BigDecimal signed_non_integer_3 = BigDecimal.ZERO;


    private CobolString alpha_numeric = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString ignore = new CobolString(256);
    private CobolString decimal = new CobolString(256);
    private CobolString point = new CobolString(256);

    private void para_main() {
        /* RAW: * * */
        alpha_numeric.set(String.valueOf(non_integer));
        _unnamed.set(String.valueOf(non_integer));
        _unnamed.set(String.valueOf(non_integer));
        _unnamed.set(String.valueOf(non_integer));
        ignore.set(String.valueOf(non_integer));
        decimal.set(String.valueOf(non_integer));
        point.set(String.valueOf(non_integer));
    }

    private void s_01() {
    }

    private void alpha_field() {
    }

    private void alpha_field_2() {
        CobolDisplay.displayNoAdvancing(String.valueOf(alpha_field));
    }

    private void s_02() {
    }

    private void alpha_field_3() {
    }

    private void alpha_field_4() {
        CobolDisplay.displayNoAdvancing(String.valueOf(alpha_field));
    }

    private void s_03() {
    }

    private void alpha_field_5() {
    }

    private void alpha_field_6() {
        CobolDisplay.displayNoAdvancing(String.valueOf(alpha_field));
    }

    private void s_10() {
    }

    private void alpha_field_7() {
    }

    private void alpha_field_8() {
        CobolDisplay.displayNoAdvancing(String.valueOf(alpha_field));
    }

    private void s_20() {
    }

    private void alpha_field_9() {
    }

    private void alpha_field_10() {
        CobolDisplay.displayNoAdvancing(String.valueOf(alpha_field));
    }

    private void s_30() {
    }

    private void alpha_field_11() {
    }

    private void alpha_field_12() {
        CobolDisplay.displayNoAdvancing(String.valueOf(alpha_field));
    }

    private void s_40() {
    }

    private void alpha_field_13() {
    }

    private void alpha_field_14() {
        CobolDisplay.displayNoAdvancing(String.valueOf(alpha_field));
    }

    private void s_50() {
    }

    private void alpha_field_15() {
    }

    private void alpha_field_16() {
        CobolDisplay.displayNoAdvancing(String.valueOf(alpha_field));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions023MoveOfNonIntegerToAlphanumeric().run();
    }
}
