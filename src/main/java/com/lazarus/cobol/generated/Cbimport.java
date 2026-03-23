package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbimport extends CobolProgram {
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
    // FILE SECTION — EXPORT-INPUT
    private CobolString export_input_record = new CobolString(500);

    // FILE SECTION — CUSTOMER-OUTPUT

    // FILE SECTION — ACCOUNT-OUTPUT

    // FILE SECTION — XREF-OUTPUT

    // FILE SECTION — TRANSACTION-OUTPUT

    // FILE SECTION — CARD-OUTPUT

    // FILE SECTION — ERROR-OUTPUT
    private CobolString error_output_record = new CobolString(132);


    // FILE DESCRIPTORS
    private CobolFile export_input = new CobolFile("EXPFILE", "INDEXED", "SEQUENTIAL");
    // File status: WS-EXPORT-STATUS
    private CobolFile customer_output = new CobolFile("CUSTOUT", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-CUSTOMER-STATUS
    private CobolFile account_output = new CobolFile("ACCTOUT", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-ACCOUNT-STATUS
    private CobolFile xref_output = new CobolFile("XREFOUT", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-XREF-STATUS
    private CobolFile transaction_output = new CobolFile("TRNXOUT", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-TRANSACTION-STATUS
    private CobolFile card_output = new CobolFile("CARDOUT", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-CARD-STATUS
    private CobolFile error_output = new CobolFile("ERROUT", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-ERROR-STATUS

    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString ws_import_date = new CobolString(256); // fallback
    private CobolString ws_import_time = new CobolString(256); // fallback
    private CobolString ws_export_ok = new CobolString(256); // fallback
    private CobolString ws_export_status = new CobolString(256); // fallback
    private CobolString ws_customer_ok = new CobolString(256); // fallback
    private CobolString ws_customer_status = new CobolString(256); // fallback
    private CobolString ws_account_ok = new CobolString(256); // fallback
    private CobolString ws_account_status = new CobolString(256); // fallback
    private CobolString ws_xref_ok = new CobolString(256); // fallback
    private CobolString ws_xref_status = new CobolString(256); // fallback
    private CobolString ws_transaction_ok = new CobolString(256); // fallback
    private CobolString ws_transaction_status = new CobolString(256); // fallback
    private CobolString ws_card_ok = new CobolString(256); // fallback
    private CobolString ws_card_status = new CobolString(256); // fallback
    private CobolString ws_error_ok = new CobolString(256); // fallback
    private CobolString ws_error_status = new CobolString(256); // fallback
    private CobolString ws_export_eof = new CobolString(256); // fallback
    private CobolString ws_total_records_read = new CobolString(256); // fallback
    private CobolString export_record = new CobolString(256); // fallback
    private CobolString export_rec_type = new CobolString(256); // fallback
    private CobolString customer_record = new CobolString(256); // fallback
    private CobolString exp_cust_id = new CobolString(256); // fallback
    private CobolString cust_id = new CobolString(256); // fallback
    private CobolString exp_cust_first_name = new CobolString(256); // fallback
    private CobolString cust_first_name = new CobolString(256); // fallback
    private CobolString exp_cust_middle_name = new CobolString(256); // fallback
    private CobolString cust_middle_name = new CobolString(256); // fallback
    private CobolString exp_cust_last_name = new CobolString(256); // fallback
    private CobolString cust_last_name = new CobolString(256); // fallback
    private CobolString[] exp_cust_addr_line = new CobolString[100]; // fallback array
    private CobolString cust_addr_line_1 = new CobolString(256); // fallback
    private CobolString cust_addr_line_2 = new CobolString(256); // fallback
    private CobolString cust_addr_line_3 = new CobolString(256); // fallback
    private CobolString exp_cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString exp_cust_addr_country_cd = new CobolString(256); // fallback
    private CobolString cust_addr_country_cd = new CobolString(256); // fallback
    private CobolString exp_cust_addr_zip = new CobolString(256); // fallback
    private CobolString cust_addr_zip = new CobolString(256); // fallback
    private CobolString[] exp_cust_phone_num = new CobolString[100]; // fallback array
    private CobolString cust_phone_num_1 = new CobolString(256); // fallback
    private CobolString cust_phone_num_2 = new CobolString(256); // fallback
    private CobolString exp_cust_ssn = new CobolString(256); // fallback
    private CobolString cust_ssn = new CobolString(256); // fallback
    private CobolString exp_cust_govt_issued_id = new CobolString(256); // fallback
    private CobolString cust_govt_issued_id = new CobolString(256); // fallback
    private CobolString exp_cust_dob_yyyy_mm_dd = new CobolString(256); // fallback
    private CobolString cust_dob_yyyy_mm_dd = new CobolString(256); // fallback
    private CobolString exp_cust_eft_account_id = new CobolString(256); // fallback
    private CobolString cust_eft_account_id = new CobolString(256); // fallback
    private CobolString exp_cust_pri_card_holder_ind = new CobolString(256); // fallback
    private CobolString cust_pri_card_holder_ind = new CobolString(256); // fallback
    private CobolString exp_cust_fico_credit_score = new CobolString(256); // fallback
    private CobolString cust_fico_credit_score = new CobolString(256); // fallback
    private CobolString ws_customer_records_imported = new CobolString(256); // fallback
    private CobolString account_record = new CobolString(256); // fallback
    private CobolString exp_acct_id = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString exp_acct_active_status = new CobolString(256); // fallback
    private CobolString acct_active_status = new CobolString(256); // fallback
    private CobolString exp_acct_curr_bal = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString exp_acct_credit_limit = new CobolString(256); // fallback
    private CobolString acct_credit_limit = new CobolString(256); // fallback
    private CobolString exp_acct_cash_credit_limit = new CobolString(256); // fallback
    private CobolString acct_cash_credit_limit = new CobolString(256); // fallback
    private CobolString exp_acct_open_date = new CobolString(256); // fallback
    private CobolString acct_open_date = new CobolString(256); // fallback
    private CobolString exp_acct_expiraion_date = new CobolString(256); // fallback
    private CobolString acct_expiraion_date = new CobolString(256); // fallback
    private CobolString exp_acct_reissue_date = new CobolString(256); // fallback
    private CobolString acct_reissue_date = new CobolString(256); // fallback
    private CobolString exp_acct_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString exp_acct_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString exp_acct_addr_zip = new CobolString(256); // fallback
    private CobolString acct_addr_zip = new CobolString(256); // fallback
    private CobolString exp_acct_group_id = new CobolString(256); // fallback
    private CobolString acct_group_id = new CobolString(256); // fallback
    private CobolString ws_account_records_imported = new CobolString(256); // fallback
    private CobolString card_xref_record = new CobolString(256); // fallback
    private CobolString exp_xref_card_num = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString exp_xref_cust_id = new CobolString(256); // fallback
    private CobolString xref_cust_id = new CobolString(256); // fallback
    private CobolString exp_xref_acct_id = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString ws_xref_records_imported = new CobolString(256); // fallback
    private CobolString tran_record = new CobolString(256); // fallback
    private CobolString exp_tran_id = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString exp_tran_type_cd = new CobolString(256); // fallback
    private CobolString tran_type_cd = new CobolString(256); // fallback
    private CobolString exp_tran_cat_cd = new CobolString(256); // fallback
    private CobolString tran_cat_cd = new CobolString(256); // fallback
    private CobolString exp_tran_source = new CobolString(256); // fallback
    private CobolString tran_source = new CobolString(256); // fallback
    private CobolString exp_tran_desc = new CobolString(256); // fallback
    private CobolString tran_desc = new CobolString(256); // fallback
    private CobolString exp_tran_amt = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString exp_tran_merchant_id = new CobolString(256); // fallback
    private CobolString tran_merchant_id = new CobolString(256); // fallback
    private CobolString exp_tran_merchant_name = new CobolString(256); // fallback
    private CobolString tran_merchant_name = new CobolString(256); // fallback
    private CobolString exp_tran_merchant_city = new CobolString(256); // fallback
    private CobolString tran_merchant_city = new CobolString(256); // fallback
    private CobolString exp_tran_merchant_zip = new CobolString(256); // fallback
    private CobolString tran_merchant_zip = new CobolString(256); // fallback
    private CobolString exp_tran_card_num = new CobolString(256); // fallback
    private CobolString tran_card_num = new CobolString(256); // fallback
    private CobolString exp_tran_orig_ts = new CobolString(256); // fallback
    private CobolString tran_orig_ts = new CobolString(256); // fallback
    private CobolString exp_tran_proc_ts = new CobolString(256); // fallback
    private CobolString tran_proc_ts = new CobolString(256); // fallback
    private CobolString ws_tran_records_imported = new CobolString(256); // fallback
    private CobolString card_record = new CobolString(256); // fallback
    private CobolString exp_card_num = new CobolString(256); // fallback
    private CobolString card_num = new CobolString(256); // fallback
    private CobolString exp_card_acct_id = new CobolString(256); // fallback
    private CobolString card_acct_id = new CobolString(256); // fallback
    private CobolString exp_card_cvv_cd = new CobolString(256); // fallback
    private CobolString card_cvv_cd = new CobolString(256); // fallback
    private CobolString exp_card_embossed_name = new CobolString(256); // fallback
    private CobolString card_embossed_name = new CobolString(256); // fallback
    private CobolString exp_card_expiraion_date = new CobolString(256); // fallback
    private CobolString card_expiraion_date = new CobolString(256); // fallback
    private CobolString exp_card_active_status = new CobolString(256); // fallback
    private CobolString card_active_status = new CobolString(256); // fallback
    private CobolString ws_card_records_imported = new CobolString(256); // fallback
    private CobolString ws_unknown_record_type_count = new CobolString(256); // fallback
    private CobolString err_timestamp = new CobolString(256); // fallback
    private CobolString err_record_type = new CobolString(256); // fallback
    private CobolString export_sequence_num = new CobolString(256); // fallback
    private CobolString err_sequence = new CobolString(256); // fallback
    private CobolString err_message = new CobolString(256); // fallback
    private CobolString ws_error_record = new CobolString(256); // fallback
    private CobolString ws_error_records_written = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void main_processing() {
        _1000();
        /* RAW: -  */
        _2000();
        /* RAW: - PROCESS-EXPORT-FILE */
        _3000();
        /* RAW: - VALIDATE-IMPORT */
        _4000();
        /* RAW: - FINALIZE */
        return;
    }

    private void initialize() {
        CobolDisplay.display("CBIMPORT: Starting Customer Data Import");
        ws_import_date.setRefMod(1, 4, String.valueOf(CobolIntrinsics.current_date()));
        ws_import_date.setRefMod(5, 1, String.valueOf("-"));
        ws_import_date.setRefMod(6, 2, String.valueOf(CobolIntrinsics.current_date()));
        ws_import_date.setRefMod(8, 1, String.valueOf("-"));
        ws_import_date.setRefMod(9, 2, String.valueOf(CobolIntrinsics.current_date()));
        ws_import_time.setRefMod(1, 2, String.valueOf(CobolIntrinsics.current_date()));
        ws_import_time.setRefMod(3, 1, String.valueOf(":"));
        ws_import_time.setRefMod(4, 2, String.valueOf(CobolIntrinsics.current_date()));
        ws_import_time.setRefMod(6, 1, String.valueOf(":"));
        ws_import_time.setRefMod(7, 2, String.valueOf(CobolIntrinsics.current_date()));
        _1100();
        /* RAW: - OPEN-FILES */
        CobolDisplay.display("CBIMPORT: Import Date: " + String.valueOf(ws_import_date));
        CobolDisplay.display("CBIMPORT: Import Time: ");
    }

    private void ws_import_time() {
        /* RAW: 1100 - */
    }

    private void open_files() {
        export_input.open("INPUT");
        if (!(!String.valueOf(ws_export_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open EXPORT-INPUT, Status: " + String.valueOf(ws_export_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        customer_output.open("OUTPUT");
        if (!(!String.valueOf(ws_customer_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open CUSTOMER-OUTPUT, Status: " + String.valueOf(ws_customer_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        account_output.open("OUTPUT");
        if (!(!String.valueOf(ws_account_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open ACCOUNT-OUTPUT, Status: " + String.valueOf(ws_account_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        xref_output.open("OUTPUT");
        if (!(!String.valueOf(ws_xref_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open XREF-OUTPUT, Status: " + String.valueOf(ws_xref_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        transaction_output.open("OUTPUT");
        if (!(!String.valueOf(ws_transaction_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open TRANSACTION-OUTPUT, Status: " + String.valueOf(ws_transaction_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        card_output.open("OUTPUT");
        if (!(!String.valueOf(ws_card_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open CARD-OUTPUT, Status: " + String.valueOf(ws_card_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        error_output.open("OUTPUT");
        if (!(!String.valueOf(ws_error_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open ERROR-OUTPUT, Status: " + String.valueOf(ws_error_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 2000 - */
    }

    private void process_export_file() {
        _2100();
        /* RAW: - READ-EXPORT-RECORD */
        while (!(!String.valueOf(ws_export_eof).trim().isEmpty())) {
            ws_total_records_read.set(new BigDecimal(String.valueOf(ws_total_records_read).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            _2200();
            /* RAW: - PROCESS-RECORD-BY-TYPE */
            _2100();
            /* RAW: - READ-EXPORT-RECORD */
        }
        /* RAW: 2100 - */
    }

    private void read_export_record() {
        if (export_input.read(export_record) == FileStatus.AT_END) {
        }
        if ((!(!String.valueOf(ws_export_ok).trim().isEmpty()) && !(!String.valueOf(ws_export_eof).trim().isEmpty()))) {
            CobolDisplay.display("ERROR: Reading EXPORT-INPUT, Status: " + String.valueOf(ws_export_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 2200 - */
    }

    private void process_record_by_type() {
        if (String.valueOf(export_rec_type).equals(String.valueOf("C"))) {
            _2300();
            /* RAW: - PROCESS-CUSTOMER-RECORD */
        } else if (String.valueOf(export_rec_type).equals(String.valueOf("A"))) {
            _2400();
            /* RAW: - PROCESS-ACCOUNT-RECORD */
        } else if (String.valueOf(export_rec_type).equals(String.valueOf("X"))) {
            _2500();
            /* RAW: - PROCESS-XREF-RECORD */
        } else if (String.valueOf(export_rec_type).equals(String.valueOf("T"))) {
            _2600();
            /* RAW: - PROCESS-TRAN-RECORD */
        } else if (String.valueOf(export_rec_type).equals(String.valueOf("D"))) {
            _2650();
            /* RAW: - PROCESS-CARD-RECORD */
        } else {
            _2700();
            /* RAW: - PROCESS-UNKNOWN-RECORD */
        }
        /* RAW: 2300 - */
    }

    private void process_customer_record() {
        customer_record.set("");
        cust_id.set(String.valueOf(exp_cust_id));
        cust_first_name.set(String.valueOf(exp_cust_first_name));
        cust_middle_name.set(String.valueOf(exp_cust_middle_name));
        cust_last_name.set(String.valueOf(exp_cust_last_name));
        cust_addr_line_1.set(String.valueOf(exp_cust_addr_line[1 - 1]));
        cust_addr_line_2.set(String.valueOf(exp_cust_addr_line[2 - 1]));
        cust_addr_line_3.set(String.valueOf(exp_cust_addr_line[3 - 1]));
        cust_addr_state_cd.set(String.valueOf(exp_cust_addr_state_cd));
        cust_addr_country_cd.set(String.valueOf(exp_cust_addr_country_cd));
        cust_addr_zip.set(String.valueOf(exp_cust_addr_zip));
        cust_phone_num_1.set(String.valueOf(exp_cust_phone_num[1 - 1]));
        cust_phone_num_2.set(String.valueOf(exp_cust_phone_num[2 - 1]));
        cust_ssn.set(String.valueOf(exp_cust_ssn));
        cust_govt_issued_id.set(String.valueOf(exp_cust_govt_issued_id));
        cust_dob_yyyy_mm_dd.set(String.valueOf(exp_cust_dob_yyyy_mm_dd));
        cust_eft_account_id.set(String.valueOf(exp_cust_eft_account_id));
        cust_pri_card_holder_ind.set(String.valueOf(exp_cust_pri_card_holder_ind));
        cust_fico_credit_score.set(String.valueOf(exp_cust_fico_credit_score));
        /* WRITE CUSTOMER-RECORD — no file mapping */ // customer_record.write();
        if (!(!String.valueOf(ws_customer_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing customer record, Status: " + String.valueOf(ws_customer_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_customer_records_imported.set(new BigDecimal(String.valueOf(ws_customer_records_imported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 2400 - */
    }

    private void process_account_record() {
        account_record.set("");
        acct_id.set(String.valueOf(exp_acct_id));
        acct_active_status.set(String.valueOf(exp_acct_active_status));
        acct_curr_bal.set(String.valueOf(exp_acct_curr_bal));
        acct_credit_limit.set(String.valueOf(exp_acct_credit_limit));
        acct_cash_credit_limit.set(String.valueOf(exp_acct_cash_credit_limit));
        acct_open_date.set(String.valueOf(exp_acct_open_date));
        acct_expiraion_date.set(String.valueOf(exp_acct_expiraion_date));
        acct_reissue_date.set(String.valueOf(exp_acct_reissue_date));
        acct_curr_cyc_credit.set(String.valueOf(exp_acct_curr_cyc_credit));
        acct_curr_cyc_debit.set(String.valueOf(exp_acct_curr_cyc_debit));
        acct_addr_zip.set(String.valueOf(exp_acct_addr_zip));
        acct_group_id.set(String.valueOf(exp_acct_group_id));
        /* WRITE ACCOUNT-RECORD — no file mapping */ // account_record.write();
        if (!(!String.valueOf(ws_account_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing account record, Status: " + String.valueOf(ws_account_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_account_records_imported.set(new BigDecimal(String.valueOf(ws_account_records_imported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 2500 - */
    }

    private void process_xref_record() {
        card_xref_record.set("");
        xref_card_num.set(String.valueOf(exp_xref_card_num));
        xref_cust_id.set(String.valueOf(exp_xref_cust_id));
        xref_acct_id.set(String.valueOf(exp_xref_acct_id));
        /* WRITE CARD-XREF-RECORD — no file mapping */ // card_xref_record.write();
        if (!(!String.valueOf(ws_xref_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing xref record, Status: " + String.valueOf(ws_xref_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_xref_records_imported.set(new BigDecimal(String.valueOf(ws_xref_records_imported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 2600 - */
    }

    private void process_tran_record() {
        tran_record.set("");
        tran_id.set(String.valueOf(exp_tran_id));
        tran_type_cd.set(String.valueOf(exp_tran_type_cd));
        tran_cat_cd.set(String.valueOf(exp_tran_cat_cd));
        tran_source.set(String.valueOf(exp_tran_source));
        tran_desc.set(String.valueOf(exp_tran_desc));
        tran_amt.set(String.valueOf(exp_tran_amt));
        tran_merchant_id.set(String.valueOf(exp_tran_merchant_id));
        tran_merchant_name.set(String.valueOf(exp_tran_merchant_name));
        tran_merchant_city.set(String.valueOf(exp_tran_merchant_city));
        tran_merchant_zip.set(String.valueOf(exp_tran_merchant_zip));
        tran_card_num.set(String.valueOf(exp_tran_card_num));
        tran_orig_ts.set(String.valueOf(exp_tran_orig_ts));
        tran_proc_ts.set(String.valueOf(exp_tran_proc_ts));
        /* WRITE TRAN-RECORD — no file mapping */ // tran_record.write();
        if (!(!String.valueOf(ws_transaction_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing transaction record, Status: " + String.valueOf(ws_transaction_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_tran_records_imported.set(new BigDecimal(String.valueOf(ws_tran_records_imported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 2650 - */
    }

    private void process_card_record() {
        card_record.set("");
        card_num.set(String.valueOf(exp_card_num));
        card_acct_id.set(String.valueOf(exp_card_acct_id));
        card_cvv_cd.set(String.valueOf(exp_card_cvv_cd));
        card_embossed_name.set(String.valueOf(exp_card_embossed_name));
        card_expiraion_date.set(String.valueOf(exp_card_expiraion_date));
        card_active_status.set(String.valueOf(exp_card_active_status));
        /* WRITE CARD-RECORD — no file mapping */ // card_record.write();
        if (!(!String.valueOf(ws_card_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing card record, Status: " + String.valueOf(ws_card_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_card_records_imported.set(new BigDecimal(String.valueOf(ws_card_records_imported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 2700 - */
    }

    private void process_unknown_record() {
        ws_unknown_record_type_count.set(new BigDecimal(String.valueOf(ws_unknown_record_type_count).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        err_timestamp.set(String.valueOf(CobolIntrinsics.current_date()));
        err_record_type.set(String.valueOf(export_rec_type));
        err_sequence.set(String.valueOf(export_sequence_num));
        err_message.set(String.valueOf("Unknown record type encountered"));
        _2750();
        /* RAW: -  */
    }

    private void write_error() {
        /* RAW: 2750 - */
    }

    private void write_error_2() {
        error_output.write(ws_error_record);
        if (!(!String.valueOf(ws_error_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing error record, Status: " + String.valueOf(ws_error_status));
        }
        ws_error_records_written.set(new BigDecimal(String.valueOf(ws_error_records_written).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 3000 - */
    }

    private void validate_import() {
        CobolDisplay.display("CBIMPORT: Import validation completed");
        CobolDisplay.display("CBIMPORT: No validation errors detected");
        /* RAW: 4000 - */
    }

    private void para_finalize() {
        export_input.close();
        customer_output.close();
        account_output.close();
        xref_output.close();
        transaction_output.close();
        card_output.close();
        error_output.close();
        CobolDisplay.display("CBIMPORT: Import completed");
        CobolDisplay.display("CBIMPORT: Total Records Read: " + String.valueOf(ws_total_records_read));
        CobolDisplay.display("CBIMPORT: Customers Imported: " + String.valueOf(ws_customer_records_imported));
        CobolDisplay.display("CBIMPORT: Accounts Imported: " + String.valueOf(ws_account_records_imported));
        CobolDisplay.display("CBIMPORT: XRefs Imported: " + String.valueOf(ws_xref_records_imported));
        CobolDisplay.display("CBIMPORT: Transactions Imported: " + String.valueOf(ws_tran_records_imported));
        CobolDisplay.display("CBIMPORT: Cards Imported: " + String.valueOf(ws_card_records_imported));
        CobolDisplay.display("CBIMPORT: Errors Written: " + String.valueOf(ws_error_records_written));
        CobolDisplay.display("CBIMPORT: Unknown Record Types: ");
    }

    private void ws_unknown_record_type_count() {
        /* RAW: 9999 - */
    }

    private void abend_program() {
        CobolDisplay.display("CBIMPORT: ABENDING PROGRAM");
        CobolProgram.call("CEE3ABD");
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _2100() { /* stub — external/COPY */ }

    private void _2200() { /* stub — external/COPY */ }

    private void _2300() { /* stub — external/COPY */ }

    private void _2400() { /* stub — external/COPY */ }

    private void _2500() { /* stub — external/COPY */ }

    private void _2600() { /* stub — external/COPY */ }

    private void _2650() { /* stub — external/COPY */ }

    private void _2700() { /* stub — external/COPY */ }

    private void _2750() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbimport().run();
    }
}
