package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc056SwitchesEnvironmentCobSwitchNAndSet extends CobolProgram {
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
    private boolean _switch_1 = false;
    private boolean _switch_2 = false;
    private boolean _switch_3 = false;
    private boolean _switch_4 = false;
    private boolean _switch_31 = false;
    private boolean _switch_36 = false;
    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    private CobolString swit1_on = new CobolString(256); // fallback
    private CobolString swit2_on = new CobolString(256); // fallback
    private CobolString swit3_on = new CobolString(256); // fallback
    private CobolString swit4_off = new CobolString(256); // fallback
    private CobolString swit1 = new CobolString(256); // fallback
    private CobolString off = new CobolString(256); // fallback
    private CobolString swit2 = new CobolString(256); // fallback
    private CobolString on = new CobolString(256); // fallback
    private CobolString swit31_on = new CobolString(256); // fallback
    private CobolString swit36_off = new CobolString(256); // fallback

    private void para_main() {
        if (_switch_1) {
            CobolDisplay.displayNoAdvancing("ON");
        } else {
            CobolDisplay.displayNoAdvancing("OFF");
        }
        if (_switch_2) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (_switch_3) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!(!_switch_4)) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        _switch_1 = false;
        _switch_2 = true;
        if (_switch_1) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (_switch_2) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (_switch_31) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        if (!(!_switch_36)) {
            CobolDisplay.displayNoAdvancing(" ON");
        } else {
            CobolDisplay.displayNoAdvancing(" OFF");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc056SwitchesEnvironmentCobSwitchNAndSet");
            CobolProgram.registerCallAlias("prog", "RunMisc056SwitchesEnvironmentCobSwitchNAndSet");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            _switch_1 = "1".equals(System.getenv("COB_SWITCH_1"));
            _switch_2 = "1".equals(System.getenv("COB_SWITCH_2"));
            _switch_3 = "1".equals(System.getenv("COB_SWITCH_3"));
            _switch_4 = "1".equals(System.getenv("COB_SWITCH_4"));
            _switch_31 = "1".equals(System.getenv("COB_SWITCH_31"));
            _switch_36 = "1".equals(System.getenv("COB_SWITCH_36"));
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
        new RunMisc056SwitchesEnvironmentCobSwitchNAndSet().run();
    }
}
