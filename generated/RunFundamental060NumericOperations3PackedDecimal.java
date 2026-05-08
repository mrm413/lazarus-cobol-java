package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental060NumericOperations3PackedDecimal extends CobolProgram {
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
    private BigDecimal field = BigDecimal.ZERO;
    private BigDecimal feld2 = BigDecimal.ZERO;
    private BigDecimal feld3 = BigDecimal.ZERO;
    private BigDecimal feld4 = BigDecimal.ZERO;
    private BigDecimal feld4b = BigDecimal.ZERO;
    private BigDecimal feld5 = BigDecimal.ZERO;
    private BigDecimal feld5b = BigDecimal.ZERO;
    private BigDecimal feld6 = BigDecimal.ZERO;
    private BigDecimal feld6b = BigDecimal.ZERO;
    private int filler_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(65);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FIELD").picDigits(2).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FELD2").picDigits(10).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FELD3").picDigits(2).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FELD4").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld4b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(11, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FELD4b").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FELD5").picDigits(18).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld5b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(24, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FELD5b").picDigits(18).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FELD6").picDigits(28).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld6b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(49, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FELD6b").picDigits(28).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(64, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString do_disp = new CobolString(256); // fallback

    private void para_main() {
        do_check();
        return;
    }

    private void do_check() {
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 2, 1, true);
        field = CobolIntrinsics.truncateToField(field.add(CobolIntrinsics.toBigDecimal(1)), 2, 1, true);
        if (field.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  1 " + CobolDisplay.formatPic(field, 2, 1, true, "LEADING"));
            }
        }
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 2, 1, true);
        field = CobolIntrinsics.truncateToField(field.add(CobolIntrinsics.toBigDecimal(-1)), 2, 1, true);
        if (field.compareTo(new BigDecimal("-0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  2 " + CobolDisplay.formatPic(field, 2, 1, true, "LEADING"));
            }
        }
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 2, 1, true);
        field = CobolIntrinsics.truncateToField(field.add(CobolIntrinsics.toBigDecimal(1)), 2, 1, true);
        if (field.compareTo(new BigDecimal("0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  3 " + CobolDisplay.formatPic(field, 2, 1, true, "LEADING"));
            }
        }
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 2, 1, true);
        field = CobolIntrinsics.truncateToField(field.add(CobolIntrinsics.toBigDecimal(-1)), 2, 1, true);
        if (field.compareTo(new BigDecimal("-1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  4 " + CobolDisplay.formatPic(field, 2, 1, true, "LEADING"));
            }
        }
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 2, 1, true);
        field = CobolIntrinsics.truncateToField(field.subtract(CobolIntrinsics.toBigDecimal(1)), 2, 1, true);
        if (field.compareTo(new BigDecimal("-0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  5 " + CobolDisplay.formatPic(field, 2, 1, true, "LEADING"));
            }
        }
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 2, 1, true);
        field = CobolIntrinsics.truncateToField(field.subtract(CobolIntrinsics.toBigDecimal(-1)), 2, 1, true);
        if (field.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  6 " + CobolDisplay.formatPic(field, 2, 1, true, "LEADING"));
            }
        }
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 2, 1, true);
        field = CobolIntrinsics.truncateToField(field.subtract(CobolIntrinsics.toBigDecimal(1)), 2, 1, true);
        if (field.compareTo(new BigDecimal("-1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  7 " + CobolDisplay.formatPic(field, 2, 1, true, "LEADING"));
            }
        }
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 2, 1, true);
        field = CobolIntrinsics.truncateToField(field.subtract(CobolIntrinsics.toBigDecimal(-1)), 2, 1, true);
        if (field.compareTo(new BigDecimal("0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  8 " + CobolDisplay.formatPic(field, 2, 1, true, "LEADING"));
            }
        }
        feld2 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 10, 5, true);
        feld2 = CobolIntrinsics.truncateToField(feld2.add(CobolIntrinsics.toBigDecimal(1)), 10, 5, true);
        if (feld2.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test  9 " + CobolDisplay.formatPic(feld2, 10, 5, true, "LEADING"));
            }
        }
        feld2 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 10, 5, true);
        feld2 = CobolIntrinsics.truncateToField(feld2.add(CobolIntrinsics.toBigDecimal(-1)), 10, 5, true);
        if (feld2.compareTo(new BigDecimal("-0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 10 " + CobolDisplay.formatPic(feld2, 10, 5, true, "LEADING"));
            }
        }
        feld2 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 10, 5, true);
        feld2 = CobolIntrinsics.truncateToField(feld2.add(CobolIntrinsics.toBigDecimal(1)), 10, 5, true);
        if (feld2.compareTo(new BigDecimal("0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 11 " + CobolDisplay.formatPic(feld2, 10, 5, true, "LEADING"));
            }
        }
        feld2 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 10, 5, true);
        feld2 = CobolIntrinsics.truncateToField(feld2.add(CobolIntrinsics.toBigDecimal(-1)), 10, 5, true);
        if (feld2.compareTo(new BigDecimal("-1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 12 " + CobolDisplay.formatPic(feld2, 10, 5, true, "LEADING"));
            }
        }
        feld2 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 10, 5, true);
        feld2 = CobolIntrinsics.truncateToField(feld2.subtract(CobolIntrinsics.toBigDecimal(1)), 10, 5, true);
        if (feld2.compareTo(new BigDecimal("-0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 13 " + CobolDisplay.formatPic(feld2, 10, 5, true, "LEADING"));
            }
        }
        feld2 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 10, 5, true);
        feld2 = CobolIntrinsics.truncateToField(feld2.subtract(CobolIntrinsics.toBigDecimal(-1)), 10, 5, true);
        if (feld2.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 14 " + CobolDisplay.formatPic(feld2, 10, 5, true, "LEADING"));
            }
        }
        feld2 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 10, 5, true);
        feld2 = CobolIntrinsics.truncateToField(feld2.subtract(CobolIntrinsics.toBigDecimal(1)), 10, 5, true);
        if (feld2.compareTo(new BigDecimal("-1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 15 " + CobolDisplay.formatPic(feld2, 10, 5, true, "LEADING"));
            }
        }
        feld2 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 10, 5, true);
        feld2 = CobolIntrinsics.truncateToField(feld2.subtract(CobolIntrinsics.toBigDecimal(-1)), 10, 5, true);
        if (feld2.compareTo(new BigDecimal("0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 16 " + CobolDisplay.formatPic(feld2, 10, 5, true, "LEADING"));
            }
        }
        feld3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 2, 1, false);
        feld3 = CobolIntrinsics.truncateToField(feld3.add(CobolIntrinsics.toBigDecimal(1)), 2, 1, false);
        if (feld3.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 17 " + CobolDisplay.formatPic(feld3, 2, 1, false));
            }
        }
        feld3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 2, 1, false);
        feld3 = CobolIntrinsics.truncateToField(feld3.add(CobolIntrinsics.toBigDecimal(-1)), 2, 1, false);
        if (feld3.compareTo(new BigDecimal("0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 18 " + CobolDisplay.formatPic(feld3, 2, 1, false));
            }
        }
        feld3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 2, 1, false);
        feld3 = CobolIntrinsics.truncateToField(feld3.add(CobolIntrinsics.toBigDecimal(1)), 2, 1, false);
        if (feld3.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 19 " + CobolDisplay.formatPic(feld3, 2, 1, false));
            }
        }
        feld3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 2, 1, false);
        feld3 = CobolIntrinsics.truncateToField(feld3.add(CobolIntrinsics.toBigDecimal(-1)), 2, 1, false);
        if (feld3.compareTo(new BigDecimal("0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 20 " + CobolDisplay.formatPic(feld3, 2, 1, false));
            }
        }
        feld3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 2, 1, false);
        feld3 = CobolIntrinsics.truncateToField(feld3.subtract(CobolIntrinsics.toBigDecimal(1)), 2, 1, false);
        if (feld3.compareTo(new BigDecimal("0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 21 " + CobolDisplay.formatPic(feld3, 2, 1, false));
            }
        }
        feld3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 2, 1, false);
        feld3 = CobolIntrinsics.truncateToField(feld3.subtract(CobolIntrinsics.toBigDecimal(-1)), 2, 1, false);
        if (feld3.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 22 " + CobolDisplay.formatPic(feld3, 2, 1, false));
            }
        }
        feld3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 2, 1, false);
        feld3 = CobolIntrinsics.truncateToField(feld3.subtract(CobolIntrinsics.toBigDecimal(1)), 2, 1, false);
        if (feld3.compareTo(new BigDecimal("0.8")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 23 " + CobolDisplay.formatPic(feld3, 2, 1, false));
            }
        }
        feld3 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("-0.2")), 2, 1, false);
        feld3 = CobolIntrinsics.truncateToField(feld3.subtract(CobolIntrinsics.toBigDecimal(-1)), 2, 1, false);
        if (feld3.compareTo(new BigDecimal("1.2")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 24 " + CobolDisplay.formatPic(feld3, 2, 1, false));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.add(CobolIntrinsics.toBigDecimal(1)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 25 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.add(CobolIntrinsics.toBigDecimal(-1)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 26 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-2), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.add(CobolIntrinsics.toBigDecimal(1)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(-1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 27 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-2), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.add(CobolIntrinsics.toBigDecimal(-1)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(-3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 28 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-2), 4, 0, true);
        feld4b = CobolIntrinsics.truncateToField(feld4b.add(CobolIntrinsics.toBigDecimal(-1)), 4, 0, true);
        if (feld4b.compareTo(CobolIntrinsics.toBigDecimal(-3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 28b " + CobolDisplay.formatPic(feld4b, 4, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.subtract(CobolIntrinsics.toBigDecimal(1)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 29 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 4, 0, true);
        feld4b = CobolIntrinsics.truncateToField(feld4b.subtract(CobolIntrinsics.toBigDecimal(1)), 4, 0, true);
        if (feld4b.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 29b " + CobolDisplay.formatPic(feld4b, 4, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(2), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.subtract(CobolIntrinsics.toBigDecimal(-1)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 30 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-2), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.subtract(CobolIntrinsics.toBigDecimal(1)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(-3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 31 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-2), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.subtract(CobolIntrinsics.toBigDecimal(-1)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(-1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 32 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.add(CobolIntrinsics.toBigDecimal(2)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 33 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.add(CobolIntrinsics.toBigDecimal(-2)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(-1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 34 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-1), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.add(CobolIntrinsics.toBigDecimal(2)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 35 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-1), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.add(CobolIntrinsics.toBigDecimal(-2)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(-3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 36 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.subtract(CobolIntrinsics.toBigDecimal(2)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(-1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 37 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(1), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.subtract(CobolIntrinsics.toBigDecimal(-2)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 38 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-1), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.subtract(CobolIntrinsics.toBigDecimal(2)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(-3)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 39 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(-1), 1, 0, true);
        feld4 = CobolIntrinsics.truncateToField(feld4.subtract(CobolIntrinsics.toBigDecimal(-2)), 1, 0, true);
        if (feld4.compareTo(CobolIntrinsics.toBigDecimal(1)) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 40 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld5 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("123456789.01234567")), 18, 9, false);
        feld5 = CobolIntrinsics.truncateToField(feld5.add(CobolIntrinsics.toBigDecimal(2)), 18, 9, false);
        if (feld5.compareTo(new BigDecimal("123456791.01234567")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 41 ADD " + CobolDisplay.formatPic(feld5, 18, 9, false));
            }
        }
        feld5 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("123456789.01234567")), 18, 9, false);
        feld5 = CobolIntrinsics.truncateToField(feld5.subtract(CobolIntrinsics.toBigDecimal(-2)), 18, 9, false);
        if (feld5.compareTo(new BigDecimal("123456791.01234567")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 41 SUBTRACT " + CobolDisplay.formatPic(feld5, 18, 9, false));
            }
        }
        feld5b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal("12345678901234567"), 18, 0, false);
        feld5b = CobolIntrinsics.truncateToField(feld5b.add(CobolIntrinsics.toBigDecimal("18518518351851850")), 18, 0, false);
        if (feld5b.compareTo(new BigDecimal("30864197253086417")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 41b ADD " + CobolDisplay.formatPic(feld5b, 18, 0, false));
            }
        }
        feld5b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal("30864197253086417"), 18, 0, false);
        feld5b = CobolIntrinsics.truncateToField(feld5b.subtract(CobolIntrinsics.toBigDecimal("18518518351851850")), 18, 0, false);
        if (feld5b.compareTo(new BigDecimal("12345678901234567")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 41b SUBTRACT " + CobolDisplay.formatPic(feld5b, 18, 0, false));
            }
        }
        feld6 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("12345678.123456901234")), 28, 20, false);
        feld6 = CobolIntrinsics.truncateToField(feld6.add(CobolIntrinsics.toBigDecimal(new BigDecimal("-2.1"))), 28, 20, false);
        if (feld6.compareTo(new BigDecimal("12345676.023456901234")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 42 ADD " + CobolDisplay.formatPic(feld6, 28, 20, false));
            }
        }
        feld6 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("12345678.123456901234")), 28, 20, false);
        feld6 = CobolIntrinsics.truncateToField(feld6.subtract(CobolIntrinsics.toBigDecimal(new BigDecimal("2.1"))), 28, 20, false);
        if (feld6.compareTo(new BigDecimal("12345676.023456901234")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 42 SUBTRACT " + CobolDisplay.formatPic(feld6, 28, 20, false));
            }
        }
        feld6 = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal(".123456789012345678901234")), 28, 20, false);
        feld6 = CobolIntrinsics.truncateToField(feld6.add(CobolIntrinsics.toBigDecimal(new BigDecimal("1.8"))), 28, 20, false);
        if (feld6.compareTo(new BigDecimal("1.9234567890123456789")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 43 " + CobolDisplay.formatPic(feld6, 28, 20, false));
            }
        }
        feld6b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal("7123456789012345670"), 28, 0, true);
        feld6b = CobolIntrinsics.truncateToField(feld6b.add(CobolIntrinsics.toBigDecimal("1800000000000000000")), 28, 0, true);
        if (feld6b.compareTo(new BigDecimal("8923456789012345670")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 43b ADD " + CobolDisplay.formatPic(feld6b, 28, 0, true, "LEADING"));
            }
        }
        if (feld6b.compareTo(new BigDecimal("-8923456789012345670")) == 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 43b2 ADD " + CobolDisplay.formatPic(feld6b, 28, 0, true, "LEADING"));
            }
        }
        feld6b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(feld6b.multiply(CobolIntrinsics.toBigDecimal(-1))), 28, 0, true);
        if (feld6b.compareTo(new BigDecimal("-8923456789012345670")) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 43c NEGATIVE " + CobolDisplay.formatPic(feld6b, 28, 0, true, "LEADING"));
            }
        }
        if (feld6b.compareTo(new BigDecimal("8923456789012345670")) == 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 43c2 NEGATIVE " + CobolDisplay.formatPic(feld6b, 28, 0, true, "LEADING"));
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental060NumericOperations3PackedDecimal");
            CobolProgram.registerCallAlias("prog", "RunFundamental060NumericOperations3PackedDecimal");
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
        new RunFundamental060NumericOperations3PackedDecimal().run();
    }
}
