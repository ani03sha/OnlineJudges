package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGameIITest {

    private final JumpGameII testObject = new JumpGameII();

    @Test
    public void testJump() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        assertEquals(2, testObject.jump(nums));

        nums = new int[]{2, 3, 0, 1, 4};
        assertEquals(2, testObject.jump(nums));
    }
}