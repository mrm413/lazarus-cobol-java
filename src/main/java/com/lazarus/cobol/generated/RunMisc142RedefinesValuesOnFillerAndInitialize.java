package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc142RedefinesValuesOnFillerAndInitialize extends CobolProgram {
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
    private CobolString tsrdf = new CobolString(1); // Group: TSRDF
    private CobolString ws_ask_id_date = new CobolString(10);
    private CobolString ws_ask_id_date_r = new CobolString(1); // Group: WS-ASK-ID-DATE-R
    private int ws_ask_id_date_yyyy = 0;
    private CobolString filler_1 = new CobolString(1);
    private int ws_ask_id_date_mm = 0;
    private CobolString filler_2 = new CobolString(1);
    private int ws_ask_id_date_dd = 0;



    private void para_main() {
        ws_ask_id_date_yyyy = new BigDecimal(String.valueOf(2015).trim()).intValue();
        ws_ask_id_date_mm = new BigDecimal(String.valueOf(8).trim()).intValue();
        ws_ask_id_date_dd = new BigDecimal(String.valueOf(21).trim()).intValue();
        CobolDisplay.display("The date is " + String.valueOf(ws_ask_id_date) + " Compiled");
        ws_ask_id_date_r.set("");
        ws_ask_id_date_mm = new BigDecimal(String.valueOf(8).trim()).intValue();
        ws_ask_id_date_dd = new BigDecimal(String.valueOf(21).trim()).intValue();
        CobolDisplay.display("The date is " + String.valueOf(ws_ask_id_date) + " INITIALIZE");
        ws_ask_id_date_r.set("");
        ws_ask_id_date_mm = new BigDecimal(String.valueOf(8).trim()).intValue();
        ws_ask_id_date_dd = new BigDecimal(String.valueOf(21).trim()).intValue();
        CobolDisplay.display("The date is " + String.valueOf(ws_ask_id_date) + " WITH FILLER");
        ws_ask_id_date_r.set("");
        ws_ask_id_date_mm = new BigDecimal(String.valueOf(8).trim()).intValue();
        ws_ask_id_date_dd = new BigDecimal(String.valueOf(21).trim()).intValue();
        CobolDisplay.display("The date is " + String.valueOf(ws_ask_id_date) + " ALL TO VALUE");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc142RedefinesValuesOnFillerAndInitialize().run();
    }
}
