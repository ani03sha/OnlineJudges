package org.redquark.onlinejudges.workattech.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CumulativeSumTest {

    private final CumulativeSum testObject = new CumulativeSum();

    @Test
    public void testGetCumulativeSum() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 3, 6, 10};
        assertArrayEquals(expected, testObject.getCumulativeSum(nums));

        nums = new int[]{1, 1, 1, 1, 1};
        expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, testObject.getCumulativeSum(nums));

        nums = new int[]{1, 3, 5, 7, 9};
        expected = new int[]{1, 4, 9, 16, 25};
        assertArrayEquals(expected, testObject.getCumulativeSum(nums));
    }
}