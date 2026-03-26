package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile035DeclarativesProcedureReferencing extends CobolProgram {
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
    private int z = 0;

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(10);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("./TEST-FILE", "SEQUENTIAL", "SEQUENTIAL");


    // SECTION: P01
    private void p01() {
        use();
        p0101();
    }

    private void use() {
        /* RAW: AFTER ERROR PROCEDURE ON TEST-FILE */
    }

    private void p0101() {
        z = new BigDecimal(String.valueOf(z + 1).trim()).intValue();
    }

    private void para_main() {
        /* RAW: * some comments here * to */
    }

    private void mp0101() {
        test_file.open("INPUT");
        p0101();
        if (z != 2) {
            CobolDisplay.display(String.valueOf(z));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile035DeclarativesProcedureReferencing().run();
    }
}
