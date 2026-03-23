package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hospr210 extends CobolProgram {
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
    private CobolString hos_version = new CobolString(9);
    private int wrk_pay_rate1 = 0;
    private int wrk_pay_rate2 = 0;
    private int wrk_pay_rate3 = 0;
    private int wrk_pay_rate4 = 0;

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


    private CobolString thru = new CobolString(256); // fallback
    private CobolString _1000 = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString rhc_logic_flags = new CobolString(256); // fallback
    private CobolString rhc_logic_values = new CobolString(256); // fallback
    private CobolString rhc_ls_rate = new CobolString(256); // fallback
    private CobolString rhc_nls_rate = new CobolString(256); // fallback
    private CobolString chc_ls_rate = new CobolString(256); // fallback
    private CobolString chc_nls_rate = new CobolString(256); // fallback
    private CobolString irc_ls_rate = new CobolString(256); // fallback
    private CobolString irc_nls_rate = new CobolString(256); // fallback
    private CobolString gic_ls_rate = new CobolString(256); // fallback
    private CobolString gic_nls_rate = new CobolString(256); // fallback
    private CobolString rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString chc_ls_rate_q = new CobolString(256); // fallback
    private CobolString chc_nls_rate_q = new CobolString(256); // fallback
    private CobolString irc_ls_rate_q = new CobolString(256); // fallback
    private CobolString irc_nls_rate_q = new CobolString(256); // fallback
    private CobolString gic_ls_rate_q = new CobolString(256); // fallback
    private CobolString gic_nls_rate_q = new CobolString(256); // fallback
    private CobolString sia_pay_amt_total = new CobolString(256); // fallback
    private CobolString prior_svc_days = new CobolString(256); // fallback
    private CobolString lr_bill_units1 = new CobolString(256); // fallback
    private CobolString high_rate_days_left = new CobolString(256); // fallback
    private CobolString hr_bill_units1 = new CobolString(256); // fallback
    private CobolString lr_bill_pay_amt1 = new CobolString(256); // fallback
    private CobolString v161_low_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v161_low_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v161_low_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v161_low_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString hr_bill_pay_amt1 = new CobolString(256); // fallback
    private CobolString v161_high_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v161_high_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v161_high_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v161_high_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString sia_units_ind = new CobolString(256); // fallback
    private CobolString sia_pymt_rate = new CobolString(256); // fallback
    private CobolString v161_chc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v161_chc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v161_chc_ls_rate = new CobolString(256); // fallback
    private CobolString v161_chc_nls_rate = new CobolString(256); // fallback
    private CobolString eol_units1 = new CobolString(256); // fallback
    private CobolString eol_hours1 = new CobolString(256); // fallback
    private CobolString eol_units2 = new CobolString(256); // fallback
    private CobolString eol_hours2 = new CobolString(256); // fallback
    private CobolString eol_units3 = new CobolString(256); // fallback
    private CobolString eol_hours3 = new CobolString(256); // fallback
    private CobolString eol_units4 = new CobolString(256); // fallback
    private CobolString eol_hours4 = new CobolString(256); // fallback
    private CobolString eol_units5 = new CobolString(256); // fallback
    private CobolString eol_hours5 = new CobolString(256); // fallback
    private CobolString eol_units6 = new CobolString(256); // fallback
    private CobolString eol_hours6 = new CobolString(256); // fallback
    private CobolString eol_units7 = new CobolString(256); // fallback
    private CobolString eol_hours7 = new CobolString(256); // fallback
    private CobolString rhc_high_day_ind = new CobolString(256); // fallback
    private CobolString rhc_low_day_ind = new CobolString(256); // fallback
    private CobolString date_calculation_fields = new CobolString(256); // fallback
    private CobolString date_2_dos = new CobolString(256); // fallback
    private CobolString v161_irc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v161_irc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v161_irc_ls_rate = new CobolString(256); // fallback
    private CobolString v161_irc_nls_rate = new CobolString(256); // fallback
    private CobolString v161_gic_ls_rate_q = new CobolString(256); // fallback
    private CobolString v161_gic_nls_rate_q = new CobolString(256); // fallback
    private CobolString v161_gic_ls_rate = new CobolString(256); // fallback
    private CobolString v161_gic_nls_rate = new CobolString(256); // fallback
    private CobolString date_1_adm_integer = new CobolString(256); // fallback
    private CobolString date_1_adm = new CobolString(256); // fallback
    private CobolString date_2_dos_integer = new CobolString(256); // fallback
    private CobolString days_between_dates = new CobolString(256); // fallback
    private CobolString prior_benefit_days = new CobolString(256); // fallback
    private CobolString v170_low_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v170_low_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v170_low_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v170_low_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v170_high_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v170_high_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v170_high_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v170_high_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v170_chc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v170_chc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v170_chc_ls_rate = new CobolString(256); // fallback
    private CobolString v170_chc_nls_rate = new CobolString(256); // fallback
    private CobolString v170_irc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v170_irc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v170_irc_ls_rate = new CobolString(256); // fallback
    private CobolString v170_irc_nls_rate = new CobolString(256); // fallback
    private CobolString v170_gic_ls_rate_q = new CobolString(256); // fallback
    private CobolString v170_gic_nls_rate_q = new CobolString(256); // fallback
    private CobolString v170_gic_ls_rate = new CobolString(256); // fallback
    private CobolString v170_gic_nls_rate = new CobolString(256); // fallback
    private CobolString v180_low_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v180_low_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v180_low_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v180_low_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v180_high_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v180_high_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v180_high_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v180_high_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v180_chc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v180_chc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v180_chc_ls_rate = new CobolString(256); // fallback
    private CobolString v180_chc_nls_rate = new CobolString(256); // fallback
    private CobolString v180_irc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v180_irc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v180_irc_ls_rate = new CobolString(256); // fallback
    private CobolString v180_irc_nls_rate = new CobolString(256); // fallback
    private CobolString v180_gic_ls_rate_q = new CobolString(256); // fallback
    private CobolString v180_gic_nls_rate_q = new CobolString(256); // fallback
    private CobolString v180_gic_ls_rate = new CobolString(256); // fallback
    private CobolString v180_gic_nls_rate = new CobolString(256); // fallback
    private CobolString v190_low_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v190_low_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v190_low_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v190_low_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v190_high_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v190_high_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v190_high_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v190_high_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v190_chc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v190_chc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v190_chc_ls_rate = new CobolString(256); // fallback
    private CobolString v190_chc_nls_rate = new CobolString(256); // fallback
    private CobolString v190_irc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v190_irc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v190_irc_ls_rate = new CobolString(256); // fallback
    private CobolString v190_irc_nls_rate = new CobolString(256); // fallback
    private CobolString v190_gic_ls_rate_q = new CobolString(256); // fallback
    private CobolString v190_gic_nls_rate_q = new CobolString(256); // fallback
    private CobolString v190_gic_ls_rate = new CobolString(256); // fallback
    private CobolString v190_gic_nls_rate = new CobolString(256); // fallback
    private CobolString v200_low_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v200_low_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v200_low_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v200_low_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v200_high_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v200_high_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v200_high_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v200_high_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v200_chc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v200_chc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v200_chc_ls_rate = new CobolString(256); // fallback
    private CobolString v200_chc_nls_rate = new CobolString(256); // fallback
    private CobolString v200_irc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v200_irc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v200_irc_ls_rate = new CobolString(256); // fallback
    private CobolString v200_irc_nls_rate = new CobolString(256); // fallback
    private CobolString v200_gic_ls_rate_q = new CobolString(256); // fallback
    private CobolString v200_gic_nls_rate_q = new CobolString(256); // fallback
    private CobolString v200_gic_ls_rate = new CobolString(256); // fallback
    private CobolString v200_gic_nls_rate = new CobolString(256); // fallback
    private CobolString v210_low_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v210_low_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v210_low_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v210_low_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v210_high_rhc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v210_high_rhc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v210_high_rhc_ls_rate = new CobolString(256); // fallback
    private CobolString v210_high_rhc_nls_rate = new CobolString(256); // fallback
    private CobolString v210_chc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v210_chc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v210_chc_ls_rate = new CobolString(256); // fallback
    private CobolString v210_chc_nls_rate = new CobolString(256); // fallback
    private CobolString v210_irc_ls_rate_q = new CobolString(256); // fallback
    private CobolString v210_irc_nls_rate_q = new CobolString(256); // fallback
    private CobolString v210_irc_ls_rate = new CobolString(256); // fallback
    private CobolString v210_irc_nls_rate = new CobolString(256); // fallback
    private CobolString v210_gic_ls_rate_q = new CobolString(256); // fallback
    private CobolString v210_gic_nls_rate_q = new CobolString(256); // fallback
    private CobolString v210_gic_ls_rate = new CobolString(256); // fallback
    private CobolString v210_gic_nls_rate = new CobolString(256); // fallback

    private void para_main() {
        _1000();
        /* RAW: -  */
        thru.set("");
        _1000.set("");
        _unnamed.set("");
    }

    private void initialize_exit() {
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20200930) {
            _2021();
            /* RAW: - V210-PROCESS-DATA THRU 2021 - V210-PROCESS-EXIT */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20190930) {
            _2020();
            /* RAW: - V200-PROCESS-DATA THRU 2020 - V200-PROCESS-EXIT */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20180930) {
            _2019();
            /* RAW: - V190-PROCESS-DATA THRU 2019 - V190-PROCESS-EXIT */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20170930) {
            _2018();
            /* RAW: - V180-PROCESS-DATA THRU 2018 - V180-PROCESS-EXIT */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20160930) {
            _2017();
            /* RAW: - V170-PROCESS-DATA THRU 2017 - V170-PROCESS-EXIT */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20151231) {
            _2016();
            /* RAW: - V161-PROCESS-DATA THRU 2016 - V161-PROCESS-EXIT */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20150930) {
            _2016();
            /* RAW: - PROCESS-DATA THRU 2016 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20140930) {
            _2015();
            /* RAW: - PROCESS-DATA THRU 2015 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20130930) {
            _2014();
            /* RAW: - PROCESS-DATA THRU 2014 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20120930) {
            _2013();
            /* RAW: - PROCESS-DATA THRU 2013 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20110930) {
            _2012();
            /* RAW: - PROCESS-DATA THRU 2012 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20100930) {
            _2011();
            /* RAW: - PROCESS-DATA THRU 2011 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20090930) {
            _2010();
            /* RAW: - PROCESS-DATA THRU 2010 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20080930) {
            _2009();
            /* RAW: - PROCESS-DATA THRU 2009 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20070930) {
            _2008();
            /* RAW: - PROCESS-DATA THRU 2008 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20061231) {
            _2007();
            /* RAW: - 1 - PROCESS-DATA THRU 2007 */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20060930) {
            _2007();
            /* RAW: - PROCESS-DATA THRU 2007 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20050930) {
            _2006();
            /* RAW: - PROCESS-DATA THRU 2006 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20040930) {
            _2005();
            /* RAW: - PROCESS-DATA THRU 2005 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20030930) {
            _2004();
            /* RAW: - PROCESS-DATA THRU 2004 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20020930) {
            _2003();
            /* RAW: - PROCESS-DATA THRU 2003 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20010930) {
            _2002();
            /* RAW: - PROCESS-DATA THRU 2002 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20010331) {
            _2001();
            /* RAW: A-PROCESS-DATA THRU 2001 A-EXIT */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 20000930) {
            _2001();
            /* RAW: - PROCESS-DATA THRU 2001 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 19990930) {
            _2000();
            /* RAW: - PROCESS-DATA THRU 2000 - */
            return;
        }
        if (Integer.parseInt(String.valueOf(bill_from_date).trim()) > 19980930) {
            _1999();
            /* RAW: - PROCESS-DATA THRU 1999 - */
            return;
        }
        _1998();
        /* RAW: - PROCESS-DATA THRU 1998 - */
        return;
    }

    private void initialize() {
        bill_returned_data.set(String.valueOf("0"));
        bill_rhc_days_paid.set(String.valueOf("0"));
        bill_pay_amt1 = new BigDecimal(String.valueOf("0").trim()).intValue();
        bill_pay_amt2 = new BigDecimal(String.valueOf("0").trim()).intValue();
        bill_pay_amt3 = new BigDecimal(String.valueOf("0").trim()).intValue();
        bill_pay_amt4 = new BigDecimal(String.valueOf("0").trim()).intValue();
    }

    private void bill_sia_add_on_pymts() {
        rhc_logic_flags.set("");
        rhc_logic_values.set("");
    }

    private void date_calculation_fields() {
        /* RAW: 1000 - */
    }

    private void initialize_exit_2() {
        return;
    }

    private void process_data() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _1998();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _1998();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((65.8 * bill_bene_wage_index)) + 29.97)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((384.08 * bill_bene_wage_index)) + 174.91)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((53.63 * bill_prov_wage_index)) + 45.44)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((272.71 * bill_prov_wage_index)) + 153.34)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1() {
    }

    private void bill_pay_amt2() {
    }

    private void bill_pay_amt3() {
    }

    private void bill_pay_amt4() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4() {
        /* RAW: 1998 - */
        return;
    }

    private void process_data_2() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _1999();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _1999();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((66.72 * bill_bene_wage_index)) + 30.39)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((389.46 * bill_bene_wage_index)) + 177.36)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((54.38 * bill_prov_wage_index)) + 46.08)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((276.53 * bill_prov_wage_index)) + 155.48)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_2() {
    }

    private void bill_pay_amt2_2() {
    }

    private void bill_pay_amt3_2() {
    }

    private void bill_pay_amt4_2() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_2() {
        /* RAW: 1999 - */
        return;
    }

    private void process_data_3() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2000();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2000();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((68 * bill_bene_wage_index)) + 30.96)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((396.86 * bill_bene_wage_index)) + 180.73)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((55.41 * bill_prov_wage_index)) + 46.96)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((281.78 * bill_prov_wage_index)) + 158.44)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_3() {
    }

    private void bill_pay_amt2_3() {
    }

    private void bill_pay_amt3_3() {
    }

    private void bill_pay_amt4_3() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_3() {
        /* RAW: 2000 - */
        return;
    }

    private void process_data_4() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2001();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2001();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((69.97 * bill_bene_wage_index)) + 31.87)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((408.42 * bill_bene_wage_index)) + 185.99)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((57.03 * bill_prov_wage_index)) + 48.32)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((289.99 * bill_prov_wage_index)) + 163.05)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_4() {
    }

    private void bill_pay_amt2_4() {
    }

    private void bill_pay_amt3_4() {
    }

    private void bill_pay_amt4_4() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_4() {
        /* RAW: 2001 - */
        return;
    }

    private void a_process_data() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2001();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2001();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((73.47 * bill_bene_wage_index)) + 33.46)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((428.84 * bill_bene_wage_index)) + 195.29)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((59.88 * bill_prov_wage_index)) + 50.74)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((304.49 * bill_prov_wage_index)) + 171.2)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_5() {
    }

    private void bill_pay_amt2_5() {
    }

    private void bill_pay_amt3_5() {
    }

    private void bill_pay_amt4_5() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_5() {
        /* RAW: 2001  */
    }

    private void a_exit() {
        return;
    }

    private void process_data_5() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2002();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2002();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((75.87 * bill_bene_wage_index)) + 34.55)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((442.8 * bill_bene_wage_index)) + 201.65)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((61.83 * bill_prov_wage_index)) + 52.39)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((314.41 * bill_prov_wage_index)) + 176.78)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_6() {
    }

    private void bill_pay_amt2_6() {
    }

    private void bill_pay_amt3_6() {
    }

    private void bill_pay_amt4_6() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_6() {
        /* RAW: 2002 - */
        return;
    }

    private void process_data_6() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2003();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2003();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((78.47 * bill_bene_wage_index)) + 35.73)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((457.97 * bill_bene_wage_index)) + 208.55)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((63.94 * bill_prov_wage_index)) + 54.19)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((325.18 * bill_prov_wage_index)) + 182.83)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_7() {
    }

    private void bill_pay_amt2_7() {
    }

    private void bill_pay_amt3_7() {
    }

    private void bill_pay_amt4_7() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_7() {
        /* RAW: 2003 - */
        return;
    }

    private void process_data_7() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2004();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2004();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((81.13 * bill_bene_wage_index)) + 36.95)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((473.54 * bill_bene_wage_index)) + 215.64)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((66.12 * bill_prov_wage_index)) + 56.03)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((336.23 * bill_prov_wage_index)) + 189.05)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_8() {
    }

    private void bill_pay_amt2_8() {
    }

    private void bill_pay_amt3_8() {
    }

    private void bill_pay_amt4_8() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_8() {
        /* RAW: 2004 - */
        return;
    }

    private void process_data_8() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2005();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2005();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((83.81 * bill_bene_wage_index)) + 38.17)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((489.16 * bill_bene_wage_index)) + 222.76)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((68.3 * bill_prov_wage_index)) + 57.88)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((347.32 * bill_prov_wage_index)) + 195.29)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_9() {
    }

    private void bill_pay_amt2_9() {
    }

    private void bill_pay_amt3_9() {
    }

    private void bill_pay_amt4_9() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_9() {
        /* RAW: 2005 - */
        return;
    }

    private void process_data_9() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2006();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2006();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((86.91 * bill_bene_wage_index)) + 39.58)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((507.26 * bill_bene_wage_index)) + 231)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((70.83 * bill_prov_wage_index)) + 60.02)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((360.18 * bill_prov_wage_index)) + 202.51)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_10() {
    }

    private void bill_pay_amt2_10() {
    }

    private void bill_pay_amt3_10() {
    }

    private void bill_pay_amt4_10() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_10() {
        /* RAW: 2006 - */
        return;
    }

    private void process_data_10() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2007();
            return;
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 < 8) {
                bill_rtc.set(String.valueOf("20"));
                _2007();
                return;
            }
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((89.87 * bill_bene_wage_index)) + 40.92)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((524.5 * bill_bene_wage_index)) + 238.86)) / 24)) * bill_units2)).trim()).intValue();
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((73.24 * bill_prov_wage_index)) + 62.06)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((372.42 * bill_prov_wage_index)) + 209.4)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_11() {
    }

    private void bill_pay_amt2_11() {
    }

    private void bill_pay_amt3_11() {
    }

    private void bill_pay_amt4_11() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_11() {
        /* RAW: 2007 - */
        return;
    }

    private void process_data_11() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2007();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((89.87 * bill_bene_wage_index)) + 40.92)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((89.87 * bill_bene_wage_index)) + 40.92))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((524.5 * bill_bene_wage_index)) + 238.86)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((73.24 * bill_prov_wage_index)) + 62.06)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((372.42 * bill_prov_wage_index)) + 209.4)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_12() {
    }

    private void bill_pay_amt2_12() {
    }

    private void bill_pay_amt3_12() {
    }

    private void bill_pay_amt4_12() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_12() {
        /* RAW: 2007 - 1 - */
        return;
    }

    private void process_data_12() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2008();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((92.83 * bill_bene_wage_index)) + 42.28)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((92.83 * bill_bene_wage_index)) + 42.28))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((541.81 * bill_bene_wage_index)) + 246.74)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((75.65 * bill_prov_wage_index)) + 64.11)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((384.71 * bill_prov_wage_index)) + 216.31)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_13() {
    }

    private void bill_pay_amt2_13() {
    }

    private void bill_pay_amt3_13() {
    }

    private void bill_pay_amt4_13() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_13() {
        /* RAW: 2008 - */
        return;
    }

    private void process_data_13() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2009();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((96.17 * bill_bene_wage_index)) + 43.8)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((96.17 * bill_bene_wage_index)) + 43.8))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((561.32 * bill_bene_wage_index)) + 255.62)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((78.37 * bill_prov_wage_index)) + 66.42)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((398.56 * bill_prov_wage_index)) + 224.1)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_14() {
    }

    private void bill_pay_amt2_14() {
    }

    private void bill_pay_amt3_14() {
    }

    private void bill_pay_amt4_14() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_14() {
        /* RAW: 2009 - */
        return;
    }

    private void process_data_14() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2010();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((98.19 * bill_bene_wage_index)) + 44.72)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((98.19 * bill_bene_wage_index)) + 44.72))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((573.11 * bill_bene_wage_index)) + 260.99)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((80.02 * bill_prov_wage_index)) + 67.81)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((406.94 * bill_prov_wage_index)) + 228.8)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_15() {
    }

    private void bill_pay_amt2_15() {
    }

    private void bill_pay_amt3_15() {
    }

    private void bill_pay_amt4_15() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_15() {
        /* RAW: 2010 - */
        return;
    }

    private void process_data_15() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2011();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((100.75 * bill_bene_wage_index)) + 45.88)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((100.75 * bill_bene_wage_index)) + 45.88))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((588.01 * bill_bene_wage_index)) + 267.78)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((82.1 * bill_prov_wage_index)) + 69.57)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((417.52 * bill_prov_wage_index)) + 234.75)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_16() {
    }

    private void bill_pay_amt2_16() {
    }

    private void bill_pay_amt3_16() {
    }

    private void bill_pay_amt4_16() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_16() {
        /* RAW: 2011 - */
        return;
    }

    private void process_data_16() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2012();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((103.77 * bill_bene_wage_index)) + 47.26)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((103.77 * bill_bene_wage_index)) + 47.26))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((605.65 * bill_bene_wage_index)) + 275.81)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((84.56 * bill_prov_wage_index)) + 71.66)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((430.04 * bill_prov_wage_index)) + 241.8)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_17() {
    }

    private void bill_pay_amt2_17() {
    }

    private void bill_pay_amt3_17() {
    }

    private void bill_pay_amt4_17() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_17() {
        /* RAW: 2012 - */
        return;
    }

    private void process_data_17() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2013();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((105.44 * bill_bene_wage_index)) + 48.01)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((105.44 * bill_bene_wage_index)) + 48.01))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((615.34 * bill_bene_wage_index)) + 280.22)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((85.92 * bill_prov_wage_index)) + 72.8)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((436.93 * bill_prov_wage_index)) + 245.66)) * bill_units4)).trim()).intValue();
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_18() {
    }

    private void bill_pay_amt2_18() {
    }

    private void bill_pay_amt3_18() {
    }

    private void bill_pay_amt4_18() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_18() {
        /* RAW: 2013 - */
        return;
    }

    private void process_data_18() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2014();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            _2014();
            /* RAW: - APPLY-QIP THRU 2014 - QIP-EXIT */
        } else {
            _2014();
            /* RAW: - APPLY-NO-QIP THRU 2014 - */
            /* RAW: NO-QIP-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_19() {
    }

    private void bill_pay_amt2_19() {
    }

    private void bill_pay_amt3_19() {
    }

    private void bill_pay_amt4_19() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_19() {
        /* RAW: 2014 - */
        return;
    }

    private void apply_no_qip() {
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((107.23 * bill_bene_wage_index)) + 48.83)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((107.23 * bill_bene_wage_index)) + 48.83))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((625.8 * bill_bene_wage_index)) + 284.98)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((87.38 * bill_prov_wage_index)) + 74.04)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((444.35 * bill_prov_wage_index)) + 249.84)) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2014 - */
    }

    private void no_qip_exit() {
        return;
    }

    private void apply_qip() {
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((105.12 * bill_bene_wage_index)) + 47.87)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((105.12 * bill_bene_wage_index)) + 47.87))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((613.49 * bill_bene_wage_index)) + 279.38)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((85.66 * bill_prov_wage_index)) + 72.58)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((435.61 * bill_prov_wage_index)) + 244.93)) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2014 - */
    }

    private void qip_exit() {
        return;
    }

    private void process_data_19() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2015();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            _2015();
            /* RAW: - APPLY-QIP THRU 2015 - QIP-EXIT */
        } else {
            _2015();
            /* RAW: - APPLY-NO-QIP THRU 2015 - */
            /* RAW: NO-QIP-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_20() {
    }

    private void bill_pay_amt2_20() {
    }

    private void bill_pay_amt3_20() {
    }

    private void bill_pay_amt4_20() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_20() {
        /* RAW: 2015 - */
        return;
    }

    private void apply_no_qip_2() {
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((109.48 * bill_bene_wage_index)) + 49.86)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((109.48 * bill_bene_wage_index)) + 49.86))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((638.94 * bill_bene_wage_index)) + 290.97)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((89.21 * bill_prov_wage_index)) + 75.6)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((453.68 * bill_prov_wage_index)) + 255.09)) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2015 - */
    }

    private void no_qip_exit_2() {
        return;
    }

    private void apply_qip_2() {
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf((((((107.34 * bill_bene_wage_index)) + 48.88)) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((107.34 * bill_bene_wage_index)) + 48.88))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((((626.42 * bill_bene_wage_index)) + 285.27)) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf((((((87.46 * bill_prov_wage_index)) + 74.12)) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf((((((444.79 * bill_prov_wage_index)) + 250.09)) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2015 - */
    }

    private void qip_exit_2() {
        return;
    }

    private void process_data_20() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2016();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            _2016();
            /* RAW: - APPLY-QIP THRU 2016 - QIP-EXIT */
        } else {
            _2016();
            /* RAW: - APPLY-NO-QIP THRU 2016 - */
            /* RAW: NO-QIP-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4)).trim()).intValue();
    }

    private void bill_pay_amt1_21() {
    }

    private void bill_pay_amt2_21() {
    }

    private void bill_pay_amt3_21() {
    }

    private void bill_pay_amt4_21() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_21() {
        /* RAW: 2016 - */
        return;
    }

    private void apply_no_qip_3() {
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(rhc_nls_rate).trim()))) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2016 - (Integer.parseInt(String.valueOf(rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(rhc_nls_rate).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2016 - (Integer.parseInt(String.valueOf(chc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(chc_nls_rate).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(irc_ls_rate).trim()) * bill_prov_wage_index))) + 2016) - Integer.parseInt(String.valueOf(irc_nls_rate).trim()))) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(gic_ls_rate).trim()) * bill_prov_wage_index))) + 2016) - Integer.parseInt(String.valueOf(gic_nls_rate).trim()))) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2016 - */
    }

    private void no_qip_exit_3() {
        return;
    }

    private void apply_qip_3() {
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            wrk_pay_rate1 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(rhc_nls_rate_q).trim()))) * bill_units1)).trim()).intValue();
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            if (bill_units2 > 0) {
                if (bill_units2 < 32) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2016 - (Integer.parseInt(String.valueOf(rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(rhc_nls_rate_q).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2016 - (Integer.parseInt(String.valueOf(chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(chc_nls_rate_q).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
                }
            }
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(irc_ls_rate_q).trim()) * bill_prov_wage_index))) + 2016) - Integer.parseInt(String.valueOf(irc_nls_rate_q).trim()))) * bill_units3)).trim()).intValue();
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(gic_ls_rate_q).trim()) * bill_prov_wage_index))) + 2016) - Integer.parseInt(String.valueOf(gic_nls_rate_q).trim()))) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2016 - */
    }

    private void qip_exit_3() {
        return;
    }

    private void v161_process_data() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2016();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            _2016();
            /* RAW: - V161-RHC-0651 THRU 2016 - */
            /* RAW: V161-RHC-0651-EXIT  */
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            _2020();
            /* RAW: - V200-CHC-0652 THRU 2020 - */
            /* RAW: V200-CHC-0652-EXIT  */
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            _2020();
            /* RAW: - V200-IRC-0655 THRU 2020 - */
            /* RAW: V200-IRC-0655-EXIT  */
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            _2020();
            /* RAW: - V200-GIC-0656 THRU 2020 - */
            /* RAW: V200-GIC-0656-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf(((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4) + Integer.parseInt(String.valueOf(sia_pay_amt_total).trim()))).trim()).intValue();
    }

    private void bill_pay_amt1_22() {
    }

    private void bill_pay_amt2_22() {
    }

    private void bill_pay_amt3_22() {
    }

    private void bill_pay_amt4_22() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_22() {
        /* RAW: 2016 - */
    }

    private void v161_process_exit() {
        return;
    }

    private void v161_rhc_0651() {
        if (bill_units1 <= 0) {
            _2016();
            return;
        }
        if (String.valueOf(bill_line_item_dos1).compareTo(String.valueOf(bill_admission_date)) < 0) {
            _2016();
            return;
        }
    }

    private void date_2_dos() {
        v161_calc_prior_svc_days(); // THRU V161-CALC-PRIOR-SVC-DAYS-EXIT
        date_1_adm();
        v161_calc_prior_svc_days_exit();
        v161_eval_rhc_days(); // THRU V161-EVAL-RHC-DAYS-EXIT
        v161_eval_rhc_days_exit();
        v161_calc_rhc_eol_sia(); // THRU V161-CALC-RHC-EOL-SIA-EXIT
        v161_calc_rhc_eol_sia_exit();
        v161_sum_rhc_0651_rate(); // THRU V161-SUM-RHC-0651-RATE-EXIT
        v161_sum_rhc_0651_rate_exit();
        /* RAW: 2016 - */
    }

    private void v161_rhc_0651_exit() {
        return;
    }

    private void v161_eval_rhc_days() {
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) >= 60) {
            lr_bill_units1.set(String.valueOf(bill_units1));
            v161_apply_low_rhc_rate(); // THRU V161-APPLY-LOW-RHC-RATE-EXIT
            rhc_low_day_ind();
            v161_apply_low_rhc_rate_exit();
            v161_eval_rhc_days_exit();
            return;
        }
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
            high_rate_days_left.set(String.valueOf((60 - Integer.parseInt(String.valueOf(prior_svc_days).trim()))));
            if (bill_units1 <= Integer.parseInt(String.valueOf(high_rate_days_left).trim())) {
                hr_bill_units1.set(String.valueOf(bill_units1));
                v161_apply_high_rhc_rate(); // THRU V161-APPLY-HIGH-RHC-RATE-EXIT
                rhc_high_day_ind();
                v161_apply_high_rhc_rate_exit();
                v161_eval_rhc_days_exit();
                return;
            } else {
                hr_bill_units1.set(String.valueOf(high_rate_days_left));
                v161_apply_high_rhc_rate(); // THRU V161-APPLY-HIGH-RHC-RATE-EXIT
                rhc_high_day_ind();
                v161_apply_high_rhc_rate_exit();
                lr_bill_units1.set(String.valueOf((bill_units1 - Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
                v161_apply_low_rhc_rate(); // THRU V161-APPLY-LOW-RHC-RATE-EXIT
                rhc_low_day_ind();
                v161_apply_low_rhc_rate_exit();
            }
        }
    }

    private void v161_eval_rhc_days_exit() {
        return;
    }

    private void v161_apply_low_rhc_rate() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            lr_bill_pay_amt1.set(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(v161_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_low_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        } else {
            lr_bill_pay_amt1.set(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(v161_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_low_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        }
    }

    private void rhc_low_day_ind() {
    }

    private void v161_apply_low_rhc_rate_exit() {
        return;
    }

    private void v161_apply_high_rhc_rate() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            hr_bill_pay_amt1.set(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(v161_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_high_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        } else {
            hr_bill_pay_amt1.set(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(v161_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_high_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        }
    }

    private void rhc_high_day_ind() {
    }

    private void v161_apply_high_rhc_rate_exit() {
        return;
    }

    private void v161_calc_rhc_eol_sia() {
        if (((((((bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim()) || bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim()))) {
            sia_units_ind.set(String.valueOf("Y"));
        } else {
            sia_units_ind.set(String.valueOf("N"));
            v161_calc_rhc_eol_sia_exit();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            sia_pymt_rate.set(String.valueOf((((((((2016 - (Integer.parseInt(String.valueOf(v161_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_chc_nls_rate_q).trim()))) / 24))));
        } else {
            sia_pymt_rate.set(String.valueOf((((((((2016 - (Integer.parseInt(String.valueOf(v161_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_chc_nls_rate).trim()))) / 24))));
        }
        if (bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units1.set(String.valueOf(bill_eol_add_on_day1_units));
            if (Integer.parseInt(String.valueOf(eol_units1).trim()) >= 16) {
                eol_hours1.set(String.valueOf(4));
            } else {
                eol_hours1.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units1).trim()) / 4))));
            }
            bill_eol_add_on_day1_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours1).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units2.set(String.valueOf(bill_eol_add_on_day2_units));
            if (Integer.parseInt(String.valueOf(eol_units2).trim()) >= 16) {
                eol_hours2.set(String.valueOf(4));
            } else {
                eol_hours2.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units2).trim()) / 4))));
            }
            bill_eol_add_on_day2_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours2).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units3.set(String.valueOf(bill_eol_add_on_day3_units));
            if (Integer.parseInt(String.valueOf(eol_units3).trim()) >= 16) {
                eol_hours3.set(String.valueOf(4));
            } else {
                eol_hours3.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units3).trim()) / 4))));
            }
            bill_eol_add_on_day3_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours3).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units4.set(String.valueOf(bill_eol_add_on_day4_units));
            if (Integer.parseInt(String.valueOf(eol_units4).trim()) >= 16) {
                eol_hours4.set(String.valueOf(4));
            } else {
                eol_hours4.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units4).trim()) / 4))));
            }
            bill_eol_add_on_day4_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours4).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units5.set(String.valueOf(bill_eol_add_on_day5_units));
            if (Integer.parseInt(String.valueOf(eol_units5).trim()) >= 16) {
                eol_hours5.set(String.valueOf(4));
            } else {
                eol_hours5.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units5).trim()) / 4))));
            }
            bill_eol_add_on_day5_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours5).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units6.set(String.valueOf(bill_eol_add_on_day6_units));
            if (Integer.parseInt(String.valueOf(eol_units6).trim()) >= 16) {
                eol_hours6.set(String.valueOf(4));
            } else {
                eol_hours6.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units6).trim()) / 4))));
            }
            bill_eol_add_on_day6_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours6).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units7.set(String.valueOf(bill_eol_add_on_day7_units));
            if (Integer.parseInt(String.valueOf(eol_units7).trim()) >= 16) {
                eol_hours7.set(String.valueOf(4));
            } else {
                eol_hours7.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units7).trim()) / 4))));
            }
            bill_eol_add_on_day7_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours7).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        sia_pay_amt_total.set(String.valueOf(((((((bill_eol_add_on_day1_pay + bill_eol_add_on_day2_pay) + bill_eol_add_on_day3_pay) + bill_eol_add_on_day4_pay) + bill_eol_add_on_day5_pay) + bill_eol_add_on_day6_pay) + bill_eol_add_on_day7_pay)));
    }

    private void v161_calc_rhc_eol_sia_exit() {
        return;
    }

    private void v161_sum_rhc_0651_rate() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(hr_bill_pay_amt1).trim()) + Integer.parseInt(String.valueOf(lr_bill_pay_amt1).trim()))).trim()).intValue();
        if (String.valueOf(sia_units_ind).equals(String.valueOf("Y"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("77"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("74"));
                }
            }
        }
        if (String.valueOf(sia_units_ind).equals(String.valueOf("N"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("75"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("73"));
                }
            }
        }
    }

    private void v161_sum_rhc_0651_rate_exit() {
        return;
    }

    private void v161_chc_0652() {
        if (bill_units2 <= 0) {
            _2016();
            return;
        }
        if (bill_units2 < 32) {
            date_calculation_fields.set("");
            date_2_dos.set(String.valueOf(bill_line_item_dos2));
            v161_calc_prior_svc_days(); // THRU V161-CALC-PRIOR-SVC-DAYS-EXIT
            date_1_adm();
            v161_calc_prior_svc_days_exit();
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2016 - (Integer.parseInt(String.valueOf(v161_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_high_rhc_nls_rate_q).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2016 - (Integer.parseInt(String.valueOf(v161_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_low_rhc_nls_rate_q).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2016 - (Integer.parseInt(String.valueOf(v161_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_chc_nls_rate_q).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
            _2016();
            return;
        }
        if (!String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2016 - (Integer.parseInt(String.valueOf(v161_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_high_rhc_nls_rate).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2016 - (Integer.parseInt(String.valueOf(v161_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_low_rhc_nls_rate).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2016 - (Integer.parseInt(String.valueOf(v161_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_chc_nls_rate).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
        }
        /* RAW: 2016 - */
    }

    private void v161_chc_0652_exit() {
        return;
    }

    private void v161_irc_0655() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(v161_irc_ls_rate_q).trim()) * bill_prov_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_irc_nls_rate_q).trim()))) * bill_units3)).trim()).intValue();
        } else {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(v161_irc_ls_rate).trim()) * bill_prov_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_irc_nls_rate).trim()))) * bill_units3)).trim()).intValue();
        }
        /* RAW: 2016 - */
    }

    private void v161_irc_0655_exit() {
        return;
    }

    private void v161_gic_0656() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(v161_gic_ls_rate_q).trim()) * bill_prov_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_gic_nls_rate_q).trim()))) * bill_units4)).trim()).intValue();
        } else {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2016 - (Integer.parseInt(String.valueOf(v161_gic_ls_rate).trim()) * bill_prov_wage_index))) + 2016) - Integer.parseInt(String.valueOf(v161_gic_nls_rate).trim()))) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2016 - */
    }

    private void v161_gic_0656_exit() {
        return;
    }

    private void v161_calc_prior_svc_days() {
    }

    private void date_1_adm() {
    // date_1_adm_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_1_adm)));
    // date_2_dos_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_2_dos)));
        days_between_dates.set(String.valueOf((Integer.parseInt(String.valueOf(date_2_dos_integer).trim()) - Integer.parseInt(String.valueOf(date_1_adm_integer).trim()))));
        if (bill_na_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            prior_benefit_days.set(String.valueOf(bill_na_add_on_day1_units));
        } else {
            prior_benefit_days.set(String.valueOf(0));
        }
        prior_svc_days.set(String.valueOf((Integer.parseInt(String.valueOf(days_between_dates).trim()) + Integer.parseInt(String.valueOf(prior_benefit_days).trim()))));
    }

    private void v161_calc_prior_svc_days_exit() {
        return;
    }

    private void v170_process_data() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2017();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            _2017();
            /* RAW: - V170-RHC-0651 THRU 2017 - */
            /* RAW: V170-RHC-0651-EXIT  */
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            _2017();
            /* RAW: - V170-CHC-0652 THRU 2017 - */
            /* RAW: V170-CHC-0652-EXIT  */
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            _2017();
            /* RAW: - V170-IRC-0655 THRU 2017 - */
            /* RAW: V170-IRC-0655-EXIT  */
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            _2017();
            /* RAW: - V170-GIC-0656 THRU 2017 - */
            /* RAW: V170-GIC-0656-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf(((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4) + Integer.parseInt(String.valueOf(sia_pay_amt_total).trim()))).trim()).intValue();
    }

    private void bill_pay_amt1_23() {
    }

    private void bill_pay_amt2_23() {
    }

    private void bill_pay_amt3_23() {
    }

    private void bill_pay_amt4_23() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_23() {
        /* RAW: 2017 - */
    }

    private void v170_process_exit() {
        return;
    }

    private void v170_rhc_0651() {
        if (bill_units1 <= 0) {
            _2017();
            return;
        }
        if (String.valueOf(bill_line_item_dos1).compareTo(String.valueOf(bill_admission_date)) < 0) {
            _2017();
            return;
        }
    }

    private void date_2_dos_2() {
        v170_calc_prior_svc_days(); // THRU V170-CALC-PRIOR-SVC-DAYS-EXIT
        date_1_adm();
        v170_calc_prior_svc_days_exit();
        v170_eval_rhc_days(); // THRU V170-EVAL-RHC-DAYS-EXIT
        v170_eval_rhc_days_exit();
        v170_calc_rhc_eol_sia(); // THRU V170-CALC-RHC-EOL-SIA-EXIT
        v170_calc_rhc_eol_sia_exit();
        v170_sum_rhc_0651_rate(); // THRU V170-SUM-RHC-0651-RATE-EXIT
        v170_sum_rhc_0651_rate_exit();
        /* RAW: 2017 - */
    }

    private void v170_rhc_0651_exit() {
        return;
    }

    private void v170_eval_rhc_days() {
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) >= 60) {
            lr_bill_units1.set(String.valueOf(bill_units1));
            v170_apply_low_rhc_rate(); // THRU V170-APPLY-LOW-RHC-RATE-EXIT
            rhc_low_day_ind();
            v170_apply_low_rhc_rate_exit();
            v170_eval_rhc_days_exit();
            return;
        }
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
            high_rate_days_left.set(String.valueOf((60 - Integer.parseInt(String.valueOf(prior_svc_days).trim()))));
            if (bill_units1 <= Integer.parseInt(String.valueOf(high_rate_days_left).trim())) {
                hr_bill_units1.set(String.valueOf(bill_units1));
                v170_apply_high_rhc_rate(); // THRU V170-APPLY-HIGH-RHC-RATE-EXIT
                rhc_high_day_ind();
                v170_apply_high_rhc_rate_exit();
                v170_eval_rhc_days_exit();
                return;
            } else {
                hr_bill_units1.set(String.valueOf(high_rate_days_left));
                v170_apply_high_rhc_rate(); // THRU V170-APPLY-HIGH-RHC-RATE-EXIT
                rhc_high_day_ind();
                v170_apply_high_rhc_rate_exit();
                lr_bill_units1.set(String.valueOf((bill_units1 - Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
                v170_apply_low_rhc_rate(); // THRU V170-APPLY-LOW-RHC-RATE-EXIT
                rhc_low_day_ind();
                v170_apply_low_rhc_rate_exit();
            }
        }
    }

    private void v170_eval_rhc_days_exit() {
        return;
    }

    private void v170_apply_low_rhc_rate() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            lr_bill_pay_amt1.set(String.valueOf(((((((2017 - (Integer.parseInt(String.valueOf(v170_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_low_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        } else {
            lr_bill_pay_amt1.set(String.valueOf(((((((2017 - (Integer.parseInt(String.valueOf(v170_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_low_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        }
    }

    private void rhc_low_day_ind_2() {
    }

    private void v170_apply_low_rhc_rate_exit() {
        return;
    }

    private void v170_apply_high_rhc_rate() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            hr_bill_pay_amt1.set(String.valueOf(((((((2017 - (Integer.parseInt(String.valueOf(v170_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_high_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        } else {
            hr_bill_pay_amt1.set(String.valueOf(((((((2017 - (Integer.parseInt(String.valueOf(v170_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_high_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        }
    }

    private void rhc_high_day_ind_2() {
    }

    private void v170_apply_high_rhc_rate_exit() {
        return;
    }

    private void v170_calc_rhc_eol_sia() {
        if (((((((bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim()) || bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim()))) {
            sia_units_ind.set(String.valueOf("Y"));
        } else {
            sia_units_ind.set(String.valueOf("N"));
            v170_calc_rhc_eol_sia_exit();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            sia_pymt_rate.set(String.valueOf((((((((2017 - (Integer.parseInt(String.valueOf(v170_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_chc_nls_rate_q).trim()))) / 24))));
        } else {
            sia_pymt_rate.set(String.valueOf((((((((2017 - (Integer.parseInt(String.valueOf(v170_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_chc_nls_rate).trim()))) / 24))));
        }
        if (bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units1.set(String.valueOf(bill_eol_add_on_day1_units));
            if (Integer.parseInt(String.valueOf(eol_units1).trim()) >= 16) {
                eol_hours1.set(String.valueOf(4));
            } else {
                eol_hours1.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units1).trim()) / 4))));
            }
            bill_eol_add_on_day1_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours1).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units2.set(String.valueOf(bill_eol_add_on_day2_units));
            if (Integer.parseInt(String.valueOf(eol_units2).trim()) >= 16) {
                eol_hours2.set(String.valueOf(4));
            } else {
                eol_hours2.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units2).trim()) / 4))));
            }
            bill_eol_add_on_day2_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours2).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units3.set(String.valueOf(bill_eol_add_on_day3_units));
            if (Integer.parseInt(String.valueOf(eol_units3).trim()) >= 16) {
                eol_hours3.set(String.valueOf(4));
            } else {
                eol_hours3.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units3).trim()) / 4))));
            }
            bill_eol_add_on_day3_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours3).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units4.set(String.valueOf(bill_eol_add_on_day4_units));
            if (Integer.parseInt(String.valueOf(eol_units4).trim()) >= 16) {
                eol_hours4.set(String.valueOf(4));
            } else {
                eol_hours4.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units4).trim()) / 4))));
            }
            bill_eol_add_on_day4_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours4).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units5.set(String.valueOf(bill_eol_add_on_day5_units));
            if (Integer.parseInt(String.valueOf(eol_units5).trim()) >= 16) {
                eol_hours5.set(String.valueOf(4));
            } else {
                eol_hours5.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units5).trim()) / 4))));
            }
            bill_eol_add_on_day5_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours5).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units6.set(String.valueOf(bill_eol_add_on_day6_units));
            if (Integer.parseInt(String.valueOf(eol_units6).trim()) >= 16) {
                eol_hours6.set(String.valueOf(4));
            } else {
                eol_hours6.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units6).trim()) / 4))));
            }
            bill_eol_add_on_day6_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours6).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units7.set(String.valueOf(bill_eol_add_on_day7_units));
            if (Integer.parseInt(String.valueOf(eol_units7).trim()) >= 16) {
                eol_hours7.set(String.valueOf(4));
            } else {
                eol_hours7.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units7).trim()) / 4))));
            }
            bill_eol_add_on_day7_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours7).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        sia_pay_amt_total.set(String.valueOf(((((((bill_eol_add_on_day1_pay + bill_eol_add_on_day2_pay) + bill_eol_add_on_day3_pay) + bill_eol_add_on_day4_pay) + bill_eol_add_on_day5_pay) + bill_eol_add_on_day6_pay) + bill_eol_add_on_day7_pay)));
    }

    private void v170_calc_rhc_eol_sia_exit() {
        return;
    }

    private void v170_sum_rhc_0651_rate() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(hr_bill_pay_amt1).trim()) + Integer.parseInt(String.valueOf(lr_bill_pay_amt1).trim()))).trim()).intValue();
        if (String.valueOf(sia_units_ind).equals(String.valueOf("Y"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("77"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("74"));
                }
            }
        }
        if (String.valueOf(sia_units_ind).equals(String.valueOf("N"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("75"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("73"));
                }
            }
        }
    }

    private void v170_sum_rhc_0651_rate_exit() {
        return;
    }

    private void v170_chc_0652() {
        if (bill_units2 <= 0) {
            _2017();
            return;
        }
        if (bill_units2 < 32) {
            date_calculation_fields.set("");
            date_2_dos.set(String.valueOf(bill_line_item_dos2));
            v170_calc_prior_svc_days(); // THRU V170-CALC-PRIOR-SVC-DAYS-EXIT
            date_1_adm();
            v170_calc_prior_svc_days_exit();
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2017 - (Integer.parseInt(String.valueOf(v170_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_high_rhc_nls_rate_q).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2017 - (Integer.parseInt(String.valueOf(v170_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_low_rhc_nls_rate_q).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2017 - (Integer.parseInt(String.valueOf(v170_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_chc_nls_rate_q).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
            _2017();
            return;
        }
        if (!String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2017 - (Integer.parseInt(String.valueOf(v170_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_high_rhc_nls_rate).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2017 - (Integer.parseInt(String.valueOf(v170_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_low_rhc_nls_rate).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2017 - (Integer.parseInt(String.valueOf(v170_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_chc_nls_rate).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
        }
        /* RAW: 2017 - */
    }

    private void v170_chc_0652_exit() {
        return;
    }

    private void v170_irc_0655() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2017 - (Integer.parseInt(String.valueOf(v170_irc_ls_rate_q).trim()) * bill_prov_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_irc_nls_rate_q).trim()))) * bill_units3)).trim()).intValue();
        } else {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2017 - (Integer.parseInt(String.valueOf(v170_irc_ls_rate).trim()) * bill_prov_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_irc_nls_rate).trim()))) * bill_units3)).trim()).intValue();
        }
        /* RAW: 2017 - */
    }

    private void v170_irc_0655_exit() {
        return;
    }

    private void v170_gic_0656() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2017 - (Integer.parseInt(String.valueOf(v170_gic_ls_rate_q).trim()) * bill_prov_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_gic_nls_rate_q).trim()))) * bill_units4)).trim()).intValue();
        } else {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2017 - (Integer.parseInt(String.valueOf(v170_gic_ls_rate).trim()) * bill_prov_wage_index))) + 2017) - Integer.parseInt(String.valueOf(v170_gic_nls_rate).trim()))) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2017 - */
    }

    private void v170_gic_0656_exit() {
        return;
    }

    private void v170_calc_prior_svc_days() {
    }

    private void date_1_adm_2() {
    // date_1_adm_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_1_adm)));
    // date_2_dos_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_2_dos)));
        days_between_dates.set(String.valueOf((Integer.parseInt(String.valueOf(date_2_dos_integer).trim()) - Integer.parseInt(String.valueOf(date_1_adm_integer).trim()))));
        if (bill_na_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            prior_benefit_days.set(String.valueOf(bill_na_add_on_day1_units));
        } else {
            prior_benefit_days.set(String.valueOf(0));
        }
        prior_svc_days.set(String.valueOf((Integer.parseInt(String.valueOf(days_between_dates).trim()) + Integer.parseInt(String.valueOf(prior_benefit_days).trim()))));
    }

    private void v170_calc_prior_svc_days_exit() {
        return;
    }

    private void v180_process_data() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2018();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            _2018();
            /* RAW: - V180-RHC-0651 THRU 2018 - */
            /* RAW: V180-RHC-0651-EXIT  */
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            _2018();
            /* RAW: - V180-CHC-0652 THRU 2018 - */
            /* RAW: V180-CHC-0652-EXIT  */
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            _2018();
            /* RAW: - V180-IRC-0655 THRU 2018 - */
            /* RAW: V180-IRC-0655-EXIT  */
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            _2018();
            /* RAW: - V180-GIC-0656 THRU 2018 - */
            /* RAW: V180-GIC-0656-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf(((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4) + Integer.parseInt(String.valueOf(sia_pay_amt_total).trim()))).trim()).intValue();
    }

    private void bill_pay_amt1_24() {
    }

    private void bill_pay_amt2_24() {
    }

    private void bill_pay_amt3_24() {
    }

    private void bill_pay_amt4_24() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_24() {
        /* RAW: 2018 - */
    }

    private void v180_process_exit() {
        return;
    }

    private void v180_rhc_0651() {
        if (bill_units1 <= 0) {
            _2018();
            return;
        }
        if (String.valueOf(bill_line_item_dos1).compareTo(String.valueOf(bill_admission_date)) < 0) {
            _2018();
            return;
        }
    }

    private void date_2_dos_3() {
        v180_calc_prior_svc_days(); // THRU V180-CALC-PRIOR-SVC-DAYS-EXIT
        date_1_adm();
        v180_calc_prior_svc_days_exit();
        v180_eval_rhc_days(); // THRU V180-EVAL-RHC-DAYS-EXIT
        v180_eval_rhc_days_exit();
        v180_calc_rhc_eol_sia(); // THRU V180-CALC-RHC-EOL-SIA-EXIT
        v180_calc_rhc_eol_sia_exit();
        v180_sum_rhc_0651_rate(); // THRU V180-SUM-RHC-0651-RATE-EXIT
        v180_sum_rhc_0651_rate_exit();
        /* RAW: 2018 - */
    }

    private void v180_rhc_0651_exit() {
        return;
    }

    private void v180_eval_rhc_days() {
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) >= 60) {
            lr_bill_units1.set(String.valueOf(bill_units1));
            v180_apply_low_rhc_rate(); // THRU V180-APPLY-LOW-RHC-RATE-EXIT
            rhc_low_day_ind();
            v180_apply_low_rhc_rate_exit();
            v180_eval_rhc_days_exit();
            return;
        }
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
            high_rate_days_left.set(String.valueOf((60 - Integer.parseInt(String.valueOf(prior_svc_days).trim()))));
            if (bill_units1 <= Integer.parseInt(String.valueOf(high_rate_days_left).trim())) {
                hr_bill_units1.set(String.valueOf(bill_units1));
                v180_apply_high_rhc_rate(); // THRU V180-APPLY-HIGH-RHC-RATE-EXIT
                rhc_high_day_ind();
                v180_apply_high_rhc_rate_exit();
                v180_eval_rhc_days_exit();
                return;
            } else {
                hr_bill_units1.set(String.valueOf(high_rate_days_left));
                v180_apply_high_rhc_rate(); // THRU V180-APPLY-HIGH-RHC-RATE-EXIT
                rhc_high_day_ind();
                v180_apply_high_rhc_rate_exit();
                lr_bill_units1.set(String.valueOf((bill_units1 - Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
                v180_apply_low_rhc_rate(); // THRU V180-APPLY-LOW-RHC-RATE-EXIT
                rhc_low_day_ind();
                v180_apply_low_rhc_rate_exit();
            }
        }
    }

    private void v180_eval_rhc_days_exit() {
        return;
    }

    private void v180_apply_low_rhc_rate() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            lr_bill_pay_amt1.set(String.valueOf(((((((2018 - (Integer.parseInt(String.valueOf(v180_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_low_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        } else {
            lr_bill_pay_amt1.set(String.valueOf(((((((2018 - (Integer.parseInt(String.valueOf(v180_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_low_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        }
    }

    private void rhc_low_day_ind_3() {
    }

    private void v180_apply_low_rhc_rate_exit() {
        return;
    }

    private void v180_apply_high_rhc_rate() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            hr_bill_pay_amt1.set(String.valueOf(((((((2018 - (Integer.parseInt(String.valueOf(v180_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_high_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        } else {
            hr_bill_pay_amt1.set(String.valueOf(((((((2018 - (Integer.parseInt(String.valueOf(v180_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_high_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        }
    }

    private void rhc_high_day_ind_3() {
    }

    private void v180_apply_high_rhc_rate_exit() {
        return;
    }

    private void v180_calc_rhc_eol_sia() {
        if (((((((bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim()) || bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim()))) {
            sia_units_ind.set(String.valueOf("Y"));
        } else {
            sia_units_ind.set(String.valueOf("N"));
            v180_calc_rhc_eol_sia_exit();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            sia_pymt_rate.set(String.valueOf((((((((2018 - (Integer.parseInt(String.valueOf(v180_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_chc_nls_rate_q).trim()))) / 24))));
        } else {
            sia_pymt_rate.set(String.valueOf((((((((2018 - (Integer.parseInt(String.valueOf(v180_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_chc_nls_rate).trim()))) / 24))));
        }
        if (bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units1.set(String.valueOf(bill_eol_add_on_day1_units));
            if (Integer.parseInt(String.valueOf(eol_units1).trim()) >= 16) {
                eol_hours1.set(String.valueOf(4));
            } else {
                eol_hours1.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units1).trim()) / 4))));
            }
            bill_eol_add_on_day1_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours1).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units2.set(String.valueOf(bill_eol_add_on_day2_units));
            if (Integer.parseInt(String.valueOf(eol_units2).trim()) >= 16) {
                eol_hours2.set(String.valueOf(4));
            } else {
                eol_hours2.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units2).trim()) / 4))));
            }
            bill_eol_add_on_day2_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours2).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units3.set(String.valueOf(bill_eol_add_on_day3_units));
            if (Integer.parseInt(String.valueOf(eol_units3).trim()) >= 16) {
                eol_hours3.set(String.valueOf(4));
            } else {
                eol_hours3.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units3).trim()) / 4))));
            }
            bill_eol_add_on_day3_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours3).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units4.set(String.valueOf(bill_eol_add_on_day4_units));
            if (Integer.parseInt(String.valueOf(eol_units4).trim()) >= 16) {
                eol_hours4.set(String.valueOf(4));
            } else {
                eol_hours4.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units4).trim()) / 4))));
            }
            bill_eol_add_on_day4_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours4).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units5.set(String.valueOf(bill_eol_add_on_day5_units));
            if (Integer.parseInt(String.valueOf(eol_units5).trim()) >= 16) {
                eol_hours5.set(String.valueOf(4));
            } else {
                eol_hours5.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units5).trim()) / 4))));
            }
            bill_eol_add_on_day5_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours5).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units6.set(String.valueOf(bill_eol_add_on_day6_units));
            if (Integer.parseInt(String.valueOf(eol_units6).trim()) >= 16) {
                eol_hours6.set(String.valueOf(4));
            } else {
                eol_hours6.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units6).trim()) / 4))));
            }
            bill_eol_add_on_day6_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours6).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units7.set(String.valueOf(bill_eol_add_on_day7_units));
            if (Integer.parseInt(String.valueOf(eol_units7).trim()) >= 16) {
                eol_hours7.set(String.valueOf(4));
            } else {
                eol_hours7.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units7).trim()) / 4))));
            }
            bill_eol_add_on_day7_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours7).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        sia_pay_amt_total.set(String.valueOf(((((((bill_eol_add_on_day1_pay + bill_eol_add_on_day2_pay) + bill_eol_add_on_day3_pay) + bill_eol_add_on_day4_pay) + bill_eol_add_on_day5_pay) + bill_eol_add_on_day6_pay) + bill_eol_add_on_day7_pay)));
    }

    private void v180_calc_rhc_eol_sia_exit() {
        return;
    }

    private void v180_sum_rhc_0651_rate() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(hr_bill_pay_amt1).trim()) + Integer.parseInt(String.valueOf(lr_bill_pay_amt1).trim()))).trim()).intValue();
        if (String.valueOf(sia_units_ind).equals(String.valueOf("Y"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("77"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("74"));
                }
            }
        }
        if (String.valueOf(sia_units_ind).equals(String.valueOf("N"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("75"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("73"));
                }
            }
        }
    }

    private void v180_sum_rhc_0651_rate_exit() {
        return;
    }

    private void v180_chc_0652() {
        if (bill_units2 <= 0) {
            _2018();
            return;
        }
        if (bill_units2 < 32) {
            date_calculation_fields.set("");
            date_2_dos.set(String.valueOf(bill_line_item_dos2));
            v180_calc_prior_svc_days(); // THRU V180-CALC-PRIOR-SVC-DAYS-EXIT
            date_1_adm();
            v180_calc_prior_svc_days_exit();
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2018 - (Integer.parseInt(String.valueOf(v180_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_high_rhc_nls_rate_q).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2018 - (Integer.parseInt(String.valueOf(v180_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_low_rhc_nls_rate_q).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2018 - (Integer.parseInt(String.valueOf(v180_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_chc_nls_rate_q).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
            _2018();
            return;
        }
        if (!String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2018 - (Integer.parseInt(String.valueOf(v180_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_high_rhc_nls_rate).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2018 - (Integer.parseInt(String.valueOf(v180_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_low_rhc_nls_rate).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2018 - (Integer.parseInt(String.valueOf(v180_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_chc_nls_rate).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
        }
        /* RAW: 2018 - */
    }

    private void v180_chc_0652_exit() {
        return;
    }

    private void v180_irc_0655() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2018 - (Integer.parseInt(String.valueOf(v180_irc_ls_rate_q).trim()) * bill_prov_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_irc_nls_rate_q).trim()))) * bill_units3)).trim()).intValue();
        } else {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2018 - (Integer.parseInt(String.valueOf(v180_irc_ls_rate).trim()) * bill_prov_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_irc_nls_rate).trim()))) * bill_units3)).trim()).intValue();
        }
        /* RAW: 2018 - */
    }

    private void v180_irc_0655_exit() {
        return;
    }

    private void v180_gic_0656() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2018 - (Integer.parseInt(String.valueOf(v180_gic_ls_rate_q).trim()) * bill_prov_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_gic_nls_rate_q).trim()))) * bill_units4)).trim()).intValue();
        } else {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2018 - (Integer.parseInt(String.valueOf(v180_gic_ls_rate).trim()) * bill_prov_wage_index))) + 2018) - Integer.parseInt(String.valueOf(v180_gic_nls_rate).trim()))) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2018 - */
    }

    private void v180_gic_0656_exit() {
        return;
    }

    private void v180_calc_prior_svc_days() {
    }

    private void date_1_adm_3() {
    // date_1_adm_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_1_adm)));
    // date_2_dos_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_2_dos)));
        days_between_dates.set(String.valueOf((Integer.parseInt(String.valueOf(date_2_dos_integer).trim()) - Integer.parseInt(String.valueOf(date_1_adm_integer).trim()))));
        if (bill_na_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            prior_benefit_days.set(String.valueOf(bill_na_add_on_day1_units));
        } else {
            prior_benefit_days.set(String.valueOf(0));
        }
        prior_svc_days.set(String.valueOf((Integer.parseInt(String.valueOf(days_between_dates).trim()) + Integer.parseInt(String.valueOf(prior_benefit_days).trim()))));
    }

    private void v180_calc_prior_svc_days_exit() {
        return;
    }

    private void v190_process_data() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2019();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            _2019();
            /* RAW: - V190-RHC-0651 THRU 2019 - */
            /* RAW: V190-RHC-0651-EXIT  */
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            _2019();
            /* RAW: - V190-CHC-0652 THRU 2019 - */
            /* RAW: V190-CHC-0652-EXIT  */
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            _2019();
            /* RAW: - V190-IRC-0655 THRU 2019 - */
            /* RAW: V190-IRC-0655-EXIT  */
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            _2019();
            /* RAW: - V190-GIC-0656 THRU 2019 - */
            /* RAW: V190-GIC-0656-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf(((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4) + Integer.parseInt(String.valueOf(sia_pay_amt_total).trim()))).trim()).intValue();
    }

    private void bill_pay_amt1_25() {
    }

    private void bill_pay_amt2_25() {
    }

    private void bill_pay_amt3_25() {
    }

    private void bill_pay_amt4_25() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_25() {
        /* RAW: 2019 - */
    }

    private void v190_process_exit() {
        return;
    }

    private void v190_rhc_0651() {
        if (bill_units1 <= 0) {
            _2019();
            return;
        }
        if (String.valueOf(bill_line_item_dos1).compareTo(String.valueOf(bill_admission_date)) < 0) {
            _2019();
            return;
        }
    }

    private void date_2_dos_4() {
        v190_calc_prior_svc_days(); // THRU V190-CALC-PRIOR-SVC-DAYS-EXIT
        date_1_adm();
        v190_calc_prior_svc_days_exit();
        v190_eval_rhc_days(); // THRU V190-EVAL-RHC-DAYS-EXIT
        v190_eval_rhc_days_exit();
        v190_calc_rhc_eol_sia(); // THRU V190-CALC-RHC-EOL-SIA-EXIT
        v190_calc_rhc_eol_sia_exit();
        v190_sum_rhc_0651_rate(); // THRU V190-SUM-RHC-0651-RATE-EXIT
        v190_sum_rhc_0651_rate_exit();
        /* RAW: 2019 - */
    }

    private void v190_rhc_0651_exit() {
        return;
    }

    private void v190_eval_rhc_days() {
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) >= 60) {
            lr_bill_units1.set(String.valueOf(bill_units1));
            v190_apply_low_rhc_rate(); // THRU V190-APPLY-LOW-RHC-RATE-EXIT
            bill_low_rhc_days();
            rhc_low_day_ind();
            v190_apply_low_rhc_rate_exit();
            v190_eval_rhc_days_exit();
            return;
        }
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
            high_rate_days_left.set(String.valueOf((60 - Integer.parseInt(String.valueOf(prior_svc_days).trim()))));
            if (bill_units1 <= Integer.parseInt(String.valueOf(high_rate_days_left).trim())) {
                hr_bill_units1.set(String.valueOf(bill_units1));
                v190_apply_high_rhc_rate(); // THRU V190-APPLY-HIGH-RHC-RATE-EXIT
                bill_high_rhc_days();
                rhc_high_day_ind();
                v190_apply_high_rhc_rate_exit();
                v190_eval_rhc_days_exit();
                return;
            } else {
                hr_bill_units1.set(String.valueOf(high_rate_days_left));
                v190_apply_high_rhc_rate(); // THRU V190-APPLY-HIGH-RHC-RATE-EXIT
                bill_high_rhc_days();
                rhc_high_day_ind();
                v190_apply_high_rhc_rate_exit();
                lr_bill_units1.set(String.valueOf((bill_units1 - Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
                v190_apply_low_rhc_rate(); // THRU V190-APPLY-LOW-RHC-RATE-EXIT
                bill_low_rhc_days();
                rhc_low_day_ind();
                v190_apply_low_rhc_rate_exit();
            }
        }
    }

    private void v190_eval_rhc_days_exit() {
        return;
    }

    private void v190_apply_low_rhc_rate() {
    }

    private void bill_low_rhc_days() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            lr_bill_pay_amt1.set(String.valueOf(((((((2019 - (Integer.parseInt(String.valueOf(v190_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_low_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        } else {
            lr_bill_pay_amt1.set(String.valueOf(((((((2019 - (Integer.parseInt(String.valueOf(v190_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_low_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        }
    }

    private void rhc_low_day_ind_4() {
    }

    private void v190_apply_low_rhc_rate_exit() {
        return;
    }

    private void v190_apply_high_rhc_rate() {
    }

    private void bill_high_rhc_days() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            hr_bill_pay_amt1.set(String.valueOf(((((((2019 - (Integer.parseInt(String.valueOf(v190_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_high_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        } else {
            hr_bill_pay_amt1.set(String.valueOf(((((((2019 - (Integer.parseInt(String.valueOf(v190_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_high_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        }
    }

    private void rhc_high_day_ind_4() {
    }

    private void v190_apply_high_rhc_rate_exit() {
        return;
    }

    private void v190_calc_rhc_eol_sia() {
        if (((((((bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim()) || bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim()))) {
            sia_units_ind.set(String.valueOf("Y"));
        } else {
            sia_units_ind.set(String.valueOf("N"));
            v190_calc_rhc_eol_sia_exit();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            sia_pymt_rate.set(String.valueOf((((((((2019 - (Integer.parseInt(String.valueOf(v190_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_chc_nls_rate_q).trim()))) / 24))));
        } else {
            sia_pymt_rate.set(String.valueOf((((((((2019 - (Integer.parseInt(String.valueOf(v190_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_chc_nls_rate).trim()))) / 24))));
        }
        if (bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units1.set(String.valueOf(bill_eol_add_on_day1_units));
            if (Integer.parseInt(String.valueOf(eol_units1).trim()) >= 16) {
                eol_hours1.set(String.valueOf(4));
            } else {
                eol_hours1.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units1).trim()) / 4))));
            }
            bill_eol_add_on_day1_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours1).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units2.set(String.valueOf(bill_eol_add_on_day2_units));
            if (Integer.parseInt(String.valueOf(eol_units2).trim()) >= 16) {
                eol_hours2.set(String.valueOf(4));
            } else {
                eol_hours2.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units2).trim()) / 4))));
            }
            bill_eol_add_on_day2_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours2).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units3.set(String.valueOf(bill_eol_add_on_day3_units));
            if (Integer.parseInt(String.valueOf(eol_units3).trim()) >= 16) {
                eol_hours3.set(String.valueOf(4));
            } else {
                eol_hours3.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units3).trim()) / 4))));
            }
            bill_eol_add_on_day3_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours3).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units4.set(String.valueOf(bill_eol_add_on_day4_units));
            if (Integer.parseInt(String.valueOf(eol_units4).trim()) >= 16) {
                eol_hours4.set(String.valueOf(4));
            } else {
                eol_hours4.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units4).trim()) / 4))));
            }
            bill_eol_add_on_day4_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours4).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units5.set(String.valueOf(bill_eol_add_on_day5_units));
            if (Integer.parseInt(String.valueOf(eol_units5).trim()) >= 16) {
                eol_hours5.set(String.valueOf(4));
            } else {
                eol_hours5.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units5).trim()) / 4))));
            }
            bill_eol_add_on_day5_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours5).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units6.set(String.valueOf(bill_eol_add_on_day6_units));
            if (Integer.parseInt(String.valueOf(eol_units6).trim()) >= 16) {
                eol_hours6.set(String.valueOf(4));
            } else {
                eol_hours6.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units6).trim()) / 4))));
            }
            bill_eol_add_on_day6_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours6).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units7.set(String.valueOf(bill_eol_add_on_day7_units));
            if (Integer.parseInt(String.valueOf(eol_units7).trim()) >= 16) {
                eol_hours7.set(String.valueOf(4));
            } else {
                eol_hours7.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units7).trim()) / 4))));
            }
            bill_eol_add_on_day7_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours7).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        sia_pay_amt_total.set(String.valueOf(((((((bill_eol_add_on_day1_pay + bill_eol_add_on_day2_pay) + bill_eol_add_on_day3_pay) + bill_eol_add_on_day4_pay) + bill_eol_add_on_day5_pay) + bill_eol_add_on_day6_pay) + bill_eol_add_on_day7_pay)));
    }

    private void v190_calc_rhc_eol_sia_exit() {
        return;
    }

    private void v190_sum_rhc_0651_rate() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(hr_bill_pay_amt1).trim()) + Integer.parseInt(String.valueOf(lr_bill_pay_amt1).trim()))).trim()).intValue();
        if (String.valueOf(sia_units_ind).equals(String.valueOf("Y"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("77"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("74"));
                }
            }
        }
        if (String.valueOf(sia_units_ind).equals(String.valueOf("N"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("75"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("73"));
                }
            }
        }
    }

    private void v190_sum_rhc_0651_rate_exit() {
        return;
    }

    private void v190_chc_0652() {
        if (bill_units2 <= 0) {
            _2019();
            return;
        }
        if (bill_units2 < 32) {
            date_calculation_fields.set("");
            date_2_dos.set(String.valueOf(bill_line_item_dos2));
            v190_calc_prior_svc_days(); // THRU V190-CALC-PRIOR-SVC-DAYS-EXIT
            date_1_adm();
            v190_calc_prior_svc_days_exit();
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2019 - (Integer.parseInt(String.valueOf(v190_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_high_rhc_nls_rate_q).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2019 - (Integer.parseInt(String.valueOf(v190_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_low_rhc_nls_rate_q).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2019 - (Integer.parseInt(String.valueOf(v190_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_chc_nls_rate_q).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
            _2019();
            return;
        }
        if (!String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2019 - (Integer.parseInt(String.valueOf(v190_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_high_rhc_nls_rate).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2019 - (Integer.parseInt(String.valueOf(v190_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_low_rhc_nls_rate).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2019 - (Integer.parseInt(String.valueOf(v190_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_chc_nls_rate).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
        }
        /* RAW: 2019 - */
    }

    private void v190_chc_0652_exit() {
        return;
    }

    private void v190_irc_0655() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2019 - (Integer.parseInt(String.valueOf(v190_irc_ls_rate_q).trim()) * bill_prov_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_irc_nls_rate_q).trim()))) * bill_units3)).trim()).intValue();
        } else {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2019 - (Integer.parseInt(String.valueOf(v190_irc_ls_rate).trim()) * bill_prov_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_irc_nls_rate).trim()))) * bill_units3)).trim()).intValue();
        }
        /* RAW: 2019 - */
    }

    private void v190_irc_0655_exit() {
        return;
    }

    private void v190_gic_0656() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2019 - (Integer.parseInt(String.valueOf(v190_gic_ls_rate_q).trim()) * bill_prov_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_gic_nls_rate_q).trim()))) * bill_units4)).trim()).intValue();
        } else {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2019 - (Integer.parseInt(String.valueOf(v190_gic_ls_rate).trim()) * bill_prov_wage_index))) + 2019) - Integer.parseInt(String.valueOf(v190_gic_nls_rate).trim()))) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2019 - */
    }

    private void v190_gic_0656_exit() {
        return;
    }

    private void v190_calc_prior_svc_days() {
    }

    private void date_1_adm_4() {
    // date_1_adm_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_1_adm)));
    // date_2_dos_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_2_dos)));
        days_between_dates.set(String.valueOf((Integer.parseInt(String.valueOf(date_2_dos_integer).trim()) - Integer.parseInt(String.valueOf(date_1_adm_integer).trim()))));
        if (bill_na_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            prior_benefit_days.set(String.valueOf(bill_na_add_on_day1_units));
        } else {
            prior_benefit_days.set(String.valueOf(0));
        }
        prior_svc_days.set(String.valueOf((Integer.parseInt(String.valueOf(days_between_dates).trim()) + Integer.parseInt(String.valueOf(prior_benefit_days).trim()))));
    }

    private void v190_calc_prior_svc_days_exit() {
        return;
    }

    private void v200_process_data() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2020();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            _2020();
            /* RAW: - V200-RHC-0651 THRU 2020 - */
            /* RAW: V200-RHC-0651-EXIT  */
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            _2020();
            /* RAW: - V200-CHC-0652 THRU 2020 - */
            /* RAW: V200-CHC-0652-EXIT  */
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            _2020();
            /* RAW: - V200-IRC-0655 THRU 2020 - */
            /* RAW: V200-IRC-0655-EXIT  */
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            _2020();
            /* RAW: - V200-GIC-0656 THRU 2020 - */
            /* RAW: V200-GIC-0656-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf(((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4) + Integer.parseInt(String.valueOf(sia_pay_amt_total).trim()))).trim()).intValue();
    }

    private void bill_pay_amt1_26() {
    }

    private void bill_pay_amt2_26() {
    }

    private void bill_pay_amt3_26() {
    }

    private void bill_pay_amt4_26() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_26() {
        /* RAW: 2020 - */
    }

    private void v200_process_exit() {
        return;
    }

    private void v200_rhc_0651() {
        if (bill_units1 <= 0) {
            _2020();
            return;
        }
        if (String.valueOf(bill_line_item_dos1).compareTo(String.valueOf(bill_admission_date)) < 0) {
            _2020();
            return;
        }
    }

    private void date_2_dos_5() {
        v200_calc_prior_svc_days(); // THRU V200-CALC-PRIOR-SVC-DAYS-EXIT
        date_1_adm();
        v200_calc_prior_svc_days_exit();
        v200_eval_rhc_days(); // THRU V200-EVAL-RHC-DAYS-EXIT
        v200_eval_rhc_days_exit();
        v200_calc_rhc_eol_sia(); // THRU V200-CALC-RHC-EOL-SIA-EXIT
        v200_calc_rhc_eol_sia_exit();
        v200_sum_rhc_0651_rate(); // THRU V200-SUM-RHC-0651-RATE-EXIT
        v200_sum_rhc_0651_rate_exit();
        /* RAW: 2020 - */
    }

    private void v200_rhc_0651_exit() {
        return;
    }

    private void v200_eval_rhc_days() {
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) >= 60) {
            lr_bill_units1.set(String.valueOf(bill_units1));
            v200_apply_low_rhc_rate(); // THRU V200-APPLY-LOW-RHC-RATE-EXIT
            bill_low_rhc_days();
            rhc_low_day_ind();
            v200_apply_low_rhc_rate_exit();
            v200_eval_rhc_days_exit();
            return;
        }
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
            high_rate_days_left.set(String.valueOf((60 - Integer.parseInt(String.valueOf(prior_svc_days).trim()))));
            if (bill_units1 <= Integer.parseInt(String.valueOf(high_rate_days_left).trim())) {
                hr_bill_units1.set(String.valueOf(bill_units1));
                v200_apply_high_rhc_rate(); // THRU V200-APPLY-HIGH-RHC-RATE-EXIT
                bill_high_rhc_days();
                rhc_high_day_ind();
                v200_apply_high_rhc_rate_exit();
                v200_eval_rhc_days_exit();
                return;
            } else {
                hr_bill_units1.set(String.valueOf(high_rate_days_left));
                v200_apply_high_rhc_rate(); // THRU V200-APPLY-HIGH-RHC-RATE-EXIT
                bill_high_rhc_days();
                rhc_high_day_ind();
                v200_apply_high_rhc_rate_exit();
                lr_bill_units1.set(String.valueOf((bill_units1 - Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
                v200_apply_low_rhc_rate(); // THRU V200-APPLY-LOW-RHC-RATE-EXIT
                bill_low_rhc_days();
                rhc_low_day_ind();
                v200_apply_low_rhc_rate_exit();
            }
        }
    }

    private void v200_eval_rhc_days_exit() {
        return;
    }

    private void v200_apply_low_rhc_rate() {
    }

    private void bill_low_rhc_days_2() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            lr_bill_pay_amt1.set(String.valueOf(((((((2020 - (Integer.parseInt(String.valueOf(v200_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_low_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        } else {
            lr_bill_pay_amt1.set(String.valueOf(((((((2020 - (Integer.parseInt(String.valueOf(v200_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_low_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        }
    }

    private void rhc_low_day_ind_5() {
    }

    private void v200_apply_low_rhc_rate_exit() {
        return;
    }

    private void v200_apply_high_rhc_rate() {
    }

    private void bill_high_rhc_days_2() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            hr_bill_pay_amt1.set(String.valueOf(((((((2020 - (Integer.parseInt(String.valueOf(v200_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_high_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        } else {
            hr_bill_pay_amt1.set(String.valueOf(((((((2020 - (Integer.parseInt(String.valueOf(v200_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_high_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        }
    }

    private void rhc_high_day_ind_5() {
    }

    private void v200_apply_high_rhc_rate_exit() {
        return;
    }

    private void v200_calc_rhc_eol_sia() {
        if (((((((bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim()) || bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim()))) {
            sia_units_ind.set(String.valueOf("Y"));
        } else {
            sia_units_ind.set(String.valueOf("N"));
            v200_calc_rhc_eol_sia_exit();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            sia_pymt_rate.set(String.valueOf((((((((2020 - (Integer.parseInt(String.valueOf(v200_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_chc_nls_rate_q).trim()))) / 24))));
        } else {
            sia_pymt_rate.set(String.valueOf((((((((2020 - (Integer.parseInt(String.valueOf(v200_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_chc_nls_rate).trim()))) / 24))));
        }
        if (bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units1.set(String.valueOf(bill_eol_add_on_day1_units));
            if (Integer.parseInt(String.valueOf(eol_units1).trim()) >= 16) {
                eol_hours1.set(String.valueOf(4));
            } else {
                eol_hours1.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units1).trim()) / 4))));
            }
            bill_eol_add_on_day1_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours1).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units2.set(String.valueOf(bill_eol_add_on_day2_units));
            if (Integer.parseInt(String.valueOf(eol_units2).trim()) >= 16) {
                eol_hours2.set(String.valueOf(4));
            } else {
                eol_hours2.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units2).trim()) / 4))));
            }
            bill_eol_add_on_day2_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours2).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units3.set(String.valueOf(bill_eol_add_on_day3_units));
            if (Integer.parseInt(String.valueOf(eol_units3).trim()) >= 16) {
                eol_hours3.set(String.valueOf(4));
            } else {
                eol_hours3.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units3).trim()) / 4))));
            }
            bill_eol_add_on_day3_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours3).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units4.set(String.valueOf(bill_eol_add_on_day4_units));
            if (Integer.parseInt(String.valueOf(eol_units4).trim()) >= 16) {
                eol_hours4.set(String.valueOf(4));
            } else {
                eol_hours4.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units4).trim()) / 4))));
            }
            bill_eol_add_on_day4_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours4).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units5.set(String.valueOf(bill_eol_add_on_day5_units));
            if (Integer.parseInt(String.valueOf(eol_units5).trim()) >= 16) {
                eol_hours5.set(String.valueOf(4));
            } else {
                eol_hours5.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units5).trim()) / 4))));
            }
            bill_eol_add_on_day5_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours5).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units6.set(String.valueOf(bill_eol_add_on_day6_units));
            if (Integer.parseInt(String.valueOf(eol_units6).trim()) >= 16) {
                eol_hours6.set(String.valueOf(4));
            } else {
                eol_hours6.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units6).trim()) / 4))));
            }
            bill_eol_add_on_day6_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours6).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units7.set(String.valueOf(bill_eol_add_on_day7_units));
            if (Integer.parseInt(String.valueOf(eol_units7).trim()) >= 16) {
                eol_hours7.set(String.valueOf(4));
            } else {
                eol_hours7.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units7).trim()) / 4))));
            }
            bill_eol_add_on_day7_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours7).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        sia_pay_amt_total.set(String.valueOf(((((((bill_eol_add_on_day1_pay + bill_eol_add_on_day2_pay) + bill_eol_add_on_day3_pay) + bill_eol_add_on_day4_pay) + bill_eol_add_on_day5_pay) + bill_eol_add_on_day6_pay) + bill_eol_add_on_day7_pay)));
    }

    private void v200_calc_rhc_eol_sia_exit() {
        return;
    }

    private void v200_sum_rhc_0651_rate() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(hr_bill_pay_amt1).trim()) + Integer.parseInt(String.valueOf(lr_bill_pay_amt1).trim()))).trim()).intValue();
        if (String.valueOf(sia_units_ind).equals(String.valueOf("Y"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("77"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("74"));
                }
            }
        }
        if (String.valueOf(sia_units_ind).equals(String.valueOf("N"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("75"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("73"));
                }
            }
        }
    }

    private void v200_sum_rhc_0651_rate_exit() {
        return;
    }

    private void v200_chc_0652() {
        if (bill_units2 <= 0) {
            _2020();
            return;
        }
        if (bill_units2 < 32) {
            date_calculation_fields.set("");
            date_2_dos.set(String.valueOf(bill_line_item_dos2));
            v200_calc_prior_svc_days(); // THRU V200-CALC-PRIOR-SVC-DAYS-EXIT
            date_1_adm();
            v200_calc_prior_svc_days_exit();
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2020 - (Integer.parseInt(String.valueOf(v200_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_high_rhc_nls_rate_q).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2020 - (Integer.parseInt(String.valueOf(v200_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_low_rhc_nls_rate_q).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2020 - (Integer.parseInt(String.valueOf(v200_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_chc_nls_rate_q).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
            _2020();
            return;
        }
        if (!String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2020 - (Integer.parseInt(String.valueOf(v200_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_high_rhc_nls_rate).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2020 - (Integer.parseInt(String.valueOf(v200_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_low_rhc_nls_rate).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2020 - (Integer.parseInt(String.valueOf(v200_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_chc_nls_rate).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
        }
        /* RAW: 2020 - */
    }

    private void v200_chc_0652_exit() {
        return;
    }

    private void v200_irc_0655() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2020 - (Integer.parseInt(String.valueOf(v200_irc_ls_rate_q).trim()) * bill_prov_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_irc_nls_rate_q).trim()))) * bill_units3)).trim()).intValue();
        } else {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2020 - (Integer.parseInt(String.valueOf(v200_irc_ls_rate).trim()) * bill_prov_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_irc_nls_rate).trim()))) * bill_units3)).trim()).intValue();
        }
        /* RAW: 2020 - */
    }

    private void v200_irc_0655_exit() {
        return;
    }

    private void v200_gic_0656() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2020 - (Integer.parseInt(String.valueOf(v200_gic_ls_rate_q).trim()) * bill_prov_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_gic_nls_rate_q).trim()))) * bill_units4)).trim()).intValue();
        } else {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2020 - (Integer.parseInt(String.valueOf(v200_gic_ls_rate).trim()) * bill_prov_wage_index))) + 2020) - Integer.parseInt(String.valueOf(v200_gic_nls_rate).trim()))) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2020 - */
    }

    private void v200_gic_0656_exit() {
        return;
    }

    private void v200_calc_prior_svc_days() {
    }

    private void date_1_adm_5() {
    // date_1_adm_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_1_adm)));
    // date_2_dos_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_2_dos)));
        days_between_dates.set(String.valueOf((Integer.parseInt(String.valueOf(date_2_dos_integer).trim()) - Integer.parseInt(String.valueOf(date_1_adm_integer).trim()))));
        if (bill_na_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            prior_benefit_days.set(String.valueOf(bill_na_add_on_day1_units));
        } else {
            prior_benefit_days.set(String.valueOf(0));
        }
        prior_svc_days.set(String.valueOf((Integer.parseInt(String.valueOf(days_between_dates).trim()) + Integer.parseInt(String.valueOf(prior_benefit_days).trim()))));
    }

    private void v200_calc_prior_svc_days_exit() {
        return;
    }

    private void v210_process_data() {
        if ((((bill_units1 > 1000 || bill_units2 > 1000) || bill_units3 > 1000) || bill_units4 > 1000)) {
            bill_rtc.set(String.valueOf("10"));
            _2021();
            return;
        }
        if (String.valueOf(bill_rev1).equals(String.valueOf("0651"))) {
            _2021();
            /* RAW: - V210-RHC-0651 THRU 2021 - */
            /* RAW: V210-RHC-0651-EXIT  */
        }
        if (String.valueOf(bill_rev2).equals(String.valueOf("0652"))) {
            _2021();
            /* RAW: - V210-CHC-0652 THRU 2021 - */
            /* RAW: V210-CHC-0652-EXIT  */
        }
        if (String.valueOf(bill_rev3).equals(String.valueOf("0655"))) {
            _2021();
            /* RAW: - V210-IRC-0655 THRU 2021 - */
            /* RAW: V210-IRC-0655-EXIT  */
        }
        if (String.valueOf(bill_rev4).equals(String.valueOf("0656"))) {
            _2021();
            /* RAW: - V210-GIC-0656 THRU 2021 - */
            /* RAW: V210-GIC-0656-EXIT  */
        }
        bill_pay_amt_total = new BigDecimal(String.valueOf(((((wrk_pay_rate1 + wrk_pay_rate2) + wrk_pay_rate3) + wrk_pay_rate4) + Integer.parseInt(String.valueOf(sia_pay_amt_total).trim()))).trim()).intValue();
    }

    private void bill_pay_amt1_27() {
    }

    private void bill_pay_amt2_27() {
    }

    private void bill_pay_amt3_27() {
    }

    private void bill_pay_amt4_27() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate2 = new BigDecimal(String.valueOf(0).trim()).intValue();
        wrk_pay_rate3 = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void wrk_pay_rate4_27() {
        /* RAW: 2021 - */
    }

    private void v210_process_exit() {
        return;
    }

    private void v210_rhc_0651() {
        if (bill_units1 <= 0) {
            _2021();
            return;
        }
        if (String.valueOf(bill_line_item_dos1).compareTo(String.valueOf(bill_admission_date)) < 0) {
            _2021();
            return;
        }
    }

    private void date_2_dos_6() {
        v210_calc_prior_svc_days(); // THRU V210-CALC-PRIOR-SVC-DAYS-EXIT
        date_1_adm();
        v210_calc_prior_svc_days_exit();
        v210_eval_rhc_days(); // THRU V210-EVAL-RHC-DAYS-EXIT
        v210_eval_rhc_days_exit();
        v210_calc_rhc_eol_sia(); // THRU V210-CALC-RHC-EOL-SIA-EXIT
        v210_calc_rhc_eol_sia_exit();
        v210_sum_rhc_0651_rate(); // THRU V210-SUM-RHC-0651-RATE-EXIT
        v210_sum_rhc_0651_rate_exit();
        /* RAW: 2021 - */
    }

    private void v210_rhc_0651_exit() {
        return;
    }

    private void v210_eval_rhc_days() {
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) >= 60) {
            lr_bill_units1.set(String.valueOf(bill_units1));
            v210_apply_low_rhc_rate(); // THRU V210-APPLY-LOW-RHC-RATE-EXIT
            bill_low_rhc_days();
            rhc_low_day_ind();
            v210_apply_low_rhc_rate_exit();
            v210_eval_rhc_days_exit();
            return;
        }
        if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
            high_rate_days_left.set(String.valueOf((60 - Integer.parseInt(String.valueOf(prior_svc_days).trim()))));
            if (bill_units1 <= Integer.parseInt(String.valueOf(high_rate_days_left).trim())) {
                hr_bill_units1.set(String.valueOf(bill_units1));
                v210_apply_high_rhc_rate(); // THRU V210-APPLY-HIGH-RHC-RATE-EXIT
                bill_high_rhc_days();
                rhc_high_day_ind();
                v210_apply_high_rhc_rate_exit();
                v210_eval_rhc_days_exit();
                return;
            } else {
                hr_bill_units1.set(String.valueOf(high_rate_days_left));
                v210_apply_high_rhc_rate(); // THRU V210-APPLY-HIGH-RHC-RATE-EXIT
                bill_high_rhc_days();
                rhc_high_day_ind();
                v210_apply_high_rhc_rate_exit();
                lr_bill_units1.set(String.valueOf((bill_units1 - Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
                v210_apply_low_rhc_rate(); // THRU V210-APPLY-LOW-RHC-RATE-EXIT
                bill_low_rhc_days();
                rhc_low_day_ind();
                v210_apply_low_rhc_rate_exit();
            }
        }
    }

    private void v210_eval_rhc_days_exit() {
        return;
    }

    private void v210_apply_low_rhc_rate() {
    }

    private void bill_low_rhc_days_3() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            lr_bill_pay_amt1.set(String.valueOf(((((((2021 - (Integer.parseInt(String.valueOf(v210_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_low_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        } else {
            lr_bill_pay_amt1.set(String.valueOf(((((((2021 - (Integer.parseInt(String.valueOf(v210_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_low_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(lr_bill_units1).trim()))));
        }
    }

    private void rhc_low_day_ind_6() {
    }

    private void v210_apply_low_rhc_rate_exit() {
        return;
    }

    private void v210_apply_high_rhc_rate() {
    }

    private void bill_high_rhc_days_3() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            hr_bill_pay_amt1.set(String.valueOf(((((((2021 - (Integer.parseInt(String.valueOf(v210_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_high_rhc_nls_rate_q).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        } else {
            hr_bill_pay_amt1.set(String.valueOf(((((((2021 - (Integer.parseInt(String.valueOf(v210_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_high_rhc_nls_rate).trim()))) * Integer.parseInt(String.valueOf(hr_bill_units1).trim()))));
        }
    }

    private void rhc_high_day_ind_6() {
    }

    private void v210_apply_high_rhc_rate_exit() {
        return;
    }

    private void v210_calc_rhc_eol_sia() {
        if (((((((bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim()) || bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) || bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim()))) {
            sia_units_ind.set(String.valueOf("Y"));
        } else {
            sia_units_ind.set(String.valueOf("N"));
            v210_calc_rhc_eol_sia_exit();
            return;
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            sia_pymt_rate.set(String.valueOf((((((((2021 - (Integer.parseInt(String.valueOf(v210_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_chc_nls_rate_q).trim()))) / 24))));
        } else {
            sia_pymt_rate.set(String.valueOf((((((((2021 - (Integer.parseInt(String.valueOf(v210_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_chc_nls_rate).trim()))) / 24))));
        }
        if (bill_eol_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units1.set(String.valueOf(bill_eol_add_on_day1_units));
            if (Integer.parseInt(String.valueOf(eol_units1).trim()) >= 16) {
                eol_hours1.set(String.valueOf(4));
            } else {
                eol_hours1.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units1).trim()) / 4))));
            }
            bill_eol_add_on_day1_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours1).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day2_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units2.set(String.valueOf(bill_eol_add_on_day2_units));
            if (Integer.parseInt(String.valueOf(eol_units2).trim()) >= 16) {
                eol_hours2.set(String.valueOf(4));
            } else {
                eol_hours2.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units2).trim()) / 4))));
            }
            bill_eol_add_on_day2_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours2).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day3_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units3.set(String.valueOf(bill_eol_add_on_day3_units));
            if (Integer.parseInt(String.valueOf(eol_units3).trim()) >= 16) {
                eol_hours3.set(String.valueOf(4));
            } else {
                eol_hours3.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units3).trim()) / 4))));
            }
            bill_eol_add_on_day3_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours3).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day4_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units4.set(String.valueOf(bill_eol_add_on_day4_units));
            if (Integer.parseInt(String.valueOf(eol_units4).trim()) >= 16) {
                eol_hours4.set(String.valueOf(4));
            } else {
                eol_hours4.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units4).trim()) / 4))));
            }
            bill_eol_add_on_day4_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours4).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day5_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units5.set(String.valueOf(bill_eol_add_on_day5_units));
            if (Integer.parseInt(String.valueOf(eol_units5).trim()) >= 16) {
                eol_hours5.set(String.valueOf(4));
            } else {
                eol_hours5.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units5).trim()) / 4))));
            }
            bill_eol_add_on_day5_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours5).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day6_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units6.set(String.valueOf(bill_eol_add_on_day6_units));
            if (Integer.parseInt(String.valueOf(eol_units6).trim()) >= 16) {
                eol_hours6.set(String.valueOf(4));
            } else {
                eol_hours6.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units6).trim()) / 4))));
            }
            bill_eol_add_on_day6_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours6).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        if (bill_eol_add_on_day7_units > Integer.parseInt(String.valueOf(0).trim())) {
            eol_units7.set(String.valueOf(bill_eol_add_on_day7_units));
            if (Integer.parseInt(String.valueOf(eol_units7).trim()) >= 16) {
                eol_hours7.set(String.valueOf(4));
            } else {
                eol_hours7.set(String.valueOf(((Integer.parseInt(String.valueOf(eol_units7).trim()) / 4))));
            }
            bill_eol_add_on_day7_pay = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(eol_hours7).trim()) * Integer.parseInt(String.valueOf(sia_pymt_rate).trim()))).trim()).intValue();
        }
        sia_pay_amt_total.set(String.valueOf(((((((bill_eol_add_on_day1_pay + bill_eol_add_on_day2_pay) + bill_eol_add_on_day3_pay) + bill_eol_add_on_day4_pay) + bill_eol_add_on_day5_pay) + bill_eol_add_on_day6_pay) + bill_eol_add_on_day7_pay)));
    }

    private void v210_calc_rhc_eol_sia_exit() {
        return;
    }

    private void v210_sum_rhc_0651_rate() {
        wrk_pay_rate1 = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(hr_bill_pay_amt1).trim()) + Integer.parseInt(String.valueOf(lr_bill_pay_amt1).trim()))).trim()).intValue();
        if (String.valueOf(sia_units_ind).equals(String.valueOf("Y"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("77"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("74"));
                }
            }
        }
        if (String.valueOf(sia_units_ind).equals(String.valueOf("N"))) {
            if (String.valueOf(rhc_high_day_ind).equals(String.valueOf("Y"))) {
                bill_rtc.set(String.valueOf("75"));
            } else {
                if (String.valueOf(rhc_low_day_ind).equals(String.valueOf("Y"))) {
                    bill_rtc.set(String.valueOf("73"));
                }
            }
        }
    }

    private void v210_sum_rhc_0651_rate_exit() {
        return;
    }

    private void v210_chc_0652() {
        if (bill_units2 <= 0) {
            _2021();
            return;
        }
        if (bill_units2 < 32) {
            date_calculation_fields.set("");
            date_2_dos.set(String.valueOf(bill_line_item_dos2));
            v210_calc_prior_svc_days(); // THRU V210-CALC-PRIOR-SVC-DAYS-EXIT
            date_1_adm();
            v210_calc_prior_svc_days_exit();
        }
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2021 - (Integer.parseInt(String.valueOf(v210_high_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_high_rhc_nls_rate_q).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2021 - (Integer.parseInt(String.valueOf(v210_low_rhc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_low_rhc_nls_rate_q).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2021 - (Integer.parseInt(String.valueOf(v210_chc_ls_rate_q).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_chc_nls_rate_q).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
            _2021();
            return;
        }
        if (!String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            if (bill_units2 < 32) {
                if (Integer.parseInt(String.valueOf(prior_svc_days).trim()) < 60) {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2021 - (Integer.parseInt(String.valueOf(v210_high_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_high_rhc_nls_rate).trim())))).trim()).intValue();
                } else {
                    wrk_pay_rate2 = new BigDecimal(String.valueOf((((((2021 - (Integer.parseInt(String.valueOf(v210_low_rhc_ls_rate).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_low_rhc_nls_rate).trim())))).trim()).intValue();
                }
            } else {
                wrk_pay_rate2 = new BigDecimal(String.valueOf(((((((((2021 - (Integer.parseInt(String.valueOf(v210_chc_ls_rate).trim()) * bill_bene_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_chc_nls_rate).trim()))) / 24)) * ((bill_units2 / 4)))).trim()).intValue();
            }
        }
        /* RAW: 2021 - */
    }

    private void v210_chc_0652_exit() {
        return;
    }

    private void v210_irc_0655() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2021 - (Integer.parseInt(String.valueOf(v210_irc_ls_rate_q).trim()) * bill_prov_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_irc_nls_rate_q).trim()))) * bill_units3)).trim()).intValue();
        } else {
            wrk_pay_rate3 = new BigDecimal(String.valueOf(((((((2021 - (Integer.parseInt(String.valueOf(v210_irc_ls_rate).trim()) * bill_prov_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_irc_nls_rate).trim()))) * bill_units3)).trim()).intValue();
        }
        /* RAW: 2021 - */
    }

    private void v210_irc_0655_exit() {
        return;
    }

    private void v210_gic_0656() {
        if (String.valueOf(bill_qip_ind).equals(String.valueOf("1"))) {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2021 - (Integer.parseInt(String.valueOf(v210_gic_ls_rate_q).trim()) * bill_prov_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_gic_nls_rate_q).trim()))) * bill_units4)).trim()).intValue();
        } else {
            wrk_pay_rate4 = new BigDecimal(String.valueOf(((((((2021 - (Integer.parseInt(String.valueOf(v210_gic_ls_rate).trim()) * bill_prov_wage_index))) + 2021) - Integer.parseInt(String.valueOf(v210_gic_nls_rate).trim()))) * bill_units4)).trim()).intValue();
        }
        /* RAW: 2021 - */
    }

    private void v210_gic_0656_exit() {
        return;
    }

    private void v210_calc_prior_svc_days() {
    }

    private void date_1_adm_6() {
    // date_1_adm_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_1_adm)));
    // date_2_dos_integer.set(String.valueOf(CobolIntrinsics.integer_of_date(date_2_dos)));
        days_between_dates.set(String.valueOf((Integer.parseInt(String.valueOf(date_2_dos_integer).trim()) - Integer.parseInt(String.valueOf(date_1_adm_integer).trim()))));
        if (bill_na_add_on_day1_units > Integer.parseInt(String.valueOf(0).trim())) {
            prior_benefit_days.set(String.valueOf(bill_na_add_on_day1_units));
        } else {
            prior_benefit_days.set(String.valueOf(0));
        }
        prior_svc_days.set(String.valueOf((Integer.parseInt(String.valueOf(days_between_dates).trim()) + Integer.parseInt(String.valueOf(prior_benefit_days).trim()))));
    }

    private void v210_calc_prior_svc_days_exit() {
        return;
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _2021() { /* stub — external/COPY */ }

    private void _2020() { /* stub — external/COPY */ }

    private void _2019() { /* stub — external/COPY */ }

    private void _2018() { /* stub — external/COPY */ }

    private void _2017() { /* stub — external/COPY */ }

    private void _2016() { /* stub — external/COPY */ }

    private void _2015() { /* stub — external/COPY */ }

    private void _2014() { /* stub — external/COPY */ }

    private void _2013() { /* stub — external/COPY */ }

    private void _2012() { /* stub — external/COPY */ }

    private void _2011() { /* stub — external/COPY */ }

    private void _2010() { /* stub — external/COPY */ }

    private void _2009() { /* stub — external/COPY */ }

    private void _2008() { /* stub — external/COPY */ }

    private void _2007() { /* stub — external/COPY */ }

    private void _2006() { /* stub — external/COPY */ }

    private void _2005() { /* stub — external/COPY */ }

    private void _2004() { /* stub — external/COPY */ }

    private void _2003() { /* stub — external/COPY */ }

    private void _2002() { /* stub — external/COPY */ }

    private void _2001() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _1999() { /* stub — external/COPY */ }

    private void _1998() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Hospr210().run();
    }
}
