package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile085ExtfhRelativeFiles extends CobolProgram {
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
    private short i = (short) 0;
    private CobolString file_name = new CobolString(64);
    private short file_name_len = (short) 0;
    private CobolString fh_action = new CobolString(2);
    private CobolString fh_action2 = new CobolString(1);
    private CobolString action_code = new CobolString(1); // Group: ACTION-CODE
    private CobolString action_type = new CobolString(1);
    private static final String cobol_type = "FA";
    private static final String special_type = "00";
    private CobolString cobol_op = new CobolString(1);
    private static final String open_input = "00";
    private static final String open_output = "01";
    private static final String open_i_o = "02";
    private static final String open_extend = "03";
    private static final String open_input_no_rewind = "04";
    private static final String open_output_no_rewind = "05";
    private static final String open_input_reversed = "08";
    private static final String close_file = "80";
    private static final String close_lock = "81";
    private static final String close_no_rewind = "82";
    private static final String close_reel_unit = "84";
    private static final String close_reel_unit_for_removal = "85";
    private static final String close_reel_unit_no_rewind = "86";
    private static final String read_seq_no_lock = "8D";
    private static final String read_seq_lock = "D8";
    private static final String read_seq_kept_lock = "D9";
    private static final String read_seq = "F5";
    private static final String read_previous_no_lock = "8C";
    private static final String read_previous_lock = "DE";
    private static final String read_previous_kept_lock = "DF";
    private static final String read_previous = "F9";
    private static final String read_random_no_lock = "8E";
    private static final String read_random_lock = "DA";
    private static final String read_random_kept_lock = "DB";
    private static final String read_random = "F6";
    private static final String read_direct_no_lock = "8F";
    private static final String read_direct_lock = "D6";
    private static final String read_direct_kept_lock = "D7";
    private static final String read_direct = "C9";
    private static final String read_position = "F1";
    private static final String write_before = "E1";
    private static final String write_after = "E2";
    private static final String write_before_tab = "E3";
    private static final String write_after_tab = "E4";
    private static final String write_before_page = "E5";
    private static final String write_after_page = "E6";
    private static final String write_record = "F3";
    private static final String rewrite_record = "F4";
    private static final String start_equal_prime_key = "E8";
    private static final String start_equal_key = "E9";
    private static final String start_greater = "EA";
    private static final String start_not_less = "EB";
    private static final String start_less = "FE";
    private static final String start_less_or_equal = "FF";
    private static final String step_next_no_lock = "90";
    private static final String step_next_lock = "D4";
    private static final String step_next_kept_lock = "D5";
    private static final String step_next = "CA";
    private static final String step_first_no_lock = "92";
    private static final String step_first_lock = "D0";
    private static final String step_first_kept_lock = "D1";
    private static final String step_first = "CC";
    private static final String delete_record = "F7";
    private static final String delete_file = "F8";
    private static final String unlock_current = "0E";
    private static final String commit_all = "DC";
    private static final String rollback_all = "DD";
    private static final String get_file_info = "06";
    private static final String open_new_index = "07";
    private static final String get_next_record = "08";
    private static final String add_key_value = "09";
    private static final String unlock_record = "0F";
    private CobolString fcd_area = new CobolString(1);


    private CobolString record_area = new CobolString(256);
    private CobolString data_area1 = new CobolString(256);
    private CobolString fcd_relative_key = new CobolString(256);
    private CobolString prime_key = new CobolString(256);
    private CobolString fcd_record_address = new CobolString(256);
    private CobolString address = new CobolString(256);
    private CobolString fcd_version_number = new CobolString(256);
    private CobolString fcd_version = new CobolString(256);
    private CobolString fcd_name_length = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString access = new CobolString(256);
    private CobolString[] seq = new CobolString[100];
    private CobolString[] random = new CobolString[100];
    private CobolString[] dynamic = new CobolString[100];
    private CobolString fcd_access_mode = new CobolString(256);
    private CobolString[] isam = new CobolString[100];
    private CobolString[] relative = new CobolString[100];
    private CobolString[] lseq = new CobolString[100];
    private CobolString fcd_organization = new CobolString(256);
    private CobolString[] closed = new CobolString[100];
    private CobolString[] input = new CobolString[100];
    private CobolString[] output = new CobolString[100];
    private CobolString[] i_o = new CobolString[100];
    private CobolString[] extend = new CobolString[100];
    private CobolString fcd_open_mode = new CobolString(256);
    private CobolString[] fixed = new CobolString[100];
    private CobolString or = new CobolString(256);
    private CobolString[] variable = new CobolString[100];
    private CobolString fcd_recording_mode = new CobolString(256);
    private CobolString fcd_filename_address = new CobolString(256);
    private CobolString fcd_min_rec_length = new CobolString(256);
    private CobolString fcd_max_rec_length = new CobolString(256);
    private CobolString fcd_current_rec_len = new CobolString(256);
    private CobolString fcd_file_status = new CobolString(256);
    private CobolString fcd_status_key_1 = new CobolString(256);
    private CobolString fcd_binary = new CobolString(256);

    private void a_000_main() {
        fh_action.set(String.valueOf("FA01"));
        a_100_open_file();
        record_area.set(String.valueOf(" "));
        data_area1.set(String.valueOf(0));
        for (int _i0 = 0; _i0 < 7; _i0++) {
            data_area1.set(new BigDecimal(String.valueOf(data_area1).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            fcd_relative_key.set(String.valueOf(data_area1));
            prime_key.set(String.valueOf("RECORD-1"));
            prime_key.setRefMod(8, 1, String.valueOf(CobolString.refMod(data_area1, 10, 1)));
            fh_action.set(String.valueOf("FAF3"));
            fcd_record_address.set(String.valueOf(address));
            a_200_call_extfh();
        }
        a_600_close_file();
        fh_action.set(String.valueOf("FA02"));
        a_100_open_file();
        fcd_relative_key.set(String.valueOf(3));
        a_700_update();
        fcd_relative_key.set(String.valueOf(6));
        a_700_update();
        a_600_close_file();
        System.exit(0);
    }

    private void a_100_open_file() {
        fcd_area.set(String.valueOf("\u0000"));
        fcd_version.set(String.valueOf(fcd_version_number));
        file_name.set(String.valueOf("TESTREL.DAT"));
        file_name_len = new BigDecimal(String.valueOf(11).trim()).shortValue();
        fcd_name_length.set(String.valueOf(file_name_len));
        _unnamed.set(String.valueOf(file_name_len));
        access.set(String.valueOf(file_name_len));
        if (seq[0 - 1] == null) seq[0 - 1] = new CobolString(256);
        seq[0 - 1].set(String.valueOf(file_name_len));
        if (random[4 - 1] == null) random[4 - 1] = new CobolString(256);
        random[4 - 1].set(String.valueOf(file_name_len));
        if (dynamic[8 - 1] == null) dynamic[8 - 1] = new CobolString(256);
        dynamic[8 - 1].set(String.valueOf(file_name_len));
        fcd_access_mode.set(String.valueOf(8));
        _unnamed.set(String.valueOf(8));
        if (isam[2 - 1] == null) isam[2 - 1] = new CobolString(256);
        isam[2 - 1].set(String.valueOf(8));
        if (relative[3 - 1] == null) relative[3 - 1] = new CobolString(256);
        relative[3 - 1].set(String.valueOf(8));
        if (lseq[0 - 1] == null) lseq[0 - 1] = new CobolString(256);
        lseq[0 - 1].set(String.valueOf(8));
        if (seq[1 - 1] == null) seq[1 - 1] = new CobolString(256);
        seq[1 - 1].set(String.valueOf(8));
        fcd_organization.set(String.valueOf(3));
        _unnamed.set(String.valueOf(3));
        if (closed[128 - 1] == null) closed[128 - 1] = new CobolString(256);
        closed[128 - 1].set(String.valueOf(3));
        if (input[0 - 1] == null) input[0 - 1] = new CobolString(256);
        input[0 - 1].set(String.valueOf(3));
        if (output[1 - 1] == null) output[1 - 1] = new CobolString(256);
        output[1 - 1].set(String.valueOf(3));
        if (i_o[2 - 1] == null) i_o[2 - 1] = new CobolString(256);
        i_o[2 - 1].set(String.valueOf(3));
        if (extend[3 - 1] == null) extend[3 - 1] = new CobolString(256);
        extend[3 - 1].set(String.valueOf(3));
        fcd_open_mode.set(String.valueOf(128));
        _unnamed.set(String.valueOf(128));
        if (fixed[0 - 1] == null) fixed[0 - 1] = new CobolString(256);
        fixed[0 - 1].set(String.valueOf(128));
        or.set(String.valueOf(128));
        if (variable[1 - 1] == null) variable[1 - 1] = new CobolString(256);
        variable[1 - 1].set(String.valueOf(128));
        fcd_recording_mode.set(String.valueOf(0));
        fcd_filename_address.set(String.valueOf(address));
        fcd_min_rec_length.set(String.valueOf(CobolIntrinsics.length(record_area)));
        fcd_max_rec_length.set(String.valueOf(CobolIntrinsics.length(record_area)));
        fcd_current_rec_len.set(String.valueOf(CobolIntrinsics.length(record_area)));
        a_200_call_extfh();
    }

    private void a_200_call_extfh() {
        CobolProgram.call("EXTFH", fh_action, fcd_area);
        if ((!String.valueOf(fcd_file_status).equals(String.valueOf("00")) && !(!String.valueOf(_unnamed).trim().isEmpty()))) {
            /* RAW: '02'  */
            if (String.valueOf(fcd_status_key_1).equals(String.valueOf("9"))) {
                CobolDisplay.display("Operation: " + String.valueOf(fh_action2) + " FILE ERROR, STATUS: 9/" + String.valueOf(fcd_binary));
            } else {
                CobolDisplay.display("Operation: " + String.valueOf(fh_action2) + " FILE ERROR, STATUS: " + String.valueOf(fcd_file_status));
            }
            System.exit(0);
        }
    }

    private void a_300_read_record() {
    }

    private void record_area() {
    }

    private void cobol_op() {
        fcd_record_address.set(String.valueOf(address));
        a_200_call_extfh();
    }

    private void i() {
    }

    private void a_400_rewrite_record() {
    }

    private void action_type() {
    }

    private void cobol_op_2() {
        a_200_call_extfh();
    }

    private void a_600_close_file() {
    }

    private void fh_action() {
        a_200_call_extfh();
    }

    private void a_700_update() {
        a_300_read_record();
        CobolDisplay.display("READ    " + String.valueOf(i) + ": " + String.valueOf(CobolString.refMod(record_area, 1, 41)) + ".");
    }

    private void record_growth() {
        a_400_rewrite_record();
        a_300_read_record();
        CobolDisplay.display("REWRITE " + String.valueOf(i) + ": " + String.valueOf(CobolString.refMod(record_area, 1, 41)) + ".");
    }

    @Override
    public void run() {
        a_000_main();
    }

    public static void main(String[] args) {
        new RunFile085ExtfhRelativeFiles().run();
    }
}
