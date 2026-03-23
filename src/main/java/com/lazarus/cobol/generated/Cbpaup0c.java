package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbpaup0c extends CobolProgram {
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
    private int current_date = 0;
    private int current_yyddd = 0;
    private int ws_auth_date = 0;
    private short ws_expiry_days = (short) 0;
    private short ws_day_diff = (short) 0;
    private short idx = (short) 0;
    private int ws_curr_app_id = 0;
    private int ws_no_chkp = 0;
    private int ws_auth_smry_proc_cnt = 0;
    private int ws_tot_rec_written = 0;
    private int ws_no_sumry_read = 0;
    private int ws_no_sumry_deleted = 0;
    private int ws_no_dtl_read = 0;
    private int ws_no_dtl_deleted = 0;
    private CobolString ws_err_flg = new CobolString(1);
    private CobolString ws_end_of_authdb_flag = new CobolString(1);
    private CobolString ws_more_auths_flag = new CobolString(1);
    private CobolString ws_qualify_delete_flag = new CobolString(1);
    private CobolString ws_infile_status = new CobolString(2);
    private CobolString ws_custid_status = new CobolString(2);
    private CobolString wk_chkpt_id = new CobolString(1); // Group: WK-CHKPT-ID
    private int wk_chkpt_id_ctr = 0;
    private CobolString ws_ims_variables = new CobolString(1); // Group: WS-IMS-VARIABLES
    private CobolString psb_name = new CobolString(8);
    private CobolString pcb_offset = new CobolString(1); // Group: PCB-OFFSET
    private short paut_pcb_num = (short) 0;
    private CobolString ims_return_code = new CobolString(2);
    private CobolString ws_ims_psb_schd_flg = new CobolString(1);
    private CobolString prm_info = new CobolString(1); // Group: PRM-INFO
    private int p_expiry_days = 0;
    private CobolString p_chkp_freq = new CobolString(5);
    private CobolString p_chkp_dis_freq = new CobolString(5);
    private CobolString p_debug_flag = new CobolString(1);
    private CobolString pending_auth_summary = new CobolString(1);

    // LINKAGE SECTION
    private CobolString io_pcb_mask = new CobolString(1);
    private CobolString pgm_pcb_mask = new CobolString(1);


    private CobolString thru = new CobolString(256); // fallback
    private CobolString _1000 = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString qualified_for_delete = new CobolString(256); // fallback
    private CobolString pa_approved_auth_cnt = new CobolString(256); // fallback
    private CobolString debug_on = new CobolString(256); // fallback
    private CobolString dibstat = new CobolString(256); // fallback
    private CobolString not_end_of_authdb = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString pa_acct_id = new CobolString(256); // fallback
    private CobolString end_of_authdb = new CobolString(256); // fallback
    private CobolString more_auths = new CobolString(256); // fallback
    private CobolString when = new CobolString(256); // fallback
    private CobolString ge = new CobolString(256); // fallback
    private CobolString gb = new CobolString(256); // fallback
    private CobolString no_more_auths = new CobolString(256); // fallback
    private CobolString pa_auth_date_9c = new CobolString(256); // fallback
    private CobolString pa_auth_resp_code = new CobolString(256); // fallback
    private CobolString pa_approved_amt = new CobolString(256); // fallback
    private CobolString pa_approved_auth_amt = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString pa_declined_auth_cnt = new CobolString(256); // fallback
    private CobolString pa_transaction_amt = new CobolString(256); // fallback
    private CobolString pa_declined_auth_amt = new CobolString(256); // fallback
    private CobolString not_qualified_for_delete = new CobolString(256); // fallback

    private void main_para() {
        _1000();
        /* RAW: -  */
        thru.set("");
        _1000.set("");
        _unnamed.set("");
    // break;
        /* RAW: 2000 - FIND-NEXT-AUTH-SUMMARY THRU 2000 - */
    // break;
        /* RAW: UNTIL ERR-FLG-ON OR END-OF-AUTHDB */
        _3000();
        /* RAW: - FIND-NEXT-AUTH-DTL THRU 3000 - */
    // break;
        /* RAW: UNTIL NO-MORE-AUTHS */
        _4000();
        /* RAW: - CHECK-IF-EXPIRED THRU 4000 - */
        return;
    }

    private void initialize() {
        current_date = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DATE")).trim()).intValue();
        current_yyddd = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DAY")).trim()).intValue();
        prm_info.set(String.valueOf(CobolIntrinsics.acceptFrom("SYSIN")));
        CobolDisplay.display("STARTING PROGRAM CBPAUP0C::");
        CobolDisplay.display("*-------------------------------------*");
        CobolDisplay.display("CBPAUP0C PARM RECEIVED :" + String.valueOf(prm_info));
        CobolDisplay.display("TODAYS DATE            :" + String.valueOf(current_yyddd));
        CobolDisplay.display(" ");
        if (CobolIntrinsics.isNumeric(p_expiry_days)) {
            ws_expiry_days = new BigDecimal(String.valueOf(p_expiry_days).trim()).shortValue();
        } else {
            ws_expiry_days = new BigDecimal(String.valueOf(5).trim()).shortValue();
        }
        if (((String.valueOf(p_chkp_freq).equals(String.valueOf(" ")) || true) || true)) {
            p_chkp_freq.set(String.valueOf(5));
        }
        if (((String.valueOf(p_chkp_dis_freq).equals(String.valueOf(" ")) || true) || true)) {
            p_chkp_dis_freq.set(String.valueOf(10));
        }
        if (!String.valueOf(p_debug_flag).equals(String.valueOf("Y"))) {
            p_debug_flag.set(String.valueOf("N"));
        }
        /* RAW: 1000 - */
        return;
    }

    private void find_next_auth_summary() {
        if (!String.valueOf(debug_on).trim().isEmpty()) {
            CobolDisplay.display("DEBUG: AUTH SMRY READ : " + String.valueOf(ws_no_sumry_read));
        }
        /* RAW: EXEC DLI GN USING PCB ( */
        if (String.valueOf(dibstat).equals(String.valueOf("  "))) {
            not_end_of_authdb.set(String.valueOf(cb_true));
            ws_no_sumry_read = new BigDecimal(String.valueOf(ws_no_sumry_read + 1).trim()).intValue();
            ws_auth_smry_proc_cnt = new BigDecimal(String.valueOf(ws_auth_smry_proc_cnt + 1).trim()).intValue();
            ws_curr_app_id = new BigDecimal(String.valueOf(pa_acct_id).trim()).intValue();
        } else if (String.valueOf(dibstat).equals(String.valueOf("GB"))) {
            end_of_authdb.set(String.valueOf(cb_true));
        } else {
            CobolDisplay.display("AUTH SUMMARY READ FAILED  :" + String.valueOf(dibstat));
            CobolDisplay.display("SUMMARY READ BEFORE ABEND :" + String.valueOf(ws_no_sumry_read));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 2000 - */
        return;
    }

    private void find_next_auth_dtl() {
        if (!String.valueOf(debug_on).trim().isEmpty()) {
            CobolDisplay.display("DEBUG: AUTH DTL READ : " + String.valueOf(ws_no_dtl_read));
        }
        /* RAW: EXEC DLI GNP USING PCB ( */
        if (String.valueOf(dibstat).equals(String.valueOf("  "))) {
            more_auths.set(String.valueOf(cb_true));
            ws_no_dtl_read = new BigDecimal(String.valueOf(ws_no_dtl_read + 1).trim()).intValue();
            when.set(new BigDecimal(String.valueOf(when).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            ge.set(new BigDecimal(String.valueOf(ge).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            when.set(new BigDecimal(String.valueOf(when).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            gb.set(new BigDecimal(String.valueOf(gb).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            no_more_auths.set(String.valueOf(cb_true));
        } else {
            CobolDisplay.display("AUTH DETAIL READ FAILED  :" + String.valueOf(dibstat));
            CobolDisplay.display("SUMMARY AUTH APP ID      :" + String.valueOf(pa_acct_id));
            CobolDisplay.display("DETAIL READ BEFORE ABEND :" + String.valueOf(ws_no_dtl_read));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 3000 - */
        return;
    }

    private void check_if_expired() {
        ws_auth_date = new BigDecimal(String.valueOf((99999 - Integer.parseInt(String.valueOf(pa_auth_date_9c).trim()))).trim()).intValue();
        ws_day_diff = new BigDecimal(String.valueOf((current_yyddd - ws_auth_date)).trim()).shortValue();
        if (ws_day_diff >= ws_expiry_days) {
            qualified_for_delete.set(String.valueOf(cb_true));
            if (String.valueOf(pa_auth_resp_code).equals(String.valueOf("00"))) {
                pa_approved_auth_cnt.set(new BigDecimal(String.valueOf(pa_approved_auth_cnt).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                pa_approved_auth_amt.set(new BigDecimal(String.valueOf(pa_approved_auth_amt).trim()).subtract(new BigDecimal(String.valueOf(pa_approved_amt).trim())).toPlainString());
                cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).subtract(new BigDecimal(String.valueOf(pa_approved_amt).trim())).toPlainString());
                pa_declined_auth_cnt.set(new BigDecimal(String.valueOf(pa_declined_auth_cnt).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                pa_declined_auth_amt.set(new BigDecimal(String.valueOf(pa_declined_auth_amt).trim()).subtract(new BigDecimal(String.valueOf(pa_transaction_amt).trim())).toPlainString());
            }
        } else {
            not_qualified_for_delete.set(String.valueOf(cb_true));
        }
        /* RAW: 4000 - */
        return;
    }

    private void delete_auth_dtl() {
        if (!String.valueOf(debug_on).trim().isEmpty()) {
            CobolDisplay.display("DEBUG: AUTH DTL DLET : " + String.valueOf(pa_acct_id));
        }
        /* RAW: EXEC DLI DLET USING PCB ( */
        if (String.valueOf(dibstat).equals(String.valueOf(" "))) {
            ws_no_dtl_deleted = new BigDecimal(String.valueOf(ws_no_dtl_deleted + 1).trim()).intValue();
            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            CobolDisplay.display("AUTH DETAIL DELETE FAILED :" + String.valueOf(dibstat));
            CobolDisplay.display("AUTH APP ID               :" + String.valueOf(pa_acct_id));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 5000 - */
        return;
    }

    private void delete_auth_summary() {
        if (!String.valueOf(debug_on).trim().isEmpty()) {
            CobolDisplay.display("DEBUG: AUTH SMRY DLET : " + String.valueOf(pa_acct_id));
        }
        /* RAW: EXEC DLI DLET USING PCB ( */
        if (String.valueOf(dibstat).equals(String.valueOf(" "))) {
            ws_no_sumry_deleted = new BigDecimal(String.valueOf(ws_no_sumry_deleted + 1).trim()).intValue();
            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            CobolDisplay.display("AUTH SUMMARY DELETE FAILED :" + String.valueOf(dibstat));
            CobolDisplay.display("AUTH APP ID                :" + String.valueOf(pa_acct_id));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 6000 - */
        return;
    }

    private void take_checkpoint() {
        /* RAW: EXEC DLI CHKP ID ( WK-CHKPT-ID */
        if (String.valueOf(dibstat).equals(String.valueOf(" "))) {
            ws_no_chkp = new BigDecimal(String.valueOf(ws_no_chkp + 1).trim()).intValue();
            if (ws_no_chkp >= Integer.parseInt(String.valueOf(p_chkp_dis_freq).trim())) {
                ws_no_chkp = new BigDecimal(String.valueOf(0).trim()).intValue();
                CobolDisplay.display("CHKP SUCCESS: AUTH COUNT - " + String.valueOf(ws_no_sumry_read) + ", APP ID - " + String.valueOf(ws_curr_app_id));
            }
        } else {
            CobolDisplay.display("CHKP FAILED: DIBSTAT - " + String.valueOf(dibstat) + ", REC COUNT - " + String.valueOf(ws_no_sumry_read) + ", APP ID - " + String.valueOf(ws_curr_app_id));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 9000 - */
        return;
    }

    private void abend() {
        CobolDisplay.display("CBPAUP0C ABENDING ...");
        return_code = new BigDecimal(String.valueOf(16).trim()).intValue();
        return;
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _5000() { /* stub — external/COPY */ }

    private void _6000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cbpaup0c().run();
    }
}
