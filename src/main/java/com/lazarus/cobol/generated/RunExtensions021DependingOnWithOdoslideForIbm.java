package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions021DependingOnWithOdoslideForIbm extends CobolProgram {
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
    private int l1_1_2_s = 0;
    private int l1_1_2_1_s = 0;
    private int l1_2_s = 0;
    private int l1_3_s = 0;
    private int l1_3_2_s = 0;
    private CobolString buffer = new CobolString(370);



    private void para_main() {
        buffer.set(String.valueOf("0123456789"));
        l1_1_2_s = new BigDecimal(String.valueOf(3).trim()).intValue();
        l1_1_2_1_s = new BigDecimal(String.valueOf(4).trim()).intValue();
        l1_2_s = new BigDecimal(String.valueOf(0).trim()).intValue();
        l1_3_s = new BigDecimal(String.valueOf(6).trim()).intValue();
        l1_3_2_s = new BigDecimal(String.valueOf(1).trim()).intValue();
        CobolProgram.call("IBM-ODO-TEST", buffer, l1_1_2_s, l1_1_2_1_s, l1_2_s, l1_3_s, l1_3_2_s);
        buffer.set(String.valueOf("0123456789"));
        l1_1_2_s = new BigDecimal(String.valueOf(2).trim()).intValue();
        l1_1_2_1_s = new BigDecimal(String.valueOf(3).trim()).intValue();
        l1_2_s = new BigDecimal(String.valueOf(1).trim()).intValue();
        l1_3_s = new BigDecimal(String.valueOf(4).trim()).intValue();
        l1_3_2_s = new BigDecimal(String.valueOf(0).trim()).intValue();
        CobolProgram.call("IBM-ODO-TEST", buffer, l1_1_2_s, l1_1_2_1_s, l1_2_s, l1_3_s, l1_3_2_s);
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions021DependingOnWithOdoslideForIbm().run();
    }
}
