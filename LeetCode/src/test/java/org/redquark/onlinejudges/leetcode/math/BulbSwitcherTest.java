package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BulbSwitcherTest {

    private final BulbSwitcher testObject = new BulbSwitcher();

    @Test
    public void testBulbSwitch() {
        assertEquals(1, testObject.bulbSwitch(3));
        assertEquals(0, testObject.bulbSwitch(0));
        assertEquals(1, testObject.bulbSwitch(1));
        assertEquals(3, testObject.bulbSwitch(10));
    }
}