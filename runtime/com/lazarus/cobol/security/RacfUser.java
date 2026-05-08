package com.lazarus.cobol.security;

import java.util.*;

/**
 * RACF User Profile — maps IBM RACF user definitions to Java.
 *
 * RACF user fields:
 *   - userId: 1-8 character user ID
 *   - name: user's full name
 *   - defaultGroup: default RACF group
 *   - groups: all connected groups with authorities
 *   - attributes: SPECIAL, OPERATIONS, AUDITOR, REVOKE
 *   - password: hashed password
 *   - passwordInterval: days between forced changes
 *   - lastAccess: timestamp of last successful logon
 *   - revokeDate: date user is revoked (null = active)
 */
public class RacfUser {

    /** Group authority levels (matching RACF) */
    public enum GroupAuth {
        USE,       // Basic access
        CREATE,    // Can create resources
        CONNECT,   // Can connect users to group
        JOIN       // Full group admin
    }

    /** User attributes */
    public enum Attribute {
        SPECIAL,     // System-wide RACF admin
        OPERATIONS,  // Operations staff (bypass most checks)
        AUDITOR,     // Can read audit logs
        REVOKE,      // Account is revoked
        GRPACC,      // Group access
        ADSP,        // Automatic dataset protection
        CLAUTH       // Class authority
    }

    private final String userId;
    private String name = "";
    private String defaultGroup = "";
    private String passwordHash = "";
    private int passwordInterval = 90;
    private long lastAccess = 0;
    private Long revokeDate = null;
    private final Set<Attribute> attributes = EnumSet.noneOf(Attribute.class);
    private final Map<String, GroupAuth> groups = new LinkedHashMap<>();
    private final Map<String, String> installData = new LinkedHashMap<>();

    public RacfUser(String userId) {
        this.userId = userId.toUpperCase().trim();
    }

    // --- Accessors ---
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDefaultGroup() { return defaultGroup; }
    public void setDefaultGroup(String group) { this.defaultGroup = group.toUpperCase().trim(); }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String hash) { this.passwordHash = hash; }
    public int getPasswordInterval() { return passwordInterval; }
    public void setPasswordInterval(int days) { this.passwordInterval = days; }
    public long getLastAccess() { return lastAccess; }
    public void setLastAccess(long ts) { this.lastAccess = ts; }
    public Long getRevokeDate() { return revokeDate; }
    public void setRevokeDate(Long date) { this.revokeDate = date; }

    // --- Attributes ---
    public void addAttribute(Attribute attr) { attributes.add(attr); }
    public void removeAttribute(Attribute attr) { attributes.remove(attr); }
    public boolean hasAttribute(Attribute attr) { return attributes.contains(attr); }
    public Set<Attribute> getAttributes() { return Collections.unmodifiableSet(attributes); }

    /** Check if user is active (not revoked) */
    public boolean isActive() {
        if (attributes.contains(Attribute.REVOKE)) return false;
        if (revokeDate != null && System.currentTimeMillis() >= revokeDate) return false;
        return true;
    }

    /** Check if user has SPECIAL authority (system admin) */
    public boolean isSpecial() { return attributes.contains(Attribute.SPECIAL); }

    /** Check if user has OPERATIONS authority */
    public boolean isOperations() { return attributes.contains(Attribute.OPERATIONS); }

    // --- Groups ---
    public void connectGroup(String group, GroupAuth auth) {
        groups.put(group.toUpperCase().trim(), auth);
    }

    public void removeGroup(String group) {
        groups.remove(group.toUpperCase().trim());
    }

    public GroupAuth getGroupAuth(String group) {
        return groups.get(group.toUpperCase().trim());
    }

    public boolean isMemberOf(String group) {
        return groups.containsKey(group.toUpperCase().trim());
    }

    public Set<String> getGroups() { return Collections.unmodifiableSet(groups.keySet()); }

    // --- Install Data (custom fields) ---
    public void setInstallData(String key, String value) {
        installData.put(key.toUpperCase(), value);
    }

    public String getInstallData(String key) {
        return installData.getOrDefault(key.toUpperCase(), "");
    }
}
