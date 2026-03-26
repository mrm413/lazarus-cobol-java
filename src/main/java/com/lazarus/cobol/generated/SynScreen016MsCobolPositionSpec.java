package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynScreen016MsCobolPositionSpec extends CobolProgram {
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
    private CobolString field_a = new CobolString(6);
    private CobolString a = new CobolString(1);


    private CobolString erase = new CobolString(256); // fallback
    private CobolString lin = new CobolString(256); // fallback
    private CobolString col = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString at = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString column = new CobolString(256); // fallback

    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private CobolString _filler_010 = new CobolString(256); // fallback
    private CobolString _filler_011 = new CobolString(256); // fallback
    private CobolString _filler_012 = new CobolString(256); // fallback
    private CobolString _filler_013 = new CobolString(256); // fallback
    private CobolString _filler_014 = new CobolString(256); // fallback
    private CobolString _filler_015 = new CobolString(256); // fallback
    private CobolString _filler_016 = new CobolString(256); // fallback
    private CobolString _filler_017 = new CobolString(256); // fallback
    private CobolString _filler_018 = new CobolString(256); // fallback
    private CobolString _filler_019 = new CobolString(256); // fallback
    private CobolString _filler_020 = new CobolString(256); // fallback
    private CobolString _filler_021 = new CobolString(256); // fallback
    private CobolString _filler_022 = new CobolString(256); // fallback
    private void para_main() {
        CobolDisplay.display(String.valueOf(erase));
        lin.set(String.valueOf(10));
        col.set(String.valueOf(15));
        CobolDisplay.display(String.valueOf((lin)) + String.valueOf(_filler_004) + String.valueOf((Integer.parseInt(String.valueOf(col).trim()) - 3)) + String.valueOf(_filler_005) + String.valueOf(field_a));
        CobolDisplay.display(String.valueOf(((Integer.parseInt(String.valueOf(lin).trim()) + 1))) + String.valueOf(_filler_006) + String.valueOf(col) + String.valueOf(_filler_007) + String.valueOf(field_a));
        _filler_008.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: , 10 ) A */
        CobolDisplay.display(String.valueOf((8)) + String.valueOf(_filler_009) + String.valueOf(12) + String.valueOf(_filler_010) + String.valueOf(field_a));
        _filler_011.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: , 08 ) A WITH NO-ECHO */
        CobolDisplay.display(String.valueOf(field_a) + String.valueOf(at) + String.valueOf(line) + String.valueOf(6) + String.valueOf(column) + String.valueOf(12));
        a.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: AT COLUMN 8 */
        lin.set(new BigDecimal(String.valueOf(lin).trim()).subtract(new BigDecimal(String.valueOf(2).trim())).toPlainString());
        col.set(new BigDecimal(String.valueOf(col).trim()).subtract(new BigDecimal(String.valueOf(3).trim())).toPlainString());
        CobolDisplay.display(String.valueOf(field_a) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(column) + String.valueOf(col));
        _filler_012.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: , 10 ) A */
        CobolDisplay.display(String.valueOf((1)) + String.valueOf(_filler_013) + String.valueOf(1) + String.valueOf(_filler_014) + String.valueOf(erase));
        CobolDisplay.display(String.valueOf((2)) + String.valueOf(_filler_015) + String.valueOf(1) + String.valueOf(_filler_016) + "Field value : " + String.valueOf(_filler_017) + String.valueOf(field_a));
        CobolDisplay.display(String.valueOf((3)) + String.valueOf(_filler_018) + String.valueOf(1) + String.valueOf(_filler_019) + String.valueOf(a) + " --> A value");
        CobolDisplay.display(String.valueOf((5)) + String.valueOf(_filler_020) + String.valueOf(1) + String.valueOf(_filler_021) + "Press ENTER to exit");
        _filler_022.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: 11 , 1 ) A */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynScreen016MsCobolPositionSpec().run();
    }
}
