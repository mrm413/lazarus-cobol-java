package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynScreen002AtClause extends CobolProgram {
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
    private int curs_1 = 0;
    private CobolString curs_2 = new CobolString(1); // Group: curs-2
    private int linee = 0;
    private int coll = 0;
    private CobolString posc = new CobolString(1);
    private int curs_3 = 0;
    private int curs_4 = 0;
    private CobolString curs_5 = new CobolString(4);
    private CobolString screen_pos = new CobolString(1); // Group: SCREEN-POS
    private int spos = 0;
    private CobolString ws2_curs = new CobolString(1); // Group: WS2-CURS
    private int slin = 0;
    private int scol = 0;


    private CobolString at = new CobolString(256); // fallback

    private void para_main() {
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(curs_1));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(curs_2));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(posc));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(posc));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(spos));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(ws2_curs));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(screen_pos));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(curs_3));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(curs_4));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(curs_5));
        CobolDisplay.display("a" + String.valueOf(at) + String.valueOf(101));
        CobolDisplay.display("a" + String.valueOf(at) + 0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynScreen002AtClause().run();
    }
}
