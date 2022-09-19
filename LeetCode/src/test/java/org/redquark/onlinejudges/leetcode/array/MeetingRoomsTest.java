package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeetingRoomsTest {

    private final MeetingRooms meetingRooms = new MeetingRooms();

    @Test
    public void testCanAttendMeetings() {
        int[][] intervals = new int[][]{
                {0, 30},
                {5, 10},
                {15, 20}
        };
        assertFalse(meetingRooms.canAttendMeetings(intervals));

        intervals = new int[][]{
                {7, 10},
                {2, 4}
        };
        assertTrue(meetingRooms.canAttendMeetings(intervals));
    }
}