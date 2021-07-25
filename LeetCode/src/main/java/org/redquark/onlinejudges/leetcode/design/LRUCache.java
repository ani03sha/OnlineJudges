package org.redquark.onlinejudges.leetcode.design;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    // Capacity of the cache
    private final int capacity;
    // Map to store the key and node (containing values) of the cache
    private final Map<Integer, Entry<Integer, Integer>> entries;
    // Size of the cache
    private int size;
    // Head of the internal doubly linked list
    private Entry<Integer, Integer> head;
    // Tail of the internal doubly linked list
    private Entry<Integer, Integer> tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.entries = new HashMap<>();
    }

    public int get(int key) {
        // Check if the cache contains the key
        if (entries.containsKey(key)) {
            // Get the entry corresponding to the key
            Entry<Integer, Integer> entry = entries.get(key);
            // Delete node from its current position
            deleteNode(entry);
            // Add this node to the front/head of the list
            updateHead(entry);
            return entry.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        // If the key is already present in the cache,
        // we will update the value
        if (entries.containsKey(key)) {
            // Update the value
            Entry<Integer, Integer> entry = entries.get(key);
            entry.value = value;
            // Delete node from its current position
            deleteNode(entry);
            // Add this node to the front/head of the list
            updateHead(entry);
        }
        // If this is a new key, we will have to evict the
        // least recently used entry and put this one, if
        // the cache is full
        else {
            // Create a new node
            Entry<Integer, Integer> entry = new Entry<>(key, value);
            // If the cache is full
            if (size >= capacity) {
                // Remove the node from the tail which is
                // least recently used
                entries.remove(tail.key);
                // Delete node from its current position
                deleteNode(tail);
                // Add this node to the front/head of the list
            }
            updateHead(entry);
            entries.put(key, entry);
            size++;
        }
    }

    private void updateHead(Entry<Integer, Integer> entry) {
        // Make current head as the next of the passed node
        entry.next = head;
        // Make previous of the passed node as null
        entry.previous = null;
        // If the current head is not null
        if (head != null) {
            head.previous = entry;
        }
        // Update the head
        head = entry;
        // If there is only one node
        if (tail == null) {
            tail = entry;
        }
    }

    private void deleteNode(Entry<Integer, Integer> entry) {
        // If the given entry is not the head
        if (entry.previous != null) {
            entry.previous.next = entry.next;
        }
        // If the given entry is the head
        else {
            head = entry.next;
        }
        // If the given entry is not the tail
        if (entry.next != null) {
            entry.next.previous = entry.previous;
        }
        // If the given entry is the tail
        else {
            tail = entry.previous;
        }
    }

    static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> previous;
        private Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
