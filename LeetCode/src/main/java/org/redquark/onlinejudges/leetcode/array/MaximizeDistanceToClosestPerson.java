package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MaximizeDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {
        // Special case
        if (seats == null || seats.length == 0) {
            return -1;
        }
        // Length of the array
        int n = seats.length;
        // Left and right pointers
        int left = 0;
        int right = 0;
        // Maximum distance
        int maxDistance = 1;
        // Loop through the array of seats
        while (right < n) {
            // Move left pointer as long as we are encountering 1.
            while (left < n && seats[left] == 1) {
                left++;
            }
            // At this point, we will move the right pointer
            right = left;
            while (right < n && seats[right] == 0) {
                right++;
            }
            // Update the maximum distance
            maxDistance = Math.max(maxDistance, (right - left + 1) / 2);
            // Check if we can sit at the ends
            if ((right == n && seats[right - 1] == 0) || left == 0 && seats[left] == 0) {
                maxDistance = Math.max(maxDistance, right - left);
            }
            left++;
        }
        return maxDistance;
    }
}
