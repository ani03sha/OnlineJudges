package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumInsertionStepsToMakeAStringPalindromeTest {

    private final MinimumInsertionStepsToMakeAStringPalindrome testObject = new MinimumInsertionStepsToMakeAStringPalindrome();

    @Test
    public void testMinInsertions() {
        String s = "zzazz";
        assertEquals(0, testObject.minInsertions(s));

        s = "mbadm";
        assertEquals(2, testObject.minInsertions(s));

        s = "leetcode";
        assertEquals(5, testObject.minInsertions(s));
    }
}