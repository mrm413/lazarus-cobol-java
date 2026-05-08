package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc137FieldTreeViaCobcGenDumpComments extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "debugme";
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
    private int x_idx = 1;
    // WORKING-STORAGE SECTION
    private CobolString numeric_data = new CobolString(75, "-12.312.34-.00.000-1231234-12.312.34-12.312.34-12.312.3412.34-12.312.34-12.312.34"); // Group: numeric-data
    private BigDecimal disp = new BigDecimal("-12.34");
    private BigDecimal disp_u = new BigDecimal("12.34");
    private BigDecimal dispp = new BigDecimal("-.000123");
    private BigDecimal dispp_u = new BigDecimal(".000123");
    private BigDecimal disppp = new BigDecimal("-1234000");
    private BigDecimal disppp_u = new BigDecimal("1234000");
    private BigDecimal bin = new BigDecimal("-12.34");
    private BigDecimal bin_u = new BigDecimal("12.34");
    private BigDecimal cmp3 = new BigDecimal("-12.34");
    private BigDecimal cmp3_u = new BigDecimal("12.34");
    private BigDecimal cmp5 = new BigDecimal("-12.34");
    private BigDecimal cmp5_u = new BigDecimal("12.34");
    private BigDecimal cmp6 = new BigDecimal("12.34");
    private BigDecimal cmpx = new BigDecimal("-12.34");
    private BigDecimal cmpx_u = new BigDecimal("12.34");
    private BigDecimal cmpn = new BigDecimal("-12.34");
    private BigDecimal cmpn_u = new BigDecimal("12.34");
    private byte chr = (byte) -128;
    private byte chr_u = (byte) 254;
    private short shrt = (short) -32768;
    private short shrt_u = (short) 65535;
    private int cb_long = -2147483648;
    private long long_u = 4294967295L;
    private long dble = -4294967295L;
    private long dble_u = 8294967295L;
    private CobolString floating_data = new CobolString(2); // Group: floating-data
    private double dbl = -3.40282e+38;
    private float flt = 3.40282e+38f;
    private CobolString x36 = new CobolString(36);
    private CobolString special_data = new CobolString(1); // Group: special-data
    private CobolString r2d2 = new CobolString(0, "6");
    private CobolString alphanumeric_data = new CobolString(66, "thats some text                                                  "); // Group: alphanumeric-data
    private int alpnum = 0;
    private CobolString alpha = new CobolString(36, "thats some text");
    private CobolString edit_num1 = new CobolString(7, CobolDisplay.formatEdited(0, "--9.999"));
    private CobolString edit_num2 = new CobolString(7, CobolDisplay.formatEdited(0, "++9.999"));
    private CobolString edit_num3 = new CobolString(7, CobolDisplay.formatEdited(0, "zz9.999"));
    private CobolString edit_num4 = new CobolString(8, CobolDisplay.formatEdited(0, "-zz9.999"));
    private CobolString national_data = new CobolString(116, "data shown here will change.                                                                                        "); // Group: national-data
    private CobolString nat = new CobolString(72, "data shown here will change.");
    private BigDecimal nat_num = BigDecimal.ZERO;
    private CobolString net_num1 = new CobolString(7, CobolDisplay.formatEdited(0, "--9.999"));
    private CobolString net_num2 = new CobolString(7, CobolDisplay.formatEdited(0, "++9.999"));
    private CobolString net_num3 = new CobolString(7, CobolDisplay.formatEdited(0, "zz9.999"));
    private CobolString net_num4 = new CobolString(8, CobolDisplay.formatEdited(0, "-zz9.999"));
    private CobolString[] x_basis = new CobolString[5]; // Group: x-basis
    private CobolString[] x_a = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            x_a[_d0] = new CobolString(1, " ");
        }
    }
    private CobolString[] x_b = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            x_b[_d0] = new CobolString(1, " ");
        }
    }
    private CobolString[] x_c = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            x_c[_d0] = new CobolString(1, " ");
        }
    }
    private CobolString filler_1 = new CobolString(3);
    private CobolString x_rms = new CobolString(1, " "); // Group: x-rms
    private CobolString x_rms_a = new CobolString(1);
    private CobolString filler_2 = x_rms;

    // LOCAL-STORAGE SECTION
    private CobolString var1 = new CobolString(1);
    private CobolString var2 = new CobolString(2); // Group: var2
    private CobolString var2a = new CobolString(1);
    private int var2b = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(313);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_numeric_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 75).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("numeric-data").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_disp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("disp").picDigits(5).picScale(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_disp_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("disp-u").picDigits(5).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dispp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("dispp").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dispp_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("dispp-u").picDigits(4).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_disppp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("disppp").picDigits(4).picScale(-3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_disppp_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("disppp-u").picDigits(4).picScale(-3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bin = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("bin").picDigits(5).picScale(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bin_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("bin-u").picDigits(5).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmp3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("cmp3").picDigits(5).picScale(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmp3_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(37, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("cmp3-u").picDigits(5).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmp5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(40, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("cmp5").picDigits(5).picScale(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmp5_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(44, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("cmp5-u").picDigits(5).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmp6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(48, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("cmp6").picDigits(5).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmpx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(51, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("cmpx").picDigits(5).picScale(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmpx_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(55, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("cmpx-u").picDigits(5).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmpn = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(59, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("cmpn").picDigits(5).picScale(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cmpn_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(63, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("cmpn-u").picDigits(5).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_chr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(67, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("chr").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_chr_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(68, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("chr-u").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_shrt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(69, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("shrt").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_shrt_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(70, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("shrt-u").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cb_long = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(71, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("long").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_long_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(72, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("long-u").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dble = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(73, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("dble").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dble_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(74, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("dble-u").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_floating_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(75, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("floating-data").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbl = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(75, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("dbl").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_flt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(76, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("flt").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x36 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(77, 36).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("x36").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_special_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(113, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("special-data").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_r2d2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(113, 0).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("r2d2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_alphanumeric_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(114, 66).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("alphanumeric-data").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_alpnum = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(114, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("alpnum").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_alpha = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(115, 36).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("alpha").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edit_num1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(151, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("edit-num1").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edit_num2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(158, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("edit-num2").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edit_num3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(165, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("edit-num3").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edit_num4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(172, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("edit-num4").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_national_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(180, 116).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("national-data").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_nat = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(180, 72).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("nat").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_nat_num = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(252, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("nat-num").picDigits(15).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_net_num1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(267, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("net-num1").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_net_num2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(274, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("net-num2").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_net_num3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(281, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("net-num3").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_net_num4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(288, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("net-num4").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(296, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_basis = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(296, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("x-basis").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(296, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("x-a").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(297, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("x-b").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(298, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("x-c").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(296, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_rms = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(311, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("x-rms").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_rms_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(311, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("x-rms-a").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(312, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();


    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("debugme", "", "debugme.cob");
        CobolProgram.pushActive("debugme");
        try {
            CobolProgram.registerCallAlias("debugme", "SynMisc137FieldTreeViaCobcGenDumpComments");
            CobolProgram.registerCallAlias("debugme", "SynMisc137FieldTreeViaCobcGenDumpComments");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // LOCAL-STORAGE: re-initialize to VALUE clauses on each entry
            var1.set(" ");
            var2.set("  ");
            var2a.set(" ");
            var2b = 0;
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
        new SynMisc137FieldTreeViaCobcGenDumpComments().run();
    }
}
