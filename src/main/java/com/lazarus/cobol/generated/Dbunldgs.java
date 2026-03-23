package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dbunldgs extends CobolProgram {
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
    private CobolString opfil1_rec = new CobolString(100);
    private CobolString opfil2_rec = new CobolString(1); // Group: OPFIL2-REC
    private BigDecimal root_seg_key = BigDecimal.ZERO;
    private CobolString child_seg_rec = new CobolString(200);
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
    private CobolString ws_end_of_root_seg = new CobolString(1);
    private CobolString ws_end_of_child_seg = new CobolString(1);
    private CobolString ws_infile_status = new CobolString(2);
    private CobolString ws_outfl1_status = new CobolString(2);
    private CobolString ws_outfl2_status = new CobolString(2);
    private CobolString ws_custid_status = new CobolString(2);
    private CobolString wk_chkpt_id = new CobolString(1); // Group: WK-CHKPT-ID
    private int wk_chkpt_id_ctr = 0;
    private CobolString ws_ims_variables = new CobolString(1); // Group: WS-IMS-VARIABLES
    private CobolString ims_return_code = new CobolString(2);
    private CobolString ws_ims_psb_schd_flg = new CobolString(1);
    private CobolString root_unqual_ssa = new CobolString(1); // Group: ROOT-UNQUAL-SSA
    private CobolString child_unqual_ssa = new CobolString(1); // Group: CHILD-UNQUAL-SSA
    private CobolString prm_info = new CobolString(1); // Group: PRM-INFO
    private int p_expiry_days = 0;
    private CobolString p_chkp_freq = new CobolString(5);
    private CobolString p_chkp_dis_freq = new CobolString(5);
    private CobolString p_debug_flag = new CobolString(1);


    private CobolString thru = new CobolString(256); // fallback
    private CobolString _1000 = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString paut_pcb_status = new CobolString(256); // fallback
    private CobolString func_gn = new CobolString(256); // fallback
    private CobolString pautbpcb = new CobolString(256); // fallback
    private CobolString pending_auth_summary = new CobolString(256); // fallback
    private CobolString pa_acct_id = new CobolString(256); // fallback
    private CobolString end_of_authdb = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString paut_keyfb = new CobolString(256); // fallback
    private CobolString func_gnp = new CobolString(256); // fallback
    private CobolString pending_auth_details = new CobolString(256); // fallback
    private CobolString more_auths = new CobolString(256); // fallback
    private CobolString func_isrt = new CobolString(256); // fallback
    private CobolString pasflpcb = new CobolString(256); // fallback
    private CobolString pasfl_pcb_status = new CobolString(256); // fallback
    private CobolString pasfl_keyfb = new CobolString(256); // fallback
    private CobolString padflpcb = new CobolString(256); // fallback
    private CobolString padfl_pcb_status = new CobolString(256); // fallback
    private CobolString padfl_keyfb = new CobolString(256); // fallback

    private void main_para() {
        /* RAW: ENTRY 'DLITCBL' USING PAUTBPCB PASFLPCB */
    }

    private void padflpcb() {
        _1000();
        /* RAW: -  */
        thru.set("");
        _1000.set("");
        _unnamed.set("");
    // break;
        /* RAW: 2000 - FIND-NEXT-AUTH-SUMMARY THRU 2000 - */
        return;
    }

    private void initialize() {
        current_date = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DATE")).trim()).intValue();
        current_yyddd = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DAY")).trim()).intValue();
        CobolDisplay.display("STARTING PROGRAM DBUNLDGS::");
        CobolDisplay.display("*-------------------------------------*");
        CobolDisplay.display("TODAYS DATE            :" + String.valueOf(current_date));
        CobolDisplay.display(" ");
        /* RAW: 1000 - */
        return;
    }

    private void find_next_auth_summary() {
        paut_pcb_status.set("");
        CobolProgram.call("CBLTDLI", func_gn, pautbpcb, pending_auth_summary);
    }

    private void root_unqual_ssa() {
        if (String.valueOf(paut_pcb_status).equals(String.valueOf(" "))) {
            ws_no_sumry_read = new BigDecimal(String.valueOf(ws_no_sumry_read + 1).trim()).intValue();
            ws_auth_smry_proc_cnt = new BigDecimal(String.valueOf(ws_auth_smry_proc_cnt + 1).trim()).intValue();
            opfil1_rec.set(String.valueOf(pending_auth_summary));
            root_seg_key = BigDecimal.ZERO;
            child_seg_rec.set("");
            root_seg_key = new BigDecimal(String.valueOf(pa_acct_id).trim());
            if (CobolIntrinsics.isNumeric(pa_acct_id)) {
                _3100();
                /* RAW: - INSERT-PARENT-SEG-GSAM THRU 3100 - */
                return;
            }
        }
        if (String.valueOf(paut_pcb_status).equals(String.valueOf("GB"))) {
            end_of_authdb.set(String.valueOf(cb_true));
            ws_end_of_root_seg.set(String.valueOf("Y"));
        }
        if ((!String.valueOf(paut_pcb_status).equals(String.valueOf(" ")) && true)) {
            CobolDisplay.display("AUTH SUM  GN FAILED  :" + String.valueOf(paut_pcb_status));
            CobolDisplay.display("KEY FEEDBACK AREA    :" + String.valueOf(paut_keyfb));
            _9999();
            /* RAW: -  */
            /* RAW: ABEND  */
        }
        /* RAW: 2000 - */
        return;
    }

    private void find_next_auth_dtl() {
        CobolProgram.call("CBLTDLI", func_gnp, pautbpcb, pending_auth_details);
    }

    private void child_unqual_ssa() {
        if (String.valueOf(paut_pcb_status).equals(String.valueOf(" "))) {
            more_auths.set(String.valueOf(cb_true));
            ws_no_sumry_read = new BigDecimal(String.valueOf(ws_no_sumry_read + 1).trim()).intValue();
            ws_auth_smry_proc_cnt = new BigDecimal(String.valueOf(ws_auth_smry_proc_cnt + 1).trim()).intValue();
            child_seg_rec.set(String.valueOf(pending_auth_details));
            _3200();
            /* RAW: - INSERT-CHILD-SEG-GSAM THRU 3200 - */
            return;
        }
        if (String.valueOf(paut_pcb_status).equals(String.valueOf("GE"))) {
            ws_end_of_child_seg.set(String.valueOf("Y"));
            CobolDisplay.display("CHILD SEG FLAG GE : " + String.valueOf(ws_end_of_child_seg));
        }
        if ((!String.valueOf(paut_pcb_status).equals(String.valueOf(" ")) && true)) {
            CobolDisplay.display("GNP CALL FAILED  :" + String.valueOf(paut_pcb_status));
            CobolDisplay.display("KFB AREA IN CHILD:" + String.valueOf(paut_keyfb));
            _9999();
            /* RAW: - ABEND */
        }
    }

    private void paut_pcb_status() {
        /* RAW: 3000 - */
        return;
    }

    private void insert_parent_seg_gsam() {
        CobolProgram.call("CBLTDLI", func_isrt, pasflpcb);
    }

    private void pending_auth_summary() {
        if (!String.valueOf(pasfl_pcb_status).equals(String.valueOf(" "))) {
            CobolDisplay.display("GSAM PARENT FAIL :" + String.valueOf(pasfl_pcb_status));
            CobolDisplay.display("KFB AREA IN GSAM:" + String.valueOf(pasfl_keyfb));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 3100 - */
        return;
    }

    private void insert_child_seg_gsam() {
        CobolProgram.call("CBLTDLI", func_isrt, padflpcb);
    }

    private void pending_auth_details() {
        if (!String.valueOf(padfl_pcb_status).equals(String.valueOf(" "))) {
            CobolDisplay.display("GSAM PARENT FAIL :" + String.valueOf(padfl_pcb_status));
            CobolDisplay.display("KFB AREA IN GSAM:" + String.valueOf(padfl_keyfb));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 3200 - */
        return;
    }

    private void file_close() {
        CobolDisplay.display("CLOSING THE FILE");
        /* RAW: 4000 - */
        return;
    }

    private void abend() {
        CobolDisplay.display("DBUNLDGS ABENDING ...");
        return_code = new BigDecimal(String.valueOf(16).trim()).intValue();
        return;
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _3100() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _3200() { /* stub — external/COPY */ }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Dbunldgs().run();
    }
}
