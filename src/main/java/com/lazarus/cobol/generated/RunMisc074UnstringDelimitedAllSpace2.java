package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc074UnstringDelimitedAllSpace2 extends CobolProgram {
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
    private CobolString ws_record = new CobolString(1); // Group: WS-RECORD
    private CobolString filler_1 = new CobolString(8);
    private CobolString filler_2 = new CobolString(8);
    private CobolString filler_3 = new CobolString(8);
    private CobolString filler_4 = new CobolString(8);
    private CobolString filler_5 = new CobolString(8);
    private CobolString space_2 = new CobolString(2);
    private CobolString ws_dummy = new CobolString(15);
    private int ws_pointer = 0;



    private void para_main() {
        ws_pointer = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* RAW: *  */
        _0001_sub();
        if (!String.valueOf(ws_dummy).equals(String.valueOf(" "))) {
            CobolDisplay.display("Expected space - Got " + String.valueOf(ws_dummy));
        }
        if (ws_pointer != 5) {
            CobolDisplay.display("Expected 5 - Got " + String.valueOf(ws_pointer));
        }
        /* RAW: *  */
        _0001_sub();
        if (!String.valueOf(ws_dummy).equals(String.valueOf("ABC AND DE"))) {
            CobolDisplay.display("Expected ABC AND DE - Got " + String.valueOf(ws_dummy));
        }
        if (ws_pointer != 21) {
            CobolDisplay.display("Expected 21 - Got " + String.valueOf(ws_pointer));
        }
        /* RAW: *  */
        _0001_sub();
        if (!String.valueOf(ws_dummy).equals(String.valueOf(" FG AND HIJ"))) {
            CobolDisplay.display("Expected  FG AND HIJ - Got " + String.valueOf(ws_dummy));
        }
        if (ws_pointer != 40) {
            CobolDisplay.display("Expected 40 - Got " + String.valueOf(ws_pointer));
        }
        System.exit(0);
    }

    private void _0001_sub() {
        /* UNSTRING — requires runtime implementation */
        ws_dummy.set(String.valueOf(""));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc074UnstringDelimitedAllSpace2().run();
    }
}
