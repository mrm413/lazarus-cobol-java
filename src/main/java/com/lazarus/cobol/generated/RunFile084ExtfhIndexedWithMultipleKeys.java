package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile084ExtfhIndexedWithMultipleKeys extends CobolProgram {
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
    private short ckeys = (short) 0;
    private short nkeys = (short) 0;
    private short curr_off = (short) 0;
    private short i = (short) 0;
    private CobolString fh_action = new CobolString(2);
    private CobolString filler_1 = new CobolString(1);
    private CobolString fh_action2 = new CobolString(1);
    private CobolString file_name = new CobolString(64);
    private CobolString index_name = new CobolString(64);
    private short file_name_len = (short) 0;
    private CobolString acb_key_group = new CobolString(1); // Group: ACB-KEY-GROUP
    private int acb_cnt = 0;
    private CobolString[] acb_key_table = new CobolString[32]; // Group: ACB-KEY-TABLE
    private short[] acb_key_len = new short[32];
    private short[] acb_key_pos = new short[32];
    private short[] acb_key_dupe = new short[32];


    private CobolString record_area = new CobolString(256); // fallback
    private CobolString data_area = new CobolString(256); // fallback
    private CobolString fcd_area = new CobolString(256); // fallback
    private CobolString fcd_version_number = new CobolString(256); // fallback
    private CobolString fcd_version = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString make = new CobolString(256); // fallback
    private CobolString _3 = new CobolString(256); // fallback
    private CobolString keys = new CobolString(256); // fallback
    private CobolString mf = new CobolString(256); // fallback
    private CobolString key_def = new CobolString(256); // fallback
    private CobolString key_def_area = new CobolString(256); // fallback
    private CobolString fcd_key_def_address = new CobolString(256); // fallback
    private CobolString address = new CobolString(256); // fallback
    private CobolString fcd_name_length = new CobolString(256); // fallback
    private CobolString fcd_access_mode = new CobolString(256); // fallback
    private CobolString fcd_organization = new CobolString(256); // fallback
    private CobolString fcd_open_mode = new CobolString(256); // fallback
    private CobolString fixed = new CobolString(256); // fallback
    private CobolString or = new CobolString(256); // fallback
    private CobolString variable = new CobolString(256); // fallback
    private CobolString fcd_recording_mode = new CobolString(256); // fallback
    private CobolString fcd_filename_address = new CobolString(256); // fallback
    private CobolString fcd_min_rec_length = new CobolString(256); // fallback
    private CobolString fcd_max_rec_length = new CobolString(256); // fallback
    private CobolString test = new CobolString(256); // fallback
    private CobolString data_area1 = new CobolString(256); // fallback
    private CobolString data_area2 = new CobolString(256); // fallback
    private CobolString prime_key = new CobolString(256); // fallback
    private CobolString fcd_record_address = new CobolString(256); // fallback
    private CobolString fcd_file_status = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString fcd_status_key_1 = new CobolString(256); // fallback
    private CobolString fcd_binary = new CobolString(256); // fallback
    private CobolString rewrite_record = new CobolString(256); // fallback
    private CobolString cobol_op = new CobolString(256); // fallback
    private CobolString fcd_key_length = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private void a_000_main() {
        a_100_open_file();
        a_300_read_record();
        CobolDisplay.display("READ ------> " + String.valueOf(CobolString.refMod(record_area, 1, 55)) + ".");
        record_area.setRefMod(46, 10, String.valueOf("1234567890"));
        a_400_rewrite_record();
        a_300_read_record();
        CobolDisplay.display("WRITE -----> " + String.valueOf(CobolString.refMod(record_area, 1, 55)) + ".");
        data_area.set(String.valueOf(" "));
        a_400_rewrite_record();
        a_700_start();
        a_800_read_previous();
        CobolDisplay.display("READ PREV -> " + String.valueOf(CobolString.refMod(record_area, 1, 55)) + ".");
        a_600_close_file();
        System.exit(0);
    }

    private void a_100_open_file() {
        fcd_area.set(String.valueOf("\u0000"));
        acb_key_group.set(String.valueOf("\u0000"));
        fcd_version.set(String.valueOf(fcd_version_number));
        _filler_003.set(String.valueOf(fcd_version_number));
        make.set(String.valueOf(fcd_version_number));
        _3.set(String.valueOf(fcd_version_number));
        keys.set(String.valueOf(fcd_version_number));
        acb_cnt = new BigDecimal(String.valueOf(3).trim()).intValue();
        acb_key_pos[1 - 1] = new BigDecimal(String.valueOf(0).trim()).shortValue();
        acb_key_len[1 - 1] = new BigDecimal(String.valueOf(20).trim()).shortValue();
        acb_key_dupe[1 - 1] = new BigDecimal(String.valueOf(0).trim()).shortValue();
        acb_key_pos[2 - 1] = new BigDecimal(String.valueOf(20).trim()).shortValue();
        acb_key_len[2 - 1] = new BigDecimal(String.valueOf(10).trim()).shortValue();
        acb_key_dupe[2 - 1] = new BigDecimal(String.valueOf(1).trim()).shortValue();
        acb_key_pos[3 - 1] = new BigDecimal(String.valueOf(30).trim()).shortValue();
        acb_key_len[3 - 1] = new BigDecimal(String.valueOf(15).trim()).shortValue();
        acb_key_dupe[3 - 1] = new BigDecimal(String.valueOf(1).trim()).shortValue();
        _filler_004.set(String.valueOf(1));
        make.set(String.valueOf(1));
        mf.set(String.valueOf(1));
        key_def.set(String.valueOf(1));
        CobolProgram.call("EXFHKEYS", acb_key_group, key_def_area);
        fh_action.set(String.valueOf("FA01"));
        fcd_key_def_address.set(String.valueOf(address));
        file_name.set(String.valueOf("TESTISAM2"));
        file_name_len = new BigDecimal(String.valueOf(9).trim()).shortValue();
        fcd_name_length.set(String.valueOf(file_name_len));
        fcd_access_mode.set(String.valueOf(0));
        fcd_organization.set(String.valueOf(2));
        fcd_open_mode.set(String.valueOf(128));
        _filler_005.set(String.valueOf(128));
        fixed.set(String.valueOf(128));
        or.set(String.valueOf(128));
        variable.set(String.valueOf(128));
        fcd_recording_mode.set(String.valueOf(1));
        fcd_recording_mode.set(String.valueOf(0));
        fcd_filename_address.set(String.valueOf(address));
        fcd_min_rec_length.set(String.valueOf(400));
        fcd_max_rec_length.set(String.valueOf(400));
        a_200_call_extfh();
        a_600_close_file();
        /* RAW: *  */
        /* WRITE test — no file mapping */ // test.write();
        /* RAW: data to file */
        fh_action.set(String.valueOf("FA02"));
        fcd_access_mode.set(String.valueOf(8));
        a_200_call_extfh();
        record_area.set(String.valueOf(" "));
        data_area1.set(String.valueOf(0));
        data_area2.set(String.valueOf(0));
        for (int _i0 = 0; _i0 < 7; _i0++) {
            data_area1.set(new BigDecimal(String.valueOf(data_area1).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            data_area2.set(new BigDecimal(String.valueOf(data_area2).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            prime_key.set(String.valueOf("RECORD-1"));
            prime_key.setRefMod(8, 1, String.valueOf(CobolString.refMod(data_area1, 10, 1)));
            fh_action.set(String.valueOf("FAF3"));
            fcd_record_address.set(String.valueOf(address));
            a_200_call_extfh();
        }
    }

    private void a_110_exit() {
        return;
    }

    private void a_200_call_extfh() {
        CobolProgram.call("EXTFH", fh_action, fcd_area);
        if ((!String.valueOf(fcd_file_status).equals(String.valueOf("00")) && !(!String.valueOf(_filler_006).trim().isEmpty()))) {
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
        record_area.set("");
        prime_key.set(String.valueOf("RECORD-3"));
        fh_action.set(String.valueOf("FA8E"));
        fcd_record_address.set(String.valueOf(address));
        a_200_call_extfh();
    }

    private void a_400_rewrite_record() {
        fh_action.set(String.valueOf("FAF4"));
        cobol_op.set(String.valueOf(rewrite_record));
        a_200_call_extfh();
    }

    private void a_600_close_file() {
        fh_action.set(String.valueOf("FA80"));
        a_200_call_extfh();
    }

    private void a_700_start() {
        fcd_record_address.set(String.valueOf(address));
        fcd_key_length.set(String.valueOf(20));
        prime_key.set(String.valueOf("\uFFFF"));
        fh_action.set(String.valueOf("FAFE"));
        a_200_call_extfh();
    }

    private void a_800_read_previous() {
        fh_action.set(String.valueOf("FAF9"));
        a_200_call_extfh();
    }

    @Override
    public void run() {
        a_000_main();
    }

    public static void main(String[] args) {
        new RunFile084ExtfhIndexedWithMultipleKeys().run();
    }
}
