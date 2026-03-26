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

public class RunFile103SortWithKey1AscendingKey2Descending extends CobolProgram {
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
    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(3);

    // FILE SECTION — file2
    private CobolString file2_rec = new CobolString(3);


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("ORGANIZATION", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file2 = new CobolFile("ORGANIZATION", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file3 = new CobolFile("FILE3", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        { /* SORT file3 (file3) */
            DfsortProgram _sort = new DfsortProgram();
            _sort.setSortKeys(new String[]{});
            _sort.execute();
        }
        /* RAW: ON ASCENDING file3-key1 DESCENDING file3-key2 USING */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile103SortWithKey1AscendingKey2Descending().run();
    }
}
