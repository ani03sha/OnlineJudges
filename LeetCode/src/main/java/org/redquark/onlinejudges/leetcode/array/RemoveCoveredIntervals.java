package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Anirudh Sharma
 */
public class RemoveCoveredIntervals {

    public int removeCoveredIntervals(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // Uncovered intervals
        int uncovered = 0;
        // Left and right bounds
        int left = -1;
        int right = -1;
        // Loop through all the intervals
        for (int[] interval : intervals) {
            // Check if the interval is uncovered
            if (left < interval[0] && right < interval[1]) {
                left = interval[0];
                uncovered++;
            }
            right = Math.max(right, interval[1]);
        }
        return uncovered;
    }
}
