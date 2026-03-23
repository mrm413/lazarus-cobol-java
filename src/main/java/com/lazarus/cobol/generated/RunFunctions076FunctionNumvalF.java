package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions076FunctionNumvalF extends CobolProgram {
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
    private CobolString x1 = new CobolString(12);
    private CobolString x2 = new CobolString(12);
    private CobolString bad1 = new CobolString(18);
    private BigDecimal n = BigDecimal.ZERO;


    
    private CobolFile zero = new CobolFile("ZERO", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        n = new BigDecimal(String.valueOf(CobolIntrinsics.numval_f(x1)).trim());
        if (n.compareTo(new BigDecimal(String.valueOf(-1234).trim())) != 0) {
            CobolDisplay.display("X1 '" + String.valueOf(x1) + "' : ");
            /* RAW: N  */
        }
        n = new BigDecimal(String.valueOf(CobolIntrinsics.numval_f(x2)).trim());
        if (n.compareTo(new BigDecimal(String.valueOf(0.001234).trim())) != 0) {
            CobolDisplay.display("X2 '" + String.valueOf(x2) + "' : ");
            /* RAW: N  */
        }
        /* RAW: * Note : the following tests */
        /* RETURN zero */
        /* RAW: , 3.2 + get "whatever is valid there" * */
        n = new BigDecimal(String.valueOf(CobolIntrinsics.numval_f(bad1)).trim());
        if (n.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("BAD1 '" + String.valueOf(bad1) + "' : ");
            /* RAW: N  */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions076FunctionNumvalF().run();
    }
}
