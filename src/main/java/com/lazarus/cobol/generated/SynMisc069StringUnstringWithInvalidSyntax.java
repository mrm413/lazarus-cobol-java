package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc069StringUnstringWithInvalidSyntax extends CobolProgram {
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
    private CobolString a = new CobolString(1);
    private CobolString b = new CobolString(1);
    private CobolString c = new CobolString(3);


    private CobolString delimited = new CobolString(256);
    private CobolString by = new CobolString(256);
    private CobolString end_string = new CobolString(256);
    private CobolString size = new CobolString(256);
    private CobolString space = new CobolString(256);
    private CobolString into = new CobolString(256);

    private void para_main() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(delimited));
            _sb.append(String.valueOf(by));
            _sb.append(" ");
            end_string.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(a), " "));
            _sb.append(String.valueOf(c));
            end_string.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(a), " "));
            end_string.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(delimited));
            _sb.append(String.valueOf(by));
            _sb.append(" ");
            c.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(a), " "));
            _sb.append(String.valueOf(delimited));
            _sb.append(String.valueOf(by));
            _sb.append(String.valueOf(size));
            c.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(a), " "));
            _sb.append(String.valueOf(b));
            c.set(_sb.toString());
        }
        /* RAW: *  */
        /* UNSTRING — requires runtime implementation */
        by.set(String.valueOf(""));
        space.set(String.valueOf(""));
        into.set(String.valueOf(""));
        a.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        a.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        /* UNSTRING — requires runtime implementation */
        by.set(String.valueOf(""));
        space.set(String.valueOf(""));
        into.set(String.valueOf(""));
        a.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        a.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        delimited.set(String.valueOf(""));
        by.set(String.valueOf(""));
        size.set(String.valueOf(""));
        into.set(String.valueOf(""));
        a.set(String.valueOf(""));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc069StringUnstringWithInvalidSyntax().run();
    }
}
