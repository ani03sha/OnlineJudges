package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKFrequentElementsTest {

    private final TopKFrequentElements testObject = new TopKFrequentElements();

    @Test
    public void testTopKFrequent() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, testObject.topKFrequent(nums, k));

        nums = new int[]{1};
        k = 1;
        expected = new int[]{1};
        assertArrayEquals(expected, testObject.topKFrequent(nums, k));
    }
}