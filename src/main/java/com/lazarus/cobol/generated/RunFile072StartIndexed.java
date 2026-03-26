package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile072StartIndexed extends CobolProgram {
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
    private CobolString file1_rec = new CobolString(1); // Group: file1-rec
    private int file1_key = 0;
    private int file1_data = 0;


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("./file1X", "INDEXED", "DYNAMIC");


    private void para_main() {
        file1.open("OUTPUT");
        file1.close();
        file1.open("I-O");
        file1_key = new BigDecimal(String.valueOf(10).trim()).intValue();
        file1_data = new BigDecimal(String.valueOf(10).trim()).intValue();
        file1.write(file1_rec);
        file1_key = new BigDecimal(String.valueOf(11).trim()).intValue();
        file1_data = new BigDecimal(String.valueOf(11).trim()).intValue();
        file1.write(file1_rec);
        file1_key = new BigDecimal(String.valueOf(12).trim()).intValue();
        file1_data = new BigDecimal(String.valueOf(12).trim()).intValue();
        file1.write(file1_rec);
        file1_key = new BigDecimal(String.valueOf(13).trim()).intValue();
        file1_data = new BigDecimal(String.valueOf(13).trim()).intValue();
        file1.write(file1_rec);
        /* RAW: *  */
        file1_key = new BigDecimal(String.valueOf(0).trim()).intValue();
        file1.start();
        if (file1.read(null) == FileStatus.AT_END) {
        }
    }

    private void next() {
        if (file1_data != 10) {
            CobolDisplay.display("FAILED: START key > 0");
        }
        /* RAW: *  */
        file1_key = new BigDecimal(String.valueOf(99).trim()).intValue();
        file1.start();
        if (file1.read(null) == FileStatus.AT_END) {
        }
    }

    private void next_2() {
        if (file1_data != 13) {
            CobolDisplay.display("FAILED: START key < 99");
        }
        /* RAW: *  */
        file1_key = new BigDecimal(String.valueOf(999).trim()).intValue();
        file1.start();
    }

    private void first() {
        if (file1.read(null) == FileStatus.AT_END) {
        }
    }

    private void next_3() {
        if (file1_data != 10) {
            CobolDisplay.display("FAILED: START key FIRST");
        }
        /* RAW: *  */
        file1_key = new BigDecimal(String.valueOf(0).trim()).intValue();
        file1.start();
    }

    private void last() {
        if (file1.read(null) == FileStatus.AT_END) {
        }
    }

    private void next_4() {
        if (file1_data != 13) {
            CobolDisplay.display("FAILED: START key LAST");
        }
        /* RAW: *  */
        file1_key = new BigDecimal(String.valueOf(0).trim()).intValue();
        file1.start();
        if (file1.read(null) == FileStatus.AT_END) {
        }
    }

    private void next_5() {
        if (file1_data != 10) {
            CobolDisplay.display("FAILED: START key >= 0");
        }
        /* RAW: *  */
        file1_key = new BigDecimal(String.valueOf(99).trim()).intValue();
        file1.start();
        if (file1.read(null) == FileStatus.AT_END) {
        }
    }

    private void next_6() {
        if (file1_data != 13) {
            CobolDisplay.display("FAILED: START key <= 99");
        }
        file1.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile072StartIndexed().run();
    }
}
