package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cocrdslc extends CobolProgram {
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
    private CobolString ws_return_flag = new CobolString(1);
    private CobolString ws_pfk_flag = new CobolString(1);
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
    private CobolString lit_cardfilename = new CobolString(8);
    private CobolString lit_cardfilename_acct_path = new CobolString(8);

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
    private CobolString pfk_invalid = new CobolString(256); // fallback
    private CobolString ccard_aid_enter = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk03 = new CobolString(256); // fallback
    private CobolString pfk_valid = new CobolString(256); // fallback
    private CobolString abend_culprit = new CobolString(256); // fallback
    private CobolString abend_code = new CobolString(256); // fallback
    private CobolString abend_reason = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_to_tranid = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString cdemo_usrtyp_user = new CobolString(256); // fallback
    private CobolString cdemo_pgm_enter = new CobolString(256); // fallback
    private CobolString cdemo_last_mapset = new CobolString(256); // fallback
    private CobolString cdemo_last_map = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString input_ok = new CobolString(256); // fallback
    private CobolString cdemo_acct_id = new CobolString(256); // fallback
    private CobolString cc_acct_id_n = new CobolString(256); // fallback
    private CobolString cdemo_card_num = new CobolString(256); // fallback
    private CobolString cc_card_num_n = new CobolString(256); // fallback
    private CobolString input_error = new CobolString(256); // fallback
    private CobolString ccard_error_msg = new CobolString(256); // fallback
    private CobolString ccrdslao = new CobolString(256); // fallback
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
    private CobolString ws_prompt_for_input = new CobolString(256); // fallback
    private CobolString acctsido = new CobolString(256); // fallback
    private CobolString cc_acct_id = new CobolString(256); // fallback
    private CobolString cardsido = new CobolString(256); // fallback
    private CobolString cc_card_num = new CobolString(256); // fallback
    private CobolString found_cards_for_account = new CobolString(256); // fallback
    private CobolString card_embossed_name = new CobolString(256); // fallback
    private CobolString crdnameo = new CobolString(256); // fallback
    private CobolString card_expiraion_date = new CobolString(256); // fallback
    private CobolString expmono = new CobolString(256); // fallback
    private CobolString expyearo = new CobolString(256); // fallback
    private CobolString card_active_status = new CobolString(256); // fallback
    private CobolString crdstcdo = new CobolString(256); // fallback
    private CobolString ws_no_info_message = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString infomsgo = new CobolString(256); // fallback
    private CobolString dfhbmprf = new CobolString(256); // fallback
    private CobolString acctsida = new CobolString(256); // fallback
    private CobolString cardsida = new CobolString(256); // fallback
    private CobolString dfhbmfse = new CobolString(256); // fallback
    private CobolString acctsidl = new CobolString(256); // fallback
    private CobolString flg_acctfilter_not_ok = new CobolString(256); // fallback
    private CobolString flg_acctfilter_blank = new CobolString(256); // fallback
    private CobolString flg_cardfilter_not_ok = new CobolString(256); // fallback
    private CobolString flg_cardfilter_blank = new CobolString(256); // fallback
    private CobolString cardsidl = new CobolString(256); // fallback
    private CobolString dfhdfcol = new CobolString(256); // fallback
    private CobolString acctsidc = new CobolString(256); // fallback
    private CobolString cardsidc = new CobolString(256); // fallback
    private CobolString dfhred = new CobolString(256); // fallback
    private CobolString dfhbmdar = new CobolString(256); // fallback
    private CobolString infomsgc = new CobolString(256); // fallback
    private CobolString dfhneutr = new CobolString(256); // fallback
    private CobolString ccard_next_mapset = new CobolString(256); // fallback
    private CobolString ccard_next_map = new CobolString(256); // fallback
    private CobolString ccard_next_prog = new CobolString(256); // fallback
    private CobolString flg_cardfilter_isvalid = new CobolString(256); // fallback
    private CobolString flg_acctfilter_isvalid = new CobolString(256); // fallback
    private CobolString acctsidi = new CobolString(256); // fallback
    private CobolString cardsidi = new CobolString(256); // fallback
    private CobolString no_search_criteria_received = new CobolString(256); // fallback
    private CobolString ws_prompt_for_acct = new CobolString(256); // fallback
    private CobolString ws_prompt_for_card = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString notfnd = new CobolString(256); // fallback
    private CobolString did_not_find_acctcard_combo = new CobolString(256); // fallback
    private CobolString did_not_find_acct_in_cardxref = new CobolString(256); // fallback
    private CobolString abend_msg = new CobolString(256); // fallback
    private CobolString send = new CobolString(256); // fallback
    private CobolString[] from = new CobolString[100]; // fallback array
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
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, CobolIntrinsics.length(carddemo_commarea))));
            ws_this_progcommarea.set(String.valueOf(CobolString.refMod(dfhcommarea, (CobolIntrinsics.length(carddemo_commarea) + 1), CobolIntrinsics.length(ws_this_progcommarea))));
        }
        yyyy_store_pfkey(); // THRU YYYY-STORE-PFKEY-EXIT
        pfk_invalid.set(String.valueOf(cb_true));
        if ((!String.valueOf(ccard_aid_enter).trim().isEmpty() || !String.valueOf(ccard_aid_pfk03).trim().isEmpty())) {
            pfk_valid.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(pfk_invalid).trim().isEmpty()) {
            ccard_aid_enter.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(ccard_aid_pfk03).trim().isEmpty()) {
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
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
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
            input_ok.set(String.valueOf(cb_true));
            cc_acct_id_n.set(String.valueOf(cdemo_acct_id));
            cc_card_num_n.set(String.valueOf(cdemo_card_num));
            _9000();
            /* RAW: - READ-DATA THRU 9000 - READ-DATA-EXIT */
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(cdemo_pgm_enter).trim().isEmpty()) {
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP-EXIT */
            common_return();
            return;
        } else if (!String.valueOf(cdemo_pgm_reenter).trim().isEmpty()) {
            _2000();
            /* RAW: - PROCESS-INPUTS THRU 2000 - PROCESS-INPUTS-EXIT */
            if (!String.valueOf(input_error).trim().isEmpty()) {
                _1000();
                /* RAW: - SEND-MAP THRU 1000 - SEND-MAP-EXIT */
                common_return();
                return;
            } else {
                _9000();
                /* RAW: - READ-DATA THRU 9000 - READ-DATA-EXIT */
                _1000();
                /* RAW: - SEND-MAP THRU 1000 - SEND-MAP-EXIT */
                common_return();
                return;
            }
        } else {
            abend_culprit.set(String.valueOf(lit_thispgm));
            abend_code.set(String.valueOf("0001"));
            abend_reason.set(String.valueOf(" "));
            ws_return_msg.set(String.valueOf("UNEXPECTED DATA SCENARIO"));
            send_plain_text(); // THRU SEND-PLAIN-TEXT-EXIT
            send_plain_text_exit();
        }
        if (!String.valueOf(input_error).trim().isEmpty()) {
            ccard_error_msg.set(String.valueOf(ws_return_msg));
            _1000();
            /* RAW: - SEND-MAP THRU 1000 - SEND-MAP-EXIT */
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

    private void send_map() {
        _1100();
        /* RAW: - SCREEN-INIT THRU 1100 - SCREEN-INIT-EXIT */
        _1200();
        /* RAW: - SETUP-SCREEN-VARS THRU 1200 - SETUP-SCREEN-VARS-EXIT */
        _1300();
        /* RAW: - SETUP-SCREEN-ATTRS THRU 1300 - SETUP-SCREEN-ATTRS-EXIT */
        _1400();
        /* RAW: - SEND-SCREEN THRU 1400 - */
    }

    private void send_screen_exit() {
        /* RAW: 1000 - */
    }

    private void send_map_exit() {
        return;
    }

    private void screen_init() {
        ccrdslao.set(String.valueOf("\u0000"));
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
        /* RAW: 1100 - */
    }

    private void screen_init_exit() {
        return;
    }

    private void setup_screen_vars() {
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            ws_prompt_for_input.set(String.valueOf(cb_true));
        } else {
            if (String.valueOf(cdemo_acct_id).equals(String.valueOf(0))) {
                acctsido.set(String.valueOf("\u0000"));
            } else {
                acctsido.set(String.valueOf(cc_acct_id));
            }
            if (String.valueOf(cdemo_card_num).equals(String.valueOf(0))) {
                cardsido.set(String.valueOf("\u0000"));
            } else {
                cardsido.set(String.valueOf(cc_card_num));
            }
            if (!String.valueOf(found_cards_for_account).trim().isEmpty()) {
                crdnameo.set(String.valueOf(card_embossed_name));
                card_expiraion_date_x.set(String.valueOf(card_expiraion_date));
                expmono.set(String.valueOf(card_expiry_month));
                expyearo.set(String.valueOf(card_expiry_year));
                crdstcdo.set(String.valueOf(card_active_status));
            }
        }
        if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
            ws_prompt_for_input.set(String.valueOf(cb_true));
        }
        errmsgo.set(String.valueOf(ws_return_msg));
        infomsgo.set(String.valueOf(ws_info_msg));
        /* RAW: 1200 - */
    }

    private void setup_screen_vars_exit() {
        return;
    }

    private void setup_screen_attrs() {
        if ((String.valueOf(cdemo_last_mapset).equals(String.valueOf(lit_cclistmapset)) && String.valueOf(cdemo_from_program).equals(String.valueOf(lit_cclistpgm)))) {
            acctsida.set(String.valueOf(dfhbmprf));
            cardsida.set(String.valueOf(dfhbmprf));
        } else {
            acctsida.set(String.valueOf(dfhbmfse));
            cardsida.set(String.valueOf(dfhbmfse));
        }
        if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_acctfilter_blank).trim().isEmpty()) {
            acctsidl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_cardfilter_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cardfilter_blank).trim().isEmpty()) {
            cardsidl.set(String.valueOf(-1));
        } else {
            acctsidl.set(String.valueOf(-1));
        }
        if ((String.valueOf(cdemo_last_mapset).equals(String.valueOf(lit_cclistmapset)) && String.valueOf(cdemo_from_program).equals(String.valueOf(lit_cclistpgm)))) {
            acctsidc.set(String.valueOf(dfhdfcol));
            cardsidc.set(String.valueOf(dfhdfcol));
        }
        if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
            acctsidc.set(String.valueOf(dfhred));
        }
        if (!String.valueOf(flg_cardfilter_not_ok).trim().isEmpty()) {
            cardsidc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_acctfilter_blank).trim().isEmpty() && !String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
            acctsido.set(String.valueOf("*"));
            acctsidc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_cardfilter_blank).trim().isEmpty() && !String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
            cardsido.set(String.valueOf("*"));
            cardsidc.set(String.valueOf(dfhred));
        }
        if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
            infomsgc.set(String.valueOf(dfhbmdar));
        } else {
            infomsgc.set(String.valueOf(dfhneutr));
        }
        /* RAW: 1300 - */
    }

    private void setup_screen_attrs_exit() {
        return;
    }

    private void send_screen() {
        ccard_next_mapset.set(String.valueOf(lit_thismapset));
        ccard_next_map.set(String.valueOf(lit_thismap));
        cdemo_pgm_reenter.set(String.valueOf(cb_true));
        /* RAW: EXEC CICS SEND MAP ( CCARD-NEXT-MAP */
    }

    private void end_exec_2() {
        /* RAW: 1400 - */
    }

    private void send_screen_exit_2() {
        return;
    }

    private void process_inputs() {
        _2100();
        /* RAW: - RECEIVE-MAP THRU 2100 - RECEIVE-MAP-EXIT */
        _2200();
        /* RAW: - EDIT-MAP-INPUTS THRU 2200 - EDIT-MAP-INPUTS-EXIT */
        ccard_error_msg.set(String.valueOf(ws_return_msg));
        ccard_next_prog.set(String.valueOf(lit_thispgm));
        ccard_next_mapset.set(String.valueOf(lit_thismapset));
    }

    private void ccard_next_map() {
        /* RAW: 2000 - */
    }

    private void process_inputs_exit() {
        return;
    }

    private void receive_map() {
        /* RAW: EXEC CICS RECEIVE MAP ( LIT-THISMAP */
    }

    private void end_exec_3() {
        /* RAW: 2100 - */
    }

    private void receive_map_exit() {
        return;
    }

    private void edit_map_inputs() {
        input_ok.set(String.valueOf(cb_true));
        flg_cardfilter_isvalid.set(String.valueOf(cb_true));
        flg_acctfilter_isvalid.set(String.valueOf(cb_true));
        if ((String.valueOf(acctsidi).equals(String.valueOf("*")) || String.valueOf(acctsidi).equals(String.valueOf(" ")))) {
            cc_acct_id.set(String.valueOf("\u0000"));
        } else {
            cc_acct_id.set(String.valueOf(acctsidi));
        }
        if ((String.valueOf(cardsidi).equals(String.valueOf("*")) || String.valueOf(cardsidi).equals(String.valueOf(" ")))) {
            cc_card_num.set(String.valueOf("\u0000"));
        } else {
            cc_card_num.set(String.valueOf(cardsidi));
        }
        _2210();
        /* RAW: - EDIT-ACCOUNT THRU 2210 - EDIT-ACCOUNT-EXIT */
        _2220();
        /* RAW: - EDIT-CARD THRU 2220 - EDIT-CARD-EXIT */
        if ((!String.valueOf(flg_acctfilter_blank).trim().isEmpty() && !String.valueOf(flg_cardfilter_blank).trim().isEmpty())) {
            no_search_criteria_received.set(String.valueOf(cb_true));
        }
        /* RAW: 2200 - */
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
            _2210();
            return;
        }
        if (!CobolIntrinsics.isNumeric(cc_acct_id)) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_return_msg.set(String.valueOf("ACCOUNT FILTER,IF SUPPLIED MUST BE A 11 DIGIT NUMBER"));
            }
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
        flg_cardfilter_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(cc_card_num).equals(String.valueOf("\u0000")) || String.valueOf(cc_card_num).equals(String.valueOf(" "))) || String.valueOf(cc_card_num_n).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_cardfilter_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_prompt_for_card.set(String.valueOf(cb_true));
            }
            cdemo_card_num.set(String.valueOf(0));
            _2220();
            return;
        }
        if (!CobolIntrinsics.isNumeric(cc_card_num)) {
            input_error.set(String.valueOf(cb_true));
            flg_cardfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_return_msg.set(String.valueOf("CARD ID FILTER,IF SUPPLIED MUST BE A 16 DIGIT NUMBER"));
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

    private void read_data() {
        _9100();
        /* RAW: - GETCARD-BYACCTCARD THRU 9100 - */
    }

    private void getcard_byacctcard_exit() {
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

    private void getcard_byacctcard_exit_2() {
        return;
    }

    private void getcard_byacct() {
        /* RAW: EXEC CICS */
        if (file.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( LIT-CARDFILENAME-ACCT-PATH ) RIDFLD ( WS-CARD-RID-ACCT-ID */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            found_cards_for_account.set(String.valueOf(cb_true));
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            did_not_find_acct_in_cardxref.set(String.valueOf(cb_true));
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            error_opname.set(String.valueOf("READ"));
            error_file.set(String.valueOf(lit_cardfilename_acct_path));
            error_resp.set(String.valueOf(ws_resp_cd));
            error_resp2.set(String.valueOf(ws_reas_cd));
            ws_return_msg.set(String.valueOf(ws_file_error_message));
        }
        /* RAW: 9150 - */
    }

    private void getcard_byacct_exit() {
        return;
    }

    private void send_long_text() {
        /* RAW: EXEC CICS SEND TEXT FROM ( */
        /* RETURN END-EXEC */
    }

    private void send_long_text_exit() {
        return;
    }

    private void send_plain_text() {
        /* RAW: EXEC CICS SEND TEXT FROM ( */
        /* RETURN END-EXEC */
    }

    private void send_plain_text_exit() {
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

    private void yyyy_store_pfkey() { /* stub — external/COPY */ }

    private void yyyy_store_pfkey_exit() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _1300() { /* stub — external/COPY */ }

    private void _1400() { /* stub — external/COPY */ }

    private void _2100() { /* stub — external/COPY */ }

    private void _2200() { /* stub — external/COPY */ }

    private void _2210() { /* stub — external/COPY */ }

    private void _2220() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cocrdslc().run();
    }
}
