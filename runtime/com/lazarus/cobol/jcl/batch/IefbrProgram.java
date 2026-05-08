package com.lazarus.cobol.jcl.batch;

/**
 * IEFBR14 — the "do-nothing" utility program.
 *
 * On z/OS, IEFBR14 is a one-instruction program (BR R14 = return to caller).
 * It exists purely so that JCL DD statements can trigger dataset allocation,
 * deletion, or cataloging as side effects. The program itself does nothing.
 *
 * Common uses:
 *   //STEP1 EXEC PGM=IEFBR14
 *   //DD1   DD DSN=NEW.DATASET,DISP=(NEW,CATLG),
 *   //         SPACE=(CYL,(10,5)),DCB=(RECFM=FB,LRECL=80,BLKSIZE=0)
 *   //DD2   DD DSN=OLD.DATASET,DISP=(OLD,DELETE)
 *
 * This translated version:
 *   - Logs the execution to SYSPRINT (if allocated)
 *   - Sets return code 0
 *   - Performs no data processing
 */
public class IefbrProgram extends BatchProgram {

    @Override
    public void run() {
        sysprint("IEFBR14 — Dataset allocation utility");
        returnCode = 0;
    }
}
