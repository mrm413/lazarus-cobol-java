package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc146AlphanumericMoveWithTruncation extends CobolProgram {
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
    private CobolString x_left = new CobolString(3);
    private CobolString x_right = new CobolString(3);


    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        x_left.set(String.valueOf("1234"));
        _unnamed.set(String.valueOf("1234"));
        x_right.set(String.valueOf("1234"));
        if ((!String.valueOf(x_left).equals(String.valueOf("123")) || !String.valueOf(x_right).equals(String.valueOf("234")))) {
            CobolDisplay.display("error with \"1234\":");
            CobolDisplay.display(String.valueOf(x_left));
            CobolDisplay.display(String.valueOf(x_right));
        }
        x_left.set(String.valueOf("   3"));
        _unnamed.set(String.valueOf("   3"));
        x_right.set(String.valueOf("   3"));
        if ((!String.valueOf(x_left).equals(String.valueOf(" ")) || !String.valueOf(x_right).equals(String.valueOf("  3")))) {
            CobolDisplay.display("error with \"   3\":");
            CobolDisplay.display(String.valueOf(x_left));
            CobolDisplay.display(String.valueOf(x_right));
        }
        x_left.set(String.valueOf("3   "));
        _unnamed.set(String.valueOf("3   "));
        x_right.set(String.valueOf("3   "));
        if ((!String.valueOf(x_left).equals(String.valueOf("3")) || !String.valueOf(x_right).equals(String.valueOf(" ")))) {
            CobolDisplay.display("error with \"3   \":");
            CobolDisplay.display(String.valueOf(x_left));
            CobolDisplay.display(String.valueOf(x_right));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc146AlphanumericMoveWithTruncation().run();
    }
}
