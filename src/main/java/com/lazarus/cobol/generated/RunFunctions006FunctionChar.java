package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions006FunctionChar extends CobolProgram {
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
    private BigDecimal x = BigDecimal.ZERO;
    private CobolString test_fld = new CobolString(1); // Group: TEST-FLD
    private CobolString test_data = new CobolString(1);
    private CobolString test_unset = new CobolString(1);


    private CobolString valid_unset = new CobolString(256); // fallback
    private CobolString valid_data = new CobolString(256); // fallback

    private void para_main() {
        // Transpiled COBOL body (requires runtime extensions for full compilation):
    // 
    // {
    // StringBuilder _sb = new StringBuilder();
    // _sb.append(String.valueOf(CobolIntrinsics.char(x)));
    // test_fld.set(_sb.toString());
    // }
    // if (-valid_unset) {
    // CobolDisplay.display("FUNCTION result too long");
    // } else if (!String.valueOf(valid_data).trim().isEmpty()) {
    // /* CONTINUE */
    // } else {
    // CobolDisplay.display(String.valueOf(test_data));
    // }
    // System.exit(0);
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions006FunctionChar().run();
    }
}
