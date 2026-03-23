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

    
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString flag_tbw_open = new CobolString(256);
    private CobolString cb_true = new CobolString(256);
    private CobolString flag_tbw_closed = new CobolString(256);

    private void para_main() {
        /* RAW: *  */
    }

    private void prepare() {
    }

    private void path_tbw() {
        /* RAW: * First */
    }

    private void test() {
        tbw_delete_file(); // THRU tbw-exit
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        tbw_open_i_o(); // THRU tbw-exit
        tbw();
        tbw_start_primary_greater();
        tbw_start_alternate();
        tbw_read_next();
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void tbw_key() {
        tbw_start_primary_greater(); // THRU tbw-exit
        tbw_start_alternate();
        tbw_read_next();
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        tbw_read_next(); // THRU tbw-exit
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void end_tbw_record() {
    }

    private void tbw_key_2() {
        tbw_alt.set(String.valueOf(" "));
        tbw_f1.set(String.valueOf(" "));
    }

    private void tbw_f2() {
        tbw_write(); // THRU tbw-exit
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void tbw_alt() {
        tbw_start_alternate(); // THRU tbw-exit
        tbw_read_next();
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void tbw_key_3() {
        tbw_start_primary_greater(); // THRU tbw-exit
        tbw_start_alternate();
        tbw_read_next();
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        tbw_read_next(); // THRU tbw-exit
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        tbw_read_next(); // THRU tbw-exit
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        tbw_close(); // THRU tbw-exit
        tbw_close_exit();
        tbw_exit();
        /* RAW: * Second */
    }

    private void test_2() {
        tbw_delete_file(); // THRU tbw-exit
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        tbw_open_i_o(); // THRU tbw-exit
        tbw();
        tbw_start_primary_greater();
        tbw_start_alternate();
        tbw_read_next();
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void tbw_key_4() {
        tbw_start_primary_greater(); // THRU tbw-exit
        tbw_start_alternate();
        tbw_read_next();
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        tbw_read_next(); // THRU tbw-exit
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void end_tbw_record_2() {
    }

    private void tbw_key_5() {
        tbw_alt_1 = new BigDecimal(String.valueOf(1).trim()).intValue();
    }

    private void tbw_alt_2() {
        tbw_f1.set(String.valueOf(" "));
    }

    private void tbw_f2_2() {
        tbw_write(); // THRU tbw-exit
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void end_tbw_record_3() {
    }

    private void tbw_key_6() {
        tbw_alt.set(String.valueOf(" "));
        tbw_f1.set(String.valueOf(" "));
    }

    private void tbw_f2_3() {
        tbw_write(); // THRU tbw-exit
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void tbw_alt_3() {
        tbw_start_alternate(); // THRU tbw-exit
        tbw_read_next();
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        tbw_read_next(); // THRU tbw-exit
        tbw_write();
        tbw_rewrite();
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
    }

    private void tbw_alt_4() {
        tbw_rewrite(); // THRU tbw-exit
        tbw_delete_file();
        fs_file_status();
        tbw();
        tbw_close();
        tbw_close_exit();
        tbw_exit();
        /* RAW: *  */
    }

    private void finish() {
        tbw_close(); // THRU tbw-exit
        tbw_close_exit();
        tbw_exit();
        CobolDisplay.display("Test completed");
        System.exit(0);
    }

    private void o() {
    }

    private void tbw_open_i_o() {
        if (!String.valueOf(flag_tbw_open).trim().isEmpty()) {
            tbw_close(); // THRU tbw-Close-exit
            tbw_close_exit();
        }
        CobolDisplay.display("open");
    }

    private void tbw() {
        CobolDisplay.display("open done");
        if (String.valueOf(fs_file_status).compareTo(String.valueOf("10")) < 0) {
            flag_tbw_open.set(String.valueOf(cb_true));
        }
        tbw_exit();
        return;
    }

    private void tbw_start_primary_greater() {
        CobolDisplay.display("start > tbw-key");
        tbw.start();
        /* INVALID KEY handling — needs file status check */
        CobolDisplay.display("start > tbw-key " + String.valueOf(fs_file_status));
        tbw_exit();
        return;
    }

    private void tbw_start_alternate() {
        CobolDisplay.display("start >= tbw-alt");
        tbw.start();
        /* INVALID KEY handling — needs file status check */
        CobolDisplay.display("start >= tbw-alt " + String.valueOf(fs_file_status));
        tbw_exit();
        return;
    }

    private void tbw_read_next() {
        CobolDisplay.display("read next");
        if (tbw.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: record at end */
        CobolDisplay.display("read next end");
        tbw_exit();
        return;
    }

    private void tbw_write() {
        CobolDisplay.display("write");
        tbw.write(tbw_record);
        /* INVALID KEY handling — needs file status check */
        CobolDisplay.display("write " + String.valueOf(fs_file_status));
        tbw_exit();
        return;
    }

    private void tbw_rewrite() {
        CobolDisplay.display("rewrite");
        tbw.rewrite(tbw_record);
        /* INVALID KEY handling — needs file status check */
        CobolDisplay.display("rewrite " + String.valueOf(fs_file_status));
        tbw_exit();
        return;
    }

    private void tbw_delete_file() {
        if (!String.valueOf(flag_tbw_open).trim().isEmpty()) {
            tbw_close(); // THRU tbw-Close-exit
            tbw_close_exit();
        }
    }

    private void fs_file_status() {
        CobolDisplay.display("delete file");
        file.delete();
    }

    private void tbw_2() {
        CobolDisplay.display("delete file done");
        tbw_exit();
        return;
    }

    private void tbw_close() {
        if (!String.valueOf(flag_tbw_open).trim().isEmpty()) {
            CobolDisplay.display("close");
            tbw.close();
            CobolDisplay.display("close done");
            flag_tbw_closed.set(String.valueOf(cb_true));
        }
    }

    private void tbw_close_exit() {
        return;
    }

    private void tbw_exit() {
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile026IndexedFileVariableLengthRecord().run();
    }
}
