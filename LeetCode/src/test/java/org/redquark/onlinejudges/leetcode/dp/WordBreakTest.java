package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakTest {

    private final WordBreak testObject = new WordBreak();

    @Test
    public void testWordBreak() {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        assertTrue(testObject.wordBreak(s, wordDict));

        s = "applepenapple";
        wordDict = Arrays.asList("apple", "pen");
        assertTrue(testObject.wordBreak(s, wordDict));

        s = "catsandog";
        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertFalse(testObject.wordBreak(s, wordDict));
    }
}