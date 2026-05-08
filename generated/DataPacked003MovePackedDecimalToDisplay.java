package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked003MovePackedDecimalToDisplay extends CobolProgram {
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
    private BigDecimal p_s99v99 = new BigDecimal("1.23");
    private BigDecimal p_n99v99 = new BigDecimal("-1.32");
    private BigDecimal p_9v99 = new BigDecimal("1.1");
    private BigDecimal p_s99 = new BigDecimal("12");
    private BigDecimal p_99 = new BigDecimal("2");
    private BigDecimal p_p99 = new BigDecimal("0.02");
    private BigDecimal p_9pp = new BigDecimal("200");
    private BigDecimal p_938 = new BigDecimal("12345678901234567890123456789012345678");
    private BigDecimal d_s99v99 = BigDecimal.ZERO;
    private BigDecimal d_99v9 = BigDecimal.ZERO;
    private int d_s999 = 0;
    private int d_99 = 0;
    private BigDecimal d_p9 = BigDecimal.ZERO;
    private BigDecimal d_9p = BigDecimal.ZERO;
    private int filler_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(50);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_s99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-S99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_n99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-N99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_9v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-9V99").picDigits(3).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_s99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-S99").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_p99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-P99").picDigits(2).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_9pp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-9PP").picDigits(1).picScale(-2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_938 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P-938").picDigits(38).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_s99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(35, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-S99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_99v9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(39, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-99V9").picDigits(3).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_s999 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(42, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-S999").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(45, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_p9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(47, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-P9").picDigits(1).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_9p = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(48, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-9P").picDigits(1).picScale(-1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(49, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString do_disp = new CobolString(256); // fallback

    private void para_main() {
        do_check();
        return;
    }

    private void do_check() {
        d_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_938), 2));
        if (d_99 != 78) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99: " + CobolDisplay.formatPic(d_99, 2, 0, false));
            }
        }
        d_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_s99v99), 4, 2, true);
        if (d_s99v99.compareTo(new BigDecimal("1.23")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S99V99 1: " + CobolDisplay.formatPic(d_s99v99, 4, 2, true, "LEADING"));
            }
        }
        d_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_n99v99), 4, 2, true);
        if (d_s99v99.compareTo(new BigDecimal("-1.32")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S99V99 2: " + CobolDisplay.formatPic(d_s99v99, 4, 2, true, "LEADING"));
            }
        }
        d_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_9v99), 4, 2, true);
        if (d_s99v99.compareTo(new BigDecimal("1.1")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S99V99 3: " + CobolDisplay.formatPic(d_s99v99, 4, 2, true, "LEADING"));
            }
        }
        d_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_s99), 4, 2, true);
        if (d_s99v99.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S99V99 4: " + CobolDisplay.formatPic(d_s99v99, 4, 2, true, "LEADING"));
            }
        }
        d_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_99), 4, 2, true);
        if (d_s99v99.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S99V99 5: " + CobolDisplay.formatPic(d_s99v99, 4, 2, true, "LEADING"));
            }
        }
        d_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_p99), 4, 2, true);
        if (d_s99v99.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S99V99 6: " + CobolDisplay.formatPic(d_s99v99, 4, 2, true, "LEADING"));
            }
        }
        d_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_9pp), 4, 2, true);
        if (d_s99v99.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S99V99 7: " + CobolDisplay.formatPic(d_s99v99, 4, 2, true, "LEADING"));
            }
        }
        d_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_s99v99), 3, 1, false);
        if (d_99v9.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99V99  1: " + CobolDisplay.formatPic(d_99v9, 3, 1, false));
            }
        }
        d_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_n99v99), 3, 1, false);
        if (d_99v9.compareTo(new BigDecimal("1.3")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99V99  2: " + CobolDisplay.formatPic(d_99v9, 3, 1, false));
            }
        }
        d_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_9v99), 3, 1, false);
        if (d_99v9.compareTo(new BigDecimal("1.1")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99V99  3: " + CobolDisplay.formatPic(d_99v9, 3, 1, false));
            }
        }
        d_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_s99), 3, 1, false);
        if (d_99v9.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99V99  4: " + CobolDisplay.formatPic(d_99v9, 3, 1, false));
            }
        }
        d_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_99), 3, 1, false);
        if (d_99v9.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99V99  5: " + CobolDisplay.formatPic(d_99v9, 3, 1, false));
            }
        }
        d_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_p99), 3, 1, false);
        if (d_99v9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99V99  6: " + CobolDisplay.formatPic(d_99v9, 3, 1, false));
            }
        }
        d_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(p_9pp), 3, 1, false);
        if (d_99v9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99V99  7: " + CobolDisplay.formatPic(d_99v9, 3, 1, false));
            }
        }
        d_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_s99v99), 3);
        if (d_s999 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S999   1: " + CobolDisplay.formatPic(d_s999, 3, 0, true, "LEADING"));
            }
        }
        d_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_n99v99), 3);
        if (d_s999 != -1) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S999   2: " + CobolDisplay.formatPic(d_s999, 3, 0, true, "LEADING"));
            }
        }
        d_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_9v99), 3);
        if (d_s999 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S999   3: " + CobolDisplay.formatPic(d_s999, 3, 0, true, "LEADING"));
            }
        }
        d_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_s99), 3);
        if (d_s999 != 12) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S999   4: " + CobolDisplay.formatPic(d_s999, 3, 0, true, "LEADING"));
            }
        }
        d_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_99), 3);
        if (d_s999 != 2) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S999   5: " + CobolDisplay.formatPic(d_s999, 3, 0, true, "LEADING"));
            }
        }
        d_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_p99), 3);
        if (d_s999 != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S999   6: " + CobolDisplay.formatPic(d_s999, 3, 0, true, "LEADING"));
            }
        }
        d_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_9pp), 3);
        if (d_s999 != 200) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-S999   7: " + CobolDisplay.formatPic(d_s999, 3, 0, true, "LEADING"));
            }
        }
        d_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_s99v99), 2));
        if (d_99 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99     1: " + CobolDisplay.formatPic(d_99, 2, 0, false));
            }
        }
        d_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_n99v99), 2));
        if (d_99 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99     2: " + CobolDisplay.formatPic(d_99, 2, 0, false));
            }
        }
        d_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_9v99), 2));
        if (d_99 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99     3: " + CobolDisplay.formatPic(d_99, 2, 0, false));
            }
        }
        d_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_s99), 2));
        if (d_99 != 12) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99     4: " + CobolDisplay.formatPic(d_99, 2, 0, false));
            }
        }
        d_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_99), 2));
        if (d_99 != 2) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99     5: " + CobolDisplay.formatPic(d_99, 2, 0, false));
            }
        }
        d_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_p99), 2));
        if (d_99 != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99     6: " + CobolDisplay.formatPic(d_99, 2, 0, false));
            }
        }
        d_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(p_9pp), 2));
        if (d_99 != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-99     7: " + CobolDisplay.formatPic(d_99, 2, 0, false));
            }
        }
        d_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_s99v99), 1, 1, true).abs();
        if (d_p9.compareTo(new BigDecimal("0.03")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-P9     1: " + CobolDisplay.formatPicScaled(d_p9, 1, 1, true, false));
            }
        }
        d_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_n99v99), 1, 1, true).abs();
        if (d_p9.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-P9     2: " + CobolDisplay.formatPicScaled(d_p9, 1, 1, true, false));
            }
        }
        d_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_9v99), 1, 1, true).abs();
        if (d_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-P9     3: " + CobolDisplay.formatPicScaled(d_p9, 1, 1, true, false));
            }
        }
        d_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_s99), 1, 1, true).abs();
        if (d_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-P9     4: " + CobolDisplay.formatPicScaled(d_p9, 1, 1, true, false));
            }
        }
        d_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_99), 1, 1, true).abs();
        if (d_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-P9     5: " + CobolDisplay.formatPicScaled(d_p9, 1, 1, true, false));
            }
        }
        d_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_p99), 1, 1, true).abs();
        if (d_p9.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-P9     6: " + CobolDisplay.formatPicScaled(d_p9, 1, 1, true, false));
            }
        }
        d_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_9pp), 1, 1, true).abs();
        if (d_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-P9     7: " + CobolDisplay.formatPicScaled(d_p9, 1, 1, true, false));
            }
        }
        d_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_s99v99), 1, 1, false).abs();
        if (d_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-9P     1: " + CobolDisplay.formatPicScaled(d_9p, 1, 1, false, false));
            }
        }
        d_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_n99v99), 1, 1, false).abs();
        if (d_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-9P     2: " + CobolDisplay.formatPicScaled(d_9p, 1, 1, false, false));
            }
        }
        d_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_9v99), 1, 1, false).abs();
        if (d_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-9P     3: " + CobolDisplay.formatPicScaled(d_9p, 1, 1, false, false));
            }
        }
        d_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_s99), 1, 1, false).abs();
        if (d_9p.compareTo(CobolIntrinsics.toBigDecimal(10)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-9P     4: " + CobolDisplay.formatPicScaled(d_9p, 1, 1, false, false));
            }
        }
        d_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_99), 1, 1, false).abs();
        if (d_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-9P     5: " + CobolDisplay.formatPicScaled(d_9p, 1, 1, false, false));
            }
        }
        d_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_p99), 1, 1, false).abs();
        if (d_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-9P     6: " + CobolDisplay.formatPicScaled(d_9p, 1, 1, false, false));
            }
        }
        d_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(p_9pp), 1, 1, false).abs();
        if (d_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("D-9P     7: " + CobolDisplay.formatPicScaled(d_9p, 1, 1, false, false));
            }
        }
        /* CONTINUE */
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked003MovePackedDecimalToDisplay");
            CobolProgram.registerCallAlias("prog", "DataPacked003MovePackedDecimalToDisplay");
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
        new DataPacked003MovePackedDecimalToDisplay().run();
    }
}
