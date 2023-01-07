package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidCourseScheduleTest {

    private final ValidCourseSchedule testObject = new ValidCourseSchedule();

    @Test
    public void testCanCompleteProgram() {
        int n = 6;
        int[][] prerequisites = new int[][]{
                {1, 0},
                {2, 0},
                {3, 1},
                {4, 3},
                {5, 4},
                {4, 2}
        };
        assertTrue(testObject.canCompleteProgram(n, prerequisites));

        prerequisites = new int[][]{
                {1, 0},
                {2, 0},
                {3, 1},
                {4, 3},
                {5, 4},
                {4, 2},
                {2, 5}
        };
        assertFalse(testObject.canCompleteProgram(n, prerequisites));
    }
}