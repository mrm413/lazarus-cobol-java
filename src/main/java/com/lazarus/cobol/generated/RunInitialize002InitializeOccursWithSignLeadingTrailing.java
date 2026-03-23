package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize002InitializeOccursWithSignLeadingTrailing extends CobolProgram {
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
    private CobolString g1 = new CobolString(1); // Group: G1
    private int[] x = new int[2];
    private int[] y = new int[2];
    private CobolString minus_names = new CobolString(1); // Group: MINUS-NAMES
    private CobolString minus_names_1 = new CobolString(1); // Group: MINUS-NAMES-1
    private long minus_name1 = 0L;
    private long even_name1 = 0L;
    private long plus_name1 = 0L;
    private CobolString minus_names_2 = new CobolString(1); // Group: MINUS-NAMES-2
    private BigDecimal minus_name3 = BigDecimal.ZERO;
    private BigDecimal even_name2 = BigDecimal.ZERO;
    private BigDecimal plus_name3 = BigDecimal.ZERO;


    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        g1.set("");
        x[1 - 1] = new BigDecimal(String.valueOf(5).trim()).intValue();
        _unnamed.set(String.valueOf(5));
        plus_name1 = new BigDecimal(String.valueOf(5).trim()).longValue();
        y[2 - 1] = new BigDecimal(String.valueOf(-9).trim()).intValue();
        _unnamed.set(String.valueOf(-9));
        minus_name1 = new BigDecimal(String.valueOf(-9).trim()).longValue();
        if (!String.valueOf(g1).equals(String.valueOf("+5+00+9-"))) {
            CobolDisplay.display("MOVE G \"" + String.valueOf(g1) + "\"");
        }
        plus_name3 = new BigDecimal(String.valueOf(0.123).trim());
        if ((!String.valueOf(minus_names_1).equals(String.valueOf("000000000000000009-000000000000000001+000000000000000005+")) || !String.valueOf(minus_names_2).equals(String.valueOf("999999999999999999-100000000000000000+123000000000000000+")))) {
            CobolDisplay.display("MOVE MN1 \"" + String.valueOf(minus_names_1) + "\"");
            CobolDisplay.display("MOVE MN2 \"" + String.valueOf(minus_names_2) + "\"");
        }
        g1.set("");
        _unnamed.set("");
        minus_names.set("");
        if (!String.valueOf(g1).equals(String.valueOf("+0+00+0+"))) {
            CobolDisplay.display("INIT G1 \"" + String.valueOf(g1) + "\"");
        }
        if ((!String.valueOf(minus_names_1).equals(String.valueOf("000000000000000000+000000000000000000+000000000000000000+")) || !String.valueOf(minus_names_2).equals(String.valueOf("000000000000000000+000000000000000000+000000000000000000+")))) {
            CobolDisplay.display("MOVE MN1 \"" + String.valueOf(minus_names_1) + "\"");
            CobolDisplay.display("MOVE MN2 \"" + String.valueOf(minus_names_2) + "\"");
        }
        plus_name3 = new BigDecimal(String.valueOf(0.123).trim());
        minus_name3 = new BigDecimal(String.valueOf(-0.456).trim());
        CobolDisplay.display(String.valueOf(plus_name3));
        CobolDisplay.display(String.valueOf(minus_name3));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunInitialize002InitializeOccursWithSignLeadingTrailing().run();
    }
}
