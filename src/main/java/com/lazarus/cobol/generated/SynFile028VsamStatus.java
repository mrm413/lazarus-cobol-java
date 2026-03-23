package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile028VsamStatus extends CobolProgram {
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
    private CobolString status_1 = new CobolString(2);
    private CobolString status_2 = new CobolString(6);

    // FILE SECTION — FILE1
    private CobolString file1_rec = new CobolString(1); // Group: FILE1-REC
    private CobolString file1_key = new CobolString(1);

    // FILE SECTION — FILE2
    private CobolString file2_rec = new CobolString(1); // Group: FILE2-REC
    private int file2_key = 0;
    private CobolString file2_dat = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("FILE-TEST", "INDEXED", "DYNAMIC");
    // File status: STATUS-1
    private CobolFile file2 = new CobolFile("FILE-TEST", "INDEXED", "DYNAMIC");
    // File status: STATUS-1


    private void para_main() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile028VsamStatus().run();
    }
}
