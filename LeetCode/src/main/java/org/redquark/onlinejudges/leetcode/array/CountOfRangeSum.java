package org.redquark.onlinejudges.leetcode.array;

public class CountOfRangeSum {

    /**
     * Time complexity - O(n * log(n))
     * Space complexity - O(n)
     */
    public int countRangeSum(int[] nums, int lower, int upper) {
        // Special case
        if (nums == null || nums.length == 0 || lower > upper) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Get prefix sum
        long[] prefixSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        // Divide the array into smaller arrays (divide step of merge sort)
        return divide(0, n, lower, upper, prefixSum);
    }

    private int divide(int left, int right, int lower, int upper, long[] prefixSum) {
        // If the indices go out of bounds, we stop processing
        if (left >= right) {
            return 0;
        }
        // Get the middle index
        int middle = left + (right - left) / 2;
        // Perform divide sort on two halves
        int count = divide(left, middle, lower, upper, prefixSum)
                + divide(middle + 1, right, lower, upper, prefixSum);
        // Lower and upper both are inclusive
        int rangeLower = middle + 1;
        int rangeUpper = middle + 1;
        for (int i = left; i <= middle; i++) {
            // Prefix sums less than lower
            while (rangeLower <= right && prefixSum[rangeLower] - prefixSum[i] < lower) {
                rangeLower++;
            }
            // Prefix sum less than or equal to upper
            while (rangeUpper <= right && prefixSum[rangeUpper] - prefixSum[i] <= upper) {
                rangeUpper++;
            }
            // Count will be
            count += (rangeUpper - rangeLower);
        }
        // Now, conquer the array
        conquer(prefixSum, left, middle, right);
        return count;
    }

    private void conquer(long[] prefixSum, int left, int middle, int right) {
        // Sizes of the two subarrays to be merged
        int x = middle - left + 1;
        int y = right - middle;
        // Create temp left and right arrays
        long[] L = new long[x];
        long[] R = new long[y];
        // Copy the elements into L and R arrays
        for (int i = 0; i < x; i++) {
            L[i] = prefixSum[left + i];
        }
        for (int j = 0; j < y; j++) {
            R[j] = prefixSum[middle + 1 + j];
        }
        // Merge the subarrays
        int i = 0;
        int j = 0;
        int k = left;
        while (i < x && j < y) {
            if (L[i] <= R[j]) {
                prefixSum[k] = L[i];
                i++;
            } else {
                prefixSum[k] = R[j];
                j++;
            }
            k++;
        }
        // Add remaining elements in the array if any
        while (i < x) {
            prefixSum[k] = L[i];
            i++;
            k++;
        }
        while (j < y) {
            prefixSum[k] = R[j];
            j++;
            k++;
        }
    }
}
