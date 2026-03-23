package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental056RoundedTowardLesser extends CobolProgram {
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
    private int m = 0;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private int q = 0;
    private int r = 0;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private int v = 0;



    private void para_main() {
        m = new BigDecimal(String.valueOf(2.49).trim()).intValue();
        n = new BigDecimal(String.valueOf(-2.49).trim()).intValue();
        o = new BigDecimal(String.valueOf(2.5).trim()).intValue();
        p = new BigDecimal(String.valueOf(-2.5).trim()).intValue();
        q = new BigDecimal(String.valueOf(3.49).trim()).intValue();
        r = new BigDecimal(String.valueOf(-3.49).trim()).intValue();
        s = new BigDecimal(String.valueOf(3.5).trim()).intValue();
        t = new BigDecimal(String.valueOf(-3.5).trim()).intValue();
        u = new BigDecimal(String.valueOf(3.51).trim()).intValue();
        v = new BigDecimal(String.valueOf(-3.51).trim()).intValue();
        CobolDisplay.displayNoAdvancing(String.valueOf(m) + " " + String.valueOf(n) + " " + String.valueOf(o) + " " + String.valueOf(p) + " " + String.valueOf(q) + " " + String.valueOf(r) + " " + String.valueOf(s) + " " + String.valueOf(t) + " " + String.valueOf(u) + " " + String.valueOf(v));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental056RoundedTowardLesser().run();
    }
}
