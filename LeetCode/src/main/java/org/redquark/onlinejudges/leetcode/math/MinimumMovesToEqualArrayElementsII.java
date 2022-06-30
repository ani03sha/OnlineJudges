package org.redquark.onlinejudges.leetcode.math;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class MinimumMovesToEqualArrayElementsII {

    public int minMoves2(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Sort the array
        Arrays.sort(nums);
        // Find the median of the array
        int median = nums[nums.length / 2];
        // Variable to store the minimum number of moves required
        int moves = 0;
        // Traverse through the array and calculate steps to make
        // every element equal to the median calculated
        for (int num : nums) {
            moves += Math.abs(num - median);
        }
        return moves;
    }
}
