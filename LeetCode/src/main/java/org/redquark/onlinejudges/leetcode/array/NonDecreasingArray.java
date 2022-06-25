package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return true;
        }
        // Length of the array
        int n = nums.length;
        // Count to keep track of elements which need
        // to be modified to make an array non-decreasing
        int count = 0;
        // Loop through the array
        for (int i = 0; i < n - 1; i++) {
            // If the current number is greater than the
            // next number
            if (nums[i] > nums[i + 1]) {
                // If we have already found one such occurrence,
                // then we return false because it is the second
                // occurrence
                if (count == 1) {
                    return false;
                }
                // We will now update the element because of chaning
                // one element, this will change the initial state
                // of the array
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
                count++;
            }
        }
        return count <= 1;
    }
}
