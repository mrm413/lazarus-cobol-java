package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cocrdlic extends CobolProgram {
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
    private CobolString ws_input_flag = new CobolString(1);
    private CobolString ws_edit_acct_flag = new CobolString(1);
    private CobolString ws_edit_card_flag = new CobolString(1);
    private BigDecimal ws_edit_select_counter = BigDecimal.ZERO;
    private CobolString ws_edit_select_flags = new CobolString(7);
    private CobolString ws_edit_select_array = new CobolString(1); // Group: WS-EDIT-SELECT-ARRAY
    private CobolString[] ws_edit_select = new CobolString[7];
    private CobolString ws_edit_select_error_flags = new CobolString(7);
    private CobolString ws_edit_select_error_flagx = new CobolString(1); // Group: WS-EDIT-SELECT-ERROR-FLAGX
    private CobolString[] ws_edit_select_errors = new CobolString[7]; // Group: WS-EDIT-SELECT-ERRORS
    private CobolString[] ws_row_crdselect_error = new CobolString[7];
    private CobolString ws_subscript_vars = new CobolString(1); // Group: WS-SUBSCRIPT-VARS
    private short i = (short) 0;
    private short i_selected = (short) 0;
    private CobolString cics_output_edit_vars = new CobolString(1); // Group: CICS-OUTPUT-EDIT-VARS
    private CobolString card_acct_id_x = new CobolString(11);
    private int card_acct_id_n = 0;
    private CobolString card_cvv_cd_x = new CobolString(3);
    private int card_cvv_cd_n = 0;
    private CobolString flg_protect_select_rows = new CobolString(1);
    private CobolString ws_long_msg = new CobolString(500);
    private CobolString ws_info_msg = new CobolString(45);
    private CobolString ws_error_msg = new CobolString(75);
    private CobolString ws_pfk_flag = new CobolString(1);
    private CobolString ws_context_flag = new CobolString(1);
    private CobolString ws_file_handling_vars = new CobolString(1); // Group: WS-FILE-HANDLING-VARS
    private CobolString ws_card_rid = new CobolString(1); // Group: WS-CARD-RID
    private CobolString ws_card_rid_cardnum = new CobolString(16);
    private int ws_card_rid_acct_id = 0;
    private CobolString ws_card_rid_acct_id_x = new CobolString(11);
    private short ws_scrn_counter = (short) 0;
    private CobolString ws_filter_record_flag = new CobolString(1);
    private CobolString ws_records_to_process_flag = new CobolString(1);
    private CobolString ws_file_error_message = new CobolString(1); // Group: WS-FILE-ERROR-MESSAGE
    private CobolString error_opname = new CobolString(8);
    private CobolString error_file = new CobolString(9);
    private CobolString error_resp = new CobolString(10);
    private CobolString error_resp2 = new CobolString(10);
    private CobolString ws_constants = new CobolString(1); // Group: WS-CONSTANTS
    private short ws_max_screen_lines = (short) 0;
    private CobolString lit_thispgm = new CobolString(8);
    private CobolString lit_thistranid = new CobolString(4);
    private CobolString lit_thismapset = new CobolString(7);
    private CobolString lit_thismap = new CobolString(7);
    private CobolString lit_menupgm = new CobolString(8);
    private CobolString lit_menutranid = new CobolString(4);
    private CobolString lit_menumapset = new CobolString(7);
    private CobolString lit_menumap = new CobolString(7);
    private CobolString lit_carddtlpgm = new CobolString(8);
    private CobolString lit_carddtltranid = new CobolString(4);
    private CobolString lit_carddtlmapset = new CobolString(7);
    private CobolString lit_carddtlmap = new CobolString(7);
    private CobolString lit_cardupdpgm = new CobolString(8);
    private CobolString lit_cardupdtranid = new CobolString(4);
    private CobolString lit_cardupdmapset = new CobolString(7);
    private CobolString lit_cardupdmap = new CobolString(7);
    private CobolString lit_card_file = new CobolString(8);
    private CobolString lit_card_file_acct_path = new CobolString(8);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString cc_work_area = new CobolString(256); // fallback
    private CobolString ws_commarea = new CobolString(256); // fallback
    private CobolString ws_error_msg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString ws_this_progcommarea = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString cdemo_usrtyp_user = new CobolString(256); // fallback
    private CobolString cdemo_pgm_enter = new CobolString(256); // fallback
    private CobolString cdemo_last_map = new CobolString(256); // fallback
    private CobolString cdemo_last_mapset = new CobolString(256); // fallback
    private CobolString ca_first_page = new CobolString(256); // fallback
    private CobolString ca_last_page_not_shown = new CobolString(256); // fallback
    private CobolString pfk_invalid = new CobolString(256); // fallback
    private CobolString ccard_aid_enter = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk03 = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk07 = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk08 = new CobolString(256); // fallback
    private CobolString pfk_valid = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString ccard_next_mapset = new CobolString(256); // fallback
    private CobolString ccard_next_map = new CobolString(256); // fallback
    private CobolString ws_exit_message = new CobolString(256); // fallback
    private CobolString ws_ca_first_card_num = new CobolString(256); // fallback
    private CobolString input_error = new CobolString(256); // fallback
    private CobolString ccard_error_msg = new CobolString(256); // fallback
    private CobolString ccard_next_prog = new CobolString(256); // fallback
    private CobolString flg_acctfilter_not_ok = new CobolString(256); // fallback
    private CobolString flg_cardfilter_not_ok = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString ws_ca_last_card_num = new CobolString(256); // fallback
    private CobolString ws_ca_screen_num = new CobolString(256); // fallback
    private CobolString[] ws_row_acctno = new CobolString[100]; // fallback array
    private CobolString cdemo_acct_id = new CobolString(256); // fallback
    private CobolString[] ws_row_card_num = new CobolString[100]; // fallback array
    private CobolString cdemo_card_num = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString ccrdliao = new CobolString(256); // fallback
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
    private CobolString pagenoo = new CobolString(256); // fallback
    private CobolString ws_no_info_message = new CobolString(256); // fallback
    private CobolString infomsgo = new CobolString(256); // fallback
    private CobolString dfhbmdar = new CobolString(256); // fallback
    private CobolString infomsgc = new CobolString(256); // fallback
    private CobolString[] ws_each_card = new CobolString[100]; // fallback array
    private CobolString crdsel1o = new CobolString(256); // fallback
    private CobolString acctno1o = new CobolString(256); // fallback
    private CobolString crdnum1o = new CobolString(256); // fallback
    private CobolString[] ws_row_card_status = new CobolString[100]; // fallback array
    private CobolString crdsts1o = new CobolString(256); // fallback
    private CobolString crdsel2o = new CobolString(256); // fallback
    private CobolString acctno2o = new CobolString(256); // fallback
    private CobolString crdnum2o = new CobolString(256); // fallback
    private CobolString crdsts2o = new CobolString(256); // fallback
    private CobolString crdsel3o = new CobolString(256); // fallback
    private CobolString acctno3o = new CobolString(256); // fallback
    private CobolString crdnum3o = new CobolString(256); // fallback
    private CobolString crdsts3o = new CobolString(256); // fallback
    private CobolString crdsel4o = new CobolString(256); // fallback
    private CobolString acctno4o = new CobolString(256); // fallback
    private CobolString crdnum4o = new CobolString(256); // fallback
    private CobolString crdsts4o = new CobolString(256); // fallback
    private CobolString crdsel5o = new CobolString(256); // fallback
    private CobolString acctno5o = new CobolString(256); // fallback
    private CobolString crdnum5o = new CobolString(256); // fallback
    private CobolString crdsts5o = new CobolString(256); // fallback
    private CobolString crdsel6o = new CobolString(256); // fallback
    private CobolString acctno6o = new CobolString(256); // fallback
    private CobolString crdnum6o = new CobolString(256); // fallback
    private CobolString crdsts6o = new CobolString(256); // fallback
    private CobolString crdsel7o = new CobolString(256); // fallback
    private CobolString acctno7o = new CobolString(256); // fallback
    private CobolString crdnum7o = new CobolString(256); // fallback
    private CobolString crdsts7o = new CobolString(256); // fallback
    private CobolString flg_protect_select_rows_yes = new CobolString(256); // fallback
    private CobolString dfhbmprf = new CobolString(256); // fallback
    private CobolString crdsel1a = new CobolString(256); // fallback
    private CobolString dfhred = new CobolString(256); // fallback
    private CobolString crdsel1c = new CobolString(256); // fallback
    private CobolString dfhbmfse = new CobolString(256); // fallback
    private CobolString dfhbmpro = new CobolString(256); // fallback
    private CobolString crdsel2a = new CobolString(256); // fallback
    private CobolString crdsel2c = new CobolString(256); // fallback
    private CobolString crdsel2l = new CobolString(256); // fallback
    private CobolString crdsel3a = new CobolString(256); // fallback
    private CobolString crdsel3c = new CobolString(256); // fallback
    private CobolString crdsel3l = new CobolString(256); // fallback
    private CobolString crdsel4a = new CobolString(256); // fallback
    private CobolString crdsel4c = new CobolString(256); // fallback
    private CobolString crdsel4l = new CobolString(256); // fallback
    private CobolString crdsel5a = new CobolString(256); // fallback
    private CobolString crdsel5c = new CobolString(256); // fallback
    private CobolString crdsel5l = new CobolString(256); // fallback
    private CobolString crdsel6a = new CobolString(256); // fallback
    private CobolString crdsel6c = new CobolString(256); // fallback
    private CobolString crdsel6l = new CobolString(256); // fallback
    private CobolString crdsel7a = new CobolString(256); // fallback
    private CobolString crdsel7c = new CobolString(256); // fallback
    private CobolString crdsel7l = new CobolString(256); // fallback
    private CobolString acctsido = new CobolString(256); // fallback
    private CobolString acctsida = new CobolString(256); // fallback
    private CobolString flg_acctfilter_isvalid = new CobolString(256); // fallback
    private CobolString cc_acct_id = new CobolString(256); // fallback
    private CobolString cardsido = new CobolString(256); // fallback
    private CobolString cardsida = new CobolString(256); // fallback
    private CobolString flg_cardfilter_isvalid = new CobolString(256); // fallback
    private CobolString cc_card_num = new CobolString(256); // fallback
    private CobolString acctsidc = new CobolString(256); // fallback
    private CobolString acctsidl = new CobolString(256); // fallback
    private CobolString cardsidc = new CobolString(256); // fallback
    private CobolString cardsidl = new CobolString(256); // fallback
    private CobolString input_ok = new CobolString(256); // fallback
    private CobolString ws_inform_rec_actions = new CobolString(256); // fallback
    private CobolString ca_next_page_not_exists = new CobolString(256); // fallback
    private CobolString ca_last_page_shown = new CobolString(256); // fallback
    private CobolString ca_next_page_exists = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString ws_no_records_found = new CobolString(256); // fallback
    private CobolString dfhneutr = new CobolString(256); // fallback
    private CobolString acctsidi = new CobolString(256); // fallback
    private CobolString cardsidi = new CobolString(256); // fallback
    private CobolString crdsel1i = new CobolString(256); // fallback
    private CobolString crdsel2i = new CobolString(256); // fallback
    private CobolString crdsel3i = new CobolString(256); // fallback
    private CobolString crdsel4i = new CobolString(256); // fallback
    private CobolString crdsel5i = new CobolString(256); // fallback
    private CobolString crdsel6i = new CobolString(256); // fallback
    private CobolString crdsel7i = new CobolString(256); // fallback
    private CobolString flg_protect_select_rows_no = new CobolString(256); // fallback
    private CobolString flg_acctfilter_blank = new CobolString(256); // fallback
    private CobolString cc_acct_id_n = new CobolString(256); // fallback
    private CobolString flg_cardfilter_blank = new CobolString(256); // fallback
    private CobolString cc_card_num_n = new CobolString(256); // fallback
    private CobolString ws_more_than_1_action = new CobolString(256); // fallback
    private CobolString ws_invalid_action_code = new CobolString(256); // fallback
    private CobolString[] select_ok = new CobolString[100]; // fallback array
    private CobolString[] select_blank = new CobolString[100]; // fallback array
    private CobolString ws_all_rows = new CobolString(256); // fallback
    private CobolString startbr = new CobolString(256); // fallback
    private CobolString[] dataset = new CobolString[100]; // fallback array
    private CobolString[] ridfld = new CobolString[100]; // fallback array
    private CobolString[] keylength = new CobolString[100]; // fallback array
    private CobolString gteq = new CobolString(256); // fallback
    private CobolString[] resp = new CobolString[100]; // fallback array
    private CobolString[] resp2 = new CobolString[100]; // fallback array
    private CobolString more_records_to_read = new CobolString(256); // fallback
    private CobolString read_loop_exit = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString duprec = new CobolString(256); // fallback
    private CobolString ws_donot_exclude_this_record = new CobolString(256); // fallback
    private CobolString card_num = new CobolString(256); // fallback
    private CobolString card_acct_id = new CobolString(256); // fallback
    private CobolString card_active_status = new CobolString(256); // fallback
    private CobolString ws_ca_first_card_acct_id = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString ws_ca_last_card_acct_id = new CobolString(256); // fallback
    private CobolString readnext = new CobolString(256); // fallback
    private CobolString[] into = new CobolString[100]; // fallback array
    private CobolString card_record = new CobolString(256); // fallback
    private CobolString[] length = new CobolString[100]; // fallback array
    private CobolString endfile = new CobolString(256); // fallback
    private CobolString ws_ca_first_cardkey = new CobolString(256); // fallback
    private CobolString ws_ca_last_cardkey = new CobolString(256); // fallback
    private CobolString when = new CobolString(256); // fallback
    private CobolString other = new CobolString(256); // fallback
    private CobolString ws_exclude_this_record = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void para_main_2() {
        cc_work_area.set("");
        ws_misc_storage.set("");
        ws_commarea.set("");
        ws_tranid.set(String.valueOf(lit_thistranid));
        ws_error_msg_off.set(String.valueOf(cb_true));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            carddemo_commarea.set("");
            ws_this_progcommarea.set("");
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            ca_first_page.set(String.valueOf(cb_true));
            ca_last_page_not_shown.set(String.valueOf(cb_true));
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, CobolIntrinsics.length(carddemo_commarea))));
            ws_this_progcommarea.set(String.valueOf(CobolString.refMod(dfhcommarea, (CobolIntrinsics.length(carddemo_commarea) + 1), CobolIntrinsics.length(ws_this_progcommarea))));
        }
        if ((!String.valueOf(cdemo_pgm_enter).trim().isEmpty() && !String.valueOf(cdemo_from_program).equals(String.valueOf(lit_thispgm)))) {
            ws_this_progcommarea.set("");
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            ca_first_page.set(String.valueOf(cb_true));
            ca_last_page_not_shown.set(String.valueOf(cb_true));
        }
        yyyy_store_pfkey(); // THRU YYYY-STORE-PFKEY-EXIT
        if ((Integer.parseInt(String.valueOf(eibcalen).trim()) > 0 && String.valueOf(cdemo_from_program).equals(String.valueOf(lit_thispgm)))) {
            _2000();
            /* RAW: - RECEIVE-MAP THRU 2000 - RECEIVE-MAP-EXIT */
        }
        pfk_invalid.set(String.valueOf(cb_true));
        if ((((!String.valueOf(ccard_aid_enter).trim().isEmpty() || !String.valueOf(ccard_aid_pfk03).trim().isEmpty()) || !String.valueOf(ccard_aid_pfk07).trim().isEmpty()) || !String.valueOf(ccard_aid_pfk08).trim().isEmpty())) {
            pfk_valid.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(pfk_invalid).trim().isEmpty()) {
            ccard_aid_enter.set(String.valueOf(cb_true));
        }
        if ((!String.valueOf(ccard_aid_pfk03).trim().isEmpty() && String.valueOf(cdemo_from_program).equals(String.valueOf(lit_thispgm)))) {
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            cdemo_to_program.set(String.valueOf(lit_menupgm));
            ccard_next_mapset.set(String.valueOf(lit_menumapset));
            ccard_next_map.set(String.valueOf(lit_thismap));
            ws_exit_message.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            /* RAW: EXEC CICS XCTL PROGRAM ( LIT-MENUPGM */
        }
        if (!String.valueOf(ccard_aid_pfk08).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            ca_last_page_not_shown.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(input_error).trim().isEmpty()) {
            ccard_error_msg.set(String.valueOf(ws_error_msg));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            ccard_next_prog.set(String.valueOf(lit_thispgm));
            ccard_next_mapset.set(String.valueOf(lit_thismapset));
            ccard_next_map.set(String.valueOf(lit_thismap));
            if ((!(!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) && !(!String.valueOf(flg_cardfilter_not_ok).trim().isEmpty()))) {
                _9000();
                /* RAW: - READ-FORWARD THRU 9000 - READ-FORWARD-EXIT */
            }
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk07).trim().isEmpty()) {
            /* RAW: AND CA-FIRST-PAGE */
        } else if (!String.valueOf(ccard_aid_pfk07).trim().isEmpty()) {
            /* RAW: AND CA-FIRST-PAGE */
            ws_card_rid_cardnum.set(String.valueOf(ws_ca_first_card_num));
            _9000();
            /* RAW: - READ-FORWARD THRU 9000 - READ-FORWARD-EXIT */
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk03).trim().isEmpty()) {
        } else if (!String.valueOf(cdemo_pgm_reenter).trim().isEmpty()) {
            /* RAW: AND CDEMO-FROM-PROGRAM NOT EQUAL LIT-THISPGM */
            carddemo_commarea.set("");
            ws_this_progcommarea.set("");
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            ca_first_page.set(String.valueOf(cb_true));
            ca_last_page_not_shown.set(String.valueOf(cb_true));
            ws_card_rid_cardnum.set(String.valueOf(ws_ca_first_card_num));
            _9000();
            /* RAW: - READ-FORWARD THRU 9000 - READ-FORWARD-EXIT */
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk08).trim().isEmpty()) {
            /* RAW: AND CA-NEXT-PAGE-EXISTS */
            ws_card_rid_cardnum.set(String.valueOf(ws_ca_last_card_num));
            ws_ca_screen_num.set(new BigDecimal(String.valueOf(ws_ca_screen_num).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            _9000();
            /* RAW: - READ-FORWARD THRU 9000 - READ-FORWARD-EXIT */
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk07).trim().isEmpty()) {
            /* RAW: AND NOT CA-FIRST-PAGE */
            ws_card_rid_cardnum.set(String.valueOf(ws_ca_first_card_num));
            ws_ca_screen_num.set(new BigDecimal(String.valueOf(ws_ca_screen_num).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            _9100();
            /* RAW: - READ-BACKWARDS THRU 9100 - READ-BACKWARDS-EXIT */
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_enter).trim().isEmpty()) {
            /* RAW: AND VIEW-REQUESTED-ON ( I-SELECTED ) AND */
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            ccard_next_prog.set(String.valueOf(lit_carddtlpgm));
            ccard_next_mapset.set(String.valueOf(lit_carddtlmapset));
            ccard_next_map.set(String.valueOf(lit_carddtlmap));
            cdemo_acct_id.set(String.valueOf(ws_row_acctno[i_selected - 1]));
            cdemo_card_num.set(String.valueOf(ws_row_card_num[i_selected - 1]));
            exec.set(String.valueOf(ws_row_card_num[i_selected - 1]));
            cics.set(String.valueOf(ws_row_card_num[i_selected - 1]));
            xctl.set(String.valueOf(ws_row_card_num[i_selected - 1]));
            if (program[Integer.parseInt(String.valueOf(ccard_next_prog).trim()) - 1] == null) program[Integer.parseInt(String.valueOf(ccard_next_prog).trim()) - 1] = new CobolString(256);
            program[Integer.parseInt(String.valueOf(ccard_next_prog).trim()) - 1].set(String.valueOf(ws_row_card_num[i_selected - 1]));
            if (commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] == null) commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] = new CobolString(256);
            commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1].set(String.valueOf(ws_row_card_num[i_selected - 1]));
            end_exec.set(String.valueOf(ws_row_card_num[i_selected - 1]));
        } else if (!String.valueOf(ccard_aid_enter).trim().isEmpty()) {
            /* RAW: AND UPDATE-REQUESTED-ON ( I-SELECTED ) AND */
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            ccard_next_prog.set(String.valueOf(lit_cardupdpgm));
            ccard_next_mapset.set(String.valueOf(lit_cardupdmapset));
            ccard_next_map.set(String.valueOf(lit_cardupdmap));
            cdemo_acct_id.set(String.valueOf(ws_row_acctno[i_selected - 1]));
            cdemo_card_num.set(String.valueOf(ws_row_card_num[i_selected - 1]));
            exec.set(String.valueOf(ws_row_card_num[i_selected - 1]));
            cics.set(String.valueOf(ws_row_card_num[i_selected - 1]));
            xctl.set(String.valueOf(ws_row_card_num[i_selected - 1]));
            if (program[Integer.parseInt(String.valueOf(ccard_next_prog).trim()) - 1] == null) program[Integer.parseInt(String.valueOf(ccard_next_prog).trim()) - 1] = new CobolString(256);
            program[Integer.parseInt(String.valueOf(ccard_next_prog).trim()) - 1].set(String.valueOf(ws_row_card_num[i_selected - 1]));
            if (commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] == null) commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] = new CobolString(256);
            commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1].set(String.valueOf(ws_row_card_num[i_selected - 1]));
            end_exec.set(String.valueOf(ws_row_card_num[i_selected - 1]));
        } else {
            ws_card_rid_cardnum.set(String.valueOf(ws_ca_first_card_num));
            _9000();
            /* RAW: - READ-FORWARD THRU 9000 - READ-FORWARD-EXIT */
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP */
            common_return();
            return;
        }
        if (!String.valueOf(input_error).trim().isEmpty()) {
            ccard_error_msg.set(String.valueOf(ws_error_msg));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            ccard_next_prog.set(String.valueOf(lit_thispgm));
            ccard_next_mapset.set(String.valueOf(lit_thismapset));
            ccard_next_map.set(String.valueOf(lit_thismap));
            common_return();
            return;
        }
        ccard_next_prog.set(String.valueOf(lit_thispgm));
        common_return();
        return;
    }

    private void common_return() {
        cdemo_from_tranid.set(String.valueOf(lit_thistranid));
        cdemo_from_program.set(String.valueOf(lit_thispgm));
        cdemo_last_mapset.set(String.valueOf(lit_thismapset));
        cdemo_last_map.set(String.valueOf(lit_thismap));
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

    private void send_map() {
        _1100();
        /* RAW: - SCREEN-INIT THRU 1100 - SCREEN-INIT-EXIT */
        _1200();
        /* RAW: - SCREEN-ARRAY-INIT THRU 1200 - SCREEN-ARRAY-INIT-EXIT */
        _1250();
        /* RAW: - SETUP-ARRAY-ATTRIBS THRU 1250 - SETUP-ARRAY-ATTRIBS-EXIT */
        _1300();
        /* RAW: - SETUP-SCREEN-ATTRS THRU 1300 - SETUP-SCREEN-ATTRS-EXIT */
        _1400();
        /* RAW: - SETUP-MESSAGE THRU 1400 - SETUP-MESSAGE-EXIT */
        _1500();
        /* RAW: - SEND-SCREEN THRU 1500 - */
    }

    private void send_screen_exit() {
        /* RAW: 1000 - */
    }

    private void send_map_exit() {
        return;
    }

    private void screen_init() {
        ccrdliao.set(String.valueOf("\u0000"));
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
        pagenoo.set(String.valueOf(ws_ca_screen_num));
        ws_no_info_message.set(String.valueOf(cb_true));
        infomsgo.set(String.valueOf(ws_info_msg));
        infomsgc.set(String.valueOf(dfhbmdar));
        /* RAW: 1100 - */
    }

    private void screen_init_exit() {
        return;
    }

    private void screen_array_init() {
        if (String.valueOf(ws_each_card[1 - 1]).equals(String.valueOf("\u0000"))) {
            /* CONTINUE */
        } else {
            crdsel1o.set(String.valueOf(ws_edit_select[1 - 1]));
            acctno1o.set(String.valueOf(ws_row_acctno[1 - 1]));
            crdnum1o.set(String.valueOf(ws_row_card_num[1 - 1]));
            crdsts1o.set(String.valueOf(ws_row_card_status[1 - 1]));
        }
        if (String.valueOf(ws_each_card[2 - 1]).equals(String.valueOf("\u0000"))) {
            /* CONTINUE */
        } else {
            crdsel2o.set(String.valueOf(ws_edit_select[2 - 1]));
            acctno2o.set(String.valueOf(ws_row_acctno[2 - 1]));
            crdnum2o.set(String.valueOf(ws_row_card_num[2 - 1]));
            crdsts2o.set(String.valueOf(ws_row_card_status[2 - 1]));
        }
        if (String.valueOf(ws_each_card[3 - 1]).equals(String.valueOf("\u0000"))) {
            /* CONTINUE */
        } else {
            crdsel3o.set(String.valueOf(ws_edit_select[3 - 1]));
            acctno3o.set(String.valueOf(ws_row_acctno[3 - 1]));
            crdnum3o.set(String.valueOf(ws_row_card_num[3 - 1]));
            crdsts3o.set(String.valueOf(ws_row_card_status[3 - 1]));
        }
        if (String.valueOf(ws_each_card[4 - 1]).equals(String.valueOf("\u0000"))) {
            /* CONTINUE */
        } else {
            crdsel4o.set(String.valueOf(ws_edit_select[4 - 1]));
            acctno4o.set(String.valueOf(ws_row_acctno[4 - 1]));
            crdnum4o.set(String.valueOf(ws_row_card_num[4 - 1]));
            crdsts4o.set(String.valueOf(ws_row_card_status[4 - 1]));
        }
        if (String.valueOf(ws_each_card[5 - 1]).equals(String.valueOf("\u0000"))) {
            /* CONTINUE */
        } else {
            crdsel5o.set(String.valueOf(ws_edit_select[5 - 1]));
            acctno5o.set(String.valueOf(ws_row_acctno[5 - 1]));
            crdnum5o.set(String.valueOf(ws_row_card_num[5 - 1]));
            crdsts5o.set(String.valueOf(ws_row_card_status[5 - 1]));
        }
        if (String.valueOf(ws_each_card[6 - 1]).equals(String.valueOf("\u0000"))) {
            /* CONTINUE */
        } else {
            crdsel6o.set(String.valueOf(ws_edit_select[6 - 1]));
            acctno6o.set(String.valueOf(ws_row_acctno[6 - 1]));
            crdnum6o.set(String.valueOf(ws_row_card_num[6 - 1]));
            crdsts6o.set(String.valueOf(ws_row_card_status[6 - 1]));
        }
        if (String.valueOf(ws_each_card[7 - 1]).equals(String.valueOf("\u0000"))) {
            /* CONTINUE */
        } else {
            crdsel7o.set(String.valueOf(ws_edit_select[7 - 1]));
            acctno7o.set(String.valueOf(ws_row_acctno[7 - 1]));
            crdnum7o.set(String.valueOf(ws_row_card_num[7 - 1]));
            crdsts7o.set(String.valueOf(ws_row_card_status[7 - 1]));
        }
        /* RAW: 1200 - */
    }

    private void screen_array_init_exit() {
        return;
    }

    private void setup_array_attribs() {
        if ((String.valueOf(ws_each_card[1 - 1]).equals(String.valueOf("\u0000")) || !String.valueOf(flg_protect_select_rows_yes).trim().isEmpty())) {
            crdsel1a.set(String.valueOf(dfhbmprf));
        } else {
            if (String.valueOf(ws_row_crdselect_error[1 - 1]).equals(String.valueOf("1"))) {
                crdsel1c.set(String.valueOf(dfhred));
                if ((String.valueOf(ws_edit_select[1 - 1]).equals(String.valueOf(" ")) || true)) {
                    crdsel1o.set(String.valueOf("*"));
                }
            }
            crdsel1a.set(String.valueOf(dfhbmfse));
        }
        if ((String.valueOf(ws_each_card[2 - 1]).equals(String.valueOf("\u0000")) || !String.valueOf(flg_protect_select_rows_yes).trim().isEmpty())) {
            crdsel2a.set(String.valueOf(dfhbmpro));
        } else {
            if (String.valueOf(ws_row_crdselect_error[2 - 1]).equals(String.valueOf("1"))) {
                crdsel2c.set(String.valueOf(dfhred));
                crdsel2l.set(String.valueOf(-1));
            }
            crdsel2a.set(String.valueOf(dfhbmfse));
        }
        if ((String.valueOf(ws_each_card[3 - 1]).equals(String.valueOf("\u0000")) || !String.valueOf(flg_protect_select_rows_yes).trim().isEmpty())) {
            crdsel3a.set(String.valueOf(dfhbmpro));
        } else {
            if (String.valueOf(ws_row_crdselect_error[3 - 1]).equals(String.valueOf("1"))) {
                crdsel3c.set(String.valueOf(dfhred));
                crdsel3l.set(String.valueOf(-1));
            }
            crdsel3a.set(String.valueOf(dfhbmfse));
        }
        if ((String.valueOf(ws_each_card[4 - 1]).equals(String.valueOf("\u0000")) || !String.valueOf(flg_protect_select_rows_yes).trim().isEmpty())) {
            crdsel4a.set(String.valueOf(dfhbmpro));
            i = new BigDecimal(String.valueOf(dfhbmpro).trim()).shortValue();
        } else {
            if (String.valueOf(ws_row_crdselect_error[4 - 1]).equals(String.valueOf("1"))) {
                crdsel4c.set(String.valueOf(dfhred));
                crdsel4l.set(String.valueOf(-1));
            }
            crdsel4a.set(String.valueOf(dfhbmfse));
        }
        if ((String.valueOf(ws_each_card[5 - 1]).equals(String.valueOf("\u0000")) || !String.valueOf(flg_protect_select_rows_yes).trim().isEmpty())) {
            crdsel5a.set(String.valueOf(dfhbmpro));
        } else {
            if (String.valueOf(ws_row_crdselect_error[5 - 1]).equals(String.valueOf("1"))) {
                crdsel5c.set(String.valueOf(dfhred));
                crdsel5l.set(String.valueOf(-1));
            }
            crdsel5a.set(String.valueOf(dfhbmfse));
        }
        if ((String.valueOf(ws_each_card[6 - 1]).equals(String.valueOf("\u0000")) || !String.valueOf(flg_protect_select_rows_yes).trim().isEmpty())) {
            crdsel6a.set(String.valueOf(dfhbmpro));
        } else {
            if (String.valueOf(ws_row_crdselect_error[6 - 1]).equals(String.valueOf("1"))) {
                crdsel6c.set(String.valueOf(dfhred));
                crdsel6l.set(String.valueOf(-1));
            }
            crdsel6a.set(String.valueOf(dfhbmfse));
        }
        if ((String.valueOf(ws_each_card[7 - 1]).equals(String.valueOf("\u0000")) || !String.valueOf(flg_protect_select_rows_yes).trim().isEmpty())) {
            crdsel7a.set(String.valueOf(dfhbmpro));
        } else {
            if (String.valueOf(ws_row_crdselect_error[7 - 1]).equals(String.valueOf("1"))) {
                crdsel7c.set(String.valueOf(dfhred));
                crdsel7l.set(String.valueOf(-1));
            }
            crdsel7a.set(String.valueOf(dfhbmfse));
        }
        /* RAW: 1250 - */
    }

    private void setup_array_attribs_exit() {
        return;
    }

    private void setup_screen_attrs() {
        if ((String.valueOf(eibcalen).equals(String.valueOf(0)) || (!String.valueOf(cdemo_pgm_enter).trim().isEmpty() && String.valueOf(cdemo_from_program).equals(String.valueOf(lit_menupgm))))) {
            /* CONTINUE */
        } else {
            if (!String.valueOf(flg_acctfilter_isvalid).trim().isEmpty()) {
            } else if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
                acctsido.set(String.valueOf(cc_acct_id));
                acctsida.set(String.valueOf(dfhbmfse));
            } else if (!String.valueOf(cdemo_acct_id).trim().isEmpty()) {
                /* RAW: = 0 */
                acctsido.set(String.valueOf("\u0000"));
            } else {
                acctsido.set(String.valueOf(cdemo_acct_id));
                acctsida.set(String.valueOf(dfhbmfse));
            }
            if (!String.valueOf(flg_cardfilter_isvalid).trim().isEmpty()) {
            } else if (!String.valueOf(flg_cardfilter_not_ok).trim().isEmpty()) {
                cardsido.set(String.valueOf(cc_card_num));
                cardsida.set(String.valueOf(dfhbmfse));
            } else if (!String.valueOf(cdemo_card_num).trim().isEmpty()) {
                /* RAW: = 0 */
                cardsido.set(String.valueOf("\u0000"));
            } else {
                cardsido.set(String.valueOf(cdemo_card_num));
                cardsida.set(String.valueOf(dfhbmfse));
            }
        }
        if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
            acctsidc.set(String.valueOf(dfhred));
            acctsidl.set(String.valueOf(-1));
        }
        if (!String.valueOf(flg_cardfilter_not_ok).trim().isEmpty()) {
            cardsidc.set(String.valueOf(dfhred));
            cardsidl.set(String.valueOf(-1));
        }
        if (!String.valueOf(input_ok).trim().isEmpty()) {
            acctsidl.set(String.valueOf(-1));
        }
        /* RAW: 1300 - */
    }

    private void setup_screen_attrs_exit() {
        return;
    }

    private void setup_message() {
        if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cardfilter_not_ok).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(ccard_aid_pfk07).trim().isEmpty()) {
            /* RAW: AND CA-FIRST-PAGE */
            ws_error_msg.set(String.valueOf("NO PREVIOUS PAGES TO DISPLAY"));
        } else if (!String.valueOf(ccard_aid_pfk08).trim().isEmpty()) {
            /* RAW: AND CA-NEXT-PAGE-NOT-EXISTS AND CA-LAST-PAGE-SHOWN */
            ws_error_msg.set(String.valueOf("NO MORE PAGES TO DISPLAY"));
        } else if (!String.valueOf(ccard_aid_pfk08).trim().isEmpty()) {
            /* RAW: AND CA-NEXT-PAGE-NOT-EXISTS */
            ws_inform_rec_actions.set(String.valueOf(cb_true));
            if ((!String.valueOf(ca_last_page_not_shown).trim().isEmpty() && !String.valueOf(ca_next_page_not_exists).trim().isEmpty())) {
                ca_last_page_shown.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
        } else if (!String.valueOf(ca_next_page_exists).trim().isEmpty()) {
            ws_inform_rec_actions.set(String.valueOf(cb_true));
        } else {
            ws_no_info_message.set(String.valueOf(cb_true));
        }
        errmsgo.set(String.valueOf(ws_error_msg));
        if ((!(!String.valueOf(ws_no_info_message).trim().isEmpty()) && !(!String.valueOf(ws_no_records_found).trim().isEmpty()))) {
            infomsgo.set(String.valueOf(ws_info_msg));
            infomsgc.set(String.valueOf(dfhneutr));
        }
        /* RAW: 1400 - */
    }

    private void setup_message_exit() {
        return;
    }

    private void send_screen() {
        /* RAW: EXEC CICS SEND MAP ( LIT-THISMAP */
    }

    private void end_exec_2() {
        /* RAW: 1500 - */
    }

    private void send_screen_exit_2() {
        return;
    }

    private void receive_map() {
        _2100();
        /* RAW: - RECEIVE-SCREEN THRU 2100 - RECEIVE-SCREEN-EXIT */
        _2200();
        /* RAW: - EDIT-INPUTS THRU 2200 - */
    }

    private void edit_inputs_exit() {
        /* RAW: 2000 - */
    }

    private void receive_map_exit() {
        return;
    }

    private void receive_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( LIT-THISMAP */
        cc_acct_id.set(String.valueOf(acctsidi));
        cc_card_num.set(String.valueOf(cardsidi));
        if (ws_edit_select[1 - 1] == null) ws_edit_select[1 - 1] = new CobolString(256);
        ws_edit_select[1 - 1].set(String.valueOf(crdsel1i));
        if (ws_edit_select[2 - 1] == null) ws_edit_select[2 - 1] = new CobolString(256);
        ws_edit_select[2 - 1].set(String.valueOf(crdsel2i));
        if (ws_edit_select[3 - 1] == null) ws_edit_select[3 - 1] = new CobolString(256);
        ws_edit_select[3 - 1].set(String.valueOf(crdsel3i));
        if (ws_edit_select[4 - 1] == null) ws_edit_select[4 - 1] = new CobolString(256);
        ws_edit_select[4 - 1].set(String.valueOf(crdsel4i));
        if (ws_edit_select[5 - 1] == null) ws_edit_select[5 - 1] = new CobolString(256);
        ws_edit_select[5 - 1].set(String.valueOf(crdsel5i));
        if (ws_edit_select[6 - 1] == null) ws_edit_select[6 - 1] = new CobolString(256);
        ws_edit_select[6 - 1].set(String.valueOf(crdsel6i));
        if (ws_edit_select[7 - 1] == null) ws_edit_select[7 - 1] = new CobolString(256);
        ws_edit_select[7 - 1].set(String.valueOf(crdsel7i));
        /* RAW: 2100 - */
    }

    private void receive_screen_exit() {
        return;
    }

    private void edit_inputs() {
        input_ok.set(String.valueOf(cb_true));
        flg_protect_select_rows_no.set(String.valueOf(cb_true));
        _2210();
        /* RAW: - EDIT-ACCOUNT THRU 2210 - EDIT-ACCOUNT-EXIT */
        _2220();
        /* RAW: - EDIT-CARD THRU 2220 - EDIT-CARD-EXIT */
        _2250();
        /* RAW: - EDIT-ARRAY THRU 2250 - */
    }

    private void edit_array_exit() {
        /* RAW: 2200 - */
    }

    private void edit_inputs_exit_2() {
        return;
    }

    private void edit_account() {
        flg_acctfilter_blank.set(String.valueOf(cb_true));
        if (((String.valueOf(cc_acct_id).equals(String.valueOf("\u0000")) || String.valueOf(cc_acct_id).equals(String.valueOf(" "))) || String.valueOf(cc_acct_id_n).equals(String.valueOf(0)))) {
            flg_acctfilter_blank.set(String.valueOf(cb_true));
            cdemo_acct_id.set(String.valueOf(0));
            _2210();
            return;
        }
        if (!CobolIntrinsics.isNumeric(cc_acct_id)) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            flg_protect_select_rows_yes.set(String.valueOf(cb_true));
            ws_error_msg.set(String.valueOf("ACCOUNT FILTER,IF SUPPLIED MUST BE A 11 DIGIT NUMBER"));
            cdemo_acct_id.set(String.valueOf(0));
            _2210();
            return;
        } else {
            cdemo_acct_id.set(String.valueOf(cc_acct_id));
            flg_acctfilter_isvalid.set(String.valueOf(cb_true));
        }
        /* RAW: 2210 - */
    }

    private void edit_account_exit() {
        return;
    }

    private void edit_card() {
        flg_cardfilter_blank.set(String.valueOf(cb_true));
        if (((String.valueOf(cc_card_num).equals(String.valueOf("\u0000")) || String.valueOf(cc_card_num).equals(String.valueOf(" "))) || String.valueOf(cc_card_num_n).equals(String.valueOf(0)))) {
            flg_cardfilter_blank.set(String.valueOf(cb_true));
            cdemo_card_num.set(String.valueOf(0));
            _2220();
            return;
        }
        if (!CobolIntrinsics.isNumeric(cc_card_num)) {
            input_error.set(String.valueOf(cb_true));
            flg_cardfilter_not_ok.set(String.valueOf(cb_true));
            flg_protect_select_rows_yes.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_error_msg_off).trim().isEmpty()) {
                ws_error_msg.set(String.valueOf("CARD ID FILTER,IF SUPPLIED MUST BE A 16 DIGIT NUMBER"));
            }
            cdemo_card_num.set(String.valueOf(0));
            _2220();
            return;
        } else {
            cdemo_card_num.set(String.valueOf(cc_card_num_n));
            flg_cardfilter_isvalid.set(String.valueOf(cb_true));
        }
        /* RAW: 2220 - */
    }

    private void edit_card_exit() {
        return;
    }

    private void edit_array() {
        if (!String.valueOf(input_error).trim().isEmpty()) {
            _2250();
            return;
        }
        /* INSPECT WS-EDIT-SELECT-FLAGS — 2 clause(s) */
        if (i > 1) {
            input_error.set(String.valueOf(cb_true));
            ws_more_than_1_action.set(String.valueOf(cb_true));
            ws_edit_select_error_flags.set(String.valueOf(ws_edit_select_flags));
            /* INSPECT WS-EDIT-SELECT-ERROR-FLAGS — 2 clause(s) */
        }
        i_selected = new BigDecimal(String.valueOf(0).trim()).shortValue();
        for (i = 1; !(i > 7); i += 1) {
            if (!String.valueOf(select_ok[i - 1]).trim().isEmpty()) {
                i_selected = new BigDecimal(String.valueOf(i).trim()).shortValue();
                if (!String.valueOf(ws_more_than_1_action).trim().isEmpty()) {
                    if (ws_row_crdselect_error[i - 1] == null) ws_row_crdselect_error[i - 1] = new CobolString(256);
                    ws_row_crdselect_error[i - 1].set(String.valueOf("1"));
                }
            } else if (!String.valueOf(select_blank[i - 1]).trim().isEmpty()) {
                /* CONTINUE */
            } else {
                input_error.set(String.valueOf(cb_true));
                if (ws_row_crdselect_error[i - 1] == null) ws_row_crdselect_error[i - 1] = new CobolString(256);
                ws_row_crdselect_error[i - 1].set(String.valueOf("1"));
                if (!String.valueOf(ws_error_msg_off).trim().isEmpty()) {
                    ws_invalid_action_code.set(String.valueOf(cb_true));
                }
            }
        }
        /* RAW: 2250 - */
    }

    private void edit_array_exit_2() {
        return;
    }

    private void read_forward() {
        ws_all_rows.set(String.valueOf("\u0000"));
        exec.set(String.valueOf("\u0000"));
        cics.set(String.valueOf("\u0000"));
        startbr.set(String.valueOf("\u0000"));
        if (dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1] == null) dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1] = new CobolString(256);
        dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1].set(String.valueOf("\u0000"));
        if (ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1] == null) ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1] = new CobolString(256);
        ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1].set(String.valueOf("\u0000"));
        if (keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1] == null) keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1] = new CobolString(256);
        keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1].set(String.valueOf("\u0000"));
        gteq.set(String.valueOf("\u0000"));
        if (resp[ws_resp_cd - 1] == null) resp[ws_resp_cd - 1] = new CobolString(256);
        resp[ws_resp_cd - 1].set(String.valueOf("\u0000"));
        if (resp2[ws_reas_cd - 1] == null) resp2[ws_reas_cd - 1] = new CobolString(256);
        resp2[ws_reas_cd - 1].set(String.valueOf("\u0000"));
        end_exec.set(String.valueOf("\u0000"));
        ws_scrn_counter = new BigDecimal(String.valueOf(0).trim()).shortValue();
        ca_next_page_exists.set(String.valueOf(cb_true));
        more_records_to_read.set(String.valueOf(cb_true));
        while (!(!String.valueOf(read_loop_exit).trim().isEmpty())) {
            /* RAW: EXEC CICS READNEXT DATASET ( LIT-CARD-FILE */
            if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(duprec).trim()) - 1]))) {
                _9500();
                /* RAW: - FILTER-RECORDS THRU 9500 - FILTER-RECORDS-EXIT */
                if (!String.valueOf(ws_donot_exclude_this_record).trim().isEmpty()) {
                    ws_scrn_counter = new BigDecimal(String.valueOf(ws_scrn_counter + 1).trim()).shortValue();
                    if (ws_row_card_num[ws_scrn_counter - 1] == null) ws_row_card_num[ws_scrn_counter - 1] = new CobolString(256);
                    ws_row_card_num[ws_scrn_counter - 1].set(String.valueOf(card_num));
                    if (ws_row_acctno[ws_scrn_counter - 1] == null) ws_row_acctno[ws_scrn_counter - 1] = new CobolString(256);
                    ws_row_acctno[ws_scrn_counter - 1].set(String.valueOf(card_acct_id));
                    if (ws_row_card_status[ws_scrn_counter - 1] == null) ws_row_card_status[ws_scrn_counter - 1] = new CobolString(256);
                    ws_row_card_status[ws_scrn_counter - 1].set(String.valueOf(card_active_status));
                    if (ws_scrn_counter == 1) {
                        ws_ca_first_card_acct_id.set(String.valueOf(card_acct_id));
                        ws_ca_first_card_num.set(String.valueOf(card_num));
                        if (String.valueOf(ws_ca_screen_num).equals(String.valueOf(0))) {
                            ws_ca_screen_num.set(new BigDecimal(String.valueOf(ws_ca_screen_num).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                            /* CONTINUE */
                        }
                    } else {
                        /* CONTINUE */
                    }
                } else {
                    /* CONTINUE */
                }
                if (ws_scrn_counter == ws_max_screen_lines) {
                    read_loop_exit.set(String.valueOf(cb_true));
                    ws_ca_last_card_acct_id.set(String.valueOf(card_acct_id));
                    ws_ca_last_card_num.set(String.valueOf(card_num));
                    exec.set(String.valueOf(card_num));
                    cics.set(String.valueOf(card_num));
                    readnext.set(String.valueOf(card_num));
                    if (dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1] == null) dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1] = new CobolString(256);
                    dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1].set(String.valueOf(card_num));
                    if (into[Integer.parseInt(String.valueOf(card_record).trim()) - 1] == null) into[Integer.parseInt(String.valueOf(card_record).trim()) - 1] = new CobolString(256);
                    into[Integer.parseInt(String.valueOf(card_record).trim()) - 1].set(String.valueOf(card_num));
                    if (length[CobolIntrinsics.length(card_record) - 1] == null) length[CobolIntrinsics.length(card_record) - 1] = new CobolString(256);
                    length[CobolIntrinsics.length(card_record) - 1].set(String.valueOf(card_num));
                    if (ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1] == null) ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1] = new CobolString(256);
                    ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1].set(String.valueOf(card_num));
                    if (keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1] == null) keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1] = new CobolString(256);
                    keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1].set(String.valueOf(card_num));
                    if (resp[ws_resp_cd - 1] == null) resp[ws_resp_cd - 1] = new CobolString(256);
                    resp[ws_resp_cd - 1].set(String.valueOf(card_num));
                    if (resp2[ws_reas_cd - 1] == null) resp2[ws_reas_cd - 1] = new CobolString(256);
                    resp2[ws_reas_cd - 1].set(String.valueOf(card_num));
                    end_exec.set(String.valueOf(card_num));
                    if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
                    } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(duprec).trim()) - 1]))) {
                        ca_next_page_exists.set(String.valueOf(cb_true));
                        ws_ca_last_card_acct_id.set(String.valueOf(card_acct_id));
                        ws_ca_last_card_num.set(String.valueOf(card_num));
                    } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(endfile).trim()) - 1]))) {
                        ca_next_page_not_exists.set(String.valueOf(cb_true));
                        if (!String.valueOf(ws_error_msg_off).trim().isEmpty()) {
                            ws_error_msg.set(String.valueOf("NO MORE RECORDS TO SHOW"));
                        }
                    } else {
                        read_loop_exit.set(String.valueOf(cb_true));
                        error_opname.set(String.valueOf("READ"));
                        error_file.set(String.valueOf(lit_card_file));
                        error_resp.set(String.valueOf(ws_resp_cd));
                        error_resp2.set(String.valueOf(ws_reas_cd));
                        ws_error_msg.set(String.valueOf(ws_file_error_message));
                    }
                }
            } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(endfile).trim()) - 1]))) {
                read_loop_exit.set(String.valueOf(cb_true));
                ca_next_page_not_exists.set(String.valueOf(cb_true));
                ws_ca_last_card_acct_id.set(String.valueOf(card_acct_id));
                ws_ca_last_card_num.set(String.valueOf(card_num));
                if (!String.valueOf(ws_error_msg_off).trim().isEmpty()) {
                    ws_error_msg.set(String.valueOf("NO MORE RECORDS TO SHOW"));
                }
                if ((String.valueOf(ws_ca_screen_num).equals(String.valueOf(1)) && ws_scrn_counter == 0)) {
                    ws_no_records_found.set(String.valueOf(cb_true));
                }
            } else {
                read_loop_exit.set(String.valueOf(cb_true));
                error_opname.set(String.valueOf("READ"));
                error_file.set(String.valueOf(lit_card_file));
                error_resp.set(String.valueOf(ws_resp_cd));
                error_resp2.set(String.valueOf(ws_reas_cd));
                ws_error_msg.set(String.valueOf(ws_file_error_message));
            }
        }
        /* RAW: EXEC CICS ENDBR FILE ( LIT-CARD-FILE */
    }

    private void end_exec_3() {
        /* RAW: 9000 - */
    }

    private void read_forward_exit() {
        return;
    }

    private void read_backwards() {
        ws_all_rows.set(String.valueOf("\u0000"));
        ws_ca_last_cardkey.set(String.valueOf(ws_ca_first_cardkey));
        exec.set(String.valueOf(ws_ca_first_cardkey));
        cics.set(String.valueOf(ws_ca_first_cardkey));
        startbr.set(String.valueOf(ws_ca_first_cardkey));
        if (dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1] == null) dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1] = new CobolString(256);
        dataset[Integer.parseInt(String.valueOf(lit_card_file).trim()) - 1].set(String.valueOf(ws_ca_first_cardkey));
        if (ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1] == null) ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1] = new CobolString(256);
        ridfld[Integer.parseInt(String.valueOf(ws_card_rid_cardnum).trim()) - 1].set(String.valueOf(ws_ca_first_cardkey));
        if (keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1] == null) keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1] = new CobolString(256);
        keylength[CobolIntrinsics.length(ws_card_rid_cardnum) - 1].set(String.valueOf(ws_ca_first_cardkey));
        gteq.set(String.valueOf(ws_ca_first_cardkey));
        if (resp[ws_resp_cd - 1] == null) resp[ws_resp_cd - 1] = new CobolString(256);
        resp[ws_resp_cd - 1].set(String.valueOf(ws_ca_first_cardkey));
        if (resp2[ws_reas_cd - 1] == null) resp2[ws_reas_cd - 1] = new CobolString(256);
        resp2[ws_reas_cd - 1].set(String.valueOf(ws_ca_first_cardkey));
        end_exec.set(String.valueOf(ws_ca_first_cardkey));
        ws_scrn_counter = new BigDecimal(String.valueOf((ws_max_screen_lines + 1)).trim()).shortValue();
        ca_next_page_exists.set(String.valueOf(cb_true));
        more_records_to_read.set(String.valueOf(cb_true));
        /* RAW: EXEC CICS READPREV DATASET ( LIT-CARD-FILE */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(duprec).trim()) - 1]))) {
            ws_scrn_counter = new BigDecimal(String.valueOf(ws_scrn_counter - 1).trim()).shortValue();
            when.set(new BigDecimal(String.valueOf(when).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            other.set(new BigDecimal(String.valueOf(other).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            read_loop_exit.set(String.valueOf(cb_true));
            error_opname.set(String.valueOf("READ"));
            error_file.set(String.valueOf(lit_card_file));
            error_resp.set(String.valueOf(ws_resp_cd));
            error_resp2.set(String.valueOf(ws_reas_cd));
            ws_error_msg.set(String.valueOf(ws_file_error_message));
            _9100();
            return;
        }
        while (!(!String.valueOf(read_loop_exit).trim().isEmpty())) {
            /* RAW: EXEC CICS READPREV DATASET ( LIT-CARD-FILE */
            if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(duprec).trim()) - 1]))) {
                _9500();
                /* RAW: - FILTER-RECORDS THRU 9500 - FILTER-RECORDS-EXIT */
                if (!String.valueOf(ws_donot_exclude_this_record).trim().isEmpty()) {
                    if (ws_row_card_num[ws_scrn_counter - 1] == null) ws_row_card_num[ws_scrn_counter - 1] = new CobolString(256);
                    ws_row_card_num[ws_scrn_counter - 1].set(String.valueOf(card_num));
                    if (ws_row_acctno[ws_scrn_counter - 1] == null) ws_row_acctno[ws_scrn_counter - 1] = new CobolString(256);
                    ws_row_acctno[ws_scrn_counter - 1].set(String.valueOf(card_acct_id));
                    if (ws_row_card_status[ws_scrn_counter - 1] == null) ws_row_card_status[ws_scrn_counter - 1] = new CobolString(256);
                    ws_row_card_status[ws_scrn_counter - 1].set(String.valueOf(card_active_status));
                    ws_scrn_counter = new BigDecimal(String.valueOf(ws_scrn_counter - 1).trim()).shortValue();
                    if (ws_scrn_counter == 0) {
                        read_loop_exit.set(String.valueOf(cb_true));
                        ws_ca_first_card_acct_id.set(String.valueOf(card_acct_id));
                        ws_ca_first_card_num.set(String.valueOf(card_num));
                    } else {
                        /* CONTINUE */
                    }
                } else {
                    /* CONTINUE */
                }
            } else {
                read_loop_exit.set(String.valueOf(cb_true));
                error_opname.set(String.valueOf("READ"));
                error_file.set(String.valueOf(lit_card_file));
                error_resp.set(String.valueOf(ws_resp_cd));
                error_resp2.set(String.valueOf(ws_reas_cd));
                ws_error_msg.set(String.valueOf(ws_file_error_message));
            }
        }
        /* RAW: 9100 - */
    }

    private void read_backwards_exit() {
        /* RAW: EXEC CICS ENDBR FILE ( LIT-CARD-FILE */
        return;
    }

    private void filter_records() {
        ws_donot_exclude_this_record.set(String.valueOf(cb_true));
        if (!String.valueOf(flg_acctfilter_isvalid).trim().isEmpty()) {
            if (String.valueOf(card_acct_id).equals(String.valueOf(cc_acct_id))) {
                /* CONTINUE */
            } else {
                ws_exclude_this_record.set(String.valueOf(cb_true));
                _9500();
                return;
            }
        } else {
            /* CONTINUE */
        }
        if (!String.valueOf(flg_cardfilter_isvalid).trim().isEmpty()) {
            if (String.valueOf(card_num).equals(String.valueOf(cc_card_num_n))) {
                /* CONTINUE */
            } else {
                ws_exclude_this_record.set(String.valueOf(cb_true));
                _9500();
                return;
            }
        } else {
            /* CONTINUE */
        }
        /* RAW: 9500 - */
    }

    private void filter_records_exit() {
        return;
    }

    private void send_plain_text() {
        /* RAW: EXEC CICS SEND TEXT FROM ( */
        /* RETURN END-EXEC */
    }

    private void send_plain_text_exit() {
        return;
    }

    private void send_long_text() {
        /* RAW: EXEC CICS SEND TEXT FROM ( */
        /* RETURN END-EXEC */
    }

    private void send_long_text_exit() {
        return;
    }

    private void yyyy_store_pfkey() { /* stub — external/COPY */ }

    private void yyyy_store_pfkey_exit() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _1250() { /* stub — external/COPY */ }

    private void _1300() { /* stub — external/COPY */ }

    private void _1400() { /* stub — external/COPY */ }

    private void _1500() { /* stub — external/COPY */ }

    private void _2100() { /* stub — external/COPY */ }

    private void _2200() { /* stub — external/COPY */ }

    private void _2210() { /* stub — external/COPY */ }

    private void _2220() { /* stub — external/COPY */ }

    private void _2250() { /* stub — external/COPY */ }

    private void _9500() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cocrdlic().run();
    }
}
