package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental011CompareFloatLongWithFloatingPointLiteral extends CobolProgram {
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
    private double cb_var = 0.0;



    private void para_main() {
        // Transpiled COBOL body (requires runtime extensions for full compilation):
    // 
    // cb_var = Double.parseDouble(String.valueOf(new BigDecimal("9.899999999999e+304")).trim());
    // if (cb_var < 0) {
    // CobolDisplay.display("error: compare " + String.valueOf(cb_var) + " < " + String.valueOf(0) + " failed!");
    // }
    // if (cb_var < new BigDecimal("9.799999999999e+304")) {
    // CobolDisplay.display("error: compare " + String.valueOf(cb_var) + " < " + String.valueOf(new BigDecimal("9.799999999999e+304")) + " failed!");
    // }
    // if (cb_var > new BigDecimal("9.999999999999e+304")) {
    // CobolDisplay.display("error: compare " + String.valueOf(cb_var) + " > " + String.valueOf(new BigDecimal("9.999999999999e+304")) + " failed!");
    // }
    // cb_var = Double.parseDouble(String.valueOf(new BigDecimal("-9.899999999999e+304")).trim());
    // if (cb_var > 0) {
    // CobolDisplay.display("error: compare " + String.valueOf(cb_var) + " > " + String.valueOf(0) + " failed!");
    // }
    // if (cb_var < new BigDecimal("-9.999999999999e+304")) {
    // CobolDisplay.display("error: compare " + String.valueOf(cb_var) + String.valueOf((0 /* non-numeric literal:  <  */ - new BigDecimal("9.999999999999e+304"))) + " failed!");
    // }
    // if (cb_var > new BigDecimal("-9.799999999999e+304")) {
    // CobolDisplay.display("error: compare " + String.valueOf(cb_var) + String.valueOf((0 /* non-numeric literal:  >  */ - new BigDecimal("9.799999999999e+304"))) + " failed!");
    // }
    // System.exit(0);
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental011CompareFloatLongWithFloatingPointLiteral().run();
    }
}
