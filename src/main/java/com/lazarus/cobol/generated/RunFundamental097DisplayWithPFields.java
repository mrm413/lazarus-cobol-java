package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental097DisplayWithPFields extends CobolProgram {
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
    private int p1 = 0;
    private int p2 = 0;
    private BigDecimal p3 = BigDecimal.ZERO;
    private BigDecimal p4 = BigDecimal.ZERO;
    private BigDecimal p5 = BigDecimal.ZERO;
    private int p6 = 0;


    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        CobolDisplay.display("00=" + String.valueOf(p2) + "; 001=" + String.valueOf(p1) + "; 00=" + String.valueOf(p2) + ";");
        CobolDisplay.display(".00=" + String.valueOf(p4) + "; .000=" + String.valueOf(p5) + "; .123=" + String.valueOf(p3) + "; " + ".00=" + String.valueOf(p4) + "; .000=" + String.valueOf(p5) + ";");
        p2 = new BigDecimal(String.valueOf(p1).trim()).intValue();
        p4 = new BigDecimal(String.valueOf(p3).trim());
        _unnamed.set(String.valueOf(p3));
        p5 = new BigDecimal(String.valueOf(p3).trim());
        CobolDisplay.display("00=" + String.valueOf(p2) + "; .02=" + String.valueOf(p4) + "; .003=" + String.valueOf(p5) + ";");
        CobolDisplay.display("10=" + String.valueOf(p6) + ";");
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental097DisplayWithPFields().run();
    }
}
