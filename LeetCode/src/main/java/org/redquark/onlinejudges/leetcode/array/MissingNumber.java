package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        // Length of the array
        int n = nums.length;
        // Sum of all the elements of the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return n * (n + 1) / 2 - sum;
    }
}
