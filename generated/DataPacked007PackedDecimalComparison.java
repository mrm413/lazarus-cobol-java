package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked007PackedDecimalComparison extends CobolProgram {
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
    private BigDecimal u1 = new BigDecimal("95");
    private BigDecimal u2 = new BigDecimal("95");
    private BigDecimal u3 = new BigDecimal("195");
    private BigDecimal u4 = new BigDecimal("195");
    private BigDecimal u1_32 = new BigDecimal("195");
    private BigDecimal u2_32 = new BigDecimal("195");
    private BigDecimal u1_32d = new BigDecimal("48894655646195.551388132");
    private BigDecimal u2_32d = new BigDecimal("48894655646195.551388132");
    private BigDecimal u3_32d = new BigDecimal("48894655646195.551388132");
    private BigDecimal u4_32d = new BigDecimal("48894655646195.551388131");
    private BigDecimal s1 = new BigDecimal("-95");
    private BigDecimal s2 = new BigDecimal("-95");
    private BigDecimal s3 = new BigDecimal("-195");
    private BigDecimal s4 = new BigDecimal("-195");
    private BigDecimal s1_32 = new BigDecimal("-195");
    private BigDecimal s2_32 = new BigDecimal("-195");
    private BigDecimal s1_32d = new BigDecimal("-48894655646195.551388132");
    private BigDecimal s2_32d = new BigDecimal("-48894655646195.551388132");
    private BigDecimal s3_32d = new BigDecimal("-48894655646195.551388132");
    private BigDecimal s4_32d = new BigDecimal("-48894655646195.551388131");
    private int filler_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(205);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U1").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U2").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U3").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U4").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u1_32 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U1-32").picDigits(32).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u2_32 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U2-32").picDigits(32).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u1_32d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(42, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U1-32D").picDigits(30).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u2_32d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(58, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U2-32D").picDigits(30).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u3_32d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(74, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U3-32D").picDigits(27).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u4_32d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(88, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("U4-32D").picDigits(27).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(102, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S1").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(104, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S2").picDigits(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(106, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S3").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(108, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S4").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s1_32 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(110, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S1-32").picDigits(32).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s2_32 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(127, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S2-32").picDigits(32).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s1_32d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(144, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S1-32D").picDigits(30).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s2_32d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(160, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S2-32D").picDigits(30).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s3_32d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(176, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S3-32D").picDigits(27).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s4_32d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(190, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("S4-32D").picDigits(27).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(204, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString do_disp = new CobolString(256); // fallback

    private void para_main() {
        do_check();
        return;
    }

    private void do_check() {
        if (u1.compareTo(u2) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U1 <> U2");
            }
        }
        if (u3.compareTo(u4) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U3 <> U4");
            }
        }
        if (u1.compareTo(u3) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U1 >= U3");
            }
        }
        if (s1.compareTo(s2) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("S1 <> S2");
            }
        }
        if (s3.compareTo(s4) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("S3 <> S4");
            }
        }
        if (s1.compareTo(s3) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("S1 <= S3");
            }
        }
        if (u1_32.compareTo(u2_32) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U1-32 <> U2-32");
            }
        }
        if (u1_32.compareTo(u2_32d) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U1-32 >= U1-32D");
            }
        }
        if (u1_32d.compareTo(u2_32d) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U1-32D <> U2-32D");
            }
        }
        if (u1_32d.compareTo(u3) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U1-32 <= U3");
            }
        }
        if (u2_32d.compareTo(u4_32d) <= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U2-32D <= U4-32D");
            }
        }
        if (u4_32d.compareTo(u2_32d) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("U4-32D >= U2-32D");
            }
        }
        if (s1_32.compareTo(s2_32) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("S1-32 <> S2-32");
            }
        }
        if (s1_32d.compareTo(s2_32d) != 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("S1-32D <> S2-32D");
            }
        }
        if (s2_32d.compareTo(s4_32d) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("S2-32D >= S4-32D");
            }
        }
        if (s3_32d.compareTo(s4_32d) >= 0) {
            if (filler_1 == 0) {
                CobolDisplay.display("S3-32D >= S4-32D");
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataPacked007PackedDecimalComparison");
            CobolProgram.registerCallAlias("prog", "DataPacked007PackedDecimalComparison");
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
        new DataPacked007PackedDecimalComparison().run();
    }
}
