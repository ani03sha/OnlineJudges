package org.redquark.onlinejudges.leetcode.array;

public class ProductOfArrayExceptSelf {

    /**
     * Space complexity - O(n)
     */
    public int[] productExceptSelfSolutionOne(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Array to store the left products
        int[] leftProducts = new int[n];
        // Array to store right products
        int[] rightProducts = new int[n];
        // Since we don't have any element before first element and
        // no element after last element, we assign 1 for them in
        // left and right arrays
        leftProducts[0] = 1;
        rightProducts[n - 1] = 1;
        // Traverse from left to right
        for (int i = 1; i < n; i++) {
            leftProducts[i] = nums[i - 1] * leftProducts[i - 1];
        }
        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        }
        // Now for final output we will multiply both arrays
        for (int i = 0; i < n; i++) {
            leftProducts[i] *= rightProducts[i];
        }
        return leftProducts;
    }

    /**
     * Space complexity - O(1)
     */
    public int[] productExceptSelfSolutionTwo(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Cumulative product
        int cumulativeProduct = 1;
        // Array to store the final output
        int[] output = new int[n];
        // Traverse from left to right
        for (int i = 0; i < n; i++) {
            output[i] = cumulativeProduct;
            cumulativeProduct *= nums[i];
        }
        // Reset the cumulative product
        cumulativeProduct = 1;
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= cumulativeProduct;
            cumulativeProduct *= nums[i];
        }
        return output;
    }
}
