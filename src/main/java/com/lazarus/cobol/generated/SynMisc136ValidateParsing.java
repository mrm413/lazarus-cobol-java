package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc136ValidateParsing extends CobolProgram {
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
    private CobolString target_area = new CobolString(1); // Group: TARGET-AREA
    private CobolString out_name = new CobolString(20);
    private short[] out_week = new short[5];
    private CobolString input_record = new CobolString(1); // Group: INPUT-RECORD
    private int in_type = 0;
    private CobolString in_rec_format_1 = new CobolString(1); // Group: IN-REC-FORMAT-1
    private CobolString in_name = new CobolString(20);
    private CobolString filler_1 = new CobolString(20);
    private int[] in_week = new int[5];
    private CobolString in_rec_format_2 = new CobolString(1); // Group: IN-REC-FORMAT-2
    private CobolString in_pay = new CobolString(6);



    private void para_main() {
        /* RAW: VALIDATE INPUT-RECORD VALIDATE MY-MIXED-GROUP */
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc136ValidateParsing().run();
    }
}
