package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc139TraceFeatureWithSubroutine extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("OK: Operations on empty file");
        CobolDisplay.display("Loading sample data file.");
        CobolDisplay.display("Sample data file load complete.");
        CobolDisplay.display("LIST SAMPLE FILE");
        CobolDisplay.display("Key: EPS00000 is EPSILON EQUIPMENT SUPPLY  Disk=8417    .");
        CobolDisplay.display("Key: FOR00000 is FORTUNE COOKIE COMPANY    Disk=8470    .");
        CobolDisplay.display("Key: GAM00000 is GAMMA X-RAY TECHNOLOGY    Disk=8417    .");
        CobolDisplay.display("Key: GIB00000 is GIBRALTER LIFE INSURANCE  Disk=8417    .");
        CobolDisplay.display("Key: H&J00000 is H & J PLUMBING SUPPLIES   Disk=8470    .");
        CobolDisplay.display("Key: INC00000 is INCREMENTAL BACKUP CORP.  Disk=8417    .");
        CobolDisplay.display("Key: JOH00000 is JOHNSON BOATING SUPPLIES  Disk=8417    .");
        CobolDisplay.display("Key: KON00000 is KONFLAB PLASTIC PRODUCTS. Disk=8417    .");
        CobolDisplay.display("Key: LEW00000 is LEWISTON GRAPHICS LTD.    Disk=8470    .");
        CobolDisplay.display("Key: MOR00000 is MORNINGSIDE CARPENTRY.    Disk=8470    .");
        CobolDisplay.display("Key: NEW00000 is NEW WAVE SURF SHOPS INC.  Disk=8470    .");
        CobolDisplay.display("Stop read after: 11");
        CobolDisplay.display("LIST SAMPLE FILE DESCENDING");
        CobolDisplay.display("Key: NEW00000 is NEW WAVE SURF SHOPS INC.  Disk=8470    .");
        CobolDisplay.display("Key: MOR00000 is MORNINGSIDE CARPENTRY.    Disk=8470    .");
        CobolDisplay.display("Key: LEW00000 is LEWISTON GRAPHICS LTD.    Disk=8470    .");
        CobolDisplay.display("Key: KON00000 is KONFLAB PLASTIC PRODUCTS. Disk=8417    .");
        CobolDisplay.display("Key: JOH00000 is JOHNSON BOATING SUPPLIES  Disk=8417    .");
        CobolDisplay.display("Key: INC00000 is INCREMENTAL BACKUP CORP.  Disk=8417    .");
        CobolDisplay.display("Key: H&J00000 is H & J PLUMBING SUPPLIES   Disk=8470    .");
        CobolDisplay.display("Key: GIB00000 is GIBRALTER LIFE INSURANCE  Disk=8417    .");
        CobolDisplay.display("Key: GAM00000 is GAMMA X-RAY TECHNOLOGY    Disk=8417    .");
        CobolDisplay.display("Key: FOR00000 is FORTUNE COOKIE COMPANY    Disk=8470    .");
        CobolDisplay.display("Key: EPS00000 is EPSILON EQUIPMENT SUPPLY  Disk=8417    .");
        CobolDisplay.display("Got: BET00000 is BETA SHOE MFG. INC.       Disk=8470    .");
        CobolDisplay.display("Nxt: DEL00000 is DELTA LUGGAGE REPAIRS     Disk=8470    .");
        CobolDisplay.display("Ky2: GIB00000 is GIBRALTER LIFE INSURANCE  Mach=UNI-80/6.");
        CobolDisplay.display("  Write: GIB00000 got 22 as expected");
        CobolDisplay.display("   Read: GAM00000 got 00 as expected 00075 terminals");
        CobolDisplay.display("ReWrite: GAM00000 got 00 as expected 00080 terminals");
        CobolDisplay.display("   Read: BET00000 got 00 as expected 00034 terminals");
        CobolDisplay.display("ReWrite: GAM00000 got 00/02 as expected");
        CobolDisplay.display("ReWrite: FOR00000 got 00/02 as expected");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc139TraceFeatureWithSubroutine().run(); }
}
