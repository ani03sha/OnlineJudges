package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence testObject = new LongestConsecutiveSequence();

    @Test
    public void testLongestConsecutive() {
        int[] nums = new int[]{200, 4, 100, 1, 3, 2};
        assertEquals(4, testObject.longestConsecutive(nums));

        nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        assertEquals(9, testObject.longestConsecutive(nums));
    }
}