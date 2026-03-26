package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile075ReadInputPipeWriteOutputPipe extends CobolProgram {
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
    private CobolString f_status = new CobolString(2);
    private CobolString w_command = new CobolString(100);

    // FILE SECTION — pipe-in
    private CobolString pipe_msg_in = new CobolString(132);

    // FILE SECTION — pipe-out
    private CobolString pipe_msg_out = new CobolString(132);


    // FILE DESCRIPTORS
    private CobolFile pipe_in = new CobolFile("organization", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: f-status
    private CobolFile pipe_out = new CobolFile("organization", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: f-status

    private CobolString f_status_ok = new CobolString(256); // fallback

    private void para_main() {
        w_command.set(String.valueOf("< sh ./provider ./test-data-in"));
        pipe_in.open("INPUT");
        if (!(!String.valueOf(f_status_ok).trim().isEmpty())) {
            CobolDisplay.display("FAILED: OPEN INPUT");
            System.exit(0);
        }
        w_command.set(String.valueOf("> sh ./consumer > ./test-data-out"));
        pipe_out.open("OUTPUT");
        if (!(!String.valueOf(f_status_ok).trim().isEmpty())) {
            CobolDisplay.display("FAILED: OPEN OUTPUT");
            System.exit(0);
        }
        while (!(!(!String.valueOf(f_status_ok).trim().isEmpty()))) {
            if (pipe_in.read(null) == FileStatus.AT_END) {
            }
            if (!String.valueOf(f_status_ok).trim().isEmpty()) {
                x01_100_map();
                pipe_out.write(pipe_msg_out);
            }
        }
        pipe_in.close();
        pipe_out.close();
        System.exit(0);
    }

    private void x01_100_map() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile075ReadInputPipeWriteOutputPipe().run();
    }
}
