package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions053FunctionLowerCaseWithReferenceModding extends CobolProgram {
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
    private CobolString x = new CobolString(10);
    private CobolString test_fld = new CobolString(3);


    private CobolString _unnamed = new CobolString(256);
    private CobolString _1 = new CobolString(256);
    private CobolString _3 = new CobolString(256);
    private CobolString to = new CobolString(256);

    private void para_main() {
        _unnamed.set(String.valueOf(CobolIntrinsics.lower_case(x)));
        _1.set(String.valueOf(CobolIntrinsics.lower_case(x)));
        _unnamed.set(String.valueOf(CobolIntrinsics.lower_case(x)));
        _3.set(String.valueOf(CobolIntrinsics.lower_case(x)));
        _unnamed.set(String.valueOf(CobolIntrinsics.lower_case(x)));
        to.set(String.valueOf(CobolIntrinsics.lower_case(x)));
        test_fld.set(String.valueOf(CobolIntrinsics.lower_case(x)));
        if (!String.valueOf(test_fld).equals(String.valueOf("a#b"))) {
            CobolDisplay.display(String.valueOf(test_fld));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions053FunctionLowerCaseWithReferenceModding().run();
    }
}
