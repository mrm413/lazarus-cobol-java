package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions010FunctionBitOfAndBitToChar extends CobolProgram {
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
    private BigDecimal pac = BigDecimal.ZERO;
    private CobolString txt = new CobolString(4);
    private CobolString bitx = new CobolString(34);


    private CobolString bitx_filler = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback

    private void para_main() {
        bitx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.bit_of(pac)));
            bitx.set(_sb.toString());
        }
        if (!String.valueOf(bitx).equals(String.valueOf("000000000000000100101111----------"))) {
            CobolDisplay.display("UNEXPECTED BIT-VALUE OF PAC 0012: " + String.valueOf(bitx));
        }
        bitx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.bit_of(txt)));
            bitx.set(_sb.toString());
        }
        if (!String.valueOf(bitx).equals(String.valueOf("01001000010010010010111000100000--"))) {
            if (!String.valueOf(bitx).equals(String.valueOf("11001000110010010100101101000000--"))) {
                if (1 == 1) {
                    CobolDisplay.display("CHARSET UNKNOWN! PLEASE REPORT!");
                    CobolDisplay.display("UNEXPECTED BIT-VALUE OF 'HI. ': " + String.valueOf(bitx));
                }
            }
        }
        bitx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.bit_of("01")));
            bitx.set(_sb.toString());
        }
        if (!String.valueOf(bitx).equals(String.valueOf("001100000011000100000000----------"))) {
            if (!String.valueOf(bitx).equals(String.valueOf("111100001111000100000000----------"))) {
                if (!String.valueOf(CobolIntrinsics.bit_to_char(CobolString.refMod(bitx, 1, 24))).equals(String.valueOf("01"))) {
                    CobolDisplay.display("UNEXPECTED CHAR VALUE, does not match z'01': " + String.valueOf(CobolString.refMod(bitx, 1, 24)));
                }
            }
        }
        bitx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.bit_to_char("0011000100110010")));
            bitx.set(_sb.toString());
        }
        if (!((String.valueOf(CobolString.refMod(bitx, 1, 2)).equals(String.valueOf("3132")) && String.valueOf(CobolString.refMod(bitx, 3)).equals(String.valueOf("--------------------------------"))))) {
            CobolDisplay.display("UNEXPECTED CHAR VALUE, expected 12-* got: " + String.valueOf(bitx));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions010FunctionBitOfAndBitToChar().run();
    }
}
