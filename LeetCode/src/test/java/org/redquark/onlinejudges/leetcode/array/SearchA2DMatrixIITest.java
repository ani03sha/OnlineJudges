package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchA2DMatrixIITest {

    private final SearchA2DMatrixII testObject = new SearchA2DMatrixII();

    @Test
    public void testSearchMatrix() {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        assertTrue(testObject.searchMatrix(matrix, target));

        target = 20;
        assertFalse(testObject.searchMatrix(matrix, target));
    }
}