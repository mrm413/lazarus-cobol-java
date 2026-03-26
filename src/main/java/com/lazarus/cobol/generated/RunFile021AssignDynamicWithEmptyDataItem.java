package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile021AssignDynamicWithEmptyDataItem extends CobolProgram {
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
    private CobolString path = new CobolString(10);
    private CobolString x = new CobolString(1);

    // FILE SECTION — test-file
    private CobolString test_rec = new CobolString(5);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("path", "LINE SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        /* RAW: CHAINING x */
        if (String.valueOf(x).equals(String.valueOf(" "))) {
            path.set(String.valueOf(" "));
        } else {
            path.set(String.valueOf("\u0000"));
        }
        test_file.open("INPUT");
        CobolDisplay.display("Hello");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile021AssignDynamicWithEmptyDataItem().run();
    }
}
