package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {

    private final RemoveElement testObject = new RemoveElement();

    @Test
    public void testRemoveElement() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        assertEquals(2, testObject.removeElement(nums, val));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        assertEquals(5, testObject.removeElement(nums, val));
    }
}