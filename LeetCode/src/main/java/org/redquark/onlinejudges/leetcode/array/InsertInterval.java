package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        // List to store merged intervals
        List<int[]> result = new ArrayList<>();
        // Left and right pointers
        int start = 0;
        int end = intervals.length;
        // When interval[i] < newInterval
        while (start < end && intervals[start][1] < newInterval[0]) {
            result.add(intervals[start]);
            start++;
        }
        // When interval[i] is neither greater than nor less than newInterval
        while (start < end && intervals[start][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[start][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[start][1], newInterval[1]);
            start++;
        }
        result.add(newInterval);
        // When interval[i] > newInterval
        while (start < end) {
            result.add(intervals[start]);
            start++;
        }
        return result.toArray(new int[0][]);
    }
}
