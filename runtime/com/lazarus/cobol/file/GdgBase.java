package com.lazarus.cobol.file;

import java.util.*;

/**
 * GDG Base — Generation Data Group definition.
 *
 * A GDG is an IBM concept for maintaining versioned datasets:
 *   BASE.NAME.G0001V00, BASE.NAME.G0002V00, ...
 *
 * Properties:
 *   - LIMIT: max number of generations retained
 *   - SCRATCH/NOSCRATCH: whether rolled-off generations are deleted
 *   - NOEMPTY/EMPTY: whether all generations are deleted when limit reached
 *   - FIFO/LIFO: ordering for relative references (+1, -1, 0)
 *
 * Relative references:
 *   (+1) = new generation (write)
 *   (0)  = current/latest generation (read or write)
 *   (-1) = previous generation (read)
 *   (-n) = nth previous generation
 */
public class GdgBase {

    private final String baseName;
    private int limit;
    private boolean scratch;  // Delete rolled-off files
    private boolean empty;    // Delete all when limit reached
    private final List<GdgGeneration> generations = new ArrayList<>();
    private int nextGenNumber = 1;

    public GdgBase(String baseName, int limit) {
        this.baseName = baseName.toUpperCase().trim();
        this.limit = limit;
        this.scratch = true;
        this.empty = false;
    }

    public GdgBase(String baseName, int limit, boolean scratch, boolean empty) {
        this.baseName = baseName.toUpperCase().trim();
        this.limit = limit;
        this.scratch = scratch;
        this.empty = empty;
    }

    public String getBaseName() { return baseName; }
    public int getLimit() { return limit; }
    public void setLimit(int n) { this.limit = n; }
    public boolean isScratch() { return scratch; }
    public void setScratch(boolean b) { this.scratch = b; }
    public boolean isEmpty() { return empty; }
    public void setEmpty(boolean b) { this.empty = b; }

    // --- Generation Management ---

    /**
     * Create a new generation (+1).
     * Returns the new absolute generation name.
     */
    public GdgGeneration newGeneration() {
        // Check limit
        if (empty && generations.size() >= limit) {
            // EMPTY: delete all existing generations
            for (GdgGeneration g : generations) {
                g.setStatus(GdgGeneration.Status.ROLLED_OFF);
            }
            generations.clear();
        }

        String absName = String.format("%s.G%04dV00", baseName, nextGenNumber);
        GdgGeneration gen = new GdgGeneration(absName, nextGenNumber);
        nextGenNumber++;
        generations.add(gen);

        // Enforce limit — roll off oldest
        while (generations.size() > limit) {
            GdgGeneration oldest = generations.remove(0);
            oldest.setStatus(GdgGeneration.Status.ROLLED_OFF);
            if (scratch) {
                oldest.setStatus(GdgGeneration.Status.SCRATCHED);
            }
        }

        return gen;
    }

    /**
     * Resolve a relative reference.
     * @param relative 0=current, -1=previous, -n=nth previous, +1=new
     * @return the generation, or null if not found
     */
    public GdgGeneration resolve(int relative) {
        if (relative > 0) {
            // +1 = allocate new
            return newGeneration();
        }
        // 0 = current (last), -1 = previous, etc.
        int index = generations.size() - 1 + relative;
        if (index < 0 || index >= generations.size()) return null;
        return generations.get(index);
    }

    /** Get generation by absolute name */
    public GdgGeneration getByName(String absName) {
        String upper = absName.toUpperCase().trim();
        for (GdgGeneration g : generations) {
            if (g.getAbsoluteName().equals(upper)) return g;
        }
        return null;
    }

    /** Get all active generations (oldest first) */
    public List<GdgGeneration> getGenerations() {
        return Collections.unmodifiableList(generations);
    }

    /** Get active generation count */
    public int getActiveCount() { return generations.size(); }

    /** Get the current (latest) generation, or null */
    public GdgGeneration getCurrent() {
        return generations.isEmpty() ? null : generations.get(generations.size() - 1);
    }

    /** Delete a specific generation by absolute name */
    public boolean deleteGeneration(String absName) {
        String upper = absName.toUpperCase().trim();
        Iterator<GdgGeneration> it = generations.iterator();
        while (it.hasNext()) {
            GdgGeneration g = it.next();
            if (g.getAbsoluteName().equals(upper)) {
                g.setStatus(GdgGeneration.Status.SCRATCHED);
                it.remove();
                return true;
            }
        }
        return false;
    }

    /** Delete all generations */
    public void deleteAll() {
        for (GdgGeneration g : generations) {
            g.setStatus(GdgGeneration.Status.SCRATCHED);
        }
        generations.clear();
    }
}
