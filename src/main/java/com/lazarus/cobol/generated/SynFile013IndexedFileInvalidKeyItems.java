package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile013IndexedFileInvalidKeyItems extends CobolProgram {
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
    private short test_p2 = (short) 0;
    private BigDecimal test_p3 = BigDecimal.ZERO;

    // FILE SECTION — TEST-SOME
    private CobolString some_rec = new CobolString(20);

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(1); // Group: TEST-REC
    private CobolString test_p1 = new CobolString(4);
    private CobolString test_p4 = new CobolString(4);

    // FILE SECTION — TEST-MORE
    private CobolString more_rec = new CobolString(1); // Group: MORE-REC
    private CobolString more_data = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile test_some = new CobolFile("FILE-TEST", "INDEXED", "DYNAMIC");
    private CobolFile test_file = new CobolFile("FILE-TEST2", "INDEXED", "DYNAMIC");
    private CobolFile test_more = new CobolFile("FILE-TEST-EXT", "INDEXED", "DYNAMIC");


    private void para_main() {
    }

    private void test_file() {
    }

    private void test_file_2() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile013IndexedFileInvalidKeyItems().run();
    }
}
