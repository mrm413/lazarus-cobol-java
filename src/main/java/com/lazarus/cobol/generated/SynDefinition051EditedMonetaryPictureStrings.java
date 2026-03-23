package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition051EditedMonetaryPictureStrings extends CobolProgram {
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
    private CobolString dollars = new CobolString(1); // Group: DOLLARS
    private CobolString report_line = new CobolString(1); // Group: REPORT-LINE
    private CobolString report_items = new CobolString(15);
    private CobolString report_fica_wages = new CobolString(19);
    private CobolString report_fica_tips = new CobolString(19);
    private CobolString report_total_comp = new CobolString(19);
    private CobolString report_medicare = new CobolString(19);
    private CobolString acct_report_total_line = new CobolString(3);



    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new SynDefinition051EditedMonetaryPictureStrings().run();
    }
}
