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


    private CobolString erase = new CobolString(256);
    private CobolString lin = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString col = new CobolString(256);
    private CobolString at = new CobolString(256);
    private CobolString line = new CobolString(256);
    private CobolString column = new CobolString(256);

    private void para_main() {
        CobolDisplay.display(String.valueOf(erase));
    }

    private void lin() {
    }

    private void col() {
        CobolDisplay.display(String.valueOf((lin)) + String.valueOf(_unnamed) + String.valueOf((Integer.parseInt(String.valueOf(col).trim()) - 3)) + String.valueOf(_unnamed));
    }

    private void field_a() {
        CobolDisplay.display(String.valueOf(((Integer.parseInt(String.valueOf(lin).trim()) + 1))) + String.valueOf(_unnamed) + String.valueOf(col) + String.valueOf(_unnamed));
    }

    private void field_a_2() {
        _unnamed.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: , 10 ) */
    }

    private void a() {
        CobolDisplay.display(String.valueOf((8)) + String.valueOf(_unnamed) + String.valueOf(12) + String.valueOf(_unnamed));
    }

    private void field_a_3() {
        _unnamed.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: , 08 ) A WITH */
    }

    private void no_echo() {
        CobolDisplay.display(String.valueOf(field_a) + String.valueOf(at) + String.valueOf(line) + String.valueOf(6) + String.valueOf(column) + String.valueOf(12));
        a.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: AT COLUMN 8 */
        lin.set(new BigDecimal(String.valueOf(lin).trim()).subtract(new BigDecimal(String.valueOf(2).trim())).toPlainString());
        col.set(new BigDecimal(String.valueOf(col).trim()).subtract(new BigDecimal(String.valueOf(3).trim())).toPlainString());
        CobolDisplay.display(String.valueOf(field_a) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(column));
    }

    private void col_2() {
        _unnamed.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: , 10 ) */
    }

    private void a_2() {
        CobolDisplay.display(String.valueOf((1)) + String.valueOf(_unnamed) + String.valueOf(1) + String.valueOf(_unnamed));
    }

    private void erase() {
        CobolDisplay.display(String.valueOf((2)) + String.valueOf(_unnamed) + String.valueOf(1) + String.valueOf(_unnamed) + "Field value : " + String.valueOf(_unnamed));
    }

    private void field_a_4() {
        CobolDisplay.display(String.valueOf((3)) + String.valueOf(_unnamed) + String.valueOf(1) + String.valueOf(_unnamed) + String.valueOf(a) + " --> A value");
        CobolDisplay.display(String.valueOf((5)) + String.valueOf(_unnamed) + String.valueOf(1) + String.valueOf(_unnamed) + "Press ENTER to exit");
        _unnamed.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: 11 , 1 ) */
    }

    private void a_3() {
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
