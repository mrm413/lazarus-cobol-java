package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions086CobolxFormat extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("Hello!");
        CobolDisplay.display("Hi!");
        CobolDisplay.display("        20        30        40        50        60        70        80        90       100       110       120       130       140       150       160       170       180       190       200       210       220       230       240       250");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions086CobolxFormat().run(); }
}
