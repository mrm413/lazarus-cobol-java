package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked006PackedDecimalArithmetic extends CobolProgram {
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
    private static final String fence = "ABBAAB";
    private CobolString fence_a = new CobolString(3);
    private BigDecimal x = BigDecimal.ZERO;
    private CobolString fence_b = new CobolString(3);
    private BigDecimal y = BigDecimal.ZERO;
    private BigDecimal z = BigDecimal.ZERO;
    private CobolString fence_1 = new CobolString(3);
    private BigDecimal x_9 = BigDecimal.ZERO;
    private CobolString fence_2 = new CobolString(3);
    private BigDecimal x_99 = BigDecimal.ZERO;
    private CobolString fence_3 = new CobolString(3);
    private BigDecimal x_920 = BigDecimal.ZERO;
    private CobolString fence_4 = new CobolString(3);
    private BigDecimal x_921 = BigDecimal.ZERO;
    private CobolString fence_5 = new CobolString(3);
    private int b_99 = 0;
    private int b_999 = 0;



    private void para_main() {
        x = new BigDecimal(String.valueOf(1).trim());
        if (x.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("01 <" + String.valueOf(x) + ">");
        }
        if (!String.valueOf(fence_a).equals(String.valueOf(fence))) {
            fence_a.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-A");
        }
        if (!String.valueOf(fence_b).equals(String.valueOf(fence))) {
            fence_b.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-B");
        }
        x = new BigDecimal(String.valueOf(y).trim());
        if (x.compareTo(new BigDecimal(String.valueOf(9).trim())) != 0) {
            CobolDisplay.display("09 <" + String.valueOf(x) + ">");
        }
        if (!String.valueOf(fence_a).equals(String.valueOf(fence))) {
            fence_a.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-A");
        }
        if (!String.valueOf(fence_b).equals(String.valueOf(fence))) {
            fence_b.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-B");
        }
        x = new BigDecimal(String.valueOf(x.add(y)).trim());
        if (z.compareTo(new BigDecimal(String.valueOf(-56).trim())) < 0) {
            CobolDisplay.display("-55 >= " + String.valueOf(z));
        }
        if (!String.valueOf(fence_a).equals(String.valueOf(fence))) {
            fence_a.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-A");
        }
        if (!String.valueOf(fence_b).equals(String.valueOf(fence))) {
            fence_b.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-B");
        }
        x_99 = new BigDecimal(String.valueOf(b_999).trim());
        if (x_99.compareTo(new BigDecimal(String.valueOf(23).trim())) != 0) {
            CobolDisplay.display("trunk 123 -> 99: " + String.valueOf(x_99));
        }
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        x_9 = new BigDecimal(String.valueOf(b_999).trim());
        if (x_9.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("trunk 123 -> 9: " + String.valueOf(x_9));
        }
        if (!String.valueOf(fence_1).equals(String.valueOf(fence))) {
            fence_1.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-1");
        }
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        x_99 = new BigDecimal(String.valueOf(b_99).trim());
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        x_920 = new BigDecimal(String.valueOf(b_999).trim());
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        x_921 = new BigDecimal(String.valueOf(x_99).trim());
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-5");
        }
        b_99 = new BigDecimal(String.valueOf(x_99.add(x_920)).trim()).intValue();
        if (b_99 != 222) {
            CobolDisplay.display("!222: " + String.valueOf(b_99));
        }
        if (x_920.compareTo(new BigDecimal(String.valueOf(124).trim())) > 0) {
            CobolDisplay.display("> 124 " + String.valueOf(x_920));
        }
        if (x_921.compareTo(new BigDecimal(String.valueOf(98).trim())) < 0) {
            CobolDisplay.display("< 98 " + String.valueOf(x_921));
        }
        if (!String.valueOf(fence_1).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-1");
        }
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-2");
        }
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-3");
        }
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-4");
        }
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            CobolDisplay.display("broken FENCE-5");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked006PackedDecimalArithmetic().run();
    }
}
