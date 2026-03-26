package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc079DanglingLinkageItems extends CobolProgram {
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

    private CobolString d2 = new CobolString(256); // fallback
    private CobolString g_val_b = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback

    private void para_main() {
        if (!String.valueOf(d2).trim().isEmpty()) {
            /* RAW: OMITTED OR Eb2 OMITTED or F2 */
            g_val_b.set(String.valueOf(cb_true));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc079DanglingLinkageItems().run();
    }
}
