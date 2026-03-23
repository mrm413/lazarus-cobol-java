package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc042AcucobolUsageHandle extends CobolProgram {
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
    private static final int listdir_open = 1;
    private static final int listdir_next = 2;
    private static final int listdir_close = 3;
    private CobolString pattern = new CobolString(5);
    private CobolString directory = new CobolString(5);
    private CobolString filename = new CobolString(256);
    private int mydir = 0;
    private int mythread = 0;
    private CobolString unused_thread = new CobolString(1);
    private int mywindow = 0;
    private int nor_a_handle = 0;
    private int neither_a_handle = 0;
    private int control_handle = 0;


    
    private CobolFile the = new CobolFile("THE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile and = new CobolFile("AND", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile deallocate = new CobolFile("DEALLOCATE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile _unnamed = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString will = new CobolString(256);
    private CobolString in = new CobolString(256);

    private void para_main() {
        /* RAW: *  */
        CobolProgram.call(String.valueOf(listdir_open));
        /* RAW: to get a directory */
    }

    private void handle() {
        CobolProgram.call("C$LIST-DIRECTORY", listdir_open, _unnamed, directory, _unnamed);
    }

    private void pattern() {
    }

    private void mydir() {
        /* RAW: *  */
        CobolProgram.call(String.valueOf(listdir_next));
        /* RAW: to get the names of the */
    }

    private void files() {
        /* RAW: * Repeat this operation until a */
    }

    private void returned() {
        /* RAW: The filenames are not necessarily * */
    }

    private void order() {
        /* RAW: Filenames may be * sorted on */
    }

    private void others() {
        thread();
        /* RAW: with test after until filename = */
        CobolProgram.call("C$LIST-DIRECTORY", listdir_next, _unnamed, mydir, _unnamed, filename);
        System.exit(0);
    }

    private void memory() {
        /* RAW: Omitting this */
        CobolProgram.call(String.valueOf(will));
        /* RAW: result in memory */
    }

    private void leaks() {
        CobolProgram.call("C$LIST-DIRECTORY", listdir_close, _unnamed);
    }

    private void mydir_2() {
        /* RAW: *  */
        CobolProgram.call(String.valueOf(in));
        /* RAW: THREAD 'NOTHERE' HANDLE IN mywindow USING */
        CobolDisplay.display("called in THREAD");
        /* RAW: * * Just to check that */
        /* UNKNOWN: useForDebugging */
    }

    private void thread() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc042AcucobolUsageHandle().run();
    }
}
