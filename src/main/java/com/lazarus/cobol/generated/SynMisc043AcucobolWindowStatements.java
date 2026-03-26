package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc043AcucobolWindowStatements extends CobolProgram {
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
    private int myhandle = 0;
    private int mythread = 0;
    private int window_handle = 0;


    // FALLBACK FILE DESCRIPTORS
    private CobolFile window = new CobolFile("WINDOW", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString column = new CobolString(256); // fallback
    private CobolString size = new CobolString(256); // fallback
    private CobolString lines = new CobolString(256); // fallback
    private CobolString erase = new CobolString(256); // fallback
    private CobolString screen = new CobolString(256); // fallback
    private CobolString boxed = new CobolString(256); // fallback
    private CobolString shadow = new CobolString(256); // fallback
    private CobolString pop_up = new CobolString(256); // fallback
    private CobolString area = new CobolString(256); // fallback
    private CobolString is = new CobolString(256); // fallback
    private CobolString floating = new CobolString(256); // fallback
    private CobolString omitted = new CobolString(256); // fallback
    private CobolString at = new CobolString(256); // fallback
    private CobolString foreground_color = new CobolString(256); // fallback
    private CobolString background_color = new CobolString(256); // fallback
    private CobolString top = new CobolString(256); // fallback
    private CobolString centered = new CobolString(256); // fallback
    private CobolString title = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString subwindow = new CobolString(256); // fallback
    private CobolString bottom = new CobolString(256); // fallback
    private CobolString left = new CobolString(256); // fallback
    private CobolString right = new CobolString(256); // fallback

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
    private CobolString _filler_015 = new CobolString(256); // fallback
    private CobolString _filler_016 = new CobolString(256); // fallback
    private CobolString _filler_017 = new CobolString(256); // fallback
    private CobolString _filler_018 = new CobolString(256); // fallback
    private CobolString _filler_019 = new CobolString(256); // fallback
    private CobolString _filler_020 = new CobolString(256); // fallback
    private CobolString _filler_021 = new CobolString(256); // fallback
    private CobolString _filler_022 = new CobolString(256); // fallback
    private void para_main() {
        CobolDisplay.display(String.valueOf(window) + String.valueOf(_filler_003) + String.valueOf(line) + String.valueOf(1) + String.valueOf(_filler_004) + String.valueOf(column) + String.valueOf(29) + String.valueOf(_filler_005) + String.valueOf(size) + String.valueOf(51) + String.valueOf(_filler_006) + String.valueOf(lines) + String.valueOf(12) + String.valueOf(_filler_007) + String.valueOf(erase) + String.valueOf(screen) + String.valueOf(boxed) + String.valueOf(shadow) + String.valueOf(_filler_008) + String.valueOf(pop_up) + String.valueOf(area) + String.valueOf(is) + String.valueOf(window_handle));
        CobolDisplay.display("THIS IS TEXT IN A WINDOW");
        CobolDisplay.display(String.valueOf(floating) + String.valueOf(window) + String.valueOf(_filler_009) + String.valueOf(line) + String.valueOf(5) + String.valueOf(_filler_010) + String.valueOf(column) + String.valueOf(10) + String.valueOf(_filler_011) + String.valueOf(size) + String.valueOf(20) + String.valueOf(_filler_012) + String.valueOf(lines) + String.valueOf(2) + String.valueOf(_filler_013) + String.valueOf(erase) + String.valueOf(screen) + String.valueOf(_filler_014) + String.valueOf(pop_up) + String.valueOf(area) + String.valueOf(is) + String.valueOf(myhandle));
        CobolDisplay.display("Some text for the floating window");
        omitted.set(String.valueOf(CobolDisplay.accept()));
        window.close();
        /* CLOSE myhandle — skipped, not a file */
        CobolDisplay.display(String.valueOf(floating) + String.valueOf(window) + String.valueOf(_filler_015) + String.valueOf(line) + String.valueOf(5) + String.valueOf(_filler_016) + String.valueOf(column) + String.valueOf(10) + String.valueOf(_filler_017) + String.valueOf(size) + String.valueOf(20) + String.valueOf(_filler_018) + String.valueOf(lines) + String.valueOf(2) + String.valueOf(_filler_019) + String.valueOf(erase) + String.valueOf(screen) + String.valueOf(_filler_020) + String.valueOf(pop_up) + String.valueOf(area) + String.valueOf(mythread));
        omitted.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: DESTROY WINDOW-HANDLE */
        CobolDisplay.display(String.valueOf(window) + String.valueOf(at) + String.valueOf(1020) + String.valueOf(size) + String.valueOf(36) + String.valueOf(lines) + String.valueOf(15) + String.valueOf(boxed) + String.valueOf(foreground_color) + String.valueOf(is) + String.valueOf(7) + String.valueOf(background_color) + String.valueOf(is) + String.valueOf(0) + String.valueOf(top) + String.valueOf(centered) + String.valueOf(title) + String.valueOf(is) + "SOME TITLE" + String.valueOf(pop_up) + String.valueOf(area) + String.valueOf(_filler_021) + String.valueOf(window_handle));
        CobolDisplay.display(String.valueOf(subwindow) + String.valueOf(shadow) + String.valueOf(at) + String.valueOf(505) + String.valueOf(size) + String.valueOf(25) + String.valueOf(lines) + String.valueOf(10) + String.valueOf(bottom) + String.valueOf(left) + String.valueOf(title) + String.valueOf(_filler_022) + "buttom left" + String.valueOf(background_color) + String.valueOf(is) + String.valueOf(10) + String.valueOf(foreground_color) + String.valueOf(is) + String.valueOf(5));
        CobolDisplay.display(String.valueOf(window) + String.valueOf(shadow) + String.valueOf(at) + String.valueOf(808) + String.valueOf(size) + String.valueOf(18) + String.valueOf(lines) + String.valueOf(5) + String.valueOf(right) + String.valueOf(title) + "top right" + String.valueOf(background_color) + String.valueOf(1) + String.valueOf(foreground_color) + String.valueOf(14));
        omitted.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: DESTROY WINDOW-HANDLE * */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc043AcucobolWindowStatements().run();
    }
}
