package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class HouseRobber {

    public int rob(int[] nums) {
        // Special cases
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        // Length of the array
        int n = nums.length;
        // Lookup table where each element represents the maximum
        // money that can be robbed upto that house
        int[] lookup = new int[n + 1];
        // If there is only one house then we will just rob the house
        lookup[0] = nums[0];
        // If there are two houses then we will rob the house with
        // more money
        lookup[1] = Math.max(nums[0], nums[1]);
        // For remaining houses, populate the array
        for (int i = 2; i < n; i++) {
            // Include and exclude the current house
            lookup[i] = Math.max(lookup[i - 2] + nums[i], lookup[i - 1]);
        }
        return lookup[n - 1];
    }
}
