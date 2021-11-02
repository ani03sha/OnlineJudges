package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsIITest {

    private final UniquePathsII testObject = new UniquePathsII();

    @Test
    public void testUniquePathsWithObstacles() {
        int[][] obstacleGrid = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assertEquals(2, testObject.uniquePathsWithObstacles(obstacleGrid));

        obstacleGrid = new int[][]{
                {0, 1}, {0, 0}
        };
        assertEquals(1, testObject.uniquePathsWithObstacles(obstacleGrid));
    }
}