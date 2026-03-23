package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile102SortWithInputOutputProcedures extends CobolProgram {
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
    private int ix_1 = 0;
    // WORKING-STORAGE SECTION
    private int w_eof = 0;


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("FILE1", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString file1_rec = new CobolString(256);
    private CobolString[] cb_record = new CobolString[100];

    private void a01_main() {
        /* SORT file1 */
        /* RAW: ON ASCENDING file1-key INPUT PROCEDURE a02-release-to-sort */
    }

    private void a03_return_from_sort() {
        System.exit(0);
    }

    private void a02_release_to_sort() {
        for (ix_1 = 1; !(ix_1 > 26); ix_1 += 2) {
            /* RELEASE file1-rec */
        }
        for (ix_1 = 2; !(ix_1 > 26); ix_1 += 2) {
            /* RELEASE file1-rec */
        }
        /* RAW: *  */
    }

    private void a03_return_from_sort_2() {
        for (ix_1 = 1; !((ix_1 > 26 || w_eof == 1)); ix_1 += 1) {
            /* RETURN file1 */
            {
                w_eof = new BigDecimal(String.valueOf(1).trim()).intValue();
            }
            if (!String.valueOf(file1_rec).equals(String.valueOf((1 - Integer.parseInt(String.valueOf(cb_record[ix_1 - 1]).trim()))))) {
                w_eof = new BigDecimal(String.valueOf(1).trim()).intValue();
            }
        }
        if (w_eof == 1) {
            CobolDisplay.display("FAILED: unexpected eof");
        } else {
            /* RETURN file1 */
            {
                /* CONTINUE */
            }
        }
    }

    @Override
    public void run() {
        a01_main();
    }

    public static void main(String[] args) {
        new RunFile102SortWithInputOutputProcedures().run();
    }
}
