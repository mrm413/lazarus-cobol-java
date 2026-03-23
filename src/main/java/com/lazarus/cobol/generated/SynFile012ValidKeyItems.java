package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile012ValidKeyItems extends CobolProgram {
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
    private CobolString ws_rec = new CobolString(1); // Group: WS-REC
    private short test_p2 = (short) 0;
    private BigDecimal test_p3 = BigDecimal.ZERO;

    // FILE SECTION — TEST-SOME
    private CobolString some_rec = new CobolString(1); // Group: SOME-REC

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(1); // Group: TEST-REC
    private CobolString test_p1 = new CobolString(4);
    private CobolString test_p4 = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile test_some = new CobolFile("FILE-TEST", "INDEXED", "DYNAMIC");
    private CobolFile test_file = new CobolFile("FILE-TEST2", "INDEXED", "DYNAMIC");

    
    private CobolFile _unnamed = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        test_file.open("INPUT");
        test_file.close();
        test_some.open("OUTPUT");
        /* MOVE CORRESPONDING WS-REC TO SOME-REC — requires runtime */
        test_some.write(some_rec);
        test_some.close();
        _unnamed.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile012ValidKeyItems().run();
    }
}
