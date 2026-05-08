package com.lazarus.cobol.cics;

import java.util.ArrayList;
import java.util.List;

/**
 * CICS Temporary Storage Queue (TSQ).
 * Supports random access by item number (1-based), sequential read (NEXT),
 * and update by item number.
 *
 * TSQ can be:
 * - MAIN: in-memory only, session-scoped (auto-deleted when session ends)
 * - AUXILIARY: backed by persistent storage (future: database table)
 *
 * Items are stored as byte arrays. NUMITEMS returns the current count.
 * READQ TS with ITEM(n) reads item n. READQ TS NEXT reads the next item
 * sequentially from the current position.
 */
public class CicsTSQueue {
    private final String name;
    private final boolean auxiliary;
    private final List<byte[]> items = new ArrayList<>();
    private int readPosition = 0; // for NEXT reads (0-based)

    public CicsTSQueue(String name, boolean auxiliary) {
        this.name = name;
        this.auxiliary = auxiliary;
    }

    public String getName() { return name; }
    public boolean isAuxiliary() { return auxiliary; }
    public int getNumItems() { return items.size(); }

    /**
     * WRITEQ TS — write (append) or update an item.
     * If itemNumber <= 0, appends a new item and returns the item number.
     * If itemNumber > 0 and REWRITE, updates existing item.
     *
     * @param data the data to write
     * @param itemNumber 0 for append, >0 for rewrite at position
     * @param rewrite true if updating existing item
     * @return item number of the written item (1-based)
     */
    public int writeItem(byte[] data, int itemNumber, boolean rewrite) {
        if (rewrite && itemNumber > 0 && itemNumber <= items.size()) {
            // Update existing item
            items.set(itemNumber - 1, data.clone());
            return itemNumber;
        }
        // Append new item
        items.add(data.clone());
        return items.size();
    }

    /**
     * READQ TS — read by item number (1-based) or NEXT.
     *
     * @param itemNumber 1-based item number, or 0 for NEXT
     * @return the item data, or null if not found
     */
    public byte[] readItem(int itemNumber) {
        if (itemNumber > 0) {
            // Random access by item number
            if (itemNumber > items.size()) return null;
            readPosition = itemNumber; // set position for subsequent NEXT
            return items.get(itemNumber - 1).clone();
        }
        // NEXT — sequential read
        if (readPosition >= items.size()) return null;
        byte[] data = items.get(readPosition).clone();
        readPosition++;
        return data;
    }

    /** Reset read position to start (for re-reading from beginning) */
    public void resetPosition() {
        readPosition = 0;
    }

    /** Get current read position (1-based) */
    public int getPosition() {
        return readPosition + 1;
    }

    /** Delete all items */
    public void deleteAll() {
        items.clear();
        readPosition = 0;
    }
}
