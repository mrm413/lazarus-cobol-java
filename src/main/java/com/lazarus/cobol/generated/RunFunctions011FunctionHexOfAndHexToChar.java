package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions011FunctionHexOfAndHexToChar extends CobolProgram {
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
    private CobolString x = new CobolString(1); // Group: X
    private CobolString y = new CobolString(4);
    private short bin = (short) 0;
    private BigDecimal pac = BigDecimal.ZERO;
    private int n9 = 0;
    private CobolString nx = new CobolString(4);
    private CobolString hexx = new CobolString(10);


    private CobolString on = new CobolString(256);
    private CobolString error = new CobolString(256);
    private CobolString no_disp = new CobolString(256);
    private CobolString cb_true = new CobolString(256);
    private CobolString some = new CobolString(256);
    private CobolString hexx_filler = new CobolString(256);

    private void para_main() {
        /* RAW: * Test with */
        CobolDisplay.display(String.valueOf(on) + String.valueOf(error));
        do_check();
        no_disp.set(String.valueOf((Integer.parseInt(String.valueOf(cb_true).trim()) * Integer.parseInt(String.valueOf(some).trim()))));
        /* RAW: performance checks on the */
    }

    private void way() {
        for (int _i0 = 0; _i0 < 300000; _i0++) {
        }
        return;
    }

    private void do_check() {
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(x)));
            hexx.set(_sb.toString());
        }
        if (!String.valueOf(hexx).equals(String.valueOf("20303132--"))) {
            if (!String.valueOf(hexx).equals(String.valueOf("40F0F1F2--"))) {
                if (1 == 1) {
                    CobolDisplay.display("CHARSET UNKNOWN! PLEASE REPORT!");
                    CobolDisplay.display("UNEXPECTED HEX-VALUE OF '0012': ");
                    /* RAW: HEXX  */
                }
            }
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(y)));
            hexx.set(_sb.toString());
        }
        if (!String.valueOf(hexx).equals(String.valueOf("48492E20--"))) {
            if (!String.valueOf(hexx).equals(String.valueOf("C8C94B40--"))) {
                CobolDisplay.display("UNEXPECTED HEX-VALUE OF 'HI! ': ");
                /* RAW: HEXX  */
            }
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(bin)));
            hexx.set(_sb.toString());
        }
        if (!String.valueOf(hexx).equals(String.valueOf("0000000C--"))) {
            CobolDisplay.display("UNEXPECTED HEX-VALUE OF BIN 12: ");
            /* RAW: HEXX  */
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(pac)));
            hexx.set(_sb.toString());
        }
        if (!String.valueOf(hexx).equals(String.valueOf("01234F----"))) {
            CobolDisplay.display("UNEXPECTED HEX-VALUE OF PACKED 1234: ");
            /* RAW: HEXX  */
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of("01")));
            hexx.set(_sb.toString());
        }
        if (!String.valueOf(hexx).equals(String.valueOf("303100----"))) {
            if (!String.valueOf(hexx).equals(String.valueOf("F0F100----"))) {
                CobolDisplay.display("UNEXPECTED HEX-VALUE OF z'01': ");
                /* RAW: HEXX  */
            }
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(" ")));
            hexx.set(_sb.toString());
        }
        if (!String.valueOf(hexx).equals(String.valueOf("20--------"))) {
            if (!String.valueOf(hexx).equals(String.valueOf("40--------"))) {
                CobolDisplay.display("UNEXPECTED HEX-VALUE OF ' ': ");
                /* RAW: HEXX  */
            }
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(" ")));
            hexx.set(_sb.toString());
        }
        if (!String.valueOf(hexx).equals(String.valueOf("0020------"))) {
            CobolDisplay.display("UNEXPECTED HEX-VALUE OF n' ': ");
            /* RAW: HEXX  */
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of("01")));
            hexx.set(_sb.toString());
        }
        if (!String.valueOf(CobolIntrinsics.hex_to_char(CobolString.refMod(hexx, 1, 6))).equals(String.valueOf("01"))) {
            CobolDisplay.display("UNEXPECTED CHAR VALUE, does not match z'01': " + String.valueOf(CobolString.refMod(hexx, 1, 6)));
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_to_char("3132")));
            hexx.set(_sb.toString());
        }
        if (!((String.valueOf(CobolString.refMod(hexx, 1, 2)).equals(String.valueOf("3132")) && String.valueOf(CobolString.refMod(hexx, 3)).equals(String.valueOf("--------"))))) {
            CobolDisplay.display("UNEXPECTED CHAR VALUE, expected 12-* got: ");
            /* RAW: HEXX  */
        }
        hexx_filler.set(String.valueOf(cb_true));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_to_char("3132")));
            hexx.set(_sb.toString());
        }
        if (!((String.valueOf(CobolString.refMod(hexx, 1, 2)).equals(String.valueOf("3132")) && String.valueOf(CobolString.refMod(hexx, 3)).equals(String.valueOf("--------"))))) {
            CobolDisplay.display("UNEXPECTED CHAR VALUE, expected 12-* got: ");
            /* RAW: HEXX  */
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions011FunctionHexOfAndHexToChar().run();
    }
}
