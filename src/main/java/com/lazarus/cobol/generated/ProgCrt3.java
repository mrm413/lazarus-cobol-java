package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProgCrt3 extends CobolProgram {
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
    private CobolString crt3 = new CobolString(1); // Group: crt3
    private int crt3_1 = 0;
    private int crt3_2 = 0;
    private int crt3_3 = 0;
    private CobolString test_tab = new CobolString(1); // Group: test-tab
    private CobolString test_01 = new CobolString(20);
    private CobolString test_02 = new CobolString(20);
    private CobolString test_03 = new CobolString(20);
    private CobolString test_04 = new CobolString(20);
    private CobolString test_05 = new CobolString(20);
    private CobolString test_06 = new CobolString(20);
    private CobolString test_07 = new CobolString(20);
    private CobolString test_rab_r = new CobolString(1); // Group: test-rab-r
    private CobolString[] test_data = new CobolString[7]; // Group: test-data
    private CobolString[] test_name = new CobolString[7];
    private int[] test_crt31 = new int[7];
    private int[] test_crt32 = new int[7];
    private int linenr = 0;
    private int test_result_1 = 0;
    private int test_result_3 = 0;
    private int return_value = 0;
    private int loop = 0;
    private CobolString test_field = new CobolString(1);


    private CobolString environment = new CobolString(256);
    private CobolString cob_screen_exceptions = new CobolString(256);
    private CobolString cob_screen_esc = new CobolString(256);
    private CobolString blank = new CobolString(256);
    private CobolString screen = new CobolString(256);
    private CobolString line = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString column = new CobolString(256);

    private void para_main() {
        environment.set(String.valueOf("TRUE"));
        cob_screen_exceptions.set(String.valueOf("TRUE"));
        environment.set(String.valueOf("TRUE"));
        cob_screen_esc.set(String.valueOf("TRUE"));
        while (true) {
            CobolDisplay.display(" " + String.valueOf(blank) + String.valueOf(screen));
            return_value = new BigDecimal(String.valueOf(0).trim()).intValue();
            for (loop = 1; !(loop > 7); loop += 1) {
                linenr = new BigDecimal(String.valueOf((loop + 5)).trim()).intValue();
                CobolDisplay.display("Please press " + String.valueOf(line) + String.valueOf(linenr) + String.valueOf(_unnamed) + String.valueOf(column) + String.valueOf(1));
                CobolDisplay.display(String.valueOf(test_name[loop - 1]) + String.valueOf(line) + String.valueOf(linenr) + String.valueOf(_unnamed) + String.valueOf(column) + String.valueOf(14));
                test_field.set(String.valueOf(" "));
                test_field.set(String.valueOf(CobolDisplay.accept()));
                /* RAW: line linenr column 30 */
                test_result_1 = new BigDecimal(String.valueOf(crt3_1).trim()).intValue();
                CobolDisplay.display(String.valueOf(test_result_1) + String.valueOf(line) + String.valueOf(linenr) + String.valueOf(_unnamed) + String.valueOf(column) + String.valueOf(30));
                test_result_3 = new BigDecimal(String.valueOf(crt3_2).trim()).intValue();
                CobolDisplay.display(String.valueOf(test_result_3) + String.valueOf(line) + String.valueOf(linenr) + String.valueOf(_unnamed) + String.valueOf(column) + String.valueOf(32));
                if ((test_result_1 == test_crt31[loop - 1] && test_result_3 == test_crt32[loop - 1])) {
                    CobolDisplay.display("passed" + String.valueOf(line) + String.valueOf(linenr) + String.valueOf(_unnamed) + String.valueOf(column) + String.valueOf(36));
                } else {
                    return_value = new BigDecimal(String.valueOf(1).trim()).intValue();
                    CobolDisplay.display("failed" + String.valueOf(line) + String.valueOf(linenr) + String.valueOf(_unnamed) + String.valueOf(column) + String.valueOf(36));
                }
            }
            if (return_value == 0) {
                break;
            }
            CobolDisplay.display("Try again? (Y/n) " + String.valueOf(line) + String.valueOf(20) + String.valueOf(_unnamed) + String.valueOf(column) + String.valueOf(1));
            test_field.set(String.valueOf("Y"));
            test_field.set(String.valueOf(CobolDisplay.accept()));
            /* RAW: line 20 , column 18 */
            if (!((String.valueOf(test_field).equals(String.valueOf("Y")) || true))) {
                break;
            }
        }
        return;
    }

    private void return_value() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new ProgCrt3().run();
    }
}
