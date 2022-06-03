package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.dp.RangeSumQuery2DImmutable.NumMatrix;

public class RangeSumQuery2DImmutableTest {

    @Test
    public void test() {
        int[][] matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix testObject = new NumMatrix(matrix);
        assertEquals(8, testObject.sumRegion(2, 1, 4, 3));
        assertEquals(11, testObject.sumRegion(1, 1, 2, 2));
        assertEquals(12, testObject.sumRegion(1, 2, 2, 4));
    }

}