package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Concatenated array
        int[] concatenated = new int[2 * n];
        // Populate the array
        for (int i = 0; i < n; i++) {
            concatenated[i] = nums[i];
            concatenated[i + n] = nums[i];
        }
        return concatenated;
    }
}
