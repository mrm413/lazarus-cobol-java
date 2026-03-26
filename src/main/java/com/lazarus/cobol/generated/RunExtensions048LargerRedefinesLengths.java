package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions048LargerRedefinesLengths extends CobolProgram {
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
    private int z = 0;
    private CobolString xmain = new CobolString(8);
    private CobolString xmainred = new CobolString(1); // Group: XMAINRED
    private CobolString filler_1 = new CobolString(4);
    private CobolString xmain03 = new CobolString(1); // Group: XMAIN03
    private CobolString xmain0501 = new CobolString(4);
    private CobolString xmain0502 = new CobolString(5);
    private CobolString use_vars = new CobolString(1); // Group: USE-VARS
    private int use_value = 0;
    private CobolString use_first = new CobolString(1); // Group: USE-FIRST
    private CobolString first_data = new CobolString(1); // Group: FIRST-DATA
    private CobolString first_data_var = new CobolString(33);
    private CobolString first_variant_a = new CobolString(1); // Group: FIRST-VARIANT-A
    private CobolString part_a_first = new CobolString(9999);
    private CobolString first_variant_b = new CobolString(1); // Group: FIRST-VARIANT-B
    private CobolString part_b_first = new CobolString(9999);
    private CobolString first_variant_c = new CobolString(1); // Group: FIRST-VARIANT-C
    private CobolString part_c_first = new CobolString(3421);
    private CobolString use_second = new CobolString(1); // Group: USE-SECOND
    private CobolString second_header = new CobolString(1); // Group: SECOND-HEADER
    private int second_data = 0;
    private int second_control_sum = 0;
    private CobolString second_variant_a = new CobolString(1); // Group: SECOND-VARIANT-A
    private CobolString part_a_second = new CobolString(9999);
    private CobolString second_variant_b = new CobolString(1); // Group: SECOND-VARIANT-B
    private CobolString part_b_second = new CobolString(3879);



    private void para_main() {
        z = new BigDecimal(String.valueOf(CobolIntrinsics.length(xmain)).trim()).intValue();
        if (z != 8) {
            CobolDisplay.display("Test 1 " + String.valueOf(z));
        }
        z = new BigDecimal(String.valueOf(CobolIntrinsics.length(xmainred)).trim()).intValue();
        if (z != 9) {
            CobolDisplay.display("Test 2 " + String.valueOf(z));
        }
        z = new BigDecimal(String.valueOf(CobolIntrinsics.length(xmain03)).trim()).intValue();
        if (z != 5) {
            CobolDisplay.display("Test 3 " + String.valueOf(z));
        }
        z = new BigDecimal(String.valueOf(CobolIntrinsics.length(xmain0501)).trim()).intValue();
        if (z != 4) {
            CobolDisplay.display("Test 4 " + String.valueOf(z));
        }
        z = new BigDecimal(String.valueOf(CobolIntrinsics.length(xmain0502)).trim()).intValue();
        if (z != 5) {
            CobolDisplay.display("Test 5 " + String.valueOf(z));
        }
        if (CobolIntrinsics.length(use_first) != 33211) {
            CobolDisplay.display(String.valueOf(CobolIntrinsics.length(use_first)));
        }
        if (CobolIntrinsics.length(use_second) != 27241) {
            CobolDisplay.display(String.valueOf(CobolIntrinsics.length(use_second)));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions048LargerRedefinesLengths().run();
    }
}
