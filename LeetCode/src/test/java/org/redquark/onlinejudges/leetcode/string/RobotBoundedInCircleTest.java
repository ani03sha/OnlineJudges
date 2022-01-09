package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotBoundedInCircleTest {

    private final RobotBoundedInCircle testObject = new RobotBoundedInCircle();

    @Test
    public void testIsRobotBounded() {
        String instructions = "GGLLGG";
        assertTrue(testObject.isRobotBounded(instructions));

        instructions = "GG";
        assertFalse(testObject.isRobotBounded(instructions));

        instructions = "GL";
        assertTrue(testObject.isRobotBounded(instructions));
    }
}