package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataBinary003Comp4Truncate extends CobolProgram {
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
    private short random_origin_b = (short) 0;
    private BigDecimal random_target_b = BigDecimal.ZERO;
    private int random_origin_d = 0;
    private BigDecimal random_target_d = BigDecimal.ZERO;



    private void para_main() {
        random_origin_d = new BigDecimal(String.valueOf(0.12).trim()).intValue();
        random_target_d = new BigDecimal(String.valueOf(random_origin_d).trim());
        random_origin_b = new BigDecimal(String.valueOf(0.12).trim()).shortValue();
        random_target_b = new BigDecimal(String.valueOf(random_origin_b).trim());
        if (random_origin_d != random_origin_b) {
            CobolDisplay.display("ORIGIN 0.12 WRONG");
            CobolDisplay.display("DISPLAY: " + String.valueOf(random_origin_d) + " !=  BINARY : " + String.valueOf(random_origin_b));
        }
        if (random_target_d.compareTo(random_target_b) != 0) {
            CobolDisplay.display("TARGET  .12 WRONG");
            CobolDisplay.display("DISPLAY: " + String.valueOf(random_target_d) + " !=  BINARY : " + String.valueOf(random_target_b));
        } else {
            CobolDisplay.display("Ok with " + String.valueOf(random_target_d) + " == " + String.valueOf(random_target_b));
        }
        random_origin_d = new BigDecimal(String.valueOf(9.85).trim()).intValue();
        random_target_d = new BigDecimal(String.valueOf(random_origin_d).trim());
        random_origin_b = new BigDecimal(String.valueOf(9.85).trim()).shortValue();
        random_target_b = new BigDecimal(String.valueOf(random_origin_b).trim());
        if (random_origin_d != random_origin_b) {
            CobolDisplay.display("ORIGIN 9.85 WRONG");
            CobolDisplay.display("DISPLAY: " + String.valueOf(random_origin_d) + " !=  BINARY : " + String.valueOf(random_origin_b));
        }
        if (random_target_d.compareTo(random_target_b) != 0) {
            CobolDisplay.display("TARGET  .85 WRONG");
            CobolDisplay.display("DISPLAY: " + String.valueOf(random_target_d) + " !=  BINARY : " + String.valueOf(random_target_b));
        } else {
            CobolDisplay.display("Ok with " + String.valueOf(random_target_d) + " == " + String.valueOf(random_target_b));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataBinary003Comp4Truncate().run();
    }
}
