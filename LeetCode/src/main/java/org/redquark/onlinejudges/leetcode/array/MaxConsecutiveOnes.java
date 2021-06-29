package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Maximum consecutive ones
        int maxConsecutiveOnes = Integer.MIN_VALUE;
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Current consecutive ones
            int currentConsecutiveOnes = 0;
            while (i < nums.length && nums[i] == 1) {
                currentConsecutiveOnes++;
                i++;
            }
            // Update the maxConsecutiveOnes, if necessary
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
        }
        return maxConsecutiveOnes;
    }
}
