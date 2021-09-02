package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteAndEarnTest {

    private final DeleteAndEarn testObject = new DeleteAndEarn();

    @Test
    public void testDeleteAndEarn() {
        int[] nums = new int[]{3, 4, 2};
        assertEquals(6, testObject.deleteAndEarn(nums));

        nums = new int[]{2, 2, 3, 3, 3, 4};
        assertEquals(9, testObject.deleteAndEarn(nums));
    }
}