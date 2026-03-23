package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental090UseForDebuggingFile extends CobolProgram {
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
    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(40);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("./TEST-FILE", "SEQUENTIAL", "SEQUENTIAL");


    // SECTION: TEST-DEBUG
    private void test_debug() {
        use();
        test_file();
    }

    private void use() {
        /* RAW: FOR DEBUGGING ON */
    }

    private void test_file() {
        CobolDisplay.display(String.valueOf(debug_item) + "|");
    }

    private void some_par() {
    }

    private void test_file_2() {
        test_file.write("DEF");
    }

    private void test_file_3() {
    }

    private void test_file_4() {
        if (test_file.read(null) == FileStatus.AT_END) {
        }
    }

    private void test_file_5() {
        System.exit(0);
    }

    @Override
    public void run() {
        some_par();
    }

    public static void main(String[] args) {
        new RunFundamental090UseForDebuggingFile().run();
    }
}
