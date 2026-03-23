package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition057TypedefClause extends CobolProgram {
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
    private CobolString ausgabe_file_name_t = new CobolString(50);
    private int some_very_long_typedef_name = 0;
    private CobolString ausgabe_file_name_2t = new CobolString(1); // Group: AUSGABE-FILE-NAME-2T
    private int detail_no = 0;


    private CobolString ausgabe_file_name = new CobolString(256);
    private CobolString output_name = new CobolString(256);
    private CobolString amount = new CobolString(256);
    private CobolString[] grp_amount = new CobolString[100];
    private CobolString my_proc = new CobolString(256);
    private CobolString address = new CobolString(256);

    private void para_main() {
        CobolDisplay.display(String.valueOf(ausgabe_file_name));
        CobolDisplay.display(String.valueOf(detail_no));
        CobolDisplay.display(String.valueOf(ausgabe_file_name));
        CobolDisplay.display(String.valueOf(output_name));
        amount.set(String.valueOf(-123.45));
        if (grp_amount[1 - 1] == null) grp_amount[1 - 1] = new CobolString(256);
        grp_amount[1 - 1].set(String.valueOf(amount));
        if (String.valueOf(my_proc).equals(String.valueOf(0))) {
            my_proc.set(String.valueOf(address));
            /* RAW: "prog"  */
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynDefinition057TypedefClause().run();
    }
}
