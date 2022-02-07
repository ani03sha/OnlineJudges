package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.array.FindTheDifference;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDifferenceTest {

    private final FindTheDifference testObject = new FindTheDifference();

    @Test
    public void testFindTheDifference() {
        String s = "abcd";
        String t = "abcde";
        assertEquals('e', testObject.findTheDifference(s, t));

        s = "";
        t = "y";
        assertEquals('y', testObject.findTheDifference(s, t));
    }
}