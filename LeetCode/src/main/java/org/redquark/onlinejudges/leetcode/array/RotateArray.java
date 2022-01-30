package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class RotateArray {

    public int[] rotate(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Adjust k for cases where k >= n
        k = k % n;
        // Now, reverse the array in stages
        // 1. Complete array
        reverse(nums, 0, n - 1);
        // 2. First k elements
        reverse(nums, 0, k - 1);
        // 3. Remaining elements
        reverse(nums, k, n - 1);
        return nums;
    }

    private void reverse(int[] nums, int left, int right) {
        if (left > right) {
            return;
        }
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
