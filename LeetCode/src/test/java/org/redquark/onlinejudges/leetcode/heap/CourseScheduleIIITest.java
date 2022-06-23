package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseScheduleIIITest {

    private final CourseScheduleIII testObject = new CourseScheduleIII();

    @Test
    public void testScheduleCourse() {
        int[][] courses = new int[][]{
                {100, 200},
                {200, 1300},
                {1000, 1250},
                {2000, 3200}
        };
        assertEquals(3, testObject.scheduleCourse(courses));

        courses = new int[][]{
                {1, 2}
        };
        assertEquals(1, testObject.scheduleCourse(courses));

        courses = new int[][]{
                {3, 2},
                {4, 3}
        };
        assertEquals(0, testObject.scheduleCourse(courses));
    }
}