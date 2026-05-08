package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc120ComputingOfDifferentUsagesWODecimalPoint extends CobolProgram {
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
    private long bcl_a = 1L;
    private long bcl_b = 10L;
    private long bcl_res = 0L;
    private byte bc_a = (byte) 1;
    private byte bc_b = (byte) 10;
    private byte bc_res = (byte) 0;
    private long bd_a = 1L;
    private long bd_b = 10L;
    private long bd_res = 0L;
    private int bl_a = 1;
    private int bl_b = 10;
    private int bl_res = 0;
    private short c_a = (short) 1;
    private short c_b = (short) 10;
    private short c_res = (short) 0;
    private float c1_a = 1f;
    private float c1_b = 10f;
    private float c1_res = 0.0f;
    private double c2_a = 1;
    private double c2_b = 10;
    private double c2_res = 0.0;
    private BigDecimal c3_a = new BigDecimal("1");
    private BigDecimal c3_b = new BigDecimal("10");
    private BigDecimal c3_res = BigDecimal.ZERO;
    private short c5_a = (short) 1;
    private short c5_b = (short) 10;
    private short c5_res = (short) 0;
    private BigDecimal c6_a = new BigDecimal("1");
    private BigDecimal c6_b = new BigDecimal("10");
    private BigDecimal c6_res = BigDecimal.ZERO;
    private short cn9_a = (short) 1;
    private short cn9_b = (short) 10;
    private short cn9_res = (short) 0;
    private byte cnx_a = (byte) 1;
    private byte cnx_b = (byte) 10;
    private byte cnx_res = (byte) 0;
    private short cx9_a = (short) 1;
    private short cx9_b = (short) 10;
    private short cx9_res = (short) 0;
    private byte cxx_a = (byte) 1;
    private byte cxx_b = (byte) 10;
    private byte cxx_res = (byte) 0;
    private int d_a = 1;
    private int d_b = 10;
    private int d_res = 0;
    private BigDecimal fd16_a = new BigDecimal("1");
    private BigDecimal fd16_b = new BigDecimal("10");
    private BigDecimal fd16_res = BigDecimal.ZERO;
    private BigDecimal fd34_a = new BigDecimal("1");
    private BigDecimal fd34_b = new BigDecimal("10");
    private BigDecimal fd34_res = BigDecimal.ZERO;
    private double fl_a = 1;
    private double fl_b = 10;
    private double fl_res = 0.0;
    private float fs_a = 1f;
    private float fs_b = 10f;
    private float fs_res = 0.0f;
    private int filler_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(67);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bcl_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BCL-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bcl_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BCL-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bcl_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BCL-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bc_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BC-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bc_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BC-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bc_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BC-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bd_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BD-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bd_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BD-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bd_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BD-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bl_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BL-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bl_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BL-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bl_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(11, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BL-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("C-A").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("C-B").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("C-RES").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c1_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("C1-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c1_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("C1-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c1_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(17, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("C1-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c2_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("C2-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c2_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("C2-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c2_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("C2-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c3_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("C3-A").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c3_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("C3-B").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c3_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("C3-RES").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c5_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("C5-A").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c5_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("C5-B").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c5_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("C5-RES").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c6_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("C6-A").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c6_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("C6-B").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c6_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("C6-RES").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cn9_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(36, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("CN9-A").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cn9_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(37, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("CN9-B").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cn9_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(38, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("CN9-RES").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnx_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(39, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("CNX-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnx_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(40, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("CNX-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnx_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(41, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("CNX-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cx9_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(42, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CX9-A").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cx9_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(43, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CX9-B").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cx9_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(44, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CX9-RES").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cxx_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(45, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CXX-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cxx_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(46, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CXX-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cxx_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(47, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CXX-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(48, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-A").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(50, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-B").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(52, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-RES").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fd16_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(54, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FD16-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fd16_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(55, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FD16-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fd16_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(56, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FD16-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fd34_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FD34-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fd34_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(58, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FD34-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fd34_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(59, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FD34-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fl_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(60, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("FL-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fl_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(61, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("FL-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fl_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(62, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("FL-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fs_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(63, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("FS-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fs_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(64, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("FS-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fs_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(65, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("FS-RES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(66, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString do_disp = new CobolString(256); // fallback

    private void para_main() {
        do_check();
        return;
    }

    private void do_check() {
        do_check_part0();
        do_check_part1();
    }
    private void do_check_part0() {
        c_a = 1;
        c_b = 10;
        c3_a = new BigDecimal("1");
        c3_b = new BigDecimal("10");
        c5_a = 1;
        c5_b = 10;
        c6_a = new BigDecimal("1");
        c6_b = new BigDecimal("10");
        cn9_a = 1;
        cn9_b = 10;
        cnx_a = 1;
        cnx_b = 10;
        cx9_a = 1;
        cx9_b = 10;
        cxx_a = 1;
        cxx_b = 10;
        d_a = 1;
        d_b = 10;
        bcl_a = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bcl_a).add(CobolIntrinsics.toBigDecimal(bcl_b))).longValue();
        bcl_res = CobolIntrinsics.toBigDecimal(bcl_a).longValue();
        if (bcl_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-C-LONG + BINARY-C-LONG");
            }
        }
        bcl_a = CobolIntrinsics.toBigDecimal(1).longValue();
        bcl_a = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bcl_a).add(CobolIntrinsics.toBigDecimal(10))).longValue();
        bcl_res = CobolIntrinsics.toBigDecimal(bcl_a).longValue();
        if (bcl_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-C-LONG + NUM");
            }
        }
        bcl_a = CobolIntrinsics.toBigDecimal(11).longValue();
        bcl_a = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bcl_a).subtract(CobolIntrinsics.toBigDecimal(bcl_b))).longValue();
        bcl_res = CobolIntrinsics.toBigDecimal(bcl_a).longValue();
        if (bcl_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-C-LONG - BINARY-C-LONG");
            }
        }
        bcl_a = CobolIntrinsics.toBigDecimal(11).longValue();
        bcl_a = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bcl_a).subtract(CobolIntrinsics.toBigDecimal(10))).longValue();
        bcl_res = CobolIntrinsics.toBigDecimal(bcl_a).longValue();
        if (bcl_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-C-LONG - NUM");
            }
        }
        bc_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bc_a).add(CobolIntrinsics.toBigDecimal(bc_b))).byteValue();
        bc_res = (byte) CobolIntrinsics.toBigDecimal(bc_a).byteValue();
        if (bc_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-CHAR + BINARY-CHAR");
            }
        }
        bc_a = (byte) CobolIntrinsics.toBigDecimal(1).byteValue();
        bc_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bc_a).add(CobolIntrinsics.toBigDecimal(10))).byteValue();
        bc_res = (byte) CobolIntrinsics.toBigDecimal(bc_a).byteValue();
        if (bc_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-CHAR + NUM");
            }
        }
        bc_a = (byte) CobolIntrinsics.toBigDecimal(11).byteValue();
        bc_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bc_a).subtract(CobolIntrinsics.toBigDecimal(bc_b))).byteValue();
        bc_res = (byte) CobolIntrinsics.toBigDecimal(bc_a).byteValue();
        if (bc_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-CHAR - BINARY-CHAR");
            }
        }
        bc_a = (byte) CobolIntrinsics.toBigDecimal(11).byteValue();
        bc_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bc_a).subtract(CobolIntrinsics.toBigDecimal(10))).byteValue();
        bc_res = (byte) CobolIntrinsics.toBigDecimal(bc_a).byteValue();
        if (bc_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-CHAR - NUM");
            }
        }
        bd_a = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bd_a).add(CobolIntrinsics.toBigDecimal(bd_b))).longValue();
        bd_res = CobolIntrinsics.toBigDecimal(bd_a).longValue();
        if (bd_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-DOUBLE + BINARY-DOUBLE");
            }
        }
        bd_a = CobolIntrinsics.toBigDecimal(1).longValue();
        bd_a = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bd_a).add(CobolIntrinsics.toBigDecimal(10))).longValue();
        bd_res = CobolIntrinsics.toBigDecimal(bd_a).longValue();
        if (bd_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-DOUBLE + NUM");
            }
        }
        bd_a = CobolIntrinsics.toBigDecimal(11).longValue();
        bd_a = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bd_a).subtract(CobolIntrinsics.toBigDecimal(bd_b))).longValue();
        bd_res = CobolIntrinsics.toBigDecimal(bd_a).longValue();
        if (bd_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-DOUBLE - BINARY-DOUBLE");
            }
        }
        bd_a = CobolIntrinsics.toBigDecimal(11).longValue();
        bd_a = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bd_a).subtract(CobolIntrinsics.toBigDecimal(10))).longValue();
        bd_res = CobolIntrinsics.toBigDecimal(bd_a).longValue();
        if (bd_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-DOUBLE - NUM");
            }
        }
        bl_a = (int) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bl_a).add(CobolIntrinsics.toBigDecimal(bl_b))).intValue();
        bl_res = (int) CobolIntrinsics.toBigDecimal(bl_a).intValue();
        if (bl_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-LONG + BINARY-LONG");
            }
        }
        bl_a = (int) CobolIntrinsics.toBigDecimal(1).intValue();
        bl_a = (int) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bl_a).add(CobolIntrinsics.toBigDecimal(10))).intValue();
        bl_res = (int) CobolIntrinsics.toBigDecimal(bl_a).intValue();
        if (bl_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-LONG + NUM");
            }
        }
        bl_a = (int) CobolIntrinsics.toBigDecimal(11).intValue();
        bl_a = (int) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bl_a).subtract(CobolIntrinsics.toBigDecimal(bl_b))).intValue();
        bl_res = (int) CobolIntrinsics.toBigDecimal(bl_a).intValue();
        if (bl_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-LONG - BINARY-LONG");
            }
        }
        bl_a = (int) CobolIntrinsics.toBigDecimal(11).intValue();
        bl_a = (int) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(bl_a).subtract(CobolIntrinsics.toBigDecimal(10))).intValue();
        bl_res = (int) CobolIntrinsics.toBigDecimal(bl_a).intValue();
        if (bl_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR BINARY-LONG - NUM");
            }
        }
        c_a = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(c_a).add(CobolIntrinsics.toBigDecimal(c_b))), 2);
        c_res = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(c_a), 2);
        if (c_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP + COMP");
            }
        }
        c_a = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2);
        c_a = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(c_a).add(CobolIntrinsics.toBigDecimal(10))), 2);
        c_res = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(c_a), 2);
        if (c_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP + NUM");
            }
        }
        c_a = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(11), 2);
        c_a = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(c_a).subtract(CobolIntrinsics.toBigDecimal(c_b))), 2);
        c_res = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(c_a), 2);
        if (c_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP - COMP");
            }
        }
        c_a = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(11), 2);
        c_a = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(c_a).subtract(CobolIntrinsics.toBigDecimal(10))), 2);
        c_res = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(c_a), 2);
        if (c_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP - NUM");
            }
        }
        c1_a = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(c1_a).add(CobolIntrinsics.toBigDecimal(c1_b))).trim());
        c1_res = (float) Double.parseDouble(String.valueOf(c1_a).trim());
        if ((float)(c1_res) != (float)(11)) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-1 + COMP-1");
            }
        }
        c1_a = (float) Double.parseDouble(String.valueOf(1).trim());
        c1_a = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(c1_a).add(CobolIntrinsics.toBigDecimal(10))).trim());
        c1_res = (float) Double.parseDouble(String.valueOf(c1_a).trim());
        if ((float)(c1_res) != (float)(11)) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-1 + NUM");
            }
        }
        c1_a = (float) Double.parseDouble(String.valueOf(11).trim());
        c1_a = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(c1_a).subtract(CobolIntrinsics.toBigDecimal(c1_b))).trim());
        c1_res = (float) Double.parseDouble(String.valueOf(c1_a).trim());
        if ((float)(c1_res) != (float)(1)) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-1 - COMP-1");
            }
        }
        c1_a = (float) Double.parseDouble(String.valueOf(11).trim());
        c1_a = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(c1_a).subtract(CobolIntrinsics.toBigDecimal(10))).trim());
        c1_res = (float) Double.parseDouble(String.valueOf(c1_a).trim());
        if ((float)(c1_res) != (float)(1)) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-1 - NUM");
            }
        }
        c2_a = Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(c2_a).add(CobolIntrinsics.toBigDecimal(c2_b))).trim());
        c2_res = Double.parseDouble(String.valueOf(c2_a).trim());
        if (c2_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-2 + COMP-2");
            }
        }
        c2_a = Double.parseDouble(String.valueOf(1).trim());
        c2_a = Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(c2_a).add(CobolIntrinsics.toBigDecimal(10))).trim());
        c2_res = Double.parseDouble(String.valueOf(c2_a).trim());
        if (c2_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-2 + NUM");
            }
        }
        c2_a = Double.parseDouble(String.valueOf(11).trim());
        c2_a = Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(c2_a).subtract(CobolIntrinsics.toBigDecimal(c2_b))).trim());
        c2_res = Double.parseDouble(String.valueOf(c2_a).trim());
        if (c2_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-2 - COMP-2");
            }
        }
        c2_a = Double.parseDouble(String.valueOf(11).trim());
        c2_a = Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(c2_a).subtract(CobolIntrinsics.toBigDecimal(10))).trim());
        c2_res = Double.parseDouble(String.valueOf(c2_a).trim());
        if (c2_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-2 - NUM");
            }
        }
        c3_a = CobolIntrinsics.truncateToField(c3_a.add(CobolIntrinsics.toBigDecimal(c3_b)), 2, 0, true);
        c3_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(c3_a), 2, 0, true);
        if (c3_res.compareTo(CobolIntrinsics.toBigDecimal(11)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-3 + COMP-3");
            }
        }
        c3_a = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 2, 0, true);
        c3_a = CobolIntrinsics.truncateToField(c3_a.add(CobolIntrinsics.toBigDecimal(10)), 2, 0, true);
        c3_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(c3_a), 2, 0, true);
        if (c3_res.compareTo(CobolIntrinsics.toBigDecimal(11)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-3 + NUM");
            }
        }
        c3_a = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(11), 2, 0, true);
        c3_a = CobolIntrinsics.truncateToField(c3_a.subtract(CobolIntrinsics.toBigDecimal(c3_b)), 2, 0, true);
        c3_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(c3_a), 2, 0, true);
        if (c3_res.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-3 - COMP-3");
            }
        }
        c3_a = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(11), 2, 0, true);
        c3_a = CobolIntrinsics.truncateToField(c3_a.subtract(CobolIntrinsics.toBigDecimal(10)), 2, 0, true);
        c3_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(c3_a), 2, 0, true);
        if (c3_res.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-3 - NUM");
            }
        }
        c5_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(c5_a).add(CobolIntrinsics.toBigDecimal(c5_b))).shortValue();
        c5_res = (short) CobolIntrinsics.toBigDecimal(c5_a).shortValue();
        if (c5_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-5 + COMP-5");
            }
        }
        c5_a = (short) CobolIntrinsics.toBigDecimal(1).shortValue();
        c5_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(c5_a).add(CobolIntrinsics.toBigDecimal(10))).shortValue();
        c5_res = (short) CobolIntrinsics.toBigDecimal(c5_a).shortValue();
        if (c5_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-5 + NUM");
            }
        }
        c5_a = (short) CobolIntrinsics.toBigDecimal(11).shortValue();
        c5_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(c5_a).subtract(CobolIntrinsics.toBigDecimal(c5_b))).shortValue();
        c5_res = (short) CobolIntrinsics.toBigDecimal(c5_a).shortValue();
        if (c5_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-5 - COMP-5");
            }
        }
        c5_a = (short) CobolIntrinsics.toBigDecimal(11).shortValue();
        c5_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(c5_a).subtract(CobolIntrinsics.toBigDecimal(10))).shortValue();
        c5_res = (short) CobolIntrinsics.toBigDecimal(c5_a).shortValue();
        if (c5_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-5 - NUM");
            }
        }
        c6_a = CobolIntrinsics.truncateToField(c6_a.add(CobolIntrinsics.toBigDecimal(c6_b)), 2, 0, false);
        c6_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(c6_a), 2, 0, false);
        if (c6_res.compareTo(CobolIntrinsics.toBigDecimal(11)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-6 + COMP-6");
            }
        }
        c6_a = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 2, 0, false);
        c6_a = CobolIntrinsics.truncateToField(c6_a.add(CobolIntrinsics.toBigDecimal(10)), 2, 0, false);
        c6_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(c6_a), 2, 0, false);
        if (c6_res.compareTo(CobolIntrinsics.toBigDecimal(11)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-6 + NUM");
            }
        }
        c6_a = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(11), 2, 0, false);
        c6_a = CobolIntrinsics.truncateToField(c6_a.subtract(CobolIntrinsics.toBigDecimal(c6_b)), 2, 0, false);
        c6_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(c6_a), 2, 0, false);
        if (c6_res.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-6 - COMP-6");
            }
        }
        c6_a = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(11), 2, 0, false);
        c6_a = CobolIntrinsics.truncateToField(c6_a.subtract(CobolIntrinsics.toBigDecimal(10)), 2, 0, false);
        c6_res = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(c6_a), 2, 0, false);
        if (c6_res.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-6 - NUM");
            }
        }
        cn9_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cn9_a).add(CobolIntrinsics.toBigDecimal(cn9_b))).shortValue();
        cn9_res = (short) CobolIntrinsics.toBigDecimal(cn9_a).shortValue();
        if (cn9_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-N + COMP-N");
            }
        }
        cn9_a = (short) CobolIntrinsics.toBigDecimal(1).shortValue();
        cn9_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cn9_a).add(CobolIntrinsics.toBigDecimal(10))).shortValue();
        cn9_res = (short) CobolIntrinsics.toBigDecimal(cn9_a).shortValue();
        if (cn9_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-N + NUM");
            }
        }
        cn9_a = (short) CobolIntrinsics.toBigDecimal(11).shortValue();
        cn9_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cn9_a).subtract(CobolIntrinsics.toBigDecimal(cn9_b))).shortValue();
        cn9_res = (short) CobolIntrinsics.toBigDecimal(cn9_a).shortValue();
        if (cn9_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-N - COMP-N");
            }
        }
        cn9_a = (short) CobolIntrinsics.toBigDecimal(11).shortValue();
        cn9_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cn9_a).subtract(CobolIntrinsics.toBigDecimal(10))).shortValue();
        cn9_res = (short) CobolIntrinsics.toBigDecimal(cn9_a).shortValue();
        if (cn9_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-N - NUM");
            }
        }
        cnx_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cnx_a).add(CobolIntrinsics.toBigDecimal(cnx_b))).byteValue();
        cnx_res = (byte) CobolIntrinsics.toBigDecimal(cnx_a).byteValue();
        if (cnx_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-N + COMP-N");
            }
        }
        cnx_a = (byte) CobolIntrinsics.toBigDecimal(1).byteValue();
        cnx_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cnx_a).add(CobolIntrinsics.toBigDecimal(10))).byteValue();
        cnx_res = (byte) CobolIntrinsics.toBigDecimal(cnx_a).byteValue();
        if (cnx_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-N + NUM");
            }
        }
        cnx_a = (byte) CobolIntrinsics.toBigDecimal(11).byteValue();
        cnx_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cnx_a).subtract(CobolIntrinsics.toBigDecimal(cnx_b))).byteValue();
        cnx_res = (byte) CobolIntrinsics.toBigDecimal(cnx_a).byteValue();
        if (cnx_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-N - COMP-N");
            }
        }
        cnx_a = (byte) CobolIntrinsics.toBigDecimal(11).byteValue();
        cnx_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cnx_a).subtract(CobolIntrinsics.toBigDecimal(10))).byteValue();
        cnx_res = (byte) CobolIntrinsics.toBigDecimal(cnx_a).byteValue();
        if (cnx_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-N - NUM");
            }
        }
        cx9_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cx9_a).add(CobolIntrinsics.toBigDecimal(cx9_b))).shortValue();
        cx9_res = (short) CobolIntrinsics.toBigDecimal(cx9_a).shortValue();
        if (cx9_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-X + COMP-X");
            }
        }
        cx9_a = (short) CobolIntrinsics.toBigDecimal(1).shortValue();
        cx9_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cx9_a).add(CobolIntrinsics.toBigDecimal(10))).shortValue();
        cx9_res = (short) CobolIntrinsics.toBigDecimal(cx9_a).shortValue();
    }
    private void do_check_part1() {
        if (cx9_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-X + NUM");
            }
        }
        cx9_a = (short) CobolIntrinsics.toBigDecimal(11).shortValue();
        cx9_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cx9_a).subtract(CobolIntrinsics.toBigDecimal(cx9_b))).shortValue();
        cx9_res = (short) CobolIntrinsics.toBigDecimal(cx9_a).shortValue();
        if (cx9_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-X - COMP-X");
            }
        }
        cx9_a = (short) CobolIntrinsics.toBigDecimal(11).shortValue();
        cx9_a = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cx9_a).subtract(CobolIntrinsics.toBigDecimal(10))).shortValue();
        cx9_res = (short) CobolIntrinsics.toBigDecimal(cx9_a).shortValue();
        if (cx9_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-X - NUM");
            }
        }
        cxx_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cxx_a).add(CobolIntrinsics.toBigDecimal(cxx_b))).byteValue();
        cxx_res = (byte) CobolIntrinsics.toBigDecimal(cxx_a).byteValue();
        if (cxx_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-X + COMP-X");
            }
        }
        cxx_a = (byte) CobolIntrinsics.toBigDecimal(1).byteValue();
        cxx_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cxx_a).add(CobolIntrinsics.toBigDecimal(10))).byteValue();
        cxx_res = (byte) CobolIntrinsics.toBigDecimal(cxx_a).byteValue();
        if (cxx_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-X + NUM");
            }
        }
        cxx_a = (byte) CobolIntrinsics.toBigDecimal(11).byteValue();
        cxx_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cxx_a).subtract(CobolIntrinsics.toBigDecimal(cxx_b))).byteValue();
        cxx_res = (byte) CobolIntrinsics.toBigDecimal(cxx_a).byteValue();
        if (cxx_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-X - COMP-X");
            }
        }
        cxx_a = (byte) CobolIntrinsics.toBigDecimal(11).byteValue();
        cxx_a = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cxx_a).subtract(CobolIntrinsics.toBigDecimal(10))).byteValue();
        cxx_res = (byte) CobolIntrinsics.toBigDecimal(cxx_a).byteValue();
        if (cxx_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR COMP-X - NUM");
            }
        }
        d_a = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(d_a).add(CobolIntrinsics.toBigDecimal(d_b))), 2);
        d_res = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_a), 2);
        if (d_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR DISPLAY + DISPLAY");
            }
        }
        d_a = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2);
        d_a = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(d_a).add(CobolIntrinsics.toBigDecimal(10))), 2);
        d_res = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_a), 2);
        if (d_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR DISPLAY + NUM");
            }
        }
        d_a = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(11), 2);
        d_a = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(d_a).subtract(CobolIntrinsics.toBigDecimal(d_b))), 2);
        d_res = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_a), 2);
        if (d_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR DISPLAY - DISPLAY");
            }
        }
        d_a = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(11), 2);
        d_a = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(d_a).subtract(CobolIntrinsics.toBigDecimal(10))), 2);
        d_res = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_a), 2);
        if (d_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR DISPLAY - NUM");
            }
        }
        fd16_a = CobolIntrinsics.truncateToField(fd16_a.add(CobolIntrinsics.toBigDecimal(fd16_b)), 16, 0, true);
        fd16_res = CobolIntrinsics.toBigDecimal(fd16_a).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        if (fd16_res.compareTo(CobolIntrinsics.toBigDecimal(11)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-DECIMAL-16 + FLOAT-DECIMAL-16");
            }
        }
        fd16_a = CobolIntrinsics.toBigDecimal(1).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        fd16_a = CobolIntrinsics.truncateToField(fd16_a.add(CobolIntrinsics.toBigDecimal(10)), 16, 0, true);
        fd16_res = CobolIntrinsics.toBigDecimal(fd16_a).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        if (fd16_res.compareTo(CobolIntrinsics.toBigDecimal(11)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-DECIMAL-16 + NUM");
            }
        }
        fd16_a = CobolIntrinsics.toBigDecimal(11).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        fd16_a = CobolIntrinsics.truncateToField(fd16_a.subtract(CobolIntrinsics.toBigDecimal(fd16_b)), 16, 0, true);
        fd16_res = CobolIntrinsics.toBigDecimal(fd16_a).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        if (fd16_res.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-DECIMAL-16 - FLOAT-DECIMAL-16");
            }
        }
        fd16_a = CobolIntrinsics.toBigDecimal(11).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        fd16_a = CobolIntrinsics.truncateToField(fd16_a.subtract(CobolIntrinsics.toBigDecimal(10)), 16, 0, true);
        fd16_res = CobolIntrinsics.toBigDecimal(fd16_a).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        if (fd16_res.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-DECIMAL-16 - NUM");
            }
        }
        fd34_a = CobolIntrinsics.truncateToField(fd34_a.add(CobolIntrinsics.toBigDecimal(fd34_b)), 34, 0, true);
        fd34_res = CobolIntrinsics.toBigDecimal(fd34_a).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        if (fd34_res.compareTo(CobolIntrinsics.toBigDecimal(11)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-DECIMAL-34 + FLOAT-DECIMAL-34");
            }
        }
        fd34_a = CobolIntrinsics.toBigDecimal(1).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        fd34_a = CobolIntrinsics.truncateToField(fd34_a.add(CobolIntrinsics.toBigDecimal(10)), 34, 0, true);
        fd34_res = CobolIntrinsics.toBigDecimal(fd34_a).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        if (fd34_res.compareTo(CobolIntrinsics.toBigDecimal(11)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-DECIMAL-34 + NUM");
            }
        }
        fd34_a = CobolIntrinsics.toBigDecimal(11).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        fd34_a = CobolIntrinsics.truncateToField(fd34_a.subtract(CobolIntrinsics.toBigDecimal(fd34_b)), 34, 0, true);
        fd34_res = CobolIntrinsics.toBigDecimal(fd34_a).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        if (fd34_res.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-DECIMAL-34 - FLOAT-DECIMAL-34");
            }
        }
        fd34_a = CobolIntrinsics.toBigDecimal(11).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        fd34_a = CobolIntrinsics.truncateToField(fd34_a.subtract(CobolIntrinsics.toBigDecimal(10)), 34, 0, true);
        fd34_res = CobolIntrinsics.toBigDecimal(fd34_a).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        if (fd34_res.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-DECIMAL-34 - NUM");
            }
        }
        fl_a = Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(fl_a).add(CobolIntrinsics.toBigDecimal(fl_b))).trim());
        fl_res = Double.parseDouble(String.valueOf(fl_a).trim());
        if (fl_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-LONG + FLOAT-LONG");
            }
        }
        fl_a = Double.parseDouble(String.valueOf(1).trim());
        fl_a = Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(fl_a).add(CobolIntrinsics.toBigDecimal(10))).trim());
        fl_res = Double.parseDouble(String.valueOf(fl_a).trim());
        if (fl_res != 11) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-LONG + NUM");
            }
        }
        fl_a = Double.parseDouble(String.valueOf(11).trim());
        fl_a = Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(fl_a).subtract(CobolIntrinsics.toBigDecimal(fl_b))).trim());
        fl_res = Double.parseDouble(String.valueOf(fl_a).trim());
        if (fl_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-LONG - FLOAT-LONG");
            }
        }
        fl_a = Double.parseDouble(String.valueOf(11).trim());
        fl_a = Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(fl_a).subtract(CobolIntrinsics.toBigDecimal(10))).trim());
        fl_res = Double.parseDouble(String.valueOf(fl_a).trim());
        if (fl_res != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-LONG - NUM");
            }
        }
        fs_a = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(fs_a).add(CobolIntrinsics.toBigDecimal(fs_b))).trim());
        fs_res = (float) Double.parseDouble(String.valueOf(fs_a).trim());
        if ((float)(fs_res) != (float)(11)) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-SHORT + FLOAT-SHORT");
            }
        }
        fs_a = (float) Double.parseDouble(String.valueOf(1).trim());
        fs_a = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(fs_a).add(CobolIntrinsics.toBigDecimal(10))).trim());
        fs_res = (float) Double.parseDouble(String.valueOf(fs_a).trim());
        if ((float)(fs_res) != (float)(11)) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-SHORT + NUM");
            }
        }
        fs_a = (float) Double.parseDouble(String.valueOf(11).trim());
        fs_a = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(fs_a).subtract(CobolIntrinsics.toBigDecimal(fs_b))).trim());
        fs_res = (float) Double.parseDouble(String.valueOf(fs_a).trim());
        if ((float)(fs_res) != (float)(1)) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-SHORT - FLOAT-SHORT");
            }
        }
        fs_a = (float) Double.parseDouble(String.valueOf(11).trim());
        fs_a = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(fs_a).subtract(CobolIntrinsics.toBigDecimal(10))).trim());
        fs_res = (float) Double.parseDouble(String.valueOf(fs_a).trim());
        if ((float)(fs_res) != (float)(1)) {
            if (filler_1 == 0) {
                CobolDisplay.display("ERROR FLOAT-SHORT - NUM");
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc120ComputingOfDifferentUsagesWODecimalPoint");
            CobolProgram.registerCallAlias("prog", "RunMisc120ComputingOfDifferentUsagesWODecimalPoint");
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
        new RunMisc120ComputingOfDifferentUsagesWODecimalPoint().run();
    }
}
