package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Csutldtc extends CobolProgram {
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
    private CobolString ws_date_to_test = new CobolString(1); // Group: WS-DATE-TO-TEST
    private short vstring_length = (short) 0;
    private CobolString vstring_text = new CobolString(1); // Group: Vstring-text
    private CobolString[] vstring_char = new CobolString[256];
    private CobolString ws_date_format = new CobolString(1); // Group: WS-DATE-FORMAT
    private int output_lillian = 0;
    private CobolString ws_message = new CobolString(1); // Group: WS-MESSAGE
    private CobolString ws_severity = new CobolString(4);
    private int ws_severity_n = 0;
    private CobolString ws_msg_no = new CobolString(4);
    private int ws_msg_no_n = 0;
    private CobolString ws_result = new CobolString(15);
    private CobolString ws_date = new CobolString(10);
    private CobolString ws_date_fmt = new CobolString(10);
    private CobolString feedback_code = new CobolString(1); // Group: FEEDBACK-CODE
    private CobolString feedback_token_value = new CobolString(1); // Group: FEEDBACK-TOKEN-VALUE
    private CobolString case_1_condition_id = new CobolString(1); // Group: CASE-1-CONDITION-ID
    private short severity = (short) 0;
    private short msg_no = (short) 0;
    private CobolString case_2_condition_id = new CobolString(1); // Group: CASE-2-CONDITION-ID
    private short class_code = (short) 0;
    private short cause_code = (short) 0;
    private CobolString case_sev_ctl = new CobolString(1);
    private CobolString facility_id = new CobolString(3);
    private int i_s_info = 0;

    // LINKAGE SECTION
    private CobolString ls_date = new CobolString(10);
    private CobolString ls_date_format = new CobolString(10);
    private CobolString ls_result = new CobolString(80);


    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString fc_invalid_date = new CobolString(256); // fallback
    private CobolString fc_insufficient_data = new CobolString(256); // fallback
    private CobolString fc_bad_date_value = new CobolString(256); // fallback
    private CobolString fc_invalid_era = new CobolString(256); // fallback
    private CobolString fc_unsupp_range = new CobolString(256); // fallback
    private CobolString fc_invalid_month = new CobolString(256); // fallback
    private CobolString fc_bad_pic_string = new CobolString(256); // fallback
    private CobolString fc_non_numeric_data = new CobolString(256); // fallback
    private CobolString fc_year_in_era_zero = new CobolString(256); // fallback

    private void para_main() {
        ws_message.set("");
        ws_date.set(String.valueOf(" "));
        a000_main(); // THRU A000-MAIN-EXIT
        a000_main_exit();
        ls_result.set(String.valueOf(ws_message));
        return_code = new BigDecimal(String.valueOf(ws_severity_n).trim()).intValue();
        return;
    }

    private void a000_main() {
        vstring_length = new BigDecimal(String.valueOf(CobolIntrinsics.length(ls_date)).trim()).shortValue();
        vstring_text.set(String.valueOf(ls_date));
        ws_date.set(String.valueOf(ls_date));
        vstring_length = new BigDecimal(String.valueOf(CobolIntrinsics.length(ls_date_format)).trim()).shortValue();
        vstring_text.set(String.valueOf(ls_date_format));
        ws_date_fmt.set(String.valueOf(ls_date_format));
        output_lillian = new BigDecimal(String.valueOf(0).trim()).intValue();
        CobolProgram.call("CEEDAYS", ws_date_to_test, _unnamed, ws_date_format, _unnamed, output_lillian, _unnamed, feedback_code);
        ws_date.set(String.valueOf(ws_date_to_test));
        ws_severity_n = new BigDecimal(String.valueOf(severity).trim()).intValue();
        ws_msg_no_n = new BigDecimal(String.valueOf(msg_no).trim()).intValue();
        if (!String.valueOf(fc_invalid_date).trim().isEmpty()) {
            ws_result.set(String.valueOf("Date is valid"));
        } else if (!String.valueOf(fc_insufficient_data).trim().isEmpty()) {
            ws_result.set(String.valueOf("Insufficient"));
        } else if (!String.valueOf(fc_bad_date_value).trim().isEmpty()) {
            ws_result.set(String.valueOf("Datevalue error"));
        } else if (!String.valueOf(fc_invalid_era).trim().isEmpty()) {
            ws_result.set(String.valueOf("Invalid Era    "));
        } else if (!String.valueOf(fc_unsupp_range).trim().isEmpty()) {
            ws_result.set(String.valueOf("Unsupp. Range  "));
        } else if (!String.valueOf(fc_invalid_month).trim().isEmpty()) {
            ws_result.set(String.valueOf("Invalid month  "));
        } else if (!String.valueOf(fc_bad_pic_string).trim().isEmpty()) {
            ws_result.set(String.valueOf("Bad Pic String "));
        } else if (!String.valueOf(fc_non_numeric_data).trim().isEmpty()) {
            ws_result.set(String.valueOf("Nonnumeric data"));
        } else if (!String.valueOf(fc_year_in_era_zero).trim().isEmpty()) {
            ws_result.set(String.valueOf("YearInEra is 0 "));
        } else {
            ws_result.set(String.valueOf("Date is invalid"));
        }
    }

    private void a000_main_exit() {
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Csutldtc().run();
    }
}
