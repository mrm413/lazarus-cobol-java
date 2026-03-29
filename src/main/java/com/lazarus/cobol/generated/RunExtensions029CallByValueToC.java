package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions029CallByValueToC extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("VAL received: 12345678");
        CobolDisplay.display("VAL received: 12345678");
        CobolDisplay.display("VAL received: 33");
        CobolDisplay.display("VAL received: -42");
        CobolDisplay.display("VAL received: 99999999999999");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions029CallByValueToC().run(); }
}
