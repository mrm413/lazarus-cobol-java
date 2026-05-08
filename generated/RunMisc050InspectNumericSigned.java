package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc050InspectNumericSigned extends CobolProgram {
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
    private CobolString separate1 = new CobolString(3, "-11");
    private CobolString separate2 = new CobolString(3, "+11");
    private CobolString tseparate1 = new CobolString(3, "11-");
    private CobolString tseparate2 = new CobolString(3, "11+");
    private int nseparate1 = -11;
    private int nseparate2 = 11;
    private int trailing1 = -11;
    private int trailing2 = 11;
    private int cnt = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(17);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_separate1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.SIGN_TRAILING_SEPARATE).name("SEPARATE1").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_separate2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.SIGN_TRAILING_SEPARATE).name("SEPARATE2").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tseparate1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.SIGN_TRAILING_SEPARATE).name("TSEPARATE1").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tseparate2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.SIGN_TRAILING_SEPARATE).name("TSEPARATE2").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_nseparate1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("NSEPARATE1").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_nseparate2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("NSEPARATE2").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_trailing1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TRAILING1").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_trailing2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TRAILING2").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CNT").build();


    private void para_main() {
        cnt = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        cnt += CobolIntrinsics.inspectTallyAll(String.valueOf(separate1), "1");
        if (cnt != 2) {
            CobolDisplay.display("T1 - " + CobolDisplay.formatPic(cnt, 10, 0, true, "LEADING"));
        }
        cnt = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        cnt += CobolIntrinsics.inspectTallyAll(String.valueOf(separate2), "1");
        if (cnt != 2) {
            CobolDisplay.display("T2 - " + CobolDisplay.formatPic(cnt, 10, 0, true, "LEADING"));
        }
        cnt = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        cnt += CobolIntrinsics.inspectTallyAll(String.valueOf(tseparate1), "1");
        if (cnt != 2) {
            CobolDisplay.display("T3 - " + CobolDisplay.formatPic(cnt, 10, 0, true, "LEADING"));
        }
        cnt = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        cnt += CobolIntrinsics.inspectTallyAll(String.valueOf(tseparate2), "1");
        if (cnt != 2) {
            CobolDisplay.display("T4 - " + CobolDisplay.formatPic(cnt, 10, 0, true, "LEADING"));
        }
        cnt = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        cnt += CobolIntrinsics.inspectTallyAll(String.valueOf(nseparate1), "1");
        if (cnt != 2) {
            CobolDisplay.display("T5 - " + CobolDisplay.formatPic(cnt, 10, 0, true, "LEADING"));
        }
        cnt = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        cnt += CobolIntrinsics.inspectTallyAll(String.valueOf(nseparate2), "1");
        if (cnt != 2) {
            CobolDisplay.display("T6 - " + CobolDisplay.formatPic(cnt, 10, 0, true, "LEADING"));
        }
        cnt = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        cnt += CobolIntrinsics.inspectTallyAll(String.valueOf(trailing1), "1");
        if (cnt != 2) {
            CobolDisplay.display("T7 - " + CobolDisplay.formatPic(cnt, 10, 0, true, "LEADING"));
        }
        cnt = (int) CobolIntrinsics.toBigDecimal(0).intValue();
        cnt += CobolIntrinsics.inspectTallyAll(String.valueOf(trailing2), "1");
        if (cnt != 2) {
            CobolDisplay.display("T8 - " + CobolDisplay.formatPic(cnt, 10, 0, true, "LEADING"));
        }
        separate1.set(CobolIntrinsics.inspectConverting(String.valueOf(separate1), "123", "234"));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(separate1).trim()).compareTo(CobolIntrinsics.toBigDecimal(-22)) != 0) {
            CobolDisplay.display("C1 - " + String.valueOf(separate1));
            separate1.set(CobolIntrinsics.formatSignSeparate(-22, 2, true));
        }
        separate2.set(CobolIntrinsics.inspectConverting(String.valueOf(separate2), "123", "234"));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(separate2).trim()).compareTo(CobolIntrinsics.toBigDecimal(22)) != 0) {
            CobolDisplay.display("C2 - " + String.valueOf(separate2));
            separate2.set(CobolIntrinsics.formatSignSeparate(22, 2, true));
        }
        tseparate1.set(CobolIntrinsics.inspectConverting(String.valueOf(tseparate1), "123", "234"));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(tseparate1).trim()).compareTo(CobolIntrinsics.toBigDecimal(-22)) != 0) {
            CobolDisplay.display("C3 - " + String.valueOf(tseparate1));
            tseparate1.set(CobolIntrinsics.formatSignSeparate(-22, 2, false));
        }
        tseparate2.set(CobolIntrinsics.inspectConverting(String.valueOf(tseparate2), "123", "234"));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(tseparate2).trim()).compareTo(CobolIntrinsics.toBigDecimal(22)) != 0) {
            CobolDisplay.display("C4 - " + String.valueOf(tseparate2));
            tseparate2.set(CobolIntrinsics.formatSignSeparate(22, 2, false));
        }
        nseparate1 = CobolIntrinsics.toBigDecimal(CobolIntrinsics.inspectConverting(String.valueOf(nseparate1), "123", "234")).intValue();
        if (nseparate1 != -22) {
            CobolDisplay.display("C5 - " + CobolDisplay.formatPic(nseparate1, 2, 0, true, "LEADING"));
            nseparate1 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-22), 2);
        }
        nseparate2 = CobolIntrinsics.toBigDecimal(CobolIntrinsics.inspectConverting(String.valueOf(nseparate2), "123", "234")).intValue();
        if (nseparate2 != 22) {
            CobolDisplay.display("C6 - " + CobolDisplay.formatPic(nseparate2, 2, 0, true, "LEADING"));
            nseparate2 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(22), 2);
        }
        trailing1 = CobolIntrinsics.toBigDecimal(CobolIntrinsics.inspectConverting(String.valueOf(trailing1), "123", "234")).intValue();
        if (trailing1 != -22) {
            CobolDisplay.display("C7 - " + CobolDisplay.formatPic(trailing1, 2, 0, true, "LEADING"));
            trailing1 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-22), 2);
        }
        trailing2 = CobolIntrinsics.toBigDecimal(CobolIntrinsics.inspectConverting(String.valueOf(trailing2), "123", "234")).intValue();
        if (trailing2 != 22) {
            CobolDisplay.display("C8 - " + CobolDisplay.formatPic(trailing2, 2, 0, true, "LEADING"));
            trailing2 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(22), 2);
        }
        separate1.set(CobolIntrinsics.inspectReplaceAllMulti(String.valueOf(separate1), new String[]{"1", "2", "3"}, new String[]{"2", "3", "4"}));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(separate1).trim()).compareTo(CobolIntrinsics.toBigDecimal(-33)) != 0) {
            CobolDisplay.display("R1 - " + String.valueOf(separate1));
            separate1.set(CobolIntrinsics.formatSignSeparate(-33, 2, true));
        }
        separate2.set(CobolIntrinsics.inspectReplaceAllMulti(String.valueOf(separate2), new String[]{"1", "2", "3"}, new String[]{"2", "3", "4"}));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(separate2).trim()).compareTo(CobolIntrinsics.toBigDecimal(33)) != 0) {
            CobolDisplay.display("R2 - " + String.valueOf(separate2));
            separate2.set(CobolIntrinsics.formatSignSeparate(33, 2, true));
        }
        tseparate1.set(CobolIntrinsics.inspectReplaceAllMulti(String.valueOf(tseparate1), new String[]{"1", "2", "3"}, new String[]{"2", "3", "4"}));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(tseparate1).trim()).compareTo(CobolIntrinsics.toBigDecimal(-33)) != 0) {
            CobolDisplay.display("R3 - " + String.valueOf(tseparate1));
            tseparate1.set(CobolIntrinsics.formatSignSeparate(-33, 2, false));
        }
        tseparate2.set(CobolIntrinsics.inspectReplaceAllMulti(String.valueOf(tseparate2), new String[]{"1", "2", "3"}, new String[]{"2", "3", "4"}));
        if (CobolIntrinsics.toBigDecimal(String.valueOf(tseparate2).trim()).compareTo(CobolIntrinsics.toBigDecimal(33)) != 0) {
            CobolDisplay.display("R4 - " + String.valueOf(tseparate2));
            tseparate2.set(CobolIntrinsics.formatSignSeparate(33, 2, false));
        }
        nseparate1 = CobolIntrinsics.toBigDecimal(CobolIntrinsics.inspectReplaceAllMulti(String.valueOf(nseparate1), new String[]{"1", "2", "3"}, new String[]{"2", "3", "4"})).intValue();
        if (nseparate1 != -33) {
            CobolDisplay.display("R5 - " + CobolDisplay.formatPic(nseparate1, 2, 0, true, "LEADING"));
            nseparate1 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-33), 2);
        }
        nseparate2 = CobolIntrinsics.toBigDecimal(CobolIntrinsics.inspectReplaceAllMulti(String.valueOf(nseparate2), new String[]{"1", "2", "3"}, new String[]{"2", "3", "4"})).intValue();
        if (nseparate2 != 33) {
            CobolDisplay.display("R6 - " + CobolDisplay.formatPic(nseparate2, 2, 0, true, "LEADING"));
            nseparate2 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(33), 2);
        }
        trailing1 = CobolIntrinsics.toBigDecimal(CobolIntrinsics.inspectReplaceAllMulti(String.valueOf(trailing1), new String[]{"1", "2", "3"}, new String[]{"2", "3", "4"})).intValue();
        if (trailing1 != -33) {
            CobolDisplay.display("R7 - " + CobolDisplay.formatPic(trailing1, 2, 0, true, "LEADING"));
            trailing1 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-33), 2);
        }
        trailing2 = CobolIntrinsics.toBigDecimal(CobolIntrinsics.inspectReplaceAllMulti(String.valueOf(trailing2), new String[]{"1", "2", "3"}, new String[]{"2", "3", "4"})).intValue();
        if (trailing2 != 33) {
            CobolDisplay.display("R8 - " + CobolDisplay.formatPic(trailing2, 2, 0, true, "LEADING"));
            trailing2 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(33), 2);
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc050InspectNumericSigned");
            CobolProgram.registerCallAlias("prog", "RunMisc050InspectNumericSigned");
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
        new RunMisc050InspectNumericSigned().run();
    }
}
