package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BuildArrayFromPermutationTest {

    private final BuildArrayFromPermutation testObject = new BuildArrayFromPermutation();

    @Test
    public void testBuildArray() {
        int[] nums = new int[]{5, 0, 1, 2, 3, 4};
        int[] expected = new int[]{4, 5, 0, 1, 2, 3};
        assertArrayEquals(expected, testObject.buildArray(nums));

        nums = new int[]{0, 2, 1, 5, 3, 4};
        expected = new int[]{0, 1, 2, 4, 5, 3};
        assertArrayEquals(expected, testObject.buildArray(nums));
    }
}