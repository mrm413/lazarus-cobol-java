package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental064NumericOperations7 extends CobolProgram {
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
    private BigDecimal field = BigDecimal.ZERO;
    private BigDecimal field_disp = BigDecimal.ZERO;



    private void para_main() {
    }

    private void field() {
        field = field.add(new BigDecimal(String.valueOf(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 + 21 + 22 + 23 + 24 + 25 + 26 + 27 + 28 + 29 + 30 + 31 + 32 + 33 + 34 + 35 + 36 + 37 + 38 + 39 + 40 + 41 + 42 + 43 + 44 + 45 + 46 + 47 + 48 + 49 + 50 + 51 + 52 + 53 + 54 + 55 + 56 + 57 + 58 + 59 + 60 + 61 + 62 + 63 + 64 + 65 + 66 + 67 + 68 + 69 + 70 + 71 + 72 + 73 + 74 + 75 + 76 + 77 + 78 + 79 + 80 + 81 + 82 + 83 + 84 + 85 + 86 + 87 + 88 + 89 + 90 + 91 + 92 + 93 + 94 + 95 + 96 + 97 + 98 + 99 + 100 + 101 + 102 + 103 + 104 + 105 + 106 + 107 + 108 + 109 + 110 + 111 + 112 + 113 + 114 + 115 + 116 + 117 + 118 + 119 + 120 + 121 + 122 + 123 + 124 + 125 + 126 + 127 + 128 + 129).trim()));
        if (field.compareTo(new BigDecimal(String.valueOf(8385.2).trim())) != 0) {
            field_disp = new BigDecimal(String.valueOf(field).trim());
            CobolDisplay.display("ADD with wrong result: ");
            /* RAW: FIELD-DISP  */
        }
        field = new BigDecimal(String.valueOf((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((0.2 + 2) + 3) + 4) + 5) + 6) + 7) + 8) + 9) + 10) + 11) + 12) + 13) + 14) + 15) + 16) + 17) + 18) + 19) + 20) + 21) + 22) + 23) + 24) + 25) + 26) + 27) + 28) + 29) + 30) + 31) + 32) + 33) + 34) + 35) + 36) + 37) + 38) + 39) + 40) + 41) + 42) + 43) + 44) + 45) + 46) + 47) + 48) + 49) + 50) + 51) + 52) + 53) + 54) + 55) + 56) + 57) + 58) - 59) - 60) - 61) - 62) - 63) - 64) - 65) - 66) - 67) - 68) - 69) - 70) - 71) - 72) - 73) - 74) - 75) - 76) - 77) - 78) - 79) - 80) - 81) - 82) - 83) - 84) - 85) - 86) - 87) - 88) - 89) - 90) - 91) - 92) - 93) - 94) - 95) - 96) - 97) - 98) - 99) - 100) - 101) - 102) - 103) - 104) - 105) - 106) - 107) - 108) - 109) - 110) - 111) - 112) - 113) - 114) - 115) - 116) - 117) - 118) - 119) - 120) - 121) - 122) - 123) - 124) - 125) - 126) - 127)) * 12800000000L) / 12900000000L)).trim());
        if (field.compareTo(new BigDecimal(String.valueOf(-4670.31).trim())) != 0) {
            field_disp = new BigDecimal(String.valueOf(field).trim());
            CobolDisplay.display("COMPUTE with wrong result: ");
            /* RAW: FIELD-DISP  */
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental064NumericOperations7().run();
    }
}
