package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental032CallProgramPointer extends CobolProgram {
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
    private long prog_ptr = 0L;
    private int num = 0;


    private CobolString address = new CobolString(256);

    private void para_main() {
        prog_ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
        /* RAW: "recursion-test"  */
        CobolProgram.call(String.valueOf(prog_ptr), num);
        CobolDisplay.display("<");
        prog_ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
        /* RAW: "cancel-test"  */
        CobolProgram.call(String.valueOf(prog_ptr));
        CobolProgram.call(String.valueOf(prog_ptr));
        /* CANCEL "cancel-test" */
        prog_ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
        /* RAW: "cancel-test"  */
        CobolProgram.call(String.valueOf(prog_ptr));
        CobolDisplay.display("<");
        prog_ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
        /* RAW: "dummy-call"  */
        CobolProgram.call(String.valueOf(prog_ptr));
        for (int _i0 = 0; _i0 < 500000; _i0++) {
            CobolProgram.call(String.valueOf(prog_ptr));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental032CallProgramPointer().run();
    }
}
