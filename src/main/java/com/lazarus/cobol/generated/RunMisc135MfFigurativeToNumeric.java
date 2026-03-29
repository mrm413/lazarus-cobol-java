package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc135MfFigurativeToNumeric extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("Initial value");
        CobolDisplay.display("30303936 .");
        CobolDisplay.display("MOVE BIGFLT");
        CobolDisplay.display("38333034 .");
        CobolDisplay.display("MOVE SPACES");
        CobolDisplay.display("20202020 .");
        CobolDisplay.display("MOVE LOW-VALUES");
        CobolDisplay.display("00000000 .");
        CobolDisplay.display("MOVE HIGH-VALUES");
        CobolDisplay.display("FFFFFFFF .");
        CobolDisplay.display("MOVE QUOTE");
        CobolDisplay.display("22222222 .");
        CobolDisplay.display("MOVE ALL *");
        CobolDisplay.display("2A2A2A2A .");
        CobolDisplay.display("MOVE ALL 0");
        CobolDisplay.display("30303030 .");
        CobolDisplay.display("MOVE ALL 'A1'");
        CobolDisplay.display("41314131 .");
        CobolDisplay.display("MOVE ALL '21'");
        CobolDisplay.display("32313231 .");
        CobolDisplay.display("MOVE HIGH-VALUES TO (1:)");
        CobolDisplay.display("FFFFFFFF .");
        CobolDisplay.display("MOVE HIGH-VALUES TO BIGFLT");
        CobolDisplay.display("BIGFLT is NaN");
        CobolDisplay.display("FFFFFFFF .");
        CobolDisplay.display("MOVE QUOTE TO BIGFLT");
        CobolDisplay.display("BIGFLT is 2.1973164E-18");
        CobolDisplay.display("22222222 .");
        CobolDisplay.display("MOVE ALL * TO BIGFLT");
        CobolDisplay.display("BIGFLT is 5.4312347E+12");
        CobolDisplay.display("MOVE ALL '21' TO BIGFLT");
        CobolDisplay.display("BIGFLT is 2.1212121E+37");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc135MfFigurativeToNumeric().run(); }
}
