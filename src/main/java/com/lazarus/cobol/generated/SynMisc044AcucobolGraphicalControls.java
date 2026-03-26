package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc044AcucobolGraphicalControls extends CobolProgram {
    private int tally = 0;
    private int return_code = 0;
    private int sort_return = 0;
    private int number_of_call_parameters = 0;
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
    // WORKING-STORAGE SECTION
    private int window_handle = 0;
    private CobolString lb_row = new CobolString(10);
    private int lb_color = 0;
    private int lb_num_lines = 0;
    private int lb_num_rows = 0;
    private int window_lines = 0;
    private int window_rows = 0;
    private int selection_idx = 0;


    // FALLBACK FILE DESCRIPTORS
    private CobolFile window = new CobolFile("WINDOW", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString floating = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString col = new CobolString(256); // fallback
    private CobolString lines = new CobolString(256); // fallback
    private CobolString size = new CobolString(256); // fallback
    private CobolString boxed = new CobolString(256); // fallback
    private CobolString color = new CobolString(256); // fallback
    private CobolString handle = new CobolString(256); // fallback
    private CobolString is = new CobolString(256); // fallback
    private CobolString lb_screen = new CobolString(256); // fallback
    private CobolString omitted = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: MODIFY lb-frm ITEM-TO-ADD = 'Row 1' MODIFY */
        CobolDisplay.display(String.valueOf(floating) + String.valueOf(window) + String.valueOf(line) + String.valueOf(5) + String.valueOf(col) + String.valueOf(5) + String.valueOf(lines) + String.valueOf(window_lines) + String.valueOf(size) + String.valueOf(window_rows) + String.valueOf(boxed) + String.valueOf(color) + String.valueOf(lb_color) + String.valueOf(handle) + String.valueOf(is) + String.valueOf(window_handle));
        CobolDisplay.display(String.valueOf(lb_screen));
        lb_screen.set(String.valueOf(CobolDisplay.accept()));
        if (String.valueOf(lb_row).equals(String.valueOf(" "))) {
            /* RAW: INQUIRE lb-frm SELECTION-INDEX IN selection-idx */
            if (selection_idx > Integer.parseInt(String.valueOf(0).trim())) {
                /* RAW: MODIFY lb-frm QUERY-INDEX = selection-idx INQUIRE */
            }
        }
        window.close();
        /* CLOSE window-handle — skipped, not a file */
        CobolDisplay.display("chosen row value was '" + String.valueOf(lb_row) + "'");
        omitted.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: *  */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc044AcucobolGraphicalControls().run();
    }
}
