package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions093BitShiftOperations extends CobolProgram {
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
    private CobolString x1 = new CobolString(2);
    private CobolString x2 = new CobolString(2);
    private short n1 = (short) 0;
    private short n2 = (short) 0;


    private CobolString x = new CobolString(256); // fallback
    private CobolString _0 = new CobolString(256); // fallback
    private CobolString a = new CobolString(256); // fallback
    private CobolString to = new CobolString(256); // fallback
    private CobolString _7573 = new CobolString(256); // fallback

    private void para_main() {
        _0.set(String.valueOf(x));
        a.set(String.valueOf(x));
        to.set(String.valueOf(x));
        x2.set(String.valueOf(x));
        CobolDisplay.display("Using PIC XX COMP-X");
        x1.set(String.valueOf((x)));
        /* RAW: 22 B-LEFT x 05 ) */
        CobolDisplay.display(" x#22 B-LEFT  x#05   is " + String.valueOf(x1));
        x1.set(String.valueOf((x)));
        /* RAW: 22 B-RIGHT x 02 ) */
        CobolDisplay.display(" x#22 B-RIGHT x#02   is " + String.valueOf(x1));
        x1.set(String.valueOf((x)));
        /* RAW: 22 B-SHIFT-L x 05 ) */
        CobolDisplay.display(" x#22 B-SHIFT-L x#05 is " + String.valueOf(x1));
        x1.set(String.valueOf((x)));
        /* RAW: 22 B-SHIFT-R x 02 ) */
        CobolDisplay.display(" x#22 B-SHIFT-R x#02 is " + String.valueOf(x1));
        x1.set(String.valueOf((x2)));
        /* RAW: B-LEFT x 05 ) */
        CobolDisplay.display(String.valueOf(x2) + " B-LEFT  x#05   is " + String.valueOf(x1));
        x1.set(String.valueOf((x2)));
        /* RAW: B-RIGHT x 02 ) */
        CobolDisplay.display(String.valueOf(x2) + " B-RIGHT x#02   is " + String.valueOf(x1));
        _7573.set(String.valueOf(x));
        to.set(String.valueOf(x));
        x2.set(String.valueOf(x));
        x1.set(String.valueOf((x2)));
        /* RAW: B-SHIFT-LC 4 ) */
        CobolDisplay.display(String.valueOf(x2) + " B-SHIFT-LC 4   is " + String.valueOf(x1));
        x1.set(String.valueOf((x2)));
        /* RAW: B-SHIFT-RC 4 ) */
        CobolDisplay.display(String.valueOf(x2) + " B-SHIFT-RC 4   is " + String.valueOf(x1));
        n2 = new BigDecimal(String.valueOf(10).trim()).shortValue();
        CobolDisplay.display("Using PIC 9(4) COMP-5");
        n1 = new BigDecimal(String.valueOf((x)).trim()).shortValue();
        /* RAW: 22 B-LEFT x 05 ) */
        CobolDisplay.display(" x#22 B-LEFT  x#05   is " + String.valueOf(n1));
        n1 = new BigDecimal(String.valueOf((x)).trim()).shortValue();
        /* RAW: 22 B-RIGHT x 02 ) */
        CobolDisplay.display(" x#22 B-RIGHT x#02   is " + String.valueOf(n1));
        n1 = new BigDecimal(String.valueOf((x)).trim()).shortValue();
        /* RAW: 22 B-SHIFT-L x 05 ) */
        CobolDisplay.display(" x#22 B-SHIFT-L x#05 is " + String.valueOf(n1));
        n1 = new BigDecimal(String.valueOf((x)).trim()).shortValue();
        /* RAW: 22 B-SHIFT-R x 02 ) */
        CobolDisplay.display(" x#22 B-SHIFT-R x#02 is " + String.valueOf(n1));
        n1 = new BigDecimal(String.valueOf((n2)).trim()).shortValue();
        /* RAW: B-LEFT x 05 ) */
        CobolDisplay.display(String.valueOf(n2) + " B-LEFT  x#05   is " + String.valueOf(n1));
        n1 = new BigDecimal(String.valueOf((n2)).trim()).shortValue();
        /* RAW: B-RIGHT x 02 ) */
        CobolDisplay.display(String.valueOf(n2) + " B-RIGHT x#02   is " + String.valueOf(n1));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions093BitShiftOperations().run();
    }
}
