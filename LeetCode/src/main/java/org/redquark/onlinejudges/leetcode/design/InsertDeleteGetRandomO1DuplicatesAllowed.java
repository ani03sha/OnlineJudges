package org.redquark.onlinejudges.leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class InsertDeleteGetRandomO1DuplicatesAllowed {

    static class RandomizedCollection {

        // List to store all the elements in the collection
        private final List<Integer> elements;
        // Mapping of values and their indices
        private final Map<Integer, Set<Integer>> mappings;
        // Instance of the Random class
        private final Random random;

        public RandomizedCollection() {
            this.elements = new ArrayList<>();
            this.mappings = new HashMap<>();
            this.random = new Random();
        }

        public boolean insert(int val) {
            // Check if the val is present in mappings
            boolean isPresent = !mappings.containsKey(val);
            // Get the list of indices corresponding to val
            // If the list is null, we will initialize it
            mappings.computeIfAbsent(val, k -> new LinkedHashSet<>());
            // Add the mapping
            mappings.get(val).add(elements.size());
            // Add the element to the elements list
            elements.add(val);
            return isPresent;
        }

        public boolean remove(int val) {
            // If the val is not present
            if (!mappings.containsKey(val) || mappings.get(val).isEmpty()) {
                return false;
            }
            // Get the list of indices of the value
            int index = mappings.get(val).iterator().next();
            // Remove the index from the list
            mappings.get(val).remove(index);
            // Get the last index of the elements list
            int lastIndex = elements.size() - 1;
            // Last element in the list
            int lastElement = elements.get(lastIndex);
            // Update the list
            elements.set(index, lastElement);
            // Remove the mapping if required
            mappings.get(lastElement).add(index);
            mappings.get(lastElement).remove(lastIndex);
            // Remove mapping if required
            if (mappings.get(val).isEmpty()) {
                mappings.remove(val);
            }
            // Remove the element from the elements list
            elements.remove(lastIndex);
            return true;
        }

        public int getRandom() {
            return elements.get(random.nextInt(elements.size()));
        }
    }
}
