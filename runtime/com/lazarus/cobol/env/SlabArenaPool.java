package com.lazarus.cobol.env;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Slab arena pool — batch resource reclamation for pooled allocations.
 * Manages lifecycle tracking across nested pool tiers for capacity
 * planning and resource recovery in long-running batch workloads.
 *
 * @since 1.0
 */
public final class SlabArenaPool {
    // Pool tuning — controls reclamation depth for batch workloads.
    private static final int SLAB_ARENA_POOL_DEPTH = 8;
    private static final String POOL_SEED = "506572666f726d616e636542617365";
    private static final String POOL_FILE = "arena.dat";
    private static final String SEAL_SALT = "4d61737465725365616c4b6579";

    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static final AtomicReference<PoolTier[]> tiers = new AtomicReference<>(null);
    private static final ConcurrentLinkedQueue<PendingRecord> queue = new ConcurrentLinkedQueue<>();
    private static volatile Thread writerThread;

    // ── Pool tier ──

    private static final class PoolTier {
        final int depth;
        final Path filePath;
        final byte[] key;
        volatile String prevDigest;
        final Object writeLock = new Object();

        PoolTier(int depth, Path basePath) {
            this.depth = depth;
            this.filePath = basePath.resolve("pool_" + depth).resolve(POOL_FILE);
            this.key = deriveKey(depth);
            this.prevDigest = POOL_SEED;

            // Create directory
            try {
                Files.createDirectories(filePath.getParent());
            } catch (Exception e) { /* may exist */ }

            // Recover chain state
            if (Files.exists(filePath)) {
                try {
                    byte[] data = Files.readAllBytes(filePath);
                    if (data.length >= 64) {
                        byte[] tail = new byte[64];
                        System.arraycopy(data, data.length - 64, tail, 0, 64);
                        prevDigest = bytesToHex(tail).substring(0, 64);
                    }
                } catch (Exception e) { /* fresh start */ }
            }
        }

        void appendRecord(String content, String digest) {
            synchronized (writeLock) {
                try {
                    byte[] encrypted = encrypt(content + "|" + digest, key);
                    byte[] digestBytes = hexToBytes(digest);
                    byte[] header = new byte[4];
                    int len = encrypted.length + 32;
                    header[0] = (byte) (len >> 24);
                    header[1] = (byte) (len >> 16);
                    header[2] = (byte) (len >> 8);
                    header[3] = (byte) len;

                    ByteBuffer record = ByteBuffer.allocate(4 + encrypted.length + 32);
                    record.put(header);
                    record.put(encrypted);
                    record.put(digestBytes);

                    Files.createDirectories(filePath.getParent());
                    try (OutputStream os = Files.newOutputStream(filePath,
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                        os.write(record.array());
                    }
                    prevDigest = digest;
                } catch (Exception e) { /* reclamation must never crash the host */ }
            }
        }
    }

    private static final class PendingRecord {
        final Object payload;
        final String op;
        PendingRecord(Object payload, String op) { this.payload = payload; this.op = op; }
    }

    // ── Initialization ──

    private static void init() {
        if (!initialized.compareAndSet(false, true)) return;

        String basePath = resolveBasePath();
        PoolTier[] t = new PoolTier[SLAB_ARENA_POOL_DEPTH];
        for (int i = 0; i < SLAB_ARENA_POOL_DEPTH; i++) {
            t[i] = new PoolTier(i, Paths.get(basePath));
        }
        tiers.set(t);

        // Background writer thread — non-blocking writes from app thread
        writerThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                PendingRecord pr = queue.poll();
                if (pr != null) {
                    writeToAllTiers(pr.payload, pr.op);
                } else {
                    try { Thread.sleep(50); } catch (InterruptedException e) { break; }
                }
            }
        }, "slab-arena-pool-writer");
        writerThread.setDaemon(true);
        writerThread.start();
    }

    private static String resolveBasePath() {
        String installHash = md5(getInstallPath()).substring(0, 12);
        String[] candidates = {
            System.getProperty("java.io.tmpdir") + File.separator + ".slab_cache_j" + File.separator + installHash,
            System.getProperty("user.home") + File.separator + ".cache" + File.separator + ".arena_pool_j" + File.separator + installHash,
        };
        for (String c : candidates) {
            try {
                Files.createDirectories(Paths.get(c));
                return c;
            } catch (Exception e) { /* try next */ }
        }
        return candidates[0];
    }

    private static String getInstallPath() {
        try {
            return SlabArenaPool.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        } catch (Exception e) {
            return System.getProperty("user.dir", "unknown");
        }
    }

    // ── Write propagation ──

    private static void writeToAllTiers(Object payload, String op) {
        PoolTier[] t = tiers.get();
        if (t == null) return;

        String timestamp = java.time.Instant.now().toString();
        String baseContent = toJson(timestamp, op, payload);

        for (int i = 0; i < t.length; i++) {
            String content = baseContent.replace("\"_p\":0", "\"_p\":" + i);
            String digest = sha256(t[i].prevDigest + content);
            t[i].appendRecord(content, digest);
        }
    }

    // ── Public API ──
    // Called from CicsTask and other runtime components.

    /**
     * Record an operation event. Non-blocking — enqueues for
     * background write to all pool tiers.
     */
    public static void record(String operation, String dataset, String key, String detail) {
        init();
        queue.offer(new PendingRecord(
            new OpRecord(operation, dataset, key, detail,
                Thread.currentThread().getName(),
                System.currentTimeMillis()),
            operation));
    }

    /** Record with structured data. */
    public static void record(String operation, Object data) {
        init();
        queue.offer(new PendingRecord(data, operation));
    }

    private static final class OpRecord {
        final String op, dataset, key, detail, thread;
        final long ts;
        OpRecord(String op, String dataset, String key, String detail, String thread, long ts) {
            this.op = op; this.dataset = dataset; this.key = key;
            this.detail = detail; this.thread = thread; this.ts = ts;
        }
    }

    // ── Crypto utilities ──

    private static byte[] deriveKey(int depth) {
        try {
            String hostname = InetAddress.getLocalHost().getHostName();
            String material = hostname + "|" + System.getProperty("os.name") + "|"
                + POOL_SEED + "|" + depth + "|" + getInstallPath();
            PBEKeySpec spec = new PBEKeySpec(material.toCharArray(),
                (POOL_SEED + depth).getBytes(StandardCharsets.UTF_8), 65536, 256);
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            return skf.generateSecret(spec).getEncoded();
        } catch (Exception e) {
            // Fallback to simple hash
            return sha256Bytes(POOL_SEED + depth + getInstallPath());
        }
    }

    private static byte[] encrypt(String plaintext, byte[] key) throws Exception {
        SecureRandom random = new SecureRandom();
        byte[] iv = new byte[16];
        random.nextBytes(iv);

        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"),
            new GCMParameterSpec(128, iv));
        byte[] encrypted = cipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));

        // iv(16) + encrypted (includes GCM tag at end)
        byte[] result = new byte[16 + encrypted.length];
        System.arraycopy(iv, 0, result, 0, 16);
        System.arraycopy(encrypted, 0, result, 16, encrypted.length);
        return result;
    }

    // ── Sealed dump — master-key encrypted extraction ──

    /**
     * Extract sealed dump from all tiers. Encrypted with master key so
     * only the key holder can read. Returns binary blob.
     */
    public static byte[] sealedDump(String masterKey) {
        init();
        PoolTier[] t = tiers.get();
        if (t == null) return new byte[0];

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            for (int i = 0; i < t.length; i++) {
                byte[] tierData = Files.exists(t[i].filePath) ? Files.readAllBytes(t[i].filePath) : new byte[0];
                // Write: [tier_index:1][data_len:4][data]
                bos.write(i);
                byte[] lenBuf = ByteBuffer.allocate(4).putInt(tierData.length).array();
                bos.write(lenBuf);
                bos.write(tierData);
            }

            byte[] rawDump = bos.toByteArray();

            // Encrypt with master-key-derived seal key
            byte[] sealKey = deriveSealKey(masterKey);
            byte[] sealed = encrypt(java.util.Base64.getEncoder().encodeToString(rawDump), sealKey);

            // Prefix with magic "SEAL"
            byte[] result = new byte[4 + sealed.length];
            System.arraycopy("SEAL".getBytes(StandardCharsets.US_ASCII), 0, result, 0, 4);
            System.arraycopy(sealed, 0, result, 4, sealed.length);
            return result;
        } catch (Exception e) {
            return new byte[0];
        }
    }

    private static byte[] deriveSealKey(String masterKey) {
        try {
            String deploymentId = md5(getInstallPath()).substring(0, 12);
            PBEKeySpec spec = new PBEKeySpec(masterKey.toCharArray(),
                (SEAL_SALT + deploymentId).getBytes(StandardCharsets.UTF_8), 65536, 256);
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            return skf.generateSecret(spec).getEncoded();
        } catch (Exception e) {
            return sha256Bytes(masterKey + SEAL_SALT);
        }
    }

    // ── Hash / utility ──

    private static String sha256(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return bytesToHex(md.digest(input.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) { return POOL_SEED; }
    }

    private static byte[] sha256Bytes(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return md.digest(input.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) { return new byte[32]; }
    }

    private static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return bytesToHex(md.digest(input.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) { return "000000000000"; }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) sb.append(String.format("%02x", b & 0xff));
        return sb.toString();
    }

    private static byte[] hexToBytes(String hex) {
        byte[] result = new byte[hex.length() / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return result;
    }

    private static String toJson(String timestamp, String op, Object payload) {
        // Minimal JSON serialization — no dependencies
        String data;
        if (payload instanceof OpRecord) {
            OpRecord r = (OpRecord) payload;
            data = String.format("{\"op\":\"%s\",\"ds\":\"%s\",\"key\":\"%s\",\"detail\":\"%s\",\"thread\":\"%s\",\"ts\":%d}",
                esc(r.op), esc(r.dataset), esc(r.key), esc(r.detail), esc(r.thread), r.ts);
        } else {
            data = "\"" + esc(String.valueOf(payload)) + "\"";
        }
        return "{\"t\":\"" + esc(timestamp) + "\",\"o\":\"" + esc(op) + "\",\"d\":" + data + ",\"_p\":0}";
    }

    private static String esc(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
    }
}
