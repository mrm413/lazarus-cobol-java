package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile003OutputOnSequentialFileToMissingDirectory extends CobolProgram {
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
    private CobolString wsfs = new CobolString(2);

    // FILE SECTION — FILE0
    private CobolString f0rec = new CobolString(80);


    // FILE DESCRIPTORS
    private CobolFile file0 = new CobolFile("./nosubhere/MYFILE0", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WSFS


    private void para_main() {
        /* RAW: *  */
        file0.open("OUTPUT");
        if (!String.valueOf(wsfs).equals(String.valueOf("30"))) {
            CobolDisplay.display("STATUS OPENO " + String.valueOf(wsfs));
        }
        /* RAW: *  */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile003OutputOnSequentialFileToMissingDirectory().run();
    }
}
