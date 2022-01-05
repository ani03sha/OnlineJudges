package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        // List to store all the partitions
        List<List<String>> partitions = new ArrayList<>();
        // Special case
        if (s == null || s.isEmpty()) {
            return partitions;
        }
        // Use backtracking to check for all the cases
        partitionHelper(s, new ArrayList<>(), partitions);
        return partitions;
    }

    private void partitionHelper(String s, List<String> currentPartition, List<List<String>> partitions) {
        // Base case
        if (s == null || s.isEmpty()) {
            partitions.add(new ArrayList<>(currentPartition));
            return;
        }
        // Loop through the string to check for every combination
        for (int i = 1; i <= s.length(); i++) {
            // Current substring
            String current = s.substring(0, i);
            // We will perform backtracking only when the current string
            // is a palindrome
            if (isPalindrome(current)) {
                // Execute three stages of backtracking
                // 1. Choose
                currentPartition.add(current);
                // 2. Explore
                partitionHelper(s.substring(i), currentPartition, partitions);
                // 3. Unchoose
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        // Left and right pointers
        int left = 0;
        int right = s.length() - 1;
        // Loop until the pointers meet
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
