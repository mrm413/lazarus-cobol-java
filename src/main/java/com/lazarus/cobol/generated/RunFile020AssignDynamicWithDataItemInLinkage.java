package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile020AssignDynamicWithDataItemInLinkage extends CobolProgram {
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
    private CobolString f_path = new CobolString(80);
    private CobolString x_path = new CobolString(80);
    private CobolString y_path = new CobolString(80);
    private int rec1 = 0;
    private int rec2 = 0;
    private CobolString cust_stat = new CobolString(2);



    private void para_main() {
        CobolProgram.call("TSTOPN");
    }

    private void omitted() {
        CobolProgram.call("TSTOPN");
    }

    private void y_path() {
        CobolProgram.call("TSTOPEN", f_path, rec1);
    }

    private void cust_stat() {
        CobolProgram.call("TSTOPEN", x_path, rec1);
    }

    private void cust_stat_2() {
        CobolProgram.call("TSTOPEN", null /* OMITTED */, rec1);
    }

    private void cust_stat_3() {
        CobolProgram.call("TSTOPEN", f_path, rec2);
    }

    private void cust_stat_4() {
        CobolProgram.call("TSTOPEN", x_path, rec2);
    }

    private void cust_stat_5() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile020AssignDynamicWithDataItemInLinkage().run();
    }
}
