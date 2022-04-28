package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseScheduleTest {

    private final CourseSchedule testObject = new CourseSchedule();

    @Test
    public void testCanFinish() {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{
                {1, 0}
        };
        assertTrue(testObject.canFinish(numCourses, prerequisites));

        numCourses = 2;
        prerequisites = new int[][]{
                {1, 0},
                {0, 1}
        };
        assertFalse(testObject.canFinish(numCourses, prerequisites));
    }
}