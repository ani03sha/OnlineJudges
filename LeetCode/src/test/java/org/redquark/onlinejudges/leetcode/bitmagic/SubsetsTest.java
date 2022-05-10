package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsetsTest {

    private final Subsets testObject = new Subsets();

    @Test
    public void testSubsetsWithBitManipulation() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.singletonList(1));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(1, 2));
        expected.add(Collections.singletonList(3));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2, 3));
        assertEquals(expected, testObject.subsetsWithBitManipulation(nums));

        nums = new int[]{0};
        expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.singletonList(0));
        assertEquals(expected, testObject.subsetsWithBitManipulation(nums));
    }

    @Test
    public void testSubsetsWithBacktracking() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.singletonList(1));

        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Collections.singletonList(3));
        assertEquals(expected, testObject.subsetsWithBacktracking(nums));

        nums = new int[]{0};
        expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.singletonList(0));
        assertEquals(expected, testObject.subsetsWithBacktracking(nums));
    }
}