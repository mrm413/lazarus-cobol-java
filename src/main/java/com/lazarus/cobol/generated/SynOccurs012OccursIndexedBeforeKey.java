package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynOccurs012OccursIndexedBeforeKey extends CobolProgram {
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
    private int idx1 = 0;
    private int idx2 = 0;
    // WORKING-STORAGE SECTION
    private CobolString tab = new CobolString(1); // Group: TAB
    private CobolString[] tab_entry1 = new CobolString[5]; // Group: TAB-ENTRY1
    private int[] x1 = new int[5];
    private CobolString[] y1 = new CobolString[5];
    private CobolString[] tab_entry = new CobolString[2]; // Group: TAB-ENTRY
    private int[] x2 = new int[2];
    private CobolString[] y2 = new CobolString[2];



    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new SynOccurs012OccursIndexedBeforeKey().run();
    }
}
