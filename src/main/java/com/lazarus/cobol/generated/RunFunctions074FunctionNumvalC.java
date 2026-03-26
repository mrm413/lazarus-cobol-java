package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions074FunctionNumvalC extends CobolProgram {
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
    private CobolString x1 = new CobolString(14);
    private CobolString x2 = new CobolString(18);
    private CobolString x2b = new CobolString(18);
    private CobolString x2c = new CobolString(18);
    private CobolString x2d = new CobolString(18);
    private CobolString x3 = new CobolString(12);
    private CobolString x4 = new CobolString(12);
    private CobolString bad1 = new CobolString(18);
    private CobolString bad2 = new CobolString(18);
    private CobolString bad3 = new CobolString(18);
    private BigDecimal n = BigDecimal.ZERO;


    // FALLBACK FILE DESCRIPTORS
    private CobolFile zero = new CobolFile("ZERO", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        // Method body requires runtime extensions
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions074FunctionNumvalC().run();
    }
}
