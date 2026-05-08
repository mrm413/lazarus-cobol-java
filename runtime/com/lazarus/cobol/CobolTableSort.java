package com.lazarus.cobol;

import java.util.Arrays;
import java.util.Comparator;

/**
 * In-memory SORT for COBOL tables (OCCURS arrays).
 *
 * COBOL's "SORT table-name" sorts the elements of an OCCURS group
 * in place by rearranging all parallel field arrays according to
 * the specified key fields.  This is fundamentally different from
 * file-based DFSORT.
 *
 * Usage from generated code:
 *   CobolTableSort.sort(count, keys, allArrays);
 *
 *   - count:     number of active elements (from DEPENDING ON, or fixed OCCURS)
 *   - keys:      array of SortKey descriptors (field array ref + direction)
 *   - allArrays: every parallel Java array that must be rearranged together
 */
public final class CobolTableSort {

    private CobolTableSort() {}

    /** Describes one sort key: which array to compare and the direction. */
    public static final class SortKey {
        public final Object array;     // int[], long[], CobolString[], BigDecimal[], double[], String[]
        public final boolean ascending;

        public SortKey(Object array, boolean ascending) {
            this.array = array;
            this.ascending = ascending;
        }
    }

    /**
     * ASCII-to-EBCDIC collation table: index = ASCII codepoint, value = EBCDIC codepoint.
     * Used for SORT ... SEQUENCE IS EBCDIC to give EBCDIC ordering: lowercase < uppercase < digits.
     */
    private static final int[] EBCDIC_COLLATION = buildEbcdicCollation();
    private static int[] buildEbcdicCollation() {
        int[] t = new int[256];
        // Default: identity (preserves order for unmapped chars)
        for (int i = 0; i < 256; i++) t[i] = i;
        // Space
        t[0x20] = 0x40;
        // Digits 0-9 → 0xF0-0xF9
        for (int i = 0; i <= 9; i++) t['0' + i] = 0xF0 + i;
        // Uppercase A-I → 0xC1-0xC9
        for (int i = 0; i < 9; i++) t['A' + i] = 0xC1 + i;
        // Uppercase J-R → 0xD1-0xD9
        for (int i = 0; i < 9; i++) t['J' + i] = 0xD1 + i;
        // Uppercase S-Z → 0xE2-0xE9
        for (int i = 0; i < 8; i++) t['S' + i] = 0xE2 + i;
        // Lowercase a-i → 0x81-0x89
        for (int i = 0; i < 9; i++) t['a' + i] = 0x81 + i;
        // Lowercase j-r → 0x91-0x99
        for (int i = 0; i < 9; i++) t['j' + i] = 0x91 + i;
        // Lowercase s-z → 0xA2-0xA9
        for (int i = 0; i < 8; i++) t['s' + i] = 0xA2 + i;
        return t;
    }

    /**
     * Sort parallel arrays in place.
     *
     * @param count     number of active elements to sort (1-based COBOL count, maps to 0..count-1)
     * @param keys      sort key descriptors (order matters: primary key first)
     * @param allArrays every array that participates in the table (will be rearranged in tandem)
     */
    public static void sort(int count, SortKey[] keys, Object[] allArrays) {
        sort(count, keys, allArrays, (int[]) null);
    }

    /**
     * Sort parallel arrays in place with optional collation.
     *
     * @param collation null for native (ASCII) ordering, or "EBCDIC" for EBCDIC ordering
     */
    public static void sort(int count, SortKey[] keys, Object[] allArrays, String collation) {
        int[] col = null;
        if (collation != null && collation.equalsIgnoreCase("EBCDIC")) {
            col = EBCDIC_COLLATION;
        }
        sort(count, keys, allArrays, col);
    }

    /**
     * Sort parallel arrays in place with optional collation table.
     */
    public static void sort(int count, SortKey[] keys, Object[] allArrays, int[] collation) {
        if (count <= 1 || keys == null) return;

        // Clamp count to actual array lengths
        for (Object arr : allArrays) {
            int len = java.lang.reflect.Array.getLength(arr);
            if (len < count) count = len;
        }
        if (count <= 1) return;

        // Build an index array [0, 1, ..., count-1]
        Integer[] indices = new Integer[count];
        for (int i = 0; i < count; i++) indices[i] = i;

        // Sort the indices by comparing key arrays
        final int[] col = collation;
        Arrays.sort(indices, (a, b) -> {
            for (SortKey key : keys) {
                int cmp = compareElements(key.array, a, b, col);
                if (cmp != 0) return key.ascending ? cmp : -cmp;
            }
            return 0;
        });

        // Apply the permutation to all arrays
        applyPermutation(indices, allArrays);
    }

    /** Compare two elements from an array at positions a and b, with optional collation. */
    @SuppressWarnings("unchecked")
    private static int compareElements(Object array, int a, int b, int[] collation) {
        if (array instanceof int[]) {
            return Integer.compare(((int[]) array)[a], ((int[]) array)[b]);
        }
        if (array instanceof long[]) {
            return Long.compare(((long[]) array)[a], ((long[]) array)[b]);
        }
        if (array instanceof double[]) {
            return Double.compare(((double[]) array)[a], ((double[]) array)[b]);
        }
        if (array instanceof CobolString[]) {
            CobolString sa = ((CobolString[]) array)[a];
            CobolString sb = ((CobolString[]) array)[b];
            String va = sa != null ? sa.toString() : "";
            String vb = sb != null ? sb.toString() : "";
            return collation != null ? compareWithCollation(va, vb, collation) : va.compareTo(vb);
        }
        if (array instanceof String[]) {
            String sa = ((String[]) array)[a];
            String sb = ((String[]) array)[b];
            if (sa == null) sa = "";
            if (sb == null) sb = "";
            return collation != null ? compareWithCollation(sa, sb, collation) : sa.compareTo(sb);
        }
        if (array instanceof java.math.BigDecimal[]) {
            java.math.BigDecimal da = ((java.math.BigDecimal[]) array)[a];
            java.math.BigDecimal db = ((java.math.BigDecimal[]) array)[b];
            if (da == null) da = java.math.BigDecimal.ZERO;
            if (db == null) db = java.math.BigDecimal.ZERO;
            return da.compareTo(db);
        }
        // Fallback: convert to String
        Object va = java.lang.reflect.Array.get(array, a);
        Object vb = java.lang.reflect.Array.get(array, b);
        String sva = String.valueOf(va);
        String svb = String.valueOf(vb);
        return collation != null ? compareWithCollation(sva, svb, collation) : sva.compareTo(svb);
    }

    /** Compare two strings using a collation table. */
    private static int compareWithCollation(String a, String b, int[] collation) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            int ca = collation[a.charAt(i) & 0xFF];
            int cb = collation[b.charAt(i) & 0xFF];
            if (ca != cb) return ca - cb;
        }
        return a.length() - b.length();
    }

    /**
     * Apply an index permutation to all parallel arrays.
     * Uses a temporary copy approach (simple and correct).
     */
    private static void applyPermutation(Integer[] indices, Object[] allArrays) {
        int n = indices.length;
        for (Object arr : allArrays) {
            if (arr instanceof int[]) {
                int[] src = (int[]) arr;
                int[] tmp = new int[n];
                for (int i = 0; i < n; i++) tmp[i] = src[indices[i]];
                System.arraycopy(tmp, 0, src, 0, n);
            } else if (arr instanceof long[]) {
                long[] src = (long[]) arr;
                long[] tmp = new long[n];
                for (int i = 0; i < n; i++) tmp[i] = src[indices[i]];
                System.arraycopy(tmp, 0, src, 0, n);
            } else if (arr instanceof double[]) {
                double[] src = (double[]) arr;
                double[] tmp = new double[n];
                for (int i = 0; i < n; i++) tmp[i] = src[indices[i]];
                System.arraycopy(tmp, 0, src, 0, n);
            } else if (arr instanceof CobolString[]) {
                CobolString[] src = (CobolString[]) arr;
                CobolString[] tmp = new CobolString[n];
                for (int i = 0; i < n; i++) tmp[i] = src[indices[i]];
                System.arraycopy(tmp, 0, src, 0, n);
            } else if (arr instanceof String[]) {
                String[] src = (String[]) arr;
                String[] tmp = new String[n];
                for (int i = 0; i < n; i++) tmp[i] = src[indices[i]];
                System.arraycopy(tmp, 0, src, 0, n);
            } else if (arr instanceof java.math.BigDecimal[]) {
                java.math.BigDecimal[] src = (java.math.BigDecimal[]) arr;
                java.math.BigDecimal[] tmp = new java.math.BigDecimal[n];
                for (int i = 0; i < n; i++) tmp[i] = src[indices[i]];
                System.arraycopy(tmp, 0, src, 0, n);
            } else {
                // Generic reflective fallback
                Object tmp = java.lang.reflect.Array.newInstance(arr.getClass().getComponentType(), n);
                for (int i = 0; i < n; i++) java.lang.reflect.Array.set(tmp, i, java.lang.reflect.Array.get(arr, indices[i]));
                System.arraycopy(tmp, 0, arr, 0, n);
            }
        }
    }
}
