package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        // Special case
        if (nums == null || nums.length < 2) {
            return true;
        }
        // Length of the array
        int n = nums.length;
        // Last good index which means from here we can jump
        // to the end for sure
        int lastGoodIndex = n - 1;
        // Loop through the array backwards
        for (int i = n - 1; i >= 0; i--) {
            // Check if we can to the end from here
            if (i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }
}
