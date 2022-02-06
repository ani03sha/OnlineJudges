package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Count of valid elements
        int count = 0;
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Current element in the array
            int currentElement = nums[i];
            // This variable will store the number of contiguous
            // equal elements in the array
            int contiguousCount = 1;
            // Loop until we are finding contiguous elements
            while (i < n - 1 && currentElement == nums[i + 1]) {
                i++;
                contiguousCount++;
            }
            // If there are more than two same contiguous elements,
            // we will choose only two. Else, we will add the
            // unique element in the array
            nums[count++] = currentElement;
            if (contiguousCount >= 2) {
                nums[count++] = currentElement;
            }
        }
        return count;
    }
}
