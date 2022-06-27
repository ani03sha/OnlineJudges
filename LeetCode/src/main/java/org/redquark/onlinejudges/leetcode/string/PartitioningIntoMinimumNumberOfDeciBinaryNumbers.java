package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        // Max digit in the number
        int max = 0;
        // Loop through the string
        for (char c : n.toCharArray()) {
            max = Math.max(max, c - '0');
            if (max == 9) {
                return max;
            }
        }
        return max;
    }
}
