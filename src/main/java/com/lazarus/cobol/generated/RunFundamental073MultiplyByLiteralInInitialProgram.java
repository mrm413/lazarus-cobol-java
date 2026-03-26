package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental073MultiplyByLiteralInInitialProgram extends CobolProgram {
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
    private int num = 0;
    private int result = 0;
    private int ws_temp = 0;
    private int ws_temp2 = 0;



    private void para_main() {
        result = new BigDecimal(String.valueOf(num * 4).trim()).intValue();
        ws_temp = new BigDecimal(String.valueOf(1.1).trim()).intValue();
        ws_temp = new BigDecimal(String.valueOf(ws_temp2 * ws_temp).trim()).intValue();
        if (result != 20) {
            CobolDisplay.display("Bad integer: " + String.valueOf(result));
        }
        if (ws_temp != 11.55) {
            CobolDisplay.display("Bad decimal: " + String.valueOf(ws_temp));
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental073MultiplyByLiteralInInitialProgram().run();
    }
}
