package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumIITest {

    private final CombinationSumII testObject = new CombinationSumII();

    @Test
    public void testCombinationSum2() {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1, 6));
        expected.add(Arrays.asList(1, 2, 5));
        expected.add(Arrays.asList(1, 7));
        expected.add(Arrays.asList(2, 6));
        assertEquals(expected, testObject.combinationSum2(candidates, target));

        candidates = new int[]{2, 5, 2, 1, 2};
        target = 5;
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 2));
        expected.add(Collections.singletonList(5));
        assertEquals(expected, testObject.combinationSum2(candidates, target));
    }
}