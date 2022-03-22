package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestStringWithAGivenNumericValueTest {

    private final SmallestStringWithAGivenNumericValue testObject = new SmallestStringWithAGivenNumericValue();

    @Test
    public void testGetSmallestString() {
        assertEquals("aay", testObject.getSmallestString(3, 27));
        assertEquals("aaszz", testObject.getSmallestString(5, 73));
    }
}