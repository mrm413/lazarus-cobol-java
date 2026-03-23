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
    }

    private void buffer() {
    }

    private void l1_1_2_s() {
    }

    private void l1_1_2_1_s() {
    }

    private void l1_2_s() {
    }

    private void l1_3_s() {
    }

    private void l1_3_2_s() {
        CobolProgram.call("IBM-ODO-TEST", buffer, l1_1_2_s, l1_1_2_1_s, l1_2_s, l1_3_s);
    }

    private void l1_3_2_s_2() {
    }

    private void buffer_2() {
    }

    private void l1_1_2_s_2() {
    }

    private void l1_1_2_1_s_2() {
    }

    private void l1_2_s_2() {
    }

    private void l1_3_s_2() {
    }

    private void l1_3_2_s_3() {
        CobolProgram.call("IBM-ODO-TEST", buffer, l1_1_2_s, l1_1_2_1_s, l1_2_s, l1_3_s);
    }

    private void l1_3_2_s_4() {
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
