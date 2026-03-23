package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynValue001OccursTooManyValues extends CobolProgram {
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
    private CobolString ws = new CobolString(1); // Group: WS
    private int ix1 = 0;
    private int ix2 = 0;
    private int ix3 = 0;
    private CobolString[] grp1 = new CobolString[3]; // Group: GRP1
    private CobolString[] grpx = new CobolString[3];
    private CobolString[] month_in_year = new CobolString[13];
    private short[] days_in_month = new short[13];
    private CobolString[] days_months = new CobolString[2]; // Group: DAYS-MONTHS
    private CobolString[][] dayx_monthx = new CobolString[2][4]; // Group: DAYX-MONTHX
    private CobolString[][][] day_month = new CobolString[2][4][3]; // Group: DAY-MONTH
    private CobolString[][][] xxx1 = new CobolString[2][4][3];
    private CobolString[][][] months = new CobolString[2][4][3];
    private CobolString[][][] sepx = new CobolString[2][4][3];
    private int[][][] days = new int[2][4][3];
    private CobolString[][][] per = new CobolString[2][4][3];
    private CobolString[][] flr = new CobolString[2][4];



    private void init_rtn() {
        CobolDisplay.display("Simple OCCURS with multi VALUES");
        for (ix1 = 1; !(ix1 > 13); ix1 += 1) {
            CobolDisplay.display(String.valueOf(ix1) + ": " + String.valueOf(month_in_year[ix1 - 1]) + " has " + String.valueOf(days_in_month[ix1 - 1]) + " days");
        }
        CobolDisplay.display("Complex OCCURS with multi VALUES");
        for (ix3 = 1; !(ix3 > 2); ix3 += 1) {
            for (ix2 = 1; !(ix2 > 4); ix2 += 1) {
                CobolDisplay.display(String.valueOf(ix3) + "-" + String.valueOf(ix2) + ": " + String.valueOf(dayx_monthx[ix3 - 1][ix2 - 1]));
            }
        }
        System.exit(0);
    }

    @Override
    public void run() {
        init_rtn();
    }

    public static void main(String[] args) {
        new SynValue001OccursTooManyValues().run();
    }
}
