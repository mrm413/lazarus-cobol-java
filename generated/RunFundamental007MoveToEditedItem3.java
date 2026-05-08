package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental007MoveToEditedItem3 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "DisplayToAlphaEdited";
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
    private int src_field = 0;
    private CobolString dst_field_1 = new CobolString(7);
    private CobolString dst_field_2 = new CobolString(7);
    private CobolString dst_field_3 = new CobolString(7);
    private CobolString dst_field_4 = new CobolString(7);
    private CobolString dst_field_5 = new CobolString(7);
    private CobolString dst_field_6 = new CobolString(7);
    private CobolString dst_field_7 = new CobolString(7);
    private CobolString dst_field_8 = new CobolString(7);
    private CobolString dst_field_9 = new CobolString(7);
    private CobolString dst_field_10 = new CobolString(7);
    private CobolString dst_field_11 = new CobolString(3);
    private CobolString dst_field_12 = new CobolString(3);
    private CobolString dst_field_13 = new CobolString(3, CobolDisplay.formatEdited(0, "/99"));
    private CobolString dst_field_14 = new CobolString(3, CobolDisplay.formatEdited(0, "990"));
    private CobolString dst_field_15 = new CobolString(3);
    private CobolString dst_field_16 = new CobolString(3);
    private static final String expt_field_1 = "0123456";
    private static final String expt_field_2 = " 123456";
    private static final String expt_field_3 = "/123456";
    private static final String expt_field_4 = "1234560";
    private static final String expt_field_5 = "123456 ";
    private static final String expt_field_6 = "123456/";
    private static final String expt_field_7 = "1230456";
    private static final String expt_field_8 = "123 456";
    private static final String expt_field_9 = "123/456";
    private static final String expt_field_10 = "1 02 0/";
    private static final String expt_field_11 = "012";
    private static final String expt_field_12 = " 12";
    private static final String expt_field_13 = "/00";
    private static final String expt_field_14 = "560";
    private static final String expt_field_15 = "12 ";
    private static final String expt_field_16 = "12/";

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(110);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_field = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SRC-FIELD").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(41, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-6").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_7 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(48, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-7").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_8 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(55, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-8").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(62, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-9").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_10 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(69, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-10").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_11 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(76, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-11").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_12 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(79, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-12").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_13 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(82, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DST-FIELD-13").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_14 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(85, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DST-FIELD-14").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_15 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(88, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-15").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst_field_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(91, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DST-FIELD-16").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(94, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(95, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(96, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(97, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(98, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(99, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-6").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_7 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-7").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_8 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(101, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-8").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(102, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-9").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_10 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(103, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-10").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_11 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(104, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-11").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_12 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(105, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-12").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_13 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(106, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-13").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_14 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(107, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-14").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_15 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(108, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-15").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_expt_field_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(109, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPT-FIELD-16").build();


    private void test_runner() {
        dst_field_1.set(CobolDisplay.formatEdited("123456", "0XXXXXX"));
        dst_field_2.set(CobolDisplay.formatEdited("123456", "BXXXXXX"));
        dst_field_3.set(CobolDisplay.formatEdited("123456", "/XXXXXX"));
        dst_field_4.set(CobolDisplay.formatEdited("123456", "XXXXXX0"));
        dst_field_5.set(CobolDisplay.formatEdited("123456", "XXXXXXB"));
        dst_field_6.set(CobolDisplay.formatEdited("123456", "XXXXXX/"));
        dst_field_7.set(CobolDisplay.formatEdited("123456", "XXX0XXX"));
        dst_field_8.set(CobolDisplay.formatEdited("123456", "XXXBXXX"));
        dst_field_9.set(CobolDisplay.formatEdited("123456", "XXX/XXX"));
        dst_field_10.set(CobolDisplay.formatEdited("123456", "XB0XB0/"));
        dst_field_11.set(CobolDisplay.formatEdited("123456", "0AA"));
        dst_field_12.set(CobolDisplay.formatEdited("123456", "BXA"));
        dst_field_12.set(CobolDisplay.formatEdited("123456", "BXA"));
        dst_field_14.set(CobolDisplay.formatEdited("123456", "990"));
        dst_field_15.set(CobolDisplay.formatEdited("123456", "XAB"));
        dst_field_16.set(CobolDisplay.formatEdited("123456", "XA/"));
        src_field = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal("123456"), 6));
        do_test();
        dst_field_1.set(CobolDisplay.formatEdited(src_field, "0XXXXXX"));
        dst_field_2.set(CobolDisplay.formatEdited(src_field, "BXXXXXX"));
        dst_field_3.set(CobolDisplay.formatEdited(src_field, "/XXXXXX"));
        dst_field_4.set(CobolDisplay.formatEdited(src_field, "XXXXXX0"));
        dst_field_5.set(CobolDisplay.formatEdited(src_field, "XXXXXXB"));
        dst_field_6.set(CobolDisplay.formatEdited(src_field, "XXXXXX/"));
        dst_field_7.set(CobolDisplay.formatEdited(src_field, "XXX0XXX"));
        dst_field_8.set(CobolDisplay.formatEdited(src_field, "XXXBXXX"));
        dst_field_9.set(CobolDisplay.formatEdited(src_field, "XXX/XXX"));
        dst_field_10.set(CobolDisplay.formatEdited(src_field, "XB0XB0/"));
        dst_field_11.set(CobolDisplay.formatEdited(src_field, "0AA"));
        dst_field_12.set(CobolDisplay.formatEdited(src_field, "BXA"));
        dst_field_12.set(CobolDisplay.formatEdited(src_field, "BXA"));
        dst_field_14.set(CobolDisplay.formatEdited(src_field, "990"));
        dst_field_15.set(CobolDisplay.formatEdited(src_field, "XAB"));
        dst_field_16.set(CobolDisplay.formatEdited(src_field, "XA/"));
        do_test();
        return;
    }

    private void do_test() {
        if (!CobolString.cobolEquals(String.valueOf(dst_field_1), String.valueOf(expt_field_1))) {
            CobolDisplay.display("1: <" + String.valueOf(dst_field_1) + "> != <" + String.valueOf(expt_field_1) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_2), String.valueOf(expt_field_2))) {
            CobolDisplay.display("2: <" + String.valueOf(dst_field_2) + "> != <" + String.valueOf(expt_field_2) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_3), String.valueOf(expt_field_3))) {
            CobolDisplay.display("3: <" + String.valueOf(dst_field_3) + "> != <" + String.valueOf(expt_field_3) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_4), String.valueOf(expt_field_4))) {
            CobolDisplay.display("4: <" + String.valueOf(dst_field_4) + "> != <" + String.valueOf(expt_field_4) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_5), String.valueOf(expt_field_5))) {
            CobolDisplay.display("5: <" + String.valueOf(dst_field_5) + "> != <" + String.valueOf(expt_field_5) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_6), String.valueOf(expt_field_6))) {
            CobolDisplay.display("6: <" + String.valueOf(dst_field_6) + "> != <" + String.valueOf(expt_field_6) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_7), String.valueOf(expt_field_7))) {
            CobolDisplay.display("7: <" + String.valueOf(dst_field_7) + "> != <" + String.valueOf(expt_field_7) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_8), String.valueOf(expt_field_8))) {
            CobolDisplay.display("8: <" + String.valueOf(dst_field_8) + "> != <" + String.valueOf(expt_field_8) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_9), String.valueOf(expt_field_9))) {
            CobolDisplay.display("9: <" + String.valueOf(dst_field_9) + "> != <" + String.valueOf(expt_field_9) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_10), String.valueOf(expt_field_10))) {
            CobolDisplay.display("10: <" + String.valueOf(dst_field_10) + "> != <" + String.valueOf(expt_field_10) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_11), String.valueOf(expt_field_11))) {
            CobolDisplay.display("11: <" + String.valueOf(dst_field_11) + "> != <" + String.valueOf(expt_field_11) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_12), String.valueOf(expt_field_12))) {
            CobolDisplay.display("12: <" + String.valueOf(dst_field_12) + "> != <" + String.valueOf(expt_field_12) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_13), String.valueOf(expt_field_13))) {
            CobolDisplay.display("13: <" + String.valueOf(dst_field_13) + "> != <" + String.valueOf(expt_field_13) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_14), String.valueOf(expt_field_14))) {
            CobolDisplay.display("14: <" + String.valueOf(dst_field_14) + "> != <" + String.valueOf(expt_field_14) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_15), String.valueOf(expt_field_15))) {
            CobolDisplay.display("15: <" + String.valueOf(dst_field_15) + "> != <" + String.valueOf(expt_field_15) + ">");
        }
        if (!CobolString.cobolEquals(String.valueOf(dst_field_16), String.valueOf(expt_field_16))) {
            CobolDisplay.display("16: <" + String.valueOf(dst_field_16) + "> != <" + String.valueOf(expt_field_16) + ">");
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("DisplayToAlphaEdited", "", "DisplayToAlphaEdited.cob");
        CobolProgram.pushActive("DisplayToAlphaEdited");
        try {
            CobolProgram.registerCallAlias("DisplayToAlphaEdited", "RunFundamental007MoveToEditedItem3");
            CobolProgram.registerCallAlias("displaytoalphaedited", "RunFundamental007MoveToEditedItem3");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            test_runner();
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
        new RunFundamental007MoveToEditedItem3().run();
    }
}
