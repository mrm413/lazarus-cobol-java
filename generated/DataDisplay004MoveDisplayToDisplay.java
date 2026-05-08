package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay004MoveDisplayToDisplay extends CobolProgram {
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
    private BigDecimal d_s99v99 = new BigDecimal("1.23");
    private BigDecimal d_n99v99 = new BigDecimal("-1.32");
    private BigDecimal d_9v99 = new BigDecimal("1.1");
    private int d_s99 = 12;
    private int d_99 = 2;
    private BigDecimal d_p99 = new BigDecimal("0.02");
    private BigDecimal d_9pp = new BigDecimal("200");
    private BigDecimal t_s99v99 = BigDecimal.ZERO;
    private BigDecimal t_99v9 = BigDecimal.ZERO;
    private int t_s999 = 0;
    private int t_99 = 0;
    private BigDecimal t_p9 = BigDecimal.ZERO;
    private BigDecimal t_9p = BigDecimal.ZERO;
    private int filler_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(33);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_s99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-S99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_n99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-N99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_9v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-9V99").picDigits(3).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_s99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(11, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-S99").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_p99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-P99").picDigits(2).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d_9pp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(17, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("D-9PP").picDigits(1).picScale(-2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t_s99v99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("T-S99V99").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t_99v9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("T-99V9").picDigits(3).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t_s999 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("T-S999").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t_99 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("T-99").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t_p9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("T-P9").picDigits(1).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t_9p = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("T-9P").picDigits(1).picScale(-1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString do_disp = new CobolString(256); // fallback

    private void para_main() {
        do_check();
        return;
    }

    private void do_check() {
        t_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99v99), 4, 2, true);
        if (t_s99v99.compareTo(new BigDecimal("1.23")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S99V99 1: " + CobolDisplay.formatPic(t_s99v99, 4, 2, true, "LEADING"));
            }
        }
        t_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_n99v99), 4, 2, true);
        if (t_s99v99.compareTo(new BigDecimal("-1.32")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S99V99 2: " + CobolDisplay.formatPic(t_s99v99, 4, 2, true, "LEADING"));
            }
        }
        t_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9v99), 4, 2, true);
        if (t_s99v99.compareTo(new BigDecimal("1.1")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S99V99 3: " + CobolDisplay.formatPic(t_s99v99, 4, 2, true, "LEADING"));
            }
        }
        t_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99), 4, 2, true);
        if (t_s99v99.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S99V99 4: " + CobolDisplay.formatPic(t_s99v99, 4, 2, true, "LEADING"));
            }
        }
        t_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_99), 4, 2, true);
        if (t_s99v99.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S99V99 5: " + CobolDisplay.formatPic(t_s99v99, 4, 2, true, "LEADING"));
            }
        }
        t_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_p99), 4, 2, true);
        if (t_s99v99.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S99V99 6: " + CobolDisplay.formatPic(t_s99v99, 4, 2, true, "LEADING"));
            }
        }
        t_s99v99 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9pp), 4, 2, true);
        if (t_s99v99.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S99V99 7: " + CobolDisplay.formatPic(t_s99v99, 4, 2, true, "LEADING"));
            }
        }
        t_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99v99), 3, 1, false);
        if (t_99v9.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99V9   1: " + CobolDisplay.formatPic(t_99v9, 3, 1, false));
            }
        }
        t_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_n99v99), 3, 1, false);
        if (t_99v9.compareTo(new BigDecimal("1.3")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99V9   2: " + CobolDisplay.formatPic(t_99v9, 3, 1, false));
            }
        }
        t_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9v99), 3, 1, false);
        if (t_99v9.compareTo(new BigDecimal("1.1")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99V9   3: " + CobolDisplay.formatPic(t_99v9, 3, 1, false));
            }
        }
        t_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_s99), 3, 1, false);
        if (t_99v9.compareTo(CobolIntrinsics.toBigDecimal(12)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99V9   4: " + CobolDisplay.formatPic(t_99v9, 3, 1, false));
            }
        }
        t_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_99), 3, 1, false);
        if (t_99v9.compareTo(CobolIntrinsics.toBigDecimal(2)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99V9   5: " + CobolDisplay.formatPic(t_99v9, 3, 1, false));
            }
        }
        t_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_p99), 3, 1, false);
        if (t_99v9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99V9   6: " + CobolDisplay.formatPic(t_99v9, 3, 1, false));
            }
        }
        t_99v9 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(d_9pp), 3, 1, false);
        if (t_99v9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99V9   7: " + CobolDisplay.formatPic(t_99v9, 3, 1, false));
            }
        }
        t_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_s99v99), 3);
        if (t_s999 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S999   1: " + CobolDisplay.formatPic(t_s999, 3, 0, true, "LEADING"));
            }
        }
        t_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_n99v99), 3);
        if (t_s999 != -1) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S999   2: " + CobolDisplay.formatPic(t_s999, 3, 0, true, "LEADING"));
            }
        }
        t_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_9v99), 3);
        if (t_s999 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S999   3: " + CobolDisplay.formatPic(t_s999, 3, 0, true, "LEADING"));
            }
        }
        t_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_s99), 3);
        if (t_s999 != 12) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S999   4: " + CobolDisplay.formatPic(t_s999, 3, 0, true, "LEADING"));
            }
        }
        t_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_99), 3);
        if (t_s999 != 2) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S999   5: " + CobolDisplay.formatPic(t_s999, 3, 0, true, "LEADING"));
            }
        }
        t_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_p99), 3);
        if (t_s999 != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S999   6: " + CobolDisplay.formatPic(t_s999, 3, 0, true, "LEADING"));
            }
        }
        t_s999 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_9pp), 3);
        if (t_s999 != 200) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-S999   7: " + CobolDisplay.formatPic(t_s999, 3, 0, true, "LEADING"));
            }
        }
        t_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_s99v99), 2));
        if (t_99 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99     1: " + CobolDisplay.formatPic(t_99, 2, 0, false));
            }
        }
        t_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_n99v99), 2));
        if (t_99 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99     2: " + CobolDisplay.formatPic(t_99, 2, 0, false));
            }
        }
        t_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_9v99), 2));
        if (t_99 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99     3: " + CobolDisplay.formatPic(t_99, 2, 0, false));
            }
        }
        t_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_s99), 2));
        if (t_99 != 12) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99     4: " + CobolDisplay.formatPic(t_99, 2, 0, false));
            }
        }
        t_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_99), 2));
        if (t_99 != 2) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99     5: " + CobolDisplay.formatPic(t_99, 2, 0, false));
            }
        }
        t_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_p99), 2));
        if (t_99 != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99     6: " + CobolDisplay.formatPic(t_99, 2, 0, false));
            }
        }
        t_99 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(d_9pp), 2));
        if (t_99 != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-99     7: " + CobolDisplay.formatPic(t_99, 2, 0, false));
            }
        }
        t_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_s99v99), 1, 1, true).abs();
        if (t_p9.compareTo(new BigDecimal("0.03")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-P9     1: " + CobolDisplay.formatPicScaled(t_p9, 1, 1, true, false));
            }
        }
        t_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_n99v99), 1, 1, true).abs();
        if (t_p9.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-P9     2: " + CobolDisplay.formatPicScaled(t_p9, 1, 1, true, false));
            }
        }
        t_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_9v99), 1, 1, true).abs();
        if (t_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-P9     3: " + CobolDisplay.formatPicScaled(t_p9, 1, 1, true, false));
            }
        }
        t_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_s99), 1, 1, true).abs();
        if (t_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-P9     4: " + CobolDisplay.formatPicScaled(t_p9, 1, 1, true, false));
            }
        }
        t_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_99), 1, 1, true).abs();
        if (t_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-P9     5: " + CobolDisplay.formatPicScaled(t_p9, 1, 1, true, false));
            }
        }
        t_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_p99), 1, 1, true).abs();
        if (t_p9.compareTo(new BigDecimal("0.02")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-P9     6: " + CobolDisplay.formatPicScaled(t_p9, 1, 1, true, false));
            }
        }
        t_p9 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_9pp), 1, 1, true).abs();
        if (t_p9.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-P9     7: " + CobolDisplay.formatPicScaled(t_p9, 1, 1, true, false));
            }
        }
        t_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_s99v99), 1, 1, false).abs();
        if (t_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-9P     1: " + CobolDisplay.formatPicScaled(t_9p, 1, 1, false, false));
            }
        }
        t_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_n99v99), 1, 1, false).abs();
        if (t_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-9P     2: " + CobolDisplay.formatPicScaled(t_9p, 1, 1, false, false));
            }
        }
        t_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_9v99), 1, 1, false).abs();
        if (t_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-9P     3: " + CobolDisplay.formatPicScaled(t_9p, 1, 1, false, false));
            }
        }
        t_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_s99), 1, 1, false).abs();
        if (t_9p.compareTo(CobolIntrinsics.toBigDecimal(10)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-9P     4: " + CobolDisplay.formatPicScaled(t_9p, 1, 1, false, false));
            }
        }
        t_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_99), 1, 1, false).abs();
        if (t_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-9P     5: " + CobolDisplay.formatPicScaled(t_9p, 1, 1, false, false));
            }
        }
        t_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_p99), 1, 1, false).abs();
        if (t_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-9P     6: " + CobolDisplay.formatPicScaled(t_9p, 1, 1, false, false));
            }
        }
        t_9p = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(d_9pp), 1, 1, false).abs();
        if (t_9p.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("T-9P     7: " + CobolDisplay.formatPicScaled(t_9p, 1, 1, false, false));
            }
        }
        /* CONTINUE */
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataDisplay004MoveDisplayToDisplay");
            CobolProgram.registerCallAlias("prog", "DataDisplay004MoveDisplayToDisplay");
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
        new DataDisplay004MoveDisplayToDisplay().run();
    }
}
