package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAllAnagramsInAStringTest {

    private final FindAllAnagramsInAString testObject = new FindAllAnagramsInAString();

    @Test
    public void testFindAnagrams() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = Arrays.asList(0, 6);
        assertEquals(expected, testObject.findAnagrams(s, p));

        s = "abab";
        p = "ab";
        expected = Arrays.asList(0, 1, 2);
        assertEquals(expected, testObject.findAnagrams(s, p));
    }
}