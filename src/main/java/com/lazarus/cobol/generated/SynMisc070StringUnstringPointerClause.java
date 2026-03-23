package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc070StringUnstringPointerClause extends CobolProgram {
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
    private int valid_ptr = 0;
    private int valid_ptr_2 = 0;
    private BigDecimal valid_ptr_3 = BigDecimal.ZERO;
    private int invalid_ptr = 0;
    private int invalid_ptr_2 = 0;
    private double invalid_ptr_3 = 0.0;
    private int invalid_ptr_4 = 0;
    private BigDecimal invalid_ptr_5 = BigDecimal.ZERO;
    private CobolString invalid_ptr_6 = new CobolString(30);
    private CobolString invalid_ptr_7 = new CobolString(1); // Group: invalid-ptr-7
    private int n = 0;
    private int n2 = 0;
    private CobolString x = new CobolString(9);
    private CobolString y = new CobolString(9);



    private void para_main() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("hello");
            x.set(_sb.toString());
        }
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        x.set(String.valueOf(""));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc070StringUnstringPointerClause().run();
    }
}
