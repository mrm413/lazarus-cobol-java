package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cocrdupc extends CobolProgram {
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
    private CobolString ws_input_flag = new CobolString(1);
    private CobolString ws_edit_acct_flag = new CobolString(1);
    private CobolString ws_edit_card_flag = new CobolString(1);
    private CobolString ws_edit_cardname_flag = new CobolString(1);
    private CobolString ws_edit_cardstatus_flag = new CobolString(1);
    private CobolString ws_edit_cardexpmon_flag = new CobolString(1);
    private CobolString ws_edit_cardexpyear_flag = new CobolString(1);
    private CobolString ws_return_flag = new CobolString(1);
    private CobolString ws_pfk_flag = new CobolString(1);
    private CobolString card_name_check = new CobolString(50);
    private CobolString flg_yes_no_check = new CobolString(1);
    private CobolString card_month_check = new CobolString(2);
    private int card_month_check_n = 0;
    private CobolString card_year_check = new CobolString(4);
    private int card_year_check_n = 0;
    private CobolString cics_output_edit_vars = new CobolString(1); // Group: CICS-OUTPUT-EDIT-VARS
    private CobolString card_acct_id_x = new CobolString(11);
    private int card_acct_id_n = 0;
    private CobolString card_cvv_cd_x = new CobolString(3);
    private int card_cvv_cd_n = 0;
    private CobolString card_card_num_x = new CobolString(16);
    private int card_card_num_n = 0;
    private CobolString card_name_embossed_x = new CobolString(50);
    private CobolString card_status_x = new CobolString(1);
    private CobolString card_expiraion_date_x = new CobolString(10);
    private CobolString card_expiry_year = new CobolString(4);
    private CobolString card_expiry_month = new CobolString(2);
    private CobolString card_expiry_day = new CobolString(2);
    private int card_expiraion_date_n = 0;
    private CobolString ws_card_rid = new CobolString(1); // Group: WS-CARD-RID
    private CobolString ws_card_rid_cardnum = new CobolString(16);
    private int ws_card_rid_acct_id = 0;
    private CobolString ws_card_rid_acct_id_x = new CobolString(11);
    private CobolString ws_file_error_message = new CobolString(1); // Group: WS-FILE-ERROR-MESSAGE
    private CobolString error_opname = new CobolString(8);
    private CobolString error_file = new CobolString(9);
    private CobolString error_resp = new CobolString(10);
    private CobolString error_resp2 = new CobolString(10);
    private CobolString ws_long_msg = new CobolString(500);
    private CobolString ws_info_msg = new CobolString(40);
    private CobolString ws_return_msg = new CobolString(75);
    private CobolString ws_literals = new CobolString(1); // Group: WS-LITERALS
    private CobolString lit_thispgm = new CobolString(8);
    private CobolString lit_thistranid = new CobolString(4);
    private CobolString lit_thismapset = new CobolString(8);
    private CobolString lit_thismap = new CobolString(7);
    private CobolString lit_cclistpgm = new CobolString(8);
    private CobolString lit_cclisttranid = new CobolString(4);
    private CobolString lit_cclistmapset = new CobolString(7);
    private CobolString lit_cclistmap = new CobolString(7);
    private CobolString lit_menupgm = new CobolString(8);
    private CobolString lit_menutranid = new CobolString(4);
    private CobolString lit_menumapset = new CobolString(7);
    private CobolString lit_menumap = new CobolString(7);
    private CobolString lit_carddtlpgm = new CobolString(8);
    private CobolString lit_carddtltranid = new CobolString(4);
    private CobolString lit_carddtlmapset = new CobolString(7);
    private CobolString lit_carddtlmap = new CobolString(7);
    private CobolString lit_cardfilename = new CobolString(8);
    private CobolString lit_cardfilename_acct_path = new CobolString(8);
    private CobolString lit_all_alpha_from = new CobolString(52);
    private CobolString lit_all_spaces_to = new CobolString(52);
    private CobolString lit_upper = new CobolString(26);
    private CobolString lit_lower = new CobolString(26);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString cc_work_area = new CobolString(256); // fallback
    private CobolString ws_commarea = new CobolString(256); // fallback
    private CobolString ws_return_msg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString ws_this_progcommarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_enter = new CobolString(256); // fallback
    private CobolString ccup_details_not_fetched = new CobolString(256); // fallback
    private CobolString pfk_invalid = new CobolString(256); // fallback
    private CobolString ccard_aid_enter = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk03 = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk05 = new CobolString(256); // fallback
    private CobolString ccup_changes_ok_not_confirmed = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk12 = new CobolString(256); // fallback
    private CobolString pfk_valid = new CobolString(256); // fallback
    private CobolString ccup_changes_okayed_and_done = new CobolString(256); // fallback
    private CobolString ccup_changes_failed = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_to_tranid = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString cdemo_last_mapset = new CobolString(256); // fallback
    private CobolString cdemo_acct_id = new CobolString(256); // fallback
    private CobolString cdemo_card_num = new CobolString(256); // fallback
    private CobolString cdemo_usrtyp_user = new CobolString(256); // fallback
    private CobolString cdemo_last_map = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString syncpoint = new CobolString(256); // fallback
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString input_ok = new CobolString(256); // fallback
    private CobolString flg_acctfilter_isvalid = new CobolString(256); // fallback
    private CobolString flg_cardfilter_isvalid = new CobolString(256); // fallback
    private CobolString cc_acct_id_n = new CobolString(256); // fallback
    private CobolString cc_card_num_n = new CobolString(256); // fallback
    private CobolString ccup_show_details = new CobolString(256); // fallback
    private CobolString ccard_error_msg = new CobolString(256); // fallback
    private CobolString ccard_next_prog = new CobolString(256); // fallback
    private CobolString ccard_next_mapset = new CobolString(256); // fallback
    private CobolString ccup_new_details = new CobolString(256); // fallback
    private CobolString acctsidi = new CobolString(256); // fallback
    private CobolString cc_acct_id = new CobolString(256); // fallback
    private CobolString ccup_new_acctid = new CobolString(256); // fallback
    private CobolString cardsidi = new CobolString(256); // fallback
    private CobolString cc_card_num = new CobolString(256); // fallback
    private CobolString ccup_new_cardid = new CobolString(256); // fallback
    private CobolString crdnamei = new CobolString(256); // fallback
    private CobolString ccup_new_crdname = new CobolString(256); // fallback
    private CobolString crdstcdi = new CobolString(256); // fallback
    private CobolString ccup_new_crdstcd = new CobolString(256); // fallback
    private CobolString expdayi = new CobolString(256); // fallback
    private CobolString ccup_new_expday = new CobolString(256); // fallback
    private CobolString expmoni = new CobolString(256); // fallback
    private CobolString ccup_new_expmon = new CobolString(256); // fallback
    private CobolString expyeari = new CobolString(256); // fallback
    private CobolString ccup_new_expyear = new CobolString(256); // fallback
    private CobolString ccup_new_carddata = new CobolString(256); // fallback
    private CobolString flg_acctfilter_blank = new CobolString(256); // fallback
    private CobolString flg_cardfilter_blank = new CobolString(256); // fallback
    private CobolString no_search_criteria_received = new CobolString(256); // fallback
    private CobolString found_cards_for_account = new CobolString(256); // fallback
    private CobolString ccup_old_acctid = new CobolString(256); // fallback
    private CobolString ccup_old_cardid = new CobolString(256); // fallback
    private CobolString ccup_old_crdname = new CobolString(256); // fallback
    private CobolString card_embossed_name = new CobolString(256); // fallback
    private CobolString ccup_old_crdstcd = new CobolString(256); // fallback
    private CobolString card_active_status = new CobolString(256); // fallback
    private CobolString ccup_old_expday = new CobolString(256); // fallback
    private CobolString ccup_old_expmon = new CobolString(256); // fallback
    private CobolString ccup_old_expyear = new CobolString(256); // fallback
    private CobolString ccup_old_carddata = new CobolString(256); // fallback
    private CobolString no_changes_detected = new CobolString(256); // fallback
    private CobolString flg_cardname_isvalid = new CobolString(256); // fallback
    private CobolString flg_cardstatus_isvalid = new CobolString(256); // fallback
    private CobolString flg_cardexpmon_isvalid = new CobolString(256); // fallback
    private CobolString flg_cardexpyear_isvalid = new CobolString(256); // fallback
    private CobolString ccup_changes_not_ok = new CobolString(256); // fallback
    private CobolString input_error = new CobolString(256); // fallback
    private CobolString flg_acctfilter_not_ok = new CobolString(256); // fallback
    private CobolString ws_prompt_for_acct = new CobolString(256); // fallback
    private CobolString flg_cardfilter_not_ok = new CobolString(256); // fallback
    private CobolString ws_prompt_for_card = new CobolString(256); // fallback
    private CobolString flg_cardname_not_ok = new CobolString(256); // fallback
    private CobolString flg_cardname_blank = new CobolString(256); // fallback
    private CobolString ws_prompt_for_name = new CobolString(256); // fallback
    private CobolString ws_name_must_be_alpha = new CobolString(256); // fallback
    private CobolString flg_cardstatus_not_ok = new CobolString(256); // fallback
    private CobolString flg_cardstatus_blank = new CobolString(256); // fallback
    private CobolString card_status_must_be_yes_no = new CobolString(256); // fallback
    private CobolString flg_yes_no_valid = new CobolString(256); // fallback
    private CobolString flg_cardexpmon_not_ok = new CobolString(256); // fallback
    private CobolString flg_cardexpmon_blank = new CobolString(256); // fallback
    private CobolString card_expiry_month_not_valid = new CobolString(256); // fallback
    private CobolString valid_month = new CobolString(256); // fallback
    private CobolString flg_cardexpyear_blank = new CobolString(256); // fallback
    private CobolString card_expiry_year_not_valid = new CobolString(256); // fallback
    private CobolString flg_cardexpyear_not_ok = new CobolString(256); // fallback
    private CobolString valid_year = new CobolString(256); // fallback
    private CobolString abend_culprit = new CobolString(256); // fallback
    private CobolString abend_code = new CobolString(256); // fallback
    private CobolString abend_reason = new CobolString(256); // fallback
    private CobolString abend_msg = new CobolString(256); // fallback
    private CobolString could_not_lock_for_update = new CobolString(256); // fallback
    private CobolString ccup_changes_okayed_lock_error = new CobolString(256); // fallback
    private CobolString locked_but_update_failed = new CobolString(256); // fallback
    private CobolString ccup_changes_okayed_but_failed = new CobolString(256); // fallback
    private CobolString data_was_changed_before_update = new CobolString(256); // fallback
    private CobolString cdemo_acct_status = new CobolString(256); // fallback
    private CobolString ccrdupao = new CobolString(256); // fallback
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
    private CobolString acctsido = new CobolString(256); // fallback
    private CobolString cardsido = new CobolString(256); // fallback
    private CobolString crdnameo = new CobolString(256); // fallback
    private CobolString crdstcdo = new CobolString(256); // fallback
    private CobolString expdayo = new CobolString(256); // fallback
    private CobolString expmono = new CobolString(256); // fallback
    private CobolString expyearo = new CobolString(256); // fallback
    private CobolString ccup_changes_made = new CobolString(256); // fallback
    private CobolString prompt_for_search_keys = new CobolString(256); // fallback
    private CobolString prompt_for_changes = new CobolString(256); // fallback
    private CobolString prompt_for_confirmation = new CobolString(256); // fallback
    private CobolString confirm_update_success = new CobolString(256); // fallback
    private CobolString inform_failure = new CobolString(256); // fallback
    private CobolString ws_no_info_message = new CobolString(256); // fallback
    private CobolString infomsgo = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString dfhbmfse = new CobolString(256); // fallback
    private CobolString acctsida = new CobolString(256); // fallback
    private CobolString cardsida = new CobolString(256); // fallback
    private CobolString dfhbmprf = new CobolString(256); // fallback
    private CobolString crdnamea = new CobolString(256); // fallback
    private CobolString crdstcda = new CobolString(256); // fallback
    private CobolString expmona = new CobolString(256); // fallback
    private CobolString expyeara = new CobolString(256); // fallback
    private CobolString acctsidl = new CobolString(256); // fallback
    private CobolString crdnamel = new CobolString(256); // fallback
    private CobolString cardsidl = new CobolString(256); // fallback
    private CobolString crdstcdl = new CobolString(256); // fallback
    private CobolString expmonl = new CobolString(256); // fallback
    private CobolString expyearl = new CobolString(256); // fallback
    private CobolString dfhdfcol = new CobolString(256); // fallback
    private CobolString acctsidc = new CobolString(256); // fallback
    private CobolString cardsidc = new CobolString(256); // fallback
    private CobolString dfhred = new CobolString(256); // fallback
    private CobolString crdnamec = new CobolString(256); // fallback
    private CobolString crdstcdc = new CobolString(256); // fallback
    private CobolString dfhbmdar = new CobolString(256); // fallback
    private CobolString expdayc = new CobolString(256); // fallback
    private CobolString expmonc = new CobolString(256); // fallback
    private CobolString expyearc = new CobolString(256); // fallback
    private CobolString infomsga = new CobolString(256); // fallback
    private CobolString dfhbmbry = new CobolString(256); // fallback
    private CobolString fkeysca = new CobolString(256); // fallback
    private CobolString ccard_next_map = new CobolString(256); // fallback
    private CobolString send = new CobolString(256); // fallback
    private CobolString[] map = new CobolString[100]; // fallback array
    private CobolString[] mapset = new CobolString[100]; // fallback array
    private CobolString[] from = new CobolString[100]; // fallback array
    private CobolString cursor = new CobolString(256); // fallback
    private CobolString erase = new CobolString(256); // fallback
    private CobolString freekb = new CobolString(256); // fallback
    private CobolString[] resp = new CobolString[100]; // fallback array
    private CobolString ccup_old_details = new CobolString(256); // fallback
    private CobolString card_cvv_cd = new CobolString(256); // fallback
    private CobolString ccup_old_cvv_cd = new CobolString(256); // fallback
    private CobolString card_expiraion_date = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString notfnd = new CobolString(256); // fallback
    private CobolString did_not_find_acctcard_combo = new CobolString(256); // fallback
    private CobolString card_update_record = new CobolString(256); // fallback
    private CobolString card_update_num = new CobolString(256); // fallback
    private CobolString card_update_acct_id = new CobolString(256); // fallback
    private CobolString ccup_new_cvv_cd = new CobolString(256); // fallback
    private CobolString card_update_cvv_cd = new CobolString(256); // fallback
    private CobolString card_update_embossed_name = new CobolString(256); // fallback
    private CobolString card_update_expiraion_date = new CobolString(256); // fallback
    private CobolString card_update_active_status = new CobolString(256); // fallback
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
        if ((String.valueOf(eibcalen).equals(String.valueOf(0)) || (String.valueOf(cdemo_from_program).equals(String.valueOf(lit_menupgm)) && !(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())))) {
            carddemo_commarea.set("");
            ws_this_progcommarea.set("");
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            ccup_details_not_fetched.set(String.valueOf(cb_true));
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, CobolIntrinsics.length(carddemo_commarea))));
            ws_this_progcommarea.set(String.valueOf(CobolString.refMod(dfhcommarea, (CobolIntrinsics.length(carddemo_commarea) + 1), CobolIntrinsics.length(ws_this_progcommarea))));
        }
        yyyy_store_pfkey(); // THRU YYYY-STORE-PFKEY-EXIT
        pfk_invalid.set(String.valueOf(cb_true));
        if ((((!String.valueOf(ccard_aid_enter).trim().isEmpty() || !String.valueOf(ccard_aid_pfk03).trim().isEmpty()) || (!String.valueOf(ccard_aid_pfk05).trim().isEmpty() && !String.valueOf(ccup_changes_ok_not_confirmed).trim().isEmpty())) || (!String.valueOf(ccard_aid_pfk12).trim().isEmpty() && !(!String.valueOf(ccup_details_not_fetched).trim().isEmpty())))) {
            pfk_valid.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(pfk_invalid).trim().isEmpty()) {
            ccard_aid_enter.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(ccard_aid_pfk03).trim().isEmpty()) {
    // } else if ((ccup_changes_okayed_and_done)) {
            /* RAW: AND CDEMO-LAST-MAPSET EQUAL LIT-CCLISTMAPSET ) */
    // } else if ((ccup_changes_failed)) {
            /* RAW: AND CDEMO-LAST-MAPSET EQUAL LIT-CCLISTMAPSET ) */
            ccard_aid_pfk03.set(String.valueOf(cb_true));
            if ((String.valueOf(cdemo_from_tranid).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_tranid).equals(String.valueOf(" ")))) {
                cdemo_to_tranid.set(String.valueOf(lit_menutranid));
            } else {
                cdemo_to_tranid.set(String.valueOf(cdemo_from_tranid));
            }
            if ((String.valueOf(cdemo_from_program).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_program).equals(String.valueOf(" ")))) {
                cdemo_to_program.set(String.valueOf(lit_menupgm));
            } else {
                cdemo_to_program.set(String.valueOf(cdemo_from_program));
            }
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            if (String.valueOf(cdemo_last_mapset).equals(String.valueOf(lit_cclistmapset))) {
                cdemo_acct_id.set(String.valueOf(0));
                cdemo_card_num.set(String.valueOf(0));
            }
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
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
        } else if (!String.valueOf(cdemo_pgm_enter).trim().isEmpty()) {
            /* RAW: AND CDEMO-FROM-PROGRAM EQUAL LIT-CCLISTPGM */
        } else if (!String.valueOf(ccard_aid_pfk12).trim().isEmpty()) {
            /* RAW: AND CDEMO-FROM-PROGRAM EQUAL LIT-CCLISTPGM */
            cdemo_pgm_reenter.set(String.valueOf(cb_true));
            input_ok.set(String.valueOf(cb_true));
            flg_acctfilter_isvalid.set(String.valueOf(cb_true));
            flg_cardfilter_isvalid.set(String.valueOf(cb_true));
            cc_acct_id_n.set(String.valueOf(cdemo_acct_id));
            cc_card_num_n.set(String.valueOf(cdemo_card_num));
            _9000();
            /* RAW: - READ-DATA THRU 9000 - READ-DATA-EXIT */
            ccup_show_details.set(String.valueOf(cb_true));
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccup_details_not_fetched).trim().isEmpty()) {
            /* RAW: AND CDEMO-PGM-ENTER */
        } else if (!String.valueOf(cdemo_from_program).trim().isEmpty()) {
            /* RAW: EQUAL LIT-MENUPGM AND NOT CDEMO-PGM-REENTER */
            ws_this_progcommarea.set("");
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            cdemo_pgm_reenter.set(String.valueOf(cb_true));
            ccup_details_not_fetched.set(String.valueOf(cb_true));
            common_return();
            return;
        } else if (!String.valueOf(ccup_changes_okayed_and_done).trim().isEmpty()) {
        } else if (!String.valueOf(ccup_changes_failed).trim().isEmpty()) {
            ws_this_progcommarea.set("");
            ws_misc_storage.set("");
            cdemo_acct_id.set("");
            cdemo_card_num.set("");
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            cdemo_pgm_reenter.set(String.valueOf(cb_true));
            ccup_details_not_fetched.set(String.valueOf(cb_true));
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

    private void process_inputs() {
        _1100();
        /* RAW: - RECEIVE-MAP THRU 1100 - RECEIVE-MAP-EXIT */
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
        ccup_new_details.set("");
        if ((String.valueOf(acctsidi).equals(String.valueOf("*")) || String.valueOf(acctsidi).equals(String.valueOf(" ")))) {
            cc_acct_id.set(String.valueOf("\u0000"));
            ccup_new_acctid.set(String.valueOf("\u0000"));
        } else {
            cc_acct_id.set(String.valueOf(acctsidi));
            ccup_new_acctid.set(String.valueOf(acctsidi));
        }
        if ((String.valueOf(cardsidi).equals(String.valueOf("*")) || String.valueOf(cardsidi).equals(String.valueOf(" ")))) {
            cc_card_num.set(String.valueOf("\u0000"));
            ccup_new_cardid.set(String.valueOf("\u0000"));
        } else {
            cc_card_num.set(String.valueOf(cardsidi));
            ccup_new_cardid.set(String.valueOf(cardsidi));
        }
        if ((String.valueOf(crdnamei).equals(String.valueOf("*")) || String.valueOf(crdnamei).equals(String.valueOf(" ")))) {
            ccup_new_crdname.set(String.valueOf("\u0000"));
        } else {
            ccup_new_crdname.set(String.valueOf(crdnamei));
        }
        if ((String.valueOf(crdstcdi).equals(String.valueOf("*")) || String.valueOf(crdstcdi).equals(String.valueOf(" ")))) {
            ccup_new_crdstcd.set(String.valueOf("\u0000"));
        } else {
            ccup_new_crdstcd.set(String.valueOf(crdstcdi));
        }
        ccup_new_expday.set(String.valueOf(expdayi));
        if ((String.valueOf(expmoni).equals(String.valueOf("*")) || String.valueOf(expmoni).equals(String.valueOf(" ")))) {
            ccup_new_expmon.set(String.valueOf("\u0000"));
        } else {
            ccup_new_expmon.set(String.valueOf(expmoni));
        }
        if ((String.valueOf(expyeari).equals(String.valueOf("*")) || String.valueOf(expyeari).equals(String.valueOf(" ")))) {
            ccup_new_expyear.set(String.valueOf("\u0000"));
        } else {
            ccup_new_expyear.set(String.valueOf(expyeari));
        }
        /* RAW: 1100 - */
    }

    private void receive_map_exit() {
        return;
    }

    private void edit_map_inputs() {
        input_ok.set(String.valueOf(cb_true));
        if (!String.valueOf(ccup_details_not_fetched).trim().isEmpty()) {
            _1210();
            /* RAW: - EDIT-ACCOUNT THRU 1210 - EDIT-ACCOUNT-EXIT */
            _1220();
            /* RAW: - EDIT-CARD THRU 1220 - EDIT-CARD-EXIT */
            ccup_new_carddata.set(String.valueOf("\u0000"));
            if ((!String.valueOf(flg_acctfilter_blank).trim().isEmpty() && !String.valueOf(flg_cardfilter_blank).trim().isEmpty())) {
                no_search_criteria_received.set(String.valueOf(cb_true));
            }
            _1200();
            return;
        } else {
            /* CONTINUE */
        }
        found_cards_for_account.set(String.valueOf(cb_true));
        flg_acctfilter_isvalid.set(String.valueOf(cb_true));
        flg_cardfilter_isvalid.set(String.valueOf(cb_true));
        cdemo_acct_id.set(String.valueOf(ccup_old_acctid));
        cdemo_card_num.set(String.valueOf(ccup_old_cardid));
        card_embossed_name.set(String.valueOf(ccup_old_crdname));
        card_active_status.set(String.valueOf(ccup_old_crdstcd));
        card_expiry_day.set(String.valueOf(ccup_old_expday));
        card_expiry_month.set(String.valueOf(ccup_old_expmon));
        card_expiry_year.set(String.valueOf(ccup_old_expyear));
        if (String.valueOf(CobolIntrinsics.upper_case(ccup_new_carddata)).equals(String.valueOf(CobolIntrinsics.upper_case(ccup_old_carddata)))) {
            no_changes_detected.set(String.valueOf(cb_true));
        }
        if (((!String.valueOf(no_changes_detected).trim().isEmpty() || !String.valueOf(ccup_changes_ok_not_confirmed).trim().isEmpty()) || !String.valueOf(ccup_changes_okayed_and_done).trim().isEmpty())) {
            flg_cardname_isvalid.set(String.valueOf(cb_true));
            flg_cardstatus_isvalid.set(String.valueOf(cb_true));
            flg_cardexpmon_isvalid.set(String.valueOf(cb_true));
            flg_cardexpyear_isvalid.set(String.valueOf(cb_true));
            _1200();
            return;
        }
        ccup_changes_not_ok.set(String.valueOf(cb_true));
        _1230();
        /* RAW: - EDIT-NAME THRU 1230 - EDIT-NAME-EXIT */
        _1240();
        /* RAW: - EDIT-CARDSTATUS THRU 1240 - EDIT-CARDSTATUS-EXIT */
        _1250();
        /* RAW: - EDIT-EXPIRY-MON THRU 1250 - EDIT-EXPIRY-MON-EXIT */
        _1260();
        /* RAW: - EDIT-EXPIRY-YEAR THRU 1260 - EDIT-EXPIRY-YEAR-EXIT */
        if (!String.valueOf(input_error).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            ccup_changes_ok_not_confirmed.set(String.valueOf(cb_true));
        }
        /* RAW: 1200 - */
    }

    private void edit_map_inputs_exit() {
        return;
    }

    private void edit_account() {
        flg_acctfilter_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(cc_acct_id).equals(String.valueOf("\u0000")) || String.valueOf(cc_acct_id).equals(String.valueOf(" "))) || String.valueOf(cc_acct_id_n).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_prompt_for_acct.set(String.valueOf(cb_true));
            }
            cdemo_acct_id.set(String.valueOf(0));
            ccup_new_acctid.set(String.valueOf("\u0000"));
            _1210();
            return;
        }
        if (!CobolIntrinsics.isNumeric(cc_acct_id)) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_return_msg.set(String.valueOf("ACCOUNT FILTER,IF SUPPLIED MUST BE A 11 DIGIT NUMBER"));
            }
            cdemo_acct_id.set(String.valueOf(0));
            ccup_new_acctid.set(String.valueOf("\u0000"));
            _1210();
            return;
        } else {
            cdemo_acct_id.set(String.valueOf(cc_acct_id));
            ccup_new_acctid.set(String.valueOf(cc_acct_id));
            flg_acctfilter_isvalid.set(String.valueOf(cb_true));
        }
        /* RAW: 1210 - */
    }

    private void edit_account_exit() {
        return;
    }

    private void edit_card() {
        flg_cardfilter_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(cc_card_num).equals(String.valueOf("\u0000")) || String.valueOf(cc_card_num).equals(String.valueOf(" "))) || String.valueOf(cc_card_num_n).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_cardfilter_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_prompt_for_card.set(String.valueOf(cb_true));
            }
            cdemo_card_num.set(String.valueOf(0));
            ccup_new_cardid.set(String.valueOf(0));
            _1220();
            return;
        }
        if (!CobolIntrinsics.isNumeric(cc_card_num)) {
            input_error.set(String.valueOf(cb_true));
            flg_cardfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_return_msg.set(String.valueOf("CARD ID FILTER,IF SUPPLIED MUST BE A 16 DIGIT NUMBER"));
            }
            cdemo_card_num.set(String.valueOf(0));
            ccup_new_cardid.set(String.valueOf("\u0000"));
            _1220();
            return;
        } else {
            cdemo_card_num.set(String.valueOf(cc_card_num_n));
            ccup_new_cardid.set(String.valueOf(cc_card_num));
            flg_cardfilter_isvalid.set(String.valueOf(cb_true));
        }
        /* RAW: 1220 - */
    }

    private void edit_card_exit() {
        return;
    }

    private void edit_name() {
        flg_cardname_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(ccup_new_crdname).equals(String.valueOf("\u0000")) || String.valueOf(ccup_new_crdname).equals(String.valueOf(" "))) || String.valueOf(ccup_new_crdname).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_cardname_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_prompt_for_name.set(String.valueOf(cb_true));
            }
            _1230();
            return;
        }
        card_name_check.set(String.valueOf(ccup_new_crdname));
        /* INSPECT CARD-NAME-CHECK — 2 clause(s) */
        if (String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(card_name_check))).equals(String.valueOf(0))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_cardname_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_name_must_be_alpha.set(String.valueOf(cb_true));
            }
            _1230();
            return;
        }
        flg_cardname_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1230 - */
    }

    private void edit_name_exit() {
        return;
    }

    private void edit_cardstatus() {
        flg_cardstatus_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(ccup_new_crdstcd).equals(String.valueOf("\u0000")) || String.valueOf(ccup_new_crdstcd).equals(String.valueOf(" "))) || String.valueOf(ccup_new_crdstcd).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_cardstatus_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                card_status_must_be_yes_no.set(String.valueOf(cb_true));
            }
            _1240();
            return;
        }
        flg_yes_no_check.set(String.valueOf(ccup_new_crdstcd));
        if (!String.valueOf(flg_yes_no_valid).trim().isEmpty()) {
            flg_cardstatus_isvalid.set(String.valueOf(cb_true));
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_cardstatus_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                card_status_must_be_yes_no.set(String.valueOf(cb_true));
            }
            _1240();
            return;
        }
        /* RAW: 1240 - */
    }

    private void edit_cardstatus_exit() {
        return;
    }

    private void edit_expiry_mon() {
        flg_cardexpmon_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(ccup_new_expmon).equals(String.valueOf("\u0000")) || String.valueOf(ccup_new_expmon).equals(String.valueOf(" "))) || String.valueOf(ccup_new_expmon).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_cardexpmon_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                card_expiry_month_not_valid.set(String.valueOf(cb_true));
            }
            _1250();
            return;
        }
        card_month_check.set(String.valueOf(ccup_new_expmon));
        if (!String.valueOf(valid_month).trim().isEmpty()) {
            flg_cardexpmon_isvalid.set(String.valueOf(cb_true));
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_cardexpmon_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                card_expiry_month_not_valid.set(String.valueOf(cb_true));
            }
            _1250();
            return;
        }
        /* RAW: 1250 - */
    }

    private void edit_expiry_mon_exit() {
        return;
    }

    private void edit_expiry_year() {
        if (((String.valueOf(ccup_new_expyear).equals(String.valueOf("\u0000")) || String.valueOf(ccup_new_expyear).equals(String.valueOf(" "))) || String.valueOf(ccup_new_expyear).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_cardexpyear_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                card_expiry_year_not_valid.set(String.valueOf(cb_true));
            }
            _1260();
            return;
        }
        flg_cardexpyear_not_ok.set(String.valueOf(cb_true));
        card_year_check.set(String.valueOf(ccup_new_expyear));
        if (!String.valueOf(valid_year).trim().isEmpty()) {
            flg_cardexpyear_isvalid.set(String.valueOf(cb_true));
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_cardexpyear_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                card_expiry_year_not_valid.set(String.valueOf(cb_true));
            }
            _1260();
            return;
        }
        /* RAW: 1260 - */
    }

    private void edit_expiry_year_exit() {
        return;
    }

    private void decide_action() {
        if (!String.valueOf(ccup_details_not_fetched).trim().isEmpty()) {
        } else if (!String.valueOf(ccard_aid_pfk12).trim().isEmpty()) {
            if ((!String.valueOf(flg_acctfilter_isvalid).trim().isEmpty() && !String.valueOf(flg_cardfilter_isvalid).trim().isEmpty())) {
                _9000();
                /* RAW: - READ-DATA THRU 9000 - READ-DATA-EXIT */
                if (!String.valueOf(found_cards_for_account).trim().isEmpty()) {
                    ccup_show_details.set(String.valueOf(cb_true));
                }
            }
        } else if (!String.valueOf(ccup_show_details).trim().isEmpty()) {
            if ((!String.valueOf(input_error).trim().isEmpty() || !String.valueOf(no_changes_detected).trim().isEmpty())) {
                /* CONTINUE */
            } else {
                ccup_changes_ok_not_confirmed.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(ccup_changes_not_ok).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(ccup_changes_ok_not_confirmed).trim().isEmpty()) {
            /* RAW: AND CCARD-AID-PFK05 */
            _9200();
            /* RAW: - WRITE-PROCESSING THRU 9200 - WRITE-PROCESSING-EXIT */
            if (!String.valueOf(could_not_lock_for_update).trim().isEmpty()) {
                ccup_changes_okayed_lock_error.set(String.valueOf(cb_true));
            } else if (!String.valueOf(locked_but_update_failed).trim().isEmpty()) {
                ccup_changes_okayed_but_failed.set(String.valueOf(cb_true));
            } else if (!String.valueOf(data_was_changed_before_update).trim().isEmpty()) {
                ccup_show_details.set(String.valueOf(cb_true));
            } else {
                ccup_changes_okayed_and_done.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(ccup_changes_ok_not_confirmed).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(ccup_changes_okayed_and_done).trim().isEmpty()) {
            ccup_show_details.set(String.valueOf(cb_true));
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
        ccrdupao.set(String.valueOf("\u0000"));
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
            if (String.valueOf(cc_acct_id_n).equals(String.valueOf(0))) {
                acctsido.set(String.valueOf("\u0000"));
            } else {
                acctsido.set(String.valueOf(cc_acct_id));
            }
            if (String.valueOf(cc_card_num_n).equals(String.valueOf(0))) {
                cardsido.set(String.valueOf("\u0000"));
            } else {
                cardsido.set(String.valueOf(cc_card_num));
            }
            if (!String.valueOf(ccup_details_not_fetched).trim().isEmpty()) {
                crdnameo.set(String.valueOf("\u0000"));
                crdnameo.set(String.valueOf("\u0000"));
                crdstcdo.set(String.valueOf("\u0000"));
                expdayo.set(String.valueOf("\u0000"));
                expmono.set(String.valueOf("\u0000"));
                expyearo.set(String.valueOf("\u0000"));
            } else if (!String.valueOf(ccup_show_details).trim().isEmpty()) {
                crdnameo.set(String.valueOf(ccup_old_crdname));
                crdstcdo.set(String.valueOf(ccup_old_crdstcd));
                expdayo.set(String.valueOf(ccup_old_expday));
                expmono.set(String.valueOf(ccup_old_expmon));
                expyearo.set(String.valueOf(ccup_old_expyear));
            } else if (!String.valueOf(ccup_changes_made).trim().isEmpty()) {
                crdnameo.set(String.valueOf(ccup_new_crdname));
                crdstcdo.set(String.valueOf(ccup_new_crdstcd));
                expmono.set(String.valueOf(ccup_new_expmon));
                expyearo.set(String.valueOf(ccup_new_expyear));
                expdayo.set(String.valueOf(ccup_old_expday));
            } else {
                crdnameo.set(String.valueOf(ccup_old_crdname));
                crdstcdo.set(String.valueOf(ccup_old_crdstcd));
                expdayo.set(String.valueOf(ccup_old_expday));
                expmono.set(String.valueOf(ccup_old_expmon));
                expyearo.set(String.valueOf(ccup_old_expyear));
            }
        }
        /* RAW: 3200 - */
    }

    private void setup_screen_vars_exit() {
        return;
    }

    private void setup_infomsg() {
        if (!String.valueOf(cdemo_pgm_enter).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ccup_details_not_fetched).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ccup_show_details).trim().isEmpty()) {
            found_cards_for_account.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ccup_changes_not_ok).trim().isEmpty()) {
            prompt_for_changes.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ccup_changes_ok_not_confirmed).trim().isEmpty()) {
            prompt_for_confirmation.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ccup_changes_okayed_and_done).trim().isEmpty()) {
            confirm_update_success.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ccup_changes_okayed_lock_error).trim().isEmpty()) {
            inform_failure.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ccup_changes_okayed_but_failed).trim().isEmpty()) {
            inform_failure.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        }
        infomsgo.set(String.valueOf(ws_info_msg));
        errmsgo.set(String.valueOf(ws_return_msg));
        /* RAW: 3250 - */
    }

    private void setup_infomsg_exit() {
        return;
    }

    private void setup_screen_attrs() {
        if (!String.valueOf(ccup_details_not_fetched).trim().isEmpty()) {
            acctsida.set(String.valueOf(dfhbmfse));
            cardsida.set(String.valueOf(dfhbmfse));
            crdnamea.set(String.valueOf(dfhbmprf));
            crdstcda.set(String.valueOf(dfhbmprf));
            expmona.set(String.valueOf(dfhbmprf));
            expyeara.set(String.valueOf(dfhbmprf));
        } else if (!String.valueOf(ccup_show_details).trim().isEmpty()) {
        } else if (!String.valueOf(ccup_changes_not_ok).trim().isEmpty()) {
            acctsida.set(String.valueOf(dfhbmprf));
            cardsida.set(String.valueOf(dfhbmprf));
            crdnamea.set(String.valueOf(dfhbmfse));
            crdstcda.set(String.valueOf(dfhbmfse));
            expmona.set(String.valueOf(dfhbmfse));
            expyeara.set(String.valueOf(dfhbmfse));
        } else if (!String.valueOf(ccup_changes_ok_not_confirmed).trim().isEmpty()) {
        } else if (!String.valueOf(ccup_changes_okayed_and_done).trim().isEmpty()) {
            acctsida.set(String.valueOf(dfhbmprf));
            cardsida.set(String.valueOf(dfhbmprf));
            crdnamea.set(String.valueOf(dfhbmprf));
            crdstcda.set(String.valueOf(dfhbmprf));
            expmona.set(String.valueOf(dfhbmprf));
            expyeara.set(String.valueOf(dfhbmprf));
        } else {
            acctsida.set(String.valueOf(dfhbmfse));
            cardsida.set(String.valueOf(dfhbmfse));
            crdnamea.set(String.valueOf(dfhbmprf));
            crdstcda.set(String.valueOf(dfhbmprf));
            expmona.set(String.valueOf(dfhbmprf));
            expyeara.set(String.valueOf(dfhbmprf));
        }
        if (!String.valueOf(found_cards_for_account).trim().isEmpty()) {
        } else if (!String.valueOf(no_changes_detected).trim().isEmpty()) {
            crdnamel.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_acctfilter_blank).trim().isEmpty()) {
            acctsidl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_cardfilter_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cardfilter_blank).trim().isEmpty()) {
            cardsidl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_cardname_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cardname_blank).trim().isEmpty()) {
            crdnamel.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_cardstatus_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cardstatus_blank).trim().isEmpty()) {
            crdstcdl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_cardexpmon_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cardexpmon_blank).trim().isEmpty()) {
            expmonl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_cardexpyear_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cardexpyear_blank).trim().isEmpty()) {
            expyearl.set(String.valueOf(-1));
        } else {
            acctsidl.set(String.valueOf(-1));
        }
        if (String.valueOf(cdemo_last_mapset).equals(String.valueOf(lit_cclistmapset))) {
            acctsidc.set(String.valueOf(dfhdfcol));
            cardsidc.set(String.valueOf(dfhdfcol));
        }
        if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
            acctsidc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_acctfilter_blank).trim().isEmpty() && !String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
            acctsido.set(String.valueOf("*"));
            acctsidc.set(String.valueOf(dfhred));
        }
        if (!String.valueOf(flg_cardfilter_not_ok).trim().isEmpty()) {
            cardsidc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardfilter_blank).trim().isEmpty() && !String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
            cardsido.set(String.valueOf("*"));
            cardsidc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardname_not_ok).trim().isEmpty() && !String.valueOf(ccup_changes_not_ok).trim().isEmpty())) {
            crdnamec.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardname_blank).trim().isEmpty() && !String.valueOf(ccup_changes_not_ok).trim().isEmpty())) {
            crdnameo.set(String.valueOf("*"));
            crdnamec.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardstatus_not_ok).trim().isEmpty() && !String.valueOf(ccup_changes_not_ok).trim().isEmpty())) {
            crdstcdc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardstatus_blank).trim().isEmpty() && !String.valueOf(ccup_changes_not_ok).trim().isEmpty())) {
            crdstcdo.set(String.valueOf("*"));
            crdstcdc.set(String.valueOf(dfhred));
        }
        expdayc.set(String.valueOf(dfhbmdar));
        if ((!String.valueOf(flg_cardexpmon_not_ok).trim().isEmpty() && !String.valueOf(ccup_changes_not_ok).trim().isEmpty())) {
            expmonc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardexpmon_blank).trim().isEmpty() && !String.valueOf(ccup_changes_not_ok).trim().isEmpty())) {
            expmono.set(String.valueOf("*"));
            expmonc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardexpyear_not_ok).trim().isEmpty() && !String.valueOf(ccup_changes_not_ok).trim().isEmpty())) {
            expyearc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardexpyear_blank).trim().isEmpty() && !String.valueOf(ccup_changes_not_ok).trim().isEmpty())) {
            expyearo.set(String.valueOf("*"));
            expyearc.set(String.valueOf(dfhred));
        }
        if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
            infomsga.set(String.valueOf(dfhbmdar));
        } else {
            infomsga.set(String.valueOf(dfhbmbry));
        }
        if (!String.valueOf(prompt_for_confirmation).trim().isEmpty()) {
            fkeysca.set(String.valueOf(dfhbmbry));
        }
        /* RAW: 3300 - */
    }

    private void setup_screen_attrs_exit() {
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
        if (from[Integer.parseInt(String.valueOf(ccrdupao).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(ccrdupao).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(ccrdupao).trim()) - 1].set(String.valueOf(lit_thismap));
        cursor.set(String.valueOf(lit_thismap));
        erase.set(String.valueOf(lit_thismap));
        freekb.set(String.valueOf(lit_thismap));
        if (resp[ws_resp_cd - 1] == null) resp[ws_resp_cd - 1] = new CobolString(256);
        resp[ws_resp_cd - 1].set(String.valueOf(lit_thismap));
    }

    private void end_exec_2() {
        /* RAW: 3400 - */
    }

    private void send_screen_exit_2() {
        return;
    }

    private void read_data() {
        ccup_old_details.set("");
        ccup_old_acctid.set(String.valueOf(cc_acct_id));
        ccup_old_cardid.set(String.valueOf(cc_card_num));
        _9100();
        /* RAW: - GETCARD-BYACCTCARD THRU 9100 - GETCARD-BYACCTCARD-EXIT */
        if (!String.valueOf(found_cards_for_account).trim().isEmpty()) {
            ccup_old_cvv_cd.set(String.valueOf(card_cvv_cd));
            /* INSPECT CARD-EMBOSSED-NAME — 2 clause(s) */
            ccup_old_crdname.set(String.valueOf(card_embossed_name));
            ccup_old_expyear.set(String.valueOf(CobolString.refMod(card_expiraion_date, 1, 4)));
            ccup_old_expmon.set(String.valueOf(CobolString.refMod(card_expiraion_date, 6, 2)));
            ccup_old_expday.set(String.valueOf(CobolString.refMod(card_expiraion_date, 9, 2)));
            ccup_old_crdstcd.set(String.valueOf(card_active_status));
        }
        /* RAW: 9000 - */
    }

    private void read_data_exit() {
        return;
    }

    private void getcard_byacctcard() {
        ws_card_rid_cardnum.set(String.valueOf(cc_card_num));
        exec.set(String.valueOf(cc_card_num));
        cics.set(String.valueOf(cc_card_num));
        if (file.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( LIT-CARDFILENAME ) RIDFLD ( WS-CARD-RID-CARDNUM */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            found_cards_for_account.set(String.valueOf(cb_true));
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            flg_cardfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                did_not_find_acctcard_combo.set(String.valueOf(cb_true));
            }
        } else {
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            }
            error_opname.set(String.valueOf("READ"));
            error_file.set(String.valueOf(lit_cardfilename));
            error_resp.set(String.valueOf(ws_resp_cd));
            error_resp2.set(String.valueOf(ws_reas_cd));
            ws_return_msg.set(String.valueOf(ws_file_error_message));
        }
        /* RAW: 9100 - */
    }

    private void getcard_byacctcard_exit() {
        return;
    }

    private void write_processing() {
        ws_card_rid_cardnum.set(String.valueOf(cc_card_num));
        exec.set(String.valueOf(cc_card_num));
        cics.set(String.valueOf(cc_card_num));
        if (file.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( LIT-CARDFILENAME ) UPDATE RIDFLD ( */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                could_not_lock_for_update.set(String.valueOf(cb_true));
            }
            _9200();
            return;
        }
        _9300();
        /* RAW: - CHECK-CHANGE-IN-REC THRU 9300 - CHECK-CHANGE-IN-REC-EXIT */
        if (!String.valueOf(data_was_changed_before_update).trim().isEmpty()) {
            _9200();
            return;
        }
        card_update_record.set("");
        card_update_num.set(String.valueOf(ccup_new_cardid));
        card_update_acct_id.set(String.valueOf(cc_acct_id_n));
        card_cvv_cd_x.set(String.valueOf(ccup_new_cvv_cd));
        card_update_cvv_cd.set(String.valueOf(card_cvv_cd_n));
        card_update_embossed_name.set(String.valueOf(ccup_new_crdname));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(ccup_new_expyear));
            _sb.append("-");
            _sb.append(String.valueOf(ccup_new_expmon));
            _sb.append("-");
            _sb.append(String.valueOf(ccup_new_expday));
            card_update_expiraion_date.set(_sb.toString());
        }
        card_update_active_status.set(String.valueOf(ccup_new_crdstcd));
        exec.set(String.valueOf(ccup_new_crdstcd));
        cics.set(String.valueOf(ccup_new_crdstcd));
        file.rewrite((card_update_record));
        /* RAW: LENGTH ( LENGTH OF CARD-UPDATE-RECORD ) */
    }

    private void end_exec_3() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else {
            locked_but_update_failed.set(String.valueOf(cb_true));
        }
        /* RAW: 9200 - */
    }

    private void write_processing_exit() {
        return;
    }

    private void check_change_in_rec() {
        /* INSPECT CARD-EMBOSSED-NAME — 2 clause(s) */
        if ((((((String.valueOf(card_cvv_cd).equals(String.valueOf(ccup_old_cvv_cd)) && String.valueOf(card_embossed_name).equals(String.valueOf(ccup_old_crdname))) && String.valueOf(CobolString.refMod(card_expiraion_date, 1, 4)).equals(String.valueOf(ccup_old_expyear))) && String.valueOf(CobolString.refMod(card_expiraion_date, 6, 2)).equals(String.valueOf(ccup_old_expmon))) && String.valueOf(CobolString.refMod(card_expiraion_date, 9, 2)).equals(String.valueOf(ccup_old_expday))) && String.valueOf(card_active_status).equals(String.valueOf(ccup_old_crdstcd)))) {
            /* CONTINUE */
        } else {
            data_was_changed_before_update.set(String.valueOf(cb_true));
            ccup_old_cvv_cd.set(String.valueOf(card_cvv_cd));
            ccup_old_crdname.set(String.valueOf(card_embossed_name));
            ccup_old_expyear.set(String.valueOf(CobolString.refMod(card_expiraion_date, 1, 4)));
            ccup_old_expmon.set(String.valueOf(CobolString.refMod(card_expiraion_date, 6, 2)));
            ccup_old_expday.set(String.valueOf(CobolString.refMod(card_expiraion_date, 9, 2)));
            ccup_old_crdstcd.set(String.valueOf(card_active_status));
            _9200();
            return;
        }
        return;
    }

    private void check_change_in_rec_exit() {
        return;
    }

    private void abend_routine() {
        if (String.valueOf(abend_msg).equals(String.valueOf("\u0000"))) {
            abend_msg.set(String.valueOf("UNEXPECTED ABEND OCCURRED."));
        }
        abend_culprit.set(String.valueOf(lit_thispgm));
        exec.set(String.valueOf(lit_thispgm));
        cics.set(String.valueOf(lit_thispgm));
        send.set(String.valueOf(lit_thispgm));
        if (from[Integer.parseInt(String.valueOf(abend_data).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(abend_data).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(abend_data).trim()) - 1].set(String.valueOf(lit_thispgm));
        if (length[CobolIntrinsics.length(abend_data) - 1] == null) length[CobolIntrinsics.length(abend_data) - 1] = new CobolString(256);
        length[CobolIntrinsics.length(abend_data) - 1].set(String.valueOf(lit_thispgm));
        nohandle.set(String.valueOf(lit_thispgm));
        erase.set(String.valueOf(lit_thispgm));
        end_exec.set(String.valueOf(lit_thispgm));
        exec.set(String.valueOf(lit_thispgm));
        cics.set(String.valueOf(lit_thispgm));
        handle.set(String.valueOf(lit_thispgm));
        abend.set(String.valueOf(lit_thispgm));
        /* CANCEL end_exec */
        /* CANCEL exec */
        /* CANCEL cics */
        /* CANCEL abend */
        // CANCEL abcode[0  non-numeric literal: 9999  - 1]
    }

    private void end_exec_4() {
    }

    private void abend_routine_exit() {
        return;
    }

    private void yyyy_store_pfkey() { /* stub — external/COPY */ }

    private void yyyy_store_pfkey_exit() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _1210() { /* stub — external/COPY */ }

    private void _1220() { /* stub — external/COPY */ }

    private void _1230() { /* stub — external/COPY */ }

    private void _1240() { /* stub — external/COPY */ }

    private void _1250() { /* stub — external/COPY */ }

    private void _1260() { /* stub — external/COPY */ }

    private void _9200() { /* stub — external/COPY */ }

    private void _3100() { /* stub — external/COPY */ }

    private void _3200() { /* stub — external/COPY */ }

    private void _3250() { /* stub — external/COPY */ }

    private void _3300() { /* stub — external/COPY */ }

    private void _3400() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _9300() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cocrdupc().run();
    }
}
