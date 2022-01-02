package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairsOfSongsWithTotalDurationsDivisibleBy60Test {

    private final PairsOfSongsWithTotalDurationsDivisibleBy60 testObject = new PairsOfSongsWithTotalDurationsDivisibleBy60();

    @Test
    public void testNumPairsDivisibleBy60() {
        int[] time = new int[]{30, 20, 150, 100, 40};
        assertEquals(3, testObject.numPairsDivisibleBy60(time));

        time = new int[]{60, 60, 60};
        assertEquals(3, testObject.numPairsDivisibleBy60(time));

        time = new int[]{80, 40, 40, 80, 180, 230, 10, 40, 140, 120};
        assertEquals(11, testObject.numPairsDivisibleBy60(time));
    }
}