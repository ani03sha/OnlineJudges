package org.redquark.onlinejudges.workattech.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.workattech.greedy.MaxMeetingsInARoom.Meeting;

public class MaxMeetingsInARoomTest {

    private final MaxMeetingsInARoom testObject = new MaxMeetingsInARoom();

    @Test
    public void testGetMaxMeetings() {
        Meeting[] meetings = new Meeting[]{
                new Meeting(3, 29),
                new Meeting(50, 93),
                new Meeting(88, 92),
                new Meeting(54, 67),
                new Meeting(50, 87)
        };
        assertEquals(3, testObject.getMaxMeetings(meetings));
    }
}