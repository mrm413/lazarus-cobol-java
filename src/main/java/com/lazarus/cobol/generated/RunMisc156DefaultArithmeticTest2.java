package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc156DefaultArithmeticTest2 extends CobolProgram {
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
    private BigDecimal val = BigDecimal.ZERO;
    private BigDecimal div1 = BigDecimal.ZERO;
    private BigDecimal div2 = BigDecimal.ZERO;
    private BigDecimal div3 = BigDecimal.ZERO;
    private BigDecimal mul1 = BigDecimal.ZERO;
    private BigDecimal mul2 = BigDecimal.ZERO;
    private BigDecimal mul3 = BigDecimal.ZERO;
    private BigDecimal res = BigDecimal.ZERO;



    private void para_main() {
        res = new BigDecimal(String.valueOf(val.divide(div1, 18, RoundingMode.HALF_UP).divide(div2, 18, RoundingMode.HALF_UP)).trim());
        CobolDisplay.display("RES = " + String.valueOf(res));
        res = new BigDecimal(String.valueOf(val.divide(div1, 18, RoundingMode.HALF_UP).divide(div2, 18, RoundingMode.HALF_UP)).trim());
        CobolDisplay.display("RES ROUNDED = " + String.valueOf(res));
        res = new BigDecimal(String.valueOf(val.multiply(mul1).divide(div3, 18, RoundingMode.HALF_UP).divide(div2, 18, RoundingMode.HALF_UP)).trim());
        CobolDisplay.display("RES MULT1 = " + String.valueOf(res));
        res = new BigDecimal(String.valueOf(val.multiply(mul2).multiply(mul3).divide(div3, 18, RoundingMode.HALF_UP).divide(div2, 18, RoundingMode.HALF_UP)).trim());
        CobolDisplay.display("RES MULT2 = " + String.valueOf(res));
        res = new BigDecimal(String.valueOf(val.divide(div1, 18, RoundingMode.HALF_UP)).trim());
        CobolDisplay.display("RES 1 = " + String.valueOf(res));
        res = new BigDecimal(String.valueOf(res.divide(div2, 18, RoundingMode.HALF_UP)).trim());
        CobolDisplay.display("RES F = " + String.valueOf(res));
        res = new BigDecimal(String.valueOf(val.divide(div1, 18, RoundingMode.HALF_UP).divide(div2, 18, RoundingMode.HALF_UP)).trim());
        CobolDisplay.display("RES ROUNDED AWAY = " + String.valueOf(res));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc156DefaultArithmeticTest2().run();
    }
}
