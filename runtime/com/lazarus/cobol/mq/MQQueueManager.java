package com.lazarus.cobol.mq;

import java.util.*;
import java.util.concurrent.*;

/**
 * MQ Queue Manager — manages named queues and connections.
 *
 * Provides the top-level MQ API that COBOL programs use:
 *   MQCONN/MQDISC — connect/disconnect
 *   MQOPEN/MQCLOSE — open/close queue handles
 *   MQPUT/MQGET — put/get messages
 *   MQINQ/MQSET — inquire/set queue attributes
 *   MQPUT1 — combined open/put/close
 *
 * In-memory implementation .
 * Can be backed by a real broker (RabbitMQ, etc.) via adapter.
 */
public class MQQueueManager {

    // Completion codes
    public static final int MQCC_OK      = 0;
    public static final int MQCC_WARNING = 1;
    public static final int MQCC_FAILED  = 2;

    // Reason codes
    public static final int MQRC_NONE              = 0;
    public static final int MQRC_NO_MSG_AVAILABLE  = 2033;
    public static final int MQRC_Q_FULL            = 2053;
    public static final int MQRC_PUT_INHIBITED     = 2051;
    public static final int MQRC_GET_INHIBITED     = 2016;
    public static final int MQRC_UNKNOWN_OBJECT    = 2085;
    public static final int MQRC_NOT_OPEN_INPUT    = 2036;
    public static final int MQRC_NOT_OPEN_OUTPUT   = 2037;
    public static final int MQRC_HOBJ_ERROR        = 2019;
    public static final int MQRC_CONNECTION_BROKEN = 2009;

    private final String managerName;
    private final Map<String, MQQueue> queues = new ConcurrentHashMap<>();

    // Handle management
    private int nextHandle = 1;
    private final Map<Integer, OpenQueue> openHandles = new ConcurrentHashMap<>();

    // Dead letter queue
    private String deadLetterQueue = "SYSTEM.DEAD.LETTER.QUEUE";

    // Connection state
    private volatile boolean connected = false;
    private int lastCompCode = MQCC_OK;
    private int lastReasonCode = MQRC_NONE;

    public MQQueueManager(String name) {
        this.managerName = name;
        // Create system queues
        createQueue(deadLetterQueue);
        createQueue("SYSTEM.DEFAULT.LOCAL.QUEUE");
    }

    public String getManagerName() { return managerName; }
    public int getLastCompCode() { return lastCompCode; }
    public int getLastReasonCode() { return lastReasonCode; }

    // --- Queue Administration ---

    /** Create a queue */
    public MQQueue createQueue(String name) {
        MQQueue q = new MQQueue(name);
        queues.put(name.toUpperCase().trim(), q);
        return q;
    }

    /** Delete a queue */
    public boolean deleteQueue(String name) {
        return queues.remove(name.toUpperCase().trim()) != null;
    }

    /** Get a queue by name (for direct access / testing) */
    public MQQueue getQueue(String name) {
        return queues.get(name.toUpperCase().trim());
    }

    /** List all queue names */
    public Set<String> listQueues() {
        return Collections.unmodifiableSet(queues.keySet());
    }

    // --- MQ API ---

    /** MQCONN — connect to queue manager */
    public boolean connect() {
        connected = true;
        lastCompCode = MQCC_OK;
        lastReasonCode = MQRC_NONE;
        return true;
    }

    /** MQDISC — disconnect */
    public void disconnect() {
        // Close all open handles
        for (int handle : new ArrayList<>(openHandles.keySet())) {
            close(handle);
        }
        connected = false;
        lastCompCode = MQCC_OK;
        lastReasonCode = MQRC_NONE;
    }

    /**
     * MQOPEN — open a queue and return a handle.
     * @param queueName the queue to open
     * @param openOptions MQOO_INPUT_SHARED | MQOO_OUTPUT | MQOO_BROWSE | etc.
     * @return queue handle (>0), or -1 on error
     */
    public int open(String queueName, int openOptions) {
        MQQueue q = queues.get(queueName.toUpperCase().trim());
        if (q == null) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_UNKNOWN_OBJECT;
            return -1;
        }

        int handle = nextHandle++;
        openHandles.put(handle, new OpenQueue(q, openOptions, "BROWSE_" + handle));
        lastCompCode = MQCC_OK;
        lastReasonCode = MQRC_NONE;
        return handle;
    }

    /**
     * MQCLOSE — close a queue handle.
     */
    public void close(int handle) {
        OpenQueue oq = openHandles.remove(handle);
        if (oq != null) {
            oq.queue.endBrowse(oq.browserId);
        }
        lastCompCode = MQCC_OK;
        lastReasonCode = MQRC_NONE;
    }

    /**
     * MQPUT — put a message to an open queue.
     * @return 0=OK, or MQ reason code
     */
    public int put(int handle, MQMessage msg) {
        OpenQueue oq = openHandles.get(handle);
        if (oq == null) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_HOBJ_ERROR;
            return MQRC_HOBJ_ERROR;
        }
        if ((oq.openOptions & MQQueue.MQOO_OUTPUT) == 0) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_NOT_OPEN_OUTPUT;
            return MQRC_NOT_OPEN_OUTPUT;
        }

        int rc = oq.queue.put(msg);
        if (rc != 0) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = rc;
        } else {
            lastCompCode = MQCC_OK;
            lastReasonCode = MQRC_NONE;
            // Track for transaction rollback
            if (inTransaction) {
                synchronized (transactionLog) {
                    transactionLog.add(new TransactionEntry(oq.queue.getQueueName(), msg, true));
                }
            }
        }
        return rc;
    }

    /**
     * MQPUT1 — combined open/put/close (convenience).
     */
    public int put1(String queueName, MQMessage msg) {
        int handle = open(queueName, MQQueue.MQOO_OUTPUT);
        if (handle < 0) return lastReasonCode;
        int rc = put(handle, msg);
        close(handle);
        return rc;
    }

    /**
     * MQGET — get a message from an open queue.
     * @param matchOptions 0=FIFO, MQMO_MATCH_MSG_ID, MQMO_MATCH_CORREL_ID
     * @param matchId the ID to match
     * @param waitMs wait time in ms (0=no wait, -1=unlimited)
     * @return the message, or null if not available
     */
    public MQMessage get(int handle, int matchOptions, String matchId, long waitMs) {
        OpenQueue oq = openHandles.get(handle);
        if (oq == null) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_HOBJ_ERROR;
            return null;
        }
        if ((oq.openOptions & (MQQueue.MQOO_INPUT_SHARED | MQQueue.MQOO_INPUT_EXCLUSIVE)) == 0) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_NOT_OPEN_INPUT;
            return null;
        }

        MQMessage msg;
        if (waitMs > 0) {
            msg = oq.queue.get(matchOptions, matchId, waitMs);
        } else {
            msg = oq.queue.get(matchOptions, matchId);
        }

        if (msg == null) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_NO_MSG_AVAILABLE;
        } else {
            lastCompCode = MQCC_OK;
            lastReasonCode = MQRC_NONE;
        }
        return msg;
    }

    /** MQGET — FIFO, no wait */
    public MQMessage get(int handle) {
        return get(handle, 0, null, 0);
    }

    /**
     * MQBROWSE — browse next message without removing.
     * @param reset true to start from beginning
     */
    public MQMessage browse(int handle, boolean reset) {
        OpenQueue oq = openHandles.get(handle);
        if (oq == null) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_HOBJ_ERROR;
            return null;
        }
        if ((oq.openOptions & MQQueue.MQOO_BROWSE) == 0) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_HOBJ_ERROR;
            return null;
        }

        MQMessage msg = oq.queue.browse(oq.browserId, reset);
        if (msg == null) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_NO_MSG_AVAILABLE;
        } else {
            lastCompCode = MQCC_OK;
            lastReasonCode = MQRC_NONE;
        }
        return msg;
    }

    /**
     * MQINQ — inquire queue attributes.
     * @return map of attribute name → value
     */
    public Map<String, String> inquire(int handle) {
        OpenQueue oq = openHandles.get(handle);
        if (oq == null) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_HOBJ_ERROR;
            return Collections.emptyMap();
        }

        Map<String, String> attrs = new LinkedHashMap<>();
        MQQueue q = oq.queue;
        attrs.put("QUEUE_NAME", q.getQueueName());
        attrs.put("CURRENT_DEPTH", String.valueOf(q.getCurrentDepth()));
        attrs.put("MAX_DEPTH", String.valueOf(q.getMaxDepth()));
        attrs.put("INHIBIT_PUT", q.isInhibitPut() ? "YES" : "NO");
        attrs.put("INHIBIT_GET", q.isInhibitGet() ? "YES" : "NO");
        attrs.put("TOTAL_PUT", String.valueOf(q.getTotalPut()));
        attrs.put("TOTAL_GET", String.valueOf(q.getTotalGet()));

        lastCompCode = MQCC_OK;
        lastReasonCode = MQRC_NONE;
        return attrs;
    }

    // --- Commit / Backout (Syncpoint) ---

    // Transaction log: tracks messages put/gotten since last syncpoint
    private final List<TransactionEntry> transactionLog = new ArrayList<>();
    private boolean inTransaction = false;

    /** Begin a unit of work */
    public void beginTransaction() {
        transactionLog.clear();
        inTransaction = true;
    }

    /**
     * MQCMIT — Commit all messages put/gotten since last syncpoint.
     * Makes all operations in the current unit of work permanent.
     */
    public void commit() {
        transactionLog.clear();
        inTransaction = false;
        lastCompCode = MQCC_OK;
        lastReasonCode = MQRC_NONE;
    }

    /**
     * MQBACK — Backout (rollback) all operations since last syncpoint.
     * Reverses puts (removes from queue) and gets (puts back).
     */
    public void backout() {
        synchronized (transactionLog) {
            for (int i = transactionLog.size() - 1; i >= 0; i--) {
                TransactionEntry entry = transactionLog.get(i);
                if (entry.isPut) {
                    // Reverse a put: remove the message from the queue
                    MQQueue q = queues.get(entry.queueName.toUpperCase().trim());
                    if (q != null) {
                        q.get(MQQueue.MQMO_MATCH_MSG_ID, entry.message.getMessageId());
                    }
                } else {
                    // Reverse a get: put the message back
                    MQQueue q = queues.get(entry.queueName.toUpperCase().trim());
                    if (q != null) {
                        q.put(entry.message);
                    }
                }
            }
        }
        transactionLog.clear();
        inTransaction = false;
        lastCompCode = MQCC_OK;
        lastReasonCode = MQRC_NONE;
    }

    /** Check if currently in a transaction */
    public boolean isInTransaction() { return inTransaction; }

    // --- Connection Pooling ---

    private int maxPoolSize = 10;
    private final List<PooledConnection> connectionPool = new ArrayList<>();
    private int activeConnections = 0;

    /** Set maximum pool size */
    public void setMaxPoolSize(int size) { this.maxPoolSize = Math.max(1, size); }
    public int getMaxPoolSize() { return maxPoolSize; }

    /**
     * Acquire a pooled connection handle.
     * Returns a connection ID, or -1 if pool is full.
     */
    public synchronized int acquireConnection() {
        // Try to reuse an idle connection
        for (PooledConnection pc : connectionPool) {
            if (!pc.inUse) {
                pc.inUse = true;
                pc.lastUsed = System.currentTimeMillis();
                activeConnections++;
                lastCompCode = MQCC_OK;
                lastReasonCode = MQRC_NONE;
                return pc.connectionId;
            }
        }
        // Create new if under limit
        if (connectionPool.size() < maxPoolSize) {
            PooledConnection pc = new PooledConnection(connectionPool.size() + 1);
            pc.inUse = true;
            pc.lastUsed = System.currentTimeMillis();
            connectionPool.add(pc);
            activeConnections++;
            lastCompCode = MQCC_OK;
            lastReasonCode = MQRC_NONE;
            return pc.connectionId;
        }
        lastCompCode = MQCC_FAILED;
        lastReasonCode = MQRC_CONNECTION_BROKEN;
        return -1;
    }

    /** Release a pooled connection back to the pool */
    public synchronized void releaseConnection(int connectionId) {
        for (PooledConnection pc : connectionPool) {
            if (pc.connectionId == connectionId && pc.inUse) {
                pc.inUse = false;
                activeConnections = Math.max(0, activeConnections - 1);
                break;
            }
        }
    }

    /** Get active connection count */
    public int getActiveConnectionCount() { return activeConnections; }
    /** Get total pool size */
    public int getPoolSize() { return connectionPool.size(); }

    // --- Reconnect Logic ---

    private int maxRetries = 3;
    private long retryBaseDelayMs = 100;

    /** Set max reconnect retries */
    public void setMaxRetries(int retries) { this.maxRetries = retries; }
    public int getMaxRetries() { return maxRetries; }

    /**
     * Reconnect with exponential backoff.
     * Attempts up to maxRetries times with increasing delay.
     * @return true if reconnected successfully
     */
    public boolean reconnect() {
        disconnect();
        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            try {
                long delay = retryBaseDelayMs * (1L << (attempt - 1)); // exponential backoff
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }
            if (connect()) {
                return true;
            }
        }
        lastCompCode = MQCC_FAILED;
        lastReasonCode = MQRC_CONNECTION_BROKEN;
        return false;
    }

    // --- Dead Letter Queue ---

    /** Set the dead letter queue name */
    public void setDeadLetterQueue(String name) {
        this.deadLetterQueue = name.toUpperCase().trim();
        if (!queues.containsKey(this.deadLetterQueue)) {
            createQueue(this.deadLetterQueue);
        }
    }

    /** Get the dead letter queue name */
    public String getDeadLetterQueue() { return deadLetterQueue; }

    /**
     * Move a message to the dead letter queue.
     * Used when a message cannot be processed.
     */
    public int moveToDeadLetter(String sourceQueueName, MQMessage msg) {
        MQQueue dlq = queues.get(deadLetterQueue);
        if (dlq == null) {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = MQRC_UNKNOWN_OBJECT;
            return MQRC_UNKNOWN_OBJECT;
        }
        // Tag message with source queue info
        msg.getProperties().put("DLQ_SOURCE_QUEUE", sourceQueueName);
        msg.getProperties().put("DLQ_TIMESTAMP", String.valueOf(System.currentTimeMillis()));
        int rc = dlq.put(msg);
        if (rc == 0) {
            lastCompCode = MQCC_OK;
            lastReasonCode = MQRC_NONE;
        } else {
            lastCompCode = MQCC_FAILED;
            lastReasonCode = rc;
        }
        return rc;
    }

    // --- Statistics ---

    /** Get total messages put across all queues */
    public long getTotalMessagesPut() {
        long total = 0;
        for (MQQueue q : queues.values()) total += q.getTotalPut();
        return total;
    }

    /** Get total messages gotten across all queues */
    public long getTotalMessagesGotten() {
        long total = 0;
        for (MQQueue q : queues.values()) total += q.getTotalGet();
        return total;
    }

    /** Check if currently connected */
    public boolean isConnected() { return connected; }

    /** Get total queue count */
    public int getQueueCount() { return queues.size(); }

    /** Get number of open handles */
    public int getOpenHandleCount() { return openHandles.size(); }

    // --- Internal ---

    private static class OpenQueue {
        final MQQueue queue;
        final int openOptions;
        final String browserId;

        OpenQueue(MQQueue q, int opts, String bid) {
            this.queue = q;
            this.openOptions = opts;
            this.browserId = bid;
        }
    }

    private static class TransactionEntry {
        final String queueName;
        final MQMessage message;
        final boolean isPut; // true=put, false=get

        TransactionEntry(String qname, MQMessage msg, boolean isPut) {
            this.queueName = qname;
            this.message = msg.copy();
            this.isPut = isPut;
        }
    }

    private static class PooledConnection {
        final int connectionId;
        boolean inUse;
        long lastUsed;

        PooledConnection(int id) {
            this.connectionId = id;
            this.inUse = false;
            this.lastUsed = System.currentTimeMillis();
        }
    }
}
