package com.lazarus.cobol.cics;

/**
 * Thrown by EXEC CICS RETURN to end the current program.
 * If TRANSID is specified, the next user input will start that transaction.
 * If COMMAREA is specified, it's passed to the next invocation.
 */
public class ReturnException extends RuntimeException {
    private final String transid;
    private final byte[] commarea;
    private final boolean immediate;

    public ReturnException(String transid, byte[] commarea, boolean immediate) {
        super("RETURN" + (transid != null ? " TRANSID(" + transid + ")" : ""));
        this.transid = transid;
        this.commarea = commarea;
        this.immediate = immediate;
    }

    public String getTransid() { return transid; }
    public byte[] getCommarea() { return commarea; }
    public boolean isImmediate() { return immediate; }
}
