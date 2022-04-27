package org.redquark.onlinejudges.leetcode.unionfind;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestStringWithSwapsTest {

    private final SmallestStringWithSwaps testObject = new SmallestStringWithSwaps();

    @Test
    public void testSmallestStringWithSwaps() {
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(Arrays.asList(0, 3));
        pairs.add(Arrays.asList(1, 2));
        assertEquals("bacd", testObject.smallestStringWithSwaps(s, pairs));

        pairs = new ArrayList<>();
        pairs.add(Arrays.asList(0, 3));
        pairs.add(Arrays.asList(1, 2));
        pairs.add(Arrays.asList(0, 2));
        assertEquals("abcd", testObject.smallestStringWithSwaps(s, pairs));

        s = "cba";
        pairs = new ArrayList<>();
        pairs.add(Arrays.asList(0, 1));
        pairs.add(Arrays.asList(1, 2));
        assertEquals("abc", testObject.smallestStringWithSwaps(s, pairs));
    }
}