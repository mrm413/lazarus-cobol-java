package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions001FunctionAcos extends CobolProgram {
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
    private BigDecimal z = BigDecimal.ZERO;
    private BigDecimal p = BigDecimal.ZERO;
    private BigDecimal s = BigDecimal.ZERO;


    private CobolString n = new CobolString(256); // fallback
    private CobolString display = new CobolString(256); // fallback

    private void para_main() {
        z = new BigDecimal(String.valueOf(CobolIntrinsics.acos(-0.2345)).trim());
        if (z.compareTo(new BigDecimal(String.valueOf(1.8075005211082433).trim())) != 0) {
            CobolDisplay.display("DISPLAY: " + String.valueOf(z));
        }
        p = new BigDecimal(String.valueOf(CobolIntrinsics.acos(-0.2345)).trim());
        if (p.compareTo(new BigDecimal(String.valueOf(1.8075005211082433).trim())) != 0) {
            CobolDisplay.display("PACKED: " + String.valueOf(p));
        }
        s = new BigDecimal(String.valueOf(CobolIntrinsics.acos(-0.2345)).trim());
        if (s.compareTo(new BigDecimal(String.valueOf(1.8075005211082433).trim())) != 0) {
            CobolDisplay.display("COMP-6: " + String.valueOf(s));
        }
        /* RAW: *  */
        n.set(String.valueOf(CobolIntrinsics.acos(-0.2345)));
        /* RAW: *  */
        if (!String.valueOf(n).equals(String.valueOf((1.8075005211082433 * Integer.parseInt(String.valueOf(display).trim()))))) {
            /* RAW: "PACKED: " N */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions001FunctionAcos().run();
    }
}
