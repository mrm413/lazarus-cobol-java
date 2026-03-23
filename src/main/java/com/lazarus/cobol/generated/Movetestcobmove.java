package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Movetestcobmove extends CobolProgram {
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
    private CobolString all_src = new CobolString(1); // Group: ALL-SRC
    private int field_02 = 0;
    private int field_03 = 0;
    private int field_04 = 0;
    private int field_05 = 0;
    private int field_06 = 0;
    private int field_07 = 0;
    private int field_08 = 0;
    private int field_09 = 0;
    private int field_10 = 0;
    private CobolString field_11 = new CobolString(1);
    private int field_12 = 0;
    private int field_13 = 0;
    private CobolString field_14 = new CobolString(1);
    private CobolString field_15 = new CobolString(1);
    private double field_16 = 0.0;
    private float field_17 = 0.0f;
    private CobolString field_18 = new CobolString(1);
    private CobolString field_19 = new CobolString(1);
    private CobolString field_20 = new CobolString(1);
    private CobolString field_21 = new CobolString(1);
    private CobolString field_22 = new CobolString(1);
    private CobolString field_23 = new CobolString(1);
    private float field_24 = 0.0f;
    private double field_25 = 0.0;
    private BigDecimal field_26 = BigDecimal.ZERO;
    private int field_50 = 0;
    private int field_51 = 0;
    private BigDecimal field_52 = BigDecimal.ZERO;
    private int field_53 = 0;
    private int field_54 = 0;
    private int field_55 = 0;
    private BigDecimal field_56 = BigDecimal.ZERO;
    private int exptd_result = 0;
    private CobolString all_dst = new CobolString(1); // Group: ALL-DST



    private void para_main() {
        all_src.set("");
        test_pass_1();
        all_dst.set("");
        test_pass_2();
        field_02 = new BigDecimal(String.valueOf(3).trim()).intValue();
    }

    private void exptd_result() {
        field_02 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_11.set(String.valueOf(field_02));
        field_12 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_14.set(String.valueOf(field_02));
        field_15.set(String.valueOf(field_02));
        field_16 = Double.parseDouble(String.valueOf(field_02).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_02).trim());
        field_18.set(String.valueOf(field_02));
        field_19.set(String.valueOf(field_02));
        field_20.set(String.valueOf(field_02));
        field_21.set(String.valueOf(field_02));
        field_22.set(String.valueOf(field_02));
        field_23.set(String.valueOf(field_02));
        field_24 = (float) Double.parseDouble(String.valueOf(field_02).trim());
        field_25 = Double.parseDouble(String.valueOf(field_02).trim());
        field_26 = new BigDecimal(String.valueOf(field_02).trim());
        field_50 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_02).trim());
        field_53 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_02).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_02).trim());
        test_pass_3();
        field_03 = new BigDecimal(String.valueOf(4).trim()).intValue();
    }

    private void exptd_result_2() {
        field_02 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_11.set(String.valueOf(field_03));
        field_12 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_14.set(String.valueOf(field_03));
        field_15.set(String.valueOf(field_03));
        field_16 = Double.parseDouble(String.valueOf(field_03).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_03).trim());
        field_18.set(String.valueOf(field_03));
        field_19.set(String.valueOf(field_03));
        field_20.set(String.valueOf(field_03));
        field_21.set(String.valueOf(field_03));
        field_22.set(String.valueOf(field_03));
        field_23.set(String.valueOf(field_03));
        field_24 = (float) Double.parseDouble(String.valueOf(field_03).trim());
        field_25 = Double.parseDouble(String.valueOf(field_03).trim());
        field_26 = new BigDecimal(String.valueOf(field_03).trim());
        field_50 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_03).trim());
        field_53 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_03).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_03).trim());
        test_pass_3();
        field_04 = new BigDecimal(String.valueOf(5).trim()).intValue();
    }

    private void exptd_result_3() {
        field_02 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_11.set(String.valueOf(field_04));
        field_12 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_14.set(String.valueOf(field_04));
        field_15.set(String.valueOf(field_04));
        field_16 = Double.parseDouble(String.valueOf(field_04).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_04).trim());
        field_18.set(String.valueOf(field_04));
        field_19.set(String.valueOf(field_04));
        field_20.set(String.valueOf(field_04));
        field_21.set(String.valueOf(field_04));
        field_22.set(String.valueOf(field_04));
        field_23.set(String.valueOf(field_04));
        field_24 = (float) Double.parseDouble(String.valueOf(field_04).trim());
        field_25 = Double.parseDouble(String.valueOf(field_04).trim());
        field_26 = new BigDecimal(String.valueOf(field_04).trim());
        field_50 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_04).trim());
        field_53 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_04).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_04).trim());
        test_pass_3();
        field_05 = new BigDecimal(String.valueOf(6).trim()).intValue();
    }

    private void exptd_result_4() {
        field_02 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_11.set(String.valueOf(field_05));
        field_12 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_14.set(String.valueOf(field_05));
        field_15.set(String.valueOf(field_05));
        field_16 = Double.parseDouble(String.valueOf(field_05).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_05).trim());
        field_18.set(String.valueOf(field_05));
        field_19.set(String.valueOf(field_05));
        field_20.set(String.valueOf(field_05));
        field_21.set(String.valueOf(field_05));
        field_22.set(String.valueOf(field_05));
        field_23.set(String.valueOf(field_05));
        field_24 = (float) Double.parseDouble(String.valueOf(field_05).trim());
        field_25 = Double.parseDouble(String.valueOf(field_05).trim());
        field_26 = new BigDecimal(String.valueOf(field_05).trim());
        field_50 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_05).trim());
        field_53 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_05).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_05).trim());
        test_pass_3();
        field_06 = new BigDecimal(String.valueOf(7).trim()).intValue();
    }

    private void exptd_result_5() {
        field_02 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_11.set(String.valueOf(field_06));
        field_12 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_14.set(String.valueOf(field_06));
        field_15.set(String.valueOf(field_06));
        field_16 = Double.parseDouble(String.valueOf(field_06).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_06).trim());
        field_18.set(String.valueOf(field_06));
        field_19.set(String.valueOf(field_06));
        field_20.set(String.valueOf(field_06));
        field_21.set(String.valueOf(field_06));
        field_22.set(String.valueOf(field_06));
        field_23.set(String.valueOf(field_06));
        field_24 = (float) Double.parseDouble(String.valueOf(field_06).trim());
        field_25 = Double.parseDouble(String.valueOf(field_06).trim());
        field_26 = new BigDecimal(String.valueOf(field_06).trim());
        field_50 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_06).trim());
        field_53 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_06).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_06).trim());
        test_pass_3();
        field_07 = new BigDecimal(String.valueOf(8).trim()).intValue();
    }

    private void exptd_result_6() {
        field_02 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_11.set(String.valueOf(field_07));
        field_12 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_14.set(String.valueOf(field_07));
        field_15.set(String.valueOf(field_07));
        field_16 = Double.parseDouble(String.valueOf(field_07).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_07).trim());
        field_18.set(String.valueOf(field_07));
        field_19.set(String.valueOf(field_07));
        field_20.set(String.valueOf(field_07));
        field_21.set(String.valueOf(field_07));
        field_22.set(String.valueOf(field_07));
        field_23.set(String.valueOf(field_07));
        field_24 = (float) Double.parseDouble(String.valueOf(field_07).trim());
        field_25 = Double.parseDouble(String.valueOf(field_07).trim());
        field_26 = new BigDecimal(String.valueOf(field_07).trim());
        field_50 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_07).trim());
        field_53 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_07).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_07).trim());
        test_pass_3();
        field_08 = new BigDecimal(String.valueOf(9).trim()).intValue();
    }

    private void exptd_result_7() {
        field_02 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_11.set(String.valueOf(field_08));
        field_12 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_14.set(String.valueOf(field_08));
        field_15.set(String.valueOf(field_08));
        field_16 = Double.parseDouble(String.valueOf(field_08).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_08).trim());
        field_18.set(String.valueOf(field_08));
        field_19.set(String.valueOf(field_08));
        field_20.set(String.valueOf(field_08));
        field_21.set(String.valueOf(field_08));
        field_22.set(String.valueOf(field_08));
        field_23.set(String.valueOf(field_08));
        field_24 = (float) Double.parseDouble(String.valueOf(field_08).trim());
        field_25 = Double.parseDouble(String.valueOf(field_08).trim());
        field_26 = new BigDecimal(String.valueOf(field_08).trim());
        field_50 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_08).trim());
        field_53 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_08).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_08).trim());
        test_pass_3();
        field_09 = new BigDecimal(String.valueOf(10).trim()).intValue();
    }

    private void exptd_result_8() {
        field_02 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_11.set(String.valueOf(field_09));
        field_12 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_14.set(String.valueOf(field_09));
        field_15.set(String.valueOf(field_09));
        field_16 = Double.parseDouble(String.valueOf(field_09).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_09).trim());
        field_18.set(String.valueOf(field_09));
        field_19.set(String.valueOf(field_09));
        field_20.set(String.valueOf(field_09));
        field_21.set(String.valueOf(field_09));
        field_22.set(String.valueOf(field_09));
        field_23.set(String.valueOf(field_09));
        field_24 = (float) Double.parseDouble(String.valueOf(field_09).trim());
        field_25 = Double.parseDouble(String.valueOf(field_09).trim());
        field_26 = new BigDecimal(String.valueOf(field_09).trim());
        field_50 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_09).trim());
        field_53 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_09).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_09).trim());
        test_pass_3();
        field_10 = new BigDecimal(String.valueOf(11).trim()).intValue();
    }

    private void exptd_result_9() {
        field_02 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_11.set(String.valueOf(field_10));
        field_12 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_14.set(String.valueOf(field_10));
        field_15.set(String.valueOf(field_10));
        field_16 = Double.parseDouble(String.valueOf(field_10).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_10).trim());
        field_18.set(String.valueOf(field_10));
        field_19.set(String.valueOf(field_10));
        field_20.set(String.valueOf(field_10));
        field_21.set(String.valueOf(field_10));
        field_22.set(String.valueOf(field_10));
        field_23.set(String.valueOf(field_10));
        field_24 = (float) Double.parseDouble(String.valueOf(field_10).trim());
        field_25 = Double.parseDouble(String.valueOf(field_10).trim());
        field_26 = new BigDecimal(String.valueOf(field_10).trim());
        field_50 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_10).trim());
        field_53 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_10).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_10).trim());
        test_pass_3();
        field_11.set(String.valueOf(12));
    }

    private void exptd_result_10() {
        field_02 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_11.set(String.valueOf(field_11));
        field_12 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_14.set(String.valueOf(field_11));
        field_15.set(String.valueOf(field_11));
        field_16 = Double.parseDouble(String.valueOf(field_11).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_11).trim());
        field_18.set(String.valueOf(field_11));
        field_19.set(String.valueOf(field_11));
        field_20.set(String.valueOf(field_11));
        field_21.set(String.valueOf(field_11));
        field_22.set(String.valueOf(field_11));
        field_23.set(String.valueOf(field_11));
        field_24 = (float) Double.parseDouble(String.valueOf(field_11).trim());
        field_25 = Double.parseDouble(String.valueOf(field_11).trim());
        field_26 = new BigDecimal(String.valueOf(field_11).trim());
        field_50 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_11).trim());
        field_53 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_11).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_11).trim());
        test_pass_3();
        field_12 = new BigDecimal(String.valueOf(13).trim()).intValue();
    }

    private void exptd_result_11() {
        field_02 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_11.set(String.valueOf(field_12));
        field_12 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_14.set(String.valueOf(field_12));
        field_15.set(String.valueOf(field_12));
        field_16 = Double.parseDouble(String.valueOf(field_12).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_12).trim());
        field_18.set(String.valueOf(field_12));
        field_19.set(String.valueOf(field_12));
        field_20.set(String.valueOf(field_12));
        field_21.set(String.valueOf(field_12));
        field_22.set(String.valueOf(field_12));
        field_23.set(String.valueOf(field_12));
        field_24 = (float) Double.parseDouble(String.valueOf(field_12).trim());
        field_25 = Double.parseDouble(String.valueOf(field_12).trim());
        field_26 = new BigDecimal(String.valueOf(field_12).trim());
        field_50 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_12).trim());
        field_53 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_12).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_12).trim());
        test_pass_3();
        field_13 = new BigDecimal(String.valueOf(14).trim()).intValue();
    }

    private void exptd_result_12() {
        field_02 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_11.set(String.valueOf(field_13));
        field_12 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_14.set(String.valueOf(field_13));
        field_15.set(String.valueOf(field_13));
        field_16 = Double.parseDouble(String.valueOf(field_13).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_13).trim());
        field_18.set(String.valueOf(field_13));
        field_19.set(String.valueOf(field_13));
        field_20.set(String.valueOf(field_13));
        field_21.set(String.valueOf(field_13));
        field_22.set(String.valueOf(field_13));
        field_23.set(String.valueOf(field_13));
        field_24 = (float) Double.parseDouble(String.valueOf(field_13).trim());
        field_25 = Double.parseDouble(String.valueOf(field_13).trim());
        field_26 = new BigDecimal(String.valueOf(field_13).trim());
        field_50 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_13).trim());
        field_53 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_13).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_13).trim());
        test_pass_3();
        field_14.set(String.valueOf(15));
    }

    private void exptd_result_13() {
        field_02 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_11.set(String.valueOf(field_14));
        field_12 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_14.set(String.valueOf(field_14));
        field_15.set(String.valueOf(field_14));
        field_16 = Double.parseDouble(String.valueOf(field_14).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_14).trim());
        field_18.set(String.valueOf(field_14));
        field_19.set(String.valueOf(field_14));
        field_20.set(String.valueOf(field_14));
        field_21.set(String.valueOf(field_14));
        field_22.set(String.valueOf(field_14));
        field_23.set(String.valueOf(field_14));
        field_24 = (float) Double.parseDouble(String.valueOf(field_14).trim());
        field_25 = Double.parseDouble(String.valueOf(field_14).trim());
        field_26 = new BigDecimal(String.valueOf(field_14).trim());
        field_50 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_14).trim());
        field_53 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_14).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_14).trim());
        test_pass_3();
        field_15.set(String.valueOf(16));
    }

    private void exptd_result_14() {
        field_02 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_11.set(String.valueOf(field_15));
        field_12 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_14.set(String.valueOf(field_15));
        field_15.set(String.valueOf(field_15));
        field_16 = Double.parseDouble(String.valueOf(field_15).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_15).trim());
        field_18.set(String.valueOf(field_15));
        field_19.set(String.valueOf(field_15));
        field_20.set(String.valueOf(field_15));
        field_21.set(String.valueOf(field_15));
        field_22.set(String.valueOf(field_15));
        field_23.set(String.valueOf(field_15));
        field_24 = (float) Double.parseDouble(String.valueOf(field_15).trim());
        field_25 = Double.parseDouble(String.valueOf(field_15).trim());
        field_26 = new BigDecimal(String.valueOf(field_15).trim());
        field_50 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_15).trim());
        field_53 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_15).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_15).trim());
        test_pass_3();
        field_16 = Double.parseDouble(String.valueOf(17).trim());
    }

    private void exptd_result_15() {
        field_02 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_11.set(String.valueOf(field_16));
        field_12 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_14.set(String.valueOf(field_16));
        field_15.set(String.valueOf(field_16));
        field_16 = Double.parseDouble(String.valueOf(field_16).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_16).trim());
        field_18.set(String.valueOf(field_16));
        field_19.set(String.valueOf(field_16));
        field_20.set(String.valueOf(field_16));
        field_21.set(String.valueOf(field_16));
        field_22.set(String.valueOf(field_16));
        field_23.set(String.valueOf(field_16));
        field_24 = (float) Double.parseDouble(String.valueOf(field_16).trim());
        field_25 = Double.parseDouble(String.valueOf(field_16).trim());
        field_26 = new BigDecimal(String.valueOf(field_16).trim());
        field_50 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_16).trim());
        field_53 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_16).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_16).trim());
        test_pass_3();
        field_17 = (float) Double.parseDouble(String.valueOf(18).trim());
    }

    private void exptd_result_16() {
        field_02 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_11.set(String.valueOf(field_17));
        field_12 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_14.set(String.valueOf(field_17));
        field_15.set(String.valueOf(field_17));
        field_16 = Double.parseDouble(String.valueOf(field_17).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_17).trim());
        field_18.set(String.valueOf(field_17));
        field_19.set(String.valueOf(field_17));
        field_20.set(String.valueOf(field_17));
        field_21.set(String.valueOf(field_17));
        field_22.set(String.valueOf(field_17));
        field_23.set(String.valueOf(field_17));
        field_24 = (float) Double.parseDouble(String.valueOf(field_17).trim());
        field_25 = Double.parseDouble(String.valueOf(field_17).trim());
        field_26 = new BigDecimal(String.valueOf(field_17).trim());
        field_50 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_17).trim());
        field_53 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_17).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_17).trim());
        test_pass_3();
        field_18.set(String.valueOf(19));
    }

    private void exptd_result_17() {
        field_02 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_11.set(String.valueOf(field_18));
        field_12 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_14.set(String.valueOf(field_18));
        field_15.set(String.valueOf(field_18));
        field_16 = Double.parseDouble(String.valueOf(field_18).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_18).trim());
        field_18.set(String.valueOf(field_18));
        field_19.set(String.valueOf(field_18));
        field_20.set(String.valueOf(field_18));
        field_21.set(String.valueOf(field_18));
        field_22.set(String.valueOf(field_18));
        field_23.set(String.valueOf(field_18));
        field_24 = (float) Double.parseDouble(String.valueOf(field_18).trim());
        field_25 = Double.parseDouble(String.valueOf(field_18).trim());
        field_26 = new BigDecimal(String.valueOf(field_18).trim());
        field_50 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_18).trim());
        field_53 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_18).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_18).trim());
        test_pass_3();
        field_19.set(String.valueOf(20));
    }

    private void exptd_result_18() {
        field_02 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_11.set(String.valueOf(field_19));
        field_12 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_14.set(String.valueOf(field_19));
        field_15.set(String.valueOf(field_19));
        field_16 = Double.parseDouble(String.valueOf(field_19).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_19).trim());
        field_18.set(String.valueOf(field_19));
        field_19.set(String.valueOf(field_19));
        field_20.set(String.valueOf(field_19));
        field_21.set(String.valueOf(field_19));
        field_22.set(String.valueOf(field_19));
        field_23.set(String.valueOf(field_19));
        field_24 = (float) Double.parseDouble(String.valueOf(field_19).trim());
        field_25 = Double.parseDouble(String.valueOf(field_19).trim());
        field_26 = new BigDecimal(String.valueOf(field_19).trim());
        field_50 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_19).trim());
        field_53 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_19).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_19).trim());
        test_pass_3();
        field_20.set(String.valueOf(21));
    }

    private void exptd_result_19() {
        field_02 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_11.set(String.valueOf(field_20));
        field_12 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_14.set(String.valueOf(field_20));
        field_15.set(String.valueOf(field_20));
        field_16 = Double.parseDouble(String.valueOf(field_20).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_20).trim());
        field_18.set(String.valueOf(field_20));
        field_19.set(String.valueOf(field_20));
        field_20.set(String.valueOf(field_20));
        field_21.set(String.valueOf(field_20));
        field_22.set(String.valueOf(field_20));
        field_23.set(String.valueOf(field_20));
        field_24 = (float) Double.parseDouble(String.valueOf(field_20).trim());
        field_25 = Double.parseDouble(String.valueOf(field_20).trim());
        field_26 = new BigDecimal(String.valueOf(field_20).trim());
        field_50 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_20).trim());
        field_53 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_20).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_20).trim());
        test_pass_3();
        field_21.set(String.valueOf(22));
    }

    private void exptd_result_20() {
        field_02 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_11.set(String.valueOf(field_21));
        field_12 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_14.set(String.valueOf(field_21));
        field_15.set(String.valueOf(field_21));
        field_16 = Double.parseDouble(String.valueOf(field_21).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_21).trim());
        field_18.set(String.valueOf(field_21));
        field_19.set(String.valueOf(field_21));
        field_20.set(String.valueOf(field_21));
        field_21.set(String.valueOf(field_21));
        field_22.set(String.valueOf(field_21));
        field_23.set(String.valueOf(field_21));
        field_24 = (float) Double.parseDouble(String.valueOf(field_21).trim());
        field_25 = Double.parseDouble(String.valueOf(field_21).trim());
        field_26 = new BigDecimal(String.valueOf(field_21).trim());
        field_50 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_21).trim());
        field_53 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_21).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_21).trim());
        test_pass_3();
        field_22.set(String.valueOf(23));
    }

    private void exptd_result_21() {
        field_02 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_11.set(String.valueOf(field_22));
        field_12 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_14.set(String.valueOf(field_22));
        field_15.set(String.valueOf(field_22));
        field_16 = Double.parseDouble(String.valueOf(field_22).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_22).trim());
        field_18.set(String.valueOf(field_22));
        field_19.set(String.valueOf(field_22));
        field_20.set(String.valueOf(field_22));
        field_21.set(String.valueOf(field_22));
        field_22.set(String.valueOf(field_22));
        field_23.set(String.valueOf(field_22));
        field_24 = (float) Double.parseDouble(String.valueOf(field_22).trim());
        field_25 = Double.parseDouble(String.valueOf(field_22).trim());
        field_26 = new BigDecimal(String.valueOf(field_22).trim());
        field_50 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_22).trim());
        field_53 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_22).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_22).trim());
        test_pass_3();
        field_23.set(String.valueOf(24));
    }

    private void exptd_result_22() {
        field_02 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_11.set(String.valueOf(field_23));
        field_12 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_14.set(String.valueOf(field_23));
        field_15.set(String.valueOf(field_23));
        field_16 = Double.parseDouble(String.valueOf(field_23).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_23).trim());
        field_18.set(String.valueOf(field_23));
        field_19.set(String.valueOf(field_23));
        field_20.set(String.valueOf(field_23));
        field_21.set(String.valueOf(field_23));
        field_22.set(String.valueOf(field_23));
        field_23.set(String.valueOf(field_23));
        field_24 = (float) Double.parseDouble(String.valueOf(field_23).trim());
        field_25 = Double.parseDouble(String.valueOf(field_23).trim());
        field_26 = new BigDecimal(String.valueOf(field_23).trim());
        field_50 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_23).trim());
        field_53 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_23).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_23).trim());
        test_pass_3();
        field_24 = (float) Double.parseDouble(String.valueOf(25).trim());
    }

    private void exptd_result_23() {
        field_02 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_11.set(String.valueOf(field_24));
        field_12 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_14.set(String.valueOf(field_24));
        field_15.set(String.valueOf(field_24));
        field_16 = Double.parseDouble(String.valueOf(field_24).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_24).trim());
        field_18.set(String.valueOf(field_24));
        field_19.set(String.valueOf(field_24));
        field_20.set(String.valueOf(field_24));
        field_21.set(String.valueOf(field_24));
        field_22.set(String.valueOf(field_24));
        field_23.set(String.valueOf(field_24));
        field_24 = (float) Double.parseDouble(String.valueOf(field_24).trim());
        field_25 = Double.parseDouble(String.valueOf(field_24).trim());
        field_26 = new BigDecimal(String.valueOf(field_24).trim());
        field_50 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_24).trim());
        field_53 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_24).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_24).trim());
        test_pass_3();
        field_25 = Double.parseDouble(String.valueOf(26).trim());
    }

    private void exptd_result_24() {
        field_02 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_11.set(String.valueOf(field_25));
        field_12 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_14.set(String.valueOf(field_25));
        field_15.set(String.valueOf(field_25));
        field_16 = Double.parseDouble(String.valueOf(field_25).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_25).trim());
        field_18.set(String.valueOf(field_25));
        field_19.set(String.valueOf(field_25));
        field_20.set(String.valueOf(field_25));
        field_21.set(String.valueOf(field_25));
        field_22.set(String.valueOf(field_25));
        field_23.set(String.valueOf(field_25));
        field_24 = (float) Double.parseDouble(String.valueOf(field_25).trim());
        field_25 = Double.parseDouble(String.valueOf(field_25).trim());
        field_26 = new BigDecimal(String.valueOf(field_25).trim());
        field_50 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_25).trim());
        field_53 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_25).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_25).trim());
        test_pass_3();
        field_26 = new BigDecimal(String.valueOf(27).trim());
    }

    private void exptd_result_25() {
        field_02 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_11.set(String.valueOf(field_26));
        field_12 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_14.set(String.valueOf(field_26));
        field_15.set(String.valueOf(field_26));
        field_16 = Double.parseDouble(String.valueOf(field_26).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_26).trim());
        field_18.set(String.valueOf(field_26));
        field_19.set(String.valueOf(field_26));
        field_20.set(String.valueOf(field_26));
        field_21.set(String.valueOf(field_26));
        field_22.set(String.valueOf(field_26));
        field_23.set(String.valueOf(field_26));
        field_24 = (float) Double.parseDouble(String.valueOf(field_26).trim());
        field_25 = Double.parseDouble(String.valueOf(field_26).trim());
        field_26 = new BigDecimal(String.valueOf(field_26).trim());
        field_50 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_26).trim());
        field_53 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_26).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_26).trim());
        test_pass_3();
        field_50 = new BigDecimal(String.valueOf(50).trim()).intValue();
    }

    private void exptd_result_26() {
        field_02 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_11.set(String.valueOf(field_50));
        field_12 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_14.set(String.valueOf(field_50));
        field_15.set(String.valueOf(field_50));
        field_16 = Double.parseDouble(String.valueOf(field_50).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_50).trim());
        field_18.set(String.valueOf(field_50));
        field_19.set(String.valueOf(field_50));
        field_20.set(String.valueOf(field_50));
        field_21.set(String.valueOf(field_50));
        field_22.set(String.valueOf(field_50));
        field_23.set(String.valueOf(field_50));
        field_24 = (float) Double.parseDouble(String.valueOf(field_50).trim());
        field_25 = Double.parseDouble(String.valueOf(field_50).trim());
        field_26 = new BigDecimal(String.valueOf(field_50).trim());
        field_50 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_50).trim());
        field_53 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_50).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_50).trim());
        test_pass_3();
        field_51 = new BigDecimal(String.valueOf(51).trim()).intValue();
    }

    private void exptd_result_27() {
        field_02 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_11.set(String.valueOf(field_51));
        field_12 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_14.set(String.valueOf(field_51));
        field_15.set(String.valueOf(field_51));
        field_16 = Double.parseDouble(String.valueOf(field_51).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_51).trim());
        field_18.set(String.valueOf(field_51));
        field_19.set(String.valueOf(field_51));
        field_20.set(String.valueOf(field_51));
        field_21.set(String.valueOf(field_51));
        field_22.set(String.valueOf(field_51));
        field_23.set(String.valueOf(field_51));
        field_24 = (float) Double.parseDouble(String.valueOf(field_51).trim());
        field_25 = Double.parseDouble(String.valueOf(field_51).trim());
        field_26 = new BigDecimal(String.valueOf(field_51).trim());
        field_50 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_51).trim());
        field_53 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_51).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_51).trim());
        test_pass_3();
        field_52 = new BigDecimal(String.valueOf(52).trim());
    }

    private void exptd_result_28() {
        field_02 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_11.set(String.valueOf(field_52));
        field_12 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_14.set(String.valueOf(field_52));
        field_15.set(String.valueOf(field_52));
        field_16 = Double.parseDouble(String.valueOf(field_52).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_52).trim());
        field_18.set(String.valueOf(field_52));
        field_19.set(String.valueOf(field_52));
        field_20.set(String.valueOf(field_52));
        field_21.set(String.valueOf(field_52));
        field_22.set(String.valueOf(field_52));
        field_23.set(String.valueOf(field_52));
        field_24 = (float) Double.parseDouble(String.valueOf(field_52).trim());
        field_25 = Double.parseDouble(String.valueOf(field_52).trim());
        field_26 = new BigDecimal(String.valueOf(field_52).trim());
        field_50 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_52).trim());
        field_53 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_52).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_52).trim());
        test_pass_3();
        field_53 = new BigDecimal(String.valueOf(53).trim()).intValue();
    }

    private void exptd_result_29() {
        field_02 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_11.set(String.valueOf(field_53));
        field_12 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_14.set(String.valueOf(field_53));
        field_15.set(String.valueOf(field_53));
        field_16 = Double.parseDouble(String.valueOf(field_53).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_53).trim());
        field_18.set(String.valueOf(field_53));
        field_19.set(String.valueOf(field_53));
        field_20.set(String.valueOf(field_53));
        field_21.set(String.valueOf(field_53));
        field_22.set(String.valueOf(field_53));
        field_23.set(String.valueOf(field_53));
        field_24 = (float) Double.parseDouble(String.valueOf(field_53).trim());
        field_25 = Double.parseDouble(String.valueOf(field_53).trim());
        field_26 = new BigDecimal(String.valueOf(field_53).trim());
        field_50 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_53).trim());
        field_53 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_53).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_53).trim());
        test_pass_3();
        field_54 = new BigDecimal(String.valueOf(54).trim()).intValue();
    }

    private void exptd_result_30() {
        field_02 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_11.set(String.valueOf(field_54));
        field_12 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_14.set(String.valueOf(field_54));
        field_15.set(String.valueOf(field_54));
        field_16 = Double.parseDouble(String.valueOf(field_54).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_54).trim());
        field_18.set(String.valueOf(field_54));
        field_19.set(String.valueOf(field_54));
        field_20.set(String.valueOf(field_54));
        field_21.set(String.valueOf(field_54));
        field_22.set(String.valueOf(field_54));
        field_23.set(String.valueOf(field_54));
        field_24 = (float) Double.parseDouble(String.valueOf(field_54).trim());
        field_25 = Double.parseDouble(String.valueOf(field_54).trim());
        field_26 = new BigDecimal(String.valueOf(field_54).trim());
        field_50 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_54).trim());
        field_53 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_54).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_54).trim());
        test_pass_3();
        field_55 = new BigDecimal(String.valueOf(55).trim()).intValue();
    }

    private void exptd_result_31() {
        field_02 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_11.set(String.valueOf(field_55));
        field_12 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_14.set(String.valueOf(field_55));
        field_15.set(String.valueOf(field_55));
        field_16 = Double.parseDouble(String.valueOf(field_55).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_55).trim());
        field_18.set(String.valueOf(field_55));
        field_19.set(String.valueOf(field_55));
        field_20.set(String.valueOf(field_55));
        field_21.set(String.valueOf(field_55));
        field_22.set(String.valueOf(field_55));
        field_23.set(String.valueOf(field_55));
        field_24 = (float) Double.parseDouble(String.valueOf(field_55).trim());
        field_25 = Double.parseDouble(String.valueOf(field_55).trim());
        field_26 = new BigDecimal(String.valueOf(field_55).trim());
        field_50 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_55).trim());
        field_53 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_55).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_55).trim());
        test_pass_3();
        field_56 = new BigDecimal(String.valueOf(56).trim());
    }

    private void exptd_result_32() {
        field_02 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_03 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_04 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_05 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_06 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_07 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_08 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_09 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_10 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_11.set(String.valueOf(field_56));
        field_12 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_13 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_14.set(String.valueOf(field_56));
        field_15.set(String.valueOf(field_56));
        field_16 = Double.parseDouble(String.valueOf(field_56).trim());
        field_17 = (float) Double.parseDouble(String.valueOf(field_56).trim());
        field_18.set(String.valueOf(field_56));
        field_19.set(String.valueOf(field_56));
        field_20.set(String.valueOf(field_56));
        field_21.set(String.valueOf(field_56));
        field_22.set(String.valueOf(field_56));
        field_23.set(String.valueOf(field_56));
        field_24 = (float) Double.parseDouble(String.valueOf(field_56).trim());
        field_25 = Double.parseDouble(String.valueOf(field_56).trim());
        field_26 = new BigDecimal(String.valueOf(field_56).trim());
        field_50 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_51 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_52 = new BigDecimal(String.valueOf(field_56).trim());
        field_53 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_54 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_55 = new BigDecimal(String.valueOf(field_56).trim()).intValue();
        field_56 = new BigDecimal(String.valueOf(field_56).trim());
        test_pass_3();
        return;
    }

    private void test_pass_1() {
        if (field_02 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-02 <" + String.valueOf(field_02) + "> != 1");
        }
        if (field_03 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-03 <" + String.valueOf(field_03) + "> != 1");
        }
        if (field_04 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-04 <" + String.valueOf(field_04) + "> != 1");
        }
        if (field_05 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-05 <" + String.valueOf(field_05) + "> != 1");
        }
        if (field_06 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-06 <" + String.valueOf(field_06) + "> != 1");
        }
        if (field_07 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-07 <" + String.valueOf(field_07) + "> != 1");
        }
        if (field_08 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-08 <" + String.valueOf(field_08) + "> != 1");
        }
        if (field_09 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-09 <" + String.valueOf(field_09) + "> != 1");
        }
        if (field_10 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-10 <" + String.valueOf(field_10) + "> != 1");
        }
        if (!String.valueOf(field_11).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-11 <" + String.valueOf(field_11) + "> != 1");
        }
        if (field_12 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-12 <" + String.valueOf(field_12) + "> != 1");
        }
        if (field_13 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-13 <" + String.valueOf(field_13) + "> != 1");
        }
        if (!String.valueOf(field_14).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-14 <" + String.valueOf(field_14) + "> != 1");
        }
        if (!String.valueOf(field_15).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-15 <" + String.valueOf(field_15) + "> != 1");
        }
        if (field_16 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-16 <" + String.valueOf(field_16) + "> != 1");
        }
        if (field_17 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-17 <" + String.valueOf(field_17) + "> != 1");
        }
        if (!String.valueOf(field_18).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-18 <" + String.valueOf(field_18) + "> != 1");
        }
        if (!String.valueOf(field_19).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-19 <" + String.valueOf(field_19) + "> != 1");
        }
        if (!String.valueOf(field_20).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-20 <" + String.valueOf(field_20) + "> != 1");
        }
        if (!String.valueOf(field_21).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-21 <" + String.valueOf(field_21) + "> != 1");
        }
        if (!String.valueOf(field_22).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-22 <" + String.valueOf(field_22) + "> != 1");
        }
        if (!String.valueOf(field_23).equals(String.valueOf(1))) {
            CobolDisplay.display("PASS ONE: FIELD-23 <" + String.valueOf(field_23) + "> != 1");
        }
        if (field_24 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-24 <" + String.valueOf(field_24) + "> != 1");
        }
        if (field_25 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-25 <" + String.valueOf(field_25) + "> != 1");
        }
        if (field_26.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("PASS ONE: FIELD-26 <" + String.valueOf(field_26) + "> != 1");
        }
        if (field_50 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-50 <" + String.valueOf(field_50) + "> != 1");
        }
        if (field_51 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-51 <" + String.valueOf(field_51) + "> != 1");
        }
        if (field_52.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("PASS ONE: FIELD-52 <" + String.valueOf(field_52) + "> != 1");
        }
        if (field_53 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-53 <" + String.valueOf(field_52) + "> != 1");
        }
        if (field_54 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-54 <" + String.valueOf(field_54) + "> != 1");
        }
        if (field_55 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-55 <" + String.valueOf(field_55) + "> != 1");
        }
        if (field_56.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("PASS ONE: FIELD-56 <" + String.valueOf(field_56) + "> != 1");
        }
    }

    private void test_pass_2() {
        if (field_02 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-02 <" + String.valueOf(field_02) + "> != 2");
        }
        if (field_03 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-03 <" + String.valueOf(field_03) + "> != 2");
        }
        if (field_04 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-04 <" + String.valueOf(field_04) + "> != 2");
        }
        if (field_05 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-05 <" + String.valueOf(field_05) + "> != 2");
        }
        if (field_06 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-06 <" + String.valueOf(field_06) + "> != 2");
        }
        if (field_07 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-07 <" + String.valueOf(field_07) + "> != 2");
        }
        if (field_08 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-08 <" + String.valueOf(field_08) + "> != 2");
        }
        if (field_09 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-09 <" + String.valueOf(field_09) + "> != 2");
        }
        if (field_10 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-10 <" + String.valueOf(field_10) + "> != 2");
        }
        if (!String.valueOf(field_11).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-11 <" + String.valueOf(field_11) + "> != 2");
        }
        if (field_12 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-12 <" + String.valueOf(field_12) + "> != 2");
        }
        if (field_13 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-13 <" + String.valueOf(field_13) + "> != 2");
        }
        if (!String.valueOf(field_14).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-14 <" + String.valueOf(field_14) + "> != 2");
        }
        if (!String.valueOf(field_15).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-15 <" + String.valueOf(field_15) + "> != 2");
        }
        if (field_16 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-16 <" + String.valueOf(field_16) + "> != 2");
        }
        if (field_17 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-17 <" + String.valueOf(field_17) + "> != 2");
        }
        if (!String.valueOf(field_18).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-18 <" + String.valueOf(field_18) + "> != 2");
        }
        if (!String.valueOf(field_19).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-19 <" + String.valueOf(field_19) + "> != 2");
        }
        if (!String.valueOf(field_20).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-20 <" + String.valueOf(field_20) + "> != 2");
        }
        if (!String.valueOf(field_21).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-21 <" + String.valueOf(field_21) + "> != 2");
        }
        if (!String.valueOf(field_22).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-22 <" + String.valueOf(field_22) + "> != 2");
        }
        if (!String.valueOf(field_23).equals(String.valueOf(2))) {
            CobolDisplay.display("PASS TWO: FIELD-23 <" + String.valueOf(field_23) + "> != 2");
        }
        if (field_24 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-24 <" + String.valueOf(field_24) + "> != 2");
        }
        if (field_25 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-25 <" + String.valueOf(field_25) + "> != 2");
        }
        if (field_26.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("PASS TWO: FIELD-26 <" + String.valueOf(field_26) + "> != 2");
        }
        if (field_50 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-50 <" + String.valueOf(field_50) + "> != 2");
        }
        if (field_51 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-51 <" + String.valueOf(field_51) + "> != 2");
        }
        if (field_52.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("PASS TWO: FIELD-52 <" + String.valueOf(field_52) + "> != 2");
        }
        if (field_53 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-53 <" + String.valueOf(field_52) + "> != 2");
        }
        if (field_54 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-54 <" + String.valueOf(field_54) + "> != 2");
        }
        if (field_55 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-55 <" + String.valueOf(field_55) + "> != 2");
        }
        if (field_56.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("PASS TWO: FIELD-56 <" + String.valueOf(field_56) + "> != 2");
        }
    }

    private void test_pass_3() {
        if (field_02 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-02 <" + String.valueOf(field_02) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_03 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-03 <" + String.valueOf(field_03) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_04 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-04 <" + String.valueOf(field_04) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_05 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-05 <" + String.valueOf(field_05) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_06 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-06 <" + String.valueOf(field_06) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_07 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-07 <" + String.valueOf(field_07) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_08 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-08 <" + String.valueOf(field_08) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_09 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-09 <" + String.valueOf(field_09) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_10 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-10 <" + String.valueOf(field_10) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_11).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-11 <" + String.valueOf(field_11) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_12 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-12 <" + String.valueOf(field_12) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_13 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-13 <" + String.valueOf(field_13) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_14).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-14 <" + String.valueOf(field_14) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_15).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-15 <" + String.valueOf(field_15) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_16 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-16 <" + String.valueOf(field_16) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_17 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-17 <" + String.valueOf(field_17) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_18).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-18 <" + String.valueOf(field_18) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_19).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-19 <" + String.valueOf(field_19) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_20).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-20 <" + String.valueOf(field_20) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_21).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-21 <" + String.valueOf(field_21) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_22).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-22 <" + String.valueOf(field_22) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (!String.valueOf(field_23).equals(String.valueOf(exptd_result))) {
            CobolDisplay.display("PASS THREE: FIELD-23 <" + String.valueOf(field_23) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_24 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-24 <" + String.valueOf(field_24) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_25 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-25 <" + String.valueOf(field_25) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_26.compareTo(new BigDecimal(String.valueOf(exptd_result).trim())) != 0) {
            CobolDisplay.display("PASS THREE: FIELD-26 <" + String.valueOf(field_26) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_50 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-50 <" + String.valueOf(field_50) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_51 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-51 <" + String.valueOf(field_51) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_52.compareTo(new BigDecimal(String.valueOf(exptd_result).trim())) != 0) {
            CobolDisplay.display("PASS THREE: FIELD-52 <" + String.valueOf(field_52) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_53 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-53 <" + String.valueOf(field_52) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_54 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-54 <" + String.valueOf(field_54) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_55 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-55 <" + String.valueOf(field_55) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (field_56.compareTo(new BigDecimal(String.valueOf(exptd_result).trim())) != 0) {
            CobolDisplay.display("PASS THREE: FIELD-56 <" + String.valueOf(field_56) + "> != <" + String.valueOf(exptd_result) + ">");
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Movetestcobmove().run();
    }
}
