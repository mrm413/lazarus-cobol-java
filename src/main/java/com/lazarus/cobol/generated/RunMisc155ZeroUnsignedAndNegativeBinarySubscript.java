package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc155ZeroUnsignedAndNegativeBinarySubscript extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("UNUP: 00000000 is :CCCC:");
        CobolDisplay.display("SNUP: +00000000 is :CCCC:");
        CobolDisplay.display("SBIN: +00000000 is :CCCC:");
        CobolDisplay.display("SBIN: -00000001 is :BBBB:");
        CobolDisplay.display("SBIN: -00000001 is :xxx :");
        CobolDisplay.display("UBIN: 00000000 is :CCCC:");
        CobolDisplay.display("UBIN: 00000001 is :1111:");
        CobolDisplay.display("UCHR: 000 is :yyy :");
        CobolDisplay.display("SCHR: -001 is :xxx :");
        CobolDisplay.display("UCHR: 129 is :zzz :");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc155ZeroUnsignedAndNegativeBinarySubscript().run(); }
}
