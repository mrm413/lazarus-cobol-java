package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions125UdfWithRecursion extends CobolProgram {
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
    private int ttl = 0;

    // LOCAL-STORAGE SECTION
    private int num = 0;

    // LINKAGE SECTION
    private int arg = 0;
    private int ret = 0;



    private void para_main() {
        if (arg < 5) {
            num = new BigDecimal(String.valueOf(1).trim()).intValue();
        // KNOWN_ISSUE: ret = new BigDecimal(String.valueOf(CobolIntrinsics.foo(num)).trim()).intValue();
        } else {
            ret = new BigDecimal(String.valueOf(arg).trim()).intValue();
        }
        CobolDisplay.display("Step: " + String.valueOf(ttl) + ", Arg: " + String.valueOf(arg) + ", Return: " + String.valueOf(ret));
        ttl = new BigDecimal(String.valueOf(ttl + 1).trim()).intValue();
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions125UdfWithRecursion().run();
    }
}
