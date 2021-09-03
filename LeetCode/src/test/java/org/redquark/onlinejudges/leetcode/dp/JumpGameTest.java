package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpGameTest {

    private final JumpGame testObject = new JumpGame();

    @Test
    public void testCanJump() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        assertTrue(testObject.canJump(nums));

        nums = new int[]{3, 2, 1, 0, 4};
        assertFalse(testObject.canJump(nums));
    }
}