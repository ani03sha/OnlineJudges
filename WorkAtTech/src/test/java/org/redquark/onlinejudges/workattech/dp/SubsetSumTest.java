package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubsetSumTest {

    private final SubsetSum testObject = new SubsetSum();

    @Test
    public void testHasValidSubset() {
        int[] A = new int[]{1, 3, 4, 9, 2};
        int target = 13;
        assertTrue(testObject.hasValidSubset(A, target));
    }
}