package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked004MoveDisplayToPackedDecimal extends CobolProgram {
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
    private CobolString filler_1 = new CobolString(2, "12");
    private BigDecimal d_s99v99 = new BigDecimal("1.23");
    private CobolString filler_2 = new CobolString(2, "34");
    private CobolString filler_3 = new CobolString(2, "12");
    private BigDecimal d_n99v99 = new BigDecimal("-1.32");
    private CobolString filler_4 = new CobolString(2, "34");
    private CobolString filler_5 = new CobolString(2, "12");
    private BigDecimal d_9v99 = new BigDecimal("1.1");
    private CobolString filler_6 = new CobolString(2, "34");
    private CobolString filler_7 = new CobolString(2, "12");
    private int d_s99 = 12;
    private CobolString filler_8 = new CobolString(2, "34");
    private CobolString filler_9 = new CobolString(2, "12");
    private int d_99 = 2;
    private CobolString filler_10 = new CobolString(2, "34");
    private CobolString filler_11 = new CobolString(2, "12");
    private BigDecimal d_p99 = new BigDecimal("0.02");
    private CobolString filler_12 = new CobolString(2, "34");
    private CobolString filler_13 = new CobolString(2, "12");
    private BigDecimal d_9pp = new BigDecimal("200");
    private CobolString filler_14 = new CobolString(2, "34");
    private BigDecimal p_s99v99 = BigDecimal.ZERO;
    private BigDecimal p_99v9 = BigDecimal.ZERO;
    private BigDecimal p_s999 = BigDecimal.ZERO;
    private BigDecimal p_99 = BigDecimal.ZERO;
    private BigDecimal p_p9 = BigDecimal.ZERO;
    private BigDecimal p_9p = BigDecimal.ZERO;
    private int filler_15 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(58);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_17 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_s99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-S99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_18 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_19 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_20 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_n99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-N99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_21 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_22 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_23 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_9v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-9V99").picDigits(3).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_24 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_25 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_26 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_s99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-S99").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_27 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_28 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_29 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_30 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(33, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_31 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(35, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_32 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(35, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_p99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(37, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-P99").picDigits(2).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_33 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(39, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_34 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(41, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_35 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(41, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_9pp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(43, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-9PP").picDigits(1).picScale(-2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_36 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(44, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_s99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(46, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-S99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_99v9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(49, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-99V9").picDigits(3).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_s999 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(51, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-S999").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(53, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_p9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(55, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-P9").picDigits(1).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_9p = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(56, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-9P").picDigits(1).picScale(-1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_37 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString do_disp = new CobolString(256); // fallback

    private void para_main() {
        do_check();
        return;
    }

    private void do_check() {
        p_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99v99), 4, 2, true);
        if (p_s99v99.compareTo(new BigDecimal("1.23")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S99V99 1: " + CobolDisplay.formatPic(p_s99v99, 4, 2, true, "LEADING"));
            }
        }
        p_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_n99v99), 4, 2, true);
        if (p_s99v99.compareTo(new BigDecimal("-1.32")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S99V99 2: " + CobolDisplay.formatPic(p_s99v99, 4, 2, true, "LEADING"));
            }
        }
        p_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9v99), 4, 2, true);
        if (p_s99v99.compareTo(new BigDecimal("1.1")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S99V99 3: " + CobolDisplay.formatPic(p_s99v99, 4, 2, true, "LEADING"));
            }
        }
        p_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99), 4, 2, true);
        if (p_s99v99.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S99V99 4: " + CobolDisplay.formatPic(p_s99v99, 4, 2, true, "LEADING"));
            }
        }
        p_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_99), 4, 2, true);
        if (p_s99v99.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S99V99 5: " + CobolDisplay.formatPic(p_s99v99, 4, 2, true, "LEADING"));
            }
        }
        p_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_p99), 4, 2, true);
        if (p_s99v99.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S99V99 6: " + CobolDisplay.formatPic(p_s99v99, 4, 2, true, "LEADING"));
            }
        }
        p_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9pp), 4, 2, true);
        if (p_s99v99.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S99V99 7: " + CobolDisplay.formatPic(p_s99v99, 4, 2, true, "LEADING"));
            }
        }
        p_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99v99), 3, 1, false);
        if (p_99v9.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99V9   1: " + CobolDisplay.formatPic(p_99v9, 3, 1, false));
            }
        }
        p_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_n99v99), 3, 1, false);
        if (p_99v9.compareTo(new BigDecimal("1.3")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99V9   2: " + CobolDisplay.formatPic(p_99v9, 3, 1, false));
            }
        }
        p_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9v99), 3, 1, false);
        if (p_99v9.compareTo(new BigDecimal("1.1")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99V9   3: " + CobolDisplay.formatPic(p_99v9, 3, 1, false));
            }
        }
        p_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99), 3, 1, false);
        if (p_99v9.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99V9   4: " + CobolDisplay.formatPic(p_99v9, 3, 1, false));
            }
        }
        p_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_99), 3, 1, false);
        if (p_99v9.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99V9   5: " + CobolDisplay.formatPic(p_99v9, 3, 1, false));
            }
        }
        p_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_p99), 3, 1, false);
        if (p_99v9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99V9   6: " + CobolDisplay.formatPic(p_99v9, 3, 1, false));
            }
        }
        p_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9pp), 3, 1, false);
        if (p_99v9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99V9   7: " + CobolDisplay.formatPic(p_99v9, 3, 1, false));
            }
        }
        p_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99v99), 3, 0, true);
        if (p_s999.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S999   1: " + CobolDisplay.formatPic(p_s999, 3, 0, true, "LEADING"));
            }
        }
        p_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_n99v99), 3, 0, true);
        if (p_s999.compareTo(CobolIntrinsics.toBigDecimal(-1)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S999   2: " + CobolDisplay.formatPic(p_s999, 3, 0, true, "LEADING"));
            }
        }
        p_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9v99), 3, 0, true);
        if (p_s999.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S999   3: " + CobolDisplay.formatPic(p_s999, 3, 0, true, "LEADING"));
            }
        }
        p_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99), 3, 0, true);
        if (p_s999.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S999   4: " + CobolDisplay.formatPic(p_s999, 3, 0, true, "LEADING"));
            }
        }
        p_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_99), 3, 0, true);
        if (p_s999.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S999   5: " + CobolDisplay.formatPic(p_s999, 3, 0, true, "LEADING"));
            }
        }
        p_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_p99), 3, 0, true);
        if (p_s999.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S999   6: " + CobolDisplay.formatPic(p_s999, 3, 0, true, "LEADING"));
            }
        }
        p_s999 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9pp), 3, 0, true);
        if (p_s999.compareTo(CobolIntrinsics.toBigDecimal(200)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-S999   7: " + CobolDisplay.formatPic(p_s999, 3, 0, true, "LEADING"));
            }
        }
        p_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99v99), 2, 0, false);
        if (p_99.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99     1: " + CobolDisplay.formatPic(p_99, 2, 0, false));
            }
        }
        p_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_n99v99), 2, 0, false);
        if (p_99.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99     2: " + CobolDisplay.formatPic(p_99, 2, 0, false));
            }
        }
        p_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9v99), 2, 0, false);
        if (p_99.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99     3: " + CobolDisplay.formatPic(p_99, 2, 0, false));
            }
        }
        p_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99), 2, 0, false);
        if (p_99.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99     4: " + CobolDisplay.formatPic(p_99, 2, 0, false));
            }
        }
        p_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_99), 2, 0, false);
        if (p_99.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99     5: " + CobolDisplay.formatPic(p_99, 2, 0, false));
            }
        }
        p_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_p99), 2, 0, false);
        if (p_99.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99     6: " + CobolDisplay.formatPic(p_99, 2, 0, false));
            }
        }
        p_99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9pp), 2, 0, false);
        if (p_99.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-99     7: " + CobolDisplay.formatPic(p_99, 2, 0, false));
            }
        }
        p_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_s99v99), 1, 1, true).abs();
        if (p_p9.compareTo(new BigDecimal("0.03")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-P9     1: " + CobolDisplay.formatPicScaled(p_p9, 1, 1, true, false));
            }
        }
        p_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_n99v99), 1, 1, true).abs();
        if (p_p9.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-P9     2: " + CobolDisplay.formatPicScaled(p_p9, 1, 1, true, false));
            }
        }
        p_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_9v99), 1, 1, true).abs();
        if (p_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-P9     3: " + CobolDisplay.formatPicScaled(p_p9, 1, 1, true, false));
            }
        }
        p_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_s99), 1, 1, true).abs();
        if (p_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-P9     4: " + CobolDisplay.formatPicScaled(p_p9, 1, 1, true, false));
            }
        }
        p_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_99), 1, 1, true).abs();
        if (p_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-P9     5: " + CobolDisplay.formatPicScaled(p_p9, 1, 1, true, false));
            }
        }
        p_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_p99), 1, 1, true).abs();
        if (p_p9.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-P9     6: " + CobolDisplay.formatPicScaled(p_p9, 1, 1, true, false));
            }
        }
        p_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_9pp), 1, 1, true).abs();
        if (p_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-P9     7: " + CobolDisplay.formatPicScaled(p_p9, 1, 1, true, false));
            }
        }
        p_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_s99v99), 1, 1, false).abs();
        if (p_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-9P     1: " + CobolDisplay.formatPicScaled(p_9p, 1, 1, false, false));
            }
        }
        p_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_n99v99), 1, 1, false).abs();
        if (p_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-9P     2: " + CobolDisplay.formatPicScaled(p_9p, 1, 1, false, false));
            }
        }
        p_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_9v99), 1, 1, false).abs();
        if (p_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-9P     3: " + CobolDisplay.formatPicScaled(p_9p, 1, 1, false, false));
            }
        }
        p_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_s99), 1, 1, false).abs();
        if (p_9p.compareTo(CobolIntrinsics.toBigDecimal(10)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-9P     4: " + CobolDisplay.formatPicScaled(p_9p, 1, 1, false, false));
            }
        }
        p_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_99), 1, 1, false).abs();
        if (p_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-9P     5: " + CobolDisplay.formatPicScaled(p_9p, 1, 1, false, false));
            }
        }
        p_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_p99), 1, 1, false).abs();
        if (p_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-9P     6: " + CobolDisplay.formatPicScaled(p_9p, 1, 1, false, false));
            }
        }
        p_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_9pp), 1, 1, false).abs();
        if (p_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_15 == 0) {
                CobolDisplay.display("P-9P     7: " + CobolDisplay.formatPicScaled(p_9p, 1, 1, false, false));
            }
        }
        /* CONTINUE */
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked004MoveDisplayToPackedDecimal");
            CobolProgram.registerCallAlias("prog", "DataPacked004MoveDisplayToPackedDecimal");
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
        new DataPacked004MoveDisplayToPackedDecimal().run();
    }
}
