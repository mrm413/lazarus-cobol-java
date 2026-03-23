package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cobtupdt extends CobolProgram {
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
    // FILE SECTION — TR-RECORD
    private CobolString ws_input_vars = new CobolString(1); // Group: WS-INPUT-VARS
    private CobolString input_type = new CobolString(1);
    private CobolString input_tr_number = new CobolString(2);
    private CobolString input_tr_desc = new CobolString(50);


    // FILE DESCRIPTORS
    private CobolFile tr_record = new CobolFile("INPFILE", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-INF-STATUS

    // FALLBACK FILE DESCRIPTORS
    private CobolFile from = new CobolFile("FROM", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString ws_inf_status = new CobolString(256); // fallback
    private CobolString lastrec = new CobolString(256); // fallback
    private CobolString ws_input_rec = new CobolString(256); // fallback
    private CobolString input_rec_type = new CobolString(256); // fallback
    private CobolString ws_return_msg = new CobolString(256); // fallback
    private CobolString sqlcode = new CobolString(256); // fallback
    private CobolString ws_var_sqlcode = new CobolString(256); // fallback
    private CobolString tr_description = new CobolString(256); // fallback
    private CobolString move = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString input_rec_desc = new CobolString(256); // fallback
    private CobolString where = new CobolString(256); // fallback
    private CobolString tr_type = new CobolString(256); // fallback
    private CobolString input_rec_number = new CobolString(256); // fallback
    private CobolString end_exec = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0001 - */
    }

    private void open_files() {
    }

    private void tr_record() {
        if (String.valueOf(ws_inf_status).equals(String.valueOf("00"))) {
            CobolDisplay.display("OPEN FILE OK");
        } else {
            CobolDisplay.display("OPEN FILE NOT OK");
        }
        return;
    }

    private void read_next_records() {
        _1002();
        /* RAW: - READ-RECORDS */
        while (!(String.valueOf(lastrec).equals(String.valueOf("Y")))) {
            _1003();
            /* RAW: - TREAT-RECORD */
            _1002();
            /* RAW: - READ-RECORDS */
        }
        _2001();
        /* RAW: - CLOSE-STOP */
        return;
    }

    private void read_records() {
        if (tr_record.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD INTO WS-INPUT-REC AT END */
        lastrec.set(String.valueOf("Y"));
        if (!String.valueOf(lastrec).equals(String.valueOf("Y"))) {
            CobolDisplay.display("PROCESSING   " + String.valueOf(ws_input_rec));
        }
        return;
    }

    private void treat_record() {
        if (String.valueOf(input_rec_type).equals(String.valueOf("A"))) {
            CobolDisplay.display("ADDING RECORD");
            _10031();
            /* RAW: - INSERT-DB */
        } else if (String.valueOf(input_rec_type).equals(String.valueOf("U"))) {
            CobolDisplay.display("UPDATING RECORD");
            _10032();
            /* RAW: - UPDATE-DB */
        } else if (String.valueOf(input_rec_type).equals(String.valueOf("D"))) {
            CobolDisplay.display("DELETING RECORD");
            _10033();
            /* RAW: - DELETE-DB */
        } else if (String.valueOf(input_rec_type).equals(String.valueOf("*"))) {
            CobolDisplay.display("IGNORING COMMENTED LINE");
        } else {
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("ERROR: TYPE NOT VALID");
                ws_return_msg.set(_sb.toString());
            }
            _9999();
            /* RAW: - ABEND */
        }
        return;
    }

    private void insert_db() {
        /* RAW: EXEC SQL INSERT INTO */
    }

    private void carddemo() {
        /* RAW: TRANSACTION_TYPE ( TR_TYPE , TR_DESCRIPTION ) */
    }

    private void end_exec() {
        ws_var_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            CobolDisplay.display("RECORD INSERTED SUCCESSFULLY");
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: < 0 */
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Error accessing:");
                _sb.append(" TRANSACTION_TYPE table. SQLCODE:");
                _sb.append(String.valueOf(ws_var_sqlcode));
                ws_return_msg.set(_sb.toString());
            }
            _9999();
            /* RAW: - ABEND */
        }
        return;
    }

    private void update_db() {
        /* RAW: EXEC SQL UPDATE */
    }

    private void carddemo_2() {
        /* RAW: TRANSACTION_TYPE  */
        tr_description.set(String.valueOf(move));
        _unnamed.set(String.valueOf(move));
        _unnamed.set(String.valueOf(move));
        input_rec_desc.set(String.valueOf(move));
        where.set(String.valueOf(move));
        tr_type.set(String.valueOf(move));
        _unnamed.set(String.valueOf(move));
        _unnamed.set(String.valueOf(move));
        input_rec_number.set(String.valueOf(move));
        end_exec.set(String.valueOf(move));
        /* RAW: SQLCODE TO WS-VAR-SQLCODE */
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            CobolDisplay.display("RECORD UPDATED SUCCESSFULLY");
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = +100 */
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("No records found.");
                ws_return_msg.set(_sb.toString());
            }
            _9999();
            /* RAW: - ABEND */
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: < 0 */
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Error accessing:");
                _sb.append(" TRANSACTION_TYPE table. SQLCODE:");
                _sb.append(String.valueOf(ws_var_sqlcode));
                ws_return_msg.set(_sb.toString());
            }
            _9999();
            /* RAW: - ABEND */
        }
        return;
    }

    private void delete_db() {
        /* RAW: EXEC SQL */
        from.delete();
    }

    private void carddemo_3() {
        /* RAW: TRANSACTION_TYPE WHERE TR_TYPE = : INPUT-REC-NUMBER */
    }

    private void end_exec_2() {
        ws_var_sqlcode.set(String.valueOf(sqlcode));
        if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = ZERO */
            CobolDisplay.display("RECORD DELETED SUCCESSFULLY");
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: = +100 */
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("No records found.");
                ws_return_msg.set(_sb.toString());
            }
            _9999();
            /* RAW: - ABEND */
        } else if (!String.valueOf(sqlcode).trim().isEmpty()) {
            /* RAW: < 0 */
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Error accessing:");
                _sb.append(" TRANSACTION_TYPE table. SQLCODE:");
                _sb.append(String.valueOf(ws_var_sqlcode));
                ws_return_msg.set(_sb.toString());
            }
            _9999();
            /* RAW: - ABEND */
        }
        return;
    }

    private void abend() {
        CobolDisplay.display();
    }

    private void ws_return_msg() {
        return_code = new BigDecimal(String.valueOf(4).trim()).intValue();
        return;
    }

    private void close_stop() {
    }

    private void tr_record_2() {
        return;
    }

    private void _1002() { /* stub — external/COPY */ }

    private void _1003() { /* stub — external/COPY */ }

    private void _2001() { /* stub — external/COPY */ }

    private void _10031() { /* stub — external/COPY */ }

    private void _10032() { /* stub — external/COPY */ }

    private void _10033() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cobtupdt().run();
    }
}
