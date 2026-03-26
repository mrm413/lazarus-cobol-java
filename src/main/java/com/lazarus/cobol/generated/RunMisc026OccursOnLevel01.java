package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc026OccursOnLevel01 extends CobolProgram {
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
    private CobolString[] x = new CobolString[10];

    // LINKAGE SECTION
    private CobolString x_all = new CobolString(10);


    private CobolString[] address = new CobolString[100]; // fallback array

    private void para_main() {
        if (x[1 - 1] == null) x[1 - 1] = new CobolString(1);
        x[1 - 1].set("");
        if (x[3 - 1] == null) x[3 - 1] = new CobolString(1);
        x[3 - 1].set("");
        if (x[5 - 1] == null) x[5 - 1] = new CobolString(1);
        x[5 - 1].set("");
        if (x[7 - 1] == null) x[7 - 1] = new CobolString(1);
        x[7 - 1].set("");
        if (x[2 - 1] == null) x[2 - 1] = new CobolString(256);
        x[2 - 1].set(String.valueOf(0));
        if (x[4 - 1] == null) x[4 - 1] = new CobolString(256);
        x[4 - 1].set(String.valueOf(0));
        if (x[6 - 1] == null) x[6 - 1] = new CobolString(256);
        x[6 - 1].set(String.valueOf(0));
        if (x[8 - 1] == null) x[8 - 1] = new CobolString(256);
        x[8 - 1].set(String.valueOf(0));
        for (int _ii = 0; _ii < address.length; _ii++) { if (address[_ii] == null) address[_ii] = new CobolString(256); address[_ii].set(String.valueOf(address[1 - 1])); }
        if (!String.valueOf(x_all).equals(String.valueOf(" 0 0 0 0AA"))) {
            CobolDisplay.display(String.valueOf(x_all));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc026OccursOnLevel01().run();
    }
}
