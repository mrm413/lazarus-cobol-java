package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile063IndexedSequentialWithVariableRecords extends CobolProgram {
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
    private int rec_size = 0;
    private CobolString _1_template = new CobolString(1); // Group: 1-template
    private CobolString[] _1_x = new CobolString[20];

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1); // Group: f-rec
    private int f_key = 0;
    private CobolString f_data = new CobolString(1); // Group: f-data
    private CobolString[] f_x = new CobolString[20];


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("INDEXED", "SEQUENTIAL", "RANDOM");

    // FALLBACK FILE DESCRIPTORS
    private CobolFile _filler_001 = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile should = new CobolFile("SHOULD", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile not = new CobolFile("NOT", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile influence = new CobolFile("INFLUENCE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile move = new CobolFile("MOVE", "SEQUENTIAL", "SEQUENTIAL");


    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        f.open("OUTPUT");
        f_key = new BigDecimal(String.valueOf(1).trim()).intValue();
        for (rec_size = 22; !(rec_size < 12); rec_size += -1) {
            f_data.set(String.valueOf(_1_template));
            f.write(f_rec);
            f_key = new BigDecimal(String.valueOf(f_key + 1).trim()).intValue();
        }
        f.close();
        f.open("INPUT");
        // KNOWN_ISSUE: _filler_002.open("INPUT");
        /* OPEN rec-size — skipped, not a file */
        should.open("INPUT");
        not.open("INPUT");
        influence.open("INPUT");
        if (move.read(null) == FileStatus.AT_END) {
        }
        /* RAW: 15 TO rec-size */
        for (f_key = 1; !(f_key > 11); f_key += 1) {
            if (f.read(null) == FileStatus.AT_END) {
                CobolDisplay.display("Failed: EOF");
                System.exit(1);
            }
            CobolDisplay.display(String.valueOf(rec_size) + ": >" + String.valueOf(CobolString.refMod(f_rec, 3, (rec_size - 2))) + "<");
            if (rec_size != (((22 - f_key)) + 1)) {
                CobolDisplay.display("Failed: bad record size - " + String.valueOf(rec_size));
                System.exit(1);
            }
            if (!String.valueOf(f_x[(rec_size - 2) - 1]).equals(String.valueOf(_1_x[(rec_size - 2) - 1]))) {
                CobolDisplay.display("Failed: bad data - " + String.valueOf(f_data));
                System.exit(1);
            }
        }
        f.close();
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile063IndexedSequentialWithVariableRecords().run();
    }
}
