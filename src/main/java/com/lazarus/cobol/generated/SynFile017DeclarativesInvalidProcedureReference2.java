package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile017DeclarativesInvalidProcedureReference2 extends CobolProgram {
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
    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("./TEST-FILE", "LINE SEQUENTIAL", "SEQUENTIAL");


    // SECTION: P01
    private void p01() {
        use();
        test_file();
        p02();
    }

    private void use() {
        /* RAW: AFTER ERROR PROCEDURE ON */
    }

    private void test_file() {
    }

    private void p02() {
        CobolDisplay.display("OK");
    }

    // SECTION: PP01
    private void pp01() {
        pp02();
        test_file();
        test_file();
    }

    private void pp02() {
    }

    private void test_file_2() {
    }

    private void test_file_3() {
        p02();
        p02();
        return;
    }

    @Override
    public void run() {
        pp02();
    }

    public static void main(String[] args) {
        new SynFile017DeclarativesInvalidProcedureReference2().run();
    }
}
