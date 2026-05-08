package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental059NumericOperations2Display extends CobolProgram {
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
    private int feld4 = 0;
    private int filler_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(16);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FIELD").picDigits(2).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FELD2").picDigits(10).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FELD3").picDigits(2).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_feld4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FELD4").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

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
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).add(CobolIntrinsics.toBigDecimal(1))), 1);
        if (feld4 != 3) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 25 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).add(CobolIntrinsics.toBigDecimal(-1))), 1);
        if (feld4 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 26 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-2), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).add(CobolIntrinsics.toBigDecimal(1))), 1);
        if (feld4 != -1) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 27 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-2), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).add(CobolIntrinsics.toBigDecimal(-1))), 1);
        if (feld4 != -3) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 28 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).subtract(CobolIntrinsics.toBigDecimal(1))), 1);
        if (feld4 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 29 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).subtract(CobolIntrinsics.toBigDecimal(-1))), 1);
        if (feld4 != 3) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 30 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-2), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).subtract(CobolIntrinsics.toBigDecimal(1))), 1);
        if (feld4 != -3) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 31 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-2), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).subtract(CobolIntrinsics.toBigDecimal(-1))), 1);
        if (feld4 != -1) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 32 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).add(CobolIntrinsics.toBigDecimal(2))), 1);
        if (feld4 != 3) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 33 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).add(CobolIntrinsics.toBigDecimal(-2))), 1);
        if (feld4 != -1) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 34 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-1), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).add(CobolIntrinsics.toBigDecimal(2))), 1);
        if (feld4 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 35 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-1), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).add(CobolIntrinsics.toBigDecimal(-2))), 1);
        if (feld4 != -3) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 36 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).subtract(CobolIntrinsics.toBigDecimal(2))), 1);
        if (feld4 != -1) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 37 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).subtract(CobolIntrinsics.toBigDecimal(-2))), 1);
        if (feld4 != 3) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 38 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-1), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).subtract(CobolIntrinsics.toBigDecimal(2))), 1);
        if (feld4 != -3) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 39 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(-1), 1);
        feld4 = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(feld4).subtract(CobolIntrinsics.toBigDecimal(-2))), 1);
        if (feld4 != 1) {
            if (filler_1 == 0) {
                CobolDisplay.display("Test 40 " + CobolDisplay.formatPic(feld4, 1, 0, true, "LEADING"));
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental059NumericOperations2Display");
            CobolProgram.registerCallAlias("prog", "RunFundamental059NumericOperations2Display");
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
        new RunFundamental059NumericOperations2Display().run();
    }
}
