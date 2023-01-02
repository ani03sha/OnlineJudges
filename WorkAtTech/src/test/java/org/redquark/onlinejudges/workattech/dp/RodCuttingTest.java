package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RodCuttingTest {

    private final RodCutting testObject = new RodCutting();

    @Test
    public void testMaximumProfit() {
        int n = 8;
        int[] prices = new int[]{1, 3, 4, 5, 7, 9, 10, 11};
        assertEquals(12, testObject.maximumProfit(n, prices));
    }
}