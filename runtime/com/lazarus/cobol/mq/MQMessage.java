package com.lazarus.cobol.mq;

import java.util.*;
import java.text.SimpleDateFormat;

/**
 * MQ Message — represents a message in an MQ queue.
 *
 * Maps IBM MQ MQMD (Message Descriptor) fields:
 *   - messageId: unique message identifier
 *   - correlId: correlation identifier for request/reply
 *   - replyToQueue: queue name for reply messages
 *   - format: message format (MQFMT_STRING, MQFMT_NONE)
 *   - persistence: MQPER_PERSISTENT or MQPER_NOT_PERSISTENT
 *   - expiry: message expiry in 1/10th seconds (-1 = unlimited)
 *   - priority: 0-9 (0=lowest, 9=highest, default=0)
 *   - putDate/putTime: timestamp when message was put
 *   - payload: the actual message data
 */
public class MQMessage {

    // Message format constants
    public static final String MQFMT_STRING = "MQSTR   ";
    public static final String MQFMT_NONE   = "        ";

    // Persistence constants
    public static final int MQPER_NOT_PERSISTENT = 0;
    public static final int MQPER_PERSISTENT     = 1;

    private String messageId;
    private String correlId = "";
    private String replyToQueue = "";
    private String replyToQMgr = "";
    private String format = MQFMT_STRING;
    private int persistence = MQPER_NOT_PERSISTENT;
    private int expiry = -1;         // -1 = unlimited
    private int priority = 0;
    private long putTimestamp;
    private String putDate = "";     // YYYYMMDD format
    private String putTime = "";     // HHMMSSTH format
    private String payload = "";
    private final Map<String, String> properties = new LinkedHashMap<>();

    // Message type constants
    public static final int MQMT_REQUEST  = 1;
    public static final int MQMT_REPLY    = 2;
    public static final int MQMT_DATAGRAM = 8;
    public static final int MQMT_REPORT   = 4;

    private int messageType = MQMT_DATAGRAM;

    // Full MQMD (Message Descriptor) fields
    private byte[] msgIdBytes = new byte[24];
    private byte[] correlIdBytes = new byte[24];
    private int encoding = 546;              // MQENC_NATIVE (x86)
    private int codedCharSetId = 1208;       // UTF-8
    private String userId = "";
    private String accountingToken = "";
    private String applIdentityData = "";
    private String applOriginData = "";

    // Message grouping
    private byte[] groupId = new byte[24];
    private int msgSeqNumber = 1;
    private int offset = 0;
    private int msgFlags = 0;
    private int originalLength = -1;

    // Report options
    public static final int MQRO_NONE               = 0x00000000;
    public static final int MQRO_EXCEPTION           = 0x01000000;
    public static final int MQRO_EXPIRATION          = 0x00200000;
    public static final int MQRO_COA                 = 0x00000100;
    public static final int MQRO_COD                 = 0x00000800;
    public static final int MQRO_COPY_MSG_ID_TO_CORREL_ID = 0x00000000;
    public static final int MQRO_PASS_MSG_ID         = 0x00000080;
    private int reportOptions = MQRO_NONE;

    // Feedback codes
    public static final int MQFB_NONE    = 0;
    public static final int MQFB_EXPIRATION = 258;
    public static final int MQFB_COA     = 259;
    public static final int MQFB_COD     = 260;
    private int feedback = MQFB_NONE;

    // Message group flags
    public static final int MQMF_NONE           = 0x00000000;
    public static final int MQMF_MSG_IN_GROUP   = 0x00000008;
    public static final int MQMF_LAST_MSG_IN_GROUP = 0x00000010;
    public static final int MQMF_SEGMENT        = 0x00000002;
    public static final int MQMF_LAST_SEGMENT   = 0x00000004;

    public MQMessage() {
        this.messageId = generateId();
        this.putTimestamp = System.currentTimeMillis();
        // Set putDate/putTime from current time
        java.text.SimpleDateFormat dfDate = new java.text.SimpleDateFormat("yyyyMMdd");
        java.text.SimpleDateFormat dfTime = new java.text.SimpleDateFormat("HHmmssSS");
        Date now = new Date(this.putTimestamp);
        this.putDate = dfDate.format(now);
        this.putTime = dfTime.format(now);
    }

    public MQMessage(String payload) {
        this();
        this.payload = payload;
    }

    // --- Accessors ---
    public String getMessageId() { return messageId; }
    public void setMessageId(String id) { this.messageId = id; }
    public String getCorrelId() { return correlId; }
    public void setCorrelId(String id) { this.correlId = id; }
    public String getReplyToQueue() { return replyToQueue; }
    public void setReplyToQueue(String q) { this.replyToQueue = q; }
    public String getFormat() { return format; }
    public void setFormat(String fmt) { this.format = fmt; }
    public int getPersistence() { return persistence; }
    public void setPersistence(int p) { this.persistence = p; }
    public int getExpiry() { return expiry; }
    public void setExpiry(int e) { this.expiry = e; }
    public int getPriority() { return priority; }
    public void setPriority(int p) { this.priority = Math.max(0, Math.min(9, p)); }
    public long getPutTimestamp() { return putTimestamp; }
    public void setPutTimestamp(long ts) { this.putTimestamp = ts; }
    public String getPayload() { return payload; }
    public void setPayload(String data) { this.payload = data; }
    public int getMessageType() { return messageType; }
    public void setMessageType(int t) { this.messageType = t; }
    public Map<String, String> getProperties() { return properties; }

    // --- MQMD extended accessors ---
    public String getReplyToQMgr() { return replyToQMgr; }
    public void setReplyToQMgr(String qm) { this.replyToQMgr = qm != null ? qm : ""; }

    public String getPutDate() { return putDate; }
    public void setPutDate(String d) { this.putDate = d != null ? d : ""; }
    public String getPutTime() { return putTime; }
    public void setPutTime(String t) { this.putTime = t != null ? t : ""; }

    public int getEncoding() { return encoding; }
    public void setEncoding(int e) { this.encoding = e; }
    public int getCodedCharSetId() { return codedCharSetId; }
    public void setCodedCharSetId(int c) { this.codedCharSetId = c; }

    public String getUserId() { return userId; }
    public void setUserId(String u) { this.userId = u != null ? u : ""; }
    public String getAccountingToken() { return accountingToken; }
    public void setAccountingToken(String a) { this.accountingToken = a != null ? a : ""; }
    public String getApplIdentityData() { return applIdentityData; }
    public void setApplIdentityData(String a) { this.applIdentityData = a != null ? a : ""; }
    public String getApplOriginData() { return applOriginData; }
    public void setApplOriginData(String a) { this.applOriginData = a != null ? a : ""; }

    // --- Message Grouping ---
    public byte[] getGroupId() { return groupId; }
    public void setGroupId(byte[] g) { this.groupId = g != null ? g : new byte[24]; }
    public int getMsgSeqNumber() { return msgSeqNumber; }
    public void setMsgSeqNumber(int s) { this.msgSeqNumber = s; }
    public int getOffset() { return offset; }
    public void setOffset(int o) { this.offset = o; }
    public int getMsgFlags() { return msgFlags; }
    public void setMsgFlags(int f) { this.msgFlags = f; }
    public int getOriginalLength() { return originalLength; }
    public void setOriginalLength(int l) { this.originalLength = l; }

    /** Check if message is part of a group */
    public boolean isInGroup() { return (msgFlags & MQMF_MSG_IN_GROUP) != 0; }
    /** Check if message is the last in a group */
    public boolean isLastInGroup() { return (msgFlags & MQMF_LAST_MSG_IN_GROUP) != 0; }
    /** Check if message is a segment */
    public boolean isSegment() { return (msgFlags & MQMF_SEGMENT) != 0; }

    // --- Report Options ---
    public int getReportOptions() { return reportOptions; }
    public void setReportOptions(int r) { this.reportOptions = r; }
    public int getFeedback() { return feedback; }
    public void setFeedback(int f) { this.feedback = f; }

    // --- MQMD byte-array ID accessors ---
    public byte[] getMsgIdBytes() { return msgIdBytes; }
    public void setMsgIdBytes(byte[] b) { this.msgIdBytes = b != null ? b : new byte[24]; }
    public byte[] getCorrelIdBytes() { return correlIdBytes; }
    public void setCorrelIdBytes(byte[] b) { this.correlIdBytes = b != null ? b : new byte[24]; }

    /** Get payload length */
    public int getDataLength() { return payload != null ? payload.length() : 0; }

    /** Check if expired */
    public boolean isExpired() {
        if (expiry < 0) return false;
        long expiryMs = expiry * 100L; // 1/10th seconds to ms
        return System.currentTimeMillis() > putTimestamp + expiryMs;
    }

    /** Generate a unique message ID */
    private static String generateId() {
        return "MSG" + Long.toHexString(System.nanoTime()).toUpperCase() +
               String.format("%04X", (int)(Math.random() * 0xFFFF));
    }

    /** Deep copy */
    public MQMessage copy() {
        MQMessage m = new MQMessage(this.payload);
        m.messageId = this.messageId;
        m.correlId = this.correlId;
        m.replyToQueue = this.replyToQueue;
        m.replyToQMgr = this.replyToQMgr;
        m.format = this.format;
        m.persistence = this.persistence;
        m.expiry = this.expiry;
        m.priority = this.priority;
        m.putTimestamp = this.putTimestamp;
        m.putDate = this.putDate;
        m.putTime = this.putTime;
        m.messageType = this.messageType;
        m.encoding = this.encoding;
        m.codedCharSetId = this.codedCharSetId;
        m.userId = this.userId;
        m.accountingToken = this.accountingToken;
        m.applIdentityData = this.applIdentityData;
        m.applOriginData = this.applOriginData;
        m.msgSeqNumber = this.msgSeqNumber;
        m.offset = this.offset;
        m.msgFlags = this.msgFlags;
        m.originalLength = this.originalLength;
        m.reportOptions = this.reportOptions;
        m.feedback = this.feedback;
        m.msgIdBytes = Arrays.copyOf(this.msgIdBytes, 24);
        m.correlIdBytes = Arrays.copyOf(this.correlIdBytes, 24);
        m.groupId = Arrays.copyOf(this.groupId, 24);
        m.properties.putAll(this.properties);
        return m;
    }
}
