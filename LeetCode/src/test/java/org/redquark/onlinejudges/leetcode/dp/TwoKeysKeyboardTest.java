package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoKeysKeyboardTest {

    private final TwoKeysKeyboard testObject = new TwoKeysKeyboard();

    @Test
    public void testMinSteps() {
        int n = 3;
        assertEquals(3, testObject.minSteps(n));

        n = 1;
        assertEquals(0, testObject.minSteps(n));

        n = 1000;
        assertEquals(21, testObject.minSteps(n));
    }
}