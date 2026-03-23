package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Escal091 extends CobolProgram {
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
    private CobolString display_line_measurement = new CobolString(1); // Group: DISPLAY-LINE-MEASUREMENT
    private CobolString print_line_measurement = new CobolString(1); // Group: PRINT-LINE-MEASUREMENT
    private CobolString hold_pps_components = new CobolString(1); // Group: HOLD-PPS-COMPONENTS
    private int h_pymt_amt = 0;
    private int h_wage_adj_pymt_amt = 0;
    private int h_msa_composite_pymt = 0;
    private int h_wage_adj_pymt_old = 0;
    private int h_wage_adj_pymt_new = 0;
    private int h_wage_adj = 0;
    private int h_pymt_rate = 0;
    private int h_fixed_loss_amt = 0;
    private int h_esrd_fac_rate = 0;
    private int h_patient_age = 0;
    private int h_age_factor = 0;
    private int h_bsa_factor = 0;
    private int h_bmi_factor = 0;
    private int h_bsa = 0;
    private int h_bmi = 0;
    private int h_drug_addon = 0;
    private int drug_addon = 0;
    private int hosp_based_pmt_rate = 0;
    private int indp_esrd_fac_pmt_rate = 0;
    private int msa_blend_pct = 0;
    private int cbsa_blend_pct = 0;
    private int nat_labor_pct = 0;
    private int nat_nonlabor_pct = 0;
    private int hemo_peri_ccpd_amt = 0;
    private int capd_amt = 0;
    private int capd_or_ccpd_factor = 0;
    private int case_mix_bdgt_neut_factor = 0;


    private CobolString pps_rtc = new CobolString(256); // fallback
    private CobolString p_prov_type = new CobolString(256); // fallback
    private CobolString pps_nat_labor_pct = new CobolString(256); // fallback
    private CobolString pps_nat_nonlabor_pct = new CobolString(256); // fallback
    private CobolString w_new_rate1_record = new CobolString(256); // fallback
    private CobolString msa_wage_amt = new CobolString(256); // fallback
    private CobolString com_cbsa_w_index = new CobolString(256); // fallback
    private CobolString w_new_rate2_record = new CobolString(256); // fallback
    private CobolString pps_wage_adj_rate = new CobolString(256); // fallback
    private CobolString p_spec_pymt_ind = new CobolString(256); // fallback
    private CobolString b_dob_date = new CobolString(256); // fallback
    private CobolString b_patient_wgt = new CobolString(256); // fallback
    private CobolString b_patient_hgt = new CobolString(256); // fallback
    private CobolString b_rev_code = new CobolString(256); // fallback
    private CobolString b_cond_code = new CobolString(256); // fallback
    private CobolString b_thru_ccyy = new CobolString(256); // fallback
    private CobolString b_dob_ccyy = new CobolString(256); // fallback
    private CobolString b_dob_mm = new CobolString(256); // fallback
    private CobolString b_thru_mm = new CobolString(256); // fallback
    private CobolString pps_bdgt_neut_rate = new CobolString(256); // fallback
    private CobolString amt_indic = new CobolString(256); // fallback
    private CobolString blood_dollar = new CobolString(256); // fallback
    private CobolString hemo_ccpd_capd = new CobolString(256); // fallback
    private CobolString pps_cond_code = new CobolString(256); // fallback
    private CobolString pps_rev_code = new CobolString(256); // fallback
    private CobolString p_geo_msa = new CobolString(256); // fallback
    private CobolString pps_msa = new CobolString(256); // fallback
    private CobolString p_geo_cbsa = new CobolString(256); // fallback
    private CobolString pps_cbsa = new CobolString(256); // fallback
    private CobolString pps_age_factor = new CobolString(256); // fallback
    private CobolString pps_bsa_factor = new CobolString(256); // fallback
    private CobolString pps_bmi_factor = new CobolString(256); // fallback
    private CobolString old_test_case = new CobolString(256); // fallback
    private CobolString drug_add_on_return = new CobolString(256); // fallback
    private CobolString msa_wage_adj = new CobolString(256); // fallback
    private CobolString cbsa_wage_adj = new CobolString(256); // fallback
    private CobolString cbsa_pct = new CobolString(256); // fallback
    private CobolString msa_pct = new CobolString(256); // fallback
    private CobolString cbsa_wage_pmt_rate = new CobolString(256); // fallback
    private CobolString age_return = new CobolString(256); // fallback
    private CobolString cbsa_wage_index = new CobolString(256); // fallback
    private CobolString labor_pct = new CobolString(256); // fallback
    private CobolString case_mix_fctr_adj_rate = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void mainline_control() {
        _0100();
        /* RAW: -  */
    }

    private void initial_routine() {
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            _1000();
            /* RAW: - EDIT-THE-BILL-INFO */
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            _2000();
            /* RAW: - ASSEMBLE-PPS-VARIABLES */
            _3000();
            /* RAW: - CALC-PAYMENT */
        }
        _9000();
        /* RAW: -  */
    }

    private void move_results() {
        return;
    }

    private void initial_routine_2() {
    }

    private void pps_data_all() {
    }

    private void bill_data_test() {
    }

    private void hold_pps_components() {
    }

    private void pps_rtc() {
    }

    private void pps_calc_vers_cd() {
        if ((String.valueOf(p_prov_type).equals(String.valueOf("40")) || true)) {
            pps_nat_labor_pct.set(String.valueOf(nat_labor_pct));
            pps_nat_nonlabor_pct.set(String.valueOf(nat_nonlabor_pct));
            h_pymt_rate = new BigDecimal(String.valueOf(hosp_based_pmt_rate).trim()).intValue();
            h_wage_adj_pymt_old = new BigDecimal(String.valueOf(0).trim()).intValue();
            msa_wage_amt.set(String.valueOf(w_new_rate1_record));
            h_wage_adj = new BigDecimal(String.valueOf(com_cbsa_w_index).trim()).intValue();
        } else {
            if (String.valueOf(p_prov_type).equals(String.valueOf("41"))) {
                pps_nat_labor_pct.set(String.valueOf(nat_labor_pct));
                pps_nat_nonlabor_pct.set(String.valueOf(nat_nonlabor_pct));
                h_pymt_rate = new BigDecimal(String.valueOf(indp_esrd_fac_pmt_rate).trim()).intValue();
                h_wage_adj_pymt_old = new BigDecimal(String.valueOf(0).trim()).intValue();
                msa_wage_amt.set(String.valueOf(w_new_rate2_record));
                h_wage_adj = new BigDecimal(String.valueOf(com_cbsa_w_index).trim()).intValue();
            } else {
                pps_rtc.set(String.valueOf(52));
                pps_wage_adj_rate.set(String.valueOf(0));
            }
        }
    }

    private void msa_adj_year_amt() {
    }

    private void pps_bdgt_neut_rate() {
    }

    private void h_drug_addon() {
        /* RAW: 1000 - */
    }

    private void edit_the_bill_info() {
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
            if ((String.valueOf(b_patient_wgt).equals(String.valueOf(0)) || !CobolIntrinsics.isNumeric(b_patient_wgt))) {
                pps_rtc.set(String.valueOf(55));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if ((String.valueOf(b_patient_hgt).equals(String.valueOf(0)) || !CobolIntrinsics.isNumeric(b_patient_hgt))) {
                pps_rtc.set(String.valueOf(56));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if ((((((String.valueOf(b_rev_code).equals(String.valueOf("0821")) || true) || true) || true) || true) || true)) {
                /* NEXT SENTENCE */
            } else {
                pps_rtc.set(String.valueOf(57));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (((!String.valueOf(b_cond_code).equals(String.valueOf("73")) && true) && true)) {
                pps_rtc.set(String.valueOf(58));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (Integer.parseInt(String.valueOf(b_patient_hgt).trim()) > 300) {
                pps_rtc.set(String.valueOf(71));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            if (Integer.parseInt(String.valueOf(b_patient_wgt).trim()) > 500) {
                pps_rtc.set(String.valueOf(72));
            }
        }
        if (String.valueOf(pps_rtc).equals(String.valueOf(0))) {
            _1200();
            /* RAW: - CALC-AGE */
        }
        /* RAW: 1200 - */
    }

    private void calc_age() {
        h_patient_age = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(b_thru_ccyy).trim()) - Integer.parseInt(String.valueOf(b_dob_ccyy).trim()))).trim()).intValue();
        if (String.valueOf(b_dob_mm).compareTo(String.valueOf(b_thru_mm)) > 0) {
            h_patient_age = new BigDecimal(String.valueOf((h_patient_age - 1)).trim()).intValue();
        }
        if (h_patient_age < 18) {
            h_age_factor = new BigDecimal(String.valueOf(1.62).trim()).intValue();
        } else {
            if ((h_patient_age > 17 && h_patient_age < 45)) {
                h_age_factor = new BigDecimal(String.valueOf(1.223).trim()).intValue();
            } else {
                if ((h_patient_age > 44 && h_patient_age < 60)) {
                    h_age_factor = new BigDecimal(String.valueOf(1.055).trim()).intValue();
                } else {
                    if ((h_patient_age > 59 && h_patient_age < 70)) {
                        h_age_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
                    } else {
                        if ((h_patient_age > 69 && h_patient_age < 80)) {
                            h_age_factor = new BigDecimal(String.valueOf(1.094).trim()).intValue();
                        } else {
                            if (h_patient_age > 79) {
                                h_age_factor = new BigDecimal(String.valueOf(1.174).trim()).intValue();
                            }
                        }
                    }
                }
            }
        }
        /* RAW: 2000 - */
    }

    private void assemble_pps_variables() {
        h_bsa = new BigDecimal(String.valueOf((((0.007184 * (Math.pow(Integer.parseInt(String.valueOf(b_patient_hgt).trim()), 0.725))) * (Math.pow(Integer.parseInt(String.valueOf(b_patient_wgt).trim()), 0.425))))).trim()).intValue();
        h_bmi = new BigDecimal(String.valueOf((((Integer.parseInt(String.valueOf(b_patient_wgt).trim()) / (Math.pow(Integer.parseInt(String.valueOf(b_patient_hgt).trim()), 2)))) * 10000)).trim()).intValue();
        if (h_patient_age > 17) {
            h_bsa_factor = new BigDecimal(String.valueOf(Math.pow(1.037, ((((h_bsa - 1.84)) / 0.1)))).trim()).intValue();
        } else {
            h_bsa_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        if ((h_patient_age > 17 && h_bmi < 18.5)) {
            h_bmi_factor = new BigDecimal(String.valueOf(1.112).trim()).intValue();
        } else {
            h_bmi_factor = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        /* RAW: 3000 - */
    }

    private void calc_payment() {
        h_wage_adj_pymt_new = new BigDecimal(String.valueOf((((((((h_pymt_rate * Integer.parseInt(String.valueOf(pps_nat_labor_pct).trim()))) * h_wage_adj)) + ((h_pymt_rate * Integer.parseInt(String.valueOf(pps_nat_nonlabor_pct).trim()))))) * cbsa_blend_pct)).trim()).intValue();
        h_wage_adj_pymt_amt = new BigDecimal(String.valueOf((h_wage_adj_pymt_new + h_wage_adj_pymt_old)).trim()).intValue();
        h_pymt_amt = new BigDecimal(String.valueOf((((((h_wage_adj_pymt_amt * h_bmi_factor) * h_bsa_factor) * Integer.parseInt(String.valueOf(pps_bdgt_neut_rate).trim())) * h_age_factor) * h_drug_addon)).trim()).intValue();
    }

    private void case_mix_fctr_adj_rate() {
    }

    private void cond_cd_73() {
        if ((String.valueOf(b_cond_code).equals(String.valueOf("73")) && ((String.valueOf(b_rev_code).equals(String.valueOf("0821")) || true) || true))) {
            h_pymt_amt = new BigDecimal(String.valueOf((h_pymt_amt + hemo_peri_ccpd_amt)).trim()).intValue();
            amt_indic.set(String.valueOf("A"));
            blood_dollar.set(String.valueOf(hemo_peri_ccpd_amt));
        } else {
            if ((String.valueOf(b_cond_code).equals(String.valueOf("73")) && String.valueOf(b_rev_code).equals(String.valueOf("0841")))) {
                h_pymt_amt = new BigDecimal(String.valueOf((h_pymt_amt + capd_amt)).trim()).intValue();
                amt_indic.set(String.valueOf("A"));
                blood_dollar.set(String.valueOf(capd_amt));
            } else {
                if ((String.valueOf(b_cond_code).equals(String.valueOf("74")) && (String.valueOf(b_rev_code).equals(String.valueOf("0841")) || true))) {
                    h_pymt_amt = new BigDecimal(String.valueOf((h_pymt_amt * capd_or_ccpd_factor)).trim()).intValue();
                    hemo_ccpd_capd.set(String.valueOf(capd_or_ccpd_factor));
                } else {
                    amt_indic.set(String.valueOf("A"));
                    blood_dollar.set(String.valueOf(0));
                }
            }
        }
    }

    private void pps_final_pay_amt() {
    }

    private void pps_wage_adj_rate() {
        /* RAW: 9000 - */
    }

    private void move_results_2() {
        if (Integer.parseInt(String.valueOf(pps_rtc).trim()) < 50) {
            pps_cond_code.set(String.valueOf(b_cond_code));
            pps_rev_code.set(String.valueOf(b_rev_code));
            pps_msa.set(String.valueOf(p_geo_msa));
            pps_cbsa.set(String.valueOf(p_geo_cbsa));
            pps_age_factor.set(String.valueOf(h_age_factor));
            pps_bsa_factor.set(String.valueOf(h_bsa_factor));
            pps_bmi_factor.set(String.valueOf(h_bmi_factor));
            if (!String.valueOf(old_test_case).trim().isEmpty()) {
                drug_add_on_return.set(String.valueOf(h_drug_addon));
                msa_wage_adj.set(String.valueOf(h_wage_adj_pymt_old));
                cbsa_wage_adj.set(String.valueOf(h_wage_adj_pymt_new));
                cbsa_pct.set(String.valueOf(cbsa_blend_pct));
                msa_pct.set(String.valueOf(msa_blend_pct));
                cbsa_wage_pmt_rate.set(String.valueOf(h_pymt_rate));
                age_return.set(String.valueOf(h_patient_age));
                cbsa_wage_index.set(String.valueOf(h_wage_adj));
                labor_pct.set(String.valueOf(nat_labor_pct));
            }
        } else {
            if (!String.valueOf(old_test_case).trim().isEmpty()) {
                pps_cond_code.set("");
                pps_rev_code.set("");
                pps_msa.set("");
                pps_cbsa.set("");
                pps_age_factor.set("");
                pps_bsa_factor.set("");
                pps_bmi_factor.set("");
                drug_add_on_return.set("");
                msa_wage_adj.set("");
                cbsa_pct.set("");
                msa_pct.set("");
                case_mix_fctr_adj_rate.set("");
                cbsa_wage_pmt_rate.set("");
                hemo_ccpd_capd.set("");
                age_return.set("");
            }
        }
    }

    private void _0100() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Escal091().run();
    }
}
