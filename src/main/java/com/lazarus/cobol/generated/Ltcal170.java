package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ltcal170 extends CobolProgram {
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
    private CobolString w_storage_ref = new CobolString(46);
    private CobolString cal_version = new CobolString(5);
    private CobolString program_constants = new CobolString(1); // Group: PROGRAM-CONSTANTS
    private int fed_fy_begin_03 = 0;
    private CobolString vent_icd_10_code = new CobolString(7);
    private CobolString program_flags = new CobolString(1); // Group: PROGRAM-FLAGS
    private CobolString ws_primary_pmt_type = new CobolString(1);
    private CobolString ws_secondary_pmt_type_snt = new CobolString(1);
    private CobolString ws_secondary_pmt_type_std = new CobolString(1);
    private CobolString ws_vent_status = new CobolString(1);

    // LINKAGE SECTION
    private CobolString bill_new_data = new CobolString(1); // Group: BILL-NEW-DATA
    private CobolString b_npi10 = new CobolString(1); // Group: B-NPI10
    private CobolString b_npi8 = new CobolString(8);
    private CobolString b_npi_filler = new CobolString(2);
    private CobolString b_provider_no = new CobolString(6);
    private CobolString b_patient_status = new CobolString(2);
    private int b_drg_code = 0;
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
    private CobolString pps_data_all = new CobolString(1); // Group: PPS-DATA-ALL
    private CobolString pps_rtc = new CobolString(1); // Group: PPS-RTC
    private CobolString pps_rtc_1 = new CobolString(1);
    private CobolString pps_rtc_2 = new CobolString(1);
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
    private CobolString pps_pc_data = new CobolString(1); // Group: PPS-PC-DATA
    private CobolString pps_cot_ind = new CobolString(1);
    private CobolString h_pc_ind = new CobolString(2);
    private CobolString pps_cbsa = new CobolString(5);
    private CobolString pps_payment_data = new CobolString(1); // Group: PPS-PAYMENT-DATA
    private int pps_site_neutral_cost_pmt = 0;
    private int pps_site_neutral_ipps_pmt = 0;
    private int pps_standard_full_pmt = 0;
    private int pps_standard_sso_pmt = 0;
    private CobolString pricer_opt_vers_sw = new CobolString(1); // Group: PRICER-OPT-VERS-SW
    private CobolString pricer_option_sw = new CobolString(1);
    private CobolString pps_versions = new CobolString(1); // Group: PPS-VERSIONS
    private CobolString ppdrv_version = new CobolString(5);
    private CobolString prov_new_hold = new CobolString(1); // Group: PROV-NEW-HOLD
    private CobolString prov_newrec_hold1 = new CobolString(1); // Group: PROV-NEWREC-HOLD1
    private CobolString p_new_npi10 = new CobolString(1); // Group: P-NEW-NPI10
    private CobolString p_new_npi8 = new CobolString(8);
    private CobolString p_new_npi_filler = new CobolString(2);
    private CobolString p_new_provider_no = new CobolString(1); // Group: P-NEW-PROVIDER-NO
    private int p_new_state = 0;
    private CobolString p_new_date_data = new CobolString(1); // Group: P-NEW-DATE-DATA
    private CobolString p_new_eff_date = new CobolString(1); // Group: P-NEW-EFF-DATE
    private int p_new_eff_dt_cc = 0;
    private int p_new_eff_dt_yy = 0;
    private int p_new_eff_dt_mm = 0;
    private int p_new_eff_dt_dd = 0;
    private CobolString p_new_fy_begin_date = new CobolString(1); // Group: P-NEW-FY-BEGIN-DATE
    private int p_new_fy_beg_dt_cc = 0;
    private int p_new_fy_beg_dt_yy = 0;
    private int p_new_fy_beg_dt_mm = 0;
    private int p_new_fy_beg_dt_dd = 0;
    private CobolString p_new_report_date = new CobolString(1); // Group: P-NEW-REPORT-DATE
    private int p_new_report_dt_cc = 0;
    private int p_new_report_dt_yy = 0;
    private int p_new_report_dt_mm = 0;
    private int p_new_report_dt_dd = 0;
    private CobolString p_new_termination_date = new CobolString(1); // Group: P-NEW-TERMINATION-DATE
    private int p_new_term_dt_cc = 0;
    private int p_new_term_dt_yy = 0;
    private int p_new_term_dt_mm = 0;
    private int p_new_term_dt_dd = 0;
    private CobolString p_new_waiver_code = new CobolString(1);
    private int p_new_inter_no = 0;
    private CobolString p_new_provider_type = new CobolString(2);
    private int p_new_current_census_div = 0;
    private int p_new_current_div = 0;
    private CobolString p_new_msa_data = new CobolString(1); // Group: P-NEW-MSA-DATA
    private CobolString p_new_chg_code_index = new CobolString(1);
    private CobolString p_new_geo_loc_msax = new CobolString(4);
    private int p_new_geo_loc_msa9 = 0;
    private CobolString p_new_wage_index_loc_msa = new CobolString(4);
    private CobolString p_new_stand_amt_loc_msa = new CobolString(4);
    private CobolString p_new_stand_amt_loc_msa9 = new CobolString(1); // Group: P-NEW-STAND-AMT-LOC-MSA9
    private CobolString p_new_rural_1st = new CobolString(1); // Group: P-NEW-RURAL-1ST
    private CobolString p_new_stand_rural = new CobolString(2);
    private CobolString p_new_rural_2nd = new CobolString(2);
    private CobolString p_new_sol_com_dep_hosp_yr = new CobolString(2);
    private CobolString p_new_lugar = new CobolString(1);
    private CobolString p_new_temp_relief_ind = new CobolString(1);
    private CobolString p_new_fed_pps_blend_ind = new CobolString(1);
    private int p_new_state_code = 0;
    private CobolString p_new_state_code_x = new CobolString(2);
    private CobolString prov_newrec_hold2 = new CobolString(1); // Group: PROV-NEWREC-HOLD2
    private CobolString p_new_variables = new CobolString(1); // Group: P-NEW-VARIABLES
    private int p_new_fac_spec_rate = 0;
    private int p_new_cola = 0;
    private int p_new_intern_ratio = 0;
    private int p_new_bed_size = 0;
    private int p_new_oper_cstchg_ratio = 0;
    private int p_new_cmi = 0;
    private BigDecimal p_new_ssi_ratio = BigDecimal.ZERO;
    private BigDecimal p_new_medicaid_ratio = BigDecimal.ZERO;
    private int p_new_pps_blend_yr_ind = 0;
    private int p_new_pruf_updte_factor = 0;
    private BigDecimal p_new_dsh_percent = BigDecimal.ZERO;
    private CobolString p_new_fye_date = new CobolString(8);
    private CobolString p_new_special_pay_ind = new CobolString(1);
    private CobolString p_new_hosp_qual_ind = new CobolString(1);
    private CobolString p_new_geo_loc_cbsax = new CobolString(5);
    private int p_new_geo_loc_cbsa9 = 0;
    private CobolString p_new_geo_loc_cbsa_ast = new CobolString(1); // Group: P-NEW-GEO-LOC-CBSA-AST
    private CobolString p_new_geo_loc_cbsa_1st = new CobolString(1);
    private CobolString p_new_geo_loc_cbsa_2nd = new CobolString(1);
    private CobolString p_new_geo_loc_cbsa_3rd = new CobolString(1);
    private CobolString p_new_geo_loc_cbsa_4th = new CobolString(1);
    private CobolString p_new_geo_loc_cbsa_5th = new CobolString(1);
    private int p_new_special_wage_index = 0;
    private CobolString prov_newrec_hold3 = new CobolString(1); // Group: PROV-NEWREC-HOLD3
    private CobolString p_new_pass_amt_data = new CobolString(1); // Group: P-NEW-PASS-AMT-DATA
    private int p_new_pass_amt_capital = 0;
    private int p_new_pass_amt_dir_med_ed = 0;
    private int p_new_pass_amt_organ_acq = 0;
    private int p_new_pass_amt_plus_misc = 0;
    private CobolString p_new_capi_data = new CobolString(1); // Group: P-NEW-CAPI-DATA
    private CobolString p_new_capi_pps_pay_code = new CobolString(1);
    private int p_new_capi_hosp_spec_rate = 0;
    private int p_new_capi_old_harm_rate = 0;
    private int p_new_capi_new_harm_ratio = 0;
    private int p_new_capi_cstchg_ratio = 0;
    private CobolString p_new_capi_new_hosp = new CobolString(1);
    private int p_new_capi_ime = 0;
    private int p_new_capi_exceptions = 0;
    private int p_val_based_purch_score = 0;
    private CobolString wage_new_index_record = new CobolString(1); // Group: WAGE-NEW-INDEX-RECORD
    private CobolString w_cbsa = new CobolString(5);
    private CobolString w_eff_date = new CobolString(8);
    private BigDecimal w_wage_index1 = BigDecimal.ZERO;
    private BigDecimal w_wage_index2 = BigDecimal.ZERO;
    private BigDecimal w_wage_index3 = BigDecimal.ZERO;
    private CobolString wage_new_ipps_index_record = new CobolString(1); // Group: WAGE-NEW-IPPS-INDEX-RECORD
    private CobolString w_cbsa_ipps = new CobolString(1); // Group: W-CBSA-IPPS
    private CobolString cbsa_ipps_123 = new CobolString(3);
    private CobolString cbsa_ipps_45 = new CobolString(2);
    private CobolString w_cbsa_ipps_size = new CobolString(1);
    private CobolString w_cbsa_ipps_eff_date = new CobolString(8);
    private BigDecimal w_ipps_wage_index = BigDecimal.ZERO;
    private BigDecimal w_ipps_pr_wage_index = BigDecimal.ZERO;


    private CobolString old_error_code = new CobolString(256); // fallback
    private CobolString new_error_code = new CobolString(256); // fallback
    private CobolString wk_hlddrg_data = new CobolString(256); // fallback
    private CobolString h_ipps_wage_index = new CobolString(256); // fallback
    private CobolString h_ipps_nat_labor_shr = new CobolString(256); // fallback
    private CobolString h_ipps_nat_nonlabor_shr = new CobolString(256); // fallback
    private CobolString h_los = new CobolString(256); // fallback
    private CobolString p_new_waiver_state = new CobolString(256); // fallback
    private CobolString h_reg_days = new CobolString(256); // fallback
    private CobolString h_total_days = new CobolString(256); // fallback
    private CobolString h_capi_ime_ratio = new CobolString(256); // fallback
    private CobolString h_intern_ratio = new CobolString(256); // fallback
    private CobolString h_bed_size = new CobolString(256); // fallback
    private CobolString h_ssi_ratio = new CobolString(256); // fallback
    private CobolString h_medicaid_ratio = new CobolString(256); // fallback
    private CobolString[] wwm_relwt = new CobolString[100]; // fallback array
    private CobolString wwm_indx = new CobolString(256); // fallback
    private CobolString[] wwm_alos = new CobolString[100]; // fallback array
    private CobolString[] wwm_ipthresh = new CobolString[100]; // fallback array
    private CobolString wk_drgx_eff_date = new CobolString(256); // fallback
    private CobolString drg_idx = new CobolString(256); // fallback
    private CobolString drg_tab = new CobolString(256); // fallback
    private CobolString hlddrg_desc = new CobolString(256); // fallback
    private CobolString hlddrg_valid = new CobolString(256); // fallback
    private CobolString[] wk_drg_drgx = new CobolString[100]; // fallback array
    private CobolString[] drg_data_tab = new CobolString[100]; // fallback array
    private CobolString hlddrg_data = new CobolString(256); // fallback
    private CobolString hlddrg_drgx = new CobolString(256); // fallback
    private CobolString hlddrg_weight = new CobolString(256); // fallback
    private CobolString hlddrg_weight2 = new CobolString(256); // fallback
    private CobolString hlddrg_gmalos = new CobolString(256); // fallback
    private CobolString hlddrg_gmalos2 = new CobolString(256); // fallback
    private CobolString hlddrg_low = new CobolString(256); // fallback
    private CobolString hlddrg_arith_alos = new CobolString(256); // fallback
    private CobolString hlddrg_arith_alos2 = new CobolString(256); // fallback
    private CobolString hlddrg_pac = new CobolString(256); // fallback
    private CobolString hlddrg_sppac = new CobolString(256); // fallback
    private CobolString pmt_standard_old = new CobolString(256); // fallback
    private CobolString pmt_standard_new = new CobolString(256); // fallback
    private CobolString pmt_site_neutral = new CobolString(256); // fallback
    private CobolString pmt_blend = new CobolString(256); // fallback
    private CobolString subclauseii_prov = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString psych_rehab_drg = new CobolString(256); // fallback
    private CobolString h_bdgt_neut_factor = new CobolString(256); // fallback
    private CobolString h_blend_std = new CobolString(256); // fallback
    private CobolString h_blend_snt = new CobolString(256); // fallback
    private CobolString h_labor_portion = new CobolString(256); // fallback
    private CobolString h_nonlabor_portion = new CobolString(256); // fallback
    private CobolString h_ssot = new CobolString(256); // fallback
    private CobolString pmt_standard_sso = new CobolString(256); // fallback
    private CobolString pmt_standard_full = new CobolString(256); // fallback
    private CobolString h_ipps_per_diem = new CobolString(256); // fallback
    private CobolString pmt_site_neut_cost = new CobolString(256); // fallback
    private CobolString pmt_site_neut_ipps = new CobolString(256); // fallback
    private CobolString h_ss_cost = new CobolString(256); // fallback
    private CobolString h_ss_pay_amt = new CobolString(256); // fallback
    private CobolString h_ss_cost_ind = new CobolString(256); // fallback
    private CobolString h_ss_perdiem_ind = new CobolString(256); // fallback
    private CobolString h_ss_blended_pmt = new CobolString(256); // fallback
    private CobolString h_ss_blend_ind = new CobolString(256); // fallback
    private CobolString h_ss_ippscomp_ind = new CobolString(256); // fallback
    private CobolString h_ltch_blend_pct = new CobolString(256); // fallback
    private CobolString h_ltch_blend_amt = new CobolString(256); // fallback
    private CobolString h_ipps_blend_pct = new CobolString(256); // fallback
    private CobolString h_ipps_blend_amt = new CobolString(256); // fallback
    private CobolString h_oper_ime_teach = new CobolString(256); // fallback
    private CobolString h_capi_ime_teach = new CobolString(256); // fallback
    private CobolString all_rural = new CobolString(256); // fallback
    private CobolString rural_cbsa = new CobolString(256); // fallback
    private CobolString urban_cbsa = new CobolString(256); // fallback
    private CobolString h_oper_dsh_pct = new CobolString(256); // fallback
    private CobolString h_geo_class = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString h_oper_dsh = new CobolString(256); // fallback
    private CobolString h_oper_dsh_reduction_factor = new CobolString(256); // fallback
    private CobolString h_capi_dsh = new CobolString(256); // fallback
    private CobolString h_oper_cola = new CobolString(256); // fallback
    private CobolString h_stand_amt_oper_pmt = new CobolString(256); // fallback
    private CobolString h_ipps_drg_wgt = new CobolString(256); // fallback
    private CobolString h_capi_cola = new CobolString(256); // fallback
    private CobolString large_urban = new CobolString(256); // fallback
    private CobolString h_lrgurb_add_on = new CobolString(256); // fallback
    private CobolString h_capi_gaf = new CobolString(256); // fallback
    private CobolString h_capi_pmt = new CobolString(256); // fallback
    private CobolString h_ipps_capi_std_fed_rate = new CobolString(256); // fallback
    private CobolString h_ipps_pay_amt = new CobolString(256); // fallback
    private CobolString h_ipps_drg_alos = new CobolString(256); // fallback
    private CobolString h_fixed_loss_amt_std = new CobolString(256); // fallback
    private CobolString h_fixed_loss_amt_snt = new CobolString(256); // fallback
    private CobolString h_outlier_threshold_std = new CobolString(256); // fallback
    private CobolString h_outlier_pay_amt_std = new CobolString(256); // fallback
    private CobolString h_outlier_pay_amt_snt = new CobolString(256); // fallback
    private CobolString pc_pricer = new CobolString(256); // fallback
    private CobolString vent_present = new CobolString(256); // fallback
    private CobolString vent_not_present = new CobolString(256); // fallback
    private CobolString hold_pps_components = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void mainline_control() {
    // _0100();
        /* RAW: - INITIAL-ROUTINE THRU 0100 - */
        return;
    }

    private void initial_routine() {
    }

    private void pps_rtc() {
    }

    private void pps_data() {
    }

    private void pps_other_data() {
    }

    private void pps_cbsa() {
    }

    private void pps_payment_data() {
    }

    private void hold_pps_components() {
    }

    private void program_flags() {
        wk_hlddrg_data.set("");
    }

    private void wk_hlddrg_data2() {
    }

    private void pps_cbsa_2() {
    }

    private void pps_nat_labor_pct() {
    }

    private void pps_nat_nonlabor_pct() {
        if (String.valueOf(p_new_hosp_qual_ind).equals(String.valueOf("1"))) {
            pps_std_fed_rate = new BigDecimal(String.valueOf(42476.41).trim()).intValue();
        } else {
            /* RAW: PPS-STD-FED-RATE  */
        }
    }

    private void h_fixed_loss_amt_std() {
    }

    private void h_fixed_loss_amt_snt() {
    }

    private void pps_bdgt_neut_rate() {
    }

    private void h_ipps_capi_std_fed_rate() {
    }

    private void h_ipps_wage_index() {
        if (Integer.parseInt(String.valueOf(h_ipps_wage_index).trim()) > 1) {
            h_ipps_nat_labor_shr.set(String.valueOf(3839.23));
            h_ipps_nat_nonlabor_shr.set(String.valueOf(1676.91));
        } else {
            h_ipps_nat_labor_shr.set(String.valueOf(3420.01));
            h_ipps_nat_nonlabor_shr.set(String.valueOf(2096.13));
        }
    }

    private void h_oper_dsh_reduction_factor() {
        /* RAW: 0100 - */
        return;
    }

    private void edit_input_data() {
        if ((CobolIntrinsics.isNumeric(b_los) && b_los > 0)) {
            h_los.set(String.valueOf(b_los));
        } else {
            /* RAW: PPS-RTC  */
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (!CobolIntrinsics.isNumeric(p_new_cola)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (!String.valueOf(p_new_waiver_state).trim().isEmpty()) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (!CobolIntrinsics.isNumeric(b_drg_code)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if ((String.valueOf(b_discharge_date).compareTo(String.valueOf(p_new_eff_date)) < 0 || String.valueOf(b_discharge_date).compareTo(String.valueOf(w_eff_date)) < 0)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (Integer.parseInt(String.valueOf(p_new_termination_date).trim()) > 0) {
                if (String.valueOf(b_discharge_date).compareTo(String.valueOf(p_new_termination_date)) >= 0) {
                    /* RAW: PPS-RTC  */
                }
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (!CobolIntrinsics.isNumeric(b_cov_charges)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if ((!CobolIntrinsics.isNumeric(b_ltr_days) || b_ltr_days > 60)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if ((!CobolIntrinsics.isNumeric(b_cov_days) || (b_cov_days == 0 && Integer.parseInt(String.valueOf(h_los).trim()) > 0))) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (b_ltr_days > b_cov_days) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (((b_review_code < 0 || b_review_code > 8) || !CobolIntrinsics.isNumeric(b_review_code))) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            h_reg_days.set(String.valueOf((b_cov_days - b_ltr_days)));
            h_total_days.set(String.valueOf((Integer.parseInt(String.valueOf(h_reg_days).trim()) + b_ltr_days)));
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
    // _1200();
            /* RAW: - DAYS-USED THRU 1200 - */
            /* RAW: DAYS-USED-EXIT  */
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (Integer.parseInt(String.valueOf(p_new_fy_begin_date).trim()) < fed_fy_begin_03) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (!CobolIntrinsics.isNumeric(p_new_oper_cstchg_ratio)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (CobolIntrinsics.isNumeric(p_new_capi_ime)) {
                h_capi_ime_ratio.set(String.valueOf(p_new_capi_ime));
            } else {
                h_capi_ime_ratio.set(String.valueOf(0));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (CobolIntrinsics.isNumeric(p_new_intern_ratio)) {
                h_intern_ratio.set(String.valueOf(p_new_intern_ratio));
            } else {
                h_intern_ratio.set(String.valueOf(0));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (CobolIntrinsics.isNumeric(p_new_bed_size)) {
                h_bed_size.set(String.valueOf(p_new_bed_size));
            } else {
                h_bed_size.set(String.valueOf(0));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (CobolIntrinsics.isNumeric(p_new_ssi_ratio)) {
                h_ssi_ratio.set(String.valueOf(p_new_ssi_ratio));
            } else {
                h_ssi_ratio.set(String.valueOf(0));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            if (CobolIntrinsics.isNumeric(p_new_medicaid_ratio)) {
                h_medicaid_ratio.set(String.valueOf(p_new_medicaid_ratio));
            } else {
                h_medicaid_ratio.set(String.valueOf(0));
            }
        }
        /* RAW: 1000 - */
        return;
    }

    private void days_used() {
        if ((b_ltr_days > 0 && String.valueOf(h_reg_days).equals(String.valueOf(0)))) {
            if (b_ltr_days > Integer.parseInt(String.valueOf(h_los).trim())) {
                pps_ltr_days_used = new BigDecimal(String.valueOf(h_los).trim()).intValue();
            } else {
                pps_ltr_days_used = new BigDecimal(String.valueOf(b_ltr_days).trim()).intValue();
            }
        } else {
            if ((Integer.parseInt(String.valueOf(h_reg_days).trim()) > 0 && b_ltr_days == 0)) {
                if (String.valueOf(h_reg_days).compareTo(String.valueOf(h_los)) > 0) {
                    pps_reg_days_used = new BigDecimal(String.valueOf(h_los).trim()).intValue();
                } else {
                    pps_reg_days_used = new BigDecimal(String.valueOf(h_reg_days).trim()).intValue();
                }
            } else {
                if ((Integer.parseInt(String.valueOf(h_reg_days).trim()) > 0 && b_ltr_days > 0)) {
                    if (String.valueOf(h_reg_days).compareTo(String.valueOf(h_los)) > 0) {
                        pps_reg_days_used = new BigDecimal(String.valueOf(h_los).trim()).intValue();
                        pps_ltr_days_used = new BigDecimal(String.valueOf(0).trim()).intValue();
                    } else {
                        if (String.valueOf(h_total_days).compareTo(String.valueOf(h_los)) > 0) {
                            pps_reg_days_used = new BigDecimal(String.valueOf(h_reg_days).trim()).intValue();
                            pps_ltr_days_used = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(h_los).trim()) - Integer.parseInt(String.valueOf(h_reg_days).trim()))).trim()).intValue();
                        } else {
                            if (String.valueOf(h_total_days).compareTo(String.valueOf(h_los)) <= 0) {
                                pps_reg_days_used = new BigDecimal(String.valueOf(h_reg_days).trim()).intValue();
                                pps_ltr_days_used = new BigDecimal(String.valueOf(b_ltr_days).trim()).intValue();
                            } else {
                                /* NEXT SENTENCE */
                            }
                        }
                    }
                } else {
                    /* NEXT SENTENCE */
                }
            }
        }
        /* RAW: 1200 - */
    }

    private void days_used_exit() {
        return;
    }

    private void edit_drg_code() {
    }

    private void pps_subm_drg_code() {
        if (String.valueOf(pps_rtc).equals(String.valueOf("00"))) {
            /* SEARCH ALL WWM-ENTRY — binary search */
            {
                boolean _found = false;
                /* Binary search implementation needed */
                if (!_found) {
                    pps_rtc.set(String.valueOf("54"));
                }
            }
        }
        /* RAW: 1700 - */
        return;
    }

    private void find_value() {
    }

    private void pps_relative_wgt() {
    }

    private void pps_avg_los() {
    }

    private void pps_ipthresh() {
        /* RAW: 1750 - */
        return;
    }

    private void edit_ipps_drg_code() {
        if (String.valueOf(b_discharge_date).compareTo(String.valueOf(wk_drgx_eff_date)) >= 0) {
            drg_idx.set(String.valueOf(1));
            /* SEARCH DRG-TAB */
            {
                boolean _found = false;
    // for (int _idx = 0; _idx < drg_tab.length && !_found; _idx++) {
    // if (String.valueOf(wk_drg_drgx[Integer.parseInt(String.valueOf(drg_idx).trim()) - 1]).equals(String.valueOf(b_drg_code))) {
    // /* RAW: HLDDRG-DATA  */
    // _found = true;
    // }
    // }
                if (!_found) {
                    hlddrg_desc.set(String.valueOf(" NO DRG CODE    FOUND"));
                    hlddrg_valid.set(String.valueOf("I"));
                    pps_rtc.set(String.valueOf("54"));
    // _1800();
                    return;
                }
            }
        }
    }

    private void wk_hlddrg_data2_2() {
    }

    private void hlddrg_drgx2() {
        hlddrg_weight2.set(String.valueOf(hlddrg_weight));
    }

    private void h_ipps_drg_wgt() {
        hlddrg_gmalos2.set(String.valueOf(hlddrg_gmalos));
    }

    private void h_ipps_drg_alos() {
    }

    private void hlddrg_low2() {
        hlddrg_arith_alos2.set(String.valueOf(hlddrg_arith_alos));
    }

    private void h_ipps_arith_alos() {
    }

    private void hlddrg_pac2() {
    }

    private void hlddrg_sppac2() {
    }

    private void hlddrg_desc2() {
    }

    private void hlddrg_valid() {
    }

    private void h_ipps_days_cutoff() {
        /* RAW: 1800 - */
        return;
    }

    private void assemble_pps_variables() {
        if ((CobolIntrinsics.isNumeric(w_wage_index3) && w_wage_index3.compareTo(new BigDecimal(String.valueOf(0).trim())) > 0)) {
            pps_wage_index = new BigDecimal(String.valueOf(w_wage_index3).trim()).intValue();
        } else {
            pps_rtc.set(String.valueOf("52"));
    // _2000();
            return;
        }
    }

    private void pps_blend_year() {
        if ((b_review_code == 0 && pps_blend_year != 5)) {
            pps_blend_year = new BigDecimal(String.valueOf(5).trim()).intValue();
        }
        if (((b_review_code >= 1 && b_review_code <= 8) && (pps_blend_year < 6 || pps_blend_year > 8))) {
            pps_rtc.set(String.valueOf("72"));
    // _2000();
            return;
        }
    }

    private void h_blend_snt() {
    }

    private void h_blend_std() {
    }

    private void h_blend_rtc() {
        if ((p_new_state == 2 || true)) {
            pps_cola = new BigDecimal(String.valueOf(p_new_cola).trim()).intValue();
        } else {
            pps_cola = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        /* RAW: 2000 - */
        return;
    }

    private void calc_payment() {
        pps_fac_costs = new BigDecimal(String.valueOf((p_new_oper_cstchg_ratio * b_cov_charges)).trim()).intValue();
    // _3100();
        /* RAW: - DETERMINE-PAYMENT-TYPE THRU 3100 - */
        return;
    }

    private void determine_payment_type() {
        if ((b_review_code == 0 || !String.valueOf(subclauseii_prov).trim().isEmpty())) {
            pmt_standard_old.set(String.valueOf(cb_true));
    // _3100();
            return;
        }
        if ((((b_review_code == 1 && !(!String.valueOf(psych_rehab_drg).trim().isEmpty())) || b_review_code == 4) || b_review_code == 5)) {
            pmt_standard_new.set(String.valueOf(cb_true));
    // _3100();
            return;
        }
        if (((((((b_review_code == 1 && !String.valueOf(psych_rehab_drg).trim().isEmpty()) || b_review_code == 2) || b_review_code == 3) || b_review_code == 6) || b_review_code == 7) || b_review_code == 8)) {
            h_bdgt_neut_factor.set(String.valueOf(0.949));
            if (pps_blend_year == 8) {
                pmt_site_neutral.set(String.valueOf(cb_true));
            } else {
                if ((pps_blend_year == 6 || pps_blend_year == 7)) {
                    pmt_blend.set(String.valueOf(cb_true));
                    h_blend_std.set(String.valueOf(0.5));
                    h_blend_snt.set(String.valueOf(0.5));
                }
            }
        }
        if (String.valueOf(ws_primary_pmt_type).equals(String.valueOf(" "))) {
            pps_rtc.set(String.valueOf("72"));
        }
        /* RAW: 3100 - */
        return;
    }

    private void calc_standard_pmt() {
        h_labor_portion.set(String.valueOf((((pps_std_fed_rate * pps_nat_labor_pct)) * pps_wage_index)));
        h_nonlabor_portion.set(String.valueOf((((pps_std_fed_rate * pps_nat_nonlabor_pct)) * pps_cola)));
        pps_fed_pay_amt = new BigDecimal(String.valueOf(((Integer.parseInt(String.valueOf(h_labor_portion).trim()) + Integer.parseInt(String.valueOf(h_nonlabor_portion).trim())))).trim()).intValue();
        pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(((pps_fed_pay_amt * pps_relative_wgt))).trim()).intValue();
    }

    private void h_pps_drg_unadj_pay_amt() {
        h_ssot.set(String.valueOf((((pps_avg_los / 6)) * 5)));
        if (String.valueOf(h_los).compareTo(String.valueOf(h_ssot)) <= 0) {
    // _3400();
            /* RAW: - SHORT-STAY THRU 3400 - SHORT-STAY-EXIT */
            if ((!String.valueOf(pmt_standard_new).trim().isEmpty() || !String.valueOf(pmt_blend).trim().isEmpty())) {
                pmt_standard_sso.set(String.valueOf(cb_true));
                pps_standard_sso_pmt = new BigDecimal(String.valueOf(pps_drg_adj_pay_amt).trim()).intValue();
            }
        } else {
            if ((!String.valueOf(pmt_standard_new).trim().isEmpty() || !String.valueOf(pmt_blend).trim().isEmpty())) {
                pmt_standard_full.set(String.valueOf(cb_true));
                pps_standard_full_pmt = new BigDecimal(String.valueOf(pps_drg_adj_pay_amt).trim()).intValue();
            }
        }
        /* RAW: 3200 - */
        return;
    }

    private void calc_site_neutral_pmt() {
    // _3650();
        /* RAW: - SS-IPPS-COMP-PMT THRU 3650 - */
    }

    private void ss_ipps_comp_pmt_exit() {
        if (pps_fac_costs < Integer.parseInt(String.valueOf(h_ipps_per_diem).trim())) {
            pmt_site_neut_cost.set(String.valueOf(cb_true));
            pps_site_neutral_cost_pmt = new BigDecimal(String.valueOf(pps_fac_costs).trim()).intValue();
        } else {
            pmt_site_neut_ipps.set(String.valueOf(cb_true));
            pps_site_neutral_ipps_pmt = new BigDecimal(String.valueOf(h_ipps_per_diem).trim()).intValue();
        }
        /* RAW: 3300 - */
        return;
    }

    private void short_stay() {
        if (!String.valueOf(subclauseii_prov).trim().isEmpty()) {
    // _4000();
            /* RAW: - SPECIAL-PROVIDER THRU 4000 - SPECIAL-PROVIDER-EXIT */
        } else {
            h_ss_cost.set(String.valueOf(pps_fac_costs));
            h_ss_pay_amt.set(String.valueOf((((((pps_drg_adj_pay_amt / pps_avg_los)) * Integer.parseInt(String.valueOf(h_los).trim()))) * 1.2)));
            if ((CobolIntrinsics.isNumeric(h_ipps_wage_index) && Integer.parseInt(String.valueOf(h_ipps_wage_index).trim()) > 0)) {
                if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) >= 20121229) {
                    if (Integer.parseInt(String.valueOf(h_los).trim()) > pps_ipthresh) {
    // _3600();
                        /* RAW: - SS-BLENDED-PMT THRU 3600 - SS-BLENDED-PMT-EXIT */
                    } else {
    // _3650();
                        /* RAW: - SS-IPPS-COMP-PMT THRU 3650 - SS-IPPS-COMP-PMT-EXIT */
                    }
                } else {
    // _3600();
                    /* RAW: - SS-BLENDED-PMT THRU 3600 - SS-BLENDED-PMT-EXIT */
                }
            } else {
                pps_rtc.set(String.valueOf("52"));
    // _3400();
                return;
            }
        }
    }

    private void h_ss_cost_ind() {
    }

    private void h_ss_perdiem_ind() {
    }

    private void h_ss_blend_ind() {
    }

    private void h_ss_ippscomp_ind() {
        if (String.valueOf(h_ss_cost).compareTo(String.valueOf(h_ss_pay_amt)) < 0) {
            if (Integer.parseInt(String.valueOf(h_ss_cost).trim()) < pps_drg_adj_pay_amt) {
                pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ss_cost).trim()).intValue();
                if (!String.valueOf(pmt_standard_old).trim().isEmpty()) {
                    pps_rtc.set(String.valueOf("20"));
                }
                h_ss_cost_ind.set(String.valueOf("Y"));
            } else {
                /* NEXT SENTENCE */
            }
        } else {
            if (Integer.parseInt(String.valueOf(h_ss_pay_amt).trim()) < pps_drg_adj_pay_amt) {
                pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ss_pay_amt).trim()).intValue();
                if (!String.valueOf(pmt_standard_old).trim().isEmpty()) {
                    pps_rtc.set(String.valueOf("21"));
                }
                h_ss_perdiem_ind.set(String.valueOf("Y"));
            } else {
                /* NEXT SENTENCE */
            }
        }
        if (!(!String.valueOf(subclauseii_prov).trim().isEmpty())) {
            if (((Integer.parseInt(String.valueOf(b_discharge_date).trim()) >= 20121229 && Integer.parseInt(String.valueOf(h_los).trim()) > pps_ipthresh) && Integer.parseInt(String.valueOf(h_ss_blended_pmt).trim()) < pps_drg_adj_pay_amt)) {
                pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ss_blended_pmt).trim()).intValue();
                if (!String.valueOf(pmt_standard_old).trim().isEmpty()) {
                    pps_rtc.set(String.valueOf("22"));
                }
                h_ss_blend_ind.set(String.valueOf("Y"));
                h_ss_cost_ind.set(String.valueOf("N"));
                h_ss_perdiem_ind.set(String.valueOf("N"));
                h_ss_ippscomp_ind.set(String.valueOf("N"));
            } else {
                if (((Integer.parseInt(String.valueOf(b_discharge_date).trim()) >= 20121229 && Integer.parseInt(String.valueOf(h_los).trim()) <= pps_ipthresh) && Integer.parseInt(String.valueOf(h_ipps_per_diem).trim()) <= pps_drg_adj_pay_amt)) {
                    pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ipps_per_diem).trim()).intValue();
                    if (!String.valueOf(pmt_standard_old).trim().isEmpty()) {
                        pps_rtc.set(String.valueOf("26"));
                    }
                    h_ss_ippscomp_ind.set(String.valueOf("Y"));
                    h_ss_blend_ind.set(String.valueOf("N"));
                    h_ss_cost_ind.set(String.valueOf("N"));
                    h_ss_perdiem_ind.set(String.valueOf("N"));
                } else {
                    if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20121229 && Integer.parseInt(String.valueOf(h_ss_blended_pmt).trim()) < pps_drg_adj_pay_amt)) {
                        pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ss_blended_pmt).trim()).intValue();
                        if (!String.valueOf(pmt_standard_old).trim().isEmpty()) {
                            pps_rtc.set(String.valueOf("22"));
                        }
                        h_ss_blend_ind.set(String.valueOf("Y"));
                        h_ss_cost_ind.set(String.valueOf("N"));
                        h_ss_perdiem_ind.set(String.valueOf("N"));
                        h_ss_ippscomp_ind.set(String.valueOf("N"));
                    }
                }
            }
        }
        /* RAW: 3400 - */
    }

    private void short_stay_exit() {
        return;
    }

    private void ss_blended_pmt() {
        if (Integer.parseInt(String.valueOf(h_ssot).trim()) < 25) {
            h_ltch_blend_pct.set(String.valueOf((Integer.parseInt(String.valueOf(h_los).trim()) / Integer.parseInt(String.valueOf(h_ssot).trim()))));
        } else {
            h_ltch_blend_pct.set(String.valueOf((Integer.parseInt(String.valueOf(h_los).trim()) / 25)));
        }
        if (Integer.parseInt(String.valueOf(h_ltch_blend_pct).trim()) > 1) {
            h_ltch_blend_pct.set(String.valueOf(1));
        }
        h_ltch_blend_amt.set(String.valueOf((Integer.parseInt(String.valueOf(h_ss_pay_amt).trim()) * Integer.parseInt(String.valueOf(h_ltch_blend_pct).trim()))));
    // _3650();
        /* RAW: - SS-IPPS-COMP-PMT THRU 3650 - */
    }

    private void ss_ipps_comp_pmt_exit_2() {
        h_ipps_blend_pct.set(String.valueOf((1 - Integer.parseInt(String.valueOf(h_ltch_blend_pct).trim()))));
        h_ipps_blend_amt.set(String.valueOf((Integer.parseInt(String.valueOf(h_ipps_per_diem).trim()) * Integer.parseInt(String.valueOf(h_ipps_blend_pct).trim()))));
        h_ss_blended_pmt.set(String.valueOf((Integer.parseInt(String.valueOf(h_ltch_blend_amt).trim()) + Integer.parseInt(String.valueOf(h_ipps_blend_amt).trim()))));
        /* RAW: 3600 - */
    }

    private void ss_blended_pmt_exit() {
        return;
    }

    private void ss_ipps_comp_pmt() {
        h_oper_ime_teach.set(String.valueOf((1.35 * ((Math.pow(((1 + Integer.parseInt(String.valueOf(h_intern_ratio).trim()))), 0.405) - 1)))));
        if (Integer.parseInt(String.valueOf(h_capi_ime_ratio).trim()) > 1.5) {
            /* RAW: H-CAPI-IME-RATIO  */
        }
        h_capi_ime_teach.set(String.valueOf((((Math.pow(2.7183, ((0.2822 * Integer.parseInt(String.valueOf(h_capi_ime_ratio).trim()))))) - 1))));
        if (!String.valueOf(all_rural).trim().isEmpty()) {
            rural_cbsa.set(String.valueOf(cb_true));
        } else {
            urban_cbsa.set(String.valueOf(cb_true));
        }
        h_oper_dsh_pct.set(String.valueOf(p_new_ssi_ratio.add(p_new_medicaid_ratio)));
        if (((!String.valueOf(urban_cbsa).trim().isEmpty() && Integer.parseInt(String.valueOf(h_bed_size).trim()) < 100) && Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) >= 0.15)) {
            h_geo_class.set(String.valueOf("3"));
        } else {
            if (((!String.valueOf(urban_cbsa).trim().isEmpty() && Integer.parseInt(String.valueOf(h_bed_size).trim()) >= 100) && Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) >= 0.15)) {
                h_geo_class.set(String.valueOf("2"));
            } else {
                if (((!String.valueOf(rural_cbsa).trim().isEmpty() && Integer.parseInt(String.valueOf(h_bed_size).trim()) >= 500) && Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) >= 0.15)) {
                    h_geo_class.set(String.valueOf("2"));
                } else {
                    if (((!String.valueOf(rural_cbsa).trim().isEmpty() && Integer.parseInt(String.valueOf(h_bed_size).trim()) < 500) && Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) >= 0.15)) {
                        h_geo_class.set(String.valueOf("3"));
                    } else {
                        h_geo_class.set(String.valueOf("4"));
                    }
                }
            }
        }
        if (String.valueOf(h_geo_class).equals(String.valueOf("2"))) {
            if ((Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) >= 0.15 && !String.valueOf(_unnamed).trim().isEmpty())) {
                /* RAW: .202 ) */
                h_oper_dsh.set(String.valueOf((((((Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) - 0.15)) * 0.65)) + 0.025)));
            } else {
                if (Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) > 0.202) {
                    h_oper_dsh.set(String.valueOf((((((Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) - 0.202)) * 0.825)) + 0.0588)));
                } else {
                    h_oper_dsh.set(String.valueOf(0));
                }
            }
        } else if (String.valueOf(h_geo_class).equals(String.valueOf("3"))) {
            if ((Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) >= 0.15 && !String.valueOf(_unnamed).trim().isEmpty())) {
                /* RAW: .202 ) */
                h_oper_dsh.set(String.valueOf((((((Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) - 0.15)) * 0.65)) + 0.025)));
                if (Integer.parseInt(String.valueOf(h_oper_dsh).trim()) > 0.12) {
                    h_oper_dsh.set(String.valueOf(0.12));
                }
            } else {
                if (Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) > 0.202) {
                    h_oper_dsh.set(String.valueOf((((((Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim()) - 0.202)) * 0.825)) + 0.0588)));
                    if (Integer.parseInt(String.valueOf(h_oper_dsh).trim()) > 0.12) {
                        h_oper_dsh.set(String.valueOf(0.12));
                    }
                } else {
                    h_oper_dsh.set(String.valueOf(0));
                }
            }
        } else if (String.valueOf(h_geo_class).equals(String.valueOf("4"))) {
            h_oper_dsh.set(String.valueOf(0));
        }
        h_oper_dsh.set(String.valueOf((Integer.parseInt(String.valueOf(h_oper_dsh).trim()) * Integer.parseInt(String.valueOf(h_oper_dsh_reduction_factor).trim()))));
        if ((!String.valueOf(urban_cbsa).trim().isEmpty() && Integer.parseInt(String.valueOf(h_bed_size).trim()) >= 100)) {
            h_capi_dsh.set(String.valueOf((Math.pow(2.7183, ((0.2025 * Integer.parseInt(String.valueOf(h_oper_dsh_pct).trim())))) - 1)));
        } else {
            h_capi_dsh.set(String.valueOf(0));
        }
        if ((p_new_state == 2 || true)) {
            h_oper_cola.set(String.valueOf(p_new_cola));
        } else {
            h_oper_cola.set(String.valueOf(1));
        }
        h_stand_amt_oper_pmt.set(String.valueOf(((((((Integer.parseInt(String.valueOf(h_ipps_nat_labor_shr).trim()) * Integer.parseInt(String.valueOf(h_ipps_wage_index).trim()))) + ((Integer.parseInt(String.valueOf(h_ipps_nat_nonlabor_shr).trim()) * Integer.parseInt(String.valueOf(h_oper_cola).trim()))))) * Integer.parseInt(String.valueOf(h_ipps_drg_wgt).trim())) * (((1 + Integer.parseInt(String.valueOf(h_oper_ime_teach).trim())) + Integer.parseInt(String.valueOf(h_oper_dsh).trim()))))));
        h_capi_cola.set(String.valueOf((((0.3152 * ((Integer.parseInt(String.valueOf(h_oper_cola).trim()) - 1))) + 1))));
        if (!String.valueOf(large_urban).trim().isEmpty()) {
            h_lrgurb_add_on.set(String.valueOf(1));
        } else {
            h_lrgurb_add_on.set(String.valueOf(1));
        }
        h_capi_gaf.set(String.valueOf((Math.pow(Integer.parseInt(String.valueOf(h_ipps_wage_index).trim()), 0.6848))));
        h_capi_pmt.set(String.valueOf((((((Integer.parseInt(String.valueOf(h_ipps_capi_std_fed_rate).trim()) * Integer.parseInt(String.valueOf(h_ipps_drg_wgt).trim())) * Integer.parseInt(String.valueOf(h_capi_gaf).trim())) * Integer.parseInt(String.valueOf(h_lrgurb_add_on).trim())) * Integer.parseInt(String.valueOf(h_capi_cola).trim())) * (((1 + Integer.parseInt(String.valueOf(h_capi_ime_teach).trim())) + Integer.parseInt(String.valueOf(h_capi_dsh).trim()))))));
        h_ipps_pay_amt.set(String.valueOf((Integer.parseInt(String.valueOf(h_stand_amt_oper_pmt).trim()) + Integer.parseInt(String.valueOf(h_capi_pmt).trim()))));
        h_ipps_per_diem.set(String.valueOf((((Integer.parseInt(String.valueOf(h_ipps_pay_amt).trim()) / Integer.parseInt(String.valueOf(h_ipps_drg_alos).trim()))) * Integer.parseInt(String.valueOf(h_los).trim()))));
        if (String.valueOf(h_ipps_per_diem).compareTo(String.valueOf(h_ipps_pay_amt)) > 0) {
            h_ipps_per_diem.set(String.valueOf(h_ipps_pay_amt));
        }
        /* RAW: 3650 - */
    }

    private void ss_ipps_comp_pmt_exit_3() {
        return;
    }

    private void special_provider() {
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) >= 20030701 && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20040101)) {
            h_ss_cost.set(String.valueOf(((pps_fac_costs * 1.95))));
            h_ss_pay_amt.set(String.valueOf((((((pps_drg_adj_pay_amt / pps_avg_los)) * Integer.parseInt(String.valueOf(h_los).trim()))) * 1.95)));
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) >= 20040101 && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20050101)) {
            h_ss_cost.set(String.valueOf(((pps_fac_costs * 1.93))));
            h_ss_pay_amt.set(String.valueOf((((((pps_drg_adj_pay_amt / pps_avg_los)) * Integer.parseInt(String.valueOf(h_los).trim()))) * 1.93)));
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) >= 20050101 && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20060101)) {
            h_ss_cost.set(String.valueOf(((pps_fac_costs * 1.65))));
            h_ss_pay_amt.set(String.valueOf((((((pps_drg_adj_pay_amt / pps_avg_los)) * Integer.parseInt(String.valueOf(h_los).trim()))) * 1.65)));
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) >= 20060101 && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20070101)) {
            h_ss_cost.set(String.valueOf(((pps_fac_costs * 1.36))));
            h_ss_pay_amt.set(String.valueOf((((((pps_drg_adj_pay_amt / pps_avg_los)) * Integer.parseInt(String.valueOf(h_los).trim()))) * 1.36)));
        }
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) >= 20070101) {
            h_ss_cost.set(String.valueOf(((pps_fac_costs * 1.2))));
            h_ss_pay_amt.set(String.valueOf((((((pps_drg_adj_pay_amt / pps_avg_los)) * Integer.parseInt(String.valueOf(h_los).trim()))) * 1.2)));
        }
        /* RAW: 4000 - */
    }

    private void special_provider_exit() {
        return;
    }

    private void calc_high_cost_outlier() {
        if (!String.valueOf(pmt_standard_old).trim().isEmpty()) {
            pps_outlier_threshold = new BigDecimal(String.valueOf((pps_drg_adj_pay_amt + Integer.parseInt(String.valueOf(h_fixed_loss_amt_std).trim()))).trim()).intValue();
        }
        if (!String.valueOf(pmt_standard_new).trim().isEmpty()) {
            if (!String.valueOf(pmt_standard_full).trim().isEmpty()) {
                pps_outlier_threshold = new BigDecimal(String.valueOf((pps_standard_full_pmt + Integer.parseInt(String.valueOf(h_fixed_loss_amt_std).trim()))).trim()).intValue();
            } else {
                pps_outlier_threshold = new BigDecimal(String.valueOf((pps_standard_sso_pmt + Integer.parseInt(String.valueOf(h_fixed_loss_amt_std).trim()))).trim()).intValue();
            }
        }
        if ((!String.valueOf(pmt_site_neutral).trim().isEmpty() && !String.valueOf(pmt_site_neut_ipps).trim().isEmpty())) {
            pps_outlier_threshold = new BigDecimal(String.valueOf((pps_site_neutral_ipps_pmt + Integer.parseInt(String.valueOf(h_fixed_loss_amt_snt).trim()))).trim()).intValue();
        }
        if ((!(!String.valueOf(pmt_blend).trim().isEmpty()) && !((!String.valueOf(pmt_site_neutral).trim().isEmpty() && !String.valueOf(pmt_site_neut_cost).trim().isEmpty())))) {
            if (pps_fac_costs > pps_outlier_threshold) {
                pps_outlier_pay_amt = new BigDecimal(String.valueOf((((pps_fac_costs - pps_outlier_threshold)) * 0.8)).trim()).intValue();
            }
        }
        if (!String.valueOf(pmt_blend).trim().isEmpty()) {
            if (!String.valueOf(pmt_standard_full).trim().isEmpty()) {
                h_outlier_threshold_std.set(String.valueOf((pps_standard_full_pmt + Integer.parseInt(String.valueOf(h_fixed_loss_amt_std).trim()))));
            } else {
                h_outlier_threshold_std.set(String.valueOf((pps_standard_sso_pmt + Integer.parseInt(String.valueOf(h_fixed_loss_amt_std).trim()))));
            }
            if (!String.valueOf(pmt_site_neut_ipps).trim().isEmpty()) {
                pps_outlier_threshold = new BigDecimal(String.valueOf((pps_site_neutral_ipps_pmt + Integer.parseInt(String.valueOf(h_fixed_loss_amt_snt).trim()))).trim()).intValue();
            }
            if (pps_fac_costs > Integer.parseInt(String.valueOf(h_outlier_threshold_std).trim())) {
                h_outlier_pay_amt_std.set(String.valueOf(((((pps_fac_costs - Integer.parseInt(String.valueOf(h_outlier_threshold_std).trim()))) * 0.8) * Integer.parseInt(String.valueOf(h_blend_std).trim()))));
            }
            if ((!String.valueOf(pmt_site_neut_ipps).trim().isEmpty() && pps_fac_costs > pps_outlier_threshold)) {
                h_outlier_pay_amt_snt.set(String.valueOf(((((((pps_fac_costs - pps_outlier_threshold)) * 0.8)) * Integer.parseInt(String.valueOf(h_blend_snt).trim())))));
            }
            pps_outlier_pay_amt = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(h_outlier_pay_amt_std).trim()) + Integer.parseInt(String.valueOf(h_outlier_pay_amt_snt).trim()))).trim()).intValue();
        }
        if (String.valueOf(b_spec_pay_ind).equals(String.valueOf("1"))) {
            /* RAW: PPS-OUTLIER-PAY-AMT  */
        }
    // _6100();
        /* RAW: - CALC-CHARGE-THRESHOLD THRU 6100 - */
        return;
    }

    private void calc_charge_threshold() {
        if (((pps_outlier_pay_amt > 0 && !((!String.valueOf(pmt_blend).trim().isEmpty() && String.valueOf(h_outlier_pay_amt_snt).equals(String.valueOf(0))))) || String.valueOf(pps_cot_ind).equals(String.valueOf("Y")))) {
            if ((b_cov_days < Integer.parseInt(String.valueOf(h_los).trim()) || (String.valueOf(pps_cot_ind).equals(String.valueOf("Y")) && p_new_oper_cstchg_ratio != 0))) {
                pps_chrg_threshold = new BigDecimal(String.valueOf((pps_outlier_threshold / p_new_oper_cstchg_ratio)).trim()).intValue();
                if (!(!String.valueOf(pc_pricer).trim().isEmpty())) {
                    pps_rtc.set(String.valueOf("67"));
                }
            } else {
                /* NEXT SENTENCE */
            }
        } else {
            /* NEXT SENTENCE */
        }
        /* RAW: 6100 - */
        return;
    }

    private void set_final_return_codes() {
        if (!String.valueOf(subclauseii_prov).trim().isEmpty()) {
    // _7300();
            /* RAW: - SET-SUBII-RETURN-CODES THRU 7300 - */
            return;
        }
        if (!String.valueOf(pmt_standard_old).trim().isEmpty()) {
    // _7100();
            /* RAW: - SET-OLD-RETURN-CODES THRU 7100 - */
            return;
        }
        if (((!String.valueOf(pmt_standard_new).trim().isEmpty() || !String.valueOf(pmt_site_neutral).trim().isEmpty()) || !String.valueOf(pmt_blend).trim().isEmpty())) {
    // _7200();
            /* RAW: - SET-NEW-RETURN-CODES THRU 7200 - */
            return;
        }
        /* RAW: 7000 - */
        return;
    }

    private void set_old_return_codes() {
        if ((pps_outlier_pay_amt > 0 && String.valueOf(pps_rtc).equals(String.valueOf("21")))) {
            /* RAW: PPS-RTC  */
        }
        if ((pps_outlier_pay_amt > 0 && String.valueOf(pps_rtc).equals(String.valueOf("22")))) {
            /* RAW: PPS-RTC  */
        }
        if ((pps_outlier_pay_amt > 0 && String.valueOf(pps_rtc).equals(String.valueOf("26")))) {
            /* RAW: PPS-RTC  */
        }
        if ((pps_outlier_pay_amt > 0 && String.valueOf(pps_rtc).equals(String.valueOf("00")))) {
            /* RAW: PPS-RTC  */
        }
        if (((((String.valueOf(pps_rtc).equals(String.valueOf("00")) || true) || true) || true) || true)) {
            if (pps_reg_days_used > Integer.parseInt(String.valueOf(h_ssot).trim())) {
                pps_ltr_days_used = new BigDecimal(String.valueOf(0).trim()).intValue();
            } else {
                /* NEXT SENTENCE */
            }
        }
        /* RAW: 7100 - */
        return;
    }

    private void set_new_return_codes() {
    }

    private void pps_rtc_2() {
    }

    private void pps_rtc_1() {
    // _7250();
        /* RAW: - SEARCH-FOR-VENT-PROC THRU 7250 - */
        return;
    }

    private void search_for_vent_proc() {
        idx_proc = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH B-PROCEDURE-CODE */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < b_procedure_code.length && !_found; _idx++) {
                if (String.valueOf(vent_icd_10_code).equals(String.valueOf(b_procedure_code[idx_proc - 1]))) {
                    vent_present.set(String.valueOf(cb_true));
    // _7250();
                    return;
    // _found = true;
    // }
    // }
    // if (!_found) {
    // vent_not_present.set(String.valueOf(cb_true));
    // }
    // }
    // /* RAW: 7250 - */
    // return;
    }

    // private void set_subii_return_codes() {
    // }

    // private void pps_rtc_3() {
    // if (pps_outlier_pay_amt > 0) {
    // pps_rtc.set(String.valueOf("29"));
    // } else {
    // pps_rtc.set(String.valueOf("28"));
    // }
    // }

    // private void pps_new_fac_spec_rate() {
    // pps_outlier_pay_amt = 0;
    // pps_drg_adj_pay_amt = 0;
    // pps_fed_pay_amt = 0;
    // pps_fac_costs = 0;
    // pps_subm_drg_code.set("");
    // pps_nat_labor_pct = 0;
    // pps_nat_nonlabor_pct = 0;
    // pps_std_fed_rate = 0;
    // pps_bdgt_neut_rate = 0;
    // pps_ipthresh = 0;
    // pps_site_neutral_cost_pmt = 0;
    // pps_site_neutral_ipps_pmt = 0;
    // pps_standard_full_pmt = 0;
    // }

    // private void pps_standard_sso_pmt() {
    // /* RAW: 7300 - */
    // return;
    // }

    // private void calc_final_pmt() {
    // if (!String.valueOf(subclauseii_prov).trim().isEmpty()) {
    // pps_final_pay_amt = new BigDecimal(String.valueOf((p_new_fac_spec_rate * b_cst_rpt_days)).trim()).intValue();
    // _8000();
    // return;
    // }
    // if (!String.valueOf(pmt_standard_old).trim().isEmpty()) {
    // pps_final_pay_amt = new BigDecimal(String.valueOf((pps_drg_adj_pay_amt + pps_outlier_pay_amt)).trim()).intValue();
    // }
    // if (!(!String.valueOf(pmt_standard_old).trim().isEmpty())) {
    // if (!String.valueOf(pmt_site_neutral).trim().isEmpty()) {
    // pps_site_neutral_cost_pmt = new BigDecimal(String.valueOf((pps_site_neutral_cost_pmt * Integer.parseInt(String.valueOf(h_bdgt_neut_factor).trim()))).trim()).intValue();
    // pps_site_neutral_ipps_pmt = new BigDecimal(String.valueOf((pps_site_neutral_ipps_pmt * Integer.parseInt(String.valueOf(h_bdgt_neut_factor).trim()))).trim()).intValue();
    // }
    // if (!String.valueOf(pmt_blend).trim().isEmpty()) {
    // pps_site_neutral_cost_pmt = new BigDecimal(String.valueOf(((pps_site_neutral_cost_pmt * Integer.parseInt(String.valueOf(h_bdgt_neut_factor).trim())) * Integer.parseInt(String.valueOf(h_blend_snt).trim()))).trim()).intValue();
    // pps_site_neutral_ipps_pmt = new BigDecimal(String.valueOf(((pps_site_neutral_ipps_pmt * Integer.parseInt(String.valueOf(h_bdgt_neut_factor).trim())) * Integer.parseInt(String.valueOf(h_blend_snt).trim()))).trim()).intValue();
    // pps_standard_full_pmt = new BigDecimal(String.valueOf((pps_standard_full_pmt * Integer.parseInt(String.valueOf(h_blend_std).trim()))).trim()).intValue();
    // pps_standard_sso_pmt = new BigDecimal(String.valueOf((pps_standard_sso_pmt * Integer.parseInt(String.valueOf(h_blend_std).trim()))).trim()).intValue();
    // }
    // pps_final_pay_amt = new BigDecimal(String.valueOf(((((pps_standard_full_pmt + pps_standard_sso_pmt) + pps_site_neutral_cost_pmt) + pps_site_neutral_ipps_pmt) + pps_outlier_pay_amt)).trim()).intValue();
    // }
    // /* RAW: 8000 - */
    // return;
    // }

    // private void move_results() {
    // if ((!(!String.valueOf(old_error_code).trim().isEmpty()) && !(!String.valueOf(new_error_code).trim().isEmpty()))) {
    // pps_los = new BigDecimal(String.valueOf(h_los).trim()).intValue();
    // pps_calc_vers_cd.set(String.valueOf(cal_version));
    // } else {
    // pps_data.set("");
    // pps_other_data.set("");
    // pps_cbsa.set("");
    // hold_pps_components.set("");
    // pps_calc_vers_cd.set(String.valueOf(cal_version));
    // }
    // /* RAW: 9000 - */
    // return;
    // }

    // private void _0100() { /* stub — external/COPY */ }

    // private void _1000() { /* stub — external/COPY */ }

    // private void _1700() { /* stub — external/COPY */ }

    // private void _1800() { /* stub — external/COPY */ }

    // private void _2000() { /* stub — external/COPY */ }

    // private void _3000() { /* stub — external/COPY */ }

    // private void _6000() { /* stub — external/COPY */ }

    // private void _7000() { /* stub — external/COPY */ }

    // private void _8000() { /* stub — external/COPY */ }

    // private void _9000() { /* stub — external/COPY */ }

    // private void _1200() { /* stub — external/COPY */ }

    // private void _3100() { /* stub — external/COPY */ }

    // private void _3200() { /* stub — external/COPY */ }

    // private void _3300() { /* stub — external/COPY */ }

    // private void _3400() { /* stub — external/COPY */ }

    // private void _3650() { /* stub — external/COPY */ }

    // private void _4000() { /* stub — external/COPY */ }

    // private void _3600() { /* stub — external/COPY */ }

    // private void _6100() { /* stub — external/COPY */ }

    // private void _7300() { /* stub — external/COPY */ }

    // private void _7100() { /* stub — external/COPY */ }

    // private void _7200() { /* stub — external/COPY */ }

    // private void _7250() { /* stub — external/COPY */ }

    }
    }
    }
    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Ltcal170().run();
    }
}
