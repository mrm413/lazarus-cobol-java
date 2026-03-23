package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc075UnstringDelimitedPointer extends CobolProgram {
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
    private CobolString ws_lay_record = new CobolString(66);
    private CobolString ws_dummy = new CobolString(50);
    private CobolString ws_keyword = new CobolString(32);
    private int ws_pointer = 0;



    private void para_main() {
    }

    private void ws_lay_record() {
    }

    private void ws_pointer() {
        _0001();
        /* RAW: -  */
    }

    private void sub() {
        if (ws_pointer != 48) {
            CobolDisplay.display("Expected 48 - Got ");
            /* RAW: WS-POINTER  */
        }
        ws_pointer = new BigDecimal(String.valueOf(ws_pointer + 7).trim()).intValue();
        _0001();
        /* RAW: -  */
    }

    private void sub_2() {
        if (ws_pointer != 62) {
            CobolDisplay.display("Expected 62 - Got ");
            /* RAW: WS-POINTER  */
        }
        _0001();
        /* RAW: -  */
    }

    private void sub_3() {
        if (ws_pointer != 63) {
            CobolDisplay.display("Expected 63 - Got ");
            /* RAW: WS-POINTER  */
        }
        System.exit(0);
    }

    private void sub_4() {
        /* UNSTRING — requires runtime implementation */
        ws_dummy.set(String.valueOf(""));
    }

    private void _0001() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc075UnstringDelimitedPointer().run();
    }
}
