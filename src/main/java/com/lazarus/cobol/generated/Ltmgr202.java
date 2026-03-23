package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ltmgr202 extends CobolProgram {
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
    private int idx_diag = 0;
    private int idx_proc = 0;
    // WORKING-STORAGE SECTION
    private CobolString w_storage_ref = new CobolString(51);
    private CobolString ppmgr_version = new CobolString(5);
    private CobolString ltopn202 = new CobolString(8);
    private int eof_sw = 0;
    private int operline_ctr = 0;
    private CobolString ut1_stat = new CobolString(1); // Group: UT1-STAT
    private CobolString ut1_stat1 = new CobolString(1);
    private CobolString ut1_stat2 = new CobolString(1);
    private CobolString opr_stat = new CobolString(1); // Group: OPR-STAT
    private CobolString opr_stat1 = new CobolString(1);
    private CobolString opr_stat2 = new CobolString(1);
    private CobolString bill_work = new CobolString(1); // Group: BILL-WORK
    private CobolString bill_npi10 = new CobolString(1); // Group: BILL-NPI10
    private CobolString bill_npi8 = new CobolString(8);
    private CobolString bill_npi_filler = new CobolString(2);
    private CobolString bill_provider_n = new CobolString(1); // Group: BILL-PROVIDER-N
    private CobolString bill_ltc_prov = new CobolString(4);
    private CobolString bill_patient_status = new CobolString(2);
    private CobolString bill_drg_code = new CobolString(3);
    private int bill_los = 0;
    private int bill_cov_days = 0;
    private int bill_ltr_days = 0;
    private int bill_cst_rpt_days = 0;
    private CobolString bill_discharge_date = new CobolString(1); // Group: BILL-DISCHARGE-DATE
    private int bill_dischg_cc = 0;
    private int bill_dischg_yy = 0;
    private int bill_dischg_mm = 0;
    private int bill_dischg_dd = 0;
    private int bill_cov_charges = 0;
    private CobolString bill_spec_pay_ind = new CobolString(1);
    private int bill_review_code = 0;
    private CobolString bill_diagnosis_code_table = new CobolString(1); // Group: BILL-DIAGNOSIS-CODE-TABLE
    private CobolString[] bill_diagnosis_code = new CobolString[25];
    private CobolString bill_procedure_code_table = new CobolString(1); // Group: BILL-PROCEDURE-CODE-TABLE
    private CobolString[] bill_procedure_code = new CobolString[25];
    private CobolString pps_data_all = new CobolString(1); // Group: PPS-DATA-ALL
    private CobolString pps_rtc = new CobolString(2);
    private int pps_chrg_threshold = 0;
    private CobolString pps_data = new CobolString(1); // Group: PPS-DATA
    private CobolString pps_msa = new CobolString(4);
    private int pps_wage_index = 0;
    private int pps_avg_los = 0;
    private int pps_relative_wgt = 0;
    private int pps_outlier_pay_amt = 0;
    private int pps_los = 0;
    private int pps_drg_adj_pay_amt = 0;
    private int pps_fed_pay_amt = 0;
    private int pps_final_pay_amt = 0;
    private int pps_fac_costs = 0;
    private int pps_new_fac_spec_rate = 0;
    private int pps_outlier_threshold = 0;
    private CobolString pps_subm_drg_code = new CobolString(3);
    private CobolString pps_calc_vers_cd = new CobolString(5);
    private int pps_reg_days_used = 0;
    private int pps_ltr_days_used = 0;
    private int pps_blend_year = 0;
    private int pps_cola = 0;
    private CobolString pps_other_data = new CobolString(1); // Group: PPS-OTHER-DATA
    private int pps_nat_labor_pct = 0;
    private int pps_nat_nonlabor_pct = 0;
    private int pps_std_fed_rate = 0;
    private int pps_bdgt_neut_rate = 0;
    private int pps_ipthresh = 0;
    private BigDecimal pps_ltch_dpp_adj_amt = BigDecimal.ZERO;
    private CobolString pps_pc_data = new CobolString(1); // Group: PPS-PC-DATA
    private CobolString pps_cot_ind = new CobolString(1);
    private CobolString pps_cbsa = new CobolString(5);
    private CobolString pps_payment_data = new CobolString(1); // Group: PPS-PAYMENT-DATA
    private int pps_site_neutral_cost_pmt = 0;
    private int pps_site_neutral_ipps_pmt = 0;
    private int pps_standard_full_pmt = 0;
    private int pps_standard_sso_pmt = 0;
    private CobolString bill_new_data = new CobolString(1); // Group: BILL-NEW-DATA
    private CobolString b_npi10 = new CobolString(1); // Group: B-NPI10
    private CobolString b_npi8 = new CobolString(8);
    private CobolString b_npi_filler = new CobolString(2);
    private CobolString b_provider_no = new CobolString(6);
    private CobolString b_patient_status = new CobolString(2);
    private CobolString b_drg_code = new CobolString(3);
    private int b_los = 0;
    private int b_cov_days = 0;
    private int b_ltr_days = 0;
    private int b_cst_rpt_days = 0;
    private CobolString b_discharge_date = new CobolString(1); // Group: B-DISCHARGE-DATE
    private int b_dischg_cc = 0;
    private int b_dischg_yy = 0;
    private int b_dischg_mm = 0;
    private int b_dischg_dd = 0;
    private int b_cov_charges = 0;
    private CobolString b_spec_pay_ind = new CobolString(1);
    private int b_review_code = 0;
    private CobolString b_diagnosis_code_table = new CobolString(1); // Group: B-DIAGNOSIS-CODE-TABLE
    private CobolString[] b_diagnosis_code = new CobolString[25];
    private CobolString b_procedure_code_table = new CobolString(1); // Group: B-PROCEDURE-CODE-TABLE
    private CobolString[] b_procedure_code = new CobolString[25];
    private CobolString b_ltch_dpp_indicator_sw = new CobolString(1);
    private CobolString pricer_opt_vers_sw = new CobolString(1); // Group: PRICER-OPT-VERS-SW
    private CobolString pricer_option_sw = new CobolString(1);
    private CobolString pps_versions = new CobolString(1); // Group: PPS-VERSIONS
    private CobolString ppdrv_version = new CobolString(5);
    private CobolString prov_record_from_user = new CobolString(1); // Group: PROV-RECORD-FROM-USER
    private CobolString w_prov_newrec_hold1 = new CobolString(1); // Group: W-PROV-NEWREC-HOLD1
    private CobolString w_p_new_npi10 = new CobolString(1); // Group: W-P-NEW-NPI10
    private CobolString w_p_new_npi8 = new CobolString(8);
    private CobolString w_p_new_npi_filler = new CobolString(2);
    private CobolString w_p_new_provider_oscar_no = new CobolString(1); // Group: W-P-NEW-PROVIDER-OSCAR-NO
    private int w_p_new_state = 0;
    private CobolString w_p_new_state_x = new CobolString(2);
    private CobolString w_p_new_date_data = new CobolString(1); // Group: W-P-NEW-DATE-DATA
    private CobolString w_p_new_eff_date = new CobolString(1); // Group: W-P-NEW-EFF-DATE
    private int w_p_new_eff_dt_cc = 0;
    private int w_p_new_eff_dt_yy = 0;
    private int w_p_new_eff_dt_mm = 0;
    private int w_p_new_eff_dt_dd = 0;
    private CobolString w_p_new_fy_begin_date = new CobolString(1); // Group: W-P-NEW-FY-BEGIN-DATE
    private int w_p_new_fy_beg_dt_cc = 0;
    private int w_p_new_fy_beg_dt_yy = 0;
    private int w_p_new_fy_beg_dt_mm = 0;
    private int w_p_new_fy_beg_dt_dd = 0;
    private CobolString w_p_new_report_date = new CobolString(1); // Group: W-P-NEW-REPORT-DATE
    private int w_p_new_report_dt_cc = 0;
    private int w_p_new_report_dt_yy = 0;
    private int w_p_new_report_dt_mm = 0;
    private int w_p_new_report_dt_dd = 0;
    private CobolString w_p_new_termination_date = new CobolString(1); // Group: W-P-NEW-TERMINATION-DATE
    private int w_p_new_term_dt_cc = 0;
    private int w_p_new_term_dt_yy = 0;
    private int w_p_new_term_dt_mm = 0;
    private int w_p_new_term_dt_dd = 0;
    private CobolString w_p_new_waiver_code = new CobolString(1);
    private CobolString w_p_new_inter_no = new CobolString(5);
    private CobolString w_p_new_provider_type = new CobolString(2);
    private CobolString w_p_new_current_census_div = new CobolString(1);
    private CobolString w_p_new_msa_data = new CobolString(1); // Group: W-P-NEW-MSA-DATA
    private CobolString w_p_new_chg_code_index = new CobolString(1);
    private CobolString w_p_new_geo_loc_msa = new CobolString(4);
    private CobolString w_p_new_wage_index_loc_msa = new CobolString(4);
    private CobolString w_p_new_stand_amt_loc_msa = new CobolString(4);
    private CobolString w_p_new_stand_amt_loc_msa9 = new CobolString(1); // Group: W-P-NEW-STAND-AMT-LOC-MSA9
    private CobolString w_p_new_rural_1st = new CobolString(1); // Group: W-P-NEW-RURAL-1ST
    private CobolString w_p_new_stand_rural = new CobolString(2);
    private CobolString w_p_new_rural_2nd = new CobolString(2);
    private CobolString w_p_new_sol_com_dep_hosp_yr = new CobolString(2);
    private CobolString w_p_new_lugar = new CobolString(1);
    private CobolString w_p_new_temp_relief_ind = new CobolString(1);
    private CobolString w_p_new_fed_pps_blend_ind = new CobolString(1);
    private int w_p_new_state_code = 0;
    private CobolString w_p_new_state_code_x = new CobolString(2);
    private CobolString w_prov_newrec_hold2 = new CobolString(1); // Group: W-PROV-NEWREC-HOLD2
    private CobolString w_p_new_variables = new CobolString(1); // Group: W-P-NEW-VARIABLES
    private CobolString w_p_new_fac_spec_rate = new CobolString(7);
    private CobolString w_p_new_cola = new CobolString(4);
    private CobolString w_p_new_intern_ratio = new CobolString(5);
    private CobolString w_p_new_bed_size = new CobolString(5);
    private CobolString w_p_new_ccr = new CobolString(4);
    private CobolString w_p_new_cmi = new CobolString(5);
    private CobolString w_p_new_ssi_ratio = new CobolString(4);
    private CobolString w_p_new_medicaid_ratio = new CobolString(4);
    private CobolString w_p_new_pps_blend_yr_ind = new CobolString(1);
    private int w_p_new_prup_updte_factor = 0;
    private BigDecimal w_p_new_dsh_percent = BigDecimal.ZERO;
    private CobolString w_p_new_fye_date = new CobolString(1); // Group: W-P-NEW-FYE-DATE
    private int w_p_new_fye_cc = 0;
    private int w_p_new_fye_yy = 0;
    private int w_p_new_fye_mm = 0;
    private int w_p_new_fye_dd = 0;
    private CobolString w_p_new_special_pay_ind = new CobolString(1);
    private CobolString w_p_new_hosp_qual_ind = new CobolString(1);
    private CobolString w_p_new_geo_loc_cbsax = new CobolString(5);
    private int w_p_new_geo_loc_cbsa9 = 0;
    private CobolString w_p_new_geo_loc_cbsa_ast = new CobolString(1); // Group: W-P-NEW-GEO-LOC-CBSA-AST
    private CobolString w_p_new_geo_loc_cbsa_1st = new CobolString(1);
    private CobolString w_p_new_geo_loc_cbsa_2nd = new CobolString(1);
    private CobolString w_p_new_geo_loc_cbsa_3rd = new CobolString(1);
    private CobolString w_p_new_geo_loc_cbsa_4th = new CobolString(1);
    private CobolString w_p_new_geo_loc_cbsa_5th = new CobolString(1);
    private int w_p_new_special_wage_index = 0;
    private CobolString w_prov_newrec_hold3 = new CobolString(1); // Group: W-PROV-NEWREC-HOLD3
    private CobolString w_p_new_pass_amt_data = new CobolString(1); // Group: W-P-NEW-PASS-AMT-DATA
    private CobolString w_p_new_pass_amt_capital = new CobolString(6);
    private CobolString w_p_new_pass_amt_dir_med_ed = new CobolString(6);
    private CobolString w_p_new_pass_amt_organ_acq = new CobolString(6);
    private CobolString w_p_new_pass_amt_plus_misc = new CobolString(6);
    private CobolString w_p_new_capi_data = new CobolString(1); // Group: W-P-NEW-CAPI-DATA
    private CobolString w_p_new_capi_pps_pay_code = new CobolString(1);
    private CobolString w_p_new_capi_hosp_spec_rate = new CobolString(6);
    private CobolString w_p_new_capi_old_harm_rate = new CobolString(6);
    private CobolString w_p_new_capi_new_harm_ratio = new CobolString(5);
    private CobolString w_p_new_capi_cstchg_ratio = new CobolString(4);
    private CobolString w_p_new_capi_new_hosp = new CobolString(1);
    private CobolString w_p_new_capi_ime = new CobolString(5);
    private CobolString w_p_new_capi_exceptions = new CobolString(6);
    private CobolString w_p_val_based_purch_score = new CobolString(4);
    private CobolString cbsax_table_from_user = new CobolString(1); // Group: CBSAX-TABLE-FROM-USER
    private CobolString ipps_cbsax_table_from_user = new CobolString(1); // Group: IPPS-CBSAX-TABLE-FROM-USER
    private CobolString msax_table_from_user = new CobolString(1); // Group: MSAX-TABLE-FROM-USER
    private CobolString pps_detail_line_oper = new CobolString(1); // Group: PPS-DETAIL-LINE-OPER
    private CobolString prt_prov = new CobolString(6);
    private CobolString prt_drg_adj_pay = new CobolString(9);
    private CobolString prt_outlier_pay = new CobolString(9);
    private CobolString prt_fac_spec_rate = new CobolString(9);
    private CobolString prt_tot_pay = new CobolString(9);
    private CobolString prt_out_thresh = new CobolString(9);
    private CobolString prt_fac_cost = new CobolString(9);
    private CobolString prt_los = new CobolString(3);
    private int prt_reg_days_used = 0;
    private int prt_ltr_days_used = 0;
    private CobolString prt_alos = new CobolString(2);
    private CobolString prt_pps_rtc = new CobolString(2);
    private CobolString prt_rel_wt = new CobolString(6);
    private CobolString prt_wage_index = new CobolString(6);
    private CobolString pps_head2_oper = new CobolString(1); // Group: PPS-HEAD2-OPER
    private CobolString pps_head3_oper = new CobolString(1); // Group: PPS-HEAD3-OPER
    private CobolString pps_head4_oper = new CobolString(1); // Group: PPS-HEAD4-OPER

    // FILE SECTION — BILLFILE
    private CobolString bill_rec = new CobolString(422);

    // FILE SECTION — PRTOPER
    private CobolString prtoper_line = new CobolString(133);


    // FILE DESCRIPTORS
    private CobolFile billfile = new CobolFile("UT-S-SYSUT1", "SEQUENTIAL", "SEQUENTIAL");
    // File status: UT1-STAT
    private CobolFile prtoper = new CobolFile("UT-S-PRTOPER", "SEQUENTIAL", "SEQUENTIAL");
    // File status: OPR-STAT


    // SECTION: MAINLINE
    private void mainline() {
        para_open();
        billfile();
        prtoper();
        pps_versions();
        billfile();
        prtoper();
        process_records();
        bill_new_data();
        calc_payment();
        pricer_option_sw();
        pricer_opt_vers_sw();
        write_sysut2();
        pps_detail_line_oper();
        prt_prov();
        prt_ltr_days_used();
        prt_rel_wt();
        prt_fac_cost();
        prt_alos();
        prt_los();
        prt_tot_pay();
        prt_out_thresh();
        prt_drg_adj_pay();
        prt_outlier_pay();
        prt_reg_days_used();
        prt_fac_spec_rate();
        prt_pps_rtc();
        prt_wage_index();
        pps_headings();
        prtoper_line();
        operline_ctr();
    }

    private void para_open() {
        /* RAW: INPUT  */
    }

    private void billfile() {
    }

    private void prtoper() {
    }

    private void pps_versions() {
        _0100();
        /* RAW: - PROCESS-RECORDS THRU 0100 - */
        return;
    }

    private void billfile_2() {
    }

    private void prtoper_2() {
        System.exit(0);
    }

    private void process_records() {
        if (billfile.read(bill_work) == FileStatus.AT_END) {
            /* RAW: EOF-SW  */
        }
    }

    private void bill_new_data() {
        if (eof_sw == 0) {
            _1000();
            /* RAW: - CALC-PAYMENT THRU 1000 - */
    // break;
            /* RAW: 1100 - WRITE-SYSUT2 THRU 1100 - */
            return;
        }
        /* RAW: 0100 - */
        return;
    }

    private void calc_payment() {
    }

    private void pricer_option_sw() {
        CobolProgram.call(String.valueOf(ltopn202), bill_new_data, pps_data_all, pps_cbsa, pps_payment_data);
    }

    private void pricer_opt_vers_sw() {
        /* RAW: 1000 - */
        return;
    }

    private void write_sysut2() {
        if (operline_ctr > 54) {
            _1200();
            /* RAW: - PPS-HEADINGS THRU 1200 - */
            return;
        }
    }

    private void pps_detail_line_oper() {
    }

    private void prt_prov() {
    }

    private void prt_ltr_days_used() {
    }

    private void prt_rel_wt() {
    }

    private void prt_fac_cost() {
    }

    private void prt_alos() {
    }

    private void prt_los() {
    }

    private void prt_tot_pay() {
    }

    private void prt_out_thresh() {
    }

    private void prt_drg_adj_pay() {
    }

    private void prt_outlier_pay() {
    }

    private void prt_reg_days_used() {
    }

    private void prt_fac_spec_rate() {
    }

    private void prt_pps_rtc() {
    }

    private void prt_wage_index() {
        if (String.valueOf(pps_rtc).equals(String.valueOf(67))) {
            /* RAW: PRT-OUT-THRESH  */
        }
        prtoper.write(pps_detail_line_oper);
        if (Integer.parseInt(String.valueOf(opr_stat1).trim()) > 0) {
            CobolDisplay.display(" BAD4 WRITE ON PRTOPER FILE");
        }
        operline_ctr = new BigDecimal(String.valueOf(operline_ctr + 1).trim()).intValue();
        /* RAW: 1100 - */
        return;
    }

    private void pps_headings() {
        prtoper.write(pps_head2_oper);
        if (Integer.parseInt(String.valueOf(opr_stat1).trim()) > 0) {
            CobolDisplay.display(" BAD5 WRITE ON PRTOPER FILE");
        }
        prtoper.write(pps_head3_oper);
        if (Integer.parseInt(String.valueOf(opr_stat1).trim()) > 0) {
            CobolDisplay.display(" BAD7 WRITE ON PRTOPER FILE");
        }
        prtoper.write(pps_head4_oper);
        if (Integer.parseInt(String.valueOf(opr_stat1).trim()) > 0) {
            CobolDisplay.display(" BAD8 WRITE ON PRTOPER FILE");
        }
    }

    private void prtoper_line() {
        prtoper.write(prtoper_line);
        if (Integer.parseInt(String.valueOf(opr_stat1).trim()) > 0) {
            CobolDisplay.display(" BAD9 WRITE ON PRTOPER FILE");
        }
    }

    private void operline_ctr() {
        /* RAW: 1200 - */
        return;
    }

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void _0100() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_open();
    }

    public static void main(String[] args) {
        new Ltmgr202().run();
    }
}
