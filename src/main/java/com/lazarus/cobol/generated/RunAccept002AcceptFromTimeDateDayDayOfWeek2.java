package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunAccept002AcceptFromTimeDateDayDayOfWeek2 extends CobolProgram {
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
    private CobolString ws_yyyymmdd = new CobolString(9);
    private CobolString ws_yyyyddd = new CobolString(8);
    private CobolString ws_dayofweek = new CobolString(2);
    private CobolString ws_date_today = new CobolString(1); // Group: WS-DATE-TODAY
    private int ws_todays_yy = 0;
    private int ws_todays_mm = 0;
    private int ws_todays_dd = 0;
    private int ws_date_today_9 = 0;
    private CobolString ws_date = new CobolString(1); // Group: WS-DATE
    private int ws_date_mm = 0;
    private CobolString filler_1 = new CobolString(1);
    private int ws_date_dd = 0;
    private CobolString filler_2 = new CobolString(1);
    private int ws_date_yy = 0;
    private CobolString ws_time_now = new CobolString(1); // Group: WS-TIME-NOW
    private int ws_now_hh = 0;
    private int ws_now_mm = 0;
    private int ws_now_ss = 0;
    private int ws_now_hs = 0;
    private int ws_time_now_9 = 0;
    private CobolString ws_time = new CobolString(1); // Group: WS-TIME
    private int ws_time_hh = 0;
    private CobolString filler_3 = new CobolString(1);
    private int ws_time_mm = 0;
    private CobolString filler_4 = new CobolString(1);
    private int ws_time_ss = 0;
    private CobolString ws_microsecond_time = new CobolString(1); // Group: WS-MICROSECOND-TIME
    private int ws_time_micro = 0;



    private void para_main() {
        run_test();
        run_validation();
        for (int _i0 = 0; _i0 < 50000; _i0++) {
        }
        return;
    }

    private void run_test() {
        ws_date_today_9 = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DATE")).trim()).intValue();
        ws_time_now_9 = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("TIME")).trim()).intValue();
        ws_time_micro = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("MICROSECOND-TIME")).trim()).intValue();
    }

    private void run_validation() {
        ws_date_yy = new BigDecimal(String.valueOf(ws_todays_yy).trim()).intValue();
        ws_date_mm = new BigDecimal(String.valueOf(ws_todays_mm).trim()).intValue();
        ws_date_dd = new BigDecimal(String.valueOf(ws_todays_dd).trim()).intValue();
        ws_time_hh = new BigDecimal(String.valueOf(ws_now_hh).trim()).intValue();
        ws_time_mm = new BigDecimal(String.valueOf(ws_now_mm).trim()).intValue();
        ws_time_ss = new BigDecimal(String.valueOf(ws_now_ss).trim()).intValue();
        CobolDisplay.displayNoAdvancing("PROCESS DATE/TIME : " + String.valueOf(ws_date) + " " + String.valueOf(ws_time));
        CobolDisplay.displayNoAdvancing(" MICROSECOND-TIME ");
        CobolDisplay.displayNoAdvancing(String.valueOf(ws_microsecond_time));
        CobolDisplay.display(".");
        ws_time_micro = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("TIME")).trim()).intValue();
        CobolDisplay.displayNoAdvancing("PROCESS BIG TIME : ");
        CobolDisplay.display(String.valueOf(ws_microsecond_time));
        ws_yyyymmdd.set(String.valueOf(CobolIntrinsics.acceptFrom("DATE YYYYMMDD")));
        if (!String.valueOf(ws_yyyymmdd).equals(String.valueOf("20150405"))) {
            CobolDisplay.display("Wrong date DATE YYYYMMDD: " + String.valueOf(ws_yyyymmdd) + " expected: 20150405");
        }
        ws_yyyyddd.set(String.valueOf(CobolIntrinsics.acceptFrom("DAY YYYYDDD")));
        if (!String.valueOf(ws_yyyyddd).equals(String.valueOf("2015095"))) {
            CobolDisplay.display("Wrong date YYYYDDD:  " + String.valueOf(ws_yyyyddd) + " expected: 2015095");
        }
        ws_dayofweek.set(String.valueOf(CobolIntrinsics.acceptFrom("DAY-OF-WEEK")));
        if (!String.valueOf(ws_dayofweek).equals(String.valueOf("7"))) {
            CobolDisplay.display("Wrong date DAYOFWEEK: " + String.valueOf(ws_dayofweek) + " expected: 7");
        }
        for (int _i1 = 0; _i1 < 500; _i1++) {
            ws_date_today.set(String.valueOf(CobolIntrinsics.acceptFrom("DATE")));
            ws_time_now.set(String.valueOf(CobolIntrinsics.acceptFrom("TIME")));
            ws_microsecond_time.set(String.valueOf(CobolIntrinsics.acceptFrom("MICROSECOND-TIME")));
        }
        ws_date_yy = new BigDecimal(String.valueOf(ws_todays_yy).trim()).intValue();
        ws_date_mm = new BigDecimal(String.valueOf(ws_todays_mm).trim()).intValue();
        ws_date_dd = new BigDecimal(String.valueOf(ws_todays_dd).trim()).intValue();
        ws_time_hh = new BigDecimal(String.valueOf(ws_now_hh).trim()).intValue();
        ws_time_mm = new BigDecimal(String.valueOf(ws_now_mm).trim()).intValue();
        ws_time_ss = new BigDecimal(String.valueOf(ws_now_ss).trim()).intValue();
        CobolDisplay.displayNoAdvancing("PROCESS DATE/TIME : " + String.valueOf(ws_date) + " " + String.valueOf(ws_time));
        CobolDisplay.displayNoAdvancing(" MICROSECOND-TIME ");
        CobolDisplay.displayNoAdvancing(String.valueOf(ws_microsecond_time));
        CobolDisplay.display(".");
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunAccept002AcceptFromTimeDateDayDayOfWeek2().run();
    }
}
