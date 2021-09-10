package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        // Special case
        if (height == null || height.length == 0) {
            return 0;
        }
        // Variables to store the left max and right max
        // until a certain index
        int leftMax = 0;
        int rightMax = 0;
        // Two pointers for traversing the array
        int left = 0;
        int right = height.length - 1;
        // Total rain water accumulated
        int totalWater = 0;
        // Loop until the two pointers meet
        while (left <= right) {
            // Go to the side which has lower height between left and right
            if (height[left] < height[right]) {
                // Update the leftMax if required
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                // Update the rightMax if required
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}
