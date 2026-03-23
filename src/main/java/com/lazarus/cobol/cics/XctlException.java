package com.lazarus.cobol.cics;

/**
 * Thrown by EXEC CICS XCTL to transfer control to another program.
 * XCTL does NOT return to the caller — the calling program's stack frame
 * is abandoned. The CicsRegion catches this exception and routes to
 * the target program.
 */
public class XctlException extends RuntimeException {
    private final String programName;
    private final byte[] commarea;
    private final String channel;

    public XctlException(String programName, byte[] commarea, String channel) {
        super("XCTL to " + programName);
        this.programName = programName;
        this.commarea = commarea;
        this.channel = channel;
    }

    public String getProgramName() { return programName; }
    public byte[] getCommarea() { return commarea; }
    public String getChannel() { return channel; }
}
