package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile074IndexedUndeclaredKeys extends CobolProgram {
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
    private int ix = 0;

    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(1); // Group: file1-rec
    private int file1_key1 = 0;
    private int file1_key2 = 0;
    private int file1_key3 = 0;
    private int file1_data = 0;

    // FILE SECTION — file2
    private CobolString file2_rec = new CobolString(1); // Group: file2-rec
    private int file2_key1 = 0;
    private int file2_key2 = 0;
    private int file2_key3 = 0;
    private int file2_data = 0;

    // FILE SECTION — file3
    private CobolString file3_rec = new CobolString(1); // Group: file3-rec
    private int file3_key1 = 0;
    private int file3_key2 = 0;
    private int file3_key3 = 0;
    private int file3_data = 0;


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("./fileX", "INDEXED", "RANDOM");
    private CobolFile file2 = new CobolFile("./fileX", "INDEXED", "RANDOM");
    private CobolFile file3 = new CobolFile("./fileX", "INDEXED", "RANDOM");

    // FALLBACK FILE DESCRIPTORS
    private CobolFile _filler_001 = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile check = new CobolFile("CHECK", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile cb_new = new CobolFile("NEW", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile rec = new CobolFile("REC", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile is = new CobolFile("IS", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile visible = new CobolFile("VISIBLE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile in = new CobolFile("IN", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile other = new CobolFile("OTHER", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile files = new CobolFile("FILES", "SEQUENTIAL", "SEQUENTIAL");


    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private void para_main() {
        // Method body requires runtime extensions
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile074IndexedUndeclaredKeys().run();
    }
}
