package com.lazarus.cobol.term;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Minimal VT100 / ANSI terminal emulator.
 *
 * Maintains a fixed-size character grid and processes a byte stream of CSI
 * control sequences typical of a curses-style COBOL screen program.
 *
 * Mirrors the Ironclad Python implementation (pyte.Screen + pyte.Stream) closely
 * enough that goldens captured with pyte match this emulator's output for the
 * COBOL screen tests we care about.
 *
 * Supported sequences (subset sufficient for COBOL SCREEN SECTION):
 *   - CSI {n} A/B/C/D       cursor up/down/right/left
 *   - CSI {row};{col} H     cursor position (1-based)
 *   - CSI {row};{col} f     cursor position alias
 *   - CSI {n} J             erase in display (0=below, 1=above, 2=all)
 *   - CSI {n} K             erase in line  (0=right, 1=left, 2=all)
 *   - CSI {n};{m}... m      SGR (color/attribute, parsed and discarded — text only)
 *   - CSI s / CSI u         save / restore cursor
 *   - CR (\r) → cursor col=0
 *   - LF (\n) → cursor row+1 (scroll if needed)
 *   - BS (\b) → cursor col-1
 *   - BEL (\x07) → ignored
 *   - TAB (\t) → next 8-col tab stop
 */
public class TerminalEmulator {
    public final int rows;
    public final int cols;
    private final char[][] grid;
    private int cursorRow = 0;
    private int cursorCol = 0;
    private int savedRow = 0;
    private int savedCol = 0;

    /** Snapshot of the screen at one point in time. */
    public static final class Snapshot {
        public final List<String> lines;
        public final int cursorRow;
        public final int cursorCol;
        Snapshot(List<String> lines, int r, int c) {
            this.lines = lines;
            this.cursorRow = r;
            this.cursorCol = c;
        }
        /** Full screen content with trailing whitespace per line stripped. */
        public String text() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lines.size(); i++) {
                if (i > 0) sb.append('\n');
                String l = lines.get(i);
                int end = l.length();
                while (end > 0 && (l.charAt(end - 1) == ' ' || l.charAt(end - 1) == '\0')) end--;
                sb.append(l, 0, end);
            }
            return sb.toString();
        }
        /** Non-empty lines only. */
        public String displayText() {
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (String l : lines) {
                int end = l.length();
                while (end > 0 && (l.charAt(end - 1) == ' ' || l.charAt(end - 1) == '\0')) end--;
                if (end == 0) continue;
                if (!first) sb.append('\n');
                first = false;
                sb.append(l, 0, end);
            }
            return sb.toString();
        }
        public int contentRowCount() {
            int n = 0;
            for (String l : lines) {
                int end = l.length();
                while (end > 0 && (l.charAt(end - 1) == ' ' || l.charAt(end - 1) == '\0')) end--;
                if (end > 0) n++;
            }
            return n;
        }
    }

    public TerminalEmulator() { this(25, 80); }

    public TerminalEmulator(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new char[rows][cols];
        reset();
    }

    public void reset() {
        for (int r = 0; r < rows; r++) Arrays.fill(grid[r], ' ');
        cursorRow = 0;
        cursorCol = 0;
        savedRow = 0;
        savedCol = 0;
    }

    /** Feed a byte stream (UTF-8 bytes) — interprets escape sequences and writes printable chars. */
    public void feed(byte[] data) {
        if (data == null) return;
        feed(new String(data, java.nio.charset.StandardCharsets.UTF_8));
    }

    /** Feed a string of input (escape sequences + printable chars). */
    public void feed(String input) {
        if (input == null) return;
        int n = input.length();
        int i = 0;
        while (i < n) {
            char c = input.charAt(i);
            if (c == 0x1b) {
                // ESC
                int consumed = handleEscape(input, i);
                if (consumed > 0) { i += consumed; continue; }
                i++;
                continue;
            }
            switch (c) {
                case '\r': cursorCol = 0; break;
                case '\n':
                    cursorRow++;
                    if (cursorRow >= rows) {
                        scrollUp();
                        cursorRow = rows - 1;
                    }
                    break;
                case '\b':
                    if (cursorCol > 0) cursorCol--;
                    break;
                case '\t':
                    cursorCol = ((cursorCol / 8) + 1) * 8;
                    if (cursorCol >= cols) cursorCol = cols - 1;
                    break;
                case 0x07:  // BEL — ignore
                    break;
                case '\f':
                    // Form feed → clear screen, home cursor (some COBOL impls)
                    for (int r = 0; r < rows; r++) Arrays.fill(grid[r], ' ');
                    cursorRow = 0;
                    cursorCol = 0;
                    break;
                default:
                    if (c >= 0x20) putChar(c);
            }
            i++;
        }
    }

    private void putChar(char c) {
        if (cursorCol >= cols) {
            cursorCol = 0;
            cursorRow++;
            if (cursorRow >= rows) {
                scrollUp();
                cursorRow = rows - 1;
            }
        }
        if (cursorRow >= 0 && cursorRow < rows && cursorCol >= 0 && cursorCol < cols) {
            grid[cursorRow][cursorCol] = c;
        }
        cursorCol++;
    }

    private void scrollUp() {
        for (int r = 1; r < rows; r++) System.arraycopy(grid[r], 0, grid[r - 1], 0, cols);
        Arrays.fill(grid[rows - 1], ' ');
    }

    /**
     * Handle an escape sequence starting at index `start` (which points at ESC).
     * Returns the number of characters consumed (including ESC); 0 if not handled.
     */
    private int handleEscape(String input, int start) {
        int n = input.length();
        if (start + 1 >= n) return 0;
        char next = input.charAt(start + 1);
        if (next == '[') {
            // CSI sequence: ESC [ params final
            int j = start + 2;
            // Optional '?' or '>' private params
            if (j < n && (input.charAt(j) == '?' || input.charAt(j) == '>')) j++;
            int paramsStart = j;
            while (j < n) {
                char ch = input.charAt(j);
                if ((ch >= 0x40 && ch <= 0x7E)) break; // final byte
                j++;
            }
            if (j >= n) return 0;
            String params = input.substring(paramsStart, j);
            char finalByte = input.charAt(j);
            csi(params, finalByte);
            return j - start + 1;
        }
        if (next == ']') {
            // OSC: terminated by BEL or ST. Consume up to BEL or ESC \
            int j = start + 2;
            while (j < n) {
                char ch = input.charAt(j);
                if (ch == 0x07) return j - start + 1;
                if (ch == 0x1b && j + 1 < n && input.charAt(j + 1) == '\\') return j - start + 2;
                j++;
            }
            return 0;
        }
        if (next == '7') { savedRow = cursorRow; savedCol = cursorCol; return 2; }
        if (next == '8') { cursorRow = savedRow; cursorCol = savedCol; return 2; }
        if (next == 'D') { // IND — index (cursor down, scroll if at bottom)
            cursorRow++;
            if (cursorRow >= rows) { scrollUp(); cursorRow = rows - 1; }
            return 2;
        }
        if (next == 'M') { // RI — reverse index
            cursorRow--;
            if (cursorRow < 0) cursorRow = 0;
            return 2;
        }
        if (next == 'E') { // NEL — next line
            cursorRow++;
            cursorCol = 0;
            if (cursorRow >= rows) { scrollUp(); cursorRow = rows - 1; }
            return 2;
        }
        if (next == '(' || next == ')') {
            // Charset designator: consume one more char
            return 3;
        }
        // Unknown escape — consume the ESC + 1 char
        return 2;
    }

    private int[] parseParams(String params) {
        if (params.isEmpty()) return new int[]{0};
        String[] parts = params.split(";", -1);
        int[] out = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            try {
                out[i] = parts[i].isEmpty() ? 0 : Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                out[i] = 0;
            }
        }
        return out;
    }

    private void csi(String params, char finalByte) {
        int[] p = parseParams(params);
        switch (finalByte) {
            case 'A': cursorRow -= Math.max(1, p[0]); if (cursorRow < 0) cursorRow = 0; break;
            case 'B': cursorRow += Math.max(1, p[0]); if (cursorRow >= rows) cursorRow = rows - 1; break;
            case 'C': cursorCol += Math.max(1, p[0]); if (cursorCol >= cols) cursorCol = cols - 1; break;
            case 'D': cursorCol -= Math.max(1, p[0]); if (cursorCol < 0) cursorCol = 0; break;
            case 'H':
            case 'f': {
                int r = p.length > 0 ? Math.max(1, p[0]) : 1;
                int c = p.length > 1 ? Math.max(1, p[1]) : 1;
                cursorRow = Math.min(r - 1, rows - 1);
                cursorCol = Math.min(c - 1, cols - 1);
                break;
            }
            case 'J': {
                int n = p[0];
                if (n == 0) {
                    // Erase from cursor to end of screen
                    for (int c = cursorCol; c < cols; c++) grid[cursorRow][c] = ' ';
                    for (int r = cursorRow + 1; r < rows; r++) Arrays.fill(grid[r], ' ');
                } else if (n == 1) {
                    // Erase from beginning to cursor
                    for (int r = 0; r < cursorRow; r++) Arrays.fill(grid[r], ' ');
                    for (int c = 0; c <= cursorCol && c < cols; c++) grid[cursorRow][c] = ' ';
                } else {
                    // Erase entire screen
                    for (int r = 0; r < rows; r++) Arrays.fill(grid[r], ' ');
                }
                break;
            }
            case 'K': {
                int n = p[0];
                if (n == 0) {
                    for (int c = cursorCol; c < cols; c++) grid[cursorRow][c] = ' ';
                } else if (n == 1) {
                    for (int c = 0; c <= cursorCol && c < cols; c++) grid[cursorRow][c] = ' ';
                } else {
                    Arrays.fill(grid[cursorRow], ' ');
                }
                break;
            }
            case 'm':
                // SGR — color/attribute. We only care about visible text content for goldens, ignore.
                break;
            case 's':
                savedRow = cursorRow;
                savedCol = cursorCol;
                break;
            case 'u':
                cursorRow = savedRow;
                cursorCol = savedCol;
                break;
            case 'G':
                cursorCol = Math.max(0, Math.min(cols - 1, Math.max(1, p[0]) - 1));
                break;
            case 'd':
                cursorRow = Math.max(0, Math.min(rows - 1, Math.max(1, p[0]) - 1));
                break;
            default:
                // Unknown CSI — ignore silently
                break;
        }
    }

    public Snapshot snapshot() {
        List<String> lines = new ArrayList<>(rows);
        for (int r = 0; r < rows; r++) lines.add(new String(grid[r]));
        return new Snapshot(lines, cursorRow, cursorCol);
    }

    /**
     * Feed bytes in chunks and return the snapshot whose row-content count is highest
     * (matches Ironclad's `capture_peak`).
     *
     * If multiple chunks tie for peak count, prefer the FIRST whose content rows persist
     * through all subsequent peak chunks (i.e. anchored — content didn't disappear later).
     */
    public static Snapshot capturePeak(byte[] raw, int rows, int cols, int chunkSize) {
        if (raw == null || raw.length == 0) {
            TerminalEmulator t = new TerminalEmulator(rows, cols);
            return t.snapshot();
        }
        TerminalEmulator term = new TerminalEmulator(rows, cols);
        String s = new String(raw, java.nio.charset.StandardCharsets.UTF_8);
        List<Snapshot> snapshots = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n; i += chunkSize) {
            String chunk = s.substring(i, Math.min(n, i + chunkSize));
            term.feed(chunk);
            Snapshot snap = term.snapshot();
            snapshots.add(snap);
            counts.add(snap.contentRowCount());
        }
        if (snapshots.isEmpty()) return term.snapshot();
        int peak = 0;
        for (int c : counts) if (c > peak) peak = c;
        if (peak == 0) return snapshots.get(0);
        // Find first peak chunk whose content rows are anchored through subsequent peak chunks
        List<Integer> peakIdx = new ArrayList<>();
        for (int i = 0; i < counts.size(); i++) if (counts.get(i) == peak) peakIdx.add(i);
        int chosen = peakIdx.get(0);
        outer:
        for (int idx : peakIdx) {
            Snapshot snap = snapshots.get(idx);
            int last = peakIdx.get(peakIdx.size() - 1);
            for (int r = 0; r < snap.lines.size(); r++) {
                String line = snap.lines.get(r);
                int end = line.length();
                while (end > 0 && (line.charAt(end - 1) == ' ' || line.charAt(end - 1) == '\0')) end--;
                if (end == 0) continue;
                // Check this row stays non-empty in some later peak chunk
                boolean anchored = false;
                for (int c : peakIdx) {
                    if (c < idx) continue;
                    if (c == idx) continue;
                    if (c > last) break;
                    Snapshot s2 = snapshots.get(c);
                    if (r < s2.lines.size()) {
                        String l2 = s2.lines.get(r);
                        int e2 = l2.length();
                        while (e2 > 0 && (l2.charAt(e2 - 1) == ' ' || l2.charAt(e2 - 1) == '\0')) e2--;
                        if (e2 > 0) { anchored = true; break; }
                    }
                }
                if (!anchored) {
                    // Maybe r persists from idx through last peak chunk
                    boolean persisted = true;
                    for (int c = idx; c <= last; c++) {
                        Snapshot s2 = snapshots.get(c);
                        if (r >= s2.lines.size()) { persisted = false; break; }
                        String l2 = s2.lines.get(r);
                        int e2 = l2.length();
                        while (e2 > 0 && (l2.charAt(e2 - 1) == ' ' || l2.charAt(e2 - 1) == '\0')) e2--;
                        if (e2 == 0) { persisted = false; break; }
                    }
                    if (!persisted) continue outer;
                }
            }
            chosen = idx;
            break;
        }
        return snapshots.get(chosen);
    }
}
