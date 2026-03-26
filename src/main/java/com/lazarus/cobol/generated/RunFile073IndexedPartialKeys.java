package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile073IndexedPartialKeys extends CobolProgram {
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
    private CobolString f_status = new CobolString(2);
    private int w_serial = 0;

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1); // Group: f-rec
    private CobolString f_key1 = new CobolString(1); // Group: f-key1
    private CobolString f_key1_1 = new CobolString(3);
    private CobolString f_key1_2 = new CobolString(3);
    private CobolString f_key2 = new CobolString(1); // Group: f-key2
    private CobolString f_key2_1 = new CobolString(3);
    private CobolString f_key2_2 = new CobolString(3);
    private CobolString f_key3 = new CobolString(1); // Group: f-key3
    private CobolString f_key3_1 = new CobolString(3);
    private CobolString f_key3_2 = new CobolString(3);
    private int file1_serial = 0;


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("fileX", "INDEXED", "DYNAMIC");
    // File status: f-status

    // FALLBACK FILE DESCRIPTORS
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file_status = new CobolFile("FILE-STATUS", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString duplicates = new CobolString(256); // fallback
    private CobolString depends = new CobolString(256); // fallback

    private void para_main() {
        // Method body requires runtime extensions
    }

    private void write_f() {
        // Method body requires runtime extensions
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile073IndexedPartialKeys().run();
    }
}
