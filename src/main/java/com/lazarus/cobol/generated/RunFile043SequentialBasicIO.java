package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile043SequentialBasicIO extends CobolProgram {
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


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("ORGANIZATION", "SEQUENTIAL", "SEQUENTIAL");

    
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        file.delete();
    }

    private void file1() {
    }

    private void file1_2() {
    }

    private void file1_rec() {
        file1.write(file1_rec);
    }

    private void file1_3() {
    }

    private void file1_4() {
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file1_rec).equals(String.valueOf("A"))) {
            CobolDisplay.display("FIRST READ FAILED");
        } else {
            file1_rec.set(String.valueOf("X"));
            file1.rewrite(file1_rec);
        }
    }

    private void file1_5() {
        if (!String.valueOf(file1_rec).equals(String.valueOf("X"))) {
            System.exit(0);
        }
    }

    private void file1_6() {
        if (file1.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(file1_rec).equals(String.valueOf("X"))) {
            CobolDisplay.display("SECOND READ FAILED");
        }
    }

    private void file1_7() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile043SequentialBasicIO().run();
    }
}
