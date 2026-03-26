package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile090TurnEcIO extends CobolProgram {
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
    private CobolString f_status = new CobolString(2);

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1);

    // FILE SECTION — g
    private CobolString g_rec = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("out.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: f-status
    private CobolFile g = new CobolFile("out.txt", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString last = new CobolString(256); // fallback
    private CobolString off = new CobolString(256); // fallback
    private CobolString exception = new CobolString(256); // fallback

    private void para_main() {
        f.open("OUTPUT");
        f.write("a");
        f.close();
        last.set(String.valueOf(off));
        exception.set(String.valueOf(off));
        f.open("INPUT");
        for (int _i0 = 0; _i0 < 2; _i0++) {
            if (f.read(null) == FileStatus.AT_END) {
            }
            CobolDisplay.display(String.valueOf(f_rec));
        }
        CobolDisplay.display(String.valueOf(f_status));
        CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(CobolIntrinsics.exception_status())));
        last.set(String.valueOf(off));
        exception.set(String.valueOf(off));
        f.close();
        f.open("INPUT");
        for (int _i1 = 0; _i1 < 2; _i1++) {
            if (f.read(null) == FileStatus.AT_END) {
            }
            CobolDisplay.display(String.valueOf(f_rec));
        }
        CobolDisplay.display(String.valueOf(f_status));
        CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(CobolIntrinsics.exception_status())));
        last.set(String.valueOf(off));
        exception.set(String.valueOf(off));
        f.close();
        g.open("INPUT");
        for (int _i2 = 0; _i2 < 2; _i2++) {
            if (g.read(null) == FileStatus.AT_END) {
            }
            CobolDisplay.display(String.valueOf(g_rec));
        }
        g.close();
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile090TurnEcIO().run();
    }
}
