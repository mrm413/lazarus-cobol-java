package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Snfpr210 extends CobolProgram {
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
    private CobolString cal_version = new CobolString(9);
    private short px1 = (short) 0;
    private short dx1 = (short) 0;


    private CobolString ws_pt_ot_util = new CobolString(256); // fallback
    private CobolString ws_pt_ot_portion = new CobolString(256); // fallback
    private CobolString ws_nta_util = new CobolString(256); // fallback
    private CobolString ws_nta_portion = new CobolString(256); // fallback
    private CobolString ws_nurs_slp_ncm_portion = new CobolString(256); // fallback
    private CobolString days_to_100 = new CobolString(256); // fallback
    private CobolString total_days = new CobolString(256); // fallback
    private CobolString tot_pdpm_casemix_perdiem = new CobolString(256); // fallback
    private CobolString total_calc_payment_rate = new CobolString(256); // fallback
    private CobolString labor_portion = new CobolString(256); // fallback
    private CobolString labor_adjusted = new CobolString(256); // fallback
    private CobolString non_labor_portion = new CobolString(256); // fallback
    private CobolString non_labor_adjusted = new CobolString(256); // fallback
    private CobolString snf_rtc = new CobolString(256); // fallback
    private CobolString snf_hipps_code = new CobolString(256); // fallback
    private CobolString wk_hipps_code = new CobolString(256); // fallback
    private CobolString default_hipps_code = new CobolString(256); // fallback
    private CobolString replacement_hipps_code = new CobolString(256); // fallback
    private CobolString valid_hipps_pt_ot = new CobolString(256); // fallback
    private CobolString valid_hipps_slp = new CobolString(256); // fallback
    private CobolString valid_hipps_nursing = new CobolString(256); // fallback
    private CobolString valid_hipps_nta = new CobolString(256); // fallback
    private CobolString valid_hipps_assess_level = new CobolString(256); // fallback
    private CobolString vbp_multiplier = new CobolString(256); // fallback
    private CobolString snf_pdpm_units = new CobolString(256); // fallback
    private CobolString snf_thru_date = new CobolString(256); // fallback
    private CobolString snf_from_date = new CobolString(256); // fallback
    private CobolString hld_price_thru_mmdd = new CobolString(256); // fallback
    private CobolString hld_price_from_date = new CobolString(256); // fallback
    private CobolString hld_price_thru_date = new CobolString(256); // fallback
    private CobolString cbsa_wir_area_wageind = new CobolString(256); // fallback
    private CobolString sub2 = new CobolString(256); // fallback
    private CobolString prior_days = new CobolString(256); // fallback
    private CobolString current_days = new CobolString(256); // fallback
    private CobolString snf_prin_diag_code = new CobolString(256); // fallback
    private CobolString snf_other_diag_code2 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code3 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code4 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code5 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code6 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code7 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code8 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code9 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code10 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code11 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code12 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code13 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code14 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code15 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code16 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code17 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code18 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code19 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code20 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code21 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code22 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code23 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code24 = new CobolString(256); // fallback
    private CobolString snf_other_diag_code25 = new CobolString(256); // fallback
    private CobolString aids_add_on_ind = new CobolString(256); // fallback
    private CobolString snf_fed_blend = new CobolString(256); // fallback
    private CobolString qrp_ind = new CobolString(256); // fallback
    private CobolString snf_pdpm_prior_days = new CobolString(256); // fallback
    private CobolString region_ind = new CobolString(256); // fallback
    private CobolString ws_pt_ot_fee = new CobolString(256); // fallback
    private CobolString hipps_pt_rate_comp = new CobolString(256); // fallback
    private CobolString hipps_ot_rate_comp = new CobolString(256); // fallback
    private CobolString hipps_nta_rate_comp = new CobolString(256); // fallback
    private CobolString hipps_nurse_rate_comp = new CobolString(256); // fallback
    private CobolString hipps_slp_rate_comp = new CobolString(256); // fallback
    private CobolString hipps_ncm_rate_comp = new CobolString(256); // fallback
    private CobolString percent_2021_labor = new CobolString(256); // fallback
    private CobolString area_wage_index = new CobolString(256); // fallback
    private CobolString percent_2021_nlabor = new CobolString(256); // fallback
    private CobolString total_labor_adj_rate = new CobolString(256); // fallback
    private CobolString snf_payment_rate = new CobolString(256); // fallback
    private CobolString vbp_pay_diff = new CobolString(256); // fallback
    private CobolString pdpm_ptot_idx_u = new CobolString(256); // fallback
    private CobolString pdpm_ptot_data2_u = new CobolString(256); // fallback
    private CobolString[] pdpm_ptot_group_u = new CobolString[100]; // fallback array
    private CobolString hipps_char_1 = new CobolString(256); // fallback
    private CobolString[] pdpm_qrate_pt_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_qrate_ot_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_pt_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_ot_u = new CobolString[100]; // fallback array
    private CobolString pdpm_slp_idx_u = new CobolString(256); // fallback
    private CobolString pdpm_slp_data2_u = new CobolString(256); // fallback
    private CobolString[] pdpm_slp_group_u = new CobolString[100]; // fallback array
    private CobolString hipps_char_2 = new CobolString(256); // fallback
    private CobolString[] pdpm_qrate_slp_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_slp_u = new CobolString[100]; // fallback array
    private CobolString pdpm_nurs_idx_u = new CobolString(256); // fallback
    private CobolString pdpm_nurs_data2_u = new CobolString(256); // fallback
    private CobolString[] pdpm_nurs_group_u = new CobolString[100]; // fallback array
    private CobolString hipps_char_3 = new CobolString(256); // fallback
    private CobolString[] pdpm_qrate_nur_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_aq_rate_nur_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_nur_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_arate_nur_u = new CobolString[100]; // fallback array
    private CobolString pdpm_nta_idx_u = new CobolString(256); // fallback
    private CobolString nta_aids_add_on_a = new CobolString(256); // fallback
    private CobolString hipps_char_4 = new CobolString(256); // fallback
    private CobolString nta_aids_add_on_b = new CobolString(256); // fallback
    private CobolString nta_aids_add_on_c = new CobolString(256); // fallback
    private CobolString pdpm_nta_data2_u = new CobolString(256); // fallback
    private CobolString[] pdpm_nta_group_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_qrate_nta_u = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_nta_u = new CobolString[100]; // fallback array
    private CobolString urban_qrp_ncm_comp_2021 = new CobolString(256); // fallback
    private CobolString urban_ncm_comp_2021 = new CobolString(256); // fallback
    private CobolString pdpm_ptot_idx_r = new CobolString(256); // fallback
    private CobolString pdpm_ptot_data2_r = new CobolString(256); // fallback
    private CobolString[] pdpm_ptot_group_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_qrate_pt_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_qrate_ot_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_pt_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_ot_r = new CobolString[100]; // fallback array
    private CobolString pdpm_slp_idx_r = new CobolString(256); // fallback
    private CobolString pdpm_slp_data2_r = new CobolString(256); // fallback
    private CobolString[] pdpm_slp_group_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_qrate_slp_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_slp_r = new CobolString[100]; // fallback array
    private CobolString pdpm_nurs_idx_r = new CobolString(256); // fallback
    private CobolString pdpm_nurs_data2_r = new CobolString(256); // fallback
    private CobolString[] pdpm_nurs_group_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_qrate_nurs_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_aqrate_nurs_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_nurs_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_arate_nurs_r = new CobolString[100]; // fallback array
    private CobolString pdpm_nta_idx_r = new CobolString(256); // fallback
    private CobolString pdpm_nta_data2_r = new CobolString(256); // fallback
    private CobolString[] pdpm_nta_group_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_qrate_nta_r = new CobolString[100]; // fallback array
    private CobolString[] pdpm_rate_nta_r = new CobolString[100]; // fallback array
    private CobolString rural_qrp_ncm_comp_2021 = new CobolString(256); // fallback
    private CobolString rural_ncm_comp_2021 = new CobolString(256); // fallback
    private CobolString[] vpd_pt_ot_fact = new CobolString[100]; // fallback array
    private CobolString vx1 = new CobolString(256); // fallback
    private CobolString[] vpd_nta_fact = new CobolString[100]; // fallback array

    private void para_main() {
        _0200();
        /* RAW: -  */
    }

    private void mainline_control() {
        return;
    }

    private void mainline_control_2() {
    }

    private void hld_rate_rtc() {
    }

    private void snfpr_version() {
        ws_pt_ot_util.set(String.valueOf(0));
        ws_pt_ot_portion.set(String.valueOf(0));
        ws_nta_util.set(String.valueOf(0));
        ws_nta_portion.set(String.valueOf(0));
        ws_nurs_slp_ncm_portion.set(String.valueOf(0));
        days_to_100.set(String.valueOf(0));
        total_days.set(String.valueOf(0));
        tot_pdpm_casemix_perdiem.set(String.valueOf(0));
        total_calc_payment_rate.set(String.valueOf(0));
        labor_portion.set(String.valueOf(0));
        labor_adjusted.set(String.valueOf(0));
        non_labor_portion.set(String.valueOf(0));
        non_labor_adjusted.set(String.valueOf(0));
    }

    private void total_labor_adj_rate() {
    }

    private void sub2() {
        if (String.valueOf(snf_rtc).equals(String.valueOf(0))) {
            _300();
            /* RAW: - DEFAULT-HIPPS-CHECK THRU 300 - */
    // break;
            /* RAW: 400 - VALIDATE-SNF-INPUT THRU 400 - */
            return;
        }
        /* RAW: 300 - */
    }

    private void default_hipps_check() {
    }

    private void wk_hipps_code() {
        if (String.valueOf(wk_hipps_code).equals(String.valueOf(default_hipps_code))) {
            wk_hipps_code.set(String.valueOf(replacement_hipps_code));
            _300();
            return;
        }
        if (((((!(!String.valueOf(valid_hipps_pt_ot).trim().isEmpty()) || !(!String.valueOf(valid_hipps_slp).trim().isEmpty())) || !(!String.valueOf(valid_hipps_nursing).trim().isEmpty())) || !(!String.valueOf(valid_hipps_nta).trim().isEmpty())) || !(!String.valueOf(valid_hipps_assess_level).trim().isEmpty()))) {
            snf_rtc.set(String.valueOf("20"));
            _300();
            return;
        }
        /* RAW: 300 - */
        return;
    }

    private void validate_snf_input() {
        if (String.valueOf(vbp_multiplier).equals(String.valueOf(0))) {
            snf_rtc.set(String.valueOf("70"));
        }
        if (String.valueOf(snf_pdpm_units).equals(String.valueOf(0))) {
            snf_rtc.set(String.valueOf("20"));
        }
    }

    private void hld_price_thru_date() {
    }

    private void hld_price_from_date() {
        if ((String.valueOf(hld_price_thru_mmdd).equals(String.valueOf("1001")) && String.valueOf(hld_price_from_date).compareTo(String.valueOf(hld_price_thru_date)) < 0)) {
            /* RAW: HLD-PRICE-THRU-MMDD  */
        }
        if (!String.valueOf(snf_rtc).equals(String.valueOf(0))) {
            _400();
            return;
        }
        if (Integer.parseInt(String.valueOf(hld_price_thru_date).trim()) > 20190930) {
            /* RAW: AREA-WAGE-INDEX  */
        }
        _450();
        /* RAW: - SET-INDICATORS THRU 450 - */
        return;
    }

    private void total_days() {
        _700();
        /* RAW: - CALC-UNADJUSTED-RATE THRU 700 - */
        return;
    }

    private void set_indicators() {
        if (((((((((((((((((((((((((String.valueOf("B20   ").equals(String.valueOf(snf_prin_diag_code)) || !String.valueOf(snf_other_diag_code2).trim().isEmpty()) || !String.valueOf(snf_other_diag_code3).trim().isEmpty()) || !String.valueOf(snf_other_diag_code4).trim().isEmpty()) || !String.valueOf(snf_other_diag_code5).trim().isEmpty()) || !String.valueOf(snf_other_diag_code6).trim().isEmpty()) || !String.valueOf(snf_other_diag_code7).trim().isEmpty()) || !String.valueOf(snf_other_diag_code8).trim().isEmpty()) || !String.valueOf(snf_other_diag_code9).trim().isEmpty()) || !String.valueOf(snf_other_diag_code10).trim().isEmpty()) || !String.valueOf(snf_other_diag_code11).trim().isEmpty()) || !String.valueOf(snf_other_diag_code12).trim().isEmpty()) || !String.valueOf(snf_other_diag_code13).trim().isEmpty()) || !String.valueOf(snf_other_diag_code14).trim().isEmpty()) || !String.valueOf(snf_other_diag_code15).trim().isEmpty()) || !String.valueOf(snf_other_diag_code16).trim().isEmpty()) || !String.valueOf(snf_other_diag_code17).trim().isEmpty()) || !String.valueOf(snf_other_diag_code18).trim().isEmpty()) || !String.valueOf(snf_other_diag_code19).trim().isEmpty()) || !String.valueOf(snf_other_diag_code20).trim().isEmpty()) || !String.valueOf(snf_other_diag_code21).trim().isEmpty()) || !String.valueOf(snf_other_diag_code22).trim().isEmpty()) || !String.valueOf(snf_other_diag_code23).trim().isEmpty()) || !String.valueOf(snf_other_diag_code24).trim().isEmpty()) || !String.valueOf(snf_other_diag_code25).trim().isEmpty())) {
            aids_add_on_ind.set(String.valueOf("Y"));
        } else {
            aids_add_on_ind.set(String.valueOf("N"));
        }
        if (String.valueOf(snf_fed_blend).equals(String.valueOf(1))) {
            qrp_ind.set(String.valueOf("Y"));
        } else {
            qrp_ind.set(String.valueOf("N"));
        }
        /* RAW: 450 - */
        return;
    }

    private void days_in_stay_logic() {
    }

    private void current_days() {
    }

    private void prior_days() {
        /* RAW: 500 - */
        return;
    }

    private void capture_rate_components() {
        if (String.valueOf(region_ind).equals(String.valueOf("U"))) {
            _2000();
            /* RAW: - GET-URBAN-PT-OT-RATES THRU 2000 - */
            return;
        } else {
            _3000();
            /* RAW: - GET-RURAL-PT-OT-RATES THRU 3000 - */
            return;
        }
    // if (String.valueOf(region_ind).equals(String.valueOf("U"))) {
    // _2200();
    // /* RAW: - GET-URBAN-SLP-RATES THRU 2200 - */
    // return;
    // } else {
    // _3200();
    // /* RAW: - GET-RURAL-SLP-RATES THRU 3200 - */
    // return;
    // }
    // if (String.valueOf(region_ind).equals(String.valueOf("U"))) {
    // _2300();
    // /* RAW: - GET-URBAN-NUR-RATES THRU 2300 - */
    // return;
    // } else {
    // _3300();
    // /* RAW: - GET-RURAL-NUR-RATES THRU 3300 - */
    // return;
    // }
    // if (String.valueOf(region_ind).equals(String.valueOf("U"))) {
    // _2400();
    // /* RAW: - GET-URBAN-NTA-RATES THRU 2400 - */
    // return;
    // } else {
    // _3400();
    // /* RAW: - GET-RURAL-NTA-RATES THRU 3400 - */
    // return;
    // }
    // if (String.valueOf(region_ind).equals(String.valueOf("U"))) {
    // _2500();
    // /* RAW: - GET-URBAN-NCM-RATES THRU 2500 - */
    // return;
    // } else {
    // _3500();
    // /* RAW: - GET-RURAL-NCM-RATES THRU 3500 - */
    // return;
    // }
    // /* RAW: 600 - */
    // return;
    }

    private void calc_unadjusted_rate() {
        ws_pt_ot_fee.set(String.valueOf((Integer.parseInt(String.valueOf(hipps_pt_rate_comp).trim()) + Integer.parseInt(String.valueOf(hipps_ot_rate_comp).trim()))));
        ws_pt_ot_portion.set(String.valueOf((Integer.parseInt(String.valueOf(ws_pt_ot_fee).trim()) * Integer.parseInt(String.valueOf(ws_pt_ot_util).trim()))));
        ws_nta_portion.set(String.valueOf((Integer.parseInt(String.valueOf(hipps_nta_rate_comp).trim()) * Integer.parseInt(String.valueOf(ws_nta_util).trim()))));
        ws_nurs_slp_ncm_portion.set(String.valueOf(((((Integer.parseInt(String.valueOf(hipps_nurse_rate_comp).trim()) + Integer.parseInt(String.valueOf(hipps_slp_rate_comp).trim())) + Integer.parseInt(String.valueOf(hipps_ncm_rate_comp).trim()))) * Integer.parseInt(String.valueOf(current_days).trim()))));
        tot_pdpm_casemix_perdiem.set(String.valueOf((((Integer.parseInt(String.valueOf(ws_pt_ot_portion).trim()) + Integer.parseInt(String.valueOf(ws_nta_portion).trim())) + Integer.parseInt(String.valueOf(ws_nurs_slp_ncm_portion).trim())))));
        labor_portion.set(String.valueOf(((Integer.parseInt(String.valueOf(tot_pdpm_casemix_perdiem).trim()) * Integer.parseInt(String.valueOf(percent_2021_labor).trim())))));
        labor_adjusted.set(String.valueOf(((Integer.parseInt(String.valueOf(labor_portion).trim()) * Integer.parseInt(String.valueOf(area_wage_index).trim())))));
        non_labor_portion.set(String.valueOf(((Integer.parseInt(String.valueOf(tot_pdpm_casemix_perdiem).trim()) * Integer.parseInt(String.valueOf(percent_2021_nlabor).trim())))));
        total_labor_adj_rate.set(String.valueOf(((Integer.parseInt(String.valueOf(labor_adjusted).trim()) + Integer.parseInt(String.valueOf(non_labor_portion).trim())))));
        total_calc_payment_rate.set(String.valueOf(total_labor_adj_rate));
        /* RAW: 700 - */
        return;
    }

    private void apply_vbp_multiplier() {
        snf_payment_rate.set(String.valueOf((Integer.parseInt(String.valueOf(vbp_multiplier).trim()) * Integer.parseInt(String.valueOf(total_calc_payment_rate).trim()))));
        vbp_pay_diff.set(String.valueOf((Integer.parseInt(String.valueOf(snf_payment_rate).trim()) - Integer.parseInt(String.valueOf(total_calc_payment_rate).trim()))));
        /* RAW: 1000 - */
        return;
    }

    private void get_urban_pt_ot_rates() {
        pdpm_ptot_idx_u.set(String.valueOf(1));
        /* SEARCH PDPM-PTOT-DATA2-U */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < pdpm_ptot_data2_u.length && !_found; _idx++) {
    // if (String.valueOf(pdpm_ptot_group_u[Integer.parseInt(String.valueOf(pdpm_ptot_idx_u).trim()) - 1]).equals(String.valueOf(hipps_char_1))) {
    // _2010();
    // /* RAW: - PICK-URBAN-PT-OT THRU 2010 - */
    // return;
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("20"));
                _2000();
                return;
            }
        }
        /* RAW: 2000 - */
        return;
    }

    private void pick_urban_pt_ot() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            hipps_pt_rate_comp.set(String.valueOf(pdpm_qrate_pt_u[Integer.parseInt(String.valueOf(pdpm_ptot_idx_u).trim()) - 1]));
            hipps_ot_rate_comp.set(String.valueOf(pdpm_qrate_ot_u[Integer.parseInt(String.valueOf(pdpm_ptot_idx_u).trim()) - 1]));
        } else {
            hipps_pt_rate_comp.set(String.valueOf(pdpm_rate_pt_u[Integer.parseInt(String.valueOf(pdpm_ptot_idx_u).trim()) - 1]));
            hipps_ot_rate_comp.set(String.valueOf(pdpm_rate_ot_u[Integer.parseInt(String.valueOf(pdpm_ptot_idx_u).trim()) - 1]));
        }
        /* RAW: 2010 - */
        return;
    }

    private void get_urban_slp_rates() {
        pdpm_slp_idx_u.set(String.valueOf(1));
        /* SEARCH PDPM-SLP-DATA2-U */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < pdpm_slp_data2_u.length && !_found; _idx++) {
    // if (String.valueOf(pdpm_slp_group_u[Integer.parseInt(String.valueOf(pdpm_slp_idx_u).trim()) - 1]).equals(String.valueOf(hipps_char_2))) {
    // _2210();
    // /* RAW: - PICK-URBAN-SLP THRU 2210 - */
    // return;
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("20"));
                _2200();
                return;
            }
        }
        /* RAW: 2200 - */
        return;
    }

    private void pick_urban_slp() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            hipps_slp_rate_comp.set(String.valueOf(pdpm_qrate_slp_u[Integer.parseInt(String.valueOf(pdpm_slp_idx_u).trim()) - 1]));
        } else {
            hipps_slp_rate_comp.set(String.valueOf(pdpm_rate_slp_u[Integer.parseInt(String.valueOf(pdpm_slp_idx_u).trim()) - 1]));
        }
        /* RAW: 2210 - */
        return;
    }

    private void get_urban_nur_rates() {
        pdpm_nurs_idx_u.set(String.valueOf(1));
        /* SEARCH PDPM-NURS-DATA2-U */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < pdpm_nurs_data2_u.length && !_found; _idx++) {
    // if (String.valueOf(pdpm_nurs_group_u[Integer.parseInt(String.valueOf(pdpm_nurs_idx_u).trim()) - 1]).equals(String.valueOf(hipps_char_3))) {
    // _2310();
    // /* RAW: - PICK-URBAN-NURS THRU 2310 - */
    // return;
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("20"));
                _2300();
                return;
            }
        }
        /* RAW: 2300 - */
        return;
    }

    private void pick_urban_nurs() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            /* RAW: HIPPS-NURSE-RATE-COMP  */
        }
        if ((String.valueOf(qrp_ind).equals(String.valueOf("Y")) && String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")))) {
            hipps_nurse_rate_comp.set(String.valueOf(pdpm_aq_rate_nur_u[Integer.parseInt(String.valueOf(pdpm_nurs_idx_u).trim()) - 1]));
            _2310();
            return;
        }
        if (String.valueOf(qrp_ind).equals(String.valueOf("N"))) {
            /* RAW: HIPPS-NURSE-RATE-COMP  */
        }
        if ((String.valueOf(qrp_ind).equals(String.valueOf("N")) && String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")))) {
            hipps_nurse_rate_comp.set(String.valueOf(pdpm_arate_nur_u[Integer.parseInt(String.valueOf(pdpm_nurs_idx_u).trim()) - 1]));
            _2310();
            return;
        }
        /* RAW: 2310 - */
        return;
    }

    private void get_urban_nta_rates() {
        pdpm_nta_idx_u.set(String.valueOf(1));
        if ((String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")) && !String.valueOf(nta_aids_add_on_a).trim().isEmpty())) {
            hipps_char_4.set(String.valueOf("A"));
        } else {
            if ((String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")) && !String.valueOf(nta_aids_add_on_b).trim().isEmpty())) {
                hipps_char_4.set(String.valueOf("B"));
            } else {
                if ((String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")) && !String.valueOf(nta_aids_add_on_c).trim().isEmpty())) {
                    hipps_char_4.set(String.valueOf("C"));
                }
            }
        }
        /* SEARCH PDPM-NTA-DATA2-U */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < pdpm_nta_data2_u.length && !_found; _idx++) {
    // if (String.valueOf(pdpm_nta_group_u[Integer.parseInt(String.valueOf(pdpm_nta_idx_u).trim()) - 1]).equals(String.valueOf(hipps_char_4))) {
    // _2410();
    // /* RAW: - PICK-URBAN-NTA THRU 2410 - */
    // return;
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("20"));
                _2400();
                return;
            }
        }
        /* RAW: 2400 - */
        return;
    }

    private void pick_urban_nta() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            hipps_nta_rate_comp.set(String.valueOf(pdpm_qrate_nta_u[Integer.parseInt(String.valueOf(pdpm_nta_idx_u).trim()) - 1]));
        } else {
            hipps_nta_rate_comp.set(String.valueOf(pdpm_rate_nta_u[Integer.parseInt(String.valueOf(pdpm_nta_idx_u).trim()) - 1]));
        }
        /* RAW: 2410 - */
        return;
    }

    private void get_urban_ncm_rates() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            hipps_ncm_rate_comp.set(String.valueOf(urban_qrp_ncm_comp_2021));
        } else {
            hipps_ncm_rate_comp.set(String.valueOf(urban_ncm_comp_2021));
        }
        /* RAW: 2500 - */
        return;
    }

    private void get_rural_pt_ot_rates() {
        pdpm_ptot_idx_r.set(String.valueOf(1));
        /* SEARCH PDPM-PTOT-DATA2-R */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < pdpm_ptot_data2_r.length && !_found; _idx++) {
    // if (String.valueOf(pdpm_ptot_group_r[Integer.parseInt(String.valueOf(pdpm_ptot_idx_r).trim()) - 1]).equals(String.valueOf(hipps_char_1))) {
    // _3010();
    // /* RAW: - PICK-RURAL-PT-OT THRU 3010 - */
    // return;
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("20"));
                _3000();
                return;
            }
        }
        /* RAW: 3000 - */
        return;
    }

    private void pick_rural_pt_ot() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            hipps_pt_rate_comp.set(String.valueOf(pdpm_qrate_pt_r[Integer.parseInt(String.valueOf(pdpm_ptot_idx_r).trim()) - 1]));
            hipps_ot_rate_comp.set(String.valueOf(pdpm_qrate_ot_r[Integer.parseInt(String.valueOf(pdpm_ptot_idx_r).trim()) - 1]));
        } else {
            hipps_pt_rate_comp.set(String.valueOf(pdpm_rate_pt_r[Integer.parseInt(String.valueOf(pdpm_ptot_idx_r).trim()) - 1]));
            hipps_ot_rate_comp.set(String.valueOf(pdpm_rate_ot_r[Integer.parseInt(String.valueOf(pdpm_ptot_idx_r).trim()) - 1]));
        }
        /* RAW: 3010 - */
        return;
    }

    private void get_rural_slp_rates() {
        pdpm_slp_idx_r.set(String.valueOf(1));
        /* SEARCH PDPM-SLP-DATA2-R */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < pdpm_slp_data2_r.length && !_found; _idx++) {
    // if (String.valueOf(pdpm_slp_group_r[Integer.parseInt(String.valueOf(pdpm_slp_idx_r).trim()) - 1]).equals(String.valueOf(hipps_char_2))) {
    // _3210();
    // /* RAW: - PICK-RURAL-SLP THRU 3210 - */
    // return;
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("20"));
                _3200();
                return;
            }
        }
        /* RAW: 3200 - */
        return;
    }

    private void pick_rural_slp() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            hipps_slp_rate_comp.set(String.valueOf(pdpm_qrate_slp_r[Integer.parseInt(String.valueOf(pdpm_slp_idx_r).trim()) - 1]));
        } else {
            hipps_slp_rate_comp.set(String.valueOf(pdpm_rate_slp_r[Integer.parseInt(String.valueOf(pdpm_slp_idx_r).trim()) - 1]));
        }
        /* RAW: 3210 - */
        return;
    }

    private void get_rural_nur_rates() {
        pdpm_nurs_idx_r.set(String.valueOf(1));
        /* SEARCH PDPM-NURS-DATA2-R */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < pdpm_nurs_data2_r.length && !_found; _idx++) {
    // if (String.valueOf(pdpm_nurs_group_r[Integer.parseInt(String.valueOf(pdpm_nurs_idx_r).trim()) - 1]).equals(String.valueOf(hipps_char_3))) {
    // _3310();
    // /* RAW: - PICK-RURAL-NURS THRU 3310 - */
    // return;
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("20"));
                _3300();
                return;
            }
        }
        /* RAW: 3300 - */
        return;
    }

    private void pick_rural_nurs() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            /* RAW: HIPPS-NURSE-RATE-COMP  */
        }
        if ((String.valueOf(qrp_ind).equals(String.valueOf("Y")) && String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")))) {
            hipps_nurse_rate_comp.set(String.valueOf(pdpm_aqrate_nurs_r[Integer.parseInt(String.valueOf(pdpm_nurs_idx_r).trim()) - 1]));
            _3310();
            return;
        }
        if (String.valueOf(qrp_ind).equals(String.valueOf("N"))) {
            /* RAW: HIPPS-NURSE-RATE-COMP  */
        }
        if ((String.valueOf(qrp_ind).equals(String.valueOf("N")) && String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")))) {
            hipps_nurse_rate_comp.set(String.valueOf(pdpm_arate_nurs_r[Integer.parseInt(String.valueOf(pdpm_nurs_idx_r).trim()) - 1]));
            _3310();
            return;
        }
        /* RAW: 3310 - */
        return;
    }

    private void get_rural_nta_rates() {
        pdpm_nta_idx_r.set(String.valueOf(1));
        if ((String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")) && !String.valueOf(nta_aids_add_on_a).trim().isEmpty())) {
            hipps_char_4.set(String.valueOf("A"));
        } else {
            if ((String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")) && !String.valueOf(nta_aids_add_on_b).trim().isEmpty())) {
                hipps_char_4.set(String.valueOf("B"));
            } else {
                if ((String.valueOf(aids_add_on_ind).equals(String.valueOf("Y")) && !String.valueOf(nta_aids_add_on_c).trim().isEmpty())) {
                    hipps_char_4.set(String.valueOf("C"));
                }
            }
        }
        /* SEARCH PDPM-NTA-DATA2-R */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < pdpm_nta_data2_r.length && !_found; _idx++) {
    // if (String.valueOf(pdpm_nta_group_r[Integer.parseInt(String.valueOf(pdpm_nta_idx_r).trim()) - 1]).equals(String.valueOf(hipps_char_4))) {
    // _3410();
    // /* RAW: - PICK-RURAL-NTA THRU 3410 - */
    // return;
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("20"));
                _3400();
                return;
            }
        }
        /* RAW: 3400 - */
        return;
    }

    private void pick_rural_nta() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            hipps_nta_rate_comp.set(String.valueOf(pdpm_qrate_nta_r[Integer.parseInt(String.valueOf(pdpm_nta_idx_r).trim()) - 1]));
        } else {
            hipps_nta_rate_comp.set(String.valueOf(pdpm_rate_nta_r[Integer.parseInt(String.valueOf(pdpm_nta_idx_r).trim()) - 1]));
        }
        /* RAW: 3410 - */
        return;
    }

    private void get_rural_ncm_rates() {
        if (String.valueOf(qrp_ind).equals(String.valueOf("Y"))) {
            hipps_ncm_rate_comp.set(String.valueOf(rural_qrp_ncm_comp_2021));
        } else {
            hipps_ncm_rate_comp.set(String.valueOf(rural_ncm_comp_2021));
        }
        /* RAW: 3500 - */
        return;
    }

    private void days_loop_routine() {
        ws_pt_ot_util.set(String.valueOf((Integer.parseInt(String.valueOf(ws_pt_ot_util).trim()) + Integer.parseInt(String.valueOf(vpd_pt_ot_fact[Integer.parseInt(String.valueOf(vx1).trim()) - 1]).trim()))));
        ws_nta_util.set(String.valueOf((Integer.parseInt(String.valueOf(ws_nta_util).trim()) + Integer.parseInt(String.valueOf(vpd_nta_fact[Integer.parseInt(String.valueOf(vx1).trim()) - 1]).trim()))));
        /* RAW: 6000 - */
        return;
    }

    private void _0200() { /* stub — external/COPY */ }

    private void _300() { /* stub — external/COPY */ }

    private void _400() { /* stub — external/COPY */ }

    private void _450() { /* stub — external/COPY */ }

    private void _500() { /* stub — external/COPY */ }

    private void _600() { /* stub — external/COPY */ }

    private void _6000() { /* stub — external/COPY */ }

    private void _700() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _2200() { /* stub — external/COPY */ }

    private void _3200() { /* stub — external/COPY */ }

    private void _2300() { /* stub — external/COPY */ }

    private void _3300() { /* stub — external/COPY */ }

    private void _2400() { /* stub — external/COPY */ }

    private void _3400() { /* stub — external/COPY */ }

    private void _2500() { /* stub — external/COPY */ }

    private void _3500() { /* stub — external/COPY */ }

    private void _2010() { /* stub — external/COPY */ }

    private void _2210() { /* stub — external/COPY */ }

    private void _2310() { /* stub — external/COPY */ }

    private void _2410() { /* stub — external/COPY */ }

    private void _3010() { /* stub — external/COPY */ }

    private void _3210() { /* stub — external/COPY */ }

    private void _3310() { /* stub — external/COPY */ }

    private void _3410() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Snfpr210().run();
    }
}
