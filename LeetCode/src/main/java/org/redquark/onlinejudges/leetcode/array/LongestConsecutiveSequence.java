package org.redquark.onlinejudges.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public int longestConsecutive(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Set to store the elements because it takes
        // constant time to check if an element is present
        // in the set or not
        Set<Integer> elements = new HashSet<>();
        // Add all elements to the set
        for (int num : nums) {
            elements.add(num);
        }
        // Longest consecutive sequence length
        int longestConsecutiveSequenceLength = 0;
        for (int element : elements) {
            // Check if the previous number of current element is
            // present in the set or not
            if (!elements.contains(element - 1)) {
                // If the previous number is not present then it
                // means our current element is the first number
                // of the current consecutive sequence in question.
                // We will now check for the next elements
                int current = element + 1;
                while (elements.contains(current)) {
                    current++;
                }
                // At this point, we will update the length
                // of the longest consecutive sequence, if
                // required.
                longestConsecutiveSequenceLength = Math.max(longestConsecutiveSequenceLength, current - element);
            }
        }
        return longestConsecutiveSequenceLength;
    }
}
