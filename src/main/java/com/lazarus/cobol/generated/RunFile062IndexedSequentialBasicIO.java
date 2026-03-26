package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile062IndexedSequentialBasicIO extends CobolProgram {
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
    // FILE SECTION — fileX
    private CobolString filex_rec = new CobolString(1); // Group: fileX-rec
    private CobolString filex_key = new CobolString(6);
    private CobolString filex_data = new CobolString(10);


    // FILE DESCRIPTORS
    private CobolFile filex = new CobolFile("ORGANIZATION", "INDEXED", "SEQUENTIAL");


    private void para_main() {
        filex.open("OUTPUT");
        filex_rec.set(String.valueOf("A"));
        filex.write(filex_rec);
        filex.close();
        filex.open("INPUT");
        if (filex.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(filex_rec).equals(String.valueOf("A"))) {
            CobolDisplay.display("FAILED");
        }
        filex.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile062IndexedSequentialBasicIO().run();
    }
}
