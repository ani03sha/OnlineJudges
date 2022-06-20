package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortEncodingOfWordsTest {

    private final ShortEncodingOfWords testObject = new ShortEncodingOfWords();

    @Test
    public void testMinimumLengthEncoding() {
        String[] words = new String[]{"time", "me", "bell"};
        assertEquals(10, testObject.minimumLengthEncoding(words));

        words = new String[]{"t"};
        assertEquals(2, testObject.minimumLengthEncoding(words));
    }
}