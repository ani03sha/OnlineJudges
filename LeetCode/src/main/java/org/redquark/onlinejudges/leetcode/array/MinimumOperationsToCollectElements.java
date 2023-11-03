package org.redquark.onlinejudges.leetcode.array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumOperationsToCollectElements {

    public int minOperations(List<Integer> nums, int k) {
        // Special case
        if (nums == null || nums.isEmpty() || k > nums.size()) {
            return 0;
        }
        // Set to store the elements from 1,2,...,k
        Set<Integer> elements = new HashSet<>();
        for (int i = 1; i <= k; i++) {
            elements.add(i);
        }
        // Count of operations
        int operations = 0;
        // Traverse through the array
        for (int i = nums.size() - 1; i >= 0; i--) {
            operations++;
            elements.remove(nums.get(i));
            if (elements.isEmpty()) {
                break;
            }
        }
        return operations;
    }
}
