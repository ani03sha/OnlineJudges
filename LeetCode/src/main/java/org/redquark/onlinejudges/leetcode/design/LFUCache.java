package org.redquark.onlinejudges.leetcode.design;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class LFUCache {

    // Map to store the key and value pairs for the cache
    private final Map<Integer, Integer> pairs;
    // Map to store key and its frequency of being accessed
    private final Map<Integer, Integer> frequencies;
    // Map to store counter and list of items
    private final Map<Integer, LinkedHashSet<Integer>> lists;
    // Capacity of the cache
    private final int capacity;
    // Minimum element
    private int minimum;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minimum = -1;
        this.pairs = new HashMap<>();
        this.frequencies = new HashMap<>();
        this.lists = new HashMap<>();
        lists.put(1, new LinkedHashSet<>());
    }

    public int get(int key) {
        // If the key is not present in the cache
        if (!pairs.containsKey(key)) {
            return -1;
        }
        // Get the access frequency for this key
        int frequency = frequencies.get(key);
        // Update the access frequency
        frequencies.put(key, frequency + 1);
        // Remove the element from the counter list to
        // remove the element from the list of keys
        lists.get(frequency).remove(key);
        // When current minimum is -1, next one would be the minimum
        if (frequency == minimum && lists.get(frequency).isEmpty()) {
            minimum++;
        }
        if (!lists.containsKey(frequency + 1)) {
            lists.put(frequency + 1, new LinkedHashSet<>());
        }
        lists.get(frequency + 1).add(key);
        return pairs.get(key);
    }

    public void put(int key, int value) {
        // For invalid capacity
        if (capacity <= 0) {
            return;
        }
        // If the key already exists, we will update the value
        if (pairs.containsKey(key)) {
            pairs.put(key, value);
            get(key);
            return;
        }
        // If the cache is full, we will have to evict an entry
        if (pairs.size() >= capacity) {
            // Key of the entry to be evicted
            int evicted = lists.get(minimum).iterator().next();
            // Evict the entry from everywhere
            lists.get(minimum).remove(evicted);
            pairs.remove(evicted);
            frequencies.remove(evicted);
        }
        // If the key is new, insert it and set minimum to 1
        pairs.put(key, value);
        frequencies.put(key, 1);
        minimum = 1;
        lists.get(1).add(key);
    }
}
