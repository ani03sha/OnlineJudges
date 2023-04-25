package org.redquark.onlinejudges.leetcode.design;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class SmallestNumberInInfiniteSet {

    static class SmallestInfiniteSet {

        // Min Heap to keep track of the added numbers by
        // the addBack method
        private final Queue<Integer> minHeap;
        // Set to keep track of unique elements
        private final Set<Integer> uniques;
        // Variable to keep track of the smallest number to be returned
        private int currentSmallest;

        public SmallestInfiniteSet() {
            this.minHeap = new PriorityQueue<>();
            this.uniques = new HashSet<>();
            this.currentSmallest = 1;
        }

        public int popSmallest() {
            // Smallest element
            int smallestElement;
            // If there are elements in the minHeap then the
            // root would be the smallest number to return
            if (!minHeap.isEmpty()) {
                smallestElement = minHeap.remove();
                uniques.remove(smallestElement);
            } else {
                smallestElement = currentSmallest;
                currentSmallest++;
            }
            return smallestElement;
        }

        public void addBack(int num) {
            // Check if num is a valid candidate to be inserted
            if (currentSmallest <= num || uniques.contains(num)) {
                return;
            }
            minHeap.offer(num);
            uniques.add(num);
        }
    }
}
