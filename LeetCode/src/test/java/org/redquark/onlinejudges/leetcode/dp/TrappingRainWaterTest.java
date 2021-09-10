package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    private final TrappingRainWater testObject = new TrappingRainWater();

    @Test
    public void testTrap() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, testObject.trap(height));

        height = new int[]{4, 2, 0, 3, 2, 5};
        assertEquals(9, testObject.trap(height));
    }
}