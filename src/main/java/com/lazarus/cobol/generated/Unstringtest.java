package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Unstringtest extends CobolProgram {
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
    private CobolString inp_string = new CobolString(13);
    private int str_pointer = 0;
    private CobolString res_data = new CobolString(1); // Group: RES-DATA
    private CobolString res_trgt_1 = new CobolString(20);
    private CobolString res_delim_1 = new CobolString(1);
    private int res_count_1 = 0;
    private CobolString res_trgt_2 = new CobolString(20);
    private CobolString res_delim_2 = new CobolString(1);
    private int res_count_2 = 0;
    private int res_tally = 0;



    private void para_main() {
        res_data.set("");
        str_pointer = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* UNSTRING — requires runtime implementation */
        res_trgt_1.set(String.valueOf(""));
        res_trgt_2.set(String.valueOf(""));
        test_case_1_result();
        res_data.set("");
        str_pointer = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* UNSTRING — requires runtime implementation */
        res_trgt_1.set(String.valueOf(""));
        res_trgt_2.set(String.valueOf(""));
        test_case_2_result();
        return;
    }

    private void test_case_1_result() {
        if (!String.valueOf(res_trgt_1).equals(String.valueOf("ABC1"))) {
            CobolDisplay.display("A: RES-TRGT-1 <" + String.valueOf(res_trgt_1) + "> != <ABC1>");
        }
        if (!String.valueOf(res_delim_1).equals(String.valueOf("|"))) {
            CobolDisplay.display("A: RES-DELIM-1 <" + String.valueOf(res_delim_1) + "> != <|>");
        }
        if (res_count_1 != 4) {
            CobolDisplay.display("A: RES-COUNT-1 <" + String.valueOf(res_count_1) + "> != <4>");
        }
        if (!String.valueOf(res_trgt_2).equals(String.valueOf("DEF--GHI"))) {
            CobolDisplay.display("A: RES-TRGT-2 <" + String.valueOf(res_trgt_2) + "> != <DEF--GHI>");
        }
        if (!String.valueOf(res_delim_2).equals(String.valueOf(" "))) {
            CobolDisplay.display("A: RES-DELIM2 <" + String.valueOf(res_delim_2) + "> != SPACE");
        }
        if (res_count_2 != 8) {
            CobolDisplay.display("A: RES-COUNT-1 <" + String.valueOf(res_count_2) + "> != <8>");
        }
        if (str_pointer != 14) {
            CobolDisplay.display("A: STR-POINTER <" + String.valueOf(str_pointer) + "> != <14>");
        }
        if (res_tally != 2) {
            CobolDisplay.display("A: RES-TALLY <" + String.valueOf(res_tally) + "> != <2>");
        }
    }

    private void test_case_2_result() {
        if (!String.valueOf(res_trgt_1).equals(String.valueOf("ABC1"))) {
            CobolDisplay.display("B: RES-TRGT-1 <" + String.valueOf(res_trgt_1) + "> != <ABC1>");
        }
        if (!String.valueOf(res_delim_1).equals(String.valueOf("|"))) {
            CobolDisplay.display("B: RES-DELIM-1 <" + String.valueOf(res_delim_1) + "> != <|>");
        }
        if (res_count_1 != 4) {
            CobolDisplay.display("B: RES-COUNT-1 <" + String.valueOf(res_count_1) + "> != <4>");
        }
        if (!String.valueOf(res_trgt_2).equals(String.valueOf("DEF"))) {
            CobolDisplay.display("B: RES-TRGT-2 <" + String.valueOf(res_trgt_2) + "> != <DEF>");
        }
        if (!String.valueOf(res_delim_2).equals(String.valueOf("-"))) {
            CobolDisplay.display("B: RES-DELIM2 <" + String.valueOf(res_delim_2) + "> != <->");
        }
        if (res_count_2 != 3) {
            CobolDisplay.display("B: RES-COUNT-1 <" + String.valueOf(res_count_2) + "> != <3>");
        }
        if (str_pointer != 11) {
            CobolDisplay.display("B: STR-POINTER <" + String.valueOf(str_pointer) + "> != <11>");
        }
        if (res_tally != 2) {
            CobolDisplay.display("B: RES-TALLY <" + String.valueOf(res_tally) + "> != <2>");
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Unstringtest().run();
    }
}
