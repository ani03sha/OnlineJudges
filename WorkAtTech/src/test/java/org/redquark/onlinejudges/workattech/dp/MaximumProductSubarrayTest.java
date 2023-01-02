package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayTest {

    private final MaximumProductSubarray testObject = new MaximumProductSubarray();

    @Test
    public void testMaxProduct() {
        int[] A = new int[]{-1, 3, 2, -1, -2, 3, 0, -2};
        assertEquals(36, testObject.maxProduct(A));

        A = new int[]{3, 0, -1, -2, 3, 0, -2};
        assertEquals(6, testObject.maxProduct(A));
    }
}