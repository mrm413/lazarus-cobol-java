package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ltcal087 extends CobolProgram {
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
    private CobolString w_storage_ref = new CobolString(46);
    private CobolString cal_version = new CobolString(5);
    private CobolString program_constants = new CobolString(1); // Group: PROGRAM-CONSTANTS
    private int fed_fy_begin_03 = 0;
    private int fed_fy_begin_04 = 0;
    private int fed_fy_begin_05 = 0;
    private int fed_fy_begin_06 = 0;
    private int fed_fy_begin_07 = 0;

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
    private CobolString b_discharge_date = new CobolString(1); // Group: B-DISCHARGE-DATE
    private int b_dischg_cc = 0;
    private int b_dischg_yy = 0;
    private int b_dischg_mm = 0;
    private int b_dischg_dd = 0;
    private int b_cov_charges = 0;
    private CobolString b_spec_pay_ind = new CobolString(1);
    private CobolString pps_data_all = new CobolString(1); // Group: PPS-DATA-ALL
    private int pps_rtc = 0;
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


    private CobolString h_fixed_loss_amt = new CobolString(256); // fallback
    private CobolString h_ipps_nat_labor_shr = new CobolString(256); // fallback
    private CobolString h_ipps_nat_nonlabor_shr = new CobolString(256); // fallback
    private CobolString h_ipps_pr_labor_shr = new CobolString(256); // fallback
    private CobolString h_ipps_pr_nonlabor_shr = new CobolString(256); // fallback
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
    private CobolString[] drgx_eff_date = new CobolString[100]; // fallback array
    private CobolString dx5 = new CobolString(256); // fallback
    private CobolString dx6 = new CobolString(256); // fallback
    private CobolString[] drg_wt = new CobolString[100]; // fallback array
    private CobolString h_ipps_drg_wgt = new CobolString(256); // fallback
    private CobolString[] drg_alos = new CobolString[100]; // fallback array
    private CobolString h_ipps_drg_alos = new CobolString(256); // fallback
    private CobolString h_ipps_days_cutoff = new CobolString(256); // fallback
    private CobolString[] drg_arith_alos = new CobolString[100]; // fallback array
    private CobolString h_ipps_arith_alos = new CobolString(256); // fallback
    private CobolString h_blend_fac = new CobolString(256); // fallback
    private CobolString h_blend_pps = new CobolString(256); // fallback
    private CobolString h_blend_rtc = new CobolString(256); // fallback
    private CobolString h_labor_portion = new CobolString(256); // fallback
    private CobolString h_nonlabor_portion = new CobolString(256); // fallback
    private CobolString h_ssot = new CobolString(256); // fallback
    private CobolString h_ss_cost = new CobolString(256); // fallback
    private CobolString h_ss_pay_amt = new CobolString(256); // fallback
    private CobolString h_ss_cost_ind = new CobolString(256); // fallback
    private CobolString h_ss_perdiem_ind = new CobolString(256); // fallback
    private CobolString h_ss_blended_pmt = new CobolString(256); // fallback
    private CobolString h_ss_blend_ind = new CobolString(256); // fallback
    private CobolString h_ss_ippscomp_ind = new CobolString(256); // fallback
    private CobolString h_ipps_per_diem = new CobolString(256); // fallback
    private CobolString h_ltch_blend_pct = new CobolString(256); // fallback
    private CobolString h_ltch_blend_amt = new CobolString(256); // fallback
    private CobolString h_ipps_blend_pct = new CobolString(256); // fallback
    private CobolString h_ipps_blend_amt = new CobolString(256); // fallback
    private CobolString h_oper_ime_teach = new CobolString(256); // fallback
    private CobolString h_capi_ime_teach = new CobolString(256); // fallback
    private CobolString all_rural = new CobolString(256); // fallback
    private CobolString rural_cbsa = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString urban_cbsa = new CobolString(256); // fallback
    private CobolString h_oper_dsh_pct = new CobolString(256); // fallback
    private CobolString h_geo_class = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString h_oper_dsh = new CobolString(256); // fallback
    private CobolString h_capi_dsh = new CobolString(256); // fallback
    private CobolString h_oper_cola = new CobolString(256); // fallback
    private CobolString h_stand_amt_oper_pmt = new CobolString(256); // fallback
    private CobolString h_capi_cola = new CobolString(256); // fallback
    private CobolString large_urban = new CobolString(256); // fallback
    private CobolString h_lrgurb_add_on = new CobolString(256); // fallback
    private CobolString h_capi_gaf = new CobolString(256); // fallback
    private CobolString h_capi_pmt = new CobolString(256); // fallback
    private CobolString h_ipps_capi_std_fed_rate = new CobolString(256); // fallback
    private CobolString h_ipps_pay_amt = new CobolString(256); // fallback
    private CobolString h_pr_stand_amt_oper_pmt = new CobolString(256); // fallback
    private CobolString h_pr_capi_gaf = new CobolString(256); // fallback
    private CobolString h_pr_capi_pmt = new CobolString(256); // fallback
    private CobolString h_ipps_capi_std_pr_rate = new CobolString(256); // fallback
    private CobolString h_ipps_pr_pay_amt = new CobolString(256); // fallback
    private CobolString h_ipps_pr_per_diem = new CobolString(256); // fallback
    private CobolString h_nat_ipps_pmt_pct = new CobolString(256); // fallback
    private CobolString h_pr_ipps_pmt_pct = new CobolString(256); // fallback
    private CobolString pc_pricer = new CobolString(256); // fallback
    private CobolString h_los_ratio = new CobolString(256); // fallback
    private CobolString hold_pps_components = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void mainline_control() {
        _0100();
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

    private void hold_pps_components() {
    }

    private void pps_cbsa_2() {
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20080401) {
            pps_nat_labor_pct = new BigDecimal(String.valueOf(0.75788).trim()).intValue();
            pps_nat_nonlabor_pct = new BigDecimal(String.valueOf(0.24212).trim()).intValue();
            pps_std_fed_rate = new BigDecimal(String.valueOf(38356.45).trim()).intValue();
            h_fixed_loss_amt.set(String.valueOf(20738));
            pps_bdgt_neut_rate = new BigDecimal(String.valueOf(1).trim()).intValue();
        } else {
            pps_nat_labor_pct = new BigDecimal(String.valueOf(0.75788).trim()).intValue();
            pps_nat_nonlabor_pct = new BigDecimal(String.valueOf(0.24212).trim()).intValue();
            pps_std_fed_rate = new BigDecimal(String.valueOf(38086.04).trim()).intValue();
            h_fixed_loss_amt.set(String.valueOf(20707));
            pps_bdgt_neut_rate = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
    }

    private void h_ipps_capi_std_fed_rate() {
    }

    private void h_ipps_capi_std_pr_rate() {
    }

    private void h_nat_ipps_pmt_pct() {
    }

    private void h_pr_ipps_pmt_pct() {
        if (w_ipps_wage_index.compareTo(new BigDecimal(String.valueOf(1).trim())) > 0) {
            h_ipps_nat_labor_shr.set(String.valueOf(3478.45));
            h_ipps_nat_nonlabor_shr.set(String.valueOf(1512.15));
        } else {
            h_ipps_nat_labor_shr.set(String.valueOf(3094.17));
            h_ipps_nat_nonlabor_shr.set(String.valueOf(1896.43));
        }
        if (w_ipps_pr_wage_index.compareTo(new BigDecimal(String.valueOf(1).trim())) > 0) {
            h_ipps_pr_labor_shr.set(String.valueOf(1471.1));
            h_ipps_pr_nonlabor_shr.set(String.valueOf(901.64));
        } else {
            h_ipps_pr_labor_shr.set(String.valueOf(1392.8));
            h_ipps_pr_nonlabor_shr.set(String.valueOf(979.94));
        }
        /* RAW: 0100 - */
        return;
    }

    private void edit_the_bill_info() {
        if ((CobolIntrinsics.isNumeric(b_los) && b_los > 0)) {
            h_los.set(String.valueOf(b_los));
        } else {
            /* RAW: PPS-RTC  */
        }
        if (pps_rtc == 0) {
            if (!CobolIntrinsics.isNumeric(p_new_cola)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (pps_rtc == 0) {
            if (!String.valueOf(p_new_waiver_state).trim().isEmpty()) {
                /* RAW: PPS-RTC  */
            }
        }
        if (pps_rtc == 0) {
            if ((String.valueOf(b_discharge_date).compareTo(String.valueOf(p_new_eff_date)) < 0 || String.valueOf(b_discharge_date).compareTo(String.valueOf(w_eff_date)) < 0)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (pps_rtc == 0) {
            if (Integer.parseInt(String.valueOf(p_new_termination_date).trim()) > 0) {
                if (String.valueOf(b_discharge_date).compareTo(String.valueOf(p_new_termination_date)) >= 0) {
                    /* RAW: PPS-RTC  */
                }
            }
        }
        if (pps_rtc == 0) {
            if (!CobolIntrinsics.isNumeric(b_cov_charges)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (pps_rtc == 0) {
            if ((!CobolIntrinsics.isNumeric(b_ltr_days) || b_ltr_days > 60)) {
                /* RAW: PPS-RTC  */
            }
        }
        if (pps_rtc == 0) {
            if ((!CobolIntrinsics.isNumeric(b_cov_days) || (b_cov_days == 0 && Integer.parseInt(String.valueOf(h_los).trim()) > 0))) {
                /* RAW: PPS-RTC  */
            }
        }
        if (pps_rtc == 0) {
            if (b_ltr_days > b_cov_days) {
                /* RAW: PPS-RTC  */
            }
        }
        if (pps_rtc == 0) {
            h_reg_days.set(String.valueOf((b_cov_days - b_ltr_days)));
            h_total_days.set(String.valueOf((Integer.parseInt(String.valueOf(h_reg_days).trim()) + b_ltr_days)));
        }
        if (pps_rtc == 0) {
            _1200();
            /* RAW: - DAYS-USED THRU 1200 - */
            /* RAW: DAYS-USED-EXIT  */
        }
        if (pps_rtc == 0) {
            if (CobolIntrinsics.isNumeric(p_new_capi_ime)) {
                h_capi_ime_ratio.set(String.valueOf(p_new_capi_ime));
            } else {
                h_capi_ime_ratio.set(String.valueOf(0));
            }
        }
        if (pps_rtc == 0) {
            if (CobolIntrinsics.isNumeric(p_new_intern_ratio)) {
                h_intern_ratio.set(String.valueOf(p_new_intern_ratio));
            } else {
                h_intern_ratio.set(String.valueOf(0));
            }
        }
        if (pps_rtc == 0) {
            if (CobolIntrinsics.isNumeric(p_new_bed_size)) {
                h_bed_size.set(String.valueOf(p_new_bed_size));
            } else {
                h_bed_size.set(String.valueOf(0));
            }
        }
        if (pps_rtc == 0) {
            if (CobolIntrinsics.isNumeric(p_new_ssi_ratio)) {
                h_ssi_ratio.set(String.valueOf(p_new_ssi_ratio));
            } else {
                h_ssi_ratio.set(String.valueOf(0));
            }
        }
        if (pps_rtc == 0) {
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
        if (pps_rtc == 0) {
            /* SEARCH ALL WWM-ENTRY — binary search */
            {
                boolean _found = false;
                /* Binary search implementation needed */
                if (!_found) {
                    pps_rtc = new BigDecimal(String.valueOf(54).trim()).intValue();
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
        if (!CobolIntrinsics.isNumeric(b_drg_code)) {
            pps_rtc = new BigDecimal(String.valueOf(54).trim()).intValue();
            _1800();
            return;
        }
        if ((String.valueOf(b_discharge_date).compareTo(String.valueOf(drgx_eff_date[Integer.parseInt(String.valueOf(dx5).trim()) - 1])) >= 0 && pps_rtc == 0)) {
            dx6.set(String.valueOf(b_drg_code));
    // h_ipps_drg_wgt.set(String.valueOf(drg_wt[Integer.parseInt(String.valueOf(dx5).trim()) - 1][Integer.parseInt(String.valueOf(dx6).trim()) - 1]));
    // h_ipps_drg_alos.set(String.valueOf(drg_alos[Integer.parseInt(String.valueOf(dx5).trim()) - 1][Integer.parseInt(String.valueOf(dx6).trim()) - 1]));
            h_ipps_days_cutoff.set(String.valueOf(0));
    // h_ipps_arith_alos.set(String.valueOf(drg_arith_alos[Integer.parseInt(String.valueOf(dx5).trim()) - 1][Integer.parseInt(String.valueOf(dx6).trim()) - 1]));
        }
        /* RAW: 1800 - */
        return;
    }

    private void assemble_pps_variables() {
        if (!String.valueOf(p_new_fy_begin_date).trim().isEmpty()) {
            /* RAW: >= FED-FY-BEGIN-07 */
            if ((CobolIntrinsics.isNumeric(w_wage_index3) && w_wage_index3.compareTo(new BigDecimal(String.valueOf(0).trim())) > 0)) {
                pps_wage_index = new BigDecimal(String.valueOf(w_wage_index3).trim()).intValue();
            } else {
                pps_rtc = new BigDecimal(String.valueOf(52).trim()).intValue();
                _2000();
                return;
            }
        } else if (!String.valueOf(p_new_fy_begin_date).trim().isEmpty()) {
            /* RAW: < FED-FY-BEGIN-07 AND P-NEW-FY-BEGIN-DATE >= FED-FY-BEGIN-06 */
            if ((CobolIntrinsics.isNumeric(w_wage_index2) && w_wage_index2.compareTo(new BigDecimal(String.valueOf(0).trim())) > 0)) {
                pps_wage_index = new BigDecimal(String.valueOf(w_wage_index2).trim()).intValue();
            } else {
                pps_rtc = new BigDecimal(String.valueOf(52).trim()).intValue();
                _2000();
                return;
            }
        } else if (!String.valueOf(p_new_fy_begin_date).trim().isEmpty()) {
            /* RAW: < FED-FY-BEGIN-06 */
            pps_rtc = new BigDecimal(String.valueOf(52).trim()).intValue();
            _2000();
            return;
        } else if (!String.valueOf(p_new_fy_begin_date).trim().isEmpty()) {
            /* RAW: < FED-FY-BEGIN-03 */
            pps_rtc = new BigDecimal(String.valueOf(74).trim()).intValue();
            _2000();
            return;
        }
        if (String.valueOf(p_new_special_pay_ind).equals(String.valueOf("1"))) {
            if ((CobolIntrinsics.isNumeric(p_new_special_wage_index) && p_new_special_wage_index > 0)) {
                pps_wage_index = new BigDecimal(String.valueOf(p_new_special_wage_index).trim()).intValue();
            } else {
                pps_rtc = new BigDecimal(String.valueOf(52).trim()).intValue();
                _2000();
                return;
            }
        }
        if (!CobolIntrinsics.isNumeric(p_new_oper_cstchg_ratio)) {
            /* RAW: PPS-RTC  */
        }
    }

    private void pps_blend_year() {
        if ((pps_blend_year > 0 && pps_blend_year < 6)) {
            /* NEXT SENTENCE */
        } else {
            pps_rtc = new BigDecimal(String.valueOf(72).trim()).intValue();
            _2000();
            return;
        }
    }

    private void h_blend_fac() {
    }

    private void h_blend_pps() {
    }

    private void h_blend_rtc() {
        if (pps_blend_year == 1) {
            h_blend_fac.set(String.valueOf(0.8));
            h_blend_pps.set(String.valueOf(0.2));
            h_blend_rtc.set(String.valueOf(4));
        } else {
            if (pps_blend_year == 2) {
                h_blend_fac.set(String.valueOf(0.6));
                h_blend_pps.set(String.valueOf(0.4));
                h_blend_rtc.set(String.valueOf(8));
            } else {
                if (pps_blend_year == 3) {
                    h_blend_fac.set(String.valueOf(0.4));
                    h_blend_pps.set(String.valueOf(0.6));
                    h_blend_rtc.set(String.valueOf(12));
                } else {
                    if (pps_blend_year == 4) {
                        h_blend_fac.set(String.valueOf(0.2));
                        h_blend_pps.set(String.valueOf(0.8));
                        /* RAW: H-BLEND-RTC  */
                    }
                }
            }
        }
        /* RAW: 2000 - */
        return;
    }

    private void calc_payment() {
        if ((p_new_state == 2 || true)) {
            pps_cola = new BigDecimal(String.valueOf(p_new_cola).trim()).intValue();
        } else {
            pps_cola = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        pps_fac_costs = new BigDecimal(String.valueOf((p_new_oper_cstchg_ratio * b_cov_charges)).trim()).intValue();
        h_labor_portion.set(String.valueOf((((pps_std_fed_rate * pps_nat_labor_pct)) * pps_wage_index)));
        h_nonlabor_portion.set(String.valueOf((((pps_std_fed_rate * pps_nat_nonlabor_pct)) * pps_cola)));
        pps_fed_pay_amt = new BigDecimal(String.valueOf(((Integer.parseInt(String.valueOf(h_labor_portion).trim()) + Integer.parseInt(String.valueOf(h_nonlabor_portion).trim())))).trim()).intValue();
        pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(((pps_fed_pay_amt * pps_relative_wgt))).trim()).intValue();
    }

    private void h_pps_drg_unadj_pay_amt() {
        h_ssot.set(String.valueOf((((pps_avg_los / 6)) * 5)));
        if (String.valueOf(h_los).compareTo(String.valueOf(h_ssot)) <= 0) {
            _3400();
            /* RAW: - SHORT-STAY THRU 3400 - */
            /* RAW: SHORT-STAY-EXIT  */
        }
        /* RAW: 3000 - */
        return;
    }

    private void short_stay() {
        if (String.valueOf(p_new_provider_no).equals(String.valueOf("332006"))) {
            _4000();
            /* RAW: - SPECIAL-PROVIDER THRU 4000 - SPECIAL-PROVIDER-EXIT */
        } else {
            h_ss_cost.set(String.valueOf(pps_fac_costs));
            h_ss_pay_amt.set(String.valueOf((((((pps_drg_adj_pay_amt / pps_avg_los)) * Integer.parseInt(String.valueOf(h_los).trim()))) * 1.2)));
            if ((CobolIntrinsics.isNumeric(w_ipps_wage_index) && w_ipps_wage_index.compareTo(new BigDecimal(String.valueOf(0).trim())) > 0)) {
                if (((Integer.parseInt(String.valueOf(h_los).trim()) > pps_ipthresh && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20071229) || Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20071228)) {
                    _3600();
                    /* RAW: - SS-BLENDED-PMT THRU 3600 - SS-BLENDED-PMT-EXIT */
                } else {
                    _3650();
                    /* RAW: - SS-IPPS-COMP-PMT THRU 3650 - SS-IPPS-COMP-PMT-EXIT */
                }
            } else {
                pps_rtc = new BigDecimal(String.valueOf(52).trim()).intValue();
                _3400();
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
                pps_rtc = new BigDecimal(String.valueOf(20).trim()).intValue();
                h_ss_cost_ind.set(String.valueOf("Y"));
            } else {
                /* NEXT SENTENCE */
            }
        } else {
            if (Integer.parseInt(String.valueOf(h_ss_pay_amt).trim()) < pps_drg_adj_pay_amt) {
                pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ss_pay_amt).trim()).intValue();
                pps_rtc = new BigDecimal(String.valueOf(21).trim()).intValue();
                h_ss_perdiem_ind.set(String.valueOf("Y"));
            } else {
                /* NEXT SENTENCE */
            }
        }
        if (!String.valueOf(p_new_provider_no).equals(String.valueOf("332006"))) {
            if (((Integer.parseInt(String.valueOf(h_los).trim()) > pps_ipthresh && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20071229) || Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20071228)) {
                if (Integer.parseInt(String.valueOf(h_ss_blended_pmt).trim()) < pps_drg_adj_pay_amt) {
                    pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ss_blended_pmt).trim()).intValue();
                    pps_rtc = new BigDecimal(String.valueOf(22).trim()).intValue();
                    h_ss_blend_ind.set(String.valueOf("Y"));
                    h_ss_cost_ind.set(String.valueOf("N"));
                    h_ss_perdiem_ind.set(String.valueOf("N"));
                    h_ss_ippscomp_ind.set(String.valueOf("N"));
                } else {
                    /* NEXT SENTENCE */
                }
            } else {
                if (Integer.parseInt(String.valueOf(h_ipps_per_diem).trim()) < pps_drg_adj_pay_amt) {
                    pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ipps_per_diem).trim()).intValue();
                    pps_rtc = new BigDecimal(String.valueOf(26).trim()).intValue();
                    h_ss_ippscomp_ind.set(String.valueOf("Y"));
                    h_ss_blend_ind.set(String.valueOf("N"));
                    h_ss_cost_ind.set(String.valueOf("N"));
                    h_ss_perdiem_ind.set(String.valueOf("N"));
                } else {
                    /* NEXT SENTENCE */
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
        _3650();
        /* RAW: - SS-IPPS-COMP-PMT THRU 3650 - */
    }

    private void ss_ipps_comp_pmt_exit() {
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
        h_capi_ime_teach.set(String.valueOf(((Math.pow(2.7183, ((0.2822 * Integer.parseInt(String.valueOf(h_capi_ime_ratio).trim()))))) - 1)));
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
    // h_stand_amt_oper_pmt.set(String.valueOf((((((new BigDecimal(String.valueOf(h_ipps_nat_labor_shr).trim()).multiply(w_ipps_wage_index)) + ((Integer.parseInt(String.valueOf(h_ipps_nat_nonlabor_shr).trim()) * Integer.parseInt(String.valueOf(h_oper_cola).trim()))))) * Integer.parseInt(String.valueOf(h_ipps_drg_wgt).trim())) * (((1 + Integer.parseInt(String.valueOf(h_oper_ime_teach).trim())) + Integer.parseInt(String.valueOf(h_oper_dsh).trim()))))));
        h_capi_cola.set(String.valueOf((((0.3152 * ((Integer.parseInt(String.valueOf(h_oper_cola).trim()) - 1))) + 1))));
        if (!String.valueOf(large_urban).trim().isEmpty()) {
            h_lrgurb_add_on.set(String.valueOf(1));
        } else {
            h_lrgurb_add_on.set(String.valueOf(1));
        }
        h_capi_gaf.set(String.valueOf((Math.pow(w_ipps_wage_index.intValue(), 0.6848))));
        h_capi_pmt.set(String.valueOf((((((Integer.parseInt(String.valueOf(h_ipps_capi_std_fed_rate).trim()) * Integer.parseInt(String.valueOf(h_ipps_drg_wgt).trim())) * Integer.parseInt(String.valueOf(h_capi_gaf).trim())) * Integer.parseInt(String.valueOf(h_lrgurb_add_on).trim())) * Integer.parseInt(String.valueOf(h_capi_cola).trim())) * (((1 + Integer.parseInt(String.valueOf(h_capi_ime_teach).trim())) + Integer.parseInt(String.valueOf(h_capi_dsh).trim()))))));
        h_ipps_pay_amt.set(String.valueOf((Integer.parseInt(String.valueOf(h_stand_amt_oper_pmt).trim()) + Integer.parseInt(String.valueOf(h_capi_pmt).trim()))));
        h_ipps_per_diem.set(String.valueOf((((Integer.parseInt(String.valueOf(h_ipps_pay_amt).trim()) / Integer.parseInt(String.valueOf(h_ipps_drg_alos).trim()))) * Integer.parseInt(String.valueOf(h_los).trim()))));
        if (String.valueOf(h_ipps_per_diem).compareTo(String.valueOf(h_ipps_pay_amt)) > 0) {
            h_ipps_per_diem.set(String.valueOf(h_ipps_pay_amt));
        }
        if (p_new_state == 40) {
            _3675();
            /* RAW: - SS-IPPS-COMP-PR-PMT THRU 3675 - */
            return;
        }
        /* RAW: 3650 - */
    }

    private void ss_ipps_comp_pmt_exit_2() {
        return;
    }

    private void ss_ipps_comp_pr_pmt() {
    // h_pr_stand_amt_oper_pmt.set(String.valueOf((((((new BigDecimal(String.valueOf(h_ipps_pr_labor_shr).trim()).multiply(w_ipps_pr_wage_index)) + ((Integer.parseInt(String.valueOf(h_ipps_pr_nonlabor_shr).trim()) * Integer.parseInt(String.valueOf(h_oper_cola).trim()))))) * Integer.parseInt(String.valueOf(h_ipps_drg_wgt).trim())) * (((1 + Integer.parseInt(String.valueOf(h_oper_ime_teach).trim())) + Integer.parseInt(String.valueOf(h_oper_dsh).trim()))))));
        h_pr_capi_gaf.set(String.valueOf((Math.pow(w_ipps_pr_wage_index.intValue(), 0.6848))));
        h_pr_capi_pmt.set(String.valueOf((((((Integer.parseInt(String.valueOf(h_ipps_capi_std_pr_rate).trim()) * Integer.parseInt(String.valueOf(h_ipps_drg_wgt).trim())) * Integer.parseInt(String.valueOf(h_pr_capi_gaf).trim())) * Integer.parseInt(String.valueOf(h_lrgurb_add_on).trim())) * Integer.parseInt(String.valueOf(h_capi_cola).trim())) * (((1 + Integer.parseInt(String.valueOf(h_capi_ime_teach).trim())) + Integer.parseInt(String.valueOf(h_capi_dsh).trim()))))));
        h_ipps_pr_pay_amt.set(String.valueOf((Integer.parseInt(String.valueOf(h_pr_stand_amt_oper_pmt).trim()) + Integer.parseInt(String.valueOf(h_pr_capi_pmt).trim()))));
        h_ipps_pr_per_diem.set(String.valueOf((((Integer.parseInt(String.valueOf(h_ipps_pr_pay_amt).trim()) / Integer.parseInt(String.valueOf(h_ipps_drg_alos).trim()))) * Integer.parseInt(String.valueOf(h_los).trim()))));
        if (String.valueOf(h_ipps_pr_per_diem).compareTo(String.valueOf(h_ipps_pr_pay_amt)) > 0) {
            h_ipps_pr_per_diem.set(String.valueOf(h_ipps_pr_pay_amt));
        }
        h_ipps_per_diem.set(String.valueOf((((Integer.parseInt(String.valueOf(h_ipps_per_diem).trim()) * Integer.parseInt(String.valueOf(h_nat_ipps_pmt_pct).trim()))) + ((Integer.parseInt(String.valueOf(h_ipps_pr_per_diem).trim()) * Integer.parseInt(String.valueOf(h_pr_ipps_pmt_pct).trim()))))));
        /* RAW: 3675 - */
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

    private void calc_outlier() {
        pps_outlier_threshold = new BigDecimal(String.valueOf((pps_drg_adj_pay_amt + Integer.parseInt(String.valueOf(h_fixed_loss_amt).trim()))).trim()).intValue();
        if (pps_fac_costs > pps_outlier_threshold) {
            pps_outlier_pay_amt = new BigDecimal(String.valueOf(((((((pps_fac_costs - pps_outlier_threshold)) * 0.8)) * pps_bdgt_neut_rate) * Integer.parseInt(String.valueOf(h_blend_pps).trim()))).trim()).intValue();
        }
        if (String.valueOf(b_spec_pay_ind).equals(String.valueOf("1"))) {
            /* RAW: PPS-OUTLIER-PAY-AMT  */
        }
        if ((pps_outlier_pay_amt > 0 && pps_rtc == 21)) {
            /* RAW: PPS-RTC  */
        }
        if ((pps_outlier_pay_amt > 0 && pps_rtc == 22)) {
            /* RAW: PPS-RTC  */
        }
        if ((pps_outlier_pay_amt > 0 && pps_rtc == 26)) {
            /* RAW: PPS-RTC  */
        }
        if ((pps_outlier_pay_amt > 0 && pps_rtc == 0)) {
            /* RAW: PPS-RTC  */
        }
        if (((((pps_rtc == 0 || true) || true) || true) || true)) {
            if (pps_reg_days_used > Integer.parseInt(String.valueOf(h_ssot).trim())) {
                pps_ltr_days_used = new BigDecimal(String.valueOf(0).trim()).intValue();
            } else {
                /* NEXT SENTENCE */
            }
        }
        if (((((pps_rtc == 1 || true) || true) || true) || String.valueOf(pps_cot_ind).equals(String.valueOf("Y")))) {
            if ((b_cov_days < Integer.parseInt(String.valueOf(h_los).trim()) || (String.valueOf(pps_cot_ind).equals(String.valueOf("Y")) && p_new_oper_cstchg_ratio != 0))) {
                pps_chrg_threshold = new BigDecimal(String.valueOf((pps_outlier_threshold / p_new_oper_cstchg_ratio)).trim()).intValue();
                if (!(!String.valueOf(pc_pricer).trim().isEmpty())) {
                    pps_rtc = new BigDecimal(String.valueOf(67).trim()).intValue();
                }
            } else {
                /* NEXT SENTENCE */
            }
        } else {
            /* NEXT SENTENCE */
        }
        /* RAW: 7000 - */
        return;
    }

    private void blend() {
        h_los_ratio.set(String.valueOf((Integer.parseInt(String.valueOf(h_los).trim()) / pps_avg_los)));
        if (Integer.parseInt(String.valueOf(h_los_ratio).trim()) > 1) {
            h_los_ratio.set(String.valueOf((((((Integer.parseInt(String.valueOf(h_los_ratio).trim()) - 1)) * 0.8)) + 1)));
        }
        pps_drg_adj_pay_amt = new BigDecimal(String.valueOf((((pps_drg_adj_pay_amt * pps_bdgt_neut_rate)) * Integer.parseInt(String.valueOf(h_blend_pps).trim()))).trim()).intValue();
        pps_new_fac_spec_rate = new BigDecimal(String.valueOf(((((p_new_fac_spec_rate * pps_bdgt_neut_rate)) * Integer.parseInt(String.valueOf(h_blend_fac).trim())) * Integer.parseInt(String.valueOf(h_los_ratio).trim()))).trim()).intValue();
        pps_final_pay_amt = new BigDecimal(String.valueOf(((pps_drg_adj_pay_amt + pps_outlier_pay_amt) + pps_new_fac_spec_rate)).trim()).intValue();
        if (((((pps_rtc == 20 || true) || true) || true) && Integer.parseInt(String.valueOf(h_blend_rtc).trim()) > 0)) {
            pps_rtc = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(h_blend_rtc).trim()) + 2)).trim()).intValue();
        } else {
            if ((((pps_rtc == 24 || true) || true) && Integer.parseInt(String.valueOf(h_blend_rtc).trim()) > 0)) {
                pps_rtc = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(h_blend_rtc).trim()) + 3)).trim()).intValue();
            } else {
    // pps_rtc = new BigDecimal(String.valueOf(pps_rtc + h_blend_rtc).trim()).intValue();
            }
        }
        /* RAW: 8000 - */
        return;
    }

    private void move_results() {
        if (pps_rtc < 50) {
            pps_los = new BigDecimal(String.valueOf(h_los).trim()).intValue();
            pps_calc_vers_cd.set(String.valueOf(cal_version));
        } else {
            pps_data.set("");
            pps_other_data.set("");
            pps_cbsa.set("");
            hold_pps_components.set("");
            pps_calc_vers_cd.set(String.valueOf(cal_version));
        }
        /* RAW: 9000 - */
        return;
    }

    private void _0100() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _1700() { /* stub — external/COPY */ }

    private void _1800() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _8000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _3400() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _3600() { /* stub — external/COPY */ }

    private void _3650() { /* stub — external/COPY */ }

    private void _3675() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Ltcal087().run();
    }
}
