package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile087ExtfhAutoConversionFcd2Fcd3On32bit extends CobolProgram {
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
    private CobolString ws_fcd_ddname = new CobolString(10);
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


    
    private CobolFile display = new CobolFile("DISPLAY", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile request = new CobolFile("REQUEST", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile _unnamed = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile _400 = new CobolFile("400", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString fcd_current_rec_len = new CobolString(256);
    private CobolString end_perform = new CobolString(256);
    private CobolString address = new CobolString(256);
    private CobolString fcd_length = new CobolString(256);
    private CobolString fcd_version_number = new CobolString(256);
    private CobolString fcd_version = new CobolString(256);
    private CobolString fcd_file_status = new CobolString(256);
    private CobolString fcd_status_defined = new CobolString(256);
    private CobolString fcd_access_mode = new CobolString(256);
    private CobolString fcd_open_closed = new CobolString(256);
    private CobolString fcd_open_mode = new CobolString(256);
    private CobolString fcd_external_name = new CobolString(256);
    private CobolString fcd_other_flags = new CobolString(256);
    private CobolString fcd_handle = new CobolString(256);
    private CobolString fcd_name_length = new CobolString(256);
    private CobolString fcd_filename_address = new CobolString(256);
    private CobolString fcd_key_def_address = new CobolString(256);
    private CobolString fcd_allow_readers = new CobolString(256);
    private CobolString fcd_locktypes = new CobolString(256);
    private CobolString fcd_line_sequential_org = new CobolString(256);
    private CobolString fcd_organization = new CobolString(256);
    private CobolString fcd_recmode_fixed = new CobolString(256);
    private CobolString fcd_recording_mode = new CobolString(256);
    private CobolString fcd_min_rec_length = new CobolString(256);
    private CobolString fcd_max_rec_length = new CobolString(256);
    private CobolString check = new CobolString(256);
    private CobolString cb_for = new CobolString(256);
    private CobolString missing = new CobolString(256);
    private CobolString cb_record = new CobolString(256);
    private CobolString fcd_record_address = new CobolString(256);
    private CobolString set = new CobolString(256);
    private CobolString fcd_status_key_1 = new CobolString(256);
    private CobolString fcd_binary = new CobolString(256);

    private void para_main() {
        /* RAW: * - - - - - */
    }

    private void para_main_2() {
        _100();
        /* RAW: -  */
    }

    private void para_open() {
        for (int _v = 1; !(Integer.parseInt(String.valueOf(i).trim()) > 10); _v += 1) {
            i.set(String.valueOf(_v));
            display_a1_zz9.set(String.valueOf(i));
            fcd_record.set(String.valueOf(display_a1_zz9));
            fcd_current_rec_len.set(String.valueOf(10));
            if ((String.valueOf(i).equals(String.valueOf(3)) || true)) {
                fcd_record.setRefMod(5, 20, String.valueOf("Have a great day"));
                fcd_current_rec_len.set(String.valueOf(25));
            }
            if (String.valueOf(i).equals(String.valueOf(8))) {
                fcd_record.setRefMod(5, 20, String.valueOf("Enjoy the show"));
                fcd_current_rec_len.set(String.valueOf(19));
            }
            _300();
            /* RAW: -  */
            /* WRITE END-PERFORM — no file mapping */ // end_perform.write();
        }
        _400();
        /* RAW: -  */
    }

    private void para_close() {
        action_code.set(String.valueOf(op_open_input));
        _800();
        /* RAW: - CALL-EXTFH */
        CobolDisplay.display("Listing " + String.valueOf(ws_fcd_ddname) + ".");
        for (int _v = 1; !(Integer.parseInt(String.valueOf(i).trim()) > 10); _v += 1) {
            i.set(String.valueOf(_v));
            _350();
            /* RAW: -  */
            if (display.read(null) == FileStatus.AT_END) {
            }
            /* RAW: FCD-CURRENT-REC-LEN ": " FCD-RECORD ( 1 : */
        }
        _400();
        /* RAW: -  */
    }

    private void para_close_2() {
        System.exit(0);
    }

    private void para_open_2() {
        ws_fcd_ddname.set(String.valueOf("TESTOUT"));
        ws_fcd_size = new BigDecimal(String.valueOf(CobolIntrinsics.length(fcd_map)).trim()).shortValue();
        CobolDisplay.display("FCD SIZE " + String.valueOf(ws_fcd_size) + ".");
        CobolDisplay.display("Writing " + String.valueOf(ws_fcd_ddname) + ".");
        if (String.valueOf(ws_fcd_ptr).equals(String.valueOf(0))) {
            /* ALLOCATE — dynamic memory, not typical in Java */
            address.set(String.valueOf(ws_fcd_ptr));
            fcd_map.set(String.valueOf("\u0000"));
            fcd_length.set(String.valueOf(ws_fcd_size));
            fcd_version.set(String.valueOf(fcd_version_number));
            fcd_file_status.set(String.valueOf("00"));
            fcd_access_mode.set(String.valueOf(fcd_status_defined));
            fcd_open_mode.set(String.valueOf(fcd_open_closed));
            fcd_other_flags.set(String.valueOf(fcd_external_name));
            fcd_handle.set(String.valueOf(0));
            fcd_name_length.set(String.valueOf(8));
            fcd_filename_address.set(String.valueOf(address));
            fcd_key_def_address.set(String.valueOf(0));
            fcd_locktypes.set(String.valueOf(fcd_allow_readers));
        } else {
            address.set(String.valueOf(ws_fcd_ptr));
            if (!String.valueOf(fcd_open_mode).equals(String.valueOf(fcd_open_closed))) {
                CobolDisplay.display("ERRROR - FILE ALREADY OPEN");
                System.exit(0);
            }
        }
        fcd_organization.set(String.valueOf(fcd_line_sequential_org));
        fcd_recording_mode.set(String.valueOf(fcd_recmode_fixed));
        fcd_min_rec_length.set(String.valueOf(10));
        fcd_max_rec_length.set(String.valueOf(50));
        /* MOVE to file * — not applicable */
        check.set(String.valueOf(50));
        cb_for.set(String.valueOf(50));
        missing.set(String.valueOf(50));
        cb_record.set(String.valueOf(50));
        address.set(String.valueOf(50));
        /* MOVE to file * — not applicable */
        action_code.set(String.valueOf(op_open_output));
        /* MOVE to file * — not applicable */
        _800();
        /* RAW: - CALL-EXTFH */
        fcd_record_address.set(String.valueOf(address));
        fcd_filename_address.set(String.valueOf((0 * Integer.parseInt(String.valueOf(check).trim()))));
        /* RAW: for missing filename address */
        action_code.set(String.valueOf(op_open_output));
        _800();
        /* RAW: - CALL-EXTFH * Now */
        cb_record.set(String.valueOf(set));
        address.set(String.valueOf(set));
        /* RAW: FCD-RECORD-ADDRESS TO ADDRESS OF FCD-RECORD */
        fcd_filename_address.set(String.valueOf(address));
        action_code.set(String.valueOf(op_open_output));
        _800();
        /* RAW: -  */
    }

    private void call_extfh() {
        /* RAW: * - - - - - */
        request.write("");
        /* RAW: * - - - - - */
    }

    private void para_write() {
        action_code.set(String.valueOf(op_write));
        _800();
        /* RAW: -  */
    }

    private void call_extfh_2() {
        /* RAW: * - - - - - */
        if (request.read(null) == FileStatus.AT_END) {
        }
        /* RAW: * - - - - - */
    }

    private void para_read() {
        action_code.set(String.valueOf(op_read_next));
        _800();
        /* RAW: -  */
    }

    private void call_extfh_3() {
        /* RAW: * - - - - - */
        request.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _unnamed.close();
        _400.close();
        _unnamed.close();
    }

    private void para_close_3() {
        action_code.set(String.valueOf(op_close));
        _800();
        /* RAW: -  */
    }

    private void call_extfh_4() {
        /* RAW: * - - - - - */
    }

    private void call_extfh_5() {
        fcd_file_status.set(String.valueOf("00"));
        CobolProgram.call("EXTFH", action_code, _unnamed, fcd_map);
        if (!String.valueOf(fcd_status_key_1).equals(String.valueOf("0"))) {
            if (String.valueOf(fcd_status_key_1).equals(String.valueOf("9"))) {
                if (String.valueOf(fcd_binary).equals(String.valueOf(161))) {
                    CobolDisplay.display("EXTFH Status: 9/" + String.valueOf(fcd_binary));
                    CobolDisplay.display("FCD2 is not accepted!");
                    System.exit(0);
                }
                CobolDisplay.display("EXTFH Status: 9/" + String.valueOf(fcd_binary));
                if (String.valueOf(fcd_binary).equals(String.valueOf(141))) {
                    CobolDisplay.display("FCD2 is missing value(s)!");
                }
            } else {
                CobolDisplay.display("EXTFH Status: " + String.valueOf(fcd_file_status));
            }
        }
        if ((String.valueOf(fcd_status_key_1).equals(String.valueOf("9")) && String.valueOf(fcd_binary).equals(String.valueOf(199)))) {
            fcd_file_status.set(String.valueOf("10"));
        }
    }

    private void _100() { /* stub — external/COPY */ }

    private void _300() { /* stub — external/COPY */ }

    private void _400() { /* stub — external/COPY */ }

    private void _800() { /* stub — external/COPY */ }

    private void _350() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile087ExtfhAutoConversionFcd2Fcd3On32bit().run();
    }
}
