package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions026FunctionExceptionStatus extends CobolProgram {
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
    private CobolString test_status = new CobolString(2);

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("NOTEXIST", "SEQUENTIAL", "SEQUENTIAL");
    // File status: TEST-STATUS


    private void para_main() {
        CobolDisplay.displayNoAdvancing(String.valueOf(CobolIntrinsics.exception_status()) + "|");
        test_file.open("INPUT");
        CobolDisplay.displayNoAdvancing(String.valueOf(CobolIntrinsics.exception_status()));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions026FunctionExceptionStatus().run();
    }
}
