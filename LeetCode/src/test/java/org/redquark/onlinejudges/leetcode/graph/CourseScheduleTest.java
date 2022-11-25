package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseScheduleTest {

    private final CourseSchedule testObject = new CourseSchedule();

    @Test
    public void testCanFinishDFS() {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{
                {1, 0}
        };
        assertTrue(testObject.canFinishDFS(numCourses, prerequisites));

        prerequisites = new int[][]{
                {1, 0},
                {0, 1}
        };
        assertFalse(testObject.canFinishDFS(numCourses, prerequisites));

        numCourses = 1;
        prerequisites = new int[][]{};
        assertTrue(testObject.canFinishDFS(numCourses, prerequisites));

        numCourses = 2;
        prerequisites = new int[][]{
                {0, 1}
        };
        assertTrue(testObject.canFinishDFS(numCourses, prerequisites));

        numCourses = 5;
        prerequisites = new int[][]{
                {1, 4},
                {2, 4},
                {3, 1},
                {3, 2}
        };
        assertTrue(testObject.canFinishDFS(numCourses, prerequisites));
    }

    @Test
    public void testCanFinishBFS() {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{
                {1, 0}
        };
        assertTrue(testObject.canFinishBFS(numCourses, prerequisites));

        prerequisites = new int[][]{
                {1, 0},
                {0, 1}
        };
        assertFalse(testObject.canFinishBFS(numCourses, prerequisites));

        numCourses = 1;
        prerequisites = new int[][]{};
        assertTrue(testObject.canFinishBFS(numCourses, prerequisites));

        numCourses = 2;
        prerequisites = new int[][]{
                {0, 1}
        };
        assertTrue(testObject.canFinishBFS(numCourses, prerequisites));

        numCourses = 5;
        prerequisites = new int[][]{
                {1, 4},
                {2, 4},
                {3, 1},
                {3, 2}
        };
        assertTrue(testObject.canFinishBFS(numCourses, prerequisites));
    }
}