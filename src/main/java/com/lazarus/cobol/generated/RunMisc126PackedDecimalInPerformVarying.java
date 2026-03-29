package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc126PackedDecimalInPerformVarying extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("#[0001");
        CobolDisplay.display("#0002");
        CobolDisplay.display("#0003");
        CobolDisplay.display("#0004");
        CobolDisplay.display("#0005");
        CobolDisplay.display("#0006");
        CobolDisplay.display("#0007");
        CobolDisplay.display("#0008");
        CobolDisplay.display("#0009");
        CobolDisplay.display("#0010");
        CobolDisplay.display("#]");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc126PackedDecimalInPerformVarying().run(); }
}
