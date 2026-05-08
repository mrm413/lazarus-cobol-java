package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions007LengthOf extends CobolProgram {
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
    private CobolString x = new CobolString(2);
    private CobolString g = new CobolString(63); // Group: G
    private CobolString[] y = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            y[_d0] = new CobolString(2);
        }
    }
    private CobolString g_group = new CobolString(43); // Group: G-GROUP
    private CobolString g_sgroup = new CobolString(33); // Group: G-SGROUP
    private CobolString g1 = new CobolString(5);
    private CobolString g2 = new CobolString(6);
    private CobolString g3 = new CobolString(22);
    private CobolString[] filler_1 = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            filler_1[_d0] = new CobolString(2);
        }
    }
    private BigDecimal l = BigDecimal.ZERO;
    private int i = 10;
    private static final int i_len = 2;
    private CobolString tstdisp = new CobolString(165000); // Group: TSTDISP
    private CobolString[] t1 = new CobolString[5000];
    {
        for (int _d0 = 0; _d0 < 5000; _d0++) {
            t1[_d0] = new CobolString(11);
        }
    }
    private CobolString[] t2 = new CobolString[5000];
    {
        for (int _d0 = 0; _d0 < 5000; _d0++) {
            t2[_d0] = new CobolString(22);
        }
    }
    private static final int var_length_l = 5;
    private static final int var_length_x = 1;
    private static final int var_length_z = 3;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(165073);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 63).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Y").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g_group = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 43).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G-GROUP").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g_sgroup = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 33).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G-SGROUP").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("G1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("G2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(33, 22).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("G3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(55, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_l = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(65, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("L").picDigits(6).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_i = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(71, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("I").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstdisp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(73, 165000).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TSTDISP").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(73, 165000).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(73, 11).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("T1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(84, 22).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("T2").build();

    private CobolString length = new CobolString(256); // fallback
    private CobolString rename_std_sg = new CobolString(256); // fallback
    private CobolString rename_std_g = new CobolString(256); // fallback
    private CobolString rename_std = new CobolString(256); // fallback
    private CobolString rename_g = new CobolString(256); // fallback

    private void para_main() {
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(var_length_l), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(5)) != 0) {
            CobolDisplay.display("Length '00128'" + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(var_length_x), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            CobolDisplay.display("Length x'a0'" + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(var_length_z), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0) {
            CobolDisplay.display("Length z'a0'" + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("Length 1 " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("Length 1a " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING") + String.valueOf(2));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("Length 2 " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        if (l.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("Length 2a " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING") + String.valueOf(2));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("Length 3 " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("Length 3a " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING") + String.valueOf(2));
        }
        if (i_len != 2) {
            CobolDisplay.display("Length 4 " + String.valueOf(i_len));
        }
        if ((6 + 2) != 8) {
            l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2 + Integer.parseInt(String.valueOf(length).trim())), 6, 2, true);
            CobolDisplay.display("Length 5 + 2" + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        if ((6 + 2) != 8) {
            l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(2).add(CobolIntrinsics.toBigDecimal(length)).add(l)), 6, 2, true);
            CobolDisplay.display("Length 5a + 2 " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 6, 2, true);
        for (int _i0 = 0; _i0 < 6; _i0++) {
            l = CobolIntrinsics.truncateToField(l.add(CobolIntrinsics.toBigDecimal(1)), 6, 2, true);
        }
        for (int _i1 = 0; _i1 < 6; _i1++) {
            l = CobolIntrinsics.truncateToField(l.add(CobolIntrinsics.toBigDecimal(1)), 6, 2, true);
        }
        if (l.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            CobolDisplay.display("Length 6 " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 6, 2, true);
        for (i = 2; !(i > 6); i += 2) {
            varme();
        }
        if ((l.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0 || i != 8)) {
            CobolDisplay.display("Length 7 " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING") + " - " + CobolDisplay.formatPic(i, 2, 0, false));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 6, 2, true);
        for (i = 2; !(i > 6); i += 2) {
            varme();
        }
        if ((l.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0 || i != 8)) {
            CobolDisplay.display("Length 7a " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING") + " - " + CobolDisplay.formatPic(i, 2, 0, false));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(33), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(33)) != 0) {
            CobolDisplay.display("Length 8a " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(43), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(43)) != 0) {
            CobolDisplay.display("Length 8b " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(33), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(33)) != 0) {
            CobolDisplay.display("Length 8c " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        l = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(63), 6, 2, true);
        if (l.compareTo(CobolIntrinsics.toBigDecimal(63)) != 0) {
            CobolDisplay.display("Length 8d " + CobolDisplay.formatPic(l, 6, 2, true, "LEADING"));
        }
        CobolDisplay.displayNoAdvancing(String.valueOf(165000));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void varme() {
        l = CobolIntrinsics.truncateToField(l.add(CobolIntrinsics.toBigDecimal(1)), 6, 2, true);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions007LengthOf");
            CobolProgram.registerCallAlias("prog", "RunExtensions007LengthOf");
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
        new RunExtensions007LengthOf().run();
    }
}
