package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demoerrproc extends CobolProgram {
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
    private long err_proc_address = 0L;
    private short err_message_len = (short) 0;

    // LINKAGE SECTION
    private CobolString err_message_from_runtime = new CobolString(1023);


    private CobolString entry = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);

    private void s1() {
        CobolDisplay.display("Program is starting");
        err_proc_address = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ErrProc'  */
        CobolProgram.call("CBL_ERROR_PROC", 0, _unnamed, err_proc_address);
        err_proc_address = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ErrProc-internal'  */
        CobolProgram.call("CBL_ERROR_PROC", 0, _unnamed, err_proc_address);
        err_proc_address = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ErrProc'  */
        CobolProgram.call("CBL_ERROR_PROC", 0, _unnamed, err_proc_address);
        err_proc_address = new BigDecimal(String.valueOf(0).trim()).longValue();
        CobolProgram.call("Tilt");
        CobolDisplay.display("Program is stopping");
        System.exit(0);
    }

    private void err_message_from_runtime() {
        CobolDisplay.display("Error (internal): " + String.valueOf(CobolIntrinsics.exception_location()) + "-");
        CobolDisplay.display("                  " + String.valueOf(CobolIntrinsics.exception_statement()) + "-");
        CobolDisplay.display("                  " + String.valueOf(CobolIntrinsics.exception_status()) + "-");
        err_message_len = new BigDecimal(String.valueOf(0).trim()).shortValue();
        /* INSPECT Err-Message-From-Runtime — 2 clause(s) */
        CobolDisplay.display("Error-Message:    " + String.valueOf(CobolString.refMod(err_message_from_runtime, 1, err_message_len)));
        CobolDisplay.display("-*- Returning to Next Error Routine -*-");
        return_code = new BigDecimal(String.valueOf(1).trim()).intValue();
        return;
    }

    @Override
    public void run() {
        s1();
    }

    public static void main(String[] args) {
        new Demoerrproc().run();
    }
}
