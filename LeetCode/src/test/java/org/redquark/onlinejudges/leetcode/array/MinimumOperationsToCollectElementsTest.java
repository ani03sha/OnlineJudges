package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumOperationsToCollectElementsTest {

    private final MinimumOperationsToCollectElements testObject =
            new MinimumOperationsToCollectElements();

    @Test
    public void testMinOperations() {
        List<Integer> nums = List.of(3, 1, 5, 4, 2);
        int k = 2;
        assertEquals(4, testObject.minOperations(nums, k));

        nums = List.of(3, 1, 5, 4, 2);
        k = 5;
        assertEquals(5, testObject.minOperations(nums, k));

        nums = List.of(3, 2, 5, 3, 1);
        k = 3;
        assertEquals(4, testObject.minOperations(nums, k));
    }
}