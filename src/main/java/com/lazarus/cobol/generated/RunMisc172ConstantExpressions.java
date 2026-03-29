package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc172ConstantExpressions extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("A: OK VAR-LEN > 16 AND VAR-LEN < 200");
        CobolDisplay.display("B: OK VAR IS NOT SPACES");
        CobolDisplay.display("C: OK VAR IS SPACES");
        CobolDisplay.display("D: OK VAR IS NOT SPACES");
        CobolDisplay.display("E: OK OTHER option taken");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc172ConstantExpressions().run(); }
}
