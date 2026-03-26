package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile010RewriteARelativeFileWithRandomAccess extends CobolProgram {
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
    private int test_key = 0;

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("./TEST-FILE", "RELATIVE", "RANDOM");


    private void para_main() {
        /* RAW: *  */
        test_file.open("OUTPUT");
        test_key = new BigDecimal(String.valueOf(1).trim()).intValue();
        test_rec.set(String.valueOf("A"));
        test_file.write(test_rec);
        test_key = new BigDecimal(String.valueOf(2).trim()).intValue();
        test_rec.set(String.valueOf("B"));
        test_file.write(test_rec);
        test_file.close();
        /* RAW: *  */
        test_file.open("I-O");
        test_key = new BigDecimal(String.valueOf(1).trim()).intValue();
        if (test_file.read(null) == FileStatus.AT_END) {
        }
        test_key = new BigDecimal(String.valueOf(2).trim()).intValue();
        test_rec.set(String.valueOf("C"));
        test_file.rewrite(test_rec);
        test_file.close();
        /* RAW: *  */
        test_file.open("INPUT");
        test_key = new BigDecimal(String.valueOf(1).trim()).intValue();
        if (test_file.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(test_rec).equals(String.valueOf("A"))) {
            CobolDisplay.display("Expected 'A' - Got " + String.valueOf(test_rec));
        }
        test_key = new BigDecimal(String.valueOf(2).trim()).intValue();
        if (test_file.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(test_rec).equals(String.valueOf("C"))) {
            CobolDisplay.display("Expected 'C' - Got " + String.valueOf(test_rec));
        }
        test_file.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile010RewriteARelativeFileWithRandomAccess().run();
    }
}
