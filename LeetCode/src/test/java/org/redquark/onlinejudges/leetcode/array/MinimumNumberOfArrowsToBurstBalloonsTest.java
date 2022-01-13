package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfArrowsToBurstBalloonsTest {

    private final MinimumNumberOfArrowsToBurstBalloons testObject = new MinimumNumberOfArrowsToBurstBalloons();

    @Test
    public void testFindMinArrowShots() {
        int[][] points = new int[][]{
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        };
        assertEquals(2, testObject.findMinArrowShots(points));

        points = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        assertEquals(4, testObject.findMinArrowShots(points));

        points = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };
        assertEquals(2, testObject.findMinArrowShots(points));
    }
}