package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Stringtest extends CobolProgram {
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
    private CobolString trgt_string = new CobolString(3);
    private int str_pointer = 0;
    private CobolString src_delim = new CobolString(1);



    private void para_main() {
    }

    private void str_pointer() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("A");
            _sb.append("B");
            _sb.append("C");
            trgt_string.set(_sb.toString());
        }
        /* ON OVERFLOW handling */
        if (!String.valueOf(trgt_string).equals(String.valueOf("ABC"))) {
            CobolDisplay.display("A: TRTG-STRING <" + String.valueOf(trgt_string) + "> != <ABC>");
        }
        if (str_pointer != 4) {
            CobolDisplay.display("A: STR-POINTER <" + String.valueOf(str_pointer) + "> != <04>");
        }
    }

    private void str_pointer_2() {
    }

    private void trgt_string() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("A");
            _sb.append("B");
            _sb.append("C");
            trgt_string.set(_sb.toString());
        }
        /* ON OVERFLOW handling */
        if (!String.valueOf(trgt_string).equals(String.valueOf(" "))) {
            CobolDisplay.display("B: TRTG-STRING <" + String.valueOf(trgt_string) + "> != SPACES");
        }
        if (str_pointer != 0) {
            CobolDisplay.display("B: STR-POINTER <" + String.valueOf(str_pointer) + "> != <00>");
        }
    }

    private void str_pointer_3() {
    }

    private void trgt_string_2() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("A");
            _sb.append("B");
            _sb.append("C");
            trgt_string.set(_sb.toString());
        }
        /* ON OVERFLOW handling */
        if (!String.valueOf(trgt_string).equals(String.valueOf(" "))) {
            CobolDisplay.display("C: TRTG-STRING <" + String.valueOf(trgt_string) + "> != SPACES");
        }
        if (str_pointer != 4) {
            CobolDisplay.display("C: STR-POINTER <" + String.valueOf(str_pointer) + "> != <04>");
        }
    }

    private void str_pointer_4() {
    }

    private void src_delim() {
    }

    private void trgt_string_3() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("1|2");
            _sb.append("A|B");
            _sb.append(CobolString.delimitedBy("C|D", String.valueOf(src_delim)));
            trgt_string.set(_sb.toString());
        }
        if (!String.valueOf(trgt_string).equals(String.valueOf("1AC"))) {
            CobolDisplay.display("D: TRGT-STRING <" + String.valueOf(trgt_string) + "> != <1AC>");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Stringtest().run();
    }
}
