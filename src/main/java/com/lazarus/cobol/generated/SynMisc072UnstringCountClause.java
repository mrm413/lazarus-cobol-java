package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc072UnstringCountClause extends CobolProgram {
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
    private int valid_1 = 0;
    private int valid_2 = 0;
    private BigDecimal valid_3 = BigDecimal.ZERO;
    private int invalid_1 = 0;
    private double invalid_2 = 0.0;
    private int invalid_3 = 0;
    private BigDecimal invalid_4 = BigDecimal.ZERO;
    private CobolString invalid_5 = new CobolString(30);
    private CobolString x = new CobolString(9);
    private CobolString y = new CobolString(9);



    private void para_main() {
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        y.set(String.valueOf(""));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc072UnstringCountClause().run();
    }
}
