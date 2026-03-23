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
    private CobolString ws_where = new CobolString(512);
    private CobolString ws_mysql = new CobolString(1); // Group: ws-mysql
    private long ws_mysql_cid = 0L;
    private long ws_mysql_result = 0L;
    private long ws_mysql_result_2 = 0L;
    private long ws_mysql_result_3 = 0L;
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
    private CobolString subscripts = new CobolString(1); // Group: subscripts
    private int j = 0;
    private int k = 0;
    private int l = 0;



    private void para_main() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Listings020SymbolsPointer().run();
    }
}
