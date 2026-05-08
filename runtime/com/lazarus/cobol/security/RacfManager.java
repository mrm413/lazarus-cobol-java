package com.lazarus.cobol.security;

import java.util.*;
import java.security.MessageDigest;

/**
 * RACF Manager — Resource Access Control Facility .
 *
 * Core RACF operations:
 *   ADDUSER/ALTUSER/DELUSER  — user management
 *   ADDGROUP/ALTGROUP        — group management
 *   PERMIT                   — grant/revoke resource access
 *   RACHECK/RACROUTE         — authorization check
 *   PASSWORD                 — password verification/change
 *   LISTUSER/LISTGRP         — display profiles
 *
 * Resource classes (simplified):
 *   DATASET  — dataset/file access
 *   FACILITY — system facility access
 *   PROGRAM  — program execution
 *   TSOAUTH  — TSO authorities
 *   SURROGAT — surrogate access
 *
 * Access levels:
 *   NONE < READ < UPDATE < CONTROL < ALTER
 */
public class RacfManager {

    /** Access levels (ordered) */
    public enum AccessLevel {
        NONE(0), READ(1), UPDATE(2), CONTROL(3), ALTER(4);

        final int level;
        AccessLevel(int l) { this.level = l; }

        public boolean permits(AccessLevel required) {
            return this.level >= required.level;
        }
    }

    // User profiles
    private final Map<String, RacfUser> users = new LinkedHashMap<>();

    // Resource profiles: class.resource → access list
    private final Map<String, Map<String, AccessLevel>> resourceProfiles = new LinkedHashMap<>();

    // Audit log
    private final List<String> auditLog = new ArrayList<>();

    // Configuration
    private int maxPasswordAttempts = 3;
    private int minPasswordLength = 8;
    private boolean passwordMixedCase = true;

    // Failed attempt tracker
    private final Map<String, Integer> failedAttempts = new LinkedHashMap<>();

    // --- User Management ---

    /** ADDUSER — create a new user */
    public RacfUser addUser(String userId, String name, String defaultGroup) {
        String uid = userId.toUpperCase().trim();
        if (users.containsKey(uid)) {
            audit("ADDUSER FAILED: " + uid + " already exists");
            return null;
        }
        RacfUser user = new RacfUser(uid);
        user.setName(name);
        user.setDefaultGroup(defaultGroup);
        user.connectGroup(defaultGroup, RacfUser.GroupAuth.USE);
        users.put(uid, user);
        audit("ADDUSER: " + uid + " group=" + defaultGroup);
        return user;
    }

    /** ALTUSER — modify user */
    public RacfUser getUser(String userId) {
        return users.get(userId.toUpperCase().trim());
    }

    /** DELUSER — delete user */
    public boolean deleteUser(String userId) {
        String uid = userId.toUpperCase().trim();
        RacfUser user = users.remove(uid);
        if (user != null) {
            audit("DELUSER: " + uid);
            return true;
        }
        return false;
    }

    /** List all users */
    public Set<String> listUsers() {
        return Collections.unmodifiableSet(users.keySet());
    }

    // --- Password Management ---

    /** Set password for a user */
    public boolean setPassword(String userId, String password) {
        RacfUser user = users.get(userId.toUpperCase().trim());
        if (user == null) return false;

        if (password.length() < minPasswordLength) {
            audit("PASSWORD REJECT: " + userId + " too short");
            return false;
        }

        user.setPasswordHash(hashPassword(password));
        audit("PASSWORD SET: " + userId);
        return true;
    }

    /** Verify password */
    public boolean verifyPassword(String userId, String password) {
        RacfUser user = users.get(userId.toUpperCase().trim());
        if (user == null) {
            audit("VERIFY FAILED: " + userId + " not found");
            return false;
        }

        if (!user.isActive()) {
            audit("VERIFY FAILED: " + userId + " revoked");
            return false;
        }

        String hash = hashPassword(password);
        if (hash.equals(user.getPasswordHash())) {
            user.setLastAccess(System.currentTimeMillis());
            failedAttempts.remove(userId.toUpperCase());
            audit("VERIFY OK: " + userId);
            return true;
        }

        // Track failed attempts
        String uid = userId.toUpperCase();
        int attempts = failedAttempts.getOrDefault(uid, 0) + 1;
        failedAttempts.put(uid, attempts);

        if (attempts >= maxPasswordAttempts) {
            user.addAttribute(RacfUser.Attribute.REVOKE);
            audit("VERIFY FAILED: " + userId + " REVOKED after " + attempts + " attempts");
        } else {
            audit("VERIFY FAILED: " + userId + " attempt " + attempts);
        }
        return false;
    }

    // --- Resource Access Control ---

    /**
     * PERMIT — grant access to a resource.
     * @param resourceClass e.g., "DATASET", "FACILITY", "PROGRAM"
     * @param resourceName the resource (supports wildcards: PROD.** matches PROD.anything)
     * @param userId user or group to grant
     * @param access access level
     */
    public void permit(String resourceClass, String resourceName,
                       String userId, AccessLevel access) {
        String key = resourceClass.toUpperCase() + "." + resourceName.toUpperCase();
        Map<String, AccessLevel> acl = resourceProfiles.computeIfAbsent(key, k -> new LinkedHashMap<>());
        acl.put(userId.toUpperCase().trim(), access);
        audit("PERMIT: " + userId + " " + access + " to " + key);
    }

    /**
     * RACHECK — check if user has required access to a resource.
     * @return true if access is permitted
     */
    public boolean checkAccess(String userId, String resourceClass,
                               String resourceName, AccessLevel required) {
        String uid = userId.toUpperCase().trim();
        RacfUser user = users.get(uid);

        if (user == null) {
            audit("RACHECK DENY: " + uid + " not found");
            return false;
        }

        if (!user.isActive()) {
            audit("RACHECK DENY: " + uid + " revoked");
            return false;
        }

        // SPECIAL users have full access
        if (user.isSpecial()) {
            audit("RACHECK ALLOW: " + uid + " SPECIAL");
            return true;
        }

        // OPERATIONS users can read anything
        if (user.isOperations() && required == AccessLevel.READ) {
            audit("RACHECK ALLOW: " + uid + " OPERATIONS READ");
            return true;
        }

        // Check direct user access
        AccessLevel granted = getGrantedAccess(uid, resourceClass, resourceName);
        if (granted != null && granted.permits(required)) {
            audit("RACHECK ALLOW: " + uid + " direct " + granted);
            return true;
        }

        // Check group access
        for (String group : user.getGroups()) {
            granted = getGrantedAccess(group, resourceClass, resourceName);
            if (granted != null && granted.permits(required)) {
                audit("RACHECK ALLOW: " + uid + " via group " + group + " " + granted);
                return true;
            }
        }

        audit("RACHECK DENY: " + uid + " " + required + " on " + resourceClass + "." + resourceName);
        return false;
    }

    /** Get the access level granted to a user/group for a resource */
    private AccessLevel getGrantedAccess(String id, String resourceClass, String resourceName) {
        String rClass = resourceClass.toUpperCase();
        String rName = resourceName.toUpperCase();

        // Try exact match
        String key = rClass + "." + rName;
        Map<String, AccessLevel> acl = resourceProfiles.get(key);
        if (acl != null) {
            AccessLevel level = acl.get(id.toUpperCase());
            if (level != null) return level;
        }

        // Try wildcard matches (PROD.** matches PROD.DATA.FILE)
        for (Map.Entry<String, Map<String, AccessLevel>> entry : resourceProfiles.entrySet()) {
            String profile = entry.getKey();
            if (!profile.startsWith(rClass + ".")) continue;
            String pattern = profile.substring(rClass.length() + 1);
            if (matchesWildcard(rName, pattern)) {
                AccessLevel level = entry.getValue().get(id.toUpperCase());
                if (level != null) return level;
            }
        }

        return null;
    }

    /** Match resource name against wildcard pattern (** = any, * = single qualifier) */
    private boolean matchesWildcard(String name, String pattern) {
        if (pattern.equals("**")) return true;
        if (pattern.endsWith(".**")) {
            String prefix = pattern.substring(0, pattern.length() - 3);
            return name.startsWith(prefix);
        }
        if (pattern.contains("*")) {
            String regex = pattern.replace(".", "\\.").replace("*", "[^.]*");
            return name.matches(regex);
        }
        return name.equals(pattern);
    }

    // --- Audit ---

    private void audit(String message) {
        auditLog.add(System.currentTimeMillis() + " " + message);
    }

    public List<String> getAuditLog() { return Collections.unmodifiableList(auditLog); }
    public void clearAuditLog() { auditLog.clear(); }

    /** Get audit entries matching a filter */
    public List<String> getAuditEntries(String filter) {
        List<String> result = new ArrayList<>();
        String upper = filter.toUpperCase();
        for (String entry : auditLog) {
            if (entry.toUpperCase().contains(upper)) result.add(entry);
        }
        return result;
    }

    // --- Configuration ---
    public void setMaxPasswordAttempts(int n) { this.maxPasswordAttempts = n; }
    public void setMinPasswordLength(int n) { this.minPasswordLength = n; }

    // --- Helpers ---

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (Exception e) {
            return password; // Fallback
        }
    }
}
