package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental111MoveToEdittedZero extends CobolProgram {
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
    private int disp_1 = 0;
    private CobolString edit_1 = new CobolString(1);
    private CobolString edit_1_x = new CobolString(6);



    private void para_main() {
        edit_1.set(String.valueOf(111111));
        disp_1 = new BigDecimal(String.valueOf(0).trim()).intValue();
        edit_1.set(String.valueOf(disp_1));
        if (!String.valueOf(edit_1_x).equals(String.valueOf("******"))) {
            CobolDisplay.display("Error EDIT-1-X <" + String.valueOf(edit_1_x) + "> !=  <******>");
        }
        disp_1 = new BigDecimal(String.valueOf(123).trim()).intValue();
        edit_1.set(String.valueOf(disp_1));
        if (!String.valueOf(edit_1_x).equals(String.valueOf("***123"))) {
            CobolDisplay.display("Error EDIT-1-X <" + String.valueOf(edit_1_x) + "> !=  <***123>");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental111MoveToEdittedZero().run();
    }
}
