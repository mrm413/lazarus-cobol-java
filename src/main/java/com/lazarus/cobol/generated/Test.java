package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test extends CobolProgram {
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
    private CobolString test_rec = new CobolString(1); // Group: TEST-REC
    private CobolString qqdata = new CobolString(80);
    private CobolString qqindex = new CobolString(7);
    private int qqsequence = 0;


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("FILE", "INDEXED", "DYNAMIC");


    private void para_main() {
        test_file.open("OUTPUT");
        qqdata.set(String.valueOf("TEST DATA 1"));
        qqindex.set(String.valueOf("ABC0001"));
        test_file.write(test_rec);
        qqdata.set(String.valueOf("TEST DATA 2"));
        qqindex.set(String.valueOf("ABC0002"));
        test_file.write(test_rec);
        test_file.close();
        CobolDisplay.displayNoAdvancing("FINE");
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Test().run();
    }
}
