package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Esdrv212 extends CobolProgram {
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
    private CobolString w_storage_ref = new CobolString(48);
    private CobolString driver_version = new CobolString(5);
    private CobolString escal056 = new CobolString(8);
    private CobolString escal062 = new CobolString(8);
    private CobolString escal070 = new CobolString(8);
    private CobolString escal071 = new CobolString(8);
    private CobolString escal080 = new CobolString(8);
    private CobolString escal091 = new CobolString(8);
    private CobolString escal100 = new CobolString(8);
    private CobolString escal117 = new CobolString(8);
    private CobolString escal122 = new CobolString(8);
    private CobolString escal130 = new CobolString(8);
    private CobolString escal140 = new CobolString(8);
    private CobolString escal151 = new CobolString(8);
    private CobolString escal160 = new CobolString(8);
    private CobolString escal170 = new CobolString(8);
    private CobolString escal171 = new CobolString(8);
    private CobolString escal180 = new CobolString(8);
    private CobolString escal191 = new CobolString(8);
    private CobolString escal200 = new CobolString(8);
    private CobolString escal202 = new CobolString(8);
    private CobolString escal212 = new CobolString(8);
    private CobolString display_line_measurement = new CobolString(1); // Group: DISPLAY-LINE-MEASUREMENT
    private CobolString print_line_measurement = new CobolString(1); // Group: PRINT-LINE-MEASUREMENT
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private BigDecimal w_sub1 = BigDecimal.ZERO;
    private BigDecimal w_sub2 = BigDecimal.ZERO;
    private BigDecimal w_sub3 = BigDecimal.ZERO;
    private int b_thru_year_code = 0;
    private BigDecimal h_esrd_supp_wi_ratio = BigDecimal.ZERO;


    private CobolString b_thru_date = new CobolString(256); // fallback
    private CobolString pps_rtc = new CobolString(256); // fallback
    private CobolString p_esrd_rate = new CobolString(256); // fallback
    private CobolString pps_final_pay_amt = new CobolString(256); // fallback
    private CobolString p_pacific_is_trust_terr = new CobolString(256); // fallback
    private CobolString w_new_rate1_record = new CobolString(256); // fallback
    private CobolString w_new_rate2_record = new CobolString(256); // fallback
    private CobolString bill_new_data = new CobolString(256); // fallback
    private CobolString pps_data_all = new CobolString(256); // fallback
    private CobolString wage_new_rate_record = new CobolString(256); // fallback
    private CobolString com_cbsa_wage_record = new CobolString(256); // fallback
    private CobolString bun_cbsa_wage_record = new CobolString(256); // fallback
    private CobolString wwd_max = new CobolString(256); // fallback
    private CobolString[] wwd_date = new CobolString[100]; // fallback array
    private CobolString wwd_sub = new CobolString(256); // fallback
    private CobolString[] www_dtcd = new CobolString[100]; // fallback array
    private CobolString[] wwd_dtcd = new CobolString[100]; // fallback array
    private CobolString w_new_eff_date = new CobolString(256); // fallback
    private CobolString[] www_wart1 = new CobolString[100]; // fallback array
    private CobolString[] www_wart2 = new CobolString[100]; // fallback array
    private CobolString[] wwm_ptr = new CobolString[100]; // fallback array
    private CobolString wwm_indx = new CobolString(256); // fallback
    private CobolString p_spec_pymt_ind = new CobolString(256); // fallback
    private CobolString p_spec_wage_indx = new CobolString(256); // fallback
    private CobolString com_cbsa_w_index = new CobolString(256); // fallback
    private CobolString com_max_date = new CobolString(256); // fallback
    private CobolString[] com_date = new CobolString[100]; // fallback array
    private CobolString com_sub = new CobolString(256); // fallback
    private CobolString[] com_wi_date_code = new CobolString[100]; // fallback array
    private CobolString[] com_date_code = new CobolString[100]; // fallback array
    private CobolString com_cbsa_date = new CobolString(256); // fallback
    private CobolString[] com_wage_index = new CobolString[100]; // fallback array
    private CobolString[] com_ptr = new CobolString[100]; // fallback array
    private CobolString com_indx = new CobolString(256); // fallback
    private CobolString bun_cbsa_w_index = new CobolString(256); // fallback
    private CobolString child_hosp_swi_found_switch = new CobolString(256); // fallback
    private CobolString child_hosp_swi_found = new CobolString(256); // fallback
    private CobolString[] child_hosp_swi = new CobolString[100]; // fallback array
    private CobolString child_hosp_table_sub = new CobolString(256); // fallback
    private CobolString bun_max_date = new CobolString(256); // fallback
    private CobolString b_thru_ccyy = new CobolString(256); // fallback
    private CobolString[] bun_date = new CobolString[100]; // fallback array
    private CobolString bun_sub = new CobolString(256); // fallback
    private CobolString p_supp_wi_ind = new CobolString(256); // fallback
    private CobolString p_supp_wi = new CobolString(256); // fallback
    private CobolString[] child_hosp_prov = new CobolString[100]; // fallback array
    private CobolString p_prov_oscar = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString[] bun_wi_date_code = new CobolString[100]; // fallback array
    private CobolString bun_cbsa_date = new CobolString(256); // fallback
    private CobolString[] bun_wage_index = new CobolString[100]; // fallback array
    private CobolString[] bun_ptr = new CobolString[100]; // fallback array
    private CobolString bun_indx = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0100 - */
    }

    private void enter_driver() {
    }

    private void pps_data_all() {
    }

    private void com_cbsa_wage_record() {
    }

    private void pps_calc_vers_cd() {
    }

    private void pps_rtc() {
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20050401 || !CobolIntrinsics.isNumeric(b_thru_date))) {
            pps_rtc.set(String.valueOf(98));
            _0100();
            return;
        }
        if (!CobolIntrinsics.isNumeric(p_esrd_rate)) {
            pps_rtc.set(String.valueOf(50));
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20110101 && String.valueOf(p_esrd_rate).compareTo(String.valueOf(0)) > 0)) {
            pps_final_pay_amt.set(String.valueOf(p_esrd_rate));
            pps_rtc.set(String.valueOf(1));
            _0100();
            return;
        }
        if ((((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20101231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20140101) && String.valueOf(p_pacific_is_trust_terr).equals(String.valueOf("2"))) && String.valueOf(p_esrd_rate).compareTo(String.valueOf(0)) > 0)) {
            pps_final_pay_amt.set(String.valueOf(p_esrd_rate));
            pps_rtc.set(String.valueOf(1));
            _0100();
            return;
        }
        if (Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20131231) {
            w_new_rate1_record.set(String.valueOf(0));
            w_new_rate2_record.set(String.valueOf(0));
            _0800();
            /* RAW: - FIND-BUNDLED-CBSA-WI THRU 0800 - FIND-EXIT */
        } else {
            if (Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20101231) {
                w_new_rate1_record.set(String.valueOf(0));
                w_new_rate2_record.set(String.valueOf(0));
                _0700();
                /* RAW: - FIND-COMPOSITE-CBSA-WI THRU 0700 - FIND-EXIT */
                _0800();
                /* RAW: - FIND-BUNDLED-CBSA-WI THRU 0800 - FIND-EXIT */
            } else {
                if (Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20081231) {
                    w_new_rate1_record.set(String.valueOf(0));
                    w_new_rate2_record.set(String.valueOf(0));
                    _0700();
                    /* RAW: - FIND-COMPOSITE-CBSA-WI THRU 0700 - FIND-EXIT */
                } else {
                    if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20051231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20090101)) {
                        _0500();
                        /* RAW: - FIND-MSA-WAGE-ADJ-RATE THRU 0500 - FIND-EXIT */
                        _0700();
                        /* RAW: - FIND-COMPOSITE-CBSA-WI THRU 0700 - FIND-EXIT */
                    } else {
                        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20050331 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20060101)) {
                            _0500();
                            /* RAW: - FIND-MSA-WAGE-ADJ-RATE THRU 0500 - FIND-EXIT */
                        } else {
                            pps_rtc.set(String.valueOf(98));
                        }
                    }
                }
            }
        }
        if (Integer.parseInt(String.valueOf(pps_rtc).trim()) > 0) {
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20201231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20220101)) {
            CobolProgram.call(String.valueOf(escal212), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20200630 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20210101)) {
            CobolProgram.call(String.valueOf(escal202), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20191231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20200701)) {
            CobolProgram.call(String.valueOf(escal200), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20181231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20200101)) {
            CobolProgram.call(String.valueOf(escal191), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20171231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20190101)) {
            CobolProgram.call(String.valueOf(escal180), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20170630 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20180101)) {
            CobolProgram.call(String.valueOf(escal171), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20161231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20170701)) {
            CobolProgram.call(String.valueOf(escal170), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20151231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20170101)) {
            CobolProgram.call(String.valueOf(escal160), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20141231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20160101)) {
            CobolProgram.call(String.valueOf(escal151), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20131231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20150101)) {
            CobolProgram.call(String.valueOf(escal140), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20121231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20140101)) {
            CobolProgram.call(String.valueOf(escal130), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20111231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20130101)) {
            CobolProgram.call(String.valueOf(escal122), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20101231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20120101)) {
            CobolProgram.call(String.valueOf(escal117), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record, bun_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20091231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20110101)) {
            CobolProgram.call(String.valueOf(escal100), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20081231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20100101)) {
            CobolProgram.call(String.valueOf(escal091), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20071231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20090101)) {
            CobolProgram.call(String.valueOf(escal080), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20070331 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20080101)) {
            CobolProgram.call(String.valueOf(escal071), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20061231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20070401)) {
            CobolProgram.call(String.valueOf(escal070), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20051231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20070101)) {
            CobolProgram.call(String.valueOf(escal062), bill_new_data, pps_data_all, wage_new_rate_record, com_cbsa_wage_record);
            _0100();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20050331 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20060101)) {
            CobolProgram.call(String.valueOf(escal056), bill_new_data, pps_data_all, wage_new_rate_record);
            _0100();
            return;
        }
        /* RAW: 0100 - */
    }

    private void exit_driver() {
        return;
    }

    private void find_msa_wage_adj_rate() {
    }

    private void wwd_sub() {
        while (!(String.valueOf(b_thru_date).compareTo(String.valueOf(wwd_date[Integer.parseInt(String.valueOf(wwd_sub).trim()) - 1])) >= 0)) {
            wwd_sub.set(new BigDecimal(String.valueOf(wwd_sub).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        }
        /* SEARCH ALL WWM-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                pps_rtc.set(String.valueOf(60));
                _0500();
                return;
            }
        }
        /* RAW: 0500 - */
    }

    private void find_exit() {
        return;
    }

    private void n_get_wage_rate() {
        if (String.valueOf(www_dtcd[w_sub1.intValue() - 1]).compareTo(String.valueOf(wwd_dtcd[Integer.parseInt(String.valueOf(wwd_sub).trim()) - 1])) <= 0) {
            w_new_eff_date.set(String.valueOf(wwd_date[Integer.parseInt(String.valueOf(wwd_sub).trim()) - 1]));
            w_new_rate1_record.set(String.valueOf(www_wart1[w_sub1.intValue() - 1]));
            w_new_rate2_record.set(String.valueOf(www_wart2[w_sub1.intValue() - 1]));
        } else {
            w_sub1 = w_sub1.subtract(new BigDecimal(String.valueOf(1).trim()));
            if (w_sub1.compareTo(new BigDecimal(String.valueOf(wwm_ptr[(Integer.parseInt(String.valueOf(wwm_indx).trim()) - 1) - 1]).trim())) > 0) {
                _0550();
                return;
            } else {
                w_new_rate1_record.set(String.valueOf(0));
                w_new_rate2_record.set(String.valueOf(0));
            }
        }
        /* RAW: 0550 - */
    }

    private void n_exit() {
        return;
    }

    private void find_composite_cbsa_wi() {
        if (String.valueOf(p_spec_pymt_ind).equals(String.valueOf("1"))) {
            com_cbsa_w_index.set(String.valueOf(p_spec_wage_indx));
            _0700();
            return;
        }
    }

    private void com_sub() {
        while (!(String.valueOf(b_thru_date).compareTo(String.valueOf(com_date[Integer.parseInt(String.valueOf(com_sub).trim()) - 1])) >= 0)) {
            com_sub.set(new BigDecimal(String.valueOf(com_sub).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        }
        /* SEARCH ALL COM-CBSA-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
    // if (mainframe_pc_switch == ds_error_code) {
    // pps_rtc.set(String.valueOf(60));
    // _0700();
    // return;
    // } else {
    // pps_rtc.set(String.valueOf(61));
    // _0700();
    // return;
    // }
            }
        }
        /* RAW: 0700 - */
    }

    private void find_exit_2() {
        return;
    }

    private void get_comp_cbsa_rate() {
        if (String.valueOf(com_wi_date_code[w_sub2.intValue() - 1]).compareTo(String.valueOf(com_date_code[Integer.parseInt(String.valueOf(com_sub).trim()) - 1])) <= 0) {
            com_cbsa_date.set(String.valueOf(com_date[Integer.parseInt(String.valueOf(com_sub).trim()) - 1]));
            com_cbsa_w_index.set(String.valueOf(com_wage_index[w_sub2.intValue() - 1]));
        } else {
            w_sub2 = w_sub2.subtract(new BigDecimal(String.valueOf(1).trim()));
            if (w_sub2.compareTo(new BigDecimal(String.valueOf(com_ptr[(Integer.parseInt(String.valueOf(com_indx).trim()) - 1) - 1]).trim())) > 0) {
                _0750();
                return;
            } else {
                com_cbsa_w_index.set(String.valueOf(0));
            }
        }
        /* RAW: 0750 - */
    }

    private void comp_exit() {
        return;
    }

    private void find_bundled_cbsa_wi() {
        if (String.valueOf(p_spec_pymt_ind).equals(String.valueOf("1"))) {
            bun_cbsa_w_index.set(String.valueOf(p_spec_wage_indx));
            _0800();
            return;
        }
        if ((Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20141231 && Integer.parseInt(String.valueOf(b_thru_date).trim()) < 20160101)) {
            child_hosp_swi_found_switch.set(String.valueOf("N"));
            _0820();
            /* RAW: - SEARCH-CHILD-HOSP-TABLE WITH TEST AFTER VARYING */
            if (!String.valueOf(child_hosp_swi_found).trim().isEmpty()) {
                bun_cbsa_w_index.set(String.valueOf(child_hosp_swi[Integer.parseInt(String.valueOf(child_hosp_table_sub).trim()) - 1]));
                _0800();
                return;
            }
        }
    }

    private void bun_sub() {
    }

    private void b_thru_year_code() {
        b_thru_year_code = new BigDecimal(String.valueOf((b_thru_year_code - 10)).trim()).intValue();
        while (!(String.valueOf(b_thru_date).compareTo(String.valueOf(bun_date[Integer.parseInt(String.valueOf(bun_sub).trim()) - 1])) >= 0)) {
            bun_sub.set(new BigDecimal(String.valueOf(bun_sub).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        }
        /* SEARCH ALL BUN-CBSA-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
    // if (mainframe_pc_switch == ds_error_code) {
    // pps_rtc.set(String.valueOf(60));
    // _0800();
    // return;
    // } else {
    // pps_rtc.set(String.valueOf(61));
    // _0800();
    // return;
    // }
            }
        }
        if (Integer.parseInt(String.valueOf(b_thru_date).trim()) > 20200930) {
            if (String.valueOf(p_supp_wi_ind).equals(String.valueOf("1"))) {
                if (Integer.parseInt(String.valueOf(p_supp_wi).trim()) > 0) {
                    h_esrd_supp_wi_ratio = new BigDecimal(String.valueOf((((Integer.parseInt(String.valueOf(bun_cbsa_w_index).trim()) - Integer.parseInt(String.valueOf(p_supp_wi).trim()))) / Integer.parseInt(String.valueOf(p_supp_wi).trim()))).trim());
                    if (h_esrd_supp_wi_ratio.compareTo(new BigDecimal(String.valueOf(-0.05).trim())) < 0) {
                        bun_cbsa_w_index.set(String.valueOf((Integer.parseInt(String.valueOf(p_supp_wi).trim()) * 0.95)));
                    }
                    _0800();
                    return;
                } else {
                    pps_rtc.set(String.valueOf(60));
                    _0800();
                    return;
                }
            }
        }
        /* RAW: 0800 - */
    }

    private void find_exit_3() {
        return;
    }

    private void search_child_hosp_table() {
        if (String.valueOf(child_hosp_prov[Integer.parseInt(String.valueOf(child_hosp_table_sub).trim()) - 1]).equals(String.valueOf(p_prov_oscar))) {
            child_hosp_swi_found.set(String.valueOf(cb_true));
        }
        /* RAW: 0850 - */
    }

    private void get_bundled_cbsa_rate() {
        if (String.valueOf(bun_wi_date_code[w_sub3.intValue() - 1]).equals(String.valueOf(b_thru_year_code))) {
            bun_cbsa_date.set(String.valueOf(bun_date[Integer.parseInt(String.valueOf(bun_sub).trim()) - 1]));
            bun_cbsa_w_index.set(String.valueOf(bun_wage_index[w_sub3.intValue() - 1]));
        } else {
            w_sub3 = w_sub3.subtract(new BigDecimal(String.valueOf(1).trim()));
            if (w_sub3.compareTo(new BigDecimal(String.valueOf(bun_ptr[(Integer.parseInt(String.valueOf(bun_indx).trim()) - 1) - 1]).trim())) > 0) {
                _0850();
                return;
            } else {
                bun_cbsa_w_index.set(String.valueOf(0));
                pps_rtc.set(String.valueOf(60));
            }
        }
        /* RAW: 0850 - */
    }

    private void bundled_exit() {
        return;
    }

    private void _0100() { /* stub — external/COPY */ }

    private void _0800() { /* stub — external/COPY */ }

    private void _0700() { /* stub — external/COPY */ }

    private void _0500() { /* stub — external/COPY */ }

    private void _0550() { /* stub — external/COPY */ }

    private void _0750() { /* stub — external/COPY */ }

    private void _0820() { /* stub — external/COPY */ }

    private void _0850() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Esdrv212().run();
    }
}
