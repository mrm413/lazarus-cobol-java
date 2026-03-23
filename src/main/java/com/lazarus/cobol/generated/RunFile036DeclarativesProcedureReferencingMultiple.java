package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile036DeclarativesProcedureReferencingMultiple extends CobolProgram {
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
        test_file();
        p0101();
    }

    private void use() {
        /* RAW: AFTER ERROR PROCEDURE ON */
    }

    private void test_file() {
    }

    private void p0101() {
        z = new BigDecimal(String.valueOf(z + 1).trim()).intValue();
    }

    // SECTION: P02
    private void p02() {
        use();
        output();
        p0201();
    }

    private void use_2() {
        /* RAW: AFTER ERROR PROCEDURE ON */
    }

    private void output() {
    }

    private void p0201() {
        z = new BigDecimal(String.valueOf(z + 1).trim()).intValue();
    }

    // SECTION: MP01
    private void mp01() {
        mp0101();
        test_file();
    }

    private void mp0101() {
    }

    private void test_file_2() {
        p01(); // THRU P02
        if (z != 3) {
            CobolDisplay.display();
            /* RAW: Z  */
        }
        return;
    }

    @Override
    public void run() {
        mp0101();
    }

    public static void main(String[] args) {
        new RunFile036DeclarativesProcedureReferencingMultiple().run();
    }
}
