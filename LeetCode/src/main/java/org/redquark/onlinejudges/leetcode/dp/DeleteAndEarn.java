package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Array to store the cumulative sum of the elements
        int[] cumulativeSum = new int[10001];
        // Populate the array
        for (int num : nums) {
            cumulativeSum[num] += num;
        }
        // Since we can't take element - 1 and element + 1,
        // the problem is reduced to house robber problem
        // which will need two variables take and skip
        int take = 0;
        int skip = 0;
        // Loop through the cumulative sum array
        for (final int sum : cumulativeSum) {
            final int temp = Math.max(take, skip);
            take = skip + sum;
            skip = temp;
        }
        return take;

    }
}
