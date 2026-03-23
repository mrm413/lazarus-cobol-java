package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ltcal032 extends CobolProgram {
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
    private CobolString pps_pc_data = new CobolString(1); // Group: PPS-PC-DATA
    private CobolString pps_cot_ind = new CobolString(1);
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
    private CobolString w_msa = new CobolString(4);
    private CobolString w_eff_date = new CobolString(8);
    private BigDecimal w_wage_index1 = BigDecimal.ZERO;
    private BigDecimal w_wage_index2 = BigDecimal.ZERO;
    private BigDecimal w_wage_index3 = BigDecimal.ZERO;


    private CobolString h_los = new CobolString(256); // fallback
    private CobolString p_new_waiver_state = new CobolString(256); // fallback
    private CobolString h_reg_days = new CobolString(256); // fallback
    private CobolString h_total_days = new CobolString(256); // fallback
    private CobolString[] wwm_relwt = new CobolString[100]; // fallback array
    private CobolString wwm_indx = new CobolString(256); // fallback
    private CobolString[] wwm_alos = new CobolString[100]; // fallback array
    private CobolString h_blend_fac = new CobolString(256); // fallback
    private CobolString h_blend_pps = new CobolString(256); // fallback
    private CobolString h_blend_rtc = new CobolString(256); // fallback
    private CobolString h_labor_portion = new CobolString(256); // fallback
    private CobolString h_nonlabor_portion = new CobolString(256); // fallback
    private CobolString h_ssot = new CobolString(256); // fallback
    private CobolString h_ss_cost = new CobolString(256); // fallback
    private CobolString h_ss_pay_amt = new CobolString(256); // fallback
    private CobolString h_fixed_loss_amt = new CobolString(256); // fallback

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

    private void hold_pps_components() {
    }

    private void pps_nat_labor_pct() {
    }

    private void pps_nat_nonlabor_pct() {
    }

    private void pps_std_fed_rate() {
    }

    private void h_fixed_loss_amt() {
    }

    private void pps_bdgt_neut_rate() {
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
        /* RAW: 1750 - */
        return;
    }

    private void assemble_pps_variables() {
        if ((CobolIntrinsics.isNumeric(w_wage_index1) && w_wage_index1.compareTo(new BigDecimal(String.valueOf(0).trim())) > 0)) {
            pps_wage_index = new BigDecimal(String.valueOf(w_wage_index1).trim()).intValue();
        } else {
            pps_rtc = new BigDecimal(String.valueOf(52).trim()).intValue();
            _2000();
            return;
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
    }

    private void pps_cola() {
        pps_fac_costs = new BigDecimal(String.valueOf((p_new_oper_cstchg_ratio * b_cov_charges)).trim()).intValue();
        h_labor_portion.set(String.valueOf((((pps_std_fed_rate * pps_nat_labor_pct)) * pps_wage_index)));
        h_nonlabor_portion.set(String.valueOf((((pps_std_fed_rate * pps_nat_nonlabor_pct)) * pps_cola)));
        pps_fed_pay_amt = new BigDecimal(String.valueOf(((Integer.parseInt(String.valueOf(h_labor_portion).trim()) + Integer.parseInt(String.valueOf(h_nonlabor_portion).trim())))).trim()).intValue();
        pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(((pps_fed_pay_amt * pps_relative_wgt))).trim()).intValue();
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
        h_ss_cost.set(String.valueOf(((pps_fac_costs * 1.2))));
        h_ss_pay_amt.set(String.valueOf((((((pps_drg_adj_pay_amt / pps_avg_los)) * Integer.parseInt(String.valueOf(h_los).trim()))) * 1.2)));
        if (String.valueOf(h_ss_cost).compareTo(String.valueOf(h_ss_pay_amt)) < 0) {
            if (Integer.parseInt(String.valueOf(h_ss_cost).trim()) < pps_drg_adj_pay_amt) {
                pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ss_cost).trim()).intValue();
                pps_rtc = new BigDecimal(String.valueOf(2).trim()).intValue();
            } else {
                /* NEXT SENTENCE */
            }
        } else {
            if (Integer.parseInt(String.valueOf(h_ss_pay_amt).trim()) < pps_drg_adj_pay_amt) {
                pps_drg_adj_pay_amt = new BigDecimal(String.valueOf(h_ss_pay_amt).trim()).intValue();
                pps_rtc = new BigDecimal(String.valueOf(2).trim()).intValue();
            } else {
                /* NEXT SENTENCE */
            }
        }
        /* RAW: 3400 - */
    }

    private void short_stay_exit() {
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
        if ((pps_outlier_pay_amt > 0 && pps_rtc == 2)) {
            /* RAW: PPS-RTC  */
        }
        if ((pps_outlier_pay_amt > 0 && pps_rtc == 0)) {
            /* RAW: PPS-RTC  */
        }
        if ((pps_rtc == 0 || true)) {
            if (pps_reg_days_used > Integer.parseInt(String.valueOf(h_ssot).trim())) {
                pps_ltr_days_used = new BigDecimal(String.valueOf(0).trim()).intValue();
            } else {
                /* NEXT SENTENCE */
            }
        }
        if ((pps_rtc == 1 || true)) {
            if ((b_cov_days < Integer.parseInt(String.valueOf(h_los).trim()) || String.valueOf(pps_cot_ind).equals(String.valueOf("Y")))) {
                pps_chrg_threshold = new BigDecimal(String.valueOf((pps_outlier_threshold / p_new_oper_cstchg_ratio)).trim()).intValue();
                pps_rtc = new BigDecimal(String.valueOf(67).trim()).intValue();
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
        pps_drg_adj_pay_amt = new BigDecimal(String.valueOf((((pps_drg_adj_pay_amt * pps_bdgt_neut_rate)) * Integer.parseInt(String.valueOf(h_blend_pps).trim()))).trim()).intValue();
        pps_new_fac_spec_rate = new BigDecimal(String.valueOf((((p_new_fac_spec_rate * pps_bdgt_neut_rate)) * Integer.parseInt(String.valueOf(h_blend_fac).trim()))).trim()).intValue();
        pps_final_pay_amt = new BigDecimal(String.valueOf(((pps_drg_adj_pay_amt + pps_outlier_pay_amt) + pps_new_fac_spec_rate)).trim()).intValue();
    // pps_rtc = new BigDecimal(String.valueOf(pps_rtc + h_blend_rtc).trim()).intValue();
        /* RAW: 8000 - */
        return;
    }

    private void move_results() {
        if (pps_rtc < 50) {
            pps_los = new BigDecimal(String.valueOf(h_los).trim()).intValue();
            pps_calc_vers_cd.set(String.valueOf("V03.2"));
        } else {
            pps_data.set("");
            pps_other_data.set("");
            /* RAW: PPS-CALC-VERS-CD  */
        }
        /* RAW: 9000 - */
        return;
    }

    private void _0100() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _1700() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _8000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _3400() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Ltcal032().run();
    }
}
