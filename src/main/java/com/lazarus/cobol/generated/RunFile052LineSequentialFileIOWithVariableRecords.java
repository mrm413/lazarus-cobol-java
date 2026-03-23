package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile052LineSequentialFileIOWithVariableRecords extends CobolProgram {
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
    private int i = 0;

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1); // Group: f-rec
    private CobolString[] f_x = new CobolString[20];


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");

    
    private CobolFile _unnamed = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile should = new CobolFile("SHOULD", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile not = new CobolFile("NOT", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile influence = new CobolFile("INFLUENCE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile move = new CobolFile("MOVE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString template = new CobolString(256);
    private CobolString[] x = new CobolString[100];

    private void para_main() {
        f.open("OUTPUT");
        for (rec_size = 20; !(rec_size < 10); rec_size += -1) {
            f.write((1 - Integer.parseInt(String.valueOf(template).trim())));
        }
        f.close();
        f.open("INPUT");
        _unnamed.open("INPUT");
        /* OPEN rec-size — skipped, not a file */
        should.open("INPUT");
        not.open("INPUT");
        influence.open("INPUT");
        if (move.read(null) == FileStatus.AT_END) {
        }
        /* RAW: 15 TO rec-size */
        for (i = 20; !(i < 10); i += -1) {
            if (f.read(null) == FileStatus.AT_END) {
                CobolDisplay.display("Failed: EOF");
                System.exit(1);
            }
            CobolDisplay.display(String.valueOf(rec_size) + ": >" + String.valueOf(CobolString.refMod(f_rec, 1, rec_size)) + "<");
            if (rec_size != i) {
                CobolDisplay.display("Failed: bad record size");
                System.exit(1);
            }
            if (!String.valueOf(f_x[rec_size - 1]).equals(String.valueOf((1 - Integer.parseInt(String.valueOf(x[rec_size - 1]).trim()))))) {
                CobolDisplay.display("Failed: bad data");
                System.exit(1);
            }
        }
    }

    private void f() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile052LineSequentialFileIOWithVariableRecords().run();
    }
}
