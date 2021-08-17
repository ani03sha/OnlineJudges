package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestDivisibleSubsetTest {

    private final LargestDivisibleSubset testObject = new LargestDivisibleSubset();

    @Test
    public void testLargestDivisibleSubset() {
        int[] nums = new int[]{1, 2, 3};
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, testObject.largestDivisibleSubset(nums));

        nums = new int[]{1, 2, 4, 8};
        expected = Arrays.asList(1, 2, 4, 8);
        assertEquals(expected, testObject.largestDivisibleSubset(nums));
    }
}