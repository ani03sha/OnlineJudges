package org.redquark.onlinejudges.leetcode.array;

public class SortAnArray {

    /**
     * Time complexity - O(n * log(n))
     * Space complexity - O(n)
     */
    public int[] sortArray(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Divide the array into smaller portions
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    private void divide(int[] nums, int left, int right) {
        // We will perform division for valid indices
        if (left < right) {
            // Get the middle index
            int middle = left + (right - left) / 2;
            // Divide the left and right halves further
            divide(nums, left, middle);
            divide(nums, middle + 1, right);
            // Conquer the arrays
            conquer(nums, left, middle, right);
        }
    }

    private void conquer(int[] nums, int left, int middle, int right) {
        // Sizes of the two subarrays to be merged
        int x = middle - left + 1;
        int y = right - middle;
        // Create temp left and right arrays
        int[] L = new int[x];
        int[] R = new int[y];
        // Copy the elements into L and R arrays
        for (int i = 0; i < x; i++) {
            L[i] = nums[left + i];
        }
        for (int j = 0; j < y; j++) {
            R[j] = nums[middle + 1 + j];
        }
        // Merge the subarrays
        int i = 0;
        int j = 0;
        int k = left;
        while (i < x && j < y) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        // Add remaining elements in the array if any
        while (i < x) {
            nums[k] = L[i];
            i++;
            k++;
        }
        while (j < y) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }
}
