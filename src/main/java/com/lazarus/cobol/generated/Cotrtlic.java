package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cotrtlic extends CobolProgram {
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
    private CobolString ws_constants = new CobolString(1); // Group: WS-CONSTANTS
    private CobolString lit_thispgm = new CobolString(8);
    private CobolString lit_thistranid = new CobolString(4);
    private CobolString lit_thismapset = new CobolString(7);
    private CobolString lit_thismap = new CobolString(7);
    private CobolString lit_adminpgm = new CobolString(8);
    private CobolString lit_admintranid = new CobolString(4);
    private CobolString lit_adminmapset = new CobolString(7);
    private CobolString lit_addtpgm = new CobolString(8);
    private CobolString lit_addttranid = new CobolString(4);
    private CobolString lit_addtmapset = new CobolString(7);
    private CobolString lit_addtmap = new CobolString(7);
    private CobolString lit_dsntiac = new CobolString(7);
    private CobolString lit_asterisk = new CobolString(7);
    private CobolString lit_trantype_table = new CobolString(30);
    private CobolString lit_delete_flag = new CobolString(1);
    private CobolString lit_update_flag = new CobolString(1);
    private short ws_max_screen_lines = (short) 0;
    private CobolString lit_all_alphanum_from_x = new CobolString(1); // Group: LIT-ALL-ALPHANUM-FROM-X
    private CobolString lit_all_alpha_from_x = new CobolString(1); // Group: LIT-ALL-ALPHA-FROM-X
    private CobolString lit_upper = new CobolString(26);
    private CobolString lit_lower = new CobolString(26);
    private CobolString lit_numbers = new CobolString(10);
    private CobolString lit_all_alpha_from = new CobolString(52);
    private CobolString lit_all_alphanum_from = new CobolString(62);
    private CobolString lit_all_num_from = new CobolString(10);
    private CobolString lit_alpha_spaces_to = new CobolString(52);
    private CobolString lit_alphanum_spaces_to = new CobolString(62);
    private CobolString lit_num_spaces_to = new CobolString(10);
    private CobolString ws_misc_storage = new CobolString(1); // Group: WS-MISC-STORAGE
    private CobolString ws_cics_processng_vars = new CobolString(1); // Group: WS-CICS-PROCESSNG-VARS
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private CobolString ws_tranid = new CobolString(4);
    private CobolString ws_input_flag = new CobolString(1);
    private CobolString ws_edit_type_flag = new CobolString(1);
    private CobolString ws_edit_desc_flag = new CobolString(1);
    private CobolString ws_typefilter_changed = new CobolString(1);
    private CobolString ws_descfilter_changed = new CobolString(1);
    private CobolString[] ws_row_records_changed = new CobolString[7];
    private CobolString ws_delete_status = new CobolString(1);
    private CobolString ws_update_status = new CobolString(1);
    private CobolString ws_row_selection_changed = new CobolString(1);
    private CobolString ws_bad_selection_action = new CobolString(1);
    private CobolString ws_array_description_flgs = new CobolString(1);
    private CobolString ws_datachanged_flag = new CobolString(1);
    private CobolString ws_generic_edits = new CobolString(1); // Group: WS-GENERIC-EDITS
    private CobolString ws_edit_variable_name = new CobolString(25);
    private CobolString ws_edit_alphanum_only = new CobolString(256);
    private BigDecimal ws_edit_alphanum_length = BigDecimal.ZERO;
    private CobolString ws_edit_alphanum_only_flags = new CobolString(1);
    private CobolString ws_other_edit_vars = new CobolString(1); // Group: WS-OTHER-EDIT-VARS
    private BigDecimal ws_records_count = BigDecimal.ZERO;
    private CobolString ws_screen_data_in = new CobolString(1); // Group: WS-SCREEN-DATA-IN
    private CobolString ws_all_rows_in = new CobolString(364);
    private CobolString[] ws_screen_rows_in = new CobolString[7]; // Group: WS-SCREEN-ROWS-IN
    private CobolString[] ws_each_row_in = new CobolString[7]; // Group: WS-EACH-ROW-IN
    private CobolString[] ws_each_ttyp_in = new CobolString[7]; // Group: WS-EACH-TTYP-IN
    private CobolString[] ws_row_tr_code_in = new CobolString[7];
    private CobolString[] ws_row_tr_desc_in = new CobolString[7];
    private BigDecimal ws_edit_select_counter = BigDecimal.ZERO;
    private CobolString ws_edit_select_flags = new CobolString(7);
    private CobolString[] ws_edit_select = new CobolString[7];
    private CobolString ws_edit_select_error_flags = new CobolString(7);
    private CobolString[] ws_edit_select_errors = new CobolString[7]; // Group: WS-EDIT-SELECT-ERRORS
    private CobolString[] ws_row_trtselect_error = new CobolString[7];
    private CobolString ws_subscript_vars = new CobolString(1); // Group: WS-SUBSCRIPT-VARS
    private short i = (short) 0;
    private short i_selected = (short) 0;
    private CobolString ws_actions_selected = new CobolString(1); // Group: WS-ACTIONS-SELECTED
    private BigDecimal ws_actions_requested = BigDecimal.ZERO;
    private BigDecimal ws_deletes_requested = BigDecimal.ZERO;
    private BigDecimal ws_updates_requested = BigDecimal.ZERO;
    private BigDecimal ws_no_actions_selected = BigDecimal.ZERO;
    private BigDecimal ws_valid_actions_selected = BigDecimal.ZERO;
    private CobolString cics_output_edit_vars = new CobolString(1); // Group: CICS-OUTPUT-EDIT-VARS
    private CobolString tran_type_cd_x = new CobolString(2);
    private int tran_type_cd_n = 0;
    private CobolString flg_protect_select_rows = new CobolString(1);
    private CobolString ws_long_msg = new CobolString(800);
    private CobolString ws_info_msg = new CobolString(45);
    private CobolString ws_return_msg = new CobolString(75);
    private CobolString ws_pfk_flag = new CobolString(1);
    private CobolString ws_string_format_vars = new CobolString(1); // Group: WS-STRING-FORMAT-VARS
    private int ws_string_mid = 0;
    private int ws_string_len = 0;
    private CobolString ws_string_out = new CobolString(45);
    private CobolString ws_data_filters = new CobolString(1); // Group: WS-DATA-FILTERS
    private CobolString ws_start_key = new CobolString(2);
    private CobolString ws_type_cd_filter = new CobolString(2);
    private CobolString ws_type_desc_filter = new CobolString(52);
    private CobolString ws_type_cd_delete_filter = new CobolString(1); // Group: WS-TYPE-CD-DELETE-FILTER
    private CobolString ws_type_cd_delete_filter_x = new CobolString(1); // Group: WS-TYPE-CD-DELETE-FILTER-X
    private CobolString[] ws_type_cd_delete_keys = new CobolString[7]; // Group: WS-TYPE-CD-DELETE-KEYS
    private CobolString[] ws_type_cd_delete_key = new CobolString[7];
    private CobolString ws_dummy = new CobolString(1); // Group: WS-DUMMY

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile from = new CobolFile("FROM", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile c_tr_type_forward = new CobolFile("C-TR-TYPE-FORWARD", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile c_tr_type_backward = new CobolFile("C-TR-TYPE-BACKWARD", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString cc_work_area = new CobolString(256); // fallback
    private CobolString ws_commarea = new CobolString(256); // fallback
    private CobolString ws_return_msg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString ws_this_progcommarea = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString cdemo_usrtyp_admin = new CobolString(256); // fallback
    private CobolString cdemo_pgm_enter = new CobolString(256); // fallback
    private CobolString cdemo_last_map = new CobolString(256); // fallback
    private CobolString cdemo_last_mapset = new CobolString(256); // fallback
    private CobolString ca_first_page = new CobolString(256); // fallback
    private CobolString ca_last_page_not_shown = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk03 = new CobolString(256); // fallback
    private CobolString ccard_aid_enter = new CobolString(256); // fallback
    private CobolString pfk_invalid = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk02 = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk07 = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk08 = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk10 = new CobolString(256); // fallback
    private CobolString ca_delete_requested = new CobolString(256); // fallback
    private CobolString ca_update_requested = new CobolString(256); // fallback
    private CobolString pfk_valid = new CobolString(256); // fallback
    private CobolString cdemo_to_tranid = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString syncpoint = new CobolString(256); // fallback
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString cdemo_usrtyp_user = new CobolString(256); // fallback
    private CobolString ccard_next_mapset = new CobolString(256); // fallback
    private CobolString ccard_next_map = new CobolString(256); // fallback
    private CobolString ws_exit_message = new CobolString(256); // fallback
    private CobolString flg_typefilter_changed_no = new CobolString(256); // fallback
    private CobolString flg_descfilter_changed_no = new CobolString(256); // fallback
    private CobolString flg_row_selection_changed_no = new CobolString(256); // fallback
    private CobolString ws_db2_error = new CobolString(256); // fallback
    private CobolString ws_ca_first_tr_code = new CobolString(256); // fallback
    private CobolString input_error = new CobolString(256); // fallback
    private CobolString ccard_error_msg = new CobolString(256); // fallback
    private CobolString ccard_next_prog = new CobolString(256); // fallback
    private CobolString flg_typefilter_not_ok = new CobolString(256); // fallback
    private CobolString flg_descfilter_not_ok = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString ws_ca_last_tr_code = new CobolString(256); // fallback
    private CobolString ws_ca_screen_num = new CobolString(256); // fallback
    private CobolString ca_delete_succeeded = new CobolString(256); // fallback
    private CobolString flg_deleted_yes = new CobolString(256); // fallback
    private CobolString flg_deleted_no = new CobolString(256); // fallback
    private CobolString ca_update_succeeded = new CobolString(256); // fallback
    private CobolString flg_update_completed = new CobolString(256); // fallback
    private CobolString trtypei = new CobolString(256); // fallback
    private CobolString ws_in_type_cd = new CobolString(256); // fallback
    private CobolString trdesci = new CobolString(256); // fallback
    private CobolString ws_in_type_desc = new CobolString(256); // fallback
    private CobolString[] trtseli = new CobolString[100]; // fallback array
    private CobolString[] trttypi = new CobolString[100]; // fallback array
    private CobolString[] trtypdi = new CobolString[100]; // fallback array
    private CobolString input_ok = new CobolString(256); // fallback
    private CobolString flg_protect_select_rows_no = new CobolString(256); // fallback
    private CobolString flg_typefilter_changed_yes = new CobolString(256); // fallback
    private CobolString flg_descfilter_changed_yes = new CobolString(256); // fallback
    private CobolString flg_bad_actions_selected_no = new CobolString(256); // fallback
    private CobolString flg_bad_actions_selected_yes = new CobolString(256); // fallback
    private CobolString ws_mesg_invalid_action_code = new CobolString(256); // fallback
    private CobolString[] select_ok = new CobolString[100]; // fallback array
    private CobolString ws_morethan1action = new CobolString(256); // fallback
    private CobolString update_requested_on = new CobolString(256); // fallback
    private CobolString[] select_blank = new CobolString[100]; // fallback array
    private CobolString ws_ca_row_selected = new CobolString(256); // fallback
    private CobolString flg_row_selection_changed_yes = new CobolString(256); // fallback
    private CobolString ws_mesg_more_than_1_action = new CobolString(256); // fallback
    private CobolString no_changes_found = new CobolString(256); // fallback
    private CobolString[] ws_ca_row_tr_desc_out = new CobolString[100]; // fallback array
    private CobolString ws_mesg_no_changes_detected = new CobolString(256); // fallback
    private CobolString changes_have_occurred = new CobolString(256); // fallback
    private CobolString flg_row_description_not_ok = new CobolString(256); // fallback
    private CobolString flg_typefilter_blank = new CobolString(256); // fallback
    private CobolString flg_protect_select_rows_yes = new CobolString(256); // fallback
    private CobolString flg_typefilter_isvalid = new CobolString(256); // fallback
    private CobolString ws_ca_type_cd = new CobolString(256); // fallback
    private CobolString ws_ca_paging_variables = new CobolString(256); // fallback
    private CobolString flg_descfilter_blank = new CobolString(256); // fallback
    private CobolString flg_descfilter_isvalid = new CobolString(256); // fallback
    private CobolString ws_ca_type_desc = new CobolString(256); // fallback
    private CobolString flg_alphnanum_not_ok = new CobolString(256); // fallback
    private CobolString flg_alphnanum_blank = new CobolString(256); // fallback
    private CobolString flg_alphnanum_isvalid = new CobolString(256); // fallback
    private CobolString ctrtliao = new CobolString(256); // fallback
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
    private CobolString dfhbmprf = new CobolString(256); // fallback
    private CobolString[] trtypda = new CobolString[100]; // fallback array
    private CobolString[] ws_ca_each_row_out = new CobolString[100]; // fallback array
    private CobolString dfhbmpro = new CobolString(256); // fallback
    private CobolString[] trtsela = new CobolString[100]; // fallback array
    private CobolString dfhred = new CobolString(256); // fallback
    private CobolString[] trtselc = new CobolString[100]; // fallback array
    private CobolString[] trtsell = new CobolString[100]; // fallback array
    private CobolString delete_requested_on = new CobolString(256); // fallback
    private CobolString ws_only_1_valid_action = new CobolString(256); // fallback
    private CobolString dfhneutr = new CobolString(256); // fallback
    private CobolString[] trttypc = new CobolString[100]; // fallback array
    private CobolString[] trtypdc = new CobolString[100]; // fallback array
    private CobolString[] trtypdl = new CobolString[100]; // fallback array
    private CobolString dfhbmfse = new CobolString(256); // fallback
    private CobolString flg_row_description_isvalid = new CobolString(256); // fallback
    private CobolString[] ws_ca_row_tr_code_out = new CobolString[100]; // fallback array
    private CobolString[] trttypo = new CobolString[100]; // fallback array
    private CobolString[] trtypdo = new CobolString[100]; // fallback array
    private CobolString flg_row_description_blank = new CobolString(256); // fallback
    private CobolString[] trtselo = new CobolString[100]; // fallback array
    private CobolString trtypeo = new CobolString(256); // fallback
    private CobolString trtypea = new CobolString(256); // fallback
    private CobolString dfhbmasf = new CobolString(256); // fallback
    private CobolString dfhblue = new CobolString(256); // fallback
    private CobolString trtypec = new CobolString(256); // fallback
    private CobolString trdesca = new CobolString(256); // fallback
    private CobolString trdesco = new CobolString(256); // fallback
    private CobolString trdescc = new CobolString(256); // fallback
    private CobolString trtypel = new CobolString(256); // fallback
    private CobolString trdescl = new CobolString(256); // fallback
    private CobolString ws_inform_delete_success = new CobolString(256); // fallback
    private CobolString ws_inform_update_success = new CobolString(256); // fallback
    private CobolString ws_inform_delete = new CobolString(256); // fallback
    private CobolString ws_inform_update = new CobolString(256); // fallback
    private CobolString ws_inform_rec_actions = new CobolString(256); // fallback
    private CobolString ca_next_page_not_exists = new CobolString(256); // fallback
    private CobolString ca_last_page_shown = new CobolString(256); // fallback
    private CobolString ca_next_page_exists = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString ws_mesg_no_records_found = new CobolString(256); // fallback
    private CobolString ws_ca_all_rows_out = new CobolString(256); // fallback
    private CobolString ws_row_number = new CobolString(256); // fallback
    private CobolString more_records_to_read = new CobolString(256); // fallback
    private CobolString read_loop_exit = new CobolString(256); // fallback
    private CobolString dcltransaction_type = new CobolString(256); // fallback
    private CobolString sql = new CobolString(256); // fallback
    private CobolString fetch = new CobolString(256); // fallback
    private CobolString into = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString dcl_tr_type = new CobolString(256); // fallback
    private CobolString dcl_tr_description = new CobolString(256); // fallback
    private CobolString sqlcode = new CobolString(256); // fallback
    private CobolString ws_disp_sqlcode = new CobolString(256); // fallback
    private CobolString ws_db2_current_action = new CobolString(256); // fallback
    private CobolString dcl_tr_description_text = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString ws_mesg_no_more_records = new CobolString(256); // fallback
    private CobolString ws_ca_first_ttypekey = new CobolString(256); // fallback
    private CobolString ws_ca_last_ttypekey = new CobolString(256); // fallback
    private CobolString dcl_tr_description_len = new CobolString(256); // fallback
    private CobolString tr_description = new CobolString(256); // fallback
    private CobolString move = new CobolString(256); // fallback
    private CobolString where = new CobolString(256); // fallback
    private CobolString tr_type = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void para_main_2() {
        cc_work_area.set("");
        ws_misc_storage.set("");
        ws_commarea.set("");
        ws_tranid.set(String.valueOf(lit_thistranid));
        ws_return_msg_off.set(String.valueOf(cb_true));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            carddemo_commarea.set("");
            ws_this_progcommarea.set("");
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_admin.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            ca_first_page.set(String.valueOf(cb_true));
            ca_last_page_not_shown.set(String.valueOf(cb_true));
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, CobolIntrinsics.length(carddemo_commarea))));
            ws_this_progcommarea.set(String.valueOf(CobolString.refMod(dfhcommarea, (CobolIntrinsics.length(carddemo_commarea) + 1), CobolIntrinsics.length(ws_this_progcommarea))));
        }
        yyyy_store_pfkey(); // THRU YYYY-STORE-PFKEY-EXIT
        if (((!String.valueOf(cdemo_pgm_enter).trim().isEmpty() && !String.valueOf(cdemo_from_program).equals(String.valueOf(lit_thispgm))) || (!String.valueOf(ccard_aid_pfk03).trim().isEmpty() && String.valueOf(cdemo_from_tranid).equals(String.valueOf(lit_addttranid))))) {
            ws_this_progcommarea.set("");
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            ccard_aid_enter.set(String.valueOf(cb_true));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            ca_first_page.set(String.valueOf(cb_true));
            ca_last_page_not_shown.set(String.valueOf(cb_true));
        }
        if ((Integer.parseInt(String.valueOf(eibcalen).trim()) > 0 && String.valueOf(cdemo_from_program).equals(String.valueOf(lit_thispgm)))) {
            _1000();
            /* RAW: - RECEIVE-MAP THRU 1000 - RECEIVE-MAP-EXIT */
        }
        pfk_invalid.set(String.valueOf(cb_true));
        if (((((((!String.valueOf(ccard_aid_enter).trim().isEmpty() || !String.valueOf(ccard_aid_pfk02).trim().isEmpty()) || !String.valueOf(ccard_aid_pfk03).trim().isEmpty()) || !String.valueOf(ccard_aid_pfk07).trim().isEmpty()) || !String.valueOf(ccard_aid_pfk08).trim().isEmpty()) || (!String.valueOf(ccard_aid_pfk10).trim().isEmpty() && !String.valueOf(ca_delete_requested).trim().isEmpty())) || (!String.valueOf(ccard_aid_pfk10).trim().isEmpty() && !String.valueOf(ca_update_requested).trim().isEmpty()))) {
            pfk_valid.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(pfk_invalid).trim().isEmpty()) {
            ccard_aid_enter.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(ccard_aid_pfk03).trim().isEmpty()) {
            if (((String.valueOf(cdemo_from_tranid).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_tranid).equals(String.valueOf(" "))) || String.valueOf(cdemo_from_tranid).equals(String.valueOf(lit_thistranid)))) {
                cdemo_to_tranid.set(String.valueOf(lit_admintranid));
            } else {
                cdemo_to_tranid.set(String.valueOf(cdemo_from_tranid));
            }
            if (((String.valueOf(cdemo_from_program).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_program).equals(String.valueOf(" "))) || String.valueOf(cdemo_from_program).equals(String.valueOf(lit_thispgm)))) {
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
        }
        if ((!String.valueOf(ccard_aid_pfk02).trim().isEmpty() && String.valueOf(cdemo_from_program).equals(String.valueOf(lit_thispgm)))) {
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            cdemo_to_program.set(String.valueOf(lit_addtpgm));
            ccard_next_mapset.set(String.valueOf(lit_addtmapset));
            ccard_next_map.set(String.valueOf(lit_addtmap));
            ws_exit_message.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            /* RAW: EXEC CICS XCTL PROGRAM ( LIT-ADDTPGM */
        }
        if (!String.valueOf(ccard_aid_pfk08).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            ca_last_page_not_shown.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(ccard_aid_pfk10).trim().isEmpty()) {
            if (((((!String.valueOf(ca_delete_requested).trim().isEmpty() || !String.valueOf(ca_update_requested).trim().isEmpty()) && !String.valueOf(flg_typefilter_changed_no).trim().isEmpty()) && !String.valueOf(flg_descfilter_changed_no).trim().isEmpty()) && !String.valueOf(flg_row_selection_changed_no).trim().isEmpty())) {
                /* CONTINUE */
            } else {
                ccard_aid_enter.set(String.valueOf(cb_true));
            }
        } else {
            /* CONTINUE */
        }
        _9998();
        /* RAW: - PRIMING-QUERY THRU 9998 - PRIMING-QUERY-EXIT */
        if (!String.valueOf(ws_db2_error).trim().isEmpty()) {
            send_long_text(); // THRU SEND-LONG-TEXT-EXIT
            send_long_text_exit();
            common_return();
            return;
        }
        if (!String.valueOf(input_error).trim().isEmpty()) {
            ccard_error_msg.set(String.valueOf(ws_return_msg));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            ccard_next_prog.set(String.valueOf(lit_thispgm));
            ccard_next_mapset.set(String.valueOf(lit_thismapset));
            ccard_next_map.set(String.valueOf(lit_thismap));
            ws_start_key.set(String.valueOf(ws_ca_first_tr_code));
            if ((!(!String.valueOf(flg_typefilter_not_ok).trim().isEmpty()) && !(!String.valueOf(flg_descfilter_not_ok).trim().isEmpty()))) {
                _8000();
                /* RAW: - READ-FORWARD THRU 8000 - READ-FORWARD-EXIT */
            }
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk07).trim().isEmpty()) {
            /* RAW: AND CA-FIRST-PAGE */
        } else if (!String.valueOf(ccard_aid_pfk07).trim().isEmpty()) {
            /* RAW: AND CA-FIRST-PAGE */
            ws_start_key.set(String.valueOf(ws_ca_first_tr_code));
            _8000();
            /* RAW: - READ-FORWARD THRU 8000 - READ-FORWARD-EXIT */
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk03).trim().isEmpty()) {
        } else if (!String.valueOf(cdemo_pgm_reenter).trim().isEmpty()) {
            /* RAW: AND CDEMO-FROM-PROGRAM NOT EQUAL LIT-THISPGM */
            carddemo_commarea.set("");
            ws_this_progcommarea.set("");
            ws_misc_storage.set("");
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_usrtyp_admin.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            ca_first_page.set(String.valueOf(cb_true));
            ca_last_page_not_shown.set(String.valueOf(cb_true));
            ws_start_key.set(String.valueOf(ws_ca_first_tr_code));
            _8000();
            /* RAW: - READ-FORWARD THRU 8000 - READ-FORWARD-EXIT */
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk08).trim().isEmpty()) {
            /* RAW: AND CA-NEXT-PAGE-EXISTS */
            ws_start_key.set(String.valueOf(ws_ca_last_tr_code));
            ws_ca_screen_num.set(new BigDecimal(String.valueOf(ws_ca_screen_num).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            _8000();
            /* RAW: - READ-FORWARD THRU 8000 - READ-FORWARD-EXIT */
            ws_edit_select_flags.set("");
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk07).trim().isEmpty()) {
            /* RAW: AND NOT CA-FIRST-PAGE */
            ws_start_key.set(String.valueOf(ws_ca_first_tr_code));
            ws_ca_screen_num.set(new BigDecimal(String.valueOf(ws_ca_screen_num).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            _8100();
            /* RAW: - READ-BACKWARDS THRU 8100 - READ-BACKWARDS-EXIT */
            ws_edit_select_flags.set("");
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_enter).trim().isEmpty()) {
            /* RAW: AND WS-DELETES-REQUESTED > 0 AND CDEMO-FROM-PROGRAM */
            ws_start_key.set(String.valueOf(ws_ca_first_tr_code));
            if ((!(!String.valueOf(flg_typefilter_not_ok).trim().isEmpty()) && !(!String.valueOf(flg_descfilter_not_ok).trim().isEmpty()))) {
                _8000();
                /* RAW: - READ-FORWARD THRU 8000 - READ-FORWARD-EXIT */
            }
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk10).trim().isEmpty()) {
            /* RAW: AND WS-DELETES-REQUESTED > 0 AND CDEMO-FROM-PROGRAM */
            _9300();
            /* RAW: - DELETE-RECORD THRU 9300 - DELETE-RECORD-EXIT */
            if (!String.valueOf(ca_delete_succeeded).trim().isEmpty()) {
                flg_deleted_yes.set(String.valueOf(cb_true));
            } else {
                flg_deleted_no.set(String.valueOf(cb_true));
            }
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            if (!String.valueOf(flg_deleted_yes).trim().isEmpty()) {
                carddemo_commarea.set("");
                ws_this_progcommarea.set("");
                ws_misc_storage.set("");
                cdemo_pgm_enter.set(String.valueOf(cb_true));
                ca_first_page.set(String.valueOf(cb_true));
                ca_last_page_not_shown.set(String.valueOf(cb_true));
            }
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_enter).trim().isEmpty()) {
            /* RAW: AND WS-UPDATES-REQUESTED > 0 AND CDEMO-FROM-PROGRAM */
            ws_start_key.set(String.valueOf(ws_ca_first_tr_code));
            if ((!(!String.valueOf(flg_typefilter_not_ok).trim().isEmpty()) && !(!String.valueOf(flg_descfilter_not_ok).trim().isEmpty()))) {
                _8000();
                /* RAW: - READ-FORWARD THRU 8000 - READ-FORWARD-EXIT */
            }
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(ccard_aid_pfk10).trim().isEmpty()) {
            /* RAW: AND WS-UPDATES-REQUESTED > 0 AND CDEMO-FROM-PROGRAM */
            _9200();
            /* RAW: - UPDATE-RECORD THRU 9200 - UPDATE-RECORD-EXIT */
            if (!String.valueOf(ca_update_succeeded).trim().isEmpty()) {
                flg_update_completed.set(String.valueOf(cb_true));
            }
            ws_start_key.set(String.valueOf(ws_ca_first_tr_code));
            _8000();
            /* RAW: - READ-FORWARD THRU 8000 - READ-FORWARD-EXIT */
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
        } else {
            ws_start_key.set(String.valueOf(ws_ca_first_tr_code));
            _8000();
            /* RAW: - READ-FORWARD THRU 8000 - READ-FORWARD-EXIT */
            _2000();
            /* RAW: - SEND-MAP THRU 2000 - SEND-MAP-EXIT */
            common_return();
            return;
        }
        if (!String.valueOf(input_error).trim().isEmpty()) {
            ccard_error_msg.set(String.valueOf(ws_return_msg));
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

    private void receive_map() {
        _1100();
        /* RAW: - RECEIVE-SCREEN THRU 1100 - RECEIVE-SCREEN-EXIT */
        _1200();
        /* RAW: - EDIT-INPUTS THRU 1200 - */
    }

    private void edit_inputs_exit() {
        /* RAW: 1000 - */
    }

    private void receive_map_exit() {
        return;
    }

    private void receive_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( LIT-THISMAP */
        ws_in_type_cd.set(String.valueOf(trtypei));
        ws_in_type_desc.set(String.valueOf(trdesci));
        for (i = 1; !(i > ws_max_screen_lines); i += 1) {
            if (ws_edit_select[i - 1] == null) ws_edit_select[i - 1] = new CobolString(256);
            ws_edit_select[i - 1].set(String.valueOf(trtseli[i - 1]));
            if (ws_row_tr_code_in[i - 1] == null) ws_row_tr_code_in[i - 1] = new CobolString(256);
            ws_row_tr_code_in[i - 1].set(String.valueOf(trttypi[i - 1]));
            if (ws_row_tr_desc_in[i - 1] == null) ws_row_tr_desc_in[i - 1] = new CobolString(256);
            ws_row_tr_desc_in[i - 1].set(String.valueOf("\u0000"));
            if ((String.valueOf(trtypdi[i - 1]).equals(String.valueOf(lit_asterisk)) || String.valueOf(trtypdi[i - 1]).equals(String.valueOf(" ")))) {
                /* CONTINUE */
            } else {
                if (ws_row_tr_desc_in[i - 1] == null) ws_row_tr_desc_in[i - 1] = new CobolString(256);
                ws_row_tr_desc_in[i - 1].set(String.valueOf(CobolIntrinsics.trim(trtypdi[i - 1])));
            }
        }
        /* RAW: 1100 - */
    }

    private void receive_screen_exit() {
        return;
    }

    private void edit_inputs() {
        input_ok.set(String.valueOf(cb_true));
        flg_protect_select_rows_no.set(String.valueOf(cb_true));
        _1210();
        /* RAW: - EDIT-ARRAY THRU 1210 - EDIT-ARRAY-EXIT */
        _1230();
        /* RAW: - EDIT-DESC THRU 1230 - EDIT-DESC-EXIT */
        _1220();
        /* RAW: - EDIT-TYPECD THRU 1220 - EDIT-TYPECD-EXIT */
        _1290();
        /* RAW: - CROSS-EDITS THRU 1290 - */
    }

    private void cross_edits_exit() {
        /* RAW: 1200 - */
    }

    private void edit_inputs_exit_2() {
        return;
    }

    private void edit_array() {
        ws_actions_requested = new BigDecimal(String.valueOf(0).trim());
        ws_no_actions_selected = new BigDecimal(String.valueOf(0).trim());
        ws_deletes_requested = new BigDecimal(String.valueOf(0).trim());
        ws_updates_requested = new BigDecimal(String.valueOf(0).trim());
        ws_valid_actions_selected = new BigDecimal(String.valueOf(0).trim());
        if ((!String.valueOf(flg_typefilter_changed_yes).trim().isEmpty() || !String.valueOf(flg_descfilter_changed_yes).trim().isEmpty())) {
            ws_edit_select_flags.set("");
            _1210();
            return;
        } else {
            /* INSPECT WS-EDIT-SELECT-FLAGS — 2 clause(s) */
            ws_actions_requested = new BigDecimal(String.valueOf(new BigDecimal(String.valueOf(ws_max_screen_lines).trim()).subtract(ws_no_actions_selected)).trim());
            ws_valid_actions_selected = new BigDecimal(String.valueOf(ws_deletes_requested.add(ws_updates_requested)).trim());
            i_selected = new BigDecimal(String.valueOf(0).trim()).shortValue();
            flg_bad_actions_selected_no.set(String.valueOf(cb_true));
            for (i = ws_max_screen_lines; !(i == 0); i += -1) {
                if (!String.valueOf(select_ok[i - 1]).trim().isEmpty()) {
                    i_selected = new BigDecimal(String.valueOf(i).trim()).shortValue();
                    if (!String.valueOf(ws_morethan1action).trim().isEmpty()) {
                        if (ws_row_trtselect_error[i - 1] == null) ws_row_trtselect_error[i - 1] = new CobolString(256);
                        ws_row_trtselect_error[i - 1].set(String.valueOf("1"));
                        flg_bad_actions_selected_yes.set(String.valueOf(cb_true));
                    }
                    if (!String.valueOf(update_requested_on).trim().isEmpty()) {
                        _1211();
                        /* RAW: - EDIT-ARRAY-DESC THRU 1211 - EDIT-ARRAY-DESC-EXIT */
                    }
                } else if (!String.valueOf(select_blank[i - 1]).trim().isEmpty()) {
                    /* CONTINUE */
                } else {
                    input_error.set(String.valueOf(cb_true));
                    if (ws_row_trtselect_error[i - 1] == null) ws_row_trtselect_error[i - 1] = new CobolString(256);
                    ws_row_trtselect_error[i - 1].set(String.valueOf("1"));
                    flg_bad_actions_selected_yes.set(String.valueOf(cb_true));
                    ws_mesg_invalid_action_code.set(String.valueOf(cb_true));
                }
            }
            if (String.valueOf(i_selected).equals(String.valueOf(ws_ca_row_selected))) {
                flg_row_selection_changed_no.set(String.valueOf(cb_true));
            } else {
                flg_row_selection_changed_yes.set(String.valueOf(cb_true));
                ws_ca_row_selected.set(String.valueOf(i_selected));
            }
            if (!String.valueOf(ws_morethan1action).trim().isEmpty()) {
                input_error.set(String.valueOf(cb_true));
                ws_mesg_more_than_1_action.set(String.valueOf(cb_true));
            }
        }
        /* RAW: 1210 - */
    }

    private void edit_array_exit() {
        return;
    }

    private void edit_array_desc() {
        no_changes_found.set(String.valueOf(cb_true));
        if ((String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(ws_row_tr_desc_in[i - 1]))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(ws_ca_row_tr_desc_out[i - 1])))) && String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(ws_row_tr_desc_in[i - 1]))).equals(String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(ws_ca_row_tr_desc_out[i - 1])))))) {
            ws_mesg_no_changes_detected.set(String.valueOf(cb_true));
            _1211();
            return;
        } else {
            changes_have_occurred.set(String.valueOf(cb_true));
        }
        flg_row_description_not_ok.set(String.valueOf(cb_true));
        ws_edit_variable_name.set(String.valueOf("Transaction Desc"));
        ws_edit_alphanum_only.set(String.valueOf(ws_row_tr_desc_in[i - 1]));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(50).trim());
        _1240();
        /* RAW: - EDIT-ALPHANUM-REQD THRU 1240 - EDIT-ALPHANUM-REQD-EXIT */
    }

    private void ws_array_description_flgs() {
        /* RAW: 1211 - */
    }

    private void edit_array_desc_exit() {
        return;
    }

    private void edit_typecd() {
        flg_typefilter_blank.set(String.valueOf(cb_true));
        if (((String.valueOf(ws_in_type_cd).equals(String.valueOf("\u0000")) || String.valueOf(ws_in_type_cd).equals(String.valueOf(" "))) || String.valueOf(ws_in_type_cd).equals(String.valueOf(0)))) {
            flg_typefilter_blank.set(String.valueOf(cb_true));
            ws_type_cd_filter.set(String.valueOf(0));
            _1220();
            return;
        }
        if (!CobolIntrinsics.isNumeric(ws_in_type_cd)) {
            input_error.set(String.valueOf(cb_true));
            flg_typefilter_not_ok.set(String.valueOf(cb_true));
            flg_protect_select_rows_yes.set(String.valueOf(cb_true));
            ws_return_msg.set(String.valueOf("TYPE CODE FILTER,IF SUPPLIED MUST BE A 2 DIGIT NUMBER"));
            _1220();
            return;
        } else {
            ws_type_cd_filter.set(String.valueOf(ws_in_type_cd));
            flg_typefilter_isvalid.set(String.valueOf(cb_true));
        }
        /* RAW: 1220 - */
    }

    private void edit_typecd_exit() {
        if ((String.valueOf(ws_in_type_cd).equals(String.valueOf(ws_ca_type_cd)) || (!String.valueOf(flg_typefilter_blank).trim().isEmpty() && ((String.valueOf(ws_ca_type_cd).equals(String.valueOf(0)) || String.valueOf(ws_ca_type_cd).equals(String.valueOf("\u0000"))) || String.valueOf(ws_ca_type_cd).equals(String.valueOf(" ")))))) {
            flg_typefilter_changed_no.set(String.valueOf(cb_true));
        } else {
            ws_ca_paging_variables.set("");
            ws_ca_type_cd.set(String.valueOf(ws_in_type_cd));
            flg_typefilter_changed_yes.set(String.valueOf(cb_true));
        }
        return;
    }

    private void edit_desc() {
        flg_descfilter_blank.set(String.valueOf(cb_true));
        if ((String.valueOf(ws_in_type_desc).equals(String.valueOf("\u0000")) || String.valueOf(ws_in_type_desc).equals(String.valueOf(" ")))) {
            flg_descfilter_blank.set(String.valueOf(cb_true));
            _1230();
            return;
        } else {
            flg_descfilter_isvalid.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(flg_descfilter_isvalid).trim().isEmpty()) {
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("%");
                _sb.append(String.valueOf(CobolIntrinsics.trim(ws_in_type_desc)));
                _sb.append("%");
                ws_type_desc_filter.set(_sb.toString());
            }
        }
        /* RAW: 1230 - */
    }

    private void edit_desc_exit() {
        if ((String.valueOf(ws_in_type_desc).equals(String.valueOf(ws_ca_type_desc)) || (!String.valueOf(flg_descfilter_blank).trim().isEmpty() && (String.valueOf(ws_ca_type_desc).equals(String.valueOf("\u0000")) || String.valueOf(ws_ca_type_desc).equals(String.valueOf(" ")))))) {
            flg_descfilter_changed_no.set(String.valueOf(cb_true));
        } else {
            ws_ca_paging_variables.set("");
            ws_ca_type_desc.set(String.valueOf(ws_in_type_desc));
            flg_descfilter_changed_yes.set(String.valueOf(cb_true));
        }
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
            _1240();
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
            _1240();
            return;
        }
        flg_alphnanum_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1240 - */
    }

    private void edit_alphanum_reqd_exit() {
        return;
    }

    private void cross_edits() {
        if ((!String.valueOf(flg_typefilter_isvalid).trim().isEmpty() || !String.valueOf(flg_descfilter_isvalid).trim().isEmpty())) {
            /* CONTINUE */
        } else {
            _1290();
            return;
        }
        _9100();
        /* RAW: - CHECK-FILTERS THRU 9100 - CHECK-FILTERS-EXIT */
        if (ws_records_count.compareTo(new BigDecimal(String.valueOf(0).trim())) == 0) {
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(flg_typefilter_isvalid).trim().isEmpty()) {
                flg_typefilter_not_ok.set(String.valueOf(cb_true));
            }
            if (!String.valueOf(flg_descfilter_isvalid).trim().isEmpty()) {
                flg_descfilter_not_ok.set(String.valueOf(cb_true));
            }
            flg_protect_select_rows_yes.set(String.valueOf(cb_true));
            ws_return_msg.set(String.valueOf("No Records found for these filter conditions"));
            _1290();
            return;
        }
        /* RAW: 1290 - */
    }

    private void cross_edits_exit_2() {
        return;
    }

    private void send_map() {
        _2100();
        /* RAW: - SCREEN-INIT THRU 2100 - SCREEN-INIT-EXIT */
        _2200();
        /* RAW: - SETUP-ARRAY-ATTRIBS THRU 2200 - SETUP-ARRAY-ATTRIBS-EXIT */
        _2300();
        /* RAW: - SCREEN-ARRAY-INIT THRU 2300 - SCREEN-ARRAY-INIT-EXIT */
        _2400();
        /* RAW: - SETUP-SCREEN-ATTRS THRU 2400 - SETUP-SCREEN-ATTRS-EXIT */
        _2500();
        /* RAW: - SETUP-MESSAGE THRU 2500 - SETUP-MESSAGE-EXIT */
        _2600();
        /* RAW: - SEND-SCREEN THRU 2600 - */
    }

    private void send_screen_exit() {
        /* RAW: 2000 - */
    }

    private void send_map_exit() {
        return;
    }

    private void screen_init() {
        ctrtliao.set(String.valueOf("\u0000"));
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
        /* RAW: 2100 - */
    }

    private void screen_init_exit() {
        return;
    }

    private void setup_array_attribs() {
        for (i = ws_max_screen_lines; !(i == 0); i += -1) {
            if (trtypda[i - 1] == null) trtypda[i - 1] = new CobolString(256);
            trtypda[i - 1].set(String.valueOf(dfhbmprf));
            if ((String.valueOf(ws_ca_each_row_out[i - 1]).equals(String.valueOf("\u0000")) || !String.valueOf(flg_protect_select_rows_yes).trim().isEmpty())) {
                if (trtsela[i - 1] == null) trtsela[i - 1] = new CobolString(256);
                trtsela[i - 1].set(String.valueOf(dfhbmpro));
            } else {
                if (String.valueOf(ws_row_trtselect_error[i - 1]).equals(String.valueOf("1"))) {
                    if (trtselc[i - 1] == null) trtselc[i - 1] = new CobolString(256);
                    trtselc[i - 1].set(String.valueOf(dfhred));
                    if (trtsell[i - 1] == null) trtsell[i - 1] = new CobolString(256);
                    trtsell[i - 1].set(String.valueOf(-1));
                }
                if (((!String.valueOf(delete_requested_on).trim().isEmpty() && !String.valueOf(ws_only_1_valid_action).trim().isEmpty()) && !String.valueOf(flg_bad_actions_selected_no).trim().isEmpty())) {
                    if (trttypc[i - 1] == null) trttypc[i - 1] = new CobolString(256);
                    trttypc[i - 1].set(String.valueOf(dfhneutr));
                    if (trtypdc[i - 1] == null) trtypdc[i - 1] = new CobolString(256);
                    trtypdc[i - 1].set(String.valueOf(dfhneutr));
                    if (trtsell[i - 1] == null) trtsell[i - 1] = new CobolString(256);
                    trtsell[i - 1].set(String.valueOf(-1));
                }
                if (((!String.valueOf(update_requested_on).trim().isEmpty() && !String.valueOf(ws_only_1_valid_action).trim().isEmpty()) && !String.valueOf(flg_bad_actions_selected_no).trim().isEmpty())) {
                    if (trttypc[i - 1] == null) trttypc[i - 1] = new CobolString(256);
                    trttypc[i - 1].set(String.valueOf(dfhneutr));
                    if (!String.valueOf(flg_update_completed).trim().isEmpty()) {
                        if (trtsell[i - 1] == null) trtsell[i - 1] = new CobolString(256);
                        trtsell[i - 1].set(String.valueOf(-1));
                        if (trtypdc[i - 1] == null) trtypdc[i - 1] = new CobolString(256);
                        trtypdc[i - 1].set(String.valueOf(dfhneutr));
                    } else {
                        if (trtypdl[i - 1] == null) trtypdl[i - 1] = new CobolString(256);
                        trtypdl[i - 1].set(String.valueOf(-1));
                        if (trtypda[i - 1] == null) trtypda[i - 1] = new CobolString(256);
                        trtypda[i - 1].set(String.valueOf(dfhbmfse));
                        if (!(!String.valueOf(flg_row_description_isvalid).trim().isEmpty())) {
                            if (trtypdc[i - 1] == null) trtypdc[i - 1] = new CobolString(256);
                            trtypdc[i - 1].set(String.valueOf(dfhred));
                        }
                    }
                }
                if (trtsela[i - 1] == null) trtsela[i - 1] = new CobolString(256);
                trtsela[i - 1].set(String.valueOf(dfhbmfse));
            }
        }
        /* RAW: 2200 - */
    }

    private void setup_array_attribs_exit() {
        return;
    }

    private void screen_array_init() {
        for (i = 1; !(i > ws_max_screen_lines); i += 1) {
            if (String.valueOf(ws_ca_each_row_out[i - 1]).equals(String.valueOf("\u0000"))) {
                /* CONTINUE */
            } else {
                if (((!String.valueOf(delete_requested_on).trim().isEmpty() && !String.valueOf(ws_only_1_valid_action).trim().isEmpty()) && !String.valueOf(flg_bad_actions_selected_no).trim().isEmpty())) {
                    if (!String.valueOf(flg_deleted_yes).trim().isEmpty()) {
                        if (select_blank[i - 1] == null) select_blank[i - 1] = new CobolString(256);
                        select_blank[i - 1].set(String.valueOf(cb_true));
                    } else {
                        ca_delete_requested.set(String.valueOf(cb_true));
                    }
                }
                if (trttypo[i - 1] == null) trttypo[i - 1] = new CobolString(256);
                trttypo[i - 1].set(String.valueOf(ws_ca_row_tr_code_out[i - 1]));
                if (((!String.valueOf(update_requested_on).trim().isEmpty() && !String.valueOf(ws_only_1_valid_action).trim().isEmpty()) && !String.valueOf(flg_bad_actions_selected_no).trim().isEmpty())) {
                    if (!String.valueOf(flg_update_completed).trim().isEmpty()) {
                        if (select_blank[i - 1] == null) select_blank[i - 1] = new CobolString(256);
                        select_blank[i - 1].set(String.valueOf(cb_true));
                    } else {
                        ca_update_requested.set(String.valueOf(cb_true));
                    }
                    if (!String.valueOf(changes_have_occurred).trim().isEmpty()) {
                        if (!String.valueOf(flg_row_description_blank).trim().isEmpty()) {
                            if (trtypdo[i - 1] == null) trtypdo[i - 1] = new CobolString(256);
                            trtypdo[i - 1].set(String.valueOf(lit_asterisk));
                        } else {
                            if (trtypdo[i - 1] == null) trtypdo[i - 1] = new CobolString(256);
                            trtypdo[i - 1].set(String.valueOf(ws_row_tr_desc_in[i - 1]));
                        }
                    } else {
                        if (trtypdo[i - 1] == null) trtypdo[i - 1] = new CobolString(256);
                        trtypdo[i - 1].set(String.valueOf(ws_ca_row_tr_desc_out[i - 1]));
                    }
                } else {
                    if (trtypdo[i - 1] == null) trtypdo[i - 1] = new CobolString(256);
                    trtypdo[i - 1].set(String.valueOf(ws_ca_row_tr_desc_out[i - 1]));
                }
                if (trtselo[i - 1] == null) trtselo[i - 1] = new CobolString(256);
                trtselo[i - 1].set(String.valueOf(ws_edit_select[i - 1]));
            }
        }
        /* RAW: 2300 - */
    }

    private void screen_array_init_exit() {
        return;
    }

    private void setup_screen_attrs() {
        if ((String.valueOf(eibcalen).equals(String.valueOf(0)) || (!String.valueOf(cdemo_pgm_enter).trim().isEmpty() && String.valueOf(cdemo_from_program).equals(String.valueOf(lit_adminpgm))))) {
            /* CONTINUE */
        } else {
            if (ws_actions_requested.signum() != 0) {
                /* RAW: > 0 */
                trtypeo.set(String.valueOf(ws_in_type_cd));
                trtypea.set(String.valueOf(dfhbmasf));
                trtypec.set(String.valueOf(dfhblue));
            } else if (!String.valueOf(flg_typefilter_isvalid).trim().isEmpty()) {
            } else if (!String.valueOf(flg_typefilter_not_ok).trim().isEmpty()) {
                trtypeo.set(String.valueOf(ws_in_type_cd));
                trtypea.set(String.valueOf(dfhbmfse));
            } else if (!String.valueOf(ws_in_type_cd).trim().isEmpty()) {
                /* RAW: = 0 */
                trtypeo.set(String.valueOf("\u0000"));
            } else {
                trtypeo.set(String.valueOf("\u0000"));
                trtypea.set(String.valueOf(dfhbmfse));
            }
            if (ws_actions_requested.signum() != 0) {
                /* RAW: > 0 */
                trdesco.set(String.valueOf(ws_in_type_desc));
                trdesca.set(String.valueOf(dfhbmasf));
                trdescc.set(String.valueOf(dfhblue));
            } else if (!String.valueOf(flg_descfilter_isvalid).trim().isEmpty()) {
            } else if (!String.valueOf(flg_descfilter_not_ok).trim().isEmpty()) {
                trdesco.set(String.valueOf(ws_in_type_desc));
                trdesca.set(String.valueOf(dfhbmfse));
            } else {
                trdesca.set(String.valueOf(dfhbmfse));
            }
        }
        if (!String.valueOf(flg_typefilter_not_ok).trim().isEmpty()) {
            trtypec.set(String.valueOf(dfhred));
            trtypel.set(String.valueOf(-1));
        }
        if (!String.valueOf(flg_descfilter_not_ok).trim().isEmpty()) {
            trdescc.set(String.valueOf(dfhred));
            trdescl.set(String.valueOf(-1));
        }
        if (!String.valueOf(input_ok).trim().isEmpty()) {
            if (((ws_actions_requested.compareTo(new BigDecimal(String.valueOf(0).trim())) > 0 && !(!String.valueOf(ccard_aid_pfk07).trim().isEmpty())) && !(!String.valueOf(ccard_aid_pfk08).trim().isEmpty()))) {
                /* CONTINUE */
            } else {
                trtypel.set(String.valueOf(-1));
            }
        }
        /* RAW: 2400 - */
    }

    private void setup_screen_attrs_exit() {
        return;
    }

    private void setup_message() {
        if (!String.valueOf(flg_deleted_yes).trim().isEmpty()) {
            ws_inform_delete_success.set(String.valueOf(cb_true));
        } else if (!String.valueOf(flg_update_completed).trim().isEmpty()) {
            ws_inform_update_success.set(String.valueOf(cb_true));
        } else if (!String.valueOf(flg_typefilter_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_descfilter_not_ok).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(ccard_aid_enter).trim().isEmpty()) {
            /* RAW: AND WS-DELETES-REQUESTED > 0 AND WS-ONLY-1-ACTION */
            if (((!String.valueOf(ws_no_info_message).trim().isEmpty() && !String.valueOf(flg_typefilter_changed_no).trim().isEmpty()) && !String.valueOf(flg_descfilter_changed_no).trim().isEmpty())) {
                ws_inform_delete.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(ccard_aid_enter).trim().isEmpty()) {
            /* RAW: AND WS-UPDATES-REQUESTED > 0 AND WS-ONLY-1-ACTION */
            if (((!String.valueOf(ws_no_info_message).trim().isEmpty() && !String.valueOf(flg_typefilter_changed_no).trim().isEmpty()) && !String.valueOf(flg_descfilter_changed_no).trim().isEmpty())) {
                ws_inform_update.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(ccard_aid_pfk07).trim().isEmpty()) {
            /* RAW: AND CA-FIRST-PAGE */
            ws_return_msg.set(String.valueOf("No previous pages to display"));
        } else if (!String.valueOf(ccard_aid_pfk08).trim().isEmpty()) {
            /* RAW: AND CA-NEXT-PAGE-NOT-EXISTS AND CA-LAST-PAGE-SHOWN */
            ws_return_msg.set(String.valueOf("No more pages to display"));
        } else if (!String.valueOf(ccard_aid_pfk08).trim().isEmpty()) {
            /* RAW: AND CA-NEXT-PAGE-NOT-EXISTS */
            if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
                ws_inform_rec_actions.set(String.valueOf(cb_true));
            }
            if ((!String.valueOf(ca_last_page_not_shown).trim().isEmpty() && !String.valueOf(ca_next_page_not_exists).trim().isEmpty())) {
                ca_last_page_shown.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
        } else if (!String.valueOf(ca_next_page_exists).trim().isEmpty()) {
            ws_inform_rec_actions.set(String.valueOf(cb_true));
        } else {
            ws_no_info_message.set(String.valueOf(cb_true));
        }
        errmsgo.set(String.valueOf(ws_return_msg));
        ws_string_len = new BigDecimal(String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(ws_info_msg))).trim()).intValue();
        ws_string_mid = new BigDecimal(String.valueOf(((((CobolIntrinsics.length(ws_info_msg) - ws_string_len)) / 2) + 1)).trim()).intValue();
        ws_string_out.setRefMod(ws_string_mid, ws_string_len, String.valueOf(CobolString.refMod(ws_info_msg, 1, ws_string_len)));
        if ((!(!String.valueOf(ws_no_info_message).trim().isEmpty()) && !(!String.valueOf(ws_mesg_no_records_found).trim().isEmpty()))) {
            infomsgo.set(String.valueOf(ws_string_out));
            infomsgc.set(String.valueOf(dfhneutr));
        }
        /* RAW: 2500 - */
    }

    private void setup_message_exit() {
        return;
    }

    private void send_screen() {
        /* RAW: EXEC CICS SEND MAP ( LIT-THISMAP */
    }

    private void end_exec_2() {
        /* RAW: 2600 - */
    }

    private void send_screen_exit_2() {
        return;
    }

    private void read_forward() {
        ws_ca_all_rows_out.set(String.valueOf("\u0000"));
        _9400();
        /* RAW: - OPEN-FORWARD-CURSOR THRU 9400 - OPEN-FORWARD-CURSOR-EXIT */
        if (!String.valueOf(ws_db2_error).trim().isEmpty()) {
            _8000();
            return;
        }
        ws_row_number.set(String.valueOf(0));
        ca_next_page_exists.set(String.valueOf(cb_true));
        more_records_to_read.set(String.valueOf(cb_true));
        while (!(!String.valueOf(read_loop_exit).trim().isEmpty())) {
            dcltransaction_type.set("");
            exec.set("");
            sql.set("");
            fetch.set("");
            c_tr_type_forward = new CobolFile("C-TR-TYPE-FORWARD", "SEQUENTIAL", "SEQUENTIAL");
            into.set("");
            _unnamed.set("");
            dcl_tr_type.set("");
    // _unnamed = 0; /* INITIALIZE */
            _unnamed.set("");
            dcl_tr_description.set("");
            end_exec.set("");
            ws_disp_sqlcode.set(String.valueOf(sqlcode));
            if (!String.valueOf(sqlcode).trim().isEmpty()) {
                /* RAW: = ZERO */
                ws_row_number.set(new BigDecimal(String.valueOf(ws_row_number).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                if (ws_ca_row_tr_code_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1] == null) ws_ca_row_tr_code_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1] = new CobolString(256);
                ws_ca_row_tr_code_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1].set(String.valueOf(dcl_tr_type));
                if (ws_ca_row_tr_desc_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1] == null) ws_ca_row_tr_desc_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1] = new CobolString(256);
                ws_ca_row_tr_desc_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1].set(String.valueOf(dcl_tr_description_text));
                if (String.valueOf(ws_row_number).equals(String.valueOf(1))) {
                    ws_ca_first_tr_code.set(String.valueOf(dcl_tr_type));
                    if (String.valueOf(ws_ca_screen_num).equals(String.valueOf(0))) {
                        ws_ca_screen_num.set(new BigDecimal(String.valueOf(ws_ca_screen_num).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                        cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                        /* CONTINUE */
                    }
                } else {
                    /* CONTINUE */
                }
                if (String.valueOf(ws_row_number).equals(String.valueOf(ws_max_screen_lines))) {
                    read_loop_exit.set(String.valueOf(cb_true));
                    ws_ca_last_tr_code.set(String.valueOf(dcl_tr_type));
                    exec.set(String.valueOf(dcl_tr_type));
                    sql.set(String.valueOf(dcl_tr_type));
                    fetch.set(String.valueOf(dcl_tr_type));
                    /* MOVE to file C-TR-TYPE-FORWARD — not applicable */
                    into.set(String.valueOf(dcl_tr_type));
                    _unnamed.set(String.valueOf(dcl_tr_type));
                    dcl_tr_type.set(String.valueOf(dcl_tr_type));
                    _unnamed.set(String.valueOf(dcl_tr_type));
                    _unnamed.set(String.valueOf(dcl_tr_type));
                    dcl_tr_description.set(String.valueOf(dcl_tr_type));
                    end_exec.set(String.valueOf(dcl_tr_type));
                    ws_disp_sqlcode.set(String.valueOf(sqlcode));
                    if (!String.valueOf(sqlcode).trim().isEmpty()) {
                        /* RAW: = ZERO */
                        ca_next_page_exists.set(String.valueOf(cb_true));
                        ws_ca_last_tr_code.set(String.valueOf(dcl_tr_type));
                    } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
                        /* RAW: = +100 */
                        ca_next_page_not_exists.set(String.valueOf(cb_true));
                        if ((!String.valueOf(ws_return_msg_off).trim().isEmpty() && !String.valueOf(ccard_aid_pfk08).trim().isEmpty())) {
                            ws_mesg_no_more_records.set(String.valueOf(cb_true));
                        }
                    } else {
                        read_loop_exit.set(String.valueOf(cb_true));
                        if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                            ws_db2_current_action.set(String.valueOf("C-TR-TYPE-FORWARD fetch"));
                            _9999();
                            /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
                        }
                    }
                }
            } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
                /* RAW: = +100 */
                read_loop_exit.set(String.valueOf(cb_true));
                ca_next_page_not_exists.set(String.valueOf(cb_true));
                ws_ca_last_tr_code.set(String.valueOf(dcl_tr_type));
                if ((!String.valueOf(ws_return_msg_off).trim().isEmpty() && !String.valueOf(ccard_aid_pfk08).trim().isEmpty())) {
                    ws_mesg_no_more_records.set(String.valueOf(cb_true));
                }
                if ((String.valueOf(ws_ca_screen_num).equals(String.valueOf(1)) && String.valueOf(ws_row_number).equals(String.valueOf(0)))) {
                    ws_mesg_no_records_found.set(String.valueOf(cb_true));
                }
            } else {
                read_loop_exit.set(String.valueOf(cb_true));
                ws_db2_error.set(String.valueOf(cb_true));
                if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                    ws_db2_current_action.set(String.valueOf("C-TR-TYPE-FORWARD close"));
                    _9999();
                    /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
                }
            }
        }
        _9450();
        /* RAW: - CLOSE-FORWARD-CURSOR THRU 9450 - */
    }

    private void close_forward_cursor_exit() {
        /* RAW: 8000 - */
    }

    private void read_forward_exit() {
        return;
    }

    private void read_backwards() {
        ws_ca_all_rows_out.set(String.valueOf("\u0000"));
        ws_ca_last_ttypekey.set(String.valueOf(ws_ca_first_ttypekey));
        ws_row_number.set(String.valueOf(ws_max_screen_lines));
        ca_next_page_exists.set(String.valueOf(cb_true));
        more_records_to_read.set(String.valueOf(cb_true));
        _9500();
        /* RAW: - OPEN-BACKWARD-CURSOR THRU 9500 - OPEN-BACKWARD-CURSOR-EXIT */
        while (!(!String.valueOf(read_loop_exit).trim().isEmpty())) {
            dcltransaction_type.set("");
            exec.set("");
            sql.set("");
            fetch.set("");
            c_tr_type_backward = new CobolFile("C-TR-TYPE-BACKWARD", "SEQUENTIAL", "SEQUENTIAL");
            into.set("");
            _unnamed.set("");
            dcl_tr_type.set("");
    // _unnamed = 0; /* INITIALIZE */
            _unnamed.set("");
            dcl_tr_description.set("");
            end_exec.set("");
            ws_disp_sqlcode.set(String.valueOf(sqlcode));
            if (!String.valueOf(sqlcode).trim().isEmpty()) {
                /* RAW: = ZERO */
                if (ws_ca_row_tr_code_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1] == null) ws_ca_row_tr_code_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1] = new CobolString(256);
                ws_ca_row_tr_code_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1].set(String.valueOf(dcl_tr_type));
                if (ws_ca_row_tr_desc_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1] == null) ws_ca_row_tr_desc_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1] = new CobolString(256);
                ws_ca_row_tr_desc_out[Integer.parseInt(String.valueOf(ws_row_number).trim()) - 1].set(String.valueOf(dcl_tr_description_text));
                ws_row_number.set(new BigDecimal(String.valueOf(ws_row_number).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                if (String.valueOf(ws_row_number).equals(String.valueOf(0))) {
                    read_loop_exit.set(String.valueOf(cb_true));
                    ws_ca_first_tr_code.set(String.valueOf(dcl_tr_type));
                } else {
                    /* CONTINUE */
                }
            } else {
                read_loop_exit.set(String.valueOf(cb_true));
                ws_db2_error.set(String.valueOf(cb_true));
                if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                    ws_db2_current_action.set(String.valueOf("Error on fetch Cursor C-TR-TYPE-BACKWARD"));
                    _9999();
                    /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
                }
            }
        }
        /* RAW: 8100 - */
    }

    private void read_backwards_exit() {
        _9550();
        /* RAW: - CLOSE-BACK-CURSOR THRU 9550 - CLOSE-BACK-CURSOR-EXIT */
        return;
    }

    private void check_filters() {
        /* RAW: EXEC SQL SELECT COUNT ( 1 */
    }

    private void carddemo() {
        /* RAW: TRANSACTION_TYPE WHERE ( ( : WS-EDIT-TYPE-FLAG */
        ws_disp_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("Error reading TRANSACTION_TYPE table "));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
            _9100();
            return;
        }
        /* RAW: 9100 - */
    }

    private void check_filters_exit() {
        return;
    }

    private void update_record() {
        dcl_tr_type.set(String.valueOf(ws_row_tr_code_in[i_selected - 1]));
        dcl_tr_description_text.set(String.valueOf(CobolIntrinsics.trim(ws_row_tr_desc_in[i_selected - 1])));
        dcl_tr_description_len.set(String.valueOf(CobolIntrinsics.length(ws_row_tr_desc_in[i_selected - 1])));
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
            ca_update_succeeded.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
                ws_inform_update_success.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = +100 */
            ca_update_requested.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("Record not found. Deleted by others ? "));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
            _9200();
            return;
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = -911 */
            ca_update_requested.set(String.valueOf(cb_true));
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("Deadlock. Someone else updating ?"));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
            _9200();
            return;
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: < 0 */
            ca_update_requested.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("Update failed with"));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
            _9200();
            return;
        }
        /* RAW: 9200 - */
    }

    private void update_record_exit() {
        return;
    }

    private void delete_record() {
        dcl_tr_type.set(String.valueOf(ws_row_tr_code_in[i_selected - 1]));
        exec.set(String.valueOf(ws_row_tr_code_in[i_selected - 1]));
        sql.set(String.valueOf(ws_row_tr_code_in[i_selected - 1]));
        from.delete();
    }

    private void carddemo_3() {
        /* RAW: TRANSACTION_TYPE WHERE TR_TYPE = : DCL-TR-TYPE */
        ws_disp_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO EXEC CICS SYNCPOINT END-EXEC */
            ca_delete_succeeded.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
                ws_inform_delete_success.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = -532 */
            ca_delete_requested.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("Please delete associated child records first:"));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
            _9300();
            return;
        } else {
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("Delete failed with message:"));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
            _9300();
            return;
        }
        /* RAW: 9300 - */
    }

    private void delete_record_exit() {
        return;
    }

    private void open_forward_cursor() {
        /* RAW: EXEC SQL */
        /* RAW: C-TR-TYPE-FORWARD END-EXEC */
        ws_disp_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            /* CONTINUE */
        } else {
            ws_db2_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("C-TR-TYPE-FORWARD Open"));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
        }
        /* RAW: 9400 - */
    }

    private void open_forward_cursor_exit() {
        return;
    }

    private void close_forward_cursor() {
        /* RAW: EXEC SQL */
        c_tr_type_forward.close();
        /* CLOSE END-EXEC — skipped, not a file */
        ws_disp_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            /* CONTINUE */
        } else {
            ws_db2_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("C-TR-TYPE-FORWARD close"));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
        }
        /* RAW: 9450 - */
    }

    private void close_forward_cursor_exit_2() {
        return;
    }

    private void open_backward_cursor() {
        /* RAW: EXEC SQL */
        /* RAW: C-TR-TYPE-BACKWARD END-EXEC */
        ws_disp_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            /* CONTINUE */
        } else {
            ws_db2_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("C-TR-TYPE-BACKWARD Open"));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
        }
        /* RAW: 9500 - */
    }

    private void open_backward_cursor_exit() {
        return;
    }

    private void close_back_cursor() {
        /* RAW: EXEC SQL */
        c_tr_type_backward.close();
        /* CLOSE END-EXEC — skipped, not a file */
        ws_disp_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            /* CONTINUE */
        } else {
            ws_db2_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_db2_current_action.set(String.valueOf("C-TR-TYPE-BACKWARD close"));
                _9999();
                /* RAW: - FORMAT-DB2-MESSAGE THRU 9999 - FORMAT-DB2-MESSAGE-EXIT */
            }
        }
        /* RAW: 9550 - */
    }

    private void close_back_cursor_exit() {
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

    private void _1000() { /* stub — external/COPY */ }

    private void _9998() { /* stub — external/COPY */ }

    private void _8000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _8100() { /* stub — external/COPY */ }

    private void _9300() { /* stub — external/COPY */ }

    private void _9200() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _1210() { /* stub — external/COPY */ }

    private void _1230() { /* stub — external/COPY */ }

    private void _1220() { /* stub — external/COPY */ }

    private void _1290() { /* stub — external/COPY */ }

    private void _1211() { /* stub — external/COPY */ }

    private void _1240() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _2100() { /* stub — external/COPY */ }

    private void _2200() { /* stub — external/COPY */ }

    private void _2300() { /* stub — external/COPY */ }

    private void _2400() { /* stub — external/COPY */ }

    private void _2500() { /* stub — external/COPY */ }

    private void _2600() { /* stub — external/COPY */ }

    private void _9400() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _9450() { /* stub — external/COPY */ }

    private void _9500() { /* stub — external/COPY */ }

    private void _9550() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cotrtlic().run();
    }
}
