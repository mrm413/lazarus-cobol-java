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

public class RunFile095FileSortSequentialVariableRecords extends CobolProgram {
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
    private int rsz = 0;
    private CobolString _1_data = new CobolString(1); // Group: 1-data
    private CobolString filler_1 = new CobolString(14);
    private CobolString filler_2 = new CobolString(14);
    private CobolString filler_3 = new CobolString(14);
    private CobolString filler_4 = new CobolString(14);
    private CobolString filler_5 = new CobolString(14);
    private CobolString filler_6 = new CobolString(14);
    private CobolString filler_7 = new CobolString(14);
    private CobolString filler_8 = new CobolString(14);
    private CobolString filler_9 = new CobolString(14);
    private CobolString filler_10 = new CobolString(14);

    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(12);

    // FILE SECTION — file2
    private CobolString file2_rec = new CobolString(12);


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("ORGANIZATION", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file2 = new CobolFile("ORGANIZATION", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file3 = new CobolFile("FILE3", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString ix_1 = new CobolString(256); // fallback
    private CobolString[] _1_rsz = new CobolString[100]; // fallback array
    private CobolString[] _1_rec = new CobolString[100]; // fallback array

    private void para_main() {
        file1.open("OUTPUT");
        for (int _v = 1; !(Integer.parseInt(String.valueOf(ix_1).trim()) > 10); _v += 2) {
            ix_1.set(String.valueOf(_v));
            rsz = new BigDecimal(String.valueOf(_1_rsz[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]).trim()).intValue();
            file1_rec.set(String.valueOf(_1_rec[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]));
            file1.write(file1_rec);
        }
        for (int _v = 2; !(Integer.parseInt(String.valueOf(ix_1).trim()) > 10); _v += 2) {
            ix_1.set(String.valueOf(_v));
            rsz = new BigDecimal(String.valueOf(_1_rsz[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]).trim()).intValue();
            file1_rec.set(String.valueOf(_1_rec[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]));
            file1.write(file1_rec);
        }
        file1.close();
        { /* SORT file3 (file3) */
            DfsortProgram _sort = new DfsortProgram();
            _sort.setSortKeys(new String[]{});
            _sort.execute();
        }
        /* RAW: ON ASCENDING file3-key1 DESCENDING file3-key2 USING */
        file2.open("INPUT");
        for (int _v = 1; !(Integer.parseInt(String.valueOf(ix_1).trim()) > 10); _v += 1) {
            ix_1.set(String.valueOf(_v));
            if (file2.read(null) == FileStatus.AT_END) {
            }
            rsz = new BigDecimal(String.valueOf(_1_rsz[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]).trim()).intValue();
            if (!String.valueOf(_1_rsz[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]).equals(String.valueOf(rsz))) {
                CobolDisplay.display("FAILED Test " + String.valueOf(ix_1) + ": " + String.valueOf(_1_rsz[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]) + " <> " + String.valueOf(rsz));
            }
            if (!String.valueOf(_1_rec[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]).equals(String.valueOf(file2_rec))) {
                CobolDisplay.display("FAILED Test " + String.valueOf(ix_1) + ": " + String.valueOf(_1_rec[Integer.parseInt(String.valueOf(ix_1).trim()) - 1]) + " <> " + String.valueOf(file2_rec));
            }
        }
        file2.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile095FileSortSequentialVariableRecords().run();
    }
}
