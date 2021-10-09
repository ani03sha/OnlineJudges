package org.redquark.onlinejudges.leetcode.array;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Array to store the result
        int[] products = new int[n];
        // A variable to keep track of product so far
        int temp = 1;
        // Initialize the first element in the result array
        products[0] = temp;
        // Loop through the array from left to right
        for (int i = 1; i < n; i++) {
            temp *= nums[i - 1];
            products[i] = temp;
        }
        // Reset the temp
        temp = 1;
        // Loop through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            products[i] *= temp;
            temp *= nums[i];
        }
        return products;
    }
}
