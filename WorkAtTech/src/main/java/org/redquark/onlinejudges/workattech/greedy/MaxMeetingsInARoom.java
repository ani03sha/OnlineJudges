package org.redquark.onlinejudges.workattech.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxMeetingsInARoom {

    int getMaxMeetings(Meeting[] meetings) {
        // Special case
        if (meetings == null || meetings.length == 0) {
            return 0;
        }
        // Sort the meetings based on the start time
        Arrays.sort(meetings, Comparator.comparingInt(meeting -> meeting.end));
        // Number of meetings that can be held
        int meetingCount = 0;
        // Time at which a certain meeting ends
        int endTime = 0;
        // Loop through the meetings array
        for (Meeting meeting : meetings) {
            if (meeting.start >= endTime) {
                meetingCount++;
                endTime = meeting.end;
            }
        }
        return meetingCount;
    }

    static class Meeting {
        public int start;
        public int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start + ", " + end + "]";
        }
    }
}
