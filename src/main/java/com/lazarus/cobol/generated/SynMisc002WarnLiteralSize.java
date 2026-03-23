package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc002WarnLiteralSize extends CobolProgram {
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
    private int ws_line_number = 0;
    private int ws_number = 0;
    private CobolString ws_text = new CobolString(5);
    private int pic_9_signed = 0;
    private BigDecimal pic_9_signed_decimal = BigDecimal.ZERO;
    private int pic_9_not_signed = 0;
    private int pic_9_not_decimal = 0;
    private int xx = 0;
    private int pic_9_decimal = 0;
    private int compute_1 = 0;
    private CobolString group_item_x6 = new CobolString(1); // Group: GROUP-ITEM-X6
    private static final String const1 = "CAT     ";
    private CobolString const2 = new CobolString(1);
    private int if_d16 = 0;


    private CobolString cb_continue = new CobolString(256);

    private void para_main() {
        if (String.valueOf(group_item_x6).equals(String.valueOf("1234567"))) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal == 1.1) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal == 1) {
            /* CONTINUE */
        }
        if (pic_9_decimal == 1.01) {
            /* CONTINUE */
        }
        if (pic_9_decimal == 1.1) {
            /* CONTINUE */
        }
        if (pic_9_signed != 11) {
            /* CONTINUE */
        }
        if (pic_9_not_signed < 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed < Integer.parseInt(String.valueOf(0).trim())) {
            /* CONTINUE */
        }
        if (pic_9_not_signed < ((25 - 50))) {
            /* CONTINUE */
        }
        if (pic_9_decimal == ((2.24 / 2))) {
            /* CONTINUE */
        }
        if (String.valueOf(pic_9_not_decimal).equals(String.valueOf("123"))) {
            /* CONTINUE */
        }
        if (String.valueOf(pic_9_not_decimal).equals(String.valueOf("1B0"))) {
            /* CONTINUE */
        }
        if (String.valueOf(CobolString.refMod(pic_9_not_decimal, 1, 3)).equals(String.valueOf("1B0"))) {
            /* CONTINUE */
        }
        if (!String.valueOf(CobolString.refMod(pic_9_not_decimal, 1, 3)).equals(String.valueOf("Hot Doggy"))) {
            /* CONTINUE */
        }
        if (!String.valueOf(CobolString.refMod(pic_9_not_decimal, 1, xx)).equals(String.valueOf("Hi"))) {
            /* CONTINUE */
        }
        if (ws_line_number > Integer.parseInt(String.valueOf("123").trim())) {
            /* CONTINUE */
        }
        if (String.valueOf(ws_text).compareTo(String.valueOf("DOGGY")) > 0) {
            /* CONTINUE */
        }
        if (ws_number > 123.999) {
            /* CONTINUE */
        }
        if (ws_line_number > 2345) {
            /* CONTINUE */
        }
        if (ws_line_number <= 1234) {
            /* CONTINUE */
        }
        if (ws_line_number > Integer.parseInt(String.valueOf("1234").trim())) {
            /* CONTINUE */
        }
        if (5432 < ws_line_number) {
            /* CONTINUE */
        }
        if (7855 >= ws_line_number) {
            /* CONTINUE */
        }
        if (1234 < ws_line_number) {
            /* CONTINUE */
        }
        if (5432 >= ws_line_number) {
            /* CONTINUE */
        }
        if (String.valueOf(ws_text).compareTo(String.valueOf("DOGGY++")) > 0) {
            /* CONTINUE */
        }
        if (Integer.parseInt(String.valueOf(ws_text).trim()) > 3141596) {
            /* CONTINUE */
        }
        if (Integer.parseInt(String.valueOf(ws_text).trim()) > 3.141596) {
            /* CONTINUE */
        }
        if (String.valueOf(ws_text).equals(String.valueOf(3.141596))) {
            /* CONTINUE */
        }
        if (!String.valueOf("DOG+CAT").equals(String.valueOf(ws_text))) {
            /* CONTINUE */
        }
        if (String.valueOf(ws_text).equals(String.valueOf("CAT+DOG"))) {
            /* CONTINUE */
        }
        if (!"DOG+CAT".isEmpty()) {
            /* RAW: = WS-TEXT */
            /* CONTINUE */
        } else if (!String.valueOf(const1).trim().isEmpty()) {
            /* RAW: = 'CAT+DOG' */
            /* CONTINUE */
        } else if (!String.valueOf(const1).trim().isEmpty()) {
            /* RAW: = 'CAT' */
            /* CONTINUE */
        } else if (!String.valueOf(const2).trim().isEmpty()) {
            /* RAW: = 1234 */
            /* CONTINUE */
        }
        if (ws_line_number > 234) {
            /* CONTINUE */
        }
        if (String.valueOf(ws_text).equals(String.valueOf("CAT         "))) {
            /* CONTINUE */
        }
        if ((compute_1 < 654.20038 && compute_1 > 654.17422)) {
            /* CONTINUE */
        }
        if (compute_1 < 5654.2) {
            /* CONTINUE */
        }
        if (compute_1 > 5654.2) {
            /* CONTINUE */
        }
        if (compute_1 < 5654.2) {
            /* CONTINUE */
        }
        if (compute_1 > 5654.2) {
            /* CONTINUE */
        }
        if (5654.2 > compute_1) {
            /* CONTINUE */
        }
        if (5654.2 < compute_1) {
            /* CONTINUE */
        }
        if (5654.2 > compute_1) {
            /* CONTINUE */
        }
        if (5654.2 < compute_1) {
            /* CONTINUE */
        }
        if (CobolIntrinsics.isPositive(if_d16)) {
            /* CONTINUE */
        }
        if (!CobolIntrinsics.isPositive(if_d16)) {
            /* CONTINUE */
        }
        if (CobolIntrinsics.isNegative(if_d16)) {
            /* CONTINUE */
        }
        if (!CobolIntrinsics.isNegative(if_d16)) {
            /* CONTINUE */
        }
        if (pic_9_not_signed > ((25 - 50))) {
            /* CONTINUE */
        }
        if (pic_9_not_signed >= -1) {
            /* CONTINUE */
        }
        if (pic_9_not_signed >= -0.1) {
            /* CONTINUE */
        }
        if (pic_9_not_signed > 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed > 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed > Integer.parseInt(String.valueOf(0).trim())) {
            /* CONTINUE */
        }
        if (pic_9_not_signed >= 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed >= 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed >= Integer.parseInt(String.valueOf(0).trim())) {
            /* CONTINUE */
        }
        if (String.valueOf(CobolString.refMod(group_item_x6, 1, 6)).equals(String.valueOf("123456"))) {
            /* CONTINUE */
        }
        /* RAW: * Both have correct error check */
    }

    private void syn_refmod() {
        /* RAW: at * */
        if (String.valueOf(CobolString.refMod(group_item_x6, 2, 6)).equals(String.valueOf((0 /* non-numeric literal: 123456 */ * Integer.parseInt(String.valueOf(cb_continue).trim()))))) {
        }
        /* RAW: *  */
        if (String.valueOf(CobolString.refMod(group_item_x6, ws_line_number, 7)).equals(String.valueOf((0 /* non-numeric literal: 123456 */ * Integer.parseInt(String.valueOf(cb_continue).trim()))))) {
        }
        if (String.valueOf(CobolString.refMod(group_item_x6, 1, 5)).equals(String.valueOf("123456"))) {
            /* CONTINUE */
        }
        if (String.valueOf(CobolString.refMod(group_item_x6, 3)).equals(String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (String.valueOf(CobolString.refMod(group_item_x6, 3, ws_line_number)).equals(String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (String.valueOf(CobolString.refMod(group_item_x6, ws_line_number, 3)).equals(String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (String.valueOf(CobolString.refMod(group_item_x6, ws_line_number, ws_line_number)).equals(String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (String.valueOf(CobolString.refMod(group_item_x6, ws_line_number)).equals(String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal > 9) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal > 9) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal > 900) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal > 909) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal > 999) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal > 999) {
            /* CONTINUE */
        }
        if (pic_9_decimal > 999) {
            /* CONTINUE */
        }
        if (pic_9_decimal > 990.9) {
            /* CONTINUE */
        }
        if (pic_9_decimal > 999.9) {
            /* CONTINUE */
        }
        if (pic_9_decimal > 999.9) {
            /* CONTINUE */
        }
        if (pic_9_decimal > -999.9) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal(String.valueOf(99.99).trim())) > 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal(String.valueOf(99.99).trim())) >= 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal(String.valueOf(-99.99).trim())) < 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal(String.valueOf(-99.99).trim())) <= 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal(String.valueOf(-99.991).trim())) <= 0) {
            /* CONTINUE */
        }
        if (99 > xx) {
            /* CONTINUE */
        }
        if (xx >= 99) {
            /* CONTINUE */
        }
        if (!(xx < 99)) {
            /* CONTINUE */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc002WarnLiteralSize().run();
    }
}
