package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLengthOfPairChainTest {

    private final MaximumLengthOfPairChain testObject = new MaximumLengthOfPairChain();

    @Test
    public void testFindLongestChain() {
        int[][] pairs = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4}
        };
        assertEquals(2, testObject.findLongestChain(pairs));

        pairs = new int[][]{
                {1, 2},
                {7, 8},
                {4, 5}
        };
        assertEquals(3, testObject.findLongestChain(pairs));
    }
}