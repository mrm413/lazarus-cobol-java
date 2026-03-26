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
    private CobolString _1_values = new CobolString(1); // Group: 1-values
    private CobolString filler_1 = new CobolString(1);
    private CobolString filler_2 = new CobolString(1);
    private CobolString filler_3 = new CobolString(1);
    private CobolString filler_4 = new CobolString(1);
    private CobolString filler_5 = new CobolString(1);
    private CobolString filler_6 = new CobolString(1);
    private CobolString filler_7 = new CobolString(1);
    private CobolString filler_8 = new CobolString(1);
    private CobolString filler_9 = new CobolString(1);
    private CobolString filler_10 = new CobolString(1);
    private CobolString filler_11 = new CobolString(1);
    private CobolString filler_12 = new CobolString(1);
    private CobolString filler_13 = new CobolString(1);
    private CobolString filler_14 = new CobolString(1);
    private CobolString filler_15 = new CobolString(1);
    private CobolString filler_16 = new CobolString(1);
    private CobolString filler_17 = new CobolString(1);
    private CobolString filler_18 = new CobolString(1);
    private CobolString filler_19 = new CobolString(1);
    private CobolString filler_20 = new CobolString(1);
    private CobolString filler_21 = new CobolString(1);
    private CobolString filler_22 = new CobolString(1);
    private CobolString filler_23 = new CobolString(1);
    private CobolString filler_24 = new CobolString(1);
    private CobolString filler_25 = new CobolString(1);
    private CobolString filler_26 = new CobolString(1);
    private CobolString[] _1_record = new CobolString[26]; // Group: 1-record
    private int[] _1_key = new int[26];
    private CobolString[] _1_data = new CobolString[26];


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("FILE1", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString file1_rec = new CobolString(256); // fallback

    private void a01_main() {
        { /* SORT file1 (file1) */
            DfsortProgram _sort = new DfsortProgram();
            _sort.setSortKeys(new String[]{});
            _sort.execute();
        }
        /* RAW: ON ASCENDING file1-key INPUT PROCEDURE a02-release-to-sort */
        System.exit(0);
    }

    @Override
    public void run() {
        a01_main();
    }

    public static void main(String[] args) {
        new RunFile102SortWithInputOutputProcedures().run();
    }
}
