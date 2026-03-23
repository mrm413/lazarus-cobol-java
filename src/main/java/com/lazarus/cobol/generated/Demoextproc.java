package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demoextproc extends CobolProgram {
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
    private long ext_proc_address = 0L;
    private int install_flag = 0;
    private CobolString exit_params = new CobolString(1); // Group: exit-params
    private long proc_addrs = 0L;
    private int ppriority = 0;


    private CobolString entry = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString install_default = new CobolString(256);
    private CobolString cb_true = new CobolString(256);
    private CobolString install_priority = new CobolString(256);
    private CobolString query_priority = new CobolString(256);
    private CobolString uninstall = new CobolString(256);

    private void s1() {
        CobolDisplay.display("Program is starting");
        ext_proc_address = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ExtProc'  */
        CobolProgram.call("CBL_EXIT_PROC", 0, _unnamed, ext_proc_address);
        install_default.set(String.valueOf(cb_true));
        proc_addrs = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ExtProc-internal'  */
        CobolProgram.call("CBL_EXIT_PROC", install_flag, _unnamed, exit_params);
        proc_addrs = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ExtProc'  */
        CobolProgram.call("CBL_EXIT_PROC", install_flag, _unnamed, exit_params);
        if (return_code == 0) {
            CobolDisplay.display("Unexpected RETURN-CODE with subsequent call ");
            /* RAW: RETURN-CODE  */
        }
        install_priority.set(String.valueOf(cb_true));
        ppriority = new BigDecimal(String.valueOf(127).trim()).intValue();
        CobolProgram.call("CBL_EXIT_PROC", install_flag, _unnamed, exit_params);
        if (return_code != 0) {
            CobolDisplay.display("Unexpected RETURN-CODE with subsequent call, " + "different priority ");
            /* RAW: RETURN-CODE  */
        }
        proc_addrs = new BigDecimal(String.valueOf(entry).trim()).longValue();
        /* RAW: 'ExtProc-internal2'  */
        CobolProgram.call("CBL_EXIT_PROC", install_flag, _unnamed, exit_params);
        if (return_code != 0) {
            CobolDisplay.display("Unexpected RETURN-CODE with new call ");
            /* RAW: RETURN-CODE  */
        }
        CobolDisplay.display("Program is stopping");
        System.exit(0);
    }

    @Override
    public void run() {
        s1();
    }

    public static void main(String[] args) {
        new Demoextproc().run();
    }
}
