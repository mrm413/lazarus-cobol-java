package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc161DefineDefaults extends CobolProgram {
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
    private CobolString thedog = new CobolString(6);
    private CobolString cnspony = new CobolString(1);
    private CobolString horse = new CobolString(1);
    private CobolString myhorse = new CobolString(12);
    private CobolString myponyenv = new CobolString(12);


    private CobolString doggy = new CobolString(256);
    private CobolString pony = new CobolString(256);

    private void para_main() {
        CobolDisplay.display("ENVPONY");
        myponyenv.set(String.valueOf(CobolIntrinsics.acceptFrom("ENVIRONMENT-VALUE")));
        CobolDisplay.display("ENVPONY env var set to " + String.valueOf(myponyenv) + ";");
        CobolDisplay.display("1st Dog's name is " + String.valueOf(doggy) + ";");
        CobolDisplay.display("2nd Dog's name is " + String.valueOf(pony) + ";");
        CobolDisplay.display("ENVPONY is DEFINED as " + String.valueOf(horse) + ";");
        CobolDisplay.display("ENVPONY was NOT DEFINED;");
        CobolDisplay.display("DPONY set to " + String.valueOf(cnspony) + ";");
        CobolDisplay.display("My pony is " + String.valueOf(pony) + ";");
        CobolDisplay.display("DPONY is DEFINED as " + String.valueOf(cnspony) + ";");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc161DefineDefaults().run();
    }
}
