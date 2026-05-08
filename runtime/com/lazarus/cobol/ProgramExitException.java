package com.lazarus.cobol;

/**
 * Thrown by {@link CobolIntrinsics#programExit(int)} when daemon mode is active.
 * The in-process runner ({@code InProcessRunner}) catches this to capture the program's
 * exit status without terminating the JVM.
 *
 * Extends Error (not RuntimeException) so it propagates through generated code
 * that may catch RuntimeException broadly.
 */
public class ProgramExitException extends Error {
    private static final long serialVersionUID = 1L;
    private final int status;

    public ProgramExitException(int status) {
        super("COBOL STOP RUN with status " + status);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        // Skip stack trace — exit is a control-flow signal, not an error
        return this;
    }
}
