package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import com.lazarus.cobol.jcl.batch.DfsortProgram;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc087SearchAllTableWithDefaultCollatingSequence extends CobolProgram {
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
    private int i = 0;
    // WORKING-STORAGE SECTION
    private CobolString z = new CobolString(10);
    private CobolString g = new CobolString(1); // Group: G
    private CobolString[] tbl = new CobolString[10]; // Group: TBL
    private CobolString[] k = new CobolString[10];
    private CobolString kk = new CobolString(1);



    private void para_main() {
        { /* SORT TBL (tbl) */
            DfsortProgram _sort = new DfsortProgram();
            _sort.setSortKeys(new String[]{"K:A"});
            _sort.execute();
        }
        kk.set(String.valueOf("3"));
        /* SEARCH ALL TBL — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                CobolDisplay.display(String.valueOf(kk) + " NOT FOUND");
            }
        }
        if (i != 3) {
            if (i != 8) {
                CobolDisplay.display("ERROR");
                System.exit(0);
            }
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc087SearchAllTableWithDefaultCollatingSequence().run();
    }
}
