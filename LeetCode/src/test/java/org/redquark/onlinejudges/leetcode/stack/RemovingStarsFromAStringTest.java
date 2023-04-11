package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovingStarsFromAStringTest {

    private final RemovingStarsFromAString testObject = new RemovingStarsFromAString();

    @Test
    public void testRemoveStars() {
        String s = "leet**cod*e";
        assertEquals("lecoe", testObject.removeStars(s));

        s = "erase*****";
        assertEquals("", testObject.removeStars(s));
    }
}