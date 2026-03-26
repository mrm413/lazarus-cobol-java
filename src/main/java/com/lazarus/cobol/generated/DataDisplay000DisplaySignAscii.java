package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay000DisplaySignAscii extends CobolProgram {
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
    private CobolString g = new CobolString(1); // Group: G
    private CobolString x = new CobolString(5);
    private int x_9 = 0;
    private int x_s9 = 0;
    private int x_s9_l = 0;
    private int x_s9_ls = 0;
    private int x_s9_t = 0;
    private int x_s9_ts = 0;



    private void para_main() {
        x.set(String.valueOf(0));
        x_9 = new BigDecimal(String.valueOf(1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9 = new BigDecimal(String.valueOf(1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9 = new BigDecimal(String.valueOf(-1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9_l = new BigDecimal(String.valueOf(1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9_l = new BigDecimal(String.valueOf(-1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9_ls = new BigDecimal(String.valueOf(1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9_ls = new BigDecimal(String.valueOf(-1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9_t = new BigDecimal(String.valueOf(1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9_t = new BigDecimal(String.valueOf(-1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9_ts = new BigDecimal(String.valueOf(1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        x.set(String.valueOf(0));
        x_s9_ts = new BigDecimal(String.valueOf(-1234).trim()).intValue();
        CobolDisplay.display(String.valueOf(x));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataDisplay000DisplaySignAscii().run();
    }
}
