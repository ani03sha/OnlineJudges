package org.redquark.onlinejudges.leetcode.design;

/**
 * @author Anirudh Sharma
 */
public class DesignHashMap {

    static class MyHashMap {
        // A random prime number for hash calculation. This number should
        // not be too small to avoid frequent hash collisions, and it is
        // also should not be too large to avoid huge memory allocation.
        private static final int PRIME = 8011;
        // Internal array of buckets. Each bucket represents a
        // memory location where an entry can be stored
        private final Node[] entries;

        public MyHashMap() {
            this.entries = new Node[PRIME];
        }

        public void put(int key, int value) {
            // First we will find the bucket that will store
            // this key value pair.
            int location = getBucketLocation(key);
            // Get the object of bucket location
            Node node = this.entries[location];
            // If the bucket location is empty, we will simply
            // store the key value pair there
            if (node == null) {
                node = new Node(key, value, null);
                entries[location] = node;
                return;
            }
            // If the bucket has some data already, we will create
            // a linked list there to store the new value
            while (node != null) {
                // If the key is already present, then it is the case
                // of update of value against that key
                if (node.key == key) {
                    node.value = value;
                    return;
                }
                // Else move on to the next node
                node = node.next;
            }
            // At this point add a new node in the list at the front
            entries[location] = new Node(key, value, entries[location]);
        }

        public int get(int key) {
            // Get the bucket location of the key
            int location = getBucketLocation(key);
            // Get the node corresponding to the location
            Node node = entries[location];
            // If nothing is present, then return -1
            if (node == null) {
                return -1;
            }
            // Else we will move on to the nodes where the
            // key matches
            while (node != null) {
                if (node.key == key) {
                    return node.value;
                }
                node = node.next;
            }
            return -1;
        }

        public void remove(int key) {
            // Get the bucket location for the key
            int location = getBucketLocation(key);
            // Get the node corresponding to the bucket location
            Node node = entries[location];
            // If the node is null, there is nothing to remove
            if (node == null) {
                return;
            }
            // Else move in the list to search for the node
            if (node.key == key) {
                entries[location] = node.next;
                return;
            }
            while (node != null && node.next != null) {
                if (node.next.key == key) {
                    node.next = node.next.next;
                }
                node = node.next;
            }
        }

        private int getBucketLocation(int key) {
            return Integer.hashCode(key) % PRIME;
        }

        static class Node {
            final int key;
            int value;
            Node next;

            Node(int key, int value, Node next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
        }
    }
}
