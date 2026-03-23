package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc047CgiExternalForm extends CobolProgram {
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
    private CobolString gnucobol_url = new CobolString(1);
    private CobolString web_page_1 = new CobolString(1);
    private CobolString simple_form = new CobolString(1); // Group: SIMPLE-FORM
    private CobolString simple_form_var1 = new CobolString(10);
    private int simple_form_var2 = 0;
    private CobolString my_form = new CobolString(1); // Group: MY-FORM
    private CobolString cgi_var1 = new CobolString(20);
    private CobolString cgi_var2 = new CobolString(50);



    private void para_main() {
        CobolDisplay.display(String.valueOf(gnucobol_url));
        CobolDisplay.display(String.valueOf(web_page_1));
        CobolDisplay.display(String.valueOf(my_form));
        CobolDisplay.display(String.valueOf(simple_form));
        simple_form.set(String.valueOf(CobolDisplay.accept()));
        simple_form_var1.set(String.valueOf(CobolDisplay.accept()));
        my_form.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: *  */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc047CgiExternalForm().run();
    }
}
