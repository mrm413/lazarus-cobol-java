package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions013ComplexOccursDependingOn4 extends CobolProgram {
    private int tally = 0;
    private int return_code = 0;
    private int sort_return = 0;
    private int number_of_call_parameters = 0;
    private int cob_crt_status = 0;
    private int length_an = 0;
    private CobolString when_compiled = new CobolString(21);
    private CobolString debug_item = new CobolString(256);
    private CobolString debug_line = new CobolString(6);
    private CobolString debug_name = new CobolString(30);
    private CobolString debug_sub_1 = new CobolString(4);
    private CobolString debug_sub_2 = new CobolString(4);
    private CobolString debug_sub_3 = new CobolString(4);
    private CobolString debug_contents = new CobolString(256);
    // WORKING-STORAGE SECTION
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int vlen = 0;
    private CobolString vtop = new CobolString(1); // Group: VTOP
    private CobolString vgroup = new CobolString(1); // Group: VGROUP
    private CobolString[] vx = new CobolString[5]; // Group: VX
    private CobolString[] vxx = new CobolString[5];
    private CobolString[] vy = new CobolString[5]; // Group: VY
    private CobolString[] vyy = new CobolString[5];
    private CobolString[] zz = new CobolString[5]; // Group: ZZ
    private CobolString[] vzz = new CobolString[5];
    private CobolString vfix = new CobolString(3);



    private void para_main() {
        i = new BigDecimal(String.valueOf(1).trim()).intValue();
        j = new BigDecimal(String.valueOf(1).trim()).intValue();
        k = new BigDecimal(String.valueOf(1).trim()).intValue();
        if (vxx[1 - 1] == null) vxx[1 - 1] = new CobolString(256);
        vxx[1 - 1].set(String.valueOf("1"));
        if (vyy[1 - 1] == null) vyy[1 - 1] = new CobolString(256);
        vyy[1 - 1].set(String.valueOf("22"));
        if (vzz[1 - 1] == null) vzz[1 - 1] = new CobolString(256);
        vzz[1 - 1].set(String.valueOf("333"));
        vfix.set(String.valueOf("444"));
        vlen = new BigDecimal(String.valueOf(CobolIntrinsics.length(vgroup)).trim()).intValue();
        CobolDisplay.displayNoAdvancing(String.valueOf(vlen));
        vlen = new BigDecimal(String.valueOf(CobolIntrinsics.length(vgroup)).trim()).intValue();
        CobolDisplay.displayNoAdvancing(String.valueOf(vlen));
        CobolDisplay.display(String.valueOf(vgroup));
        vtop.set("");
        i = new BigDecimal(String.valueOf(3).trim()).intValue();
        j = new BigDecimal(String.valueOf(2).trim()).intValue();
        k = new BigDecimal(String.valueOf(1).trim()).intValue();
        if (vxx[3 - 1] == null) vxx[3 - 1] = new CobolString(256);
        vxx[3 - 1].set(String.valueOf("3"));
        if (vyy[2 - 1] == null) vyy[2 - 1] = new CobolString(256);
        vyy[2 - 1].set(String.valueOf("22"));
        if (vzz[1 - 1] == null) vzz[1 - 1] = new CobolString(256);
        vzz[1 - 1].set(String.valueOf("111"));
        vfix.set(String.valueOf("000"));
        vlen = new BigDecimal(String.valueOf(CobolIntrinsics.length(vgroup)).trim()).intValue();
        CobolDisplay.displayNoAdvancing(String.valueOf(vlen));
        vlen = new BigDecimal(String.valueOf(CobolIntrinsics.length(vgroup)).trim()).intValue();
        CobolDisplay.displayNoAdvancing(String.valueOf(vlen));
        CobolDisplay.display(String.valueOf(vgroup));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions013ComplexOccursDependingOn4().run();
    }
}
