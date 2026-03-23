package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divideextent extends CobolProgram {
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
    private CobolString w01_divides = new CobolString(1); // Group: W01-DIVIDES
    private int[] res_tab = new int[3];



    private void test_format_1() {
        res_tab[1 - 1] = new BigDecimal(String.valueOf(100).trim()).intValue();
        res_tab[2 - 1] = new BigDecimal(String.valueOf(200).trim()).intValue();
        res_tab[3 - 1] = new BigDecimal(String.valueOf(300).trim()).intValue();
        /* DIVIDE without GIVING — needs runtime */
        /* RAW: RES-TAB ( 2 ) RES-TAB ( */
        CobolDisplay.display("1: Should not raised size error");
        if (((res_tab[1 - 1] != 1 || res_tab[2 - 1] != 2) || res_tab[3 - 1] != 3)) {
            CobolDisplay.display("F1.1: result <" + String.valueOf(res_tab[1 - 1]) + "> <" + String.valueOf(res_tab[2 - 1]) + "> <" + String.valueOf(res_tab[3 - 1]) + "> should be 1 2 3");
        }
        res_tab[1 - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
        res_tab[2 - 1] = new BigDecimal(String.valueOf(100).trim()).intValue();
        res_tab[3 - 1] = new BigDecimal(String.valueOf(200).trim()).intValue();
        /* DIVIDE without GIVING — needs runtime */
        /* RAW: RES-TAB ( 3 ) NOT ON */
        CobolDisplay.display("F1.2: Should raise size error");
        if (((res_tab[1 - 1] != 0 || res_tab[2 - 1] != 100) || res_tab[3 - 1] != 200)) {
            CobolDisplay.display("F1.2: result <" + String.valueOf(res_tab[1 - 1]) + "> <" + String.valueOf(res_tab[2 - 1]) + "> <" + String.valueOf(res_tab[3 - 1]) + "> should be 0 100 200");
        }
        res_tab[1 - 1] = new BigDecimal(String.valueOf(100).trim()).intValue();
        /* DIVIDE without GIVING — needs runtime */
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        if (res_tab[1 - 1] != 45) {
            CobolDisplay.display("F1.3: result <" + String.valueOf(res_tab[1 - 1]) + "> should be 45");
        }
        res_tab[1 - 1] = new BigDecimal(String.valueOf(100).trim()).intValue();
        /* DIVIDE without GIVING — needs runtime */
        /* RAW: ROUNDED ON SIZE ERROR */
        CobolDisplay.display("F1.4: Should not raise size error");
        /* RAW: *  */
        if (res_tab[1 - 1] != 46) {
            CobolDisplay.display("F1.4: result <" + String.valueOf(res_tab[1 - 1]) + "> should be 46");
        }
    }

    private void test_format_2() {
        res_tab[1 - 1] = new BigDecimal(String.valueOf(100 / 10.2).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        if (res_tab[1 - 1] != 9) {
            CobolDisplay.display("F2.1: result <" + String.valueOf(res_tab[1 - 1]) + "> should be 9");
        }
        res_tab[1 - 1] = new BigDecimal(String.valueOf(100 / 10.5).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        if (res_tab[1 - 1] != 10) {
            CobolDisplay.display("F2.2: result <" + String.valueOf(res_tab[1 - 1]) + "> should be 10");
        }
        res_tab[1 - 1] = new BigDecimal(String.valueOf(100 / 10.6).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        if (res_tab[1 - 1] != 9) {
            CobolDisplay.display("F2.3: result <" + String.valueOf(res_tab[1 - 1]) + "> should be 9");
        }
    }

    private void test_format_4() {
        res_tab[1 - 1] = new BigDecimal(String.valueOf(100 / 2).trim()).intValue();
        res_tab[2 - 1] = new BigDecimal(String.valueOf(100 % 2).trim()).intValue();
        if ((res_tab[1 - 1] != 50 || res_tab[2 - 1] != 0)) {
            CobolDisplay.display("F4.1: result <" + String.valueOf(res_tab[1 - 1]) + "> <" + String.valueOf(res_tab[2 - 1]) + "> should be <50> <0>");
        }
        res_tab[1 - 1] = new BigDecimal(String.valueOf(100 / 3).trim()).intValue();
        res_tab[2 - 1] = new BigDecimal(String.valueOf(100 % 3).trim()).intValue();
        if ((res_tab[1 - 1] != 33 || res_tab[2 - 1] != 1)) {
            CobolDisplay.display("F4.1: result <" + String.valueOf(res_tab[1 - 1]) + "> <" + String.valueOf(res_tab[2 - 1]) + "> should be <33> <1>");
        }
        res_tab[1 - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
        res_tab[2 - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
        res_tab[3 - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
        res_tab[2 - 1] = new BigDecimal(String.valueOf(100 / res_tab[1 - 1]).trim()).intValue();
        res_tab[3 - 1] = new BigDecimal(String.valueOf(100 % res_tab[1 - 1]).trim()).intValue();
        /* ON SIZE ERROR handling — needs runtime overflow detection */
        return;
    }

    @Override
    public void run() {
        test_format_1();
    }

    public static void main(String[] args) {
        new Divideextent().run();
    }
}
