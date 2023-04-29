package org.redquark.onlinejudges.leetcode.unionfind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CheckingExistenceOfEdgeLengthLimitedPathsTest {

    private final CheckingExistenceOfEdgeLengthLimitedPaths testObject = new CheckingExistenceOfEdgeLengthLimitedPaths();

    @Test
    public void testDistanceLimitedPathsExist() {
        int n = 3;
        int[][] edgeList = new int[][]{
                {0, 1, 2},
                {1, 2, 4},
                {2, 0, 8},
                {1, 0, 16}
        };
        int[][] queries = new int[][]{
                {0, 1, 2},
                {0, 2, 5}
        };
        boolean[] expected = new boolean[]{false, true};
        assertArrayEquals(expected, testObject.distanceLimitedPathsExist(n, edgeList, queries));

        n = 5;
        edgeList = new int[][]{
                {0, 1, 10},
                {1, 2, 5},
                {2, 3, 9},
                {3, 4, 13}
        };
        queries = new int[][]{
                {0, 4, 14},
                {1, 4, 13}
        };
        expected = new boolean[]{true, false};
        assertArrayEquals(expected, testObject.distanceLimitedPathsExist(n, edgeList, queries));
    }
}