package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions026CallGobackWithLocalStorage extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("entered prog_b");
        CobolDisplay.display("exiting prog_b");
        CobolDisplay.display("back in prog_a");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions026CallGobackWithLocalStorage().run(); }
}
