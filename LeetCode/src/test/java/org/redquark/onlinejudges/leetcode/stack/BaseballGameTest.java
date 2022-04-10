package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseballGameTest {

    private final BaseballGame testObject = new BaseballGame();

    @Test
    public void testCalPoints() {
        String[] ops = new String[]{"5", "2", "C", "D", "+"};
        assertEquals(30, testObject.calPoints(ops));

        ops = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        assertEquals(27, testObject.calPoints(ops));

        ops = new String[]{"1"};
        assertEquals(1, testObject.calPoints(ops));
    }
}