package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunSubscripts007SearchAllWithOccursDependingOn extends CobolProgram {
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

    private CobolString screen_akt = new CobolString(256);
    private CobolString[] screen_name = new CobolString[100];

    private void para_main() {
        /* SEARCH ALL SCREEN-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                CobolDisplay.display("END");
            }
        }
        screen_akt.set(String.valueOf(1));
        if (screen_name[1 - 1] == null) screen_name[1 - 1] = new CobolString(256);
        screen_name[1 - 1].set(String.valueOf("AB"));
        /* SEARCH ALL SCREEN-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                CobolDisplay.display("END");
            }
        }
        screen_akt.set(String.valueOf(2));
        if (screen_name[2 - 1] == null) screen_name[2 - 1] = new CobolString(256);
        screen_name[2 - 1].set(String.valueOf("CD"));
        /* SEARCH ALL SCREEN-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                CobolDisplay.display("END");
            }
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunSubscripts007SearchAllWithOccursDependingOn().run();
    }
}
