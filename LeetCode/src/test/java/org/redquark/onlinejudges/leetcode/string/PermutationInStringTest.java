package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationInStringTest {

    private final PermutationInString testObject = new PermutationInString();

    @Test
    public void testCheckInclusion() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertTrue(testObject.checkInclusion(s1, s2));

        s1 = "ab";
        s2 = "eidboaoo";
        assertFalse(testObject.checkInclusion(s1, s2));
    }
}