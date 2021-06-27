package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductDifferenceBetweenTwoPairsTest {

    private final MaximumProductDifferenceBetweenTwoPairs testObject = new MaximumProductDifferenceBetweenTwoPairs();

    @Test
    public void testMaxProductDifference() {
        int[] nums = new int[]{5, 6, 2, 7, 4};
        assertEquals(34, testObject.maxProductDifference(nums));

        nums = new int[]{4, 2, 5, 9, 7, 4, 8};
        assertEquals(64, testObject.maxProductDifference(nums));

        nums = new int[]{4, 2, 5, 9, 7, 4, 8, 43, 53, 1, 6, 3, 52, 543, 6, 432, 5, 6, 3, 64, 28, 53,
                1, 5, 56, 42, 5, 114, 6, 73, 3, 4, 2, 5, 9, 7, 4, 8, 43, 53, 1, 6, 3, 52, 543, 6, 432,
                5, 6, 3, 64, 28, 53, 5, 56, 42, 5, 114, 6, 73, 3, 4, 2, 5, 9, 7, 4, 8, 43, 53, 1, 6,
                3, 52, 543, 6, 432, 5, 6, 3, 64, 28, 53, 1, 5, 56, 42, 5, 114, 6, 73, 34, 2, 5, 9, 7,
                4, 8, 43, 53, 1, 6, 3, 52, 543, 6, 432, 5, 6, 3, 64, 28, 53, 1, 5, 56, 42, 5, 114, 6,
                73, 34, 2, 5, 9, 7, 4, 8, 43, 53, 1, 6, 3, 52, 543, 6, 432, 5, 6, 3, 64, 28, 53, 1, 5,
                56, 42, 5, 114, 6, 73, 34, 2, 5, 9, 7, 4, 8, 43, 53, 1, 6, 3, 52, 543, 6, 432, 5, 6, 3,
                64, 28, 53, 1, 5, 56, 42, 5, 114, 6, 73, 34, 2, 5, 9, 7, 4, 8, 43, 53, 1, 6, 3, 52, 543,
                6, 432, 5, 6, 3, 64, 28, 53, 1, 5, 56, 42, 5, 114, 6, 73, 34, 2, 5, 9, 7, 4, 8, 43, 53,
                1, 6, 3, 52, 543, 6, 432, 5, 6, 3, 64, 28, 53, 1, 5, 56, 42, 5, 114, 6, 73, 34, 2, 5,
                9, 7, 4, 8, 43, 53, 1, 6, 3, 52, 543, 6, 432, 5, 6, 3, 64, 28, 53, 1, 5, 56, 42, 5, 114,
                6, 73, 34, 2, 5, 9, 7, 4, 8, 43, 53, 1, 6, 3, 52, 543, 6, 432, 5, 6, 3, 64, 28, 53, 1,
                5, 56, 42, 5, 114, 6, 73, 3, 546};
        assertEquals(296477, testObject.maxProductDifference(nums));
    }
}