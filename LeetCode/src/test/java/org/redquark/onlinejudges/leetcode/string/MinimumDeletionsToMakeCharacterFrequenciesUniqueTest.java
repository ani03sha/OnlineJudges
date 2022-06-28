package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {

    private final MinimumDeletionsToMakeCharacterFrequenciesUnique testObject =
            new MinimumDeletionsToMakeCharacterFrequenciesUnique();

    @Test
    public void testMinDeletions() {
        String s = "aab";
        assertEquals(0, testObject.minDeletions(s));

        s = "aaabbbcc";
        assertEquals(2, testObject.minDeletions(s));

        s = "ceabaacb";
        assertEquals(2, testObject.minDeletions(s));
    }
}