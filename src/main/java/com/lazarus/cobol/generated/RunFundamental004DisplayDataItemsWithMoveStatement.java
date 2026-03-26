package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental004DisplayDataItemsWithMoveStatement extends CobolProgram {
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
    private CobolString x_abc = new CobolString(3);
    private int x_123 = 0;
    private int x_p123 = 0;
    private int x_n123 = 0;
    private int x_12_3 = 0;
    private BigDecimal x_p12_3 = BigDecimal.ZERO;
    private BigDecimal x_n12_3 = BigDecimal.ZERO;



    private void para_main() {
        x_abc.set(String.valueOf("abc"));
        CobolDisplay.display(String.valueOf(x_abc));
        x_123 = new BigDecimal(String.valueOf(123).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_123));
        x_p123 = new BigDecimal(String.valueOf(123).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_p123));
        x_n123 = new BigDecimal(String.valueOf(-123).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_n123));
        x_12_3 = new BigDecimal(String.valueOf(12.3).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_12_3));
        x_p12_3 = new BigDecimal(String.valueOf(12.3).trim());
        CobolDisplay.display(String.valueOf(x_p12_3));
        x_n12_3 = new BigDecimal(String.valueOf(-12.3).trim());
        CobolDisplay.display(String.valueOf(x_n12_3));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental004DisplayDataItemsWithMoveStatement().run();
    }
}
