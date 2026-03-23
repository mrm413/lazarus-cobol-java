package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions011ComplexOccursDependingOn2 extends CobolProgram {
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



    private void para_main() {
    }

    private void i() {
    }

    private void j() {
    }

    private void k() {
        if (vxx[1 - 1] == null) vxx[1 - 1] = new CobolString(256);
        vxx[1 - 1].set(String.valueOf("1"));
        if (vyy[1 - 1] == null) vyy[1 - 1] = new CobolString(256);
        vyy[1 - 1].set(String.valueOf("22"));
        if (vzz[1 - 1] == null) vzz[1 - 1] = new CobolString(256);
        vzz[1 - 1].set(String.valueOf("333"));
    }

    private void vlen() {
        CobolDisplay.displayNoAdvancing(String.valueOf(vlen));
    }

    private void vlen_2() {
        CobolDisplay.displayNoAdvancing(String.valueOf(vlen));
        CobolDisplay.display(String.valueOf(vgroup));
    }

    private void vtop() {
    }

    private void i_2() {
    }

    private void j_2() {
    }

    private void k_2() {
        if (vxx[3 - 1] == null) vxx[3 - 1] = new CobolString(256);
        vxx[3 - 1].set(String.valueOf("3"));
        if (vyy[2 - 1] == null) vyy[2 - 1] = new CobolString(256);
        vyy[2 - 1].set(String.valueOf("22"));
        if (vzz[1 - 1] == null) vzz[1 - 1] = new CobolString(256);
        vzz[1 - 1].set(String.valueOf("111"));
    }

    private void vlen_3() {
        CobolDisplay.displayNoAdvancing(String.valueOf(vlen));
    }

    private void vlen_4() {
        CobolDisplay.displayNoAdvancing(String.valueOf(vlen));
        CobolDisplay.display(String.valueOf(vgroup));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions011ComplexOccursDependingOn2().run();
    }
}
