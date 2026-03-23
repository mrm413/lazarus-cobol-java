package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions028CallByValueNumericLiteralWithSizeIs extends CobolProgram {
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

    private CobolString size = new CobolString(256);
    private CobolString cb_default = new CobolString(256);
    private CobolString auto = new CobolString(256);
    private CobolString unsigned = new CobolString(256);

    private void para_main() {
        CobolProgram.call("prog2", 4, 0, 0, 1, 0);
        CobolProgram.call("prog2", 1, size, 1, 2, 0, 0, 0);
        CobolProgram.call("prog2", 2, 0, size, 2, 3, 0, 0);
        CobolProgram.call("prog2", 4, 0, 0, size, 4, 4, 0);
        CobolProgram.call("prog2", 8, 0, 0, 0, size, 8, 5);
        CobolProgram.call("prog2", 4, 0, 0, size, cb_default, 6, 0);
        CobolProgram.call("prog2", 4, 0, 0, size, auto, 7, 0);
        CobolProgram.call("prog2", 1, unsigned, size, 1, 2, 0, 0, 0);
        CobolProgram.call("prog2", 2, 0, unsigned, size, 2, 3, 0, 0);
        CobolProgram.call("prog2", 4, 0, 0, unsigned, size, 4, 4, 0);
        CobolProgram.call("prog2", 8, 0, 0, 0, unsigned, size, 8, 5, 0);
        CobolProgram.call("prog2", 4, 0, 0, unsigned, size, auto, 6, 0);
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions028CallByValueNumericLiteralWithSizeIs().run();
    }
}
