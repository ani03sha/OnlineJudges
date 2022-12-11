package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindKClosestElementsTest {

    private final FindKClosestElements testObject = new FindKClosestElements();

    @Test
    public void testFindClosestElements() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, testObject.findClosestElements(nums, k, x));

        nums = new int[]{1, 2, 3, 4, 5};
        k = 3;
        x = -1;
        expected = List.of(1, 2, 3);
        assertEquals(expected, testObject.findClosestElements(nums, k, x));
    }
}