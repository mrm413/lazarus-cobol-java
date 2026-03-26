package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions005FunctionByteLength extends CobolProgram {
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
    private CobolString x = new CobolString(4);
    private CobolString z = new CobolString(8);
    private BigDecimal test_fld = BigDecimal.ZERO;


    private CobolString to = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString display = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.byte_length(x)).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(4).trim())) != 0) {
            CobolDisplay.display("BYTE-LENGTH X(4) wrong: " + String.valueOf(test_fld));
        }
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.byte_length(z)).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(8).trim())) != 0) {
            CobolDisplay.display("BYTE-LENGTH N(4) wrong: " + String.valueOf(test_fld));
        }
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.byte_length("00128")).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(5).trim())) != 0) {
            CobolDisplay.display("BYTE-LENGTH \"00128\" wrong: " + String.valueOf(test_fld));
        }
        /* RAW: * note : we currently do */
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.byte_length("a0")).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("BYTE-LENGTH x\"a0\" wrong: " + String.valueOf(test_fld));
        }
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.byte_length("a0")).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("BYTE-LENGTH z\"a0\" wrong: " + String.valueOf(test_fld));
        }
        /* RAW: * we currently */
        /* RAW: GENERATE national constants as * alphanumeric */
        /* RAW: *  */
        test_fld = new BigDecimal(String.valueOf((CobolIntrinsics.byte_length("a0") * Integer.parseInt(String.valueOf(to).trim()))).trim());
        _filler_002.set(String.valueOf((CobolIntrinsics.byte_length("a0") * Integer.parseInt(String.valueOf(to).trim()))));
        if (test_fld.compareTo(new BigDecimal(String.valueOf((4 * Integer.parseInt(String.valueOf(display).trim()))).trim())) != 0) {
            /* RAW: 'BYTE-LENGTH n"a0" wrong: ' TEST-FLD */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions005FunctionByteLength().run();
    }
}
