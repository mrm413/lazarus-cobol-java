package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition058LikeClause extends CobolProgram {
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
    private CobolString message_text_2 = new CobolString(1); // Group: MESSAGE-TEXT-2
    private CobolString ausgabe_file_name = new CobolString(50);
    private CobolString filler_1 = new CobolString(1);
    private CobolString ausgabe_file_name_2 = new CobolString(1); // Group: AUSGABE-FILE-NAME-2
    private CobolString filler_2 = new CobolString(1);
    private int detail_no = 0;
    private CobolString filler_3 = new CobolString(1);
    private CobolString output_val = new CobolString(1);
    private CobolString output_val_p1 = new CobolString(1);
    private CobolString output_val_p1b = new CobolString(1);
    private CobolString output_val_m2 = new CobolString(1);
    private CobolString z_message_t2 = new CobolString(1);
    private CobolString z_message_t3 = new CobolString(1); // Group: Z-MESSAGE-T3
    private CobolString mt3 = new CobolString(1);



    private void para_main() {
        CobolDisplay.display(String.valueOf(ausgabe_file_name));
        CobolDisplay.display(String.valueOf(CobolString.refMod(z_message_t2, 55, CobolIntrinsics.length(detail_no))));
        CobolDisplay.display(String.valueOf(CobolString.refMod(mt3, 1, CobolIntrinsics.length(ausgabe_file_name))));
        // KNOWN_ISSUE: detail_no = new BigDecimal(String.valueOf(detail_no + output_val).trim()).intValue();
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynDefinition058LikeClause().run();
    }
}
