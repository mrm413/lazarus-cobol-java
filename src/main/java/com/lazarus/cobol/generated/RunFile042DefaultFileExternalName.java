package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile042DefaultFileExternalName extends CobolProgram {
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
    private int erc = 0;
    private int rec_size = 0;

    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(1); // Group: file1-rec
    private CobolString file1_date = new CobolString(8);
    private CobolString file1_time = new CobolString(8);


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("FILE1", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        file1_date.set(String.valueOf(CobolIntrinsics.acceptFrom("DATE YYYYMMDD")));
        file1_time.set(String.valueOf(CobolIntrinsics.acceptFrom("TIME")));
    }

    private void file1() {
        file1.write(file1_rec);
    }

    private void file1_2() {
        CobolProgram.call("fexists_signed", "./file1", file1_rec, rec_size);
        if (erc != 0) {
            CobolDisplay.display("FAILED file1");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile042DefaultFileExternalName().run();
    }
}
