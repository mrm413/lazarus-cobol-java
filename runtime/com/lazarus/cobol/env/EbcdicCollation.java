package com.lazarus.cobol.env;

import java.util.*;

/**
 * EBCDIC Collating Sequence for COBOL programs.
 *
 * EBCDIC sort order differs from ASCII:
 *   spaces (0x40) < special chars < lowercase a-z (0x81-0xA9) <
 *   uppercase A-Z (0xC1-0xE9) < digits 0-9 (0xF0-0xF9)
 *
 * ASCII sort order:
 *   spaces (0x20) < digits 0-9 (0x30-0x39) < uppercase A-Z (0x41-0x5A) <
 *   lowercase a-z (0x61-0x7A)
 *
 * This class provides:
 *   - EBCDIC-order string comparison (for SORT, IF comparisons)
 *   - EBCDIC-order Comparator for Collections.sort
 *   - ASCII ↔ EBCDIC translation tables
 *   - COBOL NATIVE/STANDARD collation support
 *   - Custom collating sequence (PROGRAM COLLATING SEQUENCE)
 */
public class EbcdicCollation {

    /** Full ASCII (0-255) to EBCDIC translation table */
    private static final int[] ASCII_TO_EBCDIC = new int[256];

    /** Full EBCDIC (0-255) to ASCII translation table */
    private static final int[] EBCDIC_TO_ASCII = new int[256];

    /** EBCDIC weight for each ASCII character (0-127 used for sorting) */
    private static final int[] EBCDIC_WEIGHT = new int[256];

    static {
        // Initialize all to identity
        for (int i = 0; i < 256; i++) {
            ASCII_TO_EBCDIC[i] = i;
            EBCDIC_TO_ASCII[i] = i;
            EBCDIC_WEIGHT[i] = i;
        }

        // Core ASCII→EBCDIC mappings
        // Space
        ASCII_TO_EBCDIC[0x20] = 0x40;
        // Digits 0-9 → 0xF0-0xF9
        for (int i = 0; i <= 9; i++) {
            ASCII_TO_EBCDIC[0x30 + i] = 0xF0 + i;
        }
        // Uppercase A-Z → 0xC1-0xC9 (A-I), 0xD1-0xD9 (J-R), 0xE2-0xE9 (S-Z)
        int[] upperMap = {
            0xC1, 0xC2, 0xC3, 0xC4, 0xC5, 0xC6, 0xC7, 0xC8, 0xC9, // A-I
            0xD1, 0xD2, 0xD3, 0xD4, 0xD5, 0xD6, 0xD7, 0xD8, 0xD9, // J-R
            0xE2, 0xE3, 0xE4, 0xE5, 0xE6, 0xE7, 0xE8, 0xE9        // S-Z
        };
        for (int i = 0; i < 26; i++) {
            ASCII_TO_EBCDIC[0x41 + i] = upperMap[i];
        }
        // Lowercase a-z → 0x81-0x89 (a-i), 0x91-0x99 (j-r), 0xA2-0xA9 (s-z)
        int[] lowerMap = {
            0x81, 0x82, 0x83, 0x84, 0x85, 0x86, 0x87, 0x88, 0x89, // a-i
            0x91, 0x92, 0x93, 0x94, 0x95, 0x96, 0x97, 0x98, 0x99, // j-r
            0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xA7, 0xA8, 0xA9        // s-z
        };
        for (int i = 0; i < 26; i++) {
            ASCII_TO_EBCDIC[0x61 + i] = lowerMap[i];
        }
        // Common special characters
        ASCII_TO_EBCDIC['.'] = 0x4B;
        ASCII_TO_EBCDIC['<'] = 0x4C;
        ASCII_TO_EBCDIC['('] = 0x4D;
        ASCII_TO_EBCDIC['+'] = 0x4E;
        ASCII_TO_EBCDIC['&'] = 0x50;
        ASCII_TO_EBCDIC['!'] = 0x5A;
        ASCII_TO_EBCDIC['$'] = 0x5B;
        ASCII_TO_EBCDIC['*'] = 0x5C;
        ASCII_TO_EBCDIC[')'] = 0x5D;
        ASCII_TO_EBCDIC[';'] = 0x5E;
        ASCII_TO_EBCDIC['-'] = 0x60;
        ASCII_TO_EBCDIC['/'] = 0x61;
        ASCII_TO_EBCDIC[','] = 0x6B;
        ASCII_TO_EBCDIC['%'] = 0x6C;
        ASCII_TO_EBCDIC['_'] = 0x6D;
        ASCII_TO_EBCDIC['>'] = 0x6E;
        ASCII_TO_EBCDIC['?'] = 0x6F;
        ASCII_TO_EBCDIC[':'] = 0x7A;
        ASCII_TO_EBCDIC['#'] = 0x7B;
        ASCII_TO_EBCDIC['@'] = 0x7C;
        ASCII_TO_EBCDIC['\''] = 0x7D;
        ASCII_TO_EBCDIC['='] = 0x7E;
        ASCII_TO_EBCDIC['"'] = 0x7F;

        // Build reverse table from standard ASCII range only (0-127)
        // to avoid identity-mapped high bytes overwriting correct mappings
        for (int i = 0; i < 128; i++) {
            EBCDIC_TO_ASCII[ASCII_TO_EBCDIC[i] & 0xFF] = i;
        }

        // Build EBCDIC weight table for ASCII chars (use EBCDIC code point as weight)
        for (int i = 0; i < 256; i++) {
            EBCDIC_WEIGHT[i] = ASCII_TO_EBCDIC[i & 0xFF];
        }
    }

    // --- Singleton comparator ---

    private static final Comparator<String> EBCDIC_COMPARATOR = new Comparator<String>() {
        public int compare(String a, String b) {
            return ebcdicCompare(a, b);
        }
    };

    /** Get EBCDIC-order Comparator */
    public static Comparator<String> comparator() {
        return EBCDIC_COMPARATOR;
    }

    // --- Compare ---

    /** Compare two strings in EBCDIC collating sequence */
    public static int ebcdicCompare(String a, String b) {
        int len = Math.max(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            int ca = (i < a.length()) ? EBCDIC_WEIGHT[a.charAt(i) & 0xFF] : 0x40; // space pad
            int cb = (i < b.length()) ? EBCDIC_WEIGHT[b.charAt(i) & 0xFF] : 0x40;
            if (ca != cb) return ca - cb;
        }
        return 0;
    }

    /** Check if a < b in EBCDIC order */
    public static boolean isLessThan(String a, String b) {
        return ebcdicCompare(a, b) < 0;
    }

    /** Check if a > b in EBCDIC order */
    public static boolean isGreaterThan(String a, String b) {
        return ebcdicCompare(a, b) > 0;
    }

    /** Check if a == b in EBCDIC order */
    public static boolean isEqual(String a, String b) {
        return ebcdicCompare(a, b) == 0;
    }

    // --- Sort ---

    /** Sort a list of strings in EBCDIC collating sequence */
    public static void sort(List<String> list) {
        Collections.sort(list, EBCDIC_COMPARATOR);
    }

    /** Sort an array of strings in EBCDIC collating sequence */
    public static void sort(String[] array) {
        Arrays.sort(array, EBCDIC_COMPARATOR);
    }

    // --- Translation ---

    /** Translate ASCII string to EBCDIC byte array */
    public static byte[] asciiToEbcdic(String ascii) {
        byte[] result = new byte[ascii.length()];
        for (int i = 0; i < ascii.length(); i++) {
            result[i] = (byte) ASCII_TO_EBCDIC[ascii.charAt(i) & 0xFF];
        }
        return result;
    }

    /** Translate EBCDIC byte array to ASCII string */
    public static String ebcdicToAscii(byte[] ebcdic) {
        char[] result = new char[ebcdic.length];
        for (int i = 0; i < ebcdic.length; i++) {
            result[i] = (char) EBCDIC_TO_ASCII[ebcdic[i] & 0xFF];
        }
        return new String(result);
    }

    /** Get EBCDIC code point for an ASCII character */
    public static int toEbcdic(char ascii) {
        return ASCII_TO_EBCDIC[ascii & 0xFF];
    }

    /** Get ASCII character for an EBCDIC code point */
    public static char toAscii(int ebcdic) {
        return (char) EBCDIC_TO_ASCII[ebcdic & 0xFF];
    }

    // --- Custom collating sequence support ---

    /** Create a custom collating sequence comparator from a 256-byte weight table */
    public static Comparator<String> customComparator(final int[] weightTable) {
        return new Comparator<String>() {
            public int compare(String a, String b) {
                int len = Math.max(a.length(), b.length());
                for (int i = 0; i < len; i++) {
                    int ca = (i < a.length()) ? weightTable[a.charAt(i) & 0xFF] : weightTable[' '];
                    int cb = (i < b.length()) ? weightTable[b.charAt(i) & 0xFF] : weightTable[' '];
                    if (ca != cb) return ca - cb;
                }
                return 0;
            }
        };
    }

    /** Create NATIVE (ASCII) collating sequence comparator */
    public static Comparator<String> nativeComparator() {
        return new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        };
    }

    /** Create STANDARD-1 (ASCII) collating sequence comparator (same as NATIVE on ASCII) */
    public static Comparator<String> standard1Comparator() {
        return nativeComparator();
    }

    // --- Utility ---

    /** Verify EBCDIC ordering: spaces < lowercase < uppercase < digits */
    public static boolean verifyEbcdicOrder() {
        return ebcdicCompare(" ", "a") < 0
            && ebcdicCompare("a", "A") < 0
            && ebcdicCompare("A", "0") < 0
            && ebcdicCompare("0", "9") < 0;
    }

    /** Get the EBCDIC sort weight for an ASCII character */
    public static int getWeight(char c) {
        return EBCDIC_WEIGHT[c & 0xFF];
    }
}
