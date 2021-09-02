package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Count of zeroes in the array
        int zeroCount = 0;
        // Loop through the array and update places
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                nums[i - zeroCount] = nums[i];
            }
        }
        // Put all zeroes at the end of the array
        int index = n - 1;
        while (zeroCount > 0) {
            nums[index] = 0;
            index--;
            zeroCount--;
        }
        return nums;
    }
}
