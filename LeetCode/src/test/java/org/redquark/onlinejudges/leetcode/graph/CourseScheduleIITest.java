package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CourseScheduleIITest {

    private final CourseScheduleII testObject = new CourseScheduleII();

    @Test
    public void testFindOrder() {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{
                {1, 0}
        };
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, testObject.findOrder(numCourses, prerequisites));

        numCourses = 4;
        prerequisites = new int[][]{
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };
        expected = new int[]{0, 2, 1, 3};
        assertArrayEquals(expected, testObject.findOrder(numCourses, prerequisites));
    }
}