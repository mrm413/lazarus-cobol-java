package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions006AddressOf extends CobolProgram {
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
    private CobolString x_1 = new CobolString(3);
    private CobolString x_2 = new CobolString(3);
    private CobolString g = new CobolString(1); // Group: G
    private long ptr_1 = 0L;
    private long ptr_2 = 0L;

    // LINKAGE SECTION
    private CobolString y = new CobolString(3);


    private CobolString address = new CobolString(256);

    private void para_main() {
        address.set(String.valueOf(address));
        if (!String.valueOf(y).equals(String.valueOf("X-1"))) {
            CobolDisplay.display("Test 1 " + String.valueOf(y));
        }
        ptr_1 = new BigDecimal(String.valueOf(address).trim()).longValue();
        ptr_2 = new BigDecimal(String.valueOf(ptr_1).trim()).longValue();
        address.set(String.valueOf(ptr_2));
        if (!String.valueOf(y).equals(String.valueOf("X-2"))) {
            CobolDisplay.display("Test 2 " + String.valueOf(y));
        }
    }

    private void ptr_1() {
        if (!String.valueOf(ptr_1).equals(String.valueOf(0))) {
            CobolDisplay.display("NG 1");
        }
        address.set(String.valueOf(0));
        if (!String.valueOf(ptr_1).equals(String.valueOf(address))) {
            CobolDisplay.display("NG 2");
        }
        if (!String.valueOf(address).equals(String.valueOf(ptr_1))) {
            CobolDisplay.display("NG 3");
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions006AddressOf().run();
    }
}
