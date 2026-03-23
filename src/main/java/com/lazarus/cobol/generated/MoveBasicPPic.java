package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoveBasicPPic extends CobolProgram {
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
    private int p_pic_1 = 0;
    private int p_pic_1_9 = 0;
    private int fld_1 = 0;
    private int fld_1_res = 0;
    private int p_pic_2 = 0;
    private int p_pic_2_9 = 0;
    private int fld_2 = 0;
    private int fld_2_res = 0;
    private int p_pic_3 = 0;
    private int p_pic_3_9 = 0;
    private BigDecimal fld_3 = BigDecimal.ZERO;
    private BigDecimal fld_3_res = BigDecimal.ZERO;
    private int p_pic_4 = 0;
    private int p_pic_4_9 = 0;
    private BigDecimal fld_4 = BigDecimal.ZERO;
    private BigDecimal fld_4_res = BigDecimal.ZERO;
    private int w01_i = 0;



    private void para_main() {
        check_length();
        check_content();
        check_move();
        return;
    }

    private void check_content() {
    }

    private void p_pic_1() {
        if (p_pic_1_9 != 12) {
            CobolDisplay.display("Error C1 VALUE <" + String.valueOf(p_pic_1_9) + "> != 12");
        }
    }

    private void p_pic_2() {
        if (p_pic_2_9 != 34) {
            CobolDisplay.display("Error C2 VALUE <" + String.valueOf(p_pic_2_9) + "> != 34");
        }
    }

    private void p_pic_2_2() {
        if (p_pic_2_9 != -45) {
            CobolDisplay.display("Error C3 VALUE <" + String.valueOf(p_pic_2_9) + "> != -45");
        }
    }

    private void p_pic_3() {
        if (p_pic_3_9 != 5) {
            CobolDisplay.display("Error C4 VALUE <" + String.valueOf(p_pic_3_9) + "> != 5");
        }
    }

    private void p_pic_4() {
        if (p_pic_4_9 != 9) {
            CobolDisplay.display("Error C5 VALUE <" + String.valueOf(p_pic_4_9) + "> != 9");
        }
    }

    private void p_pic_4_2() {
        if (p_pic_4_9 != -7) {
            CobolDisplay.display("Error C6 VALUE <" + String.valueOf(p_pic_4_9) + "> != -7");
        }
    }

    private void check_move() {
    }

    private void p_pic_1_2() {
    }

    private void fld_1() {
    }

    private void fld_1_res() {
        if (fld_1 != fld_1_res) {
            CobolDisplay.display("M1 <" + String.valueOf(fld_1_res) + "> != ");
            /* RAW: FLD-1  */
        }
    }

    private void p_pic_1_3() {
    }

    private void fld_1_2() {
    }

    private void fld_1_res_2() {
        if (fld_1 != fld_1_res) {
            CobolDisplay.display("M2 <" + String.valueOf(fld_1_res) + "> != ");
            /* RAW: FLD-1  */
        }
    }

    private void p_pic_2_3() {
    }

    private void fld_2() {
    }

    private void fld_2_res() {
        if (fld_2 != fld_2_res) {
            CobolDisplay.display("M3 <" + String.valueOf(fld_2_res) + "> != ");
            /* RAW: FLD-2  */
        }
    }

    private void p_pic_2_4() {
    }

    private void fld_2_2() {
    }

    private void fld_2_res_2() {
        if (fld_2 != fld_2_res) {
            CobolDisplay.display("M4 <" + String.valueOf(fld_2_res) + "> != ");
            /* RAW: FLD-2  */
        }
    }

    private void p_pic_2_5() {
    }

    private void fld_2_3() {
    }

    private void fld_2_res_3() {
        if (fld_2 != fld_2_res) {
            CobolDisplay.display("M5 <" + String.valueOf(fld_2_res) + "> != ");
            /* RAW: FLD-2  */
        }
    }

    private void p_pic_2_6() {
    }

    private void fld_2_4() {
    }

    private void fld_2_res_4() {
        if (fld_2 != fld_2_res) {
            CobolDisplay.display("M6 <" + String.valueOf(fld_2_res) + "> != ");
            /* RAW: FLD-2  */
        }
    }

    private void p_pic_3_2() {
    }

    private void fld_3() {
    }

    private void fld_3_res() {
        if (fld_3.compareTo(fld_3_res) != 0) {
            CobolDisplay.display("M7 <" + String.valueOf(fld_3_res) + "> != ");
            /* RAW: FLD-3  */
        }
    }

    private void p_pic_3_3() {
    }

    private void fld_3_2() {
    }

    private void fld_3_res_2() {
        if (fld_3.compareTo(fld_3_res) != 0) {
            CobolDisplay.display("M8 <" + String.valueOf(fld_3_res) + "> != ");
            /* RAW: FLD-3  */
        }
    }

    private void p_pic_4_3() {
    }

    private void fld_4() {
    }

    private void fld_4_res() {
        if (fld_4.compareTo(fld_4_res) != 0) {
            CobolDisplay.display("M9 <" + String.valueOf(fld_4_res) + "> != ");
            /* RAW: FLD-4  */
        }
    }

    private void p_pic_4_4() {
    }

    private void fld_4_2() {
    }

    private void fld_4_res_2() {
        if (fld_4.compareTo(fld_4_res) != 0) {
            CobolDisplay.display("M10 <" + String.valueOf(fld_4_res) + "> != ");
            /* RAW: FLD-4  */
        }
    }

    private void p_pic_4_5() {
    }

    private void fld_4_3() {
    }

    private void fld_4_res_3() {
        if (fld_4.compareTo(fld_4_res) != 0) {
            CobolDisplay.display("M11 <" + String.valueOf(fld_4_res) + "> != ");
            /* RAW: FLD-4  */
        }
    }

    private void p_pic_4_6() {
    }

    private void fld_4_4() {
    }

    private void fld_4_res_4() {
        if (fld_4.compareTo(fld_4_res) != 0) {
            CobolDisplay.display("M11 <" + String.valueOf(fld_4_res) + "> != ");
            /* RAW: FLD-4  */
        }
    }

    private void check_length() {
    }

    private void w01_i() {
        if (w01_i != 2) {
            CobolDisplay.display("Error 1 size <" + String.valueOf(w01_i) + "> !=2");
        }
    }

    private void w01_i_2() {
        if (w01_i != 2) {
            CobolDisplay.display("Error 2 size <" + String.valueOf(w01_i) + "> !=2");
        }
    }

    private void w01_i_3() {
        if (w01_i != 1) {
            CobolDisplay.display("Error 3 size <" + String.valueOf(w01_i) + "> !=1");
        }
    }

    private void w01_i_4() {
        if (w01_i != 1) {
            CobolDisplay.display("Error 4 size <" + String.valueOf(w01_i) + "> !=1");
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new MoveBasicPPic().run();
    }
}
