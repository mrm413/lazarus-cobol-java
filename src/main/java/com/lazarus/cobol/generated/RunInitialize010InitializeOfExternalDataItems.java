package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize010InitializeOfExternalDataItems extends CobolProgram {
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
    private CobolString ext_var_01 = new CobolString(5);
    private CobolString ext_var_grp = new CobolString(1); // Group: EXT-VAR-GRP
    private int ext_field1 = 0;
    private CobolString ext_field2 = new CobolString(4);
    private int ext_field3 = 0;
    private BigDecimal ext_field4 = BigDecimal.ZERO;



    private void para_main() {
    }

    private void ext_var_01() {
    }

    private void ext_field1() {
    }

    private void ext_field2() {
    }

    private void ext_field3() {
    }

    private void ext_field4() {
    }

    private void ext_var_01_2() {
    }

    private void ext_var_grp() {
        if (!String.valueOf(ext_var_01).equals(String.valueOf(" "))) {
            CobolDisplay.display("EXT-VAR-01 " + String.valueOf(ext_var_01));
        }
        if (!String.valueOf(ext_field1).equals(String.valueOf(0))) {
            CobolDisplay.display("EXT-FIELD1 " + String.valueOf(ext_field1));
        }
        if (!String.valueOf(ext_field2).equals(String.valueOf(" "))) {
            CobolDisplay.display("EXT-FIELD2 " + String.valueOf(ext_field2));
        }
        if (!String.valueOf(ext_field3).equals(String.valueOf(0))) {
            CobolDisplay.display("EXT-FIELD3 " + String.valueOf(ext_field3));
        }
        if (ext_field4.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("EXT-FIELD4 " + String.valueOf(ext_field4));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunInitialize010InitializeOfExternalDataItems().run();
    }
}
