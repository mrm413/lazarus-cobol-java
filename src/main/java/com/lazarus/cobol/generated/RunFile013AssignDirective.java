package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile013AssignDirective extends CobolProgram {
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
    // FILE SECTION — f
    private CobolString f_rec = new CobolString(3);

    // FILE SECTION — g
    private CobolString g_rec = new CobolString(3);


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("whatever", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile g = new CobolFile("whatever", "LINE SEQUENTIAL", "SEQUENTIAL");

    private CobolString whatever = new CobolString(256);

    private void para_main() {
        whatever.set(String.valueOf("out.txt"));
        f.open("OUTPUT");
        f.write("hi");
        f.close();
        g.open("OUTPUT");
        g.write("hi");
    }

    private void g() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile013AssignDirective().run();
    }
}
