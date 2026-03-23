package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile046LineSequentialRecordTruncation1 extends CobolProgram {
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
    private CobolString test_rec = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("./TEST-FILE", "LINE SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        test_file.open("INPUT");
        while (true) {
            if (test_file.read(null) == FileStatus.AT_END) {
                break;
            }
            CobolDisplay.display("(" + String.valueOf(test_rec) + ")");
        }
    }

    private void test_file() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile046LineSequentialRecordTruncation1().run();
    }
}
