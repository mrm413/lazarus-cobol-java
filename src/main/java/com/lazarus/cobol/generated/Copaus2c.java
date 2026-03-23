package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Copaus2c extends CobolProgram {
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
    private CobolString ws_pgmname = new CobolString(8);
    private short ws_length = (short) 0;
    private int ws_auth_time = 0;
    private CobolString ws_auth_time_an = new CobolString(9);
    private CobolString ws_auth_ts = new CobolString(1); // Group: WS-AUTH-TS
    private CobolString ws_auth_yy = new CobolString(2);
    private CobolString ws_auth_mm = new CobolString(2);
    private CobolString ws_auth_dd = new CobolString(2);
    private CobolString ws_auth_hh = new CobolString(2);
    private CobolString ws_auth_mi = new CobolString(2);
    private CobolString ws_auth_ss = new CobolString(2);
    private CobolString ws_auth_sss = new CobolString(3);
    private CobolString ws_err_flg = new CobolString(1);
    private CobolString ws_sqlcode = new CobolString(1);
    private CobolString ws_sqlstate = new CobolString(1);
    private BigDecimal ws_abs_time = BigDecimal.ZERO;
    private CobolString ws_cur_date = new CobolString(8);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private int ws_acct_id = 0;
    private int ws_cust_id = 0;
    private CobolString ws_fraud_auth_record = new CobolString(1);


    // FALLBACK FILE DESCRIPTORS
    private CobolFile end_exec = new CobolFile("END-EXEC", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString pa_fraud_rpt_date = new CobolString(256); // fallback
    private CobolString pa_auth_orig_date = new CobolString(256); // fallback
    private CobolString pa_auth_time_9c = new CobolString(256); // fallback
    private CobolString pa_card_num = new CobolString(256); // fallback
    private CobolString card_num = new CobolString(256); // fallback
    private CobolString auth_ts = new CobolString(256); // fallback
    private CobolString pa_auth_type = new CobolString(256); // fallback
    private CobolString auth_type = new CobolString(256); // fallback
    private CobolString pa_card_expiry_date = new CobolString(256); // fallback
    private CobolString card_expiry_date = new CobolString(256); // fallback
    private CobolString pa_message_type = new CobolString(256); // fallback
    private CobolString message_type = new CobolString(256); // fallback
    private CobolString pa_message_source = new CobolString(256); // fallback
    private CobolString message_source = new CobolString(256); // fallback
    private CobolString pa_auth_id_code = new CobolString(256); // fallback
    private CobolString auth_id_code = new CobolString(256); // fallback
    private CobolString pa_auth_resp_code = new CobolString(256); // fallback
    private CobolString auth_resp_code = new CobolString(256); // fallback
    private CobolString pa_auth_resp_reason = new CobolString(256); // fallback
    private CobolString auth_resp_reason = new CobolString(256); // fallback
    private CobolString pa_processing_code = new CobolString(256); // fallback
    private CobolString processing_code = new CobolString(256); // fallback
    private CobolString pa_transaction_amt = new CobolString(256); // fallback
    private CobolString transaction_amt = new CobolString(256); // fallback
    private CobolString pa_approved_amt = new CobolString(256); // fallback
    private CobolString approved_amt = new CobolString(256); // fallback
    private CobolString pa_merchant_catagory_code = new CobolString(256); // fallback
    private CobolString merchant_catagory_code = new CobolString(256); // fallback
    private CobolString pa_acqr_country_code = new CobolString(256); // fallback
    private CobolString acqr_country_code = new CobolString(256); // fallback
    private CobolString pa_pos_entry_mode = new CobolString(256); // fallback
    private CobolString pos_entry_mode = new CobolString(256); // fallback
    private CobolString pa_merchant_id = new CobolString(256); // fallback
    private CobolString merchant_id = new CobolString(256); // fallback
    private CobolString pa_merchant_name = new CobolString(256); // fallback
    private CobolString merchant_name_len = new CobolString(256); // fallback
    private CobolString merchant_name_text = new CobolString(256); // fallback
    private CobolString pa_merchant_city = new CobolString(256); // fallback
    private CobolString merchant_city = new CobolString(256); // fallback
    private CobolString pa_merchant_state = new CobolString(256); // fallback
    private CobolString merchant_state = new CobolString(256); // fallback
    private CobolString pa_merchant_zip = new CobolString(256); // fallback
    private CobolString merchant_zip = new CobolString(256); // fallback
    private CobolString pa_transaction_id = new CobolString(256); // fallback
    private CobolString transaction_id = new CobolString(256); // fallback
    private CobolString pa_match_status = new CobolString(256); // fallback
    private CobolString match_status = new CobolString(256); // fallback
    private CobolString ws_frd_action = new CobolString(256); // fallback
    private CobolString auth_fraud = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString cust_id = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString sql = new CobolString(256); // fallback
    private CobolString insert = new CobolString(256); // fallback
    private CobolString into = new CobolString(256); // fallback
    private CobolString sqlcode = new CobolString(256); // fallback
    private CobolString ws_frd_updt_success = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString ws_frd_act_msg = new CobolString(256); // fallback
    private CobolString ws_frd_updt_failed = new CobolString(256); // fallback
    private CobolString sqlstate = new CobolString(256); // fallback
    private CobolString cb_if = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString fraud_rpt_date = new CobolString(256); // fallback
    private CobolString current = new CobolString(256); // fallback
    private CobolString date = new CobolString(256); // fallback
    private CobolString where = new CobolString(256); // fallback
    private CobolString and = new CobolString(256); // fallback
    private CobolString timestamp_format = new CobolString(256); // fallback
    private CobolString yy_mm_dd_hh24_mi_ssnnnnnn = new CobolString(256); // fallback

    private void main_para() {
        /* RAW: EXEC CICS ASKTIME NOHANDLE ABSTIME ( */
        pa_fraud_rpt_date.set(String.valueOf(ws_cur_date));
        ws_auth_yy.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 1, 2)));
        ws_auth_mm.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 3, 2)));
        ws_auth_dd.set(String.valueOf(CobolString.refMod(pa_auth_orig_date, 5, 2)));
        ws_auth_time = new BigDecimal(String.valueOf((999999999 - Integer.parseInt(String.valueOf(pa_auth_time_9c).trim()))).trim()).intValue();
        ws_auth_hh.set(String.valueOf(CobolString.refMod(ws_auth_time_an, 1, 2)));
        ws_auth_mi.set(String.valueOf(CobolString.refMod(ws_auth_time_an, 3, 2)));
        ws_auth_ss.set(String.valueOf(CobolString.refMod(ws_auth_time_an, 5, 2)));
        ws_auth_sss.set(String.valueOf(CobolString.refMod(ws_auth_time_an, 7, 3)));
        card_num.set(String.valueOf(pa_card_num));
        auth_ts.set(String.valueOf(ws_auth_ts));
        auth_type.set(String.valueOf(pa_auth_type));
        card_expiry_date.set(String.valueOf(pa_card_expiry_date));
        message_type.set(String.valueOf(pa_message_type));
        message_source.set(String.valueOf(pa_message_source));
        auth_id_code.set(String.valueOf(pa_auth_id_code));
        auth_resp_code.set(String.valueOf(pa_auth_resp_code));
        auth_resp_reason.set(String.valueOf(pa_auth_resp_reason));
        processing_code.set(String.valueOf(pa_processing_code));
        transaction_amt.set(String.valueOf(pa_transaction_amt));
        approved_amt.set(String.valueOf(pa_approved_amt));
        merchant_catagory_code.set(String.valueOf(pa_merchant_catagory_code));
        acqr_country_code.set(String.valueOf(pa_acqr_country_code));
        pos_entry_mode.set(String.valueOf(pa_pos_entry_mode));
        merchant_id.set(String.valueOf(pa_merchant_id));
        merchant_name_len.set(String.valueOf(CobolIntrinsics.length(pa_merchant_name)));
        merchant_name_text.set(String.valueOf(pa_merchant_name));
        merchant_city.set(String.valueOf(pa_merchant_city));
        merchant_state.set(String.valueOf(pa_merchant_state));
        merchant_zip.set(String.valueOf(pa_merchant_zip));
        transaction_id.set(String.valueOf(pa_transaction_id));
        match_status.set(String.valueOf(pa_match_status));
        auth_fraud.set(String.valueOf(ws_frd_action));
        acct_id.set(String.valueOf(ws_acct_id));
        cust_id.set(String.valueOf(ws_cust_id));
        exec.set(String.valueOf(ws_cust_id));
        sql.set(String.valueOf(ws_cust_id));
        insert.set(String.valueOf(ws_cust_id));
        into.set(String.valueOf(ws_cust_id));
    }

    private void carddemo() {
        /* RAW: AUTHFRDS ( CARD_NUM , AUTH_TS , */
        if (String.valueOf(sqlcode).equals(String.valueOf(0))) {
            ws_frd_updt_success.set(String.valueOf(cb_true));
            ws_frd_act_msg.set(String.valueOf("ADD SUCCESS"));
        } else {
            if (String.valueOf(sqlcode).equals(String.valueOf(-803))) {
                fraud_update();
            } else {
                ws_frd_updt_failed.set(String.valueOf(cb_true));
                ws_sqlcode.set(String.valueOf(sqlcode));
                ws_sqlstate.set(String.valueOf(sqlstate));
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(" SYSTEM ERROR DB2: CODE:");
                    _sb.append(String.valueOf(ws_sqlcode));
                    _sb.append(", STATE: ");
                    _sb.append(String.valueOf(ws_sqlstate));
                    ws_frd_act_msg.set(_sb.toString());
                }
            }
        }
        /* RAW: EXEC CICS */
        /* RETURN END-EXEC */
    }

    private void fraud_update() {
        /* RAW: EXEC SQL UPDATE */
    }

    private void carddemo_2() {
        /* RAW: AUTHFRDS  */
        auth_fraud.set(String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
        auth_fraud.set(String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
        fraud_rpt_date.set(String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
        current.set(String.valueOf(cb_if));
        date.set(String.valueOf(cb_if));
        where.set(String.valueOf(cb_if));
        card_num.set(String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
        card_num.set(String.valueOf(cb_if));
        and.set(String.valueOf(cb_if));
        auth_ts.set(String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
    // timestamp_format.setRefMod(auth_ts, String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
        yy_mm_dd_hh24_mi_ssnnnnnn.set(String.valueOf(cb_if));
        _unnamed.set(String.valueOf(cb_if));
        /* MOVE to file END-EXEC — not applicable */
        /* RAW: SQLCODE = ZERO */
        ws_frd_updt_success.set(String.valueOf(cb_true));
        ws_frd_act_msg.set(String.valueOf("UPDT SUCCESS"));
        ws_frd_updt_failed.set(String.valueOf(cb_true));
        ws_sqlcode.set(String.valueOf(sqlcode));
        ws_sqlstate.set(String.valueOf(sqlstate));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(" UPDT ERROR DB2: CODE:");
            _sb.append(String.valueOf(ws_sqlcode));
            _sb.append(", STATE: ");
            _sb.append(String.valueOf(ws_sqlstate));
            ws_frd_act_msg.set(_sb.toString());
        }
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Copaus2c().run();
    }
}
