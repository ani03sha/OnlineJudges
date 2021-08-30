package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // Base case
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }
        // Sort the intervals based on start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // List to store merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        // Current interval
        int[] currentInterval = intervals[0];
        // Add this interval to the list
        mergedIntervals.add(currentInterval);
        // Traverse for all the intervals
        for (int[] interval : intervals) {
            // Get the end of the current interval
            int currentEnd = currentInterval[1];
            // Get the beginning and ending of the next interval
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            // If the next begin is less than or equal to
            // the current end, we will merge
            if (nextBegin <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }
            // If not, we will add the next interval in the list
            else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
