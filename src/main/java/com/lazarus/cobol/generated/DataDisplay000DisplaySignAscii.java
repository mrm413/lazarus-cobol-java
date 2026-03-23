package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay000DisplaySignAscii extends CobolProgram {
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
    private CobolString g = new CobolString(1); // Group: G
    private CobolString x = new CobolString(5);
    private int x_9 = 0;
    private int x_s9 = 0;
    private int x_s9_l = 0;
    private int x_s9_ls = 0;
    private int x_s9_t = 0;
    private int x_s9_ts = 0;



    private void para_main() {
    }

    private void x() {
    }

    private void x_9() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_2() {
    }

    private void x_s9() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_3() {
    }

    private void x_s9_2() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_4() {
    }

    private void x_s9_l() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_5() {
    }

    private void x_s9_l_2() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_6() {
    }

    private void x_s9_ls() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_7() {
    }

    private void x_s9_ls_2() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_8() {
    }

    private void x_s9_t() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_10() {
    }

    private void x_s9_t_2() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_11() {
    }

    private void x_s9_ts() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void x_12() {
    }

    private void x_s9_ts_2() {
        CobolDisplay.display(String.valueOf(x));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataDisplay000DisplaySignAscii().run();
    }
}
