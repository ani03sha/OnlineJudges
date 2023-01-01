package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumPathSumInMatrixTest {

    private final MaximumPathSumInMatrix testObject = new MaximumPathSumInMatrix();

    @Test
    public void testFindMaxPath() {
        int[][] M = new int[][]{
                {12, 22, 5, 0, 20, 18},
                {0, 2, 5, 25, 18, 17},
                {12, 10, 5, 4, 2, 1},
                {3, 8, 2, 20, 10, 8}
        };
        assertEquals(70, testObject.findMaxPath(M));
    }
}