package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile081ExtfhFixedSequential extends CobolProgram {
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
    private static final String program_name = "FBSEXTFH";
    private CobolString fcdopcode = new CobolString(1); // Group: FCDOPCODE
    private CobolString extfh_opcode = new CobolString(1);


    private CobolString extfh_opcode_isopenoutput = new CobolString(256);
    private CobolString cb_true = new CobolString(256);
    private CobolString fcd_parameter_block = new CobolString(256);
    private CobolString fcd_length = new CobolString(256);
    private CobolString fcd_version_number = new CobolString(256);
    private CobolString fcd_version = new CobolString(256);
    private CobolString fcd_sequential_org = new CobolString(256);
    private CobolString fcd_organization = new CobolString(256);
    private CobolString fcd_open_closed = new CobolString(256);
    private CobolString fcd_open_mode = new CobolString(256);
    private CobolString fix_filename = new CobolString(256);
    private CobolString fcd_name_length = new CobolString(256);
    private CobolString fcd_exclusive_bit = new CobolString(256);
    private CobolString fcd_lock_mode = new CobolString(256);
    private CobolString fcd_format_cobol2 = new CobolString(256);
    private CobolString fcd_file_format = new CobolString(256);
    private CobolString fix_recordarea = new CobolString(256);
    private CobolString fcd_max_rec_length = new CobolString(256);
    private CobolString fcd_min_rec_length = new CobolString(256);
    private CobolString fcd_filename_address = new CobolString(256);
    private CobolString[] address = new CobolString[100];
    private CobolString fcd_current_rec_len = new CobolString(256);
    private CobolString fcd_file_status = new CobolString(256);
    private CobolString fix_tx = new CobolString(256);
    private CobolString fix_tcount = new CobolString(256);
    private CobolString extfh_opcode_iswrite = new CobolString(256);
    private CobolString[] fix_test_len = new CobolString[100];
    private CobolString fcd_line_count = new CobolString(256);
    private CobolString fcd_record_address = new CobolString(256);
    private CobolString extfh_opcode_isclose = new CobolString(256);
    private CobolString extfh_opcode_isopeninput = new CobolString(256);
    private CobolString extfh_opcode_isreadsequential = new CobolString(256);
    private CobolString fcd_status_key_1 = new CobolString(256);
    private CobolString fcd_binary = new CobolString(256);

    private void para_main() {
        CobolDisplay.display(String.valueOf(program_name) + ": STARTING.");
        CobolDisplay.display(String.valueOf(program_name) + ": CREATING FIXED  SEQ FILE.");
        extfh_opcode_isopenoutput.set(String.valueOf(cb_true));
        fcd_length.set(String.valueOf(CobolIntrinsics.length(fcd_parameter_block)));
        fcd_version.set(String.valueOf(fcd_version_number));
        fcd_organization.set(String.valueOf(fcd_sequential_org));
        fcd_open_mode.set(String.valueOf(fcd_open_closed));
        fcd_name_length.set(String.valueOf(CobolIntrinsics.length(fix_filename)));
        fcd_lock_mode.set(String.valueOf(fcd_exclusive_bit));
        fcd_file_format.set(String.valueOf(fcd_format_cobol2));
        fcd_max_rec_length.set(String.valueOf(CobolIntrinsics.length(fix_recordarea)));
        fcd_min_rec_length.set(String.valueOf(0));
        fcd_filename_address.set(String.valueOf(address));
        fcd_current_rec_len.set(String.valueOf(80));
        fcd_max_rec_length.set(String.valueOf(80));
        fcd_min_rec_length.set(String.valueOf(80));
        call_extfh();
        fcd_check_stat();
        if (String.valueOf(fcd_file_status).equals(String.valueOf("00"))) {
            CobolDisplay.display(String.valueOf(program_name) + ": FIXED  SEQ FILE IS OPEN OUTPUT.");
            for (int _v = 1; !((String.valueOf(fix_tx).equals(String.valueOf(fix_tcount)) || !String.valueOf(fcd_file_status).equals(String.valueOf("00")))); _v += 1) {
                fix_tx.set(String.valueOf(_v));
            }
            extfh_opcode_iswrite.set(String.valueOf(cb_true));
            fcd_current_rec_len.set(String.valueOf(fix_test_len[Integer.parseInt(String.valueOf(fix_tx).trim()) - 1]));
            fcd_line_count.set(String.valueOf(1));
            fcd_record_address.set(String.valueOf(address[Integer.parseInt(String.valueOf(fix_tx).trim()) - 1]));
            call_extfh();
            fcd_check_stat();
            /* RAW: END-PERFORM  */
            if (String.valueOf(fcd_file_status).equals(String.valueOf("00"))) {
                CobolDisplay.display(String.valueOf(program_name) + ": FIXED  SEQ WRITES COMPLETE.");
            } else {
                CobolDisplay.display(String.valueOf(program_name) + ": UNABLE TO CREATE FIXED  SEQ FILE.");
            }
            extfh_opcode_isclose.set(String.valueOf(cb_true));
            call_extfh();
            fcd_check_stat();
            if (String.valueOf(fcd_file_status).equals(String.valueOf("00"))) {
                CobolDisplay.display(String.valueOf(program_name) + ": FIXED  SEQ FILE IS CLOSED.");
            } else {
                CobolDisplay.display(String.valueOf(program_name) + ": UNABLE TO CLOSE FIXED  SEQ FILE.");
            }
        } else {
            CobolDisplay.display(String.valueOf(program_name) + ": UNABLE TO OPEN FIXED  SEQ FILE AS OUTPUT.");
            System.exit(0);
        }
        CobolDisplay.display(String.valueOf(program_name) + ": READING FIXED  SEQ FILE.");
        extfh_opcode_isopeninput.set(String.valueOf(cb_true));
        fcd_organization.set(String.valueOf(fcd_sequential_org));
        fcd_open_mode.set(String.valueOf(fcd_open_closed));
        fcd_name_length.set(String.valueOf(CobolIntrinsics.length(fix_filename)));
        fcd_lock_mode.set(String.valueOf(fcd_exclusive_bit));
        fcd_file_format.set(String.valueOf(fcd_format_cobol2));
        fcd_max_rec_length.set(String.valueOf(CobolIntrinsics.length(fix_recordarea)));
        fcd_min_rec_length.set(String.valueOf(0));
        fcd_filename_address.set(String.valueOf(address));
        fcd_current_rec_len.set(String.valueOf(80));
        fcd_max_rec_length.set(String.valueOf(80));
        fcd_min_rec_length.set(String.valueOf(80));
        call_extfh();
        fcd_check_stat();
        if (String.valueOf(fcd_file_status).equals(String.valueOf("00"))) {
            CobolDisplay.display(String.valueOf(program_name) + ": FIXED  SEQ FILE IS OPEN INPUT.");
            while (!(!String.valueOf(fcd_file_status).equals(String.valueOf("00")))) {
            }
            extfh_opcode_isreadsequential.set(String.valueOf(cb_true));
            fcd_record_address.set(String.valueOf(address));
            call_extfh();
            fcd_check_stat();
            if (String.valueOf(fcd_file_status).equals(String.valueOf("00"))) {
                CobolDisplay.display(String.valueOf(program_name) + ": RECORD = " + String.valueOf(CobolString.refMod(fix_recordarea, 1, 40)) + ". " + "Size:" + String.valueOf(fcd_current_rec_len));
            }
            /* RAW: END-PERFORM  */
            if ((String.valueOf(fcd_file_status).equals(String.valueOf("00")) || true)) {
                CobolDisplay.display(String.valueOf(program_name) + ": FIXED  SEQ READS COMPLETE.");
            } else {
                CobolDisplay.display(String.valueOf(program_name) + ": UNABLE TO READ FIXED  SEQ FILE.");
            }
            extfh_opcode_isclose.set(String.valueOf(cb_true));
            call_extfh();
            fcd_check_stat();
            if (String.valueOf(fcd_file_status).equals(String.valueOf("00"))) {
                CobolDisplay.display(String.valueOf(program_name) + ": LSEQ FILE IS CLOSED.");
            } else {
                CobolDisplay.display(String.valueOf(program_name) + ": UNABLE TO CLOSE FIXED  SEQ FILE.");
            }
        } else {
            CobolDisplay.display(String.valueOf(program_name) + ": UNABLE TO OPEN FIXED  SEQ FILE AS INPUT.");
            System.exit(0);
        }
        CobolDisplay.display(String.valueOf(program_name) + ": ENDING.");
        System.exit(0);
    }

    private void call_extfh() {
        CobolProgram.call("EXTFH", fcdopcode);
    }

    private void fcd_parameter_block() {
    }

    private void fcd_check_stat() {
        if (String.valueOf(fcd_status_key_1).equals(String.valueOf("9"))) {
            CobolDisplay.display(String.valueOf(program_name) + ": RUN-TIME ERROR 9/" + String.valueOf(fcd_binary));
        } else {
            if (!String.valueOf(fcd_file_status).equals(String.valueOf("00"))) {
                CobolDisplay.display(String.valueOf(program_name) + ": FILE STATUS = " + String.valueOf(fcd_file_status));
            } else {
                /* CONTINUE */
            }
        }
    }

    private void seqextfh_term() {
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile081ExtfhFixedSequential().run();
    }
}
