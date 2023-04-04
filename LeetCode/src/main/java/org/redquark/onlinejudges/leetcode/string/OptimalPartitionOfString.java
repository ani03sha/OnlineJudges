package org.redquark.onlinejudges.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionOfString {

    public int partitionString(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Set to store the already occurred elements
        Set<Character> presentElements = new HashSet<>();
        // Required partitions
        int partitions = 1;
        // Loop through the array
        for (char c : s.toCharArray()) {
            if (presentElements.contains(c)) {
                partitions++;
                presentElements.clear();
            }
            presentElements.add(c);
        }
        return partitions;
    }
}
