package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstBadVersionTest {

    private final FirstBadVersion testObject = new FirstBadVersion();

    @Test
    public void testFirstBadVersion() {
        assertEquals(4, testObject.firstBadVersion(5));
    }
}