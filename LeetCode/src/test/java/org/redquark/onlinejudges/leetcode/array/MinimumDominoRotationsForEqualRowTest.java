package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDominoRotationsForEqualRowTest {

    private final MinimumDominoRotationsForEqualRow testObject = new MinimumDominoRotationsForEqualRow();

    @Test
    public void testMinDominoRotations() {
        int[] tops = new int[]{2, 1, 2, 4, 2, 2};
        int[] bottoms = new int[]{5, 2, 6, 2, 3, 2};
        assertEquals(2, testObject.minDominoRotations(tops, bottoms));

        tops = new int[]{3, 5, 1, 2, 3};
        bottoms = new int[]{3, 6, 3, 3, 4};
        assertEquals(-1, testObject.minDominoRotations(tops, bottoms));
    }
}