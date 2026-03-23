package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Escal212 extends CobolProgram {
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
    private int h_comorbid_index = 0;
    private int pic = 0;
    // WORKING-STORAGE SECTION
    private CobolString w_storage_ref = new CobolString(46);
    private CobolString cal_version = new CobolString(5);
    private CobolString display_line_measurement = new CobolString(1); // Group: DISPLAY-LINE-MEASUREMENT
    private CobolString print_line_measurement = new CobolString(1); // Group: PRINT-LINE-MEASUREMENT
    private CobolString hold_comp_rate_pps_components = new CobolString(1); // Group: HOLD-COMP-RATE-PPS-COMPONENTS
    private int h_payment_rate = 0;
    private int h_pymt_amt = 0;
    private int h_wage_adj_pymt_amt = 0;
    private int h_patient_age = 0;
    private int h_age_factor = 0;
    private int h_bsa_factor = 0;
    private int h_bmi_factor = 0;
    private int h_bsa = 0;
    private int h_bmi = 0;
    private int hgt_part = 0;
    private int wgt_part = 0;
    private int combined_part = 0;
    private int calc_bsa = 0;
    private int drug_addon = 0;
    private int base_payment_rate = 0;
    private int msa_blend_pct = 0;
    private int cbsa_blend_pct = 0;
    private int nat_labor_pct = 0;
    private int nat_nonlabor_pct = 0;
    private int etc_hdpa_pct = 0;
    private int a_49_cent_part_d_drug_adj = 0;
    private int hemo_peri_ccpd_amt = 0;
    private int capd_amt = 0;
    private int capd_or_ccpd_factor = 0;
    private int case_mix_bdgt_neut_factor = 0;
    private CobolString composite_rate_multipliers = new CobolString(1); // Group: COMPOSITE-RATE-MULTIPLIERS
    private int cr_age_lt_18 = 0;
    private int cr_age_18_44 = 0;
    private int cr_age_45_59 = 0;
    private int cr_age_60_69 = 0;
    private int cr_age_70_79 = 0;
    private int cr_age_80_plus = 0;
    private int cr_bsa = 0;
    private int cr_bmi_lt_18_5 = 0;
    private CobolString hold_bundled_pps_components = new CobolString(1); // Group: HOLD-BUNDLED-PPS-COMPONENTS
    private int h_bun_nat_labor_amt = 0;
    private int h_bun_nat_nonlabor_amt = 0;
    private int h_bun_base_wage_amt = 0;
    private int h_bun_age_factor = 0;
    private int h_bun_bsa = 0;
    private int h_bun_bsa_factor = 0;
    private int h_bun_bmi = 0;
    private int h_bun_bmi_factor = 0;
    private int h_bun_onset_factor = 0;
    private int h_bun_comorbid_multiplier = 0;
    private int h_bun_adjusted_base_wage_amt = 0;
    private int h_bun_wage_adj_training_amt = 0;
    private int h_cc_74_per_diem_amt = 0;
    private int h_hemo_equiv_dial_sessions = 0;
    private int h_pps_final_pay_amt = 0;
    private int h_full_claim_amt = 0;
    private int h_lv_bun_adjust_base_wage_amt = 0;
    private int h_lv_pps_final_pay_amt = 0;
    private int h_lv_out_predict_services_map = 0;
    private int h_lv_out_cm_adj_predict_m_trt = 0;
    private int h_lv_out_predicted_map = 0;
    private int h_lv_out_payment = 0;
    private int h_comorbid_multiplier = 0;
    private CobolString is_high_comorbid_found = new CobolString(1);
    private CobolString[] h_comorbid_data = new CobolString[6];
    private CobolString h_comorbid_cwf_code = new CobolString(2);
    private int h_bun_low_vol_multiplier = 0;
    private int qip_reduction = 0;
    private int sub = 0;
    private int the_date = 0;
    private int integer_line_item_date = 0;
    private int integer_dialysis_date = 0;
    private int onset_date = 0;
    private CobolString moved_cormorbids = new CobolString(1);
    private int h_bun_rural_multiplier = 0;
    private int h_tdapa_payment = 0;
    private int h_tpnies_payment = 0;
    private int h_network_reduction = 0;
    private int h_per_diem_amt_without_hdpa = 0;
    private int h_per_diem_amt_with_hdpa = 0;
    private int h_final_amt_without_hdpa = 0;
    private int h_final_amt_with_hdpa = 0;
    private CobolString hold_outlier_pps_components = new CobolString(1); // Group: HOLD-OUTLIER-PPS-COMPONENTS
    private int h_out_age_factor = 0;
    private int h_out_bsa = 0;
    private int h_out_bsa_factor = 0;
    private int h_out_bmi = 0;
    private int h_out_bmi_factor = 0;
    private int h_out_onset_factor = 0;
    private int h_out_comorbid_multiplier = 0;
    private int h_out_low_vol_multiplier = 0;
    private int h_out_adj_avg_map_amt = 0;
    private int h_out_fix_dollar_loss = 0;
    private int h_out_loss_sharing_pct = 0;
    private int h_out_predicted_services_map = 0;
    private int h_out_imputed_map = 0;
    private int h_out_cm_adj_predict_map_trt = 0;
    private int h_out_predicted_map = 0;
    private int h_out_payment = 0;
    private int h_out_hemo_equiv_payment = 0;
    private int h_out_rural_multiplier = 0;
    private int bundled_base_pmt_rate = 0;
    private int com_cbsa_blend_pct = 0;
    private int bun_cbsa_blend_pct = 0;
    private int waive_cbsa_blend_pct = 0;
    private int bun_nat_labor_pct = 0;
    private int bun_nat_nonlabor_pct = 0;
    private int training_add_on_pmt_amt = 0;
    private int transition_bdgt_neut_factor = 0;
    private int bsa_national_average = 0;
    private CobolString pediatric_multipliers = new CobolString(1); // Group: PEDIATRIC-MULTIPLIERS
    private CobolString ped_sep_bill_pay_multi = new CobolString(1); // Group: PED-SEP-BILL-PAY-MULTI
    private int sb_age_lt_13_pd_mode = 0;
    private int sb_age_lt_13_hemo_mode = 0;
    private int sb_age_13_17_pd_mode = 0;
    private int sb_age_13_17_hemo_mode = 0;
    private CobolString ped_expand_bundle_pay_multi = new CobolString(1); // Group: PED-EXPAND-BUNDLE-PAY-MULTI
    private int eb_age_lt_13_pd_mode = 0;
    private int eb_age_lt_13_hemo_mode = 0;
    private int eb_age_13_17_pd_mode = 0;
    private int eb_age_13_17_hemo_mode = 0;
    private CobolString adult_multipliers = new CobolString(1); // Group: ADULT-MULTIPLIERS
    private CobolString sep_billable_paymant_multi = new CobolString(1); // Group: SEP-BILLABLE-PAYMANT-MULTI
    private int sb_age_18_44 = 0;
    private int sb_age_45_59 = 0;
    private int sb_age_60_69 = 0;
    private int sb_age_70_79 = 0;
    private int sb_age_80_plus = 0;
    private int sb_bsa = 0;
    private int sb_bmi_lt_18_5 = 0;
    private int sb_onset_le_120 = 0;
    private int sb_pericarditis = 0;
    private int sb_gi_bleed = 0;
    private int sb_sickel_cell = 0;
    private int sb_myelodysplastic = 0;
    private int sb_low_vol_adj_lt_4000 = 0;
    private int sb_rural = 0;
    private CobolString case_mix_payment_multi = new CobolString(1); // Group: CASE-MIX-PAYMENT-MULTI
    private int cm_age_18_44 = 0;
    private int cm_age_45_59 = 0;
    private int cm_age_60_69 = 0;
    private int cm_age_70_79 = 0;
    private int cm_age_80_plus = 0;
    private int cm_bsa = 0;
    private int cm_bmi_lt_18_5 = 0;
    private int cm_onset_le_120 = 0;
    private int cm_pericarditis = 0;
    private int cm_gi_bleed = 0;
    private int cm_sickel_cell = 0;
    private int cm_myelodysplastic = 0;
    private int cm_low_vol_adj_lt_4000 = 0;
    private int cm_rural = 0;
    private CobolString outlier_sb_calc_amounts = new CobolString(1); // Group: OUTLIER-SB-CALC-AMOUNTS
    private int adj_avg_map_amt_lt_18 = 0;
    private int adj_avg_map_amt_gt_17 = 0;
    private int fix_dollar_loss_lt_18 = 0;
    private int fix_dollar_loss_gt_17 = 0;
    private int loss_sharing_pct_lt_18 = 0;
    private int loss_sharing_pct_gt_17 = 0;
    private CobolString paid_return_code_trackers = new CobolString(1); // Group: PAID-RETURN-CODE-TRACKERS
    private CobolString outlier_track = new CobolString(1);
    private CobolString acute_comorbid_track = new CobolString(1);
    private CobolString chronic_comorbid_track = new CobolString(1);
    private CobolString onset_track = new CobolString(1);
    private CobolString low_volume_track = new CobolString(1);
    private CobolString training_track = new CobolString(1);
    private CobolString pediatric_track = new CobolString(1);
    private CobolString low_bmi_track = new CobolString(1);


    private CobolString bundled_test = new CobolString(256); // fallback
    private CobolString bill_data_test = new CobolString(256); // fallback
    private CobolString cond_cd_73 = new CobolString(256); // fallback
    private CobolString pps_rtc = new CobolString(256); // fallback
    private CobolString b_cond_code = new CobolString(256); // fallback
    private CobolString pps_2011_comorbid_pay = new CobolString(256); // fallback
    private CobolString p_prov_type = new CobolString(256); // fallback
    private CobolString p_spec_pymt_ind = new CobolString(256); // fallback
    private CobolString b_dob_date = new CobolString(256); // fallback
    private CobolString b_patient_wgt = new CobolString(256); // fallback
    private CobolString b_patient_hgt = new CobolString(256); // fallback
    private CobolString b_rev_code = new CobolString(256); // fallback
    private CobolString p_qip_reduction = new CobolString(256); // fallback
    private CobolString b_claim_num_dialysis_sessions = new CobolString(256); // fallback
    private CobolString b_line_item_date_service = new CobolString(256); // fallback
    private CobolString b_dialysis_start_date = new CobolString(256); // fallback
    private CobolString b_tot_price_sb_outlier = new CobolString(256); // fallback
    private CobolString comorbid_cwf_return_code = new CobolString(256); // fallback
    private CobolString bun_cbsa_w_index = new CobolString(256); // fallback
    private CobolString b_thru_ccyy = new CobolString(256); // fallback
    private CobolString b_dob_ccyy = new CobolString(256); // fallback
    private CobolString b_dob_mm = new CobolString(256); // fallback
    private CobolString b_thru_mm = new CobolString(256); // fallback
    private CobolString[] comorbid_data = new CobolString[100]; // fallback array
    private CobolString p_prov_low_volume_indic = new CobolString(256); // fallback
    private CobolString p_geo_cbsa = new CobolString(256); // fallback
    private CobolString b_payer_only_vc_q8 = new CobolString(256); // fallback
    private CobolString b_payer_only_vc_qg_amt = new CobolString(256); // fallback
    private CobolString b_data_code = new CobolString(256); // fallback
    private CobolString p_prov_waive_blend_pay_indic = new CobolString(256); // fallback
    private CobolString pps_low_vol_amt = new CobolString(256); // fallback
    private CobolString high_comorbid_found = new CobolString(256); // fallback
    private CobolString out_non_per_diem_payment = new CobolString(256); // fallback
    private CobolString p_geo_msa = new CobolString(256); // fallback
    private CobolString pps_2011_blend_comp_rate = new CobolString(256); // fallback
    private CobolString pps_2011_blend_pps_rate = new CobolString(256); // fallback
    private CobolString pps_2011_blend_outlier_rate = new CobolString(256); // fallback
    private CobolString pps_2011_full_pps_rate = new CobolString(256); // fallback
    private CobolString pps_2011_full_comp_rate = new CobolString(256); // fallback
    private CobolString pps_2011_full_outlier_rate = new CobolString(256); // fallback
    private CobolString adj_base_wage_before_etc_hdpa = new CobolString(256); // fallback
    private CobolString drug_add_on_return = new CobolString(256); // fallback
    private CobolString msa_wage_adj = new CobolString(256); // fallback
    private CobolString cbsa_wage_adj = new CobolString(256); // fallback
    private CobolString cbsa_wage_pmt_rate = new CobolString(256); // fallback
    private CobolString age_return = new CobolString(256); // fallback
    private CobolString msa_wage_amt = new CobolString(256); // fallback
    private CobolString com_cbsa_w_index = new CobolString(256); // fallback
    private CobolString cbsa_wage_index = new CobolString(256); // fallback
    private CobolString pps_bmi = new CobolString(256); // fallback
    private CobolString pps_bsa = new CobolString(256); // fallback
    private CobolString msa_pct = new CobolString(256); // fallback
    private CobolString cbsa_pct = new CobolString(256); // fallback
    private CobolString com_cbsa_pct_blend = new CobolString(256); // fallback
    private CobolString bun_cbsa_pct_blend = new CobolString(256); // fallback
    private CobolString bun_bsa = new CobolString(256); // fallback
    private CobolString bun_bmi = new CobolString(256); // fallback
    private CobolString bun_onset_factor = new CobolString(256); // fallback
    private CobolString bun_comorbid_multiplier = new CobolString(256); // fallback
    private CobolString bun_low_vol_multiplier = new CobolString(256); // fallback
    private CobolString out_age_factor = new CobolString(256); // fallback
    private CobolString out_bsa = new CobolString(256); // fallback
    private CobolString out_sb_bsa = new CobolString(256); // fallback
    private CobolString out_bsa_factor = new CobolString(256); // fallback
    private CobolString out_bmi = new CobolString(256); // fallback
    private CobolString out_bmi_factor = new CobolString(256); // fallback
    private CobolString out_onset_factor = new CobolString(256); // fallback
    private CobolString out_comorbid_multiplier = new CobolString(256); // fallback
    private CobolString out_predicted_services_map = new CobolString(256); // fallback
    private CobolString out_case_mix_predicted_map = new CobolString(256); // fallback
    private CobolString out_hemo_equiv_dial_sessions = new CobolString(256); // fallback
    private CobolString out_low_vol_multiplier = new CobolString(256); // fallback
    private CobolString out_adj_avg_map_amt = new CobolString(256); // fallback
    private CobolString out_imputed_map = new CobolString(256); // fallback
    private CobolString out_fix_dollar_loss = new CobolString(256); // fallback
    private CobolString out_loss_sharing_pct = new CobolString(256); // fallback
    private CobolString out_predicted_map = new CobolString(256); // fallback
    private CobolString cr_bsa_multiplier = new CobolString(256); // fallback
    private CobolString cr_bmi_multiplier = new CobolString(256); // fallback
    private CobolString a_49_cent_drug_adj = new CobolString(256); // fallback
    private CobolString pps_cm_bsa = new CobolString(256); // fallback
    private CobolString pps_cm_bmi_lt_18_5 = new CobolString(256); // fallback
    private CobolString pps_bun_base_pmt_rate = new CobolString(256); // fallback
    private CobolString pps_bun_cbsa_w_index = new CobolString(256); // fallback
    private CobolString bun_adjusted_base_wage_amt = new CobolString(256); // fallback
    private CobolString pps_bun_wage_adj_train_amt = new CobolString(256); // fallback
    private CobolString pps_training_add_on_pmt_amt = new CobolString(256); // fallback
    private CobolString com_payment_rate = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void start_to_finish() {
    }

    private void pps_data_all() {
    }

    private void p_prov_waive_blend_pay_indic() {
        if (!String.valueOf(bundled_test).trim().isEmpty()) {
            bill_data_test.set("");
            cond_cd_73.set("");
        }
    }

    private void pps_calc_vers_cd() {
    }

    private void pps_rtc() {
        _1000();
        /* RAW: -  */
    }

    private void validate_bill_elements() {
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            _1200();
            /* RAW: - INITIALIZATION */
            if (String.valueOf(b_cond_code).equals(String.valueOf("84"))) {
                h_pps_final_pay_amt = new BigDecimal(String.valueOf(h_bun_base_wage_amt).trim()).intValue();
                pps_rtc.set(String.valueOf("02"));
                pps_2011_comorbid_pay.set(String.valueOf("10"));
            } else {
                _2000();
                /* RAW: - CALCULATE-BUNDLED-FACTORS */
                _9000();
                /* RAW: - SET-RETURN-CODE */
            }
            _9100();
            /* RAW: - MOVE-RESULTS */
        }
        return;
    }

    private void validate_bill_elements_2() {
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (((((!String.valueOf(b_cond_code).equals(String.valueOf("73")) && true) && true) && true) && true)) {
                pps_rtc.set(String.valueOf(58));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (((String.valueOf(p_prov_type).equals(String.valueOf("40")) || true) || true)) {
                /* NEXT SENTENCE */
            } else {
                pps_rtc.set(String.valueOf(52));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if ((!String.valueOf(p_spec_pymt_ind).equals(String.valueOf("1")) && true)) {
                pps_rtc.set(String.valueOf(53));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if ((String.valueOf(b_dob_date).equals(String.valueOf(0)) || !CobolIntrinsics.isNumeric(b_dob_date))) {
                pps_rtc.set(String.valueOf(54));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (!String.valueOf(b_cond_code).equals(String.valueOf("84"))) {
                if ((String.valueOf(b_patient_wgt).equals(String.valueOf(0)) || !CobolIntrinsics.isNumeric(b_patient_wgt))) {
                    pps_rtc.set(String.valueOf(55));
                }
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (!String.valueOf(b_cond_code).equals(String.valueOf("84"))) {
                if ((String.valueOf(b_patient_hgt).equals(String.valueOf(0)) || !CobolIntrinsics.isNumeric(b_patient_hgt))) {
                    pps_rtc.set(String.valueOf(56));
                }
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (((((String.valueOf(b_rev_code).equals(String.valueOf("0821")) || true) || true) || true) || true)) {
                /* NEXT SENTENCE */
            } else {
                pps_rtc.set(String.valueOf(57));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (((((!String.valueOf(p_qip_reduction).equals(String.valueOf("1")) && true) && true) && true) && true)) {
                pps_rtc.set(String.valueOf(53));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (!String.valueOf(b_cond_code).equals(String.valueOf("84"))) {
                if (Integer.parseInt(String.valueOf(b_patient_hgt).trim()) > 300) {
                    pps_rtc.set(String.valueOf(71));
                }
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (!String.valueOf(b_cond_code).equals(String.valueOf("84"))) {
                if (Integer.parseInt(String.valueOf(b_patient_wgt).trim()) > 500) {
                    pps_rtc.set(String.valueOf(72));
                }
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if ((String.valueOf(b_claim_num_dialysis_sessions).equals(String.valueOf(0)) || !CobolIntrinsics.isNumeric(b_claim_num_dialysis_sessions))) {
                pps_rtc.set(String.valueOf(73));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if ((String.valueOf(b_line_item_date_service).equals(String.valueOf(0)) || !CobolIntrinsics.isNumeric(b_line_item_date_service))) {
                pps_rtc.set(String.valueOf(74));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (!CobolIntrinsics.isNumeric(b_dialysis_start_date)) {
                pps_rtc.set(String.valueOf(75));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (!CobolIntrinsics.isNumeric(b_tot_price_sb_outlier)) {
                pps_rtc.set(String.valueOf(76));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (!String.valueOf(b_cond_code).equals(String.valueOf("84"))) {
                if ((((((String.valueOf(comorbid_cwf_return_code).equals(String.valueOf(" ")) || true) || true) || true) || true) || true)) {
                    /* NEXT SENTENCE */
                } else {
                    pps_rtc.set(String.valueOf(81));
                }
            }
        }
        /* RAW: 1200 - */
    }

    private void initialization() {
    }

    private void hold_comp_rate_pps_components() {
    }

    private void hold_bundled_pps_components() {
    }

    private void hold_outlier_pps_components() {
    }

    private void paid_return_code_trackers() {
        h_bun_nat_labor_amt = new BigDecimal(String.valueOf((((bundled_base_pmt_rate * bun_nat_labor_pct)) * Integer.parseInt(String.valueOf(bun_cbsa_w_index).trim()))).trim()).intValue();
        h_bun_nat_nonlabor_amt = new BigDecimal(String.valueOf((bundled_base_pmt_rate * bun_nat_nonlabor_pct)).trim()).intValue();
        h_bun_base_wage_amt = new BigDecimal(String.valueOf((h_bun_nat_labor_amt + h_bun_nat_nonlabor_amt)).trim()).intValue();
        /* RAW: 2000 - */
    }

    private void calculate_bundled_factors() {
        h_patient_age = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(b_thru_ccyy).trim()) - Integer.parseInt(String.valueOf(b_dob_ccyy).trim()))).trim()).intValue();
        if (String.valueOf(b_dob_mm).compareTo(String.valueOf(b_thru_mm)) > 0) {
            h_patient_age = new BigDecimal(String.valueOf((h_patient_age - 1)).trim()).intValue();
        }
        if (h_patient_age < 18) {
            pediatric_track.set(String.valueOf("Y"));
        }
    }

    private void moved_cormorbids() {
        if (String.valueOf(p_qip_reduction).equals(String.valueOf(" "))) {
            qip_reduction = new BigDecimal(String.valueOf(1).trim()).intValue();
        } else {
            if (String.valueOf(p_qip_reduction).equals(String.valueOf("1"))) {
                qip_reduction = new BigDecimal(String.valueOf(0.995).trim()).intValue();
            } else {
                if (String.valueOf(p_qip_reduction).equals(String.valueOf("2"))) {
                    qip_reduction = new BigDecimal(String.valueOf(0.99).trim()).intValue();
                } else {
                    if (String.valueOf(p_qip_reduction).equals(String.valueOf("3"))) {
                        qip_reduction = new BigDecimal(String.valueOf(0.985).trim()).intValue();
                    } else {
                        qip_reduction = new BigDecimal(String.valueOf(0.98).trim()).intValue();
                    }
                }
            }
        }
        if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf(" "))) {
            /* NEXT SENTENCE */
        } else {
            moved_cormorbids.set(String.valueOf("Y"));
            if (h_comorbid_data[1 - 1] == null) h_comorbid_data[1 - 1] = new CobolString(256);
            h_comorbid_data[1 - 1].set(String.valueOf(comorbid_data[1 - 1]));
            if (h_comorbid_data[2 - 1] == null) h_comorbid_data[2 - 1] = new CobolString(256);
            h_comorbid_data[2 - 1].set(String.valueOf(comorbid_data[2 - 1]));
            if (h_comorbid_data[3 - 1] == null) h_comorbid_data[3 - 1] = new CobolString(256);
            h_comorbid_data[3 - 1].set(String.valueOf(comorbid_data[3 - 1]));
            if (h_comorbid_data[4 - 1] == null) h_comorbid_data[4 - 1] = new CobolString(256);
            h_comorbid_data[4 - 1].set(String.valueOf(comorbid_data[4 - 1]));
            if (h_comorbid_data[5 - 1] == null) h_comorbid_data[5 - 1] = new CobolString(256);
            h_comorbid_data[5 - 1].set(String.valueOf(comorbid_data[5 - 1]));
            if (h_comorbid_data[6 - 1] == null) h_comorbid_data[6 - 1] = new CobolString(256);
            h_comorbid_data[6 - 1].set(String.valueOf(comorbid_data[6 - 1]));
            h_comorbid_cwf_code.set(String.valueOf(comorbid_cwf_return_code));
            if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("10"))) {
                if (comorbid_data[1 - 1] == null) comorbid_data[1 - 1] = new CobolString(256);
                comorbid_data[1 - 1].set(String.valueOf(" "));
                if (comorbid_data[2 - 1] == null) comorbid_data[2 - 1] = new CobolString(256);
                comorbid_data[2 - 1].set(String.valueOf(" "));
                if (comorbid_data[3 - 1] == null) comorbid_data[3 - 1] = new CobolString(256);
                comorbid_data[3 - 1].set(String.valueOf(" "));
                if (comorbid_data[4 - 1] == null) comorbid_data[4 - 1] = new CobolString(256);
                comorbid_data[4 - 1].set(String.valueOf(" "));
                if (comorbid_data[5 - 1] == null) comorbid_data[5 - 1] = new CobolString(256);
                comorbid_data[5 - 1].set(String.valueOf(" "));
                if (comorbid_data[6 - 1] == null) comorbid_data[6 - 1] = new CobolString(256);
                comorbid_data[6 - 1].set(String.valueOf(" "));
                comorbid_cwf_return_code.set(String.valueOf(" "));
            } else {
                if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("20"))) {
                    if (comorbid_data[1 - 1] == null) comorbid_data[1 - 1] = new CobolString(256);
                    comorbid_data[1 - 1].set(String.valueOf("MA"));
                    if (comorbid_data[2 - 1] == null) comorbid_data[2 - 1] = new CobolString(256);
                    comorbid_data[2 - 1].set(String.valueOf(" "));
                    if (comorbid_data[3 - 1] == null) comorbid_data[3 - 1] = new CobolString(256);
                    comorbid_data[3 - 1].set(String.valueOf(" "));
                    if (comorbid_data[4 - 1] == null) comorbid_data[4 - 1] = new CobolString(256);
                    comorbid_data[4 - 1].set(String.valueOf(" "));
                    if (comorbid_data[5 - 1] == null) comorbid_data[5 - 1] = new CobolString(256);
                    comorbid_data[5 - 1].set(String.valueOf(" "));
                    if (comorbid_data[6 - 1] == null) comorbid_data[6 - 1] = new CobolString(256);
                    comorbid_data[6 - 1].set(String.valueOf(" "));
                    comorbid_cwf_return_code.set(String.valueOf(" "));
                } else {
                    if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("40"))) {
                        if (comorbid_data[1 - 1] == null) comorbid_data[1 - 1] = new CobolString(256);
                        comorbid_data[1 - 1].set(String.valueOf(" "));
                        if (comorbid_data[2 - 1] == null) comorbid_data[2 - 1] = new CobolString(256);
                        comorbid_data[2 - 1].set(String.valueOf(" "));
                        if (comorbid_data[3 - 1] == null) comorbid_data[3 - 1] = new CobolString(256);
                        comorbid_data[3 - 1].set(String.valueOf("MC"));
                        if (comorbid_data[4 - 1] == null) comorbid_data[4 - 1] = new CobolString(256);
                        comorbid_data[4 - 1].set(String.valueOf(" "));
                        if (comorbid_data[5 - 1] == null) comorbid_data[5 - 1] = new CobolString(256);
                        comorbid_data[5 - 1].set(String.valueOf(" "));
                        if (comorbid_data[6 - 1] == null) comorbid_data[6 - 1] = new CobolString(256);
                        comorbid_data[6 - 1].set(String.valueOf(" "));
                        comorbid_cwf_return_code.set(String.valueOf(" "));
                    } else {
                        if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("50"))) {
                            if (comorbid_data[1 - 1] == null) comorbid_data[1 - 1] = new CobolString(256);
                            comorbid_data[1 - 1].set(String.valueOf(" "));
                            if (comorbid_data[2 - 1] == null) comorbid_data[2 - 1] = new CobolString(256);
                            comorbid_data[2 - 1].set(String.valueOf(" "));
                            if (comorbid_data[3 - 1] == null) comorbid_data[3 - 1] = new CobolString(256);
                            comorbid_data[3 - 1].set(String.valueOf(" "));
                            if (comorbid_data[4 - 1] == null) comorbid_data[4 - 1] = new CobolString(256);
                            comorbid_data[4 - 1].set(String.valueOf("MD"));
                            if (comorbid_data[5 - 1] == null) comorbid_data[5 - 1] = new CobolString(256);
                            comorbid_data[5 - 1].set(String.valueOf(" "));
                            if (comorbid_data[6 - 1] == null) comorbid_data[6 - 1] = new CobolString(256);
                            comorbid_data[6 - 1].set(String.valueOf(" "));
                            comorbid_cwf_return_code.set(String.valueOf(" "));
                        } else {
                            if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("60"))) {
                                if (comorbid_data[1 - 1] == null) comorbid_data[1 - 1] = new CobolString(256);
                                comorbid_data[1 - 1].set(String.valueOf(" "));
                                if (comorbid_data[2 - 1] == null) comorbid_data[2 - 1] = new CobolString(256);
                                comorbid_data[2 - 1].set(String.valueOf(" "));
                                if (comorbid_data[3 - 1] == null) comorbid_data[3 - 1] = new CobolString(256);
                                comorbid_data[3 - 1].set(String.valueOf(" "));
                                if (comorbid_data[4 - 1] == null) comorbid_data[4 - 1] = new CobolString(256);
                                comorbid_data[4 - 1].set(String.valueOf(" "));
                                if (comorbid_data[5 - 1] == null) comorbid_data[5 - 1] = new CobolString(256);
                                comorbid_data[5 - 1].set(String.valueOf("ME"));
                                if (comorbid_data[6 - 1] == null) comorbid_data[6 - 1] = new CobolString(256);
                                comorbid_data[6 - 1].set(String.valueOf(" "));
                                comorbid_cwf_return_code.set(String.valueOf(" "));
                            }
                        }
                    }
                }
            }
        }
        if (h_patient_age < 13) {
            if ((String.valueOf(b_rev_code).equals(String.valueOf("0821")) || true)) {
                h_bun_age_factor = new BigDecimal(String.valueOf(eb_age_lt_13_hemo_mode).trim()).intValue();
            } else {
                h_bun_age_factor = new BigDecimal(String.valueOf(eb_age_lt_13_pd_mode).trim()).intValue();
            }
        } else {
            if (h_patient_age < 18) {
                if ((String.valueOf(b_rev_code).equals(String.valueOf("0821")) || true)) {
                    h_bun_age_factor = new BigDecimal(String.valueOf(eb_age_13_17_hemo_mode).trim()).intValue();
                } else {
                    h_bun_age_factor = new BigDecimal(String.valueOf(eb_age_13_17_pd_mode).trim()).intValue();
                }
            } else {
                if (h_patient_age < 45) {
                    h_bun_age_factor = new BigDecimal(String.valueOf(cm_age_18_44).trim()).intValue();
                } else {
                    if (h_patient_age < 60) {
                        h_bun_age_factor = new BigDecimal(String.valueOf(cm_age_45_59).trim()).intValue();
                    } else {
                        if (h_patient_age < 70) {
                            h_bun_age_factor = new BigDecimal(String.valueOf(cm_age_60_69).trim()).intValue();
                        } else {
                            if (h_patient_age < 80) {
                                h_bun_age_factor = new BigDecimal(String.valueOf(cm_age_70_79).trim()).intValue();
                            } else {
                                h_bun_age_factor = new BigDecimal(String.valueOf(cm_age_80_plus).trim()).intValue();
                            }
                        }
                    }
                }
            }
        }
        h_bun_bsa = new BigDecimal(String.valueOf((((0.007184 * (Math.pow(Integer.parseInt(String.valueOf(b_patient_hgt).trim()), 0.725))) * (Math.pow(Integer.parseInt(String.valueOf(b_patient_wgt).trim()), 0.425))))).trim()).intValue();
        if (h_patient_age > 17) {
            h_bun_bsa_factor = new BigDecimal(String.valueOf(Math.pow(cm_bsa, ((((h_bun_bsa - bsa_national_average)) / 0.1)))).trim()).intValue();
        } else {
            h_bun_bsa_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        h_bun_bmi = new BigDecimal(String.valueOf((((Integer.parseInt(String.valueOf(b_patient_wgt).trim()) / (Math.pow(Integer.parseInt(String.valueOf(b_patient_hgt).trim()), 2)))) * 10000)).trim()).intValue();
        if ((h_patient_age > 17 && h_bun_bmi < 18.5)) {
            h_bun_bmi_factor = new BigDecimal(String.valueOf(cm_bmi_lt_18_5).trim()).intValue();
            low_bmi_track.set(String.valueOf("Y"));
        } else {
            h_bun_bmi_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        if (String.valueOf(b_dialysis_start_date).compareTo(String.valueOf(0)) > 0) {
            the_date = new BigDecimal(String.valueOf(b_line_item_date_service).trim()).intValue();
            integer_line_item_date = new BigDecimal(String.valueOf(CobolIntrinsics.integer_of_date(the_date)).trim()).intValue();
            the_date = new BigDecimal(String.valueOf(b_dialysis_start_date).trim()).intValue();
            integer_dialysis_date = new BigDecimal(String.valueOf(CobolIntrinsics.integer_of_date(the_date)).trim()).intValue();
            onset_date = new BigDecimal(String.valueOf((((integer_line_item_date - integer_dialysis_date)) + 1)).trim()).intValue();
            if (h_patient_age > 17) {
                if (onset_date > 120) {
                    h_bun_onset_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
                } else {
                    h_bun_onset_factor = new BigDecimal(String.valueOf(cm_onset_le_120).trim()).intValue();
                    onset_track.set(String.valueOf("Y"));
                }
            } else {
                h_bun_onset_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
            }
        } else {
            h_bun_onset_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf(" "))) {
            if (h_patient_age < 18) {
                h_bun_comorbid_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
                pps_2011_comorbid_pay.set(String.valueOf("10"));
            } else {
                if (h_bun_onset_factor == cm_onset_le_120) {
                    h_bun_comorbid_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
                    pps_2011_comorbid_pay.set(String.valueOf("10"));
                } else {
                    _2100();
                    /* RAW: - CALC-COMORBID-ADJUST */
                    h_bun_comorbid_multiplier = new BigDecimal(String.valueOf(h_comorbid_multiplier).trim()).intValue();
                }
            }
        } else {
            if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("10"))) {
                h_bun_comorbid_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
                pps_2011_comorbid_pay.set(String.valueOf("10"));
            } else {
                if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("20"))) {
                    h_bun_comorbid_multiplier = new BigDecimal(String.valueOf(cm_gi_bleed).trim()).intValue();
                    pps_2011_comorbid_pay.set(String.valueOf("20"));
                } else {
                    if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("40"))) {
                        h_bun_comorbid_multiplier = new BigDecimal(String.valueOf(cm_pericarditis).trim()).intValue();
                        pps_2011_comorbid_pay.set(String.valueOf("40"));
                    }
                }
            }
        }
        if (String.valueOf(p_prov_low_volume_indic).equals(String.valueOf("Y"))) {
            if (h_patient_age > 17) {
                h_bun_low_vol_multiplier = new BigDecimal(String.valueOf(cm_low_vol_adj_lt_4000).trim()).intValue();
                low_volume_track.set(String.valueOf("Y"));
            } else {
                h_bun_low_vol_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
            }
        } else {
            h_bun_low_vol_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        if ((Integer.parseInt(String.valueOf(p_geo_cbsa).trim()) < 100 && h_patient_age > 17)) {
            h_bun_rural_multiplier = new BigDecimal(String.valueOf(cm_rural).trim()).intValue();
        } else {
            /* RAW: H-BUN-RURAL-MULTIPLIER  */
        }
        h_bun_adjusted_base_wage_amt = new BigDecimal(String.valueOf(((((((h_bun_base_wage_amt * h_bun_age_factor)) * ((h_bun_bsa_factor * h_bun_bmi_factor))) * ((h_bun_onset_factor * h_bun_comorbid_multiplier))) * h_bun_low_vol_multiplier) * h_bun_rural_multiplier)).trim()).intValue();
        if ((String.valueOf(b_cond_code).equals(String.valueOf("73")) || true)) {
            if (h_bun_onset_factor == cm_onset_le_120) {
                h_bun_wage_adj_training_amt = new BigDecimal(String.valueOf(0).trim()).intValue();
            } else {
                h_bun_wage_adj_training_amt = new BigDecimal(String.valueOf((training_add_on_pmt_amt * Integer.parseInt(String.valueOf(bun_cbsa_w_index).trim()))).trim()).intValue();
                training_track.set(String.valueOf("Y"));
            }
        } else {
            if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
                h_per_diem_amt_without_hdpa = new BigDecimal(String.valueOf((((h_bun_adjusted_base_wage_amt * 3)) / 7)).trim()).intValue();
                h_per_diem_amt_with_hdpa = new BigDecimal(String.valueOf((((((h_bun_adjusted_base_wage_amt * 3)) / 7)) * etc_hdpa_pct)).trim()).intValue();
            } else {
                h_bun_wage_adj_training_amt = new BigDecimal(String.valueOf(0).trim()).intValue();
                h_per_diem_amt_without_hdpa = new BigDecimal(String.valueOf(0).trim()).intValue();
                h_per_diem_amt_with_hdpa = new BigDecimal(String.valueOf(0).trim()).intValue();
            }
        }
        if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
            h_final_amt_without_hdpa = new BigDecimal(String.valueOf(h_per_diem_amt_without_hdpa).trim()).intValue();
            h_final_amt_with_hdpa = new BigDecimal(String.valueOf(h_per_diem_amt_with_hdpa).trim()).intValue();
    // h_full_claim_amt = new BigDecimal(String.valueOf((((h_bun_adjusted_base_wage_amt * (((b_claim_num_dialysis_sessions) * 3))) / 7))).trim()).intValue();
        } else {
            h_final_amt_without_hdpa = new BigDecimal(String.valueOf((h_bun_adjusted_base_wage_amt + h_bun_wage_adj_training_amt)).trim()).intValue();
            h_final_amt_with_hdpa = new BigDecimal(String.valueOf((((h_bun_adjusted_base_wage_amt * etc_hdpa_pct)) + h_bun_wage_adj_training_amt)).trim()).intValue();
        }
        h_tdapa_payment = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(b_payer_only_vc_q8).trim()) / Integer.parseInt(String.valueOf(b_claim_num_dialysis_sessions).trim()))).trim()).intValue();
        if (CobolIntrinsics.isNumeric(b_payer_only_vc_qg_amt)) {
            h_tpnies_payment = new BigDecimal(String.valueOf((((0.65 * Integer.parseInt(String.valueOf(b_payer_only_vc_qg_amt).trim()))) / Integer.parseInt(String.valueOf(b_claim_num_dialysis_sessions).trim()))).trim()).intValue();
        }
        h_final_amt_without_hdpa = new BigDecimal(String.valueOf(((h_final_amt_without_hdpa + h_tdapa_payment) + h_tpnies_payment)).trim()).intValue();
        h_final_amt_with_hdpa = new BigDecimal(String.valueOf(((h_final_amt_with_hdpa + h_tdapa_payment) + h_tpnies_payment)).trim()).intValue();
        if (String.valueOf(b_data_code).equals(String.valueOf("94"))) {
            h_pps_final_pay_amt = new BigDecimal(String.valueOf(h_final_amt_with_hdpa).trim()).intValue();
        } else {
            h_pps_final_pay_amt = new BigDecimal(String.valueOf(h_final_amt_without_hdpa).trim()).intValue();
        }
        if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
            h_network_reduction = new BigDecimal(String.valueOf(0.21).trim()).intValue();
        } else {
            /* RAW: H-NETWORK-REDUCTION  */
        }
        _2500();
        /* RAW: -  */
    }

    private void calc_outlier_factors() {
        if (String.valueOf(low_volume_track).equals(String.valueOf("Y"))) {
            _3000();
            /* RAW: - LOW-VOL-FULL-PPS-PAYMENT */
            _3100();
            /* RAW: - LOW-VOL-OUT-PPS-PAYMENT */
            h_lv_pps_final_pay_amt = new BigDecimal(String.valueOf((h_lv_pps_final_pay_amt - h_pps_final_pay_amt)).trim()).intValue();
            h_lv_out_payment = new BigDecimal(String.valueOf((h_lv_out_payment - h_out_payment)).trim()).intValue();
            h_lv_pps_final_pay_amt = new BigDecimal(String.valueOf((h_lv_pps_final_pay_amt + h_lv_out_payment)).trim()).intValue();
            if (String.valueOf(p_prov_waive_blend_pay_indic).equals(String.valueOf("N"))) {
                pps_low_vol_amt.set(String.valueOf((h_lv_pps_final_pay_amt * bun_cbsa_blend_pct)));
            } else {
                pps_low_vol_amt.set(String.valueOf(h_lv_pps_final_pay_amt));
            }
        }
        /* RAW: 2100 - */
    }

    private void calc_comorbid_adjust() {
    }

    private void is_high_comorbid_found() {
    }

    private void h_comorbid_multiplier() {
    }

    private void pps_2011_comorbid_pay() {
        for (sub = 1; !((sub > 6 || !String.valueOf(high_comorbid_found).trim().isEmpty())); sub += 1) {
            if (String.valueOf(comorbid_data[sub - 1]).equals(String.valueOf("MA"))) {
                h_comorbid_multiplier = new BigDecimal(String.valueOf(cm_gi_bleed).trim()).intValue();
                acute_comorbid_track.set(String.valueOf("Y"));
                pps_2011_comorbid_pay.set(String.valueOf("20"));
            } else {
                if (String.valueOf(comorbid_data[sub - 1]).equals(String.valueOf("MC"))) {
                    if (cm_pericarditis > h_comorbid_multiplier) {
                        h_comorbid_multiplier = new BigDecimal(String.valueOf(cm_pericarditis).trim()).intValue();
                        acute_comorbid_track.set(String.valueOf("Y"));
                        pps_2011_comorbid_pay.set(String.valueOf("40"));
                    }
                } else {
                    if (String.valueOf(comorbid_data[sub - 1]).equals(String.valueOf("MD"))) {
                        if (cm_myelodysplastic > h_comorbid_multiplier) {
                            h_comorbid_multiplier = new BigDecimal(String.valueOf(cm_myelodysplastic).trim()).intValue();
                            chronic_comorbid_track.set(String.valueOf("Y"));
                            pps_2011_comorbid_pay.set(String.valueOf("50"));
                        }
                    } else {
                        if (String.valueOf(comorbid_data[sub - 1]).equals(String.valueOf("ME"))) {
                            if (cm_sickel_cell > h_comorbid_multiplier) {
                                h_comorbid_multiplier = new BigDecimal(String.valueOf(cm_sickel_cell).trim()).intValue();
                                chronic_comorbid_track.set(String.valueOf("Y"));
                                pps_2011_comorbid_pay.set(String.valueOf("60"));
                            }
                        }
                    }
                }
            }
        }
        /* RAW: 2500 - */
    }

    private void calc_outlier_factors_2() {
        if (h_patient_age < 13) {
            if ((String.valueOf(b_rev_code).equals(String.valueOf("0821")) || true)) {
                h_out_age_factor = new BigDecimal(String.valueOf(sb_age_lt_13_hemo_mode).trim()).intValue();
            } else {
                h_out_age_factor = new BigDecimal(String.valueOf(sb_age_lt_13_pd_mode).trim()).intValue();
            }
        } else {
            if (h_patient_age < 18) {
                if ((String.valueOf(b_rev_code).equals(String.valueOf("0821")) || true)) {
                    h_out_age_factor = new BigDecimal(String.valueOf(sb_age_13_17_hemo_mode).trim()).intValue();
                } else {
                    h_out_age_factor = new BigDecimal(String.valueOf(sb_age_13_17_pd_mode).trim()).intValue();
                }
            } else {
                if (h_patient_age < 45) {
                    h_out_age_factor = new BigDecimal(String.valueOf(sb_age_18_44).trim()).intValue();
                } else {
                    if (h_patient_age < 60) {
                        h_out_age_factor = new BigDecimal(String.valueOf(sb_age_45_59).trim()).intValue();
                    } else {
                        if (h_patient_age < 70) {
                            h_out_age_factor = new BigDecimal(String.valueOf(sb_age_60_69).trim()).intValue();
                        } else {
                            if (h_patient_age < 80) {
                                h_out_age_factor = new BigDecimal(String.valueOf(sb_age_70_79).trim()).intValue();
                            } else {
                                h_out_age_factor = new BigDecimal(String.valueOf(sb_age_80_plus).trim()).intValue();
                            }
                        }
                    }
                }
            }
        }
        h_out_bsa = new BigDecimal(String.valueOf((((0.007184 * (Math.pow(Integer.parseInt(String.valueOf(b_patient_hgt).trim()), 0.725))) * (Math.pow(Integer.parseInt(String.valueOf(b_patient_wgt).trim()), 0.425))))).trim()).intValue();
        if (h_patient_age > 17) {
            h_out_bsa_factor = new BigDecimal(String.valueOf(Math.pow(sb_bsa, ((((h_out_bsa - bsa_national_average)) / 0.1)))).trim()).intValue();
        } else {
            h_out_bsa_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        h_out_bmi = new BigDecimal(String.valueOf((((Integer.parseInt(String.valueOf(b_patient_wgt).trim()) / (Math.pow(Integer.parseInt(String.valueOf(b_patient_hgt).trim()), 2)))) * 10000)).trim()).intValue();
        if ((h_patient_age > 17 && h_out_bmi < 18.5)) {
            h_out_bmi_factor = new BigDecimal(String.valueOf(sb_bmi_lt_18_5).trim()).intValue();
        } else {
            h_out_bmi_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        if (String.valueOf(b_dialysis_start_date).compareTo(String.valueOf(0)) > 0) {
            if (h_patient_age > 17) {
                if (onset_date > 120) {
                    h_out_onset_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
                } else {
                    h_out_onset_factor = new BigDecimal(String.valueOf(sb_onset_le_120).trim()).intValue();
                }
            } else {
                h_out_onset_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
            }
        } else {
            h_out_onset_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf(" "))) {
            if (h_patient_age < 18) {
                h_out_comorbid_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
                pps_2011_comorbid_pay.set(String.valueOf("10"));
            } else {
                if (h_bun_onset_factor == cm_onset_le_120) {
                    h_out_comorbid_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
                    pps_2011_comorbid_pay.set(String.valueOf("10"));
                } else {
                    _2600();
                    /* RAW: - CALC-COMORBID-OUT-ADJUST */
                }
            }
        } else {
            if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("10"))) {
                h_out_comorbid_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
            } else {
                if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("20"))) {
                    h_out_comorbid_multiplier = new BigDecimal(String.valueOf(sb_gi_bleed).trim()).intValue();
                } else {
                    if (String.valueOf(comorbid_cwf_return_code).equals(String.valueOf("40"))) {
                        h_out_comorbid_multiplier = new BigDecimal(String.valueOf(sb_pericarditis).trim()).intValue();
                    }
                }
            }
        }
        if (String.valueOf(p_prov_low_volume_indic).equals(String.valueOf("N"))) {
            h_out_low_vol_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
        } else {
            if (h_patient_age < 18) {
                h_out_low_vol_multiplier = new BigDecimal(String.valueOf(1).trim()).intValue();
            } else {
                h_out_low_vol_multiplier = new BigDecimal(String.valueOf(sb_low_vol_adj_lt_4000).trim()).intValue();
                low_volume_track.set(String.valueOf("Y"));
            }
        }
        if ((Integer.parseInt(String.valueOf(p_geo_cbsa).trim()) < 100 && h_patient_age > 17)) {
            h_out_rural_multiplier = new BigDecimal(String.valueOf(sb_rural).trim()).intValue();
        } else {
            /* RAW: H-OUT-RURAL-MULTIPLIER  */
        }
        h_out_predicted_services_map = new BigDecimal(String.valueOf((((((((h_out_age_factor * h_out_bsa_factor) * h_out_bmi_factor) * h_out_onset_factor) * h_out_comorbid_multiplier) * h_out_rural_multiplier) * h_out_low_vol_multiplier))).trim()).intValue();
        if (h_patient_age < 18) {
            h_out_cm_adj_predict_map_trt = new BigDecimal(String.valueOf(((h_out_predicted_services_map * adj_avg_map_amt_lt_18))).trim()).intValue();
            h_out_adj_avg_map_amt = new BigDecimal(String.valueOf(adj_avg_map_amt_lt_18).trim()).intValue();
        } else {
            h_out_cm_adj_predict_map_trt = new BigDecimal(String.valueOf(((h_out_predicted_services_map * adj_avg_map_amt_gt_17))).trim()).intValue();
            h_out_adj_avg_map_amt = new BigDecimal(String.valueOf(adj_avg_map_amt_gt_17).trim()).intValue();
        }
        if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
            h_hemo_equiv_dial_sessions = new BigDecimal(String.valueOf(((((Integer.parseInt(String.valueOf(b_claim_num_dialysis_sessions).trim()) * 3)) / 7))).trim()).intValue();
            h_out_imputed_map = new BigDecimal(String.valueOf(((Integer.parseInt(String.valueOf(b_tot_price_sb_outlier).trim()) / h_hemo_equiv_dial_sessions))).trim()).intValue();
        } else {
            h_out_imputed_map = new BigDecimal(String.valueOf(((Integer.parseInt(String.valueOf(b_tot_price_sb_outlier).trim()) / Integer.parseInt(String.valueOf(b_claim_num_dialysis_sessions).trim())))).trim()).intValue();
        }
        if (h_patient_age < 18) {
            h_out_predicted_map = new BigDecimal(String.valueOf((h_out_cm_adj_predict_map_trt + fix_dollar_loss_lt_18)).trim()).intValue();
            h_out_fix_dollar_loss = new BigDecimal(String.valueOf(fix_dollar_loss_lt_18).trim()).intValue();
            if (h_out_imputed_map > h_out_predicted_map) {
                h_out_payment = new BigDecimal(String.valueOf((((h_out_imputed_map - h_out_predicted_map)) * loss_sharing_pct_lt_18)).trim()).intValue();
                h_out_loss_sharing_pct = new BigDecimal(String.valueOf(loss_sharing_pct_lt_18).trim()).intValue();
                outlier_track.set(String.valueOf("Y"));
            } else {
                h_out_payment = new BigDecimal(String.valueOf(0).trim()).intValue();
                h_out_loss_sharing_pct = new BigDecimal(String.valueOf(0).trim()).intValue();
            }
        } else {
            h_out_predicted_map = new BigDecimal(String.valueOf((h_out_cm_adj_predict_map_trt + fix_dollar_loss_gt_17)).trim()).intValue();
            h_out_fix_dollar_loss = new BigDecimal(String.valueOf(fix_dollar_loss_gt_17).trim()).intValue();
            if (h_out_imputed_map > h_out_predicted_map) {
                h_out_payment = new BigDecimal(String.valueOf((((h_out_imputed_map - h_out_predicted_map)) * loss_sharing_pct_gt_17)).trim()).intValue();
                h_out_loss_sharing_pct = new BigDecimal(String.valueOf(loss_sharing_pct_gt_17).trim()).intValue();
                outlier_track.set(String.valueOf("Y"));
            } else {
                h_out_payment = new BigDecimal(String.valueOf(0).trim()).intValue();
            }
        }
        out_non_per_diem_payment.set(String.valueOf(h_out_payment));
        if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
    // h_out_payment = new BigDecimal(String.valueOf((h_out_payment * (((((b_claim_num_dialysis_sessions) * 3)) / 7)))).trim()).intValue();
        }
        /* RAW: 2600 - */
    }

    private void calc_comorbid_out_adjust() {
    }

    private void is_high_comorbid_found_2() {
    }

    private void h_out_comorbid_multiplier() {
        for (sub = 1; !((sub > 6 || !String.valueOf(high_comorbid_found).trim().isEmpty())); sub += 1) {
            if (String.valueOf(comorbid_data[sub - 1]).equals(String.valueOf("MA"))) {
                h_out_comorbid_multiplier = new BigDecimal(String.valueOf(sb_gi_bleed).trim()).intValue();
                acute_comorbid_track.set(String.valueOf("Y"));
            } else {
                if (String.valueOf(comorbid_data[sub - 1]).equals(String.valueOf("MC"))) {
                    if (sb_pericarditis > h_out_comorbid_multiplier) {
                        h_out_comorbid_multiplier = new BigDecimal(String.valueOf(sb_pericarditis).trim()).intValue();
                        acute_comorbid_track.set(String.valueOf("Y"));
                    }
                } else {
                    if (String.valueOf(comorbid_data[sub - 1]).equals(String.valueOf("MD"))) {
                        if (sb_myelodysplastic > h_out_comorbid_multiplier) {
                            h_out_comorbid_multiplier = new BigDecimal(String.valueOf(sb_myelodysplastic).trim()).intValue();
                            chronic_comorbid_track.set(String.valueOf("Y"));
                        }
                    } else {
                        if (String.valueOf(comorbid_data[sub - 1]).equals(String.valueOf("ME"))) {
                            if (sb_sickel_cell > h_out_comorbid_multiplier) {
                                h_out_comorbid_multiplier = new BigDecimal(String.valueOf(sb_sickel_cell).trim()).intValue();
                                chronic_comorbid_track.set(String.valueOf("Y"));
                            }
                        }
                    }
                }
            }
        }
        /* RAW: 3000 - */
    }

    private void low_vol_full_pps_payment() {
        h_lv_bun_adjust_base_wage_amt = new BigDecimal(String.valueOf((((((h_bun_base_wage_amt * h_bun_age_factor)) * ((h_bun_bsa_factor * h_bun_bmi_factor))) * ((h_bun_onset_factor * h_bun_comorbid_multiplier))) * h_bun_rural_multiplier)).trim()).intValue();
        if ((String.valueOf(b_cond_code).equals(String.valueOf("73")) || true)) {
            if (h_bun_onset_factor == cm_onset_le_120) {
                h_bun_wage_adj_training_amt = new BigDecimal(String.valueOf(0).trim()).intValue();
            } else {
                h_bun_wage_adj_training_amt = new BigDecimal(String.valueOf((training_add_on_pmt_amt * Integer.parseInt(String.valueOf(bun_cbsa_w_index).trim()))).trim()).intValue();
                training_track.set(String.valueOf("Y"));
            }
        } else {
            if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
                h_cc_74_per_diem_amt = new BigDecimal(String.valueOf((((h_lv_bun_adjust_base_wage_amt * 3)) / 7)).trim()).intValue();
            } else {
                h_bun_wage_adj_training_amt = new BigDecimal(String.valueOf(0).trim()).intValue();
                h_cc_74_per_diem_amt = new BigDecimal(String.valueOf(0).trim()).intValue();
            }
        }
        if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
            h_lv_pps_final_pay_amt = new BigDecimal(String.valueOf(h_cc_74_per_diem_amt).trim()).intValue();
        } else {
            h_lv_pps_final_pay_amt = new BigDecimal(String.valueOf((h_lv_bun_adjust_base_wage_amt + h_bun_wage_adj_training_amt)).trim()).intValue();
        }
        /* RAW: 3100 - */
    }

    private void low_vol_out_pps_payment() {
        h_lv_out_predict_services_map = new BigDecimal(String.valueOf(((((((h_out_age_factor * h_out_bsa_factor) * h_out_bmi_factor) * h_out_onset_factor) * h_out_comorbid_multiplier) * h_out_rural_multiplier))).trim()).intValue();
        if (h_patient_age < 18) {
            h_lv_out_cm_adj_predict_m_trt = new BigDecimal(String.valueOf(((h_lv_out_predict_services_map * adj_avg_map_amt_lt_18))).trim()).intValue();
            h_out_adj_avg_map_amt = new BigDecimal(String.valueOf(adj_avg_map_amt_lt_18).trim()).intValue();
        } else {
            h_lv_out_cm_adj_predict_m_trt = new BigDecimal(String.valueOf(((h_lv_out_predict_services_map * adj_avg_map_amt_gt_17))).trim()).intValue();
            h_out_adj_avg_map_amt = new BigDecimal(String.valueOf(adj_avg_map_amt_gt_17).trim()).intValue();
        }
        if (h_patient_age < 18) {
            h_lv_out_predicted_map = new BigDecimal(String.valueOf((h_lv_out_cm_adj_predict_m_trt + fix_dollar_loss_lt_18)).trim()).intValue();
            h_out_fix_dollar_loss = new BigDecimal(String.valueOf(fix_dollar_loss_lt_18).trim()).intValue();
            if (h_out_imputed_map > h_lv_out_predicted_map) {
                h_lv_out_payment = new BigDecimal(String.valueOf((((h_out_imputed_map - h_lv_out_predicted_map)) * loss_sharing_pct_lt_18)).trim()).intValue();
                h_out_loss_sharing_pct = new BigDecimal(String.valueOf(loss_sharing_pct_lt_18).trim()).intValue();
            } else {
                h_lv_out_payment = new BigDecimal(String.valueOf(0).trim()).intValue();
                h_out_loss_sharing_pct = new BigDecimal(String.valueOf(0).trim()).intValue();
            }
        } else {
            h_lv_out_predicted_map = new BigDecimal(String.valueOf((h_lv_out_cm_adj_predict_m_trt + fix_dollar_loss_gt_17)).trim()).intValue();
            h_out_fix_dollar_loss = new BigDecimal(String.valueOf(fix_dollar_loss_gt_17).trim()).intValue();
            if (h_out_imputed_map > h_lv_out_predicted_map) {
                h_lv_out_payment = new BigDecimal(String.valueOf((((h_out_imputed_map - h_lv_out_predicted_map)) * loss_sharing_pct_gt_17)).trim()).intValue();
                h_out_loss_sharing_pct = new BigDecimal(String.valueOf(loss_sharing_pct_gt_17).trim()).intValue();
            } else {
                h_lv_out_payment = new BigDecimal(String.valueOf(0).trim()).intValue();
            }
        }
        out_non_per_diem_payment.set(String.valueOf(h_lv_out_payment));
        if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
    // h_lv_out_payment = new BigDecimal(String.valueOf((h_lv_out_payment * (((((b_claim_num_dialysis_sessions) * 3)) / 7)))).trim()).intValue();
        }
        /* RAW: 9000 - */
    }

    private void set_return_code() {
        if (String.valueOf(pediatric_track).equals(String.valueOf("Y"))) {
            if (String.valueOf(outlier_track).equals(String.valueOf("Y"))) {
                if (String.valueOf(training_track).equals(String.valueOf("Y"))) {
                    pps_rtc.set(String.valueOf(17));
                } else {
                    pps_rtc.set(String.valueOf(16));
                }
            } else {
                if (String.valueOf(training_track).equals(String.valueOf("Y"))) {
                    pps_rtc.set(String.valueOf(15));
                } else {
                    pps_rtc.set(String.valueOf(14));
                }
            }
        } else {
            if (String.valueOf(outlier_track).equals(String.valueOf("Y"))) {
                if (String.valueOf(low_volume_track).equals(String.valueOf("Y"))) {
                    if (String.valueOf(training_track).equals(String.valueOf("Y"))) {
                        if (String.valueOf(chronic_comorbid_track).equals(String.valueOf("Y"))) {
                            pps_rtc.set(String.valueOf(24));
                        } else {
                            if (String.valueOf(acute_comorbid_track).equals(String.valueOf("Y"))) {
                                pps_rtc.set(String.valueOf(19));
                            } else {
                                pps_rtc.set(String.valueOf(29));
                            }
                        }
                    } else {
                        if (String.valueOf(chronic_comorbid_track).equals(String.valueOf("Y"))) {
                            pps_rtc.set(String.valueOf(23));
                        } else {
                            if (String.valueOf(acute_comorbid_track).equals(String.valueOf("Y"))) {
                                pps_rtc.set(String.valueOf(18));
                            } else {
                                if (String.valueOf(onset_track).equals(String.valueOf("Y"))) {
                                    pps_rtc.set(String.valueOf(30));
                                } else {
                                    pps_rtc.set(String.valueOf(28));
                                }
                            }
                        }
                    }
                } else {
                    if (String.valueOf(training_track).equals(String.valueOf("Y"))) {
                        if (String.valueOf(chronic_comorbid_track).equals(String.valueOf("Y"))) {
                            pps_rtc.set(String.valueOf(34));
                        } else {
                            if (String.valueOf(acute_comorbid_track).equals(String.valueOf("Y"))) {
                                pps_rtc.set(String.valueOf(35));
                            } else {
                                pps_rtc.set(String.valueOf(33));
                            }
                        }
                    } else {
                        if (String.valueOf(chronic_comorbid_track).equals(String.valueOf("Y"))) {
                            pps_rtc.set(String.valueOf(7));
                        } else {
                            if (String.valueOf(acute_comorbid_track).equals(String.valueOf("Y"))) {
                                pps_rtc.set(String.valueOf(6));
                            } else {
                                if (String.valueOf(onset_track).equals(String.valueOf("Y"))) {
                                    pps_rtc.set(String.valueOf(9));
                                } else {
                                    pps_rtc.set(String.valueOf(3));
                                }
                            }
                        }
                    }
                }
            } else {
                if (String.valueOf(low_volume_track).equals(String.valueOf("Y"))) {
                    if (String.valueOf(training_track).equals(String.valueOf("Y"))) {
                        if (String.valueOf(chronic_comorbid_track).equals(String.valueOf("Y"))) {
                            pps_rtc.set(String.valueOf(26));
                        } else {
                            if (String.valueOf(acute_comorbid_track).equals(String.valueOf("Y"))) {
                                pps_rtc.set(String.valueOf(21));
                            } else {
                                pps_rtc.set(String.valueOf(12));
                            }
                        }
                    } else {
                        if (String.valueOf(chronic_comorbid_track).equals(String.valueOf("Y"))) {
                            pps_rtc.set(String.valueOf(25));
                        } else {
                            if (String.valueOf(acute_comorbid_track).equals(String.valueOf("Y"))) {
                                pps_rtc.set(String.valueOf(20));
                            } else {
                                if (String.valueOf(onset_track).equals(String.valueOf("Y"))) {
                                    pps_rtc.set(String.valueOf(32));
                                } else {
                                    pps_rtc.set(String.valueOf(10));
                                }
                            }
                        }
                    }
                } else {
                    if (String.valueOf(training_track).equals(String.valueOf("Y"))) {
                        if (String.valueOf(chronic_comorbid_track).equals(String.valueOf("Y"))) {
                            pps_rtc.set(String.valueOf(27));
                        } else {
                            if (String.valueOf(acute_comorbid_track).equals(String.valueOf("Y"))) {
                                pps_rtc.set(String.valueOf(22));
                            } else {
                                pps_rtc.set(String.valueOf(11));
                            }
                        }
                    } else {
                        if (String.valueOf(onset_track).equals(String.valueOf("Y"))) {
                            pps_rtc.set(String.valueOf(8));
                        } else {
                            if (String.valueOf(acute_comorbid_track).equals(String.valueOf("Y"))) {
                                pps_rtc.set(String.valueOf(4));
                            } else {
                                if (String.valueOf(chronic_comorbid_track).equals(String.valueOf("Y"))) {
                                    pps_rtc.set(String.valueOf(5));
                                } else {
                                    if (String.valueOf(low_bmi_track).equals(String.valueOf("Y"))) {
                                        pps_rtc.set(String.valueOf(31));
                                    } else {
                                        pps_rtc.set(String.valueOf(2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        /* RAW: 9100 - */
    }

    private void move_results() {
        if (String.valueOf(moved_cormorbids).equals(String.valueOf(" "))) {
            /* NEXT SENTENCE */
        } else {
            if (comorbid_data[1 - 1] == null) comorbid_data[1 - 1] = new CobolString(256);
            comorbid_data[1 - 1].set(String.valueOf(h_comorbid_data[1 - 1]));
            if (comorbid_data[2 - 1] == null) comorbid_data[2 - 1] = new CobolString(256);
            comorbid_data[2 - 1].set(String.valueOf(h_comorbid_data[2 - 1]));
            if (comorbid_data[3 - 1] == null) comorbid_data[3 - 1] = new CobolString(256);
            comorbid_data[3 - 1].set(String.valueOf(h_comorbid_data[3 - 1]));
            if (comorbid_data[4 - 1] == null) comorbid_data[4 - 1] = new CobolString(256);
            comorbid_data[4 - 1].set(String.valueOf(h_comorbid_data[4 - 1]));
            if (comorbid_data[5 - 1] == null) comorbid_data[5 - 1] = new CobolString(256);
            comorbid_data[5 - 1].set(String.valueOf(h_comorbid_data[5 - 1]));
            if (comorbid_data[6 - 1] == null) comorbid_data[6 - 1] = new CobolString(256);
            comorbid_data[6 - 1].set(String.valueOf(h_comorbid_data[6 - 1]));
            comorbid_cwf_return_code.set(String.valueOf(h_comorbid_cwf_code));
        }
    }

    private void pps_msa() {
    }

    private void pps_cbsa() {
    }

    private void pps_wage_adj_rate() {
    }

    private void pps_cond_code() {
    }

    private void pps_rev_code() {
    }

    private void pps_2011_wage_adj_rate() {
    }

    private void pps_2011_nat_labor_pct() {
    }

    private void pps_2011_nat_nonlabor_pct() {
    }

    private void pps_nat_labor_pct() {
    }

    private void pps_nat_nonlabor_pct() {
    }

    private void pps_age_factor() {
    }

    private void pps_bsa_factor() {
    }

    private void pps_bmi_factor() {
    }

    private void pps_bdgt_neut_rate() {
    }

    private void pps_2011_age_factor() {
    }

    private void pps_2011_bsa_factor() {
    }

    private void pps_2011_bmi_factor() {
    }

    private void pps_2011_bdgt_neut_rate() {
    }

    private void pps_2011_comorbid_ma() {
    }

    private void pps_2011_comorbid_ma_cc() {
        if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
            h_out_payment = new BigDecimal(String.valueOf((h_out_payment / Integer.parseInt(String.valueOf(b_claim_num_dialysis_sessions).trim()))).trim()).intValue();
        }
        if (String.valueOf(p_prov_waive_blend_pay_indic).equals(String.valueOf("N"))) {
            pps_2011_blend_comp_rate.set(String.valueOf((h_pymt_amt * com_cbsa_blend_pct)));
            pps_2011_blend_pps_rate.set(String.valueOf((h_pps_final_pay_amt * bun_cbsa_blend_pct)));
            pps_2011_blend_outlier_rate.set(String.valueOf((h_out_payment * bun_cbsa_blend_pct)));
        } else {
            pps_2011_blend_comp_rate.set(String.valueOf(0));
            pps_2011_blend_pps_rate.set(String.valueOf(0));
            pps_2011_blend_outlier_rate.set(String.valueOf(0));
        }
    }

    private void pps_2011_full_comp_rate() {
        pps_2011_full_pps_rate.set(String.valueOf(h_pps_final_pay_amt));
    }

    private void pps_final_pay_amt() {
    }

    private void pps_2011_full_outlier_rate() {
    }

    private void tdapa_return() {
    }

    private void tpnies_return() {
    }

    private void network_reduction_return() {
        if (!String.valueOf(b_cond_code).equals(String.valueOf("84"))) {
            if (String.valueOf(p_qip_reduction).equals(String.valueOf(" "))) {
                /* CONTINUE */
            } else {
                pps_2011_blend_comp_rate.set(String.valueOf((Integer.parseInt(String.valueOf(pps_2011_blend_comp_rate).trim()) * qip_reduction)));
                pps_2011_full_comp_rate.set(String.valueOf((Integer.parseInt(String.valueOf(pps_2011_full_comp_rate).trim()) * qip_reduction)));
                pps_2011_blend_pps_rate.set(String.valueOf((Integer.parseInt(String.valueOf(pps_2011_blend_pps_rate).trim()) * qip_reduction)));
                pps_2011_blend_outlier_rate.set(String.valueOf((Integer.parseInt(String.valueOf(pps_2011_blend_outlier_rate).trim()) * qip_reduction)));
                h_final_amt_without_hdpa = new BigDecimal(String.valueOf((h_final_amt_without_hdpa * qip_reduction)).trim()).intValue();
                h_final_amt_with_hdpa = new BigDecimal(String.valueOf((h_final_amt_with_hdpa * qip_reduction)).trim()).intValue();
                pps_2011_full_outlier_rate.set(String.valueOf((Integer.parseInt(String.valueOf(pps_2011_full_outlier_rate).trim()) * qip_reduction)));
            }
        }
        h_final_amt_without_hdpa = new BigDecimal(String.valueOf((h_final_amt_without_hdpa - h_network_reduction)).trim()).intValue();
        h_final_amt_with_hdpa = new BigDecimal(String.valueOf((h_final_amt_with_hdpa - h_network_reduction)).trim()).intValue();
        if (!String.valueOf(b_cond_code).equals(String.valueOf("84"))) {
            if (String.valueOf(b_data_code).equals(String.valueOf("94"))) {
                pps_2011_full_pps_rate.set(String.valueOf(h_final_amt_with_hdpa));
                adj_base_wage_before_etc_hdpa.set(String.valueOf(h_final_amt_without_hdpa));
            } else {
                pps_2011_full_pps_rate.set(String.valueOf(h_final_amt_without_hdpa));
                adj_base_wage_before_etc_hdpa.set(String.valueOf(0));
            }
        }
        if (!String.valueOf(bundled_test).trim().isEmpty()) {
            drug_add_on_return.set(String.valueOf(drug_addon));
            msa_wage_adj.set(String.valueOf(0));
            cbsa_wage_adj.set(String.valueOf(h_wage_adj_pymt_amt));
            cbsa_wage_pmt_rate.set(String.valueOf(base_payment_rate));
            age_return.set(String.valueOf(h_patient_age));
            msa_wage_amt.set(String.valueOf(0));
            cbsa_wage_index.set(String.valueOf(com_cbsa_w_index));
            pps_bmi.set(String.valueOf(h_bmi));
            pps_bsa.set(String.valueOf(h_bsa));
            msa_pct.set(String.valueOf(msa_blend_pct));
            cbsa_pct.set(String.valueOf(cbsa_blend_pct));
            if (String.valueOf(p_prov_waive_blend_pay_indic).equals(String.valueOf("N"))) {
                com_cbsa_pct_blend.set(String.valueOf(com_cbsa_blend_pct));
                bun_cbsa_pct_blend.set(String.valueOf(bun_cbsa_blend_pct));
            } else {
                com_cbsa_pct_blend.set(String.valueOf(0));
                bun_cbsa_pct_blend.set(String.valueOf(waive_cbsa_blend_pct));
            }
            bun_bsa.set(String.valueOf(h_bun_bsa));
            bun_bmi.set(String.valueOf(h_bun_bmi));
            bun_onset_factor.set(String.valueOf(h_bun_onset_factor));
            bun_comorbid_multiplier.set(String.valueOf(h_bun_comorbid_multiplier));
            bun_low_vol_multiplier.set(String.valueOf(h_bun_low_vol_multiplier));
            out_age_factor.set(String.valueOf(h_out_age_factor));
            out_bsa.set(String.valueOf(h_out_bsa));
            out_sb_bsa.set(String.valueOf(sb_bsa));
            out_bsa_factor.set(String.valueOf(h_out_bsa_factor));
            out_bmi.set(String.valueOf(h_out_bmi));
            out_bmi_factor.set(String.valueOf(h_out_bmi_factor));
            out_onset_factor.set(String.valueOf(h_out_onset_factor));
            out_comorbid_multiplier.set(String.valueOf(h_out_comorbid_multiplier));
            out_predicted_services_map.set(String.valueOf(h_out_predicted_services_map));
            out_case_mix_predicted_map.set(String.valueOf(h_out_cm_adj_predict_map_trt));
            out_hemo_equiv_dial_sessions.set(String.valueOf(h_hemo_equiv_dial_sessions));
            out_low_vol_multiplier.set(String.valueOf(h_out_low_vol_multiplier));
            out_adj_avg_map_amt.set(String.valueOf(h_out_adj_avg_map_amt));
            out_imputed_map.set(String.valueOf(h_out_imputed_map));
            out_fix_dollar_loss.set(String.valueOf(h_out_fix_dollar_loss));
            out_loss_sharing_pct.set(String.valueOf(h_out_loss_sharing_pct));
            out_predicted_map.set(String.valueOf(h_out_predicted_map));
            cr_bsa_multiplier.set(String.valueOf(cr_bsa));
            cr_bmi_multiplier.set(String.valueOf(cr_bmi_lt_18_5));
            a_49_cent_drug_adj.set(String.valueOf(a_49_cent_part_d_drug_adj));
            pps_cm_bsa.set(String.valueOf(cm_bsa));
            pps_cm_bmi_lt_18_5.set(String.valueOf(cm_bmi_lt_18_5));
            pps_bun_base_pmt_rate.set(String.valueOf(bundled_base_pmt_rate));
            pps_bun_cbsa_w_index.set(String.valueOf(bun_cbsa_w_index));
            bun_adjusted_base_wage_amt.set(String.valueOf(h_bun_adjusted_base_wage_amt));
            pps_bun_wage_adj_train_amt.set(String.valueOf(h_bun_wage_adj_training_amt));
            pps_training_add_on_pmt_amt.set(String.valueOf(training_add_on_pmt_amt));
            com_payment_rate.set(String.valueOf(h_payment_rate));
        }
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _2100() { /* stub — external/COPY */ }

    private void _2500() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _3100() { /* stub — external/COPY */ }

    private void _2600() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Escal212().run();
    }
}
