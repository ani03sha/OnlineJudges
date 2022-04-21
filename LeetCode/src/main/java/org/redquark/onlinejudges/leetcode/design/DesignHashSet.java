package org.redquark.onlinejudges.leetcode.design;

/**
 * @author Anirudh Sharma
 */
public class DesignHashSet {

    static class MyHashSet {
        // Boolean array to make sure if the key
        // is present or not
        private final boolean[] keys;

        public MyHashSet() {
            this.keys = new boolean[1000001];
        }

        public void add(int key) {
            // Mark the position as true to indicate if the key is present
            this.keys[key] = true;
        }

        public void remove(int key) {
            // Mark the position as false to indicate if the key is not present
            this.keys[key] = false;
        }

        public boolean contains(int key) {
            return this.keys[key];
        }
    }
}
