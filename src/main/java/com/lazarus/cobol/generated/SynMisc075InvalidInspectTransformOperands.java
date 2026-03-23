package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc075InvalidInspectTransformOperands extends CobolProgram {
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
    private short not_display = (short) 0;
    private CobolString not_a_num = new CobolString(5);

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("A", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString function = new CobolString(256);

    private CobolString udf = new CobolString(256); // autofix
    private CobolString from = new CobolString(256); // autofix
    private CobolString yada = new CobolString(256); // autofix
    private void para_main() {
        /* INSPECT f — 4 clause(s) */
        /* TRANSFORM f — skipped, target is a file */
    // { String _tf = String.valueOf(function); String _from = String.valueOf(String.valueOf(udf[Integer.parseInt(String.valueOf(f_rec).trim()) - 1])); String _to = String.valueOf(String.valueOf(from)); StringBuilder _sb = new StringBuilder(_tf); for (int _i = 0; _i < _sb.length(); _i++) { int _p = _from.indexOf(_sb.charAt(_i)); if (_p >= 0 && _p < _to.length()) _sb.setCharAt(_i, _to.charAt(_p)); } function.set(_sb.toString()); }
        /* RAW: SPACE TO ZERO */
        { String _tf = String.valueOf(yada); String _from = String.valueOf(" "); String _to = String.valueOf(0); StringBuilder _sb = new StringBuilder(_tf); for (int _i = 0; _i < _sb.length(); _i++) { int _p = _from.indexOf(_sb.charAt(_i)); if (_p >= 0 && _p < _to.length()) _sb.setCharAt(_i, _to.charAt(_p)); } yada.set(_sb.toString()); }
        /* INSPECT function — 5 clause(s) */
    }

    private void space() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc075InvalidInspectTransformOperands().run();
    }
}
