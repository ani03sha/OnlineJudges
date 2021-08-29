package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class HouseRobberII {

    public int rob(int[] nums) {
        // Special cases
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // Length of the array
        int n = nums.length;
        return Math.max(robHelper(nums, 0, n - 2), robHelper(nums, 1, n - 1));
    }

    private int robHelper(int[] nums, int start, int end) {
        // Variables to store the robbed amount when the house
        // is included or not included
        int include = 0;
        int exclude = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(include, exclude);
            // Include current element and previously excluded element
            include = exclude + nums[i];
            // Max of included and excluded elements of previous iteration
            exclude = temp;
        }
        return Math.max(include, exclude);
    }
}
