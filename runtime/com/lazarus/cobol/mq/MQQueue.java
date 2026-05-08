package com.lazarus.cobol.mq;

import java.util.*;
import java.util.concurrent.*;

/**
 * MQ Queue — a named message queue with get/put/browse operations.
 *
 * Supports:
 *   - FIFO ordering (default) or priority ordering
 *   - Browse without removing messages
 *   - Get by message ID or correlation ID
 *   - Queue depth limits
 *   - Trigger settings (trigger on first, every, depth threshold)
 *   - Open modes: INPUT, OUTPUT, BROWSE, INQUIRE
 */
public class MQQueue {

    // Open options
    public static final int MQOO_INPUT_SHARED    = 0x01;
    public static final int MQOO_INPUT_EXCLUSIVE = 0x02;
    public static final int MQOO_OUTPUT          = 0x04;
    public static final int MQOO_BROWSE          = 0x08;
    public static final int MQOO_INQUIRE         = 0x10;
    public static final int MQOO_SET             = 0x20;

    // Get match options
    public static final int MQMO_MATCH_MSG_ID    = 0x01;
    public static final int MQMO_MATCH_CORREL_ID = 0x02;

    private final String queueName;
    private final LinkedList<MQMessage> messages = new LinkedList<>();
    private int maxDepth = 5000;
    private boolean inhibitPut = false;
    private boolean inhibitGet = false;
    private int triggerType = 0; // 0=none, 1=first, 2=every, 3=depth
    private int triggerDepth = 1;
    private String triggerData = "";
    private long totalPut = 0;
    private long totalGet = 0;

    // Browse cursor per opener
    private final Map<String, Integer> browseCursors = new ConcurrentHashMap<>();

    public MQQueue(String name) {
        this.queueName = name.toUpperCase().trim();
    }

    public String getQueueName() { return queueName; }
    public int getMaxDepth() { return maxDepth; }
    public void setMaxDepth(int d) { this.maxDepth = d; }
    public boolean isInhibitPut() { return inhibitPut; }
    public void setInhibitPut(boolean b) { this.inhibitPut = b; }
    public boolean isInhibitGet() { return inhibitGet; }
    public void setInhibitGet(boolean b) { this.inhibitGet = b; }
    public int getTriggerType() { return triggerType; }
    public void setTriggerType(int t) { this.triggerType = t; }

    /** Current queue depth */
    public synchronized int getCurrentDepth() {
        return messages.size();
    }

    /** Total messages put since creation */
    public long getTotalPut() { return totalPut; }
    /** Total messages gotten since creation */
    public long getTotalGet() { return totalGet; }

    /**
     * Put a message on the queue.
     * @return 0=OK, 2053=MQRC_Q_FULL, 2051=MQRC_PUT_INHIBITED
     */
    public synchronized int put(MQMessage msg) {
        if (inhibitPut) return 2051; // MQRC_PUT_INHIBITED
        if (messages.size() >= maxDepth) return 2053; // MQRC_Q_FULL
        messages.addLast(msg);
        totalPut++;
        return 0;
    }

    /**
     * Get (remove) a message from the queue.
     * @param matchOptions MQMO_MATCH_MSG_ID, MQMO_MATCH_CORREL_ID, or 0
     * @param matchId the ID to match (messageId or correlId)
     * @return the message, or null if not found
     */
    public synchronized MQMessage get(int matchOptions, String matchId) {
        if (inhibitGet) return null;

        // Remove expired messages first
        purgeExpired();

        if (matchOptions == 0 || matchId == null || matchId.isEmpty()) {
            // FIFO get
            if (messages.isEmpty()) return null;
            totalGet++;
            return messages.removeFirst();
        }

        // Match by message ID or correlation ID
        Iterator<MQMessage> it = messages.iterator();
        while (it.hasNext()) {
            MQMessage msg = it.next();
            boolean match = false;
            if ((matchOptions & MQMO_MATCH_MSG_ID) != 0 && matchId.equals(msg.getMessageId())) {
                match = true;
            }
            if ((matchOptions & MQMO_MATCH_CORREL_ID) != 0 && matchId.equals(msg.getCorrelId())) {
                match = true;
            }
            if (match) {
                it.remove();
                totalGet++;
                return msg;
            }
        }
        return null;
    }

    /** Get with wait (blocking) */
    public MQMessage get(int matchOptions, String matchId, long waitMs) {
        long deadline = System.currentTimeMillis() + waitMs;
        while (System.currentTimeMillis() < deadline) {
            MQMessage msg = get(matchOptions, matchId);
            if (msg != null) return msg;
            try { Thread.sleep(Math.min(50, deadline - System.currentTimeMillis())); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); return null; }
        }
        return null;
    }

    /**
     * Browse (peek) at messages without removing them.
     * @param browserId unique identifier for this browse session
     * @param reset true to reset browse cursor to beginning
     * @return next message in browse sequence, or null
     */
    public synchronized MQMessage browse(String browserId, boolean reset) {
        if (reset) {
            browseCursors.put(browserId, 0);
        }
        int cursor = browseCursors.getOrDefault(browserId, 0);
        purgeExpired();
        if (cursor >= messages.size()) return null;
        MQMessage msg = messages.get(cursor);
        browseCursors.put(browserId, cursor + 1);
        return msg.copy();
    }

    /** End a browse session */
    public void endBrowse(String browserId) {
        browseCursors.remove(browserId);
    }

    /** Purge expired messages */
    private void purgeExpired() {
        messages.removeIf(MQMessage::isExpired);
    }

    /** Clear all messages */
    public synchronized void clear() {
        messages.clear();
    }
}
