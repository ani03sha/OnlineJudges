package org.redquark.onlinejudges.leetcode.array;

public class FindTheLongestValidObstacleCourseAtEachPosition {

    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        // Special case
        if (obstacles == null || obstacles.length == 0) {
            return new int[]{};
        }
        // Length of the obstacles
        int n = obstacles.length;
        // Array to store the longest valid obstacle course
        int[] longestCourse = new int[n];
        // Height of the shortest ending obstacle for courses
        // of each length
        int[] shortestEndingObstacle = new int[n];
        // Variable to keep track of valid longest non-decreasing
        // length for the index i
        int length = 0;
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Height of the current obstacle
            int height = obstacles[i];
            // Find the rightmost insertion position index
            int index = search(shortestEndingObstacle, height, length);
            if (index == length) {
                length++;
            }
            shortestEndingObstacle[index] = height;
            longestCourse[i] = index + 1;
        }
        return longestCourse;
    }

    private int search(int[] shortestEndingObstacle, int target, int right) {
        if (right == 0) {
            return 0;
        }
        int left = 0;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (shortestEndingObstacle[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}
