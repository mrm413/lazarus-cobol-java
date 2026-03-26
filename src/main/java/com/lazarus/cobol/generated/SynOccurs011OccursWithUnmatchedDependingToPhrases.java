package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynOccurs011OccursWithUnmatchedDependingToPhrases extends CobolProgram {
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
    private int y = 0;
    private CobolString xtab = new CobolString(1); // Group: XTAB
    private CobolString[] x = new CobolString[10];
    private CobolString xtab2 = new CobolString(1); // Group: XTAB2
    private CobolString[] x2 = new CobolString[10];
    private CobolString xtab3 = new CobolString(1); // Group: XTAB3
    private CobolString[] x3 = new CobolString[10];


    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private void para_main() {
        if (x[1 - 1] == null) x[1 - 1] = new CobolString(256);
        x[1 - 1].set(String.valueOf("A"));
        _filler_002.set(String.valueOf("A"));
        if (x2[2 - 1] == null) x2[2 - 1] = new CobolString(256);
        x2[2 - 1].set(String.valueOf("A"));
        _filler_003.set(String.valueOf("A"));
        if (x3[3 - 1] == null) x3[3 - 1] = new CobolString(256);
        x3[3 - 1].set(String.valueOf("A"));
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynOccurs011OccursWithUnmatchedDependingToPhrases().run();
    }
}
