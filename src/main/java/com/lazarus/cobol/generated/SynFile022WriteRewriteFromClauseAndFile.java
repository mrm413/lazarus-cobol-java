package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile022WriteRewriteFromClauseAndFile extends CobolProgram {
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
    private CobolString some_rec = new CobolString(4);

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(1); // Group: TEST-REC
    private CobolString test_p1 = new CobolString(4);
    private short test_p2 = (short) 0;


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("FILE-TEST", "INDEXED", "DYNAMIC");

    private CobolString some_val = new CobolString(256); // fallback
    private CobolString file = new CobolString(256); // fallback

    private void para_main() {
        test_file.open("I-O");
        /* WRITE SOME-VAL — no file mapping */ // some_val.write();
        /* WRITE SOME-REC — no file mapping */ // some_rec.write();
        test_file.write(test_rec);
        test_file.write(some_rec);
        test_file.write("");
        /* WRITE FILE — no file mapping */ // file.write();
    }

    private void test_rec() {
        /* WRITE FILE — no file mapping */ // file.write();
    }

    private void test_file() {
        /* WRITE FILE — no file mapping */ // file.write();
        /* RAW: TEST-FILE FROM TEST-REC */
        /* WRITE FILE — no file mapping */ // file.write();
        /* RAW: TEST-FILE FROM SOME-REC */
        /* REWRITE SOME-VAL — no file mapping */ // some_val.rewrite();
        /* REWRITE SOME-REC — no file mapping */ // some_rec.rewrite();
        test_file.rewrite(test_rec);
        test_file.rewrite(some_rec);
        test_file.rewrite("");
        /* REWRITE FILE — no file mapping */ // file.rewrite();
    }

    private void test_rec_2() {
        /* REWRITE FILE — no file mapping */ // file.rewrite();
    }

    private void test_file_2() {
        /* REWRITE FILE — no file mapping */ // file.rewrite();
        /* RAW: TEST-FILE FROM TEST-REC */
        /* REWRITE FILE — no file mapping */ // file.rewrite();
        /* RAW: TEST-FILE FROM SOME-REC */
        test_file.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile022WriteRewriteFromClauseAndFile().run();
    }
}
