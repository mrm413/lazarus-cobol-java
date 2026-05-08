package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Listings020SymbolsPointer extends CobolProgram {
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
    private CobolString ws_where = new CobolString(512);
    private CobolString ws_mysql = new CobolString(4512); // Group: ws-mysql
    private int ws_mysql_cid = 0;
    private int ws_mysql_result = 0;
    private int ws_mysql_result_2 = 0;
    private int ws_mysql_result_3 = 0;
    private int ws_mysql_count_rows = 0;
    private CobolString ws_mysql_error_number = new CobolString(4);
    private CobolString ws_mysql_error_message = new CobolString(80);
    private CobolString ws_mysql_host_name = new CobolString(64);
    private CobolString ws_mysql_implementation = new CobolString(64);
    private CobolString ws_mysql_password = new CobolString(64);
    private CobolString ws_mysql_base_name = new CobolString(64);
    private CobolString ws_mysql_port_number = new CobolString(4);
    private CobolString ws_mysql_socket = new CobolString(64);
    private CobolString ws_mysql_command = new CobolString(4096);
    private int ws_no_paragraph = 0;

    // LOCAL-STORAGE SECTION
    private CobolString subscripts = new CobolString(12); // Group: subscripts
    private int j = 0;
    private int k = 0;
    private int l = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(5028);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_where = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 512).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-Where").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(512, 4512).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ws-mysql").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_cid = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(512, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("ws-mysql-cid").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_result = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(513, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("ws-mysql-result").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_result_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(514, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("ws-mysql-result-2").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_result_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(515, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("ws-mysql-result-3").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_count_rows = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(516, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("ws-mysql-count-rows").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_error_number = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(520, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ws-mysql-error-number").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_error_message = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(524, 80).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ws-mysql-error-message").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_host_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(604, 64).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ws-mysql-host-name").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_implementation = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(668, 64).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ws-mysql-implementation").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_password = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(732, 64).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ws-mysql-password").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_base_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(796, 64).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ws-mysql-base-name").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_port_number = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(860, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ws-mysql-port-number").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_socket = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(864, 64).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ws-mysql-socket").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_mysql_command = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(928, 4096).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("ws-mysql-command").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_no_paragraph = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5024, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("ws-No-Paragraph").picDigits(4).build();


    private void para_main() {
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "Listings020SymbolsPointer");
            CobolProgram.registerCallAlias("prog", "Listings020SymbolsPointer");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // LOCAL-STORAGE: re-initialize to VALUE clauses on each entry
            subscripts.set("            ");
            j = 0;
            k = 0;
            l = 0;
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
        new Listings020SymbolsPointer().run();
    }
}
