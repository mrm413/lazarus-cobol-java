package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc155DefaultArithmetic1 extends CobolProgram {
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
    private int num_a = 0;
    private int num_b = 0;
    private int num_c = 0;
    private int numv1 = 0;
    private CobolString picx = new CobolString(1);
    private int rslt = 0;
    private int rsltv1 = 0;
    private int rsltv2 = 0;


    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        rslt = new BigDecimal(String.valueOf((num_a + 1.1)).trim()).intValue();
        CobolDisplay.display("Simple Compute  RSLT IS " + String.valueOf(rslt));
        rslt = new BigDecimal(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)).trim()).intValue();
        CobolDisplay.display("Single Variable RSLT IS " + String.valueOf(rslt));
        rsltv2 = new BigDecimal(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)).trim()).intValue();
        _unnamed.set(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)));
        rslt = new BigDecimal(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)).trim()).intValue();
        CobolDisplay.display("Compute  RSLT    IS " + String.valueOf(rslt));
        CobolDisplay.display("Compute  RSLTv99 IS " + String.valueOf(rsltv2));
        rsltv1 = new BigDecimal(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)).trim()).intValue();
        _unnamed.set(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)));
        rslt = new BigDecimal(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)).trim()).intValue();
        CobolDisplay.display("Compute  RSLT    IS " + String.valueOf(rslt));
        CobolDisplay.display("Compute  RSLTv9  IS " + String.valueOf(rsltv1));
        rslt = new BigDecimal(String.valueOf(0).trim()).intValue();
        rslt = new BigDecimal(String.valueOf(rslt + num_c).trim()).intValue();
        CobolDisplay.display("Add      RSLT    IS ");
    }

    private void rslt() {
        rslt = new BigDecimal(String.valueOf(0).trim()).intValue();
        rslt = new BigDecimal(String.valueOf(rslt + num_a + num_c + 10).trim()).intValue();
        CobolDisplay.display("Add      RSLT    IS ");
    }

    private void rslt_2() {
        rslt = new BigDecimal(String.valueOf(rslt - num_c).trim()).intValue();
        CobolDisplay.display("Subtract RSLT    IS ");
    }

    private void rslt_3() {
        rslt = new BigDecimal(String.valueOf(rslt - (num_a - 10)).trim()).intValue();
        CobolDisplay.display("Subtract RSLT    IS ");
    }

    private void rslt_4() {
        rslt = new BigDecimal(String.valueOf(0).trim()).intValue();
        rsltv1 = new BigDecimal(String.valueOf(num_a + num_c).trim()).intValue();
        CobolDisplay.display("Add      RSLTv9  IS " + String.valueOf(rsltv1));
        rslt = new BigDecimal(String.valueOf(num_a * num_c).trim()).intValue();
        CobolDisplay.display("Multiply RSLT    IS ");
    }

    private void rslt_5() {
        /* MULTIPLY without GIVING — needs runtime */
        CobolDisplay.display("Multiply RSLT    IS ");
    }

    private void rslt_6() {
        rslt = new BigDecimal(String.valueOf(num_a / 10).trim()).intValue();
        CobolDisplay.display("Divide   RSLT    IS ");
    }

    private void rslt_7() {
        rsltv1 = new BigDecimal(String.valueOf(rslt / 4).trim()).intValue();
        CobolDisplay.display("Divide   RSLTv9  IS ");
    }

    private void rsltv1() {
        rslt = new BigDecimal(String.valueOf(rslt / 4).trim()).intValue();
        CobolDisplay.display("Divide   RSLT    IS ");
    }

    private void rslt_8() {
        rsltv1 = new BigDecimal(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)).trim()).intValue();
        _unnamed.set(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)));
        rslt = new BigDecimal(String.valueOf((((((num_a / 100)) - ((num_b / 100)))) * 100)).trim()).intValue();
        CobolDisplay.display("Simple   RSLT    IS " + String.valueOf(rslt) + " RSLTv9  IS ");
    }

    private void rsltv1_2() {
        rsltv1 = new BigDecimal(String.valueOf((((((num_a / ((100.55 + -0.55)))) - ((num_b / (((10.11 * 10) - 1.1)))))) * ((220 / 2.2)))).trim()).intValue();
        _unnamed.set(String.valueOf((((((num_a / ((100.55 + -0.55)))) - ((num_b / (((10.11 * 10) - 1.1)))))) * ((220 / 2.2)))));
        rslt = new BigDecimal(String.valueOf((((((num_a / ((100.55 + -0.55)))) - ((num_b / (((10.11 * 10) - 1.1)))))) * ((220 / 2.2)))).trim()).intValue();
        CobolDisplay.display("Complex  RSLT    IS " + String.valueOf(rslt) + " RSLTv9  IS ");
    }

    private void rsltv1_3() {
        rsltv1 = new BigDecimal(String.valueOf((((((num_a / ((101 - 1)))) - ((num_b / ((10 * 10)))))) * ((200 / 2)))).trim()).intValue();
        _unnamed.set(String.valueOf((((((num_a / ((101 - 1)))) - ((num_b / ((10 * 10)))))) * ((200 / 2)))));
        rslt = new BigDecimal(String.valueOf((((((num_a / ((101 - 1)))) - ((num_b / ((10 * 10)))))) * ((200 / 2)))).trim()).intValue();
        CobolDisplay.display("Reduced  RSLT    IS " + String.valueOf(rslt) + " RSLTv9  IS ");
    }

    private void rsltv1_4() {
    }

    private void numv1() {
        if (true) {
            /* RAW: - ( NUM-B / ( 10 */
            CobolDisplay.display("Not Using ARITHMETIC-OSVS");
        } else {
            CobolDisplay.display("Using ARITHMETIC-OSVS");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc155DefaultArithmetic1().run();
    }
}
