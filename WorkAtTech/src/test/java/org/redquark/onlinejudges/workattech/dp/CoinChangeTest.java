package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {

    private final CoinChange testObject = new CoinChange();

    @Test
    public void testNumberOfCombinations() {
        int[] coins = new int[]{5, 2, 4};
        int target = 13;
        assertEquals(3, testObject.numberOfCombinations(coins, target));
    }
}