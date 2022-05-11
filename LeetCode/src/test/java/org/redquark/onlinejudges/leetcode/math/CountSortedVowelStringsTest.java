package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSortedVowelStringsTest {

    private final CountSortedVowelStrings testObject = new CountSortedVowelStrings();

    @Test
    public void countVowelStrings() {
        assertEquals(5, testObject.countVowelStrings(1));
        assertEquals(15, testObject.countVowelStrings(2));
        assertEquals(66045, testObject.countVowelStrings(33));
    }
}