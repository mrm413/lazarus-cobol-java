package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc114BasedClauseAllocateFreeStatements extends CobolProgram {
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
    private CobolString str = new CobolString(1); // Group: str
    private CobolString str_1 = new CobolString(2);
    private CobolString str_2 = new CobolString(1); // Group: str-2
    private CobolString str_2a = new CobolString(1);
    private int str_2b = 0;
    private CobolString one = new CobolString(2);
    private int seven = 0;
    private int cb_var = 0;
    private long ptr = 0L;


    private CobolString address = new CobolString(256);

    private void para_main() {
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* RAW: ptr  */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* ALLOCATE — dynamic memory, not typical in Java */
        cb_var = 0; /* FREE */
        address.set(""); /* FREE */
        one.set(""); /* FREE */
        address.set(""); /* FREE */
        ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
        ptr = 0L; /* FREE */
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc114BasedClauseAllocateFreeStatements().run();
    }
}
