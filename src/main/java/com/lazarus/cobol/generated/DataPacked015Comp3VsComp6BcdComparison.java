package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked015Comp3VsComp6BcdComparison extends CobolProgram {
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
    private BigDecimal pd_03 = BigDecimal.ZERO;
    private BigDecimal pd_04 = BigDecimal.ZERO;
    private BigDecimal pd_05 = BigDecimal.ZERO;
    private BigDecimal pd_06 = BigDecimal.ZERO;
    private BigDecimal pd_07 = BigDecimal.ZERO;
    private BigDecimal pd_08 = BigDecimal.ZERO;
    private BigDecimal pd_09 = BigDecimal.ZERO;
    private BigDecimal pd_10 = BigDecimal.ZERO;
    private BigDecimal pd_11 = BigDecimal.ZERO;
    private BigDecimal pd_12 = BigDecimal.ZERO;
    private BigDecimal pd_13 = BigDecimal.ZERO;
    private BigDecimal pd_14 = BigDecimal.ZERO;
    private BigDecimal pd_15 = BigDecimal.ZERO;
    private BigDecimal pd_16 = BigDecimal.ZERO;
    private BigDecimal pd_17 = BigDecimal.ZERO;
    private BigDecimal pd_18 = BigDecimal.ZERO;
    private BigDecimal pd_19 = BigDecimal.ZERO;
    private BigDecimal pd_20 = BigDecimal.ZERO;
    private BigDecimal pd_21 = BigDecimal.ZERO;
    private BigDecimal pd_22 = BigDecimal.ZERO;
    private BigDecimal pd_23 = BigDecimal.ZERO;
    private BigDecimal pd_24 = BigDecimal.ZERO;
    private BigDecimal pd_25 = BigDecimal.ZERO;
    private BigDecimal pd_26 = BigDecimal.ZERO;
    private BigDecimal pd_27 = BigDecimal.ZERO;
    private BigDecimal pd_28 = BigDecimal.ZERO;
    private BigDecimal pd_29 = BigDecimal.ZERO;
    private BigDecimal pd_30 = BigDecimal.ZERO;
    private BigDecimal pd_31 = BigDecimal.ZERO;
    private BigDecimal pd_32 = BigDecimal.ZERO;
    private BigDecimal pd_33 = BigDecimal.ZERO;
    private BigDecimal pd_34 = BigDecimal.ZERO;
    private BigDecimal pd_35 = BigDecimal.ZERO;
    private BigDecimal pd_36 = BigDecimal.ZERO;
    private BigDecimal cd_03 = BigDecimal.ZERO;
    private BigDecimal cd_04 = BigDecimal.ZERO;
    private BigDecimal cd_05 = BigDecimal.ZERO;
    private BigDecimal cd_06 = BigDecimal.ZERO;
    private BigDecimal cd_07 = BigDecimal.ZERO;
    private BigDecimal cd_08 = BigDecimal.ZERO;
    private BigDecimal cd_09 = BigDecimal.ZERO;
    private BigDecimal cd_10 = BigDecimal.ZERO;
    private BigDecimal cd_11 = BigDecimal.ZERO;
    private BigDecimal cd_12 = BigDecimal.ZERO;
    private BigDecimal cd_13 = BigDecimal.ZERO;
    private BigDecimal cd_14 = BigDecimal.ZERO;
    private BigDecimal cd_15 = BigDecimal.ZERO;
    private BigDecimal cd_16 = BigDecimal.ZERO;
    private BigDecimal cd_17 = BigDecimal.ZERO;
    private BigDecimal cd_18 = BigDecimal.ZERO;
    private BigDecimal cd_19 = BigDecimal.ZERO;
    private BigDecimal cd_20 = BigDecimal.ZERO;
    private BigDecimal cd_21 = BigDecimal.ZERO;
    private BigDecimal cd_22 = BigDecimal.ZERO;
    private BigDecimal cd_23 = BigDecimal.ZERO;
    private BigDecimal cd_24 = BigDecimal.ZERO;
    private BigDecimal cd_25 = BigDecimal.ZERO;
    private BigDecimal cd_26 = BigDecimal.ZERO;
    private BigDecimal cd_27 = BigDecimal.ZERO;
    private BigDecimal cd_28 = BigDecimal.ZERO;
    private BigDecimal cd_29 = BigDecimal.ZERO;
    private BigDecimal cd_30 = BigDecimal.ZERO;
    private BigDecimal cd_31 = BigDecimal.ZERO;
    private BigDecimal cd_32 = BigDecimal.ZERO;
    private BigDecimal cd_33 = BigDecimal.ZERO;
    private BigDecimal cd_34 = BigDecimal.ZERO;
    private BigDecimal cd_35 = BigDecimal.ZERO;
    private BigDecimal cd_36 = BigDecimal.ZERO;


    private CobolString on = new CobolString(256);
    private CobolString error = new CobolString(256);
    private CobolString no_disp = new CobolString(256);
    private CobolString cb_true = new CobolString(256);
    private CobolString some = new CobolString(256);
    private CobolString pz_02_x = new CobolString(256);
    private CobolString pz_03_x = new CobolString(256);
    private CobolString pz_04_x = new CobolString(256);
    private CobolString pz_05_x = new CobolString(256);
    private CobolString pz_06_x = new CobolString(256);
    private CobolString pz_01 = new CobolString(256);
    private CobolString pz_02 = new CobolString(256);
    private CobolString pz_03 = new CobolString(256);
    private CobolString pz_04 = new CobolString(256);
    private CobolString pz_05 = new CobolString(256);
    private CobolString pz_06 = new CobolString(256);
    private CobolString u4_32d = new CobolString(256);
    private CobolString up_32d = new CobolString(256);
    private CobolString sp_32d = new CobolString(256);
    private CobolString np_32d = new CobolString(256);

    private void para_main() {
        /* RAW: * Test with */
        CobolDisplay.display(String.valueOf(on) + String.valueOf(error));
        do_check();
        no_disp.set(String.valueOf((Integer.parseInt(String.valueOf(cb_true).trim()) * Integer.parseInt(String.valueOf(some).trim()))));
        /* RAW: performance checks on the */
    }

    private void way() {
        for (int _i0 = 0; _i0 < 10000; _i0++) {
        }
        return;
    }

    private void do_check() {
        do_check_part0();
        do_check_part1();
    }
    private void do_check_part0() {
        if (pd_03.compareTo(cd_03) != 0) {
            CobolDisplay.display("PD-03 <> CD-03");
        }
        if (pd_04.compareTo(cd_04) != 0) {
            CobolDisplay.display("PD-04 <> CD-04");
        }
        if (pd_05.compareTo(cd_05) != 0) {
            CobolDisplay.display("PD-05 <> CD-05");
        }
        if (pd_06.compareTo(cd_06) != 0) {
            CobolDisplay.display("PD-06 <> CD-06");
        }
        if (pd_07.compareTo(cd_07) != 0) {
            CobolDisplay.display("PD-07 <> CD-07");
        }
        if (pd_08.compareTo(cd_08) != 0) {
            CobolDisplay.display("PD-08 <> CD-08");
        }
        if (pd_09.compareTo(cd_09) != 0) {
            CobolDisplay.display("PD-09 <> CD-09");
        }
        if (pd_10.compareTo(cd_10) != 0) {
            CobolDisplay.display("PD-10 <> CD-10");
        }
        if (pd_11.compareTo(cd_11) != 0) {
            CobolDisplay.display("PD-11 <> CD-11");
        }
        if (pd_12.compareTo(cd_12) != 0) {
            CobolDisplay.display("PD-12 <> CD-12");
        }
        if (pd_13.compareTo(cd_13) != 0) {
            CobolDisplay.display("PD-13 <> CD-13");
        }
        if (pd_14.compareTo(cd_14) != 0) {
            CobolDisplay.display("PD-14 <> CD-14");
        }
        if (pd_15.compareTo(cd_15) != 0) {
            CobolDisplay.display("PD-15 <> CD-15");
        }
        if (pd_16.compareTo(cd_16) != 0) {
            CobolDisplay.display("PD-16 <> CD-16");
        }
        if (pd_17.compareTo(cd_17) != 0) {
            CobolDisplay.display("PD-17 <> CD-17");
        }
        if (pd_18.compareTo(cd_18) != 0) {
            CobolDisplay.display("PD-18 <> CD-18");
        }
        if (pd_19.compareTo(cd_19) != 0) {
            CobolDisplay.display("PD-19 <> CD-19");
        }
        if (pd_20.compareTo(cd_20) != 0) {
            CobolDisplay.display("PD-20 <> CD-20");
        }
        if (pd_21.compareTo(cd_21) != 0) {
            CobolDisplay.display("PD-21 <> CD-21");
        }
        if (pd_22.compareTo(cd_22) != 0) {
            CobolDisplay.display("PD-22 <> CD-22");
        }
        if (pd_23.compareTo(cd_23) != 0) {
            CobolDisplay.display("PD-23 <> CD-23");
        }
        if (pd_24.compareTo(cd_24) != 0) {
            CobolDisplay.display("PD-24 <> CD-24");
        }
        if (pd_25.compareTo(cd_25) != 0) {
            CobolDisplay.display("PD-25 <> CD-25");
        }
        if (pd_26.compareTo(cd_26) != 0) {
            CobolDisplay.display("PD-26 <> CD-26");
        }
        if (pd_27.compareTo(cd_27) != 0) {
            CobolDisplay.display("PD-27 <> CD-27");
        }
        if (pd_28.compareTo(cd_28) != 0) {
            CobolDisplay.display("PD-28 <> CD-28");
        }
        if (pd_29.compareTo(cd_29) != 0) {
            CobolDisplay.display("PD-29 <> CD-29");
        }
        if (pd_30.compareTo(cd_30) != 0) {
            CobolDisplay.display("PD-30 <> CD-30");
        }
        if (pd_31.compareTo(cd_31) != 0) {
            CobolDisplay.display("PD-31 <> CD-31");
        }
        if (pd_32.compareTo(cd_32) != 0) {
            CobolDisplay.display("PD-32 <> CD-32");
        }
        if (pd_33.compareTo(cd_33) != 0) {
            CobolDisplay.display("PD-33 <> CD-33");
        }
        if (pd_34.compareTo(cd_34) != 0) {
            CobolDisplay.display("PD-34 <> CD-34");
        }
        if (pd_35.compareTo(cd_35) != 0) {
            CobolDisplay.display("PD-35 <> CD-35");
        }
        if (pd_36.compareTo(cd_36) != 0) {
            CobolDisplay.display("PD-36 <> CD-36");
        }
        if (pd_03.compareTo(cd_36) != 0) {
            CobolDisplay.display("PD-03 <> CD-36");
        }
        if (pd_04.compareTo(cd_35) != 0) {
            CobolDisplay.display("PD-04 <> CD-35");
        }
        if (pd_05.compareTo(cd_34) != 0) {
            CobolDisplay.display("PD-05 <> CD-34");
        }
        if (pd_06.compareTo(cd_33) != 0) {
            CobolDisplay.display("PD-06 <> CD-33");
        }
        if (pd_07.compareTo(cd_32) != 0) {
            CobolDisplay.display("PD-07 <> CD-32");
        }
        if (pd_08.compareTo(cd_31) != 0) {
            CobolDisplay.display("PD-08 <> CD-31");
        }
        if (pd_09.compareTo(cd_30) != 0) {
            CobolDisplay.display("PD-09 <> CD-30");
        }
        if (pd_10.compareTo(cd_29) != 0) {
            CobolDisplay.display("PD-10 <> CD-29");
        }
        if (pd_11.compareTo(cd_28) != 0) {
            CobolDisplay.display("PD-11 <> CD-28");
        }
        if (pd_12.compareTo(cd_27) != 0) {
            CobolDisplay.display("PD-12 <> CD-27");
        }
        if (pd_13.compareTo(cd_26) != 0) {
            CobolDisplay.display("PD-13 <> CD-26");
        }
        if (pd_14.compareTo(cd_25) != 0) {
            CobolDisplay.display("PD-14 <> CD-25");
        }
        if (pd_15.compareTo(cd_24) != 0) {
            CobolDisplay.display("PD-15 <> CD-24");
        }
        if (pd_16.compareTo(cd_23) != 0) {
            CobolDisplay.display("PD-16 <> CD-23");
        }
        if (pd_17.compareTo(cd_22) != 0) {
            CobolDisplay.display("PD-17 <> CD-22");
        }
        if (pd_18.compareTo(cd_21) != 0) {
            CobolDisplay.display("PD-18 <> CD-21");
        }
        if (pd_19.compareTo(cd_20) != 0) {
            CobolDisplay.display("PD-19 <> CD-20");
        }
        if (pd_20.compareTo(cd_19) != 0) {
            CobolDisplay.display("PD-20 <> CD-19");
        }
        if (pd_21.compareTo(cd_18) != 0) {
            CobolDisplay.display("PD-21 <> CD-18");
        }
        if (pd_22.compareTo(cd_17) != 0) {
            CobolDisplay.display("PD-22 <> CD-17");
        }
        if (pd_23.compareTo(cd_16) != 0) {
            CobolDisplay.display("PD-23 <> CD-16");
        }
        if (pd_24.compareTo(cd_15) != 0) {
            CobolDisplay.display("PD-24 <> CD-15");
        }
        if (pd_25.compareTo(cd_14) != 0) {
            CobolDisplay.display("PD-25 <> CD-14");
        }
        if (pd_26.compareTo(cd_13) != 0) {
            CobolDisplay.display("PD-26 <> CD-13");
        }
        if (pd_27.compareTo(cd_12) != 0) {
            CobolDisplay.display("PD-27 <> CD-12");
        }
        if (pd_28.compareTo(cd_11) != 0) {
            CobolDisplay.display("PD-28 <> CD-11");
        }
        if (pd_29.compareTo(cd_10) != 0) {
            CobolDisplay.display("PD-29 <> CD-10");
        }
        if (pd_30.compareTo(cd_09) != 0) {
            CobolDisplay.display("PD-30 <> CD-09");
        }
        if (pd_31.compareTo(cd_08) != 0) {
            CobolDisplay.display("PD-31 <> CD-08");
        }
        if (pd_32.compareTo(cd_07) != 0) {
            CobolDisplay.display("PD-32 <> CD-07");
        }
        if (pd_33.compareTo(cd_06) != 0) {
            CobolDisplay.display("PD-33 <> CD-06");
        }
        if (pd_34.compareTo(cd_05) != 0) {
            CobolDisplay.display("PD-34 <> CD-05");
        }
        if (pd_35.compareTo(cd_04) != 0) {
            CobolDisplay.display("PD-35 <> CD-04");
        }
        if (pd_36.compareTo(cd_03) != 0) {
            CobolDisplay.display("PD-36 <> CD-03");
        }
        if (pd_03.compareTo(pd_36) != 0) {
            CobolDisplay.display("PD-03 <> PD-36");
        }
        if (pd_04.compareTo(pd_35) != 0) {
            CobolDisplay.display("PD-04 <> PD-35");
        }
        if (pd_05.compareTo(pd_34) != 0) {
            CobolDisplay.display("PD-05 <> PD-34");
        }
        if (pd_06.compareTo(pd_33) != 0) {
            CobolDisplay.display("PD-06 <> PD-33");
        }
        if (pd_07.compareTo(pd_32) != 0) {
            CobolDisplay.display("PD-07 <> PD-32");
        }
        if (pd_08.compareTo(pd_31) != 0) {
            CobolDisplay.display("PD-08 <> PD-31");
        }
        if (pd_09.compareTo(pd_30) != 0) {
            CobolDisplay.display("PD-09 <> PD-30");
        }
        if (pd_10.compareTo(pd_29) != 0) {
            CobolDisplay.display("PD-10 <> PD-29");
        }
        if (pd_11.compareTo(pd_28) != 0) {
            CobolDisplay.display("PD-11 <> PD-28");
        }
        if (pd_12.compareTo(pd_27) != 0) {
            CobolDisplay.display("PD-12 <> PD-27");
        }
        if (pd_13.compareTo(pd_26) != 0) {
            CobolDisplay.display("PD-13 <> PD-26");
        }
        if (pd_14.compareTo(pd_25) != 0) {
            CobolDisplay.display("PD-14 <> PD-25");
        }
        if (pd_15.compareTo(pd_24) != 0) {
            CobolDisplay.display("PD-15 <> PD-24");
        }
        if (pd_16.compareTo(pd_23) != 0) {
            CobolDisplay.display("PD-16 <> PD-23");
        }
        if (pd_17.compareTo(pd_22) != 0) {
            CobolDisplay.display("PD-17 <> PD-22");
        }
        if (pd_18.compareTo(pd_21) != 0) {
            CobolDisplay.display("PD-18 <> PD-21");
        }
        if (pd_19.compareTo(pd_20) != 0) {
            CobolDisplay.display("PD-19 <> PD-20");
        }
        if (pd_20.compareTo(pd_19) != 0) {
            CobolDisplay.display("PD-20 <> PD-19");
        }
        if (pd_21.compareTo(pd_18) != 0) {
            CobolDisplay.display("PD-21 <> PD-18");
        }
        if (pd_22.compareTo(pd_17) != 0) {
            CobolDisplay.display("PD-22 <> PD-17");
        }
        if (pd_23.compareTo(pd_16) != 0) {
            CobolDisplay.display("PD-23 <> PD-16");
        }
        if (pd_24.compareTo(pd_15) != 0) {
            CobolDisplay.display("PD-24 <> PD-15");
        }
        if (pd_25.compareTo(pd_14) != 0) {
            CobolDisplay.display("PD-25 <> PD-14");
        }
        if (pd_26.compareTo(pd_13) != 0) {
            CobolDisplay.display("PD-26 <> PD-13");
        }
        if (pd_27.compareTo(pd_12) != 0) {
            CobolDisplay.display("PD-27 <> PD-12");
        }
        if (pd_28.compareTo(pd_11) != 0) {
            CobolDisplay.display("PD-28 <> PD-11");
        }
        if (pd_29.compareTo(pd_10) != 0) {
            CobolDisplay.display("PD-29 <> PD-10");
        }
        if (pd_30.compareTo(pd_09) != 0) {
            CobolDisplay.display("PD-30 <> PD-09");
        }
        if (pd_31.compareTo(pd_08) != 0) {
            CobolDisplay.display("PD-31 <> PD-08");
        }
        if (pd_32.compareTo(pd_07) != 0) {
            CobolDisplay.display("PD-32 <> PD-07");
        }
        if (pd_33.compareTo(pd_06) != 0) {
            CobolDisplay.display("PD-33 <> PD-06");
        }
        if (pd_34.compareTo(pd_05) != 0) {
            CobolDisplay.display("PD-34 <> PD-05");
        }
        if (pd_35.compareTo(pd_04) != 0) {
            CobolDisplay.display("PD-35 <> PD-04");
        }
        if (pd_36.compareTo(pd_03) != 0) {
            CobolDisplay.display("PD-36 <> PD-03");
        }
        if (cd_03.compareTo(cd_36) != 0) {
            CobolDisplay.display("CD-03 <> CD-36");
        }
        if (cd_04.compareTo(cd_35) != 0) {
            CobolDisplay.display("CD-04 <> CD-35");
        }
        if (cd_05.compareTo(cd_34) != 0) {
            CobolDisplay.display("CD-05 <> CD-34");
        }
        if (cd_06.compareTo(cd_33) != 0) {
            CobolDisplay.display("CD-06 <> CD-33");
        }
        if (cd_07.compareTo(cd_32) != 0) {
            CobolDisplay.display("CD-07 <> CD-32");
        }
        if (cd_08.compareTo(cd_31) != 0) {
            CobolDisplay.display("CD-08 <> CD-31");
        }
        if (cd_09.compareTo(cd_30) != 0) {
            CobolDisplay.display("CD-09 <> CD-30");
        }
        if (cd_10.compareTo(cd_29) != 0) {
            CobolDisplay.display("CD-10 <> CD-29");
        }
        if (cd_11.compareTo(cd_28) != 0) {
            CobolDisplay.display("CD-11 <> CD-28");
        }
        if (cd_12.compareTo(cd_27) != 0) {
            CobolDisplay.display("CD-12 <> CD-27");
        }
        if (cd_13.compareTo(cd_26) != 0) {
            CobolDisplay.display("CD-13 <> CD-26");
        }
        if (cd_14.compareTo(cd_25) != 0) {
            CobolDisplay.display("CD-14 <> CD-25");
        }
        if (cd_15.compareTo(cd_24) != 0) {
            CobolDisplay.display("CD-15 <> CD-24");
        }
        if (cd_16.compareTo(cd_23) != 0) {
            CobolDisplay.display("CD-16 <> CD-23");
        }
        if (cd_17.compareTo(cd_22) != 0) {
            CobolDisplay.display("CD-17 <> CD-22");
        }
        if (cd_18.compareTo(cd_21) != 0) {
            CobolDisplay.display("CD-18 <> CD-21");
        }
        if (cd_19.compareTo(cd_20) != 0) {
            CobolDisplay.display("CD-19 <> CD-20");
        }
        if (cd_20.compareTo(cd_19) != 0) {
            CobolDisplay.display("CD-20 <> CD-19");
        }
        if (cd_21.compareTo(cd_18) != 0) {
            CobolDisplay.display("CD-21 <> CD-18");
        }
        if (cd_22.compareTo(cd_17) != 0) {
            CobolDisplay.display("CD-22 <> CD-17");
        }
        if (cd_23.compareTo(cd_16) != 0) {
            CobolDisplay.display("CD-23 <> CD-16");
        }
        if (cd_24.compareTo(cd_15) != 0) {
            CobolDisplay.display("CD-24 <> CD-15");
        }
        if (cd_25.compareTo(cd_14) != 0) {
            CobolDisplay.display("CD-25 <> CD-14");
        }
        if (cd_26.compareTo(cd_13) != 0) {
            CobolDisplay.display("CD-26 <> CD-13");
        }
        if (cd_27.compareTo(cd_12) != 0) {
            CobolDisplay.display("CD-27 <> CD-12");
        }
        if (cd_28.compareTo(cd_11) != 0) {
            CobolDisplay.display("CD-28 <> CD-11");
        }
        if (cd_29.compareTo(cd_10) != 0) {
            CobolDisplay.display("CD-29 <> CD-10");
        }
        if (cd_30.compareTo(cd_09) != 0) {
            CobolDisplay.display("CD-30 <> CD-09");
        }
        if (cd_31.compareTo(cd_08) != 0) {
            CobolDisplay.display("CD-31 <> CD-08");
        }
        if (cd_32.compareTo(cd_07) != 0) {
            CobolDisplay.display("CD-32 <> CD-07");
        }
        if (cd_33.compareTo(cd_06) != 0) {
            CobolDisplay.display("CD-33 <> CD-06");
        }
        if (cd_34.compareTo(cd_05) != 0) {
            CobolDisplay.display("CD-34 <> CD-05");
        }
    }
    private void do_check_part1() {
        if (cd_35.compareTo(cd_04) != 0) {
            CobolDisplay.display("CD-35 <> CD-04");
        }
        if (cd_36.compareTo(cd_03) != 0) {
            CobolDisplay.display("CD-36 <> CD-03");
        }
        /* RAW: * SETTING UP DATA FOR COMPARE */
    }

    private void pz_01_x() {
        pz_02_x.set(String.valueOf("\u0000"));
        pz_02_x.setRefMod(20, 1, String.valueOf("0C"));
        pz_03_x.set(String.valueOf("\u0000"));
        pz_03_x.setRefMod(20, 1, String.valueOf("0D"));
        pz_04_x.set(String.valueOf("\u0000"));
        pz_04_x.setRefMod(1, 1, String.valueOf("01"));
        pz_04_x.setRefMod(20, 1, String.valueOf("0D"));
        pz_05_x.set(String.valueOf("\u0000"));
        pz_05_x.setRefMod(19, 2, String.valueOf("010D"));
        pz_06_x.set(String.valueOf("\u0000"));
        pz_06_x.setRefMod(20, 1, String.valueOf("1D"));
        if (!String.valueOf(pz_01).equals(String.valueOf(pz_02))) {
            CobolDisplay.display("PZ-01 <> PZ-02");
        }
        if (!String.valueOf(pz_01).equals(String.valueOf(pz_03))) {
            CobolDisplay.display("PZ-01 <> PZ-03");
        }
        if (!String.valueOf(pz_02).equals(String.valueOf(pz_03))) {
            CobolDisplay.display("PZ-02 <> PZ-03");
        }
        if (String.valueOf(pz_02).compareTo(String.valueOf(pz_04)) <= 0) {
            CobolDisplay.display("PZ-02 <= PZ-04");
        }
        if (String.valueOf(pz_02).compareTo(String.valueOf(pz_05)) <= 0) {
            CobolDisplay.display("PZ-02 <= PZ-05");
        }
        if (String.valueOf(pz_02).compareTo(String.valueOf(pz_06)) <= 0) {
            CobolDisplay.display("PZ-02 <= PZ-05");
        }
        /* RAW: *  */
        if (!String.valueOf(u4_32d).equals(String.valueOf(up_32d))) {
            CobolDisplay.display("U4-32D <> UP-32D");
        }
        if (!String.valueOf(u4_32d).equals(String.valueOf(sp_32d))) {
            CobolDisplay.display("U4-32D <> SP-32D");
        }
        if (String.valueOf(u4_32d).compareTo(String.valueOf(np_32d)) <= 0) {
            CobolDisplay.display("U4-32D <= NP-32D");
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked015Comp3VsComp6BcdComparison().run();
    }
}
