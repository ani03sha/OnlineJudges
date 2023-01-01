package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsetSum2Test {

    private final SubsetSum2 testObject = new SubsetSum2();

    @Test
    public void testSubsetSum() {
        int[] A = new int[]{3, 0, 4, 9, 5};
        int target = 17;
        assertEquals(1, testObject.subsetSum(A, target));
    }
}