package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Copaua0c extends CobolProgram {
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
    private CobolString ws_pgm_auth = new CobolString(8);
    private CobolString ws_cics_tranid = new CobolString(4);
    private CobolString ws_acctfilename = new CobolString(8);
    private CobolString ws_custfilename = new CobolString(8);
    private CobolString ws_cardfilename = new CobolString(8);
    private CobolString ws_cardfilename_acct_path = new CobolString(8);
    private CobolString ws_ccxref_file = new CobolString(8);
    private short ws_reqsts_process_limit = (short) 0;
    private short ws_msg_processed = (short) 0;
    private CobolString ws_request_qname = new CobolString(48);
    private CobolString ws_reply_qname = new CobolString(48);
    private CobolString ws_save_correlid = new CobolString(24);
    private int ws_resp_length = 0;
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private BigDecimal ws_abs_time = BigDecimal.ZERO;
    private CobolString ws_cur_date_x6 = new CobolString(6);
    private CobolString ws_cur_time_x6 = new CobolString(6);
    private int ws_cur_time_n6 = 0;
    private int ws_cur_time_ms = 0;
    private int ws_yyddd = 0;
    private BigDecimal ws_time_with_ms = BigDecimal.ZERO;
    private int ws_options = 0;
    private int ws_compcode = 0;
    private int ws_reason = 0;
    private int ws_wait_interval = 0;
    private int ws_code_display = 0;
    private BigDecimal ws_available_amt = BigDecimal.ZERO;
    private CobolString ws_transaction_amt_an = new CobolString(13);
    private BigDecimal ws_transaction_amt = BigDecimal.ZERO;
    private BigDecimal ws_approved_amt = BigDecimal.ZERO;
    private CobolString ws_approved_amt_dis = new CobolString(1);
    private CobolString ws_trigger_data = new CobolString(64);
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
    private int w01_hconn_request = 0;
    private int w01_hobj_request = 0;
    private int w01_bufflen = 0;
    private int w01_datalen = 0;
    private CobolString w01_get_buffer = new CobolString(500);
    private int w02_hconn_reply = 0;
    private int w02_bufflen = 0;
    private int w02_datalen = 0;
    private CobolString w02_put_buffer = new CobolString(200);
    private CobolString ws_switches = new CobolString(1); // Group: WS-SWITCHES
    private CobolString ws_auth_resp_flg = new CobolString(1);
    private CobolString ws_msg_loop_flg = new CobolString(1);
    private CobolString ws_msg_available_flg = new CobolString(1);
    private CobolString ws_request_mq_flg = new CobolString(1);
    private CobolString ws_reply_mq_flg = new CobolString(1);
    private CobolString ws_xref_read_flg = new CobolString(1);
    private CobolString ws_acct_master_read_flg = new CobolString(1);
    private CobolString ws_cust_master_read_flg = new CobolString(1);
    private CobolString ws_paut_smry_seg_flg = new CobolString(1);
    private CobolString ws_decline_flg = new CobolString(1);
    private CobolString ws_decline_reason_flg = new CobolString(1);
    private CobolString mqm_od_request = new CobolString(1);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString lk_commarea = new CobolString(4096);


    // FALLBACK FILE DESCRIPTORS
    private CobolFile end_exec = new CobolFile("END-EXEC", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile dataset = new CobolFile("DATASET", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString thru = new CobolString(256); // fallback
    private CobolString _1000 = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString eibresp = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString mqtm_qname = new CobolString(256); // fallback
    private CobolString mqtm_triggerdata = new CobolString(256); // fallback
    private CobolString mqot_q = new CobolString(256); // fallback
    private CobolString mqod_objecttype = new CobolString(256); // fallback
    private CobolString mqod_objectname = new CobolString(256); // fallback
    private CobolString mqoo_input_shared = new CobolString(256); // fallback
    private CobolString mqcc_ok = new CobolString(256); // fallback
    private CobolString ws_request_mq_open = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString err_location = new CobolString(256); // fallback
    private CobolString err_critical = new CobolString(256); // fallback
    private CobolString err_mq = new CobolString(256); // fallback
    private CobolString err_code_1 = new CobolString(256); // fallback
    private CobolString err_code_2 = new CobolString(256); // fallback
    private CobolString err_message = new CobolString(256); // fallback
    private CobolString dibstat = new CobolString(256); // fallback
    private CobolString psb_scheduled_more_than_once = new CobolString(256); // fallback
    private CobolString status_ok = new CobolString(256); // fallback
    private CobolString ims_psb_schd = new CobolString(256); // fallback
    private CobolString err_ims = new CobolString(256); // fallback
    private CobolString no_more_msg_available = new CobolString(256); // fallback
    private CobolString ws_loop_end = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString syncpoint = new CobolString(256); // fallback
    private CobolString ims_psb_not_schd = new CobolString(256); // fallback
    private CobolString pa_rq_auth_date = new CobolString(256); // fallback
    private CobolString pa_rq_auth_time = new CobolString(256); // fallback
    private CobolString pa_rq_card_num = new CobolString(256); // fallback
    private CobolString pa_rq_auth_type = new CobolString(256); // fallback
    private CobolString pa_rq_card_expiry_date = new CobolString(256); // fallback
    private CobolString pa_rq_message_type = new CobolString(256); // fallback
    private CobolString pa_rq_message_source = new CobolString(256); // fallback
    private CobolString pa_rq_processing_code = new CobolString(256); // fallback
    private CobolString pa_rq_merchant_catagory_code = new CobolString(256); // fallback
    private CobolString pa_rq_acqr_country_code = new CobolString(256); // fallback
    private CobolString pa_rq_pos_entry_mode = new CobolString(256); // fallback
    private CobolString pa_rq_merchant_id = new CobolString(256); // fallback
    private CobolString pa_rq_merchant_name = new CobolString(256); // fallback
    private CobolString pa_rq_merchant_city = new CobolString(256); // fallback
    private CobolString pa_rq_merchant_state = new CobolString(256); // fallback
    private CobolString pa_rq_merchant_zip = new CobolString(256); // fallback
    private CobolString pa_rq_transaction_id = new CobolString(256); // fallback
    private CobolString pa_rq_transaction_amt = new CobolString(256); // fallback
    private CobolString mqgmo_options = new CobolString(256); // fallback
    private CobolString mqgmo_no_syncpoint = new CobolString(256); // fallback
    private CobolString mqgmo_wait = new CobolString(256); // fallback
    private CobolString mqgmo_convert = new CobolString(256); // fallback
    private CobolString mqgmo_fail_if_quiescing = new CobolString(256); // fallback
    private CobolString mqgmo_waitinterval = new CobolString(256); // fallback
    private CobolString mqmi_none = new CobolString(256); // fallback
    private CobolString mqmd_msgid = new CobolString(256); // fallback
    private CobolString mqci_none = new CobolString(256); // fallback
    private CobolString mqmd_correlid = new CobolString(256); // fallback
    private CobolString mqfmt_string = new CobolString(256); // fallback
    private CobolString mqmd_format = new CobolString(256); // fallback
    private CobolString mqm_md_request = new CobolString(256); // fallback
    private CobolString mqm_get_message_options = new CobolString(256); // fallback
    private CobolString mqmd_replytoq = new CobolString(256); // fallback
    private CobolString mqrc_no_msg_available = new CobolString(256); // fallback
    private CobolString err_cics = new CobolString(256); // fallback
    private CobolString pa_card_num = new CobolString(256); // fallback
    private CobolString err_event_key = new CobolString(256); // fallback
    private CobolString approve_auth = new CobolString(256); // fallback
    private CobolString card_found_xref = new CobolString(256); // fallback
    private CobolString found_acct_in_mstr = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString notfnd = new CobolString(256); // fallback
    private CobolString card_nfound_xref = new CobolString(256); // fallback
    private CobolString nfound_acct_in_mstr = new CobolString(256); // fallback
    private CobolString err_warning = new CobolString(256); // fallback
    private CobolString err_app = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString xref_cust_id = new CobolString(256); // fallback
    private CobolString found_cust_in_mstr = new CobolString(256); // fallback
    private CobolString nfound_cust_in_mstr = new CobolString(256); // fallback
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
    private CobolString found_paut_smry_seg = new CobolString(256); // fallback
    private CobolString segment_not_found = new CobolString(256); // fallback
    private CobolString nfound_paut_smry_seg = new CobolString(256); // fallback
    private CobolString pa_rl_card_num = new CobolString(256); // fallback
    private CobolString pa_rl_transaction_id = new CobolString(256); // fallback
    private CobolString pa_rl_auth_id_code = new CobolString(256); // fallback
    private CobolString pa_credit_limit = new CobolString(256); // fallback
    private CobolString pa_credit_balance = new CobolString(256); // fallback
    private CobolString decline_auth = new CobolString(256); // fallback
    private CobolString insufficient_fund = new CobolString(256); // fallback
    private CobolString acct_credit_limit = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString auth_resp_declined = new CobolString(256); // fallback
    private CobolString pa_rl_auth_resp_code = new CobolString(256); // fallback
    private CobolString pa_rl_approved_amt = new CobolString(256); // fallback
    private CobolString auth_resp_approved = new CobolString(256); // fallback
    private CobolString pa_rl_auth_resp_reason = new CobolString(256); // fallback
    private CobolString card_not_active = new CobolString(256); // fallback
    private CobolString account_closed = new CobolString(256); // fallback
    private CobolString card_fraud = new CobolString(256); // fallback
    private CobolString merchant_fraud = new CobolString(256); // fallback
    private CobolString mqmt_reply = new CobolString(256); // fallback
    private CobolString mqmd_msgtype = new CobolString(256); // fallback
    private CobolString mqmd_replytoqmgr = new CobolString(256); // fallback
    private CobolString mqper_not_persistent = new CobolString(256); // fallback
    private CobolString mqmd_persistence = new CobolString(256); // fallback
    private CobolString mqmd_expiry = new CobolString(256); // fallback
    private CobolString mqpmo_options = new CobolString(256); // fallback
    private CobolString mqpmo_no_syncpoint = new CobolString(256); // fallback
    private CobolString mqpmo_default_context = new CobolString(256); // fallback
    private CobolString mqm_od_reply = new CobolString(256); // fallback
    private CobolString mqm_md_reply = new CobolString(256); // fallback
    private CobolString mqm_put_message_options = new CobolString(256); // fallback
    private CobolString pa_cust_id = new CobolString(256); // fallback
    private CobolString acct_cash_credit_limit = new CobolString(256); // fallback
    private CobolString pa_cash_limit = new CobolString(256); // fallback
    private CobolString pa_approved_auth_cnt = new CobolString(256); // fallback
    private CobolString pa_approved_auth_amt = new CobolString(256); // fallback
    private CobolString pa_cash_balance = new CobolString(256); // fallback
    private CobolString pa_declined_auth_cnt = new CobolString(256); // fallback
    private CobolString pa_transaction_amt = new CobolString(256); // fallback
    private CobolString pa_declined_auth_amt = new CobolString(256); // fallback
    private CobolString pa_auth_date_9c = new CobolString(256); // fallback
    private CobolString pa_auth_time_9c = new CobolString(256); // fallback
    private CobolString pa_auth_orig_date = new CobolString(256); // fallback
    private CobolString pa_auth_orig_time = new CobolString(256); // fallback
    private CobolString pa_auth_type = new CobolString(256); // fallback
    private CobolString pa_card_expiry_date = new CobolString(256); // fallback
    private CobolString pa_message_type = new CobolString(256); // fallback
    private CobolString pa_message_source = new CobolString(256); // fallback
    private CobolString pa_processing_code = new CobolString(256); // fallback
    private CobolString pa_merchant_catagory_code = new CobolString(256); // fallback
    private CobolString pa_acqr_country_code = new CobolString(256); // fallback
    private CobolString pa_pos_entry_mode = new CobolString(256); // fallback
    private CobolString pa_merchant_id = new CobolString(256); // fallback
    private CobolString pa_merchant_name = new CobolString(256); // fallback
    private CobolString pa_merchant_city = new CobolString(256); // fallback
    private CobolString pa_merchant_state = new CobolString(256); // fallback
    private CobolString pa_merchant_zip = new CobolString(256); // fallback
    private CobolString pa_transaction_id = new CobolString(256); // fallback
    private CobolString pa_auth_id_code = new CobolString(256); // fallback
    private CobolString pa_auth_resp_code = new CobolString(256); // fallback
    private CobolString pa_auth_resp_reason = new CobolString(256); // fallback
    private CobolString pa_approved_amt = new CobolString(256); // fallback
    private CobolString pa_match_pending = new CobolString(256); // fallback
    private CobolString pa_match_auth_declined = new CobolString(256); // fallback
    private CobolString pa_auth_fraud = new CobolString(256); // fallback
    private CobolString pa_fraud_rpt_date = new CobolString(256); // fallback
    private CobolString isrt = new CobolString(256); // fallback
    private CobolString pautdtl1 = new CobolString(256); // fallback
    private CobolString[] from = new CobolString[100]; // fallback array
    private CobolString pending_auth_details = new CobolString(256); // fallback
    private CobolString[] seglength = new CobolString[100]; // fallback array
    private CobolString mqco_none = new CobolString(256); // fallback
    private CobolString ws_request_mq_clse = new CobolString(256); // fallback
    private CobolString err_application = new CobolString(256); // fallback
    private CobolString err_program = new CobolString(256); // fallback
    private CobolString err_date = new CobolString(256); // fallback
    private CobolString err_time = new CobolString(256); // fallback
    private CobolString writeq = new CobolString(256); // fallback
    private CobolString td = new CobolString(256); // fallback
    private CobolString[] queue = new CobolString[100]; // fallback array
    private CobolString error_log_record = new CobolString(256); // fallback
    private CobolString[] length = new CobolString[100]; // fallback array
    private CobolString nohandle = new CobolString(256); // fallback

    private void main_para() {
    // _1000();
        /* RAW: -  */
        thru.set("");
        _1000.set("");
        _unnamed.set("");
    // break;
        /* RAW: 2000 - MAIN-PROCESS THRU 2000 - */
    // break;
        /* RAW: 9000 - */
        /* RAW: TERMINATE THRU 9000 - */
        return;
    }

    private void initialize() {
        /* RAW: EXEC CICS RETRIEVE INTO ( MQTM */
        if (String.valueOf(eibresp).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            ws_request_qname.set(String.valueOf(mqtm_qname));
            ws_trigger_data.set(String.valueOf(mqtm_triggerdata));
        }
        ws_wait_interval = new BigDecimal(String.valueOf(5000).trim()).intValue();
    // _1100();
        /* RAW: - OPEN-REQUEST-QUEUE THRU 1100 - */
    // break;
        /* RAW: 3100 - READ-REQUEST-MQ THRU 3100 - */
        return;
    }

    private void open_request_queue() {
        mqod_objecttype.set(String.valueOf(mqot_q));
        mqod_objectname.set(String.valueOf(ws_request_qname));
        ws_options = new BigDecimal(String.valueOf(mqoo_input_shared).trim()).intValue();
        CobolProgram.call("MQOPEN", w01_hconn_request, mqm_od_request, ws_options, w01_hobj_request, ws_compcode, ws_reason);
        if (String.valueOf(ws_compcode).equals(String.valueOf(mqcc_ok))) {
            ws_request_mq_open.set(String.valueOf(cb_true));
        } else {
            err_location.set(String.valueOf("M001"));
            err_critical.set(String.valueOf(cb_true));
            err_mq.set(String.valueOf(cb_true));
            ws_code_display = new BigDecimal(String.valueOf(ws_compcode).trim()).intValue();
            err_code_1.set(String.valueOf(ws_code_display));
            ws_code_display = new BigDecimal(String.valueOf(ws_reason).trim()).intValue();
            err_code_2.set(String.valueOf(ws_code_display));
            err_message.set(String.valueOf("REQ MQ OPEN ERROR"));
    // _9500();
            /* RAW: - LOG-ERROR */
        }
        /* RAW: 1100 - */
        return;
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
            err_location.set(String.valueOf("I001"));
            err_critical.set(String.valueOf(cb_true));
            err_ims.set(String.valueOf(cb_true));
            err_code_1.set(String.valueOf(ims_return_code));
            err_message.set(String.valueOf("IMS SCHD FAILED"));
    // _9500();
            /* RAW: - LOG-ERROR */
        }
        /* RAW: 1200 - */
        return;
    }

    private void main_process() {
        while (!((!String.valueOf(no_more_msg_available).trim().isEmpty() || !String.valueOf(ws_loop_end).trim().isEmpty()))) {
    // _2100();
            /* RAW: - EXTRACT-REQUEST-MSG THRU 2100 - */
            break;
            /* RAW: 5000 - PROCESS-AUTH THRU 5000 - */
    // return;
    // }
    // /* RAW: 2000 - */
    // return;
    }

    // private void extract_request_msg() {
    // /* UNSTRING — requires runtime implementation */
    // pa_rq_auth_date.set(String.valueOf(""));
    // pa_rq_auth_time.set(String.valueOf(""));
    // pa_rq_card_num.set(String.valueOf(""));
    // pa_rq_auth_type.set(String.valueOf(""));
    // pa_rq_card_expiry_date.set(String.valueOf(""));
    // pa_rq_message_type.set(String.valueOf(""));
    // pa_rq_message_source.set(String.valueOf(""));
    // pa_rq_processing_code.set(String.valueOf(""));
    // ws_transaction_amt_an.set(String.valueOf(""));
    // pa_rq_merchant_catagory_code.set(String.valueOf(""));
    // pa_rq_acqr_country_code.set(String.valueOf(""));
    // pa_rq_pos_entry_mode.set(String.valueOf(""));
    // pa_rq_merchant_id.set(String.valueOf(""));
    // pa_rq_merchant_name.set(String.valueOf(""));
    // pa_rq_merchant_city.set(String.valueOf(""));
    // pa_rq_merchant_state.set(String.valueOf(""));
    // pa_rq_merchant_zip.set(String.valueOf(""));
    // pa_rq_transaction_id.set(String.valueOf(""));
    // pa_rq_transaction_amt.set(String.valueOf(CobolIntrinsics.numval(ws_transaction_amt_an)));
    // }

    // private void ws_transaction_amt() {
    // /* RAW: 2100 - */
    // return;
    // }

    // private void read_request_mq() {
    // mqgmo_options.set(String.valueOf((((Integer.parseInt(String.valueOf(mqgmo_no_syncpoint).trim()) + Integer.parseInt(String.valueOf(mqgmo_wait).trim())) + Integer.parseInt(String.valueOf(mqgmo_convert).trim())) + Integer.parseInt(String.valueOf(mqgmo_fail_if_quiescing).trim()))));
    // mqgmo_waitinterval.set(String.valueOf(ws_wait_interval));
    // mqmd_msgid.set(String.valueOf(mqmi_none));
    // mqmd_correlid.set(String.valueOf(mqci_none));
    // mqmd_format.set(String.valueOf(mqfmt_string));
    // w01_bufflen = new BigDecimal(String.valueOf(CobolIntrinsics.length(w01_get_buffer)).trim()).intValue();
    // CobolProgram.call("MQGET", w01_hconn_request, w01_hobj_request, mqm_md_request, mqm_get_message_options, w01_bufflen, w01_get_buffer, w01_datalen, ws_compcode, ws_reason);
    // if (String.valueOf(ws_compcode).equals(String.valueOf(mqcc_ok))) {
    // ws_save_correlid.set(String.valueOf(mqmd_correlid));
    // ws_reply_qname.set(String.valueOf(mqmd_replytoq));
    // } else {
    // if (String.valueOf(ws_reason).equals(String.valueOf(mqrc_no_msg_available))) {
    // no_more_msg_available.set(String.valueOf(cb_true));
    // } else {
    // err_location.set(String.valueOf("M003"));
    // err_critical.set(String.valueOf(cb_true));
    // err_cics.set(String.valueOf(cb_true));
    // ws_code_display = new BigDecimal(String.valueOf(ws_compcode).trim()).intValue();
    // err_code_1.set(String.valueOf(ws_code_display));
    // ws_code_display = new BigDecimal(String.valueOf(ws_reason).trim()).intValue();
    // err_code_2.set(String.valueOf(ws_code_display));
    // err_message.set(String.valueOf("FAILED TO READ REQUEST MQ"));
    // err_event_key.set(String.valueOf(pa_card_num));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // }
    // /* RAW: 3100 - */
    // return;
    // }

    // private void process_auth() {
    // approve_auth.set(String.valueOf(cb_true));
    // _1200();
    // /* RAW: - SCHEDULE-PSB THRU 1200 - */
    // return;
    // }

    // private void read_xref_record() {
    // xref_card_num.set(String.valueOf(pa_rq_card_num));
    // exec.set(String.valueOf(pa_rq_card_num));
    // cics.set(String.valueOf(pa_rq_card_num));
    // if (dataset.read(null) == FileStatus.AT_END) {
    // }
    // /* RAW: ( WS-CCXREF-FILE ) INTO ( CARD-XREF-RECORD */
    // if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
    // card_found_xref.set(String.valueOf(cb_true));
    // } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
    // card_nfound_xref.set(String.valueOf(cb_true));
    // nfound_acct_in_mstr.set(String.valueOf(cb_true));
    // err_location.set(String.valueOf("A001"));
    // err_warning.set(String.valueOf(cb_true));
    // err_app.set(String.valueOf(cb_true));
    // err_message.set(String.valueOf("CARD NOT FOUND IN XREF"));
    // err_event_key.set(String.valueOf(xref_card_num));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // } else {
    // err_location.set(String.valueOf("C001"));
    // err_critical.set(String.valueOf(cb_true));
    // err_cics.set(String.valueOf(cb_true));
    // ws_code_display = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
    // err_code_1.set(String.valueOf(ws_code_display));
    // ws_code_display = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
    // err_code_2.set(String.valueOf(ws_code_display));
    // err_message.set(String.valueOf("FAILED TO READ XREF FILE"));
    // err_event_key.set(String.valueOf(xref_card_num));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // /* RAW: 5100 - */
    // return;
    // }

    // private void read_acct_record() {
    // ws_card_rid_acct_id = new BigDecimal(String.valueOf(xref_acct_id).trim()).intValue();
    // exec.set(String.valueOf(xref_acct_id));
    // cics.set(String.valueOf(xref_acct_id));
    // if (dataset.read(null) == FileStatus.AT_END) {
    // }
    // /* RAW: ( WS-ACCTFILENAME ) RIDFLD ( WS-CARD-RID-ACCT-ID-X */
    // if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
    // found_acct_in_mstr.set(String.valueOf(cb_true));
    // } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
    // nfound_acct_in_mstr.set(String.valueOf(cb_true));
    // err_location.set(String.valueOf("A002"));
    // err_warning.set(String.valueOf(cb_true));
    // err_app.set(String.valueOf(cb_true));
    // err_message.set(String.valueOf("ACCT NOT FOUND IN XREF"));
    // err_event_key.set(String.valueOf(ws_card_rid_acct_id_x));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // } else {
    // err_location.set(String.valueOf("C002"));
    // err_critical.set(String.valueOf(cb_true));
    // err_cics.set(String.valueOf(cb_true));
    // ws_code_display = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
    // err_code_1.set(String.valueOf(ws_code_display));
    // ws_code_display = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
    // err_code_2.set(String.valueOf(ws_code_display));
    // err_message.set(String.valueOf("FAILED TO READ ACCT FILE"));
    // err_event_key.set(String.valueOf(ws_card_rid_acct_id_x));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // /* RAW: 5200 - */
    // return;
    // }

    // private void read_cust_record() {
    // ws_card_rid_cust_id = new BigDecimal(String.valueOf(xref_cust_id).trim()).intValue();
    // exec.set(String.valueOf(xref_cust_id));
    // cics.set(String.valueOf(xref_cust_id));
    // if (dataset.read(null) == FileStatus.AT_END) {
    // }
    // /* RAW: ( WS-CUSTFILENAME ) RIDFLD ( WS-CARD-RID-CUST-ID-X */
    // if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
    // found_cust_in_mstr.set(String.valueOf(cb_true));
    // } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
    // nfound_cust_in_mstr.set(String.valueOf(cb_true));
    // err_location.set(String.valueOf("A003"));
    // err_warning.set(String.valueOf(cb_true));
    // err_app.set(String.valueOf(cb_true));
    // err_message.set(String.valueOf("CUST NOT FOUND IN XREF"));
    // err_event_key.set(String.valueOf(ws_card_rid_cust_id));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // } else {
    // err_location.set(String.valueOf("C003"));
    // err_critical.set(String.valueOf(cb_true));
    // err_cics.set(String.valueOf(cb_true));
    // ws_code_display = new BigDecimal(String.valueOf(ws_resp_cd).trim()).intValue();
    // err_code_1.set(String.valueOf(ws_code_display));
    // ws_code_display = new BigDecimal(String.valueOf(ws_reas_cd).trim()).intValue();
    // err_code_2.set(String.valueOf(ws_code_display));
    // err_message.set(String.valueOf("FAILED TO READ CUST FILE"));
    // err_event_key.set(String.valueOf(ws_card_rid_cust_id));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // /* RAW: 5300 - */
    // return;
    // }

    // private void read_auth_summry() {
    // pa_acct_id.set(String.valueOf(xref_acct_id));
    // exec.set(String.valueOf(xref_acct_id));
    // dli.set(String.valueOf(xref_acct_id));
    // gu.set(String.valueOf(xref_acct_id));
    // using.set(String.valueOf(xref_acct_id));
    // if (pcb[paut_pcb_num - 1] == null) pcb[paut_pcb_num - 1] = new CobolString(256);
    // pcb[paut_pcb_num - 1].set(String.valueOf(xref_acct_id));
    // if (segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1] == null) segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1] = new CobolString(256);
    // segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1].set(String.valueOf(xref_acct_id));
    // if (into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1] == null) into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1] = new CobolString(256);
    // into[Integer.parseInt(String.valueOf(pending_auth_summary).trim()) - 1].set(String.valueOf(xref_acct_id));
    // if (where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][_unnamed - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1] == null) where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][_unnamed - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1] = new CobolString(256);
    // where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][_unnamed - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1].set(String.valueOf(xref_acct_id));
    // /* MOVE to file END-EXEC — not applicable */
    // ims_return_code.set(String.valueOf(dibstat));
    // if (!String.valueOf(status_ok).trim().isEmpty()) {
    // found_paut_smry_seg.set(String.valueOf(cb_true));
    // } else if (!String.valueOf(segment_not_found).trim().isEmpty()) {
    // nfound_paut_smry_seg.set(String.valueOf(cb_true));
    // } else {
    // err_location.set(String.valueOf("I002"));
    // err_critical.set(String.valueOf(cb_true));
    // err_ims.set(String.valueOf(cb_true));
    // err_code_1.set(String.valueOf(ims_return_code));
    // err_message.set(String.valueOf("IMS GET SUMMARY FAILED"));
    // err_event_key.set(String.valueOf(pa_card_num));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // /* RAW: 5500 - */
    // return;
    // }

    // private void read_profile_data() {
    // /* CONTINUE */
    // /* RAW: 5600 - */
    // return;
    // }

    // private void make_decision() {
    // pa_rl_card_num.set(String.valueOf(pa_rq_card_num));
    // pa_rl_transaction_id.set(String.valueOf(pa_rq_transaction_id));
    // pa_rl_auth_id_code.set(String.valueOf(pa_rq_auth_time));
    // if (!String.valueOf(found_paut_smry_seg).trim().isEmpty()) {
    // ws_available_amt = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(pa_credit_limit).trim()) - Integer.parseInt(String.valueOf(pa_credit_balance).trim()))).trim());
    // if (ws_transaction_amt.compareTo(ws_available_amt) > 0) {
    // decline_auth.set(String.valueOf(cb_true));
    // insufficient_fund.set(String.valueOf(cb_true));
    // }
    // } else {
    // if (!String.valueOf(found_acct_in_mstr).trim().isEmpty()) {
    // ws_available_amt = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(acct_credit_limit).trim()) - Integer.parseInt(String.valueOf(acct_curr_bal).trim()))).trim());
    // if (ws_transaction_amt.compareTo(ws_available_amt) > 0) {
    // decline_auth.set(String.valueOf(cb_true));
    // insufficient_fund.set(String.valueOf(cb_true));
    // }
    // } else {
    // decline_auth.set(String.valueOf(cb_true));
    // }
    // }
    // if (!String.valueOf(decline_auth).trim().isEmpty()) {
    // auth_resp_declined.set(String.valueOf(cb_true));
    // pa_rl_auth_resp_code.set(String.valueOf("05"));
    // pa_rl_approved_amt.set(String.valueOf(0));
    // ws_approved_amt = new BigDecimal(String.valueOf(0).trim());
    // } else {
    // auth_resp_approved.set(String.valueOf(cb_true));
    // pa_rl_auth_resp_code.set(String.valueOf("00"));
    // pa_rl_approved_amt.set(String.valueOf(pa_rq_transaction_amt));
    // ws_approved_amt = new BigDecimal(String.valueOf(pa_rq_transaction_amt).trim());
    // }
    // pa_rl_auth_resp_reason.set(String.valueOf("0000"));
    // if (!String.valueOf(auth_resp_declined).trim().isEmpty()) {
    // if (!String.valueOf(card_nfound_xref).trim().isEmpty()) {
    // } else if (!String.valueOf(nfound_acct_in_mstr).trim().isEmpty()) {
    // } else if (!String.valueOf(nfound_cust_in_mstr).trim().isEmpty()) {
    // pa_rl_auth_resp_reason.set(String.valueOf("3100"));
    // } else if (!String.valueOf(insufficient_fund).trim().isEmpty()) {
    // pa_rl_auth_resp_reason.set(String.valueOf("4100"));
    // } else if (!String.valueOf(card_not_active).trim().isEmpty()) {
    // pa_rl_auth_resp_reason.set(String.valueOf("4200"));
    // } else if (!String.valueOf(account_closed).trim().isEmpty()) {
    // pa_rl_auth_resp_reason.set(String.valueOf("4300"));
    // } else if (!String.valueOf(card_fraud).trim().isEmpty()) {
    // pa_rl_auth_resp_reason.set(String.valueOf("5100"));
    // } else if (!String.valueOf(merchant_fraud).trim().isEmpty()) {
    // pa_rl_auth_resp_reason.set(String.valueOf("5200"));
    // } else {
    // pa_rl_auth_resp_reason.set(String.valueOf("9000"));
    // }
    // }
    // ws_approved_amt_dis.set(String.valueOf(ws_approved_amt));
    // {
    // StringBuilder _sb = new StringBuilder();
    // _sb.append(String.valueOf(pa_rl_card_num));
    // _sb.append(",");
    // _sb.append(String.valueOf(pa_rl_transaction_id));
    // _sb.append(",");
    // _sb.append(String.valueOf(pa_rl_auth_id_code));
    // _sb.append(",");
    // _sb.append(String.valueOf(pa_rl_auth_resp_code));
    // _sb.append(",");
    // _sb.append(String.valueOf(pa_rl_auth_resp_reason));
    // _sb.append(",");
    // _sb.append(String.valueOf(ws_approved_amt_dis));
    // _sb.append(",");
    // w02_put_buffer.set(_sb.toString());
    // }
    // /* RAW: 6000 - */
    // return;
    // }

    // private void send_response() {
    // mqod_objecttype.set(String.valueOf(mqot_q));
    // mqod_objectname.set(String.valueOf(ws_reply_qname));
    // mqmd_msgtype.set(String.valueOf(mqmt_reply));
    // mqmd_correlid.set(String.valueOf(ws_save_correlid));
    // mqmd_msgid.set(String.valueOf(mqmi_none));
    // mqmd_replytoq.set(String.valueOf(" "));
    // mqmd_replytoqmgr.set(String.valueOf(" "));
    // mqmd_persistence.set(String.valueOf(mqper_not_persistent));
    // mqmd_expiry.set(String.valueOf(50));
    // mqmd_format.set(String.valueOf(mqfmt_string));
    // mqpmo_options.set(String.valueOf((Integer.parseInt(String.valueOf(mqpmo_no_syncpoint).trim()) + Integer.parseInt(String.valueOf(mqpmo_default_context).trim()))));
    // w02_bufflen = new BigDecimal(String.valueOf(ws_resp_length).trim()).intValue();
    // CobolProgram.call("MQPUT1", w02_hconn_reply, mqm_od_reply, mqm_md_reply, mqm_put_message_options, w02_bufflen, w02_put_buffer, ws_compcode, ws_reason);
    // if (!String.valueOf(ws_compcode).equals(String.valueOf(mqcc_ok))) {
    // err_location.set(String.valueOf("M004"));
    // err_critical.set(String.valueOf(cb_true));
    // err_mq.set(String.valueOf(cb_true));
    // ws_code_display = new BigDecimal(String.valueOf(ws_compcode).trim()).intValue();
    // err_code_1.set(String.valueOf(ws_code_display));
    // ws_code_display = new BigDecimal(String.valueOf(ws_reason).trim()).intValue();
    // err_code_2.set(String.valueOf(ws_code_display));
    // err_message.set(String.valueOf("FAILED TO PUT ON REPLY MQ"));
    // err_event_key.set(String.valueOf(pa_card_num));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // /* RAW: 7100 - */
    // return;
    // }

    // private void write_auth_to_db() {
    // _8400();
    // /* RAW: - UPDATE-SUMMARY THRU 8400 - */
    // break;
    // /* RAW: 8500 - INSERT-AUTH THRU 8500 - */
    // return;
    // }

    // private void update_summary() {
    // if (!String.valueOf(nfound_paut_smry_seg).trim().isEmpty()) {
    // pending_auth_summary.set("");
    // pa_acct_id.set(String.valueOf(xref_acct_id));
    // pa_cust_id.set(String.valueOf(xref_cust_id));
    // }
    // pa_credit_limit.set(String.valueOf(acct_credit_limit));
    // pa_cash_limit.set(String.valueOf(acct_cash_credit_limit));
    // if (!String.valueOf(auth_resp_approved).trim().isEmpty()) {
    // pa_approved_auth_cnt.set(new BigDecimal(String.valueOf(pa_approved_auth_cnt).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
    // pa_approved_auth_amt.set(new BigDecimal(String.valueOf(pa_approved_auth_amt).trim()).add(new BigDecimal(String.valueOf(ws_approved_amt).trim())).toPlainString());
    // pa_credit_balance.set(new BigDecimal(String.valueOf(pa_credit_balance).trim()).add(new BigDecimal(String.valueOf(ws_approved_amt).trim())).toPlainString());
    // pa_cash_balance.set(String.valueOf(0));
    // } else {
    // pa_declined_auth_cnt.set(new BigDecimal(String.valueOf(pa_declined_auth_cnt).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
    // pa_declined_auth_amt.set(new BigDecimal(String.valueOf(pa_declined_auth_amt).trim()).add(new BigDecimal(String.valueOf(pa_transaction_amt).trim())).toPlainString());
    // }
    // if (!String.valueOf(found_paut_smry_seg).trim().isEmpty()) {
    // /* RAW: EXEC DLI REPL USING PCB ( */
    // } else {
    // /* RAW: EXEC DLI ISRT USING PCB ( */
    // }
    // ims_return_code.set(String.valueOf(dibstat));
    // if (!String.valueOf(status_ok).trim().isEmpty()) {
    // /* CONTINUE */
    // } else {
    // err_location.set(String.valueOf("I003"));
    // err_critical.set(String.valueOf(cb_true));
    // err_ims.set(String.valueOf(cb_true));
    // err_code_1.set(String.valueOf(ims_return_code));
    // err_message.set(String.valueOf("IMS UPDATE SUMRY FAILED"));
    // err_event_key.set(String.valueOf(pa_card_num));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // /* RAW: 8400 - */
    // return;
    // }

    // private void insert_auth() {
    // /* RAW: EXEC CICS ASKTIME NOHANDLE ABSTIME ( */
    // ws_yyddd = new BigDecimal(String.valueOf(CobolString.refMod(ws_cur_date_x6, 1, 5)).trim()).intValue();
    // ws_cur_time_n6 = new BigDecimal(String.valueOf(ws_cur_time_x6).trim()).intValue();
    // ws_time_with_ms = new BigDecimal(String.valueOf((((ws_cur_time_n6 * 1000)) + ws_cur_time_ms)).trim());
    // pa_auth_date_9c.set(String.valueOf((99999 - ws_yyddd)));
    // pa_auth_time_9c.set(String.valueOf(new BigDecimal(String.valueOf(999999999).trim()).subtract(ws_time_with_ms)));
    // pa_auth_orig_date.set(String.valueOf(pa_rq_auth_date));
    // pa_auth_orig_time.set(String.valueOf(pa_rq_auth_time));
    // pa_card_num.set(String.valueOf(pa_rq_card_num));
    // pa_auth_type.set(String.valueOf(pa_rq_auth_type));
    // pa_card_expiry_date.set(String.valueOf(pa_rq_card_expiry_date));
    // pa_message_type.set(String.valueOf(pa_rq_message_type));
    // pa_message_source.set(String.valueOf(pa_rq_message_source));
    // pa_processing_code.set(String.valueOf(pa_rq_processing_code));
    // pa_transaction_amt.set(String.valueOf(pa_rq_transaction_amt));
    // pa_merchant_catagory_code.set(String.valueOf(pa_rq_merchant_catagory_code));
    // pa_acqr_country_code.set(String.valueOf(pa_rq_acqr_country_code));
    // pa_pos_entry_mode.set(String.valueOf(pa_rq_pos_entry_mode));
    // pa_merchant_id.set(String.valueOf(pa_rq_merchant_id));
    // pa_merchant_name.set(String.valueOf(pa_rq_merchant_name));
    // pa_merchant_city.set(String.valueOf(pa_rq_merchant_city));
    // pa_merchant_state.set(String.valueOf(pa_rq_merchant_state));
    // pa_merchant_zip.set(String.valueOf(pa_rq_merchant_zip));
    // pa_transaction_id.set(String.valueOf(pa_rq_transaction_id));
    // pa_auth_id_code.set(String.valueOf(pa_rl_auth_id_code));
    // pa_auth_resp_code.set(String.valueOf(pa_rl_auth_resp_code));
    // pa_auth_resp_reason.set(String.valueOf(pa_rl_auth_resp_reason));
    // pa_approved_amt.set(String.valueOf(pa_rl_approved_amt));
    // if (!String.valueOf(auth_resp_approved).trim().isEmpty()) {
    // pa_match_pending.set(String.valueOf(cb_true));
    // } else {
    // pa_match_auth_declined.set(String.valueOf(cb_true));
    // }
    // pa_auth_fraud.set(String.valueOf(" "));
    // pa_fraud_rpt_date.set(String.valueOf(" "));
    // pa_acct_id.set(String.valueOf(xref_acct_id));
    // exec.set(String.valueOf(xref_acct_id));
    // dli.set(String.valueOf(xref_acct_id));
    // isrt.set(String.valueOf(xref_acct_id));
    // using.set(String.valueOf(xref_acct_id));
    // if (pcb[paut_pcb_num - 1] == null) pcb[paut_pcb_num - 1] = new CobolString(256);
    // pcb[paut_pcb_num - 1].set(String.valueOf(xref_acct_id));
    // if (segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1] == null) segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1] = new CobolString(256);
    // segment[Integer.parseInt(String.valueOf(pautsum0).trim()) - 1].set(String.valueOf(xref_acct_id));
    // if (where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][_unnamed - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1] == null) where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][_unnamed - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1] = new CobolString(256);
    // where[Integer.parseInt(String.valueOf(accntid).trim()) - 1][_unnamed - 1][Integer.parseInt(String.valueOf(pa_acct_id).trim()) - 1].set(String.valueOf(xref_acct_id));
    // if (segment[Integer.parseInt(String.valueOf(pautdtl1).trim()) - 1] == null) segment[Integer.parseInt(String.valueOf(pautdtl1).trim()) - 1] = new CobolString(256);
    // segment[Integer.parseInt(String.valueOf(pautdtl1).trim()) - 1].set(String.valueOf(xref_acct_id));
    // if (from[Integer.parseInt(String.valueOf(pending_auth_details).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(pending_auth_details).trim()) - 1] = new CobolString(256);
    // from[Integer.parseInt(String.valueOf(pending_auth_details).trim()) - 1].set(String.valueOf(xref_acct_id));
    // if (seglength[CobolIntrinsics.length(pending_auth_details) - 1] == null) seglength[CobolIntrinsics.length(pending_auth_details) - 1] = new CobolString(256);
    // seglength[CobolIntrinsics.length(pending_auth_details) - 1].set(String.valueOf(xref_acct_id));
    // /* MOVE to file END-EXEC — not applicable */
    // ims_return_code.set(String.valueOf(dibstat));
    // if (!String.valueOf(status_ok).trim().isEmpty()) {
    // /* CONTINUE */
    // } else {
    // err_location.set(String.valueOf("I004"));
    // err_critical.set(String.valueOf(cb_true));
    // err_ims.set(String.valueOf(cb_true));
    // err_code_1.set(String.valueOf(ims_return_code));
    // err_message.set(String.valueOf("IMS INSERT DETL FAILED"));
    // err_event_key.set(String.valueOf(pa_card_num));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // /* RAW: 8500 - */
    // return;
    // }

    // private void terminate() {
    // if (!String.valueOf(ims_psb_schd).trim().isEmpty()) {
    // /* RAW: EXEC DLI TERM END-EXEC */
    // }
    // _9100();
    // /* RAW: - CLOSE-REQUEST-QUEUE THRU 9100 - */
    // return;
    // }

    // private void close_request_queue() {
    // if (!String.valueOf(ws_request_mq_open).trim().isEmpty()) {
    // CobolProgram.call("MQCLOSE", w01_hconn_request, w01_hobj_request, mqco_none, ws_compcode, ws_reason);
    // if (String.valueOf(ws_compcode).equals(String.valueOf(mqcc_ok))) {
    // ws_request_mq_clse.set(String.valueOf(cb_true));
    // } else {
    // err_location.set(String.valueOf("M005"));
    // err_warning.set(String.valueOf(cb_true));
    // err_mq.set(String.valueOf(cb_true));
    // ws_code_display = new BigDecimal(String.valueOf(ws_compcode).trim()).intValue();
    // err_code_1.set(String.valueOf(ws_code_display));
    // ws_code_display = new BigDecimal(String.valueOf(ws_reason).trim()).intValue();
    // err_code_2.set(String.valueOf(ws_code_display));
    // err_message.set(String.valueOf("FAILED TO CLOSE REQUEST MQ"));
    // _9500();
    // /* RAW: - LOG-ERROR */
    // }
    // }
    // /* RAW: 9100 - */
    // return;
    // }

    // private void log_error() {
    // /* RAW: EXEC CICS ASKTIME NOHANDLE ABSTIME ( */
    // err_application.set(String.valueOf(ws_cics_tranid));
    // err_program.set(String.valueOf(ws_pgm_auth));
    // err_date.set(String.valueOf(ws_cur_date_x6));
    // err_time.set(String.valueOf(ws_cur_time_x6));
    // exec.set(String.valueOf(ws_cur_time_x6));
    // cics.set(String.valueOf(ws_cur_time_x6));
    // writeq.set(String.valueOf(ws_cur_time_x6));
    // td.set(String.valueOf(ws_cur_time_x6));
    // if (queue[0 /* non-numeric literal: CSSL */ - 1] == null) queue[0 /* non-numeric literal: CSSL */ - 1] = new CobolString(256);
    // queue[0 /* non-numeric literal: CSSL */ - 1].set(String.valueOf(ws_cur_time_x6));
    // if (from[Integer.parseInt(String.valueOf(error_log_record).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(error_log_record).trim()) - 1] = new CobolString(256);
    // from[Integer.parseInt(String.valueOf(error_log_record).trim()) - 1].set(String.valueOf(ws_cur_time_x6));
    // if (length[CobolIntrinsics.length(error_log_record) - 1] == null) length[CobolIntrinsics.length(error_log_record) - 1] = new CobolString(256);
    // length[CobolIntrinsics.length(error_log_record) - 1].set(String.valueOf(ws_cur_time_x6));
    // nohandle.set(String.valueOf(ws_cur_time_x6));
    // /* MOVE to file END-EXEC — not applicable */
    // if (!String.valueOf(err_critical).trim().isEmpty()) {
    // _9990();
    // /* RAW: - END-ROUTINE */
    // }
    // /* RAW: 9500 - */
    // return;
    // }

    // private void end_routine() {
    // _9000();
    // /* RAW: -  */
    // /* RAW: TERMINATE EXEC CICS */
    // /* RETURN END-EXEC */
    // /* RAW: 9990 - */
    // return;
    // }

    // private void _1000() { /* stub — external/COPY */ }

    // private void _1100() { /* stub — external/COPY */ }

    // private void _9500() { /* stub — external/COPY */ }

    // private void _2100() { /* stub — external/COPY */ }

    // private void _3100() { /* stub — external/COPY */ }

    // private void _1200() { /* stub — external/COPY */ }

    // private void _5100() { /* stub — external/COPY */ }

    // private void _5200() { /* stub — external/COPY */ }

    // private void _6000() { /* stub — external/COPY */ }

    // private void _8000() { /* stub — external/COPY */ }

    // private void _8400() { /* stub — external/COPY */ }

    // private void _9100() { /* stub — external/COPY */ }

    // private void _9990() { /* stub — external/COPY */ }

    // private void _9000() { /* stub — external/COPY */ }

    }
    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Copaua0c().run();
    }
}
