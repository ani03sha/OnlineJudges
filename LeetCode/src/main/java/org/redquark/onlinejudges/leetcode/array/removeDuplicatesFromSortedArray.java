package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class removeDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Count of unique elements in the array
        int uniques = 0;
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // If the current element is equal to the next element,
            // we will skip it
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // Else store the element at the current place determined
            // by uniques
            nums[uniques] = nums[i];
            uniques++;
        }
        return uniques;
    }
}
