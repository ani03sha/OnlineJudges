package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsetsIITest {

    private final SubsetsII testObject = new SubsetsII();

    @Test
    public void testSubsetsWithDup() {
        int[] nums = new int[]{1, 2, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.singletonList(1));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 2, 2));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(2, 2));
        assertEquals(expected, testObject.subsetsWithDup(nums));

        nums = new int[]{0};
        expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.singletonList(0));
        assertEquals(expected, testObject.subsetsWithDup(nums));
    }
}