package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay006ArithmeticTruncationWithUsageDisplay extends CobolProgram {
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
    private int result = 0;


    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString sign = new CobolString(256); // fallback
    private CobolString drop = new CobolString(256); // fallback
    private CobolString truncation = new CobolString(256); // fallback
    private CobolString with = new CobolString(256); // fallback
    private CobolString leading = new CobolString(256); // fallback
    private CobolString after = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        /* RAW: * internal arithmetic to */
        CobolDisplay.display();
        result = new BigDecimal(String.valueOf(1).trim()).intValue();
        result = new BigDecimal(String.valueOf(((15 + result) - (2 / result))).trim()).intValue();
        if (result != 14) {
            CobolDisplay.display("NOT 14: " + String.valueOf(result));
        }
        /* RAW: * internal arithmetic to */
        CobolDisplay.display(String.valueOf(_filler_002) + String.valueOf(sign) + String.valueOf(drop));
        result = new BigDecimal(String.valueOf(1).trim()).intValue();
        result = new BigDecimal(String.valueOf(((15 + result) - (20 / result))).trim()).intValue();
        if (result != 4) {
            CobolDisplay.display("NOT [-] 4: " + String.valueOf(result));
        }
        /* RAW: * internal arithmetic to */
        CobolDisplay.display(String.valueOf(truncation));
        result = new BigDecimal(String.valueOf(1).trim()).intValue();
        result = new BigDecimal(String.valueOf((15 + (result / 2))).trim()).intValue();
        if (result != 15) {
            CobolDisplay.display("NOT 15: " + String.valueOf(result));
        }
        /* RAW: * internal arithmetic to */
        CobolDisplay.display(String.valueOf(truncation));
        result = new BigDecimal(String.valueOf(1).trim()).intValue();
        result = new BigDecimal(String.valueOf(((15 + result) - (2000 / result))).trim()).intValue();
        if (result != 984) {
            CobolDisplay.display("NOT [-1] 984: " + String.valueOf(result));
        }
        /* RAW: * internal arithmetic to */
        CobolDisplay.display(String.valueOf((Integer.parseInt(String.valueOf(truncation).trim()) * Integer.parseInt(String.valueOf(with).trim()))) + String.valueOf(leading) + 0 + String.valueOf(after) + String.valueOf(truncation));
        result = new BigDecimal(String.valueOf(1).trim()).intValue();
        result = new BigDecimal(String.valueOf(((15 + result) + (2000 / result))).trim()).intValue();
        if (result != 16) {
            CobolDisplay.display("NOT [+20] 16: " + String.valueOf(result));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataDisplay006ArithmeticTruncationWithUsageDisplay().run();
    }
}
