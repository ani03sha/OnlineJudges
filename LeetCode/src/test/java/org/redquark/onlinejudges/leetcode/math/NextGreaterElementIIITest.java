package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextGreaterElementIIITest {

    private final NextGreaterElementIII testObject = new NextGreaterElementIII();

    @Test
    public void testNextGreaterElement() {
        assertEquals(132, testObject.nextGreaterElement(123));
        assertEquals(-1, testObject.nextGreaterElement(21));
    }
}