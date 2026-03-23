package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile031FileFromLiteral extends CobolProgram {
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
    private int num = 0;

    // FILE SECTION — f
    private int f_rec = 0;


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("ssad", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString file = new CobolString(256);

    private void para_main() {
        f.open("OUTPUT");
        /* WRITE FILE — no file mapping */ // file.write();
        /* RAW: f FROM zero */
        /* WRITE FILE — no file mapping */ // file.write();
        /* RAW: f FROM 0 */
        /* WRITE FILE — no file mapping */ // file.write();
        /* RAW: f FROM "abc" */
        /* REWRITE FILE — no file mapping */ // file.rewrite();
        /* RAW: f FROM zero */
        /* REWRITE FILE — no file mapping */ // file.rewrite();
        /* RAW: f FROM 0 */
        /* REWRITE FILE — no file mapping */ // file.rewrite();
        /* RAW: f FROM "abc" */
    }

    private void f() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile031FileFromLiteral().run();
    }
}
