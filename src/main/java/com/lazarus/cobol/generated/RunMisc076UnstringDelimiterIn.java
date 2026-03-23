package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc076UnstringDelimiterIn extends CobolProgram {
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
    private CobolString wk_cmd = new CobolString(8);
    private CobolString wk_signs = new CobolString(2);
    private CobolString wks = new CobolString(1); // Group: WKS
    private CobolString[] wk_sign = new CobolString[2];
    private CobolString[] wk_delim = new CobolString[2];
    private CobolString[] wk_data = new CobolString[3];



    private void para_main() {
        /* UNSTRING — requires runtime implementation */
        if (wk_data[1 - 1] == null) wk_data[1 - 1] = new CobolString(256);
        wk_data[1 - 1].set(String.valueOf(""));
        if (wk_data[2 - 1] == null) wk_data[2 - 1] = new CobolString(256);
        wk_data[2 - 1].set(String.valueOf(""));
        if (wk_data[3 - 1] == null) wk_data[3 - 1] = new CobolString(256);
        wk_data[3 - 1].set(String.valueOf(""));
        if (((((!String.valueOf(wk_data[1 - 1]).equals(String.valueOf("WW")) || !String.valueOf(wk_data[2 - 1]).equals(String.valueOf("DD"))) || !String.valueOf(wk_data[3 - 1]).equals(String.valueOf("CC"))) || !String.valueOf(wk_delim[1 - 1]).equals(String.valueOf("A"))) || !String.valueOf(wk_delim[2 - 1]).equals(String.valueOf("B")))) {
            CobolDisplay.display(String.valueOf(wk_data[1 - 1]) + String.valueOf(wk_data[2 - 1]) + String.valueOf(wk_data[3 - 1]) + String.valueOf(wk_delim[1 - 1]) + String.valueOf(wk_delim[2 - 1]));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc076UnstringDelimiterIn().run();
    }
}
