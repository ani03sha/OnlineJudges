package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumIIITest {

    private final CombinationSumIII testObject = new CombinationSumIII();

    @Test
    public void testCombinationSum3() {
        int k = 3;
        int n = 7;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 4));
        assertEquals(expected, testObject.combinationSum3(k, n));

        k = 3;
        n = 9;
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 6));
        expected.add(Arrays.asList(1, 3, 5));
        expected.add(Arrays.asList(2, 3, 4));
        assertEquals(expected, testObject.combinationSum3(k, n));

        k = 4;
        n = 1;
        expected = Collections.emptyList();
        assertEquals(expected, testObject.combinationSum3(k, n));
    }
}