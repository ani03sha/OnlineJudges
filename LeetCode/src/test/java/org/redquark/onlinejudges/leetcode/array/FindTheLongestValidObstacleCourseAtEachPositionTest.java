package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindTheLongestValidObstacleCourseAtEachPositionTest {

    private final FindTheLongestValidObstacleCourseAtEachPosition testObject = new FindTheLongestValidObstacleCourseAtEachPosition();

    @Test
    public void testLongestObstacleCourseAtEachPosition() {
        int[] obstacles = new int[]{1, 2, 3, 2};
        int[] expected = new int[]{1, 2, 3, 3};
        assertArrayEquals(expected, testObject.longestObstacleCourseAtEachPosition(obstacles));

        obstacles = new int[]{2, 2, 1};
        expected = new int[]{1, 2, 1};
        assertArrayEquals(expected, testObject.longestObstacleCourseAtEachPosition(obstacles));

        obstacles = new int[]{3, 1, 5, 6, 4, 2};
        expected = new int[]{1, 1, 2, 3, 2, 2};
        assertArrayEquals(expected, testObject.longestObstacleCourseAtEachPosition(obstacles));
    }
}