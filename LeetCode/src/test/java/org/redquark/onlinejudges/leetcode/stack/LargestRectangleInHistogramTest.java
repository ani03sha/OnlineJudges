package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestRectangleInHistogramTest {

    private final LargestRectangleInHistogram testObject = new LargestRectangleInHistogram();

    @Test
    public void testLargestRectangleArea() {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        assertEquals(10, testObject.largestRectangleArea(heights));

        heights = new int[]{2, 4};
        assertEquals(4, testObject.largestRectangleArea(heights));
    }
}