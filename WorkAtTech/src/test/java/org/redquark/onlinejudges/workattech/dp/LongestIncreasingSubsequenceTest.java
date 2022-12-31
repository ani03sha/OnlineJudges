package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubsequenceTest {

    private final LongestIncreasingSubsequence testObject = new LongestIncreasingSubsequence();

    @Test
    public void testGetLengthOfLIS() {
        int[] A = new int[]{10, 20, 2, 5, 3, 8, 8, 25, 6};
        assertEquals(4, testObject.getLengthOfLIS(A));
    }
}