package com.lazarus.cobol.cics;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * CICS Transient Data Queue (TDQ).
 * One-way sequential access (no random access like TSQ).
 *
 * Types:
 * - INTRAPARTITION: in-memory, supports triggers
 * - EXTRAPARTITION: backed by file/database (future)
 *
 * Triggers:
 * - EVERY_ITEM: fire trigger for every item written
 * - AT_COUNT(n): fire when item count reaches n (then reset)
 * - AT_FIRST: fire on first item only
 *
 * READQ TD is destructive — items are dequeued on read.
 */
public class CicsTDQueue {
    public enum TriggerType { NONE, EVERY_ITEM, AT_COUNT, AT_FIRST }

    private final String name;
    private final boolean intrapartition;
    private final Deque<byte[]> items = new ArrayDeque<>();

    // Trigger configuration
    private TriggerType triggerType = TriggerType.NONE;
    private int triggerCount = 0;
    private String triggerTransid = null;
    private Runnable triggerAction = null;
    private int itemsSinceReset = 0;
    private boolean firstItemSeen = false;

    public CicsTDQueue(String name, boolean intrapartition) {
        this.name = name;
        this.intrapartition = intrapartition;
    }

    public String getName() { return name; }
    public boolean isIntrapartition() { return intrapartition; }
    public int getDepth() { return items.size(); }

    // --- Trigger configuration ---

    public void setTrigger(TriggerType type, int count, String transid, Runnable action) {
        this.triggerType = type;
        this.triggerCount = count;
        this.triggerTransid = transid;
        this.triggerAction = action;
        this.itemsSinceReset = 0;
        this.firstItemSeen = false;
    }

    // --- Queue operations ---

    /**
     * WRITEQ TD — write an item to the queue.
     * May fire trigger based on configuration.
     *
     * @param data the data to enqueue
     */
    public void writeItem(byte[] data) {
        items.addLast(data.clone());
        itemsSinceReset++;

        // Check trigger conditions
        switch (triggerType) {
            case EVERY_ITEM:
                fireTrigger();
                break;
            case AT_COUNT:
                if (itemsSinceReset >= triggerCount) {
                    fireTrigger();
                    itemsSinceReset = 0;
                }
                break;
            case AT_FIRST:
                if (!firstItemSeen) {
                    firstItemSeen = true;
                    fireTrigger();
                }
                break;
            default:
                break;
        }
    }

    /**
     * READQ TD — destructive read (dequeue).
     *
     * @return the next item, or null if queue is empty
     */
    public byte[] readItem() {
        if (items.isEmpty()) return null;
        return items.pollFirst();
    }

    /** DELETEQ TD — purge the queue */
    public void deleteAll() {
        items.clear();
        itemsSinceReset = 0;
    }

    private void fireTrigger() {
        if (triggerAction != null) {
            try {
                triggerAction.run();
            } catch (Exception e) {
                System.err.println("TDQ trigger error for " + name + ": " + e.getMessage());
            }
        }
    }
}
