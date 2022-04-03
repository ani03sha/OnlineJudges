package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextPermutationTest {

    private final NextPermutation testObject = new NextPermutation();

    @Test
    public void testNextPermutation() {
        int[] nums = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 3, 2};
        assertArrayEquals(expected, testObject.nextPermutation(nums));

        nums = new int[]{3, 2, 1};
        expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, testObject.nextPermutation(nums));

        nums = new int[]{1, 1, 5};
        expected = new int[]{1, 5, 1};
        assertArrayEquals(expected, testObject.nextPermutation(nums));
    }
}