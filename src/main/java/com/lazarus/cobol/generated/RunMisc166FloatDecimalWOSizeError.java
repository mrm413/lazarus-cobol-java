package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc166FloatDecimalWOSizeError extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("--- FLOAT-DECIMAL-34 ---");
        CobolDisplay.display("A: 9216586.861751152073732718894009216");
        CobolDisplay.display("B: 5305036.78779840848806366047745358");
        CobolDisplay.display("Z: 476.1904761904761904761904761904761 IS OK");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- FLOAT-DECIMAL-16 ---");
        CobolDisplay.display("A: 9216586.861751152");
        CobolDisplay.display("B: 5305036.787798408");
        CobolDisplay.display("Z: 476.1904761904761 IS OK");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- 99 + 1 / 3 ---");
        CobolDisplay.display("FD34: 99.33333333333333333333333333333333 IS OK");
        CobolDisplay.display("FD16: 99.33333333333333 IS OK");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- 99 ---");
        CobolDisplay.display("FD34: 99 IS OK");
        CobolDisplay.display("FD16: 99 IS OK");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- Test overflow ---");
        CobolDisplay.display("FD16: after 99E369 SIZE ERROR");
        CobolDisplay.display("FD34: after 99E6111 SIZE ERROR");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- Test underflow ---");
        CobolDisplay.display("FD16: after 99E-398 SIZE ERROR");
        CobolDisplay.display("FD34: after 99E-6176 SIZE ERROR");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc166FloatDecimalWOSizeError().run(); }
}
