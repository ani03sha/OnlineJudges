package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductOfWordLengthsTest {

    private final MaximumProductOfWordLengths testObject = new MaximumProductOfWordLengths();

    @Test
    public void maxProduct() {
        String[] words = new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        assertEquals(16, testObject.maxProduct(words));

        words = new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        assertEquals(4, testObject.maxProduct(words));

        words = new String[]{"a", "aa", "aaa", "aaaa"};
        assertEquals(0, testObject.maxProduct(words));
    }
}