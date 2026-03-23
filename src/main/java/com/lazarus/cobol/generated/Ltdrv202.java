package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ltdrv202 extends CobolProgram {
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
    private int cu1 = 0;
    private int cu2 = 0;
    private int ma1 = 0;
    private int ma2 = 0;
    private int ma3 = 0;
    private int mu1 = 0;
    private int mu2 = 0;
    // WORKING-STORAGE SECTION
    private CobolString w_storage_ref = new CobolString(48);
    private CobolString drv_version = new CobolString(5);
    private CobolString ltcal032 = new CobolString(8);
    private CobolString ltcal042 = new CobolString(8);
    private CobolString ltcal043 = new CobolString(8);
    private CobolString ltcal058 = new CobolString(8);
    private CobolString ltcal059 = new CobolString(8);
    private CobolString ltcal063 = new CobolString(8);
    private CobolString ltcal064 = new CobolString(8);
    private CobolString ltcal072 = new CobolString(8);
    private CobolString ltcal075 = new CobolString(8);
    private CobolString ltcal080 = new CobolString(8);
    private CobolString ltcal087 = new CobolString(8);
    private CobolString ltcal091 = new CobolString(8);
    private CobolString ltcal094 = new CobolString(8);
    private CobolString ltcal095 = new CobolString(8);
    private CobolString ltcal103 = new CobolString(8);
    private CobolString ltcal105 = new CobolString(8);
    private CobolString ltcal111 = new CobolString(8);
    private CobolString ltcal123 = new CobolString(8);
    private CobolString ltcal130 = new CobolString(8);
    private CobolString ltcal141 = new CobolString(8);
    private CobolString ltcal152 = new CobolString(8);
    private CobolString ltcal154 = new CobolString(8);
    private CobolString ltcal162 = new CobolString(8);
    private CobolString ltcal170 = new CobolString(8);
    private CobolString ltcal183 = new CobolString(8);
    private CobolString ltcal190 = new CobolString(8);
    private CobolString ltcal202 = new CobolString(8);
    private CobolString ws_9s = new CobolString(8);
    private int wi_quartile_fy2020 = 0;
    private BigDecimal wi_pct_reduc_fy2020 = BigDecimal.ZERO;
    private int wi_pct_adj_fy2020 = 0;

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
    private CobolString prov_record = new CobolString(1); // Group: PROV-RECORD
    private CobolString prov_rec1 = new CobolString(80);
    private CobolString prov_rec2 = new CobolString(80);
    private CobolString prov_rec3 = new CobolString(80);
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


    private CobolString hold_prov_msa = new CobolString(256); // fallback
    private CobolString hold_prov_cbsa = new CobolString(256); // fallback
    private CobolString hold_prov_ipps_cbsa = new CobolString(256); // fallback
    private CobolString hold_prov_ipps_cbsa_rural = new CobolString(256); // fallback
    private CobolString wage_new_index_record_msa = new CobolString(256); // fallback
    private CobolString wage_new_index_record_cbsa = new CobolString(256); // fallback
    private CobolString wage_ipps_index_record_cbsa = new CobolString(256); // fallback
    private CobolString w_ipps_pr_wage_index_rur = new CobolString(256); // fallback
    private CobolString wage_ipps_index_rural_cbsa = new CobolString(256); // fallback
    private CobolString w_fy_begin_cc = new CobolString(256); // fallback
    private CobolString w_fy_begin_yy = new CobolString(256); // fallback
    private CobolString w_fy_end_cc = new CobolString(256); // fallback
    private CobolString w_fy_end_yy = new CobolString(256); // fallback
    private CobolString bill_data_fy03_fy15 = new CobolString(256); // fallback
    private CobolString b_03to15_npi8 = new CobolString(256); // fallback
    private CobolString b_03to15_provider_no = new CobolString(256); // fallback
    private CobolString b_03to15_patient_status = new CobolString(256); // fallback
    private CobolString b_03to15_drg_code = new CobolString(256); // fallback
    private CobolString b_03to15_los = new CobolString(256); // fallback
    private CobolString b_03to15_cov_days = new CobolString(256); // fallback
    private CobolString b_03to15_ltr_days = new CobolString(256); // fallback
    private CobolString b_03to15_dischg_cc = new CobolString(256); // fallback
    private CobolString b_03to15_dischg_yy = new CobolString(256); // fallback
    private CobolString b_03to15_dischg_mm = new CobolString(256); // fallback
    private CobolString b_03to15_dischg_dd = new CobolString(256); // fallback
    private CobolString b_03to15_cov_charges = new CobolString(256); // fallback
    private CobolString b_03to15_spec_pay_ind = new CobolString(256); // fallback
    private CobolString p_new_geo_loc_cbsax = new CobolString(256); // fallback
    private CobolString p_new_geo_loc_msax = new CobolString(256); // fallback
    private CobolString p_new_eff_date = new CobolString(256); // fallback
    private CobolString p_new_geo_loc_cbsa_1st = new CobolString(256); // fallback
    private CobolString p_new_geo_loc_cbsa_2nd = new CobolString(256); // fallback
    private CobolString p_new_geo_loc_cbsa_3rd = new CobolString(256); // fallback
    private CobolString p_new_geo_loc_cbsa_4th = new CobolString(256); // fallback
    private CobolString p_new_geo_loc_cbsa_5th = new CobolString(256); // fallback
    private CobolString w_new_index3_record_c = new CobolString(256); // fallback
    private CobolString w_ipps_wage_index = new CobolString(256); // fallback
    private CobolString prov_new_hold = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString rufl_idx = new CobolString(256); // fallback
    private CobolString rufl_tab = new CobolString(256); // fallback
    private CobolString w_cbsa_ipps_rural = new CobolString(256); // fallback
    private CobolString w_cbsa_ipps_rur_eff_date = new CobolString(256); // fallback
    private CobolString w_ipps_wage_index_rural = new CobolString(256); // fallback
    private CobolString[] rufl_cbsa = new CobolString[100]; // fallback array
    private CobolString rufl_idx2 = new CobolString(256); // fallback
    private CobolString p_new_cbsa_spec_pay_ind = new CobolString(256); // fallback
    private CobolString p_new_special_wage_index = new CobolString(256); // fallback
    private CobolString w_fy_begin_date = new CobolString(256); // fallback
    private CobolString w_fy_end_date = new CobolString(256); // fallback
    private CobolString w_new_cbsa = new CobolString(256); // fallback
    private CobolString w_new_eff_date_c = new CobolString(256); // fallback
    private CobolString w_new_index1_record_c = new CobolString(256); // fallback
    private CobolString w_new_index2_record_c = new CobolString(256); // fallback
    private CobolString p_new_state = new CobolString(256); // fallback
    private CobolString w_ipps_pr_wage_index = new CobolString(256); // fallback
    private CobolString p_new_state_code_x = new CobolString(256); // fallback
    private CobolString h_prov_state_r = new CobolString(256); // fallback
    private CobolString w_cbsa_ipps = new CobolString(256); // fallback
    private CobolString w_cbsa_ipps_eff_date = new CobolString(256); // fallback
    private CobolString p_new_rural_cbsa = new CobolString(256); // fallback
    private CobolString w_cbsa_ipps_size = new CobolString(256); // fallback
    private CobolString w_new_msa = new CobolString(256); // fallback
    private CobolString w_new_eff_date_m = new CobolString(256); // fallback
    private CobolString w_new_index1_record_m = new CobolString(256); // fallback
    private CobolString w_new_index2_record_m = new CobolString(256); // fallback
    private CobolString w_new_index3_record_m = new CobolString(256); // fallback
    private CobolString[] rufl_eff_date = new CobolString[100]; // fallback array
    private CobolString[] rufl_wi3 = new CobolString[100]; // fallback array

    private void para_main() {
    }

    private void ppdrv_version() {
        pps_data_all.set("");
        pps_cbsa.set("");
        hold_prov_msa.set("");
        hold_prov_cbsa.set("");
        hold_prov_ipps_cbsa.set("");
        hold_prov_ipps_cbsa_rural.set("");
        wage_new_index_record_msa.set("");
        wage_new_index_record_cbsa.set("");
        wage_ipps_index_record_cbsa.set("");
        w_ipps_pr_wage_index_rur.set("");
        wage_ipps_index_rural_cbsa.set("");
        w_fy_begin_cc.set("");
        w_fy_begin_yy.set("");
        w_fy_end_cc.set("");
        w_fy_end_yy.set("");
        bill_data_fy03_fy15.set("");
    }

    private void pps_payment_data() {
    }

    private void prov_new_hold() {
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20021001) {
            pps_rtc.set(String.valueOf(98));
            return;
        }
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20150101) {
            b_03to15_npi8.set(String.valueOf(b_npi8));
            b_03to15_provider_no.set(String.valueOf(b_provider_no));
            b_03to15_patient_status.set(String.valueOf(b_patient_status));
            b_03to15_drg_code.set(String.valueOf(b_drg_code));
            b_03to15_los.set(String.valueOf(b_los));
            b_03to15_cov_days.set(String.valueOf(b_cov_days));
            b_03to15_ltr_days.set(String.valueOf(b_ltr_days));
            b_03to15_dischg_cc.set(String.valueOf(b_dischg_cc));
            b_03to15_dischg_yy.set(String.valueOf(b_dischg_yy));
            b_03to15_dischg_mm.set(String.valueOf(b_dischg_mm));
            b_03to15_dischg_dd.set(String.valueOf(b_dischg_dd));
            b_03to15_cov_charges.set(String.valueOf(b_cov_charges));
            b_03to15_spec_pay_ind.set(String.valueOf(b_spec_pay_ind));
        }
    }

    private void w_fy_begin_cc() {
    }

    private void w_fy_end_cc() {
        if ((b_dischg_mm >= 1 && b_dischg_mm <= 9)) {
            w_fy_begin_yy.set(String.valueOf((b_dischg_yy - 1)));
            w_fy_end_yy.set(String.valueOf(b_dischg_yy));
        } else {
            w_fy_begin_yy.set(String.valueOf(b_dischg_yy));
            w_fy_end_yy.set(String.valueOf((b_dischg_yy + 1)));
        }
        if (String.valueOf(p_new_geo_loc_cbsax).equals(String.valueOf(" "))) {
            p_new_geo_loc_cbsax.set(String.valueOf(0));
        }
        if (String.valueOf(p_new_geo_loc_msax).equals(String.valueOf(" "))) {
            p_new_geo_loc_msax.set(String.valueOf(0));
        }
        if (Integer.parseInt(String.valueOf(p_new_eff_date).trim()) > 20050701) {
            if (((((String.valueOf("*").equals(String.valueOf(p_new_geo_loc_cbsa_1st)) || !String.valueOf(p_new_geo_loc_cbsa_2nd).trim().isEmpty()) || !String.valueOf(p_new_geo_loc_cbsa_3rd).trim().isEmpty()) || !String.valueOf(p_new_geo_loc_cbsa_4th).trim().isEmpty()) || !String.valueOf(p_new_geo_loc_cbsa_5th).trim().isEmpty())) {
                pps_rtc.set(String.valueOf(60));
                return;
            }
        }
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20050701) {
            mu1 = new BigDecimal(String.valueOf(1).trim()).intValue();
            _0500();
            /* RAW: - GET-MSA THRU 0500 - */
            return;
        } else {
            cu1 = new BigDecimal(String.valueOf(1).trim()).intValue();
            _0550();
            /* RAW: - GET-CBSA THRU 0550 - */
            return;
        }
    // if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20060630) {
    // ma1 = new BigDecimal(String.valueOf(1).trim()).intValue();
    // _0575();
    // /* RAW: - GET-IPPS-CBSA THRU 0575 - */
    // return;
    // }
    // if ((String.valueOf(pps_rtc).equals(String.valueOf(60)) || String.valueOf(pps_rtc).equals(String.valueOf(52)))) {
    // return;
    // }
    // if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20190930) {
    // CobolProgram.call(String.valueOf(ltcal202), bill_new_data, pps_data_all, pps_cbsa, pps_payment_data, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20180930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20191001  */
    // CobolProgram.call(String.valueOf(ltcal190), bill_new_data, pps_data_all, pps_cbsa, pps_payment_data, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20170930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20181001  */
    // CobolProgram.call(String.valueOf(ltcal183), bill_new_data, pps_data_all, pps_cbsa, pps_payment_data, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20160930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20171001  */
    // CobolProgram.call(String.valueOf(ltcal170), bill_new_data, pps_data_all, pps_cbsa, pps_payment_data, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20150930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20161001  */
    // CobolProgram.call(String.valueOf(ltcal162), bill_new_data, pps_data_all, pps_cbsa, pps_payment_data, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20141231 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20151001  */
    // CobolProgram.call(String.valueOf(ltcal154), bill_new_data, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20140930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20150101  */
    // CobolProgram.call(String.valueOf(ltcal152), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20130930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20141001  */
    // CobolProgram.call(String.valueOf(ltcal141), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20120930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20131001  */
    // CobolProgram.call(String.valueOf(ltcal130), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20110930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20121001  */
    // CobolProgram.call(String.valueOf(ltcal123), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20100930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20111001  */
    // CobolProgram.call(String.valueOf(ltcal111), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20100331 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20101001  */
    // CobolProgram.call(String.valueOf(ltcal105), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20090930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20100401  */
    // CobolProgram.call(String.valueOf(ltcal103), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20090602 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20091001  */
    // CobolProgram.call(String.valueOf(ltcal095), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20080930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20090603  */
    // CobolProgram.call(String.valueOf(ltcal094), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20080630 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20081001  */
    // CobolProgram.call(String.valueOf(ltcal091), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20070930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20080701  */
    // CobolProgram.call(String.valueOf(ltcal087), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20070630 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20071001  */
    // CobolProgram.call(String.valueOf(ltcal080), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20060930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20070701  */
    // CobolProgram.call(String.valueOf(ltcal075), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20060630 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20061001  */
    // CobolProgram.call(String.valueOf(ltcal072), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold, wage_new_index_record_cbsa);
    // /* RAW: WAGE-IPPS-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20050930 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20060701  */
    // CobolProgram.call(String.valueOf(ltcal064), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold);
    // /* RAW: WAGE-NEW-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20050630 && !String.valueOf(_unnamed).trim().isEmpty())) {
    // /* RAW: 20051001  */
    // CobolProgram.call(String.valueOf(ltcal063), bill_data_fy03_fy15, pps_data_all, pps_cbsa, pricer_opt_vers_sw, prov_new_hold);
    // /* RAW: WAGE-NEW-INDEX-RECORD-CBSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20040930 && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20050701)) {
    // CobolProgram.call(String.valueOf(ltcal059), bill_data_fy03_fy15, pps_data_all, pricer_opt_vers_sw, prov_new_hold);
    // /* RAW: WAGE-NEW-INDEX-RECORD-MSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20040630 && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20041001)) {
    // CobolProgram.call(String.valueOf(ltcal058), bill_data_fy03_fy15, pps_data_all, pricer_opt_vers_sw, prov_new_hold);
    // /* RAW: WAGE-NEW-INDEX-RECORD-MSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20030930 && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20040701)) {
    // CobolProgram.call(String.valueOf(ltcal043), bill_data_fy03_fy15, pps_data_all, pricer_opt_vers_sw, prov_new_hold);
    // /* RAW: WAGE-NEW-INDEX-RECORD-MSA  */
    // }
    // if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20030630 && Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20031001)) {
    // CobolProgram.call(String.valueOf(ltcal042), bill_data_fy03_fy15, pps_data_all, pricer_opt_vers_sw, prov_new_hold);
    // /* RAW: WAGE-NEW-INDEX-RECORD-MSA  */
    // }
    // if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20030701) {
    // CobolProgram.call(String.valueOf(ltcal032), bill_data_fy03_fy15, pps_data_all, pricer_opt_vers_sw, prov_new_hold);
    // /* RAW: WAGE-NEW-INDEX-RECORD-MSA  */
    // }
    // return;
    }

    private void get_rural_floor_ipps() {
        rufl_idx.set(String.valueOf(1));
        /* SEARCH RUFL-TAB */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < rufl_tab.length && !_found; _idx++) {
    // if (String.valueOf(rufl_cbsa[Integer.parseInt(String.valueOf(rufl_idx).trim()) - 1]).equals(String.valueOf(hold_prov_ipps_cbsa_rural))) {
    // rufl_idx2.set(String.valueOf(rufl_idx));
    // _found = true;
    // }
    // }
            if (!_found) {
                w_cbsa_ipps_rural.set(String.valueOf("   00"));
                w_cbsa_ipps_rur_eff_date.set(String.valueOf(99999999));
                w_ipps_wage_index_rural.set(String.valueOf(0));
                _0190();
                return;
            }
        }
        /* RAW: 0190 - */
        return;
    }

    private void get_msa() {
    }

    private void hold_prov_msa() {
        /* SEARCH M-MSA-DATA */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < m_msa_data.length && !_found; _idx++) {
                if (String.valueOf(msax_msa[mu1 - 1]).equals(String.valueOf(hold_prov_msa))) {
                    mu2 = new BigDecimal(String.valueOf(mu1).trim()).intValue();
                    _0600();
                    /* RAW: - N-GET-WAGE-INDX THRU 0600 - N-EXIT */
                    /* RAW: HOLD-PROV-MSA  */
                    _found = true;
                }
            }
            if (!_found) {
                pps_rtc.set(String.valueOf(60));
            }
        }
        /* RAW: 0500 - */
        return;
    }

    private void get_cbsa() {
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20050630) {
            if (String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("1"))) {
                if (((CobolIntrinsics.isNumeric(p_new_special_wage_index) && Integer.parseInt(String.valueOf(p_new_special_wage_index).trim()) > 0) && (String.valueOf(p_new_eff_date).compareTo(String.valueOf(w_fy_begin_date)) >= 0 && String.valueOf(p_new_eff_date).compareTo(String.valueOf(w_fy_end_date)) <= 0))) {
                    w_new_cbsa.set(String.valueOf(0));
                    w_new_eff_date_c.set(String.valueOf(p_new_eff_date));
                    w_new_index1_record_c.set(String.valueOf(p_new_special_wage_index));
                    w_new_index2_record_c.set(String.valueOf(p_new_special_wage_index));
                    w_new_index3_record_c.set(String.valueOf(p_new_special_wage_index));
                    _0550();
                    return;
                } else {
                    pps_rtc.set(String.valueOf(52));
                    _0550();
                    return;
                }
            }
        }
    }

    private void hold_prov_cbsa() {
        if (String.valueOf(hold_prov_cbsa).equals(String.valueOf("   00"))) {
            /* RAW: HOLD-PROV-CBSA  */
        }
        /* SEARCH C-CBSA-DATA */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < c_cbsa_data.length && !_found; _idx++) {
                if (String.valueOf(cbsax_cbsa[cu1 - 1]).equals(String.valueOf(hold_prov_cbsa))) {
                    cu2 = new BigDecimal(String.valueOf(cu1).trim()).intValue();
                    _0650();
                    /* RAW: - N-GET-WAGE-INDX THRU 0650 - N-EXIT */
                    /* RAW: HOLD-PROV-CBSA  */
                    _found = true;
                }
            }
            if (!_found) {
                pps_rtc.set(String.valueOf(60));
            }
        }
        /* RAW: 0550 - */
        return;
    }

    private void get_ipps_cbsa() {
    }

    private void hold_prov_ipps_cbsa() {
        if (String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   00"))) {
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20050930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20061001  */
            _0580();
            /* RAW: - FY2006-FLOOR-CBSA THRU 0580 - FY2006-EXIT */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20060930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20071001  */
            _0580();
            /* RAW: - FY2007-FLOOR-CBSA THRU 0580 - FY2007-EXIT */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20070930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20081001  */
            _0580();
            /* RAW: - FY2008-FLOOR-CBSA THRU 0580 - FY2008-EXIT */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20080930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20091001  */
            _0580();
            /* RAW: - FY2009-FLOOR-CBSA THRU 0580 - FY2009-EXIT */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20090930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20101001  */
            _0580();
            /* RAW: - FY2010-FLOOR-CBSA THRU 0580 - FY2010-EXIT */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20100930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20111001  */
            _0580();
            /* RAW: - FY2011-FLOOR-CBSA THRU 0580 - FY2011-EXIT */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20110930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20121001  */
            _0580();
            /* RAW: - FY2012-FLOOR-CBSA THRU 0580 - FY2012-EXIT */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20120930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20131001  */
            _0580();
            /* RAW: - FY2013-FLOOR-CBSA THRU 0580 - FY2013-EXIT */
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20130930 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 20141001  */
            _0580();
            /* RAW: - FY2014-FLOOR-CBSA THRU 0580 - FY2014-EXIT */
        }
        /* SEARCH T-CBSA-DATA */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < t_cbsa_data.length && !_found; _idx++) {
                if (String.valueOf(t_cbsa[ma1 - 1]).equals(String.valueOf(hold_prov_ipps_cbsa))) {
                    ma2 = new BigDecimal(String.valueOf(ma1).trim()).intValue();
                    _0675();
                    /* RAW: - N-GET-IPPS-WAGE-INDX THRU 0675 - N-EXIT */
                    /* RAW: HOLD-PROV-IPPS-CBSA  */
                    _found = true;
                }
            }
            if (!_found) {
                pps_rtc.set(String.valueOf(60));
            }
        }
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20140930) {
            _0580();
            /* RAW: - FY2015-LATER-FLOOR-CBSA THRU 0580 - FY2015-LATER-EXIT */
        }
    }

    private void hold_prov_ipps_cbsa_2() {
        if (String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   00"))) {
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        ma1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH T-CBSA-DATA */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < t_cbsa_data.length && !_found; _idx++) {
                if (String.valueOf(t_cbsa[ma1 - 1]).equals(String.valueOf(hold_prov_ipps_cbsa))) {
                    ma2 = new BigDecimal(String.valueOf(ma1).trim()).intValue();
                    _found = true;
                }
            }
            if (!_found) {
                pps_rtc.set(String.valueOf(60));
            }
        }
        if (!String.valueOf(pps_rtc).equals(String.valueOf(60))) {
            _0585();
            /* RAW: - GET-IPPS-CBSA-SIZE THRU 0585 - */
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20161001 && (String.valueOf(p_new_state).equals(String.valueOf(40)) || true))) {
            _0590();
            /* RAW: - GET-IPPS-CBSA-PR THRU 0590 - */
            return;
        }
        /* RAW: 0575 - */
        return;
    }

    private void fy2006_floor_cbsa() {
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   10")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(10)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   50")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("15764")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(30)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("16620")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24580")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(52)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("39900")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(5)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48260")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("49660")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2006_exit() {
        return;
    }

    private void fy2007_floor_cbsa() {
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   10")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(10)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   14")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(14)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   26")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(26)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   50")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24580")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(52)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("26580")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20061103) {
            if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("27860")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(26)))) {
                p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
                /* RAW: HOLD-PROV-IPPS-CBSA  */
            }
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("29100")) && String.valueOf(p_new_state).equals(String.valueOf(52)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37964")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("38300")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("39300")) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("39300")) && String.valueOf(p_new_state).equals(String.valueOf(41)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("45500")) && String.valueOf(p_new_state).equals(String.valueOf(45)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48260")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2007_exit() {
        return;
    }

    private void fy2008_floor_cbsa() {
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   39")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(33)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   39")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21780")) && String.valueOf(p_new_state).equals(String.valueOf(15)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21780")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(15)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24580")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(52)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28420")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(49)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("35084")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37964")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("38300")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("45500")) && String.valueOf(p_new_state).equals(String.valueOf(45)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48260")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2008_exit() {
        return;
    }

    private void fy2009_floor_cbsa() {
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   04")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(4)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   04")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(19)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   14")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(14)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   14")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(26)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19340")) && String.valueOf(p_new_state).equals(String.valueOf(16)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21780")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(15)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(43)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22900")) && String.valueOf(p_new_state).equals(String.valueOf(37)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24580")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(52)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28420")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(49)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28940")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28940")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("34820")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(34)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("34820")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(42)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37964")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("38340")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(47)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("41620")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(29)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("43580")) && String.valueOf(p_new_state).equals(String.valueOf(16)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48260")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2009_exit() {
        return;
    }

    private void fy2010_floor_cbsa() {
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   33")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(30)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   33")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(33)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19340")) && String.valueOf(p_new_state).equals(String.valueOf(16)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19340")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(16)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21780")) && String.valueOf(p_new_state).equals(String.valueOf(15)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21780")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(15)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25180")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28420")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28940")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28940")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("35084")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37964")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("49660")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("35084")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48260")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48260")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2010_exit() {
        return;
    }

    private void fy2011_floor_cbsa() {
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   45")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(45)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   37")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(37)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21500")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(33)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21500")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21780")) && String.valueOf(p_new_state).equals(String.valueOf(15)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22900")) && String.valueOf(p_new_state).equals(String.valueOf(37)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(53)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(49)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28940")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28940")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37964")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("38300")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("38300")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("43580")) && String.valueOf(p_new_state).equals(String.valueOf(43)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("17300")) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("17300")) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(35)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(35)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("44600")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("44600")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("45500")) && String.valueOf(p_new_state).equals(String.valueOf(45)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2011_exit() {
        return;
    }

    private void fy2012_floor_cbsa() {
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   30")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(30)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   39")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   39")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(33)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("14484")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("16020")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(14)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21500")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(33)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21500")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22900")) && String.valueOf(p_new_state).equals(String.valueOf(37)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25180")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("26820")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(53)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(49)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28940")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("35084")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37964")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("43580")) && String.valueOf(p_new_state).equals(String.valueOf(43)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("44600")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("44600")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("49660")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("49660")) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(35)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(35)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30860")) && String.valueOf(p_new_state).equals(String.valueOf(46)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("35084")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("39300")) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("45500")) && String.valueOf(p_new_state).equals(String.valueOf(45)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2012_exit() {
        return;
    }

    private void fy2013_floor_cbsa() {
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("14484")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("16020")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(14)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21500")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(33)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21500")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("21780")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(15)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24580")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(52)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("26820")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(53)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("27900")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(17)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(49)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28940")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("35084")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37964")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("38300")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("43580")) && String.valueOf(p_new_state).equals(String.valueOf(43)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("49660")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("49660")) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(35)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(35)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("39300")) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("39300")) && String.valueOf(p_new_state).equals(String.valueOf(41)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("44600")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2013_exit() {
        return;
    }

    private void fy2014_floor_cbsa() {
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   07")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   36")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("10900")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("14484")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("17300")) && String.valueOf(p_new_state).equals(String.valueOf(18)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22900")) && String.valueOf(p_new_state).equals(String.valueOf(37)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("25540")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("26820")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(53)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("27180")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(25)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(44)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("28700")) && String.valueOf(p_new_state).equals(String.valueOf(49)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("35644")) && String.valueOf(p_new_cbsa_spec_pay_ind).equals(String.valueOf("Y"))) && String.valueOf(p_new_state).equals(String.valueOf(7)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("37620")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("43580")) && String.valueOf(p_new_state).equals(String.valueOf(43)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48540")) && String.valueOf(p_new_state).equals(String.valueOf(51)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("48864")) && String.valueOf(p_new_state).equals(String.valueOf(31)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("49660")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("49660")) && String.valueOf(p_new_state).equals(String.valueOf(39)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("19060")) && String.valueOf(p_new_state).equals(String.valueOf(21)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("22020")) && String.valueOf(p_new_state).equals(String.valueOf(35)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(24)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("24220")) && String.valueOf(p_new_state).equals(String.valueOf(35)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("30300")) && String.valueOf(p_new_state).equals(String.valueOf(50)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("39300")) && String.valueOf(p_new_state).equals(String.valueOf(22)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("39300")) && String.valueOf(p_new_state).equals(String.valueOf(41)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("44600")) && String.valueOf(p_new_state).equals(String.valueOf(36)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        if ((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("45500")) && String.valueOf(p_new_state).equals(String.valueOf(45)))) {
            p_new_cbsa_spec_pay_ind.set(String.valueOf("N"));
            /* RAW: HOLD-PROV-IPPS-CBSA  */
        }
        /* RAW: 0580 - */
    }

    private void fy2014_exit() {
        return;
    }

    private void fy2015_later_floor_cbsa() {
    }

    private void h_prov_blank_r() {
    }

    private void h_prov_state_r() {
        if (String.valueOf(h_prov_state_r).equals(String.valueOf("00"))) {
            /* RAW: H-PROV-STATE-R  */
        }
        ma1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) < 20191001) {
            /* SEARCH T-CBSA-DATA */
            {
                boolean _found = false;
                for (int _idx = 0; _idx < t_cbsa_data.length && !_found; _idx++) {
                    if (String.valueOf(t_cbsa[ma1 - 1]).equals(String.valueOf(hold_prov_ipps_cbsa_rural))) {
                        ma2 = new BigDecimal(String.valueOf(ma1).trim()).intValue();
                        _0675();
                        /* RAW: - N-GET-IPPS-WAGE-INDX-RUR THRU 0675 - N-RUR-EXIT */
                        /* RAW: HOLD-PROV-IPPS-CBSA-RURAL  */
                        _found = true;
                    }
                }
                if (!_found) {
                    w_cbsa_ipps_rural.set(String.valueOf(" "));
                    w_cbsa_ipps_rur_eff_date.set(String.valueOf(0));
                    w_ipps_wage_index_rural.set(String.valueOf(0));
                }
            }
        }
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20190930) {
            if (String.valueOf(pps_rtc).equals(String.valueOf("  "))) {
                if (!String.valueOf(w_cbsa_ipps_rur_eff_date).equals(String.valueOf(ws_9s))) {
                    _0190();
                    /* RAW: - GET-RURAL-FLOOR-IPPS THRU 0190 - */
    // break;
                    /* RAW: 0690 - GET-RURAL-FLOOR-IPPS-WI THRU 0690 - */
                    return;
                }
            }
        }
        if (String.valueOf(w_ipps_wage_index_rural).compareTo(String.valueOf(w_ipps_wage_index)) > 0) {
            w_cbsa_ipps.set(String.valueOf(w_cbsa_ipps_rural));
            w_cbsa_ipps_eff_date.set(String.valueOf(w_cbsa_ipps_rur_eff_date));
            w_ipps_wage_index.set(String.valueOf(w_ipps_wage_index_rural));
        }
        /* RAW: 0580 - */
    }

    private void fy2015_later_exit() {
        return;
    }

    private void get_ipps_cbsa_size() {
        if (String.valueOf(b_discharge_date).compareTo(String.valueOf(t_cbsa_eff_date[ma2 - 1])) >= 0) {
            if (!String.valueOf(p_new_rural_cbsa).trim().isEmpty()) {
                w_cbsa_ipps_size.set(String.valueOf("R"));
            } else {
                if (String.valueOf(t_cbsa_size[ma2 - 1]).equals(String.valueOf("L"))) {
                    w_cbsa_ipps_size.set(String.valueOf("L"));
                } else {
                    w_cbsa_ipps_size.set(String.valueOf("O"));
                }
            }
        }
        /* RAW: 0585 - */
        return;
    }

    private void get_ipps_cbsa_pr() {
    }

    private void h_ipps_cbsa_last_pos() {
        ma1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH T-CBSA-DATA */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < t_cbsa_data.length && !_found; _idx++) {
                if (String.valueOf(t_cbsa[ma1 - 1]).equals(String.valueOf(hold_prov_ipps_cbsa))) {
                    ma2 = new BigDecimal(String.valueOf(ma1).trim()).intValue();
                    _0680();
                    /* RAW: - N-GET-IPPS-PR-WAGE-INDX THRU 0680 - N-EXIT */
                    /* RAW: HOLD-PROV-IPPS-CBSA  */
                    _found = true;
                }
            }
            if (!_found) {
                pps_rtc.set(String.valueOf(60));
            }
        }
        if (Integer.parseInt(String.valueOf(b_discharge_date).trim()) > 20140930) {
            _0590();
            /* RAW: - FY2015-LATER-PR-FLOOR THRU 0590 - FY2015-LATER-PR-EXIT */
        }
        /* RAW: 0590 - */
        return;
    }

    private void fy2015_later_pr_floor() {
    }

    private void h_prov_blank_r_2() {
    }

    private void h_prov_state_r_2() {
    }

    private void h_ipps_cbsa_last_pos_r() {
        ma1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH T-CBSA-DATA */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < t_cbsa_data.length && !_found; _idx++) {
                if (String.valueOf(t_cbsa[ma1 - 1]).equals(String.valueOf(hold_prov_ipps_cbsa_rural))) {
                    ma2 = new BigDecimal(String.valueOf(ma1).trim()).intValue();
                    _0680();
                    /* RAW: - N-GET-IPPS-PR-WAGE-IDX-RU THRU 0680 - N-RU-EXIT */
                    /* RAW: HOLD-PROV-IPPS-CBSA-RURAL  */
                    _found = true;
                }
            }
            if (!_found) {
                w_ipps_pr_wage_index_rur.set(String.valueOf(0));
            }
        }
        if (String.valueOf(w_ipps_pr_wage_index_rur).compareTo(String.valueOf(w_ipps_pr_wage_index)) > 0) {
            w_ipps_pr_wage_index.set(String.valueOf(w_ipps_pr_wage_index_rur));
        }
        /* RAW: 0590 - */
    }

    private void fy2015_later_pr_exit() {
        return;
    }

    private void n_get_wage_indx() {
        if (String.valueOf(b_discharge_date).compareTo(String.valueOf(msax_eff_date[mu2 - 1])) >= 0) {
            w_new_msa.set(String.valueOf(msax_msa[mu2 - 1]));
            w_new_eff_date_m.set(String.valueOf(msax_eff_date[mu2 - 1]));
            w_new_index1_record_m.set(String.valueOf(msax_wage_index1[mu2 - 1]));
            w_new_index2_record_m.set(String.valueOf(msax_wage_index2[mu2 - 1]));
            w_new_index3_record_m.set(String.valueOf(msax_wage_index3[mu2 - 1]));
        }
        /* RAW: 0600 - */
    }

    private void n_exit() {
        return;
    }

    private void n_get_wage_indx_2() {
        if (String.valueOf(b_discharge_date).compareTo(String.valueOf(cbsax_eff_date[cu2 - 1])) >= 0) {
            if ((((String.valueOf(hold_prov_cbsa).equals(String.valueOf("   98")) || String.valueOf(hold_prov_cbsa).equals(String.valueOf("   99"))) || Integer.parseInt(String.valueOf(b_discharge_date).trim()) <= 20090930) || (String.valueOf(cbsax_eff_date[cu2 - 1]).compareTo(String.valueOf(w_fy_begin_date)) >= 0 && String.valueOf(cbsax_eff_date[cu2 - 1]).compareTo(String.valueOf(w_fy_end_date)) <= 0))) {
                w_new_cbsa.set(String.valueOf(cbsax_cbsa[cu2 - 1]));
                w_new_eff_date_c.set(String.valueOf(cbsax_eff_date[cu2 - 1]));
                w_new_index1_record_c.set(String.valueOf(cbsax_wage_index1[cu2 - 1]));
                w_new_index2_record_c.set(String.valueOf(cbsax_wage_index2[cu2 - 1]));
                w_new_index3_record_c.set(String.valueOf(cbsax_wage_index3[cu2 - 1]));
            }
        }
        /* RAW: 0650 - */
    }

    private void n_exit_2() {
        return;
    }

    private void n_get_ipps_wage_indx() {
        if (String.valueOf(b_discharge_date).compareTo(String.valueOf(t_cbsa_eff_date[ma2 - 1])) >= 0) {
            if (((String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   98")) || String.valueOf(hold_prov_ipps_cbsa).equals(String.valueOf("   99"))) || (String.valueOf(t_cbsa_eff_date[ma2 - 1]).compareTo(String.valueOf(w_fy_begin_date)) >= 0 && String.valueOf(t_cbsa_eff_date[ma2 - 1]).compareTo(String.valueOf(w_fy_end_date)) <= 0))) {
                w_cbsa_ipps.set(String.valueOf(t_cbsa[ma2 - 1]));
                w_cbsa_ipps_eff_date.set(String.valueOf(t_cbsa_eff_date[ma2 - 1]));
                w_ipps_wage_index.set(String.valueOf(t_cbsa_wage_indx1[ma2 - 1]));
            }
        }
        /* RAW: 0675 - */
    }

    private void n_exit_3() {
        return;
    }

    private void n_get_ipps_wage_indx_rur() {
        if (((String.valueOf(b_discharge_date).compareTo(String.valueOf(t_cbsa_eff_date[ma2 - 1])) >= 0 && String.valueOf(t_cbsa_eff_date[ma2 - 1]).compareTo(String.valueOf(w_fy_begin_date)) >= 0) && String.valueOf(t_cbsa_eff_date[ma2 - 1]).compareTo(String.valueOf(w_fy_end_date)) <= 0)) {
            w_cbsa_ipps_rural.set(String.valueOf(t_cbsa[ma2 - 1]));
            w_cbsa_ipps_rur_eff_date.set(String.valueOf(t_cbsa_eff_date[ma2 - 1]));
            w_ipps_wage_index_rural.set(String.valueOf(t_cbsa_wage_indx1[ma2 - 1]));
        }
        /* RAW: 0675 - */
    }

    private void n_rur_exit() {
        return;
    }

    private void n_get_ipps_pr_wage_indx() {
        if (((String.valueOf(b_discharge_date).compareTo(String.valueOf(t_cbsa_eff_date[ma2 - 1])) >= 0 && String.valueOf(t_cbsa_eff_date[ma2 - 1]).compareTo(String.valueOf(w_fy_begin_date)) >= 0) && String.valueOf(t_cbsa_eff_date[ma2 - 1]).compareTo(String.valueOf(w_fy_end_date)) <= 0)) {
            w_ipps_pr_wage_index.set(String.valueOf(t_cbsa_wage_indx1[ma2 - 1]));
        }
        /* RAW: 0680 - */
    }

    private void n_exit_4() {
        return;
    }

    private void n_get_ipps_pr_wage_idx_ru() {
        if (((String.valueOf(b_discharge_date).compareTo(String.valueOf(t_cbsa_eff_date[ma2 - 1])) >= 0 && String.valueOf(t_cbsa_eff_date[ma2 - 1]).compareTo(String.valueOf(w_fy_begin_date)) >= 0) && String.valueOf(t_cbsa_eff_date[ma2 - 1]).compareTo(String.valueOf(w_fy_end_date)) <= 0)) {
            w_ipps_pr_wage_index_rur.set(String.valueOf(t_cbsa_wage_indx1[ma2 - 1]));
        }
        /* RAW: 0680 - */
    }

    private void n_ru_exit() {
        return;
    }

    private void get_rural_floor_ipps_wi() {
        if (((String.valueOf(b_discharge_date).compareTo(String.valueOf(rufl_eff_date[Integer.parseInt(String.valueOf(rufl_idx2).trim()) - 1])) >= 0 && String.valueOf(rufl_eff_date[Integer.parseInt(String.valueOf(rufl_idx2).trim()) - 1]).compareTo(String.valueOf(w_fy_begin_date)) >= 0) && String.valueOf(rufl_eff_date[Integer.parseInt(String.valueOf(rufl_idx2).trim()) - 1]).compareTo(String.valueOf(w_fy_end_date)) <= 0)) {
            w_cbsa_ipps_rural.set(String.valueOf(rufl_cbsa[Integer.parseInt(String.valueOf(rufl_idx2).trim()) - 1]));
            w_cbsa_ipps_rur_eff_date.set(String.valueOf(rufl_eff_date[Integer.parseInt(String.valueOf(rufl_idx2).trim()) - 1]));
            /* RAW: W-IPPS-WAGE-INDEX-RURAL  */
        }
        /* RAW: 0690 - */
        return;
    }

    private void _0500() { /* stub — external/COPY */ }

    private void _0550() { /* stub — external/COPY */ }

    private void _0575() { /* stub — external/COPY */ }

    private void _0190() { /* stub — external/COPY */ }

    private void _0600() { /* stub — external/COPY */ }

    private void _0650() { /* stub — external/COPY */ }

    private void _0580() { /* stub — external/COPY */ }

    private void _0675() { /* stub — external/COPY */ }

    private void _0585() { /* stub — external/COPY */ }

    private void _0590() { /* stub — external/COPY */ }

    private void _0680() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Ltdrv202().run();
    }
}
