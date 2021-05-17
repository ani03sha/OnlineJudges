package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {

    private final ClimbingStairs testObject = new ClimbingStairs();

    @Test
    public void testClimbStairs() {
        assertEquals(2, testObject.climbStairs(2));
        assertEquals(3, testObject.climbStairs(3));
    }
}