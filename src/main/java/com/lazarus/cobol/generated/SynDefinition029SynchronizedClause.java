package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition029SynchronizedClause extends CobolProgram {
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
    private short cs_full = (short) 0;
    private short cs = (short) 0;
    private short csl = (short) 0;
    private short csr = (short) 0;


    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        cs_full = new BigDecimal(String.valueOf(1).trim()).shortValue();
        _unnamed.set(String.valueOf(1));
        cs = new BigDecimal(String.valueOf(1).trim()).shortValue();
        _unnamed.set(String.valueOf(1));
        csl = new BigDecimal(String.valueOf(1).trim()).shortValue();
        _unnamed.set(String.valueOf(1));
    }

    private void csr() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynDefinition029SynchronizedClause().run();
    }
}
