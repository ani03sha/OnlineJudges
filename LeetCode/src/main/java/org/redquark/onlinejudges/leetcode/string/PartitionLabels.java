package org.redquark.onlinejudges.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        // List to store the sizes of the partition
        List<Integer> sizes = new ArrayList<>();
        // Special case
        if (s == null || s.isEmpty()) {
            return sizes;
        }
        // Length of the string
        int n = s.length();
        // Array to store the last index of a character in the string
        int[] lastIndices = new int[26];
        // Populate the array
        for (int i = 0; i < n; i++) {
            lastIndices[s.charAt(i) - 'a'] = i;
        }
        // Pointers to store start and end index of the window
        int start = 0;
        int end = 0;
        // Loop through the string
        for (int i = 0; i < n; i++) {
            // Update the end index, if needed
            end = Math.max(end, lastIndices[s.charAt(i) - 'a']);
            // If the current index is the last index, then the window
            // should end here
            if (i == end) {
                sizes.add(end - start + 1);
                // Update the start index
                start = end + 1;
            }
        }
        return sizes;
    }
}
