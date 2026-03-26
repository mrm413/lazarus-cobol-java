package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions072SystemRoutineCblGcHosted extends CobolProgram {
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
    private long stdin = 0L;
    private long stdout = 0L;
    private long stderr = 0L;
    private int cell = 0;
    private int argc = 0;
    private long argv = 0L;
    private long errptr = 0L;
    private int errno = 0;
    private int cerrno = 0;
    private long tzname = 0L;
    private CobolString tznames = new CobolString(1); // Group: TZNAMES
    private long[] tzs = new long[2];
    private int timezone = 0;
    private int daylight = 0;
    private long extptr = 0L;


    private CobolString address = new CobolString(256); // fallback
    private CobolString greater = new CobolString(256); // fallback
    private CobolString environment = new CobolString(256); // fallback
    private CobolString tz = new CobolString(256); // fallback

    private void para_main() {
        CobolProgram.call("CBL_GC_HOSTED", stdin, "stdin");
        CobolProgram.call("CBL_GC_HOSTED", stdout, "stdout");
        CobolProgram.call("CBL_GC_HOSTED", stderr, "stderr");
        CobolProgram.call("CBL_OC_HOSTED", argc, "argc");
        CobolProgram.call("CBL_OC_HOSTED", argv, "argv");
        CobolProgram.call("CBL_GC_HOSTED", cell, "cell");
        CobolProgram.call("CBL_GC_HOSTED", errptr, "errno");
        CobolProgram.call("CBL_GC_HOSTED", argc, "arg");
        CobolProgram.call("CBL_GC_HOSTED", 0, "argc");
        address.set(String.valueOf(errptr));
        CobolProgram.call("CBL_GC_HOSTED", tzname, "tzname");
        CobolProgram.call("CBL_GC_HOSTED", timezone, "timezone");
        CobolProgram.call("CBL_GC_HOSTED", daylight, "daylight");
        if (!String.valueOf(errptr).equals(String.valueOf(address))) {
            CobolDisplay.display("ADDRESS OF ERRNO VARIABLES DON'T MATCH");
            extptr = new BigDecimal(String.valueOf(address).trim()).longValue();
            CobolDisplay.display("HOSTED: " + String.valueOf(errptr) + ", " + "EXTERNAL: " + String.valueOf(extptr));
        }
        CobolProgram.call("test_errno");
        if (errno != 2) {
            CobolDisplay.display("BAD HOSTED ERRNO " + String.valueOf(errno));
            if (cerrno != 2) {
                CobolDisplay.display("BAD EXTERNAL ERRNO " + String.valueOf(cerrno));
            }
        }
        if (argc != 2) {
            CobolDisplay.display("BAD ARGC " + String.valueOf(argc));
        }
        if (String.valueOf(argv).equals(String.valueOf(0))) {
            CobolDisplay.display("BAD ARGV");
        }
        if ((cell < 0 || !String.valueOf(greater).trim().isEmpty())) {
            /* RAW: THAN 8 THEN */
            CobolDisplay.display("UNK CELL " + String.valueOf(cell));
        }
        environment.set(String.valueOf("PST8PDT"));
        tz.set(String.valueOf("PST8PDT"));
        try {
            CobolProgram.call("tzset");
        } catch (Exception _callEx) {
            /* CONTINUE */
        }
        if (!String.valueOf(tzname).equals(String.valueOf(0))) {
            address.set(String.valueOf(tzname));
            if (String.valueOf(tzs[1 - 1]).equals(String.valueOf(0))) {
                CobolDisplay.display("BAD TZNAME");
            }
        }
        CobolProgram.call("test_stdio", stdin, stdout, stderr);
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions072SystemRoutineCblGcHosted().run();
    }
}
