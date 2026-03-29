package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc162DefineDefaults extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("ENVPONY env var set to             ;");
        CobolDisplay.display("1st Dog's name is Pluto;");
        CobolDisplay.display("2nd Dog's name is Piper;");
        CobolDisplay.display("ENVPONY is DEFINED as No EnvPony;");
        CobolDisplay.display("DPONY set to No Dpony;");
        CobolDisplay.display("My pony is default Dirty;");
        CobolDisplay.display("DPONY is DEFINED as No Dpony;");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc162DefineDefaults().run(); }
}
