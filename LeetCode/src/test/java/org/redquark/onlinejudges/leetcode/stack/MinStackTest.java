package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {

    private final MinStack testMinStack = new MinStack();

    @Test
    public void test() {
        testMinStack.push(-2);
        testMinStack.push(0);
        testMinStack.push(-3);
        assertEquals(-3, testMinStack.getMin());
        testMinStack.pop();
        assertEquals(0, testMinStack.top());
        assertEquals(-2, testMinStack.getMin());
    }
}