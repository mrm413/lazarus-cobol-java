package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental06988LevelWithThru extends CobolProgram {
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
    private CobolString var_x = new CobolString(1);
    private int var_9 = 0;


    private CobolString x = new CobolString(256);
    private CobolString cb_true = new CobolString(256);
    private CobolString t_y = new CobolString(256);
    private CobolString v9 = new CobolString(256);
    private CobolString v2_4 = new CobolString(256);

    private void para_main() {
        if (!String.valueOf(x).trim().isEmpty()) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS X");
        }
        x.set(String.valueOf(cb_true));
        if (!(!String.valueOf(x).trim().isEmpty())) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS NOT X");
        }
        if (!(!String.valueOf(t_y).trim().isEmpty())) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS NOT T-Y");
        }
        t_y.set(String.valueOf(cb_true));
        if (!(!String.valueOf(t_y).trim().isEmpty())) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS NOT T-Y");
        }
        var_x.set(String.valueOf("Y"));
        if (!(!String.valueOf(t_y).trim().isEmpty())) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS NOT T-Y");
        }
        var_x.set(String.valueOf("Z"));
        if (!String.valueOf(t_y).trim().isEmpty()) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS T-Y");
        }
        var_x.set(String.valueOf("A"));
        if (!String.valueOf(t_y).trim().isEmpty()) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS T-Y");
        }
        if (!String.valueOf(v9).trim().isEmpty()) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_9) + "' IS V9");
        }
        v9.set(String.valueOf(cb_true));
        if (!(!String.valueOf(v9).trim().isEmpty())) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_9) + "' IS NOT V9");
        }
        v2_4.set(String.valueOf(cb_true));
        if (!String.valueOf(v9).trim().isEmpty()) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_9) + "' IS V9");
        }
        if (!(!String.valueOf(v2_4).trim().isEmpty())) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_9) + "' IS NOT V2-4");
        }
        var_9 = new BigDecimal(String.valueOf(3).trim()).intValue();
        if (!(!String.valueOf(v2_4).trim().isEmpty())) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_9) + "' IS NOT V2-4");
        }
        var_9 = new BigDecimal(String.valueOf(4).trim()).intValue();
        if (!(!String.valueOf(v2_4).trim().isEmpty())) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_9) + "' IS NOT V2-4");
        }
        var_9 = new BigDecimal(String.valueOf(5).trim()).intValue();
        if (!String.valueOf(v2_4).trim().isEmpty()) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_9) + "' IS V2-4");
        }
        var_9 = new BigDecimal(String.valueOf(1).trim()).intValue();
        if (!String.valueOf(v2_4).trim().isEmpty()) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_9) + "' IS V2-4");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental06988LevelWithThru().run();
    }
}
