package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunSubscripts012CallWithOccursDependingOn extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "prog-main";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
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
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    // WORKING-STORAGE SECTION
    private CobolString parm = new CobolString(102); // Group: parm
    private short parm_size = (short) 0;
    private CobolString parm_str = new CobolString(100); // Group: parm-str
    private CobolString[] parm_char = new CobolString[100];
    {
        for (int _d0 = 0; _d0 < 100; _d0++) {
            parm_char[_d0] = new CobolString(1);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(102);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_parm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 102).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("parm").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_parm_size = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("parm-size").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_parm_str = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 100).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("parm-str").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_parm_char = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("parm-char").build();


    private void para_main() {
        parm_size = (short) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(10), 3);
        parm_str.set(String.valueOf("Hi, there!"));
        { /* Sync OCCURS children of parm-str after group MOVE */
            String _grp = parm_str.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < parm_size; _gi++) {
                int _base = 0 + _gi * 1;
                if (_base + 0 < _grpLen) { if (parm_char[_gi] == null) parm_char[_gi] = new CobolString(1); parm_char[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 1, _grpLen))); }
            }
        }
        { /* Pre-CALL: sync parm from children */
            String _gp = String.valueOf(parm);
            StringBuilder _sb = new StringBuilder(102);
            { String _fmt = String.format("%03d", Math.abs((int) parm_size)); _sb.append(_fmt.substring(Math.max(0, _fmt.length() - 3))); }
            for (int _ci = 0; _ci < parm_size; _ci++) {
                _sb.append(String.format("%-1s", parm_char[_ci] != null ? String.valueOf(parm_char[_ci]) : "").substring(0, 1));
            }
            for (int _ci = parm_size; _ci < 100; _ci++) _sb.append(String.format("%-1s", ""));
            parm.set(_sb.toString());
        }
        CobolProgram.callNested("prog", parm);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog-main", "", "prog-main.cob");
        CobolProgram.pushActive("prog-main");
        try {
            CobolProgram.registerCallAlias("prog-main", "RunSubscripts012CallWithOccursDependingOn");
            CobolProgram.registerCallAlias("prog", "RunSubscripts012CallWithOccursDependingOn_Prog");
            CobolProgram.registerCallAlias("prog-main", "RunSubscripts012CallWithOccursDependingOn");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunSubscripts012CallWithOccursDependingOn().run();
    }
}

class RunSubscripts012CallWithOccursDependingOn_Prog extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "prog";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
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
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    // LINKAGE SECTION
    private CobolString parm = new CobolString(102); // Group: parm
    private short parm_size = (short) 0;
    private CobolString parm_str = new CobolString(100); // Group: parm-str
    private CobolString[] parm_char = new CobolString[100];
    {
        for (int _d0 = 0; _d0 < 100; _d0++) {
            parm_char[_d0] = new CobolString(1);
        }
    }
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    private void para_main() {
        CobolDisplay.displayNoAdvancing(String.valueOf(CobolIntrinsics.trim(parm_str)));
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunSubscripts012CallWithOccursDependingOn_Prog");
            CobolProgram.registerCallAlias("prog", "RunSubscripts012CallWithOccursDependingOn_Prog");
            CobolProgram.registerCallAlias("prog-main", "RunSubscripts012CallWithOccursDependingOn");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }
    public void setLinkageArgs(Object[] args) {
        if (args.length > 0 && args[0] != null) {
            if (args[0] instanceof CobolString) parm = (CobolString) args[0]; else parm.set(String.valueOf(args[0]));
            { /* Decompose parm linkage group into children */
                String _lnk = parm.get();
                int _lnkLen = _lnk.length();
                if (0 < _lnkLen) { try { parm_size = (short) Integer.parseInt(_lnk.substring(0, Math.min(3, _lnkLen)).trim()); } catch (Exception _e) { parm_size = 0; } }
                if (3 < _lnkLen) parm_str.set(_lnk.substring(3, Math.min(103, _lnkLen)));
                for (int _li = 0; _li < parm_size; _li++) {
                    int _base = 3 + _li * 1;
                    if (_base < _lnkLen) { if (parm_char[_li] == null) parm_char[_li] = new CobolString(1); parm_char[_li].set(_lnk.substring(_base, Math.min(_base + 1, _lnkLen))); }
                }
            }
        }
    }
    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunSubscripts012CallWithOccursDependingOn_Prog().run();
    }
}
