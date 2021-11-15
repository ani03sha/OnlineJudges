package org.redquark.onlinejudges.leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author Anirudh Sharma
 */
public class InsertDeleteGetRandomO1 {

    static class RandomizedSet {

        // List to store the elements of the Randomized set
        private final List<Integer> elements;
        // Map to store the mapping of the element and the index
        // at which it is stored
        private final Map<Integer, Integer> mappings;
        // Instace of Random class to get the random element
        private final Random random;

        public RandomizedSet() {
            this.elements = new ArrayList<>();
            this.mappings = new HashMap<>();
            this.random = new Random();
        }

        public boolean insert(int val) {
            // If the element is already present in the set
            if (mappings.containsKey(val)) {
                return false;
            }
            // Create the mapping for val
            mappings.put(val, elements.size());
            // Add val to the list
            elements.add(val);
            return true;
        }

        public boolean remove(int val) {
            // Check if the element exists in the randomized set
            if (!mappings.containsKey(val)) {
                return false;
            }
            // Get the index of the val
            int index = mappings.get(val);
            // Last index of the elements list
            int lastIndex = elements.size() - 1;
            // If this index is not the last index
            if (index < lastIndex) {
                // Swap the current val with the element at the last index
                int lastElement = elements.get(lastIndex);
                elements.set(lastIndex, val);
                elements.set(index, lastElement);
            }
            // Remove the mapping of val
            mappings.remove(val);
            // Remove last element from the list
            elements.remove(lastIndex);
            return true;
        }

        public int getRandom() {
            return elements.get(random.nextInt(elements.size()));
        }
    }
}
