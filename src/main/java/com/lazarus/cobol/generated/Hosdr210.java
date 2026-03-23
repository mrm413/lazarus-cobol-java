package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hosdr210 extends CobolProgram {
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
    private int px1 = 0;
    private int px2 = 0;
    private int px3 = 0;
    private int pd2 = 0;
    private int pd3 = 0;
    private int mu1 = 0;
    private int mu2 = 0;
    private int mu3 = 0;
    private int cu1 = 0;
    private int cu2 = 0;
    private int cu3 = 0;
    // WORKING-STORAGE SECTION
    private CobolString w_storage_ref = new CobolString(46);
    private CobolString hos_version = new CobolString(9);
    private CobolString hosop210 = new CobolString(8);
    private CobolString hospr210 = new CobolString(8);
    private int eof_msa_sw = 0;
    private int eof_cbsa_sw = 0;
    private int eof_bill_sw = 0;
    private int eof_prov_sw = 0;
    private int bill_ctr = 0;
    private int rate_ctr = 0;
    private int prov_ctr = 0;
    private CobolString search_msa_lugar = new CobolString(1); // Group: SEARCH-MSA-LUGAR
    private CobolString search_msa = new CobolString(1); // Group: SEARCH-MSA
    private int search_msa_pos12 = 0;
    private int search_msa_pos34 = 0;
    private CobolString search_lugar = new CobolString(1);
    private CobolString search_cbsa = new CobolString(1); // Group: SEARCH-CBSA
    private int search_cbsa_pos123 = 0;
    private int search_cbsa_pos45 = 0;
    private CobolString ut1_stat = new CobolString(1); // Group: UT1-STAT
    private CobolString ut1_stat1 = new CobolString(1);
    private CobolString ut1_stat2 = new CobolString(1);
    private CobolString ut2_stat = new CobolString(1); // Group: UT2-STAT
    private CobolString ut2_stat1 = new CobolString(1);
    private CobolString ut2_stat2 = new CobolString(1);
    private CobolString ut3_stat = new CobolString(1); // Group: UT3-STAT
    private CobolString ut3_stat1 = new CobolString(1);
    private CobolString ut3_stat2 = new CobolString(1);
    private CobolString ut4_stat = new CobolString(1); // Group: UT4-STAT
    private CobolString ut4_stat1 = new CobolString(1);
    private CobolString ut4_stat2 = new CobolString(1);
    private CobolString ut5_stat = new CobolString(1); // Group: UT5-STAT
    private CobolString ut5_stat1 = new CobolString(1);
    private CobolString ut5_stat2 = new CobolString(1);
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
    private CobolString p_new_geo_loc_msax_rur = new CobolString(1); // Group: P-NEW-GEO-LOC-MSAX-RUR
    private CobolString p_new_rural1 = new CobolString(2);
    private CobolString p_new_geo_rural2 = new CobolString(2);
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
    private CobolString p_new_pps_blend_yr_ind = new CobolString(1);
    private int p_new_prup_update_factor = 0;
    private BigDecimal p_new_dsh_percent = BigDecimal.ZERO;
    private int p_new_fye_date = 0;
    private CobolString p_new_cbsa_data = new CobolString(1); // Group: P-NEW-CBSA-DATA
    private CobolString w_p_new_cbsa_spec_pay_ind = new CobolString(1);
    private CobolString w_p_new_cbsa_hosp_qual_ind = new CobolString(1);
    private CobolString w_p_new_cbsa_geo_loc = new CobolString(5);
    private CobolString w_p_new_cbsa_geo_rural = new CobolString(1); // Group: W-P-NEW-CBSA-GEO-RURAL
    private CobolString w_p_new_cbsa_geo_rural1st = new CobolString(3);
    private CobolString w_p_new_cbsa_geo_rural2nd = new CobolString(2);
    private CobolString w_p_new_cbsa_reclass_loc = new CobolString(5);
    private CobolString w_p_new_cbsa_stand_amt_loc = new CobolString(5);
    private int w_p_new_cbsa_spec_wage_index = 0;
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
    private CobolString w_fy_begin_date = new CobolString(1); // Group: W-FY-BEGIN-DATE
    private int w_fy_begin_cc = 0;
    private int w_fy_begin_yy = 0;
    private int w_fy_begin_mm = 0;
    private int w_fy_begin_dd = 0;
    private CobolString w_fy_end_date = new CobolString(1); // Group: W-FY-END-DATE
    private int w_fy_end_cc = 0;
    private int w_fy_end_yy = 0;
    private int w_fy_end_mm = 0;
    private int w_fy_end_dd = 0;

    // LINKAGE SECTION
    private CobolString bill_315_data = new CobolString(1); // Group: BILL-315-DATA
    private CobolString bill_npi = new CobolString(10);
    private CobolString bill_prov_no = new CobolString(6);
    private CobolString bill_from_date = new CobolString(1); // Group: BILL-FROM-DATE
    private int bill_from_cc = 0;
    private int bill_from_yy = 0;
    private int bill_from_mm = 0;
    private int bill_from_dd = 0;
    private CobolString bill_admission_date = new CobolString(1); // Group: BILL-ADMISSION-DATE
    private int bill_adm_cc = 0;
    private int bill_adm_yy = 0;
    private int bill_adm_mm = 0;
    private int bill_adm_dd = 0;
    private CobolString bill_prov_msa_lugar = new CobolString(1); // Group: BILL-PROV-MSA-LUGAR
    private CobolString bill_prov_msa = new CobolString(4);
    private CobolString bill_prov_lugar = new CobolString(1);
    private CobolString bill_prov_cbsa = new CobolString(5);
    private CobolString bill_bene_msa_lugar = new CobolString(1); // Group: BILL-BENE-MSA-LUGAR
    private CobolString bill_bene_msa = new CobolString(4);
    private CobolString bill_bene_lugar = new CobolString(1);
    private CobolString bill_bene_cbsa = new CobolString(5);
    private int bill_prov_wage_index = 0;
    private int bill_bene_wage_index = 0;
    private CobolString bill_sia_add_on_units = new CobolString(1); // Group: BILL-SIA-ADD-ON-UNITS
    private int bill_na_add_on_day1_units = 0;
    private int bill_na_add_on_day2_units = 0;
    private int bill_eol_add_on_day1_units = 0;
    private int bill_eol_add_on_day2_units = 0;
    private int bill_eol_add_on_day3_units = 0;
    private int bill_eol_add_on_day4_units = 0;
    private int bill_eol_add_on_day5_units = 0;
    private int bill_eol_add_on_day6_units = 0;
    private int bill_eol_add_on_day7_units = 0;
    private CobolString bill_qip_ind = new CobolString(1);
    private CobolString bill_group1 = new CobolString(1); // Group: BILL-GROUP1
    private CobolString bill_rev1 = new CobolString(4);
    private CobolString bill_hcpc1 = new CobolString(5);
    private CobolString bill_line_item_dos1 = new CobolString(1); // Group: BILL-LINE-ITEM-DOS1
    private int bill_lidos1_cc = 0;
    private int bill_lidos1_yy = 0;
    private int bill_lidos1_mm = 0;
    private int bill_lidos1_dd = 0;
    private int bill_units1 = 0;
    private int bill_pay_amt1 = 0;
    private CobolString bill_group2 = new CobolString(1); // Group: BILL-GROUP2
    private CobolString bill_rev2 = new CobolString(4);
    private CobolString bill_hcpc2 = new CobolString(5);
    private CobolString bill_line_item_dos2 = new CobolString(1); // Group: BILL-LINE-ITEM-DOS2
    private int bill_lidos2_cc = 0;
    private int bill_lidos2_yy = 0;
    private int bill_lidos2_mm = 0;
    private int bill_lidos2_dd = 0;
    private int bill_units2 = 0;
    private int bill_pay_amt2 = 0;
    private CobolString bill_group3 = new CobolString(1); // Group: BILL-GROUP3
    private CobolString bill_rev3 = new CobolString(4);
    private CobolString bill_hcpc3 = new CobolString(5);
    private CobolString bill_line_item_dos3 = new CobolString(1); // Group: BILL-LINE-ITEM-DOS3
    private int bill_lidos3_cc = 0;
    private int bill_lidos3_yy = 0;
    private int bill_lidos3_mm = 0;
    private int bill_lidos3_dd = 0;
    private int bill_units3 = 0;
    private int bill_pay_amt3 = 0;
    private CobolString bill_group4 = new CobolString(1); // Group: BILL-GROUP4
    private CobolString bill_rev4 = new CobolString(4);
    private CobolString bill_hcpc4 = new CobolString(5);
    private CobolString bill_line_item_dos4 = new CobolString(1); // Group: BILL-LINE-ITEM-DOS4
    private int bill_lidos4_cc = 0;
    private int bill_lidos4_yy = 0;
    private int bill_lidos4_mm = 0;
    private int bill_lidos4_dd = 0;
    private int bill_units4 = 0;
    private int bill_pay_amt4 = 0;
    private CobolString bill_sia_add_on_pymts = new CobolString(1); // Group: BILL-SIA-ADD-ON-PYMTS
    private int bill_na_add_on_day1_pay = 0;
    private int bill_na_add_on_day2_pay = 0;
    private int bill_eol_add_on_day1_pay = 0;
    private int bill_eol_add_on_day2_pay = 0;
    private int bill_eol_add_on_day3_pay = 0;
    private int bill_eol_add_on_day4_pay = 0;
    private int bill_eol_add_on_day5_pay = 0;
    private int bill_eol_add_on_day6_pay = 0;
    private int bill_eol_add_on_day7_pay = 0;
    private CobolString bill_returned_data = new CobolString(1); // Group: BILL-RETURNED-DATA
    private int bill_pay_amt_total = 0;
    private CobolString bill_rtc = new CobolString(2);
    private CobolString bill_rhc_days_paid = new CobolString(1); // Group: BILL-RHC-DAYS-PAID
    private int bill_high_rhc_days = 0;
    private int bill_low_rhc_days = 0;
    private CobolString prov_table = new CobolString(1); // Group: PROV-TABLE
    private CobolString[] prov_entries = new CobolString[2400]; // Group: PROV-ENTRIES
    private CobolString[] prov_data1 = new CobolString[2400]; // Group: PROV-DATA1
    private CobolString[] prov_npi10 = new CobolString[2400]; // Group: PROV-NPI10
    private CobolString[] prov_npi8 = new CobolString[2400];
    private CobolString[] prov_npi_fil = new CobolString[2400];
    private CobolString[] prov_no = new CobolString[2400];
    private CobolString[] prov_eff_date = new CobolString[2400];
    private CobolString prov_data_2 = new CobolString(1); // Group: PROV-DATA-2
    private CobolString[] prov_entries2 = new CobolString[2400]; // Group: PROV-ENTRIES2
    private CobolString[] prov_data2 = new CobolString[2400];
    private CobolString prov_data_3 = new CobolString(1); // Group: PROV-DATA-3
    private CobolString[] prov_entries3 = new CobolString[2400]; // Group: PROV-ENTRIES3
    private CobolString[] prov_data3 = new CobolString[2400];
    private CobolString msa_wi_table = new CobolString(1); // Group: MSA-WI-TABLE
    private CobolString[] m_msa_data = new CobolString[4000]; // Group: M-MSA-DATA
    private CobolString[] msa_msa_lugar = new CobolString[4000]; // Group: MSA-MSA-LUGAR
    private int[] msa_msa = new int[4000];
    private CobolString[] msa_lugar = new CobolString[4000];
    private CobolString[] msa_effdte = new CobolString[4000];
    private BigDecimal[] msa_wage_ind = new BigDecimal[4000];
    private CobolString cbsa_wi_table = new CobolString(1); // Group: CBSA-WI-TABLE
    private CobolString[] m_cbsa_data = new CobolString[9000]; // Group: M-CBSA-DATA
    private int[] m_cbsa = new int[9000];
    private CobolString[] m_cbsa_effdte = new CobolString[9000];
    private BigDecimal[] m_cbsa_wage_ind = new BigDecimal[9000];


    private CobolString p_new_geo_rural1 = new CobolString(256); // fallback
    private CobolString w_p_new_cbsa_geo_rural1 = new CobolString(256); // fallback
    private CobolString thru = new CobolString(256); // fallback

    private void para_main() {
        _0200();
        /* RAW: - PROCESS-RECORDS THRU 0200 - */
        return;
    }

    private void process_records() {
        bill_returned_data.set(String.valueOf("0"));
        bill_pay_amt1 = new BigDecimal(String.valueOf("0").trim()).intValue();
        bill_pay_amt2 = new BigDecimal(String.valueOf("0").trim()).intValue();
        bill_pay_amt3 = new BigDecimal(String.valueOf("0").trim()).intValue();
        bill_pay_amt4 = new BigDecimal(String.valueOf("0").trim()).intValue();
    }

    private void bill_sia_add_on_pymts() {
        w_fy_begin_cc = 0;
        w_fy_begin_yy = 0;
        w_fy_end_cc = 0;
    }

    private void w_fy_end_yy() {
    }

    private void w_fy_begin_cc() {
    }

    private void w_fy_end_cc() {
        if ((bill_from_mm >= 1 && bill_from_mm <= 9)) {
            w_fy_begin_yy = new BigDecimal(String.valueOf((bill_from_yy - 1)).trim()).intValue();
            w_fy_end_yy = new BigDecimal(String.valueOf(bill_from_yy).trim()).intValue();
        } else {
            w_fy_begin_yy = new BigDecimal(String.valueOf(bill_from_yy).trim()).intValue();
            w_fy_end_yy = new BigDecimal(String.valueOf((bill_from_yy + 1)).trim()).intValue();
        }
        if (eof_bill_sw == 0) {
            bill_ctr = new BigDecimal(String.valueOf(bill_ctr + 1).trim()).intValue();
            _0300();
            /* RAW: - PROCESS-DATA THRU 0300 - */
            return;
        }
        /* RAW: 0200 - */
        return;
    }

    private void process_data() {
        _0700();
        /* RAW: - GET-PROVIDER THRU 0700 - */
        return;
    }

    private void get_msa() {
        if (!String.valueOf(p_new_geo_rural1).trim().isEmpty()) {
            search_msa_pos12 = new BigDecimal(String.valueOf("99").trim()).intValue();
            search_msa_pos34 = new BigDecimal(String.valueOf(p_new_geo_rural2).trim()).intValue();
        } else {
            /* RAW: SEARCH-MSA  */
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) < 19991001) {
            search_lugar.set(String.valueOf(p_new_lugar));
        } else {
            /* RAW: SEARCH-LUGAR  */
        }
    }

    private void bill_prov_msa() {
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) < 19991001) {
            bill_prov_lugar.set(String.valueOf(p_new_lugar));
        } else {
            /* RAW: BILL-PROV-LUGAR  */
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) < 19991001) {
            search_lugar.set(String.valueOf(p_new_lugar));
        } else {
            /* RAW: SEARCH-LUGAR  */
        }
    }

    private void bill_prov_msa_2() {
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) < 19991001) {
            bill_prov_lugar.set(String.valueOf(p_new_lugar));
        } else {
            /* RAW: BILL-PROV-LUGAR  */
        }
        _0400();
        /* RAW: - SEARCH-4-MSA THRU 0400 - */
    }

    private void search_exit() {
        if (String.valueOf(bill_rtc).equals(String.valueOf(0))) {
            _0500();
            /* RAW: - GET-HOSP-WAGE-INDEX THRU 0500 - */
            return;
        } else {
            bill_prov_wage_index = new BigDecimal(String.valueOf(0).trim()).intValue();
            bill_bene_wage_index = new BigDecimal(String.valueOf(0).trim()).intValue();
            _0350();
            return;
        }
    // if ((!CobolIntrinsics.isNumeric(bill_prov_wage_index) || String.valueOf(bill_prov_wage_index).equals(String.valueOf(0)))) {
    // bill_rtc.set(String.valueOf("40"));
    // _0350();
    // return;
    // }
    }

    private void search_msa() {
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) < 19991001) {
            search_lugar.set(String.valueOf(bill_bene_lugar));
        } else {
            /* RAW: SEARCH-LUGAR  */
        }
        _0400();
        /* RAW: - SEARCH-4-MSA THRU 0400 - */
    }

    private void search_exit_2() {
        if (String.valueOf(bill_rtc).equals(String.valueOf(0))) {
            _0550();
            /* RAW: - GET-BENE-WAGE-INDEX THRU 0550 - */
            return;
        } else {
            bill_prov_wage_index = new BigDecimal(String.valueOf(0).trim()).intValue();
            bill_bene_wage_index = new BigDecimal(String.valueOf(0).trim()).intValue();
            _0350();
            return;
        }
    // if ((!CobolIntrinsics.isNumeric(bill_bene_wage_index) || String.valueOf(bill_bene_wage_index).equals(String.valueOf(0)))) {
    // bill_rtc.set(String.valueOf("50"));
    // _0350();
    // return;
    // }
    // /* RAW: 0350 - */
    // return;
    }

    private void get_cbsa() {
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) < 20080101) {
            if (!String.valueOf(w_p_new_cbsa_geo_rural1).trim().isEmpty()) {
                search_cbsa_pos123 = new BigDecimal(String.valueOf("999").trim()).intValue();
                search_cbsa_pos45 = new BigDecimal(String.valueOf(w_p_new_cbsa_geo_rural2nd).trim()).intValue();
            } else {
                search_cbsa.set(String.valueOf(w_p_new_cbsa_geo_loc));
                bill_prov_cbsa.set(String.valueOf(w_p_new_cbsa_geo_loc));
            }
        } else {
            /* RAW: SEARCH-CBSA  */
        }
        _0450();
        /* RAW: - SEARCH-4-CBSA THRU 0450 - */
    }

    private void search_exit_3() {
        if (String.valueOf(bill_rtc).equals(String.valueOf(0))) {
            _0525();
            /* RAW: - GET-HOSP-WAGE-INDEX THRU 0525 - */
            return;
        } else {
            bill_prov_wage_index = new BigDecimal(String.valueOf(0).trim()).intValue();
            bill_bene_wage_index = new BigDecimal(String.valueOf(0).trim()).intValue();
            _0375();
            return;
        }
    // if ((!CobolIntrinsics.isNumeric(bill_prov_wage_index) || String.valueOf(bill_prov_wage_index).equals(String.valueOf(0)))) {
    // bill_rtc.set(String.valueOf("40"));
    // _0375();
    // return;
    // }
    }

    private void search_cbsa() {
        _0450();
        /* RAW: - SEARCH-4-CBSA THRU 0450 - */
    }

    private void search_exit_4() {
        if (String.valueOf(bill_rtc).equals(String.valueOf(0))) {
            _0575();
            /* RAW: - GET-BENE-WAGE-INDEX THRU 0575 - */
            return;
        } else {
            bill_prov_wage_index = new BigDecimal(String.valueOf(0).trim()).intValue();
            bill_bene_wage_index = new BigDecimal(String.valueOf(0).trim()).intValue();
            _0375();
            return;
        }
    // if ((!CobolIntrinsics.isNumeric(bill_bene_wage_index) || String.valueOf(bill_bene_wage_index).equals(String.valueOf(0)))) {
    // bill_rtc.set(String.valueOf("50"));
    // _0375();
    // return;
    // }
    // _1000();
    // /* RAW: -  */
    // CobolProgram.call(String.valueOf(thru));
    // /* RAW: 1000 - */
    // return;
    }

    private void search_4_msa() {
        mu1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH M-MSA-DATA */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < m_msa_data.length && !_found; _idx++) {
                if (String.valueOf(msa_msa_lugar[mu1 - 1]).equals(String.valueOf(search_msa_lugar))) {
                    mu2 = new BigDecimal(String.valueOf(mu1).trim()).intValue();
                    _found = true;
                }
            }
            if (!_found) {
                bill_rtc.set(String.valueOf(30));
            }
        }
        /* RAW: 0400 - */
    }

    private void search_exit_5() {
        return;
    }

    private void search_4_cbsa() {
        cu1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH M-CBSA-DATA */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < m_cbsa_data.length && !_found; _idx++) {
                if (String.valueOf(m_cbsa[cu1 - 1]).equals(String.valueOf(search_cbsa))) {
                    cu2 = new BigDecimal(String.valueOf(cu1).trim()).intValue();
                    _found = true;
                }
            }
            if (!_found) {
                bill_rtc.set(String.valueOf(30));
            }
        }
        /* RAW: 0450 - */
    }

    private void search_exit_6() {
        return;
    }

    private void get_hosp_wage_index() {
        if (String.valueOf(bill_from_date).compareTo(String.valueOf(msa_effdte[mu2 - 1])) >= 0) {
            /* RAW: BILL-PROV-WAGE-INDEX  */
        }
        /* RAW: 0500 - */
        return;
    }

    private void get_hosp_wage_index_2() {
        if ((String.valueOf(bill_from_date).compareTo(String.valueOf(m_cbsa_effdte[cu2 - 1])) >= 0 && (String.valueOf(m_cbsa_effdte[cu2 - 1]).compareTo(String.valueOf(w_fy_begin_date)) >= 0 && String.valueOf(m_cbsa_effdte[cu2 - 1]).compareTo(String.valueOf(w_fy_end_date)) <= 0))) {
            /* RAW: BILL-PROV-WAGE-INDEX  */
        }
        /* RAW: 0525 - */
        return;
    }

    private void get_bene_wage_index() {
        if (String.valueOf(bill_from_date).compareTo(String.valueOf(msa_effdte[mu2 - 1])) >= 0) {
            /* RAW: BILL-BENE-WAGE-INDEX  */
        }
        /* RAW: 0550 - */
        return;
    }

    private void get_bene_wage_index_2() {
        if ((String.valueOf(bill_from_date).compareTo(String.valueOf(m_cbsa_effdte[cu2 - 1])) >= 0 && (String.valueOf(m_cbsa_effdte[cu2 - 1]).compareTo(String.valueOf(w_fy_begin_date)) >= 0 && String.valueOf(m_cbsa_effdte[cu2 - 1]).compareTo(String.valueOf(w_fy_end_date)) <= 0))) {
            /* RAW: BILL-BENE-WAGE-INDEX  */
        }
        /* RAW: 0575 - */
        return;
    }

    private void get_provider() {
        if (!String.valueOf(bill_prov_no).equals(String.valueOf(p_new_provider_no))) {
            px2 = new BigDecimal(String.valueOf(1).trim()).intValue();
            /* SEARCH PROV-ENTRIES */
            {
                boolean _found = false;
                for (int _idx = 0; _idx < prov_entries.length && !_found; _idx++) {
                    if (String.valueOf(bill_prov_no).equals(String.valueOf(prov_no[px2 - 1]))) {
                        /* RAW: BILL-RTC  */
                        _found = true;
                    }
                }
                if (!_found) {
                    bill_rtc.set(String.valueOf(51));
                    _0700();
                    return;
                }
            }
        }
    }

    private void prov_newrec_hold1() {
        pd2 = new BigDecimal(String.valueOf(px2).trim()).intValue();
        pd3 = new BigDecimal(String.valueOf(px2).trim()).intValue();
    }

    private void prov_newrec_hold2() {
    }

    private void prov_newrec_hold3() {
        _0800();
        /* RAW: - GET-CURR-PROV THRU 0800 - */
        return;
    }

    private void get_curr_prov() {
        if (String.valueOf(bill_from_date).compareTo(String.valueOf(prov_eff_date[px3 - 1])) >= 0) {
            prov_newrec_hold1.set(String.valueOf(prov_data1[px3 - 1]));
            pd2 = new BigDecimal(String.valueOf(px3).trim()).intValue();
            pd3 = new BigDecimal(String.valueOf(px3).trim()).intValue();
            prov_newrec_hold2.set(String.valueOf(prov_data2[pd2 - 1]));
            /* RAW: PROV-NEWREC-HOLD3  */
        }
        /* RAW: 0800 - */
        return;
    }

    private void call() {
        CobolProgram.call(String.valueOf(hospr210));
    }

    private void bill_315_data() {
        /* RAW: 1000 - */
        return;
    }

    private void _0200() { /* stub — external/COPY */ }

    private void _0300() { /* stub — external/COPY */ }

    private void _0700() { /* stub — external/COPY */ }

    private void _0375() { /* stub — external/COPY */ }

    private void _0350() { /* stub — external/COPY */ }

    private void _0400() { /* stub — external/COPY */ }

    private void _0500() { /* stub — external/COPY */ }

    private void _0550() { /* stub — external/COPY */ }

    private void _0450() { /* stub — external/COPY */ }

    private void _0525() { /* stub — external/COPY */ }

    private void _0575() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _0800() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Hosdr210().run();
    }
}
