package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // Index for the elements of the merged array
        int index = nums1.length - 1;
        // Decrement the m and n indices to get the elements of the array
        m--;
        n--;
        // Loop until there are elements in the nums2
        while (m >= 0 && n >= 0) {
            // Get the greater element from both arrays and store
            // it at the position defined by the index
            if (nums1[m] > nums2[n]) {
                nums1[index] = nums1[m];
                m--;
            } else {
                nums1[index] = nums2[n];
                n--;
            }
            index--;
        }
        // Loop for the remaining elements in nums2
        while (n >= 0) {
            nums1[index] = nums2[n];
            n--;
            index--;
        }
        return nums1;
    }
}
