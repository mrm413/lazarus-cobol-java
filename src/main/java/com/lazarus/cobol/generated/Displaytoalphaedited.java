package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Displaytoalphaedited extends CobolProgram {
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
    private int src_field = 0;
    private CobolString dst_field_1 = new CobolString(1);
    private CobolString dst_field_2 = new CobolString(7);
    private CobolString dst_field_3 = new CobolString(1);
    private CobolString dst_field_4 = new CobolString(7);
    private CobolString dst_field_5 = new CobolString(7);
    private CobolString dst_field_6 = new CobolString(7);
    private CobolString dst_field_7 = new CobolString(7);
    private CobolString dst_field_8 = new CobolString(7);
    private CobolString dst_field_9 = new CobolString(7);
    private CobolString dst_field_10 = new CobolString(7);
    private CobolString dst_field_11 = new CobolString(1);
    private CobolString dst_field_12 = new CobolString(3);
    private CobolString dst_field_13 = new CobolString(1);
    private CobolString dst_field_14 = new CobolString(3);
    private CobolString dst_field_15 = new CobolString(3);
    private CobolString dst_field_16 = new CobolString(3);
    private CobolString expt_field_1 = new CobolString(1);
    private CobolString expt_field_2 = new CobolString(1);
    private CobolString expt_field_3 = new CobolString(1);
    private CobolString expt_field_4 = new CobolString(1);
    private CobolString expt_field_5 = new CobolString(1);
    private CobolString expt_field_6 = new CobolString(1);
    private CobolString expt_field_7 = new CobolString(1);
    private CobolString expt_field_8 = new CobolString(1);
    private CobolString expt_field_9 = new CobolString(1);
    private CobolString expt_field_10 = new CobolString(1);
    private CobolString expt_field_11 = new CobolString(1);
    private CobolString expt_field_12 = new CobolString(1);
    private CobolString expt_field_13 = new CobolString(1);
    private CobolString expt_field_14 = new CobolString(1);
    private CobolString expt_field_15 = new CobolString(1);
    private CobolString expt_field_16 = new CobolString(1);



    private void test_runner() {
        dst_field_1.set(String.valueOf("123456"));
        dst_field_2.set(String.valueOf("123456"));
        dst_field_3.set(String.valueOf("123456"));
        dst_field_4.set(String.valueOf("123456"));
        dst_field_5.set(String.valueOf("123456"));
        dst_field_6.set(String.valueOf("123456"));
        dst_field_7.set(String.valueOf("123456"));
        dst_field_8.set(String.valueOf("123456"));
        dst_field_9.set(String.valueOf("123456"));
        dst_field_10.set(String.valueOf("123456"));
        dst_field_11.set(String.valueOf("123456"));
        dst_field_12.set(String.valueOf("123456"));
        dst_field_12.set(String.valueOf("123456"));
        dst_field_14.set(String.valueOf("123456"));
        dst_field_15.set(String.valueOf("123456"));
        dst_field_16.set(String.valueOf("123456"));
        src_field = new BigDecimal(String.valueOf("123456").trim()).intValue();
        do_test();
        dst_field_1.set(String.valueOf(src_field));
        dst_field_2.set(String.valueOf(src_field));
        dst_field_3.set(String.valueOf(src_field));
        dst_field_4.set(String.valueOf(src_field));
        dst_field_5.set(String.valueOf(src_field));
        dst_field_6.set(String.valueOf(src_field));
        dst_field_7.set(String.valueOf(src_field));
        dst_field_8.set(String.valueOf(src_field));
        dst_field_9.set(String.valueOf(src_field));
        dst_field_10.set(String.valueOf(src_field));
        dst_field_11.set(String.valueOf(src_field));
        dst_field_12.set(String.valueOf(src_field));
        dst_field_12.set(String.valueOf(src_field));
        dst_field_14.set(String.valueOf(src_field));
        dst_field_15.set(String.valueOf(src_field));
        dst_field_16.set(String.valueOf(src_field));
        do_test();
        return;
    }

    private void do_test() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(expt_field_1))) {
            CobolDisplay.display("1: <" + String.valueOf(dst_field_1) + "> != <" + String.valueOf(expt_field_1) + ">");
        }
        if (!String.valueOf(dst_field_2).equals(String.valueOf(expt_field_2))) {
            CobolDisplay.display("2: <" + String.valueOf(dst_field_2) + "> != <" + String.valueOf(expt_field_2) + ">");
        }
        if (!String.valueOf(dst_field_3).equals(String.valueOf(expt_field_3))) {
            CobolDisplay.display("3: <" + String.valueOf(dst_field_3) + "> != <" + String.valueOf(expt_field_3) + ">");
        }
        if (!String.valueOf(dst_field_4).equals(String.valueOf(expt_field_4))) {
            CobolDisplay.display("4: <" + String.valueOf(dst_field_4) + "> != <" + String.valueOf(expt_field_4) + ">");
        }
        if (!String.valueOf(dst_field_5).equals(String.valueOf(expt_field_5))) {
            CobolDisplay.display("5: <" + String.valueOf(dst_field_5) + "> != <" + String.valueOf(expt_field_5) + ">");
        }
        if (!String.valueOf(dst_field_6).equals(String.valueOf(expt_field_6))) {
            CobolDisplay.display("6: <" + String.valueOf(dst_field_6) + "> != <" + String.valueOf(expt_field_6) + ">");
        }
        if (!String.valueOf(dst_field_7).equals(String.valueOf(expt_field_7))) {
            CobolDisplay.display("7: <" + String.valueOf(dst_field_7) + "> != <" + String.valueOf(expt_field_7) + ">");
        }
        if (!String.valueOf(dst_field_8).equals(String.valueOf(expt_field_8))) {
            CobolDisplay.display("8: <" + String.valueOf(dst_field_8) + "> != <" + String.valueOf(expt_field_8) + ">");
        }
        if (!String.valueOf(dst_field_9).equals(String.valueOf(expt_field_9))) {
            CobolDisplay.display("9: <" + String.valueOf(dst_field_9) + "> != <" + String.valueOf(expt_field_9) + ">");
        }
        if (!String.valueOf(dst_field_10).equals(String.valueOf(expt_field_10))) {
            CobolDisplay.display("10: <" + String.valueOf(dst_field_10) + "> != <" + String.valueOf(expt_field_10) + ">");
        }
        if (!String.valueOf(dst_field_11).equals(String.valueOf(expt_field_11))) {
            CobolDisplay.display("11: <" + String.valueOf(dst_field_11) + "> != <" + String.valueOf(expt_field_11) + ">");
        }
        if (!String.valueOf(dst_field_12).equals(String.valueOf(expt_field_12))) {
            CobolDisplay.display("12: <" + String.valueOf(dst_field_12) + "> != <" + String.valueOf(expt_field_12) + ">");
        }
        if (!String.valueOf(dst_field_13).equals(String.valueOf(expt_field_13))) {
            CobolDisplay.display("13: <" + String.valueOf(dst_field_13) + "> != <" + String.valueOf(expt_field_13) + ">");
        }
        if (!String.valueOf(dst_field_14).equals(String.valueOf(expt_field_14))) {
            CobolDisplay.display("14: <" + String.valueOf(dst_field_14) + "> != <" + String.valueOf(expt_field_14) + ">");
        }
        if (!String.valueOf(dst_field_15).equals(String.valueOf(expt_field_15))) {
            CobolDisplay.display("15: <" + String.valueOf(dst_field_15) + "> != <" + String.valueOf(expt_field_15) + ">");
        }
        if (!String.valueOf(dst_field_16).equals(String.valueOf(expt_field_16))) {
            CobolDisplay.display("16: <" + String.valueOf(dst_field_16) + "> != <" + String.valueOf(expt_field_16) + ">");
        }
    }

    @Override
    public void run() {
        test_runner();
    }

    public static void main(String[] args) {
        new Displaytoalphaedited().run();
    }
}
