package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Snfdr211 extends CobolProgram {
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
    private CobolString w_storage_ref = new CobolString(49);
    private CobolString snfdr_version = new CobolString(9);
    private CobolString snfpr210 = new CobolString(8);
    private CobolString snfpr205 = new CobolString(8);
    private BigDecimal ws_wi_pct_decrease_fy2021 = BigDecimal.ZERO;
    private int ws_wi_pct_adj_fy2021 = 0;
    private CobolString hold_snf_cbsa = new CobolString(1); // Group: HOLD-SNF-CBSA
    private CobolString hold_snf_cbsa_1st = new CobolString(3);
    private CobolString hold_snf_cbsa_2nd = new CobolString(2);
    private CobolString cbsa_wage_index_record = new CobolString(1); // Group: CBSA-WAGE-INDEX-RECORD
    private CobolString cbsa_wir_cbsa = new CobolString(5);
    private CobolString cbsa_wir_effdate = new CobolString(8);
    private int cbsa_wir_area_wageind = 0;


    private CobolString snf_pay_rtc = new CobolString(256); // fallback
    private CobolString snf_thru_date = new CobolString(256); // fallback
    private CobolString snf_rtc = new CobolString(256); // fallback
    private CobolString snf_cbsa = new CobolString(256); // fallback
    private CobolString snf_cbsa_rural = new CobolString(256); // fallback
    private CobolString region_ind = new CobolString(256); // fallback
    private CobolString snf_data = new CobolString(256); // fallback
    private CobolString hold_variables = new CobolString(256); // fallback
    private CobolString snf_spec_wi_ind = new CobolString(256); // fallback
    private CobolString snf_spec_wi_x = new CobolString(256); // fallback
    private CobolString snf_spec_wi = new CobolString(256); // fallback
    private CobolString snf_supp_wi_ind_prior_year = new CobolString(256); // fallback
    private CobolString snf_supp_wi = new CobolString(256); // fallback
    private CobolString ma1 = new CobolString(256); // fallback
    private CobolString t_cbsa_data = new CobolString(256); // fallback
    private CobolString[] t_cbsa = new CobolString[100]; // fallback array
    private CobolString ma2 = new CobolString(256); // fallback
    private CobolString[] t_cbsa_effdate = new CobolString[100]; // fallback array
    private CobolString[] t_cbsa_wageind = new CobolString[100]; // fallback array

    // SECTION: MAINLINE
    private void mainline() {
        perform();
        process_records();
        hold_var_data();
        hold_snf_cbsa();
        select_cbsa_wage_index();
        hold_snf_cbsa();
        read_cbsa_file();
        select_current_wage_index();
        cap_wage_index_decrease();
    }

    private void perform() {
        /* RAW: 0100 - PROCESS-RECORDS THRU 0100 - */
        return;
    }

    private void process_records() {
        snf_pay_rtc.set(String.valueOf("0"));
        cbsa_wage_index_record.set(String.valueOf("0"));
    }

    private void hold_var_data() {
        if (Integer.parseInt(String.valueOf(snf_thru_date).trim()) < 19980701) {
            snf_rtc.set(String.valueOf("40"));
            _0100();
            return;
        }
    }

    private void hold_snf_cbsa() {
        if (!String.valueOf(snf_cbsa_rural).trim().isEmpty()) {
            hold_snf_cbsa_1st.set(String.valueOf(" "));
        }
        if (!String.valueOf(snf_cbsa_rural).trim().isEmpty()) {
            region_ind.set(String.valueOf("R"));
        } else {
            region_ind.set(String.valueOf("U"));
        }
        _1900();
        /* RAW: - SELECT-CBSA-WAGE-INDEX THRU 1900 - */
        return;
    }

    private void select_cbsa_wage_index() {
        if (String.valueOf(snf_spec_wi_ind).equals(String.valueOf("Y"))) {
            /* RAW: SNF-SPEC-WI-IND  */
        }
        if ((String.valueOf(snf_spec_wi_ind).equals(String.valueOf("1")) && !CobolIntrinsics.isNumeric(snf_spec_wi_x))) {
            snf_rtc.set(String.valueOf("30"));
            _1900();
            return;
        }
        if (((String.valueOf(snf_spec_wi_ind).equals(String.valueOf("1")) && CobolIntrinsics.isNumeric(snf_spec_wi_x)) && Integer.parseInt(String.valueOf(snf_spec_wi_x).trim()) > 0)) {
            cbsa_wir_cbsa.set(String.valueOf(snf_cbsa));
            cbsa_wir_effdate.set(String.valueOf("20051001"));
            cbsa_wir_area_wageind = new BigDecimal(String.valueOf(snf_spec_wi).trim()).intValue();
            _1900();
            return;
        }
        _2000();
        /* RAW: - READ-CBSA-FILE THRU 2000 - */
        return;
    }

    private void hold_snf_cbsa_2() {
        if (cbsa_wir_area_wageind <= 0) {
            snf_rtc.set(String.valueOf("30"));
            _1900();
            return;
        }
        if (((Integer.parseInt(String.valueOf(snf_thru_date).trim()) > 20200930 && !String.valueOf(snf_supp_wi_ind_prior_year).trim().isEmpty()) && (Integer.parseInt(String.valueOf(snf_supp_wi).trim()) <= 0 || !CobolIntrinsics.isNumeric(snf_supp_wi)))) {
            snf_rtc.set(String.valueOf("30"));
            _1900();
            return;
        }
        if (((Integer.parseInt(String.valueOf(snf_thru_date).trim()) > 20200930 && !String.valueOf(snf_supp_wi_ind_prior_year).trim().isEmpty()) && Integer.parseInt(String.valueOf(snf_supp_wi).trim()) > 0)) {
            _2020();
            /* RAW: - CAP-WAGE-INDEX-DECREASE THRU 2020 - */
            return;
        }
        /* RAW: 1900 - */
        return;
    }

    private void read_cbsa_file() {
        ma1.set(String.valueOf(1));
        /* SEARCH T-CBSA-DATA */
        {
            boolean _found = false;
    // for (int _idx = 0; _idx < t_cbsa_data.length && !_found; _idx++) {
    // if (String.valueOf(t_cbsa[Integer.parseInt(String.valueOf(ma1).trim()) - 1]).equals(String.valueOf(hold_snf_cbsa))) {
    // ma2.set(String.valueOf(ma1));
    // _found = true;
    // }
    // }
            if (!_found) {
                snf_rtc.set(String.valueOf("30"));
                _2000();
                return;
            }
        }
        /* RAW: 2000 - */
        return;
    }

    private void select_current_wage_index() {
        if (String.valueOf(snf_thru_date).compareTo(String.valueOf(t_cbsa_effdate[Integer.parseInt(String.valueOf(ma2).trim()) - 1])) >= 0) {
            cbsa_wir_cbsa.set(String.valueOf(t_cbsa[Integer.parseInt(String.valueOf(ma2).trim()) - 1]));
            cbsa_wir_effdate.set(String.valueOf(t_cbsa_effdate[Integer.parseInt(String.valueOf(ma2).trim()) - 1]));
            /* RAW: CBSA-WIR-AREA-WAGEIND  */
        }
        /* RAW: 2010 - */
        return;
    }

    private void cap_wage_index_decrease() {
        if (true) {
            /* RAW: / SNF-SUPP-WI ) < WS-WI-PCT-DECREASE-FY2021 */
            cbsa_wir_area_wageind = new BigDecimal(String.valueOf(((Integer.parseInt(String.valueOf(snf_supp_wi).trim()) * ws_wi_pct_adj_fy2021))).trim()).intValue();
        }
        /* RAW: 2020 - */
        return;
    }

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void _0100() { /* stub — external/COPY */ }

    private void _1900() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _2010() { /* stub — external/COPY */ }

    private void _2020() { /* stub — external/COPY */ }

    @Override
    public void run() {
        perform();
    }

    public static void main(String[] args) {
        new Snfdr211().run();
    }
}
