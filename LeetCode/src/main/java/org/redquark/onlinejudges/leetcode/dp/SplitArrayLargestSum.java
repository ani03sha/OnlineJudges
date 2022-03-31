package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int m) {
        // Length of the array
        int n = nums.length;
        // Lookup table to store the mapping of index at which
        // partition needs to be made and number of subarray at
        // which we are. The value will define the largest sum
        // for such combination
        int[][] lookup = new int[n + 1][m + 1];
        // We will store the cumulative sum until an index in
        // an array
        int[] cumulativeSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + nums[i - 1];
        }
        // Now, we will try to find out minimum largest sum among
        // subarrays at every point
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                // If there's only one subarray, then it will hold all
                // the remaining elements in it
                if (i == 1) {
                    lookup[j][i] = cumulativeSum[n] - cumulativeSum[j];
                    continue;
                }
                // Otherwise, determine the minimum largest subarray
                // sum between j and the end of the array with i subarrays remaining.
                int minSum = Integer.MAX_VALUE;
                for (int k = j; k <= n - i; k++) {
                    // Find max subarray sum for current split
                    int firstSplitSum = cumulativeSum[k + 1] - cumulativeSum[j];
                    // Find the maximum subarray sum for the current first split.
                    int biggestSplitSum = Math.max(firstSplitSum, lookup[k + 1][i - 1]);
                    // Find minimum of all
                    minSum = Math.min(minSum, biggestSplitSum);
                    if (firstSplitSum >= minSum) {
                        break;
                    }
                }
                lookup[j][i] = minSum;
            }
        }
        return lookup[0][m];
    }
}
