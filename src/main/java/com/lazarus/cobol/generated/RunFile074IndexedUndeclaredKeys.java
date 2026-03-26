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
        file1.open("OUTPUT");
        for (ix = 1; !(ix > 10); ix += 1) {
            file1_key1 = new BigDecimal(String.valueOf(ix).trim()).intValue();
            file1_data = new BigDecimal(String.valueOf(ix).trim()).intValue();
            file1_key2 = new BigDecimal(String.valueOf(100).trim()).intValue();
            file1_key3 = new BigDecimal(String.valueOf(200).trim()).intValue();
            file1.write(file1_rec);
        }
        file1.close();
        /* RAW: *  */
        file1.open("INPUT");
        for (ix = 1; !(ix > 10); ix += 1) {
            file1_key1 = new BigDecimal(String.valueOf(ix).trim()).intValue();
            if (file1.read(null) == FileStatus.AT_END) {
            }
            if (file1_data != ix) {
                CobolDisplay.display("FAILED 1-1");
            }
        }
        for (ix = 1; !(ix > 10); ix += 1) {
            file1_key2 = new BigDecimal(String.valueOf(100).trim()).intValue();
            if (file1.read(null) == FileStatus.AT_END) {
            }
            if (file1_data != ix) {
                CobolDisplay.display("FAILED 1-2");
            }
        }
        for (ix = 1; !(ix > 10); ix += 1) {
            file1_key3 = new BigDecimal(String.valueOf(200).trim()).intValue();
            if (file1.read(null) == FileStatus.AT_END) {
            }
            if (file1_data != ix) {
                CobolDisplay.display("FAILED 1-3");
            }
        }
        file1.close();
        /* RAW: *  */
        file2.open("INPUT");
        for (ix = 1; !(ix > 10); ix += 1) {
            file2_key1 = new BigDecimal(String.valueOf(ix).trim()).intValue();
            if (file2.read(null) == FileStatus.AT_END) {
            }
            if (file2_data != ix) {
                CobolDisplay.display("FAILED 2-1");
            }
        }
        for (ix = 1; !(ix > 10); ix += 1) {
            file2_key2 = new BigDecimal(String.valueOf(100).trim()).intValue();
            if (file2.read(null) == FileStatus.AT_END) {
            }
            if (file2_data != ix) {
                CobolDisplay.display("FAILED 2-2");
            }
        }
        file2.close();
        /* RAW: *  */
        file3.open("INPUT");
        for (ix = 1; !(ix > 10); ix += 1) {
            file3_key1 = new BigDecimal(String.valueOf(ix).trim()).intValue();
            if (file3.read(null) == FileStatus.AT_END) {
            }
            if (file3_data != ix) {
                CobolDisplay.display("FAILED 3-1");
            }
        }
        file3.close();
        /* RAW: * * Insert rec via file */
        file3.open("I-O");
        ix = new BigDecimal(String.valueOf(20).trim()).intValue();
        file3_key1 = new BigDecimal(String.valueOf(ix).trim()).intValue();
        file3_data = new BigDecimal(String.valueOf(ix).trim()).intValue();
        file3_key2 = new BigDecimal(String.valueOf(100).trim()).intValue();
        file3_key3 = new BigDecimal(String.valueOf(200).trim()).intValue();
        file3.write(file3_rec);
        file3.close();
        // KNOWN_ISSUE: _filler_002.close();
        // KNOWN_ISSUE: _filler_003.close();
        check.close();
        cb_new.close();
        rec.close();
        is.close();
        visible.close();
        in.close();
        other.close();
        files.close();
        file1.open("INPUT");
        file1_key1 = new BigDecimal(String.valueOf(10).trim()).intValue();
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (file1_data != 10) {
            CobolDisplay.display("FAILED 1-4");
        }
        file1_rec.set(String.valueOf(" "));
        file1_key2 = new BigDecimal(String.valueOf(110).trim()).intValue();
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (file1_data != 10) {
            CobolDisplay.display("FAILED 1-5");
        }
        file1_rec.set(String.valueOf(" "));
        file1_key3 = new BigDecimal(String.valueOf(210).trim()).intValue();
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (file1_data != 10) {
            CobolDisplay.display("FAILED 1-6");
        }
        file1.close();
        /* RAW: *  */
        file2.open("INPUT");
        file2_key1 = new BigDecimal(String.valueOf(10).trim()).intValue();
        if (file2.read(null) == FileStatus.AT_END) {
        }
        if (file2_data != 10) {
            CobolDisplay.display("FAILED 2-3");
        }
        file2_rec.set(String.valueOf(" "));
        file2_key2 = new BigDecimal(String.valueOf(110).trim()).intValue();
        if (file2.read(null) == FileStatus.AT_END) {
        }
        if (file2_data != 10) {
            CobolDisplay.display("FAILED 2-4");
        }
        file2.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile074IndexedUndeclaredKeys().run();
    }
}
