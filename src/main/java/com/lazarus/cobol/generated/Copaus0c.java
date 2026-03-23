package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Copaus0c extends CobolProgram {
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
    private CobolString ws_variables = new CobolString(1); // Group: WS-VARIABLES
    private CobolString ws_pgm_auth_smry = new CobolString(8);
    private CobolString ws_pgm_auth_dtl = new CobolString(8);
    private CobolString ws_pgm_menu = new CobolString(8);
    private CobolString ws_cics_tranid = new CobolString(4);
    private CobolString ws_message = new CobolString(80);
    private CobolString ws_acctfilename = new CobolString(8);
    private CobolString ws_custfilename = new CobolString(8);
    private CobolString ws_cardfilename = new CobolString(8);
    private CobolString ws_cardxrefname_acct_path = new CobolString(8);
    private CobolString ws_ccxref_file = new CobolString(8);
    private CobolString ws_acct_id = new CobolString(11);
    private CobolString ws_auth_key_save = new CobolString(8);
    private CobolString ws_auth_aprv_stat = new CobolString(1);
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private int ws_resp_cd_dis = 0;
    private int ws_reas_cd_dis = 0;
    private short ws_rec_count = (short) 0;
    private short ws_idx = (short) 0;
    private short ws_page_num = (short) 0;
    private CobolString ws_auth_amt = new CobolString(1);
    private CobolString ws_display_amt12 = new CobolString(1);
    private CobolString ws_display_amt9 = new CobolString(1);
    private int ws_display_count = 0;
    private CobolString ws_auth_date = new CobolString(8);
    private CobolString ws_auth_time = new CobolString(8);
    private CobolString ws_xref_rid = new CobolString(1); // Group: WS-XREF-RID
    private CobolString ws_card_rid_cardnum = new CobolString(16);
    private int ws_card_rid_cust_id = 0;
    private CobolString ws_card_rid_cust_id_x = new CobolString(9);
    private int ws_card_rid_acct_id = 0;
    private CobolString ws_card_rid_acct_id_x = new CobolString(11);
    private CobolString ws_ims_variables = new CobolString(1); // Group: WS-IMS-VARIABLES
    private CobolString psb_name = new CobolString(8);
    private CobolString pcb_offset = new CobolString(1); // Group: PCB-OFFSET
    private short paut_pcb_num = (short) 0;
    private CobolString ims_return_code = new CobolString(2);
    private CobolString ws_ims_psb_schd_flg = new CobolString(1);
    private CobolString ws_switches = new CobolString(1); // Group: WS-SWITCHES
    private CobolString ws_xref_read_flg = new CobolString(1);
    private CobolString ws_acct_master_read_flg = new CobolString(1);
    private CobolString ws_cust_master_read_flg = new CobolString(1);
    private CobolString ws_paut_smry_seg_flg = new CobolString(1);
    private CobolString ws_err_flg = new CobolString(1);
    private CobolString ws_auths_eof = new CobolString(1);
    private CobolString ws_send_erase_flg = new CobolString(1);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString[] lk_commarea = new CobolString[32767];


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile dataset = new CobolFile("DATASET", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString auths_not_eof = new CobolString(256); // fallback
    private CobolString next_page_no = new CobolString(256); // fallback
    private CobolString send_erase_yes = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString acctidl = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString copau0ao = new CobolString(256); // fallback
    private CobolString cdemo_acct_id = new CobolString(256); // fallback
    private CobolString acctido = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString dfhpf7 = new CobolString(256); // fallback
    private CobolString dfhpf8 = new CobolString(256); // fallback
    private CobolString acctidi = new CobolString(256); // fallback
    private CobolString cdemo_cpvs_pau_sel_flg = new CobolString(256); // fallback
    private CobolString cdemo_cpvs_pau_selected = new CobolString(256); // fallback
    private CobolString sel0001i = new CobolString(256); // fallback
    private CobolString[] cdemo_cpvs_auth_keys = new CobolString[100]; // fallback array
    private CobolString sel0002i = new CobolString(256); // fallback
    private CobolString sel0003i = new CobolString(256); // fallback
    private CobolString sel0004i = new CobolString(256); // fallback
    private CobolString sel0005i = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString cdemo_pgm_context = new CobolString(256); // fallback
    private CobolString cdemo_pgm_enter = new CobolString(256); // fallback
    private CobolString cdemo_cpvs_page_num = new CobolString(256); // fallback
    private CobolString found_paut_smry_seg = new CobolString(256); // fallback
    private CobolString[] cdemo_cpvs_paukey_prev_pg = new CobolString[100]; // fallback array
    private CobolString send_erase_no = new CobolString(256); // fallback
    private CobolString next_page_yes = new CobolString(256); // fallback
    private CobolString cdemo_cpvs_paukey_last = new CobolString(256); // fallback
    private CobolString auths_eof = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString pa_authorization_key = new CobolString(256); // fallback
    private CobolString dibstat = new CobolString(256); // fallback
    private CobolString status_ok = new CobolString(256); // fallback
    private CobolString segment_not_found = new CobolString(256); // fallback
    private CobolString end_of_db = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString dli = new CobolString(256); // fallback
    private CobolString gnp = new CobolString(256); // fallback
    private CobolString using = new CobolString(256); // fallback
    private CobolString[] pcb = new CobolString[100]; // fallback array
    private CobolString[] segment = new CobolString[100]; // fallback array
    private CobolString pautdtl1 = new CobolString(256); // fallback
    private CobolString[] into = new CobolString[100]; // fallback array
    private CobolString pending_auth_details = new CobolString(256); // fallback
    private CobolString[] where = new CobolString[100]; // fallback array
    private CobolString paut9cts = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString pa_approved_amt = new CobolString(256); // fallback
    private CobolString pa_auth_orig_time = new CobolString(256); // fallback
    private CobolString pa_auth_orig_date = new CobolString(256); // fallback
    private CobolString ws_curdate_yy = new CobolString(256); // fallback
    private CobolString ws_curdate_mm = new CobolString(256); // fallback
    private CobolString ws_curdate_dd = new CobolString(256); // fallback
    private CobolString ws_curdate_mm_dd_yy = new CobolString(256); // fallback
    private CobolString pa_auth_resp_code = new CobolString(256); // fallback
    private CobolString pa_transaction_id = new CobolString(256); // fallback
    private CobolString trnid01i = new CobolString(256); // fallback
    private CobolString pdate01i = new CobolString(256); // fallback
    private CobolString ptime01i = new CobolString(256); // fallback
    private CobolString pa_auth_type = new CobolString(256); // fallback
    private CobolString ptype01i = new CobolString(256); // fallback
    private CobolString paprv01i = new CobolString(256); // fallback
    private CobolString pa_match_status = new CobolString(256); // fallback
    private CobolString pstat01i = new CobolString(256); // fallback
    private CobolString pamt001i = new CobolString(256); // fallback
    private CobolString dfhbmunp = new CobolString(256); // fallback
    private CobolString sel0001a = new CobolString(256); // fallback
    private CobolString trnid02i = new CobolString(256); // fallback
    private CobolString pdate02i = new CobolString(256); // fallback
    private CobolString ptime02i = new CobolString(256); // fallback
    private CobolString ptype02i = new CobolString(256); // fallback
    private CobolString paprv02i = new CobolString(256); // fallback
    private CobolString pstat02i = new CobolString(256); // fallback
    private CobolString pamt002i = new CobolString(256); // fallback
    private CobolString sel0002a = new CobolString(256); // fallback
    private CobolString trnid03i = new CobolString(256); // fallback
    private CobolString pdate03i = new CobolString(256); // fallback
    private CobolString ptime03i = new CobolString(256); // fallback
    private CobolString ptype03i = new CobolString(256); // fallback
    private CobolString paprv03i = new CobolString(256); // fallback
    private CobolString pstat03i = new CobolString(256); // fallback
    private CobolString pamt003i = new CobolString(256); // fallback
    private CobolString sel0003a = new CobolString(256); // fallback
    private CobolString trnid04i = new CobolString(256); // fallback
    private CobolString pdate04i = new CobolString(256); // fallback
    private CobolString ptime04i = new CobolString(256); // fallback
    private CobolString ptype04i = new CobolString(256); // fallback
    private CobolString paprv04i = new CobolString(256); // fallback
    private CobolString pstat04i = new CobolString(256); // fallback
    private CobolString pamt004i = new CobolString(256); // fallback
    private CobolString sel0004a = new CobolString(256); // fallback
    private CobolString trnid05i = new CobolString(256); // fallback
    private CobolString pdate05i = new CobolString(256); // fallback
    private CobolString ptime05i = new CobolString(256); // fallback
    private CobolString ptype05i = new CobolString(256); // fallback
    private CobolString paprv05i = new CobolString(256); // fallback
    private CobolString pstat05i = new CobolString(256); // fallback
    private CobolString pamt005i = new CobolString(256); // fallback
    private CobolString sel0005a = new CobolString(256); // fallback
    private CobolString dfhbmpro = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString ims_psb_schd = new CobolString(256); // fallback
    private CobolString ims_psb_not_schd = new CobolString(256); // fallback
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
    private CobolString cust_id = new CobolString(256); // fallback
    private CobolString custido = new CobolString(256); // fallback
    private CobolString cust_first_name = new CobolString(256); // fallback
    private CobolString cust_middle_name = new CobolString(256); // fallback
    private CobolString cust_last_name = new CobolString(256); // fallback
    private CobolString cnameo = new CobolString(256); // fallback
    private CobolString cust_addr_line_1 = new CobolString(256); // fallback
    private CobolString cust_addr_line_2 = new CobolString(256); // fallback
    private CobolString addr001o = new CobolString(256); // fallback
    private CobolString cust_addr_line_3 = new CobolString(256); // fallback
    private CobolString cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString cust_addr_zip = new CobolString(256); // fallback
    private CobolString addr002o = new CobolString(256); // fallback
    private CobolString cust_phone_num_1 = new CobolString(256); // fallback
    private CobolString phone1o = new CobolString(256); // fallback
    private CobolString acct_credit_limit = new CobolString(256); // fallback
    private CobolString credlimo = new CobolString(256); // fallback
    private CobolString acct_cash_credit_limit = new CobolString(256); // fallback
    private CobolString cashlimo = new CobolString(256); // fallback
    private CobolString pa_approved_auth_cnt = new CobolString(256); // fallback
    private CobolString apprcnto = new CobolString(256); // fallback
    private CobolString pa_declined_auth_cnt = new CobolString(256); // fallback
    private CobolString declcnto = new CobolString(256); // fallback
    private CobolString pa_credit_balance = new CobolString(256); // fallback
    private CobolString credbalo = new CobolString(256); // fallback
    private CobolString pa_cash_balance = new CobolString(256); // fallback
    private CobolString cashbalo = new CobolString(256); // fallback
    private CobolString pa_approved_auth_amt = new CobolString(256); // fallback
    private CobolString appramto = new CobolString(256); // fallback
    private CobolString pa_declined_auth_amt = new CobolString(256); // fallback
    private CobolString declamto = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString xref_cust_id = new CobolString(256); // fallback
    private CobolString cdemo_cust_id = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString cdemo_card_num = new CobolString(256); // fallback
    private CobolString notfnd = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString pa_acct_id = new CobolString(256); // fallback
    private CobolString gu = new CobolString(256); // fallback
    private CobolString pautsum0 = new CobolString(256); // fallback
    private CobolString pending_auth_summary = new CobolString(256); // fallback
    private CobolString accntid = new CobolString(256); // fallback
    private CobolString nfound_paut_smry_seg = new CobolString(256); // fallback
    private CobolString psb_scheduled_more_than_once = new CobolString(256); // fallback

    private void main_para() {
        err_flg_off.set(String.valueOf(cb_true));
        auths_not_eof.set(String.valueOf(cb_true));
        next_page_no.set(String.valueOf(cb_true));
        send_erase_yes.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        acctidl.set(String.valueOf(-1));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            carddemo_commarea.set("");
            cdemo_to_program.set(String.valueOf(ws_pgm_auth_smry));
            cdemo_pgm_reenter.set(String.valueOf(cb_true));
            copau0ao.set(String.valueOf("\u0000"));
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, Integer.parseInt(String.valueOf(eibcalen).trim()))));
            if (!(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
                cdemo_pgm_reenter.set(String.valueOf(cb_true));
                copau0ao.set(String.valueOf("\u0000"));
                if (CobolIntrinsics.isNumeric(cdemo_acct_id)) {
                    ws_acct_id.set(String.valueOf(cdemo_acct_id));
                    acctido.set(String.valueOf(cdemo_acct_id));
                } else {
                    acctido.set(String.valueOf(" "));
                    ws_acct_id.set(String.valueOf("\u0000"));
                }
                gather_details();
                send_erase_yes.set(String.valueOf(cb_true));
                send_paulst_screen();
            } else {
                receive_paulst_screen();
                if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                    process_enter_key();
                    if (String.valueOf(ws_acct_id).equals(String.valueOf("\u0000"))) {
                        acctido.set(String.valueOf(" "));
                    } else {
                        acctido.set(String.valueOf(ws_acct_id));
                    }
                    send_paulst_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                    cdemo_to_program.set(String.valueOf(ws_pgm_menu));
                    return_to_prev_screen();
                    send_paulst_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf7))) {
                    process_pf7_key();
                    send_paulst_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf8))) {
                    process_pf8_key();
                    send_paulst_screen();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    acctidl.set(String.valueOf(-1));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_paulst_screen();
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
        if ((String.valueOf(acctidi).equals(String.valueOf(" ")) || true)) {
            ws_acct_id.set(String.valueOf("\u0000"));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Please enter Acct Id..."));
            acctidl.set(String.valueOf(-1));
        } else {
            if (!CobolIntrinsics.isNumeric(acctidi)) {
                ws_acct_id.set(String.valueOf("\u0000"));
                ws_err_flg.set(String.valueOf("Y"));
                ws_message.set(String.valueOf("Acct Id must be Numeric ..."));
                acctidl.set(String.valueOf(-1));
            } else {
                ws_acct_id.set(String.valueOf(acctidi));
                cdemo_acct_id.set(String.valueOf(acctidi));
                if (!String.valueOf(sel0001i).trim().isEmpty()) {
                    /* RAW: NOT = SPACES AND LOW-VALUES */
                    cdemo_cpvs_pau_sel_flg.set(String.valueOf(sel0001i));
                    cdemo_cpvs_pau_selected.set(String.valueOf(cdemo_cpvs_auth_keys[1 - 1]));
                } else if (!String.valueOf(sel0002i).trim().isEmpty()) {
                    /* RAW: NOT = SPACES AND LOW-VALUES */
                    cdemo_cpvs_pau_sel_flg.set(String.valueOf(sel0002i));
                    cdemo_cpvs_pau_selected.set(String.valueOf(cdemo_cpvs_auth_keys[2 - 1]));
                } else if (!String.valueOf(sel0003i).trim().isEmpty()) {
                    /* RAW: NOT = SPACES AND LOW-VALUES */
                    cdemo_cpvs_pau_sel_flg.set(String.valueOf(sel0003i));
                    cdemo_cpvs_pau_selected.set(String.valueOf(cdemo_cpvs_auth_keys[3 - 1]));
                } else if (!String.valueOf(sel0004i).trim().isEmpty()) {
                    /* RAW: NOT = SPACES AND LOW-VALUES */
                    cdemo_cpvs_pau_sel_flg.set(String.valueOf(sel0004i));
                    cdemo_cpvs_pau_selected.set(String.valueOf(cdemo_cpvs_auth_keys[4 - 1]));
                } else if (!String.valueOf(sel0005i).trim().isEmpty()) {
                    /* RAW: NOT = SPACES AND LOW-VALUES */
                    cdemo_cpvs_pau_sel_flg.set(String.valueOf(sel0005i));
                    cdemo_cpvs_pau_selected.set(String.valueOf(cdemo_cpvs_auth_keys[5 - 1]));
                } else {
                    cdemo_cpvs_pau_sel_flg.set(String.valueOf(" "));
                    cdemo_cpvs_pau_selected.set(String.valueOf(" "));
                }
                if (((!String.valueOf(cdemo_cpvs_pau_sel_flg).equals(String.valueOf(" ")) && true) && (!String.valueOf(cdemo_cpvs_pau_selected).equals(String.valueOf(" ")) && true))) {
                    if (String.valueOf(cdemo_cpvs_pau_sel_flg).equals(String.valueOf("S"))) {
                    } else if (String.valueOf(cdemo_cpvs_pau_sel_flg).equals(String.valueOf("s"))) {
                        cdemo_to_program.set(String.valueOf(ws_pgm_auth_dtl));
                        cdemo_from_tranid.set(String.valueOf(ws_cics_tranid));
                        cdemo_from_program.set(String.valueOf(ws_pgm_auth_smry));
                        cdemo_pgm_context.set(String.valueOf(0));
                        cdemo_pgm_enter.set(String.valueOf(cb_true));
                        /* RAW: EXEC CICS XCTL PROGRAM ( CDEMO-TO-PROGRAM */
                    } else {
                        ws_message.set(String.valueOf("Invalid selection. Valid value is S"));
                        acctidl.set(String.valueOf(-1));
                    }
                }
            }
        }
        gather_details();
    }

    private void gather_details() {
        acctidl.set(String.valueOf(-1));
        cdemo_cpvs_page_num.set(String.valueOf(0));
        if (!String.valueOf(ws_acct_id).equals(String.valueOf("\u0000"))) {
            gather_account_details();
            initialize_auth_data();
            if (!String.valueOf(found_paut_smry_seg).trim().isEmpty()) {
                process_page_forward();
            }
        }
    }

    private void process_pf7_key() {
        if (Integer.parseInt(String.valueOf(cdemo_cpvs_page_num).trim()) > 1) {
            cdemo_cpvs_page_num.set(String.valueOf((Integer.parseInt(String.valueOf(cdemo_cpvs_page_num).trim()) - 1)));
            ws_auth_key_save.set(String.valueOf(cdemo_cpvs_paukey_prev_pg[Integer.parseInt(String.valueOf(cdemo_cpvs_page_num).trim()) - 1]));
            get_auth_summary();
            send_erase_no.set(String.valueOf(cb_true));
            next_page_yes.set(String.valueOf(cb_true));
            acctidl.set(String.valueOf(-1));
            initialize_auth_data();
            process_page_forward();
        } else {
            ws_message.set(String.valueOf("You are already at the top of the page..."));
            send_erase_no.set(String.valueOf(cb_true));
        }
    }

    private void process_pf8_key() {
        if ((String.valueOf(cdemo_cpvs_paukey_last).equals(String.valueOf(" ")) || true)) {
            ws_auth_key_save.set(String.valueOf("\u0000"));
        } else {
            ws_auth_key_save.set(String.valueOf(cdemo_cpvs_paukey_last));
            get_auth_summary();
            reposition_authorizations();
        }
        acctidl.set(String.valueOf(-1));
        send_erase_no.set(String.valueOf(cb_true));
        if (!String.valueOf(next_page_yes).trim().isEmpty()) {
            initialize_auth_data();
            process_page_forward();
        } else {
            ws_message.set(String.valueOf("You are already at the bottom of the page..."));
        }
    }

    private void process_page_forward() {
        if (!String.valueOf(err_flg_off).trim().isEmpty()) {
            ws_idx = new BigDecimal(String.valueOf(1).trim()).shortValue();
            cdemo_cpvs_paukey_last.set(String.valueOf("\u0000"));
            while (!(((ws_idx > 5 || !String.valueOf(auths_eof).trim().isEmpty()) || !String.valueOf(err_flg_on).trim().isEmpty()))) {
                if ((String.valueOf(eibaid).equals(String.valueOf(dfhpf7)) && ws_idx == 1)) {
                    reposition_authorizations();
                } else {
                    get_authorizations();
                }
                if ((!String.valueOf(auths_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                    populate_auth_list();
                    ws_idx = new BigDecimal(String.valueOf((ws_idx + 1)).trim()).shortValue();
                    cdemo_cpvs_paukey_last.set(String.valueOf(pa_authorization_key));
                    if (ws_idx == 2) {
                        cdemo_cpvs_page_num.set(String.valueOf((Integer.parseInt(String.valueOf(cdemo_cpvs_page_num).trim()) + 1)));
                        if (cdemo_cpvs_paukey_prev_pg[Integer.parseInt(String.valueOf(cdemo_cpvs_page_num).trim()) - 1] == null) cdemo_cpvs_paukey_prev_pg[Integer.parseInt(String.valueOf(cdemo_cpvs_page_num).trim()) - 1] = new CobolString(256);
                        cdemo_cpvs_paukey_prev_pg[Integer.parseInt(String.valueOf(cdemo_cpvs_page_num).trim()) - 1].set(String.valueOf(pa_authorization_key));
                    }
                }
            }
            if ((!String.valueOf(auths_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                get_authorizations();
                if ((!String.valueOf(auths_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                    next_page_yes.set(String.valueOf(cb_true));
                } else {
                    next_page_no.set(String.valueOf(cb_true));
                }
            }
        }
    }

    private void get_authorizations() {
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
                _sb.append(" System error while reading AUTH Details: Code:");
                _sb.append(String.valueOf(ims_return_code));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        }
    }

    private void reposition_authorizations() {
        pa_authorization_key.set(String.valueOf(ws_auth_key_save));
        exec.set(String.valueOf(ws_auth_key_save));
        dli.set(String.valueOf(ws_auth_key_save));
        gnp.set(String.valueOf(ws_auth_key_save));
        using.set(String.valueOf(ws_auth_key_save));
        if (pcb[paut_pcb_num - 1] == null) pcb[paut_pcb_num - 1] = new CobolString(256);
        pcb[paut_pcb_num - 1].set(String.valueOf(ws_auth_key_save));
        if (segment[Integer.parseInt(String.valueOf(pautdtl1).trim()) - 1] == null) segment[Integer.parseInt(String.valueOf(pautdtl1).trim()) - 1] = new CobolString(256);
        segment[Integer.parseInt(String.valueOf(pautdtl1).trim()) - 1].set(String.valueOf(ws_auth_key_save));
        if (into[Integer.parseInt(String.valueOf(pending_auth_details).trim()) - 1] == null) into[Integer.parseInt(String.valueOf(pending_auth_details).trim()) - 1] = new CobolString(256);
        into[Integer.parseInt(String.valueOf(pending_auth_details).trim()) - 1].set(String.valueOf(ws_auth_key_save));
    // if (where[Integer.parseInt(String.valueOf(paut9cts).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_authorization_key).trim()) - 1] == null) where[Integer.parseInt(String.valueOf(paut9cts).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_authorization_key).trim()) - 1] = new CobolString(256);
    // where[Integer.parseInt(String.valueOf(paut9cts).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_authorization_key).trim()) - 1].set(String.valueOf(ws_auth_key_save));
        end_exec.set(String.valueOf(ws_auth_key_save));
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
                _sb.append(" System error while repos. AUTH Details: Code:");
                _sb.append(String.valueOf(ims_return_code));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        }
    }

    private void populate_auth_list() {
        ws_auth_amt.set(String.valueOf(pa_approved_amt));
        ws_auth_time.setRefMod(1, 2, String.valueOf(CobolString.refMod(pa_auth_orig_time, 1, 2)));
        ws_auth_time.setRefMod(4, 2, String.valueOf(CobolString.refMod(pa_auth_orig_time, 3, 2)));
        ws_auth_time.setRefMod(7, 2, String.valueOf(CobolString.refMod(pa_auth_orig_time, 5, 2)));
        ws_curdate_yy.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 1, 2)));
        ws_curdate_mm.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 3, 2)));
        ws_curdate_dd.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 5, 2)));
        ws_auth_date.set(String.valueOf(ws_curdate_mm_dd_yy));
        if (String.valueOf(pa_auth_resp_code).equals(String.valueOf("00"))) {
            ws_auth_aprv_stat.set(String.valueOf("A"));
        } else {
            ws_auth_aprv_stat.set(String.valueOf("D"));
        }
        if (ws_idx == 1) {
            if (cdemo_cpvs_auth_keys[1 - 1] == null) cdemo_cpvs_auth_keys[1 - 1] = new CobolString(256);
            cdemo_cpvs_auth_keys[1 - 1].set(String.valueOf(pa_authorization_key));
            trnid01i.set(String.valueOf(pa_transaction_id));
            pdate01i.set(String.valueOf(ws_auth_date));
            ptime01i.set(String.valueOf(ws_auth_time));
            ptype01i.set(String.valueOf(pa_auth_type));
            paprv01i.set(String.valueOf(ws_auth_aprv_stat));
            pstat01i.set(String.valueOf(pa_match_status));
            pamt001i.set(String.valueOf(ws_auth_amt));
            sel0001a.set(String.valueOf(dfhbmunp));
        } else if (ws_idx == 2) {
            if (cdemo_cpvs_auth_keys[2 - 1] == null) cdemo_cpvs_auth_keys[2 - 1] = new CobolString(256);
            cdemo_cpvs_auth_keys[2 - 1].set(String.valueOf(pa_authorization_key));
            trnid02i.set(String.valueOf(pa_transaction_id));
            pdate02i.set(String.valueOf(ws_auth_date));
            ptime02i.set(String.valueOf(ws_auth_time));
            ptype02i.set(String.valueOf(pa_auth_type));
            paprv02i.set(String.valueOf(ws_auth_aprv_stat));
            pstat02i.set(String.valueOf(pa_match_status));
            pamt002i.set(String.valueOf(ws_auth_amt));
            sel0002a.set(String.valueOf(dfhbmunp));
        } else if (ws_idx == 3) {
            if (cdemo_cpvs_auth_keys[3 - 1] == null) cdemo_cpvs_auth_keys[3 - 1] = new CobolString(256);
            cdemo_cpvs_auth_keys[3 - 1].set(String.valueOf(pa_authorization_key));
            trnid03i.set(String.valueOf(pa_transaction_id));
            pdate03i.set(String.valueOf(ws_auth_date));
            ptime03i.set(String.valueOf(ws_auth_time));
            ptype03i.set(String.valueOf(pa_auth_type));
            paprv03i.set(String.valueOf(ws_auth_aprv_stat));
            pstat03i.set(String.valueOf(pa_match_status));
            pamt003i.set(String.valueOf(ws_auth_amt));
            sel0003a.set(String.valueOf(dfhbmunp));
        } else if (ws_idx == 4) {
            if (cdemo_cpvs_auth_keys[4 - 1] == null) cdemo_cpvs_auth_keys[4 - 1] = new CobolString(256);
            cdemo_cpvs_auth_keys[4 - 1].set(String.valueOf(pa_authorization_key));
            trnid04i.set(String.valueOf(pa_transaction_id));
            pdate04i.set(String.valueOf(ws_auth_date));
            ptime04i.set(String.valueOf(ws_auth_time));
            ptype04i.set(String.valueOf(pa_auth_type));
            paprv04i.set(String.valueOf(ws_auth_aprv_stat));
            pstat04i.set(String.valueOf(pa_match_status));
            pamt004i.set(String.valueOf(ws_auth_amt));
            sel0004a.set(String.valueOf(dfhbmunp));
        } else if (ws_idx == 5) {
            if (cdemo_cpvs_auth_keys[5 - 1] == null) cdemo_cpvs_auth_keys[5 - 1] = new CobolString(256);
            cdemo_cpvs_auth_keys[5 - 1].set(String.valueOf(pa_authorization_key));
            trnid05i.set(String.valueOf(pa_transaction_id));
            pdate05i.set(String.valueOf(ws_auth_date));
            ptime05i.set(String.valueOf(ws_auth_time));
            ptype05i.set(String.valueOf(pa_auth_type));
            paprv05i.set(String.valueOf(ws_auth_aprv_stat));
            pstat05i.set(String.valueOf(pa_match_status));
            pamt005i.set(String.valueOf(ws_auth_amt));
            sel0005a.set(String.valueOf(dfhbmunp));
        } else {
            /* CONTINUE */
        }
    }

    private void initialize_auth_data() {
        for (ws_idx = 1; !(ws_idx > 5); ws_idx += 1) {
            if (ws_idx == 1) {
                sel0001a.set(String.valueOf(dfhbmpro));
                trnid01i.set(String.valueOf(" "));
                pdate01i.set(String.valueOf(" "));
                ptime01i.set(String.valueOf(" "));
                ptype01i.set(String.valueOf(" "));
                paprv01i.set(String.valueOf(" "));
                pstat01i.set(String.valueOf(" "));
                pamt001i.set(String.valueOf(" "));
            } else if (ws_idx == 2) {
                sel0002a.set(String.valueOf(dfhbmpro));
                trnid02i.set(String.valueOf(" "));
                pdate02i.set(String.valueOf(" "));
                ptime02i.set(String.valueOf(" "));
                ptype02i.set(String.valueOf(" "));
                paprv02i.set(String.valueOf(" "));
                pstat02i.set(String.valueOf(" "));
                pamt002i.set(String.valueOf(" "));
            } else if (ws_idx == 3) {
                sel0003a.set(String.valueOf(dfhbmpro));
                trnid03i.set(String.valueOf(" "));
                pdate03i.set(String.valueOf(" "));
                ptime03i.set(String.valueOf(" "));
                ptype03i.set(String.valueOf(" "));
                paprv03i.set(String.valueOf(" "));
                pstat03i.set(String.valueOf(" "));
                pamt003i.set(String.valueOf(" "));
            } else if (ws_idx == 4) {
                sel0004a.set(String.valueOf(dfhbmpro));
                trnid04i.set(String.valueOf(" "));
                pdate04i.set(String.valueOf(" "));
                ptime04i.set(String.valueOf(" "));
                ptype04i.set(String.valueOf(" "));
                paprv04i.set(String.valueOf(" "));
                pstat04i.set(String.valueOf(" "));
                pamt004i.set(String.valueOf(" "));
            } else if (ws_idx == 5) {
                sel0005a.set(String.valueOf(dfhbmpro));
                trnid05i.set(String.valueOf(" "));
                pdate05i.set(String.valueOf(" "));
                ptime05i.set(String.valueOf(" "));
                ptype05i.set(String.valueOf(" "));
                paprv05i.set(String.valueOf(" "));
                pstat05i.set(String.valueOf(" "));
                pamt005i.set(String.valueOf(" "));
            } else {
                /* CONTINUE */
            }
        }
    }

    private void return_to_prev_screen() {
        if ((String.valueOf(cdemo_to_program).equals(String.valueOf("\u0000")) || true)) {
            cdemo_to_program.set(String.valueOf("COSGN00C"));
        }
        cdemo_from_tranid.set(String.valueOf(ws_cics_tranid));
        cdemo_from_program.set(String.valueOf(ws_pgm_auth_smry));
        cdemo_pgm_context.set(String.valueOf(0));
        exec.set(String.valueOf(0));
        cics.set(String.valueOf(0));
        xctl.set(String.valueOf(0));
        if (program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1] == null) program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1] = new CobolString(256);
        program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1].set(String.valueOf(0));
        if (commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] == null) commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] = new CobolString(256);
        commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1].set(String.valueOf(0));
    }

    private void end_exec_2() {
    }

    private void send_paulst_screen() {
        if (!String.valueOf(ims_psb_schd).trim().isEmpty()) {
            ims_psb_not_schd.set(String.valueOf(cb_true));
            /* RAW: EXEC CICS SYNCPOINT END-EXEC */
        }
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        if (!String.valueOf(send_erase_yes).trim().isEmpty()) {
            /* RAW: EXEC CICS SEND MAP ( 'COPAU0A' */
        } else {
            /* RAW: EXEC CICS SEND MAP ( 'COPAU0A' */
        }
    }

    private void receive_paulst_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COPAU0A' */
    }

    private void end_exec_3() {
    }

    private void populate_header_info() {
        ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
        title01o.set(String.valueOf(ccda_title01));
        title02o.set(String.valueOf(ccda_title02));
        trnnameo.set(String.valueOf(ws_cics_tranid));
        pgmnameo.set(String.valueOf(ws_pgm_auth_smry));
        ws_curdate_mm.set(String.valueOf(ws_curdate_month));
        ws_curdate_dd.set(String.valueOf(ws_curdate_day));
        ws_curdate_yy.set(String.valueOf(CobolString.refMod(ws_curdate_year, 3, 2)));
        curdateo.set(String.valueOf(ws_curdate_mm_dd_yy));
        ws_curtime_hh.set(String.valueOf(ws_curtime_hours));
        ws_curtime_mm.set(String.valueOf(ws_curtime_minute));
        ws_curtime_ss.set(String.valueOf(ws_curtime_second));
        curtimeo.set(String.valueOf(ws_curtime_hh_mm_ss));
    }

    private void gather_account_details() {
        getcardxref_byacct();
        getacctdata_byacct();
        getcustdata_bycust();
        custido.set(String.valueOf(cust_id));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_first_name), " "));
            _sb.append(" ");
            _sb.append(String.valueOf(CobolString.refMod(cust_middle_name, 1, 1)));
            _sb.append(" ");
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_last_name), " "));
            cnameo.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_addr_line_1), "  "));
            _sb.append(",");
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_addr_line_2), "  "));
            addr001o.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_addr_line_3), "  "));
            _sb.append(",");
            _sb.append(String.valueOf(cust_addr_state_cd));
            _sb.append(",");
            _sb.append(String.valueOf(CobolString.refMod(cust_addr_zip, 1, 5)));
            addr002o.set(_sb.toString());
        }
        phone1o.set(String.valueOf(cust_phone_num_1));
        ws_display_amt12.set(String.valueOf(acct_credit_limit));
        credlimo.set(String.valueOf(ws_display_amt12));
        ws_display_amt9.set(String.valueOf(acct_cash_credit_limit));
        cashlimo.set(String.valueOf(ws_display_amt9));
        get_auth_summary();
        if (!String.valueOf(found_paut_smry_seg).trim().isEmpty()) {
            ws_display_count = new BigDecimal(String.valueOf(pa_approved_auth_cnt).trim()).intValue();
            apprcnto.set(String.valueOf(ws_display_count));
            ws_display_count = new BigDecimal(String.valueOf(pa_declined_auth_cnt).trim()).intValue();
            declcnto.set(String.valueOf(ws_display_count));
            ws_display_amt12.set(String.valueOf(pa_credit_balance));
            credbalo.set(String.valueOf(ws_display_amt12));
            ws_display_amt9.set(String.valueOf(pa_cash_balance));
            cashbalo.set(String.valueOf(ws_display_amt9));
            ws_display_amt9.set(String.valueOf(pa_approved_auth_amt));
            appramto.set(String.valueOf(ws_display_amt9));
            ws_display_amt9.set(String.valueOf(pa_declined_auth_amt));
            declamto.set(String.valueOf(ws_display_amt9));
        } else {
            apprcnto.set(String.valueOf(0));
            declcnto.set(String.valueOf(0));
            credbalo.set(String.valueOf(0));
            cashbalo.set(String.valueOf(0));
            appramto.set(String.valueOf(0));
            declamto.set(String.valueOf(0));
        }
    }

    private void getcardxref_byacct() {
        ws_card_rid_acct_id_x.set(String.valueOf(ws_acct_id));
        exec.set(String.valueOf(ws_acct_id));
        cics.set(String.valueOf(ws_acct_id));
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( WS-CARDXREFNAME-ACCT-PATH ) RIDFLD ( WS-CARD-RID-ACCT-ID-X */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            cdemo_cust_id.set(String.valueOf(xref_cust_id));
            cdemo_card_num.set(String.valueOf(xref_card_num));
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_resp_cd_dis = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
            ws_reas_cd_dis = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Account:");
                _sb.append(String.valueOf(ws_acct_id));
                _sb.append(" not found in XREF file. Resp:");
                _sb.append(String.valueOf(ws_resp_cd_dis));
                _sb.append(" Reas:");
                _sb.append(String.valueOf(ws_reas_cd_dis));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            ws_resp_cd_dis = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
            ws_reas_cd_dis = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Account:");
                _sb.append(String.valueOf(ws_card_rid_acct_id_x));
                _sb.append(" System error while reading XREF file. Resp:");
                _sb.append(String.valueOf(ws_resp_cd_dis));
                _sb.append(" Reas:");
                _sb.append(String.valueOf(ws_reas_cd_dis));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        }
    }

    private void getacctdata_byacct() {
        ws_card_rid_acct_id = new BigDecimal(String.valueOf(xref_acct_id).trim()).intValue();
        exec.set(String.valueOf(xref_acct_id));
        cics.set(String.valueOf(xref_acct_id));
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( WS-ACCTFILENAME ) RIDFLD ( WS-CARD-RID-ACCT-ID-X */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_resp_cd_dis = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
            ws_reas_cd_dis = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Account:");
                _sb.append(String.valueOf(ws_card_rid_acct_id_x));
                _sb.append(" not found in ACCT file. Resp:");
                _sb.append(String.valueOf(ws_resp_cd_dis));
                _sb.append(" Reas:");
                _sb.append(String.valueOf(ws_reas_cd_dis));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            ws_resp_cd_dis = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
            ws_reas_cd_dis = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Account:");
                _sb.append(String.valueOf(ws_card_rid_acct_id_x));
                _sb.append(" System error while reading ACCT file. Resp:");
                _sb.append(String.valueOf(ws_resp_cd_dis));
                _sb.append(" Reas:");
                _sb.append(String.valueOf(ws_reas_cd_dis));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        }
    }

    private void getcustdata_bycust() {
        ws_card_rid_cust_id = new BigDecimal(String.valueOf(xref_cust_id).trim()).intValue();
        exec.set(String.valueOf(xref_cust_id));
        cics.set(String.valueOf(xref_cust_id));
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( WS-CUSTFILENAME ) RIDFLD ( WS-CARD-RID-CUST-ID-X */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_resp_cd_dis = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
            ws_reas_cd_dis = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Customer:");
                _sb.append(String.valueOf(ws_card_rid_cust_id_x));
                _sb.append(" not found in CUST file. Resp:");
                _sb.append(String.valueOf(ws_resp_cd_dis));
                _sb.append(" Reas:");
                _sb.append(String.valueOf(ws_reas_cd_dis));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            ws_resp_cd_dis = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
            ws_reas_cd_dis = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Customer:");
                _sb.append(String.valueOf(ws_card_rid_cust_id_x));
                _sb.append(" System error while reading CUST file. Resp:");
                _sb.append(String.valueOf(ws_resp_cd_dis));
                _sb.append(" Reas:");
                _sb.append(String.valueOf(ws_reas_cd_dis));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        }
    }

    private void get_auth_summary() {
        schedule_psb();
        pa_acct_id.set(String.valueOf(cdemo_acct_id));
        exec.set(String.valueOf(cdemo_acct_id));
        dli.set(String.valueOf(cdemo_acct_id));
        gu.set(String.valueOf(cdemo_acct_id));
        using.set(String.valueOf(cdemo_acct_id));
        if (pcb[paut_pcb_num - 1] == null) pcb[paut_pcb_num - 1] = new CobolString(256);
        pcb[paut_pcb_num - 1].set(String.valueOf(cdemo_acct_id));
        if (segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1] == null) segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1] = new CobolString(256);
        segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1].set(String.valueOf(cdemo_acct_id));
        if (into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1] == null) into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1] = new CobolString(256);
        into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1].set(String.valueOf(cdemo_acct_id));
    // if (where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1] == null) where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1] = new CobolString(256);
    // where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][Integer.parseInt(String.valueOf(_unnamed).trim()) - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1].set(String.valueOf(cdemo_acct_id));
        end_exec.set(String.valueOf(cdemo_acct_id));
        ims_return_code.set(String.valueOf(dibstat));
        if (!String.valueOf(status_ok).trim().isEmpty()) {
            found_paut_smry_seg.set(String.valueOf(cb_true));
        } else if (!String.valueOf(segment_not_found).trim().isEmpty()) {
            nfound_paut_smry_seg.set(String.valueOf(cb_true));
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append(" System error while reading AUTH Summary: Code:");
                _sb.append(String.valueOf(ims_return_code));
                ws_message.set(_sb.toString());
            }
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        }
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
            acctidl.set(String.valueOf(-1));
            send_paulst_screen();
        }
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Copaus0c().run();
    }
}
