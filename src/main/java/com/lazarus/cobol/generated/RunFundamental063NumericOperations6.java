package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental063NumericOperations6 extends CobolProgram {
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
    private int p_field1 = 0;
    private int p_field2 = 0;



    private void para_main() {
        p_field1 = new BigDecimal(String.valueOf(5000).trim()).intValue();
        p_field1 = new BigDecimal(String.valueOf(p_field1 + 5).trim()).intValue();
        if (p_field1 != 5000) {
            CobolDisplay.display("Error: Add 5 to PIC 99PPP.");
        }
        CobolProgram.call("dump", p_field1);
        p_field1 = new BigDecimal(String.valueOf(p_field1 + 5000).trim()).intValue();
        if (p_field1 != 10000) {
            CobolDisplay.display("Error: Add 5000 to PIC 99PPP.");
        }
        CobolProgram.call("dump", p_field1);
        p_field2 = new BigDecimal(String.valueOf(0.00055).trim()).intValue();
        p_field2 = new BigDecimal(String.valueOf(p_field2 + 0.00033).trim()).intValue();
        if (p_field2 != 0.00088) {
            CobolDisplay.display("Error: Add 0.00033 to PIC PPP99.");
        }
        CobolProgram.call("dump", p_field2);
        p_field2 = new BigDecimal(String.valueOf(0.00055).trim()).intValue();
        p_field2 = new BigDecimal(String.valueOf(p_field2 + 0.003).trim()).intValue();
        if (p_field2 != 0.00055) {
            CobolDisplay.display("Error: Add 0.00300 to PIC PPP99.");
        }
        CobolProgram.call("dump", p_field2);
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental063NumericOperations6().run();
    }
}
