package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc097AllocateCharactersInitializedTo extends CobolProgram {
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
    private long myptr = 0L;

    // LINKAGE SECTION
    private CobolString myfld = new CobolString(4);


    private CobolString address = new CobolString(256);

    // SECTION: ASTART
    private void astart() {
        a01();
    }

    private void a01() {
        /* ALLOCATE — dynamic memory, not typical in Java */
        address.set(String.valueOf(myptr));
        if (!String.valueOf(myfld).equals(String.valueOf("ABCD"))) {
            CobolDisplay.display(String.valueOf(myfld));
        }
        myptr = 0L; /* FREE */
        /* ALLOCATE — dynamic memory, not typical in Java */
        address.set(String.valueOf(myptr));
        if (!String.valueOf(myfld).equals(String.valueOf("ZZZZ"))) {
            CobolDisplay.display(String.valueOf(myfld));
        }
        myptr = 0L; /* FREE */
        /* ALLOCATE — dynamic memory, not typical in Java */
        /* RAW: MYPTR  */
        address.set(String.valueOf(myptr));
        if (!String.valueOf(myfld).equals(String.valueOf("\u0000"))) {
            CobolDisplay.display(String.valueOf(myfld));
        }
        myptr = 0L; /* FREE */
        System.exit(0);
    }

    @Override
    public void run() {
        a01();
    }

    public static void main(String[] args) {
        new RunMisc097AllocateCharactersInitializedTo().run();
    }
}
