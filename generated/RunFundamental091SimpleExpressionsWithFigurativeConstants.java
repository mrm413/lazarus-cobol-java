package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental091SimpleExpressionsWithFigurativeConstants extends CobolProgram {
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
    private CobolString fldx = new CobolString(1, "X");
    private CobolString fldxx = new CobolString(2);
    private CobolString fldx50 = new CobolString(50, "X50");
    private CobolString fldx500 = new CobolString(500, "X500");
    private CobolString fldx32k = new CobolString(32000, "X");
    private CobolString fld1 = new CobolString(1, "1");
    private CobolString fld1x = new CobolString(32000, "1");
    private int filler_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(64555);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldxx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDXX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldx50 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDX50").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldx500 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(53, 500).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDX500").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fldx32k = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(553, 32000).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLDX32K").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32553, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld1x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32554, 32000).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD1X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(64554, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString do_disp = new CobolString(256); // fallback

    private void main_line() {
        do_check();
        return;
    }

    private void do_check() {
        do_check_part0();
        do_check_part1();
        do_check_part2();
    }
    private void do_check_part0() {
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf(" ")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" > SPACE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf(" ")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" < SPACE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf(" ")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" >= SPACE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf(" ")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" <= SPACE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" "), String.valueOf(fldx)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! SPACE < \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" "), String.valueOf(fldx)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  SPACE > \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" "), String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! SPACE <= \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" "), String.valueOf(fldx)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  SPACE >= \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf(" ")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" > \" \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf(" ")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" < \" \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf(" ")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" >= \" \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf(" ")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" <= \" \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" "), String.valueOf(fldx)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \" \" < \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" "), String.valueOf(fldx)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \" \" > \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" "), String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \" \" <= \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" "), String.valueOf(fldx)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \" \" >= \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u0000")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" > LOW-VALUE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u0000")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" < LOW-VALUE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u0000")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" >= LOW-VALUE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u0000")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" <= LOW-VALUE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! LOW-VALUE < \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  LOW-VALUE > \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! LOW-VALUE <= \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  LOW-VALUE >= \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u0000")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" > x\"00\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u0000")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" < x\"00\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u0000")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" >= x\"00\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u0000")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" <= x\"00\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! x\"00\" < \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  x\"00\" > \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! x\"00\" <= \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  x\"00\" >= \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\uFFFF")) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" < HIGH-VALUE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\uFFFF")) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" > HIGH-VALUE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\uFFFF")) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" <= HIGH-VALUE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\uFFFF")) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" >= HIGH-VALUE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\uFFFF"), String.valueOf(fldx)) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! HIGH-VALUE > \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\uFFFF"), String.valueOf(fldx)) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  HIGH-VALUE < \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\uFFFF"), String.valueOf(fldx)) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! HIGH-VALUE >= \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\uFFFF"), String.valueOf(fldx)) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  HIGH-VALUE <= \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u00ff")) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" < x\"FF\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u00ff")) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" > x\"FF\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u00ff")) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" <= x\"FF\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("\u00ff")) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" >= x\"FF\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u00ff"), String.valueOf(fldx)) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! x\"FF\" > \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u00ff"), String.valueOf(fldx)) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  x\"FF\" < \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u00ff"), String.valueOf(fldx)) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! x\"FF\" >= \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u00ff"), String.valueOf(fldx)) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  x\"FF\" <= \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1), String.valueOf(0)) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"1\" > ZERO");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1), String.valueOf(0)) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"1\" < ZERO!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1), String.valueOf(0)) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"1\" >= ZERO");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1), String.valueOf(0)) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"1\" <= ZERO!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(0), String.valueOf(fld1)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ZERO < \"1\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(0), String.valueOf(fld1)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  ZERO > \"1\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(0), String.valueOf(fld1)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ZERO <= \"1\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(0), String.valueOf(fld1)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  ZERO >= \"1\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1), String.valueOf("0")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"1\" > \"0\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1), String.valueOf("0")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"1\" < \"0\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1), String.valueOf("0")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"1\" >= \"0\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1), String.valueOf("0")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"1\" <= \"0\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0"), String.valueOf(fld1)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"0\" < \"1\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0"), String.valueOf(fld1)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"0\" > \"1\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0"), String.valueOf(fld1)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"0\" <= \"1\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0"), String.valueOf(fld1)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"0\" >= \"1\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf(" ".repeat(32000))) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" > SPACE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf(" ".repeat(32000))) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" < SPACE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf(" ".repeat(32000))) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" >= SPACE");
            }
        }
    }
    private void do_check_part1() {
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf(" ".repeat(32000))) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" <= SPACE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" ".repeat(32000)), String.valueOf(fldx32k)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! SPACE < \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" ".repeat(32000)), String.valueOf(fldx32k)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  SPACE > \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" ".repeat(32000)), String.valueOf(fldx32k)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! SPACE <= \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(" ".repeat(32000)), String.valueOf(fldx32k)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  SPACE >= \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("  ")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" > \" \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("  ")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" < \" \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("  ")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" >= \" \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("  ")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" <= \" \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("  "), String.valueOf(fldx32k)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"  \" < \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("  "), String.valueOf(fldx32k)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"  \" > \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("  "), String.valueOf(fldx32k)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"  \" <= \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("  "), String.valueOf(fldx32k)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"  \" >= \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u0000".repeat(32000))) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" > LOW-VALUE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u0000".repeat(32000))) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" < LOW-VALUE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u0000".repeat(32000))) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" >= LOW-VALUE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u0000".repeat(32000))) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X\" <= LOW-VALUE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000".repeat(32000)), String.valueOf(fldx32k)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! LOW-VALUE < \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000".repeat(32000)), String.valueOf(fldx32k)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  LOW-VALUE > \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000".repeat(32000)), String.valueOf(fldx32k)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! LOW-VALUE <= \"X\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000".repeat(32000)), String.valueOf(fldx32k)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  LOW-VALUE >= \"X\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u0000")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" > x\"00\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u0000")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" < x\"00\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u0000")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" >= x\"00\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u0000")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" <= x\"00\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx32k)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! x\"00\" < \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx32k)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  x\"00\" > \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx32k)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! x\"00\" <= \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u0000"), String.valueOf(fldx32k)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  x\"00\" >= \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\uffff".repeat(32000))) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" < HIGH-VALUE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\uffff".repeat(32000))) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" > HIGH-VALUE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\uffff".repeat(32000))) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" <= HIGH-VALUE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\uffff".repeat(32000))) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" >= HIGH-VALUE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\uffff".repeat(32000)), String.valueOf(fldx32k)) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! HIGH-VALUE > \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\uffff".repeat(32000)), String.valueOf(fldx32k)) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  HIGH-VALUE < \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\uffff".repeat(32000)), String.valueOf(fldx32k)) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! HIGH-VALUE >= \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\uffff".repeat(32000)), String.valueOf(fldx32k)) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  HIGH-VALUE <= \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u00ff")) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" < x\"FF\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u00ff")) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" > x\"FF\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u00ff")) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X \" <= x\"FF\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx32k), String.valueOf("\u00ff")) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X \" >= x\"FF\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u00ff"), String.valueOf(fldx32k)) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! x\"FF\" > \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u00ff"), String.valueOf(fldx32k)) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  x\"FF\" < \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u00ff"), String.valueOf(fldx32k)) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! x\"FF\" >= \"X \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("\u00ff"), String.valueOf(fldx32k)) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  x\"FF\" <= \"X \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1x), String.valueOf("0".repeat(32000))) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"1 \" > ZERO");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1x), String.valueOf("0".repeat(32000))) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"1 \" < ZERO!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1x), String.valueOf("0".repeat(32000))) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"1 \" >= ZERO");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1x), String.valueOf("0".repeat(32000))) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"1 \" <= ZERO!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0".repeat(32000)), String.valueOf(fld1x)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ZERO < \"1 \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0".repeat(32000)), String.valueOf(fld1x)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  ZERO > \"1 \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0".repeat(32000)), String.valueOf(fld1x)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ZERO <= \"1 \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0".repeat(32000)), String.valueOf(fld1x)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  ZERO >= \"1 \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1x), String.valueOf("0")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"1 \" > \"0\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1x), String.valueOf("0")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"1 \" < \"0\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1x), String.valueOf("0")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"1 \" >= \"0\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fld1x), String.valueOf("0")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"1 \" <= \"0\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0"), String.valueOf(fld1x)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"0\" < \"1 \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0"), String.valueOf(fld1x)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"0\" > \"1 \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0"), String.valueOf(fld1x)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"0\" <= \"1 \"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("0"), String.valueOf(fld1x)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"0\" >= \"1 \"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx500), String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X5\" > SPACE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx500), String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X5\" < SPACE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx500), String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X5\" >= SPACE");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx500), String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"X5\" <= SPACE!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "), String.valueOf(fldx500)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! SPACE < \"X5\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "), String.valueOf(fldx500)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  SPACE > \"X5\"!");
            }
        }
    }
    private void do_check_part2() {
        if (CobolString.cobolCompare(String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "), String.valueOf(fldx500)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! SPACE <= \"X5\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "), String.valueOf(fldx500)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  SPACE >= \"X5\"!");
            }
        }
        fldxx.set(String.valueOf(" "));
        if (CobolString.cobolEquals(String.valueOf(fldxx), String.valueOf("    "))) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"XX\" <> \"     \"");
            }
        }
        fldxx.set("AA");
        if (CobolString.cobolEquals(String.valueOf(fldxx), String.valueOf("AA  "))) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"AA\" <> \"AA  \"");
            }
        }
        if (CobolString.cobolEquals(String.valueOf(fldxx), String.valueOf("AAA"))) {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"AA\" = \"AAA \"");
            }
        }
        if (CobolString.cobolEquals(String.valueOf(fldxx), String.valueOf("AA"))) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"AA\" <> ALL \"A\"");
            }
        }
        fldxx.setRefMod(2, 1, String.valueOf("B"));
        if (CobolString.cobolEquals(String.valueOf(fldxx), String.valueOf("AB"))) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"AB\" <> ALL \"AB\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx), String.valueOf("X")) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"X\" > ALL \"XX\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("X"), String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ALL \"XX\" <= \"X\"");
            }
        }
        fldx500.set("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        fldx50.set("00000000000000000000000000000000000000000000000000");
        fldx500.setRefMod(500, 1, String.valueOf("1"));
        fldx50.setRefMod(50, 1, String.valueOf("1"));
        if (CobolString.cobolCompare(String.valueOf(fldx50), String.valueOf("00000000000000000000000000000000000000000000000000")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"000...01\" > ZERO");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx50), String.valueOf("00000000000000000000000000000000000000000000000000")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"000...01\" < ZERO!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx50), String.valueOf("00000000000000000000000000000000000000000000000000")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"000...01\" >= ZERO");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx50), String.valueOf("00000000000000000000000000000000000000000000000000")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"000...01\" <= ZERO!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("00000000000000000000000000000000000000000000000000"), String.valueOf(fldx50)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ZERO < \"000...01\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("00000000000000000000000000000000000000000000000000"), String.valueOf(fldx50)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  ZERO > \"000...01\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("00000000000000000000000000000000000000000000000000"), String.valueOf(fldx50)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ZERO <= \"000...01\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("00000000000000000000000000000000000000000000000000"), String.valueOf(fldx50)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  ZERO >= \"000...01\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx500), String.valueOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")) > 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"000...01\" > ZERO");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx500), String.valueOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")) < 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"000...01\" < ZERO!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx500), String.valueOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")) >= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! \"000...01\" >= ZERO");
            }
        }
        if (CobolString.cobolCompare(String.valueOf(fldx500), String.valueOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  \"000...01\" <= ZERO!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"), String.valueOf(fldx500)) < 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ZERO < \"000...01\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"), String.valueOf(fldx500)) > 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  ZERO > \"000...01\"!");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"), String.valueOf(fldx500)) <= 0) {
            /* CONTINUE */
        } else {
            if (filler_1 == 0) {
                CobolDisplay.display("! ZERO <= \"000...01\"");
            }
        }
        if (CobolString.cobolCompare(String.valueOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"), String.valueOf(fldx500)) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("  ZERO >= \"000...01\"!");
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental091SimpleExpressionsWithFigurativeConstants");
            CobolProgram.registerCallAlias("prog", "RunFundamental091SimpleExpressionsWithFigurativeConstants");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            main_line();
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
        new RunFundamental091SimpleExpressionsWithFigurativeConstants().run();
    }
}
