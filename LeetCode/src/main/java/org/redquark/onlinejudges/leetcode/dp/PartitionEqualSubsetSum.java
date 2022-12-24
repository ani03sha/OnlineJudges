package org.redquark.onlinejudges.leetcode.dp;

public class PartitionEqualSubsetSum {

    /**
     * Time complexity - O(n ^ 2)
     * Space complexity - O(nums.length * sum of array elements)
     */
    public boolean canPartition(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return true;
        }
        // Variable to keep track of sum of all elements
        // in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // If the sum is odd, there is no way we can partition
        // the array into two subarrays
        if (sum % 2 == 1) {
            return false;
        }
        // Lookup array to store if a combination of index and
        // sum can partition the array
        Boolean[][] lookup = new Boolean[nums.length + 1][sum + 1];
        // We will now find out that if sum / 2 is possible
        return isSumPossible(nums, nums.length - 1, sum / 2, lookup);
    }

    private boolean isSumPossible(int[] nums, int index, int currentSum, Boolean[][] lookup) {
        // If the subarray is found
        if (currentSum == 0) {
            return true;
        }
        // If the indices become out of bounds
        if (currentSum < 0 || index < 0) {
            return false;
        }
        // If the solution for the current combination is already found
        if (lookup[index][currentSum] != null) {
            return lookup[index][currentSum];
        }
        // Recursively call the updated target sum when we choose or not
        // choose the element
        return lookup[index][currentSum] = isSumPossible(nums, index - 1, currentSum - nums[index], lookup)
                || isSumPossible(nums, index - 1, currentSum, lookup);
    }
}
