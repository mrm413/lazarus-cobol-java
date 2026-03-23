package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc126Pointer extends CobolProgram {
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
    private CobolString xx = new CobolString(1); // Group: XX
    private CobolString xx_1 = new CobolString(4);
    private CobolString xx_2 = new CobolString(4);
    private long p_xx_1 = 0L;
    private long p_xx_2 = 0L;

    // LINKAGE SECTION
    private CobolString y2 = new CobolString(4);


    private CobolString address = new CobolString(256);

    private void para_main() {
        p_xx_1 = new BigDecimal(String.valueOf(address).trim()).longValue();
        p_xx_2 = new BigDecimal(String.valueOf(address).trim()).longValue();
        address.set(String.valueOf(address));
        address.set(String.valueOf(Integer.parseInt(String.valueOf(address).trim()) + (4)));
        if (!String.valueOf(y2).equals(String.valueOf(xx_2))) {
            CobolDisplay.display("Test 2 '" + String.valueOf(y2) + "'");
        }
        if (!String.valueOf(address).equals(String.valueOf(p_xx_2))) {
            CobolDisplay.display("NOK");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc126Pointer().run();
    }
}
