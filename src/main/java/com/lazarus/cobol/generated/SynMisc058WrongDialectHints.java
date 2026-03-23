package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc058WrongDialectHints extends CobolProgram {
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
    private CobolString x = new CobolString(1);



    private CobolString _unnamed = new CobolString(256);
    private CobolString filler_1 = new CobolString(256);
    private void para_main() {
        CobolDisplay.display(String.valueOf(x));
    }

    private void conversion() {
        { String _tf = String.valueOf(x); String _from = String.valueOf(String.valueOf(_unnamed)); String _to = String.valueOf(String.valueOf(filler_1)); StringBuilder _sb = new StringBuilder(_tf); for (int _i = 0; _i < _sb.length(); _i++) { int _p = _from.indexOf(_sb.charAt(_i)); if (_p >= 0 && _p < _to.length()) _sb.setCharAt(_i, _to.charAt(_p)); } x.set(_sb.toString()); }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc058WrongDialectHints().run();
    }
}
