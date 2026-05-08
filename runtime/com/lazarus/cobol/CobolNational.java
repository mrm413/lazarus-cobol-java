package com.lazarus.cobol;

/**
 * COBOL National (N"..." / NC"...") literal support.
 * National strings are UTF-16 where each character takes 2 bytes.
 * When displayed, they show with inter-character spacing (null byte as space).
 */
public class CobolNational {
    private final String value;

    public CobolNational(String value) {
        this.value = value;
    }

    /**
     * Create a national string from a literal.
     * Example: N"UTF-16 string"
     */
    public static CobolNational fromLiteral(String literal) {
        return new CobolNational(literal);
    }

    /**
     * Get the underlying string value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Convert to display format matching GnuCOBOL's national literal output.
     * Each character in UTF-16 occupies 2 bytes (big-endian), so when displayed
     * as raw bytes, each ASCII character is preceded by a null byte (0x00).
     * GnuCOBOL outputs the raw UTF-16BE bytes to stdout.
     */
    public String toDisplayString() {
        if (value == null || value.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            sb.append((char) 0); // UTF-16BE high byte (0x00 for ASCII characters)
            sb.append(value.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return toDisplayString();
    }

    /**
     * Check if an object is a national string and convert to display format.
     */
    public static String toDisplay(Object obj) {
        if (obj instanceof CobolNational) {
            return ((CobolNational) obj).toDisplayString();
        }
        return String.valueOf(obj);
    }
}
