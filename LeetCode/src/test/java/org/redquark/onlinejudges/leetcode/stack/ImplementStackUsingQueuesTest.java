package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.onlinejudges.leetcode.stack.ImplementStackUsingQueues.MyStack;

public class ImplementStackUsingQueuesTest {

    private final MyStack testObject = new MyStack();

    @Test
    public void test() {
        testObject.push(1);
        assertEquals(1, testObject.top());
        testObject.push(2);
        assertFalse(testObject.empty());
        assertEquals(2, testObject.top());
        assertEquals(2, testObject.pop());
        assertEquals(1, testObject.pop());
        assertTrue(testObject.empty());
    }

}