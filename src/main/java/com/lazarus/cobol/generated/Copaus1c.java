package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Copaus1c extends CobolProgram {
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
    private int ws_decl_rsn_idx = 0;
    // WORKING-STORAGE SECTION
    private CobolString ws_variables = new CobolString(1); // Group: WS-VARIABLES
    private CobolString ws_pgm_auth_dtl = new CobolString(8);
    private CobolString ws_pgm_auth_smry = new CobolString(8);
    private CobolString ws_pgm_auth_fraud = new CobolString(8);
    private CobolString ws_cics_tranid = new CobolString(4);
    private CobolString ws_message = new CobolString(80);
    private CobolString ws_err_flg = new CobolString(1);
    private CobolString ws_auths_eof = new CobolString(1);
    private CobolString ws_send_erase_flg = new CobolString(1);
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private int ws_acct_id = 0;
    private CobolString ws_auth_key = new CobolString(8);
    private CobolString ws_auth_amt = new CobolString(1);
    private CobolString ws_auth_date = new CobolString(8);
    private CobolString ws_auth_time = new CobolString(8);
    private CobolString ws_tables = new CobolString(1); // Group: WS-TABLES
    private CobolString ws_decline_reason_table = new CobolString(1); // Group: WS-DECLINE-REASON-TABLE
    private CobolString[] ws_decline_reason_tab = new CobolString[10]; // Group: WS-DECLINE-REASON-TAB
    private CobolString[] decl_code = new CobolString[10];
    private CobolString[] decl_desc = new CobolString[10];
    private CobolString ws_ims_variables = new CobolString(1); // Group: WS-IMS-VARIABLES
    private CobolString psb_name = new CobolString(8);
    private CobolString pcb_offset = new CobolString(1); // Group: PCB-OFFSET
    private short paut_pcb_num = (short) 0;
    private CobolString ims_return_code = new CobolString(2);
    private CobolString ws_ims_psb_schd_flg = new CobolString(1);
    private CobolString ws_fraud_data = new CobolString(1); // Group: WS-FRAUD-DATA
    private int ws_frd_acct_id = 0;
    private int ws_frd_cust_id = 0;
    private CobolString ws_fraud_auth_record = new CobolString(200);
    private CobolString ws_fraud_status_record = new CobolString(1); // Group: WS-FRAUD-STATUS-RECORD
    private CobolString ws_frd_action = new CobolString(1);
    private CobolString ws_frd_update_status = new CobolString(1);
    private CobolString ws_frd_act_msg = new CobolString(50);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString[] lk_commarea = new CobolString[32767];


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString send_erase_yes = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString cdemo_cpvd_fraud_data = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString dfhpf5 = new CobolString(256); // fallback
    private CobolString dfhpf8 = new CobolString(256); // fallback
    private CobolString copau1ao = new CobolString(256); // fallback
    private CobolString cdemo_acct_id = new CobolString(256); // fallback
    private CobolString cdemo_cpvd_pau_selected = new CobolString(256); // fallback
    private CobolString ims_psb_schd = new CobolString(256); // fallback
    private CobolString ims_psb_not_schd = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString pa_fraud_confirmed = new CobolString(256); // fallback
    private CobolString pa_fraud_removed = new CobolString(256); // fallback
    private CobolString ws_remove_fraud = new CobolString(256); // fallback
    private CobolString ws_report_fraud = new CobolString(256); // fallback
    private CobolString pending_auth_details = new CobolString(256); // fallback
    private CobolString cdemo_cust_id = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString link = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString nohandle = new CobolString(256); // fallback
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString eibresp = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString ws_frd_updt_success = new CobolString(256); // fallback
    private CobolString pa_authorization_key = new CobolString(256); // fallback
    private CobolString auths_eof = new CobolString(256); // fallback
    private CobolString send_erase_no = new CobolString(256); // fallback
    private CobolString pa_card_num = new CobolString(256); // fallback
    private CobolString cardnumo = new CobolString(256); // fallback
    private CobolString pa_auth_orig_date = new CobolString(256); // fallback
    private CobolString ws_curdate_yy = new CobolString(256); // fallback
    private CobolString ws_curdate_mm = new CobolString(256); // fallback
    private CobolString ws_curdate_dd = new CobolString(256); // fallback
    private CobolString ws_curdate_mm_dd_yy = new CobolString(256); // fallback
    private CobolString authdto = new CobolString(256); // fallback
    private CobolString pa_auth_orig_time = new CobolString(256); // fallback
    private CobolString authtmo = new CobolString(256); // fallback
    private CobolString pa_approved_amt = new CobolString(256); // fallback
    private CobolString authamto = new CobolString(256); // fallback
    private CobolString pa_auth_resp_code = new CobolString(256); // fallback
    private CobolString authrspo = new CobolString(256); // fallback
    private CobolString dfhgreen = new CobolString(256); // fallback
    private CobolString authrspc = new CobolString(256); // fallback
    private CobolString dfhred = new CobolString(256); // fallback
    private CobolString pa_processing_code = new CobolString(256); // fallback
    private CobolString authcdo = new CobolString(256); // fallback
    private CobolString pa_pos_entry_mode = new CobolString(256); // fallback
    private CobolString posemdo = new CobolString(256); // fallback
    private CobolString pa_message_source = new CobolString(256); // fallback
    private CobolString authsrco = new CobolString(256); // fallback
    private CobolString pa_merchant_catagory_code = new CobolString(256); // fallback
    private CobolString mcccdo = new CobolString(256); // fallback
    private CobolString pa_card_expiry_date = new CobolString(256); // fallback
    private CobolString crdexpo = new CobolString(256); // fallback
    private CobolString pa_auth_type = new CobolString(256); // fallback
    private CobolString authtypo = new CobolString(256); // fallback
    private CobolString pa_transaction_id = new CobolString(256); // fallback
    private CobolString trnido = new CobolString(256); // fallback
    private CobolString pa_match_status = new CobolString(256); // fallback
    private CobolString authmtco = new CobolString(256); // fallback
    private CobolString pa_auth_fraud = new CobolString(256); // fallback
    private CobolString authfrdo = new CobolString(256); // fallback
    private CobolString pa_fraud_rpt_date = new CobolString(256); // fallback
    private CobolString pa_merchant_name = new CobolString(256); // fallback
    private CobolString mernameo = new CobolString(256); // fallback
    private CobolString pa_merchant_id = new CobolString(256); // fallback
    private CobolString merido = new CobolString(256); // fallback
    private CobolString pa_merchant_city = new CobolString(256); // fallback
    private CobolString mercityo = new CobolString(256); // fallback
    private CobolString pa_merchant_state = new CobolString(256); // fallback
    private CobolString mersto = new CobolString(256); // fallback
    private CobolString pa_merchant_zip = new CobolString(256); // fallback
    private CobolString merzipo = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString cdemo_pgm_context = new CobolString(256); // fallback
    private CobolString cdemo_pgm_enter = new CobolString(256); // fallback
    private CobolString cardnuml = new CobolString(256); // fallback
    private CobolString ws_curdate_data = new CobolString(256); // fallback
    private CobolString ccda_title01 = new CobolString(256); // fallback
    private CobolString title01o = new CobolString(256); // fallback
    private CobolString ccda_title02 = new CobolString(256); // fallback
    private CobolString title02o = new CobolString(256); // fallback
    private CobolString trnnameo = new CobolString(256); // fallback
    private CobolString pgmnameo = new CobolString(256); // fallback
    private CobolString ws_curdate_month = new CobolString(256); // fallback
    private CobolString ws_curdate_day = new CobolString(256); // fallback
    private CobolString ws_curdate_year = new CobolString(256); // fallback
    private CobolString curdateo = new CobolString(256); // fallback
    private CobolString ws_curtime_hours = new CobolString(256); // fallback
    private CobolString ws_curtime_hh = new CobolString(256); // fallback
    private CobolString ws_curtime_minute = new CobolString(256); // fallback
    private CobolString ws_curtime_mm = new CobolString(256); // fallback
    private CobolString ws_curtime_second = new CobolString(256); // fallback
    private CobolString ws_curtime_ss = new CobolString(256); // fallback
    private CobolString ws_curtime_hh_mm_ss = new CobolString(256); // fallback
    private CobolString curtimeo = new CobolString(256); // fallback
    private CobolString pa_acct_id = new CobolString(256); // fallback
    private CobolString dli = new CobolString(256); // fallback
    private CobolString gu = new CobolString(256); // fallback
    private CobolString using = new CobolString(256); // fallback
    private CobolString[] pcb = new CobolString[100]; // fallback array
    private CobolString[] segment = new CobolString[100]; // fallback array
    private CobolString pautsum0 = new CobolString(256); // fallback
    private CobolString[] into = new CobolString[100]; // fallback array
    private CobolString pending_auth_summary = new CobolString(256); // fallback
    private CobolString[] where = new CobolString[100]; // fallback array
    private CobolString accntid = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString dibstat = new CobolString(256); // fallback
    private CobolString status_ok = new CobolString(256); // fallback
    private CobolString auths_not_eof = new CobolString(256); // fallback
    private CobolString segment_not_found = new CobolString(256); // fallback
    private CobolString end_of_db = new CobolString(256); // fallback
    private CobolString repl = new CobolString(256); // fallback
    private CobolString pautdtl1 = new CobolString(256); // fallback
    private CobolString[] from = new CobolString[100]; // fallback array
    private CobolString psb_scheduled_more_than_once = new CobolString(256); // fallback

    private void main_para() {
        err_flg_off.set(String.valueOf(cb_true));
        send_erase_yes.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            carddemo_commarea.set("");
            cdemo_to_program.set(String.valueOf(ws_pgm_auth_smry));
            return_to_prev_screen();
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, Integer.parseInt(String.valueOf(eibcalen).trim()))));
            cdemo_cpvd_fraud_data.set(String.valueOf(" "));
            if (!(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
                cdemo_pgm_reenter.set(String.valueOf(cb_true));
                process_enter_key();
                send_authview_screen();
            } else {
                receive_authview_screen();
                if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                    process_enter_key();
                    send_authview_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                    cdemo_to_program.set(String.valueOf(ws_pgm_auth_smry));
                    return_to_prev_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf5))) {
                    mark_auth_fraud();
                    send_authview_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf8))) {
                    process_pf8_key();
                    send_authview_screen();
                } else {
                    process_enter_key();
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_authview_screen();
                }
            }
        }
        /* RAW: EXEC CICS */
        /* RETURN TRANSID */
        /* RAW: ( WS-CICS-TRANID ) COMMAREA ( CARDDEMO-COMMAREA */
    }

    private void end_exec() {
    }

    private void process_enter_key() {
        copau1ao.set(String.valueOf("\u0000"));
        if (((CobolIntrinsics.isNumeric(cdemo_acct_id) && !String.valueOf(cdemo_cpvd_pau_selected).equals(String.valueOf(" "))) && true)) {
            ws_acct_id = new BigDecimal(String.valueOf(cdemo_acct_id).trim()).intValue();
            ws_auth_key.set(String.valueOf(cdemo_cpvd_pau_selected));
            read_auth_record();
            if (!String.valueOf(ims_psb_schd).trim().isEmpty()) {
                ims_psb_not_schd.set(String.valueOf(cb_true));
                take_syncpoint();
            }
        } else {
            err_flg_on.set(String.valueOf(cb_true));
        }
        populate_auth_details();
    }

    private void mark_auth_fraud() {
        ws_acct_id = new BigDecimal(String.valueOf(cdemo_acct_id).trim()).intValue();
        ws_auth_key.set(String.valueOf(cdemo_cpvd_pau_selected));
        read_auth_record();
        if (!String.valueOf(pa_fraud_confirmed).trim().isEmpty()) {
            pa_fraud_removed.set(String.valueOf(cb_true));
            ws_remove_fraud.set(String.valueOf(cb_true));
        } else {
            pa_fraud_confirmed.set(String.valueOf(cb_true));
            ws_report_fraud.set(String.valueOf(cb_true));
        }
        ws_fraud_auth_record.set(String.valueOf(pending_auth_details));
        ws_frd_acct_id = new BigDecimal(String.valueOf(cdemo_acct_id).trim()).intValue();
        ws_frd_cust_id = new BigDecimal(String.valueOf(cdemo_cust_id).trim()).intValue();
        exec.set(String.valueOf(cdemo_cust_id));
        cics.set(String.valueOf(cdemo_cust_id));
        link.set(String.valueOf(cdemo_cust_id));
        if (program[Integer.parseInt(String.valueOf(ws_pgm_auth_fraud).trim()) - 1] == null) program[Integer.parseInt(String.valueOf(ws_pgm_auth_fraud).trim()) - 1] = new CobolString(256);
        program[Integer.parseInt(String.valueOf(ws_pgm_auth_fraud).trim()) - 1].set(String.valueOf(cdemo_cust_id));
        if (commarea[Integer.parseInt(String.valueOf(ws_fraud_data).trim()) - 1] == null) commarea[Integer.parseInt(String.valueOf(ws_fraud_data).trim()) - 1] = new CobolString(256);
        commarea[Integer.parseInt(String.valueOf(ws_fraud_data).trim()) - 1].set(String.valueOf(cdemo_cust_id));
        nohandle.set(String.valueOf(cdemo_cust_id));
        end_exec.set(String.valueOf(cdemo_cust_id));
        if (String.valueOf(eibresp).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            if (!String.valueOf(ws_frd_updt_success).trim().isEmpty()) {
                update_auth_details();
            } else {
                ws_message.set(String.valueOf(ws_frd_act_msg));
                roll_back();
            }
        } else {
            roll_back();
        }
        cdemo_cpvd_pau_selected.set(String.valueOf(pa_authorization_key));
        populate_auth_details();
    }

    private void process_pf8_key() {
        ws_acct_id = new BigDecimal(String.valueOf(cdemo_acct_id).trim()).intValue();
        ws_auth_key.set(String.valueOf(cdemo_cpvd_pau_selected));
        read_auth_record();
        read_next_auth_record();
        if (!String.valueOf(ims_psb_schd).trim().isEmpty()) {
            ims_psb_not_schd.set(String.valueOf(cb_true));
            take_syncpoint();
        }
        if (!String.valueOf(auths_eof).trim().isEmpty()) {
            send_erase_no.set(String.valueOf(cb_true));
            ws_message.set(String.valueOf("Already at the last Authorization..."));
        } else {
            cdemo_cpvd_pau_selected.set(String.valueOf(pa_authorization_key));
            populate_auth_details();
        }
    }

    private void populate_auth_details() {
        if (!String.valueOf(err_flg_off).trim().isEmpty()) {
            cardnumo.set(String.valueOf(pa_card_num));
            ws_curdate_yy.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 1, 2)));
            ws_curdate_mm.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 3, 2)));
            ws_curdate_dd.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 5, 2)));
            ws_auth_date.set(String.valueOf(ws_curdate_mm_dd_yy));
            authdto.set(String.valueOf(ws_auth_date));
            ws_auth_time.setRefMod(1, 2, String.valueOf(CobolString.refMod(pa_auth_orig_time, 1, 2)));
            ws_auth_time.setRefMod(4, 2, String.valueOf(CobolString.refMod(pa_auth_orig_time, 3, 2)));
            ws_auth_time.setRefMod(7, 2, String.valueOf(CobolString.refMod(pa_auth_orig_time, 5, 2)));
            authtmo.set(String.valueOf(ws_auth_time));
            ws_auth_amt.set(String.valueOf(pa_approved_amt));
            authamto.set(String.valueOf(ws_auth_amt));
            if (String.valueOf(pa_auth_resp_code).equals(String.valueOf("00"))) {
                authrspo.set(String.valueOf("A"));
                authrspc.set(String.valueOf(dfhgreen));
            } else {
                authrspo.set(String.valueOf("D"));
                authrspc.set(String.valueOf(dfhred));
            }
            /* SEARCH ALL WS-DECLINE-REASON-TAB — binary search */
            {
                boolean _found = false;
                /* Binary search implementation needed */
                if (!_found) {
    // authrsno.set(String.valueOf("9999"));
    // authrsno.setRefMod(5, 1, String.valueOf("-"));
    // authrsno.setRefMod(6, String.valueOf("ERROR"));
                }
            }
            authcdo.set(String.valueOf(pa_processing_code));
            posemdo.set(String.valueOf(pa_pos_entry_mode));
            authsrco.set(String.valueOf(pa_message_source));
            mcccdo.set(String.valueOf(pa_merchant_catagory_code));
            crdexpo.setRefMod(1, 2, String.valueOf(CobolString.refMod(pa_card_expiry_date, 1, 2)));
            crdexpo.setRefMod(3, 1, String.valueOf("/"));
            crdexpo.setRefMod(4, 2, String.valueOf(CobolString.refMod(pa_card_expiry_date, 3, 2)));
            authtypo.set(String.valueOf(pa_auth_type));
            trnido.set(String.valueOf(pa_transaction_id));
            authmtco.set(String.valueOf(pa_match_status));
            if ((!String.valueOf(pa_fraud_confirmed).trim().isEmpty() || !String.valueOf(pa_fraud_removed).trim().isEmpty())) {
                authfrdo.setRefMod(1, 1, String.valueOf(pa_auth_fraud));
                authfrdo.setRefMod(2, 1, String.valueOf("-"));
                authfrdo.setRefMod(3, String.valueOf(pa_fraud_rpt_date));
            } else {
                authfrdo.set(String.valueOf("-"));
            }
            mernameo.set(String.valueOf(pa_merchant_name));
            merido.set(String.valueOf(pa_merchant_id));
            mercityo.set(String.valueOf(pa_merchant_city));
            mersto.set(String.valueOf(pa_merchant_state));
            merzipo.set(String.valueOf(pa_merchant_zip));
        }
    }

    private void return_to_prev_screen() {
        cdemo_from_tranid.set(String.valueOf(ws_cics_tranid));
        cdemo_from_program.set(String.valueOf(ws_pgm_auth_dtl));
        cdemo_pgm_context.set(String.valueOf(0));
        cdemo_pgm_enter.set(String.valueOf(cb_true));
        /* RAW: EXEC CICS XCTL PROGRAM ( CDEMO-TO-PROGRAM */
    }

    private void end_exec_2() {
    }

    private void send_authview_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        cardnuml.set(String.valueOf(-1));
        if (!String.valueOf(send_erase_yes).trim().isEmpty()) {
            /* RAW: EXEC CICS SEND MAP ( 'COPAU1A' */
        } else {
            /* RAW: EXEC CICS SEND MAP ( 'COPAU1A' */
        }
    }

    private void receive_authview_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COPAU1A' */
    }

    private void end_exec_3() {
    }

    private void populate_header_info() {
        ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
        title01o.set(String.valueOf(ccda_title01));
        title02o.set(String.valueOf(ccda_title02));
        trnnameo.set(String.valueOf(ws_cics_tranid));
        pgmnameo.set(String.valueOf(ws_pgm_auth_dtl));
        ws_curdate_mm.set(String.valueOf(ws_curdate_month));
        ws_curdate_dd.set(String.valueOf(ws_curdate_day));
        ws_curdate_yy.set(String.valueOf(CobolString.refMod(ws_curdate_year, 3, 2)));
        curdateo.set(String.valueOf(ws_curdate_mm_dd_yy));
        ws_curtime_hh.set(String.valueOf(ws_curtime_hours));
        ws_curtime_mm.set(String.valueOf(ws_curtime_minute));
        ws_curtime_ss.set(String.valueOf(ws_curtime_second));
        curtimeo.set(String.valueOf(ws_curtime_hh_mm_ss));
    }

    private void read_auth_record() {
        schedule_psb();
        pa_acct_id.set(String.valueOf(ws_acct_id));
        pa_authorization_key.set(String.valueOf(ws_auth_key));
        exec.set(String.valueOf(ws_auth_key));
        dli.set(String.valueOf(ws_auth_key));
        gu.set(String.valueOf(ws_auth_key));
        using.set(String.valueOf(ws_auth_key));
        if (pcb[paut_pcb_num - 1] == null) pcb[paut_pcb_num - 1] = new CobolString(256);
        pcb[paut_pcb_num - 1].set(String.valueOf(ws_auth_key));
        if (segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1] == null) segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1] = new CobolString(256);
        segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1].set(String.valueOf(ws_auth_key));
        if (into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1] == null) into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1] = new CobolString(256);
        into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1].set(String.valueOf(ws_auth_key));
    // if (where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1] == null) where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1] = new CobolString(256);
    // where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1].set(String.valueOf(ws_auth_key));
        end_exec.set(String.valueOf(ws_auth_key));
        ims_return_code.set(String.valueOf(dibstat));
        if (!String.valueOf(status_ok).trim().isEmpty()) {
            auths_not_eof.set(String.valueOf(cb_true));
        } else if (!String.valueOf(segment_not_found).trim().isEmpty()) {
        } else if (!String.valueOf(end_of_db).trim().isEmpty()) {
            auths_eof.set(String.valueOf(cb_true));
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append(" System error while reading Auth Summary: Code:");
                _sb.append(String.valueOf(ims_return_code));
                ws_message.set(_sb.toString());
            }
            send_authview_screen();
        }
        if (!String.valueOf(auths_not_eof).trim().isEmpty()) {
            /* RAW: EXEC DLI GNP USING PCB ( */
            ims_return_code.set(String.valueOf(dibstat));
            if (!String.valueOf(status_ok).trim().isEmpty()) {
                auths_not_eof.set(String.valueOf(cb_true));
            } else if (!String.valueOf(segment_not_found).trim().isEmpty()) {
            } else if (!String.valueOf(end_of_db).trim().isEmpty()) {
                auths_eof.set(String.valueOf(cb_true));
            } else {
                ws_err_flg.set(String.valueOf("Y"));
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(" System error while reading Auth Details: Code:");
                    _sb.append(String.valueOf(ims_return_code));
                    ws_message.set(_sb.toString());
                }
                send_authview_screen();
            }
        }
    }

    private void read_next_auth_record() {
        /* RAW: EXEC DLI GNP USING PCB ( */
        ims_return_code.set(String.valueOf(dibstat));
        if (!String.valueOf(status_ok).trim().isEmpty()) {
            auths_not_eof.set(String.valueOf(cb_true));
        } else if (!String.valueOf(segment_not_found).trim().isEmpty()) {
        } else if (!String.valueOf(end_of_db).trim().isEmpty()) {
            auths_eof.set(String.valueOf(cb_true));
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append(" System error while reading next Auth: Code:");
                _sb.append(String.valueOf(ims_return_code));
                ws_message.set(_sb.toString());
            }
            send_authview_screen();
        }
    }

    private void update_auth_details() {
        pending_auth_details.set(String.valueOf(ws_fraud_auth_record));
        CobolDisplay.display("RPT DT: " + String.valueOf(pa_fraud_rpt_date) + String.valueOf(exec) + String.valueOf(dli) + String.valueOf(repl) + String.valueOf(using) + String.valueOf(pcb[paut_pcb_num - 1]) + String.valueOf(segment[Integer.parseInt(String.valueOf(pautdtl1).trim()) - 1]) + String.valueOf(from[Integer.parseInt(String.valueOf(pending_auth_details).trim()) - 1]) + String.valueOf(end_exec));
        ims_return_code.set(String.valueOf(dibstat));
        if (!String.valueOf(status_ok).trim().isEmpty()) {
            take_syncpoint();
            if (!String.valueOf(pa_fraud_removed).trim().isEmpty()) {
                ws_message.set(String.valueOf("AUTH FRAUD REMOVED..."));
            } else {
                ws_message.set(String.valueOf("AUTH MARKED FRAUD..."));
            }
        } else {
            roll_back();
            ws_err_flg.set(String.valueOf("Y"));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append(" System error while FRAUD Tagging, ROLLBACK||");
                _sb.append(String.valueOf(ims_return_code));
                ws_message.set(_sb.toString());
            }
            send_authview_screen();
        }
    }

    private void take_syncpoint() {
        /* RAW: EXEC CICS SYNCPOINT */
    }

    private void end_exec_4() {
    }

    private void roll_back() {
        /* RAW: EXEC CICS SYNCPOINT ROLLBACK */
    }

    private void end_exec_5() {
    }

    private void schedule_psb() {
        /* RAW: EXEC DLI SCHD PSB ( ( */
        ims_return_code.set(String.valueOf(dibstat));
        if (!String.valueOf(psb_scheduled_more_than_once).trim().isEmpty()) {
            /* RAW: EXEC DLI TERM END-EXEC EXEC DLI */
            ims_return_code.set(String.valueOf(dibstat));
        }
        if (!String.valueOf(status_ok).trim().isEmpty()) {
            ims_psb_schd.set(String.valueOf(cb_true));
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append(" System error while scheduling PSB: Code:");
                _sb.append(String.valueOf(ims_return_code));
                ws_message.set(_sb.toString());
            }
            send_authview_screen();
        }
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Copaus1c().run();
    }
}
