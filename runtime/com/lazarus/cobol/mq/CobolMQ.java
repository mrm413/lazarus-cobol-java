package com.lazarus.cobol.mq;

/**
 * CobolMQ — high-level MQ API for COBOL programs.
 *
 * Wraps MQQueueManager with a COBOL-friendly interface:
 *   - String-based queue names
 *   - Automatic handle management
 *   - Completion/reason code tracking (like MQCC/MQRC)
 *   - Request/reply pattern support
 *
 * Usage in translated COBOL:
 *   CobolMQ mq = new CobolMQ("QM1");
 *   mq.connect();
 *   mq.put("MY.QUEUE", "Hello World");
 *   String msg = mq.get("MY.QUEUE");
 *   mq.disconnect();
 */
public class CobolMQ {

    private final MQQueueManager qmgr;
    private int compCode = 0;
    private int reasonCode = 0;

    public CobolMQ(String queueManagerName) {
        this.qmgr = new MQQueueManager(queueManagerName);
    }

    public CobolMQ(MQQueueManager qmgr) {
        this.qmgr = qmgr;
    }

    /** Get underlying queue manager */
    public MQQueueManager getQueueManager() { return qmgr; }

    /** Get last completion code */
    public int getCompCode() { return compCode; }
    /** Get last reason code */
    public int getReasonCode() { return reasonCode; }
    /** Check if last operation was OK */
    public boolean isOk() { return compCode == MQQueueManager.MQCC_OK; }

    // --- Connection ---

    public void connect() {
        qmgr.connect();
        updateCodes();
    }

    public void disconnect() {
        qmgr.disconnect();
        updateCodes();
    }

    // --- Queue Operations ---

    /** Create a queue (admin) */
    public void createQueue(String name) {
        qmgr.createQueue(name);
        compCode = MQQueueManager.MQCC_OK;
        reasonCode = MQQueueManager.MQRC_NONE;
    }

    /** Delete a queue (admin) */
    public void deleteQueue(String name) {
        boolean ok = qmgr.deleteQueue(name);
        compCode = ok ? MQQueueManager.MQCC_OK : MQQueueManager.MQCC_FAILED;
        reasonCode = ok ? MQQueueManager.MQRC_NONE : MQQueueManager.MQRC_UNKNOWN_OBJECT;
    }

    // --- Simple Put/Get (auto open/close) ---

    /** Put a string message to a queue */
    public void put(String queueName, String payload) {
        MQMessage msg = new MQMessage(payload);
        int rc = qmgr.put1(queueName, msg);
        compCode = rc == 0 ? MQQueueManager.MQCC_OK : MQQueueManager.MQCC_FAILED;
        reasonCode = rc;
    }

    /** Put a message object to a queue */
    public void put(String queueName, MQMessage msg) {
        int rc = qmgr.put1(queueName, msg);
        compCode = rc == 0 ? MQQueueManager.MQCC_OK : MQQueueManager.MQCC_FAILED;
        reasonCode = rc;
    }

    /** Get the next message from a queue (no wait) */
    public String get(String queueName) {
        return get(queueName, 0);
    }

    /** Get the next message from a queue (with wait in ms) */
    public String get(String queueName, long waitMs) {
        int handle = qmgr.open(queueName, MQQueue.MQOO_INPUT_SHARED);
        if (handle < 0) {
            updateCodes();
            return null;
        }
        MQMessage msg = qmgr.get(handle, 0, null, waitMs);
        updateCodes();
        qmgr.close(handle);
        return msg != null ? msg.getPayload() : null;
    }

    /** Get a message with full MQMessage details */
    public MQMessage getMessage(String queueName, long waitMs) {
        int handle = qmgr.open(queueName, MQQueue.MQOO_INPUT_SHARED);
        if (handle < 0) {
            updateCodes();
            return null;
        }
        MQMessage msg = qmgr.get(handle, 0, null, waitMs);
        updateCodes();
        qmgr.close(handle);
        return msg;
    }

    /** Get by correlation ID */
    public MQMessage getByCorrelId(String queueName, String correlId, long waitMs) {
        int handle = qmgr.open(queueName, MQQueue.MQOO_INPUT_SHARED);
        if (handle < 0) {
            updateCodes();
            return null;
        }
        MQMessage msg = qmgr.get(handle, MQQueue.MQMO_MATCH_CORREL_ID, correlId, waitMs);
        updateCodes();
        qmgr.close(handle);
        return msg;
    }

    /** Get by message ID */
    public MQMessage getByMessageId(String queueName, String messageId, long waitMs) {
        int handle = qmgr.open(queueName, MQQueue.MQOO_INPUT_SHARED);
        if (handle < 0) {
            updateCodes();
            return null;
        }
        MQMessage msg = qmgr.get(handle, MQQueue.MQMO_MATCH_MSG_ID, messageId, waitMs);
        updateCodes();
        qmgr.close(handle);
        return msg;
    }

    // --- Browse ---

    /** Browse all messages on a queue (returns copies, doesn't remove) */
    public MQMessage[] browse(String queueName) {
        int handle = qmgr.open(queueName, MQQueue.MQOO_BROWSE);
        if (handle < 0) {
            updateCodes();
            return new MQMessage[0];
        }

        java.util.List<MQMessage> result = new java.util.ArrayList<>();
        MQMessage msg = qmgr.browse(handle, true);
        while (msg != null) {
            result.add(msg);
            msg = qmgr.browse(handle, false);
        }
        qmgr.close(handle);
        compCode = MQQueueManager.MQCC_OK;
        reasonCode = MQQueueManager.MQRC_NONE;
        return result.toArray(new MQMessage[0]);
    }

    // --- Request/Reply Pattern ---

    /**
     * Send a request and wait for a reply.
     * Puts message on requestQueue with replyToQueue set,
     * then gets from replyQueue matching correlId.
     */
    public MQMessage requestReply(String requestQueue, String replyQueue,
                                  String payload, long timeoutMs) {
        MQMessage request = new MQMessage(payload);
        request.setMessageType(MQMessage.MQMT_REQUEST);
        request.setReplyToQueue(replyQueue);

        put(requestQueue, request);
        if (!isOk()) return null;

        // Reply should have correlId = request's messageId
        return getByCorrelId(replyQueue, request.getMessageId(), timeoutMs);
    }

    // --- Inquire ---

    /** Get queue depth */
    public int getQueueDepth(String queueName) {
        int handle = qmgr.open(queueName, MQQueue.MQOO_INQUIRE);
        if (handle < 0) {
            updateCodes();
            return -1;
        }
        java.util.Map<String, String> attrs = qmgr.inquire(handle);
        qmgr.close(handle);
        try {
            return Integer.parseInt(attrs.getOrDefault("CURRENT_DEPTH", "0"));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void updateCodes() {
        compCode = qmgr.getLastCompCode();
        reasonCode = qmgr.getLastReasonCode();
    }
}
