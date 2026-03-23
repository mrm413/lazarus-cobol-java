package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental089UseForDebuggingReferencingBasedItem extends CobolProgram {
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
    private CobolString data_field = new CobolString(40);
    private long ptr = 0L;
    private CobolString data_field3 = new CobolString(13);

    // LINKAGE SECTION
    private CobolString data_field2 = new CobolString(10);


    private CobolString address = new CobolString(256);

    // SECTION: TEST-DEBUG
    private void test_debug() {
        use();
        data_field3();
    }

    private void use() {
        /* RAW: FOR DEBUGGING ON ALL REFERENCES OF */
    }

    private void data_field3() {
        CobolDisplay.display(String.valueOf(debug_item) + "|");
    }

    private void some_par() {
        /* ALLOCATE — dynamic memory, not typical in Java */
        address.set(String.valueOf(ptr));
        /* ALLOCATE — dynamic memory, not typical in Java */
        data_field.set(""); /* FREE */
        /* ALLOCATE — dynamic memory, not typical in Java */
        ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
        ptr = 0L; /* FREE */
        address.set(String.valueOf(0));
        /* ALLOCATE — dynamic memory, not typical in Java */
        ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
        data_field3.set(""); /* FREE */
        System.exit(0);
    }

    @Override
    public void run() {
        some_par();
    }

    public static void main(String[] args) {
        new RunFundamental089UseForDebuggingReferencingBasedItem().run();
    }
}
