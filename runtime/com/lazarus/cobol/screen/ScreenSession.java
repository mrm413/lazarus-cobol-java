package com.lazarus.cobol.screen;

import com.lazarus.cobol.cics.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * Screen Session — manages 3270 terminal sessions for translated CICS programs.
 *
 * Each session represents one user's terminal connection:
 * - Holds the current screen state (map + field values)
 * - Queues input from web client for RECEIVE MAP
 * - Queues output from program for SEND MAP
 * - Tracks AID key presses (ENTER, PF1-PF24, CLEAR, PA1-PA3)
 *
 * Thread model:
 * - Web client thread: calls submitInput(), getScreen()
 * - CICS program thread: calls sendMap(), receiveMap()
 * - BlockingQueue bridges the two threads
 */
public class ScreenSession {

    /** AID key codes matching CICS EIBAID values */
    public static final String AID_ENTER = "ENTER";
    public static final String AID_CLEAR = "CLEAR";
    public static final String AID_PA1   = "PA1";
    public static final String AID_PA2   = "PA2";
    public static final String AID_PA3   = "PA3";
    public static final String AID_PF1   = "PF1";
    public static final String AID_PF2   = "PF2";
    public static final String AID_PF3   = "PF3";
    public static final String AID_PF4   = "PF4";
    public static final String AID_PF5   = "PF5";
    public static final String AID_PF6   = "PF6";
    public static final String AID_PF7   = "PF7";
    public static final String AID_PF8   = "PF8";
    public static final String AID_PF9   = "PF9";
    public static final String AID_PF10  = "PF10";
    public static final String AID_PF11  = "PF11";
    public static final String AID_PF12  = "PF12";

    private final String sessionId;
    private final Map<String, CicsMap> mapRegistry = new ConcurrentHashMap<>();

    // Current screen state
    private volatile CicsMap currentMap;
    private volatile String lastAid = AID_ENTER;

    // Input queue: web client → CICS program
    private final BlockingQueue<InputEvent> inputQueue = new LinkedBlockingQueue<>();
    // Output queue: CICS program → web client
    private final BlockingQueue<String> outputQueue = new LinkedBlockingQueue<>();

    // Session state
    private volatile boolean active = true;
    private volatile String statusMessage = "";

    public ScreenSession(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() { return sessionId; }
    public boolean isActive() { return active; }
    public void close() { active = false; }

    // --- Map Registry ---

    /** Register a compiled BMS map */
    public void registerMap(String mapsetName, String mapName, CicsMap map) {
        mapRegistry.put(key(mapsetName, mapName), map);
    }

    /** Get a registered map */
    public CicsMap getMap(String mapsetName, String mapName) {
        return mapRegistry.get(key(mapsetName, mapName));
    }

    private String key(String mapset, String map) {
        return (mapset + "." + map).toUpperCase();
    }

    // --- Program-side operations (called by CICS task) ---

    /**
     * SEND MAP — push screen to web client.
     * Called by translated CICS program via CicsTask.
     */
    public void sendMap(CicsMap map) {
        this.currentMap = map;
        String json = map.toJson();
        outputQueue.offer(json);
    }

    /**
     * RECEIVE MAP — wait for input from web client.
     * Blocks until user submits input (presses ENTER/PF key).
     * Returns the AID key that was pressed.
     */
    public String receiveMap(CicsMap map, long timeoutMs) {
        try {
            InputEvent event = inputQueue.poll(timeoutMs, TimeUnit.MILLISECONDS);
            if (event == null) return null; // timeout

            // Apply field values to map
            map.fromInput(event.fieldValues);
            this.lastAid = event.aid;
            return event.aid;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /**
     * RECEIVE MAP — with default 5-minute timeout.
     */
    public String receiveMap(CicsMap map) {
        return receiveMap(map, 300_000);
    }

    // --- Web client operations ---

    /**
     * Submit input from web client (ENTER/PF key press with field values).
     * Called by the screen server HTTP handler.
     */
    public void submitInput(String aid, Map<String, String> fieldValues) {
        inputQueue.offer(new InputEvent(aid, fieldValues));
    }

    /**
     * Get the current screen state as JSON for the web client.
     * Non-blocking: returns immediately with current screen or null.
     */
    public String getScreen() {
        return outputQueue.poll();
    }

    /**
     * Get the current screen state, waiting up to timeout.
     */
    public String getScreen(long timeoutMs) {
        try {
            return outputQueue.poll(timeoutMs, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /**
     * Get the current map's JSON without consuming from queue.
     */
    public String getCurrentScreenJson() {
        return currentMap != null ? currentMap.toJson() : null;
    }

    /** Get last AID key pressed */
    public String getLastAid() { return lastAid; }

    /** Set status message for web client */
    public void setStatusMessage(String msg) { this.statusMessage = msg; }
    public String getStatusMessage() { return statusMessage; }

    // --- Standalone ScreenField management (independent of CicsMap) ---

    // Standalone fields for direct screen building without BMS/CicsMap
    private final Map<String, ScreenField> standaloneFields = new LinkedHashMap<>();
    private int cursorRow = 0, cursorCol = 0;
    private boolean eraseFlag = false;
    private String currentMapset = "";
    private String currentMapName = "";

    // AID key constants (numeric codes matching 3270 protocol)
    public static final int AID_ENTER_CODE = 0x7D;
    public static final int AID_CLEAR_CODE = 0x6D;
    public static final int AID_PA1_CODE = 0x6C;
    public static final int AID_PA2_CODE = 0x6E;
    public static final int AID_PA3_CODE = 0x6B;
    public static final int AID_PF1_CODE  = 0xF1;
    public static final int AID_PF2_CODE  = 0xF2;
    public static final int AID_PF3_CODE  = 0xF3;
    public static final int AID_PF4_CODE  = 0xF4;
    public static final int AID_PF5_CODE  = 0xF5;
    public static final int AID_PF6_CODE  = 0xF6;
    public static final int AID_PF7_CODE  = 0xF7;
    public static final int AID_PF8_CODE  = 0xF8;
    public static final int AID_PF9_CODE  = 0xF9;
    public static final int AID_PF10_CODE = 0x7A;
    public static final int AID_PF11_CODE = 0x7B;
    public static final int AID_PF12_CODE = 0x7C;
    public static final int AID_PF13_CODE = 0xC1;
    public static final int AID_PF14_CODE = 0xC2;
    public static final int AID_PF15_CODE = 0xC3;
    public static final int AID_PF16_CODE = 0xC4;
    public static final int AID_PF17_CODE = 0xC5;
    public static final int AID_PF18_CODE = 0xC6;
    public static final int AID_PF19_CODE = 0xC7;
    public static final int AID_PF20_CODE = 0xC8;
    public static final int AID_PF21_CODE = 0xC9;
    public static final int AID_PF22_CODE = 0x4A;
    public static final int AID_PF23_CODE = 0x4B;
    public static final int AID_PF24_CODE = 0x4C;

    private int aidKeyCode = AID_ENTER_CODE;

    /**
     * Define a standalone field (independent of CicsMap).
     * For building screens directly without BMS compilation.
     */
    public void defineField(String name, int row, int col, int length,
                            boolean input, String initialValue) {
        ScreenField field = new ScreenField(name, row, col, length, input, initialValue);
        standaloneFields.put(name.toUpperCase(), field);
    }

    /** Set a standalone field's value */
    public void setStandaloneFieldValue(String name, String value) {
        ScreenField f = standaloneFields.get(name.toUpperCase());
        if (f != null) f.setValue(value);
    }

    /** Get a standalone field's value */
    public String getStandaloneFieldValue(String name) {
        ScreenField f = standaloneFields.get(name.toUpperCase());
        return f != null ? f.getValue() : null;
    }

    /** Set a standalone field's attribute byte */
    public void setStandaloneFieldAttribute(String name, int attr) {
        ScreenField f = standaloneFields.get(name.toUpperCase());
        if (f != null) f.setAttribute(attr);
    }

    /** Check if a standalone field has been modified */
    public boolean isStandaloneFieldModified(String name) {
        ScreenField f = standaloneFields.get(name.toUpperCase());
        return f != null && f.isModified();
    }

    /** Get all standalone fields */
    public Map<String, ScreenField> getStandaloneFields() {
        return Collections.unmodifiableMap(standaloneFields);
    }

    /** Get a standalone field by name */
    public ScreenField getStandaloneField(String name) {
        return standaloneFields.get(name.toUpperCase());
    }

    // Cursor management
    public void setCursorPosition(int row, int col) { this.cursorRow = row; this.cursorCol = col; }
    public int getCursorRow() { return cursorRow; }
    public int getCursorCol() { return cursorCol; }

    // AID key code (numeric)
    public void setAidKeyCode(int aid) { this.aidKeyCode = aid; }
    public int getAidKeyCode() { return aidKeyCode; }

    // Screen state
    public void eraseScreen() {
        standaloneFields.clear();
        cursorRow = 0;
        cursorCol = 0;
        eraseFlag = true;
    }
    public boolean isEraseFlag() { return eraseFlag; }
    public void clearEraseFlag() { eraseFlag = false; }

    public void setMapInfo(String mapset, String map) {
        this.currentMapset = mapset;
        this.currentMapName = map;
    }
    public String getCurrentMapset() { return currentMapset; }
    public String getCurrentMapName() { return currentMapName; }

    // --- ScreenField inner class ---

    /**
     * ScreenField — standalone field definition for 3270 screen emulation.
     * Includes name, position, length, value, attribute byte, input flag, and MDT.
     */
    public static class ScreenField {
        private final String name;
        private final int row;
        private final int col;
        private final int length;
        private String value;
        private int attribute;       // 3270 attribute byte
        private final boolean inputField;
        private boolean modified;    // Modified Data Tag (MDT)

        // Attribute byte flags
        public static final int ATTR_PROTECTED = 0x20;
        public static final int ATTR_NUMERIC   = 0x10;
        public static final int ATTR_BRIGHT    = 0x08;
        public static final int ATTR_DARK      = 0x0C;
        public static final int ATTR_MDT       = 0x01;
        public static final int ATTR_AUTOSKIP  = 0x30;  // PROT + NUMERIC

        public ScreenField(String name, int row, int col, int length,
                           boolean inputField, String initialValue) {
            this.name = name;
            this.row = row;
            this.col = col;
            this.length = length;
            this.inputField = inputField;
            this.value = initialValue != null ? initialValue : "";
            this.attribute = inputField ? 0 : ATTR_PROTECTED;
            this.modified = false;
        }

        public String getName() { return name; }
        public int getRow() { return row; }
        public int getCol() { return col; }
        public int getLength() { return length; }
        public boolean isInputField() { return inputField; }

        public String getValue() { return value; }
        public void setValue(String value) {
            this.value = value != null ? value : "";
            this.modified = true;
        }

        public int getAttribute() { return attribute; }
        public void setAttribute(int attr) { this.attribute = attr; }

        public boolean isModified() { return modified; }
        public void setModified(boolean mdt) { this.modified = mdt; }
        public void clearModified() { this.modified = false; }

        public boolean isProtected() { return (attribute & ATTR_PROTECTED) != 0; }
        public boolean isNumeric()   { return (attribute & ATTR_NUMERIC) != 0; }
        public boolean isBright()    { return (attribute & 0x0C) == ATTR_BRIGHT; }
        public boolean isDark()      { return (attribute & 0x0C) == ATTR_DARK; }
    }

    // --- Input event ---

    private static class InputEvent {
        final String aid;
        final Map<String, String> fieldValues;

        InputEvent(String aid, Map<String, String> fieldValues) {
            this.aid = aid;
            this.fieldValues = fieldValues != null ? fieldValues : Collections.<String, String>emptyMap();
        }
    }
}
