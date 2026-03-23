package com.lazarus.cobol;

/**
 * COBOL File Status codes.
 */
public class FileStatus {
    public static final String SUCCESS = "00";
    public static final String AT_END = "10";
    public static final String KEY_NOT_FOUND = "23";
    public static final String PERMANENT_ERROR = "30";
    public static final String FILE_NOT_FOUND = "35";
    public static final String ALREADY_OPEN = "41";
    public static final String NOT_OPEN = "42";
    public static final String NO_READ_DONE = "43";
    public static final String RECORD_OVERFLOW = "44";
    public static final String NO_READ_ACCESS = "47";
    public static final String NO_WRITE_ACCESS = "48";
    public static final String DUPLICATE_KEY = "22";
}
