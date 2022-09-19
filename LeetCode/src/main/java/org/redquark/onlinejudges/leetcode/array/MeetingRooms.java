package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    /**
     * Time complexity - O(n*log(n))
     * Space complexity - O(1)
     */
    public boolean canAttendMeetings(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        // Sort the array by the start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // Loop through the intervals
        for (int i = 0; i < intervals.length - 1; i++) {
            int currentEndTime = intervals[i][1];
            int nextStartTime = intervals[i + 1][0];
            if (currentEndTime > nextStartTime) {
                return false;
            }
        }
        return true;
    }
}
