package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc124PictureWithEditMask extends CobolProgram {
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
    private CobolString tst = new CobolString(1); // Group: TST
    private int dept_sub = 0;
    private int dept_cost_ytd = 0;
    private CobolString dl_prod_cost = new CobolString(7);
    private CobolString wflt = new CobolString(7);



    private void para_main() {
    }

    private void wflt() {
        CobolDisplay.display("WFLT IS ");
    }

    private void wflt_2() {
        dl_prod_cost.set(String.valueOf(dept_cost_ytd * 1));
        CobolDisplay.display("COST IS ");
    }

    private void dl_prod_cost() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc124PictureWithEditMask().run();
    }
}
