package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions076SystemRoutineCblErrorProc2 extends CobolProgram {
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


    private CobolString entry = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private void s1() {
        CobolDisplay.display("Program is starting");
        err_proc_address = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ErrProc'  */
        CobolProgram.call("CBL_ERROR_PROC", 0, _filler_002, err_proc_address);
        err_proc_address = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ErrProc-internal'  */
        CobolProgram.call("CBL_ERROR_PROC", 0, _filler_003, err_proc_address);
        err_proc_address = new BigDecimal(String.valueOf(0).trim()).longValue();
        CobolProgram.call("Tilt");
        CobolDisplay.display("Program is stopping");
        System.exit(0);
    }

    @Override
    public void run() {
        s1();
    }

    public static void main(String[] args) {
        new RunExtensions076SystemRoutineCblErrorProc2().run();
    }
}
