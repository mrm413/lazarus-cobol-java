package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile025IndexedFileSplitKeysWithDuplicates extends CobolProgram {
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
    private CobolString found = new CobolString(3);

    // FILE SECTION — test-file
    private CobolString test_rec = new CobolString(1); // Group: test-rec
    private CobolString test_key_p1 = new CobolString(4);
    private int test_key_p2 = 0;
    private CobolString test_data = new CobolString(4);
    private CobolString test_key_p3 = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("TESTFILE", "INDEXED", "DYNAMIC");


    private void para_main() {
        test_file.open("OUTPUT");
        test_file.write("BBBB0001dat1aaaa");
        test_file.write("AAAA0001dat2aaaa");
        test_file.write("CCCC0002dat3aaaa");
        test_file.write("DDDD0002dat4bbbb");
        test_file.write("EEEE0002dat5bbbb");
        test_file.close();
        test_file.open("INPUT");
        test_key_p1.set(String.valueOf("CCCC"));
        if (test_file.read(null) == FileStatus.AT_END) {
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile025IndexedFileSplitKeysWithDuplicates().run();
    }
}
