package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.stack.MaximumFrequencyStack.FreqStack;

public class MaximumFrequencyStackTest {

    private final FreqStack testObject = new FreqStack();

    @Test
    public void test() {
        testObject.push(5);
        testObject.push(7);
        testObject.push(5);
        testObject.push(7);
        testObject.push(4);
        testObject.push(5);
        assertEquals(5, testObject.pop());
        assertEquals(7, testObject.pop());
        assertEquals(5, testObject.pop());
        assertEquals(4, testObject.pop());
    }
}