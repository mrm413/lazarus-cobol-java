package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc079UnstringWithFunctionLiteral extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("PRM(1) is The             :");
        CobolDisplay.display("PRM(2) is Quick           :");
        CobolDisplay.display("PRM(3) is Brown           :");
        CobolDisplay.display("PRM(4) is Fox             :");
        CobolDisplay.display("Now using UPPER-CASE");
        CobolDisplay.display("PRM(1) is THE             :");
        CobolDisplay.display("PRM(2) is QUICK           :");
        CobolDisplay.display("PRM(3) is BROWN           :");
        CobolDisplay.display("PRM(4) is FOX             :");
        CobolDisplay.display("Now using Literal");
        CobolDisplay.display("PRM(1) is Daddy           :");
        CobolDisplay.display("PRM(2) is was             :");
        CobolDisplay.display("PRM(3) is a               :");
        CobolDisplay.display("PRM(4) is Rolling stone   :");
        CobolDisplay.display("Now using Literal + LOWER-CASE");
        CobolDisplay.display("PRM(1) is daddy           :");
        CobolDisplay.display("PRM(2) is was             :");
        CobolDisplay.display("PRM(3) is a               :");
        CobolDisplay.display("PRM(4) is rolling stone   :");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc079UnstringWithFunctionLiteral().run(); }
}
