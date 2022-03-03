package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {

    private final HappyNumber testObject = new HappyNumber();

    @Test
    public void testIsHappy() {
        assertTrue(testObject.isHappy(19));
        assertFalse(testObject.isHappy(2));
    }
}