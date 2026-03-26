package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions098FunctionSubstituteCaseWithReferenceMod extends CobolProgram {
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
    private CobolString y = new CobolString(20);
    private CobolString z = new CobolString(20);


    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString _2 = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _9 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString to = new CobolString(256); // fallback

    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private void para_main() {
        y.set(String.valueOf("abc111444555defxxabc"));
        _filler_004.set(String.valueOf(CobolIntrinsics.substitute_case(y, "ABC", "zz", "55", "666")));
        _2.set(String.valueOf(CobolIntrinsics.substitute_case(y, "ABC", "zz", "55", "666")));
        _filler_005.set(String.valueOf(CobolIntrinsics.substitute_case(y, "ABC", "zz", "55", "666")));
        _9.set(String.valueOf(CobolIntrinsics.substitute_case(y, "ABC", "zz", "55", "666")));
        _filler_006.set(String.valueOf(CobolIntrinsics.substitute_case(y, "ABC", "zz", "55", "666")));
        to.set(String.valueOf(CobolIntrinsics.substitute_case(y, "ABC", "zz", "55", "666")));
        z.set(String.valueOf(CobolIntrinsics.substitute_case(y, "ABC", "zz", "55", "666")));
        if (!String.valueOf(z).equals(String.valueOf("z11144466"))) {
            CobolDisplay.display(String.valueOf(z));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions098FunctionSubstituteCaseWithReferenceMod().run();
    }
}
