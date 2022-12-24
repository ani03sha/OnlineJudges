package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.Comparator;
import java.util.stream.IntStream;

public class PartitionToKEqualSumSubsets {

    /**
     * Time complexity - O(k * (2 ^ n))
     * Space complexity - O(n)
     */
    public boolean canPartitionKSubsets(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return true;
        }
        // Sum of all the elements in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // If the sum is not a multiple of k, then it
        // is not possible to partition
        if (sum % k != 0) {
            return false;
        }
        // Length of the array
        int n = nums.length;
        // Target value for each subset
        int target = sum / k;
        // Sort the array in reverse order
        nums = IntStream.of(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
        // Array to keep track of the elements which have
        // already been used
        boolean[] used = new boolean[n];
        // Perform backtracking
        return backtrack(nums, target, 0, 0, k, used);
    }

    private boolean backtrack(int[] nums, int target, int index, int currentSum, int k, boolean[] used) {
        // If we have made k = 0, it means that we have
        // found all the subsets
        if (k == 0) {
            return true;
        }
        // If the currentSum becomes 0, it means we have found one
        // subset, and we can continue the backtracking process from
        // the beginning
        if (currentSum == target) {
            return backtrack(nums, target, 0, 0, k - 1, used);
        }
        // Traverse from all the elements from the index to check for
        // more subsets
        for (int i = index; i < nums.length; i++) {
            // We have now two cases - either to choose a value or not
            // choose a value
            if (used[i] || currentSum + nums[i] > target) {
                continue;
            }
            // Set used the value
            used[i] = true;
            // Perform backtracking again
            if (backtrack(nums, target, i + 1, currentSum + nums[i], k, used)) {
                return true;
            }
            // Un-use the value
            used[i] = false;
        }
        return false;
    }
}
