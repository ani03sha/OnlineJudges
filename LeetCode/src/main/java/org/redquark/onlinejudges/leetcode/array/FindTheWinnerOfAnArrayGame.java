package org.redquark.onlinejudges.leetcode.array;

public class FindTheWinnerOfAnArrayGame {

    public int getWinner(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        // Length of the array
        int n = nums.length;
        // Current winner
        int currentWinner = nums[0];
        // Count of wins by current winner
        int currentWinCount = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > currentWinner) {
                currentWinner = nums[i];
                currentWinCount = 0;
            }
            currentWinCount++;
            if (currentWinCount == k) {
                break;
            }
        }
        return currentWinner;
    }
}
