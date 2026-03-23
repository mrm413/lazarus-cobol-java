package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc096AllocateFreeWithBasedItem2 extends CobolProgram {
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
    private CobolString myfld = new CobolString(1); // Group: MYFLD
    private CobolString myfldx = new CobolString(1);
    private int myfld9 = 0;


    private CobolString address = new CobolString(256);

    private void para_main() {
        if (!String.valueOf(address).equals(String.valueOf(0))) {
            CobolDisplay.display("BASED ITEM WITH ADDRESS ON START");
        }
        myfld.set(""); /* FREE */
        /* ALLOCATE — dynamic memory, not typical in Java */
        if (String.valueOf(address).equals(String.valueOf(0))) {
            CobolDisplay.display("BASED ITEM WITHOUT ADDRESS AFTER ALLOCATE");
        }
        myfld.set("");
        if (!String.valueOf(myfld).equals(String.valueOf(" 0"))) {
            CobolDisplay.displayNoAdvancing("BASED ITEM INITIALIZED WRONG: ");
            CobolDisplay.display(String.valueOf(myfld));
        }
        address.set(""); /* FREE */
        if (!String.valueOf(address).equals(String.valueOf(0))) {
            CobolDisplay.display("BASED ITEM WITH ADDRESS AFTER FREE");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc096AllocateFreeWithBasedItem2().run();
    }
}
