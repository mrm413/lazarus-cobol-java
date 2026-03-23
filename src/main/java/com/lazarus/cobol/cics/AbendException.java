package com.lazarus.cobol.cics;

/**
 * Thrown by EXEC CICS ABEND to abnormally terminate the current task.
 * The CicsRegion catches this and invokes any registered HANDLE ABEND
 * handler, or produces a dump if no handler is found.
 */
public class AbendException extends RuntimeException {
    private final String abcode;
    private final boolean dump;
    private final boolean cancel;

    public AbendException(String abcode, boolean dump, boolean cancel) {
        super("ABEND " + abcode);
        this.abcode = abcode;
        this.dump = dump;
        this.cancel = cancel;
    }

    public String getAbcode() { return abcode; }
    public boolean isDump() { return dump; }
    public boolean isCancel() { return cancel; }
}
