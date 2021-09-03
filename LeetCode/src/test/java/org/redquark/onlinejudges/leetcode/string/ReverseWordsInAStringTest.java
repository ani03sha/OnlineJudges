package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAStringTest {

    private final ReverseWordsInAString testObject = new ReverseWordsInAString();

    @Test
    public void testReverseWords() {
        String s = "the sky is blue";
        assertEquals("blue is sky the", testObject.reverseWords(s));

        s = "  hello world  ";
        assertEquals("world hello", testObject.reverseWords(s));

        s = "a good   example";
        assertEquals("example good a", testObject.reverseWords(s));

        s = "  Bob    Loves  Alice   ";
        assertEquals("Alice Loves Bob", testObject.reverseWords(s));

        s = "Alice does not even like bob";
        assertEquals("bob like even not does Alice", testObject.reverseWords(s));
    }
}