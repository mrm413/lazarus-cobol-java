package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc081SortTable2 extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("SINGLE TABLE");
        CobolDisplay.display("04");
        CobolDisplay.display("03");
        CobolDisplay.display("02");
        CobolDisplay.display("01");
        CobolDisplay.display("LOWER LEVEL TABLE");
        CobolDisplay.display("04");
        CobolDisplay.display("03");
        CobolDisplay.display("02");
        CobolDisplay.display("01");
        CobolDisplay.display("MULTY KEY SORT");
        CobolDisplay.display("06  AbCde  The");
        CobolDisplay.display("05  abc    cow");
        CobolDisplay.display("05  abcde  eats");
        CobolDisplay.display("04  zyx    grass");
        CobolDisplay.display("03  abcde  and");
        CobolDisplay.display("02  12345  mooos");
        CobolDisplay.display("02  12346  the");
        CobolDisplay.display("01  AbCde  whole");
        CobolDisplay.display("01  abcde  day");
        CobolDisplay.display("01  zyx    .");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc081SortTable2().run(); }
}
