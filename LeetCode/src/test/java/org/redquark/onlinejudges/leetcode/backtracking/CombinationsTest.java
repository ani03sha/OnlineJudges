package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationsTest {

    private final Combinations testObject = new Combinations();

    @Test
    public void testCombine() {
        int n = 4;
        int k = 2;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(2, 4));
        expected.add(Arrays.asList(3, 4));
        assertEquals(expected, testObject.combine(n, k));

        n = 1;
        k = 1;
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        assertEquals(expected, testObject.combine(n, k));
    }
}