package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationsIITest {

    private final PermutationsII testObject = new PermutationsII();

    @Test
    public void testPermuteUnique() {
        int[] nums = new int[]{1, 1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(2, 1, 1));
        assertEquals(expected, testObject.permuteUnique(nums));

        nums = new int[]{1, 2, 3};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));
        assertEquals(expected, testObject.permuteUnique(nums));
    }
}