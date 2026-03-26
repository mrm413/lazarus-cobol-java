package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Listings024FileDescriptions extends CobolProgram {
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
    private CobolString headings_line = new CobolString(1); // Group: HEADINGS-LINE
    private CobolString filler_1 = new CobolString(82);
    private CobolString filler_2 = new CobolString(82);
    private CobolString phase = new CobolString(17);
    private CobolString month_run = new CobolString(2);
    private CobolString filler_3 = new CobolString(82);
    private CobolString day_run = new CobolString(2);
    private CobolString filler_4 = new CobolString(82);
    private CobolString year_run = new CobolString(2);
    private CobolString filler_5 = new CobolString(82);
    private CobolString filler_6 = new CobolString(82);
    private int page_number = 0;
    private CobolString command_listing = new CobolString(1); // Group: COMMAND-LISTING
    private CobolString filler_7 = new CobolString(82);
    private CobolString command_image = new CobolString(80);
    private CobolString activities_listing = new CobolString(1); // Group: ACTIVITIES-LISTING
    private CobolString disposition = new CobolString(2);
    private CobolString active_image = new CobolString(80);
    private CobolString upsi_byte = new CobolString(1); // Group: UPSI-BYTE
    private CobolString[] upsi_bit = new CobolString[8];
    private CobolString message_log = new CobolString(1); // Group: MESSAGE-LOG
    private CobolString filler_8 = new CobolString(82);
    private CobolString message_text = new CobolString(80);
    private CobolString display_message = new CobolString(1); // Group: DISPLAY-MESSAGE
    private CobolString filler_9 = new CobolString(82);
    private CobolString display_temp = new CobolString(6);
    private CobolString filler_10 = new CobolString(82);
    private CobolString display_text = new CobolString(60);

    // FILE SECTION — OLD-VERSION
    private CobolString old_record = new CobolString(1); // Group: OLD-RECORD
    private CobolString old_statement = new CobolString(75);
    private CobolString old_number = new CobolString(5);

    // FILE SECTION — NEW-VERSION
    private CobolString new_record = new CobolString(1); // Group: NEW-RECORD
    private CobolString new_statement = new CobolString(75);
    private CobolString new_number = new CobolString(5);

    // FILE SECTION — MODIFICATION
    private CobolString update_order = new CobolString(1); // Group: UPDATE-ORDER
    private CobolString insertion = new CobolString(1); // Group: INSERTION
    private CobolString command = new CobolString(6);
    private CobolString filler_11 = new CobolString(82);
    private int a_field = 0;
    private CobolString a_alpha = new CobolString(5);
    private CobolString filler_12 = new CobolString(82);
    private int b_field = 0;
    private CobolString b_alpha = new CobolString(5);
    private CobolString filler_13 = new CobolString(82);
    private CobolString filler_14 = new CobolString(82);

    // FILE SECTION — COMMENTARY
    private CobolString comment_line = new CobolString(1); // Group: COMMENT-LINE
    private CobolString filler_15 = new CobolString(82);


    // FILE DESCRIPTORS
    private CobolFile old_version = new CobolFile("SYSUT1", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile new_version = new CobolFile("SYSUT2", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile prt_version = new CobolFile("SYSUT2", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile modification = new CobolFile("SYSIN1", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile commentary = new CobolFile("SYSOU1", "LINE SEQUENTIAL", "SEQUENTIAL");

    // FALLBACK FILE DESCRIPTORS
    private CobolFile _filler_001 = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");


    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private void para_main() {
        old_version.open("INPUT");
        // KNOWN_ISSUE: _filler_002.open("INPUT");
        modification.open("INPUT");
        // KNOWN_ISSUE: _filler_003.open("INPUT");
        new_version.open("OUTPUT");
        // KNOWN_ISSUE: _filler_004.open("OUTPUT");
        commentary.open("OUTPUT");
        old_version.close();
        // KNOWN_ISSUE: _filler_005.close();
        new_version.close();
        // KNOWN_ISSUE: _filler_006.close();
        modification.close();
        // KNOWN_ISSUE: _filler_007.close();
        commentary.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Listings024FileDescriptions().run();
    }
}
