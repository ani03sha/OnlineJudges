package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreaterElementIITest {

    private final NextGreaterElementII testObject = new NextGreaterElementII();

    @Test
    public void testNextGreaterElements() {
        int[] nums = new int[]{1, 2, 1};
        int[] expected = new int[]{2, -1, 2};
        assertArrayEquals(expected, testObject.nextGreaterElements(nums));

        nums = new int[]{1, 2, 3, 4, 3};
        expected = new int[]{2, 3, 4, -1, 4};
        assertArrayEquals(expected, testObject.nextGreaterElements(nums));
    }
}