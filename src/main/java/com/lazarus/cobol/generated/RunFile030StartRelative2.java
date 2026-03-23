package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile030StartRelative2 extends CobolProgram {
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
    private int testkey = 0;
    private CobolString teststat = new CobolString(2);

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("TESTFILE", "RELATIVE", "DYNAMIC");
    // File status: TESTSTAT

    private CobolString v_ok = new CobolString(256);
    private CobolString v_zero = new CobolString(256);

    private void para_main() {
    }

    private void test_file() {
        if (!(!String.valueOf(v_ok).trim().isEmpty())) {
            CobolDisplay.display("OPEN " + String.valueOf(teststat));
            return;
        }
    }

    private void testkey() {
    }

    private void test_rec() {
        test_file.write(test_rec);
        /* INVALID KEY handling — needs file status check */
    }

    private void testkey_2() {
    }

    private void test_rec_2() {
        test_file.write(test_rec);
        /* INVALID KEY handling — needs file status check */
    }

    private void testkey_3() {
        test_file.start();
        if (!(!String.valueOf(v_zero).trim().isEmpty())) {
            CobolDisplay.display("START " + String.valueOf(teststat));
        }
        if (testkey != 99) {
            CobolDisplay.display("TESTKEY " + String.valueOf(testkey));
        }
    }

    private void test_rec_3() {
        if (test_file.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        if (!(!String.valueOf(v_zero).trim().isEmpty())) {
            CobolDisplay.display("READ " + String.valueOf(teststat));
        }
        if (!String.valueOf(test_rec).equals(String.valueOf("0003"))) {
            CobolDisplay.display("READ RECORD " + String.valueOf(test_rec));
        }
    }

    private void test_file_2() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile030StartRelative2().run();
    }
}
