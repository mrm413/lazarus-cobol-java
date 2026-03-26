package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions105GcosLiteralsWithEbcdicSymbolsRun extends CobolProgram {
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
    private CobolString x = new CobolString(11);
    private int t = 0;
    private float s = 0.0f;


    private CobolString _135 = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString _151 = new CobolString(256); // fallback
    private CobolString bar = new CobolString(256); // fallback
    private CobolString _195 = new CobolString(256); // fallback
    private CobolString _194 = new CobolString(256); // fallback
    private CobolString _234 = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString to = new CobolString(256); // fallback
    private CobolString z = new CobolString(256); // fallback
    private CobolString _75 = new CobolString(256); // fallback
    private CobolString _80 = new CobolString(256); // fallback
    private CobolString _91 = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private CobolString _filler_010 = new CobolString(256); // fallback
    private CobolString _filler_011 = new CobolString(256); // fallback
    private CobolString _filler_012 = new CobolString(256); // fallback
    private CobolString _filler_013 = new CobolString(256); // fallback
    private CobolString _filler_014 = new CobolString(256); // fallback
    private void para_main() {
        t = new BigDecimal(String.valueOf(1).trim()).intValue();
        _135.set(String.valueOf(""));
        _filler_003.set(String.valueOf(""));
        _151.set(String.valueOf(""));
        _filler_004.set(String.valueOf(""));
        _151.set(String.valueOf(""));
        bar.set(String.valueOf(""));
        _195.set(String.valueOf(""));
        _filler_005.set(String.valueOf(""));
        _194.set(String.valueOf(""));
        _filler_006.set(String.valueOf(""));
        _234.set(String.valueOf(""));
        _filler_007.set(String.valueOf(""));
        to.set(String.valueOf(""));
        x.set(String.valueOf(""));
        if (!String.valueOf(x).equals(String.valueOf("foobarBAZ"))) {
            show();
        }
        t = new BigDecimal(String.valueOf(2).trim()).intValue();
        _135.set(String.valueOf("  "));
        _filler_008.set(String.valueOf("  "));
        _151.set(String.valueOf("  "));
        _filler_009.set(String.valueOf("  "));
        _151.set(String.valueOf("  "));
        bar.set(String.valueOf("  "));
        _195.set(String.valueOf("  "));
        _194.set(String.valueOf("  "));
        z.set(String.valueOf("  "));
        to.set(String.valueOf("  "));
        x.set(String.valueOf("  "));
        if (!String.valueOf(x).equals(String.valueOf("  foobarBAZ"))) {
            show();
        }
        t = new BigDecimal(String.valueOf(3).trim()).intValue();
        _135.set(String.valueOf(" "));
        _151.set(String.valueOf(" "));
        _filler_010.set(String.valueOf(" "));
        _151.set(String.valueOf(" "));
        bar.set(String.valueOf(" "));
        _195.set(String.valueOf(" "));
        _filler_011.set(String.valueOf(" "));
        _194.set(String.valueOf(" "));
        z.set(String.valueOf(" "));
        to.set(String.valueOf(" "));
        x.set(String.valueOf(" "));
        if (!String.valueOf(x).equals(String.valueOf(" foobarBAZ"))) {
            show();
        }
        t = new BigDecimal(String.valueOf(4).trim()).intValue();
        _75.set(String.valueOf(""));
        _filler_012.set(String.valueOf(""));
        _80.set(String.valueOf(""));
        _filler_013.set(String.valueOf(""));
        _91.set(String.valueOf(""));
        _filler_014.set(String.valueOf(""));
        to.set(String.valueOf(""));
        x.set(String.valueOf(""));
        if (!String.valueOf(x).equals(String.valueOf("[!]"))) {
            show();
        }
        System.exit(0);
    }

    private void show() {
        CobolDisplay.display("EBCDIC LIT " + String.valueOf(t) + " FAILED: X = \"" + String.valueOf(x) + "\"");
        s = (float) Double.parseDouble(String.valueOf(1).trim());
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions105GcosLiteralsWithEbcdicSymbolsRun().run();
    }
}
