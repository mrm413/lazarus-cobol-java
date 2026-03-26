package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile047LineSequentialRecordTruncation2 extends CobolProgram {
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
    private CobolString output_file = new CobolString(19);
    private CobolString input_file = new CobolString(19);
    private CobolString input_status = new CobolString(2);
    private int input_len = 0;

    // FILE SECTION — INFILE
    private CobolString input_rec = new CobolString(40);

    // FILE SECTION — OUTFILE
    private CobolString output_rec = new CobolString(40);


    // FILE DESCRIPTORS
    private CobolFile infile = new CobolFile("INFILE", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: INPUT-STATUS
    private CobolFile outfile = new CobolFile("OUTFILE", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: INPUT-STATUS


    private void a000_begin() {
        infile.open("INPUT");
        if (infile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display(" Read 1: STATUS IS " + String.valueOf(input_status) + " LENGTH IS " + String.valueOf(input_len));
        CobolDisplay.display("       :" + String.valueOf(input_rec) + ":");
        if (infile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display(" Read 2: STATUS IS " + String.valueOf(input_status) + " LENGTH IS " + String.valueOf(input_len));
        CobolDisplay.display("       :" + String.valueOf(input_rec) + ":");
        input_len = new BigDecimal(String.valueOf(0).trim()).intValue();
        if (infile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display(" Read 3: STATUS IS " + String.valueOf(input_status) + " LENGTH IS " + String.valueOf(input_len));
        CobolDisplay.display("       :" + String.valueOf(input_rec) + ":");
        input_rec.set(String.valueOf(" "));
        input_len = new BigDecimal(String.valueOf(0).trim()).intValue();
        if (infile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display(" Read 4: STATUS IS " + String.valueOf(input_status) + " LENGTH IS " + String.valueOf(input_len));
        if (String.valueOf(CobolString.refMod(input_status, 1, 1)).equals(String.valueOf("0"))) {
            CobolDisplay.display("       :" + String.valueOf(input_rec) + ":");
        }
        infile.close();
        outfile.open("OUTPUT");
        input_len = new BigDecimal(String.valueOf(9).trim()).intValue();
        output_rec.set(String.valueOf("Record 1............."));
        outfile.write(output_rec);
        CobolDisplay.display("Write 1: STATUS IS " + String.valueOf(input_status) + " LENGTH IS " + String.valueOf(input_len));
        input_len = new BigDecimal(String.valueOf(64).trim()).intValue();
        output_rec.set(String.valueOf("."));
        output_rec.setRefMod(1, 8, String.valueOf("Record 2"));
        outfile.write(output_rec);
        CobolDisplay.display("Write 2: STATUS IS " + String.valueOf(input_status) + " LENGTH IS " + String.valueOf(input_len));
        outfile.close();
        System.exit(0);
    }

    @Override
    public void run() {
        a000_begin();
    }

    public static void main(String[] args) {
        new RunFile047LineSequentialRecordTruncation2().run();
    }
}
