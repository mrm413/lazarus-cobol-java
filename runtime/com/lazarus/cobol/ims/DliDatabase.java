package com.lazarus.cobol.ims;

import java.util.*;

/**
 * DL/I Database — IMS hierarchical database with standard DL/I calls.
 *
 * Supports the core DL/I function codes:
 *   GU  (Get Unique)    — direct retrieval by key path
 *   GN  (Get Next)      — sequential forward retrieval
 *   GNP (Get Next within Parent) — forward within current parent
 *   GHU/GHN/GHNP        — hold versions (for update/delete)
 *   ISRT (Insert)        — add a new segment
 *   REPL (Replace)       — update the held segment
 *   DLET (Delete)        — delete the held segment and dependents
 *
 * SSA (Segment Search Arguments):
 *   Unqualified: SEGNAME
 *   Qualified:   SEGNAME(KEYFIELD=value)
 *   Command codes: *D (path call), *F (first), *L (last)
 *
 * Status codes:
 *   "  " (spaces) = successful
 *   "GE" = segment not found
 *   "GB" = end of database
 *   "II" = insert rule violation
 *   "DA" = no current hold position
 */
public class DliDatabase {

    private final String dbdName;
    private final DliSegment root;

    // Current position for sequential retrieval (GN/GNP)
    private DliSegment currentPosition;
    private DliSegment currentParent;
    private DliSegment heldSegment; // For GHU/GHN/GHNP → REPL/DLET

    // Status code
    private String statusCode = "  ";

    // Database hierarchy definition
    private final Map<String, List<String>> hierarchy = new LinkedHashMap<>();

    public DliDatabase(String dbdName) {
        this.dbdName = dbdName;
        this.root = new DliSegment("ROOT", "");
    }

    public String getDbdName() { return dbdName; }
    public String getStatusCode() { return statusCode; }
    public DliSegment getRoot() { return root; }

    /** Define hierarchy: parent segment has child segment types */
    public void defineHierarchy(String parent, String... children) {
        List<String> childList = hierarchy.getOrDefault(parent.toUpperCase(), new ArrayList<String>());
        for (String c : children) childList.add(c.toUpperCase());
        hierarchy.put(parent.toUpperCase(), childList);
    }

    // --- DL/I Calls ---

    /**
     * GU — Get Unique: direct retrieval by qualified SSA path.
     * @param ssas Segment Search Arguments: "SEGNAME(KEY=value)", "SEGNAME", etc.
     * @return the found segment, or null if GE
     */
    public DliSegment getUnique(String... ssas) {
        DliSegment current = root;

        for (String ssa : ssas) {
            SSA parsed = parseSSA(ssa);
            DliSegment found = null;

            for (DliSegment child : current.getChildren()) {
                if (child.getSegmentName().equalsIgnoreCase(parsed.segName)) {
                    if (parsed.isQualified()) {
                        if (matchesQualification(child, parsed)) {
                            found = child;
                            break;
                        }
                    } else {
                        found = child;
                        break;
                    }
                }
            }

            if (found == null) {
                statusCode = "GE";
                return null;
            }
            current = found;
        }

        statusCode = "  ";
        currentPosition = current;
        return current;
    }

    /**
     * GHU — Get Hold Unique: same as GU but holds for update.
     */
    public DliSegment getHoldUnique(String... ssas) {
        DliSegment seg = getUnique(ssas);
        if (seg != null) heldSegment = seg;
        return seg;
    }

    /**
     * GN — Get Next: sequential forward retrieval.
     * @param ssas optional SSAs to filter segment types
     * @return next segment matching criteria, or null if GB
     */
    public DliSegment getNext(String... ssas) {
        DliSegment next = advancePosition(currentPosition, false);

        if (ssas.length > 0) {
            SSA filter = parseSSA(ssas[ssas.length - 1]);
            while (next != null) {
                if (next.getSegmentName().equalsIgnoreCase(filter.segName)) {
                    if (!filter.isQualified() || matchesQualification(next, filter)) {
                        break;
                    }
                }
                next = advancePosition(next, false);
            }
        }

        if (next == null) {
            statusCode = "GB";
            return null;
        }

        statusCode = "  ";
        currentPosition = next;
        return next;
    }

    /**
     * GHN — Get Hold Next.
     */
    public DliSegment getHoldNext(String... ssas) {
        DliSegment seg = getNext(ssas);
        if (seg != null) heldSegment = seg;
        return seg;
    }

    /**
     * GNP — Get Next within Parent.
     * @param ssas optional filter
     * @return next segment under currentParent, or null if GE
     */
    public DliSegment getNextWithinParent(String... ssas) {
        DliSegment parent = currentParent != null ? currentParent :
                            (currentPosition != null ? currentPosition.getParent() : root);

        DliSegment next = advancePosition(currentPosition, false);

        while (next != null) {
            // Check if still under parent
            if (!isDescendantOf(next, parent)) {
                statusCode = "GE";
                return null;
            }

            if (ssas.length > 0) {
                SSA filter = parseSSA(ssas[ssas.length - 1]);
                if (next.getSegmentName().equalsIgnoreCase(filter.segName)) {
                    if (!filter.isQualified() || matchesQualification(next, filter)) {
                        break;
                    }
                }
            } else {
                break;
            }
            next = advancePosition(next, false);
        }

        if (next == null || !isDescendantOf(next, parent)) {
            statusCode = "GE";
            return null;
        }

        statusCode = "  ";
        currentPosition = next;
        return next;
    }

    /**
     * GHNP — Get Hold Next within Parent.
     */
    public DliSegment getHoldNextWithinParent(String... ssas) {
        DliSegment seg = getNextWithinParent(ssas);
        if (seg != null) heldSegment = seg;
        return seg;
    }

    /**
     * ISRT — Insert a new segment.
     * @param ssas path to parent + new segment SSA
     * @param segment the segment to insert
     * @return true if successful
     */
    public boolean insert(DliSegment segment, String... ssas) {
        DliSegment parent;
        if (ssas.length == 0) {
            parent = root;
        } else if (ssas.length == 1) {
            parent = root; // Insert directly under root
        } else {
            // Navigate to parent
            String[] parentSSAs = Arrays.copyOf(ssas, ssas.length - 1);
            parent = getUnique(parentSSAs);
            if (parent == null) {
                statusCode = "GE";
                return false;
            }
        }

        // Check for duplicate key
        for (DliSegment child : parent.getChildren()) {
            if (child.getSegmentName().equalsIgnoreCase(segment.getSegmentName()) &&
                !segment.getKey().isEmpty() &&
                child.getKey().equals(segment.getKey())) {
                statusCode = "II";
                return false;
            }
        }

        parent.addChild(segment);
        currentPosition = segment;
        statusCode = "  ";
        return true;
    }

    /**
     * REPL — Replace the currently held segment's data.
     * @param newData new field values
     * @return true if successful
     */
    public boolean replace(Map<String, String> newData) {
        if (heldSegment == null) {
            statusCode = "DA";
            return false;
        }
        heldSegment.setData(newData);
        statusCode = "  ";
        heldSegment = null;
        return true;
    }

    /**
     * DLET — Delete the currently held segment and all dependents.
     * @return true if successful
     */
    public boolean delete() {
        if (heldSegment == null) {
            statusCode = "DA";
            return false;
        }

        DliSegment parent = heldSegment.getParent();
        if (parent != null) {
            parent.removeChild(heldSegment);
        }

        // Reset position
        currentPosition = parent;
        heldSegment = null;
        statusCode = "  ";
        return true;
    }

    /** Set current parent for GNP calls */
    public void setCurrentParent(DliSegment parent) {
        this.currentParent = parent;
    }

    /** Reset position to beginning */
    public void resetPosition() {
        currentPosition = null;
        currentParent = null;
        heldSegment = null;
        statusCode = "  ";
    }

    // --- Internal Navigation ---

    /** Advance position in hierarchical pre-order traversal */
    private DliSegment advancePosition(DliSegment current, boolean skipChildren) {
        if (current == null) {
            // Start from first child of root
            if (root.getChildren().isEmpty()) return null;
            return root.getChildren().get(0);
        }

        // Try first child
        if (!skipChildren && !current.getChildren().isEmpty()) {
            return current.getChildren().get(0);
        }

        // Try next sibling
        DliSegment parent = current.getParent();
        while (parent != null) {
            List<DliSegment> siblings = parent.getChildren();
            int idx = siblings.indexOf(current);
            if (idx >= 0 && idx + 1 < siblings.size()) {
                return siblings.get(idx + 1);
            }
            // Move up
            current = parent;
            parent = current.getParent();
        }

        return null; // End of database
    }

    /** Check if a segment is a descendant of an ancestor */
    private boolean isDescendantOf(DliSegment seg, DliSegment ancestor) {
        DliSegment current = seg;
        while (current != null) {
            if (current == ancestor) return true;
            current = current.getParent();
        }
        return false;
    }

    // --- SSA Parsing ---

    private SSA parseSSA(String ssa) {
        ssa = ssa.trim();
        int paren = ssa.indexOf('(');
        if (paren < 0) {
            return new SSA(ssa, null, null, null);
        }
        String segName = ssa.substring(0, paren).trim();
        String qual = ssa.substring(paren + 1, ssa.length() - (ssa.endsWith(")") ? 1 : 0));
        // Parse: FIELD=value or FIELD>=value etc.
        String[] ops = {">=", "<=", "!=", "=", ">", "<"};
        for (String op : ops) {
            int idx = qual.indexOf(op);
            if (idx >= 0) {
                String field = qual.substring(0, idx).trim();
                String value = qual.substring(idx + op.length()).trim();
                return new SSA(segName, field, op, value);
            }
        }
        return new SSA(segName, null, null, null);
    }

    private boolean matchesQualification(DliSegment seg, SSA ssa) {
        if (!ssa.isQualified()) return true;
        String fieldValue;
        if ("KEY".equalsIgnoreCase(ssa.field) || ssa.field.isEmpty()) {
            fieldValue = seg.getKey();
        } else {
            fieldValue = seg.getField(ssa.field);
        }
        return compareSSA(fieldValue, ssa.op, ssa.value);
    }

    private boolean compareSSA(String actual, String op, String expected) {
        int cmp = actual.compareTo(expected);
        switch (op) {
            case "=":  return cmp == 0;
            case "!=": return cmp != 0;
            case ">":  return cmp > 0;
            case ">=": return cmp >= 0;
            case "<":  return cmp < 0;
            case "<=": return cmp <= 0;
            default: return false;
        }
    }

    private static class SSA {
        final String segName;
        final String field;
        final String op;
        final String value;

        SSA(String seg, String field, String op, String value) {
            this.segName = seg;
            this.field = field;
            this.op = op;
            this.value = value;
        }

        boolean isQualified() { return field != null && op != null; }
    }
}
