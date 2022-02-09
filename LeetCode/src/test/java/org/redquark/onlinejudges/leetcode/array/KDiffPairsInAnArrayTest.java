package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KDiffPairsInAnArrayTest {

    private final KDiffPairsInAnArray testObject = new KDiffPairsInAnArray();

    @Test
    public void testFindPairs() {
        int[] nums = new int[]{3, 1, 4, 1, 5};
        int k = 2;
        assertEquals(2, testObject.findPairs(nums, k));

        nums = new int[]{1, 2, 3, 4, 5};
        k = 1;
        assertEquals(4, testObject.findPairs(nums, k));

        nums = new int[]{1, 3, 1, 5, 4};
        k = 0;
        assertEquals(1, testObject.findPairs(nums, k));
    }
}