package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental012EqualityOfFloatShortFloatLong extends CobolProgram {
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
    // WORKING-STORAGE SECTION
    private double src1 = 11.55;
    private float dst1 = 0.0f;
    private float src2 = 11.55f;
    private double dst2 = 0.0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(4);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("SRC1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("DST1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("SRC2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dst2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_LONG).name("DST2").build();


    private void para_main() {
        dst1 = (float) Double.parseDouble(String.valueOf(src1).trim());
        if (CobolIntrinsics.toBigDecimal(dst1).compareTo(new BigDecimal("11.55")) != 0) {
            CobolDisplay.display("error 1: move/compare FLOAT-LONG to FLOAT-SHORTfailed " + CobolDisplay.formatFloatShort(dst1));
        }
        dst2 = Double.parseDouble(String.valueOf(src1).trim());
        if (CobolIntrinsics.toBigDecimal(dst1).compareTo(new BigDecimal("11.55")) != 0) {
            CobolDisplay.display("error 2: move/compare FLOAT-LONG to FLOAT-LONG failed " + CobolDisplay.formatFloatLong(dst2));
        }
        dst1 = (float) Double.parseDouble(String.valueOf(0).trim());
        dst2 = Double.parseDouble(String.valueOf(0).trim());
        dst1 = (float) Double.parseDouble(String.valueOf(src2).trim());
        if (CobolIntrinsics.toBigDecimal(dst1).compareTo(new BigDecimal("11.55")) != 0) {
            CobolDisplay.display("error 3: move/compare FLOAT-SHORT to FLOAT-SHORT failed: " + CobolDisplay.formatFloatShort(dst1));
        }
        dst2 = Double.parseDouble(String.valueOf(src2).trim());
        if (CobolIntrinsics.toBigDecimal(dst2).compareTo(new BigDecimal("11.55")) != 0) {
            CobolDisplay.display("error 4: move/compare FLOAT-SHORT to FLOAT-LONGfailed: " + CobolDisplay.formatFloatLong(dst2));
        }
        dst1 = (float) Double.parseDouble(String.valueOf(0).trim());
        if (!(((float)(dst1) == (float)(0) && (float)(dst1) == (float)(0)))) {
            CobolDisplay.display("Zero compare failed: " + CobolDisplay.formatFloatShort(dst1));
        }
        dst1 = (float) Double.parseDouble(String.valueOf(0).trim());
        if (!(((float)(dst1) == (float)(0) && (float)(dst1) == (float)(0)))) {
            CobolDisplay.display("Negative Zero compare failed: " + CobolDisplay.formatFloatShort(dst1));
        }
        dst1 = (float) Double.parseDouble(String.valueOf(new BigDecimal("1.1234567")).trim());
        dst2 = Double.parseDouble(String.valueOf(dst1).trim());
        if (CobolIntrinsics.toBigDecimal(dst2).compareTo(new BigDecimal("1.1234567")) != 0) {
            CobolDisplay.display("move/compare number to FLOAT to DOUBLE failed: " + CobolDisplay.formatFloatShort(dst1) + " - " + CobolDisplay.formatFloatLong(dst2));
        }
        dst1 = (float) Double.parseDouble(String.valueOf(new BigDecimal("1.1234567")).trim());
        dst2 = Double.parseDouble(String.valueOf(new BigDecimal("1.1234568")).trim());
        if (!(CobolIntrinsics.floatEqUlp1((float)(dst1), (float)(dst2)))) {
            CobolDisplay.display("move/compare of very near numbers failed (not identical): " + CobolDisplay.formatFloatShort(dst1) + " - " + CobolDisplay.formatFloatLong(dst2));
        }
        dst1 = (float) Double.parseDouble(String.valueOf(new BigDecimal("1.1234567")).trim());
        dst2 = Double.parseDouble(String.valueOf(new BigDecimal("1.1234569")).trim());
        if (CobolIntrinsics.floatEqUlp1((float)(dst1), (float)(dst2))) {
            CobolDisplay.display("move/compare of near equal numbers failed (identical): " + CobolDisplay.formatFloatShort(dst1) + " - " + CobolDisplay.formatFloatLong(dst2));
        }
        dst1 = (float) Double.parseDouble(String.valueOf(new BigDecimal("0.0001")).trim());
        dst2 = Double.parseDouble(String.valueOf(0).trim());
        if (CobolIntrinsics.floatEqUlp1((float)(dst1), (float)(dst2))) {
            CobolDisplay.display("move/compare of nearly equal very small numbersfailed  (identical): " + CobolDisplay.formatFloatShort(dst1) + " - " + CobolDisplay.formatFloatLong(dst2));
        }
        dst1 = (float) Double.parseDouble(String.valueOf(1000001).trim());
        dst2 = Double.parseDouble(String.valueOf(1000000).trim());
        if (CobolIntrinsics.floatEqUlp1((float)(dst1), (float)(dst2))) {
            CobolDisplay.display("move/compare of nearly equal big numbers failed(identical): " + CobolDisplay.formatFloatShort(dst1) + " - " + CobolDisplay.formatFloatLong(dst2));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental012EqualityOfFloatShortFloatLong");
            CobolProgram.registerCallAlias("prog", "RunFundamental012EqualityOfFloatShortFloatLong");
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
        new RunFundamental012EqualityOfFloatShortFloatLong().run();
    }
}
