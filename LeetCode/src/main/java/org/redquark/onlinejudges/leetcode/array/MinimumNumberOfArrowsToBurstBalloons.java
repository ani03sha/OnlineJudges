package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        // Special case
        if (points == null || points.length == 0) {
            return 0;
        }
        // The idea is to sort the balloons by their ending
        // point because it is the last x coordinate from where
        // a balloon can be burst.
        // So we will shoot the balloon from the ending point of
        // the first balloon in the sorted array and compare it
        // with the starting positions of all the balloons. As long
        // as the starting position is less than the shot position,
        // we don't need any other arrow to burst that balloon.
        // Sort the points by their ending poistions
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));
        // Count of arrows required. Initialized with 1
        // because we need at lease one arrow to burst
        int arrows = 1;
        // Position of the shooting arrow
        int position = points[0][1];
        // Loop for remaining points
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= position) {
                continue;
            }
            arrows++;
            // Update the position from where the arrow can be shot
            position = points[i][1];
        }
        return arrows;
    }
}
