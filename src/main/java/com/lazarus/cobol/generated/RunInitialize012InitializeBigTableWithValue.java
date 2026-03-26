package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize012InitializeBigTableWithValue extends CobolProgram {
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
    private CobolString t01_all = new CobolString(1); // Group: T01-ALL
    private CobolString[] t01_rec = new CobolString[10]; // Group: T01-REC
    private CobolString[] t01_someber = new CobolString[10];
    private CobolString[] t01_entry = new CobolString[10]; // Group: T01-ENTRY
    private CobolString[][] t01_tab = new CobolString[10][2200]; // Group: T01-TAB
    private CobolString[][] t01_name = new CobolString[10][2200];
    private CobolString[][] t01_detrec = new CobolString[10][2200]; // Group: T01-DETREC
    private CobolString[][][] t01_dettab = new CobolString[10][2200][47]; // Group: T01-DETTAB
    private CobolString[][][] t01_shl = new CobolString[10][2200][47];
    private int[][][] t01_len = new int[10][2200][47];
    private short[][][] t01_code1 = new short[10][2200][47];
    private short[][][] t01_code2 = new short[10][2200][47];
    private short[][][] t01_code3 = new short[10][2200][47];
    private CobolString[][][] t01_pref = new CobolString[10][2200][47];
    private CobolString[][][] t01_txt1 = new CobolString[10][2200][47];
    private CobolString[][][] t01_txt2 = new CobolString[10][2200][47];
    private CobolString[][][] t01_txt3 = new CobolString[10][2200][47];
    private CobolString[][][] t02_dettab = new CobolString[10][2200][33]; // Group: T02-DETTAB
    private int[][][] t02_len = new int[10][2200][33];
    private short[][][] t02_code1 = new short[10][2200][33];
    private short[][][] t02_code2 = new short[10][2200][33];
    private CobolString[][][] t02_shl = new CobolString[10][2200][33];
    private CobolString[][][] t02_pref = new CobolString[10][2200][33];
    private CobolString[][][] t02_txt1 = new CobolString[10][2200][33];
    private CobolString[][][] t02_txt2 = new CobolString[10][2200][33];
    private CobolString[][][] t02_txt3 = new CobolString[10][2200][33];


    private CobolString to = new CobolString(256); // fallback
    private CobolString cb_default = new CobolString(256); // fallback

    private void init_rtn() {
        if (t01_tab[5 - 1] == null) t01_tab[5 - 1] = new CobolString[2200];
        if (t01_tab[5 - 1][55 - 1] == null) t01_tab[5 - 1][55 - 1] = new CobolString(256);
        t01_tab[5 - 1][55 - 1].set(String.valueOf("HIGH-VALUE"));
        if (t01_tab[10 - 1] == null) t01_tab[10 - 1] = new CobolString[2200];
        if (t01_tab[10 - 1][400 - 1] == null) t01_tab[10 - 1][400 - 1] = new CobolString(256);
        t01_tab[10 - 1][400 - 1].set(String.valueOf("LOW-VALUE"));
        if (t01_rec[2 - 1] == null) t01_rec[2 - 1] = new CobolString(256);
        t01_rec[2 - 1].set(String.valueOf(" "));
        if (t01_rec[4 - 1] == null) t01_rec[4 - 1] = new CobolString(256);
        t01_rec[4 - 1].set(String.valueOf(" "));
        if (t01_rec[2 - 1] == null) t01_rec[2 - 1] = new CobolString(1);
        t01_rec[2 - 1].set("");
        to.set("");
        cb_default.set("");
        if (t01_rec[4 - 1] == null) t01_rec[4 - 1] = new CobolString(1);
        t01_rec[4 - 1].set("");
        return;
    }

    @Override
    public void run() {
        init_rtn();
    }

    public static void main(String[] args) {
        new RunInitialize012InitializeBigTableWithValue().run();
    }
}
