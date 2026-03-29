package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc173EntryForGoToGoToEntry extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("STMT05");
        CobolDisplay.display("STMT05");
        CobolDisplay.display("STMT04");
        CobolDisplay.display("STMT05");
        CobolDisplay.display("STMT03");
        CobolDisplay.display("STMT04");
        CobolDisplay.display("STMT05");
        CobolDisplay.display("STMT03");
        CobolDisplay.display("STMT04");
        CobolDisplay.display("STMT03");
        CobolDisplay.display("STMT04");
        CobolDisplay.display("STMT03");
        CobolDisplay.display("STMT04");
        CobolDisplay.display("STMT05");
        CobolDisplay.display("STMT01");
        CobolDisplay.display("STMT03");
        CobolDisplay.display("STMT04");
        CobolDisplay.display("STMT03");
        CobolDisplay.display("STMT04");
        CobolDisplay.display("STMT03");
        CobolDisplay.display("STMT04");
        CobolDisplay.display("STMT05");
        CobolDisplay.display("NOT JUMPED");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc173EntryForGoToGoToEntry().run(); }
}
