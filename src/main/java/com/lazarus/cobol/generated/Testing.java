package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Testing extends CobolProgram {
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
    private CobolString oodb_result = new CobolString(7);

    // FILE SECTION — TSTFIL1
    private CobolString tstrec1 = new CobolString(256);

    // FILE SECTION — TSTFIL2
    private CobolString tstrec2 = new CobolString(256);


    // FILE DESCRIPTORS
    private CobolFile tstfil1 = new CobolFile("TSTFIL1", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile tstfil2 = new CobolFile("TSTFIL2", "LINE SEQUENTIAL", "SEQUENTIAL");


    // SECTION: MY-TEST
    private CobolFile _unnamed = new CobolFile("_unnamed", "SEQUENTIAL", "SEQUENTIAL"); // autofix
    private void my_test() {
        use();
        oodb_result();
        i_o_test_oodb_result();
        tstfil2();
    }

    private void use() {
        /* RAW: FOR DEBUGGING ON ALL REFERENCES OF */
    }

    private void oodb_result() {
    }

    private void i_o_test_oodb_result() {
        if (String.valueOf(oodb_result).equals(String.valueOf(" "))) {
            CobolDisplay.display("LINE 1");
        } else {
            CobolDisplay.display("LINE 2");
        }
        tstfil1.close();
        _unnamed.close();
    }

    private void tstfil2() {
    }

    // SECTION: MAIN
    private void para_main() {
        _000();
        begin();
    }

    private void _000() {
        /* RAW: -  */
    }

    private void begin() {
        System.exit(0);
    }

    @Override
    public void run() {
        _000();
    }

    public static void main(String[] args) {
        new Testing().run();
    }
}
