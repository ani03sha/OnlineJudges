package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    private final ContainerWithMostWater testObject = new ContainerWithMostWater();

    @Test
    public void testMaxArea() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, testObject.maxArea(height));

        height = new int[]{1, 1};
        assertEquals(1, testObject.maxArea(height));
    }
}