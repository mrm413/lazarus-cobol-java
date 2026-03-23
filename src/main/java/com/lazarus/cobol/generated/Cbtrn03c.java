package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbtrn03c extends CobolProgram {
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
    // FILE SECTION — TRANSACT-FILE
    private CobolString fd_tranfile_rec = new CobolString(1); // Group: FD-TRANFILE-REC
    private CobolString fd_trans_data = new CobolString(304);
    private CobolString fd_tran_proc_ts = new CobolString(26);
    private CobolString fd_filler = new CobolString(20);

    // FILE SECTION — XREF-FILE
    private CobolString fd_cardxref_rec = new CobolString(1); // Group: FD-CARDXREF-REC
    private CobolString fd_xref_card_num = new CobolString(16);
    private CobolString fd_xref_data = new CobolString(34);

    // FILE SECTION — TRANTYPE-FILE
    private CobolString fd_trantype_rec = new CobolString(1); // Group: FD-TRANTYPE-REC
    private CobolString fd_tran_type = new CobolString(2);
    private CobolString fd_tran_data = new CobolString(58);

    // FILE SECTION — TRANCATG-FILE
    private CobolString fd_tran_cat_record = new CobolString(1); // Group: FD-TRAN-CAT-RECORD
    private CobolString fd_tran_cat_key = new CobolString(1); // Group: FD-TRAN-CAT-KEY
    private CobolString fd_tran_type_cd = new CobolString(2);
    private int fd_tran_cat_cd = 0;
    private CobolString fd_tran_cat_data = new CobolString(54);

    // FILE SECTION — REPORT-FILE
    private CobolString fd_reptfile_rec = new CobolString(133);

    // FILE SECTION — DATE-PARMS-FILE
    private CobolString fd_dateparm_rec = new CobolString(80);


    // FILE DESCRIPTORS
    private CobolFile transact_file = new CobolFile("TRANFILE", "SEQUENTIAL", "SEQUENTIAL");
    // File status: TRANFILE-STATUS
    private CobolFile xref_file = new CobolFile("CARDXREF", "INDEXED", "RANDOM");
    // File status: CARDXREF-STATUS
    private CobolFile trantype_file = new CobolFile("TRANTYPE", "INDEXED", "RANDOM");
    // File status: TRANTYPE-STATUS
    private CobolFile trancatg_file = new CobolFile("TRANCATG", "INDEXED", "RANDOM");
    // File status: TRANCATG-STATUS
    private CobolFile report_file = new CobolFile("TRANREPT", "SEQUENTIAL", "SEQUENTIAL");
    // File status: TRANREPT-STATUS
    private CobolFile date_parms_file = new CobolFile("DATEPARM", "SEQUENTIAL", "SEQUENTIAL");
    // File status: DATEPARM-STATUS

    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString tran_proc_ts = new CobolString(256); // fallback
    private CobolString ws_start_date = new CobolString(256); // fallback
    private CobolString ws_end_date = new CobolString(256); // fallback
    private CobolString tran_record = new CobolString(256); // fallback
    private CobolString ws_curr_card_num = new CobolString(256); // fallback
    private CobolString tran_card_num = new CobolString(256); // fallback
    private CobolString ws_first_time = new CobolString(256); // fallback
    private CobolString tran_type_cd = new CobolString(256); // fallback
    private CobolString tran_cat_cd = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString ws_page_total = new CobolString(256); // fallback
    private CobolString ws_account_total = new CobolString(256); // fallback
    private CobolString ws_dateparm_record = new CobolString(256); // fallback
    private CobolString dateparm_status = new CobolString(256); // fallback
    private CobolString appl_result = new CobolString(256); // fallback
    private CobolString appl_aok = new CobolString(256); // fallback
    private CobolString appl_eof = new CobolString(256); // fallback
    private CobolString io_status = new CobolString(256); // fallback
    private CobolString tranfile_status = new CobolString(256); // fallback
    private CobolString rept_start_date = new CobolString(256); // fallback
    private CobolString rept_end_date = new CobolString(256); // fallback
    private CobolString ws_line_counter = new CobolString(256); // fallback
    private CobolString ws_page_size = new CobolString(256); // fallback
    private CobolString rept_page_total = new CobolString(256); // fallback
    private CobolString report_page_totals = new CobolString(256); // fallback
    private CobolString ws_grand_total = new CobolString(256); // fallback
    private CobolString transaction_header_2 = new CobolString(256); // fallback
    private CobolString rept_account_total = new CobolString(256); // fallback
    private CobolString report_account_totals = new CobolString(256); // fallback
    private CobolString rept_grand_total = new CobolString(256); // fallback
    private CobolString report_grand_totals = new CobolString(256); // fallback
    private CobolString report_name_header = new CobolString(256); // fallback
    private CobolString ws_blank_line = new CobolString(256); // fallback
    private CobolString transaction_header_1 = new CobolString(256); // fallback
    private CobolString tranrept_status = new CobolString(256); // fallback
    private CobolString transaction_detail_report = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString tran_report_trans_id = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString tran_report_account_id = new CobolString(256); // fallback
    private CobolString tran_report_type_cd = new CobolString(256); // fallback
    private CobolString tran_type_desc = new CobolString(256); // fallback
    private CobolString tran_report_type_desc = new CobolString(256); // fallback
    private CobolString tran_report_cat_cd = new CobolString(256); // fallback
    private CobolString tran_cat_type_desc = new CobolString(256); // fallback
    private CobolString tran_report_cat_desc = new CobolString(256); // fallback
    private CobolString tran_source = new CobolString(256); // fallback
    private CobolString tran_report_source = new CobolString(256); // fallback
    private CobolString tran_report_amt = new CobolString(256); // fallback
    private CobolString cardxref_status = new CobolString(256); // fallback
    private CobolString trantype_status = new CobolString(256); // fallback
    private CobolString trancatg_status = new CobolString(256); // fallback
    private CobolString card_xref_record = new CobolString(256); // fallback
    private CobolString tran_type_record = new CobolString(256); // fallback
    private CobolString tran_cat_record = new CobolString(256); // fallback
    private CobolString zero = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString timing = new CobolString(256); // fallback
    private CobolString abcode = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString io_stat1 = new CobolString(256); // fallback
    private CobolString io_status_04 = new CobolString(256); // fallback
    private CobolString two_bytes_binary = new CobolString(256); // fallback
    private CobolString io_stat2 = new CobolString(256); // fallback
    private CobolString two_bytes_right = new CobolString(256); // fallback
    private CobolString io_status_0403 = new CobolString(256); // fallback

    private void para_main() {
        CobolDisplay.display("START OF EXECUTION OF PROGRAM CBTRN03C");
        _0000();
        /* RAW: -  */
    }

    private void tranfile_open() {
        _0100();
        /* RAW: -  */
    }

    private void reptfile_open() {
        _0200();
        /* RAW: -  */
    }

    private void cardxref_open() {
        _0300();
        /* RAW: -  */
    }

    private void trantype_open() {
        _0400();
        /* RAW: -  */
    }

    private void trancatg_open() {
        _0500();
        /* RAW: -  */
    }

    private void dateparm_open() {
        _0550();
        /* RAW: -  */
    }

    private void dateparm_read() {
        while (!(String.valueOf(end_of_file).equals(String.valueOf("Y")))) {
            if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                _1000();
                /* RAW: - TRANFILE-GET-NEXT */
                if ((String.valueOf(CobolString.refMod(tran_proc_ts, 1, 10)).compareTo(String.valueOf(ws_start_date)) >= 0 && String.valueOf(CobolString.refMod(tran_proc_ts, 1, 10)).compareTo(String.valueOf(ws_end_date)) <= 0)) {
                    /* CONTINUE */
                } else {
                    /* NEXT SENTENCE */
                }
                if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                    CobolDisplay.display(String.valueOf(tran_record));
                    if (!String.valueOf(ws_curr_card_num).equals(String.valueOf(tran_card_num))) {
                        if (String.valueOf(ws_first_time).equals(String.valueOf("N"))) {
                            _1120();
                            /* RAW: - WRITE-ACCOUNT-TOTALS */
                        }
                        ws_curr_card_num.set(String.valueOf(tran_card_num));
                        fd_xref_card_num.set(String.valueOf(tran_card_num));
                        _1500();
                        /* RAW: - A-LOOKUP-XREF */
                    }
                    fd_tran_type.set(String.valueOf(tran_type_cd));
                    _1500();
                    /* RAW: - B-LOOKUP-TRANTYPE */
                    fd_tran_type_cd.set(String.valueOf(tran_type_cd));
                    fd_tran_cat_cd = new BigDecimal(String.valueOf(tran_cat_cd).trim()).intValue();
                    _1500();
                    /* RAW: - C-LOOKUP-TRANCATG */
                    _1100();
                    /* RAW: - WRITE-TRANSACTION-REPORT */
                } else {
                    CobolDisplay.display("TRAN-AMT " + String.valueOf(tran_amt));
                    CobolDisplay.display("WS-PAGE-TOTAL" + String.valueOf(ws_page_total));
                    ws_page_total.set(new BigDecimal(String.valueOf(ws_page_total).trim()).add(new BigDecimal(String.valueOf(tran_amt).trim())).toPlainString());
                    ws_account_total.set(new BigDecimal(String.valueOf(ws_account_total).trim()).add(new BigDecimal(String.valueOf(tran_amt).trim())).toPlainString());
                    _1110();
                    /* RAW: - WRITE-PAGE-TOTALS */
                    _1110();
                    /* RAW: - WRITE-GRAND-TOTALS */
                }
            }
        }
        _9000();
        /* RAW: -  */
    }

    private void tranfile_close() {
        _9100();
        /* RAW: -  */
    }

    private void reptfile_close() {
        _9200();
        /* RAW: -  */
    }

    private void cardxref_close() {
        _9300();
        /* RAW: -  */
    }

    private void trantype_close() {
        _9400();
        /* RAW: -  */
    }

    private void trancatg_close() {
        _9500();
        /* RAW: -  */
    }

    private void dateparm_close() {
        CobolDisplay.display("END OF EXECUTION OF PROGRAM CBTRN03C");
        return;
    }

    private void dateparm_read_2() {
        if (date_parms_file.read(ws_dateparm_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(dateparm_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else if (String.valueOf(dateparm_status).equals(String.valueOf("10"))) {
            appl_result.set(String.valueOf(16));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            CobolDisplay.display("Reporting from " + String.valueOf(ws_start_date) + " to " + String.valueOf(ws_end_date));
        } else {
            if (!String.valueOf(appl_eof).trim().isEmpty()) {
                end_of_file.set(String.valueOf("Y"));
            } else {
                CobolDisplay.display("ERROR READING DATEPARM FILE");
                io_status.set(String.valueOf(dateparm_status));
                _9910();
                /* RAW: - DISPLAY-IO-STATUS */
                _9999();
                /* RAW: - ABEND-PROGRAM */
            }
        }
        /* RAW: 1000 - */
    }

    private void tranfile_get_next() {
        if (transact_file.read(tran_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else if (String.valueOf(tranfile_status).equals(String.valueOf("10"))) {
            appl_result.set(String.valueOf(16));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            if (!String.valueOf(appl_eof).trim().isEmpty()) {
                end_of_file.set(String.valueOf("Y"));
            } else {
                CobolDisplay.display("ERROR READING TRANSACTION FILE");
                io_status.set(String.valueOf(tranfile_status));
                _9910();
                /* RAW: - DISPLAY-IO-STATUS */
                _9999();
                /* RAW: - ABEND-PROGRAM */
            }
        }
        return;
    }

    private void write_transaction_report() {
        if (String.valueOf(ws_first_time).equals(String.valueOf("Y"))) {
            ws_first_time.set(String.valueOf("N"));
            rept_start_date.set(String.valueOf(ws_start_date));
            rept_end_date.set(String.valueOf(ws_end_date));
            _1120();
            /* RAW: - WRITE-HEADERS */
        }
        if (String.valueOf(CobolIntrinsics.mod(ws_line_counter, ws_page_size)).equals(String.valueOf(0))) {
            _1110();
            /* RAW: - WRITE-PAGE-TOTALS */
            _1120();
            /* RAW: - WRITE-HEADERS */
        }
        ws_page_total.set(new BigDecimal(String.valueOf(ws_page_total).trim()).add(new BigDecimal(String.valueOf(tran_amt).trim())).toPlainString());
        ws_account_total.set(new BigDecimal(String.valueOf(ws_account_total).trim()).add(new BigDecimal(String.valueOf(tran_amt).trim())).toPlainString());
        _1120();
        /* RAW: - WRITE-DETAIL */
        return;
    }

    private void write_page_totals() {
        rept_page_total.set(String.valueOf(ws_page_total));
        fd_reptfile_rec.set(String.valueOf(report_page_totals));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_grand_total.set(new BigDecimal(String.valueOf(ws_grand_total).trim()).add(new BigDecimal(String.valueOf(ws_page_total).trim())).toPlainString());
        ws_page_total.set(String.valueOf(0));
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        fd_reptfile_rec.set(String.valueOf(transaction_header_2));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        return;
    }

    private void write_account_totals() {
        rept_account_total.set(String.valueOf(ws_account_total));
        fd_reptfile_rec.set(String.valueOf(report_account_totals));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_account_total.set(String.valueOf(0));
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        fd_reptfile_rec.set(String.valueOf(transaction_header_2));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        return;
    }

    private void write_grand_totals() {
        rept_grand_total.set(String.valueOf(ws_grand_total));
        fd_reptfile_rec.set(String.valueOf(report_grand_totals));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        return;
    }

    private void write_headers() {
        fd_reptfile_rec.set(String.valueOf(report_name_header));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        fd_reptfile_rec.set(String.valueOf(ws_blank_line));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        fd_reptfile_rec.set(String.valueOf(transaction_header_1));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        fd_reptfile_rec.set(String.valueOf(transaction_header_2));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        return;
    }

    private void write_report_rec() {
        report_file.write(fd_reptfile_rec);
        if (String.valueOf(tranrept_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR WRITING REPTFILE");
            io_status.set(String.valueOf(tranrept_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void write_detail() {
        transaction_detail_report.set("");
        tran_report_trans_id.set(String.valueOf(tran_id));
        tran_report_account_id.set(String.valueOf(xref_acct_id));
        tran_report_type_cd.set(String.valueOf(tran_type_cd));
        tran_report_type_desc.set(String.valueOf(tran_type_desc));
        tran_report_cat_cd.set(String.valueOf(tran_cat_cd));
        tran_report_cat_desc.set(String.valueOf(tran_cat_type_desc));
        tran_report_source.set(String.valueOf(tran_source));
        tran_report_amt.set(String.valueOf(tran_amt));
        fd_reptfile_rec.set(String.valueOf(transaction_detail_report));
        _1111();
        /* RAW: - WRITE-REPORT-REC */
        ws_line_counter.set(new BigDecimal(String.valueOf(ws_line_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        return;
    }

    private void tranfile_open_2() {
    }

    private void appl_result() {
        transact_file.open("INPUT");
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING TRANFILE");
            io_status.set(String.valueOf(tranfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void reptfile_open_2() {
    }

    private void appl_result_2() {
        report_file.open("OUTPUT");
        if (String.valueOf(tranrept_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING REPTFILE");
            io_status.set(String.valueOf(tranrept_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void cardxref_open_2() {
    }

    private void appl_result_3() {
        xref_file.open("INPUT");
        if (String.valueOf(cardxref_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING CROSS REF FILE");
            io_status.set(String.valueOf(cardxref_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void trantype_open_2() {
    }

    private void appl_result_4() {
        trantype_file.open("INPUT");
        if (String.valueOf(trantype_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING TRANSACTION TYPE FILE");
            io_status.set(String.valueOf(trantype_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void trancatg_open_2() {
    }

    private void appl_result_5() {
        trancatg_file.open("INPUT");
        if (String.valueOf(trancatg_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING TRANSACTION CATG FILE");
            io_status.set(String.valueOf(trancatg_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void dateparm_open_2() {
    }

    private void appl_result_6() {
        date_parms_file.open("INPUT");
        if (String.valueOf(dateparm_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING DATE PARM FILE");
            io_status.set(String.valueOf(dateparm_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void a_lookup_xref() {
        if (xref_file.read(card_xref_record) == FileStatus.AT_END) {
        }
        return;
    }

    private void b_lookup_trantype() {
        if (trantype_file.read(tran_type_record) == FileStatus.AT_END) {
        }
        return;
    }

    private void c_lookup_trancatg() {
        if (trancatg_file.read(tran_cat_record) == FileStatus.AT_END) {
        }
        return;
    }

    private void tranfile_close_2() {
        appl_result.set(String.valueOf(8));
        transact_file.close();
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(new BigDecimal(String.valueOf(appl_result).trim()).subtract(new BigDecimal(String.valueOf(appl_result).trim())).toPlainString());
            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).subtract(new BigDecimal(String.valueOf(appl_result).trim())).toPlainString());
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING POSTED TRANSACTION FILE");
            io_status.set(String.valueOf(tranfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void reptfile_close_2() {
        appl_result.set(String.valueOf(8));
        report_file.close();
        if (String.valueOf(tranrept_status).equals(String.valueOf("00"))) {
            appl_result.set(new BigDecimal(String.valueOf(appl_result).trim()).subtract(new BigDecimal(String.valueOf(appl_result).trim())).toPlainString());
            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).subtract(new BigDecimal(String.valueOf(appl_result).trim())).toPlainString());
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING REPORT FILE");
            io_status.set(String.valueOf(tranrept_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void cardxref_close_2() {
    }

    private void appl_result_7() {
        xref_file.close();
        if (String.valueOf(cardxref_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING CROSS REF FILE");
            io_status.set(String.valueOf(cardxref_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void trantype_close_2() {
    }

    private void appl_result_8() {
        trantype_file.close();
        if (String.valueOf(trantype_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING TRANSACTION TYPE FILE");
            io_status.set(String.valueOf(trantype_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void trancatg_close_2() {
    }

    private void appl_result_9() {
        trancatg_file.close();
        if (String.valueOf(trancatg_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING TRANSACTION CATG FILE");
            io_status.set(String.valueOf(trancatg_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void dateparm_close_2() {
    }

    private void appl_result_10() {
        date_parms_file.close();
        if (String.valueOf(dateparm_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING DATE PARM FILE");
            io_status.set(String.valueOf(dateparm_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void abend_program() {
        CobolDisplay.display("ABENDING PROGRAM");
        timing.set(String.valueOf(0));
        abcode.set(String.valueOf(999));
        CobolProgram.call("CEE3ABD", abcode, _unnamed);
    }

    private void timing() {
        /* RAW: 9910 - */
    }

    private void display_io_status() {
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

    private void _0550() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _1120() { /* stub — external/COPY */ }

    private void _1500() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1110() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _9200() { /* stub — external/COPY */ }

    private void _9300() { /* stub — external/COPY */ }

    private void _9400() { /* stub — external/COPY */ }

    private void _9500() { /* stub — external/COPY */ }

    private void _9910() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _1111() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbtrn03c().run();
    }
}
