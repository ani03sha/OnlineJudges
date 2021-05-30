package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestArithmeticSubsequenceOfGivenDifferenceTest {

    private final LongestArithmeticSubsequenceOfGivenDifference testObject = new LongestArithmeticSubsequenceOfGivenDifference();

    @Test
    public void testLongestSubsequence() {
        int[] arr = new int[]{1, 2, 3, 4};
        int difference = 1;
        assertEquals(4, testObject.longestSubsequence(arr, difference));

        arr = new int[]{1, 3, 5, 7};
        difference = 1;
        assertEquals(1, testObject.longestSubsequence(arr, difference));

        arr = new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1};
        difference = -2;
        assertEquals(4, testObject.longestSubsequence(arr, difference));
    }
}