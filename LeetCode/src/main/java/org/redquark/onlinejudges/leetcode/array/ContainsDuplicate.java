package org.redquark.onlinejudges.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        // Base case
        if (nums == null || nums.length == 0) {
            return false;
        }
        // Set to store elements in the array
        final Set<Integer> elements = new HashSet<>();
        // Loop through the array
        for (int num : nums) {
            // Add the element
            if (!elements.add(num)) {
                return true;
            }
        }
        return false;
    }
}
