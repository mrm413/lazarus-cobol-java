package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions073SystemRoutineSystemParameterHandling extends CobolProgram {
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

    private CobolString chaining_param = new CobolString(256);
    private CobolString chaining_param_2 = new CobolString(256);
    private CobolString test_no = new CobolString(256);

    private void para_main() {
        /* RAW: CHAINING chaining-param , */
    }

    private void chaining_param_2() {
        /* RAW: *  */
    }

    private void para_main_2() {
        if (String.valueOf(chaining_param).equals(String.valueOf(" ")) && String.valueOf(chaining_param_2).equals(String.valueOf(" "))) {
            CobolDisplay.display("started without options - closing");
        } else if (String.valueOf(chaining_param).equals(String.valueOf("1")) && String.valueOf(chaining_param_2).equals(String.valueOf(" "))) {
        } else if (String.valueOf(chaining_param).equals(String.valueOf("\"1\"")) && String.valueOf(chaining_param_2).equals(String.valueOf(" "))) {
        } else if (String.valueOf(chaining_param).equals(String.valueOf("a v")) && String.valueOf(chaining_param_2).equals(String.valueOf(" "))) {
        } else if (String.valueOf(chaining_param).equals(String.valueOf("\"a v\"")) && String.valueOf(chaining_param_2).equals(String.valueOf(" "))) {
            CobolDisplay.display("  called with -" + String.valueOf(CobolIntrinsics.trim(chaining_param)) + "-");
        } else if (String.valueOf(chaining_param).equals(String.valueOf("a")) && String.valueOf(chaining_param_2).equals(String.valueOf("v"))) {
            CobolDisplay.display("  called with -" + String.valueOf(CobolIntrinsics.trim(chaining_param)) + "-" + " and with -" + String.valueOf(CobolIntrinsics.trim(chaining_param_2)) + "-");
        } else if (String.valueOf(chaining_param).equals(String.valueOf("start")) && String.valueOf(chaining_param_2).equals(String.valueOf(" "))) {
            chaining_param.set(String.valueOf("prog 1"));
            callme();
            chaining_param.set(String.valueOf("prog \"1\""));
            callme();
            chaining_param.set(String.valueOf("\"prog\" 1"));
            callme();
            chaining_param.set(String.valueOf("\"prog\" \"1\""));
            callme();
            chaining_param.set(String.valueOf("prog a v"));
            callme();
            chaining_param.set(String.valueOf("prog \"a v\""));
            callme();
            chaining_param.set(String.valueOf("\"prog\" a v"));
            callme();
            chaining_param.set(String.valueOf("\"prog\" \"a v\""));
            callme();
            chaining_param.set(String.valueOf("\"prog\" \"a\" \"v\""));
            callme();
            CobolDisplay.display("tests finished");
        } else {
            CobolDisplay.display("called with unexpected -" + String.valueOf(CobolIntrinsics.trim(chaining_param)) + "-");
        }
        System.exit(0);
    }

    private void callme() {
        test_no.set(new BigDecimal(String.valueOf(test_no).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        CobolDisplay.display("Test #" + String.valueOf(test_no) + ":");
        CobolDisplay.display("  CALL 'SYSTEM' with " + String.valueOf(CobolIntrinsics.trim(chaining_param)) + ":");
        CobolProgram.call("SYSTEM", CobolIntrinsics.trim(chaining_param));
        CobolDisplay.display("  --> return of the given CALL 'SYSTEM': ");
    }

    private void return_code() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions073SystemRoutineSystemParameterHandling().run();
    }
}
