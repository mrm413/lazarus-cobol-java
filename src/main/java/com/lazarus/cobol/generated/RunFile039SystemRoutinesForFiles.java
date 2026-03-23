package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile039SystemRoutinesForFiles extends CobolProgram {
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
    private CobolString fname = new CobolString(256);
    private CobolString access_mode = new CobolString(1);
    private CobolString fhandle = new CobolString(4);
    private CobolString offset = new CobolString(8);
    private CobolString nbytes = new CobolString(4);
    private CobolString write_buffer = new CobolString(20);



    private void para_main() {
        CobolProgram.call("CBL_CREATE_FILE", fname, 55, 11, 22, fhandle);
        if (return_code != -1) {
            CobolDisplay.display("Wrong return codes ...");
        }
        return_code = new BigDecimal(String.valueOf(0).trim()).intValue();
        CobolProgram.call("CBL_CREATE_FILE", fname, access_mode, 0, 0, fhandle);
        if (return_code != 0) {
            CobolDisplay.display("error creating file ...");
            return_code = new BigDecimal(String.valueOf(0).trim()).intValue();
        }
    }

    private void write_buffer() {
    }

    private void offset() {
    }

    private void nbytes() {
        CobolProgram.call("CBL_WRITE_FILE", fhandle, offset, nbytes, "0", write_buffer);
        if (return_code != 0) {
            CobolDisplay.display("error writing file ...");
            return_code = new BigDecimal(String.valueOf(0).trim()).intValue();
        }
        CobolProgram.call("CBL_FLUSH_FILE", fhandle);
        if (return_code != 0) {
            CobolDisplay.display("error flushing file ...");
            return_code = new BigDecimal(String.valueOf(0).trim()).intValue();
        }
        CobolProgram.call("CBL_CLOSE_FILE", fhandle);
        if (return_code != 0) {
            CobolDisplay.display("error closing file ...");
            return_code = new BigDecimal(String.valueOf(0).trim()).intValue();
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile039SystemRoutinesForFiles().run();
    }
}
