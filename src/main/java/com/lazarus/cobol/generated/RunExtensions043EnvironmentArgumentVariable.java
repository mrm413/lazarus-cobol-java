package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions043EnvironmentArgumentVariable extends CobolProgram {
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
    private CobolString x = new CobolString(4);
    private CobolString y = new CobolString(8);
    private int z = 0;



    private void para_main() {
        CobolDisplay.display("TEST_ENV");
        x.set(String.valueOf(CobolIntrinsics.acceptFrom("ENVIRONMENT-VALUE")));
        CobolDisplay.display("(" + String.valueOf(x) + ")");
        CobolDisplay.display("RXW");
        x.set(String.valueOf(CobolIntrinsics.acceptFrom("ENVIRONMENT-VALUE")));
        CobolDisplay.display("(" + String.valueOf(x) + ")");
        y.set(String.valueOf(CobolIntrinsics.acceptFrom("ARGUMENT-VALUE")));
        CobolDisplay.display("(" + String.valueOf(y) + ")");
        z = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("ARGUMENT-NUMBER")).trim()).intValue();
        CobolDisplay.display("(" + String.valueOf(z) + ")");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions043EnvironmentArgumentVariable().run();
    }
}
