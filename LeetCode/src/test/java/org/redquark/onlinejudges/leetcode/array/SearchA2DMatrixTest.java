package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchA2DMatrixTest {

    private final SearchA2DMatrix testObject = new SearchA2DMatrix();

    @Test
    public void testSearchMatrix() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        assertTrue(testObject.searchMatrix(matrix, target));

        matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        target = 13;
        assertFalse(testObject.searchMatrix(matrix, target));
    }
}