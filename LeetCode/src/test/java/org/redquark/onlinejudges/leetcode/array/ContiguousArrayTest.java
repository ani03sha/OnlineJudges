package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContiguousArrayTest {

    private final ContiguousArray testObject = new ContiguousArray();

    @Test
    public void testFindMaxLength() {
        int[] nums = new int[]{0, 1};
        assertEquals(2, testObject.findMaxLength(nums));

        nums = new int[]{0, 1, 0};
        assertEquals(2, testObject.findMaxLength(nums));
    }
}