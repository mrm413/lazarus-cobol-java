package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile044LineSequentialBasicIO extends CobolProgram {
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
    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(1);

    // FILE SECTION — file2
    private CobolString file2_rec = new CobolString(2);


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("ORGANIZATION", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file2 = new CobolFile("ORGANIZATION", "LINE SEQUENTIAL", "SEQUENTIAL");

    // FALLBACK FILE DESCRIPTORS
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile _filler_001 = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString _filler_002 = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private void para_main() {
        file.delete();
        /* RAW: file1 , file2 */
        file1.open("OUTPUT");
        /* OPEN , — skipped, not a file */
        file2.open("OUTPUT");
        file1_rec.set(String.valueOf("A"));
        _filler_003.set(String.valueOf("A"));
        file2_rec.set(String.valueOf("A"));
        file1.write(file1_rec);
        file2.write(file2_rec);
        file1_rec.set(String.valueOf(" "));
        _filler_004.set(String.valueOf(" "));
        file2_rec.set(String.valueOf(" "));
        file1.write(file1_rec);
        file2.write(file2_rec);
        file1.write("A");
        file2.write("AA");
        file1.write(" ");
        file2.write(" A");
        file1.close();
        /* CLOSE , — skipped, not a file */
        file2.close();
        file1.open("INPUT");
        /* OPEN , — skipped, not a file */
        file2.open("INPUT");
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file1_rec).equals(String.valueOf("A"))) {
            CobolDisplay.display("FAILED 1 file1 - '" + String.valueOf(file1_rec) + "'");
        }
        if (file2.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file2_rec).equals(String.valueOf("A"))) {
            CobolDisplay.display("FAILED 1 file2 - '" + String.valueOf(file2_rec) + "'");
        }
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file1_rec).equals(String.valueOf(" "))) {
            CobolDisplay.display("FAILED 2 file1 - '" + String.valueOf(file1_rec) + "'");
        }
        if (file2.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file2_rec).equals(String.valueOf(" "))) {
            CobolDisplay.display("FAILED 2 file2 - '" + String.valueOf(file2_rec) + "'");
        }
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file1_rec).equals(String.valueOf("A"))) {
            CobolDisplay.display("FAILED 3 file1 - '" + String.valueOf(file1_rec) + "'");
        }
        if (file2.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file2_rec).equals(String.valueOf("AA"))) {
            CobolDisplay.display("FAILED 3 file2 - '" + String.valueOf(file2_rec) + "'");
        }
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file1_rec).equals(String.valueOf(" "))) {
            CobolDisplay.display("FAILED 4 file1 - '" + String.valueOf(file1_rec) + "'");
        }
        if (file2.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file2_rec).equals(String.valueOf(" A"))) {
            CobolDisplay.display("FAILED 4 file2 - '" + String.valueOf(file2_rec) + "'");
        }
        file1.close();
        /* CLOSE , — skipped, not a file */
        file2.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile044LineSequentialBasicIO().run();
    }
}
