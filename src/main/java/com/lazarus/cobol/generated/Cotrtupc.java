package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cotrtupc extends CobolProgram {
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
    private CobolString ws_misc_storage = new CobolString(1); // Group: WS-MISC-STORAGE
    private CobolString ws_cics_processng_vars = new CobolString(1); // Group: WS-CICS-PROCESSNG-VARS
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private CobolString ws_tranid = new CobolString(4);
    private CobolString ws_uctrans = new CobolString(4);
    private CobolString ws_generic_edits = new CobolString(1); // Group: WS-GENERIC-EDITS
    private CobolString ws_edit_variable_name = new CobolString(25);
    private CobolString ws_edit_alphanum_only = new CobolString(256);
    private BigDecimal ws_edit_alphanum_length = BigDecimal.ZERO;
    private CobolString ws_edit_alphanum_only_flags = new CobolString(1);
    private CobolString ws_misc_vars = new CobolString(1); // Group: WS-MISC-VARS
    private CobolString ws_disp_sqlcode = new CobolString(1);
    private int ws_string_mid = 0;
    private int ws_string_len = 0;
    private CobolString ws_string_out = new CobolString(40);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile from = new CobolFile("FROM", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString cc_work_area = new CobolString(256); // fallback
    private CobolString ws_commarea = new CobolString(256); // fallback
    private CobolString lit_thistranid = new CobolString(256); // fallback
    private CobolString ws_return_msg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString lit_adminpgm = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString lit_listtpgm = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString ws_this_progcommarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_enter = new CobolString(256); // fallback
    private CobolString ttup_details_not_fetched = new CobolString(256); // fallback
    private CobolString pfk_invalid = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk12 = new CobolString(256); // fallback
    private CobolString ttup_changes_okayed_and_done = new CobolString(256); // fallback
    private CobolString ttup_changes_failed = new CobolString(256); // fallback
    private CobolString ttup_changes_backed_out = new CobolString(256); // fallback
    private CobolString ttup_delete_done = new CobolString(256); // fallback
    private CobolString ttup_delete_failed = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk03 = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString lit_admintranid = new CobolString(256); // fallback
    private CobolString cdemo_to_tranid = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString lit_thispgm = new CobolString(256); // fallback
    private CobolString cdemo_usrtyp_admin = new CobolString(256); // fallback
    private CobolString lit_thismapset = new CobolString(256); // fallback
    private CobolString cdemo_last_mapset = new CobolString(256); // fallback
    private CobolString lit_thismap = new CobolString(256); // fallback
    private CobolString cdemo_last_map = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString syncpoint = new CobolString(256); // fallback
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString cdemo_acct_id = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk04 = new CobolString(256); // fallback
    private CobolString ttup_start_delete = new CobolString(256); // fallback
    private CobolString ttup_confirm_delete = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk05 = new CobolString(256); // fallback
    private CobolString ttup_create_new_record = new CobolString(256); // fallback
    private CobolString found_trantype_in_table = new CobolString(256); // fallback
    private CobolString ws_invalid_key_pressed = new CobolString(256); // fallback
    private CobolString ws_return_msg = new CobolString(256); // fallback
    private CobolString ccard_error_msg = new CobolString(256); // fallback
    private CobolString ccard_aid_enter = new CobolString(256); // fallback
    private CobolString ttup_show_details = new CobolString(256); // fallback
    private CobolString ttup_changes_ok_not_confirmed = new CobolString(256); // fallback
    private CobolString ttup_details_not_found = new CobolString(256); // fallback
    private CobolString ttup_delete_in_progress = new CobolString(256); // fallback
    private CobolString pfk_valid = new CobolString(256); // fallback
    private CobolString ccard_next_prog = new CobolString(256); // fallback
    private CobolString ccard_next_mapset = new CobolString(256); // fallback
    private CobolString trtypcdi = new CobolString(256); // fallback
    private CobolString ttup_new_ttyp_type = new CobolString(256); // fallback
    private CobolString ttup_new_details = new CobolString(256); // fallback
    private CobolString trtydsci = new CobolString(256); // fallback
    private CobolString ttup_new_ttyp_type_desc = new CobolString(256); // fallback
    private CobolString input_ok = new CobolString(256); // fallback
    private CobolString flg_tranfilter_isvalid = new CobolString(256); // fallback
    private CobolString flg_tranfilter_blank = new CobolString(256); // fallback
    private CobolString no_search_criteria_received = new CobolString(256); // fallback
    private CobolString flg_tranfilter_not_ok = new CobolString(256); // fallback
    private CobolString ttup_invalid_search_keys = new CobolString(256); // fallback
    private CobolString no_changes_found = new CobolString(256); // fallback
    private CobolString ws_non_key_flags = new CobolString(256); // fallback
    private CobolString ttup_changes_not_ok = new CobolString(256); // fallback
    private CobolString ws_edit_desc_flags = new CobolString(256); // fallback
    private CobolString input_error = new CobolString(256); // fallback
    private CobolString ttup_old_ttyp_type = new CobolString(256); // fallback
    private CobolString ttup_old_ttyp_type_desc = new CobolString(256); // fallback
    private CobolString no_changes_detected = new CobolString(256); // fallback
    private CobolString change_has_occurred = new CobolString(256); // fallback
    private CobolString ws_edit_ttyp_flag = new CobolString(256); // fallback
    private CobolString ws_edit_numeric_2 = new CobolString(256); // fallback
    private CobolString ws_edit_alphanumeric_2 = new CobolString(256); // fallback
    private CobolString flg_alphnanum_not_ok = new CobolString(256); // fallback
    private CobolString flg_alphnanum_blank = new CobolString(256); // fallback
    private CobolString lit_all_alphanum_from_x = new CobolString(256); // fallback
    private CobolString lit_all_alphanum_from = new CobolString(256); // fallback
    private CobolString flg_alphnanum_isvalid = new CobolString(256); // fallback
    private CobolString abend_culprit = new CobolString(256); // fallback
    private CobolString abend_code = new CobolString(256); // fallback
    private CobolString abend_reason = new CobolString(256); // fallback
    private CobolString abend_msg = new CobolString(256); // fallback
    private CobolString ws_delete_was_cancelled = new CobolString(256); // fallback
    private CobolString ws_update_was_cancelled = new CobolString(256); // fallback
    private CobolString ws_invalid_key = new CobolString(256); // fallback
    private CobolString cdemo_card_num = new CobolString(256); // fallback
    private CobolString cdemo_acct_status = new CobolString(256); // fallback
    private CobolString ctrtupao = new CobolString(256); // fallback
    private CobolString ws_curdate_data = new CobolString(256); // fallback
    private CobolString ccda_title01 = new CobolString(256); // fallback
    private CobolString title01o = new CobolString(256); // fallback
    private CobolString ccda_title02 = new CobolString(256); // fallback
    private CobolString title02o = new CobolString(256); // fallback
    private CobolString trnnameo = new CobolString(256); // fallback
    private CobolString pgmnameo = new CobolString(256); // fallback
    private CobolString ws_curdate_month = new CobolString(256); // fallback
    private CobolString ws_curdate_mm = new CobolString(256); // fallback
    private CobolString ws_curdate_day = new CobolString(256); // fallback
    private CobolString ws_curdate_dd = new CobolString(256); // fallback
    private CobolString ws_curdate_year = new CobolString(256); // fallback
    private CobolString ws_curdate_yy = new CobolString(256); // fallback
    private CobolString ws_curdate_mm_dd_yy = new CobolString(256); // fallback
    private CobolString curdateo = new CobolString(256); // fallback
    private CobolString ws_curtime_hours = new CobolString(256); // fallback
    private CobolString ws_curtime_hh = new CobolString(256); // fallback
    private CobolString ws_curtime_minute = new CobolString(256); // fallback
    private CobolString ws_curtime_mm = new CobolString(256); // fallback
    private CobolString ws_curtime_second = new CobolString(256); // fallback
    private CobolString ws_curtime_ss = new CobolString(256); // fallback
    private CobolString ws_curtime_hh_mm_ss = new CobolString(256); // fallback
    private CobolString curtimeo = new CobolString(256); // fallback
    private CobolString ttup_changes_made = new CobolString(256); // fallback
    private CobolString trtypcdo = new CobolString(256); // fallback
    private CobolString trtydsco = new CobolString(256); // fallback
    private CobolString prompt_for_search_keys = new CobolString(256); // fallback
    private CobolString prompt_create_new_record = new CobolString(256); // fallback
    private CobolString prompt_for_changes = new CobolString(256); // fallback
    private CobolString prompt_delete_confirm = new CobolString(256); // fallback
    private CobolString inform_failure = new CobolString(256); // fallback
    private CobolString confirm_delete_success = new CobolString(256); // fallback
    private CobolString prompt_for_newdata = new CobolString(256); // fallback
    private CobolString prompt_for_confirmation = new CobolString(256); // fallback
    private CobolString confirm_update_success = new CobolString(256); // fallback
    private CobolString ttup_changes_okayed_lock_error = new CobolString(256); // fallback
    private CobolString ttup_changes_okayed_but_failed = new CobolString(256); // fallback
    private CobolString ws_no_info_message = new CobolString(256); // fallback
    private CobolString ws_info_msg = new CobolString(256); // fallback
    private CobolString infomsgo = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString dfhbmfse = new CobolString(256); // fallback
    private CobolString trtypcda = new CobolString(256); // fallback
    private CobolString trtypcdl = new CobolString(256); // fallback
    private CobolString flg_description_not_ok = new CobolString(256); // fallback
    private CobolString flg_description_blank = new CobolString(256); // fallback
    private CobolString trtydscl = new CobolString(256); // fallback
    private CobolString dfhred = new CobolString(256); // fallback
    private CobolString trtypcdc = new CobolString(256); // fallback
    private CobolString dfhbmprf = new CobolString(256); // fallback
    private CobolString trtydsca = new CobolString(256); // fallback
    private CobolString infomsga = new CobolString(256); // fallback
    private CobolString dfhbmdar = new CobolString(256); // fallback
    private CobolString dfhbmasb = new CobolString(256); // fallback
    private CobolString fkeysa = new CobolString(256); // fallback
    private CobolString fkey04a = new CobolString(256); // fallback
    private CobolString fkey05a = new CobolString(256); // fallback
    private CobolString fkey12a = new CobolString(256); // fallback
    private CobolString ccard_next_map = new CobolString(256); // fallback
    private CobolString send = new CobolString(256); // fallback
    private CobolString[] map = new CobolString[100]; // fallback array
    private CobolString[] mapset = new CobolString[100]; // fallback array
    private CobolString cursor = new CobolString(256); // fallback
    private CobolString erase = new CobolString(256); // fallback
    private CobolString freekb = new CobolString(256); // fallback
    private CobolString[] resp = new CobolString[100]; // fallback array
    private CobolString ttup_old_details = new CobolString(256); // fallback
    private CobolString dcl_tr_type = new CobolString(256); // fallback
    private CobolString sql = new CobolString(256); // fallback
    private CobolString select = new CobolString(256); // fallback
    private CobolString tr_type = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString tr_description = new CobolString(256); // fallback
    private CobolString into = new CobolString(256); // fallback
    private CobolString dcl_tr_description = new CobolString(256); // fallback
    private CobolString sqlcode = new CobolString(256); // fallback
    private CobolString ws_record_not_found = new CobolString(256); // fallback
    private CobolString sqlerrm = new CobolString(256); // fallback
    private CobolString dcl_tr_description_text = new CobolString(256); // fallback
    private CobolString dcl_tr_description_len = new CobolString(256); // fallback
    private CobolString move = new CobolString(256); // fallback
    private CobolString where = new CobolString(256); // fallback
    private CobolString could_not_lock_rec_for_update = new CobolString(256); // fallback
    private CobolString table_update_failed = new CobolString(256); // fallback
    private CobolString data_was_changed_before_update = new CobolString(256); // fallback
    private CobolString record_delete_failed = new CobolString(256); // fallback
    private CobolString abend_data = new CobolString(256); // fallback
    private CobolString[] length = new CobolString[100]; // fallback array
    private CobolString nohandle = new CobolString(256); // fallback
    private CobolString handle = new CobolString(256); // fallback
    private CobolString abend = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void para_main_2() {
        /* RAW: EXEC CICS HANDLE ABEND LABEL ( */
        cc_work_area.set("");
        ws_misc_storage.set("");
        ws_commarea.set("");
        ws_tranid.set(String.valueOf(lit_thistranid));
        ws_return_msg_off.set(String.valueOf(cb_true));
        if (((String.valueOf(eibcalen).equals(String.valueOf(0)) || (String.valueOf(cdemo_from_program).equals(String.valueOf(lit_adminpgm)) && !(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty()))) || (String.valueOf(cdemo_from_program).equals(String.valueOf(lit_listtpgm)) && !(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())))) {
            carddemo_commarea.set("");
            ws_this_progcommarea.set("");
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            ttup_details_not_fetched.set(String.valueOf(cb_true));
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, CobolIntrinsics.length(carddemo_commarea))));
            ws_this_progcommarea.set(String.valueOf(CobolString.refMod(dfhcommarea, (CobolIntrinsics.length(carddemo_commarea) + 1), CobolIntrinsics.length(ws_this_progcommarea))));
        }
        yyyy_store_pfkey(); // THRU YYYY-STORE-PFKEY-EXIT
        pfk_invalid.set(String.valueOf(cb_true));
        _0001();
        /* RAW: - CHECK-PFKEYS THRU 0001 - CHECK-PFKEYS-EXIT */
        if (!String.valueOf(ccard_aid_pfk12).trim().isEmpty()) {
            /* RAW: AND ( TTUP-SHOW-DETAILS OR TTUP-CREATE-NEW-RECORD OR */
        } else if (!String.valueOf(ttup_changes_okayed_and_done).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_failed).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
            /* RAW: AND ( TTUP-OLD-DETAILS EQUAL LOW-VALUES OR */
        } else if (!String.valueOf(ttup_delete_done).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_delete_failed).trim().isEmpty()) {
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            ttup_details_not_fetched.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(ccard_aid_pfk03).trim().isEmpty()) {
            if ((String.valueOf(cdemo_from_tranid).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_tranid).equals(String.valueOf(" ")))) {
                cdemo_to_tranid.set(String.valueOf(lit_admintranid));
            } else {
                cdemo_to_tranid.set(String.valueOf(cdemo_from_tranid));
            }
            if ((String.valueOf(cdemo_from_program).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_program).equals(String.valueOf(" ")))) {
                cdemo_to_program.set(String.valueOf(lit_adminpgm));
            } else {
                cdemo_to_program.set(String.valueOf(cdemo_from_program));
            }
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_admin.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            exec.set(String.valueOf(lit_thismap));
            cics.set(String.valueOf(lit_thismap));
            syncpoint.set(String.valueOf(lit_thismap));
            end_exec.set(String.valueOf(lit_thismap));
            exec.set(String.valueOf(lit_thismap));
            cics.set(String.valueOf(lit_thismap));
            xctl.set(String.valueOf(lit_thismap));
            if (program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1] == null) program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1] = new CobolString(256);
            program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1].set(String.valueOf(lit_thismap));
            if (commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] == null) commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] = new CobolString(256);
            commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1].set(String.valueOf(lit_thismap));
            end_exec.set(String.valueOf(lit_thismap));
    // } else if (-cdemo_pgm_reenter) {
            /* RAW: AND CDEMO-FROM-PROGRAM EQUAL LIT-ADMINPGM */
    // } else if (-cdemo_pgm_reenter) {
            /* RAW: AND CDEMO-FROM-PROGRAM EQUAL LIT-LISTTPGM */
        } else if (!String.valueOf(cdemo_pgm_enter).trim().isEmpty()) {
            /* RAW: AND TTUP-DETAILS-NOT-FETCHED */
            ws_this_progcommarea.set("");
            ws_misc_storage.set("");
            cdemo_acct_id.set("");
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            cdemo_pgm_reenter.set(String.valueOf(cb_true));
            ttup_details_not_fetched.set(String.valueOf(cb_true));
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk04).trim().isEmpty()) {
            /* RAW: AND TTUP-CONFIRM-DELETE */
            ttup_start_delete.set(String.valueOf(cb_true));
            _9800();
            /* RAW: - DELETE-PROCESSING THRU 9800 - DELETE-PROCESSING-EXIT */
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk04).trim().isEmpty()) {
            /* RAW: AND TTUP-SHOW-DETAILS */
            ttup_confirm_delete.set(String.valueOf(cb_true));
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk05).trim().isEmpty()) {
            /* RAW: AND TTUP-DETAILS-NOT-FOUND */
            ttup_create_new_record.set(String.valueOf(cb_true));
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk05).trim().isEmpty()) {
            /* RAW: AND TTUP-CHANGES-OK-NOT-CONFIRMED */
            _9600();
            /* RAW: - WRITE-PROCESSING THRU 9600 - WRITE-PROCESSING-EXIT */
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk12).trim().isEmpty()) {
            /* RAW: AND ( TTUP-CHANGES-OK-NOT-CONFIRMED OR TTUP-CONFIRM-DELETE OR */
            found_trantype_in_table.set(String.valueOf(cb_true));
            _2000();
            /* RAW: - DECIDE-ACTION THRU 2000 - DECIDE-ACTION-EXIT */
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ws_invalid_key_pressed).trim().isEmpty()) {
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else {
            _1000();
            /* RAW: - PROCESS-INPUTS THRU 1000 - PROCESS-INPUTS-EXIT */
            _2000();
            /* RAW: - DECIDE-ACTION THRU 2000 - DECIDE-ACTION-EXIT */
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        }
    }

    private void common_return() {
        ccard_error_msg.set(String.valueOf(ws_return_msg));
        ws_commarea.set(String.valueOf(carddemo_commarea));
        ws_commarea.setRefMod((CobolIntrinsics.length(carddemo_commarea) + 1), CobolIntrinsics.length(ws_this_progcommarea), String.valueOf(ws_this_progcommarea));
        exec.set(String.valueOf(ws_this_progcommarea));
        cics.set(String.valueOf(ws_this_progcommarea));
        /* RETURN TRANSID */
        /* RAW: ( LIT-THISTRANID ) COMMAREA ( WS-COMMAREA */
    }

    private void end_exec() {
        /* RAW: 0000 - */
    }

    private void main_exit() {
        return;
    }

    private void check_pfkeys() {
        if (((((!String.valueOf(ccard_aid_pfk03).trim().isEmpty() || (!String.valueOf(ccard_aid_enter).trim().isEmpty() && !(!String.valueOf(ttup_confirm_delete).trim().isEmpty()))) || (!String.valueOf(ccard_aid_pfk04).trim().isEmpty() && (!String.valueOf(ttup_show_details).trim().isEmpty() || !String.valueOf(ttup_confirm_delete).trim().isEmpty()))) || (!String.valueOf(ccard_aid_pfk05).trim().isEmpty() && ((!String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty() || !String.valueOf(ttup_details_not_found).trim().isEmpty()) || !String.valueOf(ttup_delete_in_progress).trim().isEmpty()))) || (!String.valueOf(ccard_aid_pfk12).trim().isEmpty() && ((((!String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty() || !String.valueOf(ttup_show_details).trim().isEmpty()) || !String.valueOf(ttup_details_not_found).trim().isEmpty()) || !String.valueOf(ttup_confirm_delete).trim().isEmpty()) || !String.valueOf(ttup_create_new_record).trim().isEmpty())))) {
            pfk_valid.set(String.valueOf(cb_true));
        } else {
            pfk_invalid.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_invalid_key_pressed.set(String.valueOf(cb_true));
            }
        }
        /* RAW: 0001 - */
    }

    private void check_pfkeys_exit() {
        return;
    }

    private void process_inputs() {
        _1100();
        /* RAW: - RECEIVE-MAP THRU 1100 - RECEIVE-MAP-EXIT */
        _1150();
        /* RAW: - STORE-MAP-IN-NEW THRU 1150 - STORE-MAP-IN-NEW-EXIT */
        _1200();
        /* RAW: - EDIT-MAP-INPUTS THRU 1200 - EDIT-MAP-INPUTS-EXIT */
        ccard_error_msg.set(String.valueOf(ws_return_msg));
        ccard_next_prog.set(String.valueOf(lit_thispgm));
        ccard_next_mapset.set(String.valueOf(lit_thismapset));
    }

    private void ccard_next_map() {
        /* RAW: 1000 - */
    }

    private void process_inputs_exit() {
        return;
    }

    private void receive_map() {
        /* RAW: EXEC CICS RECEIVE MAP ( LIT-THISMAP */
    }

    private void end_exec_2() {
        /* RAW: 1100 - */
    }

    private void receive_map_exit() {
        return;
    }

    private void store_map_in_new() {
        if (((!String.valueOf(ttup_details_not_found).trim().isEmpty() && !(!String.valueOf(ccard_aid_pfk05).trim().isEmpty())) && String.valueOf(CobolIntrinsics.trim(trtypcdi)).equals(String.valueOf(ttup_new_ttyp_type)))) {
            _1150();
            return;
        } else {
            /* CONTINUE */
        }
        ttup_new_details.set("");
        if ((String.valueOf(trtypcdi).equals(String.valueOf("*")) || String.valueOf(trtypcdi).equals(String.valueOf(" ")))) {
            ttup_new_ttyp_type.set(String.valueOf("\u0000"));
        } else {
            ttup_new_ttyp_type.set(String.valueOf(CobolIntrinsics.trim(trtypcdi)));
        }
        if ((String.valueOf(trtydsci).equals(String.valueOf("*")) || String.valueOf(trtydsci).equals(String.valueOf(" ")))) {
            ttup_new_ttyp_type_desc.set(String.valueOf("\u0000"));
        } else {
            ttup_new_ttyp_type_desc.set(String.valueOf(CobolIntrinsics.trim(trtydsci)));
        }
        /* RAW: 1150 - */
    }

    private void store_map_in_new_exit() {
        return;
    }

    private void edit_map_inputs() {
        input_ok.set(String.valueOf(cb_true));
        if ((!String.valueOf(ttup_details_not_found).trim().isEmpty() && String.valueOf(CobolIntrinsics.trim(trtypcdi)).equals(String.valueOf(ttup_new_ttyp_type)))) {
            if (!String.valueOf(ccard_aid_pfk05).trim().isEmpty()) {
                /* CONTINUE */
            } else {
                ttup_details_not_fetched.set(String.valueOf(cb_true));
            }
            flg_tranfilter_isvalid.set(String.valueOf(cb_true));
            _1200();
            return;
        } else {
            /* CONTINUE */
        }
        if ((!String.valueOf(ttup_create_new_record).trim().isEmpty() || !String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty())) {
            /* CONTINUE */
        } else {
            _1210();
            /* RAW: - EDIT-TRANTYPE THRU 1210 - EDIT-TRANTYPE-EXIT */
            if (!String.valueOf(flg_tranfilter_blank).trim().isEmpty()) {
                if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                    no_search_criteria_received.set(String.valueOf(cb_true));
                }
                ttup_details_not_fetched.set(String.valueOf(cb_true));
                _1200();
                return;
            }
            if (!String.valueOf(flg_tranfilter_not_ok).trim().isEmpty()) {
                ttup_invalid_search_keys.set(String.valueOf(cb_true));
                ttup_details_not_fetched.set(String.valueOf(cb_true));
                _1200();
                return;
            }
            if (!String.valueOf(ttup_details_not_fetched).trim().isEmpty()) {
                _1200();
                return;
            }
        }
        flg_tranfilter_isvalid.set(String.valueOf(cb_true));
        _1205();
        /* RAW: - COMPARE-OLD-NEW THRU 1205 - COMPARE-OLD-NEW-EXIT */
        if (((!String.valueOf(no_changes_found).trim().isEmpty() || !String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty()) || !String.valueOf(ttup_changes_okayed_and_done).trim().isEmpty())) {
            ws_non_key_flags.set(String.valueOf("\u0000"));
            _1200();
            return;
        }
        ttup_changes_not_ok.set(String.valueOf(cb_true));
        ws_edit_variable_name.set(String.valueOf("Transaction Desc"));
        ws_edit_alphanum_only.set(String.valueOf(ttup_new_ttyp_type_desc));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(50).trim());
        _1230();
        /* RAW: - EDIT-ALPHANUM-REQD THRU 1230 - EDIT-ALPHANUM-REQD-EXIT */
        ws_edit_desc_flags.set(String.valueOf(ws_edit_alphanum_only_flags));
        if (!String.valueOf(input_error).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            ttup_changes_ok_not_confirmed.set(String.valueOf(cb_true));
        }
        /* RAW: 1200 - */
    }

    private void edit_map_inputs_exit() {
        return;
    }

    private void compare_old_new() {
        no_changes_found.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolIntrinsics.upper_case(ttup_new_ttyp_type)).equals(String.valueOf(CobolIntrinsics.upper_case(ttup_old_ttyp_type))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(ttup_new_ttyp_type_desc))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(ttup_old_ttyp_type_desc))))) && String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(ttup_new_ttyp_type_desc))).equals(String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(ttup_old_ttyp_type_desc)))))) {
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                no_changes_detected.set(String.valueOf(cb_true));
            } else {
                /* CONTINUE */
            }
        } else {
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                change_has_occurred.set(String.valueOf(cb_true));
            } else {
                /* CONTINUE */
            }
            _1205();
            return;
        }
        /* RAW: 1205 - */
    }

    private void compare_old_new_exit() {
        return;
    }

    private void edit_trantype() {
        flg_tranfilter_not_ok.set(String.valueOf(cb_true));
        ws_edit_variable_name.set(String.valueOf("Tran Type code"));
        ws_edit_alphanum_only.set(String.valueOf(ttup_new_ttyp_type));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(2).trim());
        _1245();
        /* RAW: - EDIT-NUM-REQD THRU 1245 - EDIT-NUM-REQD-EXIT */
        ws_edit_ttyp_flag.set(String.valueOf(ws_edit_alphanum_only_flags));
        if (!String.valueOf(flg_tranfilter_isvalid).trim().isEmpty()) {
            ws_edit_numeric_2.set(String.valueOf(CobolIntrinsics.numval(ttup_new_ttyp_type)));
            ws_edit_alphanumeric_2.set(String.valueOf(ws_edit_numeric_2));
            /* INSPECT WS-EDIT-ALPHANUMERIC-2 — 2 clause(s) */
            ttup_new_ttyp_type.set(String.valueOf(ws_edit_alphanumeric_2));
        }
        /* RAW: 1210 - */
    }

    private void edit_trantype_exit() {
        return;
    }

    private void edit_alphanum_reqd() {
        flg_alphnanum_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf("\u0000")) || String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf(" "))) || String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1230();
            return;
        }
        lit_all_alphanum_from.set(String.valueOf(lit_all_alphanum_from_x));
        /* INSPECT WS-EDIT-ALPHANUM-ONLY — 2 clause(s) */
        if (String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" can have numbers or alphabets only.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1230();
            return;
        }
        flg_alphnanum_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1230 - */
    }

    private void edit_alphanum_reqd_exit() {
        return;
    }

    private void edit_num_reqd() {
        flg_alphnanum_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf("\u0000")) || String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf(" "))) || String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1245();
            return;
        }
        if (String.valueOf(CobolIntrinsics.test_numval(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue()))).equals(String.valueOf(0))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be numeric.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1245();
            return;
        }
        if (CobolIntrinsics.numval(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).compareTo(new BigDecimal(String.valueOf(0).trim())) == 0) {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must not be zero.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1245();
            return;
        } else {
            /* CONTINUE */
        }
        flg_alphnanum_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1245 - */
    }

    private void edit_num_reqd_exit() {
        return;
    }

    private void decide_action() {
        if (!String.valueOf(ttup_details_not_fetched).trim().isEmpty()) {
        } else if (!String.valueOf(ccard_aid_pfk12).trim().isEmpty()) {
            if (!String.valueOf(flg_tranfilter_isvalid).trim().isEmpty()) {
                ws_return_msg_off.set(String.valueOf(cb_true));
                _9000();
                /* RAW: - READ-TRANTYPE THRU 9000 - READ-TRANTYPE-EXIT */
                if (!String.valueOf(found_trantype_in_table).trim().isEmpty()) {
                    ttup_show_details.set(String.valueOf(cb_true));
                } else {
                    ttup_details_not_found.set(String.valueOf(cb_true));
                }
            } else {
                if (!String.valueOf(ttup_confirm_delete).trim().isEmpty()) {
                    ws_delete_was_cancelled.set(String.valueOf(cb_true));
                    ttup_details_not_fetched.set(String.valueOf(cb_true));
                } else if (!String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty()) {
                    ws_update_was_cancelled.set(String.valueOf(cb_true));
                    ttup_changes_backed_out.set(String.valueOf(cb_true));
                } else {
                    ttup_details_not_fetched.set(String.valueOf(cb_true));
                }
            }
        } else if (!String.valueOf(ttup_confirm_delete).trim().isEmpty()) {
            /* RAW: AND CCARD-AID-PFK12 */
            ttup_confirm_delete.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_show_details).trim().isEmpty()) {
            if (((!String.valueOf(input_error).trim().isEmpty() || !String.valueOf(no_changes_detected).trim().isEmpty()) || !String.valueOf(ws_invalid_key).trim().isEmpty())) {
                /* CONTINUE */
            } else {
                ttup_changes_ok_not_confirmed.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(ttup_changes_not_ok).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
            ttup_changes_not_ok.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_invalid_search_keys).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(ccard_aid_pfk05).trim().isEmpty()) {
            /* RAW: AND TTUP-DETAILS-NOT-FOUND */
            ttup_create_new_record.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(ttup_changes_okayed_and_done).trim().isEmpty()) {
            ttup_show_details.set(String.valueOf(cb_true));
            if ((String.valueOf(cdemo_from_tranid).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_tranid).equals(String.valueOf(" ")))) {
                cdemo_acct_id.set(String.valueOf(0));
                cdemo_card_num.set(String.valueOf(0));
                cdemo_acct_status.set(String.valueOf("\u0000"));
            }
        } else {
            abend_culprit.set(String.valueOf(lit_thispgm));
            abend_code.set(String.valueOf("0001"));
            abend_reason.set(String.valueOf(" "));
            abend_msg.set(String.valueOf("UNEXPECTED DATA SCENARIO"));
            abend_routine(); // THRU ABEND-ROUTINE-EXIT
            end_exec();
            abend_routine_exit();
        }
        /* RAW: 2000 - */
    }

    private void decide_action_exit() {
        return;
    }

    private void send_map() {
        _3100();
        /* RAW: - SCREEN-INIT THRU 3100 - SCREEN-INIT-EXIT */
        _3200();
        /* RAW: - SETUP-SCREEN-VARS THRU 3200 - SETUP-SCREEN-VARS-EXIT */
        _3250();
        /* RAW: - SETUP-INFOMSG THRU 3250 - SETUP-INFOMSG-EXIT */
        _3300();
        /* RAW: - SETUP-SCREEN-ATTRS THRU 3300 - SETUP-SCREEN-ATTRS-EXIT */
        _3390();
        /* RAW: - SETUP-INFOMSG-ATTRS THRU 3390 - SETUP-INFOMSG-ATTRS-EXIT */
        _3391();
        /* RAW: - SETUP-PFKEY-ATTRS THRU 3391 - SETUP-PFKEY-ATTRS-EXIT */
        _3400();
        /* RAW: - SEND-SCREEN THRU 3400 - */
    }

    private void send_screen_exit() {
        /* RAW: 3000 - */
    }

    private void send_map_exit() {
        return;
    }

    private void screen_init() {
        ctrtupao.set(String.valueOf("\u0000"));
        ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
        title01o.set(String.valueOf(ccda_title01));
        title02o.set(String.valueOf(ccda_title02));
        trnnameo.set(String.valueOf(lit_thistranid));
        pgmnameo.set(String.valueOf(lit_thispgm));
        ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
        ws_curdate_mm.set(String.valueOf(ws_curdate_month));
        ws_curdate_dd.set(String.valueOf(ws_curdate_day));
        ws_curdate_yy.set(String.valueOf(CobolString.refMod(ws_curdate_year, 3, 2)));
        curdateo.set(String.valueOf(ws_curdate_mm_dd_yy));
        ws_curtime_hh.set(String.valueOf(ws_curtime_hours));
        ws_curtime_mm.set(String.valueOf(ws_curtime_minute));
        ws_curtime_ss.set(String.valueOf(ws_curtime_second));
        curtimeo.set(String.valueOf(ws_curtime_hh_mm_ss));
        /* RAW: 3100 - */
    }

    private void screen_init_exit() {
        return;
    }

    private void setup_screen_vars() {
        if (!String.valueOf(cdemo_pgm_enter).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            if (!String.valueOf(ttup_details_not_fetched).trim().isEmpty()) {
                _3201();
                /* RAW: - SHOW-INITIAL-VALUES THRU 3201 - SHOW-INITIAL-VALUES-EXIT */
            } else if (!String.valueOf(ttup_show_details).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_confirm_delete).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_delete_failed).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_delete_done).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
                ttup_new_details.set("");
                _3202();
                /* RAW: - SHOW-ORIGINAL-VALUES THRU 3202 - SHOW-ORIGINAL-VALUES-EXIT */
            } else if (!String.valueOf(ttup_changes_made).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_changes_not_ok).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_details_not_found).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_invalid_search_keys).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_create_new_record).trim().isEmpty()) {
            } else if (!String.valueOf(ttup_changes_okayed_and_done).trim().isEmpty()) {
                _3203();
                /* RAW: - SHOW-UPDATED-VALUES THRU 3203 - SHOW-UPDATED-VALUES-EXIT */
            } else {
                ttup_new_details.set("");
                _3202();
                /* RAW: - SHOW-ORIGINAL-VALUES THRU 3202 - SHOW-ORIGINAL-VALUES-EXIT */
            }
        }
        /* RAW: 3200 - */
    }

    private void setup_screen_vars_exit() {
        return;
    }

    private void show_initial_values() {
        trtypcdo.set(String.valueOf("\u0000"));
        trtypcdo.set(String.valueOf("\u0000"));
        /* RAW: 3201 - */
    }

    private void show_initial_values_exit() {
        return;
    }

    private void show_original_values() {
        ws_non_key_flags.set(String.valueOf("\u0000"));
        trtypcdo.set(String.valueOf(ttup_old_ttyp_type));
        trtydsco.set(String.valueOf(ttup_old_ttyp_type_desc));
        /* RAW: 3202 - */
    }

    private void show_original_values_exit() {
        return;
    }

    private void show_updated_values() {
        trtypcdo.set(String.valueOf(ttup_new_ttyp_type));
        trtydsco.set(String.valueOf(ttup_new_ttyp_type_desc));
        /* RAW: 3203 - */
    }

    private void show_updated_values_exit() {
        return;
    }

    private void setup_infomsg() {
        if (!String.valueOf(cdemo_pgm_enter).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_details_not_fetched).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_invalid_search_keys).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_details_not_found).trim().isEmpty()) {
            prompt_create_new_record.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_show_details).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
            /* RAW: AND ( TTUP-OLD-TTYP-TYPE = LOW-VALUES OR */
            prompt_for_search_keys.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_not_ok).trim().isEmpty()) {
            prompt_for_changes.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_confirm_delete).trim().isEmpty()) {
            prompt_delete_confirm.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_delete_failed).trim().isEmpty()) {
            inform_failure.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_delete_done).trim().isEmpty()) {
            confirm_delete_success.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_create_new_record).trim().isEmpty()) {
            prompt_for_newdata.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty()) {
            prompt_for_confirmation.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_changes_okayed_and_done).trim().isEmpty()) {
            confirm_update_success.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_changes_okayed_lock_error).trim().isEmpty()) {
            inform_failure.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ttup_changes_okayed_but_failed).trim().isEmpty()) {
            inform_failure.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        }
        ws_string_len = new BigDecimal(String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(ws_info_msg))).trim()).intValue();
        ws_string_mid = new BigDecimal(String.valueOf(((((CobolIntrinsics.length(ws_info_msg) - ws_string_len)) / 2) + 1)).trim()).intValue();
        ws_string_out.setRefMod(ws_string_mid, ws_string_len, String.valueOf(CobolString.refMod(ws_info_msg, 1, ws_string_len)));
        infomsgo.set(String.valueOf(ws_string_out));
        errmsgo.set(String.valueOf(ws_return_msg));
        /* RAW: 3250 - */
    }

    private void setup_infomsg_exit() {
        return;
    }

    private void setup_screen_attrs() {
        _3310();
        /* RAW: - PROTECT-ALL-ATTRS THRU 3310 - PROTECT-ALL-ATTRS-EXIT */
        if (!String.valueOf(ttup_details_not_fetched).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_invalid_search_keys).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_details_not_found).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
            /* RAW: AND ( TTUP-OLD-TTYP-TYPE = LOW-VALUES OR */
            trtypcda.set(String.valueOf(dfhbmfse));
        } else if (!String.valueOf(ttup_show_details).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_create_new_record).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
            _3320();
            /* RAW: - UNPROTECT-FEW-ATTRS THRU 3320 - UNPROTECT-FEW-ATTRS-EXIT */
        } else if (!String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_okayed_and_done).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_delete_in_progress).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            trtypcda.set(String.valueOf(dfhbmfse));
        }
        if (!String.valueOf(ttup_details_not_fetched).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_details_not_found).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_invalid_search_keys).trim().isEmpty()) {
        } else if (!String.valueOf(flg_tranfilter_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_tranfilter_blank).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_okayed_and_done).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
            /* RAW: AND ( TTUP-OLD-TTYP-TYPE = LOW-VALUES OR */
            trtypcdl.set(String.valueOf(-1));
        } else if (!String.valueOf(ttup_create_new_record).trim().isEmpty()) {
        } else if (!String.valueOf(no_changes_detected).trim().isEmpty()) {
        } else if (!String.valueOf(flg_description_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_description_blank).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_made).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_changes_backed_out).trim().isEmpty()) {
        } else if (!String.valueOf(ttup_show_details).trim().isEmpty()) {
            trtydscl.set(String.valueOf(-1));
        } else {
            trtypcdl.set(String.valueOf(-1));
        }
        if ((!String.valueOf(flg_tranfilter_not_ok).trim().isEmpty() || !String.valueOf(ttup_delete_failed).trim().isEmpty())) {
            trtypcdc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_tranfilter_blank).trim().isEmpty() && !String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
            trtypcdo.set(String.valueOf("*"));
            trtypcdc.set(String.valueOf(dfhred));
        }
        if (((((!String.valueOf(ttup_details_not_fetched).trim().isEmpty() || !String.valueOf(ttup_details_not_found).trim().isEmpty()) || !String.valueOf(ttup_invalid_search_keys).trim().isEmpty()) || !String.valueOf(flg_tranfilter_blank).trim().isEmpty()) || !String.valueOf(flg_tranfilter_not_ok).trim().isEmpty())) {
            _3300();
            return;
        } else {
            /* CONTINUE */
        }
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: 3300 - */
    }

    private void setup_screen_attrs_exit() {
        return;
    }

    private void protect_all_attrs() {
        trtypcda.set(String.valueOf(dfhbmprf));
        trtydsca.set(String.valueOf(dfhbmprf));
        infomsga.set(String.valueOf(dfhbmprf));
        /* RAW: 3310 - */
    }

    private void protect_all_attrs_exit() {
        return;
    }

    private void unprotect_few_attrs() {
        trtydsca.set(String.valueOf(dfhbmfse));
        infomsga.set(String.valueOf(dfhbmprf));
        /* RAW: 3320 - */
    }

    private void unprotect_few_attrs_exit() {
        return;
    }

    private void setup_infomsg_attrs() {
        if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
            infomsga.set(String.valueOf(dfhbmdar));
        } else {
            infomsga.set(String.valueOf(dfhbmasb));
        }
        /* RAW: 3390 - */
    }

    private void setup_infomsg_attrs_exit() {
        return;
    }

    private void setup_pfkey_attrs() {
        if (!String.valueOf(ttup_confirm_delete).trim().isEmpty()) {
            fkeysa.set(String.valueOf(dfhbmdar));
        } else {
            fkeysa.set(String.valueOf(dfhbmasb));
        }
        if ((!String.valueOf(ttup_show_details).trim().isEmpty() || !String.valueOf(ttup_confirm_delete).trim().isEmpty())) {
            fkey04a.set(String.valueOf(dfhbmasb));
        }
        if ((!String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty() || !String.valueOf(ttup_details_not_found).trim().isEmpty())) {
            fkey05a.set(String.valueOf(dfhbmasb));
        }
        if (((((!String.valueOf(ttup_changes_ok_not_confirmed).trim().isEmpty() || !String.valueOf(ttup_show_details).trim().isEmpty()) || !String.valueOf(ttup_details_not_found).trim().isEmpty()) || !String.valueOf(ttup_confirm_delete).trim().isEmpty()) || !String.valueOf(ttup_create_new_record).trim().isEmpty())) {
            fkey12a.set(String.valueOf(dfhbmasb));
        }
        /* RAW: 3391 - */
    }

    private void setup_pfkey_attrs_exit() {
        return;
    }

    private void send_screen() {
        ccard_next_mapset.set(String.valueOf(lit_thismapset));
        ccard_next_map.set(String.valueOf(lit_thismap));
        exec.set(String.valueOf(lit_thismap));
        cics.set(String.valueOf(lit_thismap));
        send.set(String.valueOf(lit_thismap));
        if (map[Integer.parseInt(String.valueOf(ccard_next_map).trim()) - 1] == null) map[Integer.parseInt(String.valueOf(ccard_next_map).trim()) - 1] = new CobolString(256);
        map[Integer.parseInt(String.valueOf(ccard_next_map).trim()) - 1].set(String.valueOf(lit_thismap));
        if (mapset[Integer.parseInt(String.valueOf(ccard_next_mapset).trim()) - 1] == null) mapset[Integer.parseInt(String.valueOf(ccard_next_mapset).trim()) - 1] = new CobolString(256);
        mapset[Integer.parseInt(String.valueOf(ccard_next_mapset).trim()) - 1].set(String.valueOf(lit_thismap));
        /* MOVE to file FROM — not applicable */
        cursor.set(String.valueOf(lit_thismap));
        erase.set(String.valueOf(lit_thismap));
        freekb.set(String.valueOf(lit_thismap));
        if (resp[ws_resp_cd - 1] == null) resp[ws_resp_cd - 1] = new CobolString(256);
        resp[ws_resp_cd - 1].set(String.valueOf(lit_thismap));
    }

    private void end_exec_3() {
        /* RAW: 3400 - */
    }

    private void send_screen_exit_2() {
        return;
    }

    private void read_trantype() {
        ttup_old_details.set("");
        ws_no_info_message.set(String.valueOf(cb_true));
        _9100();
        /* RAW: - GET-TRANSACTION-TYPE THRU 9100 - GET-TRANSACTION-TYPE-EXIT */
        if (!String.valueOf(flg_tranfilter_not_ok).trim().isEmpty()) {
            _9000();
            return;
        }
        _9500();
        /* RAW: - STORE-FETCHED-DATA THRU 9500 - */
    }

    private void store_fetched_data_exit() {
        /* RAW: 9000 - */
    }

    private void read_trantype_exit() {
        return;
    }

    private void get_transaction_type() {
        dcl_tr_type.set(String.valueOf(ttup_new_ttyp_type));
        exec.set(String.valueOf(ttup_new_ttyp_type));
        sql.set(String.valueOf(ttup_new_ttyp_type));
        select.set(String.valueOf(ttup_new_ttyp_type));
        tr_type.set(String.valueOf(ttup_new_ttyp_type));
        _unnamed.set(String.valueOf(ttup_new_ttyp_type));
        tr_description.set(String.valueOf(ttup_new_ttyp_type));
        into.set(String.valueOf(ttup_new_ttyp_type));
        _unnamed.set(String.valueOf(ttup_new_ttyp_type));
        dcl_tr_type.set(String.valueOf(ttup_new_ttyp_type));
        _unnamed.set(String.valueOf(ttup_new_ttyp_type));
        _unnamed.set(String.valueOf(ttup_new_ttyp_type));
        dcl_tr_description.set(String.valueOf(ttup_new_ttyp_type));
        /* MOVE to file FROM — not applicable */
    }

    private void carddemo() {
        /* RAW: TRANSACTION_TYPE WHERE TR_TYPE = : DCL-TR-TYPE */
        ws_disp_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            found_trantype_in_table.set(String.valueOf(cb_true));
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = +100 */
            input_error.set(String.valueOf(cb_true));
            flg_tranfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_record_not_found.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: < 0 */
            input_error.set(String.valueOf(cb_true));
            flg_tranfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append("Error accessing:");
                    _sb.append(" TRANSACTION_TYPE table. SQLCODE:");
                    _sb.append(String.valueOf(ws_disp_sqlcode));
                    _sb.append(":");
                    _sb.append(String.valueOf(sqlerrm));
                    ws_return_msg.set(_sb.toString());
                }
            }
        }
        return;
    }

    private void get_transaction_type_exit() {
        return;
    }

    private void store_fetched_data() {
        ttup_old_details.set("");
        ttup_old_ttyp_type.set(String.valueOf(dcl_tr_type));
    }

    private void ttup_old_ttyp_type_desc() {
        /* RAW: 9500 - */
    }

    private void store_fetched_data_exit_2() {
        return;
    }

    private void write_processing() {
        dcl_tr_type.set(String.valueOf(ttup_new_ttyp_type));
        dcl_tr_description_text.set(String.valueOf(CobolIntrinsics.trim(ttup_new_ttyp_type_desc)));
        dcl_tr_description_len.set(String.valueOf(CobolIntrinsics.length(ttup_new_ttyp_type_desc)));
        /* RAW: EXEC SQL UPDATE */
    }

    private void carddemo_2() {
        /* RAW: TRANSACTION_TYPE  */
        tr_description.set(String.valueOf(move));
        _unnamed.set(String.valueOf(move));
        _unnamed.set(String.valueOf(move));
        dcl_tr_description.set(String.valueOf(move));
        where.set(String.valueOf(move));
        tr_type.set(String.valueOf(move));
        _unnamed.set(String.valueOf(move));
        _unnamed.set(String.valueOf(move));
        dcl_tr_type.set(String.valueOf(move));
        end_exec.set(String.valueOf(move));
        /* RAW: SQLCODE TO WS-DISP-SQLCODE */
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO EXEC CICS SYNCPOINT END-EXEC */
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = +100 */
            _9700();
            /* RAW: - INSERT-RECORD THRU 9700 - INSERT-RECORD-EXIT */
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = -911 */
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                could_not_lock_rec_for_update.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: < 0 */
            table_update_failed.set(String.valueOf(cb_true));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Error updating:");
                _sb.append(" TRANSACTION_TYPE Table. SQLCODE:");
                _sb.append(String.valueOf(ws_disp_sqlcode));
                _sb.append(":");
                _sb.append(String.valueOf(sqlerrm));
                ws_return_msg.set(_sb.toString());
            }
        }
        if (!String.valueOf(could_not_lock_rec_for_update).trim().isEmpty()) {
            ttup_changes_okayed_lock_error.set(String.valueOf(cb_true));
        } else if (!String.valueOf(table_update_failed).trim().isEmpty()) {
            ttup_changes_okayed_but_failed.set(String.valueOf(cb_true));
        } else if (!String.valueOf(data_was_changed_before_update).trim().isEmpty()) {
            ttup_show_details.set(String.valueOf(cb_true));
        } else {
            ttup_changes_okayed_and_done.set(String.valueOf(cb_true));
        }
        return;
    }

    private void write_processing_exit() {
        return;
    }

    private void insert_record() {
        /* RAW: EXEC SQL INSERT INTO */
    }

    private void carddemo_3() {
        /* RAW: TRANSACTION_TYPE ( TR_TYPE , TR_DESCRIPTION ) */
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO EXEC CICS SYNCPOINT END-EXEC */
        } else {
            table_update_failed.set(String.valueOf(cb_true));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Error inserting record into:");
                _sb.append(" TRANSACTION_TYPE Table. SQLCODE:");
                _sb.append(String.valueOf(ws_disp_sqlcode));
                _sb.append(":");
                _sb.append(String.valueOf(sqlerrm));
                ws_return_msg.set(_sb.toString());
            }
            _9700();
            return;
        }
        /* RAW: 9700 - */
    }

    private void insert_record_exit() {
        return;
    }

    private void delete_processing() {
        dcl_tr_type.set(String.valueOf(ttup_old_ttyp_type));
        exec.set(String.valueOf(ttup_old_ttyp_type));
        sql.set(String.valueOf(ttup_old_ttyp_type));
        from.delete();
    }

    private void carddemo_4() {
        /* RAW: TRANSACTION_TYPE WHERE TR_TYPE = : DCL-TR-TYPE */
        ws_disp_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            ttup_delete_done.set(String.valueOf(cb_true));
            /* RAW: EXEC CICS SYNCPOINT END-EXEC */
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = -532 */
            record_delete_failed.set(String.valueOf(cb_true));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Please delete associated child records first:");
                _sb.append("SQLCODE :");
                _sb.append(String.valueOf(ws_disp_sqlcode));
                _sb.append(":");
                _sb.append(String.valueOf(sqlerrm));
                _sb.append(String.valueOf(sqlerrm));
                ws_return_msg.set(_sb.toString());
            }
        } else {
            record_delete_failed.set(String.valueOf(cb_true));
            ttup_delete_failed.set(String.valueOf(cb_true));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Delete failed with message:");
                _sb.append("SQLCODE :");
                _sb.append(String.valueOf(ws_disp_sqlcode));
                _sb.append(":");
                _sb.append(String.valueOf(sqlerrm));
                ws_return_msg.set(_sb.toString());
            }
        }
        /* RAW: 9800 - */
    }

    private void delete_processing_exit() {
        return;
    }

    private void abend_routine() {
        if (String.valueOf(abend_msg).equals(String.valueOf("\u0000"))) {
            abend_msg.set(String.valueOf("UNEXPECTED ABEND OCCURRED."));
        }
        abend_culprit.set(String.valueOf(lit_thispgm));
        abend_code.set(String.valueOf("9999"));
        exec.set(String.valueOf("9999"));
        cics.set(String.valueOf("9999"));
        send.set(String.valueOf("9999"));
        /* MOVE to file FROM — not applicable */
        if (length[CobolIntrinsics.length(abend_data) - 1] == null) length[CobolIntrinsics.length(abend_data) - 1] = new CobolString(256);
        length[CobolIntrinsics.length(abend_data) - 1].set(String.valueOf("9999"));
        nohandle.set(String.valueOf("9999"));
        erase.set(String.valueOf("9999"));
        end_exec.set(String.valueOf("9999"));
        exec.set(String.valueOf("9999"));
        cics.set(String.valueOf("9999"));
        handle.set(String.valueOf("9999"));
        abend.set(String.valueOf("9999"));
        /* CANCEL end_exec */
        /* CANCEL exec */
        /* CANCEL cics */
        /* CANCEL abend */
        /* CANCEL abcode[Integer.parseInt(String.valueOf(abend_code).trim()) - 1] */
    }

    private void end_exec_4() {
    }

    private void abend_routine_exit() {
        return;
    }

    private void yyyy_store_pfkey() { /* stub — external/COPY */ }

    private void yyyy_store_pfkey_exit() { /* stub — external/COPY */ }

    private void _0001() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _9800() { /* stub — external/COPY */ }

    private void _9600() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1150() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _1210() { /* stub — external/COPY */ }

    private void _1205() { /* stub — external/COPY */ }

    private void _1230() { /* stub — external/COPY */ }

    private void _1245() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _3100() { /* stub — external/COPY */ }

    private void _3200() { /* stub — external/COPY */ }

    private void _3250() { /* stub — external/COPY */ }

    private void _3300() { /* stub — external/COPY */ }

    private void _3390() { /* stub — external/COPY */ }

    private void _3391() { /* stub — external/COPY */ }

    private void _3400() { /* stub — external/COPY */ }

    private void _3201() { /* stub — external/COPY */ }

    private void _3202() { /* stub — external/COPY */ }

    private void _3203() { /* stub — external/COPY */ }

    private void _3310() { /* stub — external/COPY */ }

    private void _3320() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _9500() { /* stub — external/COPY */ }

    private void _9700() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cotrtupc().run();
    }
}
