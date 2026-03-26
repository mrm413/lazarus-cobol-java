package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental093AbbreviatedExpressions extends CobolProgram {
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

    private CobolString fld9_7 = new CobolString(256); // fallback
    private CobolString fld9_5 = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString fld9_1 = new CobolString(256); // fallback
    private CobolString fld9_2 = new CobolString(256); // fallback
    private CobolString fld9_9 = new CobolString(256); // fallback
    private CobolString on_wrk_switch_1 = new CobolString(256); // fallback
    private CobolString off_wrk_switch_2 = new CobolString(256); // fallback
    private CobolString off_wrk_switch_1 = new CobolString(256); // fallback
    private CobolString testnum = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private void main_line() {
        if ((String.valueOf(fld9_7).compareTo(String.valueOf(fld9_5)) > 0 && !(!String.valueOf(_filler_002).trim().isEmpty()))) {
            /* RAW: FLD9-0 OR FLD9-1 */
            pass();
        } else {
            fail();
        }
        if ((!String.valueOf(fld9_7).equals(String.valueOf(fld9_5)) || !String.valueOf(fld9_1).trim().isEmpty())) {
            pass();
        } else {
            fail();
        }
        if ((!String.valueOf(fld9_7).equals(String.valueOf(fld9_5)) && !String.valueOf(fld9_1).trim().isEmpty())) {
            pass();
        } else {
            fail();
        }
        if ((!(String.valueOf(fld9_7).equals(String.valueOf(fld9_5))) || !String.valueOf(fld9_1).trim().isEmpty())) {
            pass();
        } else {
            fail();
        }
        if (!((String.valueOf(fld9_5).compareTo(String.valueOf(fld9_7)) > 0 || !String.valueOf(_filler_003).trim().isEmpty()))) {
            /* RAW: FLD9-1 ) */
            pass();
        } else {
            fail();
        }
        if (!(((String.valueOf(fld9_7).compareTo(String.valueOf(fld9_5)) <= 0 && !String.valueOf(fld9_2).trim().isEmpty()) && !(!String.valueOf(fld9_1).trim().isEmpty())))) {
            pass();
        } else {
            fail();
        }
        if (((String.valueOf(fld9_9).compareTo(String.valueOf(fld9_2)) > 0 && !String.valueOf(fld9_7).trim().isEmpty()) && !String.valueOf(fld9_5).trim().isEmpty())) {
            pass();
        } else {
            fail();
        }
        if (((String.valueOf(fld9_9).compareTo(String.valueOf(fld9_2)) > 0 && !String.valueOf(fld9_7).trim().isEmpty()) || !String.valueOf(fld9_5).trim().isEmpty())) {
            pass();
        } else {
            fail();
        }
        if (((String.valueOf(fld9_1).compareTo(String.valueOf(fld9_2)) < 0 && !String.valueOf(fld9_5).trim().isEmpty()) && !String.valueOf(fld9_7).trim().isEmpty())) {
            pass();
        } else {
            fail();
        }
        /* RAW: * / / */
        CobolDisplay.display("***Constant expressions***");
        if ((((9 > 2 && true) && true) && true)) {
            pass();
        } else {
            fail();
        }
        if ((((1 < 2 && true) && true) && true)) {
            pass();
        } else {
            fail();
        }
        if ((((5 < 2 || true) || true) || true)) {
            pass();
        } else {
            fail();
        }
        if ((5 > 1 && !String.valueOf(_filler_004).trim().isEmpty())) {
            /* RAW: 3 OR 6 */
            pass();
        } else {
            fail();
        }
        /* RAW: * / / */
        CobolDisplay.display("***Switch expressions***");
        if ((!String.valueOf(on_wrk_switch_1).trim().isEmpty() || (!(!String.valueOf(off_wrk_switch_2).trim().isEmpty()) && !String.valueOf(off_wrk_switch_1).trim().isEmpty()))) {
            fail();
        } else {
            pass();
        }
        CobolDisplay.displayNoAdvancing("***FINE***");
        System.exit(0);
    }

    private void pass() {
        /* RAW: * / / */
        CobolDisplay.display("Test " + String.valueOf(testnum) + " passed");
        testnum.set(new BigDecimal(String.valueOf(testnum).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
    }

    private void fail() {
        CobolDisplay.display("Test " + String.valueOf(testnum) + " failed!");
        testnum.set(new BigDecimal(String.valueOf(testnum).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
    }

    @Override
    public void run() {
        main_line();
    }

    public static void main(String[] args) {
        new RunFundamental093AbbreviatedExpressions().run();
    }
}
