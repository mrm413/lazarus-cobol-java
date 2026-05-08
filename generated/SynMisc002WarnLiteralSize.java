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
    public static final String COBOL_PROGRAM_ID = "prog";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
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
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    // WORKING-STORAGE SECTION
    private int ws_line_number = 0;
    private BigDecimal ws_number = BigDecimal.ZERO;
    private CobolString ws_text = new CobolString(5, "CAT");
    private int pic_9_signed = 5;
    private BigDecimal pic_9_signed_decimal = new BigDecimal("5");
    private int pic_9_not_signed = 5;
    private int pic_9_not_decimal = 5;
    private int xx = 2;
    private BigDecimal pic_9_decimal = new BigDecimal("5");
    private BigDecimal compute_1 = new BigDecimal("654.1873");
    private CobolString group_item_x6 = new CobolString(6, "CAT   "); // Group: GROUP-ITEM-X6
    private CobolString filler_1 = new CobolString(6, "CAT");
    private static final String const1 = "CAT     ";
    private static final int const2 = 1234;
    private BigDecimal if_d16 = new BigDecimal(".0012");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(47);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_line_number = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-LINE-NUMBER").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_number = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-NUMBER").picDigits(5).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_text = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-TEXT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pic_9_signed = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("PIC-9-SIGNED").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pic_9_signed_decimal = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("PIC-9-SIGNED-DECIMAL").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pic_9_not_signed = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("PIC-9-NOT-SIGNED").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pic_9_not_decimal = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("PIC-9-NOT-DECIMAL").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("XX").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pic_9_decimal = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("PIC-9-DECIMAL").picDigits(4).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_compute_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("COMPUTE-1").picDigits(7).picScale(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_group_item_x6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(38, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GROUP-ITEM-X6").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(38, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_const2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(44, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("CONST2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_if_d16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(45, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("IF-D16").picDigits(2).picScale(2).build();


    private void para_main() {
        if (CobolString.cobolEquals(String.valueOf(group_item_x6), String.valueOf("1234567"))) {
            /* CONTINUE */
        }
        if (CobolIntrinsics.toBigDecimal(pic_9_not_decimal).compareTo(new BigDecimal("1.1")) == 0) {
            /* CONTINUE */
        }
        if (pic_9_not_decimal == 1) {
            /* CONTINUE */
        }
        if (pic_9_decimal.compareTo(new BigDecimal("1.01")) == 0) {
            /* CONTINUE */
        }
        if (pic_9_decimal.compareTo(new BigDecimal("1.100")) == 0) {
            /* CONTINUE */
        }
        if (pic_9_signed != 11) {
            /* CONTINUE */
        }
        if (pic_9_not_signed < 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed < 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed < ((25 - 50))) {
            /* CONTINUE */
        }
        if (pic_9_decimal.compareTo((new BigDecimal("2.24").divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP))) == 0) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(pic_9_not_decimal, 3, 0), String.valueOf("123"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(pic_9_not_decimal, 3, 0), String.valueOf("1B0"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(CobolString.refMod(CobolDisplay.formatPic(pic_9_not_decimal, 3, 0, false), 1, 3), 3, 0), String.valueOf("1B0"))) {
            /* CONTINUE */
        }
        if (!(CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(CobolString.refMod(CobolDisplay.formatPic(pic_9_not_decimal, 3, 0, false), 1, 3), 3, 0), String.valueOf("Hot Doggy")))) {
            /* CONTINUE */
        }
        if (!(CobolString.cobolEquals(CobolDisplay.formatPicUnsigned(CobolString.refMod(CobolDisplay.formatPic(pic_9_not_decimal, 3, 0, false), 1, xx), 3, 0), String.valueOf("Hi")))) {
            /* CONTINUE */
        }
        if (ws_line_number > Integer.parseInt(String.valueOf("123").trim())) {
            /* CONTINUE */
        }
        if (CobolString.cobolCompare(String.valueOf(ws_text), String.valueOf("DOGGY")) > 0) {
            /* CONTINUE */
        }
        if (ws_number.compareTo(new BigDecimal("123.999")) > 0) {
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
        if (CobolString.cobolCompare(String.valueOf(ws_text), String.valueOf("DOGGY++")) > 0) {
            /* CONTINUE */
        }
        if (Integer.parseInt(String.valueOf(ws_text).trim()) > 3141596) {
            /* CONTINUE */
        }
        if (CobolIntrinsics.toBigDecimal(ws_text).compareTo(new BigDecimal("3.141596")) > 0) {
            /* CONTINUE */
        }
        if (CobolIntrinsics.toBigDecimal(ws_text).compareTo(new BigDecimal("3.141596")) == 0) {
            /* CONTINUE */
        }
        if (!CobolString.cobolEquals(String.valueOf("DOG+CAT"), String.valueOf(ws_text))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(ws_text), String.valueOf("CAT+DOG"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf("DOG+CAT"), String.valueOf(ws_text))) {
            /* CONTINUE */
        } else if (CobolString.cobolEquals(String.valueOf(const1), String.valueOf("CAT+DOG"))) {
            /* CONTINUE */
        } else if (CobolString.cobolEquals(String.valueOf(const1), String.valueOf("CAT"))) {
            /* CONTINUE */
        } else if (const2 == 1234) {
            /* CONTINUE */
        }
        if (ws_line_number > 234) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(ws_text), String.valueOf("CAT         "))) {
            /* CONTINUE */
        }
        if ((compute_1.compareTo(new BigDecimal("654.20038")) < 0 && compute_1.compareTo(new BigDecimal("654.17422")) > 0)) {
            /* CONTINUE */
        }
        if (compute_1.compareTo(new BigDecimal("5654.20")) < 0) {
            /* CONTINUE */
        }
        if (compute_1.compareTo(new BigDecimal("5654.20")) > 0) {
            /* CONTINUE */
        }
        if (compute_1.compareTo(new BigDecimal("05654.20")) < 0) {
            /* CONTINUE */
        }
        if (compute_1.compareTo(new BigDecimal("05654.20")) > 0) {
            /* CONTINUE */
        }
        if (new BigDecimal("5654.20").compareTo(compute_1) > 0) {
            /* CONTINUE */
        }
        if (new BigDecimal("5654.20").compareTo(compute_1) < 0) {
            /* CONTINUE */
        }
        if (new BigDecimal("05654.20").compareTo(compute_1) > 0) {
            /* CONTINUE */
        }
        if (new BigDecimal("05654.20").compareTo(compute_1) < 0) {
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
        if (CobolIntrinsics.toBigDecimal(pic_9_not_signed).compareTo(new BigDecimal("-.1")) >= 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed > 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed > 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed > 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed >= 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed >= 0) {
            /* CONTINUE */
        }
        if (pic_9_not_signed >= 0) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(CobolString.refMod(group_item_x6, 1, 6)), String.valueOf("123456"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(CobolString.refMod(group_item_x6, 1, 5)), String.valueOf("123456"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(CobolString.refMod(group_item_x6, 3)), String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(CobolString.refMod(group_item_x6, 3, ws_line_number)), String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(CobolString.refMod(group_item_x6, ws_line_number, 3)), String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(CobolString.refMod(group_item_x6, ws_line_number, ws_line_number)), String.valueOf("12345"))) {
            /* CONTINUE */
        }
        if (CobolString.cobolEquals(String.valueOf(CobolString.refMod(group_item_x6, ws_line_number)), String.valueOf("12345"))) {
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
        if (pic_9_decimal.compareTo(CobolIntrinsics.toBigDecimal(999)) > 0) {
            /* CONTINUE */
        }
        if (pic_9_decimal.compareTo(new BigDecimal("990.9")) > 0) {
            /* CONTINUE */
        }
        if (pic_9_decimal.compareTo(new BigDecimal("999.9")) > 0) {
            /* CONTINUE */
        }
        if (pic_9_decimal.compareTo(new BigDecimal("0999.90")) > 0) {
            /* CONTINUE */
        }
        if (pic_9_decimal.compareTo(new BigDecimal("-0999.90")) > 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal("99.99")) > 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal("99.99")) >= 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal("-99.99")) < 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal("-099.990")) <= 0) {
            /* CONTINUE */
        }
        if (pic_9_signed_decimal.compareTo(new BigDecimal("-099.991")) <= 0) {
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
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynMisc002WarnLiteralSize");
            CobolProgram.registerCallAlias("prog", "SynMisc002WarnLiteralSize");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new SynMisc002WarnLiteralSize().run();
    }
}
