package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunAccept004AcceptDateDayAndIntrinsicFunctions2 extends CobolProgram {
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
    private int ws_yyyymmdd = 0;
    private int ws_yyyyddd = 0;



    private void para_main() {
        ws_yyyymmdd = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DATE YYYYMMDD")).trim()).intValue();
        ws_yyyyddd = new BigDecimal(String.valueOf(CobolIntrinsics.acceptFrom("DAY YYYYDDD")).trim()).intValue();
        if (!String.valueOf(CobolIntrinsics.integer_of_date(ws_yyyymmdd)).equals(String.valueOf(CobolIntrinsics.integer_of_day(ws_yyyyddd)))) {
            CobolDisplay.display("DIFFERENCES FOUND!");
            CobolDisplay.display("YYYYMMDD = " + String.valueOf(ws_yyyymmdd) + ", " + "YYYYDDD = " + String.valueOf(ws_yyyyddd));
            CobolDisplay.display("INTEGER-OF-DATE = " + String.valueOf(CobolIntrinsics.integer_of_date(ws_yyyymmdd)) + ", " + "INTEGER-OF-DAY = " + String.valueOf(CobolIntrinsics.integer_of_day(ws_yyyyddd)));
            return_code = new BigDecimal(String.valueOf(1).trim()).intValue();
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunAccept004AcceptDateDayAndIntrinsicFunctions2().run();
    }
}
