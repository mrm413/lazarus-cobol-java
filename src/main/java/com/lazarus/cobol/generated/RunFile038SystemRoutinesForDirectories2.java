package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile038SystemRoutinesForDirectories2 extends CobolProgram {
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
    private CobolString fh = new CobolString(4);
    private CobolString rb = new CobolString(8);
    private CobolString cb_bfr = new CobolString(4);
    private CobolString w_dirname_1 = new CobolString(4);
    private CobolString w_dirname_2 = new CobolString(9);
    private CobolString w_dirname_3 = new CobolString(14);
    private CobolString w_filename = new CobolString(20);
    private CobolString w_finfo = new CobolString(16);


    private CobolString _unnamed = new CobolString(256);
    private CobolString display = new CobolString(256);

    private void para_main() {
        CobolProgram.call("CBL_CREATE_DIR");
    }

    private void w_dirname_1() {
        if (return_code != 0) {
            CobolDisplay.display("FAILED 1: CBL_CREATE_DIR (res=" + String.valueOf(return_code) + ")");
        }
        CobolProgram.call("CBL_CREATE_DIR");
    }

    private void w_dirname_2() {
        if (return_code != 0) {
            CobolDisplay.display("FAILED 2: CBL_CREATE_DIR (res=" + String.valueOf(return_code) + ")");
        }
        /* RAW: * Should fail because directory does */
    }

    private void yet() {
        CobolProgram.call("CBL_CREATE_FILE", w_filename, _unnamed, 1, _unnamed, 0, _unnamed, 0, _unnamed);
    }

    private void fh() {
        if (return_code != 35) {
            CobolDisplay.display("FAILED 3: CBL_CREATE_FILE expected fail (res=" + String.valueOf(return_code) + ")");
            if (String.valueOf(return_code).equals(String.valueOf(0))) {
                CobolProgram.call("CBL_CLOSE_FILE", fh);
            }
        }
        CobolProgram.call("CBL_CREATE_DIR");
    }

    private void w_dirname_3() {
        if (return_code != 0) {
            CobolDisplay.display("FAILED 4: CBL_CREATE_DIR (res=" + String.valueOf(return_code) + ")");
        }
        CobolProgram.call("CBL_CREATE_FILE", w_filename, _unnamed, 1, _unnamed, 0, _unnamed, 0, _unnamed);
    }

    private void fh_2() {
        if (return_code != 0) {
            CobolDisplay.display("FAILED 5: CBL_CREATE_FILE (res=" + String.valueOf(return_code) + ")");
        }
        CobolProgram.call("CBL_CLOSE_FILE");
    }

    private void fh_3() {
        if (return_code != 0) {
            CobolDisplay.display("FAILED 6: CBL_CLOSE_FILE (res=" + String.valueOf(return_code) + ")");
        }
        CobolProgram.call("CBL_CHECK_FILE_EXIST", w_filename, _unnamed);
    }

    private void w_finfo() {
        if (return_code != 0) {
            CobolDisplay.display("FAILED 7: CBL_CHECK_FILE_EXIST (res=" + String.valueOf(return_code) + ")");
        }
        /* RAW: * Should fail because directory is */
    }

    private void empty() {
        CobolProgram.call("CBL_DELETE_DIR");
    }

    private void w_dirname_1_2() {
        if (return_code == 0) {
            CobolDisplay.display("FAILED 8: CBL_DELETE_DIR EXPECTED TO FAIL");
        }
        /* RAW: ** ** ** ** ** ** */
    }

    private void acu() {
        /* RAW: ** ** ** ** ** ** */
        CobolProgram.call("CBL_PURGE_DIR");
    }

    private void w_dirname_1_3() {
        /* RAW: *  */
        if (return_code != (0 * Integer.parseInt(String.valueOf(display).trim()))) {
            /* RAW: "FAILED 9: CBL_PURGE_DIR (res=" RETURN-CODE ")" * */
        }
        /* RAW: * * Should succeed because directory */
    }

    private void empty_2() {
        /* RAW: *  */
        CobolProgram.call("CBL_DELETE_DIR");
    }

    private void w_dirname_1_4() {
        /* RAW: *  */
        if (return_code != (0 * Integer.parseInt(String.valueOf(display).trim()))) {
            /* RAW: "FAILED 10: CBL_DELETE_DIR (res=" RETURN-CODE ")" * */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile038SystemRoutinesForDirectories2().run();
    }
}
