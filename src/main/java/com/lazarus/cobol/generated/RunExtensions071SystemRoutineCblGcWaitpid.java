package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions071SystemRoutineCblGcWaitpid extends CobolProgram {
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
    private int child_pid = 0;
    private int wait_sts = 0;



    private void para_main() {
        CobolProgram.call("CBL_GC_FORK");
        if (String.valueOf(child_pid).equals(String.valueOf(0))) {
            child_code();
        } else if (child_pid == -1) {
            System.exit(0);
        } else {
            parent_code();
        }
        System.exit(0);
    }

    private void child_code() {
        CobolProgram.call("C$SLEEP", 1);
        CobolDisplay.display("Hello, I am the child");
        return_code = new BigDecimal(String.valueOf(2).trim()).intValue();
    }

    private void parent_code() {
        CobolDisplay.display("Hello, I am the parent");
        CobolProgram.call("CBL_GC_WAITPID", child_pid);
        return_code = new BigDecimal(String.valueOf(0).trim()).intValue();
        if (wait_sts == -1) {
            System.exit(0);
        }
        CobolDisplay.display("Child ended status " + String.valueOf(wait_sts));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions071SystemRoutineCblGcWaitpid().run();
    }
}
