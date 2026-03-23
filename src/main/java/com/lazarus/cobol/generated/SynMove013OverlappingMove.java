package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMove013OverlappingMove extends CobolProgram {
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
    private CobolString structure1 = new CobolString(1); // Group: STRUCTURE1
    private CobolString field1_1 = new CobolString(5);
    private CobolString field1_2 = new CobolString(10);
    private CobolString structure2 = new CobolString(1); // Group: STRUCTURE2
    private CobolString field2_1 = new CobolString(10);
    private CobolString field2_2 = new CobolString(5);
    private CobolString[] field = new CobolString[7];
    private CobolString[] fieldo = new CobolString[7];
    private int numvar = 0;
    private static final int const4 = 4;


    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        structure1.set(String.valueOf(field1_2));
        field1_1.set(String.valueOf(field1_2));
        field1_2.set(String.valueOf(field1_1));
        _unnamed.set(String.valueOf(field1_1));
        field2_2.set(String.valueOf(field1_1));
        field2_1.set(String.valueOf(field1_2));
        field2_2.set(String.valueOf(field2_1));
        field1_2.set(String.valueOf(CobolString.refMod(field2_1, 2, 5)));
        structure1.setRefMod(5, 4, String.valueOf(CobolString.refMod(structure1, 2, 4)));
        structure1.setRefMod(6, 4, String.valueOf(CobolString.refMod(structure1, 2, 4)));
        structure1.setRefMod(3, 13, String.valueOf(CobolString.refMod(structure1, 1, numvar)));
        structure1.setRefMod(3, 13, String.valueOf(CobolString.refMod(structure1, numvar, 1)));
        structure1.setRefMod(1, numvar, String.valueOf(CobolString.refMod(structure1, 3, 13)));
        structure1.setRefMod(numvar, 1, String.valueOf(CobolString.refMod(structure1, 3, 13)));
        structure1.setRefMod(3, 2, String.valueOf(CobolString.refMod(structure1, const4, 2)));
        structure1.setRefMod(2, 4, String.valueOf(CobolString.refMod(structure1, 6, 4)));
        structure1.setRefMod(2, String.valueOf(CobolString.refMod(structure1, 6, 4)));
        structure1.setRefMod(13, 2, String.valueOf(field[6 - 1]));
        structure1.setRefMod(13, 2, String.valueOf(field[5 - 1]));
        structure1.setRefMod(13, 2, String.valueOf(field[numvar - 1]));
        structure1.setRefMod(13, 2, String.valueOf(field[const4 - 1]));
        if (fieldo[1 - 1] == null) fieldo[1 - 1] = new CobolString(256);
        fieldo[1 - 1].set(String.valueOf(fieldo[1 - 1]));
        if (fieldo[const4 - 1] == null) fieldo[const4 - 1] = new CobolString(256);
        fieldo[const4 - 1].set(String.valueOf(fieldo[const4 - 1]));
        if (fieldo[2 - 1] == null) fieldo[2 - 1] = new CobolString(256);
        fieldo[2 - 1].set(String.valueOf(fieldo[1 - 1]));
        if (fieldo[const4 - 1] == null) fieldo[const4 - 1] = new CobolString(256);
        fieldo[const4 - 1].set(String.valueOf(fieldo[4 - 1]));
        if (fieldo[4 - 1] == null) fieldo[4 - 1] = new CobolString(256);
        fieldo[4 - 1].set(String.valueOf(fieldo[const4 - 1]));
        if (fieldo[numvar - 1] == null) fieldo[numvar - 1] = new CobolString(256);
        fieldo[numvar - 1].set(String.valueOf(fieldo[4 - 1]));
        if (fieldo[4 - 1] == null) fieldo[4 - 1] = new CobolString(256);
        fieldo[4 - 1].set(String.valueOf(fieldo[numvar - 1]));
        if (fieldo[numvar - 1] == null) fieldo[numvar - 1] = new CobolString(256);
        fieldo[numvar - 1].set(String.valueOf(fieldo[numvar - 1]));
        CobolString.setRefMod(fieldo, numvar - 1, 2, 1, String.valueOf(CobolString.refMod(fieldo[numvar - 1], 1, 1)));
        if (fieldo[numvar - 1] == null) fieldo[numvar - 1] = new CobolString(256);
        fieldo[numvar - 1].set(String.valueOf(CobolString.refMod(fieldo[numvar - 1], 2, 1)));
        if (fieldo[const4 - 1] == null) fieldo[const4 - 1] = new CobolString(256);
        fieldo[const4 - 1].set(String.valueOf(CobolString.refMod(fieldo[4 - 1], 2, 1)));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMove013OverlappingMove().run();
    }
}
