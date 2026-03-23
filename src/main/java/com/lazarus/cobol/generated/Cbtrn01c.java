package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbtrn01c extends CobolProgram {
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
    // FILE SECTION — DALYTRAN-FILE
    private CobolString fd_tran_record = new CobolString(1); // Group: FD-TRAN-RECORD
    private CobolString fd_tran_id = new CobolString(16);
    private CobolString fd_cust_data = new CobolString(491);

    // FILE SECTION — CUSTOMER-FILE
    private CobolString fd_custfile_rec = new CobolString(1); // Group: FD-CUSTFILE-REC
    private int fd_cust_id = 0;

    // FILE SECTION — XREF-FILE
    private CobolString fd_xreffile_rec = new CobolString(1); // Group: FD-XREFFILE-REC
    private CobolString fd_xref_card_num = new CobolString(16);
    private CobolString fd_xref_data = new CobolString(34);

    // FILE SECTION — CARD-FILE
    private CobolString fd_cardfile_rec = new CobolString(1); // Group: FD-CARDFILE-REC
    private CobolString fd_card_num = new CobolString(16);
    private CobolString fd_card_data = new CobolString(134);

    // FILE SECTION — ACCOUNT-FILE
    private CobolString fd_acctfile_rec = new CobolString(1); // Group: FD-ACCTFILE-REC
    private int fd_acct_id = 0;
    private CobolString fd_acct_data = new CobolString(334);

    // FILE SECTION — TRANSACT-FILE
    private CobolString fd_tranfile_rec = new CobolString(1); // Group: FD-TRANFILE-REC
    private CobolString fd_trans_id = new CobolString(16);


    // FILE DESCRIPTORS
    private CobolFile dalytran_file = new CobolFile("DALYTRAN", "SEQUENTIAL", "SEQUENTIAL");
    // File status: DALYTRAN-STATUS
    private CobolFile customer_file = new CobolFile("CUSTFILE", "INDEXED", "RANDOM");
    // File status: CUSTFILE-STATUS
    private CobolFile xref_file = new CobolFile("XREFFILE", "INDEXED", "RANDOM");
    // File status: XREFFILE-STATUS
    private CobolFile card_file = new CobolFile("CARDFILE", "INDEXED", "RANDOM");
    // File status: CARDFILE-STATUS
    private CobolFile account_file = new CobolFile("ACCTFILE", "INDEXED", "RANDOM");
    // File status: ACCTFILE-STATUS
    private CobolFile transact_file = new CobolFile("TRANFILE", "INDEXED", "RANDOM");
    // File status: TRANFILE-STATUS

    private CobolString end_of_daily_trans_file = new CobolString(256); // fallback
    private CobolString dalytran_record = new CobolString(256); // fallback
    private CobolString ws_xref_read_status = new CobolString(256); // fallback
    private CobolString dalytran_card_num = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString ws_acct_read_status = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString dalytran_id = new CobolString(256); // fallback
    private CobolString dalytran_status = new CobolString(256); // fallback
    private CobolString appl_result = new CobolString(256); // fallback
    private CobolString appl_aok = new CobolString(256); // fallback
    private CobolString appl_eof = new CobolString(256); // fallback
    private CobolString io_status = new CobolString(256); // fallback
    private CobolString card_xref_record = new CobolString(256); // fallback
    private CobolString account_record = new CobolString(256); // fallback
    private CobolString custfile_status = new CobolString(256); // fallback
    private CobolString xreffile_status = new CobolString(256); // fallback
    private CobolString cardfile_status = new CobolString(256); // fallback
    private CobolString acctfile_status = new CobolString(256); // fallback
    private CobolString tranfile_status = new CobolString(256); // fallback
    private CobolString zero = new CobolString(256); // fallback
    private CobolString timing = new CobolString(256); // fallback
    private CobolString abcode = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString io_stat1 = new CobolString(256); // fallback
    private CobolString io_status_04 = new CobolString(256); // fallback
    private CobolString two_bytes_binary = new CobolString(256); // fallback
    private CobolString io_stat2 = new CobolString(256); // fallback
    private CobolString two_bytes_right = new CobolString(256); // fallback
    private CobolString io_status_0403 = new CobolString(256); // fallback

    private void main_para() {
        CobolDisplay.display("START OF EXECUTION OF PROGRAM CBTRN01C");
        _0000();
        /* RAW: -  */
    }

    private void dalytran_open() {
        _0100();
        /* RAW: -  */
    }

    private void custfile_open() {
        _0200();
        /* RAW: -  */
    }

    private void xreffile_open() {
        _0300();
        /* RAW: -  */
    }

    private void cardfile_open() {
        _0400();
        /* RAW: -  */
    }

    private void acctfile_open() {
        _0500();
        /* RAW: -  */
    }

    private void tranfile_open() {
        while (!(String.valueOf(end_of_daily_trans_file).equals(String.valueOf("Y")))) {
            if (String.valueOf(end_of_daily_trans_file).equals(String.valueOf("N"))) {
                _1000();
                /* RAW: - DALYTRAN-GET-NEXT */
                if (String.valueOf(end_of_daily_trans_file).equals(String.valueOf("N"))) {
                    CobolDisplay.display(String.valueOf(dalytran_record));
                }
                ws_xref_read_status.set(String.valueOf(0));
                xref_card_num.set(String.valueOf(dalytran_card_num));
                _2000();
                /* RAW: - LOOKUP-XREF */
                if (String.valueOf(ws_xref_read_status).equals(String.valueOf(0))) {
                    ws_acct_read_status.set(String.valueOf(0));
                    acct_id.set(String.valueOf(xref_acct_id));
                    _3000();
                    /* RAW: - READ-ACCOUNT */
                    if (!String.valueOf(ws_acct_read_status).equals(String.valueOf(0))) {
                        CobolDisplay.display("ACCOUNT " + String.valueOf(acct_id) + " NOT FOUND");
                    }
                } else {
                    CobolDisplay.display("CARD NUMBER " + String.valueOf(dalytran_card_num) + " COULD NOT BE VERIFIED. SKIPPING TRANSACTION ID-" + String.valueOf(dalytran_id));
                }
            }
        }
        _9000();
        /* RAW: -  */
    }

    private void dalytran_close() {
        _9100();
        /* RAW: -  */
    }

    private void custfile_close() {
        _9200();
        /* RAW: -  */
    }

    private void xreffile_close() {
        _9300();
        /* RAW: -  */
    }

    private void cardfile_close() {
        _9400();
        /* RAW: -  */
    }

    private void acctfile_close() {
        _9500();
        /* RAW: -  */
    }

    private void tranfile_close() {
        CobolDisplay.display("END OF EXECUTION OF PROGRAM CBTRN01C");
        return;
    }

    private void dalytran_get_next() {
        if (dalytran_file.read(dalytran_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(dalytran_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            if (String.valueOf(dalytran_status).equals(String.valueOf("10"))) {
                appl_result.set(String.valueOf(16));
            } else {
                appl_result.set(String.valueOf(12));
            }
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            if (!String.valueOf(appl_eof).trim().isEmpty()) {
                end_of_daily_trans_file.set(String.valueOf("Y"));
            } else {
                CobolDisplay.display("ERROR READING DAILY TRANSACTION FILE");
                io_status.set(String.valueOf(dalytran_status));
                z_display_io_status();
                z_abend_program();
            }
        }
        return;
    }

    private void lookup_xref() {
        fd_xref_card_num.set(String.valueOf(xref_card_num));
        if (xref_file.read(card_xref_record) == FileStatus.AT_END) {
        }
        /* RAW: 3000 - */
    }

    private void read_account() {
        fd_acct_id = new BigDecimal(String.valueOf(acct_id).trim()).intValue();
        if (account_file.read(account_record) == FileStatus.AT_END) {
        }
        /* RAW: 0000 - */
    }

    private void dalytran_open_2() {
    }

    private void appl_result() {
        dalytran_file.open("INPUT");
        if (String.valueOf(dalytran_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING DAILY TRANSACTION FILE");
            io_status.set(String.valueOf(dalytran_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void custfile_open_2() {
    }

    private void appl_result_2() {
        customer_file.open("INPUT");
        if (String.valueOf(custfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING CUSTOMER FILE");
            io_status.set(String.valueOf(custfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void xreffile_open_2() {
    }

    private void appl_result_3() {
        xref_file.open("INPUT");
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING CROSS REF FILE");
            io_status.set(String.valueOf(xreffile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void cardfile_open_2() {
    }

    private void appl_result_4() {
        card_file.open("INPUT");
        if (String.valueOf(cardfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING CARD FILE");
            io_status.set(String.valueOf(cardfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void acctfile_open_2() {
    }

    private void appl_result_5() {
        account_file.open("INPUT");
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING ACCOUNT FILE");
            io_status.set(String.valueOf(acctfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void tranfile_open_2() {
    }

    private void appl_result_6() {
        transact_file.open("INPUT");
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING TRANSACTION FILE");
            io_status.set(String.valueOf(tranfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void dalytran_close_2() {
        appl_result.set(String.valueOf(8));
        dalytran_file.close();
        if (String.valueOf(dalytran_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING CUSTOMER FILE");
            io_status.set(String.valueOf(custfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void custfile_close_2() {
        appl_result.set(String.valueOf(8));
        customer_file.close();
        if (String.valueOf(custfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING CUSTOMER FILE");
            io_status.set(String.valueOf(custfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void xreffile_close_2() {
        appl_result.set(String.valueOf(8));
        xref_file.close();
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING CROSS REF FILE");
            io_status.set(String.valueOf(xreffile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void cardfile_close_2() {
        appl_result.set(String.valueOf(8));
        card_file.close();
        if (String.valueOf(cardfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING CARD FILE");
            io_status.set(String.valueOf(cardfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void acctfile_close_2() {
        appl_result.set(String.valueOf(8));
        account_file.close();
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING ACCOUNT FILE");
            io_status.set(String.valueOf(acctfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void tranfile_close_2() {
        appl_result.set(String.valueOf(8));
        transact_file.close();
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING TRANSACTION FILE");
            io_status.set(String.valueOf(tranfile_status));
            z_display_io_status();
            z_abend_program();
        }
        return;
    }

    private void z_abend_program() {
        CobolDisplay.display("ABENDING PROGRAM");
        timing.set(String.valueOf(0));
        abcode.set(String.valueOf(999));
        CobolProgram.call("CEE3ABD", abcode, _unnamed);
    }

    private void timing() {
    }

    private void z_display_io_status() {
        if ((!CobolIntrinsics.isNumeric(io_status) || String.valueOf(io_stat1).equals(String.valueOf("9")))) {
            io_status_04.setRefMod(1, 1, String.valueOf(io_stat1));
            two_bytes_binary.set(String.valueOf(0));
            two_bytes_right.set(String.valueOf(io_stat2));
            io_status_0403.set(String.valueOf(two_bytes_binary));
            CobolDisplay.display("FILE STATUS IS: NNNN" + String.valueOf(io_status_04));
        } else {
            io_status_04.set(String.valueOf("0000"));
            io_status_04.setRefMod(3, 2, String.valueOf(io_status));
            CobolDisplay.display("FILE STATUS IS: NNNN" + String.valueOf(io_status_04));
        }
        return;
    }

    private void _0000() { /* stub — external/COPY */ }

    private void _0100() { /* stub — external/COPY */ }

    private void _0200() { /* stub — external/COPY */ }

    private void _0300() { /* stub — external/COPY */ }

    private void _0400() { /* stub — external/COPY */ }

    private void _0500() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _9200() { /* stub — external/COPY */ }

    private void _9300() { /* stub — external/COPY */ }

    private void _9400() { /* stub — external/COPY */ }

    private void _9500() { /* stub — external/COPY */ }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cbtrn01c().run();
    }
}
