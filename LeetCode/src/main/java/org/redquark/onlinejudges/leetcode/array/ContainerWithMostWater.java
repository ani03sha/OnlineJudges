package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        // Special case
        if (height == null || height.length < 2) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Left and right pointers
        int left = 0;
        int right = height.length - 1;
        // Variable to keep track of the maximum area
        int maxArea = 0;
        // Loop through the array until two pointers meet
        while (left < right) {
            // Current area
            int currentArea = (right - left) * (Math.min(height[left], height[right]));
            // Update the maxArea, if required
            maxArea = Math.max(maxArea, currentArea);
            // Check if we can find the longer bar at any one end
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
