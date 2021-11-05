package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrangingCoinsTest {

    private final ArrangingCoins testObject = new ArrangingCoins();

    @Test
    public void testArrangeCoins() {
        assertEquals(2, testObject.arrangeCoins(5));
        assertEquals(3, testObject.arrangeCoins(8));
        assertEquals(6864, testObject.arrangeCoins(23563356));
    }
}