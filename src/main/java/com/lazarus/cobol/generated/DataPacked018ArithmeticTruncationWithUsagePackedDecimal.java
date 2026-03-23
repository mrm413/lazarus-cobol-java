package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked018ArithmeticTruncationWithUsagePackedDecimal extends CobolProgram {
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
    private BigDecimal result = BigDecimal.ZERO;
    private CobolString fence_b = new CobolString(3);


    private CobolString _unnamed = new CobolString(256);
    private CobolString sign = new CobolString(256);
    private CobolString drop = new CobolString(256);
    private CobolString truncation = new CobolString(256);
    private CobolString with = new CobolString(256);
    private CobolString leading = new CobolString(256);
    private CobolString after = new CobolString(256);

    private void para_main() {
        /* RAW: * internal arithmetic to */
        CobolDisplay.display();
        result = new BigDecimal(String.valueOf(1).trim());
        result = new BigDecimal(String.valueOf(new BigDecimal(String.valueOf(15).trim()).add(result).subtract(new BigDecimal(String.valueOf(2).trim()).divide(result, 18, RoundingMode.HALF_UP))).trim());
        if (result.compareTo(new BigDecimal(String.valueOf(14).trim())) != 0) {
            CobolDisplay.display("NOT 14: ");
            /* RAW: RESULT  */
        }
        /* RAW: * internal arithmetic to */
        CobolDisplay.display(String.valueOf(_unnamed) + String.valueOf(sign) + String.valueOf(drop));
        result = new BigDecimal(String.valueOf(1).trim());
        result = new BigDecimal(String.valueOf(new BigDecimal(String.valueOf(15).trim()).add(result).subtract(new BigDecimal(String.valueOf(20).trim()).divide(result, 18, RoundingMode.HALF_UP))).trim());
        if (result.compareTo(new BigDecimal(String.valueOf(4).trim())) != 0) {
            CobolDisplay.display("NOT [-] 4: ");
            /* RAW: RESULT  */
        }
        /* RAW: * internal arithmetic to */
        CobolDisplay.display(String.valueOf(truncation));
        result = new BigDecimal(String.valueOf(1).trim());
        result = new BigDecimal(String.valueOf(new BigDecimal(String.valueOf(15).trim()).add(result.divide(new BigDecimal(String.valueOf(2).trim()), 18, RoundingMode.HALF_UP))).trim());
        if (result.compareTo(new BigDecimal(String.valueOf(15).trim())) != 0) {
            CobolDisplay.display("NOT 15: ");
            /* RAW: RESULT  */
        }
        /* RAW: * internal arithmetic to */
        CobolDisplay.display(String.valueOf(truncation));
        result = new BigDecimal(String.valueOf(1).trim());
        result = new BigDecimal(String.valueOf(new BigDecimal(String.valueOf(15).trim()).add(result).subtract(new BigDecimal(String.valueOf(2000).trim()).divide(result, 18, RoundingMode.HALF_UP))).trim());
        if (result.compareTo(new BigDecimal(String.valueOf(984).trim())) != 0) {
            CobolDisplay.display("NOT [-1] 984: ");
            /* RAW: RESULT  */
        }
        /* RAW: * internal arithmetic to */
        CobolDisplay.display(String.valueOf((Integer.parseInt(String.valueOf(truncation).trim()) * Integer.parseInt(String.valueOf(with).trim()))) + String.valueOf(leading) + 0 + String.valueOf(after) + String.valueOf(truncation));
        result = new BigDecimal(String.valueOf(1).trim());
        result = new BigDecimal(String.valueOf(new BigDecimal(String.valueOf(15).trim()).add(result).add(new BigDecimal(String.valueOf(2000).trim()).divide(result, 18, RoundingMode.HALF_UP))).trim());
        if (result.compareTo(new BigDecimal(String.valueOf(16).trim())) != 0) {
            CobolDisplay.display("NOT [+20] 16: ");
            /* RAW: RESULT  */
        }
        if (!String.valueOf(fence_a).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-A");
        }
        if (!String.valueOf(fence_b).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-B");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked018ArithmeticTruncationWithUsagePackedDecimal().run();
    }
}
