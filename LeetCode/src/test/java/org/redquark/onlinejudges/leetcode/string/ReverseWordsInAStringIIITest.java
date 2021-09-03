package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAStringIIITest {

    private final ReverseWordsInAStringIII testObject = new ReverseWordsInAStringIII();

    @Test
    public void testReverseWords() {
        String s = "Let's take LeetCode contest";
        assertEquals("s'teL ekat edoCteeL tsetnoc", testObject.reverseWords(s));

        s = "God Ding";
        assertEquals("doG gniD", testObject.reverseWords(s));
    }
}