package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMultiply001CategoryCheckOfFormat2 extends CobolProgram {
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
    private CobolString x_x = new CobolString(1);
    private int x_9 = 0;
    private CobolString x_09 = new CobolString(2);


    private CobolString _789 = new CobolString(256);
    private CobolString c = new CobolString(256);

    private void para_main() {
        _789.set(String.valueOf(123 * 456));
        c.set(String.valueOf(0 /* non-numeric literal: a */ * 0 /* non-numeric literal: b */));
        c.set(String.valueOf(123 * 456));
        x_09.set(String.valueOf(Integer.parseInt(String.valueOf(x_x).trim()) * x_9));
        x_x.set(String.valueOf(x_9 * Integer.parseInt(String.valueOf(x_09).trim())));
        x_x.set(String.valueOf(123 * 456));
        x_9 = new BigDecimal(String.valueOf(Integer.parseInt(String.valueOf(x_09).trim()) * Integer.parseInt(String.valueOf(x_x).trim())).trim()).intValue();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMultiply001CategoryCheckOfFormat2().run();
    }
}
