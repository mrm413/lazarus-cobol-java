package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ltopn202 extends CobolProgram {
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
    private int cu1 = 0;
    private int cu2 = 0;
    private int ma1 = 0;
    private int ma2 = 0;
    private int ma3 = 0;
    private int mu1 = 0;
    private int mu2 = 0;
    private int px1 = 0;
    private int pd2 = 0;
    private int pd3 = 0;
    private int idx_diag = 0;
    private int idx_proc = 0;
    // WORKING-STORAGE SECTION
    private CobolString w_storage_ref = new CobolString(48);
    private CobolString opn_version = new CobolString(5);
    private CobolString ltdrv202 = new CobolString(8);
    private int tables_loaded_sw = 0;
    private int eof_sw = 0;
    private CobolString w_prov_new_hold = new CobolString(1); // Group: W-PROV-NEW-HOLD
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
    private BigDecimal p_ltch_dpp_adj = BigDecimal.ZERO;
    private CobolString prov_stat = new CobolString(1); // Group: PROV-STAT
    private CobolString prov_stat1 = new CobolString(1);
    private CobolString prov_stat2 = new CobolString(1);
    private CobolString msax_stat = new CobolString(1); // Group: MSAX-STAT
    private CobolString msax_stat1 = new CobolString(1);
    private CobolString msax_stat2 = new CobolString(1);
    private CobolString cbsax_stat = new CobolString(1); // Group: CBSAX-STAT
    private CobolString cbsax_stat1 = new CobolString(1);
    private CobolString cbsax_stat2 = new CobolString(1);
    private CobolString ipps_cbsax_stat = new CobolString(1); // Group: IPPS-CBSAX-STAT
    private CobolString ipps_cbsax_stat1 = new CobolString(1);
    private CobolString ipps_cbsax_stat2 = new CobolString(1);
    private CobolString cbsa_wi_table = new CobolString(1); // Group: CBSA-WI-TABLE
    private CobolString[] c_cbsa_data = new CobolString[7000]; // Group: C-CBSA-DATA
    private CobolString[] cbsax_cbsa = new CobolString[7000];
    private CobolString[] cbsax_eff_date = new CobolString[7000];
    private BigDecimal[] cbsax_wage_index1 = new BigDecimal[7000];
    private BigDecimal[] cbsax_wage_index2 = new BigDecimal[7000];
    private BigDecimal[] cbsax_wage_index3 = new BigDecimal[7000];
    private CobolString ipps_cbsa_wi_table = new CobolString(1); // Group: IPPS-CBSA-WI-TABLE
    private CobolString[] t_cbsa_data = new CobolString[10000]; // Group: T-CBSA-DATA
    private CobolString[] t_cbsa = new CobolString[10000];
    private CobolString[] t_cbsa_size = new CobolString[10000];
    private CobolString[] t_cbsa_eff_date = new CobolString[10000];
    private BigDecimal[] t_cbsa_wage_indx1 = new BigDecimal[10000];
    private BigDecimal[] t_cbsa_wage_indx2 = new BigDecimal[10000];
    private CobolString msa_wi_table = new CobolString(1); // Group: MSA-WI-TABLE
    private CobolString[] m_msa_data = new CobolString[4000]; // Group: M-MSA-DATA
    private CobolString[] msax_msa = new CobolString[4000];
    private CobolString[] msax_eff_date = new CobolString[4000];
    private BigDecimal[] msax_wage_index1 = new BigDecimal[4000];
    private BigDecimal[] msax_wage_index2 = new BigDecimal[4000];
    private BigDecimal[] msax_wage_index3 = new BigDecimal[4000];
    private CobolString work_counters = new CobolString(1); // Group: WORK-COUNTERS
    private int cbsa_cnt = 0;
    private int msa_cnt = 0;
    private int prov_cnt = 0;
    private int ipps_cbsa_cnt = 0;
    private CobolString prov_table = new CobolString(1); // Group: PROV-TABLE
    private CobolString[] prov_entries = new CobolString[2400]; // Group: PROV-ENTRIES
    private CobolString[] prov_data1 = new CobolString[2400]; // Group: PROV-DATA1
    private CobolString[] prov_npi10 = new CobolString[2400]; // Group: PROV-NPI10
    private CobolString[] prov_npi8 = new CobolString[2400];
    private CobolString[] prov_npi_filler = new CobolString[2400];
    private CobolString[] prov_no = new CobolString[2400];
    private CobolString[] prov_eff_date = new CobolString[2400];
    private CobolString prov_data_2 = new CobolString(1); // Group: PROV-DATA-2
    private CobolString[] prov_entries2 = new CobolString[2400]; // Group: PROV-ENTRIES2
    private CobolString[] prov_data2 = new CobolString[2400];
    private CobolString prov_data_3 = new CobolString(1); // Group: PROV-DATA-3
    private CobolString[] prov_entries3 = new CobolString[2400]; // Group: PROV-ENTRIES3
    private CobolString[] prov_data3 = new CobolString[2400];
    private CobolString prov_new_hold = new CobolString(1); // Group: PROV-NEW-HOLD
    private CobolString prov_newrec_hold1 = new CobolString(1); // Group: PROV-NEWREC-HOLD1
    private CobolString p_new_npi10 = new CobolString(1); // Group: P-NEW-NPI10
    private CobolString p_new_npi8 = new CobolString(8);
    private CobolString p_new_npi_filler = new CobolString(2);
    private CobolString p_new_provider_no = new CobolString(1); // Group: P-NEW-PROVIDER-NO
    private int p_new_state = 0;
    private CobolString p_new_state_x = new CobolString(2);
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
    private CobolString p_new_geo_loc_msa_ast = new CobolString(1); // Group: P-NEW-GEO-LOC-MSA-AST
    private CobolString p_new_geo_msa_1st = new CobolString(1);
    private CobolString p_new_geo_msa_2nd = new CobolString(1);
    private CobolString p_new_geo_msa_3rd = new CobolString(1);
    private CobolString p_new_geo_msa_4th = new CobolString(1);
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
    private int p_new_ccr = 0;
    private int p_new_cmi = 0;
    private BigDecimal p_new_ssi_ratio = BigDecimal.ZERO;
    private BigDecimal p_new_medicaid_ratio = BigDecimal.ZERO;
    private CobolString p_new_pps_blend_yr_ind = new CobolString(1);
    private int p_new_prup_updte_factor = 0;
    private BigDecimal p_new_dsh_percent = BigDecimal.ZERO;
    private CobolString p_new_fye_date = new CobolString(1); // Group: P-NEW-FYE-DATE
    private int p_new_fye_cc = 0;
    private int p_new_fye_yy = 0;
    private int p_new_fye_mm = 0;
    private int p_new_fye_dd = 0;
    private CobolString p_new_special_pay_ind = new CobolString(1);
    private CobolString p_new_geo_loc_cbsax = new CobolString(5);
    private int p_new_geo_loc_cbsa9 = 0;
    private CobolString p_new_geo_loc_cbsa_ast = new CobolString(1); // Group: P-NEW-GEO-LOC-CBSA-AST
    private CobolString p_new_geo_loc_cbsa_1st = new CobolString(1);
    private CobolString p_new_geo_loc_cbsa_2nd = new CobolString(1);
    private CobolString p_new_geo_loc_cbsa_3rd = new CobolString(1);
    private CobolString p_new_geo_loc_cbsa_4th = new CobolString(1);
    private CobolString p_new_geo_loc_cbsa_sth = new CobolString(1);
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

    // LINKAGE SECTION
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
    private CobolString pricer_opt_vers_sw = new CobolString(1); // Group: PRICER-OPT-VERS-SW
    private CobolString pricer_option_sw = new CobolString(1);
    private CobolString pps_versions = new CobolString(1); // Group: PPS-VERSIONS
    private CobolString ppdrv_version = new CobolString(5);
    private CobolString prov_record_from_user = new CobolString(1); // Group: PROV-RECORD-FROM-USER
    private CobolString prov_rec1 = new CobolString(80);
    private CobolString prov_rec2 = new CobolString(80);
    private CobolString prov_rec3 = new CobolString(80);
    private CobolString cbsax_table_from_user = new CobolString(1); // Group: CBSAX-TABLE-FROM-USER
    private CobolString ipps_cbsax_table_from_user = new CobolString(1); // Group: IPPS-CBSAX-TABLE-FROM-USER
    private CobolString msax_table_from_user = new CobolString(1); // Group: MSAX-TABLE-FROM-USER

    // FILE SECTION — PROV-FILE
    private CobolString prov_rec = new CobolString(1); // Group: PROV-REC
    private CobolString prov_part1 = new CobolString(80);
    private CobolString prov_part2 = new CobolString(80);
    private CobolString prov_part3 = new CobolString(80);

    // FILE SECTION — CBSAX-FILE
    private CobolString cbsax_rec = new CobolString(1); // Group: CBSAX-REC
    private CobolString x_cbsa_x = new CobolString(1); // Group: X-CBSA-X
    private CobolString m_blank = new CobolString(2);
    private int m_state = 0;
    private int x_cbsa = 0;
    private CobolString xe_date_c = new CobolString(1); // Group: XE-DATE-C
    private int xe_c_cc = 0;
    private int xe_c_yy = 0;
    private int xe_c_mm = 0;
    private int xe_c_dd = 0;
    private BigDecimal x_wage_index1_c = BigDecimal.ZERO;
    private BigDecimal x_wage_index2_c = BigDecimal.ZERO;
    private BigDecimal x_wage_index3_c = BigDecimal.ZERO;
    private CobolString x_state_cbsa_name = new CobolString(39);

    // FILE SECTION — IPPS-CBSAX-FILE
    private CobolString f_ipps_cbsa_rec = new CobolString(1); // Group: F-IPPS-CBSA-REC
    private CobolString f_cbsa = new CobolString(1); // Group: F-CBSA
    private CobolString f_cbsa_blank = new CobolString(3);
    private int f_cbsa_state = 0;
    private int f_cbsa9 = 0;
    private CobolString f_cbsa_size = new CobolString(1);
    private CobolString f_cbsa_eff_date = new CobolString(1); // Group: F-CBSA-EFF-DATE
    private int f_cbsa_cc = 0;
    private int f_cbsa_yy = 0;
    private int f_cbsa_mm = 0;
    private int f_cbsa_dd = 0;
    private BigDecimal f_cbsa_wage_indx1 = BigDecimal.ZERO;
    private BigDecimal f_cbsa_wage_indx2 = BigDecimal.ZERO;
    private CobolString f_cbsa_state_name = new CobolString(50);

    // FILE SECTION — MSAX-FILE
    private CobolString msax_rec = new CobolString(1); // Group: MSAX-REC
    private CobolString x_msa_x = new CobolString(1); // Group: X-MSA-X
    private int x_msa = 0;
    private CobolString xe_date_m = new CobolString(1); // Group: XE-DATE-M
    private int xe_m_cc = 0;
    private int xe_m_yy = 0;
    private int xe_m_mm = 0;
    private int xe_m_dd = 0;
    private BigDecimal x_wage_index1_m = BigDecimal.ZERO;
    private BigDecimal x_wage_index2_m = BigDecimal.ZERO;
    private BigDecimal x_wage_index3_m = BigDecimal.ZERO;
    private CobolString x_state_msa_name = new CobolString(44);


    // FILE DESCRIPTORS
    private CobolFile prov_file = new CobolFile("UT-S-PPSPROV", "SEQUENTIAL", "SEQUENTIAL");
    // File status: PROV-STAT
    private CobolFile cbsax_file = new CobolFile("UT-S-PPSCBSAX", "SEQUENTIAL", "SEQUENTIAL");
    // File status: CBSAX-STAT
    private CobolFile ipps_cbsax_file = new CobolFile("UT-S-IPCBSAX", "SEQUENTIAL", "SEQUENTIAL");
    // File status: IPPS-CBSAX-STAT
    private CobolFile msax_file = new CobolFile("UT-S-PPSMSAX", "SEQUENTIAL", "SEQUENTIAL");
    // File status: MSAX-STAT

    private CobolString prov_record_passed = new CobolString(256); // fallback
    private CobolString all_tables_passed = new CobolString(256); // fallback

    private void para_main() {
    }

    private void pps_data_all() {
    }

    private void pps_cbsa() {
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20021001) {
            pps_rtc.set(String.valueOf(98));
            return;
        }
        /* RAW: 0000 - */
    }

    private void test_pricer_option_sw() {
        if (String.valueOf(pricer_option_sw).equals(String.valueOf("A"))) {
    // _1900();
            /* RAW: - OPTION-SW-A THRU 1900 - */
            return;
        } else {
            if (String.valueOf(pricer_option_sw).equals(String.valueOf("P"))) {
    // _2000();
                /* RAW: - OPTION-SW-P THRU 2000 - */
                return;
            } else {
    // _2100();
                /* RAW: - OPTION-SW THRU 2100 - */
                return;
            }
        }
    // if ((!String.valueOf(prov_record_passed).trim().isEmpty() || !String.valueOf(all_tables_passed).trim().isEmpty())) {
    // pps_rtc.set(String.valueOf(0));
    // } else {
    // _1200();
    // /* RAW: - GET-THIS-PROVIDER THRU 1200 - */
    // return;
    // }
    // if (String.valueOf(pps_rtc).equals(String.valueOf(59))) {
    // return;
    // }
    // if (String.valueOf(p_new_geo_loc_cbsax).equals(String.valueOf(" "))) {
    // p_new_geo_loc_cbsax.set(String.valueOf(0));
    // }
    // if (String.valueOf(p_new_geo_loc_msax).equals(String.valueOf(" "))) {
    // p_new_geo_loc_msax.set(String.valueOf(0));
    // }
    // CobolProgram.call(String.valueOf(ltdrv202), bill_new_data, pps_data_all, pps_cbsa, pps_payment_data, pricer_opt_vers_sw, prov_new_hold, cbsa_wi_table, ipps_cbsa_wi_table, msa_wi_table);
    }

    private void work_counters() {
        return;
    }

    private void get_this_provider() {
        px1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH PROV-ENTRIES */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < prov_entries.length && !_found; _idx++) {
                if (String.valueOf(prov_no[px1 - 1]).equals(String.valueOf(b_provider_no))) {
                    pps_rtc.set(String.valueOf(0));
                    prov_newrec_hold1.set(String.valueOf(prov_data1[px1 - 1]));
                    pd2 = new BigDecimal(String.valueOf(px1).trim()).intValue();
                    pd3 = new BigDecimal(String.valueOf(px1).trim()).intValue();
                    prov_newrec_hold2.set(String.valueOf(prov_data2[pd2 - 1]));
                    prov_newrec_hold3.set(String.valueOf(prov_data3[pd3 - 1]));
    // _1300();
                    /* RAW: - GET-CURR-PROV THRU 1300 - */
                    return;
    // _found = true;
    // }
    // }
    // if (!_found) {
    // pps_rtc.set(String.valueOf(59));
    // _1200();
    // return;
    // }
    // }
    // /* RAW: 1200 - */
    // return;
    }

    // private void get_curr_prov() {
    // if (String.valueOf(b_discharge_date).compareTo(String.valueOf(prov_eff_date[px1 - 1])) >= 0) {
    // prov_newrec_hold1.set(String.valueOf(prov_data1[px1 - 1]));
    // pd2 = new BigDecimal(String.valueOf(px1).trim()).intValue();
    // pd3 = new BigDecimal(String.valueOf(px1).trim()).intValue();
    // prov_newrec_hold2.set(String.valueOf(prov_data2[pd2 - 1]));
    // prov_newrec_hold3.set(String.valueOf(prov_data3[pd3 - 1]));
    // }
    // /* RAW: 1300 - */
    // return;
    // }

    // private void load_all_tables() {
    // }

    // private void prov_new_hold() {
    // }

    // private void prov_table() {
    // }

    // private void prov_data_2() {
    // }

    // private void prov_data_3() {
    // }

    // private void prov_file() {
    // }

    // private void eof_sw() {
    // px1 = new BigDecimal(String.valueOf(eof_sw).trim()).intValue();
    // _1600();
    // /* RAW: - READ-PROV-FILE THRU 1600 - */
    // return;
    // }

    // private void prov_file_2() {
    // }

    // private void msa_wi_table() {
    // _1700();
    // /* RAW: - LOAD-MSAX-FILE THRU 1700 - */
    // return;
    // }

    // private void cbsa_wi_table() {
    // _1750();
    // /* RAW: - LOAD-CBSAX-FILE THRU 1750 - */
    // return;
    // }

    // private void ipps_cbsa_wi_table() {
    // _1775();
    // /* RAW: - LOAD-IPPS-CBSAX-FILE THRU 1775 - */
    // return;
    // }

    // private void read_prov_file() {
    // if (prov_file.read(null) == FileStatus.AT_END) {
    // px1 += 1;
    // if (prov_data1[px1 - 1] == null) prov_data1[px1 - 1] = new CobolString(256);
    // prov_data1[px1 - 1].set(String.valueOf("9"));
    // pd2 = new BigDecimal(String.valueOf(px1).trim()).intValue();
    // pd3 = new BigDecimal(String.valueOf(px1).trim()).intValue();
    // if (prov_data2[pd2 - 1] == null) prov_data2[pd2 - 1] = new CobolString(256);
    // prov_data2[pd2 - 1].set(String.valueOf("9"));
    // if (prov_data3[pd3 - 1] == null) prov_data3[pd3 - 1] = new CobolString(256);
    // prov_data3[pd3 - 1].set(String.valueOf("9"));
    // /* RAW: EOF-SW  */
    // }
    // if (eof_sw == 0) {
    // prov_cnt = new BigDecimal(String.valueOf(prov_cnt + 1).trim()).intValue();
    // px1 += 1;
    // if (prov_data1[px1 - 1] == null) prov_data1[px1 - 1] = new CobolString(256);
    // prov_data1[px1 - 1].set(String.valueOf(prov_part1));
    // pd2 = new BigDecimal(String.valueOf(px1).trim()).intValue();
    // pd3 = new BigDecimal(String.valueOf(px1).trim()).intValue();
    // if (prov_data2[pd2 - 1] == null) prov_data2[pd2 - 1] = new CobolString(256);
    // prov_data2[pd2 - 1].set(String.valueOf(prov_part2));
    // if (prov_data3[pd3 - 1] == null) prov_data3[pd3 - 1] = new CobolString(256);
    // prov_data3[pd3 - 1].set(String.valueOf(prov_part3));
    // }
    // /* RAW: 1600 - */
    // return;
    // }

    // private void load_msax_file() {
    // }

    // private void msax_file() {
    // }

    // private void eof_sw_2() {
    // mu1 = new BigDecimal(String.valueOf(eof_sw).trim()).intValue();
    // _1800();
    // /* RAW: - READ-MSAX-FILE THRU 1800 - */
    // return;
    // }

    // private void msax_file_2() {
    // /* RAW: 1700 - */
    // return;
    // }

    // private void load_cbsax_file() {
    // }

    // private void cbsax_file() {
    // }

    // private void eof_sw_3() {
    // cu1 = new BigDecimal(String.valueOf(eof_sw).trim()).intValue();
    // _1850();
    // /* RAW: - READ-CBSAX-FILE THRU 1850 - */
    // return;
    // }

    // private void cbsax_file_2() {
    // /* RAW: 1750 - */
    // return;
    // }

    // private void load_ipps_cbsax_file() {
    // }

    // private void ipps_cbsax_file() {
    // }

    // private void eof_sw_4() {
    // ma3 = new BigDecimal(String.valueOf(eof_sw).trim()).intValue();
    // _1875();
    // /* RAW: - READ-IPPS-CBSAX-FILE THRU 1875 - */
    // return;
    // }

    // private void ipps_cbsax_file_2() {
    // /* RAW: 1775 - */
    // return;
    // }

    // private void read_msax_file() {
    // if (msax_file.read(null) == FileStatus.AT_END) {
    // /* RAW: EOF-SW  */
    // }
    // if (eof_sw == 0) {
    // msa_cnt = new BigDecimal(String.valueOf(msa_cnt + 1).trim()).intValue();
    // mu1 += 1;
    // if (msax_msa[mu1 - 1] == null) msax_msa[mu1 - 1] = new CobolString(256);
    // msax_msa[mu1 - 1].set(String.valueOf(x_msa_x));
    // if (msax_eff_date[mu1 - 1] == null) msax_eff_date[mu1 - 1] = new CobolString(256);
    // msax_eff_date[mu1 - 1].set(String.valueOf(xe_date_m));
    // msax_wage_index1[mu1 - 1] = x_wage_index1_m;
    // msax_wage_index2[mu1 - 1] = x_wage_index2_m;
    // msax_wage_index3[mu1 - 1] = x_wage_index3_m;
    // }
    // /* RAW: 1800 - */
    // return;
    // }

    // private void read_cbsax_file() {
    // if (cbsax_file.read(null) == FileStatus.AT_END) {
    // /* RAW: EOF-SW  */
    // }
    // if (eof_sw == 0) {
    // cbsa_cnt = new BigDecimal(String.valueOf(cbsa_cnt + 1).trim()).intValue();
    // cu1 += 1;
    // if (cbsax_cbsa[cu1 - 1] == null) cbsax_cbsa[cu1 - 1] = new CobolString(256);
    // cbsax_cbsa[cu1 - 1].set(String.valueOf(x_cbsa_x));
    // if (cbsax_eff_date[cu1 - 1] == null) cbsax_eff_date[cu1 - 1] = new CobolString(256);
    // cbsax_eff_date[cu1 - 1].set(String.valueOf(xe_date_c));
    // cbsax_wage_index1[cu1 - 1] = x_wage_index1_c;
    // cbsax_wage_index2[cu1 - 1] = x_wage_index2_c;
    // cbsax_wage_index3[cu1 - 1] = x_wage_index3_c;
    // }
    // /* RAW: 1850 - */
    // return;
    // }

    // private void read_ipps_cbsax_file() {
    // if (ipps_cbsax_file.read(null) == FileStatus.AT_END) {
    // /* RAW: EOF-SW  */
    // }
    // if (eof_sw == 0) {
    // ipps_cbsa_cnt = new BigDecimal(String.valueOf(ipps_cbsa_cnt + 1).trim()).intValue();
    // ma3 += 1;
    // if (t_cbsa[ma3 - 1] == null) t_cbsa[ma3 - 1] = new CobolString(256);
    // t_cbsa[ma3 - 1].set(String.valueOf(f_cbsa));
    // if (t_cbsa_size[ma3 - 1] == null) t_cbsa_size[ma3 - 1] = new CobolString(256);
    // t_cbsa_size[ma3 - 1].set(String.valueOf(f_cbsa_size));
    // if (t_cbsa_eff_date[ma3 - 1] == null) t_cbsa_eff_date[ma3 - 1] = new CobolString(256);
    // t_cbsa_eff_date[ma3 - 1].set(String.valueOf(f_cbsa_eff_date));
    // t_cbsa_wage_indx1[ma3 - 1] = f_cbsa_wage_indx1;
    // t_cbsa_wage_indx2[ma3 - 1] = f_cbsa_wage_indx2;
    // }
    // /* RAW: 1875 - */
    // return;
    // }

    // private void option_sw_a() {
    // }

    // private void prov_new_hold_2() {
    // }

    // private void prov_new_hold_3() {
    // if (tables_loaded_sw == 0) {
    // msa_wi_table.set(String.valueOf("\uFFFF"));
    // msa_wi_table.set(String.valueOf(msax_table_from_user));
    // cbsa_wi_table.set(String.valueOf("\uFFFF"));
    // cbsa_wi_table.set(String.valueOf(cbsax_table_from_user));
    // ipps_cbsa_wi_table.set(String.valueOf("\uFFFF"));
    // ipps_cbsa_wi_table.set(String.valueOf(ipps_cbsax_table_from_user));
    // tables_loaded_sw = new BigDecimal(String.valueOf(1).trim()).intValue();
    // }
    // /* RAW: 1900 - */
    // return;
    // }

    // private void option_sw_p() {
    // }

    // private void prov_new_hold_4() {
    // }

    // private void prov_new_hold_5() {
    // if (tables_loaded_sw == 0) {
    // msa_wi_table.set(String.valueOf("\uFFFF"));
    // _1700();
    // /* RAW: - LOAD-MSAX-FILE THRU 1700 - */
    // return;
    // }
    // /* RAW: 2000 - */
    // return;
    // }

    // private void option_sw() {
    // if (tables_loaded_sw == 0) {
    // _1500();
    // /* RAW: - LOAD-ALL-TABLES THRU 1500 - */
    // return;
    // }
    // /* RAW: 2100 - */
    // return;
    // }

    // private void _1900() { /* stub — external/COPY */ }

    // private void _2000() { /* stub — external/COPY */ }

    // private void _2100() { /* stub — external/COPY */ }

    // private void _1200() { /* stub — external/COPY */ }

    // private void _1300() { /* stub — external/COPY */ }

    // private void _1600() { /* stub — external/COPY */ }

    // private void _1700() { /* stub — external/COPY */ }

    // private void _1750() { /* stub — external/COPY */ }

    // private void _1775() { /* stub — external/COPY */ }

    // private void _1800() { /* stub — external/COPY */ }

    // private void _1850() { /* stub — external/COPY */ }

    // private void _1875() { /* stub — external/COPY */ }

    // private void _1500() { /* stub — external/COPY */ }

    }
    }
    }
    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Ltopn202().run();
    }
}
