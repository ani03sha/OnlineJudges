package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementInASortedMatrixTest {

    private final KthSmallestElementInASortedMatrix testObject = new KthSmallestElementInASortedMatrix();

    @Test
    public void testKthSmallest() {
        int[][] matrix = new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        assertEquals(13, testObject.kthSmallest(matrix, k));

        matrix = new int[][]{
                {-5}
        };
        k = 1;
        assertEquals(-5, testObject.kthSmallest(matrix, k));
    }
}