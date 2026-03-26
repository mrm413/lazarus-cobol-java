package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions069SystemRoutineCblGcGetopt extends CobolProgram {
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
    private CobolString lo = new CobolString(1); // Group: LO
    private CobolString[] optionrecord = new CobolString[2]; // Group: OPTIONRECORD
    private CobolString[] oname = new CobolString[2];
    private int[] has_value = new int[2];
    private long[] valpoint = new long[2];
    private CobolString[] val = new CobolString[2];
    private CobolString so = new CobolString(256);
    private int longind = 0;
    private int long_only = 0;
    private CobolString return_char = new CobolString(4);
    private CobolString opt_val = new CobolString(10);
    private int ret_disp = 0;
    private int counter = 0;



    private void para_main() {
        // Method body requires runtime extensions
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions069SystemRoutineCblGcGetopt().run();
    }
}
