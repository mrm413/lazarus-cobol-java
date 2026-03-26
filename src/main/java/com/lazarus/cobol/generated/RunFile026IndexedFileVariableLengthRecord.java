package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile026IndexedFileVariableLengthRecord extends CobolProgram {
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
    private CobolString fs_file_status = new CobolString(2);
    private short end_tbw_record = (short) 0;
    private CobolString flag_tbw = new CobolString(1);
    private CobolString path_tbw = new CobolString(255);

    // FILE SECTION — tbw
    private CobolString tbw_record = new CobolString(1); // Group: tbw-record
    private CobolString tbw_key = new CobolString(100);
    private CobolString tbw_alt = new CobolString(1); // Group: tbw-alt
    private int tbw_alt_1 = 0;
    private int tbw_alt_2 = 0;
    private CobolString tbw_f1 = new CobolString(1);
    private CobolString tbw_f2 = new CobolString(255);


    // FILE DESCRIPTORS
    private CobolFile tbw = new CobolFile("path-tbw", "INDEXED", "DYNAMIC");
    // File status: fs-file-status

    // FALLBACK FILE DESCRIPTORS
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString flag_tbw_open = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString flag_tbw_closed = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: * Prepare */
        path_tbw.set(String.valueOf("tbw"));
        /* RAW: * First test */
        tbw_delete_file(); // THRU tbw-exit
        tbw_open_i_o(); // THRU tbw-exit
        tbw();
        tbw_close_exit();
        tbw_exit();
        tbw_key.set(String.valueOf("\u0000"));
        tbw_start_primary_greater(); // THRU tbw-exit
        tbw_read_next(); // THRU tbw-exit
        end_tbw_record = new BigDecimal(String.valueOf(122).trim()).shortValue();
        tbw_key.set(String.valueOf("aaaaa"));
        tbw_alt.set(String.valueOf(" "));
        tbw_f1.set(String.valueOf(" "));
        tbw_f2.set(String.valueOf(" "));
        tbw_write(); // THRU tbw-exit
        tbw_alt.set(String.valueOf("\u0000"));
        tbw_start_alternate(); // THRU tbw-exit
        tbw_key.set(String.valueOf("\u0000"));
        tbw_start_primary_greater(); // THRU tbw-exit
        tbw_read_next(); // THRU tbw-exit
        tbw_read_next(); // THRU tbw-exit
        tbw_close(); // THRU tbw-exit
        /* RAW: * Second test */
        tbw_delete_file(); // THRU tbw-exit
        tbw_open_i_o(); // THRU tbw-exit
        tbw();
        tbw_close_exit();
        tbw_exit();
        tbw_key.set(String.valueOf("\u0000"));
        tbw_start_primary_greater(); // THRU tbw-exit
        tbw_read_next(); // THRU tbw-exit
        end_tbw_record = new BigDecimal(String.valueOf(163).trim()).shortValue();
        tbw_key.set(String.valueOf("aaaaa"));
        tbw_alt_1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        tbw_alt_2 = new BigDecimal(String.valueOf(1).trim()).intValue();
        tbw_f1.set(String.valueOf(" "));
        tbw_f2.set(String.valueOf(" "));
        tbw_write(); // THRU tbw-exit
        end_tbw_record = new BigDecimal(String.valueOf(122).trim()).shortValue();
        tbw_key.set(String.valueOf("aaaab"));
        tbw_alt.set(String.valueOf(" "));
        tbw_f1.set(String.valueOf(" "));
        tbw_f2.set(String.valueOf(" "));
        tbw_write(); // THRU tbw-exit
        tbw_alt.set(String.valueOf("\u0000"));
        tbw_start_alternate(); // THRU tbw-exit
        tbw_read_next(); // THRU tbw-exit
        tbw_alt.set(String.valueOf(" "));
        tbw_rewrite(); // THRU tbw-exit
        /* RAW: * Finish */
        tbw_close(); // THRU tbw-exit
        CobolDisplay.display("Test completed");
        System.exit(0);
    }

    private void tbw_open_i_o() {
        if (!String.valueOf(flag_tbw_open).trim().isEmpty()) {
            tbw_close(); // THRU tbw-Close-exit
        }
        CobolDisplay.display("open");
        tbw.open("I-O");
        CobolDisplay.display("open done");
        if (String.valueOf(fs_file_status).compareTo(String.valueOf("10")) < 0) {
            flag_tbw_open.set(String.valueOf(cb_true));
        }
        tbw_exit();
        return;
    }

    private void tbw() {
        CobolDisplay.display("delete file done");
        tbw_exit();
        return;
    }

    private void tbw_close_exit() {
        return;
    }

    private void tbw_exit() {
        return;
    }

    private void tbw_delete_file() { /* stub — external/COPY */ }

    private void tbw_start_primary_greater() { /* stub — external/COPY */ }

    private void tbw_read_next() { /* stub — external/COPY */ }

    private void tbw_write() { /* stub — external/COPY */ }

    private void tbw_start_alternate() { /* stub — external/COPY */ }

    private void tbw_close() { /* stub — external/COPY */ }

    private void tbw_rewrite() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile026IndexedFileVariableLengthRecord().run();
    }
}
