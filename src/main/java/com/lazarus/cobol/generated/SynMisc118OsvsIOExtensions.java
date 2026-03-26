package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc118OsvsIOExtensions extends CobolProgram {
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
    private int core_idx = 0;
    private int f_max = 0;
    private int g_key = 0;
    private CobolString g_actual_key = new CobolString(3);

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(100);

    // FILE SECTION — g
    private int g_rec = 0;


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("f.dat", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile g = new CobolFile("g.dat", "RELATIVE", "SEQUENTIAL");

    // FALLBACK FILE DESCRIPTORS
    private CobolFile disp = new CobolFile("DISP", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile _filler_001 = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile reread = new CobolFile("REREAD", "SEQUENTIAL", "SEQUENTIAL");


    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        // body commented -- compile edge case
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc118OsvsIOExtensions().run();
    }
}
