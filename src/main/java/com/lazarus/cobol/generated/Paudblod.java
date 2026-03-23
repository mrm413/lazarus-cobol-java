package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Paudblod extends CobolProgram {
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
    private CobolString ws_end_of_infile1 = new CobolString(1);
    private CobolString ws_end_of_infile2 = new CobolString(1);
    private CobolString ws_infile_status = new CobolString(2);
    private CobolString ws_infil1_status = new CobolString(2);
    private CobolString ws_infil2_status = new CobolString(2);
    private CobolString end_root_seg_file = new CobolString(1);
    private CobolString end_child_seg_file = new CobolString(1);
    private CobolString ws_custid_status = new CobolString(2);
    private CobolString wk_chkpt_id = new CobolString(1); // Group: WK-CHKPT-ID
    private int wk_chkpt_id_ctr = 0;
    private CobolString ws_ims_variables = new CobolString(1); // Group: WS-IMS-VARIABLES
    private CobolString ims_return_code = new CobolString(2);
    private CobolString ws_ims_psb_schd_flg = new CobolString(1);
    private CobolString root_qual_ssa = new CobolString(1); // Group: ROOT-QUAL-SSA
    private CobolString qual_ssa_seg_name = new CobolString(8);
    private CobolString qual_ssa_key_field = new CobolString(8);
    private CobolString qual_ssa_rel_oper = new CobolString(2);
    private BigDecimal qual_ssa_key_value = BigDecimal.ZERO;
    private CobolString root_unqual_ssa = new CobolString(1); // Group: ROOT-UNQUAL-SSA
    private CobolString child_unqual_ssa = new CobolString(1); // Group: CHILD-UNQUAL-SSA
    private CobolString prm_info = new CobolString(1); // Group: PRM-INFO
    private int p_expiry_days = 0;
    private CobolString p_chkp_freq = new CobolString(5);
    private CobolString p_chkp_dis_freq = new CobolString(5);
    private CobolString p_debug_flag = new CobolString(1);

    // LINKAGE SECTION
    private CobolString io_pcb_mask = new CobolString(1);

    // FILE SECTION — INFILE1
    private CobolString infil1_rec = new CobolString(100);

    // FILE SECTION — INFILE2
    private CobolString infil2_rec = new CobolString(1); // Group: INFIL2-REC
    private BigDecimal root_seg_key = BigDecimal.ZERO;
    private CobolString child_seg_rec = new CobolString(200);


    // FILE DESCRIPTORS
    private CobolFile infile1 = new CobolFile("INFILE1", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-INFIL1-STATUS
    private CobolFile infile2 = new CobolFile("INFILE2", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-INFIL2-STATUS

    private CobolString thru = new CobolString(256); // fallback
    private CobolString _1000 = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString pending_auth_summary = new CobolString(256); // fallback
    private CobolString func_isrt = new CobolString(256); // fallback
    private CobolString pautbpcb = new CobolString(256); // fallback
    private CobolString paut_pcb_status = new CobolString(256); // fallback
    private CobolString pending_auth_details = new CobolString(256); // fallback
    private CobolString func_gu = new CobolString(256); // fallback
    private CobolString paut_keyfb = new CobolString(256); // fallback

    private void main_para() {
        /* RAW: ENTRY 'DLITCBL' USING */
    }

    private void pautbpcb() {
        CobolDisplay.display("STARTING PAUDBLOD");
        _1000();
        /* RAW: -  */
        thru.set("");
        _1000.set("");
        _unnamed.set("");
    // break;
        /* RAW: 2000 - READ-ROOT-SEG-FILE THRU 2000 - */
        return;
    }

    private void initialize() {
        current_date = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DATE")).trim()).intValue();
        current_yyddd = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DAY")).trim()).intValue();
        CobolDisplay.display("*-------------------------------------*");
        CobolDisplay.display("TODAYS DATE            :" + String.valueOf(current_date));
        CobolDisplay.display(" ");
        infile1.open("INPUT");
        if ((String.valueOf(ws_infil1_status).equals(String.valueOf(" ")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR IN OPENING INFILE1:" + String.valueOf(ws_infil1_status));
            _9999();
            /* RAW: - ABEND */
        }
        infile2.open("INPUT");
        if ((String.valueOf(ws_infil2_status).equals(String.valueOf(" ")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR IN OPENING INFILE2:" + String.valueOf(ws_infil2_status));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 1000 - */
        return;
    }

    private void read_root_seg_file() {
        if (infile1.read(null) == FileStatus.AT_END) {
        }
        if ((String.valueOf(ws_infil1_status).equals(String.valueOf(" ")) || true)) {
            pending_auth_summary.set(String.valueOf(infil1_rec));
            _2100();
            /* RAW: - INSERT-ROOT-SEG THRU 2100 - */
            return;
        } else {
            if (String.valueOf(ws_infil1_status).equals(String.valueOf("10"))) {
                end_root_seg_file.set(String.valueOf("Y"));
            } else {
                CobolDisplay.display("ERROR READING ROOT SEG INFILE");
            }
        }
        /* RAW: 2000 - */
        return;
    }

    private void insert_root_seg() {
        CobolProgram.call("CBLTDLI", func_isrt, pautbpcb, pending_auth_summary);
    }

    private void root_unqual_ssa() {
        CobolDisplay.display(" *******************************");
        CobolDisplay.display(" *******************************");
        if (String.valueOf(paut_pcb_status).equals(String.valueOf(" "))) {
            CobolDisplay.display("ROOT INSERT SUCCESS    ");
        }
        if (String.valueOf(paut_pcb_status).equals(String.valueOf("II"))) {
            CobolDisplay.display("ROOT SEGMENT ALREADY IN DB");
        }
        if ((!String.valueOf(paut_pcb_status).equals(String.valueOf(" ")) && true)) {
            CobolDisplay.display("ROOT INSERT FAILED  :" + String.valueOf(paut_pcb_status));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 2100 - */
        return;
    }

    private void read_child_seg_file() {
        if (infile2.read(null) == FileStatus.AT_END) {
        }
        if ((String.valueOf(ws_infil2_status).equals(String.valueOf(" ")) || true)) {
            if (CobolIntrinsics.isNumeric(root_seg_key)) {
                qual_ssa_key_value = new BigDecimal(String.valueOf(root_seg_key).trim());
                pending_auth_details.set(String.valueOf(child_seg_rec));
                _3100();
                /* RAW: - INSERT-CHILD-SEG THRU 3100 - */
                return;
            }
        } else {
            if (String.valueOf(ws_infil2_status).equals(String.valueOf("10"))) {
                end_child_seg_file.set(String.valueOf("Y"));
            } else {
                CobolDisplay.display("ERROR READING CHILD SEG INFILE");
            }
        }
        /* RAW: 3000 - */
        return;
    }

    private void insert_child_seg() {
        paut_pcb_status.set("");
        CobolProgram.call("CBLTDLI", func_gu, pautbpcb, pending_auth_summary);
    }

    private void root_qual_ssa() {
        CobolDisplay.display("***************************");
        CobolDisplay.display("***************************");
        if (String.valueOf(paut_pcb_status).equals(String.valueOf(" "))) {
            CobolDisplay.display("GU CALL TO ROOT SEG SUCCESS");
            _3200();
            /* RAW: - INSERT-IMS-CALL THRU 3200 - */
            return;
        }
        /* RAW: 3100 - */
        return;
    }

    private void insert_ims_call() {
        CobolProgram.call("CBLTDLI", func_isrt, pautbpcb, pending_auth_details);
    }

    private void child_unqual_ssa() {
        if (String.valueOf(paut_pcb_status).equals(String.valueOf(" "))) {
            CobolDisplay.display("CHILD SEGMENT INSERTED SUCCESS");
        }
        if (String.valueOf(paut_pcb_status).equals(String.valueOf("II"))) {
            CobolDisplay.display("CHILD SEGMENT ALREADY IN DB");
        }
        if ((!String.valueOf(paut_pcb_status).equals(String.valueOf(" ")) && true)) {
            CobolDisplay.display("INSERT CALL FAIL FOR CHILD:" + String.valueOf(paut_pcb_status));
            CobolDisplay.display("KFB AREA IN CHILD:" + String.valueOf(paut_keyfb));
            _9999();
            /* RAW: - ABEND */
        }
        /* RAW: 3200 - */
        return;
    }

    private void file_close() {
        CobolDisplay.display("CLOSING THE FILE");
    }

    private void infile1() {
        if ((String.valueOf(ws_infil1_status).equals(String.valueOf(" ")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR IN CLOSING 1ST FILE:" + String.valueOf(ws_infil1_status));
        }
    }

    private void infile2() {
        if ((String.valueOf(ws_infil2_status).equals(String.valueOf(" ")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR IN CLOSING 2ND FILE:" + String.valueOf(ws_infil2_status));
        }
        /* RAW: 4000 - */
        return;
    }

    private void abend() {
        CobolDisplay.display("IMS LOAD ABENDING ...");
        return_code = new BigDecimal(String.valueOf(16).trim()).intValue();
        return;
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _2100() { /* stub — external/COPY */ }

    private void _3100() { /* stub — external/COPY */ }

    private void _3200() { /* stub — external/COPY */ }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Paudblod().run();
    }
}
