package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions073FunctionNumval extends CobolProgram {
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
    private CobolString x1 = new CobolString(12);
    private CobolString x2 = new CobolString(18);
    private CobolString x2b = new CobolString(18);
    private CobolString x2c = new CobolString(18);
    private CobolString x2d = new CobolString(18);
    private CobolString x3 = new CobolString(9);
    private CobolString x4 = new CobolString(9);
    private CobolString x5 = new CobolString(9);
    private CobolString bad1 = new CobolString(18);
    private CobolString bad2 = new CobolString(20);
    private CobolString empt = new CobolString(20);
    private int csze = 0;
    private CobolString vsized = new CobolString(1); // Group: VSIZED
    private CobolString[] filler_1 = new CobolString[10];
    private BigDecimal n = BigDecimal.ZERO;


    // FALLBACK FILE DESCRIPTORS
    private CobolFile zero = new CobolFile("ZERO", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        // Transpiled COBOL body (requires runtime extensions for full compilation):
    // 
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(x1)).trim());
    // if (n.compareTo(new BigDecimal(String.valueOf(-9876.1234).trim())) != 0) {
    // CobolDisplay.display("X1 '" + String.valueOf(x1) + "' : " + String.valueOf(n));
    // }
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(x2)).trim());
    // if (n.compareTo(new BigDecimal(String.valueOf(-19876.1234).trim())) != 0) {
    // CobolDisplay.display("X2 '" + String.valueOf(x2) + "' : " + String.valueOf(n));
    // } else {
    // if (((n.compareTo(CobolIntrinsics.numval(x2b)) != 0 || n.compareTo(CobolIntrinsics.numval(x2c)) != 0) || n.compareTo(CobolIntrinsics.numval(x2d)) != 0)) {
    // CobolDisplay.display("NUMVAL not case-insensitive!");
    // }
    // }
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(x3)).trim());
    // if (n.compareTo(new BigDecimal(String.valueOf(-42.324).trim())) != 0) {
    // CobolDisplay.display("X3 '" + String.valueOf(x3) + "' : " + String.valueOf(n));
    // }
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(x4)).trim());
    // if (n.compareTo(new BigDecimal(String.valueOf(4232400).trim())) != 0) {
    // CobolDisplay.display("X4 '" + String.valueOf(x4) + "' : " + String.valueOf(n));
    // }
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(x5)).trim());
    // if (n.compareTo(new BigDecimal(String.valueOf(0.0043).trim())) != 0) {
    // CobolDisplay.display("X5 '" + String.valueOf(x5) + "' : " + String.valueOf(n));
    // }
    // /* RAW: * Note : the following are */
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(empt)).trim());
    // if (n.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
    // CobolDisplay.display("EMPT '" + String.valueOf(empt) + "' :  " + String.valueOf(n));
    // }
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(vsized)).trim());
    // if (n.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
    // CobolDisplay.display("VSIZED '" + String.valueOf(vsized) + "' :  " + String.valueOf(n));
    // }
    // /* RAW: * Note : the following tests */
    // {
    // String _rec = _sort.returnRecord();
    // if (_rec == null) {
    // }
    // }
    // /* RAW: , 3.2 + get "whatever is valid there" * */
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(bad1)).trim());
    // if ((n.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0 && n.compareTo(new BigDecimal(String.valueOf(-1.045).trim())) != 0)) {
    // CobolDisplay.display("BAD1 '" + String.valueOf(bad1) + "' : " + String.valueOf(n));
    // }
    // n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(bad2)).trim());
    // if ((n.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0 && n.compareTo(new BigDecimal(String.valueOf(10).trim())) != 0)) {
    // CobolDisplay.display("BAD2 '" + String.valueOf(bad2) + "' : " + String.valueOf(n));
    // }
    // System.exit(0);
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions073FunctionNumval().run();
    }
}
