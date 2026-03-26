package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile079ExtfhLineSequentialFilesDirectExtfh extends CobolProgram {
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
    private CobolString i = new CobolString(2);
    private CobolString ws_fcd_ddname = new CobolString(8);
    private long ws_fcd_ptr = 0L;
    private short ws_fcd_size = (short) 0;
    private short ws_fcd_flags = (short) 0;
    private CobolString display_byte = new CobolString(1); // Group: DISPLAY-BYTE
    private CobolString display_xxx = new CobolString(3);
    private CobolString display_zz9 = new CobolString(3);
    private CobolString action_code = new CobolString(2);
    private static final String op_open_input = "fa00";
    private static final String op_open_output = "fa01";
    private static final String op_open_i_o = "fa02";
    private static final String op_write = "faf3";
    private static final String op_release = "faf3";
    private static final String op_rewrite = "faf4";
    private static final String op_read_next = "faf5";
    private static final String op_start_equal = "fae9";
    private static final String op_close = "fa80";
    private static final String op_query_file = "0006";
    private CobolString display_a1_xxx = new CobolString(3);
    private CobolString display_a1_zz9 = new CobolString(3);
    private CobolString display_a2_xxx = new CobolString(3);
    private CobolString display_a2_zz9 = new CobolString(3);
    private CobolString fcd_filename = new CobolString(80);
    private CobolString fcd_record = new CobolString(512);

    // LINKAGE SECTION
    private CobolString fcd_map = new CobolString(1);


    // FALLBACK FILE DESCRIPTORS
    private CobolFile request = new CobolFile("REQUEST", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile _filler_001 = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile _400_close = new CobolFile("400-CLOSE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString address = new CobolString(256); // fallback
    private CobolString fcd_length = new CobolString(256); // fallback
    private CobolString fcd_version_number = new CobolString(256); // fallback
    private CobolString fcd_version = new CobolString(256); // fallback
    private CobolString fcd_file_status = new CobolString(256); // fallback
    private CobolString fcd_status_defined = new CobolString(256); // fallback
    private CobolString fcd_access_mode = new CobolString(256); // fallback
    private CobolString fcd_open_closed = new CobolString(256); // fallback
    private CobolString fcd_open_mode = new CobolString(256); // fallback
    private CobolString fcd_external_name = new CobolString(256); // fallback
    private CobolString fcd_other_flags = new CobolString(256); // fallback
    private CobolString fcd_handle = new CobolString(256); // fallback
    private CobolString fcd_name_length = new CobolString(256); // fallback
    private CobolString fcd_filename_address = new CobolString(256); // fallback
    private CobolString fcd_key_def_address = new CobolString(256); // fallback
    private CobolString fcd_allow_readers = new CobolString(256); // fallback
    private CobolString fcd_locktypes = new CobolString(256); // fallback
    private CobolString fcd_line_sequential_org = new CobolString(256); // fallback
    private CobolString fcd_organization = new CobolString(256); // fallback
    private CobolString fcd_recmode_fixed = new CobolString(256); // fallback
    private CobolString fcd_recording_mode = new CobolString(256); // fallback
    private CobolString fcd_min_rec_length = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString fcd_max_rec_length = new CobolString(256); // fallback
    private CobolString fcd_record_address = new CobolString(256); // fallback
    private CobolString move = new CobolString(256); // fallback
    private CobolString fcd_cr_delimiter = new CobolString(256); // fallback
    private CobolString fcd_status_type = new CobolString(256); // fallback
    private CobolString fcd_current_rec_len = new CobolString(256); // fallback
    private CobolString fcd_status_key_1 = new CobolString(256); // fallback
    private CobolString fcd_binary = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: * - - - - - */
        _100_open();
        for (int _v = 1; !(Integer.parseInt(String.valueOf(i).trim()) > 10); _v += 1) {
            i.set(String.valueOf(_v));
            display_a1_zz9.set(String.valueOf(i));
            fcd_record.set(String.valueOf(display_a1_zz9));
            _300_write();
        }
        _400_close();
        System.exit(0);
    }

    private void _100_open() { /* stub — external/COPY */ }

    private void _300_write() { /* stub — external/COPY */ }

    private void _400_close() { /* stub — external/COPY */ }

    private void _800_call_extfh() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile079ExtfhLineSequentialFilesDirectExtfh().run();
    }
}
