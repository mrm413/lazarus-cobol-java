package com.lazarus.cobol;

/**
 * Base class for transpiled COBOL programs.
 * Provides lifecycle management and inter-program CALL support.
 */
public abstract class CobolProgram {

    /** Entry point — called by main() or by another program via CALL. */
    public abstract void run();

    /**
     * COBOL CALL verb — instantiate and run a program by name.
     * In a full implementation this would use reflection or a registry.
     */
    public static void call(String programName, Object... args) {
        // Stub — inter-program call registry
        System.err.println("CALL " + programName + " — not yet wired");
    }
}
