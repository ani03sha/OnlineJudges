package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumTest {

    private final CombinationSum testObject = new CombinationSum();

    @Test
    public void testCombinationSum() {
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 3));
        expected.add(Collections.singletonList(7));
        assertEquals(expected, testObject.combinationSum(candidates, target));

        candidates = new int[]{2, 3, 5};
        target = 8;
        expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 2, 2));
        expected.add(Arrays.asList(2, 3, 3));
        expected.add(Arrays.asList(3, 5));
        assertEquals(expected, testObject.combinationSum(candidates, target));

        candidates = new int[]{2};
        target = 1;
        expected = new ArrayList<>();
        assertEquals(expected, testObject.combinationSum(candidates, target));
    }
}