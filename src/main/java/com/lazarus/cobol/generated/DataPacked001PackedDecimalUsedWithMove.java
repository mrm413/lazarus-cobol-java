package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked001PackedDecimalUsedWithMove extends CobolProgram {
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
    private CobolString fence_1 = new CobolString(3);
    private BigDecimal x_99 = BigDecimal.ZERO;
    private CobolString fence_2 = new CobolString(3);
    private BigDecimal x_s99 = BigDecimal.ZERO;
    private CobolString fence_3 = new CobolString(3);
    private BigDecimal x_999 = BigDecimal.ZERO;
    private CobolString fence_4 = new CobolString(3);
    private BigDecimal x_s999 = BigDecimal.ZERO;
    private CobolString fence_5 = new CobolString(3);
    private BigDecimal x_calc = BigDecimal.ZERO;
    private CobolString fence_6 = new CobolString(3);
    private int c_p234 = 0;
    private int c_n234 = 0;
    private int c_p1234 = 0;
    private int c_n1234 = 0;
    private int b_p1234 = 0;
    private int b_n1234 = 0;



    private void para_main() {
        x_99 = new BigDecimal(String.valueOf(c_p1234).trim());
        CobolDisplay.display();
    }

    private void x_99() {
        if (!String.valueOf(fence_1).equals(String.valueOf(fence))) {
            fence_1.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-1");
        }
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        x_s99 = new BigDecimal(String.valueOf(c_p1234).trim());
        CobolDisplay.display();
    }

    private void x_s99() {
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        x_999 = new BigDecimal(String.valueOf(c_p1234).trim());
        CobolDisplay.display();
    }

    private void x_999() {
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        x_s999 = new BigDecimal(String.valueOf(c_p1234).trim());
        CobolDisplay.display();
    }

    private void x_s999() {
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-5");
        }
        x_99 = new BigDecimal(String.valueOf(c_n1234).trim());
        CobolDisplay.display();
    }

    private void x_99_2() {
        if (!String.valueOf(fence_1).equals(String.valueOf(fence))) {
            fence_1.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-1");
        }
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        x_s99 = new BigDecimal(String.valueOf(c_n1234).trim());
        CobolDisplay.display();
    }

    private void x_s99_2() {
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        x_999 = new BigDecimal(String.valueOf(c_n1234).trim());
        CobolDisplay.display();
    }

    private void x_999_2() {
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        x_s999 = new BigDecimal(String.valueOf(c_n1234).trim());
        CobolDisplay.display();
    }

    private void x_s999_2() {
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-5");
        }
        x_999 = new BigDecimal(String.valueOf(b_n1234).trim());
        CobolDisplay.display();
    }

    private void x_999_3() {
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        x_s999 = new BigDecimal(String.valueOf(b_n1234).trim());
        CobolDisplay.display();
    }

    private void x_s999_3() {
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-5");
        }
        x_99 = new BigDecimal(String.valueOf(c_p234).trim());
        CobolDisplay.display();
    }

    private void x_99_3() {
        if (!String.valueOf(fence_1).equals(String.valueOf(fence))) {
            fence_1.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-1");
        }
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        x_s99 = new BigDecimal(String.valueOf(c_p234).trim());
        CobolDisplay.display();
    }

    private void x_s99_3() {
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        x_999 = new BigDecimal(String.valueOf(c_p234).trim());
        CobolDisplay.display();
    }

    private void x_999_4() {
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        x_s999 = new BigDecimal(String.valueOf(c_p234).trim());
        CobolDisplay.display();
    }

    private void x_s999_4() {
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-5");
        }
        x_99 = new BigDecimal(String.valueOf(c_n234).trim());
        CobolDisplay.display();
    }

    private void x_99_4() {
        if (!String.valueOf(fence_1).equals(String.valueOf(fence))) {
            fence_1.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-1");
        }
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        x_s99 = new BigDecimal(String.valueOf(c_n234).trim());
        CobolDisplay.display();
    }

    private void x_s99_4() {
        if (!String.valueOf(fence_2).equals(String.valueOf(fence))) {
            fence_2.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-2");
        }
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        x_999 = new BigDecimal(String.valueOf(c_n234).trim());
        CobolDisplay.display();
    }

    private void x_999_5() {
        if (!String.valueOf(fence_3).equals(String.valueOf(fence))) {
            fence_3.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-3");
        }
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        x_s999 = new BigDecimal(String.valueOf(c_n234).trim());
        CobolDisplay.display();
    }

    private void x_s999_5() {
        if (!String.valueOf(fence_4).equals(String.valueOf(fence))) {
            fence_4.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-4");
        }
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-5");
        }
        x_calc = new BigDecimal(String.valueOf(0).trim());
        CobolDisplay.display();
    }

    private void x_calc() {
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-5");
        }
        if (!String.valueOf(fence_6).equals(String.valueOf(fence))) {
            fence_6.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-6");
        }
        x_calc = new BigDecimal(String.valueOf(1).trim());
        CobolDisplay.display();
    }

    private void x_calc_2() {
        if (!String.valueOf(fence_5).equals(String.valueOf(fence))) {
            fence_5.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-5");
        }
        if (!String.valueOf(fence_6).equals(String.valueOf(fence))) {
            fence_6.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-6");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked001PackedDecimalUsedWithMove().run();
    }
}
