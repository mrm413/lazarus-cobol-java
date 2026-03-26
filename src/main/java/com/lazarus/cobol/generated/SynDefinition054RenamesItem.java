package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition054RenamesItem extends CobolProgram {
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
    private CobolString a = new CobolString(1); // Group: a
    private int b = 0;
    private CobolString c = new CobolString(1); // Group: c
    private int d = 0;
    private int e = 0;
    private CobolString f = new CobolString(1); // Group: f
    private CobolString g = new CobolString(1);
    private CobolString i = new CobolString(1);
    private CobolString[] j = new CobolString[5]; // Group: j
    private CobolString[] k = new CobolString[5];
    private int[] l = new int[5];
    private int m = 0;
    private long n = 0L;
    private CobolString o = new CobolString(1); // Group: o
    private CobolString[] p = new CobolString[10];
    private static final String my_ext_const = "123";
    private CobolString my_std_const = new CobolString(1);


    private CobolString valid_2 = new CobolString(256); // fallback
    private CobolString valid_1 = new CobolString(256); // fallback

    private void para_main() {
        CobolDisplay.display(String.valueOf(valid_2));
        if (String.valueOf(valid_1).equals(String.valueOf(1))) {
            /* CONTINUE */
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynDefinition054RenamesItem().run();
    }
}
