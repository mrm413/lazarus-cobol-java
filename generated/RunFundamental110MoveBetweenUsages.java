package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental110MoveBetweenUsages extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "MoveTestCobMove";
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
    private CobolString all_src = new CobolString(67); // Group: ALL-SRC
    private long all_src_field_02 = 0L;
    private long all_src_field_03 = 0L;
    private byte all_src_field_04 = (byte) 0;
    private byte all_src_field_05 = (byte) 0;
    private long all_src_field_06 = 0L;
    private long all_src_field_07 = 0L;
    private int all_src_field_08 = 0;
    private int all_src_field_09 = 0;
    private long all_src_field_10 = 0L;
    private long all_src_field_11 = 0L;
    private short all_src_field_12 = (short) 0;
    private short all_src_field_13 = (short) 0;
    private BigDecimal all_src_field_14 = BigDecimal.ZERO;
    private BigDecimal all_src_field_15 = BigDecimal.ZERO;
    private double all_src_field_16 = 0.0;
    private float all_src_field_17 = 0.0f;
    private int all_src_field_18 = 0;
    private long all_src_field_19 = 0L;
    private short all_src_field_20 = (short) 0;
    private int all_src_field_21 = 0;
    private long all_src_field_22 = 0L;
    private short all_src_field_23 = (short) 0;
    private float all_src_field_24 = 0.0f;
    private double all_src_field_25 = 0.0;
    private BigDecimal all_src_field_26 = BigDecimal.ZERO;
    private int all_src_field_50 = 0;
    private int all_src_field_51 = 0;
    private BigDecimal all_src_field_52 = BigDecimal.ZERO;
    private int all_src_field_53 = 0;
    private int all_src_field_54 = 0;
    private int all_src_field_55 = 0;
    private BigDecimal all_src_field_56 = BigDecimal.ZERO;
    private int exptd_result = 0;
    private CobolString all_dst = new CobolString(67); // Group: ALL-DST
    private long all_dst_field_02 = 0L;
    private long all_dst_field_03 = 0L;
    private byte all_dst_field_04 = (byte) 0;
    private byte all_dst_field_05 = (byte) 0;
    private long all_dst_field_06 = 0L;
    private long all_dst_field_07 = 0L;
    private int all_dst_field_08 = 0;
    private int all_dst_field_09 = 0;
    private long all_dst_field_10 = 0L;
    private long all_dst_field_11 = 0L;
    private short all_dst_field_12 = (short) 0;
    private short all_dst_field_13 = (short) 0;
    private BigDecimal all_dst_field_14 = BigDecimal.ZERO;
    private BigDecimal all_dst_field_15 = BigDecimal.ZERO;
    private double all_dst_field_16 = 0.0;
    private float all_dst_field_17 = 0.0f;
    private int all_dst_field_18 = 0;
    private long all_dst_field_19 = 0L;
    private short all_dst_field_20 = (short) 0;
    private int all_dst_field_21 = 0;
    private long all_dst_field_22 = 0L;
    private short all_dst_field_23 = (short) 0;
    private float all_dst_field_24 = 0.0f;
    private double all_dst_field_25 = 0.0;
    private BigDecimal all_dst_field_26 = BigDecimal.ZERO;
    private int all_dst_field_50 = 0;
    private int all_dst_field_51 = 0;
    private BigDecimal all_dst_field_52 = BigDecimal.ZERO;
    private int all_dst_field_53 = 0;
    private int all_dst_field_54 = 0;
    private int all_dst_field_55 = 0;
    private BigDecimal all_dst_field_56 = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(143);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_all_src = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 67).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ALL-SRC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_02 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-02").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_03 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-03").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_04 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-04").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_05 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-05").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_06 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-06").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_07 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-07").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_08 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-08").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_09 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-09").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_10 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-10").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_11 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-11").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_12 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-12").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_13 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(11, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-13").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_14 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-14").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_15 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-15").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("FIELD-16").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_17 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("FIELD-17").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_18 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-18").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_19 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(17, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-19").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_20 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-20").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_21 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-21").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_22 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-22").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_23 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-23").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_24 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("FIELD-24").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_25 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("FIELD-25").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_26 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(24, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("FIELD-26").picDigits(10).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_50 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-50").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_51 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-51").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_52 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(38, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FIELD-52").picDigits(11).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_53 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(44, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-53").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_54 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(48, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-54").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_55 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(52, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD-55").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_56 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(56, 11).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FIELD-56").picDigits(11).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_exptd_result = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(67, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("EXPTD-RESULT").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_all_dst = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(76, 67).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ALL-DST").build();


    private void para_main() {
        para_main_part0();
        para_main_part1();
        para_main_part2();
        para_main_part3();
    }
    private void para_main_part0() {
        all_src_field_02 = 1L;
        all_src_field_03 = 1L;
        all_src_field_04 = (byte) 1;
        all_src_field_05 = (byte) 1;
        all_src_field_06 = 1L;
        all_src_field_07 = 1L;
        all_src_field_08 = 1;
        all_src_field_09 = 1;
        all_src_field_10 = 1L;
        all_src_field_11 = 1L;
        all_src_field_12 = (short) 1;
        all_src_field_13 = (short) 1;
        all_src_field_14 = new BigDecimal("1");
        all_src_field_15 = new BigDecimal("1");
        all_src_field_16 = 1.0;
        all_src_field_17 = 1f;
        all_src_field_18 = 1;
        all_src_field_19 = 1L;
        all_src_field_20 = (short) 1;
        all_src_field_21 = 1;
        all_src_field_22 = 1L;
        all_src_field_23 = (short) 1;
        all_src_field_24 = 1f;
        all_src_field_25 = 1.0;
        all_src.setRefMod(1, 10, "0000000001");
        all_src_field_26 = new BigDecimal("1");
        all_src.setRefMod(11, 9, "000000001");
        all_src_field_50 = 1;
        all_src.setRefMod(20, 9, "000000001");
        all_src_field_51 = 1;
        all_src.setRefMod(29, 11, "00000000001");
        all_src_field_52 = new BigDecimal("1");
        all_src.setRefMod(40, 9, "000000001");
        all_src_field_53 = 1;
        all_src.setRefMod(49, 9, "000000001");
        all_src_field_54 = 1;
        all_src.setRefMod(58, 9, "000000001");
        all_src_field_55 = 1;
        all_src.setRefMod(67, 11, "00000000001");
        all_src_field_56 = new BigDecimal("1");
        test_pass_1();
        all_dst_field_02 = 2L;
        all_dst_field_03 = 2L;
        all_dst_field_04 = (byte) 2;
        all_dst_field_05 = (byte) 2;
        all_dst_field_06 = 2L;
        all_dst_field_07 = 2L;
        all_dst_field_08 = 2;
        all_dst_field_09 = 2;
        all_dst_field_10 = 2L;
        all_dst_field_11 = 2L;
        all_dst_field_12 = (short) 2;
        all_dst_field_13 = (short) 2;
        all_dst_field_14 = new BigDecimal("2");
        all_dst_field_15 = new BigDecimal("2");
        all_dst_field_16 = 2.0;
        all_dst_field_17 = 2f;
        all_dst_field_18 = 2;
        all_dst_field_19 = 2L;
        all_dst_field_20 = (short) 2;
        all_dst_field_21 = 2;
        all_dst_field_22 = 2L;
        all_dst_field_23 = (short) 2;
        all_dst_field_24 = 2f;
        all_dst_field_25 = 2.0;
        all_dst.setRefMod(1, 10, "0000000002");
        all_dst_field_26 = new BigDecimal("2");
        all_dst.setRefMod(11, 9, "000000002");
        all_dst_field_50 = 2;
        all_dst.setRefMod(20, 9, "000000002");
        all_dst_field_51 = 2;
        all_dst.setRefMod(29, 11, "00000000002");
        all_dst_field_52 = new BigDecimal("2");
        all_dst.setRefMod(40, 9, "000000002");
        all_dst_field_53 = 2;
        all_dst.setRefMod(49, 9, "000000002");
        all_dst_field_54 = 2;
        all_dst.setRefMod(58, 9, "000000002");
        all_dst_field_55 = 2;
        all_dst.setRefMod(67, 11, "00000000002");
        all_dst_field_56 = new BigDecimal("2");
        test_pass_2();
        all_src_field_02 = CobolIntrinsics.toBigDecimal(3).longValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(3), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_02).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_02).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_02).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_02).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_02).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_02).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_02).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_02).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_02).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_02).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_02).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_02).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_02).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_02).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_02).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_02).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_02), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_02).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_02), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_02), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_02).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_02), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_02).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_02).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_02), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_02), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_02), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_02), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_02), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_02).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_02).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_02), 11, 2, true);
        test_pass_3();
        all_src_field_03 = CobolIntrinsics.toBigDecimal(4).longValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(4), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_03).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_03).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_03).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_03).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_03).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_03).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_03).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_03).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_03).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_03).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_03).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_03).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_03).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_03).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_03).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_03).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_03), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_03).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_03), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_03), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_03).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_03), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_03).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_03).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_03), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_03), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_03), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_03), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_03), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_03).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_03).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_03), 11, 2, true);
        test_pass_3();
        all_src_field_04 = (byte) CobolIntrinsics.toBigDecimal(5).byteValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(5), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_04).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_04).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_04).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_04).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_04).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_04).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_04).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_04).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_04).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_04).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_04).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_04).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_04).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_04).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_04).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_04).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_04), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_04).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_04), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_04), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_04).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_04), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_04).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_04).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_04), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_04), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_04), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_04), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_04), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_04).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_04).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_04), 11, 2, true);
        test_pass_3();
        all_src_field_05 = (byte) CobolIntrinsics.toBigDecimal(6).byteValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(6), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_05).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_05).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_05).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_05).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_05).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_05).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_05).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_05).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_05).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_05).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_05).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_05).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_05).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_05).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_05).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_05).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_05), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_05).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_05), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_05), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_05).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_05), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_05).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_05).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_05), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_05), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_05), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_05), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_05), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_05).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_05).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_05), 11, 2, true);
        test_pass_3();
        all_src_field_06 = CobolIntrinsics.toBigDecimal(7).longValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(7), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_06).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_06).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_06).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_06).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_06).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_06).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_06).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_06).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_06).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_06).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_06).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_06).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_06).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_06).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_06).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_06).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_06), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_06).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_06), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_06), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_06).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_06), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_06).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_06).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_06), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_06), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_06), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_06), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_06), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_06).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_06).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_06), 11, 2, true);
        test_pass_3();
        all_src_field_07 = CobolIntrinsics.toBigDecimal(8).longValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(8), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_07).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_07).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_07).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_07).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_07).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_07).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_07).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_07).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_07).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_07).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_07).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_07).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_07).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_07).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_07).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_07).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_07), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_07).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_07), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_07), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_07).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_07), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_07).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_07).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_07), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_07), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_07), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_07), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_07), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_07).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_07).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_07), 11, 2, true);
        test_pass_3();
        all_src_field_08 = (int) CobolIntrinsics.toBigDecimal(9).intValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(9), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_08).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_08).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_08).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_08).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_08).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_08).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_08).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_08).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_08).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_08).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_08).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_08).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_08).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_08).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_08).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_08).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_08), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_08).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_08), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_08), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_08).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_08), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_08).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_08).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_08), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_08), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_08), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_08), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_08), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_08).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_08).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_08), 11, 2, true);
        test_pass_3();
        all_src_field_09 = (int) CobolIntrinsics.toBigDecimal(10).intValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(10), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_09).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_09).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_09).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_09).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_09).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_09).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_09).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_09).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_09).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_09).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_09).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_09).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_09).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_09).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_09).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_09).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_09), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_09).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_09), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_09), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_09).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_09), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_09).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_09).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_09), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_09), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_09), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_09), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_09), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_09).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_09).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_09), 11, 2, true);
        test_pass_3();
        all_src_field_10 = CobolIntrinsics.toBigDecimal(11).longValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(11), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_10).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_10).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_10).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_10).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_10).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_10).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_10).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_10).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_10).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_10).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_10).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_10).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_10).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_10).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_10).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_10).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_10), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_10).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_10), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_10), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_10).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_10), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_10).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_10).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_10), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_10), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_10), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_10), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_10), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_10).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_10).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_10), 11, 2, true);
        test_pass_3();
        all_src_field_11 = CobolIntrinsics.toBigDecimal(12).longValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(12), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_11).longValue();
    }
    private void para_main_part1() {
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_11).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_11).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_11).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_11).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_11).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_11).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_11).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_11).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_11).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_11).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_11).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_11).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_11).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_11).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_11).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_11), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_11).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_11), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_11), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_11).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_11), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_11).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_11).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_11), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_11), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_11), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_11), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_11), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_11).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_11).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_11), 11, 2, true);
        test_pass_3();
        all_src_field_12 = (short) CobolIntrinsics.toBigDecimal(13).shortValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(13), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_12).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_12).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_12).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_12).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_12).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_12).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_12).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_12).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_12).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_12).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_12).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_12).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_12).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_12).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_12).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_12).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_12), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_12).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_12), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_12), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_12).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_12), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_12).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_12).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_12), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_12), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_12), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_12), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_12), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_12).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_12).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_12), 11, 2, true);
        test_pass_3();
        all_src_field_13 = (short) CobolIntrinsics.toBigDecimal(14).shortValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(14), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_13).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_13).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_13).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_13).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_13).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_13).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_13).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_13).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_13).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_13).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_13).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_13).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_13).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_13).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_13).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_13).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_13), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_13).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_13), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_13), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_13).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_13), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_13).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_13).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_13), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_13), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_13), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_13), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_13), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_13).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_13).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_13), 11, 2, true);
        test_pass_3();
        all_src_field_14 = CobolIntrinsics.toBigDecimal(15).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(15), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_14).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_14).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_14).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_14).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_14).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_14).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_14).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_14).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_14).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_14).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_14).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_14).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_14).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_14).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_14).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_14).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_14), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_14).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_14), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_14), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_14).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_14), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_14).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_14).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_14), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_14), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_14), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_14), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_14), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_14).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_14).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_14), 11, 2, true);
        test_pass_3();
        all_src_field_15 = CobolIntrinsics.toBigDecimal(16).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(16), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_15).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_15).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_15).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_15).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_15).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_15).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_15).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_15).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_15).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_15).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_15).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_15).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_15).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_15).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_15).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_15).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_15), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_15).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_15), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_15), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_15).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_15), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_15).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_15).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_15), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_15), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_15), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_15), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_15), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_15).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_15).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_15), 11, 2, true);
        test_pass_3();
        all_src_field_16 = Double.parseDouble(String.valueOf(17).trim());
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(17), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_16).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_16).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_16).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_16).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_16).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_16).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_16).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_16).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_16).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_16).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_16).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_16).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_16).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_16).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_16).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_16).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_16), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_16).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_16), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_16), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_16).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_16), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_16).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_16).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_16), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_16), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_16), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_16), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_16), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_16).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_16).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_16), 11, 2, true);
        test_pass_3();
        all_src_field_17 = (float) Double.parseDouble(String.valueOf(18).trim());
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(18), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_17).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_17).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_17).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_17).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_17).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_17).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_17).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_17).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_17).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_17).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_17).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_17).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_17).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_17).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_17).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_17).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_17), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_17).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_17), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_17), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_17).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_17), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_17).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_17).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_17), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_17), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_17), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_17), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_17), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_17).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_17).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_17), 11, 2, true);
        test_pass_3();
        all_src_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(19), 10);
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(19), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_18).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_18).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_18).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_18).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_18).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_18).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_18).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_18).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_18).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_18).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_18).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_18).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_18).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_18).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_18).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_18).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_18), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_18).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_18), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_18), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_18).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_18), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_18).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_18).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_18), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_18), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_18), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_18), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_18), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_18).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_18).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_18), 11, 2, true);
        test_pass_3();
        all_src_field_19 = CobolIntrinsics.toBigDecimal(20).longValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(20), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_19).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_19).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_19).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_19).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_19).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_19).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_19).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_19).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_19).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_19).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_19).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_19).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_19).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_19).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_19).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_19).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_19), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_19).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_19), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_19), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_19).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_19), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_19).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_19).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_19), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_19), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_19), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_19), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_19), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_19).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_19).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_19), 11, 2, true);
        test_pass_3();
        all_src_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(21), 5);
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(21), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_20).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_20).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_20).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_20).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_20).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_20).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_20).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_20).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_20).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_20).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_20).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_20).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_20).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_20).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_20).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_20).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_20), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_20).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_20), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_20), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_20).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_20), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_20).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_20).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_20), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_20), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_20), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_20), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_20), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_20).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_20).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_20), 11, 2, true);
        test_pass_3();
        all_src_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(22), 10));
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(22), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_21).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_21).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_21).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_21).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_21).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_21).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_21).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_21).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_21).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_21).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_21).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_21).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_21).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_21).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_21).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_21).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_21), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_21).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_21), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_21), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_21).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_21), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_21).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_21).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_21), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_21), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_21), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_21), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_21), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_21).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_21).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_21), 11, 2, true);
        test_pass_3();
        all_src_field_22 = CobolIntrinsics.toBigDecimal(23).longValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(23), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_22).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_22).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_22).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_22).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_22).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_22).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_22).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_22).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_22).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_22).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_22).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_22).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_22).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_22).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_22).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_22).trim());
    }
    private void para_main_part2() {
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_22), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_22).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_22), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_22), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_22).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_22), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_22).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_22).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_22), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_22), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_22), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_22), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_22), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_22).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_22).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_22), 11, 2, true);
        test_pass_3();
        all_src_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(24), 5));
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(24), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_23).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_23).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_23).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_23).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_23).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_23).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_23).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_23).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_23).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_23).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_23).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_23).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_23).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_23).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_23).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_23).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_23), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_23).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_23), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_23), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_23).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_23), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_23).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_23).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_23), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_23), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_23), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_23), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_23), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_23).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_23).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_23), 11, 2, true);
        test_pass_3();
        all_src_field_24 = (float) Double.parseDouble(String.valueOf(25).trim());
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(25), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_24).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_24).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_24).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_24).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_24).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_24).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_24).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_24).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_24).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_24).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_24).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_24).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_24).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_24).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_24).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_24).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_24), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_24).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_24), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_24), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_24).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_24), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_24).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_24).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_24), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_24), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_24), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_24), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_24), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_24).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_24).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_24), 11, 2, true);
        test_pass_3();
        all_src_field_25 = Double.parseDouble(String.valueOf(26).trim());
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(26), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_25).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_25).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_25).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_25).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_25).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_25).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_25).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_25).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_25).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_25).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_25).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_25).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_25).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_25).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_25).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_25).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_25), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_25).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_25), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_25), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_25).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_25), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_25).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_25).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_25), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_25), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_25), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_25), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_25), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_25).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_25).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_25), 11, 2, true);
        test_pass_3();
        all_src_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(27), 10, 0, false);
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(27), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_26).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_26).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_26).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_26).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_26).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_26).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_26).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_26).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_26).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_26).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_26).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_26).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_26).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_26).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_26).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_26).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_26), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_26).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_26), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_26), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_26).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_26), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_26).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_26).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_26), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_26), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_26), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_26), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_26), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_26).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_26).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_26), 11, 2, true);
        test_pass_3();
        all_src_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(50), 9);
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(50), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_50).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_50).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_50).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_50).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_50).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_50).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_50).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_50).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_50).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_50).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_50).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_50).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_50).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_50).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_50).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_50).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_50), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_50).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_50), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_50), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_50).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_50), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_50).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_50).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_50), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_50), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_50), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_50), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_50), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_50).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_50).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_50), 11, 2, true);
        test_pass_3();
        all_src_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(51), 9);
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(51), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_51).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_51).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_51).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_51).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_51).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_51).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_51).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_51).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_51).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_51).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_51).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_51).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_51).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_51).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_51).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_51).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_51), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_51).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_51), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_51), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_51).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_51), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_51).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_51).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_51), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_51), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_51), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_51), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_51), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_51).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_51).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_51), 11, 2, true);
        test_pass_3();
        all_src_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(52), 11, 2, true);
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(52), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_52).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_52).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_52).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_52).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_52).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_52).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_52).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_52).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_52).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_52).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_52).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_52).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_52).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_52).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_52).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_52).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_52), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_52).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_52), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_52), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_52).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_52), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_52).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_52).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_52), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_52), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_52), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_52), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_52), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_52).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_52).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_52), 11, 2, true);
        test_pass_3();
        all_src_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(53), 9);
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(53), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_53).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_53).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_53).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_53).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_53).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_53).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_53).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_53).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_53).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_53).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_53).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_53).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_53).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_53).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_53).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_53).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_53), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_53).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_53), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_53), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_53).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_53), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_53).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_53).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_53), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_53), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_53), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_53), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_53), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_53).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_53).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_53), 11, 2, true);
        test_pass_3();
        all_src_field_54 = (int) CobolIntrinsics.toBigDecimal(54).intValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(54), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_54).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_54).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_54).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_54).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_54).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_54).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_54).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_54).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_54).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_54).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_54).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_54).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_54).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_54).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_54).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_54).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_54), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_54).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_54), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_54), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_54).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_54), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_54).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_54).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_54), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_54), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_54), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_54), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_54), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_54).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_54).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_54), 11, 2, true);
        test_pass_3();
        all_src_field_55 = (int) CobolIntrinsics.toBigDecimal(55).intValue();
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(55), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_55).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_55).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_55).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_55).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_55).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_55).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_55).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_55).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_55).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_55).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_55).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_55).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_55).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_55).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_55).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_55).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_55), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_55).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_55), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_55), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_55).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_55), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_55).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_55).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_55), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_55), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_55), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_55), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_55), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_55).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_55).intValue();
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_55), 11, 2, true);
        test_pass_3();
        all_src_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(56), 11, 2, true);
        exptd_result = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(56), 9));
        all_dst_field_02 = CobolIntrinsics.toBigDecimal(all_src_field_56).longValue();
        all_dst_field_03 = CobolIntrinsics.toBigDecimal(all_src_field_56).longValue();
        all_dst_field_04 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_56).byteValue();
        all_dst_field_05 = (byte) CobolIntrinsics.toBigDecimal(all_src_field_56).byteValue();
        all_dst_field_06 = CobolIntrinsics.toBigDecimal(all_src_field_56).longValue();
        all_dst_field_07 = CobolIntrinsics.toBigDecimal(all_src_field_56).longValue();
        all_dst_field_08 = (int) CobolIntrinsics.toBigDecimal(all_src_field_56).intValue();
        all_dst_field_09 = (int) CobolIntrinsics.toBigDecimal(all_src_field_56).intValue();
        all_dst_field_10 = CobolIntrinsics.toBigDecimal(all_src_field_56).longValue();
        all_dst_field_11 = CobolIntrinsics.toBigDecimal(all_src_field_56).longValue();
        all_dst_field_12 = (short) CobolIntrinsics.toBigDecimal(all_src_field_56).shortValue();
        all_dst_field_13 = (short) CobolIntrinsics.toBigDecimal(all_src_field_56).shortValue();
        all_dst_field_14 = CobolIntrinsics.toBigDecimal(all_src_field_56).round(new java.math.MathContext(16, RoundingMode.HALF_EVEN));
        all_dst_field_15 = CobolIntrinsics.toBigDecimal(all_src_field_56).round(new java.math.MathContext(34, RoundingMode.HALF_EVEN));
        all_dst_field_16 = Double.parseDouble(String.valueOf(all_src_field_56).trim());
        all_dst_field_17 = (float) Double.parseDouble(String.valueOf(all_src_field_56).trim());
        all_dst_field_18 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_56), 10);
        all_dst_field_19 = CobolIntrinsics.toBigDecimal(all_src_field_56).longValue();
        all_dst_field_20 = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_56), 5);
        all_dst_field_21 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_56), 10));
        all_dst_field_22 = CobolIntrinsics.toBigDecimal(all_src_field_56).longValue();
        all_dst_field_23 = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_56), 5));
        all_dst_field_24 = (float) Double.parseDouble(String.valueOf(all_src_field_56).trim());
        all_dst_field_25 = Double.parseDouble(String.valueOf(all_src_field_56).trim());
        all_dst_field_26 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_56), 10, 0, false);
        all_dst_field_50 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_56), 9);
        all_dst_field_51 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_56), 9);
        all_dst_field_52 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_56), 11, 2, true);
        all_dst_field_53 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(all_src_field_56), 9);
        all_dst_field_54 = (int) CobolIntrinsics.toBigDecimal(all_src_field_56).intValue();
        all_dst_field_55 = (int) CobolIntrinsics.toBigDecimal(all_src_field_56).intValue();
    }
    private void para_main_part3() {
        all_dst_field_56 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(all_src_field_56), 11, 2, true);
        test_pass_3();
        return;
    }

    private void test_pass_1() {
        if (all_src_field_02 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-02 <" + CobolDisplay.formatPic(all_src_field_02, 20, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_03 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-03 <" + CobolDisplay.formatPic(all_src_field_03, 20, 0, false) + "> != 1");
        }
        if (all_src_field_04 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-04 <" + CobolDisplay.formatPic(all_src_field_04, 3, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_05 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-05 <" + CobolDisplay.formatPic(all_src_field_05, 3, 0, false) + "> != 1");
        }
        if (all_src_field_06 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-06 <" + CobolDisplay.formatPic(all_src_field_06, 20, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_07 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-07 <" + CobolDisplay.formatPic(all_src_field_07, 20, 0, false) + "> != 1");
        }
        if (all_src_field_08 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-08 <" + CobolDisplay.formatPic(all_src_field_08, 10, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_09 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-09 <" + CobolDisplay.formatPic(all_src_field_09, 10, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_10 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-10 <" + CobolDisplay.formatPic(all_src_field_10, 10, 0, false) + "> != 1");
        }
        if (all_src_field_11 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-11 <" + CobolDisplay.formatPic(all_src_field_11, 20, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_12 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-12 <" + CobolDisplay.formatPic(all_src_field_12, 5, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_13 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-13 <" + CobolDisplay.formatPic(all_src_field_13, 5, 0, false) + "> != 1");
        }
        if (all_src_field_14.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            CobolDisplay.display("PASS ONE: FIELD-14 <" + CobolDisplay.formatFloatDecimal(all_src_field_14, 16) + "> != 1");
        }
        if (all_src_field_15.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            CobolDisplay.display("PASS ONE: FIELD-15 <" + CobolDisplay.formatFloatDecimal(all_src_field_15, 34) + "> != 1");
        }
        if (all_src_field_16 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-16 <" + CobolDisplay.formatFloatLong(all_src_field_16) + "> != 1");
        }
        if ((float)(all_src_field_17) != (float)(1)) {
            CobolDisplay.display("PASS ONE: FIELD-17 <" + CobolDisplay.formatFloatShort(all_src_field_17) + "> != 1");
        }
        if (all_src_field_18 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-18 <" + CobolDisplay.formatPic(all_src_field_18, 10, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_19 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-19 <" + CobolDisplay.formatPic(all_src_field_19, 18, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_20 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-20 <" + CobolDisplay.formatPic(all_src_field_20, 5, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_21 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-21 <" + CobolDisplay.formatPic(all_src_field_21, 10, 0, false) + "> != 1");
        }
        if (all_src_field_22 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-22 <" + CobolDisplay.formatPic(all_src_field_22, 20, 0, false) + "> != 1");
        }
        if (all_src_field_23 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-23 <" + CobolDisplay.formatPic(all_src_field_23, 5, 0, false) + "> != 1");
        }
        if ((float)(all_src_field_24) != (float)(1)) {
            CobolDisplay.display("PASS ONE: FIELD-24 <" + CobolDisplay.formatFloatShort(all_src_field_24) + "> != 1");
        }
        if (all_src_field_25 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-25 <" + CobolDisplay.formatFloatLong(all_src_field_25) + "> != 1");
        }
        if (all_src_field_26.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            CobolDisplay.display("PASS ONE: FIELD-26 <" + CobolDisplay.formatPic(all_src_field_26, 10, 0, false) + "> != 1");
        }
        if (all_src_field_50 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-50 <" + CobolDisplay.formatPic(all_src_field_50, 9, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_51 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-51 <" + CobolDisplay.formatPic(all_src_field_51, 9, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_52.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            CobolDisplay.display("PASS ONE: FIELD-52 <" + CobolDisplay.formatPic(all_src_field_52, 11, 2, true, "LEADING") + "> != 1");
        }
        if (all_src_field_53 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-53 <" + CobolDisplay.formatPic(all_src_field_52, 11, 2, true, "LEADING") + "> != 1");
        }
        if (all_src_field_54 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-54 <" + CobolDisplay.formatPic(all_src_field_54, 10, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_55 != 1) {
            CobolDisplay.display("PASS ONE: FIELD-55 <" + CobolDisplay.formatPic(all_src_field_55, 10, 0, true, "LEADING") + "> != 1");
        }
        if (all_src_field_56.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            CobolDisplay.display("PASS ONE: FIELD-56 <" + CobolDisplay.formatPic(all_src_field_56, 11, 2, true, "LEADING") + "> != 1");
        }
    }

    private void test_pass_2() {
        if (all_dst_field_02 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-02 <" + CobolDisplay.formatPic(all_dst_field_02, 20, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_03 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-03 <" + CobolDisplay.formatPic(all_dst_field_03, 20, 0, false) + "> != 2");
        }
        if (all_dst_field_04 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-04 <" + CobolDisplay.formatPic(all_dst_field_04, 3, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_05 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-05 <" + CobolDisplay.formatPic(all_dst_field_05, 3, 0, false) + "> != 2");
        }
        if (all_dst_field_06 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-06 <" + CobolDisplay.formatPic(all_dst_field_06, 20, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_07 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-07 <" + CobolDisplay.formatPic(all_dst_field_07, 20, 0, false) + "> != 2");
        }
        if (all_dst_field_08 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-08 <" + CobolDisplay.formatPic(all_dst_field_08, 10, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_09 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-09 <" + CobolDisplay.formatPic(all_dst_field_09, 10, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_10 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-10 <" + CobolDisplay.formatPic(all_dst_field_10, 10, 0, false) + "> != 2");
        }
        if (all_dst_field_11 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-11 <" + CobolDisplay.formatPic(all_dst_field_11, 20, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_12 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-12 <" + CobolDisplay.formatPic(all_dst_field_12, 5, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_13 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-13 <" + CobolDisplay.formatPic(all_dst_field_13, 5, 0, false) + "> != 2");
        }
        if (all_dst_field_14.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("PASS TWO: FIELD-14 <" + CobolDisplay.formatFloatDecimal(all_dst_field_14, 16) + "> != 2");
        }
        if (all_dst_field_15.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("PASS TWO: FIELD-15 <" + CobolDisplay.formatFloatDecimal(all_dst_field_15, 34) + "> != 2");
        }
        if (all_dst_field_16 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-16 <" + CobolDisplay.formatFloatLong(all_dst_field_16) + "> != 2");
        }
        if ((float)(all_dst_field_17) != (float)(2)) {
            CobolDisplay.display("PASS TWO: FIELD-17 <" + CobolDisplay.formatFloatShort(all_dst_field_17) + "> != 2");
        }
        if (all_dst_field_18 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-18 <" + CobolDisplay.formatPic(all_dst_field_18, 10, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_19 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-19 <" + CobolDisplay.formatPic(all_dst_field_19, 18, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_20 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-20 <" + CobolDisplay.formatPic(all_dst_field_20, 5, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_21 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-21 <" + CobolDisplay.formatPic(all_dst_field_21, 10, 0, false) + "> != 2");
        }
        if (all_dst_field_22 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-22 <" + CobolDisplay.formatPic(all_dst_field_22, 20, 0, false) + "> != 2");
        }
        if (all_dst_field_23 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-23 <" + CobolDisplay.formatPic(all_dst_field_23, 5, 0, false) + "> != 2");
        }
        if ((float)(all_dst_field_24) != (float)(2)) {
            CobolDisplay.display("PASS TWO: FIELD-24 <" + CobolDisplay.formatFloatShort(all_dst_field_24) + "> != 2");
        }
        if (all_dst_field_25 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-25 <" + CobolDisplay.formatFloatLong(all_dst_field_25) + "> != 2");
        }
        if (all_dst_field_26.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("PASS TWO: FIELD-26 <" + CobolDisplay.formatPic(all_dst_field_26, 10, 0, false) + "> != 2");
        }
        if (all_dst_field_50 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-50 <" + CobolDisplay.formatPic(all_dst_field_50, 9, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_51 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-51 <" + CobolDisplay.formatPic(all_dst_field_51, 9, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_52.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("PASS TWO: FIELD-52 <" + CobolDisplay.formatPic(all_dst_field_52, 11, 2, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_53 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-53 <" + CobolDisplay.formatPic(all_dst_field_52, 11, 2, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_54 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-54 <" + CobolDisplay.formatPic(all_dst_field_54, 10, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_55 != 2) {
            CobolDisplay.display("PASS TWO: FIELD-55 <" + CobolDisplay.formatPic(all_dst_field_55, 10, 0, true, "LEADING") + "> != 2");
        }
        if (all_dst_field_56.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            CobolDisplay.display("PASS TWO: FIELD-56 <" + CobolDisplay.formatPic(all_dst_field_56, 11, 2, true, "LEADING") + "> != 2");
        }
    }

    private void test_pass_3() {
        if (all_dst_field_02 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-02 <" + CobolDisplay.formatPic(all_dst_field_02, 20, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_03 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-03 <" + CobolDisplay.formatPic(all_dst_field_03, 20, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_04 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-04 <" + CobolDisplay.formatPic(all_dst_field_04, 3, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_05 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-05 <" + CobolDisplay.formatPic(all_dst_field_05, 3, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_06 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-06 <" + CobolDisplay.formatPic(all_dst_field_06, 20, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_07 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-07 <" + CobolDisplay.formatPic(all_dst_field_07, 20, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_08 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-08 <" + CobolDisplay.formatPic(all_dst_field_08, 10, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_09 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-09 <" + CobolDisplay.formatPic(all_dst_field_09, 10, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_10 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-10 <" + CobolDisplay.formatPic(all_dst_field_10, 10, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_11 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-11 <" + CobolDisplay.formatPic(all_dst_field_11, 20, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_12 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-12 <" + CobolDisplay.formatPic(all_dst_field_12, 5, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_13 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-13 <" + CobolDisplay.formatPic(all_dst_field_13, 5, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_14.compareTo(CobolIntrinsics.toBigDecimal(exptd_result)) != 0) {
            CobolDisplay.display("PASS THREE: FIELD-14 <" + CobolDisplay.formatFloatDecimal(all_dst_field_14, 16) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_15.compareTo(CobolIntrinsics.toBigDecimal(exptd_result)) != 0) {
            CobolDisplay.display("PASS THREE: FIELD-15 <" + CobolDisplay.formatFloatDecimal(all_dst_field_15, 34) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_16 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-16 <" + CobolDisplay.formatFloatLong(all_dst_field_16) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (!(CobolIntrinsics.floatEqUlp1((float)(all_dst_field_17), (float)(exptd_result)))) {
            CobolDisplay.display("PASS THREE: FIELD-17 <" + CobolDisplay.formatFloatShort(all_dst_field_17) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_18 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-18 <" + CobolDisplay.formatPic(all_dst_field_18, 10, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_19 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-19 <" + CobolDisplay.formatPic(all_dst_field_19, 18, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_20 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-20 <" + CobolDisplay.formatPic(all_dst_field_20, 5, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_21 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-21 <" + CobolDisplay.formatPic(all_dst_field_21, 10, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_22 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-22 <" + CobolDisplay.formatPic(all_dst_field_22, 20, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_23 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-23 <" + CobolDisplay.formatPic(all_dst_field_23, 5, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (!(CobolIntrinsics.floatEqUlp1((float)(all_dst_field_24), (float)(exptd_result)))) {
            CobolDisplay.display("PASS THREE: FIELD-24 <" + CobolDisplay.formatFloatShort(all_dst_field_24) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_25 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-25 <" + CobolDisplay.formatFloatLong(all_dst_field_25) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_26.compareTo(CobolIntrinsics.toBigDecimal(exptd_result)) != 0) {
            CobolDisplay.display("PASS THREE: FIELD-26 <" + CobolDisplay.formatPic(all_dst_field_26, 10, 0, false) + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_50 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-50 <" + CobolDisplay.formatPic(all_dst_field_50, 9, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_51 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-51 <" + CobolDisplay.formatPic(all_dst_field_51, 9, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_52.compareTo(CobolIntrinsics.toBigDecimal(exptd_result)) != 0) {
            CobolDisplay.display("PASS THREE: FIELD-52 <" + CobolDisplay.formatPic(all_dst_field_52, 11, 2, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_53 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-53 <" + CobolDisplay.formatPic(all_dst_field_52, 11, 2, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_54 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-54 <" + CobolDisplay.formatPic(all_dst_field_54, 10, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_55 != exptd_result) {
            CobolDisplay.display("PASS THREE: FIELD-55 <" + CobolDisplay.formatPic(all_dst_field_55, 10, 0, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
        if (all_dst_field_56.compareTo(CobolIntrinsics.toBigDecimal(exptd_result)) != 0) {
            CobolDisplay.display("PASS THREE: FIELD-56 <" + CobolDisplay.formatPic(all_dst_field_56, 11, 2, true, "LEADING") + "> != <" + CobolDisplay.formatPic(exptd_result, 9, 0, false) + ">");
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("MoveTestCobMove", "", "MoveTestCobMove.cob");
        CobolProgram.pushActive("MoveTestCobMove");
        try {
            CobolProgram.registerCallAlias("MoveTestCobMove", "RunFundamental110MoveBetweenUsages");
            CobolProgram.registerCallAlias("movetestcobmove", "RunFundamental110MoveBetweenUsages");
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
        new RunFundamental110MoveBetweenUsages().run();
    }
}
