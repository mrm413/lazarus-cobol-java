package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions033NumberOfCallParameters extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("+000000000");
        CobolDisplay.display("+000000001");
        CobolDisplay.display("+000000002");
        CobolDisplay.display("+000000003");
        CobolDisplay.display("+000000004");
        CobolDisplay.display("+000000004");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions033NumberOfCallParameters().run(); }
}
