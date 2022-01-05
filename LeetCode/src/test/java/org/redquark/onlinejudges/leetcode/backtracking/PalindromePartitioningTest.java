package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromePartitioningTest {

    private final PalindromePartitioning testObject = new PalindromePartitioning();

    @Test
    public void testPartition() {
        String s = "aab";
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("a", "a", "b"));
        expected.add(Arrays.asList("aa", "b"));
        assertEquals(expected, testObject.partition(s));

        s = "a";
        expected = new ArrayList<>();
        expected.add(Collections.singletonList("a"));
        assertEquals(expected, testObject.partition(s));

        s = "badab";
        expected = new ArrayList<>();
        expected.add(Arrays.asList("b", "a", "d", "a", "b"));
        expected.add(Arrays.asList("b", "ada", "b"));
        expected.add(Collections.singletonList("badab"));
        assertEquals(expected, testObject.partition(s));
    }
}