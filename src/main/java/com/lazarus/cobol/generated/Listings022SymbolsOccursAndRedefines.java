package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Listings022SymbolsOccursAndRedefines extends CobolProgram {
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
    private static final int i = 20;
    private static final int j = 5000;
    private static final int m = 5;
    private CobolString setup_rec = new CobolString(1); // Group: SETUP-REC
    private CobolString fl1 = new CobolString(4);
    private CobolString fl2 = new CobolString(5);
    private int fl3 = 0;
    private short fl4 = (short) 0;
    private short fl5 = (short) 0;
    private CobolString fl6 = new CobolString(5);
    private int fl7 = 0;
    private CobolString fl8 = new CobolString(4);
    private int fl9 = 0;
    private CobolString fla = new CobolString(1); // Group: FLA
    private CobolString[] flb = new CobolString[100]; // Group: FLB
    private CobolString[] flc = new CobolString[100];
    private CobolString fld = new CobolString(20);
    private CobolString fld1 = new CobolString(100);
    private CobolString[] fld2 = new CobolString[100]; // Group: FLD2
    private CobolString fld3 = new CobolString(3);
    private CobolString fld4 = new CobolString(4);

    // LINKAGE SECTION
    private CobolString[] o1 = new CobolString[100];
    private CobolString o2 = new CobolString(1); // Group: O2
    private CobolString o_start = new CobolString(42);
    private CobolString[] o_entry = new CobolString[100]; // Group: O-ENTRY
    private int[] o_e1 = new int[100];
    private CobolString[] o_e2 = new CobolString[100];



    private void para_main() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Listings022SymbolsOccursAndRedefines().run();
    }
}
