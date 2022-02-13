package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Swap the arrays if length of nums1 is greater
        // than the length of nums2
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        // Lengths of two arrays
        int x = nums1.length;
        int y = nums2.length;
        // left and right pointers for smaller array
        int left = 0;
        int right = x;
        // Loop until the two pointers meet
        while (left <= right) {
            // Calculate the partitions
            int partitionX = (left + right) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;
            // Find the boundary elements
            int leftMaxX = partitionX == 0 ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int rightMinX = partitionX == x ? Integer.MAX_VALUE : nums1[partitionX];
            int leftMaxY = partitionY == 0 ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int rightMinY = partitionY == y ? Integer.MAX_VALUE : nums2[partitionY];
            // Check if we have found the correct partition
            if (leftMaxX <= rightMinY && leftMaxY <= rightMinX) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(leftMaxX, leftMaxY) + Math.min(rightMinX, rightMinY)) / 2.0;
                } else {
                    return Math.max(leftMaxX, leftMaxY);
                }
            }
            // If we are too far to the right, we will move left
            else if (leftMaxX > rightMinY) {
                right = partitionX - 1;
            }
            // If we are too far to the left, we will move right
            else {
                left = partitionX + 1;
            }
        }
        // If we have come here, it means our input was not correct
        throw new IllegalArgumentException("Invalid input!");
    }
}
