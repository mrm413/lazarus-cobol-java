package com.lazarus.cobol;

/**
 * Fixed-length, space-padded COBOL string (PIC X / PIC A).
 * Wraps a char[] with COBOL move/compare semantics.
 */
public class CobolString {
    private char[] data;

    public CobolString(int length) {
        this.data = new char[length];
        java.util.Arrays.fill(this.data, ' ');
    }

    public CobolString(String initial) {
        this(initial.length());
        set(initial);
    }

    public int length() { return data.length; }

    public void set(String value) {
        java.util.Arrays.fill(data, ' ');
        int len = Math.min(value.length(), data.length);
        for (int i = 0; i < len; i++) data[i] = value.charAt(i);
    }

    public void set(CobolString other) {
        set(other.toString());
    }

    public String get() {
        return new String(data);
    }

    /** Reference modification: COBOL 1-based start, length */
    public static String refMod(Object target, int start, int length) {
        String s = String.valueOf(target);
        int from = start - 1; // COBOL is 1-based
        int to = Math.min(from + length, s.length());
        if (from < 0) from = 0;
        if (from >= s.length()) return "";
        return s.substring(from, to);
    }

    public static String refMod(Object target, int start) {
        String s = String.valueOf(target);
        int from = start - 1;
        if (from < 0) from = 0;
        if (from >= s.length()) return "";
        return s.substring(from);
    }

    /** Set a substring via reference modification (COBOL 1-based) */
    public void setRefMod(int start, int length, String value) {
        int from = start - 1;
        if (from < 0) from = 0;
        int to = Math.min(from + length, data.length);
        String padded = value;
        while (padded.length() < length) padded += " ";
        for (int i = from; i < to; i++) {
            data[i] = padded.charAt(i - from);
        }
    }
    public void setRefMod(int start, String value) {
        setRefMod(start, data.length - start + 1, value);
    }

    /** STRING verb DELIMITED BY support */
    public static String delimitedBy(String value, String delimiter) {
        int idx = value.indexOf(delimiter);
        return idx >= 0 ? value.substring(0, idx) : value;
    }

    /** TRANSFORM verb — character-by-character replacement */
    public static String transform(Object target, String from, String to) {
        String s = String.valueOf(target);
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            int idx = from.indexOf(s.charAt(i));
            sb.append(idx >= 0 && idx < to.length() ? to.charAt(idx) : s.charAt(i));
        }
        return sb.toString();
    }

    /** Static setRefMod for array elements — write substring at refmod position */
    public static void setRefMod(CobolString[] arr, int index, int start, int length, String value) {
        if (index >= 0 && index < arr.length && arr[index] != null) {
            arr[index].setRefMod(start, length, value);
        }
    }
    public static void setRefMod(CobolString[] arr, int index, int start, String value) {
        if (index >= 0 && index < arr.length && arr[index] != null) {
            arr[index].setRefMod(start, value);
        }
    }

    @Override
    public String toString() {
        return new String(data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof CobolString) return java.util.Arrays.equals(data, ((CobolString) o).data);
        if (o instanceof String) return get().equals(o);
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Arrays.hashCode(data);
    }
}
