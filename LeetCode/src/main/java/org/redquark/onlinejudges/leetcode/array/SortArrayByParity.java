package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        // Special case
        if (nums == null || nums.length < 2) {
            return nums;
        }
        // Variable to keep track of total number of
        // elements in the array
        int count = 0;
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // If the number is even, we will swap it
            // with the number present at the count index
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
        return nums;
    }
}
