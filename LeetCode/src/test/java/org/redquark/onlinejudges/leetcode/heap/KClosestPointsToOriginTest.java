package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KClosestPointsToOriginTest {

    private final KClosestPointsToOrigin kClosestPointsToOrigin = new KClosestPointsToOrigin();

    @Test
    public void testKClosestBruteForce() {
        int[][] points = new int[][]{
                {1, 3},
                {-2, 2}
        };
        int k = 1;
        int[][] expected = new int[][]{
                {-2, 2}
        };
        assertArrayEquals(expected, kClosestPointsToOrigin.kClosestBruteForce(points, k));

        points = new int[][]{
                {3, 3},
                {5, -1},
                {-2, 4}
        };
        k = 2;
        expected = new int[][]{
                {3, 3},
                {-2, 4}
        };
        assertArrayEquals(expected, kClosestPointsToOrigin.kClosestBruteForce(points, k));
    }

    @Test
    public void testKClosestCleaner() {
        int[][] points = new int[][]{
                {1, 3},
                {-2, 2}
        };
        int k = 1;
        int[][] expected = new int[][]{
                {-2, 2}
        };
        assertArrayEquals(expected, kClosestPointsToOrigin.kClosestCleaner(points, k));

        points = new int[][]{
                {3, 3},
                {5, -1},
                {-2, 4}
        };
        k = 2;
        expected = new int[][]{
                {3, 3},
                {-2, 4}
        };
        assertArrayEquals(expected, kClosestPointsToOrigin.kClosestCleaner(points, k));
    }
}